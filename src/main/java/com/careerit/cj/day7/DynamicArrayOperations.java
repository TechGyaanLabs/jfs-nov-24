package com.careerit.cj.day7;

import java.util.Scanner;

public class DynamicArrayOperations {


    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("1. Add 2. Delete 3.Update 4.Search 5.Display 6.Exit");
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element to add :");
                    int ele = sc.nextInt();
                    addElement(arr,count, ele);
                    count++;
                    break;
                case 5:
                    showElements(arr,count);
                    break;
                case 6:
                    System.exit(0);
            }

        }

    }

    private static void showElements(int[] arr, int count) {
        if(count == 0){
            System.out.println("[]");
            return;
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void addElement(int[] arr, int count, int ele) {
        arr[count] = ele;
    }


}
