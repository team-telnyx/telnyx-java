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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * OutboundMessagePayloadToInner
 */
@JsonPropertyOrder({
  OutboundMessagePayloadToInner.JSON_PROPERTY_PHONE_NUMBER,
  OutboundMessagePayloadToInner.JSON_PROPERTY_STATUS,
  OutboundMessagePayloadToInner.JSON_PROPERTY_CARRIER,
  OutboundMessagePayloadToInner.JSON_PROPERTY_LINE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class OutboundMessagePayloadToInner {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  /**
   * The delivery status of the message.
   */
  public enum StatusEnum {
    QUEUED("queued"),
    
    SENDING("sending"),
    
    SENT("sent"),
    
    EXPIRED("expired"),
    
    SENDING_FAILED("sending_failed"),
    
    DELIVERY_UNCONFIRMED("delivery_unconfirmed"),
    
    DELIVERED("delivered"),
    
    DELIVERY_FAILED("delivery_failed");

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

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  /**
   * The line-type of the receiver.
   */
  public enum LineTypeEnum {
    WIRELINE("Wireline"),
    
    WIRELESS("Wireless"),
    
    VOWIFI("VoWiFi"),
    
    VOIP("VoIP"),
    
    PRE_PAID_WIRELESS("Pre-Paid Wireless"),
    
    EMPTY("");

    private String value;

    LineTypeEnum(String value) {
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
    public static LineTypeEnum fromValue(String value) {
      for (LineTypeEnum b : LineTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
  private LineTypeEnum lineType;

  public OutboundMessagePayloadToInner() { 
  }

  public OutboundMessagePayloadToInner phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Receiving address (+E.164 formatted phone number or short code).
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Receiving address (+E.164 formatted phone number or short code).")
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


  public OutboundMessagePayloadToInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The delivery status of the message.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The delivery status of the message.")
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


  public OutboundMessagePayloadToInner carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The carrier of the receiver.
   * @return carrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The carrier of the receiver.")
  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrier() {
    return carrier;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  public OutboundMessagePayloadToInner lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * The line-type of the receiver.
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The line-type of the receiver.")
  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LineTypeEnum getLineType() {
    return lineType;
  }


  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }


  /**
   * Return true if this OutboundMessagePayload_to_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagePayloadToInner outboundMessagePayloadToInner = (OutboundMessagePayloadToInner) o;
    return Objects.equals(this.phoneNumber, outboundMessagePayloadToInner.phoneNumber) &&
        Objects.equals(this.status, outboundMessagePayloadToInner.status) &&
        Objects.equals(this.carrier, outboundMessagePayloadToInner.carrier) &&
        Objects.equals(this.lineType, outboundMessagePayloadToInner.lineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, status, carrier, lineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagePayloadToInner {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
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

