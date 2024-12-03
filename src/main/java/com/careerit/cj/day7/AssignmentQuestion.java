package com.careerit.cj.day7;

import java.util.Arrays;

public class AssignmentQuestion {

    public static void main(String[] args) {

            int[] arr = new int[]{10,11,12,13,14,15,20,21,22,23,24,25,30,31,32,33,34,35};
            int count = countPrimes(arr);
            System.out.println("No of prime numbers in array : "+count);

            int lb = 10;
            int ub = 100;

            int[] primes = getPrimesInRange(lb, ub);
            System.out.println("Prime numbers in the range "+lb+" and "+ub+" are : "+ Arrays.toString(primes));
            System.out.println("Prime numbers in the range "+lb+" and "+ub+" are : "+primes.length);

            int n = 100;
            int[] primesArr = getPrimes(n);
            System.out.println("First  "+n+" prime numbers are : "+primesArr.length);

    }


    public static int countPrimes(int[] arr){
        return 0;
    }

    public static int[] getPrimesInRange(int lb, int ub){
        return new int[]{};
    }

    public static int[] getPrimes(int n){
        return new int[]{};
    }

    public static int countPrimesInRange(int lb,int ub){
        return 0;
    }


    private static boolean isPrime(int num){
        return false;
    }

}
