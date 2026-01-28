package day07;

import day07.package1.A;

public class Exam2 {
    public static void main(String[] args) {
        // [1] 접근제한자 : 클래스, 멤버변수, 메소드 등등 호출
        // [2] 종류
            // public : 공개, 프로젝트내 어디서든 호출 가능
            // private : 비공개, 현재 클래스에서만 호출가능
            // (default) : 같은/하위 패키지에서만 호출 가능, 접근제한자 없을 경우 자동
            // protected : 같은/하위 패키지에서만 호출 가능, +상속관계 예외
        // [3] 사용법
            // 1) 접근제한자 class 클래스명{ }     : 클래스 키워드 앞에서 작성
            // 2) 접근제한자 타입 멤버변수;         : 멤버변수 타입 앞에서 작성
            // 3) 접근제한자 반환타입 메소드명() {}  : 반환 타입 앞에서 작성
            // 4) 접근제한자 생성자명() {}         : 생성자명 앞에서 작성

        // [4] day07 폴더내 package1 풀더 생성 -> A
        // ==== 다른 클래스 : 접근제한자 의미 유 ====
        A a = new A();
        System.out.println("a.공개변수 = " + a.공개변수); //ok
//        System.out.println("a.비공개변수 = " + a.비공개변수); // error
//        System.out.println("a.일반변수 = " + a.일반변수);// error

        a.메소드(); // ok
        // a.비공개메소드(); // error
    } // m end
} // c end
