package com.duy.thesisManagement.thesis.dto;


import lombok.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouncilCreationDTO {
    private String name;
    private Integer facultyId;
}
