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
import com.telnyx.sdk.model.GlobalIpAssignmentHealthMetricGlobalIpAssignmentWireguardPeer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * GlobalIpAssignmentHealthMetricGlobalIpAssignment
 */
@JsonPropertyOrder(
    {
        GlobalIpAssignmentHealthMetricGlobalIpAssignment.JSON_PROPERTY_ID,
        GlobalIpAssignmentHealthMetricGlobalIpAssignment.JSON_PROPERTY_WIREGUARD_PEER_ID,
        GlobalIpAssignmentHealthMetricGlobalIpAssignment.JSON_PROPERTY_WIREGUARD_PEER,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class GlobalIpAssignmentHealthMetricGlobalIpAssignment {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_WIREGUARD_PEER_ID =
        "wireguard_peer_id";
    private UUID wireguardPeerId;

    public static final String JSON_PROPERTY_WIREGUARD_PEER = "wireguard_peer";
    private GlobalIpAssignmentHealthMetricGlobalIpAssignmentWireguardPeer wireguardPeer;

    public GlobalIpAssignmentHealthMetricGlobalIpAssignment() {}

    public GlobalIpAssignmentHealthMetricGlobalIpAssignment id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Global IP assignment ID.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "a836125b-20b6-452e-9c03-2653f09c7ed7",
        value = "Global IP assignment ID."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(UUID id) {
        this.id = id;
    }

    public GlobalIpAssignmentHealthMetricGlobalIpAssignment wireguardPeerId(
        UUID wireguardPeerId
    ) {
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

    public GlobalIpAssignmentHealthMetricGlobalIpAssignment wireguardPeer(
        GlobalIpAssignmentHealthMetricGlobalIpAssignmentWireguardPeer wireguardPeer
    ) {
        this.wireguardPeer = wireguardPeer;
        return this;
    }

    /**
     * Get wireguardPeer
     * @return wireguardPeer
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GlobalIpAssignmentHealthMetricGlobalIpAssignmentWireguardPeer getWireguardPeer() {
        return wireguardPeer;
    }

    @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWireguardPeer(
        GlobalIpAssignmentHealthMetricGlobalIpAssignmentWireguardPeer wireguardPeer
    ) {
        this.wireguardPeer = wireguardPeer;
    }

    /**
     * Return true if this GlobalIpAssignmentHealthMetric_global_ip_assignment object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalIpAssignmentHealthMetricGlobalIpAssignment globalIpAssignmentHealthMetricGlobalIpAssignment =
            (GlobalIpAssignmentHealthMetricGlobalIpAssignment) o;
        return (
            Objects.equals(
                this.id,
                globalIpAssignmentHealthMetricGlobalIpAssignment.id
            ) &&
            Objects.equals(
                this.wireguardPeerId,
                globalIpAssignmentHealthMetricGlobalIpAssignment.wireguardPeerId
            ) &&
            Objects.equals(
                this.wireguardPeer,
                globalIpAssignmentHealthMetricGlobalIpAssignment.wireguardPeer
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wireguardPeerId, wireguardPeer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalIpAssignmentHealthMetricGlobalIpAssignment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    wireguardPeerId: ")
            .append(toIndentedString(wireguardPeerId))
            .append("\n");
        sb
            .append("    wireguardPeer: ")
            .append(toIndentedString(wireguardPeer))
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
