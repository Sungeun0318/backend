package 종합.과제2.view;

import 종합.과제2.controller.WaitingController;
import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance() {
        return instance;
    }
    private WaitingController wc = WaitingController.getInstance();

    private Scanner sc = new Scanner(System.in);

    public void countView(){
        sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("인원 수 : ");
        int count = sc.nextInt();
        boolean result = wc.add(phone, count);
        if(result){
            System.out.println("[안내] 성공");
        }else {
            System.out.println("[안내] 실패");
        }
    }

    public void printView(){
        ArrayList<WaitingDto> waitingDtos = wc.getWaitingList();
        for(WaitingDto waitingDto : waitingDtos){
            System.out.printf("번호 : %d, 연락처 : %s, 인원 : %d\n", waitingDto.getNo(), waitingDto.getPhone(), waitingDto.getCount());
            System.out.println("---------------------------------------");
        }
    }

    public void indexView(){
        for(;;){
            System.out.println("================ 맛집 대기 시스템 ===============");
            System.out.println("1. 대기등록 | 2. 대기현황");
            System.out.println("=============================================");
            System.out.print("선택> ");
            int ch = sc.nextInt();
            if(ch == 1){
                countView();
            }else if(ch == 2){
                printView();
            }

        }
    }

}
