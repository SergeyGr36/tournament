package com.task.test.mapper;

import com.task.test.dto.ParticipantDto;
import com.task.test.entity.Participant;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParticipantMapper {
    List<ParticipantDto> toParticipantDto(List<Participant> participants);
    Participant toParc(ParticipantDto dto);
    ParticipantDto toDto(Participant participant);

}
