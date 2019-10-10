package com.graphdatabase.entity.nodeEntity;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by twinkleStar on 2019/10/10.
 */

@Getter
@Setter
@NodeEntity(label="ALabel")
public class PersonANode {

    @Id
    @GeneratedValue
    private Long Id;

    @Property(name = "name")
    private String name;

    @Property(name = "num")
    private int num;

    @Property(name = "location")
    private String location;
}
