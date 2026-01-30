package 종합.과제3.view;

import 종합.과제3.controller.ProductController;
import 종합.과제3.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }

    private MemberController MC = MemberController.getInstance();
    private ProductController PC = ProductController.getInstance();

    private Scanner sc = new Scanner(System.in);

    public void singinView(){
        sc.nextLine();
        System.out.print("아이디: "); String id = sc.nextLine();
        System.out.print("비밀번호: "); String pw = sc.nextLine();
        System.out.print("닉네임: "); String nickname = sc.nextLine();
        System.out.print("연락처: "); String phone = sc.nextLine();
        boolean result = MC.singin(id,pw,nickname,phone);
        if (result){
            System.out.println("[안내] 회원가입이 완료되었습니다.");
        }else {
            System.out.println("[안내] 회원가입에 실패하였습니다.");
        }
    }


}
