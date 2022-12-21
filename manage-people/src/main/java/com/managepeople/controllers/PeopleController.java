package com.managepeople.controllers;

import com.managepeople.interfaces.IBaseController;
import com.managepeople.models.ResponseObject;
import com.managepeople.repository.IPeopleRepository;
import com.managepeople.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "api/v1/people")
public class PeopleController implements IBaseController<IPeopleRepository> {
    @Autowired
    private PeopleService peopleService;

    @GetMapping(value = "list-people")
    @Override
    public ResponseEntity<ResponseObject> getAll() {
        try {
            return new ResponseEntity<>(new ResponseObject(true, "", peopleService.findAll()), HttpStatus.OK);
        } catch (CloneNotSupportedException ex) {
            return new ResponseEntity<>(new ResponseObject(true, "Get fail", ""), HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<ResponseObject> getByPage(int page) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> update(IPeopleRepository iPeopleRepository) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> create(IPeopleRepository iPeopleRepository) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> delete(IPeopleRepository iPeopleRepository) {
        return null;
    }
}
