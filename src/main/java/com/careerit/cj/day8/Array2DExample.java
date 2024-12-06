package com.careerit.cj.day8;

import java.util.Arrays;

public class Array2DExample {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {3, 4, 5, 4},
                {4, 5, 6, 5},
                {6, 7, 8, 8},
                {1, 2, 3, 4}
        };
        /*int sum = 0;
        for(int[] ar: arr){
           for(int ele:ar){
                sum += ele;
           }
        }*/
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(i == j){
                   sum += arr[i][j];
               }
            }
        }
        System.out.println("Sum of elements : " + sum);
    }
}
