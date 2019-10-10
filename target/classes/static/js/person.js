/**
 * Created by lenovo on 2019/8/26.
 */

$(function(){
    var relation;
    var link_test2=new Array;
    var data_test2=new Array;

    $("#api-node").click(function() {
        $.ajax({
            url: "/person/node",
            type: "get",
            traditional: true,
            contentType: "application/json; charset=UTF-8",
            dataType: "json",
            success: function (data) {
                console.log(data);
                for(var i=0;i<data.length;i++){
                    data_test2[i]={
                        name: data[i].name,
                        des: '22',
                        symbolSize: 70,
                        category: 0,
                        location:data[i].location
                    }
                }
                //myChart.hideLoading();    //隐藏加载动画
                myChart.setOption(option);
                myChart.on('mouseup',function(params){
                    var option=myChart.getOption();
                    option.series[0].data[params.dataIndex].x=params.event.offsetX;
                    option.series[0].data[params.dataIndex].y=params.event.offsetY;
                    option.series[0].data[params.dataIndex].fixed=true;
                    myChart.setOption(option);
                });
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
                relation=data;
                console.log(data);
                //myChart.hideLoading();    //隐藏加载动画
                for(var i=0;i<relation.length;i++){

                    link_test2[i]={
                        source: relation[i].startNode.name,
                        target: relation[i].endNode.name,
                        name: 'link01',
                        des: relation[i].price
                    };
                }
                myChart.setOption(option);
                myChart.on('mouseup',function(params){
                    var option=myChart.getOption();
                    option.series[0].data[params.dataIndex].x=params.event.offsetX;
                    option.series[0].data[params.dataIndex].y=params.event.offsetY;
                    option.series[0].data[params.dataIndex].fixed=true;
                    myChart.setOption(option);
                });
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });

    });


    var colors=['#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3'];

    var myChart = echarts.init(document.getElementById('main'));
    // myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画
    var categories = [];
    for (var i = 0; i < 2; i++) {
        categories[i] = {
            name: '最上方的类目' + i

        };
    }
    option = {
        // 图的标题
        title: {
            text: 'ECharts 关系图'
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

            })
        }],
        series: [{
            type: 'graph', // 类型:关系图
            layout: 'force', //图的布局，类型为力导图
            symbolSize: 40, // 调整节点的大小
            roam: true, // 是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移,可以设置成 'scale' 或者 'move'。设置成 true 为都开启
            edgeSymbol: ['circle', 'arrow'],
            edgeSymbolSize: [2, 10],
            color:colors,
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
                normal: {
                    width: 2,
                    color: '#4b565b',
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
            data: data_test2,
            links: link_test2,
            categories: categories,
        }]
    };


});


