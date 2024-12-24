package com.careerit.cj.day17;

public class GameManager {


    public static void main(String[] args) {

        Game[] arr = new Game[]
                {new Car(),
                        new Bike(),
                        new Bike(),
                        new Car(),
                        new Ship(),
                        new Ship(),
                        new Bike(),
                        new Car()};
        for (Game game : arr) {
            game.start();
            game.play();
            game.stop();
            System.out.println("-------------------------------------------------");
        }
    }
}
