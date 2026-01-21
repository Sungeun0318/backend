package day03;

public class Exam2 {
    public static void main(String[] args) {
        int 온도 = 5;
        if (온도 <= 10) System.out.println("외투 입는다.");

        // (2) if(조건문){ 실행문; 실행문;}

        int 나이 = 10;
        if (나이 >= 19) {
            System.out.println("성인 입니다.");
            System.out.println("19세 입니다.");
        }

        // (3) if(조건문){실행문;}else{실행문}
        boolean 회원검사 = false;
        if (회원검사 == true) {
            System.out.println("안녕하세요 .회원님");
        } else {
            System.out.println("비회원입니다.");
        }

        // (4) if(조건문){실행문} else if(조건문){실행문} else if(조건문){실행문}
        int 지갑돈 = 1750;
        if (지갑돈 >= 3000) {
            System.out.println("택시를 탄다.");
        } else if (지갑돈 >= 1700) {
            System.out.println("버스를 탄다.");
        } else if (지갑돈 >= 1200) {
            System.out.println("자전거를 탄다.");
        } else {
            System.out.println("자전거를 탄다.");
        }

        // (5) if 중첩
        int age = 25;
        char gender = 'w';
        if (age >= 19) {
            System.out.println("성인");
            if (gender == 'w') {
                System.out.println("여자");
            } else {
                System.out.println("남자");
            }
        } else {
            System.out.println("미성년자");
        }

        // (6) switch : 논리 검사 보다는 값에 따른 흐름 제어 사용
        char grade = 'b';
        switch (grade) { // switch에 '등급'을 대입하고
            case 'A':
            case 'a': // a 등급이면
                System.out.println("A등급 우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("B등급 우수회원");
                break; // switch{} 탈출, 해당 case 실행후 멈춤
            default:
                System.out.println("회원");
        }

        // (7) switch 중첩
        int adult = 1;
        char gender1 = 'w';
        switch (adult) {
            case 1:
                System.out.println("성인");
                switch (gender1) {
                    case 'w':
                        System.out.println("여자");
                        break;
                    case 'm':
                        System.out.println("남자");
                }
                break;
            default:
                System.out.println("미성년자");
                break;
        }

    }
}
