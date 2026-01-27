package day06.과제;

public class Product {
    String name;
    int stock;

    boolean sell(int amount) {
        if (this.stock >= amount) {
            this.stock -= amount;
            return true;
        } else {
            System.out.println("재고 부족");
            return false;
        }
    }
}