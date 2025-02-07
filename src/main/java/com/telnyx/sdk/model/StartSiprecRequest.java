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
 * StartSiprecRequest
 */
@JsonPropertyOrder({
  StartSiprecRequest.JSON_PROPERTY_CONNECTOR_NAME,
  StartSiprecRequest.JSON_PROPERTY_SIPREC_TRACK,
  StartSiprecRequest.JSON_PROPERTY_INCLUDE_METADATA_CUSTOM_HEADERS,
  StartSiprecRequest.JSON_PROPERTY_SECURE,
  StartSiprecRequest.JSON_PROPERTY_SESSION_TIMEOUT_SECS,
  StartSiprecRequest.JSON_PROPERTY_CLIENT_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class StartSiprecRequest {
  public static final String JSON_PROPERTY_CONNECTOR_NAME = "connector_name";
  private String connectorName;

  /**
   * Specifies which track should be sent on siprec session.
   */
  public enum SiprecTrackEnum {
    INBOUND_TRACK(String.valueOf("inbound_track")),
    
    OUTBOUND_TRACK(String.valueOf("outbound_track")),
    
    BOTH_TRACKS(String.valueOf("both_tracks"));

    private String value;

    SiprecTrackEnum(String value) {
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
    public static SiprecTrackEnum fromValue(String value) {
      for (SiprecTrackEnum b : SiprecTrackEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIPREC_TRACK = "siprec_track";
  private SiprecTrackEnum siprecTrack = SiprecTrackEnum.BOTH_TRACKS;

  public static final String JSON_PROPERTY_INCLUDE_METADATA_CUSTOM_HEADERS = "include_metadata_custom_headers";
  private Boolean includeMetadataCustomHeaders;

  public static final String JSON_PROPERTY_SECURE = "secure";
  private Boolean secure;

  public static final String JSON_PROPERTY_SESSION_TIMEOUT_SECS = "session_timeout_secs";
  private Integer sessionTimeoutSecs = 1800;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public StartSiprecRequest() { 
  }

  public StartSiprecRequest connectorName(String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

   /**
   * Name of configured SIPREC connector to be used.
   * @return connectorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-siprec-connector", value = "Name of configured SIPREC connector to be used.")
  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectorName() {
    return connectorName;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }


  public StartSiprecRequest siprecTrack(SiprecTrackEnum siprecTrack) {
    this.siprecTrack = siprecTrack;
    return this;
  }

   /**
   * Specifies which track should be sent on siprec session.
   * @return siprecTrack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound_track", value = "Specifies which track should be sent on siprec session.")
  @JsonProperty(JSON_PROPERTY_SIPREC_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SiprecTrackEnum getSiprecTrack() {
    return siprecTrack;
  }


  @JsonProperty(JSON_PROPERTY_SIPREC_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiprecTrack(SiprecTrackEnum siprecTrack) {
    this.siprecTrack = siprecTrack;
  }


  public StartSiprecRequest includeMetadataCustomHeaders(Boolean includeMetadataCustomHeaders) {
    this.includeMetadataCustomHeaders = includeMetadataCustomHeaders;
    return this;
  }

   /**
   * When set, custom parameters will be added as metadata (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
   * @return includeMetadataCustomHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When set, custom parameters will be added as metadata (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_METADATA_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeMetadataCustomHeaders() {
    return includeMetadataCustomHeaders;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_METADATA_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeMetadataCustomHeaders(Boolean includeMetadataCustomHeaders) {
    this.includeMetadataCustomHeaders = includeMetadataCustomHeaders;
  }


  public StartSiprecRequest secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

   /**
   * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need to configure SRS port in your connector to 5061.
   * @return secure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need to configure SRS port in your connector to 5061.")
  @JsonProperty(JSON_PROPERTY_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSecure() {
    return secure;
  }


  @JsonProperty(JSON_PROPERTY_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecure(Boolean secure) {
    this.secure = secure;
  }


  public StartSiprecRequest sessionTimeoutSecs(Integer sessionTimeoutSecs) {
    this.sessionTimeoutSecs = sessionTimeoutSecs;
    return this;
  }

   /**
   * Sets &#x60;Session-Expires&#x60; header to the INVITE. A reinvite is sent every half the value set. Usefull for session keep alive. Minimum value is 90, set to 0 to disable.
   * @return sessionTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Sets `Session-Expires` header to the INVITE. A reinvite is sent every half the value set. Usefull for session keep alive. Minimum value is 90, set to 0 to disable.")
  @JsonProperty(JSON_PROPERTY_SESSION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSessionTimeoutSecs() {
    return sessionTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionTimeoutSecs(Integer sessionTimeoutSecs) {
    this.sessionTimeoutSecs = sessionTimeoutSecs;
  }


  public StartSiprecRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  /**
   * Return true if this StartSiprecRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartSiprecRequest startSiprecRequest = (StartSiprecRequest) o;
    return Objects.equals(this.connectorName, startSiprecRequest.connectorName) &&
        Objects.equals(this.siprecTrack, startSiprecRequest.siprecTrack) &&
        Objects.equals(this.includeMetadataCustomHeaders, startSiprecRequest.includeMetadataCustomHeaders) &&
        Objects.equals(this.secure, startSiprecRequest.secure) &&
        Objects.equals(this.sessionTimeoutSecs, startSiprecRequest.sessionTimeoutSecs) &&
        Objects.equals(this.clientState, startSiprecRequest.clientState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorName, siprecTrack, includeMetadataCustomHeaders, secure, sessionTimeoutSecs, clientState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartSiprecRequest {\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    siprecTrack: ").append(toIndentedString(siprecTrack)).append("\n");
    sb.append("    includeMetadataCustomHeaders: ").append(toIndentedString(includeMetadataCustomHeaders)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    sessionTimeoutSecs: ").append(toIndentedString(sessionTimeoutSecs)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
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

