package day14;

import java.awt.*;

public class Exam1 {
    public static void main(String[] args) {

        // [Thread 스레드]
        /*
            프로세스 : 프로그램(명령어집합)이 실행중인 흐름 [ctrl + alt + delete] 작업관리자 : 현재 프로세스 확인
            멀티 태스킹 : 2가지 이상의 작업을 동시 처리

            멀티 프로세스 : 운영체제가 2가지 이상의 프로세스(프로그램) 동시 처리, *멀티 태스킹*
            멀티 스레드 : 2가지 이상의 명령어 동시 처리, *멀티 태스킹*

            스레드 : 하나의 프로세스(프로그램) 내에서 실행되는 작업 단위, 실행 흐름 단위
                * JS는 자체적인 스레드가 없다(브라우저/크롬 : 스레드)
                * JAVA/PYTHON/C는 자체적인 스레드가 있다 (main 함수)
                1. 목적 : 코드(명령어)들을 읽어드리고 CPU(컴퓨터 내 연산장치)에게 전달한다.
                2. 자바의 (기본) 스레드
                    public static void main(String[] args) {} 함수가 내장됨.
            멀티 스레드 : main스레드 외 새로운 *작업 스레드* 생성하여 동시작업
                1. 목적 : *병렬처리*, 동시에 여러 작업 처리한다.
                2. 사용처 : 웹/앱, 채팅, 첨부파일, 첨부파일 등등
                3. 구현방법
                    방법 1) 익명구현체
                    Runnable runnable = new Runnable() {@Override public void run(){작업스레드코드}}
                    Thread thread = new Thread(runnable);
                    thread.start()
                    방법 2) 구현체
                    class 작업스레드 implements Runnable{@Override public void run(){작업스레드코드}}
                    작업스레드 변수 = new 작업스레드();
                    Thread thread = new Thread(변수);
                    thread.start()
                    방법 3) 상속
                    class 작업스레드 extend Thread{@Override public void run(){작업스레드코드}}
                    작업스레드 변수 = new 작업스레드();
                    변수.start();
                4. 주요 메소드
                Runnable 인터페이스 : run추상메소드, 생성한 작업스레드가 처리할 코드집합
                Thread 클래스  : start메소드, 구현된 run 메소드 실행 메소드


        */

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 자바의 UI제공하는 클래스

        // [1] 단일 스레드에서는 '띵' 소리 기능과  '띵' 출력 기능을 동시에 할 수 없다.
        for(int i = 1; i <= 5; i ++){
            toolkit.beep(); // '띵'소리 제공하는 메소드
            try{
                Thread.sleep(1000);
            }catch(Exception e){} // Thread.sleep (밀리초), 밀리초 만큼 현재 스레드 일시정지
        }
        for(int i = 1; i <= 5; i ++){
            System.out.println("띵");
        }

        // [2] 멀티 스레드에서는 '띵' 소리 기능과  '띵' 출력 기능을 동시에 할 수 있다.
        Runnable runnable = new Runnable() { // 1) Runnable 인터페이스 익명구현체(클래스가 추상메소드(run) 구현)
            @Override
            public void run() { // 추가된 작업스레드가 처리할 코드,
                for(int i = 1; i <= 5; i ++){
                    toolkit.beep(); // '띵'소리 제공하는 메소드
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){} // Thread.sleep (밀리초), 밀리초 만큼 현재 스레드 일시정지
                }

            }
        };  // 익명구현제 } 닫기 뒤에 꼭 ;세미콜론 넣기
        Thread thread1 = new Thread(runnable); // 3) 익명구현체 인터페이스를 Thread 객체 대입
        // [[MAIN Thread]]
        thread1.start(); // 4) 스레드 객체가 start() 메소드를 호출하면 구현한 run메소드가 실행된다.
        // [[MAIN thread -->> Task1 Thread]]
        for(int i = 1; i <= 5; i ++){
            System.out.println("띵");
        }
        try{Thread.sleep(1000);}
        catch(Exception e){}


        // [3] 멀티 스레드2
        // [[MAIN Thread]]
        SoundBeep soundBeep = new SoundBeep();
        Thread thread2 = new Thread(soundBeep);
        thread2.start();  // [[MAIN Thread --> Task Thread]]

        for(int i = 1; i <= 5; i ++){ // [[MAIN Thread]]
            System.out.println("띵");
            try{
                Thread.sleep(1000);}
            catch(Exception e){}
        }

        // [4] 멀티 스레드3
        // [[ MAIN Thread ]]
        SoundBeep2 thread3 = new SoundBeep2();
        thread3.start(); // [[ MAIN Thread --> Task Thread  ]]

        for( int i = 1 ; i <= 5 ; i++ ){ // [[ MAIN Thread ]]
            System.out.println("띵");
            try{ Thread.sleep( 1000 ); }catch ( Exception e ){ }
        }


    }
}

class SoundBeep implements Runnable{
    // * Runnable 인터페이스 구현
    // * run 추상메소드 구현 -> 추가 작업스레드가 처리할 코드
    @Override public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for( int i = 1 ; i <= 5 ; i++ ){
            toolkit.beep();
            try{ Thread.sleep( 1000 ); }catch ( Exception e ){ }
        }
    }
}
class SoundBeep2 extends Thread{
    // * Thread 클래스 상속
    // * run 메소드 재정의 -> 추가 작업스레드가 처리할 코드
    @Override public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for( int i = 1 ; i <= 5 ; i++ ){
            toolkit.beep();
            try{ Thread.sleep( 1000 ); }catch ( Exception e ){ }
        }
    }
}