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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RetrievalDetail
 */
@JsonPropertyOrder({ RetrievalDetail.JSON_PROPERTY_BUCKET_IDS })
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class RetrievalDetail {

    public static final String JSON_PROPERTY_BUCKET_IDS = "bucket_ids";
    private List<String> bucketIds = new ArrayList<>();

    public RetrievalDetail() {}

    public RetrievalDetail bucketIds(List<String> bucketIds) {
        this.bucketIds = bucketIds;
        return this;
    }

    public RetrievalDetail addBucketIdsItem(String bucketIdsItem) {
        this.bucketIds.add(bucketIdsItem);
        return this;
    }

    /**
     * Get bucketIds
     * @return bucketIds
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUCKET_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getBucketIds() {
        return bucketIds;
    }

    @JsonProperty(JSON_PROPERTY_BUCKET_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBucketIds(List<String> bucketIds) {
        this.bucketIds = bucketIds;
    }

    /**
     * Return true if this RetrievalDetail object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrievalDetail retrievalDetail = (RetrievalDetail) o;
        return Objects.equals(this.bucketIds, retrievalDetail.bucketIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrievalDetail {\n");
        sb
            .append("    bucketIds: ")
            .append(toIndentedString(bucketIds))
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
