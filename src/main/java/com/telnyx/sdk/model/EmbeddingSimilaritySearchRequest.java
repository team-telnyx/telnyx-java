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
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EmbeddingSimilaritySearchRequest
 */
@JsonPropertyOrder(
    {
        EmbeddingSimilaritySearchRequest.JSON_PROPERTY_BUCKET_NAME,
        EmbeddingSimilaritySearchRequest.JSON_PROPERTY_QUERY,
        EmbeddingSimilaritySearchRequest.JSON_PROPERTY_NUM_OF_DOCS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class EmbeddingSimilaritySearchRequest {

    public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
    private String bucketName;

    public static final String JSON_PROPERTY_QUERY = "query";
    private String query;

    public static final String JSON_PROPERTY_NUM_OF_DOCS = "num_of_docs";
    private Integer numOfDocs = 3;

    public EmbeddingSimilaritySearchRequest() {}

    public EmbeddingSimilaritySearchRequest bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get bucketName
     * @return bucketName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBucketName() {
        return bucketName;
    }

    @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public EmbeddingSimilaritySearchRequest query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     * @return query
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_QUERY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getQuery() {
        return query;
    }

    @JsonProperty(JSON_PROPERTY_QUERY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setQuery(String query) {
        this.query = query;
    }

    public EmbeddingSimilaritySearchRequest numOfDocs(Integer numOfDocs) {
        this.numOfDocs = numOfDocs;
        return this;
    }

    /**
     * Get numOfDocs
     * @return numOfDocs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NUM_OF_DOCS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getNumOfDocs() {
        return numOfDocs;
    }

    @JsonProperty(JSON_PROPERTY_NUM_OF_DOCS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNumOfDocs(Integer numOfDocs) {
        this.numOfDocs = numOfDocs;
    }

    /**
     * Return true if this EmbeddingSimilaritySearchRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmbeddingSimilaritySearchRequest embeddingSimilaritySearchRequest =
            (EmbeddingSimilaritySearchRequest) o;
        return (
            Objects.equals(
                this.bucketName,
                embeddingSimilaritySearchRequest.bucketName
            ) &&
            Objects.equals(
                this.query,
                embeddingSimilaritySearchRequest.query
            ) &&
            Objects.equals(
                this.numOfDocs,
                embeddingSimilaritySearchRequest.numOfDocs
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, query, numOfDocs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmbeddingSimilaritySearchRequest {\n");
        sb
            .append("    bucketName: ")
            .append(toIndentedString(bucketName))
            .append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb
            .append("    numOfDocs: ")
            .append(toIndentedString(numOfDocs))
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
