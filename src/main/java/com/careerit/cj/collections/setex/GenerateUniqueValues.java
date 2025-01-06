package com.careerit.cj.collections.setex;

import java.util.HashSet;
import java.util.Set;
import java.util.random.RandomGenerator;

public class GenerateUniqueValues {


    public static void main(String[] args) {

        // Generate 20 unique random numbers between 10 to 100

        int requiredCount = 20;
        Set<Integer> set = new HashSet<>();
        while(set.size() != requiredCount){
            int num = RandomGenerator.getDefault().nextInt(10, 100);
            set.add(num);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
