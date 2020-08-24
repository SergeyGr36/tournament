package com.task.test.controller;

import com.task.test.dto.TournamentDto;
import com.task.test.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tournament")
@RequiredArgsConstructor
public class TournamentController {
    private final transient TournamentService service;

    @GetMapping("/{id}")
    public TournamentDto getTournamentById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping("/create/{participantsCount}")
    public TournamentDto createTournament(@PathVariable int participantsCount) {
        return service.create(participantsCount);
    }
    @PostMapping("/{id}")
    public TournamentDto addParticipantInto(@PathVariable Long id){
        return service.addParticipantIntoTournamentById(id);
    }
}
