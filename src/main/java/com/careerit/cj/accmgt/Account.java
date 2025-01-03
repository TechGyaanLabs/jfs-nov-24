package com.careerit.cj.accmgt;
import static com.careerit.cj.accmgt.AccountUtil.generateAccountNumber;
import static com.careerit.cj.accmgt.AccountUtil.maskAccountNumber;

public abstract class Account {

    String accNumber;
    String name;
    double balance;

    public Account(String name, double balance) {
        this.accNumber = generateAccountNumber();
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            String data = String.format("Amount %.2f is withdrawn from account %s and balance is %.2f",
                    amount, maskAccountNumber(accNumber), balance);
            System.out.println(data);
        }else {
            System.out.println("Insufficient funds....");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        String data = String.format("Amount %.2f is deposited to account %s and balance is %.2f",
                amount, maskAccountNumber(accNumber), balance);
        System.out.println(data);
    }

    public void showDetails() {
        String data = String.format("NumberOperations1 number : %s\nName : %s\nBalance : %.2f", accNumber, name, balance);
        System.out.println(data);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }
}
