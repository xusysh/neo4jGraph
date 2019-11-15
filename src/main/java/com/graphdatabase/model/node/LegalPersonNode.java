package com.graphdatabase.model.node;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * 节点-法人
 */
@Getter
@Setter
@NodeEntity(label = "LegalPerson")
public class LegalPersonNode {

    @Id
    @GeneratedValue
    private Long Id;

    //法人姓名
    @Property(name = "lname")
    private String lname;
}
