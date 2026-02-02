package 종합.과제3.view;

import 종합.과제3.controller.ProductController;
import 종합.과제3.controller.MemberController;
import 종합.과제3.model.dto.BuyDto;
import 종합.과제3.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private ProductView(){}
    private static final ProductView instance = new ProductView();
    public static ProductView getInstance(){
        return instance;
    }


    private ProductController PC = ProductController.getInstance();
    private MemberController MC = MemberController.getInstance();



    private Scanner sc = new Scanner(System.in);

    public void indexView(){
        for (; ; ) {

            System.out.println("========== 로그인 후 메뉴 ==========");
            System.out.println("1. 물품등록");
            System.out.println("2. 전체물품조회");
            System.out.println("3. 구매의사신청");
            System.out.println("4. 내판매물품조회");
            System.out.println("5. 내구매신청목록");
            System.out.println("6. 로그아웃");

            System.out.println("================================");
            System.out.print("선택>");
            int ch = sc.nextInt();
            if (ch == 1) {addProductView();}
            else if (ch ==2) {printProduct();}
            else if (ch ==3) {BuyProductView();}
            else if (ch ==4) {printMySellProductView();}
            else if (ch ==5) {printMyBuyProductView();}
            else if (ch ==6) {
                MC.logout();
                break;
            }


        }
    }

    public void addProductView(){
        sc.nextLine();
        System.out.println("--- 물품 등록 ---");
        System.out.print(" 상품명 : ");
        String productName = sc.nextLine();
        System.out.print(" 가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print(" 설명 : ");
        String txt = sc.nextLine();
        boolean result = PC.addProduct(productName, price, txt);
        if(result){
            System.out.println("[안내] 물품 등록이 완료되었습니다.");
        } else {
            System.out.println("[경고] 물품 등록이 실패했습니다.");
        }
    }
    public void BuyProductView(){
        System.out.println("--- 구매 의사 신청 ---");
        System.out.println(" 구매 의사를 신청할 제품번호 : ");
        int productNo = sc.nextInt();
        boolean result = PC.BuyProduct(productNo);
        if(result){
            System.out.println("[안내] 구매 의사 신청이 완료되었습니다.");
        } else {
            System.out.println("[경고] 구매 의사 신청이 실패했습니다.");
        }
    }
    public void printProduct(){
        ArrayList<ProductDto> productDto = PC.getProduct();
        System.out.println("========== 전체 물품 목록 ===========");
        for (ProductDto product : productDto){
            String seller = MC.returnSeller(product.getUserNo());
            System.out.printf("제품번호 : %d | %s | %d원 | 판매자 : %s\n", product.getProductNo(), product.getProductName(), product.getPrice(), seller);
        }
        System.out.println("================================");
    }
    public void printMySellProductView(){
        System.out.println("\n============= 내 판매 물품 목록 =============");
        int myUserNo = MC.getCurrentUserNo();
        ArrayList<ProductDto> list = PC.getProduct();
        for(ProductDto p : list){
            if(p.getUserNo() == myUserNo && p.isStatus()){
                int buyCount = PC.getBuyCount(p.getProductNo());
                System.out.printf("제품번호: %d | %s | %d원 | 구매의사신청: %d명\n",
                        p.getProductNo(), p.getProductName(), p.getPrice(), buyCount);
            }
        }
        System.out.println("--------------------------------------------");
    }
    public void printMyBuyProductView(){
        System.out.println("\n============= 내 구매 신청 목록 =============");
        int myUserNo = MC.getCurrentUserNo();
        ArrayList<BuyDto> buyList = PC.getBuyList();
        ArrayList<ProductDto> productList = PC.getProduct();

        for(BuyDto b : buyList){
            if(b.getUserNo() == myUserNo){
                for(ProductDto p : productList){
                    if(p.getProductNo() == b.getProductNo()){
                        String sellerName = MC.returnSeller(p.getUserNo());
                        System.out.printf("제품번호: %d | %s | %d원 | 판매자: %s\n",
                                p.getProductNo(), p.getProductName(), p.getPrice(), sellerName);
                    }
                }
            }
        }
        System.out.println("--------------------------------------------");
    }
}