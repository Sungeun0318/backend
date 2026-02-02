package 종합.과제4.controller;

import 종합.과제4.model.dao.MemberDao;
import 종합.과제4.model.dto.MemberDto;

public class MemberController {
    private MemberController() {
    }

    private static final MemberController memberController = new MemberController();

    public static MemberController getInstance() {
        return memberController;
    }

    private MemberDao MD = MemberDao.getInstance();

    private int loginSession = 0;

    public boolean signup(String id, String pw, String nickname) {
        MemberDto memberDto = new MemberDto(0, id, pw, nickname);
        boolean result = MD.signup(memberDto);
        return result;
    }

    public boolean login(String id, String pw) {
        int result = MD.login(id, pw).getMno();
        if (result > 0) {
            loginSession = result;
            return true;
        }
        return false;
    }

    public boolean logout() {
        loginSession = 0;
        return true;
    }

    public int getLoginSession() {
        return loginSession;
    }
}