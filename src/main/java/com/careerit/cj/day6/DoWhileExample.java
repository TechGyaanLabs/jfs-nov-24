package com.careerit.cj.day6;

public class DoWhileExample {
    public static void main(String[] args) {
           int fact = factorial(5);
           System.out.println("Factorial of 5 is :"+fact);
    }

    public static int factorial(int num) {
        int res = 1;
        int i = num;
        do {
            res *= i;
            i--;
        } while (i >= 2);
        return res;
    }
}
