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
import com.telnyx.sdk.model.WhatsappPhoneNumber;
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
 * ListWhatsAppPhoneNumbersResponse
 */
@JsonPropertyOrder(
    {
        ListWhatsAppPhoneNumbersResponse.JSON_PROPERTY_DATA,
        ListWhatsAppPhoneNumbersResponse.JSON_PROPERTY_META,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class ListWhatsAppPhoneNumbersResponse {

    public static final String JSON_PROPERTY_DATA = "data";
    private List<WhatsappPhoneNumber> data = null;

    public static final String JSON_PROPERTY_META = "meta";
    private PaginationMeta meta;

    public ListWhatsAppPhoneNumbersResponse() {}

    public ListWhatsAppPhoneNumbersResponse data(
        List<WhatsappPhoneNumber> data
    ) {
        this.data = data;
        return this;
    }

    public ListWhatsAppPhoneNumbersResponse addDataItem(
        WhatsappPhoneNumber dataItem
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
    public List<WhatsappPhoneNumber> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<WhatsappPhoneNumber> data) {
        this.data = data;
    }

    public ListWhatsAppPhoneNumbersResponse meta(PaginationMeta meta) {
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
     * Return true if this List_WhatsApp_Phone_Numbers_Response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWhatsAppPhoneNumbersResponse listWhatsAppPhoneNumbersResponse =
            (ListWhatsAppPhoneNumbersResponse) o;
        return (
            Objects.equals(this.data, listWhatsAppPhoneNumbersResponse.data) &&
            Objects.equals(this.meta, listWhatsAppPhoneNumbersResponse.meta)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWhatsAppPhoneNumbersResponse {\n");
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
