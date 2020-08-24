package com.task.test.service;

import com.task.test.dto.ParticipantDto;

import java.util.List;

public interface ParticipantService {
    ParticipantDto getParticipantById(Long id);
    List<ParticipantDto> getAllParticipants();
    ParticipantDto createParticipant(ParticipantDto participantDto);
    void deleteParticipantById(Long id);
}
