CREATE (node:Member { name:"巴卫君",age:20,othertip:"其他备注A" }) return node
CREATE (node:Member { name:"小埋酱",age:30,othertip:"其他备注B" }) return node
CREATE (node:Member { name:"小何",age:21,othertip:"其他备注C" }) return node
CREATE (node:Member { name:"小青",age:22,othertip:"其他备注D" }) return node
CREATE (node:Member { name:"小王",age:23,othertip:"其他备注F" }) return node
CREATE (node:Member { name:"阿汪",age:24,othertip:"其他备注G" }) return node
CREATE (node:Member { name:"阿喵",age:25,othertip:"其他备注H" }) return node
CREATE (node:Member { name:"豆豆",age:26,othertip:"其他备注Q" }) return node

CREATE (node:Company { name:"江苏省南京市A科技公司",location:"江苏省南京市秦淮区" }) return node
CREATE (node:Company { name:"江苏省苏州市B教育公司",location:"江苏省南京市雨花台区软件大道" }) return node


MATCH (node1:Member),(node2:Member)
where node1.name="巴卫君" and node2.name="小埋酱"
CREATE (node1)<-[r:route_mm{num:200000}]-(node2)
RETURN node1,r,node2

MATCH (node1:Member),(node2:Member)
where node1.name="巴卫君" and node2.name="豆豆"
CREATE (node1)-[r:route_mm{num:600000}]->(node2)
RETURN node1,r,node2


MATCH (node1:Member),(node2:Member)
where node1.name="小何" and node2.name="小青"
CREATE (node1)-[r:route_mm{num:50000}]->(node2)
RETURN node1,r,node2


MATCH (node1:Member),(node2:Member)
where node1.name="小何" and node2.name="巴卫君"
CREATE (node1)-[r:route_mm{num:300000}]->(node2)
RETURN node1,r,node2

MATCH (node1:Member),(node2:Member)
where node1.name="豆豆" and node2.name="小何"
CREATE (node1)-[r:route_mm{num:60000}]->(node2)
RETURN node1,r,node2

MATCH (node1:Member),(node2:Member)
where node1.name="阿汪" and node2.name="小王"
CREATE (node1)-[r:route_mm{num:92000}]->(node2)
RETURN node1,r,node2

MATCH (node1:Member),(node2:Member)
where node1.name="阿汪" and node2.name="阿喵"
CREATE (node1)-[r:route_mm{num:86000}]->(node2)
RETURN node1,r,node2


MATCH (node1:Member),(node2:Company)
where node1.name="小王" and node2.name="江苏省南京市A科技公司"
CREATE (node1)-[r:route_mc{num:8000}]->(node2)
RETURN node1,r,node2

MATCH (node1:Member),(node2:Company)
where node1.name="小何" and node2.name="江苏省南京市A科技公司"
CREATE (node1)-[r:route_mc{num:8000}]->(node2)
RETURN node1,r,node2


MATCH (node1:Company),(node2:Member)
where node1.name="江苏省南京市A科技公司" and node2.name="小埋酱"
CREATE (node1)-[r:route_cm{num:1000000}]->(node2)
RETURN node1,r,node2

MATCH (node1:Company),(node2:Member)
where node1.name="江苏省南京市A科技公司" and node2.name="阿喵"
CREATE (node1)-[r:route_cm{num:2000000}]->(node2)
RETURN node1,r,node2

MATCH (node1:Company),(node2:Company)
where node1.name="江苏省南京市A科技公司" and node2.name="江苏省苏州市B教育公司"
CREATE (node1)-[r:route_cc{num:5000000}]->(node2)
RETURN node1,r,node2





