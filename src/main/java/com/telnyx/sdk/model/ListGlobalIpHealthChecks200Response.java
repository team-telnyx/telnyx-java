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
import com.telnyx.sdk.model.GlobalIPHealthCheck;
import com.telnyx.sdk.model.PaginationMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ListGlobalIpHealthChecks200Response
 */
@JsonPropertyOrder(
    {
        ListGlobalIpHealthChecks200Response.JSON_PROPERTY_DATA,
        ListGlobalIpHealthChecks200Response.JSON_PROPERTY_META,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ListGlobalIpHealthChecks200Response {

    public static final String JSON_PROPERTY_DATA = "data";
    private List<GlobalIPHealthCheck> data = null;

    public static final String JSON_PROPERTY_META = "meta";
    private PaginationMeta meta;

    public ListGlobalIpHealthChecks200Response() {}

    public ListGlobalIpHealthChecks200Response data(
        List<GlobalIPHealthCheck> data
    ) {
        this.data = data;
        return this;
    }

    public ListGlobalIpHealthChecks200Response adddataItem(
        GlobalIPHealthCheck dataItem
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
    public List<GlobalIPHealthCheck> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<GlobalIPHealthCheck> data) {
        this.data = data;
    }

    public ListGlobalIpHealthChecks200Response meta(PaginationMeta meta) {
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
    public PaginationMeta getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(PaginationMeta meta) {
        this.meta = meta;
    }

    /**
     * Return true if this ListGlobalIpHealthChecks_200_response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGlobalIpHealthChecks200Response listGlobalIpHealthChecks200Response =
            (ListGlobalIpHealthChecks200Response) o;
        return (
            Objects.equals(
                this.data,
                listGlobalIpHealthChecks200Response.data
            ) &&
            Objects.equals(this.meta, listGlobalIpHealthChecks200Response.meta)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalIpHealthChecks200Response {\n");
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
