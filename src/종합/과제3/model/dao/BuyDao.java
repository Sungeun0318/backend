package 종합.과제3.model.dao;

import 종합.과제3.controller.MemberController;
import 종합.과제3.model.dto.BuyDto;

import java.util.ArrayList;

public class BuyDao {
    private BuyDao(){}
    private static final BuyDao instance = new BuyDao();
    public static BuyDao getInstance(){
        return instance;
    }
    private final ArrayList<BuyDto> buyList = new ArrayList<BuyDto>();
    private static int currentBuyNo = 1;



    public boolean BuyProduct(int productNo){
        BuyDto buyDto = new BuyDto(currentBuyNo++, productNo, MemberController.getInstance().getCurrentUserNo());
        boolean result = buyList.add(buyDto);
        return result;
    }
    public  ArrayList<BuyDto> getBuyList(){
        return buyList;
    }
    public int getBuyCount(int productNo){
        int count = 0;
        for(BuyDto buy : buyList){
            if(buy.getProductNo() == productNo){
                count++;
            }
        }
        return count;
    }
}