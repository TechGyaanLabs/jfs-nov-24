package com.careerit.cj.day7;

public class ArrayExample1 {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        for (int ele : arr) {
            System.out.println(ele);
        }

    }
}
