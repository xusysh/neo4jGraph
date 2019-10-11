package com.graphdatabase.repository.nodeRepository;

import com.graphdatabase.entity.nodeEntity.MemberNode;
import com.graphdatabase.entity.nodeEntity.PersonNode;
import com.graphdatabase.entity.relationEntity.MemberToCompany;
import com.graphdatabase.entity.relationEntity.MemberToMember;
import com.graphdatabase.entity.relationEntity.PersonRelation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * Created by twinkleStar on 2019/10/11.
 */
public interface MemberRepository extends Neo4jRepository<MemberNode,Long> {

    @Query("MATCH (node:Member) RETURN node")
    List<MemberNode> findAllMemberNode();

    @Query("match p=(a:Member) - [r:route_mm] -> (b:Member) "+
            "return p")
    List<MemberToMember> findMemberToMember();

    @Query("match p=(a:Member) - [r:route_mc] -> (b:Company) "+
            "return p")
    List<MemberToCompany> findMemberToCompany();
}
