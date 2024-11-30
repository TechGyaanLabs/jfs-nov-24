package com.careerit.cj.day6;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

            int random = (int)(Math.random() * 6) + 1;

        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("Enter the number between 1-6 : ");
            int num = sc.nextInt();
            if(num == random){
                System.out.println("You won the game");
                break;
            }else{
                System.out.println("Try again");
            }
        }
    }
}
