package 종합.과제1;

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {

        WaitingController wc = new WaitingController();

        for(;;){
            System.out.println("============ 맛집 대기 시스템 ============");
            System.out.println("1. 대기등록 | 2. 대기현황");
            System.out.println("======================================");
            System.out.print("선택>");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if(ch==1){
                sc.nextLine();
                System.out.print("전화번호 : ");
                String phone = sc.nextLine();
                System.out.print("인원수 : ");
                int count = sc.nextInt();
                boolean result = wc.doPost(phone, count);
                if(result){
                    System.out.println("[안내]대기 등록 완료되었습니다");
                }else {
                    System.out.println("[경고]대기 등록 실패");
                }
            } else if (ch==2) {
                Waiting[] doGet = wc.doGet();
                for(int i=0;i<doGet.length;i++){
                    if(doGet[i]!=null){
                        System.out.printf("전화번호 : %s, 인원수 : %d\n", doGet[i].phone, doGet[i].count);
                        System.out.println("----------------------------------------");
                    }
                }
            }
        }
    }
}
