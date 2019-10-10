package com.graphdatabase.controller;

/**
 * Created by twinkleStar on 2019/10/10.
 */

import java.util.List;
import java.util.Map;

import com.graphdatabase.entity.nodeEntity.PersonNode;
import com.graphdatabase.entity.relationEntity.PersonRelation;
import com.graphdatabase.service.PersonNeo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonNeo4jController {

    @Autowired
    PersonNeo4jService personNeo4jService;


//    @RequestMapping(path = "/addUserNode", method = RequestMethod.GET)
//    public String addUserNode() {
//        int i = 0;
//        do {
//            PersonNode user = new PersonNode();
//            user.setAge(RandomUtils.nextInt(15, 40));
//            user.setName("Test" + RandomUtils.nextInt(1, 1000));
//            user.setUserId(UUID.randomUUID().toString());
//            user.setNodeId(RandomUtils.nextLong(1L, 999L));
//            String q="q"+i;
//            neo4jService.addUser(user,q);
//            i += 1;
//        } while (i < 20);
//
//        return "ok";
//    }

    @GetMapping("/node")
    public List<PersonNode> getNode() {
        return personNeo4jService.getPersonNodeList();
    }

    @GetMapping("/node2")
    public List<Map<String,Object>> getNode2() {
        return personNeo4jService.getPersonNodeList2();
    }

    @GetMapping("/relation")
    public List<PersonRelation> getRelation() {
        return personNeo4jService.getPersonRelationList();
    }


}
