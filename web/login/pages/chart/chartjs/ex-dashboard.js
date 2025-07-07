"use strict";
$(document).ready(function() {

    var pieElem1 = document.getElementById("pieChart1");
    var data1 = {
        labels: ["SCSP", "TSP", "MSP", "APSSDC", "EGM DDUGKY", "EGM EWRC"],
        datasets: [{
            data: [13.5, 7.2, 8.9, 23, 19, 41.6],
            backgroundColor: ["#4CE6C8", "#EC4B94", "#CA61FF", "#9850FB", "#9AA8FF", "#FB6843"],
            hoverBackgroundColor: ["#4CE6C8", "#EC4B94", "#CA61FF", "#9850FB", "#9AA8FF", "#FB6843"]
        }]
    };
    var myPieChart1 = new Chart(pieElem1, {
        type: 'pie',
        data: data1
    });

});