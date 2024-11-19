/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.InterfaceStatus;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VirtualCrossConnectCreate
 */
@JsonPropertyOrder({
  VirtualCrossConnectCreate.JSON_PROPERTY_ID,
  VirtualCrossConnectCreate.JSON_PROPERTY_RECORD_TYPE,
  VirtualCrossConnectCreate.JSON_PROPERTY_CREATED_AT,
  VirtualCrossConnectCreate.JSON_PROPERTY_UPDATED_AT,
  VirtualCrossConnectCreate.JSON_PROPERTY_NETWORK_ID,
  VirtualCrossConnectCreate.JSON_PROPERTY_NAME,
  VirtualCrossConnectCreate.JSON_PROPERTY_STATUS,
  VirtualCrossConnectCreate.JSON_PROPERTY_CLOUD_PROVIDER,
  VirtualCrossConnectCreate.JSON_PROPERTY_CLOUD_PROVIDER_REGION,
  VirtualCrossConnectCreate.JSON_PROPERTY_BGP_ASN,
  VirtualCrossConnectCreate.JSON_PROPERTY_BANDWIDTH_MBPS,
  VirtualCrossConnectCreate.JSON_PROPERTY_PRIMARY_ENABLED,
  VirtualCrossConnectCreate.JSON_PROPERTY_PRIMARY_CLOUD_ACCOUNT_ID,
  VirtualCrossConnectCreate.JSON_PROPERTY_PRIMARY_TELNYX_IP,
  VirtualCrossConnectCreate.JSON_PROPERTY_PRIMARY_CLOUD_IP,
  VirtualCrossConnectCreate.JSON_PROPERTY_PRIMARY_BGP_KEY,
  VirtualCrossConnectCreate.JSON_PROPERTY_SECONDARY_ENABLED,
  VirtualCrossConnectCreate.JSON_PROPERTY_SECONDARY_CLOUD_ACCOUNT_ID,
  VirtualCrossConnectCreate.JSON_PROPERTY_SECONDARY_TELNYX_IP,
  VirtualCrossConnectCreate.JSON_PROPERTY_SECONDARY_CLOUD_IP,
  VirtualCrossConnectCreate.JSON_PROPERTY_SECONDARY_BGP_KEY,
  VirtualCrossConnectCreate.JSON_PROPERTY_REGION_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class VirtualCrossConnectCreate {
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

  /**
   * The Virtual Private Cloud with which you would like to establish a cross connect.
   */
  public enum CloudProviderEnum {
    AWS(String.valueOf("aws")),
    
    AZURE(String.valueOf("azure")),
    
    GCE(String.valueOf("gce"));

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

  public static final String JSON_PROPERTY_CLOUD_PROVIDER_REGION = "cloud_provider_region";
  private String cloudProviderRegion;

  public static final String JSON_PROPERTY_BGP_ASN = "bgp_asn";
  private BigDecimal bgpAsn;

  public static final String JSON_PROPERTY_BANDWIDTH_MBPS = "bandwidth_mbps";
  private BigDecimal bandwidthMbps;

  public static final String JSON_PROPERTY_PRIMARY_ENABLED = "primary_enabled";
  private Boolean primaryEnabled;

  public static final String JSON_PROPERTY_PRIMARY_CLOUD_ACCOUNT_ID = "primary_cloud_account_id";
  private String primaryCloudAccountId;

  public static final String JSON_PROPERTY_PRIMARY_TELNYX_IP = "primary_telnyx_ip";
  private String primaryTelnyxIp;

  public static final String JSON_PROPERTY_PRIMARY_CLOUD_IP = "primary_cloud_ip";
  private String primaryCloudIp;

  public static final String JSON_PROPERTY_PRIMARY_BGP_KEY = "primary_bgp_key";
  private String primaryBgpKey;

  public static final String JSON_PROPERTY_SECONDARY_ENABLED = "secondary_enabled";
  private Boolean secondaryEnabled;

  public static final String JSON_PROPERTY_SECONDARY_CLOUD_ACCOUNT_ID = "secondary_cloud_account_id";
  private String secondaryCloudAccountId;

  public static final String JSON_PROPERTY_SECONDARY_TELNYX_IP = "secondary_telnyx_ip";
  private String secondaryTelnyxIp;

  public static final String JSON_PROPERTY_SECONDARY_CLOUD_IP = "secondary_cloud_ip";
  private String secondaryCloudIp;

  public static final String JSON_PROPERTY_SECONDARY_BGP_KEY = "secondary_bgp_key";
  private String secondaryBgpKey;

  public static final String JSON_PROPERTY_REGION_CODE = "region_code";
  private String regionCode;

  public VirtualCrossConnectCreate() { 
  }

  @JsonCreator
  public VirtualCrossConnectCreate(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_PRIMARY_ENABLED) Boolean primaryEnabled, 
    @JsonProperty(JSON_PROPERTY_SECONDARY_ENABLED) Boolean secondaryEnabled
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.primaryEnabled = primaryEnabled;
    this.secondaryEnabled = secondaryEnabled;
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
  @ApiModelProperty(example = "virtual_cross_connect", value = "Identifies the type of the resource.")
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




  public VirtualCrossConnectCreate networkId(UUID networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * The id of the network associated with the interface.
   * @return networkId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", required = true, value = "The id of the network associated with the interface.")
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


  public VirtualCrossConnectCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user specified name for the interface.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test interface", value = "A user specified name for the interface.")
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


  public VirtualCrossConnectCreate status(InterfaceStatus status) {
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

  public InterfaceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(InterfaceStatus status) {
    this.status = status;
  }


  public VirtualCrossConnectCreate cloudProvider(CloudProviderEnum cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * The Virtual Private Cloud with which you would like to establish a cross connect.
   * @return cloudProvider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "aws", required = true, value = "The Virtual Private Cloud with which you would like to establish a cross connect.")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CloudProviderEnum getCloudProvider() {
    return cloudProvider;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudProvider(CloudProviderEnum cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public VirtualCrossConnectCreate cloudProviderRegion(String cloudProviderRegion) {
    this.cloudProviderRegion = cloudProviderRegion;
    return this;
  }

   /**
   * The region where your Virtual Private Cloud hosts are located.&lt;br /&gt;&lt;br /&gt;The available regions can be found using the /virtual_cross_connect_regions endpoint.
   * @return cloudProviderRegion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "us-east-1", required = true, value = "The region where your Virtual Private Cloud hosts are located.<br /><br />The available regions can be found using the /virtual_cross_connect_regions endpoint.")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCloudProviderRegion() {
    return cloudProviderRegion;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudProviderRegion(String cloudProviderRegion) {
    this.cloudProviderRegion = cloudProviderRegion;
  }


  public VirtualCrossConnectCreate bgpAsn(BigDecimal bgpAsn) {
    this.bgpAsn = bgpAsn;
    return this;
  }

   /**
   * The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be assigned by Telnyx.
   * @return bgpAsn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1234", required = true, value = "The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be assigned by Telnyx.")
  @JsonProperty(JSON_PROPERTY_BGP_ASN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getBgpAsn() {
    return bgpAsn;
  }


  @JsonProperty(JSON_PROPERTY_BGP_ASN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBgpAsn(BigDecimal bgpAsn) {
    this.bgpAsn = bgpAsn;
  }


  public VirtualCrossConnectCreate bandwidthMbps(BigDecimal bandwidthMbps) {
    this.bandwidthMbps = bandwidthMbps;
    return this;
  }

   /**
   * The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;The available bandwidths can be found using the /virtual_cross_connect_regions endpoint.
   * @return bandwidthMbps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.<br /><br />The available bandwidths can be found using the /virtual_cross_connect_regions endpoint.")
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MBPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBandwidthMbps() {
    return bandwidthMbps;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MBPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthMbps(BigDecimal bandwidthMbps) {
    this.bandwidthMbps = bandwidthMbps;
  }


   /**
   * Indicates whether the primary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit.
   * @return primaryEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the primary circuit is enabled. Setting this to `false` will disable the circuit.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimaryEnabled() {
    return primaryEnabled;
  }




  public VirtualCrossConnectCreate primaryCloudAccountId(String primaryCloudAccountId) {
    this.primaryCloudAccountId = primaryCloudAccountId;
    return this;
  }

   /**
   * The identifier for your Virtual Private Cloud. The number will be different based upon your Cloud provider.
   * @return primaryCloudAccountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456789012", required = true, value = "The identifier for your Virtual Private Cloud. The number will be different based upon your Cloud provider.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrimaryCloudAccountId() {
    return primaryCloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryCloudAccountId(String primaryCloudAccountId) {
    this.primaryCloudAccountId = primaryCloudAccountId;
  }


  public VirtualCrossConnectCreate primaryTelnyxIp(String primaryTelnyxIp) {
    this.primaryTelnyxIp = primaryTelnyxIp;
    return this;
  }

   /**
   * The IP address assigned to the Telnyx side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.
   * @return primaryTelnyxIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "169.254.0.1", value = "The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If none is provided, one will be generated for you.<br /><br />This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_TELNYX_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryTelnyxIp() {
    return primaryTelnyxIp;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_TELNYX_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryTelnyxIp(String primaryTelnyxIp) {
    this.primaryTelnyxIp = primaryTelnyxIp;
  }


  public VirtualCrossConnectCreate primaryCloudIp(String primaryCloudIp) {
    this.primaryCloudIp = primaryCloudIp;
    return this;
  }

   /**
   * The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.
   * @return primaryCloudIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "169.254.0.2", value = "The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is provided, one will be generated for you.<br /><br />This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.")
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


  public VirtualCrossConnectCreate primaryBgpKey(String primaryBgpKey) {
    this.primaryBgpKey = primaryBgpKey;
    return this;
  }

   /**
   * The authentication key for BGP peer configuration.
   * @return primaryBgpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yFV4wEPtPVPfDUGLWiyQzwga", value = "The authentication key for BGP peer configuration.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_BGP_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryBgpKey() {
    return primaryBgpKey;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_BGP_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryBgpKey(String primaryBgpKey) {
    this.primaryBgpKey = primaryBgpKey;
  }


   /**
   * Indicates whether the secondary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit.
   * @return secondaryEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the secondary circuit is enabled. Setting this to `false` will disable the circuit.")
  @JsonProperty(JSON_PROPERTY_SECONDARY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSecondaryEnabled() {
    return secondaryEnabled;
  }




  public VirtualCrossConnectCreate secondaryCloudAccountId(String secondaryCloudAccountId) {
    this.secondaryCloudAccountId = secondaryCloudAccountId;
    return this;
  }

   /**
   * The identifier for your Virtual Private Cloud. The number will be different based upon your Cloud provider.&lt;br /&gt;&lt;br /&gt;This attribute is only necessary for GCE.
   * @return secondaryCloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "The identifier for your Virtual Private Cloud. The number will be different based upon your Cloud provider.<br /><br />This attribute is only necessary for GCE.")
  @JsonProperty(JSON_PROPERTY_SECONDARY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryCloudAccountId() {
    return secondaryCloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryCloudAccountId(String secondaryCloudAccountId) {
    this.secondaryCloudAccountId = secondaryCloudAccountId;
  }


  public VirtualCrossConnectCreate secondaryTelnyxIp(String secondaryTelnyxIp) {
    this.secondaryTelnyxIp = secondaryTelnyxIp;
    return this;
  }

   /**
   * The IP address assigned to the Telnyx side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.
   * @return secondaryTelnyxIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "169.254.0.3", value = "The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If none is provided, one will be generated for you.<br /><br />This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.")
  @JsonProperty(JSON_PROPERTY_SECONDARY_TELNYX_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryTelnyxIp() {
    return secondaryTelnyxIp;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_TELNYX_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryTelnyxIp(String secondaryTelnyxIp) {
    this.secondaryTelnyxIp = secondaryTelnyxIp;
  }


  public VirtualCrossConnectCreate secondaryCloudIp(String secondaryCloudIp) {
    this.secondaryCloudIp = secondaryCloudIp;
    return this;
  }

   /**
   * The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.
   * @return secondaryCloudIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "169.254.0.4", value = "The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is provided, one will be generated for you.<br /><br />This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted.")
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


  public VirtualCrossConnectCreate secondaryBgpKey(String secondaryBgpKey) {
    this.secondaryBgpKey = secondaryBgpKey;
    return this;
  }

   /**
   * The authentication key for BGP peer configuration.
   * @return secondaryBgpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ge1lONeK9RcA83uuWaw9DvZy", value = "The authentication key for BGP peer configuration.")
  @JsonProperty(JSON_PROPERTY_SECONDARY_BGP_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryBgpKey() {
    return secondaryBgpKey;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_BGP_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryBgpKey(String secondaryBgpKey) {
    this.secondaryBgpKey = secondaryBgpKey;
  }


  public VirtualCrossConnectCreate regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * The region the interface should be deployed to.
   * @return regionCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ashburn-va", required = true, value = "The region the interface should be deployed to.")
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
   * Return true if this VirtualCrossConnectCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualCrossConnectCreate virtualCrossConnectCreate = (VirtualCrossConnectCreate) o;
    return Objects.equals(this.id, virtualCrossConnectCreate.id) &&
        Objects.equals(this.recordType, virtualCrossConnectCreate.recordType) &&
        Objects.equals(this.createdAt, virtualCrossConnectCreate.createdAt) &&
        Objects.equals(this.updatedAt, virtualCrossConnectCreate.updatedAt) &&
        Objects.equals(this.networkId, virtualCrossConnectCreate.networkId) &&
        Objects.equals(this.name, virtualCrossConnectCreate.name) &&
        Objects.equals(this.status, virtualCrossConnectCreate.status) &&
        Objects.equals(this.cloudProvider, virtualCrossConnectCreate.cloudProvider) &&
        Objects.equals(this.cloudProviderRegion, virtualCrossConnectCreate.cloudProviderRegion) &&
        Objects.equals(this.bgpAsn, virtualCrossConnectCreate.bgpAsn) &&
        Objects.equals(this.bandwidthMbps, virtualCrossConnectCreate.bandwidthMbps) &&
        Objects.equals(this.primaryEnabled, virtualCrossConnectCreate.primaryEnabled) &&
        Objects.equals(this.primaryCloudAccountId, virtualCrossConnectCreate.primaryCloudAccountId) &&
        Objects.equals(this.primaryTelnyxIp, virtualCrossConnectCreate.primaryTelnyxIp) &&
        Objects.equals(this.primaryCloudIp, virtualCrossConnectCreate.primaryCloudIp) &&
        Objects.equals(this.primaryBgpKey, virtualCrossConnectCreate.primaryBgpKey) &&
        Objects.equals(this.secondaryEnabled, virtualCrossConnectCreate.secondaryEnabled) &&
        Objects.equals(this.secondaryCloudAccountId, virtualCrossConnectCreate.secondaryCloudAccountId) &&
        Objects.equals(this.secondaryTelnyxIp, virtualCrossConnectCreate.secondaryTelnyxIp) &&
        Objects.equals(this.secondaryCloudIp, virtualCrossConnectCreate.secondaryCloudIp) &&
        Objects.equals(this.secondaryBgpKey, virtualCrossConnectCreate.secondaryBgpKey) &&
        Objects.equals(this.regionCode, virtualCrossConnectCreate.regionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, createdAt, updatedAt, networkId, name, status, cloudProvider, cloudProviderRegion, bgpAsn, bandwidthMbps, primaryEnabled, primaryCloudAccountId, primaryTelnyxIp, primaryCloudIp, primaryBgpKey, secondaryEnabled, secondaryCloudAccountId, secondaryTelnyxIp, secondaryCloudIp, secondaryBgpKey, regionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualCrossConnectCreate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    cloudProviderRegion: ").append(toIndentedString(cloudProviderRegion)).append("\n");
    sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
    sb.append("    bandwidthMbps: ").append(toIndentedString(bandwidthMbps)).append("\n");
    sb.append("    primaryEnabled: ").append(toIndentedString(primaryEnabled)).append("\n");
    sb.append("    primaryCloudAccountId: ").append(toIndentedString(primaryCloudAccountId)).append("\n");
    sb.append("    primaryTelnyxIp: ").append(toIndentedString(primaryTelnyxIp)).append("\n");
    sb.append("    primaryCloudIp: ").append(toIndentedString(primaryCloudIp)).append("\n");
    sb.append("    primaryBgpKey: ").append(toIndentedString(primaryBgpKey)).append("\n");
    sb.append("    secondaryEnabled: ").append(toIndentedString(secondaryEnabled)).append("\n");
    sb.append("    secondaryCloudAccountId: ").append(toIndentedString(secondaryCloudAccountId)).append("\n");
    sb.append("    secondaryTelnyxIp: ").append(toIndentedString(secondaryTelnyxIp)).append("\n");
    sb.append("    secondaryCloudIp: ").append(toIndentedString(secondaryCloudIp)).append("\n");
    sb.append("    secondaryBgpKey: ").append(toIndentedString(secondaryBgpKey)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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

