package 종합.과제3.controller;

import 종합.과제3.model.dao.BuyDao;
import 종합.과제3.model.dao.ProductDao;
import 종합.과제3.model.dao.UserDao;
import 종합.과제3.model.dto.BuyDto;
import 종합.과제3.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){
        return instance;
    }


    private UserDao UD = UserDao.getInstance();
    private BuyDao BD = BuyDao.getInstance();
    private ProductDao PD = ProductDao.getInstance();

    public boolean BuyProduct(int productNo){
        boolean result = BD.BuyProduct(productNo);
        return result;
    }

    public boolean addProduct(String productName, int price, String txt){
        boolean result = PD.addProduct(productName, price, txt);
        return result;
    }
    public ArrayList<ProductDto> getProduct(){
        ArrayList<ProductDto> result = PD.getProductList();
        return result;
    }

    public ArrayList<BuyDto> getBuyList() {
        ArrayList<BuyDto> result = BD.getBuyList();
        return result;
    }
    public int getBuyCount(int productNo){
        return BD.getBuyCount(productNo);
    }
}