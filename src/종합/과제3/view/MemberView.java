package 종합.과제3.view;

import 종합.과제3.controller.ProductController;
import 종합.과제3.controller.MemberController;
import 종합.과제3.model.dto.UserDto;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }
    private UserDto UD = new UserDto();
    private ProductController PC = ProductController.getInstance();
    private MemberController MC = MemberController.getInstance();
    private ProductView PV = ProductView.getInstance();
    private Scanner scan = new Scanner(System.in);


    public void singinView(){
        scan.nextLine();
        System.out.println("---회원 가입---");
        System.out.print("아이디: "); String id = scan.nextLine();
        System.out.print("비밀번호: "); String pw = scan.nextLine();
        System.out.print("닉네임: "); String nickname = scan.nextLine();
        System.out.print("연락처: "); String phone = scan.nextLine();
        boolean result = MC.singin(id,pw,nickname,phone);
        if (result){
            System.out.println("[안내] 회원가입이 완료되었습니다.");
        }else {
            System.out.println("[안내] 회원가입에 실패하였습니다.");
        }
    }

    public void loginView(){
        scan.nextLine();
        System.out.println("---로그인---");
        System.out.print("아이디: "); String id = scan.nextLine();
        System.out.print("비밀번호: "); String pw = scan.nextLine();
        boolean result = MC.login(id,pw);
        if (result){
            System.out.printf("[안내] %s님 환영합니다\n", MC.returnNickname());
            PV.indexView();
        }else {System.out.println("로그인 실패");}

    }

    public void indexView(){
        for (; ; ) {

            System.out.println("==========회원제 중고거래 시스템==========");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.println("================================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {singinView();}
            else if (ch ==2) {loginView();}

        }
    }

}