/**
 * Created by lenovo on 2019/8/26.
 */
$(function(){


    $.ajax({
        url: "/getres",
        type: "get",
        traditional: true,
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        // data:JSON.stringify(test),
        success: function (data) {
           console.log(data[0]);
           var node1=data[0].node1;
           var node2=data[0].node2;
           var r=data[0].r;
           var relationName=new Array;


        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            // console.log(XMLHttpRequest.status);
            // console.log(XMLHttpRequest.readyState);
            // console.log(textStatus);
        },
    });




});
