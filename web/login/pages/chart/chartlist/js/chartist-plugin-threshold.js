(function(root, factory) {
    if (typeof define === 'function' && define.amd) {
        define([], function() {
            return (root.returnExportsGlobal = factory());
        });
    } else if (typeof exports === 'object') {
        module.exports = factory();
    } else {
        root['Chartist.plugins.ctThreshold'] = factory();
    }
}(this, function() {
    (function(window, document, Chartist) {
        'use strict';
        var defaultOptions = {
            threshold: 0,
            classNames: {
                aboveThreshold: 'ct-threshold-above',
                belowThreshold: 'ct-threshold-below'
            },
            maskNames: {
                aboveThreshold: 'ct-threshold-mask-above',
                belowThreshold: 'ct-threshold-mask-below'
            }
        };

        function createMasks(data, options) {
            var defs = data.svg.querySelector('defs') || data.svg.elem('defs');
            var projectedThreshold = data.chartRect.height() - data.axisY.projectValue(options.threshold) + data.chartRect.y2;
            var width = data.svg.width();
            var height = data.svg.height();
            defs.elem('mask', {
                x: 0,
                y: 0,
                width: width,
                height: height,
                id: options.maskNames.aboveThreshold
            }).elem('rect', {
                x: 0,
                y: 0,
                width: width,
                height: projectedThreshold,
                fill: 'white'
            });
            defs.elem('mask', {
                x: 0,
                y: 0,
                width: width,
                height: height,
                id: options.maskNames.belowThreshold
            }).elem('rect', {
                x: 0,
                y: projectedThreshold,
                width: width,
                height: height - projectedThreshold,
                fill: 'white'
            });
            return defs;
        }
        Chartist.plugins = Chartist.plugins || {};
        Chartist.plugins.ctThreshold = function(options) {
            options = Chartist.extend({}, defaultOptions, options);
            return function ctThreshold(chart) {
                if (chart instanceof Chartist.Line || chart instanceof Chartist.Bar) {
                    chart.on('draw', function(data) {
                        if (data.type === 'point') {
                            data.element.addClass(data.value.y >= options.threshold ? options.classNames.aboveThreshold : options.classNames.belowThreshold);
                        } else if (data.type === 'line' || data.type === 'bar' || data.type === 'area') {
                            data.element.parent().elem(data.element._node.cloneNode(true)).attr({
                                mask: 'url(#' + options.maskNames.aboveThreshold + ')'
                            }).addClass(options.classNames.aboveThreshold);
                            data.element.attr({
                                mask: 'url(#' + options.maskNames.belowThreshold + ')'
                            }).addClass(options.classNames.belowThreshold);
                        }
                    });
                    chart.on('created', function(data) {
                        createMasks(data, options);
                    });
                }
            };
        }
    }(window, document, Chartist));
    return Chartist.plugins.ctThreshold;
}));