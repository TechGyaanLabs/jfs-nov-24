package com.careerit.cj.day9;

public class StringExample5 {

    public static void main(String[] args) {

            String accountNumber = "SBIN0001234";
            String mobile = "9876543210";

            String accountNumber1 = "**********"+accountNumber.substring(accountNumber.length()-4);
            String mobile1 = "**********"+mobile.substring(mobile.length()-4);
            System.out.println(accountNumber1);
            System.out.println(mobile1);
    }
}
