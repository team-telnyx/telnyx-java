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
import com.telnyx.sdk.model.CreationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BrandStatus
 */
@JsonPropertyOrder(
    {
        BrandStatus.JSON_PROPERTY_DISPLAY_NAME,
        BrandStatus.JSON_PROPERTY_STATUS,
        BrandStatus.JSON_PROPERTY_BRAND_ID,
        BrandStatus.JSON_PROPERTY_CREATED_AT,
        BrandStatus.JSON_PROPERTY_ERROR,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class BrandStatus {

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_STATUS = "status";
    private CreationStatus status;

    public static final String JSON_PROPERTY_BRAND_ID = "brandId";
    private String brandId;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_ERROR = "error";
    private String error;

    public BrandStatus() {}

    public BrandStatus displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The display name of the brand submitted via bulk creation.
     * @return displayName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "John's Donuts",
        required = true,
        value = "The display name of the brand submitted via bulk creation."
    )
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BrandStatus status(CreationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the brand.
     * @return status
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The current status of the brand."
    )
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreationStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(CreationStatus status) {
        this.status = status;
    }

    public BrandStatus brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * The ID of the brand created via bulk creation. This brand will only have a brandId after the brand has been created.
     * @return brandId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "4b20017a-2f50-4c90-c9e6-5f67304cbde9",
        value = "The ID of the brand created via bulk creation. This brand will only have a brandId after the brand has been created."
    )
    @JsonProperty(JSON_PROPERTY_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBrandId() {
        return brandId;
    }

    @JsonProperty(JSON_PROPERTY_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public BrandStatus createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time that the brand was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-06-30T10:49:04-07:00",
        value = "The date and time that the brand was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BrandStatus error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Errors related to a brand creation failure.
     * @return error
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Missing firstName attribute.",
        value = "Errors related to a brand creation failure."
    )
    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getError() {
        return error;
    }

    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Return true if this BrandStatus object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandStatus brandStatus = (BrandStatus) o;
        return (
            Objects.equals(this.displayName, brandStatus.displayName) &&
            Objects.equals(this.status, brandStatus.status) &&
            Objects.equals(this.brandId, brandStatus.brandId) &&
            Objects.equals(this.createdAt, brandStatus.createdAt) &&
            Objects.equals(this.error, brandStatus.error)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, status, brandId, createdAt, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandStatus {\n");
        sb
            .append("    displayName: ")
            .append(toIndentedString(displayName))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    brandId: ")
            .append(toIndentedString(brandId))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
