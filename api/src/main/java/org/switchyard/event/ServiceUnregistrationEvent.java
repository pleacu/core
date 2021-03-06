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
import org.switchyard.Service;

/**
 * Fired when a Service has been unregistered in the domain.
 */
public class ServiceUnregistrationEvent extends EventObject {

    private static final long serialVersionUID = -2443169814086096894L;
    
    /**
     * Create a new ServiceUnregistrationEvent.
     * @param service the service that was unregistered
     */
    public ServiceUnregistrationEvent(Service service) {
        super(service);
    }
    
    /**
     * Get the unregistered reference associated with this event.
     * @return unregistered service reference
     */
    public Service getService() {
        return (Service)getSource();
    }
}
