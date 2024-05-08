package com.dungeonclicker.controller;

import com.dungeonclicker.model.Board;
import com.dungeonclicker.service.SetupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/board")
public class BoardController {

    private final SetupService setupService;

    @GetMapping("/init/{level}")
    public Board getProjects(@PathVariable("level") int level) {
        return setupService.setup(level);
    }

}
