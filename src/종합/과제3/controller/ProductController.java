package 종합.과제3.controller;

import 종합.과제3.model.dao.BuyDao;
import 종합.과제3.model.dao.ProductDao;
import 종합.과제3.model.dao.UserDao;
import 종합.과제3.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){
        return instance;
    }

    private BuyDao BD = BuyDao.getInstance();
    private ProductDao PD = ProductDao.getInstance();
    private UserDao UD = UserDao.getInstance();

    public boolean BuyProduct(int productNo){
        boolean result = BD.BuyProduct(productNo);
        return result;
    }

    public ArrayList<ProductDto> getProductList(){
        ArrayList<ProductDto> result = PD.getProductList();
        return result;
    }


}
