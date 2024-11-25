package com.careerit.cj.day3;

import java.util.Scanner;

// if the bill amount is greater than or equal 5000 then give 20% discount
// otherwise 10% discount
public class DiscountWithIfElseExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        double amount = sc.nextDouble();

        double discount = 0;
        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 2000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.05;
        }

        double finalAmount = amount - discount;

        System.out.println("Bill Amount : " + amount);
        System.out.println("Discount    : " + discount);
        System.out.println("Final Amount: " + finalAmount);

    }
}
