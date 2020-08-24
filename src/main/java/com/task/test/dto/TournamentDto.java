package com.task.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
public class TournamentDto {
    private Long id;
    private int maxParticipants;
    private int gameCount;
}
