package com.careerit.cj.collections;

public class PrimeNumbersInRange {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print prime numbers in a given range
    public static void printPrimeNumbersInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        int start = 10;
        int end = 50;

        printPrimeNumbersInRange(start, end);
    }
}