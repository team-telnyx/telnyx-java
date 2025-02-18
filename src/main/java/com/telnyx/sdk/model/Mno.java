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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Mno
 */
@JsonPropertyOrder(
    {
        Mno.JSON_PROPERTY_NETWORK_ID,
        Mno.JSON_PROPERTY_DISPLAY_NAME,
        Mno.JSON_PROPERTY_OSR_BITMASK_INDEX,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class Mno {

    public static final String JSON_PROPERTY_NETWORK_ID = "networkId";
    private Integer networkId;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_OSR_BITMASK_INDEX =
        "osrBitmaskIndex";
    private Integer osrBitmaskIndex;

    public Mno() {}

    public Mno networkId(Integer networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Unique network identifier assigned to MNO.
     * minimum: 10000
     * @return networkId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Unique network identifier assigned to MNO."
    )
    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getNetworkId() {
        return networkId;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    public Mno displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the mobile network operator.
     * @return displayName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Display name of the mobile network operator."
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

    public Mno osrBitmaskIndex(Integer osrBitmaskIndex) {
        this.osrBitmaskIndex = osrBitmaskIndex;
        return this;
    }

    /**
     * NetNumber OSR &#39;campaign_id&#39; property&#39;s &#39;status&#39; attribute holds individual MNO campaign operation status. The &#39;status&#39; attribute leverages bitmasking technique to store multiple MNOs&#39; operating status. The campaign operation status is reduced to &#39;1&#39; or &#39;0&#39; value where &#39;1&#39; indicate an &#39;ACTIVE&#39; status and &#39;0&#39; represents every other non-active statuses, including REVIEW, REJECT and SUSPEND. The &#39;osrBitmaskIndex&#39; holds the bitmask index of the MNO. For example, T-Mobile&#39;s bitmask index is 2, which implies T-Mobile&#39;s campaign operation status is stored in bit #2, or 3rd bit when counting from right.
     * minimum: 1
     * maximum: 32
     * @return osrBitmaskIndex
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "NetNumber OSR 'campaign_id' property's 'status' attribute holds individual MNO campaign operation status. The 'status' attribute leverages bitmasking technique to store multiple MNOs' operating status. The campaign operation status is reduced to '1' or '0' value where '1' indicate an 'ACTIVE' status and '0' represents every other non-active statuses, including REVIEW, REJECT and SUSPEND. The 'osrBitmaskIndex' holds the bitmask index of the MNO. For example, T-Mobile's bitmask index is 2, which implies T-Mobile's campaign operation status is stored in bit #2, or 3rd bit when counting from right."
    )
    @JsonProperty(JSON_PROPERTY_OSR_BITMASK_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getOsrBitmaskIndex() {
        return osrBitmaskIndex;
    }

    @JsonProperty(JSON_PROPERTY_OSR_BITMASK_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOsrBitmaskIndex(Integer osrBitmaskIndex) {
        this.osrBitmaskIndex = osrBitmaskIndex;
    }

    /**
     * Return true if this Mno object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mno mno = (Mno) o;
        return (
            Objects.equals(this.networkId, mno.networkId) &&
            Objects.equals(this.displayName, mno.displayName) &&
            Objects.equals(this.osrBitmaskIndex, mno.osrBitmaskIndex)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkId, displayName, osrBitmaskIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Mno {\n");
        sb
            .append("    networkId: ")
            .append(toIndentedString(networkId))
            .append("\n");
        sb
            .append("    displayName: ")
            .append(toIndentedString(displayName))
            .append("\n");
        sb
            .append("    osrBitmaskIndex: ")
            .append(toIndentedString(osrBitmaskIndex))
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
