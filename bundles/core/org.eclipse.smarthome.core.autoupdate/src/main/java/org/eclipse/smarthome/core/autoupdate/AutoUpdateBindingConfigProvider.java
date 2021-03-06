/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.autoupdate;

/**
 * This interface is implemented by classes that can provide configuration
 * information of the AutoUpdate feature.
 *
 * Implementing classes should register themselves as a service in order to be
 * taken into account.
 *
 * @author Thomas.Eichstaedt-Engelen - Initial contribution
 * @author Kai Kreuzer - refactored to make independent of parent interfaces
 */
public interface AutoUpdateBindingConfigProvider {

    /**
     * Indicates whether an Item with the given <code>itemName</code> is
     * configured to automatically update it's State after receiving a Command
     * or not.
     *
     * @param itemName the name of the Item for which to find the configuration
     * @return <code>false</code> to disable the automatic update, <code>true</code> to enable the automatic update and
     *         <code>null</code> if there is no configuration for this item.
     */
    Boolean autoUpdate(String itemName);

}
