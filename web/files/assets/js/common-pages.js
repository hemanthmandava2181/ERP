"use strict";
$(document).ready(function() {
    $('.theme-loader').animate({ 'opacity': '0', }, 1200);
    setTimeout(function() { $('.theme-loader').remove(); }, 2000);
});