/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
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

package org.switchyard.test.mixins;

import org.switchyard.deploy.internal.AbstractDeployment;
import org.switchyard.test.SwitchYardTestKit;
import org.switchyard.test.TestMixIn;

/**
 * Abstract {@link TestMixIn}.
 *
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
public abstract class AbstractTestMixIn implements TestMixIn {

    private SwitchYardTestKit _kit;

    @Override
    public void setTestKit(SwitchYardTestKit kit) {
        this._kit = kit;
    }

    /**
     * Get the test kit instance associated with the test mixin.
     * @return The test kit instance instance.
     */
    public SwitchYardTestKit getTestKit() {
        return _kit;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void before(AbstractDeployment deployment) {
    }

    @Override
    public void after(AbstractDeployment deployment) {
    }

    @Override
    public void uninitialize() {
    }
}
