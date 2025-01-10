package com.careerit.cj.collections.streams.java8;

import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        List<String> names = List.of("Krish", "Manoj", "Charan", "Rajesh", "Suresh", "Mahesh");

        String result = names.stream().reduce("", (a, b) -> a + b);
        System.out.println(result);

        List<Integer> integers = List.of(1,2,3,4,5,6);

        int sum = integers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        int re = integers
                .stream()
                .reduce(0,(a,b)-> a * b);
        System.out.println(re);

        // 1, 2, 3, 4, 5 , 6

        // identity = 1

        // 1  * 1 => identity = 1
        // 1 + 2 => identity = 3
        // 3 + 3 => identity = 6
        // 6 + 4 => identity = 10
        // 10 + 5 = > 15
        // 15 + 6 = 21


    }


}
