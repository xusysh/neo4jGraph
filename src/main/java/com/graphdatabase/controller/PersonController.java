package com.graphdatabase.controller;

import com.graphdatabase.dao.PersonMapper;
import com.graphdatabase.model.Test.Path;
import com.graphdatabase.model.node.PersonNode;
import com.graphdatabase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/all")
    public Map<String,Object> getPersonNode() {

        PersonNode personNode = personService.getPersonById(1);
        List<Path> path = personService.getPath();
        List<PersonNode> personNodes = personService.getAllPersons();

        Map<String,Object> obj=new HashMap<>();
        obj.put("persons:",personNodes);
        return obj;
    }

}
