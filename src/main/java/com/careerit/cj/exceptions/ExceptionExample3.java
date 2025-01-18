package com.careerit.cj.exceptions;

public class ExceptionExample3 {

    public static void main(String[] args) {
            try{
                int num1 = 10;
                int num2 = 0;
                int res = num1 / num2;
                System.out.println("Result :"+res);
            }catch (ArithmeticException e){
                e.printStackTrace();
            }finally{
                System.out.println("Finally block");
            }
    }
}
