package com.task.test.controller;

import com.task.test.dto.ParticipantDto;
import com.task.test.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/participant")
@RequiredArgsConstructor
public class ParticipantController {
    private final transient ParticipantService participantService;

    @GetMapping("/{id}")
    public ParticipantDto getParticipantById(@PathVariable Long id) {
        return participantService.getParticipantById(id);
    }
    @GetMapping
    public List<ParticipantDto> getAllParticipant(){
        return participantService.getAllParticipants();
    }
    @PostMapping("/add")
    public ParticipantDto createParticipant(@RequestBody final ParticipantDto dto){
        return participantService.createParticipant(dto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteParticipant(@PathVariable Long id){
        participantService.deleteParticipantById(id);
        return ResponseEntity.ok("deleted successful");
    }
}
