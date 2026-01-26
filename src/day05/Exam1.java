package day05;

import java.util.Arrays;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 배열이란? *동일한타입*의 여러 자료들을 순서대로 저장하는 자료타입
        // [2] 선언 : 타입 [] 변수명 = new 타입[총 개수];
        // [3] 특징 : (1) 동일한타입끼리 (2) 고정길이 (3) 요소초기값존재
        // [4] 인덱스란? 배열내 요소(값)들이 저장된 순서 번호, 0번 시작
        int[] arr1 = new int[3]; // {0, 0, 0}
        String[] arr2 = {"봄", "여름", "가을", "겨울"}; // {초기값1, 초기값2, 초기값3, 초기값4}
        // [5] 배열변수의 출력
        System.out.println(arr1); // [I@6acbcfc0 : 배열의 주소(메모리 위치)값 출력 *주소값은 개발자가 제어불가능
        System.out.println(arr2); // [Ljava.lang.String;@5f184fc6
        // [6] 배열변수의 요소/값 전체 출력 Arrays.toString(배열변수명);
        System.out.println(Arrays.toString(arr1)); // [0, 0, 0]
        System.out.println(Arrays.toString(arr2)); // [봄, 여름, 가을, 겨울]
        // [*] 배열의 메모리 주소 상태 간단 구조
        // --
        // [7] 배열 사용
        System.out.println(arr1.length); // 배열변수명.length : 배열의 총길이 = 3
        // [8] 배열내 요소 값 수정, 주소값이 변경 되는건 아니다.
        arr1[0] = 10; // 배열변수명[인덱스] = 새로운값;
        System.out.println(arr1[0]);
        arr2[1] = "spring";
        System.out.println(arr1[1]);
        // [9] 배열의 요소 추가/삭제 없다.
//        arr1[4] = 40; // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        // [10] 반복문 활용
        for (int index = 0; index < arr1.length; index++) { // index는 0부터 마지막인덱스 이하까지 1씩 증가한다.
            System.out.println(arr1[index]); // [index]번째 요소값 가져오기/출력
        }
        // [11] 향상된 for문 : 위와같이 많이 사용되므로 추가된 반복문, 이터레이터
//        for(타입 반복변수 : 배열변수명){}, iterator(이터레이터/반복자/순회자)가 가능한 배열/객체만 사용 가능
        for (int value : arr1) {
            System.out.println(value);
        }


    }
}
