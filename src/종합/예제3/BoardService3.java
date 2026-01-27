package 종합.예제3;

import java.util.Scanner;

public class BoardService3 {
    public  static void main(String[] args) {

        // [1] Board 클래스 선언
        // [2] Board 객체 여러개 저장 = 배열
        Board[] boards = new Board[100];

        for(;;){
            System.out.println("========== My Community =========="); // [3] 출력문
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("==================================");
            System.out.print("선택> ");
            Scanner sc = new Scanner(System.in);
            int ch =  sc.nextInt();
            if(ch==1){
                sc.nextLine();
                System.out.println(" 내용 : ");
                String content = sc.nextLine();
                System.out.println("작성자 : ");
                String name = sc.nextLine();
                Board board = new Board();
                board.내용 = content;
                board.작성자 = name;
                boolean check = true;
                for(int i = 0; i<boards.length-1 ;i++){
                    if(boards[i]==null){
                        boards[i] = board;
                        check = true;
                        break;
                    }
                }
                if(check){
                    System.out.println("[안내] 저장 성공");

                }else {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            }else if(ch==2){
                for (int i = 0; i < boards.length-1 ; i++) {
                    Board 게시물 = boards[i];
                    if (게시물 != null) {
                        System.out.printf("작성자 : %s, 내용 : %s\n", 게시물.작성자, 게시물.내용);
                    }
                }
            }
        }
    } // main end
}
