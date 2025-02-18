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
import com.telnyx.sdk.model.InventoryCoverage;
import com.telnyx.sdk.model.InventoryCoverageMetadata;
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
 * CreateInventoryCoverageRequest200Response
 */
@JsonPropertyOrder(
    {
        CreateInventoryCoverageRequest200Response.JSON_PROPERTY_DATA,
        CreateInventoryCoverageRequest200Response.JSON_PROPERTY_META,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class CreateInventoryCoverageRequest200Response {

    public static final String JSON_PROPERTY_DATA = "data";
    private List<InventoryCoverage> data = null;

    public static final String JSON_PROPERTY_META = "meta";
    private InventoryCoverageMetadata meta;

    public CreateInventoryCoverageRequest200Response() {}

    public CreateInventoryCoverageRequest200Response data(
        List<InventoryCoverage> data
    ) {
        this.data = data;
        return this;
    }

    public CreateInventoryCoverageRequest200Response addDataItem(
        InventoryCoverage dataItem
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
    public List<InventoryCoverage> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<InventoryCoverage> data) {
        this.data = data;
    }

    public CreateInventoryCoverageRequest200Response meta(
        InventoryCoverageMetadata meta
    ) {
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
    public InventoryCoverageMetadata getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(InventoryCoverageMetadata meta) {
        this.meta = meta;
    }

    /**
     * Return true if this createInventoryCoverageRequest_200_response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInventoryCoverageRequest200Response createInventoryCoverageRequest200Response =
            (CreateInventoryCoverageRequest200Response) o;
        return (
            Objects.equals(
                this.data,
                createInventoryCoverageRequest200Response.data
            ) &&
            Objects.equals(
                this.meta,
                createInventoryCoverageRequest200Response.meta
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
        sb.append("class CreateInventoryCoverageRequest200Response {\n");
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
