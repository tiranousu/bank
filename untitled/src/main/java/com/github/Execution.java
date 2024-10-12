package com.github;

import java.util.Scanner;

import static java.lang.System.in;

public class Execution {
    private static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        Customer customer = new Customer("이찬우", "C01");

        while (true) {
            System.out.println("\n은행 시스템에 오신 것을 환영합니다. 선택하세요:");
            System.out.println("1: 계좌 생성");
            System.out.println("2: 입금");
            System.out.println("3: 출금");
            System.out.println("4: 잔액 확인");
            System.out.println("5: 종료");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(customer);
                    break;
                case 2:
                    depositToAccount(customer);
                    break;
                case 3:
                    withdrawFromAccount(customer);
                    break;
                case 4:
                    printBalances(customer);
                    break;
                case 5:
                    System.out.println("시스템을 종료합니다.");
                    scanner.close();
                    return;
            }
        }
    }

    private static void createAccount(Customer customer) {
        System.out.println("계좌번호를 입력하세요:");
        String accNumber = scanner.next();
        System.out.println("초기 입금액을 입력하세요:");
        double initialDepsit = scanner.nextDouble();

        Account newAccount = new Account(initialDepsit, customer.getName(), accNumber);
        customer.addAccount(newAccount);

        System.out.println("새 계좌가 생성되었습니다 계좌번호 : " + accNumber + "초기 입금액: " + initialDepsit);
    }

    private static void depositToAccount(Customer customer) {
        System.out.println("계좌번호를 입력하세요:");
        String accNumber = scanner.next();
        System.out.println("입금액을 입력하세요:");
        double amount = scanner.nextDouble();

        for (Account acc : customer.getAccounts())
            if (acc.getAccountNumber().equals(accNumber)) {
                acc.deposit(amount);
                System.out.println("계좌에 " + amount + "원이 입금되었습니다.");
                return; // 작업이 끝났으므로 메서드를 종료
            }
        System.out.println("해당 계좌번호를 찾을 수 없습니다.");
    }

    private static void withdrawFromAccount(Customer customer) {
        System.out.println("계좌번호를 입력하세요:");
        String accNumber = scanner.next();
        System.out.println("출금액을 입력하세요:");
        double amount = scanner.nextDouble();

        boolean found = false;  // 계좌 찾기 성공 여부를 확인하기 위한 플래그
        for (Account acc : customer.getAccounts()) {
            if (acc.getAccountNumber().equals(accNumber)) {
                found = true;  // 계좌를 찾은 경우
                if (acc.getBalance() >= amount) {  // 출금하려는 금액이 잔액보다 작거나 같은 경우에만 출금
                    acc.withdraw(amount);
                    System.out.println("계좌에서 " + amount + "원이 출금되었습니다.");
                    System.out.println("잔액은: " + acc.getBalance() + "원입니다.");  // 출금 후의 실제 잔액을 보여줍니다.
                } else {
                    System.out.println("잔액이 부족합니다. 현재 잔액: " + acc.getBalance() + "원");
                }
                break;  // 계좌를 찾았으니 더 이상의 검색은 필요 없음
            }
        }
        if (!found) {
            System.out.println("해당 계좌번호를 찾을 수 없습니다.");  // 계좌 번호가 목록에 없는 경우
        }
    }

    private static void printBalances(Customer customer) {
        System.out.println("계좌잔액목록: ");
        for (Account acc : customer.getAccounts()) {
            System.out.println(acc);
        }
    }
}
