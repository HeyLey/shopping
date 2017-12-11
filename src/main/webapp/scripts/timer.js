$(document).ready(function() {
    $("#datetime").text(getDate(new Date()));
    setInterval(function () {
        $("#datetime").text(getDate(new Date()));
    },60*100);
});

function getDate(date) {
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();
    var hour = date.getHours();
    var minute = date.getMinutes();
    return day+"."+month+"."+year+"  "+hour+":"+minute;
}