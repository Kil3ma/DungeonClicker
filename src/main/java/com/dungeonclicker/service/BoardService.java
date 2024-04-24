package com.dungeonclicker.service;

import com.dungeonclicker.model.Board;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public Board getBoardDependsOnLevel (int level){
        Board board = new Board();
        if(level % 2 == 0){
            board.setLength(board.getLength() + level/2);
            board.setWidth(board.getWidth() + level/2);
        }
        else{
            return getBoardDependsOnLevel(level - 1);
        }
        return board;
    }

}
