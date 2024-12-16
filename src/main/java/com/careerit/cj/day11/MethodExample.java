package com.careerit.cj.day11;

class MathOperations{

    public static int sum(int a,int b, int c){
        return a + b + c;
    }
    public static boolean isLeapYear(int year){
        return (((year & 3) == 0) && ((year % 100 != 0) || ((year % 400 == 0))));
    }
}
public class MethodExample {

    public static void main(String[] args) {

            int[] years = new int[]{100,400,2024,4000};



            for(int year:years){
                System.out.println(MathOperations.isLeapYear(year));
            }

    }
}
