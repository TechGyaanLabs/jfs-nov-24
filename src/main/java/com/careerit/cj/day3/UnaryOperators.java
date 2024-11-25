package com.careerit.cj.day3;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 10;
        System.out.println("num1 : " + num1);
        num1 = -num1;
        System.out.println("num1 : " + num1);

        boolean isTrue = true;

        System.out.println("isTrue : "+isTrue);
        isTrue = !isTrue;
        System.out.println("isTrue : "+isTrue);

        // Increment and Decrement operators

        int a = 10;

        System.out.println("a : "+a);
        a++;
        System.out.println("a : "+a);

        int b = 20;

        System.out.println("b : "+b);
        b--;
        System.out.println("b : "+b);

    }
}
