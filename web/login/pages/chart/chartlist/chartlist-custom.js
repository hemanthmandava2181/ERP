"use strict";
$(document).ready(function() {
    new Chartist.Line('.ct-chart', {
        labels: [1, 2, 3, 4, 5, 6, 7, 8],
        series: [
            [1, 2, 3, 1, -2, 0, 1, 0],
            [-2, -1, -2, -1, -2.5, -1, -2, -1],
            [0, 0, 0, 1, 2, 2.5, 2, 1],
            [2.5, 2, 1, 0.5, 1, 0.5, -1, -2.5]
        ]
    }, { high: 3, low: -3, showArea: true, showLine: false, showPoint: false, fullWidth: true, axisX: { showLabel: true, showGrid: false } });
    new Chartist.Line('.ct-chart1', {
        labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'June'],
        series: [
            [15, 5, 10, 17, 20, 10]
        ]
    }, { showArea: false, axisY: { onlyInteger: true }, plugins: [Chartist.plugins.ctThreshold({ threshold: 4 })] });
    var defaultOptions = { threshold: 0, classNames: { aboveThreshold: 'ct-threshold-above', belowThreshold: 'ct-threshold-below' }, maskNames: { aboveThreshold: 'ct-threshold-mask-above', belowThreshold: 'ct-threshold-mask-below' } };
    var chart = new Chartist.Line('.ct-chart2', {
        labels: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12'],
        series: [
            [12, 9, 7, 8, 5, 4, 6, 2, 3, 3, 4, 6],
            [4, 5, 3, 7, 3, 5, 5, 3, 4, 4, 5, 5],
            [5, 3, 4, 5, 6, 3, 3, 4, 5, 6, 3, 4],
            [3, 4, 5, 6, 7, 6, 4, 5, 6, 7, 6, 3]
        ]
    }, { low: 0 });
    var seq = 0,
        delays = 80,
        durations = 500;
    chart.on('created', function() { seq = 0; });
    chart.on('draw', function(data) {
        seq++;
        if (data.type === 'line') { data.element.animate({ opacity: { begin: seq * delays + 1000, dur: durations, from: 0, to: 1 } }); } else if (data.type === 'label' && data.axis === 'x') { data.element.animate({ y: { begin: seq * delays, dur: durations, from: data.y + 100, to: data.y, easing: 'easeOutQuart' } }); } else if (data.type === 'label' && data.axis === 'y') { data.element.animate({ x: { begin: seq * delays, dur: durations, from: data.x - 100, to: data.x, easing: 'easeOutQuart' } }); } else if (data.type === 'point') { data.element.animate({ x1: { begin: seq * delays, dur: durations, from: data.x - 10, to: data.x, easing: 'easeOutQuart' }, x2: { begin: seq * delays, dur: durations, from: data.x - 10, to: data.x, easing: 'easeOutQuart' }, opacity: { begin: seq * delays, dur: durations, from: 0, to: 1, easing: 'easeOutQuart' } }); } else if (data.type === 'grid') {
            var pos1Animation = { begin: seq * delays, dur: durations, from: data[data.axis.units.pos + '1'] - 30, to: data[data.axis.units.pos + '1'], easing: 'easeOutQuart' };
            var pos2Animation = { begin: seq * delays, dur: durations, from: data[data.axis.units.pos + '2'] - 100, to: data[data.axis.units.pos + '2'], easing: 'easeOutQuart' };
            var animations = {};
            animations[data.axis.units.pos + '1'] = pos1Animation;
            animations[data.axis.units.pos + '2'] = pos2Animation;
            animations['opacity'] = { begin: seq * delays, dur: durations, from: 0, to: 1, easing: 'easeOutQuart' };
            data.element.animate(animations);
        }
    });
    chart.on('created', function() {
        if (window.__exampleAnimateTimeout) {
            clearTimeout(window.__exampleAnimateTimeout);
            window.__exampleAnimateTimeout = null;
        }
        window.__exampleAnimateTimeout = setTimeout(chart.update.bind(chart), 12000);
    });
    new Chartist.Pie('.ct-chart3', { series: [20, 10, 30, 40] }, { donut: true, donutWidth: 60, startAngle: 270, total: 200, showLabel: false });
    new Chartist.Bar('.ct-chart-horizontal', {
        labels: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'],
        series: [
            [5, 4, 3, 7, 5, 10, 3],
            [3, 2, 9, 5, 4, 6, 4]
        ]
    }, { seriesBarDistance: 10, reverseData: true, horizontalBars: true, axisY: { offset: 70 } });
    var chart = new Chartist.Pie('.ct-chart-animating', { series: [10, 20, 50, 20, 5, 50, 15], labels: [1, 2, 3, 4, 5, 6, 7] }, { donut: true, showLabel: false });
    chart.on('draw', function(data) {
        if (data.type === 'slice') {
            var pathLength = data.element._node.getTotalLength();
            data.element.attr({ 'stroke-dasharray': pathLength + 'px ' + pathLength + 'px' });
            var animationDefinition = { 'stroke-dashoffset': { id: 'anim' + data.index, dur: 800, from: -pathLength + 'px', to: '0px', easing: Chartist.Svg.Easing.easeOutQuint, fill: 'freeze' } };
            if (data.index !== 0) { animationDefinition['stroke-dashoffset'].begin = 'anim' + (data.index - 1) + '.end'; }
            data.element.attr({ 'stroke-dashoffset': -pathLength + 'px' });
            data.element.animate(animationDefinition, false);
        }
    });
    chart.on('created', function() {
        if (window.__anim21278907124) {
            clearTimeout(window.__anim21278907124);
            window.__anim21278907124 = null;
        }
        window.__anim21278907124 = setTimeout(chart.update.bind(chart), 10000);
    });
    var chart = new Chartist.Bar('.ct-chart-add-pack', {
        labels: ['W1', 'W2', 'W3', 'W4', 'W5', 'W6', 'W7', 'W8', 'W9', 'W10'],
        series: [
            [1, 2, 4, 8, 6, -2, -1, -4, -6, -2]
        ]
    }, { high: 10, low: -10, axisX: { labelInterpolationFnc: function(value, index) { return index % 2 === 0 ? value : null; } } });
    chart.on('draw', function(data) { if (data.type === 'bar') { data.group.append(new Chartist.Svg('circle', { cx: data.x2, cy: data.y2, r: Math.abs(Chartist.getMultiValue(data.value)) * 2 + 5 }, 'ct-slice-pie')); } });
    var chart = new Chartist.Line('.ct-chart-overrides', { labels: ['1', '2', '3', '4', '5', '6', '7', '8'], series: [{ name: 'series-1', data: [5, 2, -4, 2, 0, -2, 5, -3] }, { name: 'series-2', data: [4, 3, 5, 3, 1, 3, 6, 4] }, { name: 'series-3', data: [2, 4, 3, 1, 4, 5, 3, 2] }] }, { fullWidth: true, series: { 'series-1': { lineSmooth: Chartist.Interpolation.step() }, 'series-2': { lineSmooth: Chartist.Interpolation.simple(), showArea: true }, 'series-3': { showPoint: false } } }, [
        ['screen and (max-width: 320px)', { series: { 'series-1': { lineSmooth: Chartist.Interpolation.none() }, 'series-2': { lineSmooth: Chartist.Interpolation.none(), showArea: false }, 'series-3': { lineSmooth: Chartist.Interpolation.none(), showPoint: true } } }]
    ]);
});