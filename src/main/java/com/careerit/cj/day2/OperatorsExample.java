package com.careerit.cj.day2;

public class OperatorsExample {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 3;
        System.out.println("Num1 : "+num1+" and Num2 : "+num2);
        System.out.println("Addition : "+(num1 + num2));
        System.out.println("Subtraction : "+(num1 - num2));
        System.out.println("Multiplication : "+(num1 * num2));
        System.out.println("Division : "+(num1 / num2));
        System.out.println("Modulus : "+(num1 % num2));
        System.out.println("Increment : "+(++num1));
        System.out.println("Decrement : "+(--num2));

        int num = -10;
        System.out.println("Num : "+num);
        System.out.println("Positive : "+(-num));

        int a = 10;

        a += 5;    // a = a + 5;
        a *= 2;    // a = a * 2;
        System.out.println("A : "+a);



    }
}
