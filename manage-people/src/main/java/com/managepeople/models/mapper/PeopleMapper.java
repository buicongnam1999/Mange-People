package com.managepeople.models.mapper;

import com.managepeople.models.DTO.PeopleDTO;
import com.managepeople.models.People;

import java.util.Objects;

public class PeopleMapper {
    public static PeopleDTO mapPeopleToPeopleDTO(People people) {
        if (Objects.isNull(people)) {
            return null;
        }
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setId(people.getId());
        peopleDTO.setImage(people.getImage());
        peopleDTO.setBirthDay(people.getBirthDay());
        peopleDTO.setFirstName(people.getFirstName());
        peopleDTO.setLastName(people.getLastName());
        peopleDTO.setNote(people.getNote());
        if (people.getStatus() == 1) {
            peopleDTO.setStatus(true);
        } else {
            peopleDTO.setStatus(false);
        }

        return peopleDTO;
    }
}
