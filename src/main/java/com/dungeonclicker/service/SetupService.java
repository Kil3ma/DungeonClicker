package com.dungeonclicker.service;

import com.dungeonclicker.model.Board;
import com.dungeonclicker.model.Mouse;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SetupService {

    private final BoardService boardService;
    public SetupService(BoardService boardService) {
        this.boardService = boardService;
    }
    public Board setup(int level){
        Board board = boardService.getBoardDependsOnLevel(level);
        Mouse mouse = new Mouse(10, board.getRandomEmptySquare().orElse(board.getRandomNotExit()));
        board.setTile(mouse);
        return board;
    }
}
