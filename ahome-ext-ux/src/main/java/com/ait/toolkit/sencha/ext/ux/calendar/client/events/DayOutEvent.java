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
package com.ait.toolkit.sencha.ext.ux.calendar.client.events;

import com.ait.toolkit.sencha.ext.ux.calendar.client.CalendarPanel;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class DayOutEvent extends EventObject {

    public static String EVENT_NAME = "dayout";

    private CalendarPanel source;
    private JsDate date;
    ExtElement element;

    /**
     * UiBinder implementations
     */
    private static Type<DayOutHandler> TYPE = new Type<DayOutHandler>( EVENT_NAME, null );

    public static Type<DayOutHandler> getType() {
        return TYPE;
    }

    public static Type<DayOutHandler> getAssociatedType() {
        return TYPE;
    }

    public DayOutEvent( JavaScriptObject jsObj ) {
        super( jsObj );
    }

    public DayOutEvent( CalendarPanel source, JsDate date, ExtElement element, JavaScriptObject nativeEvent ) {
        super( nativeEvent );
        this.date = date;
        this.element = element;
    }

    /**
     * @return the source
     */
    public CalendarPanel getPanel() {
        return source;
    }

    public CalendarPanel getSource() {
        return source;
    }

    public ExtElement getElement() {
        return element;
    }

    public JsDate getDate() {
        return date;
    }

}
