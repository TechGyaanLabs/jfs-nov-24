package com.careerit.cj.day6;

import java.time.LocalDate;

public class MethodsExample {

    public static void main(String[] args) {
        int num = 25;
        if (isPrime(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        String username = "Krish";
        greet(username);
        showDateTime();
        System.out.println("OS Name : " + getOsName());

        int lb = 10;
        int ub = 100;

        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime in range "+lb+" and "+ub+" is "+count);

    }


    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0 && num != 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int biggest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static String getOsName() {
        return "MacOS";
    }

    public static void greet(String username) {
        System.out.println("Hi " + username + " welcome to java world");
    }

    public static void showDateTime() {
        System.out.println(LocalDate.now());
    }

    public static int factorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

}
