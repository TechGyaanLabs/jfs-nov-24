package com.careerit.cj.day6;

public class MultiplicationOfTableUsingWhile {

    public static void main(String[] args) {

        int num = 19;
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
        int num1 = 5;
        int res = factorialOf(num1);
        System.out.println("The factorial of "+num1+" is "+res);
    }

    public static int sumOfNaturalNumbers(int N) {
        int i = 1;
        int sum = 0;

        while(i <= N){
            sum += i;
            i++;
        }
        return sum;
    }

    public static int factorialOf(int n){
        int i = 2;
        int fact = 1;
        while(i <= n){
            fact *= i;
            i++;
        }
        return fact;
    }
}
