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
import com.telnyx.sdk.model.PWGAssignedResourcesSummary;
import com.telnyx.sdk.model.PrivateWirelessGatewayStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * PrivateWirelessGateway
 */
@JsonPropertyOrder(
    {
        PrivateWirelessGateway.JSON_PROPERTY_ID,
        PrivateWirelessGateway.JSON_PROPERTY_NETWORK_ID,
        PrivateWirelessGateway.JSON_PROPERTY_RECORD_TYPE,
        PrivateWirelessGateway.JSON_PROPERTY_CREATED_AT,
        PrivateWirelessGateway.JSON_PROPERTY_UPDATED_AT,
        PrivateWirelessGateway.JSON_PROPERTY_NAME,
        PrivateWirelessGateway.JSON_PROPERTY_REGION_CODE,
        PrivateWirelessGateway.JSON_PROPERTY_STATUS,
        PrivateWirelessGateway.JSON_PROPERTY_IP_RANGE,
        PrivateWirelessGateway.JSON_PROPERTY_ASSIGNED_RESOURCES,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PrivateWirelessGateway {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_NETWORK_ID = "network_id";
    private UUID networkId;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_REGION_CODE = "region_code";
    private String regionCode;

    public static final String JSON_PROPERTY_STATUS = "status";
    private PrivateWirelessGatewayStatus status;

    public static final String JSON_PROPERTY_IP_RANGE = "ip_range";
    private String ipRange;

    public static final String JSON_PROPERTY_ASSIGNED_RESOURCES =
        "assigned_resources";
    private List<PWGAssignedResourcesSummary> assignedResources = null;

    public PrivateWirelessGateway() {}

    @JsonCreator
    public PrivateWirelessGateway(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt,
        @JsonProperty(JSON_PROPERTY_IP_RANGE) String ipRange
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.ipRange = ipRange;
    }

    /**
     * Identifies the resource.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "Identifies the resource."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    public PrivateWirelessGateway networkId(UUID networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * The identification of the related network resource.
     * @return networkId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "The identification of the related network resource."
    )
    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getNetworkId() {
        return networkId;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNetworkId(UUID networkId) {
        this.networkId = networkId;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "private_wireless_gateway", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @javax.annotation.Nullable
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
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    public PrivateWirelessGateway name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The private wireless gateway name.
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "My private wireless gateway",
        value = "The private wireless gateway name."
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

    public PrivateWirelessGateway regionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * The name of the region where the Private Wireless Gateway is deployed.
     * @return regionCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "dc2",
        value = "The name of the region where the Private Wireless Gateway is deployed."
    )
    @JsonProperty(JSON_PROPERTY_REGION_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRegionCode() {
        return regionCode;
    }

    @JsonProperty(JSON_PROPERTY_REGION_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PrivateWirelessGateway status(PrivateWirelessGatewayStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PrivateWirelessGatewayStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(PrivateWirelessGatewayStatus status) {
        this.status = status;
    }

    /**
     * IP block used to assign IPs to the SIM cards in the Private Wireless Gateway.
     * @return ipRange
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "100.64.1.0/24",
        value = "IP block used to assign IPs to the SIM cards in the Private Wireless Gateway."
    )
    @JsonProperty(JSON_PROPERTY_IP_RANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIpRange() {
        return ipRange;
    }

    public PrivateWirelessGateway assignedResources(
        List<PWGAssignedResourcesSummary> assignedResources
    ) {
        this.assignedResources = assignedResources;
        return this;
    }

    public PrivateWirelessGateway addassignedResourcesItem(
        PWGAssignedResourcesSummary assignedResourcesItem
    ) {
        if (this.assignedResources == null) {
            this.assignedResources = new ArrayList<>();
        }
        this.assignedResources.add(assignedResourcesItem);
        return this;
    }

    /**
     * A list of the resources that have been assigned to the Private Wireless Gateway.
     * @return assignedResources
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "A list of the resources that have been assigned to the Private Wireless Gateway."
    )
    @JsonProperty(JSON_PROPERTY_ASSIGNED_RESOURCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<PWGAssignedResourcesSummary> getAssignedResources() {
        return assignedResources;
    }

    @JsonProperty(JSON_PROPERTY_ASSIGNED_RESOURCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssignedResources(
        List<PWGAssignedResourcesSummary> assignedResources
    ) {
        this.assignedResources = assignedResources;
    }

    /**
     * Return true if this PrivateWirelessGateway object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateWirelessGateway privateWirelessGateway =
            (PrivateWirelessGateway) o;
        return (
            Objects.equals(this.id, privateWirelessGateway.id) &&
            Objects.equals(this.networkId, privateWirelessGateway.networkId) &&
            Objects.equals(
                this.recordType,
                privateWirelessGateway.recordType
            ) &&
            Objects.equals(this.createdAt, privateWirelessGateway.createdAt) &&
            Objects.equals(this.updatedAt, privateWirelessGateway.updatedAt) &&
            Objects.equals(this.name, privateWirelessGateway.name) &&
            Objects.equals(
                this.regionCode,
                privateWirelessGateway.regionCode
            ) &&
            Objects.equals(this.status, privateWirelessGateway.status) &&
            Objects.equals(this.ipRange, privateWirelessGateway.ipRange) &&
            Objects.equals(
                this.assignedResources,
                privateWirelessGateway.assignedResources
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            networkId,
            recordType,
            createdAt,
            updatedAt,
            name,
            regionCode,
            status,
            ipRange,
            assignedResources
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateWirelessGateway {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    networkId: ")
            .append(toIndentedString(networkId))
            .append("\n");
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
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    regionCode: ")
            .append(toIndentedString(regionCode))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    ipRange: ")
            .append(toIndentedString(ipRange))
            .append("\n");
        sb
            .append("    assignedResources: ")
            .append(toIndentedString(assignedResources))
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
