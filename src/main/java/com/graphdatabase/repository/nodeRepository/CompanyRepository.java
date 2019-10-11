package com.graphdatabase.repository.nodeRepository;

import com.graphdatabase.entity.nodeEntity.CompanyNode;
import com.graphdatabase.entity.nodeEntity.MemberNode;
import com.graphdatabase.entity.relationEntity.*;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by twinkleStar on 2019/10/11.
 */
@Repository
public interface CompanyRepository extends Neo4jRepository<CompanyNode,Long> {


    @Query("MATCH (node:Company) RETURN node")
    List<CompanyNode> findAllCompanyNode();

    @Query("match p=(a:Company) - [r:route_cc] -> (b:Company) "+
            "return p")
    List<CompanyToCompany> findCompanyToCompany();

    @Query("match p=(a:Company) - [r:route_cm] -> (b:Member) "+
            "return p")
    List<CompanyToMember> findCompanyToMember();
}
