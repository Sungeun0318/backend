package day05;

import java.awt.*;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        // 1. 클래스 정의/선언 만들기
        // 2. 정의한 클래스로 객체 선언한다. 클래스명 변수명 = new 클래스명();
        // 1
        Book book1 = new Book();
        book1.title = "이것이 자바다";
        book1.author = "신용권";
        book1.price = 30000;
        Book book2 = new Book();
        book2.title = "자바의 정석";
        book2.author = "남궁성";
        book2.price = 28000;
        System.out.println(book1.title + " " + book1.author + " " + book1.price);
        System.out.println(book2.title + " " + book2.author + " " + book2.price);

        // 2
        Pet pet1 = new Pet();
        pet1.name = "초코";
        pet1.species = "푸들";
        pet1.age = 3;
        Pet pet2 = new Pet();
        pet2.name = "나비";
        pet2.species = "코리안숏헤어";
        pet2.age = 5;
        System.out.println(pet1.name + " " + pet1.species + " " + pet1.age);
        System.out.println(pet2.name + " " + pet2.species + " " + pet2.age);

        // 3
        Rectangle rect1 = new Rectangle();
        rect1.width = 10;
        rect1.height = 5;
        System.out.println("사각형의 넓이 : " + rect1.width * rect1.height);

        // 4
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = "111-222-3333";
        bankAccount.ownerName = "유재석";
        bankAccount.balance = 10000;
        bankAccount.balance += 5000;
        System.out.println("입금 후 잔액 : " + bankAccount.balance);
        bankAccount.balance -= 3000;
        System.out.println("출금 후 잔액 : " + bankAccount.balance);

        // 5
        Product product1 = new Product();
        product1.name2 = "새우깡";
        product1.price2 = 1500;
        Product product2 = new Product();
        product2.name2 = "콜라";
        product2.price2 = 2000;
        if (product1.price2 > product2.price2) {
            System.out.println(product1.name2);
        } else {
            System.out.println(product2.name2);
        }

        // 6
        Member member1 = new Member();
        member1.id = "admin";
        member1.isLogin = false;
        System.out.println("로그인 전 상태 : " + member1.isLogin);
        member1.isLogin = true;
        System.out.println("로그인 후 상태 : " + member1.isLogin);

        // 7
        Television television1 = new Television();
        television1.channel = 7;
        television1.volume = 20;
        television1.channel = 11;
        television1.volume -= 2;
        System.out.println("채널 : " + television1.channel + " "+ "볼륨 : " + television1.volume);

        // 8
        Player player1 = new Player();
        player1.name3 = "손흥민";
        player1.power = 90;
        player1.speed = 95;
        Player player2 = new Player();
        player2.name3 = "이강인";
        player2.power = 85;
        player2.speed = 92;

        if (player1.power + player1.speed > player2.power + player2.speed) {
            System.out.println(player1.name3);
        }else  {
            System.out.println(player2.name3);
        }

        // 9
        MenuItem menuItem1 = new MenuItem();
        menuItem1.name4 = "김치찌개";
        menuItem1.price4 = 8000;
        menuItem1.isSignature = true;
        MenuItem menuItem2 = new MenuItem();
        menuItem2.name4 = "된장찌개";
        menuItem2.price4 = 8000;
        menuItem2.isSignature = false;
        MenuItem menuItem3 = new MenuItem();
        menuItem3.name4 = "계란찜";
        menuItem3.price4 = 3000;
        menuItem3.isSignature = false;

        if (menuItem1.isSignature == true) {
            System.out.println(menuItem1.name4 + " " + menuItem1.price4);
        } else  if (menuItem2.isSignature == true) {
            System.out.println(menuItem2.name4 + " " + menuItem2.price4);
        } else  if (menuItem3.isSignature == true) {
            System.out.println(menuItem3.name4 + " " + menuItem3.price4);
        }

        // 10
        UserProfile userProfile = new UserProfile();
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String username = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int userage = sc.nextInt();
        System.out.print("MBTI 입력하세요 : ");
        String usermbti = sc.next();
        userProfile.name5 = username;
        userProfile.age5 = userage;
        userProfile.mbti = usermbti;
        System.out.println(userProfile.name5 + " " + userProfile.age5 + " " + userProfile.mbti);
    }
}




/* 나중에는 새로운 파일에 클래스 생성해서 할 것 */

class Book {
    // 멤버변수 = 속성
    String title;
    String author;
    int price;
}

class Pet {
    String name;
    String species;
    int age;
}

class Rectangle {
    int width;
    int height;
}

class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;
}

class Product {
    String name2;
    int price2;
}

class Member {
    String id;
    Boolean isLogin;
}

class Television {
    int channel;
    int volume;
}

class Player {
    String name3;
    int power;
    int speed;
}

class MenuItem {
    String name4;
    int price4;
    boolean isSignature;
}

class UserProfile {
    String name5;
    int age5;
    String mbti;
}
