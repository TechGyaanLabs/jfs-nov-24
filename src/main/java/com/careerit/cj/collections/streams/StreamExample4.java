package com.careerit.cj.collections.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamExample4 {

    public static void main(String[] args) {

        List<String> list1 = List.of("John", "David", "Smith", "Sam", "John", "David", "Smith", "Sam", "John", "David", "Smith", "Sam");
        List<String> list2 = List.of( "Smith", "Sam", "John", "Tanvi", "Dhanvi", "Aadhya", "Sam");

        List<List<String>> list = List.of(list1, list2);

        /*for(List<String> ll: list) {
            for(String name: ll) {
                System.out.println(name);
            }
        }*/

        List<String> names = list.stream()
                .flatMap(Collection::stream)
                .distinct()
                .toList();
        System.out.println(names);

        List<Integer> numList1 = new ArrayList<>();
        numList1.add(10);
        numList1.add(20);
        numList1.add(30);
        System.out.println(numList1);

        List<Integer> numList2 = List.of(10,20,30);
        System.out.println(numList2);

    }
}
