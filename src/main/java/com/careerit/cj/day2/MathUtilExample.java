package com.careerit.cj.day2;

public class MathUtilExample {

    public static void main(String[] args) {


            int m = 10;
            int n = 3;

            // m ^ n => 10 ^ 3 => 1000

            double res = Math.pow(m, n);
            System.out.println("The result of "+m+" power "+n+" is "+res);

            int a = 123;
            int b = 234;

            int maxRes = Math.min(a, b);
            System.out.println("The max of "+a+" and "+b+" is "+maxRes);
    }
}
