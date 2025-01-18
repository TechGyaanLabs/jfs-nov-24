package com.careerit.cj.exceptions;

import java.util.Scanner;

public class ExceptionExample1 {

    public static void main(String[] args) {

        System.out.println("Start of main method");

        showResult();
        System.out.println("End of main method");



    }

    private static void showResult() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the num1 : ");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2 : ");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("Result is :" + res);
        }catch (ArithmeticException e){
            System.out.println("Value of num2  is zero " +e);
            e.printStackTrace();
        }
    }


}
