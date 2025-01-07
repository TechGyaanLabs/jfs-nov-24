package com.careerit.cj.collections.mapex;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("One",11);
        map.put("Two", 12);
        System.out.println(map);

        map.put("Six", 6);
        map.putIfAbsent("Six", 13);
        System.out.println(map);
        map.put("Seven",17);
        map.put("Seven", map.getOrDefault("Seven",7) + 1);

        System.out.println(map);


    }
}
