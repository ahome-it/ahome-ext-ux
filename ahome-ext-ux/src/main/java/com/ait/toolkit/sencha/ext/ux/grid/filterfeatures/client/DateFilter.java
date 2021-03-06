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
package com.ait.toolkit.sencha.ext.ux.grid.filterfeatures.client;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.grid.column.Filter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Filter by a configurable Ext.picker.DatePicker menu
 * 
 */
public class DateFilter extends Filter {

	public DateFilter() {
		jsObj = JsoHelper.createObject();
		setType("date");
	}

	public void setDateFormat(boolean value) {
		JsoHelper.setAttribute(jsObj, "dateFormat", value);
	}

	public void setAtferText(String value) {
		JsoHelper.setAttribute(jsObj, "afterText", value);
	}

	public void setBeforeText(String value) {
		JsoHelper.setAttribute(jsObj, "beforeText", value);
	}

	public void setOnText(String value) {
		JsoHelper.setAttribute(jsObj, "onText", value);
	}

	public static void inject() {
		ScriptInjector
				.fromUrl(GWT.getModuleBaseURL() + "gridfilter/DateFilter.js")
				.setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
