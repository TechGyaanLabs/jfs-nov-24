package com.careerit.cj.day9;

public class StringBuilderExample2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.toString().equals(sb2.toString()));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Krishna");
        System.out.println(sb);
        StringBuilder sb3 = new StringBuilder("Arif");
        sb3.reverse();
        System.out.println(sb3);
    }

    public static boolean isPalindrome(String str) {
    	return new StringBuilder(str).reverse().toString().equals(str);
    }
}
