/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import com.telnyx.sdk.model.AssignmentStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumberStatus
 */
@JsonPropertyOrder({
  PhoneNumberStatus.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumberStatus.JSON_PROPERTY_STATUS,
  PhoneNumberStatus.JSON_PROPERTY_ASSIGNED_AT,
  PhoneNumberStatus.JSON_PROPERTY_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PhoneNumberStatus {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AssignmentStatus status;

  public static final String JSON_PROPERTY_ASSIGNED_AT = "assigned_at";
  private OffsetDateTime assignedAt;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public PhoneNumberStatus() { 
  }

  public PhoneNumberStatus phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number that is intended to be linked to a campaign.
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+12193849584", required = true, value = "A phone number that is intended to be linked to a campaign.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneNumberStatus status(AssignmentStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the phone number.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current status of the phone number.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AssignmentStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(AssignmentStatus status) {
    this.status = status;
  }


  public PhoneNumberStatus assignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = assignedAt;
    return this;
  }

   /**
   * The date and time that the this phone number was assigned.
   * @return assignedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-06-30T10:49:04-07:00", value = "The date and time that the this phone number was assigned.")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAssignedAt() {
    return assignedAt;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = assignedAt;
  }


  public PhoneNumberStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Errors related to an individual phone number assignment.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Detailed error description here.", value = "Errors related to an individual phone number assignment.")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  /**
   * Return true if this PhoneNumberStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberStatus phoneNumberStatus = (PhoneNumberStatus) o;
    return Objects.equals(this.phoneNumber, phoneNumberStatus.phoneNumber) &&
        Objects.equals(this.status, phoneNumberStatus.status) &&
        Objects.equals(this.assignedAt, phoneNumberStatus.assignedAt) &&
        Objects.equals(this.error, phoneNumberStatus.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, status, assignedAt, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberStatus {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

