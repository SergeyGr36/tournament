package com.task.test.service.impl;

import com.task.test.dto.ParticipantDto;
import com.task.test.exception.ResourceNotFoundException;
import com.task.test.mapper.ParticipantMapper;
import com.task.test.repository.ParticipantRepo;
import com.task.test.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {

    private final transient ParticipantRepo participantRepo;
    private final transient ParticipantMapper participantMapper;


    @Override
    public ParticipantDto getParticipantById(Long id) {
        return participantMapper.toDto(participantRepo.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    @Override
    public List<ParticipantDto> getAllParticipants() {
        return participantMapper.toParticipantDto(participantRepo.findAll());
    }

    @Override
    public ParticipantDto createParticipant(ParticipantDto participantDto) {
        return participantMapper.toDto(participantRepo.saveAndFlush(participantMapper.toParc(participantDto)));
    }

    @Override
    public void deleteParticipantById(Long id) {
        participantRepo.deleteById(id);
    }
}
