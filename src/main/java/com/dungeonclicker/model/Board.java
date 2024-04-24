package com.dungeonclicker.model;

public class Board {

    private int width;
    private int length;
    private Square[][] square;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Square[][] getSquare() {
        return square;
    }

    public void setSquare(Square[][] square) {
        this.square = square;
    }
}
