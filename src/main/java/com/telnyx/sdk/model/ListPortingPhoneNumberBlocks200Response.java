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
import com.telnyx.sdk.model.PaginationMeta;
import com.telnyx.sdk.model.PortingPhoneNumberBlock;
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
 * ListPortingPhoneNumberBlocks200Response
 */
@JsonPropertyOrder(
    {
        ListPortingPhoneNumberBlocks200Response.JSON_PROPERTY_DATA,
        ListPortingPhoneNumberBlocks200Response.JSON_PROPERTY_META,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ListPortingPhoneNumberBlocks200Response {

    public static final String JSON_PROPERTY_DATA = "data";
    private List<PortingPhoneNumberBlock> data = null;

    public static final String JSON_PROPERTY_META = "meta";
    private PaginationMeta meta;

    public ListPortingPhoneNumberBlocks200Response() {}

    public ListPortingPhoneNumberBlocks200Response data(
        List<PortingPhoneNumberBlock> data
    ) {
        this.data = data;
        return this;
    }

    public ListPortingPhoneNumberBlocks200Response adddataItem(
        PortingPhoneNumberBlock dataItem
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<PortingPhoneNumberBlock> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<PortingPhoneNumberBlock> data) {
        this.data = data;
    }

    public ListPortingPhoneNumberBlocks200Response meta(PaginationMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     * @return meta
     **/
    @javax.annotation.Nullable
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
     * Return true if this listPortingPhoneNumberBlocks_200_response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPortingPhoneNumberBlocks200Response listPortingPhoneNumberBlocks200Response =
            (ListPortingPhoneNumberBlocks200Response) o;
        return (
            Objects.equals(
                this.data,
                listPortingPhoneNumberBlocks200Response.data
            ) &&
            Objects.equals(
                this.meta,
                listPortingPhoneNumberBlocks200Response.meta
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
        sb.append("class ListPortingPhoneNumberBlocks200Response {\n");
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
