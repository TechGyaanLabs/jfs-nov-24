package com.careerit.cj.day18;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface VirtualGreetings {

}

interface Greet {
    void wish();
}

class Greetings {
    public static void wish(Greet greet) {
        greet.wish();
    }
}

interface MathOpe {
    int ope(int a, int b);
}

class Add implements MathOpe {
    @Override
    public int ope(int a, int b) {
        return a + b;
    }
}

class Sub implements MathOpe {
    @Override
    public int ope(int a, int b) {
        return a - b;
    }
}

public class InterfaceTypesExamples {

    public static void main(String[] args) {
        Greet newYear = () -> System.out.println("Wish you happy new year");
        Greet birthday = () -> System.out.println("Wish you happy birthday");
        Greet christmas = () -> System.out.println("Wish you merry christmas");

        Greetings.wish(christmas);
        Greetings.wish(birthday);
        Greetings.wish(newYear);

        MathOpe add = (a, b) -> a + b;
        MathOpe sub = (a, b) -> a - b;
        MathOpe div = (a, b) -> a / b;
        MathOpe mul = (a, b) -> a * b;

        System.out.println(add.ope(10, 20));


        Consumer<Integer> consumer = (ele) -> System.out.println("The value is :" + ele);
        consumer.accept(100);

        Predicate<Integer> predicate = (ele) -> ele % 2 == 0;
        System.out.println(predicate.test(10));

    }
}
