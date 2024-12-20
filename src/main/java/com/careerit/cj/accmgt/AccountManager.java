package com.careerit.cj.accmgt;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    public static void main(String[] args) {
        List<Account> accounts = getAllAccounts();


        List<Account> savingsAccounts = new ArrayList<>();
        List<Account> currentAccounts = new ArrayList<>();

        for(Account acc: accounts) {
            if(acc instanceof SavingsAccount) {
                savingsAccounts.add(acc);
            }else if(acc instanceof CurrentAccount) {
                currentAccounts.add(acc);
            }
        }
        System.out.println("\nTotal savings account count : "+savingsAccounts.size()+"\n");
        double totalSavingsBalance = 0;
        for(Account acc: savingsAccounts) {
            totalSavingsBalance += acc.getBalance();
            acc.showDetails();
            System.out.println();
        }
        System.out.println("Total savings account balance : "+totalSavingsBalance);


        // Display all current account details

        // Show total balance of all current account

        // Show total current account count

    }

    private static List<Account> getAllAccounts() {
        Account acc1 = new SavingsAccount("Krish", 50000);
        Account acc2 = new CurrentAccount("Kite System pvt.", 100000);
        Account acc3 = new SavingsAccount("Manoj", 20000);
        Account acc4 = new CurrentAccount("Amazon", 50000);
        Account acc5 = new SavingsAccount("Sai", 30000);
        Account acc6 = new CurrentAccount("Google", 100000);
        Account acc7 = new SavingsAccount("Rajesh", 40000);
        Account acc8 = new CurrentAccount("Microsoft", 200000);
        Account acc9 = new SavingsAccount("Suresh", 60000);
        Account acc10 = new CurrentAccount("Apple", 300000);
        Account acc11 = new SavingsAccount("Ramesh", 70000);
        return List.of(acc1, acc2, acc3, acc4, acc5, acc6, acc7, acc8, acc9, acc10, acc11);
    }
}
