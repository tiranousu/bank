package com.github;

import java.util.ArrayList;

public class Customer {
    private String name; // 고객 이름
    private String customerID; // 고객 ID
    private ArrayList<Account> accounts = new ArrayList<>(); // 고객의 계좌 목록 초기화

    // 생성자
    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;

    }

    // 계좌 추가 메서드
    public void addAccount(Account account) {
        this.accounts.add(account); // account로 추가 안됨 this사용
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Customer{" +
                "Name='" + name + '\'' +
                ", Customer ID='" + customerID + '\'' +
                ", Accounts=" + accounts +
                '}';
    }
}

