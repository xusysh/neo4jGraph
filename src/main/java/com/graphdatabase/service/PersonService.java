package com.graphdatabase.service;

import com.graphdatabase.dao.PersonMapper;
import com.graphdatabase.model.Test.Path;
import com.graphdatabase.model.node.PersonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class PersonService {


    @Autowired
    PersonMapper personMapper;


    public List<PersonNode> getAllPersons() {
        return  personMapper.getAllPersons();
    }

    public PersonNode getPersonById(long id) {
        return  personMapper.getPersonById(id);
    }

    public List<Path> getPath() {
        return  personMapper.getPath();
    }

}
