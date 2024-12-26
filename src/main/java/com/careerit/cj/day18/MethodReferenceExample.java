package com.careerit.cj.day18;


import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MethodReferenceExample {

    public static void main(String[] args) {

        BinaryOperator<Integer> obj = Integer::sum;

        List<Integer> list = List.of(1,2,3,4,5,6);

        int sum = 0;
        for(Integer ele : list) {
            sum = obj.apply(sum, ele);
        }
        System.out.println(sum);

        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello");

    }
}
