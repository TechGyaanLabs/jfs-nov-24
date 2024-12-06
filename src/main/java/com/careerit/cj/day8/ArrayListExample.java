package com.careerit.cj.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        // int -> Integer
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean
        // long -> Long
        // byte -> Byte
        // short -> Short

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, 30);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(60);
        list1.add(70);

        list.addAll(list1);

        System.out.println(list);

        for(int ele: list) {
        	System.out.println(ele);
        }
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
