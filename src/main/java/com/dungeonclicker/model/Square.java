package com.dungeonclicker.model;

import com.dungeonclicker.model.enums.SquareType;

public class Square {
    private int x;
    private int y;
    private boolean revealed;
    private SquareType squareType = SquareType.EMPTY;

    public SquareType getSquareType() {
        return squareType;
    }

    public void setSquareType(SquareType squareType) {
        this.squareType = squareType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public void setPosition(Square square){
        setX(square.getX());
        setY(square.getY());
    }
}
