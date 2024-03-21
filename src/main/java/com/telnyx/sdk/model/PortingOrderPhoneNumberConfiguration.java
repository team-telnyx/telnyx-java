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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PortingOrderPhoneNumberConfiguration
 */
@JsonPropertyOrder({
  PortingOrderPhoneNumberConfiguration.JSON_PROPERTY_BILLING_GROUP_ID,
  PortingOrderPhoneNumberConfiguration.JSON_PROPERTY_CONNECTION_ID,
  PortingOrderPhoneNumberConfiguration.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  PortingOrderPhoneNumberConfiguration.JSON_PROPERTY_EMERGENCY_ADDRESS_ID,
  PortingOrderPhoneNumberConfiguration.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PortingOrderPhoneNumberConfiguration {
  public static final String JSON_PROPERTY_BILLING_GROUP_ID = "billing_group_id";
  private String billingGroupId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_EMERGENCY_ADDRESS_ID = "emergency_address_id";
  private String emergencyAddressId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public PortingOrderPhoneNumberConfiguration() { 
  }

  public PortingOrderPhoneNumberConfiguration billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * identifies the billing group to set on the numbers when ported
   * @return billingGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "identifies the billing group to set on the numbers when ported")
  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingGroupId() {
    return billingGroupId;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }


  public PortingOrderPhoneNumberConfiguration connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * identifies the connection to set on the numbers when ported
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "identifies the connection to set on the numbers when ported")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public PortingOrderPhoneNumberConfiguration messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * identifies the messaging profile to set on the numbers when ported
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f901", value = "identifies the messaging profile to set on the numbers when ported")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingProfileId() {
    return messagingProfileId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }


  public PortingOrderPhoneNumberConfiguration emergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
    return this;
  }

   /**
   * identifies the emergency address to set on the numbers when ported
   * @return emergencyAddressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "identifies the emergency address to set on the numbers when ported")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmergencyAddressId() {
    return emergencyAddressId;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
  }


  public PortingOrderPhoneNumberConfiguration tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PortingOrderPhoneNumberConfiguration addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abc\",\"123\"]", value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  /**
   * Return true if this PortingOrderPhoneNumberConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderPhoneNumberConfiguration portingOrderPhoneNumberConfiguration = (PortingOrderPhoneNumberConfiguration) o;
    return Objects.equals(this.billingGroupId, portingOrderPhoneNumberConfiguration.billingGroupId) &&
        Objects.equals(this.connectionId, portingOrderPhoneNumberConfiguration.connectionId) &&
        Objects.equals(this.messagingProfileId, portingOrderPhoneNumberConfiguration.messagingProfileId) &&
        Objects.equals(this.emergencyAddressId, portingOrderPhoneNumberConfiguration.emergencyAddressId) &&
        Objects.equals(this.tags, portingOrderPhoneNumberConfiguration.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingGroupId, connectionId, messagingProfileId, emergencyAddressId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderPhoneNumberConfiguration {\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    emergencyAddressId: ").append(toIndentedString(emergencyAddressId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

