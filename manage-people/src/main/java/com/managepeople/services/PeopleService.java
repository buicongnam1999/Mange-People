package com.managepeople.services;

import com.managepeople.models.mapper.PeopleMapper;
import com.managepeople.models.DTO.PeopleDTO;
import com.managepeople.models.People;
import com.managepeople.interfaces.IPeopleService;
import com.managepeople.repository.IPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PeopleService implements IPeopleService {
    @Autowired
    private IPeopleRepository peopleRepository;
    private PeopleMapper peopleMapper;

    @Override
    public boolean append(People people) {
        // check exist People
        
        return false;
    }

    @Override
    public boolean update(People people) throws CloneNotSupportedException {
        // check exist People
        Long id = people.getId();
        if (!Objects.isNull(id) && id > 0) {
            Optional<People> optionalPeople = peopleRepository.findById(id);
            if (optionalPeople.isPresent()) {
                People peopleValue;
                peopleValue = (People) people.clone();
                peopleRepository.save(peopleValue);
                System.out.println(peopleValue);

                return true;
            }
        } else {
            throw new NullPointerException("Id people is null. " + people);
        }
        
        return false;
    }

    @Override
    public boolean delete(People people) {
        Long id = people.getId();
        if (!Objects.isNull(id) && id > 0) {
            Optional<People> optionalPeople = peopleRepository.findById(id);
            if (optionalPeople.isPresent()) {
                People peopleValue = optionalPeople.get();
                peopleValue.setStatus(0);

                return true;
            }
        } else {
            throw new NullPointerException("Id people is null. " + people);
        }

        return false;
    }

    @Override
    public List<PeopleDTO> findAll() throws CloneNotSupportedException {
        long count = peopleRepository.count();

        if (count != 0) {
            List<People> peoples = peopleRepository.findAll();
            List<PeopleDTO> peopleDTOS = new ArrayList<>();
            for (People people: peoples) {
                PeopleDTO peopleDTO = peopleMapper.mapPeopleToPeopleDTO(people);
                peopleDTOS.add(peopleDTO);
            }
            return peopleDTOS;
        }

        return Collections.emptyList();
    }

    @Override
    public Optional<PeopleDTO> findPeopleById(Long id) {
        return Optional.empty();
    }
}
