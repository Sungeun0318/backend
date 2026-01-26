package 종합.예제1;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자바는 무조건 main함수부터 코드 실행흐름 시작된다.
        // [1] 메모리 설계 : 데이터 6개 저장 -> 변수 6개 사용, [배열/객체 학습전]

        String content1 = null;
        String content2 = null;
        String content3 = null;
        String writer1 = null;
        String writer2 = null;
        String writer3 = null;

        // [2] 반복문, 무한루프
        for (; ; ) {
            System.out.println("========== My Community =========="); // [3] 출력문
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("==================================");
            System.out.print("선택> ");

            // [4] 입력객체 Scanner 변수명 = new Scanner(system.in);
            int ch = sc.nextInt();

            // [5] 제어문, 코드 흐름 제어(논리적인 사고, 경우의 수 등)
            if (ch == 1) {
                sc.nextLine();
                System.out.print("내용 : ");
                String 내용 = sc.nextLine(); // 입력 받기
                System.out.print("작성자 : ");
                String 작성자 = sc.nextLine();
                if (content1 == null && writer1 == null) { // 첫번쨰 게시물이 비어있으면
                    content1 = 내용; // 변수의 수정
                    writer1 = 작성자;
                } else if (content2 == null && writer2 == null) {
                    content2 = 내용;
                    writer2 = 작성자;
                } else if (content3 == null && writer3 == null) {
                    content3 = 내용;
                    writer3 = 작성자;
                } else {
                    System.out.println("[경고]게시물을 등록할 공간이 부족합니다.");
                }
                System.out.println("[안내]글쓰기 성공");
                content1 += sc.nextInt();

            } else if (ch == 2) {
                if (content1 != null && writer1 != null) { // 만약에 첫번째 게시물이 비어있지 않으면 출력
                    System.out.printf("작성자 : %s, 내용 : %s\n", content1, writer1);
                }
                if (content2 != null && writer2 != null) {
                    System.out.printf("작성자 : %s, 내용 : %s\n", content2, writer2);
                }
                if (content3 != null && writer3 != null) {
                    System.out.printf("작성자 : %s, 내용 : %s\n", content3, writer3);
                }

            }
        }


    }
}
