package com.graphdatabase.repository.nodeRepository;

import com.graphdatabase.entity.nodeEntity.StudentNode;
import com.graphdatabase.entity.relationEntity.FriendshipRelation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface StudentRepository extends Neo4jRepository<StudentNode,Long> {
    /**
     * 通过name查找学生node
     * @param name
     * @return
     */
    StudentNode findByName(String name);

    /**
     * 根据name获取学生 in 友谊关系
     * @param name
     * @return
     */
    @Query("match " +
            "p=(a:StudentNode) - [r:FRIENDSHIP_RELATION*0..] -> (b:StudentNode) " +
            "where b.name = {0} " +
            "return p limit 25")
    List<FriendshipRelation> inFriendship(String name);

    /**
     * 根据name获取学生 out 友谊关系
     * @param name
     * @return
     */
    @Query("match " +
            "p=(b:StudentNode) - [rr:FRIENDSHIP_RELATION*0..] -> (c:StudentNode) " +
            "where b.name = {0} " +
            "return p limit 25")
    List<FriendshipRelation> outFriendship(String name);

    /**
     * 根据name获取学生 both 友谊关系
     * @param name
     * @return
     */
    @Query("match " +
            "p=(a:StudentNode) <- [r:FRIENDSHIP_RELATION*0..] -> (b:StudentNode) <- [rr:FRIENDSHIP_RELATION*0..] -> (c:StudentNode) " +
            "where b.name = {0} " +
            "return p limit 25")
    List<FriendshipRelation> bothFriendship(String name);

}
