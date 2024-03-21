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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The WhatsApp settings associated with the business account
 */
@ApiModel(description = "The WhatsApp settings associated with the business account")
@JsonPropertyOrder({
  WhatsappPhoneNumberWhatsappSettings.JSON_PROPERTY_ID,
  WhatsappPhoneNumberWhatsappSettings.JSON_PROPERTY_DISPLAY_NAME,
  WhatsappPhoneNumberWhatsappSettings.JSON_PROPERTY_DISPLAY_NAME_STATUS,
  WhatsappPhoneNumberWhatsappSettings.JSON_PROPERTY_QUALITY_RATING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappPhoneNumberWhatsappSettings {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  /**
   * The Facebook approval status of the phone numbers display name
   */
  public enum DisplayNameStatusEnum {
    PENDING_REVIEW("PENDING_REVIEW"),
    
    APPROVED("APPROVED"),
    
    DECLINED("DECLINED"),
    
    EXPIRED("EXPIRED"),
    
    NONE("NONE");

    private String value;

    DisplayNameStatusEnum(String value) {
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
    public static DisplayNameStatusEnum fromValue(String value) {
      for (DisplayNameStatusEnum b : DisplayNameStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DISPLAY_NAME_STATUS = "display_name_status";
  private DisplayNameStatusEnum displayNameStatus;

  public static final String JSON_PROPERTY_QUALITY_RATING = "quality_rating";
  private String qualityRating;

  public WhatsappPhoneNumberWhatsappSettings() { 
  }

  public WhatsappPhoneNumberWhatsappSettings id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the phone number in Facebook
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the phone number in Facebook")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public WhatsappPhoneNumberWhatsappSettings displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the phone number in the WhatsApp app
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the phone number in the WhatsApp app")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public WhatsappPhoneNumberWhatsappSettings displayNameStatus(DisplayNameStatusEnum displayNameStatus) {
    this.displayNameStatus = displayNameStatus;
    return this;
  }

   /**
   * The Facebook approval status of the phone numbers display name
   * @return displayNameStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Facebook approval status of the phone numbers display name")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayNameStatusEnum getDisplayNameStatus() {
    return displayNameStatus;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayNameStatus(DisplayNameStatusEnum displayNameStatus) {
    this.displayNameStatus = displayNameStatus;
  }


  public WhatsappPhoneNumberWhatsappSettings qualityRating(String qualityRating) {
    this.qualityRating = qualityRating;
    return this;
  }

   /**
   * The quality rating of the number in the WhatsApp app
   * @return qualityRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quality rating of the number in the WhatsApp app")
  @JsonProperty(JSON_PROPERTY_QUALITY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQualityRating() {
    return qualityRating;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQualityRating(String qualityRating) {
    this.qualityRating = qualityRating;
  }


  /**
   * Return true if this WhatsappPhoneNumber_whatsapp_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappPhoneNumberWhatsappSettings whatsappPhoneNumberWhatsappSettings = (WhatsappPhoneNumberWhatsappSettings) o;
    return Objects.equals(this.id, whatsappPhoneNumberWhatsappSettings.id) &&
        Objects.equals(this.displayName, whatsappPhoneNumberWhatsappSettings.displayName) &&
        Objects.equals(this.displayNameStatus, whatsappPhoneNumberWhatsappSettings.displayNameStatus) &&
        Objects.equals(this.qualityRating, whatsappPhoneNumberWhatsappSettings.qualityRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, displayNameStatus, qualityRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappPhoneNumberWhatsappSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameStatus: ").append(toIndentedString(displayNameStatus)).append("\n");
    sb.append("    qualityRating: ").append(toIndentedString(qualityRating)).append("\n");
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

