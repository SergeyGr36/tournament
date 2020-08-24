package com.task.test.service.impl;

import com.task.test.dto.ParticipantDto;
import com.task.test.dto.TournamentDto;
import com.task.test.entity.Tournament;
import com.task.test.exception.ResourceNotFoundException;
import com.task.test.mapper.TournamentMapper;
import com.task.test.repository.TournamentRepo;
import com.task.test.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TournamentServiceImpl implements TournamentService {
    private final transient TournamentRepo repo;
    private final transient TournamentMapper mapper;
    private transient Tournament tournament;

    @Override
    public TournamentDto create(int maxParticipants) {
        tournament = new Tournament();
        tournament.setMaxParticipants(maxParticipants);
        tournament.setGameCount(getGameCount(maxParticipants));
        return mapper.toDto(repo.save(tournament));
    }

    @Override
    public TournamentDto getById(Long id) {
        return mapper.toDto(repo.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    @Override
    public TournamentDto addParticipantIntoTournamentById(Long tournamentId) {
        repo.addParticipantIntoTournamentById(tournamentId);
        return null;
    }

    @Override
    public boolean removeParticipantFromTournament(ParticipantDto participantDto) {
        return false;
    }

    @Override
    public void startTournament(Long id) {
        repo.findById(id).get();
    }

    private int getGameCount(int maxParticipants) {
        return maxParticipants - 1;
    }
}
