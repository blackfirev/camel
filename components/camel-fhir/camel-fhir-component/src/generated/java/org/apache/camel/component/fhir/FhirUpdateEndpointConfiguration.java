
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.fhir.api.FhirUpdate
 */
@ApiParams(apiName = "update", apiMethods = "resource,resourceBySearchUrl")
@UriParams
@Configurer
public final class FhirUpdateEndpointConfiguration extends FhirConfiguration {
    @UriParam
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    private ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn;
    @UriParam
    private org.hl7.fhir.instance.model.api.IBaseResource resource;
    @UriParam
    private String resourceAsString;
    @UriParam
    private String stringId;
    @UriParam
    private String url;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public ca.uhn.fhir.rest.api.PreferReturnEnum getPreferReturn() {
        return preferReturn;
    }

    public void setPreferReturn(ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn) {
        this.preferReturn = preferReturn;
    }

    public org.hl7.fhir.instance.model.api.IBaseResource getResource() {
        return resource;
    }

    public void setResource(org.hl7.fhir.instance.model.api.IBaseResource resource) {
        this.resource = resource;
    }

    public String getResourceAsString() {
        return resourceAsString;
    }

    public void setResourceAsString(String resourceAsString) {
        this.resourceAsString = resourceAsString;
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
