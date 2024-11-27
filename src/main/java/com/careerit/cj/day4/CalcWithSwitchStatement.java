package com.careerit.cj.day4;

import java.util.Scanner;

public class CalcWithSwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operator (+,-,*,/,%)");
        String ope = sc.nextLine();
        switch (ope) {
            case "+" -> System.out.println(num1 + " " + ope + " " + num2 + " = " + (num1 + num2));
            case "-" -> System.out.println(num1 + " " + ope + " " + num2 + " = " + (num1 - num2));
            case "*" -> System.out.println(num1 + " " + ope + " " + num2 + " = " + (num1 * num2));
            case "/" -> System.out.println(num1 + " " + ope + " " + num2 + " = " + (num1 / num2));
            case "%" -> System.out.println(num1 + " " + ope + " " + num2 + " = " + (num1 % num2));
            default -> System.out.println("Unknown operator");
        }

    }
}
