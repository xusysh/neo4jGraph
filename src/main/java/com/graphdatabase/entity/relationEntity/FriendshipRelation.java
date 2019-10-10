package com.graphdatabase.entity.relationEntity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.graphdatabase.entity.nodeEntity.StudentNode;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@RelationshipEntity(type = "FRIENDSHIP_RELATION")
public class FriendshipRelation {

    @Id
    @GeneratedValue
    private Long id;

//    @JsonBackReference
    @StartNode
    private StudentNode from;

//    @JsonBackReference
    @EndNode
    private StudentNode to;
}

