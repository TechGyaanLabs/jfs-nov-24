package com.careerit.cj.day9;

import java.util.List;

class Account{
    private String name;
    private String accNumber;
    private String mobile;
    private double balance;

    public Account(String name, String accNumber, String mobile, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
        this.mobile = mobile;
    }

    public void showBalance(){
        // TODO: Mask account number and show only last 4 digits
        System.out.println("Hi "+name+", \n The account "+accNumber+"  has balance of "+balance);
    }

    public void showAccountDetails(){
        // TODO: Mask account number and show only last 4 digits AND show only last 4 digits of mobile number
        System.out.println("Name : "+name);
        System.out.println("Account Number : "+accNumber);
        System.out.println("Mobile : "+mobile);
        System.out.println("Balance : "+balance);
    }

}
public class AssignmentString4 {

    public static void main(String[] args) {

        Account acc1 = new Account("Krish", "SB202401010082345", "9876543210", 10000);
        Account acc2 = new Account("Manoj", "SB202401010082346", "9876543211", 20000);
        Account acc3 = new Account("Charan", "SB202401010082347", "9876543212", 30000);
        Account acc4 = new Account("Rajesh", "SB202401010082348", "9876543213", 40000);
        Account acc5 = new Account("Suresh", "SB202401010082349", "9876543214", 50000);

        List<Account> accounts = List.of(acc1,acc2,acc3,acc4,acc5);

        for(Account acc:accounts){
            acc.showBalance();
            System.out.println("-------------------------------------------------");
        }

    }
}
