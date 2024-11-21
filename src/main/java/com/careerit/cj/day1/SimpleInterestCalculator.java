package com.careerit.cj.day1;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        float p = 10000;
        float r = 3.5f;
        float t = 2;
        float si = (p * r * t) / 100;
        System.out.println("The simple interest for principal amount : "+p+" rate of interest : "+r+" time : "+t+" is "+si);
    }
}
