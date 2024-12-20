package com.careerit.cj.accmgt;

import static com.careerit.cj.accmgt.AccountUtil.maskAccountNumber;

public class CurrentAccount extends Account{

        private final double OVERDRAFT_LIMIT = 10000;

        public CurrentAccount(String name, double balance){
            super(name, balance);
        }

        @Override
        public void withdraw(double amount){
            if(balance + OVERDRAFT_LIMIT >= amount){
                balance -= amount;
                String data = String.format("Amount %.2f is withdrawn from account %s and balance is %.2f",
                        amount, maskAccountNumber(accNumber), balance);
                System.out.println(data);
            }else{
                System.out.println("Insufficient funds....");
            }
        }
}
