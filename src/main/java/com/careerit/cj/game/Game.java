package com.careerit.cj.game;

public abstract class Game {

    public void start() {
        System.out.println(this.getClass().getSimpleName() + " game is started");
    }

    public abstract void play();

    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " game is stopped");
    }

}
