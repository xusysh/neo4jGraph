/**
 * Created by lenovo on 2019/8/26.
 */

$(function(){
    var dataNum=0;
    var linkNum=0;
    var companyNode;
    var companyToCompany;
    var companyToMember;
    var memberNode;
    var memberToCompany;
    var memberToMember;

    var link_array=new Array;
    var data_array=new Array;


    $("#api-all").click(function() {
        $.ajax({
            url: "/route/all",
            type: "get",
            traditional: true,
            contentType: "application/json; charset=UTF-8",
            dataType: "json",
            success: function (data) {
                console.log(data);

                companyNode=data.companyNode;
                memberNode=data.memberNode;

                companyToCompany=data.companyToCompany;
                companyToMember=data.companyToMember;

                memberToCompany=data.memberToCompany;
                memberToMember=data.memberToMember;

                for(var i=0;i<companyNode.length;i++){
                    data_array[i]={
                        name: companyNode[i].name,
                        des: companyNode[i].location,
                        symbolSize: 70,
                        category: 0
                    };
                    dataNum++;
                }

                for(var i=0;i<memberNode.length;i++){
                    data_array[dataNum]={
                        name: memberNode[i].name,
                        des: memberNode[i].othertip,
                        symbolSize: 70,
                        category: 1
                    };
                    dataNum++;
                }




                //myChart.hideLoading();    //隐藏加载动画

                myChart.setOption(option);

                // myChart.on('mouseup',function(params){
                //     var option=myChart.getOption();
                //     option.series[0].data[params.dataIndex].x=params.event.offsetX;
                //     option.series[0].data[params.dataIndex].y=params.event.offsetY;
                //     option.series[0].data[params.dataIndex].fixed=true;
                //     myChart.setOption(option);
                // });
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });


    });

    $("#api-relation").click(function() {
        for(var i=0;i<companyToCompany.length;i++){
            link_array[i]={
                source: companyToCompany[i].startNode.name,
                target: companyToCompany[i].endNode.name,
                name: companyToCompany[i].num,
                des: companyToCompany[i].num
            };
            linkNum++;
        }

        for(var i=0;i<companyToMember.length;i++){
            link_array[linkNum]={
                source: companyToMember[i].startNode.name,
                target: companyToMember[i].endNode.name,
                name: companyToMember[i].num,
                des: companyToMember[i].num
            };
            linkNum++;
        }

        for(var i=0;i<memberToCompany.length;i++){
            link_array[linkNum]={
                source: memberToCompany[i].startNode.name,
                target: memberToCompany[i].endNode.name,
                name: memberToCompany[i].num,
                des: memberToCompany[i].num
            };
            linkNum++;
        }
        for(var i=0;i<memberToMember.length;i++){
            link_array[linkNum]={
                source: memberToMember[i].startNode.name,
                target: memberToMember[i].endNode.name,
                name: memberToMember[i].num,
                des: memberToMember[i].num
            };
            linkNum++;
        }
        myChart.setOption(option);
    });


    var colors=['#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3'];

    var myChart = echarts.init(document.getElementById('main'));
    // myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画
    var categories = [];
    categories[0]={
        name:"公司"
    };
    categories[1]={
        name: "个人"
    };

    var option = {

        title: {
            text: '资金流转关系图',
            subtext: '资金流转链',
            top: 'top',
            left: 'left'
        },
        // 提示框的配置
        tooltip: {
            formatter: function (x) {
                return x.data.des;
            }
        },
        // 工具箱
        toolbox: {
            // 显示工具箱
            show: true,
            feature: {
                mark: {
                    show: true
                },
                // 还原
                restore: {
                    show: true
                },
                // 保存为图片
                saveAsImage: {
                    show: true
                }
            }
        },
        legend: [{
            // selectedMode: 'single',
            data: categories.map(function (a) {
                return a.name;

            }),
        }],
        series: [{
            type: 'graph', // 类型:关系图
            layout: 'force', //图的布局，类型为力导图
            symbolSize: 40, // 调整节点的大小
            roam: true, // 是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移,可以设置成 'scale' 或者 'move'。设置成 true 为都开启
            edgeSymbol: ['circle', 'arrow'],
            edgeSymbolSize: [2, 10],
            color:colors,
            focusNodeAdjacency: true,
            itemStyle: {
                normal: {
                    borderColor: '#fff',
                    borderWidth: 1,
                    shadowBlur: 10,
                    shadowColor: 'rgba(0, 0, 0, 0.3)'
                }
            },

//            focusNodeAdjacency:true,

            edgeLabel: {
                normal: {
                    textStyle: {
                        fontSize: 20
                    }
                }
            },
            force: {
                repulsion: 2500,
                edgeLength: [10, 50]
            },
            draggable: true,
            lineStyle: {
                // normal: {
                //     width: 2,
                //     color: '#4b565b',
                // }
                color: 'source',
                curveness: 0.3
            },
            emphasis: {
                lineStyle: {
                    width: 10
                }
            },
            edgeLabel: {
                normal: {
                    show: true,
                    formatter: function (x) {
                        return x.data.name;
                    }
                }
            },
            label: {
                normal: {
                    show: true,
                    textStyle: {}
                }
            },

            // 数据
            data: data_array,
            links: link_array,
            categories: categories
        }]
    };

    myChart.on('click', {dataType: 'node'}, function (data) {
        console.log("dfs33");
        console.log(value);

    });


});


