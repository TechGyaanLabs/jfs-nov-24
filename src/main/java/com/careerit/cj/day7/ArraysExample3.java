package com.careerit.cj.day7;

public class ArraysExample3 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        System.out.println(isPalindrome(arr) ? "Given array is palindrome" : "Given array is not palindrome");

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 3, 2, 1 };
        System.out.println(isPalindrome(arr1) ? "Given array is palindrome" : "Given array is not palindrome");
    }

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
