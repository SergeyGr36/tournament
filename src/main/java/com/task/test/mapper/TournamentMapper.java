package com.task.test.mapper;

import com.task.test.dto.TournamentDto;
import com.task.test.entity.Tournament;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TournamentMapper {
    TournamentDto toDto (Tournament tournament);
    Tournament toEntity (TournamentDto dto);
}
