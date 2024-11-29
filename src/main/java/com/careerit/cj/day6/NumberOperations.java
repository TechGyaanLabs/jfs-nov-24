package com.careerit.cj.day6;

public class NumberOperations {

    public static void main(String[] args) {
        int num = 3459;
        System.out.println(reverse(num));
        System.out.println(incrementEachDigitByOne(num));
    }

    public static int sumOfDigits(int num) {
        num = Math.abs(num);
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int reverse(int num) {
        num = Math.abs(num);
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static int countOfDigits(int num) {
        num = Math.abs(num);
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean isPalindrome(int num) {
         return num ==  reverse(num);
    }

    public static int incrementEachDigitByOne(int num) {
        int result = 0;
        int multiplier = 1;
        while (num > 0) {
            int digit = (num % 10 + 1) % 10;
            result += digit * multiplier;
            multiplier *= 10;
            num /= 10;
        }
        return result;
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int count = countOfDigits(num);
        while (temp != 0) {
            sum += Math.pow(temp % 10, count);
            temp /= 10;
        }
        return sum == num;
    }
}