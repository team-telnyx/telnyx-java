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
import com.telnyx.sdk.model.ConsumedData;
import com.telnyx.sdk.model.SIMCardGroupDataLimit;
import java.util.Arrays;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SIMCardGroup
 */
@JsonPropertyOrder({
  SIMCardGroup.JSON_PROPERTY_ID,
  SIMCardGroup.JSON_PROPERTY_RECORD_TYPE,
  SIMCardGroup.JSON_PROPERTY_DEFAULT,
  SIMCardGroup.JSON_PROPERTY_NAME,
  SIMCardGroup.JSON_PROPERTY_DATA_LIMIT,
  SIMCardGroup.JSON_PROPERTY_CONSUMED_DATA,
  SIMCardGroup.JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID,
  SIMCardGroup.JSON_PROPERTY_CREATED_AT,
  SIMCardGroup.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SIMCardGroup {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATA_LIMIT = "data_limit";
  private SIMCardGroupDataLimit dataLimit;

  public static final String JSON_PROPERTY_CONSUMED_DATA = "consumed_data";
  private ConsumedData consumedData;

  public static final String JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID = "private_wireless_gateway_id";
  private UUID privateWirelessGatewayId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public SIMCardGroup() { 
  }

  @JsonCreator
  public SIMCardGroup(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_DEFAULT) Boolean _default, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this._default = _default;
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
  @ApiModelProperty(example = "sim_card_group", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Indicates whether the SIM card group is the users default group.&lt;br/&gt;The default group is created for the user and can not be removed.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the SIM card group is the users default group.<br/>The default group is created for the user and can not be removed.")
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }




  public SIMCardGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user friendly name for the SIM card group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Test Group", value = "A user friendly name for the SIM card group.")
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


  public SIMCardGroup dataLimit(SIMCardGroupDataLimit dataLimit) {
    this.dataLimit = dataLimit;
    return this;
  }

   /**
   * Get dataLimit
   * @return dataLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SIMCardGroupDataLimit getDataLimit() {
    return dataLimit;
  }


  @JsonProperty(JSON_PROPERTY_DATA_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataLimit(SIMCardGroupDataLimit dataLimit) {
    this.dataLimit = dataLimit;
  }


  public SIMCardGroup consumedData(ConsumedData consumedData) {
    this.consumedData = consumedData;
    return this;
  }

   /**
   * Get consumedData
   * @return consumedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSUMED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumedData getConsumedData() {
    return consumedData;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumedData(ConsumedData consumedData) {
    this.consumedData = consumedData;
  }


  public SIMCardGroup privateWirelessGatewayId(UUID privateWirelessGatewayId) {
    this.privateWirelessGatewayId = privateWirelessGatewayId;
    return this;
  }

   /**
   * The identification of the related Private Wireless Gateway resource.
   * @return privateWirelessGatewayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The identification of the related Private Wireless Gateway resource.")
  @JsonProperty(JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getPrivateWirelessGatewayId() {
    return privateWirelessGatewayId;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateWirelessGatewayId(UUID privateWirelessGatewayId) {
    this.privateWirelessGatewayId = privateWirelessGatewayId;
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




  /**
   * Return true if this SIMCardGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIMCardGroup siMCardGroup = (SIMCardGroup) o;
    return Objects.equals(this.id, siMCardGroup.id) &&
        Objects.equals(this.recordType, siMCardGroup.recordType) &&
        Objects.equals(this._default, siMCardGroup._default) &&
        Objects.equals(this.name, siMCardGroup.name) &&
        Objects.equals(this.dataLimit, siMCardGroup.dataLimit) &&
        Objects.equals(this.consumedData, siMCardGroup.consumedData) &&
        Objects.equals(this.privateWirelessGatewayId, siMCardGroup.privateWirelessGatewayId) &&
        Objects.equals(this.createdAt, siMCardGroup.createdAt) &&
        Objects.equals(this.updatedAt, siMCardGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, _default, name, dataLimit, consumedData, privateWirelessGatewayId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIMCardGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataLimit: ").append(toIndentedString(dataLimit)).append("\n");
    sb.append("    consumedData: ").append(toIndentedString(consumedData)).append("\n");
    sb.append("    privateWirelessGatewayId: ").append(toIndentedString(privateWirelessGatewayId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

