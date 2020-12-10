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
import com.telnyx.sdk.model.CreateCredentialConnectionRequestRtcpSettings;
import com.telnyx.sdk.model.CredentialInbound;
import com.telnyx.sdk.model.CredentialOutbound;
import com.telnyx.sdk.model.DtmfType;
import com.telnyx.sdk.model.EncryptedMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CredentialConnection
 */
@JsonPropertyOrder({
  CredentialConnection.JSON_PROPERTY_ID,
  CredentialConnection.JSON_PROPERTY_RECORD_TYPE,
  CredentialConnection.JSON_PROPERTY_ACTIVE,
  CredentialConnection.JSON_PROPERTY_USER_NAME,
  CredentialConnection.JSON_PROPERTY_PASSWORD,
  CredentialConnection.JSON_PROPERTY_CREATED_AT,
  CredentialConnection.JSON_PROPERTY_UPDATED_AT,
  CredentialConnection.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  CredentialConnection.JSON_PROPERTY_CONNECTION_NAME,
  CredentialConnection.JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE,
  CredentialConnection.JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED,
  CredentialConnection.JSON_PROPERTY_DTMF_TYPE,
  CredentialConnection.JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED,
  CredentialConnection.JSON_PROPERTY_ENCRYPTED_MEDIA,
  CredentialConnection.JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED,
  CredentialConnection.JSON_PROPERTY_RTCP_SETTINGS,
  CredentialConnection.JSON_PROPERTY_INBOUND,
  CredentialConnection.JSON_PROPERTY_OUTBOUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CredentialConnection {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

  public static final String JSON_PROPERTY_CONNECTION_NAME = "connection_name";
  private String connectionName;

  /**
   * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).
   */
  public enum SipUriCallingPreferenceEnum {
    DISABLED("disabled"),
    
    UNRESTRICTED("unrestricted"),
    
    INTERNAL("internal");

    private String value;

    SipUriCallingPreferenceEnum(String value) {
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
    public static SipUriCallingPreferenceEnum fromValue(String value) {
      for (SipUriCallingPreferenceEnum b : SipUriCallingPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE = "sip_uri_calling_preference";
  private SipUriCallingPreferenceEnum sipUriCallingPreference = SipUriCallingPreferenceEnum.DISABLED;

  public static final String JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED = "default_on_hold_comfort_noise_enabled";
  private Boolean defaultOnHoldComfortNoiseEnabled = false;

  public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
  private DtmfType dtmfType = DtmfType.RFC_2833;

  public static final String JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED = "encode_contact_header_enabled";
  private Boolean encodeContactHeaderEnabled = false;

  public static final String JSON_PROPERTY_ENCRYPTED_MEDIA = "encrypted_media";
  private JsonNullable<EncryptedMedia> encryptedMedia = JsonNullable.<EncryptedMedia>undefined();

  public static final String JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED = "onnet_t38_passthrough_enabled";
  private Boolean onnetT38PassthroughEnabled = false;

  public static final String JSON_PROPERTY_RTCP_SETTINGS = "rtcp_settings";
  private CreateCredentialConnectionRequestRtcpSettings rtcpSettings;

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private CredentialInbound inbound;

  public static final String JSON_PROPERTY_OUTBOUND = "outbound";
  private CredentialOutbound outbound;


  public CredentialConnection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CredentialConnection recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credential_connection", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public CredentialConnection active(Boolean active) {
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


  public CredentialConnection userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters).
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "myusername123", value = "The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters).")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public CredentialConnection password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to be used as part of the credentials. Must be 8 to 128 characters long.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my123secure456password789", value = "The password to be used as part of the credentials. Must be 8 to 128 characters long.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CredentialConnection createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO-8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public CredentialConnection updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO-8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CredentialConnection anchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
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


  public CredentialConnection connectionName(String connectionName) {
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


  public CredentialConnection sipUriCallingPreference(SipUriCallingPreferenceEnum sipUriCallingPreference) {
    this.sipUriCallingPreference = sipUriCallingPreference;
    return this;
  }

   /**
   * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).
   * @return sipUriCallingPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).")
  @JsonProperty(JSON_PROPERTY_SIP_URI_CALLING_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SipUriCallingPreferenceEnum getSipUriCallingPreference() {
    return sipUriCallingPreference;
  }


  public void setSipUriCallingPreference(SipUriCallingPreferenceEnum sipUriCallingPreference) {
    this.sipUriCallingPreference = sipUriCallingPreference;
  }


  public CredentialConnection defaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
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


  public CredentialConnection dtmfType(DtmfType dtmfType) {
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


  public CredentialConnection encodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
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


  public CredentialConnection encryptedMedia(EncryptedMedia encryptedMedia) {
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


  public CredentialConnection onnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    return this;
  }

   /**
   * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings.
   * @return onnetT38PassthroughEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg's settings.")
  @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnnetT38PassthroughEnabled() {
    return onnetT38PassthroughEnabled;
  }


  public void setOnnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
  }


  public CredentialConnection rtcpSettings(CreateCredentialConnectionRequestRtcpSettings rtcpSettings) {
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

  public CreateCredentialConnectionRequestRtcpSettings getRtcpSettings() {
    return rtcpSettings;
  }


  public void setRtcpSettings(CreateCredentialConnectionRequestRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
  }


  public CredentialConnection inbound(CredentialInbound inbound) {
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

  public CredentialInbound getInbound() {
    return inbound;
  }


  public void setInbound(CredentialInbound inbound) {
    this.inbound = inbound;
  }


  public CredentialConnection outbound(CredentialOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredentialOutbound getOutbound() {
    return outbound;
  }


  public void setOutbound(CredentialOutbound outbound) {
    this.outbound = outbound;
  }


  /**
   * Return true if this CredentialConnection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialConnection credentialConnection = (CredentialConnection) o;
    return Objects.equals(this.id, credentialConnection.id) &&
        Objects.equals(this.recordType, credentialConnection.recordType) &&
        Objects.equals(this.active, credentialConnection.active) &&
        Objects.equals(this.userName, credentialConnection.userName) &&
        Objects.equals(this.password, credentialConnection.password) &&
        Objects.equals(this.createdAt, credentialConnection.createdAt) &&
        Objects.equals(this.updatedAt, credentialConnection.updatedAt) &&
        Objects.equals(this.anchorsiteOverride, credentialConnection.anchorsiteOverride) &&
        Objects.equals(this.connectionName, credentialConnection.connectionName) &&
        Objects.equals(this.sipUriCallingPreference, credentialConnection.sipUriCallingPreference) &&
        Objects.equals(this.defaultOnHoldComfortNoiseEnabled, credentialConnection.defaultOnHoldComfortNoiseEnabled) &&
        Objects.equals(this.dtmfType, credentialConnection.dtmfType) &&
        Objects.equals(this.encodeContactHeaderEnabled, credentialConnection.encodeContactHeaderEnabled) &&
        Objects.equals(this.encryptedMedia, credentialConnection.encryptedMedia) &&
        Objects.equals(this.onnetT38PassthroughEnabled, credentialConnection.onnetT38PassthroughEnabled) &&
        Objects.equals(this.rtcpSettings, credentialConnection.rtcpSettings) &&
        Objects.equals(this.inbound, credentialConnection.inbound) &&
        Objects.equals(this.outbound, credentialConnection.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, active, userName, password, createdAt, updatedAt, anchorsiteOverride, connectionName, sipUriCallingPreference, defaultOnHoldComfortNoiseEnabled, dtmfType, encodeContactHeaderEnabled, encryptedMedia, onnetT38PassthroughEnabled, rtcpSettings, inbound, outbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialConnection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    sipUriCallingPreference: ").append(toIndentedString(sipUriCallingPreference)).append("\n");
    sb.append("    defaultOnHoldComfortNoiseEnabled: ").append(toIndentedString(defaultOnHoldComfortNoiseEnabled)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    encodeContactHeaderEnabled: ").append(toIndentedString(encodeContactHeaderEnabled)).append("\n");
    sb.append("    encryptedMedia: ").append(toIndentedString(encryptedMedia)).append("\n");
    sb.append("    onnetT38PassthroughEnabled: ").append(toIndentedString(onnetT38PassthroughEnabled)).append("\n");
    sb.append("    rtcpSettings: ").append(toIndentedString(rtcpSettings)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

