package day08;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 싱글톤 : 프로그램내 단 하나의 인스턴스(객체) 갖는 설계 구조
        // [2] 싱글톤 생성
        // [3] 다른 클래스에서 싱글톤 호출, 클래스명.getInstance();
        Controller controller1 = Controller.getInstance(); // 101번지
        Controller controller2 = Controller.getInstance(); // 101번지
        View1 view1 = new View1(); // 102번지
        View1 view2 = new View1(); // 103번지

        System.out.println("controller1 = " + controller1);
        System.out.println("controller2 = " + controller2);
        System.out.println("view1 = " + view1);
        System.out.println("view2 = " + view2);
//        controller1 = day08.Controller@3feba861
//        controller2 = day08.Controller@3feba861
//        view1 = day08.View1@723279cf
//        view2 = day08.View1@10f87f48


    }
}








class Controller{ // 해당 클래스의 싱글톤 패턴 적용하
    // 1. 생성자를 private 한다. 다른 클래스에서 new 못한다. -> 객체 생성 불가능
    private Controller(){}
    // 2. 단 하나의 객체 생성하여 상수(static final)에 저장한다. -> 싱글톤 생성
    private static final Controller instance = new Controller();
    // 3. 해당 싱글톤(객체)를 다른 클래스에서 간접 사용(공유) 하도록 getter 만든다.
    public static Controller getInstance(){
        return instance; // 2번에서 생성한 싱글톤(객체) 반환한다.
    }


}

class View1{}
