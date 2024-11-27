package com.careerit.cj.day5;

public class GeneratePrimeNumbersInRange {

    public static void main(String[] args) {

        int lb = 5;
        int ub = 20;
        for (int num = lb; num <= ub; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
