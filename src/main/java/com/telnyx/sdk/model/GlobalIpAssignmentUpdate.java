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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpAssignmentUpdate
 */
@JsonPropertyOrder({
  GlobalIpAssignmentUpdate.JSON_PROPERTY_ID,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_RECORD_TYPE,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_CREATED_AT,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_UPDATED_AT,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_GLOBAL_IP_ID,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_WIREGUARD_PEER_ID,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_STATUS,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_IS_CONNECTED,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_IS_IN_MAINTENANCE,
  GlobalIpAssignmentUpdate.JSON_PROPERTY_IS_ANNOUNCED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GlobalIpAssignmentUpdate {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_GLOBAL_IP_ID = "global_ip_id";
  private JsonNullable<Object> globalIpId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WIREGUARD_PEER_ID = "wireguard_peer_id";
  private JsonNullable<Object> wireguardPeerId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STATUS = "status";
  private InterfaceStatus status;

  public static final String JSON_PROPERTY_IS_CONNECTED = "is_connected";
  private Boolean isConnected;

  public static final String JSON_PROPERTY_IS_IN_MAINTENANCE = "is_in_maintenance";
  private Boolean isInMaintenance;

  public static final String JSON_PROPERTY_IS_ANNOUNCED = "is_announced";
  private Boolean isAnnounced;

  public GlobalIpAssignmentUpdate() { 
  }

  @JsonCreator
  public GlobalIpAssignmentUpdate(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ID) Object globalIpId, 
    @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER_ID) Object wireguardPeerId, 
    @JsonProperty(JSON_PROPERTY_IS_CONNECTED) Boolean isConnected, 
    @JsonProperty(JSON_PROPERTY_IS_ANNOUNCED) Boolean isAnnounced
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.globalIpId = JsonNullable.of(globalIpId);
    this.wireguardPeerId = JsonNullable.of(wireguardPeerId);
    this.isConnected = isConnected;
    this.isAnnounced = isAnnounced;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




   /**
   * Get globalIpId
   * @return globalIpId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getGlobalIpId() {
    
    if (globalIpId == null) {
      globalIpId = JsonNullable.<Object>of(null);
    }
    return globalIpId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGlobalIpId_JsonNullable() {
    return globalIpId;
  }
  
  @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ID)
  private void setGlobalIpId_JsonNullable(JsonNullable<Object> globalIpId) {
    this.globalIpId = globalIpId;
  }



   /**
   * Get wireguardPeerId
   * @return wireguardPeerId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getWireguardPeerId() {
    
    if (wireguardPeerId == null) {
      wireguardPeerId = JsonNullable.<Object>of(null);
    }
    return wireguardPeerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWireguardPeerId_JsonNullable() {
    return wireguardPeerId;
  }
  
  @JsonProperty(JSON_PROPERTY_WIREGUARD_PEER_ID)
  private void setWireguardPeerId_JsonNullable(JsonNullable<Object> wireguardPeerId) {
    this.wireguardPeerId = wireguardPeerId;
  }



  public GlobalIpAssignmentUpdate status(InterfaceStatus status) {
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
   * Wireguard peer is connected.
   * @return isConnected
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Wireguard peer is connected.")
  @JsonProperty(JSON_PROPERTY_IS_CONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsConnected() {
    return isConnected;
  }




  public GlobalIpAssignmentUpdate isInMaintenance(Boolean isInMaintenance) {
    this.isInMaintenance = isInMaintenance;
    return this;
  }

   /**
   * Enable/disable BGP announcement.
   * @return isInMaintenance
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of BGP announcement.")
  @JsonProperty(JSON_PROPERTY_IS_ANNOUNCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnnounced() {
    return isAnnounced;
  }




  /**
   * Return true if this GlobalIpAssignmentUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpAssignmentUpdate globalIpAssignmentUpdate = (GlobalIpAssignmentUpdate) o;
    return Objects.equals(this.id, globalIpAssignmentUpdate.id) &&
        Objects.equals(this.recordType, globalIpAssignmentUpdate.recordType) &&
        Objects.equals(this.createdAt, globalIpAssignmentUpdate.createdAt) &&
        Objects.equals(this.updatedAt, globalIpAssignmentUpdate.updatedAt) &&
        equalsNullable(this.globalIpId, globalIpAssignmentUpdate.globalIpId) &&
        equalsNullable(this.wireguardPeerId, globalIpAssignmentUpdate.wireguardPeerId) &&
        Objects.equals(this.status, globalIpAssignmentUpdate.status) &&
        Objects.equals(this.isConnected, globalIpAssignmentUpdate.isConnected) &&
        Objects.equals(this.isInMaintenance, globalIpAssignmentUpdate.isInMaintenance) &&
        Objects.equals(this.isAnnounced, globalIpAssignmentUpdate.isAnnounced);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, createdAt, updatedAt, hashCodeNullable(globalIpId), hashCodeNullable(wireguardPeerId), status, isConnected, isInMaintenance, isAnnounced);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpAssignmentUpdate {\n");
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

