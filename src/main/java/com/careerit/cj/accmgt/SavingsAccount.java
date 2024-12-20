package com.careerit.cj.accmgt;

import static com.careerit.cj.accmgt.AccountUtil.maskAccountNumber;

public class SavingsAccount extends Account{

    private final double MIN_BALANCE = 1000;


    public SavingsAccount(String name, double balance){
        super(name, balance);
    }

    @Override
    public void withdraw(double amount){
        if(balance - amount >= MIN_BALANCE){
            balance -= amount;
            String data = String.format("Amount %.2f is withdrawn from account %s and balance is %.2f",
                    amount, maskAccountNumber(accNumber), balance);
            System.out.println(data);
        }else{
            System.out.println("Insufficient funds....");
        }
    }
}
