package com.graphdatabase.model.Test;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class Path {

    @StartNode
    private Node member1_node;

    @EndNode
    private Node member2_node;

    @Property(name = "member_route")
    private Map<String,Object> member_route;


}
