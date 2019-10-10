package com.graphdatabase.service;

/**
 * Created by twinkleStar on 2019/10/10.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.graphdatabase.entity.nodeEntity.PersonNode2;
import com.graphdatabase.entity.relationEntity.PersonRelation;
import com.graphdatabase.repository.relationRepository.PersonRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphdatabase.entity.nodeEntity.PersonNode;
import com.graphdatabase.repository.nodeRepository.PersonRepository;

@Service
public class PersonNeo4jService {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonRelationRepository personRelationRepository;


    public List<PersonNode> getPersonNodeList() {
        List<PersonNode> personNodes=personRepository.findNodeTest();
        return personNodes;
    }


    public List<Map<String,Object>> getPersonNodeList2() {
        List<Map<String,Object>> personNodes=personRepository.findNodeTest2();
        return personNodes;
    }

    public List<PersonRelation> getPersonRelationList() {
        List<PersonRelation> personRelations=personRelationRepository.findRelationTest();
        return personRelations;
    }

//    public List<PersonRelation> getPersonRelationList2() {
//        List<PersonRelation> personRelations=personRelationRepository.findRelationTest2();
//        return personRelations;
//    }
}
