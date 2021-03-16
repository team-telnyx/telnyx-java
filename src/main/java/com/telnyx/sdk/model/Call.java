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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Call
 */
@JsonPropertyOrder({
  Call.JSON_PROPERTY_RECORD_TYPE,
  Call.JSON_PROPERTY_CALL_SESSION_ID,
  Call.JSON_PROPERTY_CALL_LEG_ID,
  Call.JSON_PROPERTY_CALL_CONTROL_ID,
  Call.JSON_PROPERTY_IS_ALIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Call {
  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    CALL("call");

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

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_IS_ALIVE = "is_alive";
  private Boolean isAlive;


  public Call recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(example = "call", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public Call callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events
   * @return callSessionId
  **/
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b68e-5013ef9657c1", required = true, value = "ID that is unique to the call session and can be used to correlate webhook events")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallSessionId() {
    return callSessionId;
  }


  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public Call callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events
   * @return callLegId
  **/
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", required = true, value = "ID that is unique to the call and can be used to correlate webhook events")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallLegId() {
    return callLegId;
  }


  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public Call callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Unique identifier and token for controlling the call.
   * @return callControlId
  **/
  @ApiModelProperty(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ", required = true, value = "Unique identifier and token for controlling the call.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallControlId() {
    return callControlId;
  }


  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public Call isAlive(Boolean isAlive) {
    this.isAlive = isAlive;
    return this;
  }

   /**
   * Indicates whether the call is alive or not. For Dial command it will always be &#x60;false&#x60; (dialing is asynchronous).
   * @return isAlive
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether the call is alive or not. For Dial command it will always be `false` (dialing is asynchronous).")
  @JsonProperty(JSON_PROPERTY_IS_ALIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsAlive() {
    return isAlive;
  }


  public void setIsAlive(Boolean isAlive) {
    this.isAlive = isAlive;
  }


  /**
   * Return true if this Call object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(this.recordType, call.recordType) &&
        Objects.equals(this.callSessionId, call.callSessionId) &&
        Objects.equals(this.callLegId, call.callLegId) &&
        Objects.equals(this.callControlId, call.callControlId) &&
        Objects.equals(this.isAlive, call.isAlive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, callSessionId, callLegId, callControlId, isAlive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    isAlive: ").append(toIndentedString(isAlive)).append("\n");
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

