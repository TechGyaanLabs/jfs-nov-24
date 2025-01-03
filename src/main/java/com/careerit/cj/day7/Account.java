package com.careerit.cj.day7;

public class Account {

        private String accNum;
        private String name;
        private double balance;
        public Account(String accNum, String name, double balance) {
            this.accNum = accNum;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("After withdrawing "+amount+" balance is : "+balance);
            }else{
                System.out.println("Insufficient funds");
            }
        }

        public void deposit(double amount){
            balance += amount;
            System.out.println("After depositing "+amount+" balance is : "+balance);
        }

        public void showInfo() {
            System.out.println("NumberOperations1 number : "+accNum);
            System.out.println("Name           : "+name);
            System.out.println("Balance        : "+balance);
        }
}
