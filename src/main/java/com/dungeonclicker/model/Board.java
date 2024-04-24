package com.dungeonclicker.model;

public class Board {

    private int width;
    private int length;
    private Square[][] squares;

    public Board (){
        this.width = 3;
        this.length = 3;
        this.squares = new Square[this.width][this.length];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        this.squares = new Square[this.width][this.length];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        this.squares = new Square[this.width][this.length];
    }

    public Square[][] getSquares() {
        return squares;
    }

}
