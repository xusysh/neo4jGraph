package com.graphdatabase.entity.relationEntity;

import com.graphdatabase.entity.nodeEntity.PersonNode;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

/**
 * Created by twinkleStar on 2019/10/10.
 */

@Setter
@Getter
@RelationshipEntity(type = "relation_test")
public class PersonRelation {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PersonNode startNode;

    @EndNode
    private PersonNode endNode;

    @Property(name = "date")
    private String date;

    @Property(name = "price")
    private String price;


}
