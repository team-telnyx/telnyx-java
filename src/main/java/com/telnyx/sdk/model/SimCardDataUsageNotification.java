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
import com.telnyx.sdk.model.SimCardDataUsageNotificationsPostRequestThreshold;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The SIM card individual data usage notification information.
 */
@ApiModel(description = "The SIM card individual data usage notification information.")
@JsonPropertyOrder({
  SimCardDataUsageNotification.JSON_PROPERTY_ID,
  SimCardDataUsageNotification.JSON_PROPERTY_SIM_CARD_ID,
  SimCardDataUsageNotification.JSON_PROPERTY_RECORD_TYPE,
  SimCardDataUsageNotification.JSON_PROPERTY_THRESHOLD,
  SimCardDataUsageNotification.JSON_PROPERTY_CREATED_AT,
  SimCardDataUsageNotification.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimCardDataUsageNotification {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SIM_CARD_ID = "sim_card_id";
  private UUID simCardId;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private SimCardDataUsageNotificationsPostRequestThreshold threshold;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public SimCardDataUsageNotification() { 
  }

  @JsonCreator
  public SimCardDataUsageNotification(
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
  @ApiModelProperty(example = "79228acc-3f08-4e70-ac68-cb5aae8b537a", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public SimCardDataUsageNotification simCardId(UUID simCardId) {
    this.simCardId = simCardId;
    return this;
  }

   /**
   * The identification UUID of the related SIM card resource.
   * @return simCardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b34c1683-cd85-4493-b9a5-315eb4bc5e19", value = "The identification UUID of the related SIM card resource.")
  @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSimCardId() {
    return simCardId;
  }


  @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimCardId(UUID simCardId) {
    this.simCardId = simCardId;
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sim_card_data_usage_notification", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public SimCardDataUsageNotification threshold(SimCardDataUsageNotificationsPostRequestThreshold threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimCardDataUsageNotificationsPostRequestThreshold getThreshold() {
    return threshold;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreshold(SimCardDataUsageNotificationsPostRequestThreshold threshold) {
    this.threshold = threshold;
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
   * Return true if this SimCardDataUsageNotification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimCardDataUsageNotification simCardDataUsageNotification = (SimCardDataUsageNotification) o;
    return Objects.equals(this.id, simCardDataUsageNotification.id) &&
        Objects.equals(this.simCardId, simCardDataUsageNotification.simCardId) &&
        Objects.equals(this.recordType, simCardDataUsageNotification.recordType) &&
        Objects.equals(this.threshold, simCardDataUsageNotification.threshold) &&
        Objects.equals(this.createdAt, simCardDataUsageNotification.createdAt) &&
        Objects.equals(this.updatedAt, simCardDataUsageNotification.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, simCardId, recordType, threshold, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimCardDataUsageNotification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

