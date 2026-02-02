package 종합.과제3.model.dao;

import 종합.과제3.controller.MemberController;
import 종합.과제3.model.dto.BuyDto;
import 종합.과제3.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao(){}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){
        return instance;
    }
    private final ArrayList<ProductDto> productList = new ArrayList<>();
    private final ArrayList<BuyDto> buyList = new ArrayList<>();

    private static int currentNo = 1;
    private static int currentProductNo = 1;
    public  boolean addProduct(String productName, int price, String txt){
        ProductDto productDto = new ProductDto(currentNo, productName, price, txt, MemberController.getInstance().getCurrentUserNo());
        boolean result = productList.add(productDto);
        currentNo++;
        return result;
    }
    public  ArrayList<BuyDto> getBuyList(){
        return buyList;
    }
    public ArrayList<ProductDto> getProductList(){
        return productList;
    }
    public boolean registerProduct(ProductDto productDto){
        productDto.setProductNo(currentProductNo++);
        return productList.add(productDto);
    }
}