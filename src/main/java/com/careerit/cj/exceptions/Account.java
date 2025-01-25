package com.careerit.cj.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Account {

    private String accNumber;
    private String name;
    private double balance;


    public void withdrawAmount(double amount)throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("You don't have sufficient funds, please check balance");
        }
        balance -= amount;
        System.out.println("Amount "+amount+" withdrawal is successful");
    }

}
