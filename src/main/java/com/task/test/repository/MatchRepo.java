package com.task.test.repository;

import com.task.test.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepo extends JpaRepository<Match, Long> {
}
