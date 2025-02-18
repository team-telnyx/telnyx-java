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
import com.telnyx.sdk.model.InterfaceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * DefaultGateway
 */
@JsonPropertyOrder(
    {
        DefaultGateway.JSON_PROPERTY_ID,
        DefaultGateway.JSON_PROPERTY_RECORD_TYPE,
        DefaultGateway.JSON_PROPERTY_CREATED_AT,
        DefaultGateway.JSON_PROPERTY_UPDATED_AT,
        DefaultGateway.JSON_PROPERTY_NETWORK_ID,
        DefaultGateway.JSON_PROPERTY_WIREGUARD_PEER_ID,
        DefaultGateway.JSON_PROPERTY_STATUS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class DefaultGateway {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public static final String JSON_PROPERTY_NETWORK_ID = "network_id";
    private UUID networkId;

    public static final String JSON_PROPERTY_WIREGUARD_PEER_ID =
        "wireguard_peer_id";
    private UUID wireguardPeerId;

    public static final String JSON_PROPERTY_STATUS = "status";
    private InterfaceStatus status;

    public DefaultGateway() {}

    @JsonCreator
    public DefaultGateway(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt,
        @JsonProperty(JSON_PROPERTY_NETWORK_ID) UUID networkId
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.networkId = networkId;
    }

    /**
     * Identifies the resource.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "Identifies the resource."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "default_gateway",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Network ID.
     * @return networkId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "e66c496d-4a85-423b-8b2a-8e63fac20320",
        value = "Network ID."
    )
    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getNetworkId() {
        return networkId;
    }

    public DefaultGateway wireguardPeerId(UUID wireguardPeerId) {
        this.wireguardPeerId = wireguardPeerId;
        return this;
    }

    /**
     * Wireguard peer ID.
     * @return wireguardPeerId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "e66c496d-4a85-423b-8b2a-8e63fac20320",
        value = "Wireguard peer ID."
    )
    @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getWireguardPeerId() {
        return wireguardPeerId;
    }

    @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWireguardPeerId(UUID wireguardPeerId) {
        this.wireguardPeerId = wireguardPeerId;
    }

    public DefaultGateway status(InterfaceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public InterfaceStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(InterfaceStatus status) {
        this.status = status;
    }

    /**
     * Return true if this DefaultGateway object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefaultGateway defaultGateway = (DefaultGateway) o;
        return (
            Objects.equals(this.id, defaultGateway.id) &&
            Objects.equals(this.recordType, defaultGateway.recordType) &&
            Objects.equals(this.createdAt, defaultGateway.createdAt) &&
            Objects.equals(this.updatedAt, defaultGateway.updatedAt) &&
            Objects.equals(this.networkId, defaultGateway.networkId) &&
            Objects.equals(
                this.wireguardPeerId,
                defaultGateway.wireguardPeerId
            ) &&
            Objects.equals(this.status, defaultGateway.status)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            recordType,
            createdAt,
            updatedAt,
            networkId,
            wireguardPeerId,
            status
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultGateway {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
        sb
            .append("    networkId: ")
            .append(toIndentedString(networkId))
            .append("\n");
        sb
            .append("    wireguardPeerId: ")
            .append(toIndentedString(wireguardPeerId))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
