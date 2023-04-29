package com.duy.thesisManagement.thesis.model;


import com.duy.thesisManagement.thesis.dto.TopicDTO;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class TopicResponse {
    List<TopicDTO> topic;
}
