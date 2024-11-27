package com.careerit.cj.day5;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
        }
        if (n == 2) {
            System.out.println(0 + " " + 1);
        }

        if (n > 2) {
            int firstTerm = 0;
            int secondTerm = 1;
            System.out.print(firstTerm + " " + secondTerm);
            for (int i = 3; i <= n; i++) {
                int c = firstTerm + secondTerm;
                System.out.print(" " + c);
                firstTerm = secondTerm;
                secondTerm = c;
            }


        }
    }
}
