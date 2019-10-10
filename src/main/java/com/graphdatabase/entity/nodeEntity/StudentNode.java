package com.graphdatabase.entity.nodeEntity;


import com.graphdatabase.entity.relationEntity.FriendshipRelation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NodeEntity
public class StudentNode {

    @Id
    @GeneratedValue
    private Long id;
    /**
     * 属性，name
     */
    private String name;
    /**
     * 关系，定义为友谊
     */
    @Relationship(type = "FRIENDSHIP_RELATION")
    private List<FriendshipRelation> friendshipRelationList;
    /**
     * 添加友谊的关系
     * @param friendshipRelation
     */
    public void addRelation(FriendshipRelation friendshipRelation){
        if(this.friendshipRelationList == null){
            this.friendshipRelationList = new ArrayList<>();
        }
        this.friendshipRelationList.add(friendshipRelation);
    }

}
