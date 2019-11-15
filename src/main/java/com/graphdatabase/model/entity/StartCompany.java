package com.graphdatabase.model.entity;

/**
 * 起始节点
 * 必为我行公司
 */
public class StartCompany {

    private Long Id;

    //客户名称
    private String cname;

    //开户机构（支行）
    private String openBranch;

    //存量客户所属上级机构（分行）
    private String thirdBranch;

    //存量客户所属二级分行
    private String secondBranch;

    //存量客户管护权客户经理
    private String custManagerName;

    //存量客户管护权客户经理电话
    private String custManagerTel;

    //=1，为我行客户
    private int category;
}
