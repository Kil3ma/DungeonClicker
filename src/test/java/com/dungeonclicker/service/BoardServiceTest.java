package com.dungeonclicker.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    void getBoardDependsOnLevel() {
        var board = boardService.getBoardDependsOnLevel(2);
        assertEquals(4, board.getSquares().length);
        var board1 = boardService.getBoardDependsOnLevel(3);
        assertEquals(4, board1.getSquares().length);
        var board2 = boardService.getBoardDependsOnLevel(4);
        assertEquals(5, board2.getWidth());

    }
}