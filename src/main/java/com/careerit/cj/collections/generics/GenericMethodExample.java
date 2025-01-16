package com.careerit.cj.collections.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericMethodExample {

    public static <T> void printElements(T[] arr){
        for(T ele:arr){
            System.out.println(ele);
        }
    }

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        String[] arr1 = new String[]{"Krish","Manoj","Charan"};
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        printElements(arr1);
        System.out.println();
        printElements(arr2);

        List<String> strList = fromArrayToList(arr1);
        System.out.println(strList);

        List<Integer> intList = fromArrayToList(arr2);
        System.out.println(intList);

    }
}
