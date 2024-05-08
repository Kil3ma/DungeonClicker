package com.dungeonclicker.model;

import com.dungeonclicker.model.enums.SquareType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Board {

    private int width;
    private int length;
    private Square[][] squares;

    public Board (){
        this.width = 3;
        this.length = 3;
        this.squares = new Square[this.width][this.length];
        setExit();
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
    public Optional<Square> getRandomEmptySquare() {
         List<Square> emptySquares = new ArrayList<>();
         for (Square[] row: this.squares) {
             for (Square square : row) {
                 if (SquareType.EMPTY.equals(square.getSquareType())) {
                     emptySquares.add(square);
                 }
             }
         }
         if(emptySquares.isEmpty()){
             return Optional.empty();
         }
         return Optional.of(emptySquares.get(randomNumber(0, emptySquares.size())));
    }

    public Square getRandomNotExit() {
        List<Square> notExitSquares = new ArrayList<>();
        for (Square[] row: this.squares) {
            for (Square square : row) {
                if (!SquareType.EXIT.equals(square.getSquareType())) {
                    notExitSquares.add(square);
                }
            }
        }
        return notExitSquares.get(randomNumber(0, notExitSquares.size()));
    }
    public void setTile(Square tileToReplace){
        int x = tileToReplace.getX();
        int y = tileToReplace.getY();
        squares[x][y] = tileToReplace;
    }

    private int randomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    private void setExit(){
        int x = randomNumber(0, width - 1);
        int y = randomNumber(0, length - 1);
        Square squareToTake = squares[x][y];
        squares[x][y] = new Exit(squareToTake);
    }
}
