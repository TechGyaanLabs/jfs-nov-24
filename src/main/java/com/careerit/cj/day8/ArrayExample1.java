package com.careerit.cj.day8;

import java.util.Arrays;

public class ArrayExample1 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{4, 5, 6, 7, 8};

        int[] arr3 = new int[arr1.length + arr2.length];

        /*int count = 0;
        for(int i=0;i<arr1.length;i++){
            arr3[count++] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[count++] = arr2[i];
        }*/

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        System.out.println("Elements of arr3 are :"+ Arrays.toString(arr3));

    }
}
