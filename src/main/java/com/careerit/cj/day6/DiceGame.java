package com.careerit.cj.day6;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 6) + 1;

        Scanner sc = new Scanner(System.in);
        int i = 1;
        do{
            System.out.println("Enter the number between 1-6 : ");
            int num = sc.nextInt();
            if (num == random) {
                System.out.println("You won the game");
                System.out.println("You guessed number : " + i + " attempts");
                break;
            } else {
                if(i == 3) {
                    System.out.println("You reached max number attempts, the number is : "+random);
                }else{
                    System.out.println("Try again");
                }
            }
            i++;
        }while(i<=3);
    }
}
