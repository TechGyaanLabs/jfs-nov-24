package com.careerit.cj.collections.setex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample1 {

    public static void main(String[] args) {

        String data = "Krish,Manoj,Charan,Krish,Manoj,Manoj,Charan,Manoj";

        Set<String> set = new HashSet<>();
        String[] arr = data.split(",");

        for(String name:arr){
            set.add(name);
        }
        System.out.println(set);

        for(String name:set){
            System.out.println(name);
        }

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
