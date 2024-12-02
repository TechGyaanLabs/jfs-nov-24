package com.careerit.cj.day7;

public class AccountManager {

    public static void main(String[] args) {

            Account acc1 = new Account("SB1001", "Krish", 50000);
            Account acc2 = new Account("SB1002", "Manoj", 40000);

            acc1.showInfo();
            acc1.withdraw(20000);
            acc1.deposit(70000);
            acc1.withdraw(100000);
            acc1.deposit(5000);
            acc1.showInfo();

            acc2.showInfo();

    }
}
