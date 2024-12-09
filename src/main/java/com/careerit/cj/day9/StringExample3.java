package com.careerit.cj.day9;

public class StringExample3 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("nitin"));
        System.out.println(isPalindrome("hello"));
    }

    private static boolean isPalindrome(String str){
        for(int i=0,j=str.length()-1;i < j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
