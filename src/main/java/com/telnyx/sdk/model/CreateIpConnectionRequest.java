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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.ConnectionRtcpSettings;
import com.telnyx.sdk.model.CreateInboundIpRequest;
import com.telnyx.sdk.model.DtmfType;
import com.telnyx.sdk.model.EncryptedMedia;
import com.telnyx.sdk.model.OutboundIp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateIpConnectionRequest
 */
@JsonPropertyOrder(
    {
        CreateIpConnectionRequest.JSON_PROPERTY_ACTIVE,
        CreateIpConnectionRequest.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
        CreateIpConnectionRequest.JSON_PROPERTY_CONNECTION_NAME,
        CreateIpConnectionRequest.JSON_PROPERTY_TRANSPORT_PROTOCOL,
        CreateIpConnectionRequest.JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED,
        CreateIpConnectionRequest.JSON_PROPERTY_DTMF_TYPE,
        CreateIpConnectionRequest.JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED,
        CreateIpConnectionRequest.JSON_PROPERTY_ENCRYPTED_MEDIA,
        CreateIpConnectionRequest.JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED,
        CreateIpConnectionRequest.JSON_PROPERTY_IOS_PUSH_CREDENTIAL_ID,
        CreateIpConnectionRequest.JSON_PROPERTY_ANDROID_PUSH_CREDENTIAL_ID,
        CreateIpConnectionRequest.JSON_PROPERTY_WEBHOOK_EVENT_URL,
        CreateIpConnectionRequest.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
        CreateIpConnectionRequest.JSON_PROPERTY_WEBHOOK_API_VERSION,
        CreateIpConnectionRequest.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
        CreateIpConnectionRequest.JSON_PROPERTY_RTCP_SETTINGS,
        CreateIpConnectionRequest.JSON_PROPERTY_INBOUND,
        CreateIpConnectionRequest.JSON_PROPERTY_OUTBOUND,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateIpConnectionRequest {

    public static final String JSON_PROPERTY_ACTIVE = "active";
    private Boolean active;

    public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE =
        "anchorsite_override";
    private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

    public static final String JSON_PROPERTY_CONNECTION_NAME =
        "connection_name";
    private String connectionName;

    /**
     * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.
     */
    public enum TransportProtocolEnum {
        UDP(String.valueOf("UDP")),

        TCP(String.valueOf("TCP")),

        TLS(String.valueOf("TLS"));

        private String value;

        TransportProtocolEnum(String value) {
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
        public static TransportProtocolEnum fromValue(String value) {
            for (TransportProtocolEnum b : TransportProtocolEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_TRANSPORT_PROTOCOL =
        "transport_protocol";
    private TransportProtocolEnum transportProtocol = TransportProtocolEnum.UDP;

    public static final String JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED =
        "default_on_hold_comfort_noise_enabled";
    private Boolean defaultOnHoldComfortNoiseEnabled = true;

    public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
    private DtmfType dtmfType = DtmfType.RFC_2833;

    public static final String JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED =
        "encode_contact_header_enabled";
    private Boolean encodeContactHeaderEnabled = false;

    public static final String JSON_PROPERTY_ENCRYPTED_MEDIA =
        "encrypted_media";
    private JsonNullable<EncryptedMedia> encryptedMedia = JsonNullable.<
            EncryptedMedia
        >undefined();

    public static final String JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED =
        "onnet_t38_passthrough_enabled";
    private Boolean onnetT38PassthroughEnabled = false;

    public static final String JSON_PROPERTY_IOS_PUSH_CREDENTIAL_ID =
        "ios_push_credential_id";
    private JsonNullable<String> iosPushCredentialId = JsonNullable.<
            String
        >undefined();

    public static final String JSON_PROPERTY_ANDROID_PUSH_CREDENTIAL_ID =
        "android_push_credential_id";
    private JsonNullable<String> androidPushCredentialId = JsonNullable.<
            String
        >undefined();

    public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL =
        "webhook_event_url";
    private String webhookEventUrl;

    public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL =
        "webhook_event_failover_url";
    private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<
            String
        >of("");

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     */
    public enum WebhookApiVersionEnum {
        _1(String.valueOf("1")),

        _2(String.valueOf("2"));

        private String value;

        WebhookApiVersionEnum(String value) {
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
        public static WebhookApiVersionEnum fromValue(String value) {
            for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_WEBHOOK_API_VERSION =
        "webhook_api_version";
    private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._1;

    public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS =
        "webhook_timeout_secs";
    private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<
            Integer
        >undefined();

    public static final String JSON_PROPERTY_RTCP_SETTINGS = "rtcp_settings";
    private ConnectionRtcpSettings rtcpSettings;

    public static final String JSON_PROPERTY_INBOUND = "inbound";
    private CreateInboundIpRequest inbound;

    public static final String JSON_PROPERTY_OUTBOUND = "outbound";
    private OutboundIp outbound;

    public CreateIpConnectionRequest() {}

    public CreateIpConnectionRequest active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Defaults to true
     * @return active
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Defaults to true")
    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getActive() {
        return active;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActive(Boolean active) {
        this.active = active;
    }

    public CreateIpConnectionRequest anchorsiteOverride(
        AnchorsiteOverride anchorsiteOverride
    ) {
        this.anchorsiteOverride = anchorsiteOverride;
        return this;
    }

    /**
     * Get anchorsiteOverride
     * @return anchorsiteOverride
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AnchorsiteOverride getAnchorsiteOverride() {
        return anchorsiteOverride;
    }

    @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
        this.anchorsiteOverride = anchorsiteOverride;
    }

    public CreateIpConnectionRequest connectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get connectionName
     * @return connectionName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "string", value = "")
    @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getConnectionName() {
        return connectionName;
    }

    @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public CreateIpConnectionRequest transportProtocol(
        TransportProtocolEnum transportProtocol
    ) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    /**
     * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.
     * @return transportProtocol
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "UDP",
        value = "One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication."
    )
    @JsonProperty(JSON_PROPERTY_TRANSPORT_PROTOCOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TransportProtocolEnum getTransportProtocol() {
        return transportProtocol;
    }

    @JsonProperty(JSON_PROPERTY_TRANSPORT_PROTOCOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTransportProtocol(TransportProtocolEnum transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    public CreateIpConnectionRequest defaultOnHoldComfortNoiseEnabled(
        Boolean defaultOnHoldComfortNoiseEnabled
    ) {
        this.defaultOnHoldComfortNoiseEnabled =
            defaultOnHoldComfortNoiseEnabled;
        return this;
    }

    /**
     * When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
     * @return defaultOnHoldComfortNoiseEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout."
    )
    @JsonProperty(JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDefaultOnHoldComfortNoiseEnabled() {
        return defaultOnHoldComfortNoiseEnabled;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultOnHoldComfortNoiseEnabled(
        Boolean defaultOnHoldComfortNoiseEnabled
    ) {
        this.defaultOnHoldComfortNoiseEnabled =
            defaultOnHoldComfortNoiseEnabled;
    }

    public CreateIpConnectionRequest dtmfType(DtmfType dtmfType) {
        this.dtmfType = dtmfType;
        return this;
    }

    /**
     * Get dtmfType
     * @return dtmfType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DtmfType getDtmfType() {
        return dtmfType;
    }

    @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDtmfType(DtmfType dtmfType) {
        this.dtmfType = dtmfType;
    }

    public CreateIpConnectionRequest encodeContactHeaderEnabled(
        Boolean encodeContactHeaderEnabled
    ) {
        this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
        return this;
    }

    /**
     * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
     * @return encodeContactHeaderEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios."
    )
    @JsonProperty(JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEncodeContactHeaderEnabled() {
        return encodeContactHeaderEnabled;
    }

    @JsonProperty(JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEncodeContactHeaderEnabled(
        Boolean encodeContactHeaderEnabled
    ) {
        this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
    }

    public CreateIpConnectionRequest encryptedMedia(
        EncryptedMedia encryptedMedia
    ) {
        this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
        return this;
    }

    /**
     * Get encryptedMedia
     * @return encryptedMedia
     **/
    @jakarta.annotation.Nullable
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
    public void setEncryptedMedia_JsonNullable(
        JsonNullable<EncryptedMedia> encryptedMedia
    ) {
        this.encryptedMedia = encryptedMedia;
    }

    public void setEncryptedMedia(EncryptedMedia encryptedMedia) {
        this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
    }

    public CreateIpConnectionRequest onnetT38PassthroughEnabled(
        Boolean onnetT38PassthroughEnabled
    ) {
        this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
        return this;
    }

    /**
     * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings.
     * @return onnetT38PassthroughEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg's settings."
    )
    @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getOnnetT38PassthroughEnabled() {
        return onnetT38PassthroughEnabled;
    }

    @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOnnetT38PassthroughEnabled(
        Boolean onnetT38PassthroughEnabled
    ) {
        this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    }

    public CreateIpConnectionRequest iosPushCredentialId(
        String iosPushCredentialId
    ) {
        this.iosPushCredentialId = JsonNullable.<String>of(iosPushCredentialId);
        return this;
    }

    /**
     * The uuid of the push credential for Ios
     * @return iosPushCredentialId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "ec0c8e5d-439e-4620-a0c1-9d9c8d02a836",
        value = "The uuid of the push credential for Ios"
    )
    @JsonIgnore
    public String getIosPushCredentialId() {
        return iosPushCredentialId.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_IOS_PUSH_CREDENTIAL_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getIosPushCredentialId_JsonNullable() {
        return iosPushCredentialId;
    }

    @JsonProperty(JSON_PROPERTY_IOS_PUSH_CREDENTIAL_ID)
    public void setIosPushCredentialId_JsonNullable(
        JsonNullable<String> iosPushCredentialId
    ) {
        this.iosPushCredentialId = iosPushCredentialId;
    }

    public void setIosPushCredentialId(String iosPushCredentialId) {
        this.iosPushCredentialId = JsonNullable.<String>of(iosPushCredentialId);
    }

    public CreateIpConnectionRequest androidPushCredentialId(
        String androidPushCredentialId
    ) {
        this.androidPushCredentialId = JsonNullable.<String>of(
            androidPushCredentialId
        );
        return this;
    }

    /**
     * The uuid of the push credential for Android
     * @return androidPushCredentialId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "06b09dfd-7154-4980-8b75-cebf7a9d4f8e",
        value = "The uuid of the push credential for Android"
    )
    @JsonIgnore
    public String getAndroidPushCredentialId() {
        return androidPushCredentialId.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_ANDROID_PUSH_CREDENTIAL_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getAndroidPushCredentialId_JsonNullable() {
        return androidPushCredentialId;
    }

    @JsonProperty(JSON_PROPERTY_ANDROID_PUSH_CREDENTIAL_ID)
    public void setAndroidPushCredentialId_JsonNullable(
        JsonNullable<String> androidPushCredentialId
    ) {
        this.androidPushCredentialId = androidPushCredentialId;
    }

    public void setAndroidPushCredentialId(String androidPushCredentialId) {
        this.androidPushCredentialId = JsonNullable.<String>of(
            androidPushCredentialId
        );
    }

    public CreateIpConnectionRequest webhookEventUrl(String webhookEventUrl) {
        this.webhookEventUrl = webhookEventUrl;
        return this;
    }

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://example.com",
        value = "The URL where webhooks related to this connection will be sent. Must include a scheme, such as 'https'."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookEventUrl() {
        return webhookEventUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookEventUrl(String webhookEventUrl) {
        this.webhookEventUrl = webhookEventUrl;
    }

    public CreateIpConnectionRequest webhookEventFailoverUrl(
        String webhookEventFailoverUrl
    ) {
        this.webhookEventFailoverUrl = JsonNullable.<String>of(
            webhookEventFailoverUrl
        );
        return this;
    }

    /**
     * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventFailoverUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://failover.example.com",
        value = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'."
    )
    @JsonIgnore
    public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
        return webhookEventFailoverUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
    public void setWebhookEventFailoverUrl_JsonNullable(
        JsonNullable<String> webhookEventFailoverUrl
    ) {
        this.webhookEventFailoverUrl = webhookEventFailoverUrl;
    }

    public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
        this.webhookEventFailoverUrl = JsonNullable.<String>of(
            webhookEventFailoverUrl
        );
    }

    public CreateIpConnectionRequest webhookApiVersion(
        WebhookApiVersionEnum webhookApiVersion
    ) {
        this.webhookApiVersion = webhookApiVersion;
        return this;
    }

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     * @return webhookApiVersion
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "1",
        value = "Determines which webhook format will be used, Telnyx API v1 or v2."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WebhookApiVersionEnum getWebhookApiVersion() {
        return webhookApiVersion;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
        this.webhookApiVersion = webhookApiVersion;
    }

    public CreateIpConnectionRequest webhookTimeoutSecs(
        Integer webhookTimeoutSecs
    ) {
        this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
        return this;
    }

    /**
     * Specifies how many seconds to wait before timing out a webhook.
     * minimum: 0
     * maximum: 30
     * @return webhookTimeoutSecs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "25",
        value = "Specifies how many seconds to wait before timing out a webhook."
    )
    @JsonIgnore
    public Integer getWebhookTimeoutSecs() {
        return webhookTimeoutSecs.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<Integer> getWebhookTimeoutSecs_JsonNullable() {
        return webhookTimeoutSecs;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
    public void setWebhookTimeoutSecs_JsonNullable(
        JsonNullable<Integer> webhookTimeoutSecs
    ) {
        this.webhookTimeoutSecs = webhookTimeoutSecs;
    }

    public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
        this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    }

    public CreateIpConnectionRequest rtcpSettings(
        ConnectionRtcpSettings rtcpSettings
    ) {
        this.rtcpSettings = rtcpSettings;
        return this;
    }

    /**
     * Get rtcpSettings
     * @return rtcpSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RTCP_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ConnectionRtcpSettings getRtcpSettings() {
        return rtcpSettings;
    }

    @JsonProperty(JSON_PROPERTY_RTCP_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRtcpSettings(ConnectionRtcpSettings rtcpSettings) {
        this.rtcpSettings = rtcpSettings;
    }

    public CreateIpConnectionRequest inbound(CreateInboundIpRequest inbound) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     * @return inbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CreateInboundIpRequest getInbound() {
        return inbound;
    }

    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInbound(CreateInboundIpRequest inbound) {
        this.inbound = inbound;
    }

    public CreateIpConnectionRequest outbound(OutboundIp outbound) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Get outbound
     * @return outbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OutboundIp getOutbound() {
        return outbound;
    }

    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutbound(OutboundIp outbound) {
        this.outbound = outbound;
    }

    /**
     * Return true if this CreateIpConnectionRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIpConnectionRequest createIpConnectionRequest =
            (CreateIpConnectionRequest) o;
        return (
            Objects.equals(this.active, createIpConnectionRequest.active) &&
            Objects.equals(
                this.anchorsiteOverride,
                createIpConnectionRequest.anchorsiteOverride
            ) &&
            Objects.equals(
                this.connectionName,
                createIpConnectionRequest.connectionName
            ) &&
            Objects.equals(
                this.transportProtocol,
                createIpConnectionRequest.transportProtocol
            ) &&
            Objects.equals(
                this.defaultOnHoldComfortNoiseEnabled,
                createIpConnectionRequest.defaultOnHoldComfortNoiseEnabled
            ) &&
            Objects.equals(this.dtmfType, createIpConnectionRequest.dtmfType) &&
            Objects.equals(
                this.encodeContactHeaderEnabled,
                createIpConnectionRequest.encodeContactHeaderEnabled
            ) &&
            equalsNullable(
                this.encryptedMedia,
                createIpConnectionRequest.encryptedMedia
            ) &&
            Objects.equals(
                this.onnetT38PassthroughEnabled,
                createIpConnectionRequest.onnetT38PassthroughEnabled
            ) &&
            equalsNullable(
                this.iosPushCredentialId,
                createIpConnectionRequest.iosPushCredentialId
            ) &&
            equalsNullable(
                this.androidPushCredentialId,
                createIpConnectionRequest.androidPushCredentialId
            ) &&
            Objects.equals(
                this.webhookEventUrl,
                createIpConnectionRequest.webhookEventUrl
            ) &&
            equalsNullable(
                this.webhookEventFailoverUrl,
                createIpConnectionRequest.webhookEventFailoverUrl
            ) &&
            Objects.equals(
                this.webhookApiVersion,
                createIpConnectionRequest.webhookApiVersion
            ) &&
            equalsNullable(
                this.webhookTimeoutSecs,
                createIpConnectionRequest.webhookTimeoutSecs
            ) &&
            Objects.equals(
                this.rtcpSettings,
                createIpConnectionRequest.rtcpSettings
            ) &&
            Objects.equals(this.inbound, createIpConnectionRequest.inbound) &&
            Objects.equals(this.outbound, createIpConnectionRequest.outbound)
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            active,
            anchorsiteOverride,
            connectionName,
            transportProtocol,
            defaultOnHoldComfortNoiseEnabled,
            dtmfType,
            encodeContactHeaderEnabled,
            hashCodeNullable(encryptedMedia),
            onnetT38PassthroughEnabled,
            hashCodeNullable(iosPushCredentialId),
            hashCodeNullable(androidPushCredentialId),
            webhookEventUrl,
            hashCodeNullable(webhookEventFailoverUrl),
            webhookApiVersion,
            hashCodeNullable(webhookTimeoutSecs),
            rtcpSettings,
            inbound,
            outbound
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpConnectionRequest {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb
            .append("    anchorsiteOverride: ")
            .append(toIndentedString(anchorsiteOverride))
            .append("\n");
        sb
            .append("    connectionName: ")
            .append(toIndentedString(connectionName))
            .append("\n");
        sb
            .append("    transportProtocol: ")
            .append(toIndentedString(transportProtocol))
            .append("\n");
        sb
            .append("    defaultOnHoldComfortNoiseEnabled: ")
            .append(toIndentedString(defaultOnHoldComfortNoiseEnabled))
            .append("\n");
        sb
            .append("    dtmfType: ")
            .append(toIndentedString(dtmfType))
            .append("\n");
        sb
            .append("    encodeContactHeaderEnabled: ")
            .append(toIndentedString(encodeContactHeaderEnabled))
            .append("\n");
        sb
            .append("    encryptedMedia: ")
            .append(toIndentedString(encryptedMedia))
            .append("\n");
        sb
            .append("    onnetT38PassthroughEnabled: ")
            .append(toIndentedString(onnetT38PassthroughEnabled))
            .append("\n");
        sb
            .append("    iosPushCredentialId: ")
            .append(toIndentedString(iosPushCredentialId))
            .append("\n");
        sb
            .append("    androidPushCredentialId: ")
            .append(toIndentedString(androidPushCredentialId))
            .append("\n");
        sb
            .append("    webhookEventUrl: ")
            .append(toIndentedString(webhookEventUrl))
            .append("\n");
        sb
            .append("    webhookEventFailoverUrl: ")
            .append(toIndentedString(webhookEventFailoverUrl))
            .append("\n");
        sb
            .append("    webhookApiVersion: ")
            .append(toIndentedString(webhookApiVersion))
            .append("\n");
        sb
            .append("    webhookTimeoutSecs: ")
            .append(toIndentedString(webhookTimeoutSecs))
            .append("\n");
        sb
            .append("    rtcpSettings: ")
            .append(toIndentedString(rtcpSettings))
            .append("\n");
        sb
            .append("    inbound: ")
            .append(toIndentedString(inbound))
            .append("\n");
        sb
            .append("    outbound: ")
            .append(toIndentedString(outbound))
            .append("\n");
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
