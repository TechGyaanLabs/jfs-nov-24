package com.careerit.cj.game;

import com.careerit.cj.day10.one.C;

import java.util.Scanner;

public class GameManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Car");
            System.out.println("2. Ship");
            System.out.println("3. Bike");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            int num = sc.nextInt();
            if (num == 4) {
                System.out.println("Thanks for playing the game");
                break;
            }
            GameEnum gameEnum = GameEnum.valueOf(num);
            Game game = chooseGame(gameEnum);
            game.start();
            game.play();
            game.stop();
        }

    }

    private static Game chooseGame(GameEnum gameEnum) {
        return switch (gameEnum) {
            case CAR -> new Car();
            case SHIP -> new Ship();
            case BIKE -> new Bike();
        };
    }
}
