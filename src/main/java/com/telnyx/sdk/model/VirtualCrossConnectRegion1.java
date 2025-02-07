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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * VirtualCrossConnectRegion1
 */
@JsonPropertyOrder(
    {
        VirtualCrossConnectRegion1.JSON_PROPERTY_RECORD_TYPE,
        VirtualCrossConnectRegion1.JSON_PROPERTY_REGION_CODE,
        VirtualCrossConnectRegion1.JSON_PROPERTY_CLOUD_PROVIDER,
        VirtualCrossConnectRegion1.JSON_PROPERTY_CLOUD_REGION,
        VirtualCrossConnectRegion1.JSON_PROPERTY_BANDWIDTH_MBPS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class VirtualCrossConnectRegion1 {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_REGION_CODE = "region_code";
    private String regionCode;

    /**
     * The Virtual Private Cloud with which you would like to establish a cross connect.
     */
    public enum CloudProviderEnum {
        AWS("aws"),

        AZURE("azure"),

        GCE("gce");

        private String value;

        CloudProviderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CloudProviderEnum fromValue(String value) {
            for (CloudProviderEnum b : CloudProviderEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
    private CloudProviderEnum cloudProvider;

    public static final String JSON_PROPERTY_CLOUD_REGION = "cloud_region";
    private String cloudRegion;

    public static final String JSON_PROPERTY_BANDWIDTH_MBPS = "bandwidth_mbps";
    private List<BigDecimal> bandwidthMbps = null;

    public VirtualCrossConnectRegion1() {}

    @JsonCreator
    public VirtualCrossConnectRegion1(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
    ) {
        this();
        this.recordType = recordType;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "virtual_cross_connect_region",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    public VirtualCrossConnectRegion1 regionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * The region the interface is deployed to.
     * @return regionCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "ashburn-va",
        value = "The region the interface is deployed to."
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

    public VirtualCrossConnectRegion1 cloudProvider(
        CloudProviderEnum cloudProvider
    ) {
        this.cloudProvider = cloudProvider;
        return this;
    }

    /**
     * The Virtual Private Cloud with which you would like to establish a cross connect.
     * @return cloudProvider
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "aws",
        value = "The Virtual Private Cloud with which you would like to establish a cross connect."
    )
    @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CloudProviderEnum getCloudProvider() {
        return cloudProvider;
    }

    @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCloudProvider(CloudProviderEnum cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

    public VirtualCrossConnectRegion1 cloudRegion(String cloudRegion) {
        this.cloudRegion = cloudRegion;
        return this;
    }

    /**
     * The region where your Virtual Private Cloud hosts are located.
     * @return cloudRegion
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "us-east-1",
        value = "The region where your Virtual Private Cloud hosts are located."
    )
    @JsonProperty(JSON_PROPERTY_CLOUD_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCloudRegion() {
        return cloudRegion;
    }

    @JsonProperty(JSON_PROPERTY_CLOUD_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCloudRegion(String cloudRegion) {
        this.cloudRegion = cloudRegion;
    }

    public VirtualCrossConnectRegion1 bandwidthMbps(
        List<BigDecimal> bandwidthMbps
    ) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }

    public VirtualCrossConnectRegion1 addBandwidthMbpsItem(
        BigDecimal bandwidthMbpsItem
    ) {
        if (this.bandwidthMbps == null) {
            this.bandwidthMbps = new ArrayList<>();
        }
        this.bandwidthMbps.add(bandwidthMbpsItem);
        return this;
    }

    /**
     * The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.
     * @return bandwidthMbps
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[50,100,200,500]",
        value = "The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect."
    )
    @JsonProperty(JSON_PROPERTY_BANDWIDTH_MBPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<BigDecimal> getBandwidthMbps() {
        return bandwidthMbps;
    }

    @JsonProperty(JSON_PROPERTY_BANDWIDTH_MBPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBandwidthMbps(List<BigDecimal> bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    /**
     * Return true if this VirtualCrossConnectRegion_1 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualCrossConnectRegion1 virtualCrossConnectRegion1 =
            (VirtualCrossConnectRegion1) o;
        return (
            Objects.equals(
                this.recordType,
                virtualCrossConnectRegion1.recordType
            ) &&
            Objects.equals(
                this.regionCode,
                virtualCrossConnectRegion1.regionCode
            ) &&
            Objects.equals(
                this.cloudProvider,
                virtualCrossConnectRegion1.cloudProvider
            ) &&
            Objects.equals(
                this.cloudRegion,
                virtualCrossConnectRegion1.cloudRegion
            ) &&
            Objects.equals(
                this.bandwidthMbps,
                virtualCrossConnectRegion1.bandwidthMbps
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            regionCode,
            cloudProvider,
            cloudRegion,
            bandwidthMbps
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualCrossConnectRegion1 {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    regionCode: ")
            .append(toIndentedString(regionCode))
            .append("\n");
        sb
            .append("    cloudProvider: ")
            .append(toIndentedString(cloudProvider))
            .append("\n");
        sb
            .append("    cloudRegion: ")
            .append(toIndentedString(cloudRegion))
            .append("\n");
        sb
            .append("    bandwidthMbps: ")
            .append(toIndentedString(bandwidthMbps))
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
