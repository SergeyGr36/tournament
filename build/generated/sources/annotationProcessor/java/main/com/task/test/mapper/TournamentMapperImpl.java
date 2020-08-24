package com.task.test.mapper;

import com.task.test.dto.TournamentDto;
import com.task.test.entity.Tournament;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-24T14:15:59+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Private Build)"
)
@Component
public class TournamentMapperImpl implements TournamentMapper {

    @Override
    public TournamentDto toDto(Tournament tournament) {
        if ( tournament == null ) {
            return null;
        }

        TournamentDto tournamentDto = new TournamentDto();

        tournamentDto.setId( tournament.getId() );
        tournamentDto.setMaxParticipants( tournament.getMaxParticipants() );
        tournamentDto.setGameCount( tournament.getGameCount() );

        return tournamentDto;
    }

    @Override
    public Tournament toEntity(TournamentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Tournament tournament = new Tournament();

        tournament.setId( dto.getId() );
        tournament.setMaxParticipants( dto.getMaxParticipants() );
        tournament.setGameCount( dto.getGameCount() );

        return tournament;
    }
}
