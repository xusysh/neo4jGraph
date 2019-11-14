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

//他行私人用户
@Getter
@Setter
@NodeEntity(label="Single")
public class PersonNode {

    @Id
    @GeneratedValue
    private Long Id;

    @Property(name = "pname")
    private String pname;

    //交易对手行别
    @Property(name = "pBankName")
    private int pBankName;

    //交易对手账号
    @Property(name = "pBankAccount")
    private String pBankAccount;
}
