package com.graphdatabase.controller;

/**
 * Created by twinkleStar on 2019/10/11.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.graphdatabase.entity.nodeEntity.CompanyNode;
import com.graphdatabase.entity.nodeEntity.MemberNode;
import com.graphdatabase.entity.nodeEntity.PersonNode;
import com.graphdatabase.entity.relationEntity.*;
import com.graphdatabase.service.CompanyNeo4jService;
import com.graphdatabase.service.MemberNeo4jService;
import com.graphdatabase.service.PersonNeo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class MoneyRouteController {


    @Autowired
    MemberNeo4jService memberNeo4jService;

    @Autowired
    CompanyNeo4jService companyNeo4jService;

    @GetMapping("/all")
    public Map<String,Object> getNode() {

        List<CompanyNode> companyNodes = companyNeo4jService.getNodeList();
        List<CompanyToCompany> companyToCompanies = companyNeo4jService.getRelationList();
        List<CompanyToMember> companyToMembers = companyNeo4jService.getRelationList2();
        List<MemberNode> memberNodes = memberNeo4jService.getNodeList();
        List<MemberToMember> memberToMembers = memberNeo4jService.getRelationList();
        List<MemberToCompany> memberToCompanies = memberNeo4jService.getRelationList2();
        Map<String,Object> obj=new HashMap<>();
        obj.put("companyNode",companyNodes);
        obj.put("memberNode",memberNodes);
        obj.put("companyToCompany",companyToCompanies);
        obj.put("memberToMember",memberToMembers);
        obj.put("companyToMember",companyToMembers);
        obj.put("memberToCompany",memberToCompanies);
        return obj;
    }
}
