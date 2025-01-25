package com.careerit.cj.exceptions;

public class AccountManager {

    public static void main(String[] args) {

            Account account = new Account("SB1001","Krish", 45000);
            try {
                account.withdrawAmount(50000);
            }catch (InsufficientFundsException e){
                e.printStackTrace();
            }
    }
}
