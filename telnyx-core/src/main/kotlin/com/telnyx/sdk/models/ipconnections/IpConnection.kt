// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

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

class IpConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
    private val androidPushCredentialId: JsonField<String>,
    private val callCostInWebhooks: JsonField<Boolean>,
    private val connectionName: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>,
    private val dtmfType: JsonField<DtmfType>,
    private val encodeContactHeaderEnabled: JsonField<Boolean>,
    private val encryptedMedia: JsonField<EncryptedMedia>,
    private val inbound: JsonField<InboundIp>,
    private val iosPushCredentialId: JsonField<String>,
    private val jitterBuffer: JsonField<ConnectionJitterBuffer>,
    private val noiseSuppression: JsonField<NoiseSuppression>,
    private val noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>,
    private val onnetT38PassthroughEnabled: JsonField<Boolean>,
    private val outbound: JsonField<OutboundIp>,
    private val recordType: JsonField<String>,
    private val rtcpSettings: JsonField<ConnectionRtcpSettings>,
    private val tags: JsonField<List<String>>,
    private val transportProtocol: JsonField<TransportProtocol>,
    private val updatedAt: JsonField<String>,
    private val webhookApiVersion: JsonField<WebhookApiVersion>,
    private val webhookEventFailoverUrl: JsonField<String>,
    private val webhookEventUrl: JsonField<String>,
    private val webhookTimeoutSecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("anchorsite_override")
        @ExcludeMissing
        anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of(),
        @JsonProperty("android_push_credential_id")
        @ExcludeMissing
        androidPushCredentialId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_cost_in_webhooks")
        @ExcludeMissing
        callCostInWebhooks: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("connection_name")
        @ExcludeMissing
        connectionName: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<InboundIp> = JsonMissing.of(),
        @JsonProperty("ios_push_credential_id")
        @ExcludeMissing
        iosPushCredentialId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jitter_buffer")
        @ExcludeMissing
        jitterBuffer: JsonField<ConnectionJitterBuffer> = JsonMissing.of(),
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
        outbound: JsonField<OutboundIp> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rtcp_settings")
        @ExcludeMissing
        rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transport_protocol")
        @ExcludeMissing
        transportProtocol: JsonField<TransportProtocol> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
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
        id,
        active,
        anchorsiteOverride,
        androidPushCredentialId,
        callCostInWebhooks,
        connectionName,
        createdAt,
        defaultOnHoldComfortNoiseEnabled,
        dtmfType,
        encodeContactHeaderEnabled,
        encryptedMedia,
        inbound,
        iosPushCredentialId,
        jitterBuffer,
        noiseSuppression,
        noiseSuppressionDetails,
        onnetT38PassthroughEnabled,
        outbound,
        recordType,
        rtcpSettings,
        tags,
        transportProtocol,
        updatedAt,
        webhookApiVersion,
        webhookEventFailoverUrl,
        webhookEventUrl,
        webhookTimeoutSecs,
        mutableMapOf(),
    )

    /**
     * Identifies the type of resource.
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
     * Specifies if call cost webhooks should be sent for this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callCostInWebhooks(): Optional<Boolean> =
        callCostInWebhooks.getOptional("call_cost_in_webhooks")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionName(): Optional<String> = connectionName.getOptional("connection_name")

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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<InboundIp> = inbound.getOptional("inbound")

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
     * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are
     * on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of
     * the call depending on each leg's settings.
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
    fun outbound(): Optional<OutboundIp> = outbound.getOptional("outbound")

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
     * Tags associated with the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

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
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

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
     * Returns the raw JSON value of [callCostInWebhooks].
     *
     * Unlike [callCostInWebhooks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_cost_in_webhooks")
    @ExcludeMissing
    fun _callCostInWebhooks(): JsonField<Boolean> = callCostInWebhooks

    /**
     * Returns the raw JSON value of [connectionName].
     *
     * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_name")
    @ExcludeMissing
    fun _connectionName(): JsonField<String> = connectionName

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
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<InboundIp> = inbound

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
    @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<OutboundIp> = outbound

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
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [IpConnection]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpConnection]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
        private var androidPushCredentialId: JsonField<String> = JsonMissing.of()
        private var callCostInWebhooks: JsonField<Boolean> = JsonMissing.of()
        private var connectionName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var defaultOnHoldComfortNoiseEnabled: JsonField<Boolean> = JsonMissing.of()
        private var dtmfType: JsonField<DtmfType> = JsonMissing.of()
        private var encodeContactHeaderEnabled: JsonField<Boolean> = JsonMissing.of()
        private var encryptedMedia: JsonField<EncryptedMedia> = JsonMissing.of()
        private var inbound: JsonField<InboundIp> = JsonMissing.of()
        private var iosPushCredentialId: JsonField<String> = JsonMissing.of()
        private var jitterBuffer: JsonField<ConnectionJitterBuffer> = JsonMissing.of()
        private var noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of()
        private var noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails> =
            JsonMissing.of()
        private var onnetT38PassthroughEnabled: JsonField<Boolean> = JsonMissing.of()
        private var outbound: JsonField<OutboundIp> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transportProtocol: JsonField<TransportProtocol> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
        private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookEventUrl: JsonField<String> = JsonMissing.of()
        private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ipConnection: IpConnection) = apply {
            id = ipConnection.id
            active = ipConnection.active
            anchorsiteOverride = ipConnection.anchorsiteOverride
            androidPushCredentialId = ipConnection.androidPushCredentialId
            callCostInWebhooks = ipConnection.callCostInWebhooks
            connectionName = ipConnection.connectionName
            createdAt = ipConnection.createdAt
            defaultOnHoldComfortNoiseEnabled = ipConnection.defaultOnHoldComfortNoiseEnabled
            dtmfType = ipConnection.dtmfType
            encodeContactHeaderEnabled = ipConnection.encodeContactHeaderEnabled
            encryptedMedia = ipConnection.encryptedMedia
            inbound = ipConnection.inbound
            iosPushCredentialId = ipConnection.iosPushCredentialId
            jitterBuffer = ipConnection.jitterBuffer
            noiseSuppression = ipConnection.noiseSuppression
            noiseSuppressionDetails = ipConnection.noiseSuppressionDetails
            onnetT38PassthroughEnabled = ipConnection.onnetT38PassthroughEnabled
            outbound = ipConnection.outbound
            recordType = ipConnection.recordType
            rtcpSettings = ipConnection.rtcpSettings
            tags = ipConnection.tags.map { it.toMutableList() }
            transportProtocol = ipConnection.transportProtocol
            updatedAt = ipConnection.updatedAt
            webhookApiVersion = ipConnection.webhookApiVersion
            webhookEventFailoverUrl = ipConnection.webhookEventFailoverUrl
            webhookEventUrl = ipConnection.webhookEventUrl
            webhookTimeoutSecs = ipConnection.webhookTimeoutSecs
            additionalProperties = ipConnection.additionalProperties.toMutableMap()
        }

        /** Identifies the type of resource. */
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

        fun inbound(inbound: InboundIp) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [InboundIp] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inbound(inbound: JsonField<InboundIp>) = apply { this.inbound = inbound }

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
         * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both
         * are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just
         * one leg of the call depending on each leg's settings.
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

        fun outbound(outbound: OutboundIp) = outbound(JsonField.of(outbound))

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed [OutboundIp] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outbound(outbound: JsonField<OutboundIp>) = apply { this.outbound = outbound }

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
         * Returns an immutable instance of [IpConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IpConnection =
            IpConnection(
                id,
                active,
                anchorsiteOverride,
                androidPushCredentialId,
                callCostInWebhooks,
                connectionName,
                createdAt,
                defaultOnHoldComfortNoiseEnabled,
                dtmfType,
                encodeContactHeaderEnabled,
                encryptedMedia,
                inbound,
                iosPushCredentialId,
                jitterBuffer,
                noiseSuppression,
                noiseSuppressionDetails,
                onnetT38PassthroughEnabled,
                outbound,
                recordType,
                rtcpSettings,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transportProtocol,
                updatedAt,
                webhookApiVersion,
                webhookEventFailoverUrl,
                webhookEventUrl,
                webhookTimeoutSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IpConnection = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        anchorsiteOverride().ifPresent { it.validate() }
        androidPushCredentialId()
        callCostInWebhooks()
        connectionName()
        createdAt()
        defaultOnHoldComfortNoiseEnabled()
        dtmfType().ifPresent { it.validate() }
        encodeContactHeaderEnabled()
        encryptedMedia().ifPresent { it.validate() }
        inbound().ifPresent { it.validate() }
        iosPushCredentialId()
        jitterBuffer().ifPresent { it.validate() }
        noiseSuppression().ifPresent { it.validate() }
        noiseSuppressionDetails().ifPresent { it.validate() }
        onnetT38PassthroughEnabled()
        outbound().ifPresent { it.validate() }
        recordType()
        rtcpSettings().ifPresent { it.validate() }
        tags()
        transportProtocol().ifPresent { it.validate() }
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (active.asKnown().isPresent) 1 else 0) +
            (anchorsiteOverride.asKnown().getOrNull()?.validity() ?: 0) +
            (if (androidPushCredentialId.asKnown().isPresent) 1 else 0) +
            (if (callCostInWebhooks.asKnown().isPresent) 1 else 0) +
            (if (connectionName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (defaultOnHoldComfortNoiseEnabled.asKnown().isPresent) 1 else 0) +
            (dtmfType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (encodeContactHeaderEnabled.asKnown().isPresent) 1 else 0) +
            (encryptedMedia.asKnown().getOrNull()?.validity() ?: 0) +
            (inbound.asKnown().getOrNull()?.validity() ?: 0) +
            (if (iosPushCredentialId.asKnown().isPresent) 1 else 0) +
            (jitterBuffer.asKnown().getOrNull()?.validity() ?: 0) +
            (noiseSuppression.asKnown().getOrNull()?.validity() ?: 0) +
            (noiseSuppressionDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (onnetT38PassthroughEnabled.asKnown().isPresent) 1 else 0) +
            (outbound.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (rtcpSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (transportProtocol.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
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

    /**
     * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN
     * authentication.
     */
    class TransportProtocol @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UDP = of("UDP")

            @JvmField val TCP = of("TCP")

            @JvmField val TLS = of("TLS")

            @JvmStatic fun of(value: String) = TransportProtocol(JsonField.of(value))
        }

        /** An enum containing [TransportProtocol]'s known values. */
        enum class Known {
            UDP,
            TCP,
            TLS,
        }

        /**
         * An enum containing [TransportProtocol]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransportProtocol] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UDP,
            TCP,
            TLS,
            /**
             * An enum member indicating that [TransportProtocol] was instantiated with an unknown
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
                UDP -> Value.UDP
                TCP -> Value.TCP
                TLS -> Value.TLS
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
                UDP -> Known.UDP
                TCP -> Known.TCP
                TLS -> Known.TLS
                else -> throw TelnyxInvalidDataException("Unknown TransportProtocol: $value")
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

        fun validate(): TransportProtocol = apply {
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

            return other is TransportProtocol && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Determines which webhook format will be used, Telnyx API v1 or v2. */
    class WebhookApiVersion @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val V1 = of("1")

            @JvmField val V2 = of("2")

            @JvmStatic fun of(value: String) = WebhookApiVersion(JsonField.of(value))
        }

        /** An enum containing [WebhookApiVersion]'s known values. */
        enum class Known {
            V1,
            V2,
        }

        /**
         * An enum containing [WebhookApiVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookApiVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V2,
            /**
             * An enum member indicating that [WebhookApiVersion] was instantiated with an unknown
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
                V1 -> Value.V1
                V2 -> Value.V2
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
                V1 -> Known.V1
                V2 -> Known.V2
                else -> throw TelnyxInvalidDataException("Unknown WebhookApiVersion: $value")
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

        fun validate(): WebhookApiVersion = apply {
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

            return other is WebhookApiVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpConnection &&
            id == other.id &&
            active == other.active &&
            anchorsiteOverride == other.anchorsiteOverride &&
            androidPushCredentialId == other.androidPushCredentialId &&
            callCostInWebhooks == other.callCostInWebhooks &&
            connectionName == other.connectionName &&
            createdAt == other.createdAt &&
            defaultOnHoldComfortNoiseEnabled == other.defaultOnHoldComfortNoiseEnabled &&
            dtmfType == other.dtmfType &&
            encodeContactHeaderEnabled == other.encodeContactHeaderEnabled &&
            encryptedMedia == other.encryptedMedia &&
            inbound == other.inbound &&
            iosPushCredentialId == other.iosPushCredentialId &&
            jitterBuffer == other.jitterBuffer &&
            noiseSuppression == other.noiseSuppression &&
            noiseSuppressionDetails == other.noiseSuppressionDetails &&
            onnetT38PassthroughEnabled == other.onnetT38PassthroughEnabled &&
            outbound == other.outbound &&
            recordType == other.recordType &&
            rtcpSettings == other.rtcpSettings &&
            tags == other.tags &&
            transportProtocol == other.transportProtocol &&
            updatedAt == other.updatedAt &&
            webhookApiVersion == other.webhookApiVersion &&
            webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
            webhookEventUrl == other.webhookEventUrl &&
            webhookTimeoutSecs == other.webhookTimeoutSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            anchorsiteOverride,
            androidPushCredentialId,
            callCostInWebhooks,
            connectionName,
            createdAt,
            defaultOnHoldComfortNoiseEnabled,
            dtmfType,
            encodeContactHeaderEnabled,
            encryptedMedia,
            inbound,
            iosPushCredentialId,
            jitterBuffer,
            noiseSuppression,
            noiseSuppressionDetails,
            onnetT38PassthroughEnabled,
            outbound,
            recordType,
            rtcpSettings,
            tags,
            transportProtocol,
            updatedAt,
            webhookApiVersion,
            webhookEventFailoverUrl,
            webhookEventUrl,
            webhookTimeoutSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IpConnection{id=$id, active=$active, anchorsiteOverride=$anchorsiteOverride, androidPushCredentialId=$androidPushCredentialId, callCostInWebhooks=$callCostInWebhooks, connectionName=$connectionName, createdAt=$createdAt, defaultOnHoldComfortNoiseEnabled=$defaultOnHoldComfortNoiseEnabled, dtmfType=$dtmfType, encodeContactHeaderEnabled=$encodeContactHeaderEnabled, encryptedMedia=$encryptedMedia, inbound=$inbound, iosPushCredentialId=$iosPushCredentialId, jitterBuffer=$jitterBuffer, noiseSuppression=$noiseSuppression, noiseSuppressionDetails=$noiseSuppressionDetails, onnetT38PassthroughEnabled=$onnetT38PassthroughEnabled, outbound=$outbound, recordType=$recordType, rtcpSettings=$rtcpSettings, tags=$tags, transportProtocol=$transportProtocol, updatedAt=$updatedAt, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
}
