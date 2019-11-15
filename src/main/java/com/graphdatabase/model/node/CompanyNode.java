package com.graphdatabase.model.node;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 节点-公司
 * 由category字段标识为我行还是他行
 */
@Getter
@Setter
@NodeEntity(label = "Company")
public class CompanyNode {

    @Id
    @GeneratedValue
    private Long Id;

    //客户名称
    @Property(name = "cname")
    private String cname;

    //开户机构（支行）
    @Property(name = "openBranch")
    private String openBranch;

    //存量客户所属上级机构（分行）
    @Property(name = "thirdBranch")
    private String thirdBranch;

    //存量客户所属二级分行
    @Property(name = "secondBranch")
    private String secondBranch;

    //存量客户管护权客户经理
    @Property(name = "custManagerName")
    private String custManagerName;

    //存量客户管护权客户经理电话
    @Property(name = "custManagerTel")
    private String custManagerTel;

    //是否在我行开户，1为我行客户，2为他行客户
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

    //是否水电等供应链关系,0为不是，1为是
    @Property(name = "isSupply")
    private int isSupply;
}
