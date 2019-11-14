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


//关系链A节点
@Getter
@Setter
@NodeEntity(label="Institute")
public class CompanyANode {

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

    //=1，为我行客户
    @Property(name = "category")
    private int category;


}
