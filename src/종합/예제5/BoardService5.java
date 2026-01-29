package 종합.예제5;

import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("========== My Community =========="); // [3] 출력문
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("==================================");
            System.out.print("선택> ");
            int ch = sc.nextInt();
            if (ch == 1) {
                sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();
                System.out.print("작성자 : ");
                String writer = sc.nextLine();
//                BoardController.doPost() : static메소드 (클래스명.메소드명()) vs bc.doPost() : 일반메소드(객체명, 메소드명())
                // 함수 호출 후 반환(결과)에 따른 흐름제어 하기위해 boolean result 변수에 결과값 저장
                boolean result = BoardController.doPost(content, writer);
                if (result) {
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[안내] 글쓰기 실패");
                }
            } else if (ch == 2) {
                Board[] boards = BoardController.doGet();

                for (Board board : boards) {
                    if (board != null) {
                        System.out.printf("작성자 : %s, 내용 : %s\n", board.getWriter(), board.getContent());
                    }
                }
            }
        }

    }
}
