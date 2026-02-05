// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FqdnConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val connectionName: JsonField<String>,
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val adjustDtmfTimestamp: JsonField<Boolean>,
    private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
    private val androidPushCredentialId: JsonField<String>,
    private val callCostEnabled: JsonField<Boolean>,
    private val callCostInWebhooks: JsonField<Boolean>,
    private val createdAt: JsonField<String>,
    private val defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>,
    private val dtmfType: JsonField<DtmfType>,
    private val encodeContactHeaderEnabled: JsonField<Boolean>,
    private val encryptedMedia: JsonField<EncryptedMedia>,
    private val ignoreDtmfDuration: JsonField<Boolean>,
    private val ignoreMarkBit: JsonField<Boolean>,
    private val inbound: JsonField<InboundFqdn>,
    private val iosPushCredentialId: JsonField<String>,
    private val jitterBuffer: JsonField<ConnectionJitterBuffer>,
    private val microsoftTeamsSbc: JsonField<Boolean>,
    private val noiseSuppression: JsonField<NoiseSuppression>,
    private val noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>,
    private val onnetT38PassthroughEnabled: JsonField<Boolean>,
    private val outbound: JsonField<OutboundFqdn>,
    private val password: JsonField<String>,
    private val recordType: JsonField<String>,
    private val rtcpSettings: JsonField<ConnectionRtcpSettings>,
    private val rtpPassCodecsOnStreamChange: JsonField<Boolean>,
    private val sendNormalizedTimestamps: JsonField<Boolean>,
    private val tags: JsonField<List<String>>,
    private val thirdPartyControlEnabled: JsonField<Boolean>,
    private val transportProtocol: JsonField<TransportProtocol>,
    private val txtName: JsonField<String>,
    private val txtTtl: JsonField<Long>,
    private val txtValue: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val userName: JsonField<String>,
    private val webhookApiVersion: JsonField<WebhookApiVersion>,
    private val webhookEventFailoverUrl: JsonField<String>,
    private val webhookEventUrl: JsonField<String>,
    private val webhookTimeoutSecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("connection_name")
        @ExcludeMissing
        connectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("adjust_dtmf_timestamp")
        @ExcludeMissing
        adjustDtmfTimestamp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("anchorsite_override")
        @ExcludeMissing
        anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of(),
        @JsonProperty("android_push_credential_id")
        @ExcludeMissing
        androidPushCredentialId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_cost_enabled")
        @ExcludeMissing
        callCostEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("call_cost_in_webhooks")
        @ExcludeMissing
        callCostInWebhooks: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_on_hold_comfort_noise_enabled")
        @ExcludeMissing
        defaultOnHoldComfortNoiseEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dtmf_type") @ExcludeMissing dtmfType: JsonField<DtmfType> = JsonMissing.of(),
        @JsonProperty("encode_contact_header_enabled")
        @ExcludeMissing
        encodeContactHeaderEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("encrypted_media")
        @ExcludeMissing
        encryptedMedia: JsonField<EncryptedMedia> = JsonMissing.of(),
        @JsonProperty("ignore_dtmf_duration")
        @ExcludeMissing
        ignoreDtmfDuration: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ignore_mark_bit")
        @ExcludeMissing
        ignoreMarkBit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<InboundFqdn> = JsonMissing.of(),
        @JsonProperty("ios_push_credential_id")
        @ExcludeMissing
        iosPushCredentialId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jitter_buffer")
        @ExcludeMissing
        jitterBuffer: JsonField<ConnectionJitterBuffer> = JsonMissing.of(),
        @JsonProperty("microsoft_teams_sbc")
        @ExcludeMissing
        microsoftTeamsSbc: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("noise_suppression")
        @ExcludeMissing
        noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of(),
        @JsonProperty("noise_suppression_details")
        @ExcludeMissing
        noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails> = JsonMissing.of(),
        @JsonProperty("onnet_t38_passthrough_enabled")
        @ExcludeMissing
        onnetT38PassthroughEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("outbound")
        @ExcludeMissing
        outbound: JsonField<OutboundFqdn> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rtcp_settings")
        @ExcludeMissing
        rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of(),
        @JsonProperty("rtp_pass_codecs_on_stream_change")
        @ExcludeMissing
        rtpPassCodecsOnStreamChange: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("send_normalized_timestamps")
        @ExcludeMissing
        sendNormalizedTimestamps: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("third_party_control_enabled")
        @ExcludeMissing
        thirdPartyControlEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("transport_protocol")
        @ExcludeMissing
        transportProtocol: JsonField<TransportProtocol> = JsonMissing.of(),
        @JsonProperty("txt_name") @ExcludeMissing txtName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("txt_ttl") @ExcludeMissing txtTtl: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("txt_value") @ExcludeMissing txtValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_name") @ExcludeMissing userName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_api_version")
        @ExcludeMissing
        webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of(),
        @JsonProperty("webhook_event_failover_url")
        @ExcludeMissing
        webhookEventFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_event_url")
        @ExcludeMissing
        webhookEventUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_timeout_secs")
        @ExcludeMissing
        webhookTimeoutSecs: JsonField<Long> = JsonMissing.of(),
    ) : this(
        connectionName,
        id,
        active,
        adjustDtmfTimestamp,
        anchorsiteOverride,
        androidPushCredentialId,
        callCostEnabled,
        callCostInWebhooks,
        createdAt,
        defaultOnHoldComfortNoiseEnabled,
        dtmfType,
        encodeContactHeaderEnabled,
        encryptedMedia,
        ignoreDtmfDuration,
        ignoreMarkBit,
        inbound,
        iosPushCredentialId,
        jitterBuffer,
        microsoftTeamsSbc,
        noiseSuppression,
        noiseSuppressionDetails,
        onnetT38PassthroughEnabled,
        outbound,
        password,
        recordType,
        rtcpSettings,
        rtpPassCodecsOnStreamChange,
        sendNormalizedTimestamps,
        tags,
        thirdPartyControlEnabled,
        transportProtocol,
        txtName,
        txtTtl,
        txtValue,
        updatedAt,
        userName,
        webhookApiVersion,
        webhookEventFailoverUrl,
        webhookEventUrl,
        webhookTimeoutSecs,
        mutableMapOf(),
    )

    /**
     * A user-assigned name to help manage the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionName(): String = connectionName.getRequired("connection_name")

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Defaults to true
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = active.getOptional("active")

    /**
     * Indicates whether DTMF timestamp adjustment is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun adjustDtmfTimestamp(): Optional<Boolean> =
        adjustDtmfTimestamp.getOptional("adjust_dtmf_timestamp")

    /**
     * `Latency` directs Telnyx to route media through the site with the lowest round-trip time to
     * the user's connection. Telnyx calculates this time using ICMP ping messages. This can be
     * disabled by specifying a site to handle all media.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun anchorsiteOverride(): Optional<AnchorsiteOverride> =
        anchorsiteOverride.getOptional("anchorsite_override")

    /**
     * The uuid of the push credential for Android
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun androidPushCredentialId(): Optional<String> =
        androidPushCredentialId.getOptional("android_push_credential_id")

    /**
     * Indicates whether call cost calculation is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callCostEnabled(): Optional<Boolean> = callCostEnabled.getOptional("call_cost_enabled")

    /**
     * Specifies if call cost webhooks should be sent for this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callCostInWebhooks(): Optional<Boolean> =
        callCostInWebhooks.getOptional("call_cost_in_webhooks")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * When enabled, Telnyx will generate comfort noise when you place the call on hold. If
     * disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultOnHoldComfortNoiseEnabled(): Optional<Boolean> =
        defaultOnHoldComfortNoiseEnabled.getOptional("default_on_hold_comfort_noise_enabled")

    /**
     * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent
     * to Telnyx will be accepted in all formats.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtmfType(): Optional<DtmfType> = dtmfType.getOptional("dtmf_type")

    /**
     * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encodeContactHeaderEnabled(): Optional<Boolean> =
        encodeContactHeaderEnabled.getOptional("encode_contact_header_enabled")

    /**
     * Enable use of SRTP for encryption. Cannot be set if the transport_portocol is TLS.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encryptedMedia(): Optional<EncryptedMedia> = encryptedMedia.getOptional("encrypted_media")

    /**
     * Indicates whether DTMF duration should be ignored.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ignoreDtmfDuration(): Optional<Boolean> =
        ignoreDtmfDuration.getOptional("ignore_dtmf_duration")

    /**
     * Indicates whether the mark bit should be ignored.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ignoreMarkBit(): Optional<Boolean> = ignoreMarkBit.getOptional("ignore_mark_bit")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<InboundFqdn> = inbound.getOptional("inbound")

    /**
     * The uuid of the push credential for Ios
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iosPushCredentialId(): Optional<String> =
        iosPushCredentialId.getOptional("ios_push_credential_id")

    /**
     * Configuration options for Jitter Buffer. Enables Jitter Buffer for RTP streams of SIP
     * Trunking calls. The feature is off unless enabled. You may define min and max values in msec
     * for customized buffering behaviors. Larger values add latency but tolerate more jitter, while
     * smaller values reduce latency but are more sensitive to jitter and reordering.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitterBuffer(): Optional<ConnectionJitterBuffer> = jitterBuffer.getOptional("jitter_buffer")

    /**
     * The connection is enabled for Microsoft Teams Direct Routing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun microsoftTeamsSbc(): Optional<Boolean> =
        microsoftTeamsSbc.getOptional("microsoft_teams_sbc")

    /**
     * Controls when noise suppression is applied to calls. When set to 'inbound', noise suppression
     * is applied to incoming audio. When set to 'outbound', it's applied to outgoing audio. When
     * set to 'both', it's applied in both directions. When set to 'disabled', noise suppression is
     * turned off.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppression(): Optional<NoiseSuppression> =
        noiseSuppression.getOptional("noise_suppression")

    /**
     * Configuration options for noise suppression. These settings are stored regardless of the
     * noise_suppression value, but only take effect when noise_suppression is not 'disabled'. If
     * you disable noise suppression and later re-enable it, the previously configured settings will
     * be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppressionDetails(): Optional<ConnectionNoiseSuppressionDetails> =
        noiseSuppressionDetails.getOptional("noise_suppression_details")

    /**
     * Enable on-net T38 if you prefer that the sender and receiver negotiate T38 directly when both
     * are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one
     * leg of the call according to each leg's settings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onnetT38PassthroughEnabled(): Optional<Boolean> =
        onnetT38PassthroughEnabled.getOptional("onnet_t38_passthrough_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outbound(): Optional<OutboundFqdn> = outbound.getOptional("outbound")

    /**
     * The password for the FQDN connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = password.getOptional("password")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rtcpSettings(): Optional<ConnectionRtcpSettings> = rtcpSettings.getOptional("rtcp_settings")

    /**
     * Defines if codecs should be passed on stream change.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rtpPassCodecsOnStreamChange(): Optional<Boolean> =
        rtpPassCodecsOnStreamChange.getOptional("rtp_pass_codecs_on_stream_change")

    /**
     * Indicates whether normalized timestamps should be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendNormalizedTimestamps(): Optional<Boolean> =
        sendNormalizedTimestamps.getOptional("send_normalized_timestamps")

    /**
     * Tags associated with the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Indicates whether third-party control is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdPartyControlEnabled(): Optional<Boolean> =
        thirdPartyControlEnabled.getOptional("third_party_control_enabled")

    /**
     * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN
     * authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transportProtocol(): Optional<TransportProtocol> =
        transportProtocol.getOptional("transport_protocol")

    /**
     * The name for the TXT record associated with the FQDN connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun txtName(): Optional<String> = txtName.getOptional("txt_name")

    /**
     * The time to live for the TXT record associated with the FQDN connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun txtTtl(): Optional<Long> = txtTtl.getOptional("txt_ttl")

    /**
     * The value for the TXT record associated with the FQDN connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun txtValue(): Optional<String> = txtValue.getOptional("txt_value")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * The username for the FQDN connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userName(): Optional<String> = userName.getOptional("user_name")

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookApiVersion(): Optional<WebhookApiVersion> =
        webhookApiVersion.getOptional("webhook_api_version")

    /**
     * The failover URL where webhooks related to this connection will be sent if sending to the
     * primary URL fails. Must include a scheme, such as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventFailoverUrl(): Optional<String> =
        webhookEventFailoverUrl.getOptional("webhook_event_failover_url")

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such
     * as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventUrl(): Optional<String> = webhookEventUrl.getOptional("webhook_event_url")

    /**
     * Specifies how many seconds to wait before timing out a webhook.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookTimeoutSecs(): Optional<Long> =
        webhookTimeoutSecs.getOptional("webhook_timeout_secs")

    /**
     * Returns the raw JSON value of [connectionName].
     *
     * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_name")
    @ExcludeMissing
    fun _connectionName(): JsonField<String> = connectionName

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [adjustDtmfTimestamp].
     *
     * Unlike [adjustDtmfTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("adjust_dtmf_timestamp")
    @ExcludeMissing
    fun _adjustDtmfTimestamp(): JsonField<Boolean> = adjustDtmfTimestamp

    /**
     * Returns the raw JSON value of [anchorsiteOverride].
     *
     * Unlike [anchorsiteOverride], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("anchorsite_override")
    @ExcludeMissing
    fun _anchorsiteOverride(): JsonField<AnchorsiteOverride> = anchorsiteOverride

    /**
     * Returns the raw JSON value of [androidPushCredentialId].
     *
     * Unlike [androidPushCredentialId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("android_push_credential_id")
    @ExcludeMissing
    fun _androidPushCredentialId(): JsonField<String> = androidPushCredentialId

    /**
     * Returns the raw JSON value of [callCostEnabled].
     *
     * Unlike [callCostEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_cost_enabled")
    @ExcludeMissing
    fun _callCostEnabled(): JsonField<Boolean> = callCostEnabled

    /**
     * Returns the raw JSON value of [callCostInWebhooks].
     *
     * Unlike [callCostInWebhooks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_cost_in_webhooks")
    @ExcludeMissing
    fun _callCostInWebhooks(): JsonField<Boolean> = callCostInWebhooks

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [defaultOnHoldComfortNoiseEnabled].
     *
     * Unlike [defaultOnHoldComfortNoiseEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("default_on_hold_comfort_noise_enabled")
    @ExcludeMissing
    fun _defaultOnHoldComfortNoiseEnabled(): JsonField<Boolean> = defaultOnHoldComfortNoiseEnabled

    /**
     * Returns the raw JSON value of [dtmfType].
     *
     * Unlike [dtmfType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtmf_type") @ExcludeMissing fun _dtmfType(): JsonField<DtmfType> = dtmfType

    /**
     * Returns the raw JSON value of [encodeContactHeaderEnabled].
     *
     * Unlike [encodeContactHeaderEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("encode_contact_header_enabled")
    @ExcludeMissing
    fun _encodeContactHeaderEnabled(): JsonField<Boolean> = encodeContactHeaderEnabled

    /**
     * Returns the raw JSON value of [encryptedMedia].
     *
     * Unlike [encryptedMedia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encrypted_media")
    @ExcludeMissing
    fun _encryptedMedia(): JsonField<EncryptedMedia> = encryptedMedia

    /**
     * Returns the raw JSON value of [ignoreDtmfDuration].
     *
     * Unlike [ignoreDtmfDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ignore_dtmf_duration")
    @ExcludeMissing
    fun _ignoreDtmfDuration(): JsonField<Boolean> = ignoreDtmfDuration

    /**
     * Returns the raw JSON value of [ignoreMarkBit].
     *
     * Unlike [ignoreMarkBit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ignore_mark_bit")
    @ExcludeMissing
    fun _ignoreMarkBit(): JsonField<Boolean> = ignoreMarkBit

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<InboundFqdn> = inbound

    /**
     * Returns the raw JSON value of [iosPushCredentialId].
     *
     * Unlike [iosPushCredentialId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ios_push_credential_id")
    @ExcludeMissing
    fun _iosPushCredentialId(): JsonField<String> = iosPushCredentialId

    /**
     * Returns the raw JSON value of [jitterBuffer].
     *
     * Unlike [jitterBuffer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jitter_buffer")
    @ExcludeMissing
    fun _jitterBuffer(): JsonField<ConnectionJitterBuffer> = jitterBuffer

    /**
     * Returns the raw JSON value of [microsoftTeamsSbc].
     *
     * Unlike [microsoftTeamsSbc], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("microsoft_teams_sbc")
    @ExcludeMissing
    fun _microsoftTeamsSbc(): JsonField<Boolean> = microsoftTeamsSbc

    /**
     * Returns the raw JSON value of [noiseSuppression].
     *
     * Unlike [noiseSuppression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("noise_suppression")
    @ExcludeMissing
    fun _noiseSuppression(): JsonField<NoiseSuppression> = noiseSuppression

    /**
     * Returns the raw JSON value of [noiseSuppressionDetails].
     *
     * Unlike [noiseSuppressionDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("noise_suppression_details")
    @ExcludeMissing
    fun _noiseSuppressionDetails(): JsonField<ConnectionNoiseSuppressionDetails> =
        noiseSuppressionDetails

    /**
     * Returns the raw JSON value of [onnetT38PassthroughEnabled].
     *
     * Unlike [onnetT38PassthroughEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("onnet_t38_passthrough_enabled")
    @ExcludeMissing
    fun _onnetT38PassthroughEnabled(): JsonField<Boolean> = onnetT38PassthroughEnabled

    /**
     * Returns the raw JSON value of [outbound].
     *
     * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<OutboundFqdn> = outbound

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [rtcpSettings].
     *
     * Unlike [rtcpSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rtcp_settings")
    @ExcludeMissing
    fun _rtcpSettings(): JsonField<ConnectionRtcpSettings> = rtcpSettings

    /**
     * Returns the raw JSON value of [rtpPassCodecsOnStreamChange].
     *
     * Unlike [rtpPassCodecsOnStreamChange], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("rtp_pass_codecs_on_stream_change")
    @ExcludeMissing
    fun _rtpPassCodecsOnStreamChange(): JsonField<Boolean> = rtpPassCodecsOnStreamChange

    /**
     * Returns the raw JSON value of [sendNormalizedTimestamps].
     *
     * Unlike [sendNormalizedTimestamps], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("send_normalized_timestamps")
    @ExcludeMissing
    fun _sendNormalizedTimestamps(): JsonField<Boolean> = sendNormalizedTimestamps

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [thirdPartyControlEnabled].
     *
     * Unlike [thirdPartyControlEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("third_party_control_enabled")
    @ExcludeMissing
    fun _thirdPartyControlEnabled(): JsonField<Boolean> = thirdPartyControlEnabled

    /**
     * Returns the raw JSON value of [transportProtocol].
     *
     * Unlike [transportProtocol], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transport_protocol")
    @ExcludeMissing
    fun _transportProtocol(): JsonField<TransportProtocol> = transportProtocol

    /**
     * Returns the raw JSON value of [txtName].
     *
     * Unlike [txtName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("txt_name") @ExcludeMissing fun _txtName(): JsonField<String> = txtName

    /**
     * Returns the raw JSON value of [txtTtl].
     *
     * Unlike [txtTtl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("txt_ttl") @ExcludeMissing fun _txtTtl(): JsonField<Long> = txtTtl

    /**
     * Returns the raw JSON value of [txtValue].
     *
     * Unlike [txtValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("txt_value") @ExcludeMissing fun _txtValue(): JsonField<String> = txtValue

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [userName].
     *
     * Unlike [userName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_name") @ExcludeMissing fun _userName(): JsonField<String> = userName

    /**
     * Returns the raw JSON value of [webhookApiVersion].
     *
     * Unlike [webhookApiVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_api_version")
    @ExcludeMissing
    fun _webhookApiVersion(): JsonField<WebhookApiVersion> = webhookApiVersion

    /**
     * Returns the raw JSON value of [webhookEventFailoverUrl].
     *
     * Unlike [webhookEventFailoverUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("webhook_event_failover_url")
    @ExcludeMissing
    fun _webhookEventFailoverUrl(): JsonField<String> = webhookEventFailoverUrl

    /**
     * Returns the raw JSON value of [webhookEventUrl].
     *
     * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_event_url")
    @ExcludeMissing
    fun _webhookEventUrl(): JsonField<String> = webhookEventUrl

    /**
     * Returns the raw JSON value of [webhookTimeoutSecs].
     *
     * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_timeout_secs")
    @ExcludeMissing
    fun _webhookTimeoutSecs(): JsonField<Long> = webhookTimeoutSecs

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FqdnConnection].
         *
         * The following fields are required:
         * ```java
         * .connectionName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FqdnConnection]. */
    class Builder internal constructor() {

        private var connectionName: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var adjustDtmfTimestamp: JsonField<Boolean> = JsonMissing.of()
        private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
        private var androidPushCredentialId: JsonField<String> = JsonMissing.of()
        private var callCostEnabled: JsonField<Boolean> = JsonMissing.of()
        private var callCostInWebhooks: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var defaultOnHoldComfortNoiseEnabled: JsonField<Boolean> = JsonMissing.of()
        private var dtmfType: JsonField<DtmfType> = JsonMissing.of()
        private var encodeContactHeaderEnabled: JsonField<Boolean> = JsonMissing.of()
        private var encryptedMedia: JsonField<EncryptedMedia> = JsonMissing.of()
        private var ignoreDtmfDuration: JsonField<Boolean> = JsonMissing.of()
        private var ignoreMarkBit: JsonField<Boolean> = JsonMissing.of()
        private var inbound: JsonField<InboundFqdn> = JsonMissing.of()
        private var iosPushCredentialId: JsonField<String> = JsonMissing.of()
        private var jitterBuffer: JsonField<ConnectionJitterBuffer> = JsonMissing.of()
        private var microsoftTeamsSbc: JsonField<Boolean> = JsonMissing.of()
        private var noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of()
        private var noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails> =
            JsonMissing.of()
        private var onnetT38PassthroughEnabled: JsonField<Boolean> = JsonMissing.of()
        private var outbound: JsonField<OutboundFqdn> = JsonMissing.of()
        private var password: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of()
        private var rtpPassCodecsOnStreamChange: JsonField<Boolean> = JsonMissing.of()
        private var sendNormalizedTimestamps: JsonField<Boolean> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var thirdPartyControlEnabled: JsonField<Boolean> = JsonMissing.of()
        private var transportProtocol: JsonField<TransportProtocol> = JsonMissing.of()
        private var txtName: JsonField<String> = JsonMissing.of()
        private var txtTtl: JsonField<Long> = JsonMissing.of()
        private var txtValue: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var userName: JsonField<String> = JsonMissing.of()
        private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
        private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookEventUrl: JsonField<String> = JsonMissing.of()
        private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fqdnConnection: FqdnConnection) = apply {
            connectionName = fqdnConnection.connectionName
            id = fqdnConnection.id
            active = fqdnConnection.active
            adjustDtmfTimestamp = fqdnConnection.adjustDtmfTimestamp
            anchorsiteOverride = fqdnConnection.anchorsiteOverride
            androidPushCredentialId = fqdnConnection.androidPushCredentialId
            callCostEnabled = fqdnConnection.callCostEnabled
            callCostInWebhooks = fqdnConnection.callCostInWebhooks
            createdAt = fqdnConnection.createdAt
            defaultOnHoldComfortNoiseEnabled = fqdnConnection.defaultOnHoldComfortNoiseEnabled
            dtmfType = fqdnConnection.dtmfType
            encodeContactHeaderEnabled = fqdnConnection.encodeContactHeaderEnabled
            encryptedMedia = fqdnConnection.encryptedMedia
            ignoreDtmfDuration = fqdnConnection.ignoreDtmfDuration
            ignoreMarkBit = fqdnConnection.ignoreMarkBit
            inbound = fqdnConnection.inbound
            iosPushCredentialId = fqdnConnection.iosPushCredentialId
            jitterBuffer = fqdnConnection.jitterBuffer
            microsoftTeamsSbc = fqdnConnection.microsoftTeamsSbc
            noiseSuppression = fqdnConnection.noiseSuppression
            noiseSuppressionDetails = fqdnConnection.noiseSuppressionDetails
            onnetT38PassthroughEnabled = fqdnConnection.onnetT38PassthroughEnabled
            outbound = fqdnConnection.outbound
            password = fqdnConnection.password
            recordType = fqdnConnection.recordType
            rtcpSettings = fqdnConnection.rtcpSettings
            rtpPassCodecsOnStreamChange = fqdnConnection.rtpPassCodecsOnStreamChange
            sendNormalizedTimestamps = fqdnConnection.sendNormalizedTimestamps
            tags = fqdnConnection.tags.map { it.toMutableList() }
            thirdPartyControlEnabled = fqdnConnection.thirdPartyControlEnabled
            transportProtocol = fqdnConnection.transportProtocol
            txtName = fqdnConnection.txtName
            txtTtl = fqdnConnection.txtTtl
            txtValue = fqdnConnection.txtValue
            updatedAt = fqdnConnection.updatedAt
            userName = fqdnConnection.userName
            webhookApiVersion = fqdnConnection.webhookApiVersion
            webhookEventFailoverUrl = fqdnConnection.webhookEventFailoverUrl
            webhookEventUrl = fqdnConnection.webhookEventUrl
            webhookTimeoutSecs = fqdnConnection.webhookTimeoutSecs
            additionalProperties = fqdnConnection.additionalProperties.toMutableMap()
        }

        /** A user-assigned name to help manage the connection. */
        fun connectionName(connectionName: String) = connectionName(JsonField.of(connectionName))

        /**
         * Sets [Builder.connectionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionName(connectionName: JsonField<String>) = apply {
            this.connectionName = connectionName
        }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Defaults to true */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /** Indicates whether DTMF timestamp adjustment is enabled. */
        fun adjustDtmfTimestamp(adjustDtmfTimestamp: Boolean) =
            adjustDtmfTimestamp(JsonField.of(adjustDtmfTimestamp))

        /**
         * Sets [Builder.adjustDtmfTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustDtmfTimestamp] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustDtmfTimestamp(adjustDtmfTimestamp: JsonField<Boolean>) = apply {
            this.adjustDtmfTimestamp = adjustDtmfTimestamp
        }

        /**
         * `Latency` directs Telnyx to route media through the site with the lowest round-trip time
         * to the user's connection. Telnyx calculates this time using ICMP ping messages. This can
         * be disabled by specifying a site to handle all media.
         */
        fun anchorsiteOverride(anchorsiteOverride: AnchorsiteOverride) =
            anchorsiteOverride(JsonField.of(anchorsiteOverride))

        /**
         * Sets [Builder.anchorsiteOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.anchorsiteOverride] with a well-typed
         * [AnchorsiteOverride] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun anchorsiteOverride(anchorsiteOverride: JsonField<AnchorsiteOverride>) = apply {
            this.anchorsiteOverride = anchorsiteOverride
        }

        /** The uuid of the push credential for Android */
        fun androidPushCredentialId(androidPushCredentialId: String?) =
            androidPushCredentialId(JsonField.ofNullable(androidPushCredentialId))

        /**
         * Alias for calling [Builder.androidPushCredentialId] with
         * `androidPushCredentialId.orElse(null)`.
         */
        fun androidPushCredentialId(androidPushCredentialId: Optional<String>) =
            androidPushCredentialId(androidPushCredentialId.getOrNull())

        /**
         * Sets [Builder.androidPushCredentialId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.androidPushCredentialId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun androidPushCredentialId(androidPushCredentialId: JsonField<String>) = apply {
            this.androidPushCredentialId = androidPushCredentialId
        }

        /** Indicates whether call cost calculation is enabled. */
        fun callCostEnabled(callCostEnabled: Boolean) =
            callCostEnabled(JsonField.of(callCostEnabled))

        /**
         * Sets [Builder.callCostEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callCostEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callCostEnabled(callCostEnabled: JsonField<Boolean>) = apply {
            this.callCostEnabled = callCostEnabled
        }

        /** Specifies if call cost webhooks should be sent for this connection. */
        fun callCostInWebhooks(callCostInWebhooks: Boolean) =
            callCostInWebhooks(JsonField.of(callCostInWebhooks))

        /**
         * Sets [Builder.callCostInWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callCostInWebhooks] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callCostInWebhooks(callCostInWebhooks: JsonField<Boolean>) = apply {
            this.callCostInWebhooks = callCostInWebhooks
        }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /**
         * When enabled, Telnyx will generate comfort noise when you place the call on hold. If
         * disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
         */
        fun defaultOnHoldComfortNoiseEnabled(defaultOnHoldComfortNoiseEnabled: Boolean) =
            defaultOnHoldComfortNoiseEnabled(JsonField.of(defaultOnHoldComfortNoiseEnabled))

        /**
         * Sets [Builder.defaultOnHoldComfortNoiseEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultOnHoldComfortNoiseEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultOnHoldComfortNoiseEnabled(defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>) =
            apply {
                this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled
            }

        /**
         * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits
         * sent to Telnyx will be accepted in all formats.
         */
        fun dtmfType(dtmfType: DtmfType) = dtmfType(JsonField.of(dtmfType))

        /**
         * Sets [Builder.dtmfType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtmfType] with a well-typed [DtmfType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dtmfType(dtmfType: JsonField<DtmfType>) = apply { this.dtmfType = dtmfType }

        /**
         * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
         */
        fun encodeContactHeaderEnabled(encodeContactHeaderEnabled: Boolean) =
            encodeContactHeaderEnabled(JsonField.of(encodeContactHeaderEnabled))

        /**
         * Sets [Builder.encodeContactHeaderEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encodeContactHeaderEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun encodeContactHeaderEnabled(encodeContactHeaderEnabled: JsonField<Boolean>) = apply {
            this.encodeContactHeaderEnabled = encodeContactHeaderEnabled
        }

        /** Enable use of SRTP for encryption. Cannot be set if the transport_portocol is TLS. */
        fun encryptedMedia(encryptedMedia: EncryptedMedia?) =
            encryptedMedia(JsonField.ofNullable(encryptedMedia))

        /** Alias for calling [Builder.encryptedMedia] with `encryptedMedia.orElse(null)`. */
        fun encryptedMedia(encryptedMedia: Optional<EncryptedMedia>) =
            encryptedMedia(encryptedMedia.getOrNull())

        /**
         * Sets [Builder.encryptedMedia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedMedia] with a well-typed [EncryptedMedia] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedMedia(encryptedMedia: JsonField<EncryptedMedia>) = apply {
            this.encryptedMedia = encryptedMedia
        }

        /** Indicates whether DTMF duration should be ignored. */
        fun ignoreDtmfDuration(ignoreDtmfDuration: Boolean) =
            ignoreDtmfDuration(JsonField.of(ignoreDtmfDuration))

        /**
         * Sets [Builder.ignoreDtmfDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ignoreDtmfDuration] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ignoreDtmfDuration(ignoreDtmfDuration: JsonField<Boolean>) = apply {
            this.ignoreDtmfDuration = ignoreDtmfDuration
        }

        /** Indicates whether the mark bit should be ignored. */
        fun ignoreMarkBit(ignoreMarkBit: Boolean) = ignoreMarkBit(JsonField.of(ignoreMarkBit))

        /**
         * Sets [Builder.ignoreMarkBit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ignoreMarkBit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ignoreMarkBit(ignoreMarkBit: JsonField<Boolean>) = apply {
            this.ignoreMarkBit = ignoreMarkBit
        }

        fun inbound(inbound: InboundFqdn) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [InboundFqdn] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inbound(inbound: JsonField<InboundFqdn>) = apply { this.inbound = inbound }

        /** The uuid of the push credential for Ios */
        fun iosPushCredentialId(iosPushCredentialId: String?) =
            iosPushCredentialId(JsonField.ofNullable(iosPushCredentialId))

        /**
         * Alias for calling [Builder.iosPushCredentialId] with `iosPushCredentialId.orElse(null)`.
         */
        fun iosPushCredentialId(iosPushCredentialId: Optional<String>) =
            iosPushCredentialId(iosPushCredentialId.getOrNull())

        /**
         * Sets [Builder.iosPushCredentialId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iosPushCredentialId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun iosPushCredentialId(iosPushCredentialId: JsonField<String>) = apply {
            this.iosPushCredentialId = iosPushCredentialId
        }

        /**
         * Configuration options for Jitter Buffer. Enables Jitter Buffer for RTP streams of SIP
         * Trunking calls. The feature is off unless enabled. You may define min and max values in
         * msec for customized buffering behaviors. Larger values add latency but tolerate more
         * jitter, while smaller values reduce latency but are more sensitive to jitter and
         * reordering.
         */
        fun jitterBuffer(jitterBuffer: ConnectionJitterBuffer) =
            jitterBuffer(JsonField.of(jitterBuffer))

        /**
         * Sets [Builder.jitterBuffer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitterBuffer] with a well-typed [ConnectionJitterBuffer]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jitterBuffer(jitterBuffer: JsonField<ConnectionJitterBuffer>) = apply {
            this.jitterBuffer = jitterBuffer
        }

        /** The connection is enabled for Microsoft Teams Direct Routing. */
        fun microsoftTeamsSbc(microsoftTeamsSbc: Boolean) =
            microsoftTeamsSbc(JsonField.of(microsoftTeamsSbc))

        /**
         * Sets [Builder.microsoftTeamsSbc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.microsoftTeamsSbc] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun microsoftTeamsSbc(microsoftTeamsSbc: JsonField<Boolean>) = apply {
            this.microsoftTeamsSbc = microsoftTeamsSbc
        }

        /**
         * Controls when noise suppression is applied to calls. When set to 'inbound', noise
         * suppression is applied to incoming audio. When set to 'outbound', it's applied to
         * outgoing audio. When set to 'both', it's applied in both directions. When set to
         * 'disabled', noise suppression is turned off.
         */
        fun noiseSuppression(noiseSuppression: NoiseSuppression) =
            noiseSuppression(JsonField.of(noiseSuppression))

        /**
         * Sets [Builder.noiseSuppression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppression] with a well-typed [NoiseSuppression]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun noiseSuppression(noiseSuppression: JsonField<NoiseSuppression>) = apply {
            this.noiseSuppression = noiseSuppression
        }

        /**
         * Configuration options for noise suppression. These settings are stored regardless of the
         * noise_suppression value, but only take effect when noise_suppression is not 'disabled'.
         * If you disable noise suppression and later re-enable it, the previously configured
         * settings will be used.
         */
        fun noiseSuppressionDetails(noiseSuppressionDetails: ConnectionNoiseSuppressionDetails) =
            noiseSuppressionDetails(JsonField.of(noiseSuppressionDetails))

        /**
         * Sets [Builder.noiseSuppressionDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppressionDetails] with a well-typed
         * [ConnectionNoiseSuppressionDetails] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun noiseSuppressionDetails(
            noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>
        ) = apply { this.noiseSuppressionDetails = noiseSuppressionDetails }

        /**
         * Enable on-net T38 if you prefer that the sender and receiver negotiate T38 directly when
         * both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on
         * just one leg of the call according to each leg's settings.
         */
        fun onnetT38PassthroughEnabled(onnetT38PassthroughEnabled: Boolean) =
            onnetT38PassthroughEnabled(JsonField.of(onnetT38PassthroughEnabled))

        /**
         * Sets [Builder.onnetT38PassthroughEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onnetT38PassthroughEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onnetT38PassthroughEnabled(onnetT38PassthroughEnabled: JsonField<Boolean>) = apply {
            this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled
        }

        fun outbound(outbound: OutboundFqdn) = outbound(JsonField.of(outbound))

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed [OutboundFqdn] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outbound(outbound: JsonField<OutboundFqdn>) = apply { this.outbound = outbound }

        /** The password for the FQDN connection. */
        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun rtcpSettings(rtcpSettings: ConnectionRtcpSettings) =
            rtcpSettings(JsonField.of(rtcpSettings))

        /**
         * Sets [Builder.rtcpSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtcpSettings] with a well-typed [ConnectionRtcpSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rtcpSettings(rtcpSettings: JsonField<ConnectionRtcpSettings>) = apply {
            this.rtcpSettings = rtcpSettings
        }

        /** Defines if codecs should be passed on stream change. */
        fun rtpPassCodecsOnStreamChange(rtpPassCodecsOnStreamChange: Boolean) =
            rtpPassCodecsOnStreamChange(JsonField.of(rtpPassCodecsOnStreamChange))

        /**
         * Sets [Builder.rtpPassCodecsOnStreamChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtpPassCodecsOnStreamChange] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rtpPassCodecsOnStreamChange(rtpPassCodecsOnStreamChange: JsonField<Boolean>) = apply {
            this.rtpPassCodecsOnStreamChange = rtpPassCodecsOnStreamChange
        }

        /** Indicates whether normalized timestamps should be sent. */
        fun sendNormalizedTimestamps(sendNormalizedTimestamps: Boolean) =
            sendNormalizedTimestamps(JsonField.of(sendNormalizedTimestamps))

        /**
         * Sets [Builder.sendNormalizedTimestamps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendNormalizedTimestamps] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sendNormalizedTimestamps(sendNormalizedTimestamps: JsonField<Boolean>) = apply {
            this.sendNormalizedTimestamps = sendNormalizedTimestamps
        }

        /** Tags associated with the connection. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Indicates whether third-party control is enabled. */
        fun thirdPartyControlEnabled(thirdPartyControlEnabled: Boolean) =
            thirdPartyControlEnabled(JsonField.of(thirdPartyControlEnabled))

        /**
         * Sets [Builder.thirdPartyControlEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyControlEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun thirdPartyControlEnabled(thirdPartyControlEnabled: JsonField<Boolean>) = apply {
            this.thirdPartyControlEnabled = thirdPartyControlEnabled
        }

        /**
         * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN
         * authentication.
         */
        fun transportProtocol(transportProtocol: TransportProtocol) =
            transportProtocol(JsonField.of(transportProtocol))

        /**
         * Sets [Builder.transportProtocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transportProtocol] with a well-typed [TransportProtocol]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transportProtocol(transportProtocol: JsonField<TransportProtocol>) = apply {
            this.transportProtocol = transportProtocol
        }

        /** The name for the TXT record associated with the FQDN connection. */
        fun txtName(txtName: String) = txtName(JsonField.of(txtName))

        /**
         * Sets [Builder.txtName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txtName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun txtName(txtName: JsonField<String>) = apply { this.txtName = txtName }

        /** The time to live for the TXT record associated with the FQDN connection. */
        fun txtTtl(txtTtl: Long) = txtTtl(JsonField.of(txtTtl))

        /**
         * Sets [Builder.txtTtl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txtTtl] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun txtTtl(txtTtl: JsonField<Long>) = apply { this.txtTtl = txtTtl }

        /** The value for the TXT record associated with the FQDN connection. */
        fun txtValue(txtValue: String) = txtValue(JsonField.of(txtValue))

        /**
         * Sets [Builder.txtValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txtValue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun txtValue(txtValue: JsonField<String>) = apply { this.txtValue = txtValue }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** The username for the FQDN connection. */
        fun userName(userName: String) = userName(JsonField.of(userName))

        /**
         * Sets [Builder.userName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userName(userName: JsonField<String>) = apply { this.userName = userName }

        /** Determines which webhook format will be used, Telnyx API v1 or v2. */
        fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
            webhookApiVersion(JsonField.of(webhookApiVersion))

        /**
         * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookApiVersion] with a well-typed [WebhookApiVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
            this.webhookApiVersion = webhookApiVersion
        }

        /**
         * The failover URL where webhooks related to this connection will be sent if sending to the
         * primary URL fails. Must include a scheme, such as 'https'.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: String?) =
            webhookEventFailoverUrl(JsonField.ofNullable(webhookEventFailoverUrl))

        /**
         * Alias for calling [Builder.webhookEventFailoverUrl] with
         * `webhookEventFailoverUrl.orElse(null)`.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: Optional<String>) =
            webhookEventFailoverUrl(webhookEventFailoverUrl.getOrNull())

        /**
         * Sets [Builder.webhookEventFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventFailoverUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
            this.webhookEventFailoverUrl = webhookEventFailoverUrl
        }

        /**
         * The URL where webhooks related to this connection will be sent. Must include a scheme,
         * such as 'https'.
         */
        fun webhookEventUrl(webhookEventUrl: String) =
            webhookEventUrl(JsonField.of(webhookEventUrl))

        /**
         * Sets [Builder.webhookEventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEventUrl(webhookEventUrl: JsonField<String>) = apply {
            this.webhookEventUrl = webhookEventUrl
        }

        /** Specifies how many seconds to wait before timing out a webhook. */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long?) =
            webhookTimeoutSecs(JsonField.ofNullable(webhookTimeoutSecs))

        /**
         * Alias for [Builder.webhookTimeoutSecs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long) =
            webhookTimeoutSecs(webhookTimeoutSecs as Long?)

        /**
         * Alias for calling [Builder.webhookTimeoutSecs] with `webhookTimeoutSecs.orElse(null)`.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Optional<Long>) =
            webhookTimeoutSecs(webhookTimeoutSecs.getOrNull())

        /**
         * Sets [Builder.webhookTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: JsonField<Long>) = apply {
            this.webhookTimeoutSecs = webhookTimeoutSecs
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [FqdnConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectionName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FqdnConnection =
            FqdnConnection(
                checkRequired("connectionName", connectionName),
                id,
                active,
                adjustDtmfTimestamp,
                anchorsiteOverride,
                androidPushCredentialId,
                callCostEnabled,
                callCostInWebhooks,
                createdAt,
                defaultOnHoldComfortNoiseEnabled,
                dtmfType,
                encodeContactHeaderEnabled,
                encryptedMedia,
                ignoreDtmfDuration,
                ignoreMarkBit,
                inbound,
                iosPushCredentialId,
                jitterBuffer,
                microsoftTeamsSbc,
                noiseSuppression,
                noiseSuppressionDetails,
                onnetT38PassthroughEnabled,
                outbound,
                password,
                recordType,
                rtcpSettings,
                rtpPassCodecsOnStreamChange,
                sendNormalizedTimestamps,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                thirdPartyControlEnabled,
                transportProtocol,
                txtName,
                txtTtl,
                txtValue,
                updatedAt,
                userName,
                webhookApiVersion,
                webhookEventFailoverUrl,
                webhookEventUrl,
                webhookTimeoutSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FqdnConnection = apply {
        if (validated) {
            return@apply
        }

        connectionName()
        id()
        active()
        adjustDtmfTimestamp()
        anchorsiteOverride().ifPresent { it.validate() }
        androidPushCredentialId()
        callCostEnabled()
        callCostInWebhooks()
        createdAt()
        defaultOnHoldComfortNoiseEnabled()
        dtmfType().ifPresent { it.validate() }
        encodeContactHeaderEnabled()
        encryptedMedia().ifPresent { it.validate() }
        ignoreDtmfDuration()
        ignoreMarkBit()
        inbound().ifPresent { it.validate() }
        iosPushCredentialId()
        jitterBuffer().ifPresent { it.validate() }
        microsoftTeamsSbc()
        noiseSuppression().ifPresent { it.validate() }
        noiseSuppressionDetails().ifPresent { it.validate() }
        onnetT38PassthroughEnabled()
        outbound().ifPresent { it.validate() }
        password()
        recordType()
        rtcpSettings().ifPresent { it.validate() }
        rtpPassCodecsOnStreamChange()
        sendNormalizedTimestamps()
        tags()
        thirdPartyControlEnabled()
        transportProtocol().ifPresent { it.validate() }
        txtName()
        txtTtl()
        txtValue()
        updatedAt()
        userName()
        webhookApiVersion().ifPresent { it.validate() }
        webhookEventFailoverUrl()
        webhookEventUrl()
        webhookTimeoutSecs()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (connectionName.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (active.asKnown().isPresent) 1 else 0) +
            (if (adjustDtmfTimestamp.asKnown().isPresent) 1 else 0) +
            (anchorsiteOverride.asKnown().getOrNull()?.validity() ?: 0) +
            (if (androidPushCredentialId.asKnown().isPresent) 1 else 0) +
            (if (callCostEnabled.asKnown().isPresent) 1 else 0) +
            (if (callCostInWebhooks.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (defaultOnHoldComfortNoiseEnabled.asKnown().isPresent) 1 else 0) +
            (dtmfType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (encodeContactHeaderEnabled.asKnown().isPresent) 1 else 0) +
            (encryptedMedia.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ignoreDtmfDuration.asKnown().isPresent) 1 else 0) +
            (if (ignoreMarkBit.asKnown().isPresent) 1 else 0) +
            (inbound.asKnown().getOrNull()?.validity() ?: 0) +
            (if (iosPushCredentialId.asKnown().isPresent) 1 else 0) +
            (jitterBuffer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (microsoftTeamsSbc.asKnown().isPresent) 1 else 0) +
            (noiseSuppression.asKnown().getOrNull()?.validity() ?: 0) +
            (noiseSuppressionDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (onnetT38PassthroughEnabled.asKnown().isPresent) 1 else 0) +
            (outbound.asKnown().getOrNull()?.validity() ?: 0) +
            (if (password.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (rtcpSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (rtpPassCodecsOnStreamChange.asKnown().isPresent) 1 else 0) +
            (if (sendNormalizedTimestamps.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (thirdPartyControlEnabled.asKnown().isPresent) 1 else 0) +
            (transportProtocol.asKnown().getOrNull()?.validity() ?: 0) +
            (if (txtName.asKnown().isPresent) 1 else 0) +
            (if (txtTtl.asKnown().isPresent) 1 else 0) +
            (if (txtValue.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userName.asKnown().isPresent) 1 else 0) +
            (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

    /**
     * Controls when noise suppression is applied to calls. When set to 'inbound', noise suppression
     * is applied to incoming audio. When set to 'outbound', it's applied to outgoing audio. When
     * set to 'both', it's applied in both directions. When set to 'disabled', noise suppression is
     * turned off.
     */
    class NoiseSuppression @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmField val BOTH = of("both")

            @JvmField val DISABLED = of("disabled")

            @JvmStatic fun of(value: String) = NoiseSuppression(JsonField.of(value))
        }

        /** An enum containing [NoiseSuppression]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
            BOTH,
            DISABLED,
        }

        /**
         * An enum containing [NoiseSuppression]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NoiseSuppression] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            BOTH,
            DISABLED,
            /**
             * An enum member indicating that [NoiseSuppression] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
                BOTH -> Value.BOTH
                DISABLED -> Value.DISABLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                BOTH -> Known.BOTH
                DISABLED -> Known.DISABLED
                else -> throw TelnyxInvalidDataException("Unknown NoiseSuppression: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): NoiseSuppression = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NoiseSuppression && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FqdnConnection &&
            connectionName == other.connectionName &&
            id == other.id &&
            active == other.active &&
            adjustDtmfTimestamp == other.adjustDtmfTimestamp &&
            anchorsiteOverride == other.anchorsiteOverride &&
            androidPushCredentialId == other.androidPushCredentialId &&
            callCostEnabled == other.callCostEnabled &&
            callCostInWebhooks == other.callCostInWebhooks &&
            createdAt == other.createdAt &&
            defaultOnHoldComfortNoiseEnabled == other.defaultOnHoldComfortNoiseEnabled &&
            dtmfType == other.dtmfType &&
            encodeContactHeaderEnabled == other.encodeContactHeaderEnabled &&
            encryptedMedia == other.encryptedMedia &&
            ignoreDtmfDuration == other.ignoreDtmfDuration &&
            ignoreMarkBit == other.ignoreMarkBit &&
            inbound == other.inbound &&
            iosPushCredentialId == other.iosPushCredentialId &&
            jitterBuffer == other.jitterBuffer &&
            microsoftTeamsSbc == other.microsoftTeamsSbc &&
            noiseSuppression == other.noiseSuppression &&
            noiseSuppressionDetails == other.noiseSuppressionDetails &&
            onnetT38PassthroughEnabled == other.onnetT38PassthroughEnabled &&
            outbound == other.outbound &&
            password == other.password &&
            recordType == other.recordType &&
            rtcpSettings == other.rtcpSettings &&
            rtpPassCodecsOnStreamChange == other.rtpPassCodecsOnStreamChange &&
            sendNormalizedTimestamps == other.sendNormalizedTimestamps &&
            tags == other.tags &&
            thirdPartyControlEnabled == other.thirdPartyControlEnabled &&
            transportProtocol == other.transportProtocol &&
            txtName == other.txtName &&
            txtTtl == other.txtTtl &&
            txtValue == other.txtValue &&
            updatedAt == other.updatedAt &&
            userName == other.userName &&
            webhookApiVersion == other.webhookApiVersion &&
            webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
            webhookEventUrl == other.webhookEventUrl &&
            webhookTimeoutSecs == other.webhookTimeoutSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            connectionName,
            id,
            active,
            adjustDtmfTimestamp,
            anchorsiteOverride,
            androidPushCredentialId,
            callCostEnabled,
            callCostInWebhooks,
            createdAt,
            defaultOnHoldComfortNoiseEnabled,
            dtmfType,
            encodeContactHeaderEnabled,
            encryptedMedia,
            ignoreDtmfDuration,
            ignoreMarkBit,
            inbound,
            iosPushCredentialId,
            jitterBuffer,
            microsoftTeamsSbc,
            noiseSuppression,
            noiseSuppressionDetails,
            onnetT38PassthroughEnabled,
            outbound,
            password,
            recordType,
            rtcpSettings,
            rtpPassCodecsOnStreamChange,
            sendNormalizedTimestamps,
            tags,
            thirdPartyControlEnabled,
            transportProtocol,
            txtName,
            txtTtl,
            txtValue,
            updatedAt,
            userName,
            webhookApiVersion,
            webhookEventFailoverUrl,
            webhookEventUrl,
            webhookTimeoutSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FqdnConnection{connectionName=$connectionName, id=$id, active=$active, adjustDtmfTimestamp=$adjustDtmfTimestamp, anchorsiteOverride=$anchorsiteOverride, androidPushCredentialId=$androidPushCredentialId, callCostEnabled=$callCostEnabled, callCostInWebhooks=$callCostInWebhooks, createdAt=$createdAt, defaultOnHoldComfortNoiseEnabled=$defaultOnHoldComfortNoiseEnabled, dtmfType=$dtmfType, encodeContactHeaderEnabled=$encodeContactHeaderEnabled, encryptedMedia=$encryptedMedia, ignoreDtmfDuration=$ignoreDtmfDuration, ignoreMarkBit=$ignoreMarkBit, inbound=$inbound, iosPushCredentialId=$iosPushCredentialId, jitterBuffer=$jitterBuffer, microsoftTeamsSbc=$microsoftTeamsSbc, noiseSuppression=$noiseSuppression, noiseSuppressionDetails=$noiseSuppressionDetails, onnetT38PassthroughEnabled=$onnetT38PassthroughEnabled, outbound=$outbound, password=$password, recordType=$recordType, rtcpSettings=$rtcpSettings, rtpPassCodecsOnStreamChange=$rtpPassCodecsOnStreamChange, sendNormalizedTimestamps=$sendNormalizedTimestamps, tags=$tags, thirdPartyControlEnabled=$thirdPartyControlEnabled, transportProtocol=$transportProtocol, txtName=$txtName, txtTtl=$txtTtl, txtValue=$txtValue, updatedAt=$updatedAt, userName=$userName, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
}
