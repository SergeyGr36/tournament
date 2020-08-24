package com.task.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDto {
    private Long id;
    @NotNull
    private String nickName;
    @NotNull
    private boolean inGame;
}
