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
import com.telnyx.sdk.model.ListBuckets200ResponseBucketsInner;
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
 * ListBuckets200Response
 */
@JsonPropertyOrder({ ListBuckets200Response.JSON_PROPERTY_BUCKETS })
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ListBuckets200Response {

    public static final String JSON_PROPERTY_BUCKETS = "buckets";
    private List<ListBuckets200ResponseBucketsInner> buckets = null;

    public ListBuckets200Response() {}

    public ListBuckets200Response buckets(
        List<ListBuckets200ResponseBucketsInner> buckets
    ) {
        this.buckets = buckets;
        return this;
    }

    public ListBuckets200Response addbucketsItem(
        ListBuckets200ResponseBucketsInner bucketsItem
    ) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    /**
     * Get buckets
     * @return buckets
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUCKETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ListBuckets200ResponseBucketsInner> getBuckets() {
        return buckets;
    }

    @JsonProperty(JSON_PROPERTY_BUCKETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBuckets(List<ListBuckets200ResponseBucketsInner> buckets) {
        this.buckets = buckets;
    }

    /**
     * Return true if this ListBuckets_200_response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBuckets200Response listBuckets200Response =
            (ListBuckets200Response) o;
        return Objects.equals(this.buckets, listBuckets200Response.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBuckets200Response {\n");
        sb
            .append("    buckets: ")
            .append(toIndentedString(buckets))
            .append("\n");
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
