package 종합.과제3.model.dto;

public class BuyDto {
    private int BuyNumNo;
    private int productNo;
    private int userNo;

    public BuyDto(){}
    public BuyDto(int BuyNumNo, int productNo, int userNo) {
        this.BuyNumNo = BuyNumNo;
        this.productNo = productNo;
        this.userNo = userNo;
    }
    public BuyDto(int BuyNumNo, int productNo) {
        this.BuyNumNo = BuyNumNo;
        this.productNo = productNo;
    }

    public int getBuyNumNo() {
        return BuyNumNo;
    }

    public int getProductNo() {
        return productNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setBuyNumNo(int buyNumNo) {
        BuyNumNo = buyNumNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "BuyDto{" +
                "BuyNumNo=" + BuyNumNo +
                ", productNo=" + productNo +
                ", userNo=" + userNo +
                '}';
    }
}