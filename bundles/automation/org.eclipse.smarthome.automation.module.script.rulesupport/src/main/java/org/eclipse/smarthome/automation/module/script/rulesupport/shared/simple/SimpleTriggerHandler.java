/**
 * Copyright (c) 2015-2017 Simon Merschjohann and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.automation.module.script.rulesupport.shared.simple;

import java.util.Map;

import org.eclipse.smarthome.automation.Trigger;
import org.eclipse.smarthome.automation.module.script.rulesupport.shared.ScriptedHandler;

/**
 *
 * @author Simon Merschjohann - Initial contribution
 */
public abstract class SimpleTriggerHandler implements ScriptedHandler {
    private SimpleRuleEngineCallback ruleCallback;

    public void init(Trigger module) {
    }

    public void setRuleEngineCallback(Trigger module, SimpleRuleEngineCallback ruleCallback) {
        this.ruleCallback = ruleCallback;
    }

    protected void trigger(Map<String, ?> context) {
        this.ruleCallback.triggered(context);
    }
}
