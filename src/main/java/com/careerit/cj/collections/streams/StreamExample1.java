package com.careerit.cj.collections.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        // Collect all the numbers which are divisible by 5 and 3

        /*List<Integer> divisibleBy5And3 = new ArrayList<>();

        for(int ele:list){
            if(ele % 5 == 0 && ele % 3 == 0){
                divisibleBy5And3.add(ele);
            }
        }*/

        List<Integer> divisibleBy5And3 =
                list.stream()
                        .filter(num -> num % 5 == 0 && num % 3 == 0)
                        .toList();
        System.out.println(divisibleBy5And3);


        // Collect all the numbers which are divisible by 3
        // Add 1 to each number
        // filter the number which are divisible by 5


        /*List<Integer> divisibleBy5 = new ArrayList<>();
        for(int ele:list){
            if(ele % 3 == 0){
                int res = ele + 1;
                if(res % 5 == 0){
                    divisibleBy5.add(res);
                }
            }
        }
        System.out.println(divisibleBy5);
        */

        List<Integer> divisibleBy5 = list.stream()
                .filter(num -> num % 3 == 0)
                .map(num -> num + 1)
                .filter(num -> num % 5 == 0)
                .toList();
        System.out.println(divisibleBy5);


        List<String> namesList = List.of("Krish", "Manoj", "John", "Anil", "Suresh", "Rajesh", "Charan");

       /* List<Integer> namesLength = new ArrayList<>();

        // Find the length of each name in the list whose starting letter is 'A' or end letter is 'h'

        for (String name : namesList) {
            if(name.charAt(0) == 'A' || name.charAt(name.length()-1) == 'h'){
                namesLength.add(name.length());
            }
        }*/

        List<Integer> namesLength = namesList.stream()
                .filter(name -> name.charAt(0) == 'A' || name.charAt(name.length()-1) == 'h')
                .map(String::length)
                .toList();
        System.out.println(namesLength);


    }
}
