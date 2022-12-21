package com.managepeople.interfaces;

import com.managepeople.models.DTO.PeopleDTO;
import com.managepeople.models.People;

import java.util.List;
import java.util.Optional;

public interface IPeopleService extends IBaseService<People> {
    public List<PeopleDTO> findAll() throws CloneNotSupportedException;
    public Optional<PeopleDTO> findPeopleById(Long id);
}
