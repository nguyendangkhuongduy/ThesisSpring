package com.duy.thesisManagement.thesis.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreDetailRequestDTO {
    private Integer criteria_id;
    private Integer score_id;
    private Float mark;
}
