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
 * VirtualCrossConnectPatch
 */
@JsonPropertyOrder(
    {
        VirtualCrossConnectPatch.JSON_PROPERTY_PRIMARY_ENABLED,
        VirtualCrossConnectPatch.JSON_PROPERTY_PRIMARY_ROUTING_ANNOUNCEMENT,
        VirtualCrossConnectPatch.JSON_PROPERTY_PRIMARY_CLOUD_IP,
        VirtualCrossConnectPatch.JSON_PROPERTY_SECONDARY_ENABLED,
        VirtualCrossConnectPatch.JSON_PROPERTY_SECONDARY_ROUTING_ANNOUNCEMENT,
        VirtualCrossConnectPatch.JSON_PROPERTY_SECONDARY_CLOUD_IP,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VirtualCrossConnectPatch {

    public static final String JSON_PROPERTY_PRIMARY_ENABLED =
        "primary_enabled";
    private Boolean primaryEnabled;

    public static final String JSON_PROPERTY_PRIMARY_ROUTING_ANNOUNCEMENT =
        "primary_routing_announcement";
    private Boolean primaryRoutingAnnouncement;

    public static final String JSON_PROPERTY_PRIMARY_CLOUD_IP =
        "primary_cloud_ip";
    private String primaryCloudIp;

    public static final String JSON_PROPERTY_SECONDARY_ENABLED =
        "secondary_enabled";
    private Boolean secondaryEnabled;

    public static final String JSON_PROPERTY_SECONDARY_ROUTING_ANNOUNCEMENT =
        "secondary_routing_announcement";
    private Boolean secondaryRoutingAnnouncement;

    public static final String JSON_PROPERTY_SECONDARY_CLOUD_IP =
        "secondary_cloud_ip";
    private String secondaryCloudIp;

    public VirtualCrossConnectPatch() {}

    public VirtualCrossConnectPatch primaryEnabled(Boolean primaryEnabled) {
        this.primaryEnabled = primaryEnabled;
        return this;
    }

    /**
     * Indicates whether the primary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit.
     * @return primaryEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Indicates whether the primary circuit is enabled. Setting this to `false` will disable the circuit."
    )
    @JsonProperty(JSON_PROPERTY_PRIMARY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPrimaryEnabled() {
        return primaryEnabled;
    }

    @JsonProperty(JSON_PROPERTY_PRIMARY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrimaryEnabled(Boolean primaryEnabled) {
        this.primaryEnabled = primaryEnabled;
    }

    public VirtualCrossConnectPatch primaryRoutingAnnouncement(
        Boolean primaryRoutingAnnouncement
    ) {
        this.primaryRoutingAnnouncement = primaryRoutingAnnouncement;
        return this;
    }

    /**
     * Whether the primary BGP route is being announced.
     * @return primaryRoutingAnnouncement
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the primary BGP route is being announced."
    )
    @JsonProperty(JSON_PROPERTY_PRIMARY_ROUTING_ANNOUNCEMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPrimaryRoutingAnnouncement() {
        return primaryRoutingAnnouncement;
    }

    @JsonProperty(JSON_PROPERTY_PRIMARY_ROUTING_ANNOUNCEMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrimaryRoutingAnnouncement(
        Boolean primaryRoutingAnnouncement
    ) {
        this.primaryRoutingAnnouncement = primaryRoutingAnnouncement;
    }

    public VirtualCrossConnectPatch primaryCloudIp(String primaryCloudIp) {
        this.primaryCloudIp = primaryCloudIp;
        return this;
    }

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value can not be patched once the VXC has bene provisioned.
     * @return primaryCloudIp
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "169.254.0.2",
        value = "The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is provided, one will be generated for you.<br /><br />This value can not be patched once the VXC has bene provisioned."
    )
    @JsonProperty(JSON_PROPERTY_PRIMARY_CLOUD_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPrimaryCloudIp() {
        return primaryCloudIp;
    }

    @JsonProperty(JSON_PROPERTY_PRIMARY_CLOUD_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrimaryCloudIp(String primaryCloudIp) {
        this.primaryCloudIp = primaryCloudIp;
    }

    public VirtualCrossConnectPatch secondaryEnabled(Boolean secondaryEnabled) {
        this.secondaryEnabled = secondaryEnabled;
        return this;
    }

    /**
     * Indicates whether the secondary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit.
     * @return secondaryEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Indicates whether the secondary circuit is enabled. Setting this to `false` will disable the circuit."
    )
    @JsonProperty(JSON_PROPERTY_SECONDARY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSecondaryEnabled() {
        return secondaryEnabled;
    }

    @JsonProperty(JSON_PROPERTY_SECONDARY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSecondaryEnabled(Boolean secondaryEnabled) {
        this.secondaryEnabled = secondaryEnabled;
    }

    public VirtualCrossConnectPatch secondaryRoutingAnnouncement(
        Boolean secondaryRoutingAnnouncement
    ) {
        this.secondaryRoutingAnnouncement = secondaryRoutingAnnouncement;
        return this;
    }

    /**
     * Whether the secondary BGP route is being announced.
     * @return secondaryRoutingAnnouncement
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the secondary BGP route is being announced."
    )
    @JsonProperty(JSON_PROPERTY_SECONDARY_ROUTING_ANNOUNCEMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSecondaryRoutingAnnouncement() {
        return secondaryRoutingAnnouncement;
    }

    @JsonProperty(JSON_PROPERTY_SECONDARY_ROUTING_ANNOUNCEMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSecondaryRoutingAnnouncement(
        Boolean secondaryRoutingAnnouncement
    ) {
        this.secondaryRoutingAnnouncement = secondaryRoutingAnnouncement;
    }

    public VirtualCrossConnectPatch secondaryCloudIp(String secondaryCloudIp) {
        this.secondaryCloudIp = secondaryCloudIp;
        return this;
    }

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value can not be patched once the VXC has bene provisioned.
     * @return secondaryCloudIp
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "169.254.0.4",
        value = "The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is provided, one will be generated for you.<br /><br />This value can not be patched once the VXC has bene provisioned."
    )
    @JsonProperty(JSON_PROPERTY_SECONDARY_CLOUD_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSecondaryCloudIp() {
        return secondaryCloudIp;
    }

    @JsonProperty(JSON_PROPERTY_SECONDARY_CLOUD_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSecondaryCloudIp(String secondaryCloudIp) {
        this.secondaryCloudIp = secondaryCloudIp;
    }

    /**
     * Return true if this VirtualCrossConnectPatch object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualCrossConnectPatch virtualCrossConnectPatch =
            (VirtualCrossConnectPatch) o;
        return (
            Objects.equals(
                this.primaryEnabled,
                virtualCrossConnectPatch.primaryEnabled
            ) &&
            Objects.equals(
                this.primaryRoutingAnnouncement,
                virtualCrossConnectPatch.primaryRoutingAnnouncement
            ) &&
            Objects.equals(
                this.primaryCloudIp,
                virtualCrossConnectPatch.primaryCloudIp
            ) &&
            Objects.equals(
                this.secondaryEnabled,
                virtualCrossConnectPatch.secondaryEnabled
            ) &&
            Objects.equals(
                this.secondaryRoutingAnnouncement,
                virtualCrossConnectPatch.secondaryRoutingAnnouncement
            ) &&
            Objects.equals(
                this.secondaryCloudIp,
                virtualCrossConnectPatch.secondaryCloudIp
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            primaryEnabled,
            primaryRoutingAnnouncement,
            primaryCloudIp,
            secondaryEnabled,
            secondaryRoutingAnnouncement,
            secondaryCloudIp
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualCrossConnectPatch {\n");
        sb
            .append("    primaryEnabled: ")
            .append(toIndentedString(primaryEnabled))
            .append("\n");
        sb
            .append("    primaryRoutingAnnouncement: ")
            .append(toIndentedString(primaryRoutingAnnouncement))
            .append("\n");
        sb
            .append("    primaryCloudIp: ")
            .append(toIndentedString(primaryCloudIp))
            .append("\n");
        sb
            .append("    secondaryEnabled: ")
            .append(toIndentedString(secondaryEnabled))
            .append("\n");
        sb
            .append("    secondaryRoutingAnnouncement: ")
            .append(toIndentedString(secondaryRoutingAnnouncement))
            .append("\n");
        sb
            .append("    secondaryCloudIp: ")
            .append(toIndentedString(secondaryCloudIp))
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
