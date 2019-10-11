package com.graphdatabase.entity.relationEntity;

import com.graphdatabase.entity.nodeEntity.MemberNode;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

/**
 * Created by twinkleStar on 2019/10/11.
 */

@Setter
@Getter
@RelationshipEntity(type = "route_mm")
public class MemberToMember {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private MemberNode startNode;

    @EndNode
    private MemberNode endNode;

    @Property(name = "num")
    private int num;

}
