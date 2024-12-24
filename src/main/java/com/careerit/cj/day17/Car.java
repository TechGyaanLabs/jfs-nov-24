package com.careerit.cj.day17;

public class Car extends AbstractGame implements Game{

    @Override
    public void play() {
        System.out.println("You are playing car game, please wear seat belt");
    }

}
