
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.calendar.Calendar$CalendarList
 */
@ApiParams(apiName = "list", apiMethods = "delete,get,insert,list,patch,update,watch")
@UriParams
@Configurer
public final class CalendarCalendarListEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam(description = "Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")
    private String calendarId;
    @UriParam(description = "The com.google.api.services.calendar.model.CalendarListEntry")
    private com.google.api.services.calendar.model.CalendarListEntry content;
    @UriParam(description = "The com.google.api.services.calendar.model.Channel")
    private com.google.api.services.calendar.model.Channel contentChannel;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.CalendarListEntry getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.CalendarListEntry content) {
        this.content = content;
    }

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }
}
