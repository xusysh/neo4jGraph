package com.graphdatabase.repository.nodeRepository;

import com.graphdatabase.entity.nodeEntity.PersonNode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by twinkleStar on 2019/10/10.
 */

@Mapper
@Repository
public interface PersonRepository extends Neo4jRepository<PersonNode,Long> {

//    @Query("MATCH ({n}:user) RETURN n limit 1")
//    PersonNode getUserNodeList(String n);
//
//    @Query("create ({q}:qser{age:{age},name:{name}}) RETURN {q} ")
//    List<PersonNode> addUserNodeList(@Param("name") String name, @Param("age")int age, @Param("q")String q);
//
//    @Query("match (node1:ALabel)-[r:relation_test{date:\"AB\",price:20}]->(node2:BLabel)\n" +
//            "RETURN node1,r,node2")
//    List<Map<String,Object>> findResult();


    @Query("MATCH (node1:BLabel) RETURN node1")
    List<PersonNode> findNodeTest();


    @Query("MATCH (node1:ALabel),(node2:BLabel) RETURN node1,node2")
    List<Map<String,Object>> findNodeTest2();

}
