package com.careerit.cj.day18;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class UsageOfLambdaExpressions {

    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a, b) -> a + b;

        String data = "Hello";

        Predicate<String> predicate = (str)->{
            str = str.toUpperCase();
            System.out.println(str);
            return data.equals(str);
        };

        BiFunction<Integer,Integer,Integer> biFunction = (num1, num2)-> num1 * num2;
        System.out.println(add.apply(10, 20));

        List<Integer> list = List.of(1,2,3,4,5,6);
        int res  = calculate(list, (num1,num2)-> num1 + num2, 0);
        System.out.println(res);
    }

    private static int calculate(List<Integer> list, BinaryOperator<Integer> operator, int initial) {
        int res = initial;
        for (Integer ele : list) {
            res = operator.apply(res, ele);
        }
        return res;
    }
}
