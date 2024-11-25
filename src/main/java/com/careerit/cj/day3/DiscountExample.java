package com.careerit.cj.day3;

import java.util.Scanner;

public class DiscountExample {

    // Accept the bill amount from user and if amount is greater than 1000
    // then provide 10% discount and print the final amount

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        double amount = sc.nextDouble();

        double discount = 0;
        if(amount >= 1000){
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;

        System.out.println("Bill Amount : "+amount);
        System.out.println("Discount    : "+discount);
        System.out.println("Final Amount: "+finalAmount);

    }
}
