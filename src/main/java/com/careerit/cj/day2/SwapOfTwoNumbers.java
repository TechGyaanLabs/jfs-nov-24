package com.careerit.cj.day2;

public class SwapOfTwoNumbers {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        /*
            System.out.println("Before swapping num1 : "+num1+" and num2 : "+num2);
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("After swapping num1 : "+num1+" and num2 : "+num2);
        */
        System.out.println("Before swapping num1 : "+num1+" and num2 : "+num2);
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("After swapping num1 : "+num1+" and num2 : "+num2);

    }
}
