package com.task.test.entity;

import com.task.test.validation.MultipleOfEight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @MultipleOfEight
    @Positive
    private int maxParticipants;

    private int gameCount;

    @OneToMany
    @JoinColumn(name = "tournament_id")
    private Set<Participant> participants;

    @OneToMany
    private List<Match> matches;
}
