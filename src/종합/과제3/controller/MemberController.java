package 종합.과제3.controller;
import 종합.과제3.model.dao.UserDao;
import 종합.과제3.model.dto.UserDto;

import java.util.ArrayList;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }

    private int currentUserNo = 0;

    public int getCurrentUserNo() {
        return currentUserNo;
    }

    public void setCurrentUserNo(int currentUserNo) {
        this.currentUserNo = currentUserNo;
    }

    private UserDao UD = UserDao.getInstance();

    public boolean singin(String id, String pw, String nickname, String phone){
        return UD.singin(id,pw,nickname,phone);
    }
    public boolean login(String id, String pw){
        int result =  UD.login(id,pw);
        if (result >0){
            MemberController.getInstance().setCurrentUserNo(result);
            return true;
        }
        return false;
    }
    public boolean logout(){
        MemberController.getInstance().setCurrentUserNo(0);
        return true;
    }

    public String returnNickname(){
        String nickname = "";
        ArrayList<UserDto> userList = UD.userListGet();
        for (UserDto user : userList) {
            if (currentUserNo == user.getUserNo()) {
                nickname = user.getNickname();
            }
        }
        return nickname;
    }

    public String returnSeller(int UserNO){
        String seller ="";
        ArrayList<UserDto> userList = UD.userListGet();
        for (UserDto user : userList){
            if (UserNO == user.getUserNo()){
                seller = user.getNickname();
            }
        }
        return seller;
    }
}