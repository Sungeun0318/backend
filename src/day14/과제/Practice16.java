package day14.과제;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice16 {
    public static void main(String[] args) {

        // [문제 1] 배달 진행 + 화면 갱신 “동시 실행” 구현
        DeliveryTask deliveryTask = new DeliveryTask();
        Thread thread = new Thread(deliveryTask);
        thread.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("[메인] 주문 화면 갱신 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        try {
            thread.join();
        } catch (Exception e) {
        }
        System.out.println("[안내] 배달 처리 종료");


        // [문제 2] 공유 장바구니 “안전한 총액 계산” 구현 (synchronized 적용 버전)
        Cart cart = new Cart();

        Thread userA = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                cart.addPrice(100);
            }
        });

        Thread userB = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                cart.addPrice(200);
            }
        });

        userA.start();
        userB.start();
        
        try {
            userA.join();
            userB.join();
        } catch (Exception e) {
        }
        System.out.println("total=" + cart.total);


        // [문제 3] 고객 문의 처리 시스템 구현 (스레드풀)
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            pool.submit(new InquiryTask(i));
        }
        pool.shutdown();
        try {
            Thread.sleep(30000);
        } catch (Exception e) {
        }
        System.out.println("[안내] 모든 문의 처리 종료");
    }
}

// [문제 1] 배달 작업 클래스
class DeliveryTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("[배달기사] 이동중 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

// [문제 2] 장바구니 클래스 (synchronized 동기화 적용)
class Cart {
    int total;
    public synchronized void addPrice(int price) {
        try {
            this.total = this.total + price;
            Thread.sleep(500);
            System.out.println("[장바구니] 추가금액 = " + price + ", 현재총액 = " + total);
        } catch (Exception e) {
        }
    }
}

// [문제 3] 문의 처리 작업 클래스
class InquiryTask implements Runnable {
    private int n;

    public InquiryTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("[처리시작] 문의 " + n);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("[처리완료] 문의 " + n);
    }
}
