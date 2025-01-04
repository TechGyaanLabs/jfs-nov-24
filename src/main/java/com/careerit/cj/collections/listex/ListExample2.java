package com.careerit.cj.collections.listex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListExample2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(60);
        list.add(50);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

//        Collections.sort(list,Comparator.reverseOrder());
//        System.out.println(list);

    }
}
