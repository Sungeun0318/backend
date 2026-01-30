package 종합.과제3.model.dto;

public class ProductDto {
    private int productNo;
    private String productName;
    private int price;
    private String txt;
    private boolean status;
    private int userNo;

    public ProductDto() {}

    public ProductDto(int productNo, String productName, int price, String txt, boolean status, int userNo) {
        this.productNo = productNo;
        this.productName = productName;
        this.price = price;
        this.txt = txt;
        this.status = status;
        this.userNo = userNo;
    }
    public ProductDto(int productNo, String productName, int price, String txt, int userNo) {
        this.productNo = productNo;
        this.productName = productName;
        this.price = price;
        this.txt = txt;
        this.status = true;
        this.userNo = userNo;
    }

    public int getProductNo() {return productNo;}
    public void setProductNo(int productNo) {this.productNo = productNo;}
    public String getProductName() {return productName;}
    public void setProductName(String productName) {this.productName = productName;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public String getTxt() {return txt;}
    public void setTxt(String txt) {this.txt = txt;}
    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}
    public int getUserNo() {return userNo;}
    public void setUserNo(int userNo) {this.userNo = userNo;}
}

