CREATE (node3:BLabel { num:30,name:"Cccounting",location:"ccccc" }) return node3
CREATE (node2:BLabel { num:20,name:"Bccounting",location:"bbbbb" }) return node2
CREATE (node2:BLabel { num:10,name:"Accounting",location:"aaaaa" }) return node2
CREATE (node2:BLabel { num:40,name:"Dccounting",location:"ddddd" }) return node2



MATCH (node1:BLabel),(node3:BLabel)
where node3.num=30 and node1.num=10
CREATE (node1)-[r:relation_test{date:"AB",price:20}]->(node3)
RETURN node1,r,node3


MATCH (node1:BLabel),(node3:BLabel)
where node3.num=30 and node1.num=20
CREATE (node1)-[r:relation_test{date:"BC",price:50}]->(node3)
RETURN node1,r,node3


MATCH (node1:BLabel),(node3:BLabel)
where node3.num=30 and node1.num=40
CREATE (node1)-[r:relation_test{date:"BD",price:60}]->(node3)
RETURN node1,r,node3


match (node1:BLabel)-[r:relation_test]->(node2:BLabel)
RETURN node1,r,node2


// MATCH (node1:BLabel),(node2:BLabel)
// where node1.num=30 and node2.num=40
// CREATE (node1)-[r:relation_test{date:"cd",price:50}]->(node2)
// RETURN node1,r,node2


MATCH p=()-[r:relation_test]->() RETURN p


// match (node1:ALabel)-[r:relation_test]->(node2:BLabel),
// (node3:BLabel)-[t:relation_test]->(node4:BLabel)
// RETURN node1,r,node2,node3,node4,t


match p=(a:StudentNode) - [r:FRIENDSHIP_RELATION*0..] -> (b:StudentNode) where b.name = "张1" return p

