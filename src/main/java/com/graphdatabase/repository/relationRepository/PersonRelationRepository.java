package com.graphdatabase.repository.relationRepository;

import com.graphdatabase.entity.relationEntity.PersonRelation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by twinkleStar on 2019/10/10.
 */
@Mapper
@Repository
public interface PersonRelationRepository extends Neo4jRepository<PersonRelation,Long> {

    @Query("match (node1:ALabel)-[r:relation_test]->(node2:BLabel)\n" +
            "RETURN r")
    List<PersonRelation> findRelationTest();

}
