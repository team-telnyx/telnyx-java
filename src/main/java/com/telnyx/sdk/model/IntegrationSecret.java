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
 * IntegrationSecret
 */
@JsonPropertyOrder(
    {
        IntegrationSecret.JSON_PROPERTY_RECORD_TYPE,
        IntegrationSecret.JSON_PROPERTY_ID,
        IntegrationSecret.JSON_PROPERTY_IDENTIFIER,
        IntegrationSecret.JSON_PROPERTY_CREATED_AT,
        IntegrationSecret.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class IntegrationSecret {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
    private String identifier;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public IntegrationSecret() {}

    public IntegrationSecret recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "integration_secret",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public IntegrationSecret id(String id) {
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

    public IntegrationSecret identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     * @return identifier
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty(JSON_PROPERTY_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public IntegrationSecret createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IntegrationSecret updatedAt(OffsetDateTime updatedAt) {
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
     * Return true if this IntegrationSecret object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegrationSecret integrationSecret = (IntegrationSecret) o;
        return (
            Objects.equals(this.recordType, integrationSecret.recordType) &&
            Objects.equals(this.id, integrationSecret.id) &&
            Objects.equals(this.identifier, integrationSecret.identifier) &&
            Objects.equals(this.createdAt, integrationSecret.createdAt) &&
            Objects.equals(this.updatedAt, integrationSecret.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, id, identifier, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationSecret {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    identifier: ")
            .append(toIndentedString(identifier))
            .append("\n");
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
