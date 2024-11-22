package com.careerit.cj.day2;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the principal amount : ");
            double p = sc.nextDouble();
            System.out.println("Enter the time in months : ");
            int t = sc.nextInt();
            System.out.println("Enter the rate of interest (%): ");
            double r = sc.nextDouble();

            r = r / 12 / 100;

            double emi = p * r * (Math.pow(1 + r, t)) / (Math.pow(1 + r, t) - 1);

            double totalInterest = emi * t - p;

            System.out.println("Principal : "+p);
            System.out.println("Time : "+t + " months");
            System.out.println("Rate : "+Math.round(r * 12 * 100)+" %");

            System.out.println("EMI : "+Math.round(emi));
            System.out.println("Total Interest : "+Math.round(totalInterest));
            System.out.println("Total Amount : "+Math.round(p + totalInterest));



    }
}
