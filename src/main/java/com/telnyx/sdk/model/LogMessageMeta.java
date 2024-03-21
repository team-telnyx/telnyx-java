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
 * LogMessageMeta
 */
@JsonPropertyOrder({
  LogMessageMeta.JSON_PROPERTY_TELEPHONE_NUMBER,
  LogMessageMeta.JSON_PROPERTY_EXTERNAL_CONNECTION_ID,
  LogMessageMeta.JSON_PROPERTY_TICKET_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class LogMessageMeta {
  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephone_number";
  private String telephoneNumber;

  public static final String JSON_PROPERTY_EXTERNAL_CONNECTION_ID = "external_connection_id";
  private String externalConnectionId;

  public static final String JSON_PROPERTY_TICKET_ID = "ticket_id";
  private UUID ticketId;

  public LogMessageMeta() { 
  }

  public LogMessageMeta telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The telephone number the log message is associated with, if any.
   * @return telephoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+12345678", value = "The telephone number the log message is associated with, if any.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public LogMessageMeta externalConnectionId(String externalConnectionId) {
    this.externalConnectionId = externalConnectionId;
    return this;
  }

   /**
   * The external connection the log message is associated with, if any.
   * @return externalConnectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "The external connection the log message is associated with, if any.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalConnectionId() {
    return externalConnectionId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalConnectionId(String externalConnectionId) {
    this.externalConnectionId = externalConnectionId;
  }


  public LogMessageMeta ticketId(UUID ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * The ticket ID for an operation that generated the log message, if any.
   * @return ticketId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "542c3bca-d247-42bc-8fe7-e01d16ecd761", value = "The ticket ID for an operation that generated the log message, if any.")
  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTicketId() {
    return ticketId;
  }


  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicketId(UUID ticketId) {
    this.ticketId = ticketId;
  }


  /**
   * Return true if this LogMessage_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogMessageMeta logMessageMeta = (LogMessageMeta) o;
    return Objects.equals(this.telephoneNumber, logMessageMeta.telephoneNumber) &&
        Objects.equals(this.externalConnectionId, logMessageMeta.externalConnectionId) &&
        Objects.equals(this.ticketId, logMessageMeta.ticketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telephoneNumber, externalConnectionId, ticketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogMessageMeta {\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    externalConnectionId: ").append(toIndentedString(externalConnectionId)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
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

