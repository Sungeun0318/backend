
// 한줄 주석
/* 여러줄 주석 */

package day01; // 패키지(폴더) 이면서 클래스의 위치 식별

public class Exam1 {
    // public : 공개용
    // class : 자바는 코드의 최소 실행단위, 즉] 자바는 클래스 필수이다.
    // Exam1 : 클래스명은 무조건 첫글자를 대문자
    // { : 클래스 내부 시작
    // } : 클래스 내부 종료, 즉 ] 클래스 {} 밖에서 작성한 코드 실행안됨.
    // [1] 클래스 내부에서는 선언만 가능
    int a = 10; // 세미콜론 필수.
    // [2] 함수 실행은 main(미리만들어진) 함수 안에서만 가능하다.
    // System.out.print("안녕"); // 출력함수 안됨.
    public static void main(String[] args) {
        System.out.println("자바 안녕"); // sout + 엔터 : 자동완성
    } // main end

}


// int b = 10; // !! 클래스 {} 밖에서 코드 작성 안됨.
