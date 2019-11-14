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
@RelationshipEntity(type = "com_to_single")
public class CompanyToPerson {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private CompanyNode startNode;

    @EndNode
    private PersonNode endNode;

    //累计交易金额
    @Property(name = "transMoney")
    private Double transMoney;

    //交易笔数
    @Property(name = "transNum")
    private int transNum;

    //交易笔均
    @Property(name = "transAvg")
    private int transAvg;

    //累计交易净额
    @Property(name = "transSum")
    private Double transSum;
}
