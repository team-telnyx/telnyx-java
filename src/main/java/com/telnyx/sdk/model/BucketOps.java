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
 * BucketOps
 */
@JsonPropertyOrder(
    {
        BucketOps.JSON_PROPERTY_BYTES_SENT,
        BucketOps.JSON_PROPERTY_BYTES_RECEIVED,
        BucketOps.JSON_PROPERTY_OPS,
        BucketOps.JSON_PROPERTY_SUCCESSFUL_OPS,
        BucketOps.JSON_PROPERTY_CATEGORY,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BucketOps {

    public static final String JSON_PROPERTY_BYTES_SENT = "bytes_sent";
    private Integer bytesSent;

    public static final String JSON_PROPERTY_BYTES_RECEIVED = "bytes_received";
    private Integer bytesReceived;

    public static final String JSON_PROPERTY_OPS = "ops";
    private Integer ops;

    public static final String JSON_PROPERTY_SUCCESSFUL_OPS = "successful_ops";
    private Integer successfulOps;

    /**
     * The category of the bucket operation
     */
    public enum CategoryEnum {
        LIST_BUCKET(String.valueOf("list_bucket")),

        LIST_BUCKETS(String.valueOf("list_buckets")),

        GET_BUCKET_LOCATION(String.valueOf("get-bucket_location")),

        CREATE_BUCKET(String.valueOf("create_bucket")),

        STAT_BUCKET(String.valueOf("stat_bucket")),

        GET_BUCKET_VERSIONING(String.valueOf("get_bucket_versioning")),

        SET_BUCKET_VERSIONING(String.valueOf("set_bucket_versioning")),

        GET_OBJ(String.valueOf("get_obj")),

        PUT_OBJ(String.valueOf("put_obj")),

        DELETE_OBJ(String.valueOf("delete_obj"));

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            for (CategoryEnum b : CategoryEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_CATEGORY = "category";
    private CategoryEnum category;

    public BucketOps() {}

    public BucketOps bytesSent(Integer bytesSent) {
        this.bytesSent = bytesSent;
        return this;
    }

    /**
     * The number of bytes sent
     * @return bytesSent
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "123456", value = "The number of bytes sent")
    @JsonProperty(JSON_PROPERTY_BYTES_SENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getBytesSent() {
        return bytesSent;
    }

    @JsonProperty(JSON_PROPERTY_BYTES_SENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBytesSent(Integer bytesSent) {
        this.bytesSent = bytesSent;
    }

    public BucketOps bytesReceived(Integer bytesReceived) {
        this.bytesReceived = bytesReceived;
        return this;
    }

    /**
     * The number of bytes received
     * @return bytesReceived
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "123456",
        value = "The number of bytes received"
    )
    @JsonProperty(JSON_PROPERTY_BYTES_RECEIVED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getBytesReceived() {
        return bytesReceived;
    }

    @JsonProperty(JSON_PROPERTY_BYTES_RECEIVED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBytesReceived(Integer bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    public BucketOps ops(Integer ops) {
        this.ops = ops;
        return this;
    }

    /**
     * The number of operations
     * @return ops
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "123456", value = "The number of operations")
    @JsonProperty(JSON_PROPERTY_OPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getOps() {
        return ops;
    }

    @JsonProperty(JSON_PROPERTY_OPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOps(Integer ops) {
        this.ops = ops;
    }

    public BucketOps successfulOps(Integer successfulOps) {
        this.successfulOps = successfulOps;
        return this;
    }

    /**
     * The number of successful operations
     * @return successfulOps
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "123456",
        value = "The number of successful operations"
    )
    @JsonProperty(JSON_PROPERTY_SUCCESSFUL_OPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getSuccessfulOps() {
        return successfulOps;
    }

    @JsonProperty(JSON_PROPERTY_SUCCESSFUL_OPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuccessfulOps(Integer successfulOps) {
        this.successfulOps = successfulOps;
    }

    public BucketOps category(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * The category of the bucket operation
     * @return category
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "put_obj",
        value = "The category of the bucket operation"
    )
    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CategoryEnum getCategory() {
        return category;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    /**
     * Return true if this BucketOps object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BucketOps bucketOps = (BucketOps) o;
        return (
            Objects.equals(this.bytesSent, bucketOps.bytesSent) &&
            Objects.equals(this.bytesReceived, bucketOps.bytesReceived) &&
            Objects.equals(this.ops, bucketOps.ops) &&
            Objects.equals(this.successfulOps, bucketOps.successfulOps) &&
            Objects.equals(this.category, bucketOps.category)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            bytesSent,
            bytesReceived,
            ops,
            successfulOps,
            category
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketOps {\n");
        sb
            .append("    bytesSent: ")
            .append(toIndentedString(bytesSent))
            .append("\n");
        sb
            .append("    bytesReceived: ")
            .append(toIndentedString(bytesReceived))
            .append("\n");
        sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
        sb
            .append("    successfulOps: ")
            .append(toIndentedString(successfulOps))
            .append("\n");
        sb
            .append("    category: ")
            .append(toIndentedString(category))
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
