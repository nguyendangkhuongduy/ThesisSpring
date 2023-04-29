package com.duy.thesisManagement.thesis.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TopicDTO {
    private Integer id;
    private String userId;
    private String name;
    private String fileTopic;
}
