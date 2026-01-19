package day01; //  클래스 파일가 속한 패키지명

public class Exam3 {  // class start
    public static void main(String[] args) { //m start

        // [1] System.out.println(); : sout 자동완성
        //  System : 클래스이면서 시스템 관련 기능/함수 제공한다.
        // out : 출력 관련된 기능/함수 갖는 객체 반환
        // print : 출력함수
        System.out.println("hello java1"); // vs console.log()
        // [2]  System.out.print(); : 자료 출력
        System.out.print("hello java2");
        // [3]  System.out.printf(); : 자료 출력 + 형식문자
        System.out.printf("%s", "hello java");
        /*
            printf(format 형식)
                %s : 문자열, %d : 정수, %c : 문자, %f 실수
                자릿수
                    %자릿수d : 자릿수 만큼 자리 차지, 만일 비어있으면 공백, 오른쪽 정렬
                    %-자릿수d : 자릿수 만큼 자리차지, 만일 비어있으면 공백 왼쪽정렬
                    %0자릿수d : 자릿수 만큼 자리 차지, 만일 비어있으면 0채움
                    전체자릿수 소수점 자릿수 f
         */
        String name = "유재석";
        int age = 10;
        // 문자열과 변수 연결 할 때 + 더하기(연결)연산자 연결한다.
        System.out.printf("저는" + name +"이고 나이는 : " + age + "입니다.");
        // 변수 또는 수식이 들어가는 자리에 형식문자로 대체한다.
        System.out.printf("저는 %s 이고 나이는 %d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 키는 %3.2f 입니다.\n", name, 177.2354);

        // [5] 이스케이프/제어 문자
        // "\n" : 줄 바꿈, "t : 들여쓰기 [tab], \" : 큰따옴표 출력, \' : 작은따옴표 출력, \\ : 백슬래시 출력
        System.out.println("hello \n java3");
        System.out.println("hello \t java3");
        System.out.println("hello \" java3");
        System.out.println("hello \' java3");
        System.out.println("hello \\ java3");


    } // main end
} // class end
