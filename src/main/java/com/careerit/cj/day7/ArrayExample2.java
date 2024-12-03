package com.careerit.cj.day7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample2 {

    public static void main(String[] args) {

            int[] arr = new int[20];
            for (int i = 0; i < arr.length; ) {
                int ele = ThreadLocalRandom.current().nextInt(1,51);
                if(!isExists(arr,ele)){
                   arr[i] = ele;
                    i++;
                }
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
    }

    public static boolean isExists(int[] arr, int key){
        for (int ele : arr) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }
}
