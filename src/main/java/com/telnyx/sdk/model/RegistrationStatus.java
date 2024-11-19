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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * RegistrationStatus
 */
@JsonPropertyOrder({
  RegistrationStatus.JSON_PROPERTY_RECORD_TYPE,
  RegistrationStatus.JSON_PROPERTY_STATUS,
  RegistrationStatus.JSON_PROPERTY_SIP_USERNAME,
  RegistrationStatus.JSON_PROPERTY_IP_ADDRESS,
  RegistrationStatus.JSON_PROPERTY_TRANSPORT,
  RegistrationStatus.JSON_PROPERTY_PORT,
  RegistrationStatus.JSON_PROPERTY_USER_AGENT,
  RegistrationStatus.JSON_PROPERTY_LAST_REGISTRATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RegistrationStatus {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  /**
   * The current registration status of your SIP connection
   */
  public enum StatusEnum {
    NOT_APPLICABLE(String.valueOf("Not Applicable")),
    
    NOT_REGISTERED(String.valueOf("Not Registered")),
    
    FAILED(String.valueOf("Failed")),
    
    EXPIRED(String.valueOf("Expired")),
    
    REGISTERED(String.valueOf("Registered")),
    
    UNREGISTERED(String.valueOf("Unregistered"));

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

  public static final String JSON_PROPERTY_SIP_USERNAME = "sip_username";
  private String sipUsername;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_TRANSPORT = "transport";
  private String transport;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_USER_AGENT = "user_agent";
  private String userAgent;

  public static final String JSON_PROPERTY_LAST_REGISTRATION = "last_registration";
  private String lastRegistration;

  public RegistrationStatus() { 
  }

  public RegistrationStatus recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "registration_status", value = "Identifies the type of the resource.")
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


  public RegistrationStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current registration status of your SIP connection
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current registration status of your SIP connection")
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


  public RegistrationStatus sipUsername(String sipUsername) {
    this.sipUsername = sipUsername;
    return this;
  }

   /**
   * The user name of the SIP connection
   * @return sipUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sip_username", value = "The user name of the SIP connection")
  @JsonProperty(JSON_PROPERTY_SIP_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipUsername() {
    return sipUsername;
  }


  @JsonProperty(JSON_PROPERTY_SIP_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipUsername(String sipUsername) {
    this.sipUsername = sipUsername;
  }


  public RegistrationStatus ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The ip used during the SIP connection
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "190.106.106.121", value = "The ip used during the SIP connection")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public RegistrationStatus transport(String transport) {
    this.transport = transport;
    return this;
  }

   /**
   * The protocol of the SIP connection
   * @return transport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TCP", value = "The protocol of the SIP connection")
  @JsonProperty(JSON_PROPERTY_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransport() {
    return transport;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransport(String transport) {
    this.transport = transport;
  }


  public RegistrationStatus port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port of the SIP connection
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "37223", value = "The port of the SIP connection")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public RegistrationStatus userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The user agent of the SIP connection
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z 5.4.12 v2.10.13.2-mod", value = "The user agent of the SIP connection")
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public RegistrationStatus lastRegistration(String lastRegistration) {
    this.lastRegistration = lastRegistration;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was last updated.
   * @return lastRegistration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was last updated.")
  @JsonProperty(JSON_PROPERTY_LAST_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastRegistration() {
    return lastRegistration;
  }


  @JsonProperty(JSON_PROPERTY_LAST_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRegistration(String lastRegistration) {
    this.lastRegistration = lastRegistration;
  }


  /**
   * Return true if this Registration_Status object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationStatus registrationStatus = (RegistrationStatus) o;
    return Objects.equals(this.recordType, registrationStatus.recordType) &&
        Objects.equals(this.status, registrationStatus.status) &&
        Objects.equals(this.sipUsername, registrationStatus.sipUsername) &&
        Objects.equals(this.ipAddress, registrationStatus.ipAddress) &&
        Objects.equals(this.transport, registrationStatus.transport) &&
        Objects.equals(this.port, registrationStatus.port) &&
        Objects.equals(this.userAgent, registrationStatus.userAgent) &&
        Objects.equals(this.lastRegistration, registrationStatus.lastRegistration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, status, sipUsername, ipAddress, transport, port, userAgent, lastRegistration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationStatus {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sipUsername: ").append(toIndentedString(sipUsername)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    lastRegistration: ").append(toIndentedString(lastRegistration)).append("\n");
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

