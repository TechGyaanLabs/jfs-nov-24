package com.careerit.cj.day8;

import java.util.ArrayList;
import java.util.List;

public class AssignmentQuestion {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Mango");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Apple");


        List<String> list2 = new ArrayList<>();

        list2.add("Apple");
        list2.add("Grapes");
        list2.add("Banana");
        list2.add("Pineapple");


        // Get unique elements from list1 and list1 and store it in list3

        List<String> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);

        List<String> list3 = new ArrayList<>();

        for(String ele: temp){
            if(!list3.contains(ele)){
                list3.add(ele);
            }
        }
        System.out.println(list3);

    }
}
