package com.graphdatabase.entity.nodeEntity;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by twinkleStar on 2019/10/11.
 */


//关系链B节点
@Getter
@Setter
@NodeEntity(label="Institute")
public class CompanyBNode {

    @Id
    @GeneratedValue
    private Long Id;

    //客户名称
    @Property(name = "cname")
    private String cname;


    //存量客户管护权客户经理
    @Property(name = "custManagerName")
    private String custManagerName;

    //存量客户管护权客户经理电话
    @Property(name = "custManagerTel")
    private String custManagerTel;

    //=2，为他行客户
    @Property(name = "category")
    private int category;

    //存量客户管护权机构名称（精确到支行）
    @Property(name = "manageBranch")
    private String manageBranch;

    //工商注册地址
    @Property(name = "regisAddress")
    private String regisAddress;

    //注册资本金
    @Property(name = "regisMoney")
    private Double regisMoney;

    //行业名称
    @Property(name = "industryName")
    private String industryName;

    //营业范围
    @Property(name = "businessScope")
    private String businessScope;

    //法人名称
    @Property(name = "legalPersonName")
    private String legalPersonName;

    //单位联系人名称
    @Property(name = "contactPersonName")
    private String contactPersonName;

    //单位联系人电话
    @Property(name = "contactPersonTel")
    private String contactPersonTel;

    //是否水电等供应链关系
    @Property(name = "isSupply")
    private int isSupply;


}
