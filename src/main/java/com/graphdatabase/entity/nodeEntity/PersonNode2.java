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
public class PersonNode2 {

    private Long Id;

    private String name;

    private int num;

    private String location;
}
