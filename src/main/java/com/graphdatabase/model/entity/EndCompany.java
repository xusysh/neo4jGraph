package com.graphdatabase.model.entity;


/**
 * 交易对手-公司用户
 * 关系链终止节点
 * 可能为我行公司，也可能为他行公司
 */
public class EndCompany {

    private Long Id;

    //客户名称
    private String cname;

    //存量客户管护权客户经理
    private String custManagerName;

    //存量客户管护权客户经理电话
    private String custManagerTel;

    //=2，为他行客户
    private int category;

    //存量客户管护权机构名称（精确到支行）
    private String manageBranch;

    //工商注册地址
    private String regisAddress;

    //注册资本金
    private Double regisMoney;

    //行业名称
    private String industryName;

    //营业范围
    private String businessScope;

    //法人名称
    private String legalPersonName;

    //单位联系人名称
    private String contactPersonName;

    //单位联系人电话
    private String contactPersonTel;

    //是否水电等供应链关系
    private int isSupply;
}
