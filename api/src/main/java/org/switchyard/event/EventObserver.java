/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */

package org.switchyard.event;

import java.util.EventObject;

/**
 * Used to observe SwitchYard events.  An instance of EventObserver can be 
 * registered to handle multiple event types through <code>ServiceDomain.addEventObserver() <code>.
 * Event notification can be synchronous or asynchronous, so Observer implementations
 * should not rely on specific behavior.
 */
public interface EventObserver {
    
    /**
     * Notification that an event has occurred.
     * @param event event notification
     */
    void notify(EventObject event);
}
