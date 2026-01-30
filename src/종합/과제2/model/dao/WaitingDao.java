package 종합.과제2.model.dao;

import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao() {}
    private static final   WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance() {
        return instance;
    }
    private final ArrayList<WaitingDto> waitingList = new ArrayList<WaitingDto>();

    private static  int aNo = 1;
    public boolean add(String phone, int count) {
        WaitingDto waitingDto = new WaitingDto(aNo++, phone, count);
        boolean result = waitingList.add(waitingDto);
        return result;
    }

    public  ArrayList<WaitingDto> findAll() {
        return waitingList;
    }

}
