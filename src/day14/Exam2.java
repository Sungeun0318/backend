package day14;

import java.time.LocalTime;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        // [시계 Thread 만들기]
        시계스레드 시계스레드 = new 시계스레드();
        Thread thread1 = new Thread(시계스레드);
        thread1.start();
        // [타이머 Thread 만들기]
        타이머스레드 타이머스레드 = new 타이머스레드();
        타이머스레드.start(); // 타이머스레드 시작
        //

        // [main Thread 입력]
        for(;;){
            System.out.println(" 타이머 : 1) on 2) off : ");
            Scanner scanner = new Scanner(System.in);
            int ch =  scanner.nextInt();
            if(ch == 1){
                타이머스레드 = new 타이머스레드();
                타이머스레드.state = true;
                타이머스레드.start();

            }else if(ch == 2){
                if(타이머스레드 != null) // 타이머스레드.stop(); 가능 하지만 비권장
                    타이머스레드.state = false; // 멤버변수로 상태 관리
            }
        }

    }
}

class 시계스레드 implements Runnable {
    @Override public void run() {
        for(;;){
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(955); // main스레드가 아닌 현재 작업스레드 1초
            }catch (Exception e){}
        }
    }
}

class 타이머스레드 extends Thread{
    boolean state = false;
    @Override public void run() {
        int second = 0; // 타이머가 계산하는 초
        for(;;){
            if(state == false){
                break;
            }
            second++;
            System.out.printf("[타이머] : %d 초\n", second);
            try {Thread.sleep(995);} catch (Exception e){}
        }
    }
}
