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
 * WireguardInterfaceCreate
 */
@JsonPropertyOrder(
    {
        WireguardInterfaceCreate.JSON_PROPERTY_ID,
        WireguardInterfaceCreate.JSON_PROPERTY_RECORD_TYPE,
        WireguardInterfaceCreate.JSON_PROPERTY_CREATED_AT,
        WireguardInterfaceCreate.JSON_PROPERTY_UPDATED_AT,
        WireguardInterfaceCreate.JSON_PROPERTY_NETWORK_ID,
        WireguardInterfaceCreate.JSON_PROPERTY_NAME,
        WireguardInterfaceCreate.JSON_PROPERTY_STATUS,
        WireguardInterfaceCreate.JSON_PROPERTY_ENDPOINT,
        WireguardInterfaceCreate.JSON_PROPERTY_PUBLIC_KEY,
        WireguardInterfaceCreate.JSON_PROPERTY_ENABLE_SIP_TRUNKING,
        WireguardInterfaceCreate.JSON_PROPERTY_REGION_CODE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class WireguardInterfaceCreate {

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

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_STATUS = "status";
    private InterfaceStatus status;

    public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
    private String endpoint;

    public static final String JSON_PROPERTY_PUBLIC_KEY = "public_key";
    private String publicKey;

    public static final String JSON_PROPERTY_ENABLE_SIP_TRUNKING =
        "enable_sip_trunking";
    private Boolean enableSipTrunking;

    public static final String JSON_PROPERTY_REGION_CODE = "region_code";
    private String regionCode;

    public WireguardInterfaceCreate() {}

    @JsonCreator
    public WireguardInterfaceCreate(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt,
        @JsonProperty(JSON_PROPERTY_ENDPOINT) String endpoint,
        @JsonProperty(JSON_PROPERTY_PUBLIC_KEY) String publicKey
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.endpoint = endpoint;
        this.publicKey = publicKey;
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
        example = "wireguard_interface",
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

    public WireguardInterfaceCreate networkId(UUID networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * The id of the network associated with the interface.
     * @return networkId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        required = true,
        value = "The id of the network associated with the interface."
    )
    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getNetworkId() {
        return networkId;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNetworkId(UUID networkId) {
        this.networkId = networkId;
    }

    public WireguardInterfaceCreate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A user specified name for the interface.
     * @return name
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "test interface",
        value = "A user specified name for the interface."
    )
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

    public WireguardInterfaceCreate status(InterfaceStatus status) {
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
     * The Telnyx WireGuard peers &#x60;Peer.endpoint&#x60; value.
     * @return endpoint
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "203.0.113.0:51871",
        value = "The Telnyx WireGuard peers `Peer.endpoint` value."
    )
    @JsonProperty(JSON_PROPERTY_ENDPOINT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * The Telnyx WireGuard peers &#x60;Peer.PublicKey&#x60;.
     * @return publicKey
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=",
        value = "The Telnyx WireGuard peers `Peer.PublicKey`."
    )
    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPublicKey() {
        return publicKey;
    }

    public WireguardInterfaceCreate enableSipTrunking(
        Boolean enableSipTrunking
    ) {
        this.enableSipTrunking = enableSipTrunking;
        return this;
    }

    /**
     * Enable SIP traffic forwarding over VPN interface.
     * @return enableSipTrunking
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Enable SIP traffic forwarding over VPN interface."
    )
    @JsonProperty(JSON_PROPERTY_ENABLE_SIP_TRUNKING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnableSipTrunking() {
        return enableSipTrunking;
    }

    @JsonProperty(JSON_PROPERTY_ENABLE_SIP_TRUNKING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnableSipTrunking(Boolean enableSipTrunking) {
        this.enableSipTrunking = enableSipTrunking;
    }

    public WireguardInterfaceCreate regionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * The region the interface should be deployed to.
     * @return regionCode
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "ashburn-va",
        required = true,
        value = "The region the interface should be deployed to."
    )
    @JsonProperty(JSON_PROPERTY_REGION_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getRegionCode() {
        return regionCode;
    }

    @JsonProperty(JSON_PROPERTY_REGION_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * Return true if this WireguardInterfaceCreate object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WireguardInterfaceCreate wireguardInterfaceCreate =
            (WireguardInterfaceCreate) o;
        return (
            Objects.equals(this.id, wireguardInterfaceCreate.id) &&
            Objects.equals(
                this.recordType,
                wireguardInterfaceCreate.recordType
            ) &&
            Objects.equals(
                this.createdAt,
                wireguardInterfaceCreate.createdAt
            ) &&
            Objects.equals(
                this.updatedAt,
                wireguardInterfaceCreate.updatedAt
            ) &&
            Objects.equals(
                this.networkId,
                wireguardInterfaceCreate.networkId
            ) &&
            Objects.equals(this.name, wireguardInterfaceCreate.name) &&
            Objects.equals(this.status, wireguardInterfaceCreate.status) &&
            Objects.equals(this.endpoint, wireguardInterfaceCreate.endpoint) &&
            Objects.equals(
                this.publicKey,
                wireguardInterfaceCreate.publicKey
            ) &&
            Objects.equals(
                this.enableSipTrunking,
                wireguardInterfaceCreate.enableSipTrunking
            ) &&
            Objects.equals(this.regionCode, wireguardInterfaceCreate.regionCode)
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
            name,
            status,
            endpoint,
            publicKey,
            enableSipTrunking,
            regionCode
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WireguardInterfaceCreate {\n");
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
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    endpoint: ")
            .append(toIndentedString(endpoint))
            .append("\n");
        sb
            .append("    publicKey: ")
            .append(toIndentedString(publicKey))
            .append("\n");
        sb
            .append("    enableSipTrunking: ")
            .append(toIndentedString(enableSipTrunking))
            .append("\n");
        sb
            .append("    regionCode: ")
            .append(toIndentedString(regionCode))
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
