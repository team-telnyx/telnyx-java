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
 * PortabilityCheckDetails
 */
@JsonPropertyOrder({
  PortabilityCheckDetails.JSON_PROPERTY_RECORD_TYPE,
  PortabilityCheckDetails.JSON_PROPERTY_FAST_PORTABLE,
  PortabilityCheckDetails.JSON_PROPERTY_NOT_PORTABLE_REASON,
  PortabilityCheckDetails.JSON_PROPERTY_PHONE_NUMBER,
  PortabilityCheckDetails.JSON_PROPERTY_PORTABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PortabilityCheckDetails {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_FAST_PORTABLE = "fast_portable";
  private Boolean fastPortable;

  public static final String JSON_PROPERTY_NOT_PORTABLE_REASON = "not_portable_reason";
  private String notPortableReason;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_PORTABLE = "portable";
  private Boolean portable;

  public PortabilityCheckDetails() { 
  }

  @JsonCreator
  public PortabilityCheckDetails(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_FAST_PORTABLE) Boolean fastPortable, 
    @JsonProperty(JSON_PROPERTY_NOT_PORTABLE_REASON) String notPortableReason, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER) String phoneNumber, 
    @JsonProperty(JSON_PROPERTY_PORTABLE) Boolean portable
  ) {
    this();
    this.recordType = recordType;
    this.fastPortable = fastPortable;
    this.notPortableReason = notPortableReason;
    this.phoneNumber = phoneNumber;
    this.portable = portable;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "portability_check_result", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Indicates whether this phone number is FastPort eligible
   * @return fastPortable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether this phone number is FastPort eligible")
  @JsonProperty(JSON_PROPERTY_FAST_PORTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFastPortable() {
    return fastPortable;
  }




   /**
   * If this phone number is not portable, explains why. Empty string if the number is portable.
   * @return notPortableReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "No coverage", value = "If this phone number is not portable, explains why. Empty string if the number is portable.")
  @JsonProperty(JSON_PROPERTY_NOT_PORTABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotPortableReason() {
    return notPortableReason;
  }




   /**
   * The +E.164 formatted phone number this result is about
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13125550123", value = "The +E.164 formatted phone number this result is about")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }




   /**
   * Indicates whether this phone number is portable
   * @return portable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether this phone number is portable")
  @JsonProperty(JSON_PROPERTY_PORTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPortable() {
    return portable;
  }




  /**
   * Return true if this PortabilityCheckDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortabilityCheckDetails portabilityCheckDetails = (PortabilityCheckDetails) o;
    return Objects.equals(this.recordType, portabilityCheckDetails.recordType) &&
        Objects.equals(this.fastPortable, portabilityCheckDetails.fastPortable) &&
        Objects.equals(this.notPortableReason, portabilityCheckDetails.notPortableReason) &&
        Objects.equals(this.phoneNumber, portabilityCheckDetails.phoneNumber) &&
        Objects.equals(this.portable, portabilityCheckDetails.portable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, fastPortable, notPortableReason, phoneNumber, portable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortabilityCheckDetails {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    fastPortable: ").append(toIndentedString(fastPortable)).append("\n");
    sb.append("    notPortableReason: ").append(toIndentedString(notPortableReason)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    portable: ").append(toIndentedString(portable)).append("\n");
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

