package com.careerit.cj.day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class DiceGame {

    public static void main(String[] args) {

        int generatedNum = ThreadLocalRandom.current().nextInt(1, 7);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number (1-6) :");
        int guessedNum = sc.nextInt();

        if (generatedNum == guessedNum) {
            System.out.println("You guessed number, Great");
        } else {
            System.out.println("Wrong guess, the number is " + generatedNum);
        }


    }
}
