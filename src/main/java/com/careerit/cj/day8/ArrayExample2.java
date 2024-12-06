package com.careerit.cj.day8;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {

        int count = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5};
        count = 4;

        int[] temp = new int[arr.length + 100];

        System.arraycopy(arr, 0, temp, 0, arr.length);

        arr = temp;
        arr[count++] = 6;

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
