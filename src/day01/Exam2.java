package day01; // 패키지(폴더)로써 클래스 위치한 폴더명

public class Exam2 {  // class s
    // pubilc class : 공개용 클래스 선언 뜻 갖는 키워드
    // Exam2 : 임의의 클래스명 정의한다. 첫글자 대문자!

    // [1] m + 엔터 : main함수
    // 자바에서 최초의 실행 흐름(스레드)를 갖는 (미리만들어진) 함수
    public static void main(String[] args) { // main s

        // [2] 리터럴 : 상수 이면서 키보드로 입력가능한 자료들
        // 3, 3.14, 'a', true, false
        System.out.println(3); // js의 console.log() 동일한 기능의 함수
        System.out.println(); // sout + 엔터 : System.out.println(출력하고 싶은 자료);
        System.out.println("유"); // 선언 또는 함수실행 뒤에; 세미콜론 작성한다.
        System.out.println("유재석"); // 문자열 처리할 때는 "큰따옴표 사용


        // [3] 자료형/타입(분류) : 자료들을 효율적으로 사용하기 위한 분류 방법
        // 효율이란? 내가 시계 선물하기 위해서 다이소에서 시계 크기맞는 적당(효율)한 상자를 고른다.
        // 바이트란? bit(0 혹은 1) --> 01010101(8bit/but8개)1바이트 -> 1024 byte
        // 정수 : byte(1, -128 ~ 127), short(2, +-3만정도, int(4, +-21억정도, *정수 기본타입*), long(8, +- 21억정도)
        // 실수 : float(4, 소수점8자리) , double(8, 소수점 17자리 표현, *실수 기본타입*)
        // 문자 : char(2, '' 작은따옴표 감싼), 문자열 : String( 문자열 클래스, "" 큰따옴표 감싼)
        // 논리 : boolean(1, true/false)
        // ==============================> 8가지 + String

        // 1. boolean : true 또는 false 저장하는 타입
        boolean bool1 = true; // [JAVA] 자료형 변수명 = 값; [JS] let bool1 = true;
        boolean bool2 = false; // 변수명은 카멜표기법 권장, 숫자/특수/띄어쓰기 x
        // boolean bool3 = 3; //[3] boolean은 3을 저장할 수 없다.
        System.out.println(bool1);
        System.out.println(bool2);

        // 2. char : ''작은 따옴표로 감싼 문자1개 저장하는 타입
        char ch1 = 'a';
//      char ch2 = 'abc'; // [오류] 문자 여러 개 저장 불가능
//      char ch3 = "abc"; // [오류] " " 저장 불가능.
        System.out.println(ch1);

        // 3. String : " " 큰 따옴표로 감싼 문자 여러개 저장하는 (클래스)타입
        String str1 = "abc";
        System.out.println(str1);

        // 4. byte : -128 : +127
        byte b1 = 100;
//        byte b2 = 300; // [오류]
        System.out.println(b1);

        // 5. short : +-3만 정도
        short s1 = 32000;
//        short s2 = 40000; // [오류]
        System.out.println(s1);

        // 6. int : +-21억정도, 정수의 리터럴 기본타입, 즉] 키보드로부터 입력받은 int 타입이다.
        int i1 = 2100000000;
//        int i2 = 3000000000; // [오류]
        System.out.println(i1);

        // 7. long : +-21억이상, 리터럴 뒤에 L/l 붙인다.
        long l1 = 3000000000L; // 3000000000(int) 리터럴값은 int 타입이라서 뒤에 L명시한다.
        System.out.println(l1);

        // 8. double : 소수점 17자리 표현, 실수의 리터럴 기본타입
        double d1 = 0.123456789123456789;
        System.out.println(d1);

        // 9. float : 소수점 포함한 8자리까지 표현, 리터럴 뒤에 F/f 붙인다.
        float f1 = 123.1234567891123456789F;
        System.out.println(f1);

    } // main e
} // class e


/*
    ----- 코드 작성 -----                   ----- 코드 실행 -----
    JS : console.log("java");             브라우저
    JAVA : print("java");                 main

*/