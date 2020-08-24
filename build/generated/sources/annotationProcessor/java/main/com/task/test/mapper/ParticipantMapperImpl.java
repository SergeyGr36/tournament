package com.task.test.mapper;

import com.task.test.dto.ParticipantDto;
import com.task.test.entity.Participant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-24T14:15:59+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Private Build)"
)
@Component
public class ParticipantMapperImpl implements ParticipantMapper {

    @Override
    public List<ParticipantDto> toParticipantDto(List<Participant> participants) {
        if ( participants == null ) {
            return null;
        }

        List<ParticipantDto> list = new ArrayList<ParticipantDto>( participants.size() );
        for ( Participant participant : participants ) {
            list.add( toDto( participant ) );
        }

        return list;
    }

    @Override
    public Participant toParc(ParticipantDto dto) {
        if ( dto == null ) {
            return null;
        }

        Participant participant = new Participant();

        participant.setId( dto.getId() );
        participant.setNickName( dto.getNickName() );
        participant.setInGame( dto.isInGame() );

        return participant;
    }

    @Override
    public ParticipantDto toDto(Participant participant) {
        if ( participant == null ) {
            return null;
        }

        ParticipantDto participantDto = new ParticipantDto();

        participantDto.setId( participant.getId() );
        participantDto.setNickName( participant.getNickName() );
        participantDto.setInGame( participant.isInGame() );

        return participantDto;
    }
}
