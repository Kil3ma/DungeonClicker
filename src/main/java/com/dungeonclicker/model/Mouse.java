package com.dungeonclicker.model;

import com.dungeonclicker.model.enums.SquareType;

public class Mouse extends Square{

    private int health;

    public Mouse(int health, Square squareToTake){
        this.health = health;
        setPosition(squareToTake);
        setSquareType(SquareType.MOUSE);
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
