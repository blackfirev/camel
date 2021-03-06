
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.sheets;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.sheets.v4.Sheets$Spreadsheets$Values
 */
@ApiParams(apiName = "data", apiMethods = "append,batchClear,batchClearByDataFilter,batchGet,batchGetByDataFilter,batchUpdate,batchUpdateByDataFilter,clear,get,update")
@UriParams
@Configurer
public final class SheetsSpreadsheetsValuesEndpointConfiguration extends GoogleSheetsConfiguration {
    @UriParam(description = "The com.google.api.services.sheets.v4.model.BatchClearValuesRequest")
    private com.google.api.services.sheets.v4.model.BatchClearValuesRequest batchClearValuesRequest;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest")
    private com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest batchGetValuesByDataFilterRequest;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest")
    private com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest batchUpdateValuesByDataFilterRequest;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest")
    private com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest batchUpdateValuesRequest;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.ClearValuesRequest")
    private com.google.api.services.sheets.v4.model.ClearValuesRequest clearValuesRequest;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.BatchClearValuesByDataFilterRequest")
    private com.google.api.services.sheets.v4.model.BatchClearValuesByDataFilterRequest content;
    @UriParam(description = "The A1 notation of a range to search for a logical table of data. Values will be appended after the last row of the table.")
    private String range;
    @UriParam(description = "The ID of the spreadsheet to update")
    private String spreadsheetId;
    @UriParam(description = "The com.google.api.services.sheets.v4.model.ValueRange")
    private com.google.api.services.sheets.v4.model.ValueRange values;

    public com.google.api.services.sheets.v4.model.BatchClearValuesRequest getBatchClearValuesRequest() {
        return batchClearValuesRequest;
    }

    public void setBatchClearValuesRequest(com.google.api.services.sheets.v4.model.BatchClearValuesRequest batchClearValuesRequest) {
        this.batchClearValuesRequest = batchClearValuesRequest;
    }

    public com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest getBatchGetValuesByDataFilterRequest() {
        return batchGetValuesByDataFilterRequest;
    }

    public void setBatchGetValuesByDataFilterRequest(com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest batchGetValuesByDataFilterRequest) {
        this.batchGetValuesByDataFilterRequest = batchGetValuesByDataFilterRequest;
    }

    public com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest getBatchUpdateValuesByDataFilterRequest() {
        return batchUpdateValuesByDataFilterRequest;
    }

    public void setBatchUpdateValuesByDataFilterRequest(com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest batchUpdateValuesByDataFilterRequest) {
        this.batchUpdateValuesByDataFilterRequest = batchUpdateValuesByDataFilterRequest;
    }

    public com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest getBatchUpdateValuesRequest() {
        return batchUpdateValuesRequest;
    }

    public void setBatchUpdateValuesRequest(com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest batchUpdateValuesRequest) {
        this.batchUpdateValuesRequest = batchUpdateValuesRequest;
    }

    public com.google.api.services.sheets.v4.model.ClearValuesRequest getClearValuesRequest() {
        return clearValuesRequest;
    }

    public void setClearValuesRequest(com.google.api.services.sheets.v4.model.ClearValuesRequest clearValuesRequest) {
        this.clearValuesRequest = clearValuesRequest;
    }

    public com.google.api.services.sheets.v4.model.BatchClearValuesByDataFilterRequest getContent() {
        return content;
    }

    public void setContent(com.google.api.services.sheets.v4.model.BatchClearValuesByDataFilterRequest content) {
        this.content = content;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getSpreadsheetId() {
        return spreadsheetId;
    }

    public void setSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
    }

    public com.google.api.services.sheets.v4.model.ValueRange getValues() {
        return values;
    }

    public void setValues(com.google.api.services.sheets.v4.model.ValueRange values) {
        this.values = values;
    }
}
