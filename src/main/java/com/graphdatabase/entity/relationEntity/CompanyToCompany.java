package com.graphdatabase.entity.relationEntity;

import com.graphdatabase.entity.nodeEntity.CompanyNode;
import com.graphdatabase.entity.nodeEntity.PersonNode;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

/**
 * Created by twinkleStar on 2019/10/11.
 */

@Setter
@Getter
@RelationshipEntity(type = "route_cc")
public class CompanyToCompany {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private CompanyNode startNode;

    @EndNode
    private CompanyNode endNode;

    @Property(name = "num")
    private int num;
}
