package 종합.test;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {

        BoardController bs =  new BoardController();

        for(;;){
            System.out.println("============ My Community ============");
            System.out.println("1. 게시물쓰기 | 2. 게시물출력");
            System.out.println("======================================");
            System.out.print("선택>");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if(ch==1){
                sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();
                System.out.print("작성자 : ");
                String writer = sc.nextLine();
                boolean result = bs.doPost(content, writer);
                if(result){
                    System.out.println("[안내] 등록성공");
                }else{
                    System.out.println("[경고] 등록실패");
                }

            }else if(ch==2){
                Board[] doGet = bs.doGet();
                for(int i = 0; i < doGet.length; i++){
                    if(doGet[i]!=null){
                        System.out.printf("작성자 : %s, 내용 : %s\n", doGet[i].writer, doGet[i].content);
                        System.out.println("----------------------------------------");
                    }
                }
            }
        }
    }
}
