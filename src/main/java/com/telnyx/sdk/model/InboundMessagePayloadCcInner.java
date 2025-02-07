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
 * InboundMessagePayloadCcInner
 */
@JsonPropertyOrder({
  InboundMessagePayloadCcInner.JSON_PROPERTY_PHONE_NUMBER,
  InboundMessagePayloadCcInner.JSON_PROPERTY_STATUS,
  InboundMessagePayloadCcInner.JSON_PROPERTY_CARRIER,
  InboundMessagePayloadCcInner.JSON_PROPERTY_LINE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class InboundMessagePayloadCcInner {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED(String.valueOf("queued")),
    
    SENDING(String.valueOf("sending")),
    
    SENT(String.valueOf("sent")),
    
    DELIVERED(String.valueOf("delivered")),
    
    SENDING_FAILED(String.valueOf("sending_failed")),
    
    DELIVERY_FAILED(String.valueOf("delivery_failed")),
    
    DELIVERY_UNCONFIRMED(String.valueOf("delivery_unconfirmed"));

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
    WIRELINE(String.valueOf("Wireline")),
    
    WIRELESS(String.valueOf("Wireless")),
    
    VO_WI_FI(String.valueOf("VoWiFi")),
    
    VO_IP(String.valueOf("VoIP")),
    
    PRE_PAID_WIRELESS(String.valueOf("Pre-Paid Wireless")),
    
    EMPTY(String.valueOf(""));

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

  public InboundMessagePayloadCcInner() { 
  }

  public InboundMessagePayloadCcInner phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Receiving address (+E.164 formatted phone number or short code).
   * @return phoneNumber
  **/
  @jakarta.annotation.Nullable
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


  public InboundMessagePayloadCcInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public InboundMessagePayloadCcInner carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The carrier of the receiver.
   * @return carrier
  **/
  @jakarta.annotation.Nullable
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


  public InboundMessagePayloadCcInner lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * The line-type of the receiver.
   * @return lineType
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this InboundMessagePayload_cc_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessagePayloadCcInner inboundMessagePayloadCcInner = (InboundMessagePayloadCcInner) o;
    return Objects.equals(this.phoneNumber, inboundMessagePayloadCcInner.phoneNumber) &&
        Objects.equals(this.status, inboundMessagePayloadCcInner.status) &&
        Objects.equals(this.carrier, inboundMessagePayloadCcInner.carrier) &&
        Objects.equals(this.lineType, inboundMessagePayloadCcInner.lineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, status, carrier, lineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessagePayloadCcInner {\n");
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

