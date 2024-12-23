package com.careerit.cj.game;

public enum GameEnum {
    SHIP(3), BIKE(1), CAR(2);

    final int num;
    GameEnum(int num) {
        this.num = num;
    }

    public static GameEnum valueOf(int num) {
        for(GameEnum gameEnum : values()) {
            if(gameEnum.num == num) {
                return gameEnum;
            }
        }
        throw new IllegalArgumentException("Invalid number : "+num);
    }

}
