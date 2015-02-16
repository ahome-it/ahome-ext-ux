/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.ext.ux.portal.client;

import com.ait.toolkit.sencha.ext.client.layout.AnchorLayout;
import com.ait.toolkit.sencha.ext.client.layout.AnchorLayoutData;
import com.ait.toolkit.sencha.ext.client.ui.Container;

/**
 * A Portal column to which the Portlets are added.
 * 
 */
// credits : this class has been adapted from the Ext portal sample
public class PortalColumn extends Container {

	public PortalColumn() {
		setLayout(new AnchorLayout());
		setAutoEl("div");
		setCls("x-portal-column");
		setPaddings(10, 10, 0, 10);
	}

	public void add(Portlet portlet) {
		super.add(portlet, new AnchorLayoutData("100%"));
	}

}
