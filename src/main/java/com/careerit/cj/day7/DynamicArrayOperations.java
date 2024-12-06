package com.careerit.cj.day7;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayOperations {


    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("\n1. Add 2. Delete 3.Update 4.Search 5.Display 6.Exit\n");
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to add :");
                    int ele = sc.nextInt();
                    arr = addElement(arr, count, ele);
                    count++;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Enter the element to search :");
                    int se = sc.nextInt();
                    int index = searchElement(arr, count, se);
                    if (index >= 0) {
                        System.out.println("Element found at index :" + index);
                    } else {
                        System.out.println("Element not found");
                    }
                case 5:
                    showElements(arr, count);
                    break;
                case 6:
                    System.exit(0);
            }

        }

    }

    private static int searchElement(int[] arr, int count, int se) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (arr[i] == se) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static void showElements(int[] arr, int count) {
        System.out.println("Total elements are :" + count);
        if (count == 0) {
            System.out.println("[]");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] addElement(int[] arr, int count, int ele) {
        if (count >= arr.length) {
            int[] temp = new int[arr.length + 10];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[count] = ele;
        return arr;
    }

}
