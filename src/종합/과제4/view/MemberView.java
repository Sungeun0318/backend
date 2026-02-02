package 종합.과제4.view;

import 종합.과제4.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    public MemberView() {
    }

    private static final MemberView instance = new MemberView();

    public static MemberView getInstance() {
        return instance;
    }

    private MemberController MC = MemberController.getInstance();
    private Scanner sc = new Scanner(System.in);

    // 메인 페이지
    public void index() {
        for (; ; ) {
            System.out.println("====== 콘솔 기반 도서관리 시스템 ======");
            System.out.println("1.회원가입 | 2. 로그인");
            System.out.print("선택 > ");
            int ch = sc.nextInt();
            if (ch == 1) {
                signup();
            } else if (ch == 2) {
                login();
            }
        }
    }

    public void signup() {
        System.out.println("===== 회원가입 ======");
        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.print("비밀번호 : ");
        String pw = sc.next();
        System.out.print("닉네임 : ");
        String nickname = sc.next();

        boolean result = MC.signup(id, pw, nickname);

        if (result) {
            System.out.println("[안내] 회원가입이 완료되었습니다.");
        } else {
            System.out.println("[안내] 회원가입 실패");
        }
    }

    public void login() {
        System.out.println("===== 로그인 =====");
        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.print("비밀번호 : ");
        String pw = sc.next();

        boolean result = MC.login(id, pw);
        if(result){ 
            System.out.println("[안내] 로그인 성공");
            BookView.getInstance().index(); 
        }
        else{  
            System.out.println("[안내] 로그인 실패");
        }
    }
}
