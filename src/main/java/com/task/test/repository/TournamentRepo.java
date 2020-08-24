package com.task.test.repository;

import com.task.test.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TournamentRepo extends JpaRepository<Tournament, Long> {

    @Query(value = "update participant set in_game=true, tournament_id=:id" +
            "where in_game = false", nativeQuery = true)
    @Modifying
    @Transactional
    void addParticipantIntoTournamentById(@Param("participantId") Long id); //@Param("tournamentId") Long tournamentId,

    @Query(value = "update participant p set in_game=false"
            +
            "where p.participant.id = :id", nativeQuery = true)
    @Modifying
    @Transactional
    void removeParticipantFromTournamentById(@Param("id") Long id);

}
