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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ShortCode
 */
@JsonPropertyOrder({
  ShortCode.JSON_PROPERTY_RECORD_TYPE,
  ShortCode.JSON_PROPERTY_ID,
  ShortCode.JSON_PROPERTY_SHORT_CODE,
  ShortCode.JSON_PROPERTY_COUNTRY_CODE,
  ShortCode.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  ShortCode.JSON_PROPERTY_CREATED_AT,
  ShortCode.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShortCode {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    SHORT_CODE("short_code");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SHORT_CODE = "short_code";
  private String shortCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ShortCode() { 
  }

  @JsonCreator
  public ShortCode(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) RecordTypeEnum recordType, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_SHORT_CODE) String shortCode, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE) String countryCode, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt
  ) {
    this();
    this.recordType = recordType;
    this.id = id;
    this.shortCode = shortCode;
    this.countryCode = countryCode;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "short_code", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }




   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Short digit sequence used to address messages.
   * @return shortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short digit sequence used to address messages.")
  @JsonProperty(JSON_PROPERTY_SHORT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortCode() {
    return shortCode;
  }




   /**
   * ISO 3166-1 alpha-2 country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "ISO 3166-1 alpha-2 country code.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }




  public ShortCode messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Unique identifier for a messaging profile.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Unique identifier for a messaging profile.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessagingProfileId() {
    return messagingProfileId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }


   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was created.")
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
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this ShortCode object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortCode shortCode = (ShortCode) o;
    return Objects.equals(this.recordType, shortCode.recordType) &&
        Objects.equals(this.id, shortCode.id) &&
        Objects.equals(this.shortCode, shortCode.shortCode) &&
        Objects.equals(this.countryCode, shortCode.countryCode) &&
        Objects.equals(this.messagingProfileId, shortCode.messagingProfileId) &&
        Objects.equals(this.createdAt, shortCode.createdAt) &&
        Objects.equals(this.updatedAt, shortCode.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, shortCode, countryCode, messagingProfileId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortCode {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
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

