package 종합.예제2;

import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] contents = new String[100];
        String[] writers = new String[100];
        
        for (;;) {
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
                
                boolean save = false;
                for (int i = 0; i < contents.length; i++) {
                    if (contents[i] == null && writers[i] == null) {
                        contents[i] = content;
                        writers[i] = writer;
                        System.out.println("[안내]글쓰기 성공");
                        save = true;
                        break;
                    }
                }
                
                if (!save) {
                    System.out.println("[경고]게시물을 등록할 공간이 부족합니다.");
                }

            } else if (ch == 2) {
                for (int i = 0; i < contents.length; i++) {
                    if (contents[i] != null) {
                        System.out.printf("작성자 : %s, 내용 : %s\n", writers[i], contents[i]);
                    }
                }
            }
        }
    }
}
