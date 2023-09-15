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
import com.telnyx.sdk.model.ConsumedData;
import com.telnyx.sdk.model.SIMCardGroupDataLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SearchedSIMCardGroup
 */
@JsonPropertyOrder({
  SearchedSIMCardGroup.JSON_PROPERTY_ID,
  SearchedSIMCardGroup.JSON_PROPERTY_RECORD_TYPE,
  SearchedSIMCardGroup.JSON_PROPERTY_DEFAULT,
  SearchedSIMCardGroup.JSON_PROPERTY_NAME,
  SearchedSIMCardGroup.JSON_PROPERTY_DATA_LIMIT,
  SearchedSIMCardGroup.JSON_PROPERTY_CONSUMED_DATA,
  SearchedSIMCardGroup.JSON_PROPERTY_SIM_CARD_COUNT,
  SearchedSIMCardGroup.JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID,
  SearchedSIMCardGroup.JSON_PROPERTY_CREATED_AT,
  SearchedSIMCardGroup.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchedSIMCardGroup {
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

  public static final String JSON_PROPERTY_SIM_CARD_COUNT = "sim_card_count";
  private Integer simCardCount = 0;

  public static final String JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID = "private_wireless_gateway_id";
  private UUID privateWirelessGatewayId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public SearchedSIMCardGroup() { 
  }

  @JsonCreator
  public SearchedSIMCardGroup(
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




  public SearchedSIMCardGroup name(String name) {
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


  public SearchedSIMCardGroup dataLimit(SIMCardGroupDataLimit dataLimit) {
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


  public SearchedSIMCardGroup consumedData(ConsumedData consumedData) {
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


  public SearchedSIMCardGroup simCardCount(Integer simCardCount) {
    this.simCardCount = simCardCount;
    return this;
  }

   /**
   * The number of SIM cards associated with the group.
   * @return simCardCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The number of SIM cards associated with the group.")
  @JsonProperty(JSON_PROPERTY_SIM_CARD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSimCardCount() {
    return simCardCount;
  }


  @JsonProperty(JSON_PROPERTY_SIM_CARD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimCardCount(Integer simCardCount) {
    this.simCardCount = simCardCount;
  }


  public SearchedSIMCardGroup privateWirelessGatewayId(UUID privateWirelessGatewayId) {
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
   * Return true if this SearchedSIMCardGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchedSIMCardGroup searchedSIMCardGroup = (SearchedSIMCardGroup) o;
    return Objects.equals(this.id, searchedSIMCardGroup.id) &&
        Objects.equals(this.recordType, searchedSIMCardGroup.recordType) &&
        Objects.equals(this._default, searchedSIMCardGroup._default) &&
        Objects.equals(this.name, searchedSIMCardGroup.name) &&
        Objects.equals(this.dataLimit, searchedSIMCardGroup.dataLimit) &&
        Objects.equals(this.consumedData, searchedSIMCardGroup.consumedData) &&
        Objects.equals(this.simCardCount, searchedSIMCardGroup.simCardCount) &&
        Objects.equals(this.privateWirelessGatewayId, searchedSIMCardGroup.privateWirelessGatewayId) &&
        Objects.equals(this.createdAt, searchedSIMCardGroup.createdAt) &&
        Objects.equals(this.updatedAt, searchedSIMCardGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, _default, name, dataLimit, consumedData, simCardCount, privateWirelessGatewayId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchedSIMCardGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataLimit: ").append(toIndentedString(dataLimit)).append("\n");
    sb.append("    consumedData: ").append(toIndentedString(consumedData)).append("\n");
    sb.append("    simCardCount: ").append(toIndentedString(simCardCount)).append("\n");
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
