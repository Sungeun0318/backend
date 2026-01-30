package 종합.과제3.model.dao;

import 종합.과제3.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao() {}
    private static final   ProductDao instance = new ProductDao();
    public static ProductDao getInstance() {
        return instance;
    }

    private final ArrayList<ProductDto> productList = new ArrayList<ProductDto>();

    public ArrayList<ProductDto> getProductList(){
        return productList;
    }
}
