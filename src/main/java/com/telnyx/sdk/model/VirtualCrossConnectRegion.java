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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.Record;
import com.telnyx.sdk.model.VirtualCrossConnectRegion1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VirtualCrossConnectRegion
 */
@JsonPropertyOrder({
  VirtualCrossConnectRegion.JSON_PROPERTY_ID,
  VirtualCrossConnectRegion.JSON_PROPERTY_RECORD_TYPE,
  VirtualCrossConnectRegion.JSON_PROPERTY_CREATED_AT,
  VirtualCrossConnectRegion.JSON_PROPERTY_UPDATED_AT,
  VirtualCrossConnectRegion.JSON_PROPERTY_REGION_CODE,
  VirtualCrossConnectRegion.JSON_PROPERTY_CLOUD_PROVIDER,
  VirtualCrossConnectRegion.JSON_PROPERTY_CLOUD_REGION,
  VirtualCrossConnectRegion.JSON_PROPERTY_BANDWIDTH_MBPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualCrossConnectRegion {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private CloudProviderEnum cloudProvider;

  public static final String JSON_PROPERTY_CLOUD_REGION = "cloud_region";
  private String cloudRegion;

  public static final String JSON_PROPERTY_BANDWIDTH_MBPS = "bandwidth_mbps";
  private List<BigDecimal> bandwidthMbps = null;

  public VirtualCrossConnectRegion() { 
  }

  @JsonCreator
  public VirtualCrossConnectRegion(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "virtual_cross_connect_region", value = "Identifies the type of the resource.")
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
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
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
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  public VirtualCrossConnectRegion regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * The region the interface is deployed to.
   * @return regionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ashburn-va", value = "The region the interface is deployed to.")
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


  public VirtualCrossConnectRegion cloudProvider(CloudProviderEnum cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * The Virtual Private Cloud with which you would like to establish a cross connect.
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aws", value = "The Virtual Private Cloud with which you would like to establish a cross connect.")
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


  public VirtualCrossConnectRegion cloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
    return this;
  }

   /**
   * The region where your Virtual Private Cloud hosts are located.
   * @return cloudRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "us-east-1", value = "The region where your Virtual Private Cloud hosts are located.")
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


  public VirtualCrossConnectRegion bandwidthMbps(List<BigDecimal> bandwidthMbps) {
    this.bandwidthMbps = bandwidthMbps;
    return this;
  }

  public VirtualCrossConnectRegion addBandwidthMbpsItem(BigDecimal bandwidthMbpsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[50,100,200,500]", value = "The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.")
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
   * Return true if this VirtualCrossConnectRegion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualCrossConnectRegion virtualCrossConnectRegion = (VirtualCrossConnectRegion) o;
    return Objects.equals(this.id, virtualCrossConnectRegion.id) &&
        Objects.equals(this.recordType, virtualCrossConnectRegion.recordType) &&
        Objects.equals(this.createdAt, virtualCrossConnectRegion.createdAt) &&
        Objects.equals(this.updatedAt, virtualCrossConnectRegion.updatedAt) &&
        Objects.equals(this.regionCode, virtualCrossConnectRegion.regionCode) &&
        Objects.equals(this.cloudProvider, virtualCrossConnectRegion.cloudProvider) &&
        Objects.equals(this.cloudRegion, virtualCrossConnectRegion.cloudRegion) &&
        Objects.equals(this.bandwidthMbps, virtualCrossConnectRegion.bandwidthMbps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, createdAt, updatedAt, regionCode, cloudProvider, cloudRegion, bandwidthMbps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualCrossConnectRegion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    bandwidthMbps: ").append(toIndentedString(bandwidthMbps)).append("\n");
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

