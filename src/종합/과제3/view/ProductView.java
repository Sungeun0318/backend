package 종합.과제3.view;

import 종합.과제3.controller.ProductController;
import 종합.과제3.controller.MemberController;
import 종합.과제3.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {

    private ProductView(){}
    private static final ProductView instance = new ProductView();
    public static ProductView getInstance(){
        return instance;
    }

    private MemberController MC = MemberController.getInstance();
    private ProductController PC = ProductController.getInstance();

    private Scanner sc = new Scanner(System.in);
    public void BuyProductView(){
        sc.nextLine();
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

    public void PrintBuyProductView(){
        ArrayList<ProductDto> productList = PC.getProductList();
        for(ProductDto product : productList){
            System.out.println("제품번호 : %d |, %s | , %d원 | , 판매자 : %s", product.getProductNo(), product.getProductName(), product.getPrice(), product.);
        }
    }

    p




}
