/*!
 * jQuery Steps v1.1.0 - 09/04/2014
 * Copyright (c) 2014 Rafael Staib (http://www.jquery-steps.com)
 * Licensed under MIT http://www.opensource.org/licenses/MIT
 */
;
(function($, undefined) {
    $.fn.extend({
        _aria: function(name, value) {
            return this.attr("aria-" + name, value);
        },
        _removeAria: function(name) {
            return this.removeAttr("aria-" + name);
        },
        _enableAria: function(enable) {
            return (enable == null || enable) ? this.removeClass("disabled")._aria("disabled", "false") : this.addClass("disabled")._aria("disabled", "true");
        },
        _showAria: function(show) {
            return (show == null || show) ? this.show()._aria("hidden", "false") : this.hide()._aria("hidden", "true");
        },
        _selectAria: function(select) {
            return (select == null || select) ? this.addClass("current")._aria("selected", "true") : this.removeClass("current")._aria("selected", "false");
        },
        _id: function(id) {
            return (id) ? this.attr("id", id) : this.attr("id");
        }
    });
    if (!String.prototype.format) {
        String.prototype.format = function() {
            var args = (arguments.length === 1 && $.isArray(arguments[0])) ? arguments[0] : arguments;
            var formattedString = this;
            for (var i = 0; i < args.length; i++) {
                var pattern = new RegExp("\\{" + i + "\\}", "gm");
                formattedString = formattedString.replace(pattern, args[i]);
            }
            return formattedString;
        };
    }
    var _uniqueId = 0;
    var _cookiePrefix = "jQu3ry_5teps_St@te_";
    var _tabSuffix = "-t-";
    var _tabpanelSuffix = "-p-";
    var _titleSuffix = "-h-";
    var _indexOutOfRangeErrorMessage = "Index out of range.";
    var _missingCorrespondingElementErrorMessage = "One or more corresponding step {0} are missing.";

    function addStepToCache(wizard, step) {
        getSteps(wizard).push(step);
    }

    function analyzeData(wizard, options, state) {
        var stepTitles = wizard.children(options.headerTag),
            stepContents = wizard.children(options.bodyTag);
        if (stepTitles.length > stepContents.length) {
            throwError(_missingCorrespondingElementErrorMessage, "contents");
        } else if (stepTitles.length < stepContents.length) {
            throwError(_missingCorrespondingElementErrorMessage, "titles");
        }
        var startIndex = options.startIndex;
        state.stepCount = stepTitles.length;
        if (options.saveState && $.cookie) {
            var savedState = $.cookie(_cookiePrefix + getUniqueId(wizard));
            var savedIndex = parseInt(savedState, 0);
            if (!isNaN(savedIndex) && savedIndex < state.stepCount) {
                startIndex = savedIndex;
            }
        }
        state.currentIndex = startIndex;
        stepTitles.each(function(index) {
            var item = $(this),
                content = stepContents.eq(index),
                modeData = content.data("mode"),
                mode = (modeData == null) ? contentMode.html : getValidEnumValue(contentMode, (/^\s*$/.test(modeData) || isNaN(modeData)) ? modeData : parseInt(modeData, 0)),
                contentUrl = (mode === contentMode.html || content.data("url") === undefined) ? "" : content.data("url"),
                contentLoaded = (mode !== contentMode.html && content.data("loaded") === "1"),
                step = $.extend({}, stepModel, {
                    title: item.html(),
                    content: (mode === contentMode.html) ? content.html() : "",
                    contentUrl: contentUrl,
                    contentMode: mode,
                    contentLoaded: contentLoaded
                });
            addStepToCache(wizard, step);
        });
    }

    function cancel(wizard) {
        wizard.triggerHandler("canceled");
    }

    function decreaseCurrentIndexBy(state, decreaseBy) {
        return state.currentIndex - decreaseBy;
    }

    function destroy(wizard, options) {
        var eventNamespace = getEventNamespace(wizard);
        wizard.unbind(eventNamespace).removeData("uid").removeData("options").removeData("state").removeData("steps").removeData("eventNamespace").find(".actions a").unbind(eventNamespace);
        wizard.removeClass(options.clearFixCssClass + " vertical");
        var contents = wizard.find(".content > *");
        contents.removeData("loaded").removeData("mode").removeData("url");
        contents.removeAttr("id").removeAttr("role").removeAttr("tabindex").removeAttr("class").removeAttr("style")._removeAria("labelledby")._removeAria("hidden");
        wizard.find(".content > [data-mode='async'],.content > [data-mode='iframe']").empty();
        var wizardSubstitute = $("<{0} class=\"{1}\"></{0}>".format(wizard.get(0).tagName, wizard.attr("class")));
        var wizardId = wizard._id();
        if (wizardId != null && wizardId !== "") {
            wizardSubstitute._id(wizardId);
        }
        wizardSubstitute.html(wizard.find(".content").html());
        wizard.after(wizardSubstitute);
        wizard.remove();
        return wizardSubstitute;
    }

    function finishStep(wizard, state) {
        var currentStep = wizard.find(".steps li").eq(state.currentIndex);
        if (wizard.triggerHandler("finishing", [state.currentIndex])) {
            currentStep.addClass("done").removeClass("error");
            wizard.triggerHandler("finished", [state.currentIndex]);
        } else {
            currentStep.addClass("error");
        }
    }

    function getEventNamespace(wizard) {
        var eventNamespace = wizard.data("eventNamespace");
        if (eventNamespace == null) {
            eventNamespace = "." + getUniqueId(wizard);
            wizard.data("eventNamespace", eventNamespace);
        }
        return eventNamespace;
    }

    function getStepAnchor(wizard, index) {
        var uniqueId = getUniqueId(wizard);
        return wizard.find("#" + uniqueId + _tabSuffix + index);
    }

    function getStepPanel(wizard, index) {
        var uniqueId = getUniqueId(wizard);
        return wizard.find("#" + uniqueId + _tabpanelSuffix + index);
    }

    function getStepTitle(wizard, index) {
        var uniqueId = getUniqueId(wizard);
        return wizard.find("#" + uniqueId + _titleSuffix + index);
    }

    function getOptions(wizard) {
        return wizard.data("options");
    }

    function getState(wizard) {
        return wizard.data("state");
    }

    function getSteps(wizard) {
        return wizard.data("steps");
    }

    function getStep(wizard, index) {
        var steps = getSteps(wizard);
        if (index < 0 || index >= steps.length) {
            throwError(_indexOutOfRangeErrorMessage);
        }
        return steps[index];
    }

    function getUniqueId(wizard) {
        var uniqueId = wizard.data("uid");
        if (uniqueId == null) {
            uniqueId = wizard._id();
            if (uniqueId == null) {
                uniqueId = "steps-uid-".concat(_uniqueId);
                wizard._id(uniqueId);
            }
            _uniqueId++;
            wizard.data("uid", uniqueId);
        }
        return uniqueId;
    }

    function getValidEnumValue(enumType, keyOrValue) {
        validateArgument("enumType", enumType);
        validateArgument("keyOrValue", keyOrValue);
        if (typeof keyOrValue === "string") {
            var value = enumType[keyOrValue];
            if (value === undefined) {
                throwError("The enum key '{0}' does not exist.", keyOrValue);
            }
            return value;
        } else if (typeof keyOrValue === "number") {
            for (var key in enumType) {
                if (enumType[key] === keyOrValue) {
                    return keyOrValue;
                }
            }
            throwError("Invalid enum value '{0}'.", keyOrValue);
        } else {
            throwError("Invalid key or value type.");
        }
    }

    function goToNextStep(wizard, options, state) {
        return paginationClick(wizard, options, state, increaseCurrentIndexBy(state, 1));
    }

    function goToPreviousStep(wizard, options, state) {
        return paginationClick(wizard, options, state, decreaseCurrentIndexBy(state, 1));
    }

    function goToStep(wizard, options, state, index) {
        if (index < 0 || index >= state.stepCount) {
            throwError(_indexOutOfRangeErrorMessage);
        }
        if (options.forceMoveForward && index < state.currentIndex) {
            return;
        }
        var oldIndex = state.currentIndex;
        if (wizard.triggerHandler("stepChanging", [state.currentIndex, index])) {
            state.currentIndex = index;
            saveCurrentStateToCookie(wizard, options, state);
            refreshStepNavigation(wizard, options, state, oldIndex);
            refreshPagination(wizard, options, state);
            loadAsyncContent(wizard, options, state);
            startTransitionEffect(wizard, options, state, index, oldIndex, function() {
                wizard.triggerHandler("stepChanged", [index, oldIndex]);
            });
        } else {
            wizard.find(".steps li").eq(oldIndex).addClass("error");
        }
        return true;
    }

    function increaseCurrentIndexBy(state, increaseBy) {
        return state.currentIndex + increaseBy;
    }

    function initialize(options) {
        var opts = $.extend(true, {}, defaults, options);
        return this.each(function() {
            var wizard = $(this);
            var state = {
                currentIndex: opts.startIndex,
                currentStep: null,
                stepCount: 0,
                transitionElement: null
            };
            wizard.data("options", opts);
            wizard.data("state", state);
            wizard.data("steps", []);
            analyzeData(wizard, opts, state);
            render(wizard, opts, state);
            registerEvents(wizard, opts);
            if (opts.autoFocus && _uniqueId === 0) {
                getStepAnchor(wizard, opts.startIndex).focus();
            }
            wizard.triggerHandler("init", [opts.startIndex]);
        });
    }

    function insertStep(wizard, options, state, index, step) {
        if (index < 0 || index > state.stepCount) {
            throwError(_indexOutOfRangeErrorMessage);
        }
        step = $.extend({}, stepModel, step);
        insertStepToCache(wizard, index, step);
        if (state.currentIndex !== state.stepCount && state.currentIndex >= index) {
            state.currentIndex++;
            saveCurrentStateToCookie(wizard, options, state);
        }
        state.stepCount++;
        var contentContainer = wizard.find(".content"),
            header = $("<{0}>{1}</{0}>".format(options.headerTag, step.title)),
            body = $("<{0}></{0}>".format(options.bodyTag));
        if (step.contentMode == null || step.contentMode === contentMode.html) {
            body.html(step.content);
        }
        if (index === 0) {
            contentContainer.prepend(body).prepend(header);
        } else {
            getStepPanel(wizard, (index - 1)).after(body).after(header);
        }
        renderBody(wizard, state, body, index);
        renderTitle(wizard, options, state, header, index);
        refreshSteps(wizard, options, state, index);
        if (index === state.currentIndex) {
            refreshStepNavigation(wizard, options, state);
        }
        refreshPagination(wizard, options, state);
        return wizard;
    }

    function insertStepToCache(wizard, index, step) {
        getSteps(wizard).splice(index, 0, step);
    }

    function keyUpHandler(event) {
        var wizard = $(this),
            options = getOptions(wizard),
            state = getState(wizard);
        if (options.suppressPaginationOnFocus && wizard.find(":focus").is(":input")) {
            event.preventDefault();
            return false;
        }
        var keyCodes = {
            left: 37,
            right: 39
        };
        if (event.keyCode === keyCodes.left) {
            event.preventDefault();
            goToPreviousStep(wizard, options, state);
        } else if (event.keyCode === keyCodes.right) {
            event.preventDefault();
            goToNextStep(wizard, options, state);
        }
    }

    function loadAsyncContent(wizard, options, state) {
        if (state.stepCount > 0) {
            var currentIndex = state.currentIndex,
                currentStep = getStep(wizard, currentIndex);
            if (!options.enableContentCache || !currentStep.contentLoaded) {
                switch (getValidEnumValue(contentMode, currentStep.contentMode)) {
                    case contentMode.iframe:
                        wizard.find(".content > .body").eq(state.currentIndex).empty().html("<iframe src=\"" + currentStep.contentUrl + "\" frameborder=\"0\" scrolling=\"no\" />").data("loaded", "1");
                        break;
                    case contentMode.async:
                        var currentStepContent = getStepPanel(wizard, currentIndex)._aria("busy", "true").empty().append(renderTemplate(options.loadingTemplate, {
                            text: options.labels.loading
                        }));
                        $.ajax({
                            url: currentStep.contentUrl,
                            cache: false
                        }).done(function(data) {
                            currentStepContent.empty().html(data)._aria("busy", "false").data("loaded", "1");
                            wizard.triggerHandler("contentLoaded", [currentIndex]);
                        });
                        break;
                }
            }
        }
    }

    function paginationClick(wizard, options, state, index) {
        var oldIndex = state.currentIndex;
        if (index >= 0 && index < state.stepCount && !(options.forceMoveForward && index < state.currentIndex)) {
            var anchor = getStepAnchor(wizard, index),
                parent = anchor.parent(),
                isDisabled = parent.hasClass("disabled");
            parent._enableAria();
            anchor.click();
            if (oldIndex === state.currentIndex && isDisabled) {
                parent._enableAria(false);
                return false;
            }
            return true;
        }
        return false;
    }

    function paginationClickHandler(event) {
        event.preventDefault();
        var anchor = $(this),
            wizard = anchor.parent().parent().parent().parent(),
            options = getOptions(wizard),
            state = getState(wizard),
            href = anchor.attr("href");
        switch (href.substring(href.lastIndexOf("#") + 1)) {
            case "cancel":
                cancel(wizard);
                break;
            case "finish":
                finishStep(wizard, state);
                break;
            case "next":
                goToNextStep(wizard, options, state);
                break;
            case "previous":
                goToPreviousStep(wizard, options, state);
                break;
        }
    }

    function refreshPagination(wizard, options, state) {
        if (options.enablePagination) {
            var finish = wizard.find(".actions a[href$='#finish']").parent(),
                next = wizard.find(".actions a[href$='#next']").parent();
            if (!options.forceMoveForward) {
                var previous = wizard.find(".actions a[href$='#previous']").parent();
                previous._enableAria(state.currentIndex > 0);
            }
            if (options.enableFinishButton && options.showFinishButtonAlways) {
                finish._enableAria(state.stepCount > 0);
                next._enableAria(state.stepCount > 1 && state.stepCount > (state.currentIndex + 1));
            } else {
                finish._showAria(options.enableFinishButton && state.stepCount === (state.currentIndex + 1));
                next._showAria(state.stepCount === 0 || state.stepCount > (state.currentIndex + 1))._enableAria(state.stepCount > (state.currentIndex + 1) || !options.enableFinishButton);
            }
        }
    }

    function refreshStepNavigation(wizard, options, state, oldIndex) {
        var currentOrNewStepAnchor = getStepAnchor(wizard, state.currentIndex),
            currentInfo = $("<span class=\"current-info audible\">" + options.labels.current + " </span>"),
            stepTitles = wizard.find(".content > .title");
        if (oldIndex != null) {
            var oldStepAnchor = getStepAnchor(wizard, oldIndex);
            oldStepAnchor.parent().addClass("done").removeClass("error")._selectAria(false);
            stepTitles.eq(oldIndex).removeClass("current").next(".body").removeClass("current");
            currentInfo = oldStepAnchor.find(".current-info");
            currentOrNewStepAnchor.focus();
        }
        currentOrNewStepAnchor.prepend(currentInfo).parent()._selectAria().removeClass("done")._enableAria();
        stepTitles.eq(state.currentIndex).addClass("current").next(".body").addClass("current");
    }

    function refreshSteps(wizard, options, state, index) {
        var uniqueId = getUniqueId(wizard);
        for (var i = index; i < state.stepCount; i++) {
            var uniqueStepId = uniqueId + _tabSuffix + i,
                uniqueBodyId = uniqueId + _tabpanelSuffix + i,
                uniqueHeaderId = uniqueId + _titleSuffix + i,
                title = wizard.find(".title").eq(i)._id(uniqueHeaderId);
            wizard.find(".steps a").eq(i)._id(uniqueStepId)._aria("controls", uniqueBodyId).attr("href", "#" + uniqueHeaderId).html(renderTemplate(options.titleTemplate, {
                index: i + 1,
                title: title.html()
            }));
            wizard.find(".body").eq(i)._id(uniqueBodyId)._aria("labelledby", uniqueHeaderId);
        }
    }

    function registerEvents(wizard, options) {
        var eventNamespace = getEventNamespace(wizard);
        wizard.bind("canceled" + eventNamespace, options.onCanceled);
        wizard.bind("contentLoaded" + eventNamespace, options.onContentLoaded);
        wizard.bind("finishing" + eventNamespace, options.onFinishing);
        wizard.bind("finished" + eventNamespace, options.onFinished);
        wizard.bind("init" + eventNamespace, options.onInit);
        wizard.bind("stepChanging" + eventNamespace, options.onStepChanging);
        wizard.bind("stepChanged" + eventNamespace, options.onStepChanged);
        if (options.enableKeyNavigation) {
            wizard.bind("keyup" + eventNamespace, keyUpHandler);
        }
        wizard.find(".actions a").bind("click" + eventNamespace, paginationClickHandler);
    }

    function removeStep(wizard, options, state, index) {
        if (index < 0 || index >= state.stepCount || state.currentIndex === index) {
            return false;
        }
        removeStepFromCache(wizard, index);
        if (state.currentIndex > index) {
            state.currentIndex--;
            saveCurrentStateToCookie(wizard, options, state);
        }
        state.stepCount--;
        getStepTitle(wizard, index).remove();
        getStepPanel(wizard, index).remove();
        getStepAnchor(wizard, index).parent().remove();
        if (index === 0) {
            wizard.find(".steps li").first().addClass("first");
        }
        if (index === state.stepCount) {
            wizard.find(".steps li").eq(index).addClass("last");
        }
        refreshSteps(wizard, options, state, index);
        refreshPagination(wizard, options, state);
        return true;
    }

    function removeStepFromCache(wizard, index) {
        getSteps(wizard).splice(index, 1);
    }

    function render(wizard, options, state) {
        var wrapperTemplate = "<{0} class=\"{1}\">{2}</{0}>",
            orientation = getValidEnumValue(stepsOrientation, options.stepsOrientation),
            verticalCssClass = (orientation === stepsOrientation.vertical) ? " vertical" : "",
            contentWrapper = $(wrapperTemplate.format(options.contentContainerTag, "content " + options.clearFixCssClass, wizard.html())),
            stepsWrapper = $(wrapperTemplate.format(options.stepsContainerTag, "steps " + options.clearFixCssClass, "<ul role=\"tablist\"></ul>")),
            stepTitles = contentWrapper.children(options.headerTag),
            stepContents = contentWrapper.children(options.bodyTag);
        wizard.attr("role", "application").empty().append(stepsWrapper).append(contentWrapper).addClass(options.cssClass + " " + options.clearFixCssClass + verticalCssClass);
        stepContents.each(function(index) {
            renderBody(wizard, state, $(this), index);
        });
        stepTitles.each(function(index) {
            renderTitle(wizard, options, state, $(this), index);
        });
        refreshStepNavigation(wizard, options, state);
        renderPagination(wizard, options, state);
    }

    function renderBody(wizard, state, body, index) {
        var uniqueId = getUniqueId(wizard),
            uniqueBodyId = uniqueId + _tabpanelSuffix + index,
            uniqueHeaderId = uniqueId + _titleSuffix + index;
        body._id(uniqueBodyId).attr("role", "tabpanel")._aria("labelledby", uniqueHeaderId).addClass("body")._showAria(state.currentIndex === index);
    }

    function renderPagination(wizard, options, state) {
        if (options.enablePagination) {
            var pagination = "<{0} class=\"actions {1}\"><ul role=\"menu\" aria-label=\"{2}\">{3}</ul></{0}>",
                buttonTemplate = "<li><a href=\"#{0}\" role=\"menuitem\">{1}</a></li>",
                buttons = "";
            if (!options.forceMoveForward) {
                buttons += buttonTemplate.format("previous", options.labels.previous);
            }
            buttons += buttonTemplate.format("next", options.labels.next);
            if (options.enableFinishButton) {
                buttons += buttonTemplate.format("finish", options.labels.finish);
            }
            if (options.enableCancelButton) {
                buttons += buttonTemplate.format("cancel", options.labels.cancel);
            }
            wizard.append(pagination.format(options.actionContainerTag, options.clearFixCssClass, options.labels.pagination, buttons));
            refreshPagination(wizard, options, state);
            loadAsyncContent(wizard, options, state);
        }
    }

    function renderTemplate(template, substitutes) {
        var matches = template.match(/#([a-z]*)#/gi);
        for (var i = 0; i < matches.length; i++) {
            var match = matches[i],
                key = match.substring(1, match.length - 1);
            if (substitutes[key] === undefined) {
                throwError("The key '{0}' does not exist in the substitute collection!", key);
            }
            template = template.replace(match, substitutes[key]);
        }
        return template;
    }

    function renderTitle(wizard, options, state, header, index) {
        var uniqueId = getUniqueId(wizard),
            uniqueStepId = uniqueId + _tabSuffix + index,
            uniqueBodyId = uniqueId + _tabpanelSuffix + index,
            uniqueHeaderId = uniqueId + _titleSuffix + index,
            stepCollection = wizard.find(".steps > ul"),
            title = renderTemplate(options.titleTemplate, {
                index: index + 1,
                title: header.html()
            }),
            stepItem = $("<li role=\"tab\"><a id=\"" + uniqueStepId + "\" href=\"#" + uniqueHeaderId +
                "\" aria-controls=\"" + uniqueBodyId + "\">" + title + "</a></li>");
        stepItem._enableAria(options.enableAllSteps || state.currentIndex > index);
        if (state.currentIndex > index) {
            stepItem.addClass("done");
        }
        header._id(uniqueHeaderId).attr("tabindex", "-1").addClass("title");
        if (index === 0) {
            stepCollection.prepend(stepItem);
        } else {
            stepCollection.find("li").eq(index - 1).after(stepItem);
        }
        if (index === 0) {
            stepCollection.find("li").removeClass("first").eq(index).addClass("first");
        }
        if (index === (state.stepCount - 1)) {
            stepCollection.find("li").removeClass("last").eq(index).addClass("last");
        }
        stepItem.children("a").bind("click" + getEventNamespace(wizard), stepClickHandler);
    }

    function saveCurrentStateToCookie(wizard, options, state) {
        if (options.saveState && $.cookie) {
            $.cookie(_cookiePrefix + getUniqueId(wizard), state.currentIndex);
        }
    }

    function startTransitionEffect(wizard, options, state, index, oldIndex, doneCallback) {
        var stepContents = wizard.find(".content > .body"),
            effect = getValidEnumValue(transitionEffect, options.transitionEffect),
            effectSpeed = options.transitionEffectSpeed,
            newStep = stepContents.eq(index),
            currentStep = stepContents.eq(oldIndex);
        switch (effect) {
            case transitionEffect.fade:
            case transitionEffect.slide:
                var hide = (effect === transitionEffect.fade) ? "fadeOut" : "slideUp",
                    show = (effect === transitionEffect.fade) ? "fadeIn" : "slideDown";
                state.transitionElement = newStep;
                currentStep[hide](effectSpeed, function() {
                    var wizard = $(this)._showAria(false).parent().parent(),
                        state = getState(wizard);
                    if (state.transitionElement) {
                        state.transitionElement[show](effectSpeed, function() {
                            $(this)._showAria();
                        }).promise().done(doneCallback);
                        state.transitionElement = null;
                    }
                });
                break;
            case transitionEffect.slideLeft:
                var outerWidth = currentStep.outerWidth(true),
                    posFadeOut = (index > oldIndex) ? -(outerWidth) : outerWidth,
                    posFadeIn = (index > oldIndex) ? outerWidth : -(outerWidth);
                $.when(currentStep.animate({
                    left: posFadeOut
                }, effectSpeed, function() {
                    $(this)._showAria(false);
                }), newStep.css("left", posFadeIn + "px")._showAria().animate({
                    left: 0
                }, effectSpeed)).done(doneCallback);
                break;
            default:
                $.when(currentStep._showAria(false), newStep._showAria()).done(doneCallback);
                break;
        }
    }

    function stepClickHandler(event) {
        event.preventDefault();
        var anchor = $(this),
            wizard = anchor.parent().parent().parent().parent(),
            options = getOptions(wizard),
            state = getState(wizard),
            oldIndex = state.currentIndex;
        if (anchor.parent().is(":not(.disabled):not(.current)")) {
            var href = anchor.attr("href"),
                position = parseInt(href.substring(href.lastIndexOf("-") + 1), 0);
            goToStep(wizard, options, state, position);
        }
        if (oldIndex === state.currentIndex) {
            getStepAnchor(wizard, oldIndex).focus();
            return false;
        }
    }

    function throwError(message) {
        if (arguments.length > 1) {
            message = message.format(Array.prototype.slice.call(arguments, 1));
        }
        throw new Error(message);
    }

    function validateArgument(argumentName, argumentValue) {
        if (argumentValue == null) {
            throwError("The argument '{0}' is null or undefined.", argumentName);
        }
    }
    $.fn.steps = function(method) {
        if ($.fn.steps[method]) {
            return $.fn.steps[method].apply(this, Array.prototype.slice.call(arguments, 1));
        } else if (typeof method === "object" || !method) {
            return initialize.apply(this, arguments);
        } else {
            $.error("Method " + method + " does not exist on jQuery.steps");
        }
    };
    $.fn.steps.add = function(step) {
        var state = getState(this);
        return insertStep(this, getOptions(this), state, state.stepCount, step);
    };
    $.fn.steps.destroy = function() {
        return destroy(this, getOptions(this));
    };
    $.fn.steps.finish = function() {
        finishStep(this, getState(this));
    };
    $.fn.steps.getCurrentIndex = function() {
        return getState(this).currentIndex;
    };
    $.fn.steps.getCurrentStep = function() {
        return getStep(this, getState(this).currentIndex);
    };
    $.fn.steps.getStep = function(index) {
        return getStep(this, index);
    };
    $.fn.steps.insert = function(index, step) {
        return insertStep(this, getOptions(this), getState(this), index, step);
    };
    $.fn.steps.next = function() {
        return goToNextStep(this, getOptions(this), getState(this));
    };
    $.fn.steps.previous = function() {
        return goToPreviousStep(this, getOptions(this), getState(this));
    };
    $.fn.steps.remove = function(index) {
        return removeStep(this, getOptions(this), getState(this), index);
    };
    $.fn.steps.setStep = function(index, step) {
        throw new Error("Not yet implemented!");
    };
    $.fn.steps.skip = function(count) {
        throw new Error("Not yet implemented!");
    };
    var contentMode = $.fn.steps.contentMode = {
        html: 0,
        iframe: 1,
        async: 2
    };
    var stepsOrientation = $.fn.steps.stepsOrientation = {
        horizontal: 0,
        vertical: 1
    };
    var transitionEffect = $.fn.steps.transitionEffect = {
        none: 0,
        fade: 1,
        slide: 2,
        slideLeft: 3
    };
    var stepModel = $.fn.steps.stepModel = {
        title: "",
        content: "",
        contentUrl: "",
        contentMode: contentMode.html,
        contentLoaded: false
    };
    var defaults = $.fn.steps.defaults = {
        headerTag: "h1",
        bodyTag: "div",
        contentContainerTag: "div",
        actionContainerTag: "div",
        stepsContainerTag: "div",
        cssClass: "wizard",
        clearFixCssClass: "clearfix",
        stepsOrientation: stepsOrientation.horizontal,
        titleTemplate: "<span class=\"number\"></span> #title#",
        loadingTemplate: "<span class=\"spinner\"></span> #text#",
        autoFocus: false,
        enableAllSteps: false,
        enableKeyNavigation: true,
        enablePagination: true,
        suppressPaginationOnFocus: true,
        enableContentCache: true,
        enableCancelButton: false,
        enableFinishButton: true,
        preloadContent: false,
        showFinishButtonAlways: false,
        forceMoveForward: false,
        saveState: false,
        startIndex: 0,
        transitionEffect: transitionEffect.none,
        transitionEffectSpeed: 200,
        onStepChanging: function(event, currentIndex, newIndex) {
            return true;
        },
        onStepChanged: function(event, currentIndex, priorIndex) {},
        onCanceled: function(event) {},
        onFinishing: function(event, currentIndex) {
            return true;
        },
        onFinished: function(event, currentIndex) {},
        onContentLoaded: function(event, currentIndex) {},
        onInit: function(event, currentIndex) {},
        labels: {
            cancel: "Cancel",
            current: "current step:",
            pagination: "Pagination",
            finish: "Finish",
            next: "Next",
            previous: "Previous",
            loading: "Loading ..."
        }
    };
})(jQuery);