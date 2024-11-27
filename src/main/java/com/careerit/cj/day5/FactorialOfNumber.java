package com.careerit.cj.day5;

public class FactorialOfNumber {

    public static void main(String[] args) {

        int num = 5; // 5 * 4 * 3 * 2 * 1 => 120
        int res = 1;
        for(int i = num ; i >= 2; i--){
            res  *= i;
        }
        System.out.println("Factorial of "+num+" is "+res);
    }
}
