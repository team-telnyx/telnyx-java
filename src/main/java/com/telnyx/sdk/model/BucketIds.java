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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * BucketIds
 */
@JsonPropertyOrder(
    {
        BucketIds.JSON_PROPERTY_BUCKET_IDS,
        BucketIds.JSON_PROPERTY_MAX_NUM_RESULTS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BucketIds {

    public static final String JSON_PROPERTY_BUCKET_IDS = "bucket_ids";
    private List<String> bucketIds = new ArrayList<>();

    public static final String JSON_PROPERTY_MAX_NUM_RESULTS =
        "max_num_results";
    private Integer maxNumResults;

    public BucketIds() {}

    public BucketIds bucketIds(List<String> bucketIds) {
        this.bucketIds = bucketIds;
        return this;
    }

    public BucketIds addbucketIdsItem(String bucketIdsItem) {
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

    public BucketIds maxNumResults(Integer maxNumResults) {
        this.maxNumResults = maxNumResults;
        return this;
    }

    /**
     * The maximum number of results to retrieve as context for the language model.
     * @return maxNumResults
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The maximum number of results to retrieve as context for the language model."
    )
    @JsonProperty(JSON_PROPERTY_MAX_NUM_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMaxNumResults() {
        return maxNumResults;
    }

    @JsonProperty(JSON_PROPERTY_MAX_NUM_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxNumResults(Integer maxNumResults) {
        this.maxNumResults = maxNumResults;
    }

    /**
     * Return true if this BucketIds object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BucketIds bucketIds = (BucketIds) o;
        return (
            Objects.equals(this.bucketIds, bucketIds.bucketIds) &&
            Objects.equals(this.maxNumResults, bucketIds.maxNumResults)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketIds, maxNumResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketIds {\n");
        sb
            .append("    bucketIds: ")
            .append(toIndentedString(bucketIds))
            .append("\n");
        sb
            .append("    maxNumResults: ")
            .append(toIndentedString(maxNumResults))
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
