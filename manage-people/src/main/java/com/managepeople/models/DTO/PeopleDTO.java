package com.managepeople.models.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PeopleDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("birthDay")
    private Long birthDay;
    private String image;
    @JsonProperty("note")
    private String note;
    @JsonProperty("status")
    private boolean status;
}
