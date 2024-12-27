package com.careerit.cj.day18;

import java.util.function.BiFunction;
import java.util.function.Consumer;

class NumberOperation{

        static int sum(int a, int b){
            return a + b;
        }

        void show(String data){
            System.out.println(data);
        }
}
public class MethodRefExample {

    public static void main(String[] args) {
        NumberOperation ope = new NumberOperation();
        Consumer<String> obj =  ope::show;
        obj.accept("Hello how are you?");
        BiFunction<Integer,Integer,Integer> fun = NumberOperation::sum;
        int res = fun.apply(10,30);
        System.out.println("Result is :"+res);
    }
}
