package day01;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {

        // [1] 입력함수
        // Scanner 클래스 : 입력받은 자료들을 특정한 타입으로 변환
        // new : 새로운 객체 생성할 때 사용되는 키워드
        // new Scanner : Scanner 객체 만들겠다.
        // (System.in) : 시스템 입력 객체를 Scanner 객체에게 전달
        // * 시스템 입력 객체를 Scanner 객체에 대입하여 Scanner 객체 생성
        // Scanner 변수명 = new Scanner(System.in);
        Scanner 입력변수 = new Scanner(System.in);

        // [2] 입력함수
        // 1. .next();   : 입력받은 자료들을 문자열(String)로 반환, 띄어쓰기 불가능
        System.out.print("1. next() : "); // 입력전 가이드
        String str1 = 입력변수.next(); // console에서 키보드로부터 입력받고 enter 입력시 입력 종료
        System.out.println(str1);

        // 2. .nextLine() : 입력받은 자료를 문자열(String)로 반환, 띄어쓰기 포함
        // 주의할 점 : 띄어쓰기를 포함 하다보니 앞전에 next()와 충돌하여 하나의 next인식된다.
        // 해결 방법 : nextLine() 사용할 때 앞전에 next() 존재하면 임의의 nextLine() 하나 더 작성한다.
        입력변수.nextLine();
        System.out.print("2. nextLine() : ");
        String str2 = 입력변수.nextLine();
        System.out.println(str2);

        // 3. .nextByte() : 입력받은 자료를 바이트로 반환, -128 ~127 이외 자료이면 오류발생
        System.out.print("3. nextByte() : ");
        byte b1 = 입력변수.nextByte();
        System.out.println(b1);

        // 4. .nextShort() : 입력받은 자료를 Short로 반환, +-3만정도 이외 자료이면 오류발생
        System.out.print("4. nextShort() : ");
        short s1 = 입력변수.nextShort();
        System.out.println(s1);

        // 5. .nextInt() : 입력받은 자료를 인트로 반환, +-21억정도 이외 자료이면 오류 발생
        System.out.print("5. nextInt() : ");
        int i1 = 입력변수.nextInt();
        System.out.println(i1);

        // 6. .nextLong() : 입력받은 자료를 통으로 반환
        System.out.print("6. nextLong() : ");
        long l1 = 입력변수.nextLong();
        System.out.println(l1);

        // 7. .nextFloat(), .nextDouble()
        System.out.print("7. nextFloat() : ");
        float f1 = 입력변수.nextFloat();
        System.out.println(f1);

        System.out.print("8. nextDouble() : ");
        double d1 = 입력변수.nextDouble();
        System.out.println(d1);

        // 9. .nextBoolean() : 입력받은 자료를 불리언으로 반환
        System.out.print("9. nextBoolean() : ");
        boolean b2 = 입력변수.nextBoolean();
        System.out.println(b2);

        // 10. next().CharAt(0) , 입력받은 자료에서 첫번째 글자반환, char 문자 스캔은 없다.
        System.out.print("10. next().CharAt(0) : ");
        char c1 = 입력변수.next().charAt(0);
        System.out.println(c1);

    }
}
