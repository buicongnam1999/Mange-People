package com.example.demoABCD;

import com.example.demoABCD.models.DTO.PeopleDTO;
import com.example.demoABCD.models.People;
import com.example.demoABCD.services.PeopleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;


@SpringBootTest
public class TestPeople {
    @Autowired
    private PeopleService peopleService;

    @Test
    public void testGetPeopleStatusIsTrue() throws Exception {
        try {
            List<PeopleDTO> peopleList = peopleService.findAll();
            for (PeopleDTO people : peopleList
            ) {
                System.out.println(people);
            }
        } catch (CloneNotSupportedException ex) {
            throw new Exception("Clone fail");
        }

    }

    @Test
    public void testSelectPeople() throws Exception {
        List<PeopleDTO> all = peopleService.findAll();
        if (!all.isEmpty()) {
            System.out.println(all.size());
        } else {
            throw new Exception("List is empty");
        }
    }

    @Test
    public void testValueObject() throws Exception {
        People people = new People();
        people.setId(1L);
        people.setFirstName("Nam");
        people.setLastName("Bui");
        people.setBirthDay(2000L);
        Class<Long> longClass = Long.class;
        Class<People> peopleClass = People.class;
        Method getId = peopleClass.getDeclaredMethod("getId");
        getId.setAccessible(true);
        Object invoke = getId.invoke(people);
        if (!Objects.isNull(invoke)) {
            System.out.println(invoke);
        } else {
            throw new IllegalAccessException("Value is Null");
        }
    }

    @Test
    void testUpdatePeople() throws CloneNotSupportedException {
        People people = new People();
        people.setId(1L);
        people.setFirstName("ABC");
        people.setLastName("123");
        people.setBirthDay(2000L);
        List<PeopleDTO> peopleList = peopleService.findAll();
        for (PeopleDTO people1 : peopleList) {
            System.out.println(people1.toString());
        }
        boolean update = peopleService.update(people);
        if (update) {
            System.out.println("Update success");
        } else {
            throw new CloneNotSupportedException("Value is Null");
        }
    }
}
