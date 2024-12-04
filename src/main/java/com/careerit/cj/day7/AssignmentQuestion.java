package com.careerit.cj.day7;

import java.util.Arrays;

public class AssignmentQuestion {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 11, 12, 13, 14, 15, 20, 21, 22, 23, 24, 25, 30, 31, 32, 33, 34, 35};
        int count = countPrimes(arr);
        System.out.println("No of prime numbers in array : " + count);

        int lb = 1;
        int ub = 100;

        int[] primes = getPrimesInRange(lb, ub);
        System.out.println("Prime numbers in the range " + lb + " and " + ub + " are : " + Arrays.toString(primes));
        System.out.println("Prime numbers in the range " + lb + " and " + ub + " are : " + primes.length);

        int n = 25;
        int[] primesArr = getPrimes(n);
        System.out.println("First  " + n + " prime numbers are : " +Arrays.toString(primesArr));

    }


    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int ele : arr) {
            if (isPrime(ele)) {
                count++;
            }
        }
        return count;
    }

    public static int[] getPrimesInRange(int lb, int ub) {
        int count = countPrimesInRange(lb, ub);
        int[] primes = new int[count];
        int index = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }
        return primes;
    }

    public static int[] getPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        for (int i = 2; count < n ; i++) {
            if (isPrime(i)) {
                primes[count++] = i;
            }
        }
        return primes;
    }

    public static int countPrimesInRange(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }


    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
