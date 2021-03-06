/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.sencha.ext.ux.callout.client;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.ui.Container;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.StyleInjector;

public class CallOut extends Container {

    private static JavaScriptObject configPrototype;
    private static final CalloutResources resources = GWT.create( CalloutResources.class );

    static {
        loadScript();
        loadAllThemes();
    }

    private native void init()/*-{
		var c = new $wnd.Ext.ux.callout.Callout();
		@com.ait.toolkit.sencha.ext.ux.callout.client.CallOut::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return "callout";
    }

    public void setTheme( CalloutTheme theme ) {
        this.setCls( theme.name().toLowerCase().replace( "_", "-" ) );
    }

    public native void setTarget( String targetId )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setTarget(targetId);
    }-*/;

    public native void setTarget( Component target )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout
				.setTarget(target.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()());
    }-*/;

    public native void setTarget( ExtElement target )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout
				.setTarget(target.@com.ait.toolkit.sencha.shared.client.dom.ExtElement::getJsObj()());
    }-*/;

    public native void setRelativePosition( String value )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setRelativePosition(value);
    }-*/;

    public native void setRelativeOffsets( int offsetX, int offsetY )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var value = [];
		value.push(offsetX);
		value.push(offsetY);
		callout.setRelativeOffsets(value);
    }-*/;

    public native void setCalloutArrowLocation( String value )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setCalloutArrowLocation(value);
    }-*/;

    public native void setFadeInDuration( int value )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setFadeInDuration(value);
    }-*/;

    public native void setFadeOutDuration( int value )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setFadeOutDuration(value);
    }-*/;

    public native void setAutoHide( boolean value )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setAutoHide(value);
    }-*/;

    public native void setDismissDelay( int value )/*-{
		var callout = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		callout.setDismissDelay(value);
    }-*/;

    public CallOut() {
        // init();
    }

    public CallOut( JavaScriptObject jsObj ) {
        super( jsObj );
    }

    @Override
    public native void show() /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.show();
    }-*/;

    public CallOut( Element element ) {
        super( element );
    }

    protected native JavaScriptObject create( JavaScriptObject config ) /*-{
		return new $wnd.Ext.ux.callout.Callout(config);
    }-*/;

    private static CallOut instance( JavaScriptObject jsObj ) {
        return new CallOut( jsObj );
    }

    public static CallOut cast( Component c ) {
        return new CallOut( c.getOrCreateJsObj() );
    }

    public static void loadAllThemes() {
        loadCartoonTheme();
        loadDefaultTheme();
        loadFancyBlueTheme();
        loadGrayTheme();
        loadYellowTheme();
        loadModernheme();
    }

    private static void loadScript() {
        ScriptInjector.fromString( resources.js().getText() ).setWindow( ScriptInjector.TOP_WINDOW ).inject();
    }

    public static void loadDefaultTheme() {
        StyleInjector.inject( resources.defaultCss().getText() );
    }

    public static void loadFancyBlueTheme() {
        StyleInjector.inject( resources.fancyBlueCss().getText() );
    }

    public static void loadYellowTheme() {
        StyleInjector.inject( resources.yellowCss().getText() );
    }

    public static void loadModernheme() {
        StyleInjector.inject( resources.modernCss().getText() );
    }

    public static void loadGrayTheme() {
        StyleInjector.inject( resources.grayCss().getText() );
    }

    public static void loadCartoonTheme() {
        StyleInjector.inject( resources.cartoonCss().getText() );
    }

    static native boolean isLoaded()/*-{
		if (typeof $wnd.Ext.ux.callout.Callout === "undefined"
				|| $wnd.Ext.ux.callout.Callout === null) {
			return false;
		}
		return true;
    }-*/;

}
