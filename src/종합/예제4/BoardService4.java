package 종합.예제4;

import java.util.Scanner;

// -실행클래스 : 입출력 담당
public class BoardService4 {
    public static void main(String[] args) {

        BoardController bc = new BoardController();

        for(;;){
            System.out.println("========== My Community =========="); // [3] 출력문
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("==================================");
            System.out.print("선택> ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if(ch == 1){
                sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();
                System.out.print("작성자 : ");
                String writer = sc.nextLine();
                    // BoardController의 저장 기능 호출 하여 저장 결과 받기
                boolean result = bc.doPost(content, writer);
                if(result){
                    System.out.println("[안내] 저장 성공");
                } else {
                    System.out.println("[경고] 게시물을 등록할 공간이 없습니다.");
                }
            }else if(ch == 2){
                    // BoardController의 조회 기능 호출 하여 조회 결과 받기
                Board[] boards = bc.doGet();
                for (int i = 0; i < boards.length-1 ; i++) {
                    if(boards[i] != null){
                        System.out.printf("작성자 : %s, 내용 : %s\n", boards[i].writer, boards[i].content);
                        System.out.println("----------------------------------");
                    }
                }
            }
        }

    }
}
