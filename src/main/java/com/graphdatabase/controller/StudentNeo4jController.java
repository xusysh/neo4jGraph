package com.graphdatabase.controller;

/**
 * Created by twinkleStar on 2019/10/10.
 */

import com.graphdatabase.entity.relationEntity.FriendshipRelation;
import com.graphdatabase.repository.nodeRepository.StudentRepository;
import com.graphdatabase.service.StudentServiceImpl;
import com.graphdatabase.service.PersonNeo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentNeo4jController {

    @Autowired
    PersonNeo4jService personNeo4jService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentServiceImpl neo4jService;


    @GetMapping("/both")
    public List<FriendshipRelation> getNode() {
        List<FriendshipRelation> friendshipRelationList1 = studentRepository.bothFriendship("张1");
        return friendshipRelationList1;
    }

    @GetMapping("/in")
    public List<FriendshipRelation> getNode2() {
        List<FriendshipRelation> friendshipRelationList1 = studentRepository.inFriendship("张1");
        return friendshipRelationList1;
    }

    @GetMapping("/out")
    public List<FriendshipRelation> getRelation() {
        List<FriendshipRelation> friendshipRelationList1 = studentRepository.outFriendship("张1");
        return friendshipRelationList1;
    }


}
