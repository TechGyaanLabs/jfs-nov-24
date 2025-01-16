package com.careerit.cj.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Krish");
        for(String ele:list){
            System.out.println(ele.toUpperCase());
        }
    }
}
