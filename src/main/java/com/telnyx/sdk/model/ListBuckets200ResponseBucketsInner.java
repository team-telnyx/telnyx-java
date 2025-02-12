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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListBuckets200ResponseBucketsInner
 */
@JsonPropertyOrder(
    {
        ListBuckets200ResponseBucketsInner.JSON_PROPERTY_NAME,
        ListBuckets200ResponseBucketsInner.JSON_PROPERTY_CREATION_DATE,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ListBuckets200ResponseBucketsInner {

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_CREATION_DATE = "creation_date";
    private OffsetDateTime creationDate;

    public ListBuckets200ResponseBucketsInner() {}

    public ListBuckets200ResponseBucketsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the bucket
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The name of the bucket")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public ListBuckets200ResponseBucketsInner creationDate(
        OffsetDateTime creationDate
    ) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date the bucket was created
     * @return creationDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The date the bucket was created")
    @JsonProperty(JSON_PROPERTY_CREATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    @JsonProperty(JSON_PROPERTY_CREATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Return true if this ListBuckets_200_response_buckets_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBuckets200ResponseBucketsInner listBuckets200ResponseBucketsInner =
            (ListBuckets200ResponseBucketsInner) o;
        return (
            Objects.equals(
                this.name,
                listBuckets200ResponseBucketsInner.name
            ) &&
            Objects.equals(
                this.creationDate,
                listBuckets200ResponseBucketsInner.creationDate
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBuckets200ResponseBucketsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    creationDate: ")
            .append(toIndentedString(creationDate))
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
