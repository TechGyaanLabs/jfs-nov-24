package com.careerit.cj.day12;

public class MathUtil {
    private MathUtil(){}

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        return rev;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum += r;
            num = num / 10;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int pow(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }

    public static int sumOfN(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }
}
