/*node*/

CREATE (node:Person { Id:1,pname:"王涛"}) return node
CREATE (node:Person { Id:2,pname:"刘原野"}) return node
CREATE (node:Person { Id:2,pname:"李笑月"}) return node
CREATE (node:Person { Id:2,pname:"赵莹莹"}) return node

CREATE (node:LegalPerson { Id:1,lname:"郭靖宇"}) return node
CREATE (node:LegalPerson { Id:2,lname:"袁帅"}) return node


CREATE (node:Company { Id:1,cname:"中国机床总公司",openBranch:"建设银行迈皋桥支行",thirdBranch:"建设银行南京分行",secondBranch:"建设银行江苏分行",
custManagerName:"王涛",custManagerTel:"17721325486",category:1,manageBranch:"建设银行迈皋桥支行",regisAddress:"南京市秦淮区",
regisMoney:1000000,industryName:"制造业",businessScope:"工业机床",legalPersonName:"郭靖宇",contactPersonName:"李笑月",
contactPersonTel:"17725468741",isSupply:0}) return node

CREATE (node:Company { Id:1,cname:"威马农机股份有限公司",openBranch:"建设银行御道街支行",thirdBranch:"建设银行南京分行",secondBranch:"建设银行江苏分行",
custManagerName:"刘原野",custManagerTel:"17721325486",category:1,manageBranch:"建设银行迈皋桥支行",regisAddress:"南京市江宁区",
regisMoney:1000000,industryName:"制造业",businessScope:"农业机械",legalPersonName:"袁帅",contactPersonName:"赵莹莹",
contactPersonTel:"17725468741",isSupply:0}) return node

/*relation*/

MATCH (node1:Company),(node2:Company)
where node1.name="中国机床总公司" and node2.name="威马农机股份有限公司"
CREATE (node1)-[r:relation_mm{id:1,transMoney:1000000.00,transNum:100,transAvg:10000,transSum:1234.56,timeRange:"2019-11-16",
startNode:node1,endNode:node2}]->(node2)
RETURN node1,r,node2


MATCH (node1:Company),(node2:LegalPerson)
where node1.name="中国机床总公司" and node2.name="郭靖宇"
CREATE (node1)-[r:relation_clp{id:1,legalPerson:"法人",startNode:node1,endNode:node2}]->(node2)
RETURN node1,r,node2

MATCH (node1:Company),(node2:Person)
where node1.name="中国机床总公司" and node2.name="王涛"
CREATE (node1)-[r:relation_cp{id:1,transMoney:500000.00,transNum:100,transAvg:5000,transSum:1234.56,timeRange:"2019.11.16",
startNode:node1,endNode:node2}]->(node2)
RETURN node1,r,node2
