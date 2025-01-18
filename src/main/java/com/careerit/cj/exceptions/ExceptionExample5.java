package com.careerit.cj.exceptions;

public class ExceptionExample5 {

    public static void main(String[] args) {

        try{
            int[] arr = {10,5,0};
            int res1 = arr[0] / arr[1];
            int res2 = arr[1] / arr[2];
            int ele = arr[3];
            System.out.println(res1);
            System.out.println(res2);
            System.out.println(ele);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Catch2");
        }finally{
            System.out.println("Finally");
        }
    }
}
