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
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * TnUploadEntry
 */
@JsonPropertyOrder({
  TnUploadEntry.JSON_PROPERTY_NUMBER_ID,
  TnUploadEntry.JSON_PROPERTY_PHONE_NUMBER,
  TnUploadEntry.JSON_PROPERTY_STATUS,
  TnUploadEntry.JSON_PROPERTY_ERROR_CODE,
  TnUploadEntry.JSON_PROPERTY_ERROR_MESSAGE,
  TnUploadEntry.JSON_PROPERTY_CIVIC_ADDRESS_ID,
  TnUploadEntry.JSON_PROPERTY_LOCATION_ID,
  TnUploadEntry.JSON_PROPERTY_INTERNAL_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TnUploadEntry {
  public static final String JSON_PROPERTY_NUMBER_ID = "number_id";
  private UUID numberId;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  /**
   * Represents the status of the phone number entry upload on Microsoft Teams.
   */
  public enum StatusEnum {
    PENDING_UPLOAD("pending_upload"),
    
    PENDING("pending"),
    
    IN_PROGRESS("in_progress"),
    
    SUCCESS("success"),
    
    ERROR("error");

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
  private StatusEnum status = StatusEnum.PENDING_UPLOAD;

  /**
   * A code returned by Microsoft Teams if there is an error with the phone number entry upload.
   */
  public enum ErrorCodeEnum {
    INTERNAL_ERROR("internal_error"),
    
    UNABLE_TO_RETRIEVE_DEFAULT_LOCATION("unable_to_retrieve_default_location"),
    
    UNKNOWN_COUNTRY_CODE("unknown_country_code"),
    
    UNABLE_TO_RETRIEVE_LOCATION("unable_to_retrieve_location"),
    
    UNABLE_TO_RETRIEVE_PARTNER_INFO("unable_to_retrieve_partner_info"),
    
    UNABLE_TO_MATCH_GEOGRAPHY_ENTRY("unable_to_match_geography_entry");

    private String value;

    ErrorCodeEnum(String value) {
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
    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private ErrorCodeEnum errorCode;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_CIVIC_ADDRESS_ID = "civic_address_id";
  private UUID civicAddressId;

  public static final String JSON_PROPERTY_LOCATION_ID = "location_id";
  private UUID locationId;

  /**
   * Represents the status of the phone number entry upload on Telnyx.
   */
  public enum InternalStatusEnum {
    PENDING_ASSIGNMENT("pending_assignment"),
    
    IN_PROGRESS("in_progress"),
    
    ALL_INTERNAL_JOBS_COMPLETED("all_internal_jobs_completed"),
    
    RELEASE_REQUESTED("release_requested"),
    
    RELEASE_COMPLETED("release_completed"),
    
    ERROR("error");

    private String value;

    InternalStatusEnum(String value) {
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
    public static InternalStatusEnum fromValue(String value) {
      for (InternalStatusEnum b : InternalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERNAL_STATUS = "internal_status";
  private InternalStatusEnum internalStatus = InternalStatusEnum.PENDING_ASSIGNMENT;

  public TnUploadEntry() { 
  }

  public TnUploadEntry numberId(UUID numberId) {
    this.numberId = numberId;
    return this;
  }

   /**
   * Uniquely identifies the resource.
   * @return numberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "542c3bca-d247-42bc-8fe7-e01d16ecd761", value = "Uniquely identifies the resource.")
  @JsonProperty(JSON_PROPERTY_NUMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getNumberId() {
    return numberId;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberId(UUID numberId) {
    this.numberId = numberId;
  }


  public TnUploadEntry phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number in E164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number in E164 format.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public TnUploadEntry status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Represents the status of the phone number entry upload on Microsoft Teams.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "error", value = "Represents the status of the phone number entry upload on Microsoft Teams.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TnUploadEntry errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A code returned by Microsoft Teams if there is an error with the phone number entry upload.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "internal_error", value = "A code returned by Microsoft Teams if there is an error with the phone number entry upload.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public TnUploadEntry errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A message returned by Microsoft Teams if there is an error with the upload process.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A message returned by Microsoft Teams if there is an error with the upload process.")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public TnUploadEntry civicAddressId(UUID civicAddressId) {
    this.civicAddressId = civicAddressId;
    return this;
  }

   /**
   * Identifies the civic address assigned to the phone number entry.
   * @return civicAddressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the civic address assigned to the phone number entry.")
  @JsonProperty(JSON_PROPERTY_CIVIC_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCivicAddressId() {
    return civicAddressId;
  }


  @JsonProperty(JSON_PROPERTY_CIVIC_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCivicAddressId(UUID civicAddressId) {
    this.civicAddressId = civicAddressId;
  }


  public TnUploadEntry locationId(UUID locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Identifies the location assigned to the phone number entry.
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the location assigned to the phone number entry.")
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }


  public TnUploadEntry internalStatus(InternalStatusEnum internalStatus) {
    this.internalStatus = internalStatus;
    return this;
  }

   /**
   * Represents the status of the phone number entry upload on Telnyx.
   * @return internalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "error", value = "Represents the status of the phone number entry upload on Telnyx.")
  @JsonProperty(JSON_PROPERTY_INTERNAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InternalStatusEnum getInternalStatus() {
    return internalStatus;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalStatus(InternalStatusEnum internalStatus) {
    this.internalStatus = internalStatus;
  }


  /**
   * Return true if this TnUploadEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TnUploadEntry tnUploadEntry = (TnUploadEntry) o;
    return Objects.equals(this.numberId, tnUploadEntry.numberId) &&
        Objects.equals(this.phoneNumber, tnUploadEntry.phoneNumber) &&
        Objects.equals(this.status, tnUploadEntry.status) &&
        Objects.equals(this.errorCode, tnUploadEntry.errorCode) &&
        Objects.equals(this.errorMessage, tnUploadEntry.errorMessage) &&
        Objects.equals(this.civicAddressId, tnUploadEntry.civicAddressId) &&
        Objects.equals(this.locationId, tnUploadEntry.locationId) &&
        Objects.equals(this.internalStatus, tnUploadEntry.internalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberId, phoneNumber, status, errorCode, errorMessage, civicAddressId, locationId, internalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TnUploadEntry {\n");
    sb.append("    numberId: ").append(toIndentedString(numberId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    civicAddressId: ").append(toIndentedString(civicAddressId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    internalStatus: ").append(toIndentedString(internalStatus)).append("\n");
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

