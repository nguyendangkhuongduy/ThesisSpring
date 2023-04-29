package com.duy.thesisManagement.thesis.model;

import com.duy.thesisManagement.thesis.dto.ScoreDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ScoreResponse {
    List<ScoreDTO> score;
}
