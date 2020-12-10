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
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.ConnectionRtcpSettings;
import com.telnyx.sdk.model.DtmfType;
import com.telnyx.sdk.model.EncryptedMedia;
import com.telnyx.sdk.model.FqdnConnectionTransportProtocol;
import com.telnyx.sdk.model.InboundFqdn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateFqdnConnectionRequest
 */
@JsonPropertyOrder({
  UpdateFqdnConnectionRequest.JSON_PROPERTY_ACTIVE,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_CONNECTION_NAME,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_TRANSPORT_PROTOCOL,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_DTMF_TYPE,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_ENCRYPTED_MEDIA,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_RTCP_SETTINGS,
  UpdateFqdnConnectionRequest.JSON_PROPERTY_INBOUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateFqdnConnectionRequest {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

  public static final String JSON_PROPERTY_CONNECTION_NAME = "connection_name";
  private String connectionName;

  public static final String JSON_PROPERTY_TRANSPORT_PROTOCOL = "transport_protocol";
  private FqdnConnectionTransportProtocol transportProtocol = FqdnConnectionTransportProtocol.UDP;

  public static final String JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED = "default_on_hold_comfort_noise_enabled";
  private Boolean defaultOnHoldComfortNoiseEnabled = true;

  public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
  private DtmfType dtmfType = DtmfType.RFC_2833;

  public static final String JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED = "encode_contact_header_enabled";
  private Boolean encodeContactHeaderEnabled = false;

  public static final String JSON_PROPERTY_ENCRYPTED_MEDIA = "encrypted_media";
  private JsonNullable<EncryptedMedia> encryptedMedia = JsonNullable.<EncryptedMedia>undefined();

  public static final String JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED = "onnet_t38_passthrough_enabled";
  private Boolean onnetT38PassthroughEnabled = false;

  public static final String JSON_PROPERTY_RTCP_SETTINGS = "rtcp_settings";
  private ConnectionRtcpSettings rtcpSettings;

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private InboundFqdn inbound;


  public UpdateFqdnConnectionRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Defaults to true
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to true")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateFqdnConnectionRequest anchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * Get anchorsiteOverride
   * @return anchorsiteOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverride getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public UpdateFqdnConnectionRequest connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionName() {
    return connectionName;
  }


  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }


  public UpdateFqdnConnectionRequest transportProtocol(FqdnConnectionTransportProtocol transportProtocol) {
    this.transportProtocol = transportProtocol;
    return this;
  }

   /**
   * Get transportProtocol
   * @return transportProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSPORT_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FqdnConnectionTransportProtocol getTransportProtocol() {
    return transportProtocol;
  }


  public void setTransportProtocol(FqdnConnectionTransportProtocol transportProtocol) {
    this.transportProtocol = transportProtocol;
  }


  public UpdateFqdnConnectionRequest defaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
    return this;
  }

   /**
   * When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
   * @return defaultOnHoldComfortNoiseEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultOnHoldComfortNoiseEnabled() {
    return defaultOnHoldComfortNoiseEnabled;
  }


  public void setDefaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
  }


  public UpdateFqdnConnectionRequest dtmfType(DtmfType dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Get dtmfType
   * @return dtmfType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DtmfType getDtmfType() {
    return dtmfType;
  }


  public void setDtmfType(DtmfType dtmfType) {
    this.dtmfType = dtmfType;
  }


  public UpdateFqdnConnectionRequest encodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
    return this;
  }

   /**
   * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
   * @return encodeContactHeaderEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.")
  @JsonProperty(JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncodeContactHeaderEnabled() {
    return encodeContactHeaderEnabled;
  }


  public void setEncodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
  }


  public UpdateFqdnConnectionRequest encryptedMedia(EncryptedMedia encryptedMedia) {
    this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
    return this;
  }

   /**
   * Get encryptedMedia
   * @return encryptedMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public EncryptedMedia getEncryptedMedia() {
        return encryptedMedia.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<EncryptedMedia> getEncryptedMedia_JsonNullable() {
    return encryptedMedia;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
  public void setEncryptedMedia_JsonNullable(JsonNullable<EncryptedMedia> encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
  }

  public void setEncryptedMedia(EncryptedMedia encryptedMedia) {
    this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
  }


  public UpdateFqdnConnectionRequest onnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    return this;
  }

   /**
   * Enable on-net T38 if you prefer that the sender and receiver negotiate T38 directly when both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call according to each leg&#39;s settings.
   * @return onnetT38PassthroughEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable on-net T38 if you prefer that the sender and receiver negotiate T38 directly when both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call according to each leg's settings.")
  @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnnetT38PassthroughEnabled() {
    return onnetT38PassthroughEnabled;
  }


  public void setOnnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
  }


  public UpdateFqdnConnectionRequest rtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
    return this;
  }

   /**
   * Get rtcpSettings
   * @return rtcpSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RTCP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionRtcpSettings getRtcpSettings() {
    return rtcpSettings;
  }


  public void setRtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
  }


  public UpdateFqdnConnectionRequest inbound(InboundFqdn inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InboundFqdn getInbound() {
    return inbound;
  }


  public void setInbound(InboundFqdn inbound) {
    this.inbound = inbound;
  }


  /**
   * Return true if this UpdateFqdnConnectionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFqdnConnectionRequest updateFqdnConnectionRequest = (UpdateFqdnConnectionRequest) o;
    return Objects.equals(this.active, updateFqdnConnectionRequest.active) &&
        Objects.equals(this.anchorsiteOverride, updateFqdnConnectionRequest.anchorsiteOverride) &&
        Objects.equals(this.connectionName, updateFqdnConnectionRequest.connectionName) &&
        Objects.equals(this.transportProtocol, updateFqdnConnectionRequest.transportProtocol) &&
        Objects.equals(this.defaultOnHoldComfortNoiseEnabled, updateFqdnConnectionRequest.defaultOnHoldComfortNoiseEnabled) &&
        Objects.equals(this.dtmfType, updateFqdnConnectionRequest.dtmfType) &&
        Objects.equals(this.encodeContactHeaderEnabled, updateFqdnConnectionRequest.encodeContactHeaderEnabled) &&
        Objects.equals(this.encryptedMedia, updateFqdnConnectionRequest.encryptedMedia) &&
        Objects.equals(this.onnetT38PassthroughEnabled, updateFqdnConnectionRequest.onnetT38PassthroughEnabled) &&
        Objects.equals(this.rtcpSettings, updateFqdnConnectionRequest.rtcpSettings) &&
        Objects.equals(this.inbound, updateFqdnConnectionRequest.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, anchorsiteOverride, connectionName, transportProtocol, defaultOnHoldComfortNoiseEnabled, dtmfType, encodeContactHeaderEnabled, encryptedMedia, onnetT38PassthroughEnabled, rtcpSettings, inbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFqdnConnectionRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    transportProtocol: ").append(toIndentedString(transportProtocol)).append("\n");
    sb.append("    defaultOnHoldComfortNoiseEnabled: ").append(toIndentedString(defaultOnHoldComfortNoiseEnabled)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    encodeContactHeaderEnabled: ").append(toIndentedString(encodeContactHeaderEnabled)).append("\n");
    sb.append("    encryptedMedia: ").append(toIndentedString(encryptedMedia)).append("\n");
    sb.append("    onnetT38PassthroughEnabled: ").append(toIndentedString(onnetT38PassthroughEnabled)).append("\n");
    sb.append("    rtcpSettings: ").append(toIndentedString(rtcpSettings)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
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

