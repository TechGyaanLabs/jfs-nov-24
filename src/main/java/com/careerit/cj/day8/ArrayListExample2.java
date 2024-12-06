package com.careerit.cj.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,1,2,5,6,7,8,9,10,9,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        List<Integer> list = new ArrayList<>();

        for(int ele: arr){
            if(!list.contains(ele)){
                list.add(ele);
            }
        }

        System.out.println(list);

    }
}
