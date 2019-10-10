/**
 * Created by lenovo on 2019/8/26.
 */
$(function(){

    $("#api-node").click(function() {
        $.ajax({
            url: "/person/node",
            type: "get",
            traditional: true,
            contentType: "application/json; charset=UTF-8",
            dataType: "json",
            success: function (data) {
                console.log(data);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });

    });

    $("#api-node2").click(function() {
        $.ajax({
            url: "/person/node2",
            type: "get",
            traditional: true,
            contentType: "application/json; charset=UTF-8",
            dataType: "json",
            success: function (data) {
                console.log(data);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });

    });


    $("#api-relation").click(function() {
        $.ajax({
            url: "/person/relation",
            type: "get",
            traditional: true,
            contentType: "application/json; charset=UTF-8",
            dataType: "json",
            success: function (data) {
                console.log(data);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });

    });

});


// CREATE (node3:BLabel { num:30,name:"Cccounting",location:"ccccc" }) return node3


// MATCH (node1:ALabel),(node3:BLabel)
// where node3.num=30
// CREATE (node1)-[r:relation_test{date:"AB",price:20}]->(node3)
// RETURN node1,r,node3



// match (node1:ALabel)-[r:relation_test]->(node2:BLabel)
// RETURN node1,r,node2


// MATCH (node1:BLabel),(node2:BLabel)
// where node1.num=30 and node2.num=40
// CREATE (node1)-[r:relation_test{date:"cd",price:50}]->(node2)
// RETURN node1,r,node2


// MATCH p=()-[r:relation_test]->() RETURN p LIMIT 25


// match (node1:ALabel)-[r:relation_test]->(node2:BLabel),
// (node3:BLabel)-[t:relation_test]->(node4:BLabel)
// RETURN node1,r,node2,node3,node4,t