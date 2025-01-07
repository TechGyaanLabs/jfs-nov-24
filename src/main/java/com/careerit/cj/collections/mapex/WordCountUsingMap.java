package com.careerit.cj.collections.mapex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountUsingMap {

    public static void main(String[] args) {

        List<String> words = List.of("Java", "Python", "C", "Java", "Python",
                "Java", "C++", "Java", "Python",".Net","Angular","React",
                "Java", "Python", "C", "Java", "Python", "Java", "C++", "Java", "Python",".Net","Angular",
                "React");

        // Find the word count of each word in the list
        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
           map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
