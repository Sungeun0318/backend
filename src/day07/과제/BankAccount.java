package day07.과제;

public class BankAccount {
    String accountNumber;
    String ownerNumber;
    int balance;
    BankAccount(String accountNumber, String ownerNumber, int balance) {
        this.accountNumber = accountNumber;
        this.ownerNumber = ownerNumber;
        this.balance = balance;
    }
    int deposit(int 입금액){
        balance = balance + 입금액;
        return balance;
    }
    int withdraw(int 출금액){
        balance = balance - 출금액;
        return balance;
    }
}
