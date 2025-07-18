(function(root, factory) {
    if (typeof define === 'function' && define.amd) {
        define('Chartist', [], function() {
            return (root['Chartist'] = factory());
        });
    } else if (typeof module === 'object' && module.exports) {
        module.exports = factory();
    } else {
        root['Chartist'] = factory();
    }
}(this, function() {
    var Chartist = {
        version: '0.11.0'
    };
    (function(window, document, Chartist) {
        'use strict';
        Chartist.namespaces = {
            svg: 'http://www.w3.org/2000/svg',
            xmlns: 'http://www.w3.org/2000/xmlns/',
            xhtml: 'http://www.w3.org/1999/xhtml',
            xlink: 'http://www.w3.org/1999/xlink',
            ct: 'http://gionkunz.github.com/chartist-js/ct'
        };
        Chartist.noop = function(n) {
            return n;
        };
        Chartist.alphaNumerate = function(n) {
            return String.fromCharCode(97 + n % 26);
        };
        Chartist.extend = function(target) {
            var i, source, sourceProp;
            target = target || {};
            for (i = 1; i < arguments.length; i++) {
                source = arguments[i];
                for (var prop in source) {
                    sourceProp = source[prop];
                    if (typeof sourceProp === 'object' && sourceProp !== null && !(sourceProp instanceof Array)) {
                        target[prop] = Chartist.extend(target[prop], sourceProp);
                    } else {
                        target[prop] = sourceProp;
                    }
                }
            }
            return target;
        };
        Chartist.replaceAll = function(str, subStr, newSubStr) {
            return str.replace(new RegExp(subStr, 'g'), newSubStr);
        };
        Chartist.ensureUnit = function(value, unit) {
            if (typeof value === 'number') {
                value = value + unit;
            }
            return value;
        };
        Chartist.quantity = function(input) {
            if (typeof input === 'string') {
                var match = (/^(\d+)\s*(.*)$/g).exec(input);
                return {
                    value: +match[1],
                    unit: match[2] || undefined
                };
            }
            return {
                value: input
            };
        };
        Chartist.querySelector = function(query) {
            return query instanceof Node ? query : document.querySelector(query);
        };
        Chartist.times = function(length) {
            return Array.apply(null, new Array(length));
        };
        Chartist.sum = function(previous, current) {
            return previous + (current ? current : 0);
        };
        Chartist.mapMultiply = function(factor) {
            return function(num) {
                return num * factor;
            };
        };
        Chartist.mapAdd = function(addend) {
            return function(num) {
                return num + addend;
            };
        };
        Chartist.serialMap = function(arr, cb) {
            var result = [],
                length = Math.max.apply(null, arr.map(function(e) {
                    return e.length;
                }));
            Chartist.times(length).forEach(function(e, index) {
                var args = arr.map(function(e) {
                    return e[index];
                });
                result[index] = cb.apply(null, args);
            });
            return result;
        };
        Chartist.roundWithPrecision = function(value, digits) {
            var precision = Math.pow(10, digits || Chartist.precision);
            return Math.round(value * precision) / precision;
        };
        Chartist.precision = 8;
        Chartist.escapingMap = {
            '&': '&amp;',
            '<': '&lt;',
            '>': '&gt;',
            '"': '&quot;',
            '\'': '&#039;'
        };
        Chartist.serialize = function(data) {
            if (data === null || data === undefined) {
                return data;
            } else if (typeof data === 'number') {
                data = '' + data;
            } else if (typeof data === 'object') {
                data = JSON.stringify({
                    data: data
                });
            }
            return Object.keys(Chartist.escapingMap).reduce(function(result, key) {
                return Chartist.replaceAll(result, key, Chartist.escapingMap[key]);
            }, data);
        };
        Chartist.deserialize = function(data) {
            if (typeof data !== 'string') {
                return data;
            }
            data = Object.keys(Chartist.escapingMap).reduce(function(result, key) {
                return Chartist.replaceAll(result, Chartist.escapingMap[key], key);
            }, data);
            try {
                data = JSON.parse(data);
                data = data.data !== undefined ? data.data : data;
            } catch (e) {}
            return data;
        };
        Chartist.createSvg = function(container, width, height, className) {
            var svg;
            width = width || '100%';
            height = height || '100%';
            Array.prototype.slice.call(container.querySelectorAll('svg')).filter(function filterChartistSvgObjects(svg) {
                return svg.getAttributeNS(Chartist.namespaces.xmlns, 'ct');
            }).forEach(function removePreviousElement(svg) {
                container.removeChild(svg);
            });
            svg = new Chartist.Svg('svg').attr({
                width: width,
                height: height
            }).addClass(className);
            svg._node.style.width = width;
            svg._node.style.height = height;
            container.appendChild(svg._node);
            return svg;
        };
        Chartist.normalizeData = function(data, reverse, multi) {
            var labelCount;
            var output = {
                raw: data,
                normalized: {}
            };
            output.normalized.series = Chartist.getDataArray({
                series: data.series || []
            }, reverse, multi);
            if (output.normalized.series.every(function(value) {
                    return value instanceof Array;
                })) {
                labelCount = Math.max.apply(null, output.normalized.series.map(function(series) {
                    return series.length;
                }));
            } else {
                labelCount = output.normalized.series.length;
            }
            output.normalized.labels = (data.labels || []).slice();
            Array.prototype.push.apply(output.normalized.labels, Chartist.times(Math.max(0, labelCount - output.normalized.labels.length)).map(function() {
                return '';
            }));
            if (reverse) {
                Chartist.reverseData(output.normalized);
            }
            return output;
        };
        Chartist.safeHasProperty = function(object, property) {
            return object !== null && typeof object === 'object' && object.hasOwnProperty(property);
        };
        Chartist.isDataHoleValue = function(value) {
            return value === null || value === undefined || (typeof value === 'number' && isNaN(value));
        };
        Chartist.reverseData = function(data) {
            data.labels.reverse();
            data.series.reverse();
            for (var i = 0; i < data.series.length; i++) {
                if (typeof(data.series[i]) === 'object' && data.series[i].data !== undefined) {
                    data.series[i].data.reverse();
                } else if (data.series[i] instanceof Array) {
                    data.series[i].reverse();
                }
            }
        };
        Chartist.getDataArray = function(data, reverse, multi) {
            function recursiveConvert(value) {
                if (Chartist.safeHasProperty(value, 'value')) {
                    return recursiveConvert(value.value);
                } else if (Chartist.safeHasProperty(value, 'data')) {
                    return recursiveConvert(value.data);
                } else if (value instanceof Array) {
                    return value.map(recursiveConvert);
                } else if (Chartist.isDataHoleValue(value)) {
                    return undefined;
                } else {
                    if (multi) {
                        var multiValue = {};
                        if (typeof multi === 'string') {
                            multiValue[multi] = Chartist.getNumberOrUndefined(value);
                        } else {
                            multiValue.y = Chartist.getNumberOrUndefined(value);
                        }
                        multiValue.x = value.hasOwnProperty('x') ? Chartist.getNumberOrUndefined(value.x) : multiValue.x;
                        multiValue.y = value.hasOwnProperty('y') ? Chartist.getNumberOrUndefined(value.y) : multiValue.y;
                        return multiValue;
                    } else {
                        return Chartist.getNumberOrUndefined(value);
                    }
                }
            }
            return data.series.map(recursiveConvert);
        };
        Chartist.normalizePadding = function(padding, fallback) {
            fallback = fallback || 0;
            return typeof padding === 'number' ? {
                top: padding,
                right: padding,
                bottom: padding,
                left: padding
            } : {
                top: typeof padding.top === 'number' ? padding.top : fallback,
                right: typeof padding.right === 'number' ? padding.right : fallback,
                bottom: typeof padding.bottom === 'number' ? padding.bottom : fallback,
                left: typeof padding.left === 'number' ? padding.left : fallback
            };
        };
        Chartist.getMetaData = function(series, index) {
            var value = series.data ? series.data[index] : series[index];
            return value ? value.meta : undefined;
        };
        Chartist.orderOfMagnitude = function(value) {
            return Math.floor(Math.log(Math.abs(value)) / Math.LN10);
        };
        Chartist.projectLength = function(axisLength, length, bounds) {
            return length / bounds.range * axisLength;
        };
        Chartist.getAvailableHeight = function(svg, options) {
            return Math.max((Chartist.quantity(options.height).value || svg.height()) - (options.chartPadding.top + options.chartPadding.bottom) - options.axisX.offset, 0);
        };
        Chartist.getHighLow = function(data, options, dimension) {
            options = Chartist.extend({}, options, dimension ? options['axis' + dimension.toUpperCase()] : {});
            var highLow = {
                high: options.high === undefined ? -Number.MAX_VALUE : +options.high,
                low: options.low === undefined ? Number.MAX_VALUE : +options.low
            };
            var findHigh = options.high === undefined;
            var findLow = options.low === undefined;

            function recursiveHighLow(data) {
                if (data === undefined) {
                    return undefined;
                } else if (data instanceof Array) {
                    for (var i = 0; i < data.length; i++) {
                        recursiveHighLow(data[i]);
                    }
                } else {
                    var value = dimension ? +data[dimension] : +data;
                    if (findHigh && value > highLow.high) {
                        highLow.high = value;
                    }
                    if (findLow && value < highLow.low) {
                        highLow.low = value;
                    }
                }
            }
            if (findHigh || findLow) {
                recursiveHighLow(data);
            }
            if (options.referenceValue || options.referenceValue === 0) {
                highLow.high = Math.max(options.referenceValue, highLow.high);
                highLow.low = Math.min(options.referenceValue, highLow.low);
            }
            if (highLow.high <= highLow.low) {
                if (highLow.low === 0) {
                    highLow.high = 1;
                } else if (highLow.low < 0) {
                    highLow.high = 0;
                } else if (highLow.high > 0) {
                    highLow.low = 0;
                } else {
                    highLow.high = 1;
                    highLow.low = 0;
                }
            }
            return highLow;
        };
        Chartist.isNumeric = function(value) {
            return value === null ? false : isFinite(value);
        };
        Chartist.isFalseyButZero = function(value) {
            return !value && value !== 0;
        };
        Chartist.getNumberOrUndefined = function(value) {
            return Chartist.isNumeric(value) ? +value : undefined;
        };
        Chartist.isMultiValue = function(value) {
            return typeof value === 'object' && ('x' in value || 'y' in value);
        };
        Chartist.getMultiValue = function(value, dimension) {
            if (Chartist.isMultiValue(value)) {
                return Chartist.getNumberOrUndefined(value[dimension || 'y']);
            } else {
                return Chartist.getNumberOrUndefined(value);
            }
        };
        Chartist.rho = function(num) {
            if (num === 1) {
                return num;
            }

            function gcd(p, q) {
                if (p % q === 0) {
                    return q;
                } else {
                    return gcd(q, p % q);
                }
            }

            function f(x) {
                return x * x + 1;
            }
            var x1 = 2,
                x2 = 2,
                divisor;
            if (num % 2 === 0) {
                return 2;
            }
            do {
                x1 = f(x1) % num;
                x2 = f(f(x2)) % num;
                divisor = gcd(Math.abs(x1 - x2), num);
            } while (divisor === 1);
            return divisor;
        };
        Chartist.getBounds = function(axisLength, highLow, scaleMinSpace, onlyInteger) {
            var i, optimizationCounter = 0,
                newMin, newMax, bounds = {
                    high: highLow.high,
                    low: highLow.low
                };
            bounds.valueRange = bounds.high - bounds.low;
            bounds.oom = Chartist.orderOfMagnitude(bounds.valueRange);
            bounds.step = Math.pow(10, bounds.oom);
            bounds.min = Math.floor(bounds.low / bounds.step) * bounds.step;
            bounds.max = Math.ceil(bounds.high / bounds.step) * bounds.step;
            bounds.range = bounds.max - bounds.min;
            bounds.numberOfSteps = Math.round(bounds.range / bounds.step);
            var length = Chartist.projectLength(axisLength, bounds.step, bounds);
            var scaleUp = length < scaleMinSpace;
            var smallestFactor = onlyInteger ? Chartist.rho(bounds.range) : 0;
            if (onlyInteger && Chartist.projectLength(axisLength, 1, bounds) >= scaleMinSpace) {
                bounds.step = 1;
            } else if (onlyInteger && smallestFactor < bounds.step && Chartist.projectLength(axisLength, smallestFactor, bounds) >= scaleMinSpace) {
                bounds.step = smallestFactor;
            } else {
                while (true) {
                    if (scaleUp && Chartist.projectLength(axisLength, bounds.step, bounds) <= scaleMinSpace) {
                        bounds.step *= 2;
                    } else if (!scaleUp && Chartist.projectLength(axisLength, bounds.step / 2, bounds) >= scaleMinSpace) {
                        bounds.step /= 2;
                        if (onlyInteger && bounds.step % 1 !== 0) {
                            bounds.step *= 2;
                            break;
                        }
                    } else {
                        break;
                    }
                    if (optimizationCounter++ > 1000) {
                        throw new Error('Exceeded maximum number of iterations while optimizing scale step!');
                    }
                }
            }
            var EPSILON = 2.221E-16;
            bounds.step = Math.max(bounds.step, EPSILON);

            function safeIncrement(value, increment) {
                if (value === (value += increment)) {
                    value *= (1 + (increment > 0 ? EPSILON : -EPSILON));
                }
                return value;
            }
            newMin = bounds.min;
            newMax = bounds.max;
            while (newMin + bounds.step <= bounds.low) {
                newMin = safeIncrement(newMin, bounds.step);
            }
            while (newMax - bounds.step >= bounds.high) {
                newMax = safeIncrement(newMax, -bounds.step);
            }
            bounds.min = newMin;
            bounds.max = newMax;
            bounds.range = bounds.max - bounds.min;
            var values = [];
            for (i = bounds.min; i <= bounds.max; i = safeIncrement(i, bounds.step)) {
                var value = Chartist.roundWithPrecision(i);
                if (value !== values[values.length - 1]) {
                    values.push(value);
                }
            }
            bounds.values = values;
            return bounds;
        };
        Chartist.polarToCartesian = function(centerX, centerY, radius, angleInDegrees) {
            var angleInRadians = (angleInDegrees - 90) * Math.PI / 180.0;
            return {
                x: centerX + (radius * Math.cos(angleInRadians)),
                y: centerY + (radius * Math.sin(angleInRadians))
            };
        };
        Chartist.createChartRect = function(svg, options, fallbackPadding) {
            var hasAxis = !!(options.axisX || options.axisY);
            var yAxisOffset = hasAxis ? options.axisY.offset : 0;
            var xAxisOffset = hasAxis ? options.axisX.offset : 0;
            var width = svg.width() || Chartist.quantity(options.width).value || 0;
            var height = svg.height() || Chartist.quantity(options.height).value || 0;
            var normalizedPadding = Chartist.normalizePadding(options.chartPadding, fallbackPadding);
            width = Math.max(width, yAxisOffset + normalizedPadding.left + normalizedPadding.right);
            height = Math.max(height, xAxisOffset + normalizedPadding.top + normalizedPadding.bottom);
            var chartRect = {
                padding: normalizedPadding,
                width: function() {
                    return this.x2 - this.x1;
                },
                height: function() {
                    return this.y1 - this.y2;
                }
            };
            if (hasAxis) {
                if (options.axisX.position === 'start') {
                    chartRect.y2 = normalizedPadding.top + xAxisOffset;
                    chartRect.y1 = Math.max(height - normalizedPadding.bottom, chartRect.y2 + 1);
                } else {
                    chartRect.y2 = normalizedPadding.top;
                    chartRect.y1 = Math.max(height - normalizedPadding.bottom - xAxisOffset, chartRect.y2 + 1);
                }
                if (options.axisY.position === 'start') {
                    chartRect.x1 = normalizedPadding.left + yAxisOffset;
                    chartRect.x2 = Math.max(width - normalizedPadding.right, chartRect.x1 + 1);
                } else {
                    chartRect.x1 = normalizedPadding.left;
                    chartRect.x2 = Math.max(width - normalizedPadding.right - yAxisOffset, chartRect.x1 + 1);
                }
            } else {
                chartRect.x1 = normalizedPadding.left;
                chartRect.x2 = Math.max(width - normalizedPadding.right, chartRect.x1 + 1);
                chartRect.y2 = normalizedPadding.top;
                chartRect.y1 = Math.max(height - normalizedPadding.bottom, chartRect.y2 + 1);
            }
            return chartRect;
        };
        Chartist.createGrid = function(position, index, axis, offset, length, group, classes, eventEmitter) {
            var positionalData = {};
            positionalData[axis.units.pos + '1'] = position;
            positionalData[axis.units.pos + '2'] = position;
            positionalData[axis.counterUnits.pos + '1'] = offset;
            positionalData[axis.counterUnits.pos + '2'] = offset + length;
            var gridElement = group.elem('line', positionalData, classes.join(' '));
            eventEmitter.emit('draw', Chartist.extend({
                type: 'grid',
                axis: axis,
                index: index,
                group: group,
                element: gridElement
            }, positionalData));
        };
        Chartist.createGridBackground = function(gridGroup, chartRect, className, eventEmitter) {
            var gridBackground = gridGroup.elem('rect', {
                x: chartRect.x1,
                y: chartRect.y2,
                width: chartRect.width(),
                height: chartRect.height(),
            }, className, true);
            eventEmitter.emit('draw', {
                type: 'gridBackground',
                group: gridGroup,
                element: gridBackground
            });
        };
        Chartist.createLabel = function(position, length, index, labels, axis, axisOffset, labelOffset, group, classes, useForeignObject, eventEmitter) {
            var labelElement;
            var positionalData = {};
            positionalData[axis.units.pos] = position + labelOffset[axis.units.pos];
            positionalData[axis.counterUnits.pos] = labelOffset[axis.counterUnits.pos];
            positionalData[axis.units.len] = length;
            positionalData[axis.counterUnits.len] = Math.max(0, axisOffset - 10);
            if (useForeignObject) {
                var content = document.createElement('span');
                content.className = classes.join(' ');
                content.setAttribute('xmlns', Chartist.namespaces.xhtml);
                content.innerText = labels[index];
                content.style[axis.units.len] = Math.round(positionalData[axis.units.len]) + 'px';
                content.style[axis.counterUnits.len] = Math.round(positionalData[axis.counterUnits.len]) + 'px';
                labelElement = group.foreignObject(content, Chartist.extend({
                    style: 'overflow: visible;'
                }, positionalData));
            } else {
                labelElement = group.elem('text', positionalData, classes.join(' ')).text(labels[index]);
            }
            eventEmitter.emit('draw', Chartist.extend({
                type: 'label',
                axis: axis,
                index: index,
                group: group,
                element: labelElement,
                text: labels[index]
            }, positionalData));
        };
        Chartist.getSeriesOption = function(series, options, key) {
            if (series.name && options.series && options.series[series.name]) {
                var seriesOptions = options.series[series.name];
                return seriesOptions.hasOwnProperty(key) ? seriesOptions[key] : options[key];
            } else {
                return options[key];
            }
        };
        Chartist.optionsProvider = function(options, responsiveOptions, eventEmitter) {
            var baseOptions = Chartist.extend({}, options),
                currentOptions, mediaQueryListeners = [],
                i;

            function updateCurrentOptions(mediaEvent) {
                var previousOptions = currentOptions;
                currentOptions = Chartist.extend({}, baseOptions);
                if (responsiveOptions) {
                    for (i = 0; i < responsiveOptions.length; i++) {
                        var mql = window.matchMedia(responsiveOptions[i][0]);
                        if (mql.matches) {
                            currentOptions = Chartist.extend(currentOptions, responsiveOptions[i][1]);
                        }
                    }
                }
                if (eventEmitter && mediaEvent) {
                    eventEmitter.emit('optionsChanged', {
                        previousOptions: previousOptions,
                        currentOptions: currentOptions
                    });
                }
            }

            function removeMediaQueryListeners() {
                mediaQueryListeners.forEach(function(mql) {
                    mql.removeListener(updateCurrentOptions);
                });
            }
            if (!window.matchMedia) {
                throw 'window.matchMedia not found! Make sure you\'re using a polyfill.';
            } else if (responsiveOptions) {
                for (i = 0; i < responsiveOptions.length; i++) {
                    var mql = window.matchMedia(responsiveOptions[i][0]);
                    mql.addListener(updateCurrentOptions);
                    mediaQueryListeners.push(mql);
                }
            }
            updateCurrentOptions();
            return {
                removeMediaQueryListeners: removeMediaQueryListeners,
                getCurrentOptions: function getCurrentOptions() {
                    return Chartist.extend({}, currentOptions);
                }
            };
        };
        Chartist.splitIntoSegments = function(pathCoordinates, valueData, options) {
            var defaultOptions = {
                increasingX: false,
                fillHoles: false
            };
            options = Chartist.extend({}, defaultOptions, options);
            var segments = [];
            var hole = true;
            for (var i = 0; i < pathCoordinates.length; i += 2) {
                if (Chartist.getMultiValue(valueData[i / 2].value) === undefined) {
                    if (!options.fillHoles) {
                        hole = true;
                    }
                } else {
                    if (options.increasingX && i >= 2 && pathCoordinates[i] <= pathCoordinates[i - 2]) {
                        hole = true;
                    }
                    if (hole) {
                        segments.push({
                            pathCoordinates: [],
                            valueData: []
                        });
                        hole = false;
                    }
                    segments[segments.length - 1].pathCoordinates.push(pathCoordinates[i], pathCoordinates[i + 1]);
                    segments[segments.length - 1].valueData.push(valueData[i / 2]);
                }
            }
            return segments;
        };
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        Chartist.Interpolation = {};
        Chartist.Interpolation.none = function(options) {
            var defaultOptions = {
                fillHoles: false
            };
            options = Chartist.extend({}, defaultOptions, options);
            return function none(pathCoordinates, valueData) {
                var path = new Chartist.Svg.Path();
                var hole = true;
                for (var i = 0; i < pathCoordinates.length; i += 2) {
                    var currX = pathCoordinates[i];
                    var currY = pathCoordinates[i + 1];
                    var currData = valueData[i / 2];
                    if (Chartist.getMultiValue(currData.value) !== undefined) {
                        if (hole) {
                            path.move(currX, currY, false, currData);
                        } else {
                            path.line(currX, currY, false, currData);
                        }
                        hole = false;
                    } else if (!options.fillHoles) {
                        hole = true;
                    }
                }
                return path;
            };
        };
        Chartist.Interpolation.simple = function(options) {
            var defaultOptions = {
                divisor: 2,
                fillHoles: false
            };
            options = Chartist.extend({}, defaultOptions, options);
            var d = 1 / Math.max(1, options.divisor);
            return function simple(pathCoordinates, valueData) {
                var path = new Chartist.Svg.Path();
                var prevX, prevY, prevData;
                for (var i = 0; i < pathCoordinates.length; i += 2) {
                    var currX = pathCoordinates[i];
                    var currY = pathCoordinates[i + 1];
                    var length = (currX - prevX) * d;
                    var currData = valueData[i / 2];
                    if (currData.value !== undefined) {
                        if (prevData === undefined) {
                            path.move(currX, currY, false, currData);
                        } else {
                            path.curve(prevX + length, prevY, currX - length, currY, currX, currY, false, currData);
                        }
                        prevX = currX;
                        prevY = currY;
                        prevData = currData;
                    } else if (!options.fillHoles) {
                        prevX = currX = prevData = undefined;
                    }
                }
                return path;
            };
        };
        Chartist.Interpolation.cardinal = function(options) {
            var defaultOptions = {
                tension: 1,
                fillHoles: false
            };
            options = Chartist.extend({}, defaultOptions, options);
            var t = Math.min(1, Math.max(0, options.tension)),
                c = 1 - t;
            return function cardinal(pathCoordinates, valueData) {
                var segments = Chartist.splitIntoSegments(pathCoordinates, valueData, {
                    fillHoles: options.fillHoles
                });
                if (!segments.length) {
                    return Chartist.Interpolation.none()([]);
                } else if (segments.length > 1) {
                    var paths = [];
                    segments.forEach(function(segment) {
                        paths.push(cardinal(segment.pathCoordinates, segment.valueData));
                    });
                    return Chartist.Svg.Path.join(paths);
                } else {
                    pathCoordinates = segments[0].pathCoordinates;
                    valueData = segments[0].valueData;
                    if (pathCoordinates.length <= 4) {
                        return Chartist.Interpolation.none()(pathCoordinates, valueData);
                    }
                    var path = new Chartist.Svg.Path().move(pathCoordinates[0], pathCoordinates[1], false, valueData[0]),
                        z;
                    for (var i = 0, iLen = pathCoordinates.length; iLen - 2 * !z > i; i += 2) {
                        var p = [{
                            x: +pathCoordinates[i - 2],
                            y: +pathCoordinates[i - 1]
                        }, {
                            x: +pathCoordinates[i],
                            y: +pathCoordinates[i + 1]
                        }, {
                            x: +pathCoordinates[i + 2],
                            y: +pathCoordinates[i + 3]
                        }, {
                            x: +pathCoordinates[i + 4],
                            y: +pathCoordinates[i + 5]
                        }];
                        if (z) {
                            if (!i) {
                                p[0] = {
                                    x: +pathCoordinates[iLen - 2],
                                    y: +pathCoordinates[iLen - 1]
                                };
                            } else if (iLen - 4 === i) {
                                p[3] = {
                                    x: +pathCoordinates[0],
                                    y: +pathCoordinates[1]
                                };
                            } else if (iLen - 2 === i) {
                                p[2] = {
                                    x: +pathCoordinates[0],
                                    y: +pathCoordinates[1]
                                };
                                p[3] = {
                                    x: +pathCoordinates[2],
                                    y: +pathCoordinates[3]
                                };
                            }
                        } else {
                            if (iLen - 4 === i) {
                                p[3] = p[2];
                            } else if (!i) {
                                p[0] = {
                                    x: +pathCoordinates[i],
                                    y: +pathCoordinates[i + 1]
                                };
                            }
                        }
                        path.curve((t * (-p[0].x + 6 * p[1].x + p[2].x) / 6) + (c * p[2].x), (t * (-p[0].y + 6 * p[1].y + p[2].y) / 6) + (c * p[2].y), (t * (p[1].x + 6 * p[2].x - p[3].x) / 6) + (c * p[2].x), (t * (p[1].y + 6 * p[2].y - p[3].y) / 6) + (c * p[2].y), p[2].x, p[2].y, false, valueData[(i + 2) / 2]);
                    }
                    return path;
                }
            };
        };
        Chartist.Interpolation.monotoneCubic = function(options) {
            var defaultOptions = {
                fillHoles: false
            };
            options = Chartist.extend({}, defaultOptions, options);
            return function monotoneCubic(pathCoordinates, valueData) {
                var segments = Chartist.splitIntoSegments(pathCoordinates, valueData, {
                    fillHoles: options.fillHoles,
                    increasingX: true
                });
                if (!segments.length) {
                    return Chartist.Interpolation.none()([]);
                } else if (segments.length > 1) {
                    var paths = [];
                    segments.forEach(function(segment) {
                        paths.push(monotoneCubic(segment.pathCoordinates, segment.valueData));
                    });
                    return Chartist.Svg.Path.join(paths);
                } else {
                    pathCoordinates = segments[0].pathCoordinates;
                    valueData = segments[0].valueData;
                    if (pathCoordinates.length <= 4) {
                        return Chartist.Interpolation.none()(pathCoordinates, valueData);
                    }
                    var xs = [],
                        ys = [],
                        i, n = pathCoordinates.length / 2,
                        ms = [],
                        ds = [],
                        dys = [],
                        dxs = [],
                        path;
                    for (i = 0; i < n; i++) {
                        xs[i] = pathCoordinates[i * 2];
                        ys[i] = pathCoordinates[i * 2 + 1];
                    }
                    for (i = 0; i < n - 1; i++) {
                        dys[i] = ys[i + 1] - ys[i];
                        dxs[i] = xs[i + 1] - xs[i];
                        ds[i] = dys[i] / dxs[i];
                    }
                    ms[0] = ds[0];
                    ms[n - 1] = ds[n - 2];
                    for (i = 1; i < n - 1; i++) {
                        if (ds[i] === 0 || ds[i - 1] === 0 || (ds[i - 1] > 0) !== (ds[i] > 0)) {
                            ms[i] = 0;
                        } else {
                            ms[i] = 3 * (dxs[i - 1] + dxs[i]) / ((2 * dxs[i] + dxs[i - 1]) / ds[i - 1] +
                                (dxs[i] + 2 * dxs[i - 1]) / ds[i]);
                            if (!isFinite(ms[i])) {
                                ms[i] = 0;
                            }
                        }
                    }
                    path = new Chartist.Svg.Path().move(xs[0], ys[0], false, valueData[0]);
                    for (i = 0; i < n - 1; i++) {
                        path.curve(xs[i] + dxs[i] / 3, ys[i] + ms[i] * dxs[i] / 3, xs[i + 1] - dxs[i] / 3, ys[i + 1] - ms[i + 1] * dxs[i] / 3, xs[i + 1], ys[i + 1], false, valueData[i + 1]);
                    }
                    return path;
                }
            };
        };
        Chartist.Interpolation.step = function(options) {
            var defaultOptions = {
                postpone: true,
                fillHoles: false
            };
            options = Chartist.extend({}, defaultOptions, options);
            return function step(pathCoordinates, valueData) {
                var path = new Chartist.Svg.Path();
                var prevX, prevY, prevData;
                for (var i = 0; i < pathCoordinates.length; i += 2) {
                    var currX = pathCoordinates[i];
                    var currY = pathCoordinates[i + 1];
                    var currData = valueData[i / 2];
                    if (currData.value !== undefined) {
                        if (prevData === undefined) {
                            path.move(currX, currY, false, currData);
                        } else {
                            if (options.postpone) {
                                path.line(currX, prevY, false, prevData);
                            } else {
                                path.line(prevX, currY, false, currData);
                            }
                            path.line(currX, currY, false, currData);
                        }
                        prevX = currX;
                        prevY = currY;
                        prevData = currData;
                    } else if (!options.fillHoles) {
                        prevX = prevY = prevData = undefined;
                    }
                }
                return path;
            };
        };
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        Chartist.EventEmitter = function() {
            var handlers = [];

            function addEventHandler(event, handler) {
                handlers[event] = handlers[event] || [];
                handlers[event].push(handler);
            }

            function removeEventHandler(event, handler) {
                if (handlers[event]) {
                    if (handler) {
                        handlers[event].splice(handlers[event].indexOf(handler), 1);
                        if (handlers[event].length === 0) {
                            delete handlers[event];
                        }
                    } else {
                        delete handlers[event];
                    }
                }
            }

            function emit(event, data) {
                if (handlers[event]) {
                    handlers[event].forEach(function(handler) {
                        handler(data);
                    });
                }
                if (handlers['*']) {
                    handlers['*'].forEach(function(starHandler) {
                        starHandler(event, data);
                    });
                }
            }
            return {
                addEventHandler: addEventHandler,
                removeEventHandler: removeEventHandler,
                emit: emit
            };
        };
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';

        function listToArray(list) {
            var arr = [];
            if (list.length) {
                for (var i = 0; i < list.length; i++) {
                    arr.push(list[i]);
                }
            }
            return arr;
        }

        function extend(properties, superProtoOverride) {
            var superProto = superProtoOverride || this.prototype || Chartist.Class;
            var proto = Object.create(superProto);
            Chartist.Class.cloneDefinitions(proto, properties);
            var constr = function() {
                var fn = proto.constructor || function() {},
                    instance;
                instance = this === Chartist ? Object.create(proto) : this;
                fn.apply(instance, Array.prototype.slice.call(arguments, 0));
                return instance;
            };
            constr.prototype = proto;
            constr.super = superProto;
            constr.extend = this.extend;
            return constr;
        }

        function cloneDefinitions() {
            var args = listToArray(arguments);
            var target = args[0];
            args.splice(1, args.length - 1).forEach(function(source) {
                Object.getOwnPropertyNames(source).forEach(function(propName) {
                    delete target[propName];
                    Object.defineProperty(target, propName, Object.getOwnPropertyDescriptor(source, propName));
                });
            });
            return target;
        }
        Chartist.Class = {
            extend: extend,
            cloneDefinitions: cloneDefinitions
        };
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';

        function update(data, options, override) {
            if (data) {
                this.data = data || {};
                this.data.labels = this.data.labels || [];
                this.data.series = this.data.series || [];
                this.eventEmitter.emit('data', {
                    type: 'update',
                    data: this.data
                });
            }
            if (options) {
                this.options = Chartist.extend({}, override ? this.options : this.defaultOptions, options);
                if (!this.initializeTimeoutId) {
                    this.optionsProvider.removeMediaQueryListeners();
                    this.optionsProvider = Chartist.optionsProvider(this.options, this.responsiveOptions, this.eventEmitter);
                }
            }
            if (!this.initializeTimeoutId) {
                this.createChart(this.optionsProvider.getCurrentOptions());
            }
            return this;
        }

        function detach() {
            if (!this.initializeTimeoutId) {
                window.removeEventListener('resize', this.resizeListener);
                this.optionsProvider.removeMediaQueryListeners();
            } else {
                window.clearTimeout(this.initializeTimeoutId);
            }
            return this;
        }

        function on(event, handler) {
            this.eventEmitter.addEventHandler(event, handler);
            return this;
        }

        function off(event, handler) {
            this.eventEmitter.removeEventHandler(event, handler);
            return this;
        }

        function initialize() {
            window.addEventListener('resize', this.resizeListener);
            this.optionsProvider = Chartist.optionsProvider(this.options, this.responsiveOptions, this.eventEmitter);
            this.eventEmitter.addEventHandler('optionsChanged', function() {
                this.update();
            }.bind(this));
            if (this.options.plugins) {
                this.options.plugins.forEach(function(plugin) {
                    if (plugin instanceof Array) {
                        plugin[0](this, plugin[1]);
                    } else {
                        plugin(this);
                    }
                }.bind(this));
            }
            this.eventEmitter.emit('data', {
                type: 'initial',
                data: this.data
            });
            this.createChart(this.optionsProvider.getCurrentOptions());
            this.initializeTimeoutId = undefined;
        }

        function Base(query, data, defaultOptions, options, responsiveOptions) {
            this.container = Chartist.querySelector(query);
            this.data = data || {};
            this.data.labels = this.data.labels || [];
            this.data.series = this.data.series || [];
            this.defaultOptions = defaultOptions;
            this.options = options;
            this.responsiveOptions = responsiveOptions;
            this.eventEmitter = Chartist.EventEmitter();
            this.supportsForeignObject = Chartist.Svg.isSupported('Extensibility');
            this.supportsAnimations = Chartist.Svg.isSupported('AnimationEventsAttribute');
            this.resizeListener = function resizeListener() {
                this.update();
            }.bind(this);
            if (this.container) {
                if (this.container.__chartist__) {
                    this.container.__chartist__.detach();
                }
                this.container.__chartist__ = this;
            }
            this.initializeTimeoutId = setTimeout(initialize.bind(this), 0);
        }
        Chartist.Base = Chartist.Class.extend({
            constructor: Base,
            optionsProvider: undefined,
            container: undefined,
            svg: undefined,
            eventEmitter: undefined,
            createChart: function() {
                throw new Error('Base chart type can\'t be instantiated!');
            },
            update: update,
            detach: detach,
            on: on,
            off: off,
            version: Chartist.version,
            supportsForeignObject: false
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';

        function Svg(name, attributes, className, parent, insertFirst) {
            if (name instanceof Element) {
                this._node = name;
            } else {
                this._node = document.createElementNS(Chartist.namespaces.svg, name);
                if (name === 'svg') {
                    this.attr({
                        'xmlns:ct': Chartist.namespaces.ct
                    });
                }
            }
            if (attributes) {
                this.attr(attributes);
            }
            if (className) {
                this.addClass(className);
            }
            if (parent) {
                if (insertFirst && parent._node.firstChild) {
                    parent._node.insertBefore(this._node, parent._node.firstChild);
                } else {
                    parent._node.appendChild(this._node);
                }
            }
        }

        function attr(attributes, ns) {
            if (typeof attributes === 'string') {
                if (ns) {
                    return this._node.getAttributeNS(ns, attributes);
                } else {
                    return this._node.getAttribute(attributes);
                }
            }
            Object.keys(attributes).forEach(function(key) {
                if (attributes[key] === undefined) {
                    return;
                }
                if (key.indexOf(':') !== -1) {
                    var namespacedAttribute = key.split(':');
                    this._node.setAttributeNS(Chartist.namespaces[namespacedAttribute[0]], key, attributes[key]);
                } else {
                    this._node.setAttribute(key, attributes[key]);
                }
            }.bind(this));
            return this;
        }

        function elem(name, attributes, className, insertFirst) {
            return new Chartist.Svg(name, attributes, className, this, insertFirst);
        }

        function parent() {
            return this._node.parentNode instanceof SVGElement ? new Chartist.Svg(this._node.parentNode) : null;
        }

        function root() {
            var node = this._node;
            while (node.nodeName !== 'svg') {
                node = node.parentNode;
            }
            return new Chartist.Svg(node);
        }

        function querySelector(selector) {
            var foundNode = this._node.querySelector(selector);
            return foundNode ? new Chartist.Svg(foundNode) : null;
        }

        function querySelectorAll(selector) {
            var foundNodes = this._node.querySelectorAll(selector);
            return foundNodes.length ? new Chartist.Svg.List(foundNodes) : null;
        }

        function getNode() {
            return this._node;
        }

        function foreignObject(content, attributes, className, insertFirst) {
            if (typeof content === 'string') {
                var container = document.createElement('div');
                container.innerHTML = content;
                content = container.firstChild;
            }
            content.setAttribute('xmlns', Chartist.namespaces.xmlns);
            var fnObj = this.elem('foreignObject', attributes, className, insertFirst);
            fnObj._node.appendChild(content);
            return fnObj;
        }

        function text(t) {
            this._node.appendChild(document.createTextNode(t));
            return this;
        }

        function empty() {
            while (this._node.firstChild) {
                this._node.removeChild(this._node.firstChild);
            }
            return this;
        }

        function remove() {
            this._node.parentNode.removeChild(this._node);
            return this.parent();
        }

        function replace(newElement) {
            this._node.parentNode.replaceChild(newElement._node, this._node);
            return newElement;
        }

        function append(element, insertFirst) {
            if (insertFirst && this._node.firstChild) {
                this._node.insertBefore(element._node, this._node.firstChild);
            } else {
                this._node.appendChild(element._node);
            }
            return this;
        }

        function classes() {
            return this._node.getAttribute('class') ? this._node.getAttribute('class').trim().split(/\s+/) : [];
        }

        function addClass(names) {
            this._node.setAttribute('class', this.classes(this._node).concat(names.trim().split(/\s+/)).filter(function(elem, pos, self) {
                return self.indexOf(elem) === pos;
            }).join(' '));
            return this;
        }

        function removeClass(names) {
            var removedClasses = names.trim().split(/\s+/);
            this._node.setAttribute('class', this.classes(this._node).filter(function(name) {
                return removedClasses.indexOf(name) === -1;
            }).join(' '));
            return this;
        }

        function removeAllClasses() {
            this._node.setAttribute('class', '');
            return this;
        }

        function height() {
            return this._node.getBoundingClientRect().height;
        }

        function width() {
            return this._node.getBoundingClientRect().width;
        }

        function animate(animations, guided, eventEmitter) {
            if (guided === undefined) {
                guided = true;
            }
            Object.keys(animations).forEach(function createAnimateForAttributes(attribute) {
                function createAnimate(animationDefinition, guided) {
                    var attributeProperties = {},
                        animate, timeout, easing;
                    if (animationDefinition.easing) {
                        easing = animationDefinition.easing instanceof Array ? animationDefinition.easing : Chartist.Svg.Easing[animationDefinition.easing];
                        delete animationDefinition.easing;
                    }
                    animationDefinition.begin = Chartist.ensureUnit(animationDefinition.begin, 'ms');
                    animationDefinition.dur = Chartist.ensureUnit(animationDefinition.dur, 'ms');
                    if (easing) {
                        animationDefinition.calcMode = 'spline';
                        animationDefinition.keySplines = easing.join(' ');
                        animationDefinition.keyTimes = '0;1';
                    }
                    if (guided) {
                        animationDefinition.fill = 'freeze';
                        attributeProperties[attribute] = animationDefinition.from;
                        this.attr(attributeProperties);
                        timeout = Chartist.quantity(animationDefinition.begin || 0).value;
                        animationDefinition.begin = 'indefinite';
                    }
                    animate = this.elem('animate', Chartist.extend({
                        attributeName: attribute
                    }, animationDefinition));
                    if (guided) {
                        setTimeout(function() {
                            try {
                                animate._node.beginElement();
                            } catch (err) {
                                attributeProperties[attribute] = animationDefinition.to;
                                this.attr(attributeProperties);
                                animate.remove();
                            }
                        }.bind(this), timeout);
                    }
                    if (eventEmitter) {
                        animate._node.addEventListener('beginEvent', function handleBeginEvent() {
                            eventEmitter.emit('animationBegin', {
                                element: this,
                                animate: animate._node,
                                params: animationDefinition
                            });
                        }.bind(this));
                    }
                    animate._node.addEventListener('endEvent', function handleEndEvent() {
                        if (eventEmitter) {
                            eventEmitter.emit('animationEnd', {
                                element: this,
                                animate: animate._node,
                                params: animationDefinition
                            });
                        }
                        if (guided) {
                            attributeProperties[attribute] = animationDefinition.to;
                            this.attr(attributeProperties);
                            animate.remove();
                        }
                    }.bind(this));
                }
                if (animations[attribute] instanceof Array) {
                    animations[attribute].forEach(function(animationDefinition) {
                        createAnimate.bind(this)(animationDefinition, false);
                    }.bind(this));
                } else {
                    createAnimate.bind(this)(animations[attribute], guided);
                }
            }.bind(this));
            return this;
        }
        Chartist.Svg = Chartist.Class.extend({
            constructor: Svg,
            attr: attr,
            elem: elem,
            parent: parent,
            root: root,
            querySelector: querySelector,
            querySelectorAll: querySelectorAll,
            getNode: getNode,
            foreignObject: foreignObject,
            text: text,
            empty: empty,
            remove: remove,
            replace: replace,
            append: append,
            classes: classes,
            addClass: addClass,
            removeClass: removeClass,
            removeAllClasses: removeAllClasses,
            height: height,
            width: width,
            animate: animate
        });
        Chartist.Svg.isSupported = function(feature) {
            return document.implementation.hasFeature('http://www.w3.org/TR/SVG11/feature#' + feature, '1.1');
        };
        var easingCubicBeziers = {
            easeInSine: [0.47, 0, 0.745, 0.715],
            easeOutSine: [0.39, 0.575, 0.565, 1],
            easeInOutSine: [0.445, 0.05, 0.55, 0.95],
            easeInQuad: [0.55, 0.085, 0.68, 0.53],
            easeOutQuad: [0.25, 0.46, 0.45, 0.94],
            easeInOutQuad: [0.455, 0.03, 0.515, 0.955],
            easeInCubic: [0.55, 0.055, 0.675, 0.19],
            easeOutCubic: [0.215, 0.61, 0.355, 1],
            easeInOutCubic: [0.645, 0.045, 0.355, 1],
            easeInQuart: [0.895, 0.03, 0.685, 0.22],
            easeOutQuart: [0.165, 0.84, 0.44, 1],
            easeInOutQuart: [0.77, 0, 0.175, 1],
            easeInQuint: [0.755, 0.05, 0.855, 0.06],
            easeOutQuint: [0.23, 1, 0.32, 1],
            easeInOutQuint: [0.86, 0, 0.07, 1],
            easeInExpo: [0.95, 0.05, 0.795, 0.035],
            easeOutExpo: [0.19, 1, 0.22, 1],
            easeInOutExpo: [1, 0, 0, 1],
            easeInCirc: [0.6, 0.04, 0.98, 0.335],
            easeOutCirc: [0.075, 0.82, 0.165, 1],
            easeInOutCirc: [0.785, 0.135, 0.15, 0.86],
            easeInBack: [0.6, -0.28, 0.735, 0.045],
            easeOutBack: [0.175, 0.885, 0.32, 1.275],
            easeInOutBack: [0.68, -0.55, 0.265, 1.55]
        };
        Chartist.Svg.Easing = easingCubicBeziers;

        function SvgList(nodeList) {
            var list = this;
            this.svgElements = [];
            for (var i = 0; i < nodeList.length; i++) {
                this.svgElements.push(new Chartist.Svg(nodeList[i]));
            }
            Object.keys(Chartist.Svg.prototype).filter(function(prototypeProperty) {
                return ['constructor', 'parent', 'querySelector', 'querySelectorAll', 'replace', 'append', 'classes', 'height', 'width'].indexOf(prototypeProperty) === -1;
            }).forEach(function(prototypeProperty) {
                list[prototypeProperty] = function() {
                    var args = Array.prototype.slice.call(arguments, 0);
                    list.svgElements.forEach(function(element) {
                        Chartist.Svg.prototype[prototypeProperty].apply(element, args);
                    });
                    return list;
                };
            });
        }
        Chartist.Svg.List = Chartist.Class.extend({
            constructor: SvgList
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        var elementDescriptions = {
            m: ['x', 'y'],
            l: ['x', 'y'],
            c: ['x1', 'y1', 'x2', 'y2', 'x', 'y'],
            a: ['rx', 'ry', 'xAr', 'lAf', 'sf', 'x', 'y']
        };
        var defaultOptions = {
            accuracy: 3
        };

        function element(command, params, pathElements, pos, relative, data) {
            var pathElement = Chartist.extend({
                command: relative ? command.toLowerCase() : command.toUpperCase()
            }, params, data ? {
                data: data
            } : {});
            pathElements.splice(pos, 0, pathElement);
        }

        function forEachParam(pathElements, cb) {
            pathElements.forEach(function(pathElement, pathElementIndex) {
                elementDescriptions[pathElement.command.toLowerCase()].forEach(function(paramName, paramIndex) {
                    cb(pathElement, paramName, pathElementIndex, paramIndex, pathElements);
                });
            });
        }

        function SvgPath(close, options) {
            this.pathElements = [];
            this.pos = 0;
            this.close = close;
            this.options = Chartist.extend({}, defaultOptions, options);
        }

        function position(pos) {
            if (pos !== undefined) {
                this.pos = Math.max(0, Math.min(this.pathElements.length, pos));
                return this;
            } else {
                return this.pos;
            }
        }

        function remove(count) {
            this.pathElements.splice(this.pos, count);
            return this;
        }

        function move(x, y, relative, data) {
            element('M', {
                x: +x,
                y: +y
            }, this.pathElements, this.pos++, relative, data);
            return this;
        }

        function line(x, y, relative, data) {
            element('L', {
                x: +x,
                y: +y
            }, this.pathElements, this.pos++, relative, data);
            return this;
        }

        function curve(x1, y1, x2, y2, x, y, relative, data) {
            element('C', {
                x1: +x1,
                y1: +y1,
                x2: +x2,
                y2: +y2,
                x: +x,
                y: +y
            }, this.pathElements, this.pos++, relative, data);
            return this;
        }

        function arc(rx, ry, xAr, lAf, sf, x, y, relative, data) {
            element('A', {
                rx: +rx,
                ry: +ry,
                xAr: +xAr,
                lAf: +lAf,
                sf: +sf,
                x: +x,
                y: +y
            }, this.pathElements, this.pos++, relative, data);
            return this;
        }

        function parse(path) {
            var chunks = path.replace(/([A-Za-z])([0-9])/g, '$1 $2').replace(/([0-9])([A-Za-z])/g, '$1 $2').split(/[\s,]+/).reduce(function(result, element) {
                if (element.match(/[A-Za-z]/)) {
                    result.push([]);
                }
                result[result.length - 1].push(element);
                return result;
            }, []);
            if (chunks[chunks.length - 1][0].toUpperCase() === 'Z') {
                chunks.pop();
            }
            var elements = chunks.map(function(chunk) {
                var command = chunk.shift(),
                    description = elementDescriptions[command.toLowerCase()];
                return Chartist.extend({
                    command: command
                }, description.reduce(function(result, paramName, index) {
                    result[paramName] = +chunk[index];
                    return result;
                }, {}));
            });
            var spliceArgs = [this.pos, 0];
            Array.prototype.push.apply(spliceArgs, elements);
            Array.prototype.splice.apply(this.pathElements, spliceArgs);
            this.pos += elements.length;
            return this;
        }

        function stringify() {
            var accuracyMultiplier = Math.pow(10, this.options.accuracy);
            return this.pathElements.reduce(function(path, pathElement) {
                var params = elementDescriptions[pathElement.command.toLowerCase()].map(function(paramName) {
                    return this.options.accuracy ? (Math.round(pathElement[paramName] * accuracyMultiplier) / accuracyMultiplier) : pathElement[paramName];
                }.bind(this));
                return path + pathElement.command + params.join(',');
            }.bind(this), '') + (this.close ? 'Z' : '');
        }

        function scale(x, y) {
            forEachParam(this.pathElements, function(pathElement, paramName) {
                pathElement[paramName] *= paramName[0] === 'x' ? x : y;
            });
            return this;
        }

        function translate(x, y) {
            forEachParam(this.pathElements, function(pathElement, paramName) {
                pathElement[paramName] += paramName[0] === 'x' ? x : y;
            });
            return this;
        }

        function transform(transformFnc) {
            forEachParam(this.pathElements, function(pathElement, paramName, pathElementIndex, paramIndex, pathElements) {
                var transformed = transformFnc(pathElement, paramName, pathElementIndex, paramIndex, pathElements);
                if (transformed || transformed === 0) {
                    pathElement[paramName] = transformed;
                }
            });
            return this;
        }

        function clone(close) {
            var c = new Chartist.Svg.Path(close || this.close);
            c.pos = this.pos;
            c.pathElements = this.pathElements.slice().map(function cloneElements(pathElement) {
                return Chartist.extend({}, pathElement);
            });
            c.options = Chartist.extend({}, this.options);
            return c;
        }

        function splitByCommand(command) {
            var split = [new Chartist.Svg.Path()];
            this.pathElements.forEach(function(pathElement) {
                if (pathElement.command === command.toUpperCase() && split[split.length - 1].pathElements.length !== 0) {
                    split.push(new Chartist.Svg.Path());
                }
                split[split.length - 1].pathElements.push(pathElement);
            });
            return split;
        }

        function join(paths, close, options) {
            var joinedPath = new Chartist.Svg.Path(close, options);
            for (var i = 0; i < paths.length; i++) {
                var path = paths[i];
                for (var j = 0; j < path.pathElements.length; j++) {
                    joinedPath.pathElements.push(path.pathElements[j]);
                }
            }
            return joinedPath;
        }
        Chartist.Svg.Path = Chartist.Class.extend({
            constructor: SvgPath,
            position: position,
            remove: remove,
            move: move,
            line: line,
            curve: curve,
            arc: arc,
            scale: scale,
            translate: translate,
            transform: transform,
            parse: parse,
            stringify: stringify,
            clone: clone,
            splitByCommand: splitByCommand
        });
        Chartist.Svg.Path.elementDescriptions = elementDescriptions;
        Chartist.Svg.Path.join = join;
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        var axisUnits = {
            x: {
                pos: 'x',
                len: 'width',
                dir: 'horizontal',
                rectStart: 'x1',
                rectEnd: 'x2',
                rectOffset: 'y2'
            },
            y: {
                pos: 'y',
                len: 'height',
                dir: 'vertical',
                rectStart: 'y2',
                rectEnd: 'y1',
                rectOffset: 'x1'
            }
        };

        function Axis(units, chartRect, ticks, options) {
            this.units = units;
            this.counterUnits = units === axisUnits.x ? axisUnits.y : axisUnits.x;
            this.chartRect = chartRect;
            this.axisLength = chartRect[units.rectEnd] - chartRect[units.rectStart];
            this.gridOffset = chartRect[units.rectOffset];
            this.ticks = ticks;
            this.options = options;
        }

        function createGridAndLabels(gridGroup, labelGroup, useForeignObject, chartOptions, eventEmitter) {
            var axisOptions = chartOptions['axis' + this.units.pos.toUpperCase()];
            var projectedValues = this.ticks.map(this.projectValue.bind(this));
            var labelValues = this.ticks.map(axisOptions.labelInterpolationFnc);
            projectedValues.forEach(function(projectedValue, index) {
                var labelOffset = {
                    x: 0,
                    y: 0
                };
                var labelLength;
                if (projectedValues[index + 1]) {
                    labelLength = projectedValues[index + 1] - projectedValue;
                } else {
                    labelLength = Math.max(this.axisLength - projectedValue, 30);
                }
                if (Chartist.isFalseyButZero(labelValues[index]) && labelValues[index] !== '') {
                    return;
                }
                if (this.units.pos === 'x') {
                    projectedValue = this.chartRect.x1 + projectedValue;
                    labelOffset.x = chartOptions.axisX.labelOffset.x;
                    if (chartOptions.axisX.position === 'start') {
                        labelOffset.y = this.chartRect.padding.top + chartOptions.axisX.labelOffset.y + (useForeignObject ? 5 : 20);
                    } else {
                        labelOffset.y = this.chartRect.y1 + chartOptions.axisX.labelOffset.y + (useForeignObject ? 5 : 20);
                    }
                } else {
                    projectedValue = this.chartRect.y1 - projectedValue;
                    labelOffset.y = chartOptions.axisY.labelOffset.y - (useForeignObject ? labelLength : 0);
                    if (chartOptions.axisY.position === 'start') {
                        labelOffset.x = useForeignObject ? this.chartRect.padding.left + chartOptions.axisY.labelOffset.x : this.chartRect.x1 - 10;
                    } else {
                        labelOffset.x = this.chartRect.x2 + chartOptions.axisY.labelOffset.x + 10;
                    }
                }
                if (axisOptions.showGrid) {
                    Chartist.createGrid(projectedValue, index, this, this.gridOffset, this.chartRect[this.counterUnits.len](), gridGroup, [chartOptions.classNames.grid, chartOptions.classNames[this.units.dir]], eventEmitter);
                }
                if (axisOptions.showLabel) {
                    Chartist.createLabel(projectedValue, labelLength, index, labelValues, this, axisOptions.offset, labelOffset, labelGroup, [chartOptions.classNames.label, chartOptions.classNames[this.units.dir], (axisOptions.position === 'start' ? chartOptions.classNames[axisOptions.position] : chartOptions.classNames['end'])], useForeignObject, eventEmitter);
                }
            }.bind(this));
        }
        Chartist.Axis = Chartist.Class.extend({
            constructor: Axis,
            createGridAndLabels: createGridAndLabels,
            projectValue: function(value, index, data) {
                throw new Error('Base axis can\'t be instantiated!');
            }
        });
        Chartist.Axis.units = axisUnits;
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';

        function AutoScaleAxis(axisUnit, data, chartRect, options) {
            var highLow = options.highLow || Chartist.getHighLow(data, options, axisUnit.pos);
            this.bounds = Chartist.getBounds(chartRect[axisUnit.rectEnd] - chartRect[axisUnit.rectStart], highLow, options.scaleMinSpace || 20, options.onlyInteger);
            this.range = {
                min: this.bounds.min,
                max: this.bounds.max
            };
            Chartist.AutoScaleAxis.super.constructor.call(this, axisUnit, chartRect, this.bounds.values, options);
        }

        function projectValue(value) {
            return this.axisLength * (+Chartist.getMultiValue(value, this.units.pos) - this.bounds.min) / this.bounds.range;
        }
        Chartist.AutoScaleAxis = Chartist.Axis.extend({
            constructor: AutoScaleAxis,
            projectValue: projectValue
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';

        function FixedScaleAxis(axisUnit, data, chartRect, options) {
            var highLow = options.highLow || Chartist.getHighLow(data, options, axisUnit.pos);
            this.divisor = options.divisor || 1;
            this.ticks = options.ticks || Chartist.times(this.divisor).map(function(value, index) {
                return highLow.low + (highLow.high - highLow.low) / this.divisor * index;
            }.bind(this));
            this.ticks.sort(function(a, b) {
                return a - b;
            });
            this.range = {
                min: highLow.low,
                max: highLow.high
            };
            Chartist.FixedScaleAxis.super.constructor.call(this, axisUnit, chartRect, this.ticks, options);
            this.stepLength = this.axisLength / this.divisor;
        }

        function projectValue(value) {
            return this.axisLength * (+Chartist.getMultiValue(value, this.units.pos) - this.range.min) / (this.range.max - this.range.min);
        }
        Chartist.FixedScaleAxis = Chartist.Axis.extend({
            constructor: FixedScaleAxis,
            projectValue: projectValue
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';

        function StepAxis(axisUnit, data, chartRect, options) {
            Chartist.StepAxis.super.constructor.call(this, axisUnit, chartRect, options.ticks, options);
            var calc = Math.max(1, options.ticks.length - (options.stretch ? 1 : 0));
            this.stepLength = this.axisLength / calc;
        }

        function projectValue(value, index) {
            return this.stepLength * index;
        }
        Chartist.StepAxis = Chartist.Axis.extend({
            constructor: StepAxis,
            projectValue: projectValue
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        var defaultOptions = {
            axisX: {
                offset: 30,
                position: 'end',
                labelOffset: {
                    x: 0,
                    y: 0
                },
                showLabel: true,
                showGrid: true,
                labelInterpolationFnc: Chartist.noop,
                type: undefined
            },
            axisY: {
                offset: 40,
                position: 'start',
                labelOffset: {
                    x: 0,
                    y: 0
                },
                showLabel: true,
                showGrid: true,
                labelInterpolationFnc: Chartist.noop,
                type: undefined,
                scaleMinSpace: 20,
                onlyInteger: false
            },
            width: undefined,
            height: undefined,
            showLine: true,
            showPoint: true,
            showArea: false,
            areaBase: 0,
            lineSmooth: true,
            showGridBackground: false,
            low: undefined,
            high: undefined,
            chartPadding: {
                top: 15,
                right: 15,
                bottom: 5,
                left: 10
            },
            fullWidth: false,
            reverseData: false,
            classNames: {
                chart: 'ct-chart-line',
                label: 'ct-label',
                labelGroup: 'ct-labels',
                series: 'ct-series',
                line: 'ct-line',
                point: 'ct-point',
                area: 'ct-area',
                grid: 'ct-grid',
                gridGroup: 'ct-grids',
                gridBackground: 'ct-grid-background',
                vertical: 'ct-vertical',
                horizontal: 'ct-horizontal',
                start: 'ct-start',
                end: 'ct-end'
            }
        };

        function createChart(options) {
            var data = Chartist.normalizeData(this.data, options.reverseData, true);
            this.svg = Chartist.createSvg(this.container, options.width, options.height, options.classNames.chart);
            var gridGroup = this.svg.elem('g').addClass(options.classNames.gridGroup);
            var seriesGroup = this.svg.elem('g');
            var labelGroup = this.svg.elem('g').addClass(options.classNames.labelGroup);
            var chartRect = Chartist.createChartRect(this.svg, options, defaultOptions.padding);
            var axisX, axisY;
            if (options.axisX.type === undefined) {
                axisX = new Chartist.StepAxis(Chartist.Axis.units.x, data.normalized.series, chartRect, Chartist.extend({}, options.axisX, {
                    ticks: data.normalized.labels,
                    stretch: options.fullWidth
                }));
            } else {
                axisX = options.axisX.type.call(Chartist, Chartist.Axis.units.x, data.normalized.series, chartRect, options.axisX);
            }
            if (options.axisY.type === undefined) {
                axisY = new Chartist.AutoScaleAxis(Chartist.Axis.units.y, data.normalized.series, chartRect, Chartist.extend({}, options.axisY, {
                    high: Chartist.isNumeric(options.high) ? options.high : options.axisY.high,
                    low: Chartist.isNumeric(options.low) ? options.low : options.axisY.low
                }));
            } else {
                axisY = options.axisY.type.call(Chartist, Chartist.Axis.units.y, data.normalized.series, chartRect, options.axisY);
            }
            axisX.createGridAndLabels(gridGroup, labelGroup, this.supportsForeignObject, options, this.eventEmitter);
            axisY.createGridAndLabels(gridGroup, labelGroup, this.supportsForeignObject, options, this.eventEmitter);
            if (options.showGridBackground) {
                Chartist.createGridBackground(gridGroup, chartRect, options.classNames.gridBackground, this.eventEmitter);
            }
            data.raw.series.forEach(function(series, seriesIndex) {
                var seriesElement = seriesGroup.elem('g');
                seriesElement.attr({
                    'ct:series-name': series.name,
                    'ct:meta': Chartist.serialize(series.meta)
                });
                seriesElement.addClass([options.classNames.series, (series.className || options.classNames.series + '-' + Chartist.alphaNumerate(seriesIndex))].join(' '));
                var pathCoordinates = [],
                    pathData = [];
                data.normalized.series[seriesIndex].forEach(function(value, valueIndex) {
                    var p = {
                        x: chartRect.x1 + axisX.projectValue(value, valueIndex, data.normalized.series[seriesIndex]),
                        y: chartRect.y1 - axisY.projectValue(value, valueIndex, data.normalized.series[seriesIndex])
                    };
                    pathCoordinates.push(p.x, p.y);
                    pathData.push({
                        value: value,
                        valueIndex: valueIndex,
                        meta: Chartist.getMetaData(series, valueIndex)
                    });
                }.bind(this));
                var seriesOptions = {
                    lineSmooth: Chartist.getSeriesOption(series, options, 'lineSmooth'),
                    showPoint: Chartist.getSeriesOption(series, options, 'showPoint'),
                    showLine: Chartist.getSeriesOption(series, options, 'showLine'),
                    showArea: Chartist.getSeriesOption(series, options, 'showArea'),
                    areaBase: Chartist.getSeriesOption(series, options, 'areaBase')
                };
                var smoothing = typeof seriesOptions.lineSmooth === 'function' ? seriesOptions.lineSmooth : (seriesOptions.lineSmooth ? Chartist.Interpolation.monotoneCubic() : Chartist.Interpolation.none());
                var path = smoothing(pathCoordinates, pathData);
                if (seriesOptions.showPoint) {
                    path.pathElements.forEach(function(pathElement) {
                        var point = seriesElement.elem('line', {
                            x1: pathElement.x,
                            y1: pathElement.y,
                            x2: pathElement.x + 0.01,
                            y2: pathElement.y
                        }, options.classNames.point).attr({
                            'ct:value': [pathElement.data.value.x, pathElement.data.value.y].filter(Chartist.isNumeric).join(','),
                            'ct:meta': Chartist.serialize(pathElement.data.meta)
                        });
                        this.eventEmitter.emit('draw', {
                            type: 'point',
                            value: pathElement.data.value,
                            index: pathElement.data.valueIndex,
                            meta: pathElement.data.meta,
                            series: series,
                            seriesIndex: seriesIndex,
                            axisX: axisX,
                            axisY: axisY,
                            group: seriesElement,
                            element: point,
                            x: pathElement.x,
                            y: pathElement.y
                        });
                    }.bind(this));
                }
                if (seriesOptions.showLine) {
                    var line = seriesElement.elem('path', {
                        d: path.stringify()
                    }, options.classNames.line, true);
                    this.eventEmitter.emit('draw', {
                        type: 'line',
                        values: data.normalized.series[seriesIndex],
                        path: path.clone(),
                        chartRect: chartRect,
                        index: seriesIndex,
                        series: series,
                        seriesIndex: seriesIndex,
                        seriesMeta: series.meta,
                        axisX: axisX,
                        axisY: axisY,
                        group: seriesElement,
                        element: line
                    });
                }
                if (seriesOptions.showArea && axisY.range) {
                    var areaBase = Math.max(Math.min(seriesOptions.areaBase, axisY.range.max), axisY.range.min);
                    var areaBaseProjected = chartRect.y1 - axisY.projectValue(areaBase);
                    path.splitByCommand('M').filter(function onlySolidSegments(pathSegment) {
                        return pathSegment.pathElements.length > 1;
                    }).map(function convertToArea(solidPathSegments) {
                        var firstElement = solidPathSegments.pathElements[0];
                        var lastElement = solidPathSegments.pathElements[solidPathSegments.pathElements.length - 1];
                        return solidPathSegments.clone(true).position(0).remove(1).move(firstElement.x, areaBaseProjected).line(firstElement.x, firstElement.y).position(solidPathSegments.pathElements.length + 1).line(lastElement.x, areaBaseProjected);
                    }).forEach(function createArea(areaPath) {
                        var area = seriesElement.elem('path', {
                            d: areaPath.stringify()
                        }, options.classNames.area, true);
                        this.eventEmitter.emit('draw', {
                            type: 'area',
                            values: data.normalized.series[seriesIndex],
                            path: areaPath.clone(),
                            series: series,
                            seriesIndex: seriesIndex,
                            axisX: axisX,
                            axisY: axisY,
                            chartRect: chartRect,
                            index: seriesIndex,
                            group: seriesElement,
                            element: area
                        });
                    }.bind(this));
                }
            }.bind(this));
            this.eventEmitter.emit('created', {
                bounds: axisY.bounds,
                chartRect: chartRect,
                axisX: axisX,
                axisY: axisY,
                svg: this.svg,
                options: options
            });
        }

        function Line(query, data, options, responsiveOptions) {
            Chartist.Line.super.constructor.call(this, query, data, defaultOptions, Chartist.extend({}, defaultOptions, options), responsiveOptions);
        }
        Chartist.Line = Chartist.Base.extend({
            constructor: Line,
            createChart: createChart
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        var defaultOptions = {
            axisX: {
                offset: 30,
                position: 'end',
                labelOffset: {
                    x: 0,
                    y: 0
                },
                showLabel: true,
                showGrid: true,
                labelInterpolationFnc: Chartist.noop,
                scaleMinSpace: 30,
                onlyInteger: false
            },
            axisY: {
                offset: 40,
                position: 'start',
                labelOffset: {
                    x: 0,
                    y: 0
                },
                showLabel: true,
                showGrid: true,
                labelInterpolationFnc: Chartist.noop,
                scaleMinSpace: 20,
                onlyInteger: false
            },
            width: undefined,
            height: undefined,
            high: undefined,
            low: undefined,
            referenceValue: 0,
            chartPadding: {
                top: 15,
                right: 15,
                bottom: 5,
                left: 10
            },
            seriesBarDistance: 15,
            stackBars: false,
            stackMode: 'accumulate',
            horizontalBars: false,
            distributeSeries: false,
            reverseData: false,
            showGridBackground: false,
            classNames: {
                chart: 'ct-chart-bar',
                horizontalBars: 'ct-horizontal-bars',
                label: 'ct-label',
                labelGroup: 'ct-labels',
                series: 'ct-series',
                bar: 'ct-bar',
                grid: 'ct-grid',
                gridGroup: 'ct-grids',
                gridBackground: 'ct-grid-background',
                vertical: 'ct-vertical',
                horizontal: 'ct-horizontal',
                start: 'ct-start',
                end: 'ct-end'
            }
        };

        function createChart(options) {
            var data;
            var highLow;
            if (options.distributeSeries) {
                data = Chartist.normalizeData(this.data, options.reverseData, options.horizontalBars ? 'x' : 'y');
                data.normalized.series = data.normalized.series.map(function(value) {
                    return [value];
                });
            } else {
                data = Chartist.normalizeData(this.data, options.reverseData, options.horizontalBars ? 'x' : 'y');
            }
            this.svg = Chartist.createSvg(this.container, options.width, options.height, options.classNames.chart + (options.horizontalBars ? ' ' + options.classNames.horizontalBars : ''));
            var gridGroup = this.svg.elem('g').addClass(options.classNames.gridGroup);
            var seriesGroup = this.svg.elem('g');
            var labelGroup = this.svg.elem('g').addClass(options.classNames.labelGroup);
            if (options.stackBars && data.normalized.series.length !== 0) {
                var serialSums = Chartist.serialMap(data.normalized.series, function serialSums() {
                    return Array.prototype.slice.call(arguments).map(function(value) {
                        return value;
                    }).reduce(function(prev, curr) {
                        return {
                            x: prev.x + (curr && curr.x) || 0,
                            y: prev.y + (curr && curr.y) || 0
                        };
                    }, {
                        x: 0,
                        y: 0
                    });
                });
                highLow = Chartist.getHighLow([serialSums], options, options.horizontalBars ? 'x' : 'y');
            } else {
                highLow = Chartist.getHighLow(data.normalized.series, options, options.horizontalBars ? 'x' : 'y');
            }
            highLow.high = +options.high || (options.high === 0 ? 0 : highLow.high);
            highLow.low = +options.low || (options.low === 0 ? 0 : highLow.low);
            var chartRect = Chartist.createChartRect(this.svg, options, defaultOptions.padding);
            var valueAxis, labelAxisTicks, labelAxis, axisX, axisY;
            if (options.distributeSeries && options.stackBars) {
                labelAxisTicks = data.normalized.labels.slice(0, 1);
            } else {
                labelAxisTicks = data.normalized.labels;
            }
            if (options.horizontalBars) {
                if (options.axisX.type === undefined) {
                    valueAxis = axisX = new Chartist.AutoScaleAxis(Chartist.Axis.units.x, data.normalized.series, chartRect, Chartist.extend({}, options.axisX, {
                        highLow: highLow,
                        referenceValue: 0
                    }));
                } else {
                    valueAxis = axisX = options.axisX.type.call(Chartist, Chartist.Axis.units.x, data.normalized.series, chartRect, Chartist.extend({}, options.axisX, {
                        highLow: highLow,
                        referenceValue: 0
                    }));
                }
                if (options.axisY.type === undefined) {
                    labelAxis = axisY = new Chartist.StepAxis(Chartist.Axis.units.y, data.normalized.series, chartRect, {
                        ticks: labelAxisTicks
                    });
                } else {
                    labelAxis = axisY = options.axisY.type.call(Chartist, Chartist.Axis.units.y, data.normalized.series, chartRect, options.axisY);
                }
            } else {
                if (options.axisX.type === undefined) {
                    labelAxis = axisX = new Chartist.StepAxis(Chartist.Axis.units.x, data.normalized.series, chartRect, {
                        ticks: labelAxisTicks
                    });
                } else {
                    labelAxis = axisX = options.axisX.type.call(Chartist, Chartist.Axis.units.x, data.normalized.series, chartRect, options.axisX);
                }
                if (options.axisY.type === undefined) {
                    valueAxis = axisY = new Chartist.AutoScaleAxis(Chartist.Axis.units.y, data.normalized.series, chartRect, Chartist.extend({}, options.axisY, {
                        highLow: highLow,
                        referenceValue: 0
                    }));
                } else {
                    valueAxis = axisY = options.axisY.type.call(Chartist, Chartist.Axis.units.y, data.normalized.series, chartRect, Chartist.extend({}, options.axisY, {
                        highLow: highLow,
                        referenceValue: 0
                    }));
                }
            }
            var zeroPoint = options.horizontalBars ? (chartRect.x1 + valueAxis.projectValue(0)) : (chartRect.y1 - valueAxis.projectValue(0));
            var stackedBarValues = [];
            labelAxis.createGridAndLabels(gridGroup, labelGroup, this.supportsForeignObject, options, this.eventEmitter);
            valueAxis.createGridAndLabels(gridGroup, labelGroup, this.supportsForeignObject, options, this.eventEmitter);
            if (options.showGridBackground) {
                Chartist.createGridBackground(gridGroup, chartRect, options.classNames.gridBackground, this.eventEmitter);
            }
            data.raw.series.forEach(function(series, seriesIndex) {
                var biPol = seriesIndex - (data.raw.series.length - 1) / 2;
                var periodHalfLength;
                var seriesElement;
                if (options.distributeSeries && !options.stackBars) {
                    periodHalfLength = labelAxis.axisLength / data.normalized.series.length / 2;
                } else if (options.distributeSeries && options.stackBars) {
                    periodHalfLength = labelAxis.axisLength / 2;
                } else {
                    periodHalfLength = labelAxis.axisLength / data.normalized.series[seriesIndex].length / 2;
                }
                seriesElement = seriesGroup.elem('g');
                seriesElement.attr({
                    'ct:series-name': series.name,
                    'ct:meta': Chartist.serialize(series.meta)
                });
                seriesElement.addClass([options.classNames.series, (series.className || options.classNames.series + '-' + Chartist.alphaNumerate(seriesIndex))].join(' '));
                data.normalized.series[seriesIndex].forEach(function(value, valueIndex) {
                    var projected, bar, previousStack, labelAxisValueIndex;
                    if (options.distributeSeries && !options.stackBars) {
                        labelAxisValueIndex = seriesIndex;
                    } else if (options.distributeSeries && options.stackBars) {
                        labelAxisValueIndex = 0;
                    } else {
                        labelAxisValueIndex = valueIndex;
                    }
                    if (options.horizontalBars) {
                        projected = {
                            x: chartRect.x1 + valueAxis.projectValue(value && value.x ? value.x : 0, valueIndex, data.normalized.series[seriesIndex]),
                            y: chartRect.y1 - labelAxis.projectValue(value && value.y ? value.y : 0, labelAxisValueIndex, data.normalized.series[seriesIndex])
                        };
                    } else {
                        projected = {
                            x: chartRect.x1 + labelAxis.projectValue(value && value.x ? value.x : 0, labelAxisValueIndex, data.normalized.series[seriesIndex]),
                            y: chartRect.y1 - valueAxis.projectValue(value && value.y ? value.y : 0, valueIndex, data.normalized.series[seriesIndex])
                        }
                    }
                    if (labelAxis instanceof Chartist.StepAxis) {
                        if (!labelAxis.options.stretch) {
                            projected[labelAxis.units.pos] += periodHalfLength * (options.horizontalBars ? -1 : 1);
                        }
                        projected[labelAxis.units.pos] += (options.stackBars || options.distributeSeries) ? 0 : biPol * options.seriesBarDistance * (options.horizontalBars ? -1 : 1);
                    }
                    previousStack = stackedBarValues[valueIndex] || zeroPoint;
                    stackedBarValues[valueIndex] = previousStack - (zeroPoint - projected[labelAxis.counterUnits.pos]);
                    if (value === undefined) {
                        return;
                    }
                    var positions = {};
                    positions[labelAxis.units.pos + '1'] = projected[labelAxis.units.pos];
                    positions[labelAxis.units.pos + '2'] = projected[labelAxis.units.pos];
                    if (options.stackBars && (options.stackMode === 'accumulate' || !options.stackMode)) {
                        positions[labelAxis.counterUnits.pos + '1'] = previousStack;
                        positions[labelAxis.counterUnits.pos + '2'] = stackedBarValues[valueIndex];
                    } else {
                        positions[labelAxis.counterUnits.pos + '1'] = zeroPoint;
                        positions[labelAxis.counterUnits.pos + '2'] = projected[labelAxis.counterUnits.pos];
                    }
                    positions.x1 = Math.min(Math.max(positions.x1, chartRect.x1), chartRect.x2);
                    positions.x2 = Math.min(Math.max(positions.x2, chartRect.x1), chartRect.x2);
                    positions.y1 = Math.min(Math.max(positions.y1, chartRect.y2), chartRect.y1);
                    positions.y2 = Math.min(Math.max(positions.y2, chartRect.y2), chartRect.y1);
                    var metaData = Chartist.getMetaData(series, valueIndex);
                    bar = seriesElement.elem('line', positions, options.classNames.bar).attr({
                        'ct:value': [value.x, value.y].filter(Chartist.isNumeric).join(','),
                        'ct:meta': Chartist.serialize(metaData)
                    });
                    this.eventEmitter.emit('draw', Chartist.extend({
                        type: 'bar',
                        value: value,
                        index: valueIndex,
                        meta: metaData,
                        series: series,
                        seriesIndex: seriesIndex,
                        axisX: axisX,
                        axisY: axisY,
                        chartRect: chartRect,
                        group: seriesElement,
                        element: bar
                    }, positions));
                }.bind(this));
            }.bind(this));
            this.eventEmitter.emit('created', {
                bounds: valueAxis.bounds,
                chartRect: chartRect,
                axisX: axisX,
                axisY: axisY,
                svg: this.svg,
                options: options
            });
        }

        function Bar(query, data, options, responsiveOptions) {
            Chartist.Bar.super.constructor.call(this, query, data, defaultOptions, Chartist.extend({}, defaultOptions, options), responsiveOptions);
        }
        Chartist.Bar = Chartist.Base.extend({
            constructor: Bar,
            createChart: createChart
        });
    }(window, document, Chartist));;
    (function(window, document, Chartist) {
        'use strict';
        var defaultOptions = {
            width: undefined,
            height: undefined,
            chartPadding: 5,
            classNames: {
                chartPie: 'ct-chart-pie',
                chartDonut: 'ct-chart-donut',
                series: 'ct-series',
                slicePie: 'ct-slice-pie',
                sliceDonut: 'ct-slice-donut',
                sliceDonutSolid: 'ct-slice-donut-solid',
                label: 'ct-label'
            },
            startAngle: 0,
            total: undefined,
            donut: false,
            donutSolid: false,
            donutWidth: 60,
            showLabel: true,
            labelOffset: 0,
            labelPosition: 'inside',
            labelInterpolationFnc: Chartist.noop,
            labelDirection: 'neutral',
            reverseData: false,
            ignoreEmptyValues: false
        };

        function determineAnchorPosition(center, label, direction) {
            var toTheRight = label.x > center.x;
            if (toTheRight && direction === 'explode' || !toTheRight && direction === 'implode') {
                return 'start';
            } else if (toTheRight && direction === 'implode' || !toTheRight && direction === 'explode') {
                return 'end';
            } else {
                return 'middle';
            }
        }

        function createChart(options) {
            var data = Chartist.normalizeData(this.data);
            var seriesGroups = [],
                labelsGroup, chartRect, radius, labelRadius, totalDataSum, startAngle = options.startAngle;
            this.svg = Chartist.createSvg(this.container, options.width, options.height, options.donut ? options.classNames.chartDonut : options.classNames.chartPie);
            chartRect = Chartist.createChartRect(this.svg, options, defaultOptions.padding);
            radius = Math.min(chartRect.width() / 2, chartRect.height() / 2);
            totalDataSum = options.total || data.normalized.series.reduce(function(previousValue, currentValue) {
                return previousValue + currentValue;
            }, 0);
            var donutWidth = Chartist.quantity(options.donutWidth);
            if (donutWidth.unit === '%') {
                donutWidth.value *= radius / 100;
            }
            radius -= options.donut && !options.donutSolid ? donutWidth.value / 2 : 0;
            if (options.labelPosition === 'outside' || options.donut && !options.donutSolid) {
                labelRadius = radius;
            } else if (options.labelPosition === 'center') {
                labelRadius = 0;
            } else if (options.donutSolid) {
                labelRadius = radius - donutWidth.value / 2;
            } else {
                labelRadius = radius / 2;
            }
            labelRadius += options.labelOffset;
            var center = {
                x: chartRect.x1 + chartRect.width() / 2,
                y: chartRect.y2 + chartRect.height() / 2
            };
            var hasSingleValInSeries = data.raw.series.filter(function(val) {
                return val.hasOwnProperty('value') ? val.value !== 0 : val !== 0;
            }).length === 1;
            data.raw.series.forEach(function(series, index) {
                seriesGroups[index] = this.svg.elem('g', null, null);
            }.bind(this));
            if (options.showLabel) {
                labelsGroup = this.svg.elem('g', null, null);
            }
            data.raw.series.forEach(function(series, index) {
                if (data.normalized.series[index] === 0 && options.ignoreEmptyValues) return;
                seriesGroups[index].attr({
                    'ct:series-name': series.name
                });
                seriesGroups[index].addClass([options.classNames.series, (series.className || options.classNames.series + '-' + Chartist.alphaNumerate(index))].join(' '));
                var endAngle = (totalDataSum > 0 ? startAngle + data.normalized.series[index] / totalDataSum * 360 : 0);
                var overlappigStartAngle = Math.max(0, startAngle - (index === 0 || hasSingleValInSeries ? 0 : 0.2));
                if (endAngle - overlappigStartAngle >= 359.99) {
                    endAngle = overlappigStartAngle + 359.99;
                }
                var start = Chartist.polarToCartesian(center.x, center.y, radius, overlappigStartAngle),
                    end = Chartist.polarToCartesian(center.x, center.y, radius, endAngle);
                var innerStart, innerEnd, donutSolidRadius;
                var path = new Chartist.Svg.Path(!options.donut || options.donutSolid).move(end.x, end.y).arc(radius, radius, 0, endAngle - startAngle > 180, 0, start.x, start.y);
                if (!options.donut) {
                    path.line(center.x, center.y);
                } else if (options.donutSolid) {
                    donutSolidRadius = radius - donutWidth.value;
                    innerStart = Chartist.polarToCartesian(center.x, center.y, donutSolidRadius, startAngle - (index === 0 || hasSingleValInSeries ? 0 : 0.2));
                    innerEnd = Chartist.polarToCartesian(center.x, center.y, donutSolidRadius, endAngle);
                    path.line(innerStart.x, innerStart.y);
                    path.arc(donutSolidRadius, donutSolidRadius, 0, endAngle - startAngle > 180, 1, innerEnd.x, innerEnd.y);
                }
                var pathClassName = options.classNames.slicePie;
                if (options.donut) {
                    pathClassName = options.classNames.sliceDonut;
                    if (options.donutSolid) {
                        pathClassName = options.classNames.sliceDonutSolid;
                    }
                }
                var pathElement = seriesGroups[index].elem('path', {
                    d: path.stringify()
                }, pathClassName);
                pathElement.attr({
                    'ct:value': data.normalized.series[index],
                    'ct:meta': Chartist.serialize(series.meta)
                });
                if (options.donut && !options.donutSolid) {
                    pathElement._node.style.strokeWidth = donutWidth.value + 'px';
                }
                this.eventEmitter.emit('draw', {
                    type: 'slice',
                    value: data.normalized.series[index],
                    totalDataSum: totalDataSum,
                    index: index,
                    meta: series.meta,
                    series: series,
                    group: seriesGroups[index],
                    element: pathElement,
                    path: path.clone(),
                    center: center,
                    radius: radius,
                    startAngle: startAngle,
                    endAngle: endAngle
                });
                if (options.showLabel) {
                    var labelPosition;
                    if (data.raw.series.length === 1) {
                        labelPosition = {
                            x: center.x,
                            y: center.y
                        };
                    } else {
                        labelPosition = Chartist.polarToCartesian(center.x, center.y, labelRadius, startAngle + (endAngle - startAngle) / 2);
                    }
                    var rawValue;
                    if (data.normalized.labels && !Chartist.isFalseyButZero(data.normalized.labels[index])) {
                        rawValue = data.normalized.labels[index];
                    } else {
                        rawValue = data.normalized.series[index];
                    }
                    var interpolatedValue = options.labelInterpolationFnc(rawValue, index);
                    if (interpolatedValue || interpolatedValue === 0) {
                        var labelElement = labelsGroup.elem('text', {
                            dx: labelPosition.x,
                            dy: labelPosition.y,
                            'text-anchor': determineAnchorPosition(center, labelPosition, options.labelDirection)
                        }, options.classNames.label).text('' + interpolatedValue);
                        this.eventEmitter.emit('draw', {
                            type: 'label',
                            index: index,
                            group: labelsGroup,
                            element: labelElement,
                            text: '' + interpolatedValue,
                            x: labelPosition.x,
                            y: labelPosition.y
                        });
                    }
                }
                startAngle = endAngle;
            }.bind(this));
            this.eventEmitter.emit('created', {
                chartRect: chartRect,
                svg: this.svg,
                options: options
            });
        }

        function Pie(query, data, options, responsiveOptions) {
            Chartist.Pie.super.constructor.call(this, query, data, defaultOptions, Chartist.extend({}, defaultOptions, options), responsiveOptions);
        }
        Chartist.Pie = Chartist.Base.extend({
            constructor: Pie,
            createChart: createChart,
            determineAnchorPosition: determineAnchorPosition
        });
    }(window, document, Chartist));
    return Chartist;
}));