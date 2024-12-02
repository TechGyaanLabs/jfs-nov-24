package com.careerit.cj.day7;

public class ArrayExample {

    public static void main(String[] args) {

            int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
            System.out.println("No of elements in array : "+arr.length);

            int sum = 0;
            // Using for each loop

            for(int ele:arr){
               sum += ele;
            }

            System.out.println("Sum of elements in array : "+sum);



    }
}
