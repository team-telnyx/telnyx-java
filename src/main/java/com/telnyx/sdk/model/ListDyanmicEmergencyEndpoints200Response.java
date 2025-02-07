/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.DynamicEmergencyEndpoint;
import com.telnyx.sdk.model.Metadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ListDyanmicEmergencyEndpoints200Response
 */
@JsonPropertyOrder(
    {
        ListDyanmicEmergencyEndpoints200Response.JSON_PROPERTY_DATA,
        ListDyanmicEmergencyEndpoints200Response.JSON_PROPERTY_META,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class ListDyanmicEmergencyEndpoints200Response {

    public static final String JSON_PROPERTY_DATA = "data";
    private List<DynamicEmergencyEndpoint> data = null;

    public static final String JSON_PROPERTY_META = "meta";
    private Metadata meta;

    public ListDyanmicEmergencyEndpoints200Response() {}

    public ListDyanmicEmergencyEndpoints200Response data(
        List<DynamicEmergencyEndpoint> data
    ) {
        this.data = data;
        return this;
    }

    public ListDyanmicEmergencyEndpoints200Response addDataItem(
        DynamicEmergencyEndpoint dataItem
    ) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<DynamicEmergencyEndpoint> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<DynamicEmergencyEndpoint> data) {
        this.data = data;
    }

    public ListDyanmicEmergencyEndpoints200Response meta(Metadata meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     * @return meta
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Metadata getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(Metadata meta) {
        this.meta = meta;
    }

    /**
     * Return true if this listDyanmicEmergencyEndpoints_200_response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDyanmicEmergencyEndpoints200Response listDyanmicEmergencyEndpoints200Response =
            (ListDyanmicEmergencyEndpoints200Response) o;
        return (
            Objects.equals(
                this.data,
                listDyanmicEmergencyEndpoints200Response.data
            ) &&
            Objects.equals(
                this.meta,
                listDyanmicEmergencyEndpoints200Response.meta
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDyanmicEmergencyEndpoints200Response {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
