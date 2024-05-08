package com.dungeonclicker.model;

import com.dungeonclicker.model.enums.SquareType;

public class Exit extends Square{
    public Exit(Square squareToTake) {
        setPosition(squareToTake);
        setSquareType(SquareType.EXIT);
    }
}
