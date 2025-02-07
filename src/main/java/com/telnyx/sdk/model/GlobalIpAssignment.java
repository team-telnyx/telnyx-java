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
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpAssignment
 */
@JsonPropertyOrder({
  GlobalIpAssignment.JSON_PROPERTY_ID,
  GlobalIpAssignment.JSON_PROPERTY_RECORD_TYPE,
  GlobalIpAssignment.JSON_PROPERTY_CREATED_AT,
  GlobalIpAssignment.JSON_PROPERTY_UPDATED_AT,
  GlobalIpAssignment.JSON_PROPERTY_GLOBAL_IP_ID,
  GlobalIpAssignment.JSON_PROPERTY_WIREGUARD_PEER_ID,
  GlobalIpAssignment.JSON_PROPERTY_STATUS,
  GlobalIpAssignment.JSON_PROPERTY_IS_CONNECTED,
  GlobalIpAssignment.JSON_PROPERTY_IS_IN_MAINTENANCE,
  GlobalIpAssignment.JSON_PROPERTY_IS_ANNOUNCED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GlobalIpAssignment {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_GLOBAL_IP_ID = "global_ip_id";
  private UUID globalIpId;

  public static final String JSON_PROPERTY_WIREGUARD_PEER_ID = "wireguard_peer_id";
  private UUID wireguardPeerId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InterfaceStatus status;

  public static final String JSON_PROPERTY_IS_CONNECTED = "is_connected";
  private Boolean isConnected;

  public static final String JSON_PROPERTY_IS_IN_MAINTENANCE = "is_in_maintenance";
  private Boolean isInMaintenance;

  public static final String JSON_PROPERTY_IS_ANNOUNCED = "is_announced";
  private Boolean isAnnounced;

  public GlobalIpAssignment() { 
  }

  @JsonCreator
  public GlobalIpAssignment(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_IS_CONNECTED) Boolean isConnected, 
    @JsonProperty(JSON_PROPERTY_IS_ANNOUNCED) Boolean isAnnounced
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.isConnected = isConnected;
    this.isAnnounced = isAnnounced;
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
  @ApiModelProperty(example = "global_ip_assignment", value = "Identifies the type of the resource.")
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




  public GlobalIpAssignment globalIpId(UUID globalIpId) {
    this.globalIpId = globalIpId;
    return this;
  }

   /**
   * Global IP ID.
   * @return globalIpId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a836125b-20b6-452e-9c03-2653f09c7ed7", value = "Global IP ID.")
  @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getGlobalIpId() {
    return globalIpId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalIpId(UUID globalIpId) {
    this.globalIpId = globalIpId;
  }


  public GlobalIpAssignment wireguardPeerId(UUID wireguardPeerId) {
    this.wireguardPeerId = wireguardPeerId;
    return this;
  }

   /**
   * Wireguard peer ID.
   * @return wireguardPeerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e66c496d-4a85-423b-8b2a-8e63fac20320", value = "Wireguard peer ID.")
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


  public GlobalIpAssignment status(InterfaceStatus status) {
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


   /**
   * Wireguard peer is connected.
   * @return isConnected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wireguard peer is connected.")
  @JsonProperty(JSON_PROPERTY_IS_CONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsConnected() {
    return isConnected;
  }




  public GlobalIpAssignment isInMaintenance(Boolean isInMaintenance) {
    this.isInMaintenance = isInMaintenance;
    return this;
  }

   /**
   * Enable/disable BGP announcement.
   * @return isInMaintenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/disable BGP announcement.")
  @JsonProperty(JSON_PROPERTY_IS_IN_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsInMaintenance() {
    return isInMaintenance;
  }


  @JsonProperty(JSON_PROPERTY_IS_IN_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsInMaintenance(Boolean isInMaintenance) {
    this.isInMaintenance = isInMaintenance;
  }


   /**
   * Status of BGP announcement.
   * @return isAnnounced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of BGP announcement.")
  @JsonProperty(JSON_PROPERTY_IS_ANNOUNCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnnounced() {
    return isAnnounced;
  }




  /**
   * Return true if this GlobalIpAssignment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpAssignment globalIpAssignment = (GlobalIpAssignment) o;
    return Objects.equals(this.id, globalIpAssignment.id) &&
        Objects.equals(this.recordType, globalIpAssignment.recordType) &&
        Objects.equals(this.createdAt, globalIpAssignment.createdAt) &&
        Objects.equals(this.updatedAt, globalIpAssignment.updatedAt) &&
        Objects.equals(this.globalIpId, globalIpAssignment.globalIpId) &&
        Objects.equals(this.wireguardPeerId, globalIpAssignment.wireguardPeerId) &&
        Objects.equals(this.status, globalIpAssignment.status) &&
        Objects.equals(this.isConnected, globalIpAssignment.isConnected) &&
        Objects.equals(this.isInMaintenance, globalIpAssignment.isInMaintenance) &&
        Objects.equals(this.isAnnounced, globalIpAssignment.isAnnounced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, createdAt, updatedAt, globalIpId, wireguardPeerId, status, isConnected, isInMaintenance, isAnnounced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    globalIpId: ").append(toIndentedString(globalIpId)).append("\n");
    sb.append("    wireguardPeerId: ").append(toIndentedString(wireguardPeerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isConnected: ").append(toIndentedString(isConnected)).append("\n");
    sb.append("    isInMaintenance: ").append(toIndentedString(isInMaintenance)).append("\n");
    sb.append("    isAnnounced: ").append(toIndentedString(isAnnounced)).append("\n");
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

