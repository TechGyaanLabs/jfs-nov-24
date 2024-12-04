package com.careerit.cj.day7;

import java.util.Arrays;

public class Array2DExample {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {3, 4, 5, 4},
                {4, 5, 6, 5},
                {6, 7, 8, 8}
        };

        int[] res = sumRows(arr);
        System.out.println("Sum of rows : " + Arrays.toString(res));

        int[] res1 = sumColumns(arr);
        System.out.println("Sum of columns : "+Arrays.toString(res1));

    }

    public static int[] sumColumns(int[][] arr) {
        int[] res = new int[arr[0].length];

        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int[] ints : arr) {
                sum += ints[i];
            }
            res[i] = sum;
        }
        return res;

    }

    public static int[] sumRows(int[][] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            res[i] = sum;
        }
        return res;
    }

    public static int sumOfElements(int[][] arr) {
        int sum = 0;
        for (int[] ar : arr) {
            for (int ele : ar) {
                sum += ele;
            }
        }
        return sum;
    }

}
