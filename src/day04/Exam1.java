package day04;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // [1] 1부터 5까지 출력
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//
//        // vs
//
//        for(int a = 1; a <= 5; a++) {
//            System.out.println(a);
//        }
//
//        // [2] 구구단
//        // (1) 2단 ~ 9단 : 초기값 : 1, 조건문 : 9까지, 증감식 : 1씩 증가
//        for(int b = 2; b <= 9; b++) {
//            System.out.println(b);
//        }
//        for(int c = 1; c <= 9; c++) {
//            System.out.println(c);
//        }
//        for(int b = 2; b <= 9; b++) {
//            for(int c = 1; c <= 9; c++) {
//                System.out.printf("%d x %d = %d \n", b, c, b*c);
//            }
//        }

        // [3] break : 가장 가까운 반복문{} 탈출 / continue : 가장 가까운 반복문(증강식) 이동;
//        for (int a = 1; a <= 5; a++) {
//            if(a == 3){break;}
//            System.out.println(a);
//        }
//
//        for(int b = 1;b <= 5;b++){
//            if(b == 3){continue;}
//            System.out.println(b);
//        }
//
//        // [4] 무한루프 : 조건문이 true 상수로 계속 되는 반복문
////        for( ; ;){
////            System.out.println("무한 루프");
////        }
//        while(true){
//            System.out.println("무한 루프");
//            Scanner sc1 = new Scanner(System.in);
//            String str = sc1.nextLine();
//            if(str.equals("q")){break;};
//        }


    }
}
