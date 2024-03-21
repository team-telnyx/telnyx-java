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
import com.telnyx.sdk.model.NotificationSettingParametersInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * NotificationSetting
 */
@JsonPropertyOrder({
  NotificationSetting.JSON_PROPERTY_ID,
  NotificationSetting.JSON_PROPERTY_NOTIFICATION_EVENT_CONDITION_ID,
  NotificationSetting.JSON_PROPERTY_NOTIFICATION_PROFILE_ID,
  NotificationSetting.JSON_PROPERTY_ASSOCIATED_RECORD_TYPE,
  NotificationSetting.JSON_PROPERTY_ASSOCIATED_RECORD_TYPE_VALUE,
  NotificationSetting.JSON_PROPERTY_STATUS,
  NotificationSetting.JSON_PROPERTY_NOTIFICATION_CHANNEL_ID,
  NotificationSetting.JSON_PROPERTY_PARAMETERS,
  NotificationSetting.JSON_PROPERTY_CREATED_AT,
  NotificationSetting.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class NotificationSetting {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NOTIFICATION_EVENT_CONDITION_ID = "notification_event_condition_id";
  private String notificationEventConditionId;

  public static final String JSON_PROPERTY_NOTIFICATION_PROFILE_ID = "notification_profile_id";
  private String notificationProfileId;

  public static final String JSON_PROPERTY_ASSOCIATED_RECORD_TYPE = "associated_record_type";
  private String associatedRecordType;

  public static final String JSON_PROPERTY_ASSOCIATED_RECORD_TYPE_VALUE = "associated_record_type_value";
  private String associatedRecordTypeValue;

  /**
   * Most preferences apply immediately; however, other may needs to propagate.
   */
  public enum StatusEnum {
    ENABLED("enabled"),
    
    ENABLE_RECEIVED("enable-received"),
    
    ENABLE_PENDING("enable-pending"),
    
    ENABLE_SUBMTITED("enable-submtited"),
    
    DELETE_RECEIVED("delete-received"),
    
    DELETE_PENDING("delete-pending"),
    
    DELETE_SUBMITTED("delete-submitted"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_NOTIFICATION_CHANNEL_ID = "notification_channel_id";
  private String notificationChannelId;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<NotificationSettingParametersInner> parameters = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public NotificationSetting() { 
  }

  @JsonCreator
  public NotificationSetting(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_ASSOCIATED_RECORD_TYPE) String associatedRecordType, 
    @JsonProperty(JSON_PROPERTY_ASSOCIATED_RECORD_TYPE_VALUE) String associatedRecordTypeValue, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt
  ) {
    this();
    this.id = id;
    this.associatedRecordType = associatedRecordType;
    this.associatedRecordTypeValue = associatedRecordTypeValue;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * A UUID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8eb5b5f9-5893-423c-9f15-b487713d44d4", value = "A UUID.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public NotificationSetting notificationEventConditionId(String notificationEventConditionId) {
    this.notificationEventConditionId = notificationEventConditionId;
    return this;
  }

   /**
   * A UUID reference to the associated Notification Event Condition.
   * @return notificationEventConditionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70c7c5cb-dce2-4124-accb-870d39dbe852", value = "A UUID reference to the associated Notification Event Condition.")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_EVENT_CONDITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotificationEventConditionId() {
    return notificationEventConditionId;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_EVENT_CONDITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationEventConditionId(String notificationEventConditionId) {
    this.notificationEventConditionId = notificationEventConditionId;
  }


  public NotificationSetting notificationProfileId(String notificationProfileId) {
    this.notificationProfileId = notificationProfileId;
    return this;
  }

   /**
   * A UUID reference to the associated Notification Profile.
   * @return notificationProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12455643-3cf1-4683-ad23-1cd32f7d5e0a", value = "A UUID reference to the associated Notification Profile.")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotificationProfileId() {
    return notificationProfileId;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationProfileId(String notificationProfileId) {
    this.notificationProfileId = notificationProfileId;
  }


   /**
   * Get associatedRecordType
   * @return associatedRecordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number", value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssociatedRecordType() {
    return associatedRecordType;
  }




   /**
   * Get associatedRecordTypeValue
   * @return associatedRecordTypeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13125550000", value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_RECORD_TYPE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssociatedRecordTypeValue() {
    return associatedRecordTypeValue;
  }




   /**
   * Most preferences apply immediately; however, other may needs to propagate.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "enable-received", value = "Most preferences apply immediately; however, other may needs to propagate.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  public NotificationSetting notificationChannelId(String notificationChannelId) {
    this.notificationChannelId = notificationChannelId;
    return this;
  }

   /**
   * A UUID reference to the associated Notification Channel.
   * @return notificationChannelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12455643-3cf1-4683-ad23-1cd32f7d5e0a", value = "A UUID reference to the associated Notification Channel.")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotificationChannelId() {
    return notificationChannelId;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationChannelId(String notificationChannelId) {
    this.notificationChannelId = notificationChannelId;
  }


  public NotificationSetting parameters(List<NotificationSettingParametersInner> parameters) {
    this.parameters = parameters;
    return this;
  }

  public NotificationSetting addParametersItem(NotificationSettingParametersInner parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotificationSettingParametersInner> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(List<NotificationSettingParametersInner> parameters) {
    this.parameters = parameters;
  }


   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-10-15T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-10-15T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this NotificationSetting object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSetting notificationSetting = (NotificationSetting) o;
    return Objects.equals(this.id, notificationSetting.id) &&
        Objects.equals(this.notificationEventConditionId, notificationSetting.notificationEventConditionId) &&
        Objects.equals(this.notificationProfileId, notificationSetting.notificationProfileId) &&
        Objects.equals(this.associatedRecordType, notificationSetting.associatedRecordType) &&
        Objects.equals(this.associatedRecordTypeValue, notificationSetting.associatedRecordTypeValue) &&
        Objects.equals(this.status, notificationSetting.status) &&
        Objects.equals(this.notificationChannelId, notificationSetting.notificationChannelId) &&
        Objects.equals(this.parameters, notificationSetting.parameters) &&
        Objects.equals(this.createdAt, notificationSetting.createdAt) &&
        Objects.equals(this.updatedAt, notificationSetting.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notificationEventConditionId, notificationProfileId, associatedRecordType, associatedRecordTypeValue, status, notificationChannelId, parameters, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSetting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationEventConditionId: ").append(toIndentedString(notificationEventConditionId)).append("\n");
    sb.append("    notificationProfileId: ").append(toIndentedString(notificationProfileId)).append("\n");
    sb.append("    associatedRecordType: ").append(toIndentedString(associatedRecordType)).append("\n");
    sb.append("    associatedRecordTypeValue: ").append(toIndentedString(associatedRecordTypeValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notificationChannelId: ").append(toIndentedString(notificationChannelId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

