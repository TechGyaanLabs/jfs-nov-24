package com.careerit.cj.day13;


class Account {
    private String accNumber;
    private String name;
    private double balance;
    private double minBalance;
    private String mobile;
    private String email;
    private String city;

    public Account(String accNumber, String name, String mobile) {
        this(accNumber, name, mobile, "N/A", "N/A");
        System.out.println("NumberOperations1 object created");
    }

    public Account(String accNumber, String name, String mobile, String email, String city) {
        this(accNumber, name, mobile, email, city, 0, 0);
    }

    public Account(String accNumber, String name, String mobile, String email, String city,double balance, double minBalance) {
        this.accNumber = accNumber;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public void showDetails() {
        System.out.println("NumberOperations1 Number : " + accNumber);
        System.out.println("Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.println("Email : " + email);
        System.out.println("City : " + city);
        System.out.println("Balance : " + balance);
        System.out.println("Min Balance : " + minBalance);
    }
}

public class ThisMethodExample {

    public static void main(String[] args) {
        Account acc = new Account("SB1001", "Krish", "9898989898");
        acc.showDetails();

        Account acc1 = new Account("SB1002", "Manoj", "9898989898", "manoj@gmail.com", "Hyderabad",5000,1000);
    }
}
