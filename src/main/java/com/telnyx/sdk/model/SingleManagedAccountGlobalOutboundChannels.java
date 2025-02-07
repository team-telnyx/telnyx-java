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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SingleManagedAccountGlobalOutboundChannels
 */
@JsonPropertyOrder({
  SingleManagedAccountGlobalOutboundChannels.JSON_PROPERTY_CHANNEL_LIMIT,
  SingleManagedAccountGlobalOutboundChannels.JSON_PROPERTY_EMAIL,
  SingleManagedAccountGlobalOutboundChannels.JSON_PROPERTY_ID,
  SingleManagedAccountGlobalOutboundChannels.JSON_PROPERTY_MANAGER_ACCOUNT_ID,
  SingleManagedAccountGlobalOutboundChannels.JSON_PROPERTY_RECORD_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SingleManagedAccountGlobalOutboundChannels {
  public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
  private Integer channelLimit;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MANAGER_ACCOUNT_ID = "manager_account_id";
  private String managerAccountId;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public SingleManagedAccountGlobalOutboundChannels() { 
  }

  public SingleManagedAccountGlobalOutboundChannels channelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
    return this;
  }

   /**
   * Integer value that indicates the number of allocatable global outbound channels that are allocated to the managed account. If the value is 0 then the account will have no usable channels and will not be able to perform outbound calling.
   * @return channelLimit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "30", value = "Integer value that indicates the number of allocatable global outbound channels that are allocated to the managed account. If the value is 0 then the account will have no usable channels and will not be able to perform outbound calling.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannelLimit() {
    return channelLimit;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
  }


  public SingleManagedAccountGlobalOutboundChannels email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the managed account.
   * @return email
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "customer@example.org", value = "The email of the managed account.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public SingleManagedAccountGlobalOutboundChannels id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The user ID of the managed account.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "096abcde-1122-3344-ab77-ff0123456789", value = "The user ID of the managed account.")
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


  public SingleManagedAccountGlobalOutboundChannels managerAccountId(String managerAccountId) {
    this.managerAccountId = managerAccountId;
    return this;
  }

   /**
   * The user ID of the manager of the account.
   * @return managerAccountId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "beeabcde-1122-3344-ab77-ff0123456789", value = "The user ID of the manager of the account.")
  @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManagerAccountId() {
    return managerAccountId;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagerAccountId(String managerAccountId) {
    this.managerAccountId = managerAccountId;
  }


  public SingleManagedAccountGlobalOutboundChannels recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * The name of the type of data in the response.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "managed_account_global_outbound_settings", value = "The name of the type of data in the response.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  /**
   * Return true if this SingleManagedAccountGlobalOutboundChannels object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleManagedAccountGlobalOutboundChannels singleManagedAccountGlobalOutboundChannels = (SingleManagedAccountGlobalOutboundChannels) o;
    return Objects.equals(this.channelLimit, singleManagedAccountGlobalOutboundChannels.channelLimit) &&
        Objects.equals(this.email, singleManagedAccountGlobalOutboundChannels.email) &&
        Objects.equals(this.id, singleManagedAccountGlobalOutboundChannels.id) &&
        Objects.equals(this.managerAccountId, singleManagedAccountGlobalOutboundChannels.managerAccountId) &&
        Objects.equals(this.recordType, singleManagedAccountGlobalOutboundChannels.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLimit, email, id, managerAccountId, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleManagedAccountGlobalOutboundChannels {\n");
    sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managerAccountId: ").append(toIndentedString(managerAccountId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

