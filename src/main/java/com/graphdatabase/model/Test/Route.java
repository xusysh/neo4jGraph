package com.graphdatabase.model.Test;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;

@Setter
@Getter
public class Route {

    @Property(name = "num")
    private int num;

}
