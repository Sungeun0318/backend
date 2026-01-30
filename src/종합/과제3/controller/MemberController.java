package 종합.과제3.controller;

import 종합.과제3.model.dao.UserDao;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }

    private UserDao UD = UserDao.getInstance();

    private int currentUserNo = 0;

    public int getCurrentUserNo() {
        return currentUserNo;
    }

    public void setCurrentUserNo(int currentUserNo) {
        this.currentUserNo = currentUserNo;
    }


    public boolean login(String id, String pw){
        int result =  UD.login(id,pw);
        if (result >0){
            MemberController.getInstance().setCurrentUserNo(result);
            return true;
        }
        return false;
    }

    public boolean singin(String id, String pw, String nickname, String phone){
        boolean result = UD.singin(id,pw,nickname,phone);
        return result;
    }


}
