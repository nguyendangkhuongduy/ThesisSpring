package com.duy.thesisManagement.thesis.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThesisCreationDTO {
    private String name;
    private Integer facultyId;
    private String year;
    private String semester;
    private String topic;
}
