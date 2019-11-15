$(function () {
    /**
     * 是否成圈，默认为0，不成圈
     * @type {number}
     */
    var isCircle = 0;

    /**
     * 探索方向,默认为1，正向
     * @type {number}
     */
    var isForward = 1;

    /**
     * 是否成圈button
     * isCircle-btn为是
     */
    $("#isCircle-btn").click(function() {
        isCircle = 1;
        if($("#notCircle-btn").hasClass("btn-info")){
            $("#notCircle-btn").removeClass("btn-info");
        }
        if(!$("#isCircle-btn").hasClass("btn-info")){
            $("#isCircle-btn").addClass("btn-info");
        }
    });

    /**
     * 是否成圈button
     * notCircle-btn为否
     */
    $("#notCircle-btn").click(function() {
        isCircle = 0;
        if($("#isCircle-btn").hasClass("btn-info")){
            $("#isCircle-btn").removeClass("btn-info");
        }
        if(!$("#notCircle-btn").hasClass("btn-info")){
            $("#notCircle-btn").addClass("btn-info");
        }
    });


});