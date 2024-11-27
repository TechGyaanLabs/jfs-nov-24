package com.careerit.cj.day5;

public class FactorsGivenNumber {

    public static void main(String[] args) {

        int num = 24;
        System.out.println(1);
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}
