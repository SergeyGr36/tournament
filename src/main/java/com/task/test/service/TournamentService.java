package com.task.test.service;

import com.task.test.dto.ParticipantDto;
import com.task.test.dto.TournamentDto;


public interface TournamentService {

    TournamentDto create(int maxParticipants);

    TournamentDto getById(Long id);

    TournamentDto addParticipantIntoTournamentById(Long tournamentId);

    boolean removeParticipantFromTournament(ParticipantDto participantDto);

    void startTournament(Long id);
}
