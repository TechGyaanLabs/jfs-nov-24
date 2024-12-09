package com.careerit.cj.day9;

import java.util.List;

public class AssignmentString {

    public static void main(String[] args) {

        List<String> list = getPossibleWords("welcome", 3);
        System.out.println(list);

    }
    // "welcome" , n = 3 => [wel, elc, lco, com, ome]
    // "welcome" , n = 4 => [welc, elco, lcom, come]
    // "welcome" , n = 5 => [welco, elcom, lcome]
    private static List<String> getPossibleWords(String str,int n){
        return null;
    }

    // "John,Smith,Doe,King,Koch,Kumar" => ["JOHN","SMITH","DOE","KING","KOCH","KUMAR"]
    private static List<String> getNamesInUpperCase(String namesData){
        return null;
    }

    // ["madam","1234321","nitin","john","suresh","liril"] =>
    private static int countPalindromes(List<String> str){
        return 0;
    }
}
