package com.careerit.cj.day5;

public class BreakAndContinueExample {

    public static void main(String[] args) {

       /* for (int i = 1; i <= 10; i++) {
            if(i % 3 == 0 ){
                break;
            }
            System.out.println(i);
        }*/

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }


        for (int i = 2; i <= 20; i++) {
            if (i % 9 == 0) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
