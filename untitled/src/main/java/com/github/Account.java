package com.github;
public class Account {

    private String accountNumber;//계좌번호
    private String owername;//소유주 이름
    private double balance; //잔고

    //생성자
    public Account(double initialbalance, String name, String accountNumber) {
        this.balance = initialbalance;
        this.owername = name;
        this.accountNumber = accountNumber;
    }

    //입금
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("계좌 입금 금액: " + balance);
        }
        else {
            System.out.println("오류가 발생하였습니다");
        }
    }

    //출금
    public void withdraw(double amount){
        if((amount > 0) && (balance >= amount)){
            balance -= amount;
            System.out.println("계좌 출금 금액: " + balance);
        }
        else {
            System.out.println("오류가 발생하였습니다");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account{" +
                "Account Number='" + accountNumber + '\'' +
                ", Name='" + owername + '\'' +
                ", Balance=" + balance +
                '}';
    }

}
