package com.careerit.cj.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValuePassReference {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before calling update : "+num);
        update(num);
        System.out.println("After calling update : "+num);

        int[] arr = new int[]{10,20,30,40,50};
        System.out.println("Before calling update : "+ Arrays.toString(arr));
        update(arr);
        System.out.println("After calling update : "+ Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println("Before calling update : "+list);
        checkAndUpdate(list);
        System.out.println(list);

    }

    private static void checkAndUpdate(List<Integer> list) {
        list.add(30);
        list.add(40);
    }

    private static void update(int[] numArr) {
        	for(int i=0;i<numArr.length;i++) {
                numArr[i] = numArr[i] + 10;
        	}
    }

    public static void update(int num) {
    	num = num + 10;
    }
}
