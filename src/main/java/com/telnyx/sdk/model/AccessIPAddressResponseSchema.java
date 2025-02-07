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
import com.telnyx.sdk.model.CloudflareSyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AccessIPAddressResponseSchema
 */
@JsonPropertyOrder(
    {
        AccessIPAddressResponseSchema.JSON_PROPERTY_ID,
        AccessIPAddressResponseSchema.JSON_PROPERTY_IP_ADDRESS,
        AccessIPAddressResponseSchema.JSON_PROPERTY_SOURCE,
        AccessIPAddressResponseSchema.JSON_PROPERTY_STATUS,
        AccessIPAddressResponseSchema.JSON_PROPERTY_DESCRIPTION,
        AccessIPAddressResponseSchema.JSON_PROPERTY_USER_ID,
        AccessIPAddressResponseSchema.JSON_PROPERTY_CREATED_AT,
        AccessIPAddressResponseSchema.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AccessIPAddressResponseSchema {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
    private String ipAddress;

    public static final String JSON_PROPERTY_SOURCE = "source";
    private String source;

    public static final String JSON_PROPERTY_STATUS = "status";
    private CloudflareSyncStatus status;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_USER_ID = "user_id";
    private String userId;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public AccessIPAddressResponseSchema() {}

    public AccessIPAddressResponseSchema id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public AccessIPAddressResponseSchema ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     * @return ipAddress
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AccessIPAddressResponseSchema source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSource(String source) {
        this.source = source;
    }

    public AccessIPAddressResponseSchema status(CloudflareSyncStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CloudflareSyncStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(CloudflareSyncStatus status) {
        this.status = status;
    }

    public AccessIPAddressResponseSchema description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public AccessIPAddressResponseSchema userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUserId() {
        return userId;
    }

    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AccessIPAddressResponseSchema createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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

    public AccessIPAddressResponseSchema updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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
     * Return true if this AccessIPAddressResponseSchema object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessIPAddressResponseSchema accessIPAddressResponseSchema =
            (AccessIPAddressResponseSchema) o;
        return (
            Objects.equals(this.id, accessIPAddressResponseSchema.id) &&
            Objects.equals(
                this.ipAddress,
                accessIPAddressResponseSchema.ipAddress
            ) &&
            Objects.equals(this.source, accessIPAddressResponseSchema.source) &&
            Objects.equals(this.status, accessIPAddressResponseSchema.status) &&
            Objects.equals(
                this.description,
                accessIPAddressResponseSchema.description
            ) &&
            Objects.equals(this.userId, accessIPAddressResponseSchema.userId) &&
            Objects.equals(
                this.createdAt,
                accessIPAddressResponseSchema.createdAt
            ) &&
            Objects.equals(
                this.updatedAt,
                accessIPAddressResponseSchema.updatedAt
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            ipAddress,
            source,
            status,
            description,
            userId,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessIPAddressResponseSchema {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    ipAddress: ")
            .append(toIndentedString(ipAddress))
            .append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    description: ")
            .append(toIndentedString(description))
            .append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
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
