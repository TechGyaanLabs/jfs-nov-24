package com.careerit.cj.day18;

import java.util.ArrayList;
import java.util.List;

public class NumberOperations1 {


    public int[] getPrimes(int lb, int ub) {
        List<Integer> list = getPrimeList(lb, ub);
        int[] arr = new int[list.size()];
        int i = 0;
        for (int ele : list) {
            arr[i++] = ele;
        }
        return arr;
    }


    private boolean isPrime(int num) {
        if (num < 0 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    private List<Integer> getPrimeList(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {

        NumberOperations1 obj = new NumberOperations1();
        List<Integer> primes = obj.getPrimeList(2, 50);
        System.out.println(primes);
    }

}
