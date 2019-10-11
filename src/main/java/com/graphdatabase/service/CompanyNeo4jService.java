package com.graphdatabase.service;

import com.graphdatabase.entity.nodeEntity.CompanyNode;
import com.graphdatabase.entity.nodeEntity.MemberNode;
import com.graphdatabase.entity.relationEntity.CompanyToCompany;
import com.graphdatabase.entity.relationEntity.CompanyToMember;
import com.graphdatabase.entity.relationEntity.PersonRelation;
import com.graphdatabase.repository.nodeRepository.CompanyRepository;
import com.graphdatabase.repository.nodeRepository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by twinkleStar on 2019/10/11.
 */

@Service
public class CompanyNeo4jService {

    @Autowired
    CompanyRepository companyRepository;

    public List<CompanyNode> getNodeList() {
        List<CompanyNode> companyNodes=companyRepository.findAllCompanyNode();
        return companyNodes;
    }

    public List<CompanyToCompany> getRelationList() {
        List<CompanyToCompany> companyToCompanies=companyRepository.findCompanyToCompany();
        return companyToCompanies;
    }


    public List<CompanyToMember> getRelationList2() {
        List<CompanyToMember> companyToMembers=companyRepository.findCompanyToMember();
        return companyToMembers;
    }
}
