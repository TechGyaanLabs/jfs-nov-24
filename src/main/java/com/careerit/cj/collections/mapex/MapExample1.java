package com.careerit.cj.collections.mapex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Krish", 25);
        map.put("Manoj", 30);
        map.put("Charan", 28);
        map.put("Krish", 26);
        System.out.println(map.size());

        System.out.println(map.get("Krish"));
        System.out.println(map.get("John"));

        Set<String> keys =  map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        Collection<Integer> values =  map.values();

        for (Integer value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String,Integer>> enterySet = map.entrySet();

        for(Map.Entry<String,Integer> entry:enterySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
