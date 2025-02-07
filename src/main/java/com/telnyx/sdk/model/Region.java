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
 * Region
 */
@JsonPropertyOrder(
    {
        Region.JSON_PROPERTY_CODE,
        Region.JSON_PROPERTY_NAME,
        Region.JSON_PROPERTY_INSERTED_AT,
        Region.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class Region {

    public static final String JSON_PROPERTY_CODE = "code";
    private String code;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_INSERTED_AT = "inserted_at";
    private OffsetDateTime insertedAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public Region() {}

    public Region code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The unique code of the region.
     * @return code
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "dc2",
        required = true,
        value = "The unique code of the region."
    )
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCode(String code) {
        this.code = code;
    }

    public Region name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the region.
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Washington DC, US",
        required = true,
        value = "The name of the region."
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public Region insertedAt(OffsetDateTime insertedAt) {
        this.insertedAt = insertedAt;
        return this;
    }

    /**
     * Timestamp when the region was inserted.
     * @return insertedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Timestamp when the region was inserted.")
    @JsonProperty(JSON_PROPERTY_INSERTED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getInsertedAt() {
        return insertedAt;
    }

    @JsonProperty(JSON_PROPERTY_INSERTED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInsertedAt(OffsetDateTime insertedAt) {
        this.insertedAt = insertedAt;
    }

    public Region updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Timestamp when the region was last updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Timestamp when the region was last updated.")
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Return true if this Region object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Region region = (Region) o;
        return (
            Objects.equals(this.code, region.code) &&
            Objects.equals(this.name, region.name) &&
            Objects.equals(this.insertedAt, region.insertedAt) &&
            Objects.equals(this.updatedAt, region.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, insertedAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    insertedAt: ")
            .append(toIndentedString(insertedAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
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
