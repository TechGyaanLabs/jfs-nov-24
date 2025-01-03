package com.careerit.cj.collections.listex;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");

        for (String str : list) {
            System.out.println(str.toUpperCase());
        }

        System.out.println(list.size());

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.isEmpty());

        list.add(1, "Rajesh");

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.addAll(List.of("John","Marry","Saleem"));
        System.out.println(list);
        
        list.remove("Marry");
        System.out.println(list);

        if(list.contains("Saleem")){
            System.out.println("Yes");
        }

        list.forEach(ele->{
            ele = ele.toUpperCase();
            System.out.println(ele);
        });


    }
}
