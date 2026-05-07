// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
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

/**
 * Creates a UAC connection. A UAC (User Agent Client) Connection registers Telnyx to your PBX — the
 * opposite of a standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your PBX
 * doesn’t support outbound SIP registration or you need Telnyx to maintain the registration.
 */
class UacConnectionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A user-assigned name to help manage the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionName(): String = body.connectionName()

    /**
     * Defaults to true
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = body.active()

    /**
     * `Latency` directs Telnyx to route media through the site with the lowest round-trip time to
     * the user's connection. Telnyx calculates this time using ICMP ping messages. This can be
     * disabled by specifying a site to handle all media.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun anchorsiteOverride(): Optional<AnchorsiteOverride> = body.anchorsiteOverride()

    /**
     * The uuid of the push credential for Android
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun androidPushCredentialId(): Optional<String> = body.androidPushCredentialId()

    /**
     * Specifies if call cost webhooks should be sent for this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callCostInWebhooks(): Optional<Boolean> = body.callCostInWebhooks()

    /**
     * When enabled, Telnyx will generate comfort noise when you place the call on hold. If
     * disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultOnHoldComfortNoiseEnabled(): Optional<Boolean> =
        body.defaultOnHoldComfortNoiseEnabled()

    /**
     * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent
     * to Telnyx will be accepted in all formats.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtmfType(): Optional<DtmfType> = body.dtmfType()

    /**
     * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encodeContactHeaderEnabled(): Optional<Boolean> = body.encodeContactHeaderEnabled()

    /**
     * Enable use of SRTP for encryption. Cannot be set if the transport_portocol is TLS.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encryptedMedia(): Optional<EncryptedMedia> = body.encryptedMedia()

    /**
     * External SIP peer settings used by Telnyx when registering to your PBX and routing outbound
     * calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalUacSettings(): Optional<UacExternalSettings> = body.externalUacSettings()

    /**
     * Inbound settings that can be supplied when creating or updating a UAC connection. The SIP
     * subdomain fields returned in UAC connection responses are generated by Telnyx and are not
     * accepted as request parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<Inbound> = body.inbound()

    /**
     * Internal Telnyx-side settings for a UAC connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun internalUacSettings(): Optional<UacInternalSettings> = body.internalUacSettings()

    /**
     * The uuid of the push credential for Ios
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iosPushCredentialId(): Optional<String> = body.iosPushCredentialId()

    /**
     * Configuration options for Jitter Buffer. Enables Jitter Buffer for RTP streams of SIP
     * Trunking calls. The feature is off unless enabled. You may define min and max values in msec
     * for customized buffering behaviors. Larger values add latency but tolerate more jitter, while
     * smaller values reduce latency but are more sensitive to jitter and reordering.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitterBuffer(): Optional<ConnectionJitterBuffer> = body.jitterBuffer()

    /**
     * Controls when noise suppression is applied to calls. When set to 'inbound', noise suppression
     * is applied to incoming audio. When set to 'outbound', it's applied to outgoing audio. When
     * set to 'both', it's applied in both directions. When set to 'disabled', noise suppression is
     * turned off.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppression(): Optional<NoiseSuppression> = body.noiseSuppression()

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
        body.noiseSuppressionDetails()

    /**
     * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are
     * on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of
     * the call depending on each leg's settings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onnetT38PassthroughEnabled(): Optional<Boolean> = body.onnetT38PassthroughEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outbound(): Optional<UacOutbound> = body.outbound()

    /**
     * The password to be used as part of the credentials. Must be 8 to 128 characters long.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = body.password()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rtcpSettings(): Optional<ConnectionRtcpSettings> = body.rtcpSettings()

    /**
     * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for
     * all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will be
     * connected to your Connection. You can also choose to allow only calls that are originated on
     * any Connections under your account (internal).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipUriCallingPreference(): Optional<SipUriCallingPreference> =
        body.sipUriCallingPreference()

    /**
     * Tags associated with the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * The user name to be used as part of the credentials. Must be 4-32 characters long and
     * alphanumeric values only (no spaces or special characters).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userName(): Optional<String> = body.userName()

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2 or texml. Note - texml can
     * only be set when the outbound object parameter call_parking_enabled is included and set to
     * true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookApiVersion(): Optional<WebhookApiVersion> = body.webhookApiVersion()

    /**
     * The failover URL where webhooks related to this connection will be sent if sending to the
     * primary URL fails. Must include a scheme, such as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventFailoverUrl(): Optional<String> = body.webhookEventFailoverUrl()

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such
     * as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventUrl(): Optional<String> = body.webhookEventUrl()

    /**
     * Specifies how many seconds to wait before timing out a webhook.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookTimeoutSecs(): Optional<Long> = body.webhookTimeoutSecs()

    /**
     * Returns the raw JSON value of [connectionName].
     *
     * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionName(): JsonField<String> = body._connectionName()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [anchorsiteOverride].
     *
     * Unlike [anchorsiteOverride], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _anchorsiteOverride(): JsonField<AnchorsiteOverride> = body._anchorsiteOverride()

    /**
     * Returns the raw JSON value of [androidPushCredentialId].
     *
     * Unlike [androidPushCredentialId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _androidPushCredentialId(): JsonField<String> = body._androidPushCredentialId()

    /**
     * Returns the raw JSON value of [callCostInWebhooks].
     *
     * Unlike [callCostInWebhooks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _callCostInWebhooks(): JsonField<Boolean> = body._callCostInWebhooks()

    /**
     * Returns the raw JSON value of [defaultOnHoldComfortNoiseEnabled].
     *
     * Unlike [defaultOnHoldComfortNoiseEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _defaultOnHoldComfortNoiseEnabled(): JsonField<Boolean> =
        body._defaultOnHoldComfortNoiseEnabled()

    /**
     * Returns the raw JSON value of [dtmfType].
     *
     * Unlike [dtmfType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dtmfType(): JsonField<DtmfType> = body._dtmfType()

    /**
     * Returns the raw JSON value of [encodeContactHeaderEnabled].
     *
     * Unlike [encodeContactHeaderEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _encodeContactHeaderEnabled(): JsonField<Boolean> = body._encodeContactHeaderEnabled()

    /**
     * Returns the raw JSON value of [encryptedMedia].
     *
     * Unlike [encryptedMedia], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _encryptedMedia(): JsonField<EncryptedMedia> = body._encryptedMedia()

    /**
     * Returns the raw JSON value of [externalUacSettings].
     *
     * Unlike [externalUacSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalUacSettings(): JsonField<UacExternalSettings> = body._externalUacSettings()

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inbound(): JsonField<Inbound> = body._inbound()

    /**
     * Returns the raw JSON value of [internalUacSettings].
     *
     * Unlike [internalUacSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalUacSettings(): JsonField<UacInternalSettings> = body._internalUacSettings()

    /**
     * Returns the raw JSON value of [iosPushCredentialId].
     *
     * Unlike [iosPushCredentialId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _iosPushCredentialId(): JsonField<String> = body._iosPushCredentialId()

    /**
     * Returns the raw JSON value of [jitterBuffer].
     *
     * Unlike [jitterBuffer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jitterBuffer(): JsonField<ConnectionJitterBuffer> = body._jitterBuffer()

    /**
     * Returns the raw JSON value of [noiseSuppression].
     *
     * Unlike [noiseSuppression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _noiseSuppression(): JsonField<NoiseSuppression> = body._noiseSuppression()

    /**
     * Returns the raw JSON value of [noiseSuppressionDetails].
     *
     * Unlike [noiseSuppressionDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _noiseSuppressionDetails(): JsonField<ConnectionNoiseSuppressionDetails> =
        body._noiseSuppressionDetails()

    /**
     * Returns the raw JSON value of [onnetT38PassthroughEnabled].
     *
     * Unlike [onnetT38PassthroughEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _onnetT38PassthroughEnabled(): JsonField<Boolean> = body._onnetT38PassthroughEnabled()

    /**
     * Returns the raw JSON value of [outbound].
     *
     * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outbound(): JsonField<UacOutbound> = body._outbound()

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _password(): JsonField<String> = body._password()

    /**
     * Returns the raw JSON value of [rtcpSettings].
     *
     * Unlike [rtcpSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rtcpSettings(): JsonField<ConnectionRtcpSettings> = body._rtcpSettings()

    /**
     * Returns the raw JSON value of [sipUriCallingPreference].
     *
     * Unlike [sipUriCallingPreference], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _sipUriCallingPreference(): JsonField<SipUriCallingPreference> =
        body._sipUriCallingPreference()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [userName].
     *
     * Unlike [userName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userName(): JsonField<String> = body._userName()

    /**
     * Returns the raw JSON value of [webhookApiVersion].
     *
     * Unlike [webhookApiVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookApiVersion(): JsonField<WebhookApiVersion> = body._webhookApiVersion()

    /**
     * Returns the raw JSON value of [webhookEventFailoverUrl].
     *
     * Unlike [webhookEventFailoverUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _webhookEventFailoverUrl(): JsonField<String> = body._webhookEventFailoverUrl()

    /**
     * Returns the raw JSON value of [webhookEventUrl].
     *
     * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookEventUrl(): JsonField<String> = body._webhookEventUrl()

    /**
     * Returns the raw JSON value of [webhookTimeoutSecs].
     *
     * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookTimeoutSecs(): JsonField<Long> = body._webhookTimeoutSecs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UacConnectionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .connectionName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UacConnectionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uacConnectionCreateParams: UacConnectionCreateParams) = apply {
            body = uacConnectionCreateParams.body.toBuilder()
            additionalHeaders = uacConnectionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = uacConnectionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectionName]
         * - [active]
         * - [anchorsiteOverride]
         * - [androidPushCredentialId]
         * - [callCostInWebhooks]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A user-assigned name to help manage the connection. */
        fun connectionName(connectionName: String) = apply { body.connectionName(connectionName) }

        /**
         * Sets [Builder.connectionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionName(connectionName: JsonField<String>) = apply {
            body.connectionName(connectionName)
        }

        /** Defaults to true */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        /**
         * `Latency` directs Telnyx to route media through the site with the lowest round-trip time
         * to the user's connection. Telnyx calculates this time using ICMP ping messages. This can
         * be disabled by specifying a site to handle all media.
         */
        fun anchorsiteOverride(anchorsiteOverride: AnchorsiteOverride) = apply {
            body.anchorsiteOverride(anchorsiteOverride)
        }

        /**
         * Sets [Builder.anchorsiteOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.anchorsiteOverride] with a well-typed
         * [AnchorsiteOverride] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun anchorsiteOverride(anchorsiteOverride: JsonField<AnchorsiteOverride>) = apply {
            body.anchorsiteOverride(anchorsiteOverride)
        }

        /** The uuid of the push credential for Android */
        fun androidPushCredentialId(androidPushCredentialId: String?) = apply {
            body.androidPushCredentialId(androidPushCredentialId)
        }

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
            body.androidPushCredentialId(androidPushCredentialId)
        }

        /** Specifies if call cost webhooks should be sent for this connection. */
        fun callCostInWebhooks(callCostInWebhooks: Boolean) = apply {
            body.callCostInWebhooks(callCostInWebhooks)
        }

        /**
         * Sets [Builder.callCostInWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callCostInWebhooks] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callCostInWebhooks(callCostInWebhooks: JsonField<Boolean>) = apply {
            body.callCostInWebhooks(callCostInWebhooks)
        }

        /**
         * When enabled, Telnyx will generate comfort noise when you place the call on hold. If
         * disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
         */
        fun defaultOnHoldComfortNoiseEnabled(defaultOnHoldComfortNoiseEnabled: Boolean) = apply {
            body.defaultOnHoldComfortNoiseEnabled(defaultOnHoldComfortNoiseEnabled)
        }

        /**
         * Sets [Builder.defaultOnHoldComfortNoiseEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultOnHoldComfortNoiseEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultOnHoldComfortNoiseEnabled(defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>) =
            apply {
                body.defaultOnHoldComfortNoiseEnabled(defaultOnHoldComfortNoiseEnabled)
            }

        /**
         * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits
         * sent to Telnyx will be accepted in all formats.
         */
        fun dtmfType(dtmfType: DtmfType) = apply { body.dtmfType(dtmfType) }

        /**
         * Sets [Builder.dtmfType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtmfType] with a well-typed [DtmfType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dtmfType(dtmfType: JsonField<DtmfType>) = apply { body.dtmfType(dtmfType) }

        /**
         * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
         */
        fun encodeContactHeaderEnabled(encodeContactHeaderEnabled: Boolean) = apply {
            body.encodeContactHeaderEnabled(encodeContactHeaderEnabled)
        }

        /**
         * Sets [Builder.encodeContactHeaderEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encodeContactHeaderEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun encodeContactHeaderEnabled(encodeContactHeaderEnabled: JsonField<Boolean>) = apply {
            body.encodeContactHeaderEnabled(encodeContactHeaderEnabled)
        }

        /** Enable use of SRTP for encryption. Cannot be set if the transport_portocol is TLS. */
        fun encryptedMedia(encryptedMedia: EncryptedMedia?) = apply {
            body.encryptedMedia(encryptedMedia)
        }

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
            body.encryptedMedia(encryptedMedia)
        }

        /**
         * External SIP peer settings used by Telnyx when registering to your PBX and routing
         * outbound calls.
         */
        fun externalUacSettings(externalUacSettings: UacExternalSettings) = apply {
            body.externalUacSettings(externalUacSettings)
        }

        /**
         * Sets [Builder.externalUacSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalUacSettings] with a well-typed
         * [UacExternalSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun externalUacSettings(externalUacSettings: JsonField<UacExternalSettings>) = apply {
            body.externalUacSettings(externalUacSettings)
        }

        /**
         * Inbound settings that can be supplied when creating or updating a UAC connection. The SIP
         * subdomain fields returned in UAC connection responses are generated by Telnyx and are not
         * accepted as request parameters.
         */
        fun inbound(inbound: Inbound) = apply { body.inbound(inbound) }

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Inbound>) = apply { body.inbound(inbound) }

        /** Internal Telnyx-side settings for a UAC connection. */
        fun internalUacSettings(internalUacSettings: UacInternalSettings) = apply {
            body.internalUacSettings(internalUacSettings)
        }

        /**
         * Sets [Builder.internalUacSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalUacSettings] with a well-typed
         * [UacInternalSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun internalUacSettings(internalUacSettings: JsonField<UacInternalSettings>) = apply {
            body.internalUacSettings(internalUacSettings)
        }

        /** The uuid of the push credential for Ios */
        fun iosPushCredentialId(iosPushCredentialId: String?) = apply {
            body.iosPushCredentialId(iosPushCredentialId)
        }

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
            body.iosPushCredentialId(iosPushCredentialId)
        }

        /**
         * Configuration options for Jitter Buffer. Enables Jitter Buffer for RTP streams of SIP
         * Trunking calls. The feature is off unless enabled. You may define min and max values in
         * msec for customized buffering behaviors. Larger values add latency but tolerate more
         * jitter, while smaller values reduce latency but are more sensitive to jitter and
         * reordering.
         */
        fun jitterBuffer(jitterBuffer: ConnectionJitterBuffer) = apply {
            body.jitterBuffer(jitterBuffer)
        }

        /**
         * Sets [Builder.jitterBuffer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitterBuffer] with a well-typed [ConnectionJitterBuffer]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jitterBuffer(jitterBuffer: JsonField<ConnectionJitterBuffer>) = apply {
            body.jitterBuffer(jitterBuffer)
        }

        /**
         * Controls when noise suppression is applied to calls. When set to 'inbound', noise
         * suppression is applied to incoming audio. When set to 'outbound', it's applied to
         * outgoing audio. When set to 'both', it's applied in both directions. When set to
         * 'disabled', noise suppression is turned off.
         */
        fun noiseSuppression(noiseSuppression: NoiseSuppression) = apply {
            body.noiseSuppression(noiseSuppression)
        }

        /**
         * Sets [Builder.noiseSuppression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppression] with a well-typed [NoiseSuppression]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun noiseSuppression(noiseSuppression: JsonField<NoiseSuppression>) = apply {
            body.noiseSuppression(noiseSuppression)
        }

        /**
         * Configuration options for noise suppression. These settings are stored regardless of the
         * noise_suppression value, but only take effect when noise_suppression is not 'disabled'.
         * If you disable noise suppression and later re-enable it, the previously configured
         * settings will be used.
         */
        fun noiseSuppressionDetails(noiseSuppressionDetails: ConnectionNoiseSuppressionDetails) =
            apply {
                body.noiseSuppressionDetails(noiseSuppressionDetails)
            }

        /**
         * Sets [Builder.noiseSuppressionDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppressionDetails] with a well-typed
         * [ConnectionNoiseSuppressionDetails] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun noiseSuppressionDetails(
            noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>
        ) = apply { body.noiseSuppressionDetails(noiseSuppressionDetails) }

        /**
         * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both
         * are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just
         * one leg of the call depending on each leg's settings.
         */
        fun onnetT38PassthroughEnabled(onnetT38PassthroughEnabled: Boolean) = apply {
            body.onnetT38PassthroughEnabled(onnetT38PassthroughEnabled)
        }

        /**
         * Sets [Builder.onnetT38PassthroughEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onnetT38PassthroughEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onnetT38PassthroughEnabled(onnetT38PassthroughEnabled: JsonField<Boolean>) = apply {
            body.onnetT38PassthroughEnabled(onnetT38PassthroughEnabled)
        }

        fun outbound(outbound: UacOutbound) = apply { body.outbound(outbound) }

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed [UacOutbound] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outbound(outbound: JsonField<UacOutbound>) = apply { body.outbound(outbound) }

        /** The password to be used as part of the credentials. Must be 8 to 128 characters long. */
        fun password(password: String) = apply { body.password(password) }

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { body.password(password) }

        fun rtcpSettings(rtcpSettings: ConnectionRtcpSettings) = apply {
            body.rtcpSettings(rtcpSettings)
        }

        /**
         * Sets [Builder.rtcpSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtcpSettings] with a well-typed [ConnectionRtcpSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rtcpSettings(rtcpSettings: JsonField<ConnectionRtcpSettings>) = apply {
            body.rtcpSettings(rtcpSettings)
        }

        /**
         * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled
         * for all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will
         * be connected to your Connection. You can also choose to allow only calls that are
         * originated on any Connections under your account (internal).
         */
        fun sipUriCallingPreference(sipUriCallingPreference: SipUriCallingPreference) = apply {
            body.sipUriCallingPreference(sipUriCallingPreference)
        }

        /**
         * Sets [Builder.sipUriCallingPreference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipUriCallingPreference] with a well-typed
         * [SipUriCallingPreference] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun sipUriCallingPreference(sipUriCallingPreference: JsonField<SipUriCallingPreference>) =
            apply {
                body.sipUriCallingPreference(sipUriCallingPreference)
            }

        /** Tags associated with the connection. */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        /**
         * The user name to be used as part of the credentials. Must be 4-32 characters long and
         * alphanumeric values only (no spaces or special characters).
         */
        fun userName(userName: String) = apply { body.userName(userName) }

        /**
         * Sets [Builder.userName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userName(userName: JsonField<String>) = apply { body.userName(userName) }

        /**
         * Determines which webhook format will be used, Telnyx API v1, v2 or texml. Note - texml
         * can only be set when the outbound object parameter call_parking_enabled is included and
         * set to true.
         */
        fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) = apply {
            body.webhookApiVersion(webhookApiVersion)
        }

        /**
         * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookApiVersion] with a well-typed [WebhookApiVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
            body.webhookApiVersion(webhookApiVersion)
        }

        /**
         * The failover URL where webhooks related to this connection will be sent if sending to the
         * primary URL fails. Must include a scheme, such as 'https'.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: String?) = apply {
            body.webhookEventFailoverUrl(webhookEventFailoverUrl)
        }

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
            body.webhookEventFailoverUrl(webhookEventFailoverUrl)
        }

        /**
         * The URL where webhooks related to this connection will be sent. Must include a scheme,
         * such as 'https'.
         */
        fun webhookEventUrl(webhookEventUrl: String) = apply {
            body.webhookEventUrl(webhookEventUrl)
        }

        /**
         * Sets [Builder.webhookEventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEventUrl(webhookEventUrl: JsonField<String>) = apply {
            body.webhookEventUrl(webhookEventUrl)
        }

        /** Specifies how many seconds to wait before timing out a webhook. */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long?) = apply {
            body.webhookTimeoutSecs(webhookTimeoutSecs)
        }

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
            body.webhookTimeoutSecs(webhookTimeoutSecs)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UacConnectionCreateParams].
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
        fun build(): UacConnectionCreateParams =
            UacConnectionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A UAC (User Agent Client) Connection registers Telnyx to your PBX — the opposite of a
     * standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your PBX doesn’t support
     * outbound SIP registration or you need Telnyx to maintain the registration.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectionName: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
        private val androidPushCredentialId: JsonField<String>,
        private val callCostInWebhooks: JsonField<Boolean>,
        private val defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>,
        private val dtmfType: JsonField<DtmfType>,
        private val encodeContactHeaderEnabled: JsonField<Boolean>,
        private val encryptedMedia: JsonField<EncryptedMedia>,
        private val externalUacSettings: JsonField<UacExternalSettings>,
        private val inbound: JsonField<Inbound>,
        private val internalUacSettings: JsonField<UacInternalSettings>,
        private val iosPushCredentialId: JsonField<String>,
        private val jitterBuffer: JsonField<ConnectionJitterBuffer>,
        private val noiseSuppression: JsonField<NoiseSuppression>,
        private val noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>,
        private val onnetT38PassthroughEnabled: JsonField<Boolean>,
        private val outbound: JsonField<UacOutbound>,
        private val password: JsonField<String>,
        private val rtcpSettings: JsonField<ConnectionRtcpSettings>,
        private val sipUriCallingPreference: JsonField<SipUriCallingPreference>,
        private val tags: JsonField<List<String>>,
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
            @JsonProperty("default_on_hold_comfort_noise_enabled")
            @ExcludeMissing
            defaultOnHoldComfortNoiseEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("dtmf_type")
            @ExcludeMissing
            dtmfType: JsonField<DtmfType> = JsonMissing.of(),
            @JsonProperty("encode_contact_header_enabled")
            @ExcludeMissing
            encodeContactHeaderEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("encrypted_media")
            @ExcludeMissing
            encryptedMedia: JsonField<EncryptedMedia> = JsonMissing.of(),
            @JsonProperty("external_uac_settings")
            @ExcludeMissing
            externalUacSettings: JsonField<UacExternalSettings> = JsonMissing.of(),
            @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
            @JsonProperty("internal_uac_settings")
            @ExcludeMissing
            internalUacSettings: JsonField<UacInternalSettings> = JsonMissing.of(),
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
            noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails> =
                JsonMissing.of(),
            @JsonProperty("onnet_t38_passthrough_enabled")
            @ExcludeMissing
            onnetT38PassthroughEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("outbound")
            @ExcludeMissing
            outbound: JsonField<UacOutbound> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rtcp_settings")
            @ExcludeMissing
            rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of(),
            @JsonProperty("sip_uri_calling_preference")
            @ExcludeMissing
            sipUriCallingPreference: JsonField<SipUriCallingPreference> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("user_name")
            @ExcludeMissing
            userName: JsonField<String> = JsonMissing.of(),
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
            active,
            anchorsiteOverride,
            androidPushCredentialId,
            callCostInWebhooks,
            defaultOnHoldComfortNoiseEnabled,
            dtmfType,
            encodeContactHeaderEnabled,
            encryptedMedia,
            externalUacSettings,
            inbound,
            internalUacSettings,
            iosPushCredentialId,
            jitterBuffer,
            noiseSuppression,
            noiseSuppressionDetails,
            onnetT38PassthroughEnabled,
            outbound,
            password,
            rtcpSettings,
            sipUriCallingPreference,
            tags,
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
         * Defaults to true
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Optional<Boolean> = active.getOptional("active")

        /**
         * `Latency` directs Telnyx to route media through the site with the lowest round-trip time
         * to the user's connection. Telnyx calculates this time using ICMP ping messages. This can
         * be disabled by specifying a site to handle all media.
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
         * When enabled, Telnyx will generate comfort noise when you place the call on hold. If
         * disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultOnHoldComfortNoiseEnabled(): Optional<Boolean> =
            defaultOnHoldComfortNoiseEnabled.getOptional("default_on_hold_comfort_noise_enabled")

        /**
         * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits
         * sent to Telnyx will be accepted in all formats.
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
        fun encryptedMedia(): Optional<EncryptedMedia> =
            encryptedMedia.getOptional("encrypted_media")

        /**
         * External SIP peer settings used by Telnyx when registering to your PBX and routing
         * outbound calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalUacSettings(): Optional<UacExternalSettings> =
            externalUacSettings.getOptional("external_uac_settings")

        /**
         * Inbound settings that can be supplied when creating or updating a UAC connection. The SIP
         * subdomain fields returned in UAC connection responses are generated by Telnyx and are not
         * accepted as request parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inbound(): Optional<Inbound> = inbound.getOptional("inbound")

        /**
         * Internal Telnyx-side settings for a UAC connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun internalUacSettings(): Optional<UacInternalSettings> =
            internalUacSettings.getOptional("internal_uac_settings")

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
         * Trunking calls. The feature is off unless enabled. You may define min and max values in
         * msec for customized buffering behaviors. Larger values add latency but tolerate more
         * jitter, while smaller values reduce latency but are more sensitive to jitter and
         * reordering.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun jitterBuffer(): Optional<ConnectionJitterBuffer> =
            jitterBuffer.getOptional("jitter_buffer")

        /**
         * Controls when noise suppression is applied to calls. When set to 'inbound', noise
         * suppression is applied to incoming audio. When set to 'outbound', it's applied to
         * outgoing audio. When set to 'both', it's applied in both directions. When set to
         * 'disabled', noise suppression is turned off.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun noiseSuppression(): Optional<NoiseSuppression> =
            noiseSuppression.getOptional("noise_suppression")

        /**
         * Configuration options for noise suppression. These settings are stored regardless of the
         * noise_suppression value, but only take effect when noise_suppression is not 'disabled'.
         * If you disable noise suppression and later re-enable it, the previously configured
         * settings will be used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun noiseSuppressionDetails(): Optional<ConnectionNoiseSuppressionDetails> =
            noiseSuppressionDetails.getOptional("noise_suppression_details")

        /**
         * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both
         * are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just
         * one leg of the call depending on each leg's settings.
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
        fun outbound(): Optional<UacOutbound> = outbound.getOptional("outbound")

        /**
         * The password to be used as part of the credentials. Must be 8 to 128 characters long.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rtcpSettings(): Optional<ConnectionRtcpSettings> =
            rtcpSettings.getOptional("rtcp_settings")

        /**
         * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled
         * for all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will
         * be connected to your Connection. You can also choose to allow only calls that are
         * originated on any Connections under your account (internal).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipUriCallingPreference(): Optional<SipUriCallingPreference> =
            sipUriCallingPreference.getOptional("sip_uri_calling_preference")

        /**
         * Tags associated with the connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * The user name to be used as part of the credentials. Must be 4-32 characters long and
         * alphanumeric values only (no spaces or special characters).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userName(): Optional<String> = userName.getOptional("user_name")

        /**
         * Determines which webhook format will be used, Telnyx API v1, v2 or texml. Note - texml
         * can only be set when the outbound object parameter call_parking_enabled is included and
         * set to true.
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
         * The URL where webhooks related to this connection will be sent. Must include a scheme,
         * such as 'https'.
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
         * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_name")
        @ExcludeMissing
        fun _connectionName(): JsonField<String> = connectionName

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [anchorsiteOverride].
         *
         * Unlike [anchorsiteOverride], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [callCostInWebhooks], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("call_cost_in_webhooks")
        @ExcludeMissing
        fun _callCostInWebhooks(): JsonField<Boolean> = callCostInWebhooks

        /**
         * Returns the raw JSON value of [defaultOnHoldComfortNoiseEnabled].
         *
         * Unlike [defaultOnHoldComfortNoiseEnabled], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("default_on_hold_comfort_noise_enabled")
        @ExcludeMissing
        fun _defaultOnHoldComfortNoiseEnabled(): JsonField<Boolean> =
            defaultOnHoldComfortNoiseEnabled

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
         * Unlike [encryptedMedia], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("encrypted_media")
        @ExcludeMissing
        fun _encryptedMedia(): JsonField<EncryptedMedia> = encryptedMedia

        /**
         * Returns the raw JSON value of [externalUacSettings].
         *
         * Unlike [externalUacSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_uac_settings")
        @ExcludeMissing
        fun _externalUacSettings(): JsonField<UacExternalSettings> = externalUacSettings

        /**
         * Returns the raw JSON value of [inbound].
         *
         * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Inbound> = inbound

        /**
         * Returns the raw JSON value of [internalUacSettings].
         *
         * Unlike [internalUacSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("internal_uac_settings")
        @ExcludeMissing
        fun _internalUacSettings(): JsonField<UacInternalSettings> = internalUacSettings

        /**
         * Returns the raw JSON value of [iosPushCredentialId].
         *
         * Unlike [iosPushCredentialId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ios_push_credential_id")
        @ExcludeMissing
        fun _iosPushCredentialId(): JsonField<String> = iosPushCredentialId

        /**
         * Returns the raw JSON value of [jitterBuffer].
         *
         * Unlike [jitterBuffer], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<UacOutbound> = outbound

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [rtcpSettings].
         *
         * Unlike [rtcpSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rtcp_settings")
        @ExcludeMissing
        fun _rtcpSettings(): JsonField<ConnectionRtcpSettings> = rtcpSettings

        /**
         * Returns the raw JSON value of [sipUriCallingPreference].
         *
         * Unlike [sipUriCallingPreference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sip_uri_calling_preference")
        @ExcludeMissing
        fun _sipUriCallingPreference(): JsonField<SipUriCallingPreference> = sipUriCallingPreference

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
         * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_event_url")
        @ExcludeMissing
        fun _webhookEventUrl(): JsonField<String> = webhookEventUrl

        /**
         * Returns the raw JSON value of [webhookTimeoutSecs].
         *
         * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .connectionName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var connectionName: JsonField<String>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
            private var androidPushCredentialId: JsonField<String> = JsonMissing.of()
            private var callCostInWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var defaultOnHoldComfortNoiseEnabled: JsonField<Boolean> = JsonMissing.of()
            private var dtmfType: JsonField<DtmfType> = JsonMissing.of()
            private var encodeContactHeaderEnabled: JsonField<Boolean> = JsonMissing.of()
            private var encryptedMedia: JsonField<EncryptedMedia> = JsonMissing.of()
            private var externalUacSettings: JsonField<UacExternalSettings> = JsonMissing.of()
            private var inbound: JsonField<Inbound> = JsonMissing.of()
            private var internalUacSettings: JsonField<UacInternalSettings> = JsonMissing.of()
            private var iosPushCredentialId: JsonField<String> = JsonMissing.of()
            private var jitterBuffer: JsonField<ConnectionJitterBuffer> = JsonMissing.of()
            private var noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of()
            private var noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails> =
                JsonMissing.of()
            private var onnetT38PassthroughEnabled: JsonField<Boolean> = JsonMissing.of()
            private var outbound: JsonField<UacOutbound> = JsonMissing.of()
            private var password: JsonField<String> = JsonMissing.of()
            private var rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of()
            private var sipUriCallingPreference: JsonField<SipUriCallingPreference> =
                JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var userName: JsonField<String> = JsonMissing.of()
            private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
            private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookEventUrl: JsonField<String> = JsonMissing.of()
            private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                connectionName = body.connectionName
                active = body.active
                anchorsiteOverride = body.anchorsiteOverride
                androidPushCredentialId = body.androidPushCredentialId
                callCostInWebhooks = body.callCostInWebhooks
                defaultOnHoldComfortNoiseEnabled = body.defaultOnHoldComfortNoiseEnabled
                dtmfType = body.dtmfType
                encodeContactHeaderEnabled = body.encodeContactHeaderEnabled
                encryptedMedia = body.encryptedMedia
                externalUacSettings = body.externalUacSettings
                inbound = body.inbound
                internalUacSettings = body.internalUacSettings
                iosPushCredentialId = body.iosPushCredentialId
                jitterBuffer = body.jitterBuffer
                noiseSuppression = body.noiseSuppression
                noiseSuppressionDetails = body.noiseSuppressionDetails
                onnetT38PassthroughEnabled = body.onnetT38PassthroughEnabled
                outbound = body.outbound
                password = body.password
                rtcpSettings = body.rtcpSettings
                sipUriCallingPreference = body.sipUriCallingPreference
                tags = body.tags.map { it.toMutableList() }
                userName = body.userName
                webhookApiVersion = body.webhookApiVersion
                webhookEventFailoverUrl = body.webhookEventFailoverUrl
                webhookEventUrl = body.webhookEventUrl
                webhookTimeoutSecs = body.webhookTimeoutSecs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A user-assigned name to help manage the connection. */
            fun connectionName(connectionName: String) =
                connectionName(JsonField.of(connectionName))

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

            /** Defaults to true */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /**
             * `Latency` directs Telnyx to route media through the site with the lowest round-trip
             * time to the user's connection. Telnyx calculates this time using ICMP ping messages.
             * This can be disabled by specifying a site to handle all media.
             */
            fun anchorsiteOverride(anchorsiteOverride: AnchorsiteOverride) =
                anchorsiteOverride(JsonField.of(anchorsiteOverride))

            /**
             * Sets [Builder.anchorsiteOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.anchorsiteOverride] with a well-typed
             * [AnchorsiteOverride] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.callCostInWebhooks] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callCostInWebhooks(callCostInWebhooks: JsonField<Boolean>) = apply {
                this.callCostInWebhooks = callCostInWebhooks
            }

            /**
             * When enabled, Telnyx will generate comfort noise when you place the call on hold. If
             * disabled, you will need to generate comfort noise or on hold music to avoid RTP
             * timeout.
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
            fun defaultOnHoldComfortNoiseEnabled(
                defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>
            ) = apply { this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled }

            /**
             * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF
             * digits sent to Telnyx will be accepted in all formats.
             */
            fun dtmfType(dtmfType: DtmfType) = dtmfType(JsonField.of(dtmfType))

            /**
             * Sets [Builder.dtmfType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtmfType] with a well-typed [DtmfType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtmfType(dtmfType: JsonField<DtmfType>) = apply { this.dtmfType = dtmfType }

            /**
             * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG
             * scenarios.
             */
            fun encodeContactHeaderEnabled(encodeContactHeaderEnabled: Boolean) =
                encodeContactHeaderEnabled(JsonField.of(encodeContactHeaderEnabled))

            /**
             * Sets [Builder.encodeContactHeaderEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encodeContactHeaderEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun encodeContactHeaderEnabled(encodeContactHeaderEnabled: JsonField<Boolean>) = apply {
                this.encodeContactHeaderEnabled = encodeContactHeaderEnabled
            }

            /**
             * Enable use of SRTP for encryption. Cannot be set if the transport_portocol is TLS.
             */
            fun encryptedMedia(encryptedMedia: EncryptedMedia?) =
                encryptedMedia(JsonField.ofNullable(encryptedMedia))

            /** Alias for calling [Builder.encryptedMedia] with `encryptedMedia.orElse(null)`. */
            fun encryptedMedia(encryptedMedia: Optional<EncryptedMedia>) =
                encryptedMedia(encryptedMedia.getOrNull())

            /**
             * Sets [Builder.encryptedMedia] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encryptedMedia] with a well-typed [EncryptedMedia]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun encryptedMedia(encryptedMedia: JsonField<EncryptedMedia>) = apply {
                this.encryptedMedia = encryptedMedia
            }

            /**
             * External SIP peer settings used by Telnyx when registering to your PBX and routing
             * outbound calls.
             */
            fun externalUacSettings(externalUacSettings: UacExternalSettings) =
                externalUacSettings(JsonField.of(externalUacSettings))

            /**
             * Sets [Builder.externalUacSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalUacSettings] with a well-typed
             * [UacExternalSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun externalUacSettings(externalUacSettings: JsonField<UacExternalSettings>) = apply {
                this.externalUacSettings = externalUacSettings
            }

            /**
             * Inbound settings that can be supplied when creating or updating a UAC connection. The
             * SIP subdomain fields returned in UAC connection responses are generated by Telnyx and
             * are not accepted as request parameters.
             */
            fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

            /**
             * Sets [Builder.inbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

            /** Internal Telnyx-side settings for a UAC connection. */
            fun internalUacSettings(internalUacSettings: UacInternalSettings) =
                internalUacSettings(JsonField.of(internalUacSettings))

            /**
             * Sets [Builder.internalUacSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalUacSettings] with a well-typed
             * [UacInternalSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun internalUacSettings(internalUacSettings: JsonField<UacInternalSettings>) = apply {
                this.internalUacSettings = internalUacSettings
            }

            /** The uuid of the push credential for Ios */
            fun iosPushCredentialId(iosPushCredentialId: String?) =
                iosPushCredentialId(JsonField.ofNullable(iosPushCredentialId))

            /**
             * Alias for calling [Builder.iosPushCredentialId] with
             * `iosPushCredentialId.orElse(null)`.
             */
            fun iosPushCredentialId(iosPushCredentialId: Optional<String>) =
                iosPushCredentialId(iosPushCredentialId.getOrNull())

            /**
             * Sets [Builder.iosPushCredentialId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iosPushCredentialId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun iosPushCredentialId(iosPushCredentialId: JsonField<String>) = apply {
                this.iosPushCredentialId = iosPushCredentialId
            }

            /**
             * Configuration options for Jitter Buffer. Enables Jitter Buffer for RTP streams of SIP
             * Trunking calls. The feature is off unless enabled. You may define min and max values
             * in msec for customized buffering behaviors. Larger values add latency but tolerate
             * more jitter, while smaller values reduce latency but are more sensitive to jitter and
             * reordering.
             */
            fun jitterBuffer(jitterBuffer: ConnectionJitterBuffer) =
                jitterBuffer(JsonField.of(jitterBuffer))

            /**
             * Sets [Builder.jitterBuffer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jitterBuffer] with a well-typed
             * [ConnectionJitterBuffer] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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
             * You should usually call [Builder.noiseSuppression] with a well-typed
             * [NoiseSuppression] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun noiseSuppression(noiseSuppression: JsonField<NoiseSuppression>) = apply {
                this.noiseSuppression = noiseSuppression
            }

            /**
             * Configuration options for noise suppression. These settings are stored regardless of
             * the noise_suppression value, but only take effect when noise_suppression is not
             * 'disabled'. If you disable noise suppression and later re-enable it, the previously
             * configured settings will be used.
             */
            fun noiseSuppressionDetails(
                noiseSuppressionDetails: ConnectionNoiseSuppressionDetails
            ) = noiseSuppressionDetails(JsonField.of(noiseSuppressionDetails))

            /**
             * Sets [Builder.noiseSuppressionDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noiseSuppressionDetails] with a well-typed
             * [ConnectionNoiseSuppressionDetails] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun noiseSuppressionDetails(
                noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>
            ) = apply { this.noiseSuppressionDetails = noiseSuppressionDetails }

            /**
             * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if
             * both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38
             * on just one leg of the call depending on each leg's settings.
             */
            fun onnetT38PassthroughEnabled(onnetT38PassthroughEnabled: Boolean) =
                onnetT38PassthroughEnabled(JsonField.of(onnetT38PassthroughEnabled))

            /**
             * Sets [Builder.onnetT38PassthroughEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onnetT38PassthroughEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onnetT38PassthroughEnabled(onnetT38PassthroughEnabled: JsonField<Boolean>) = apply {
                this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled
            }

            fun outbound(outbound: UacOutbound) = outbound(JsonField.of(outbound))

            /**
             * Sets [Builder.outbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outbound] with a well-typed [UacOutbound] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outbound(outbound: JsonField<UacOutbound>) = apply { this.outbound = outbound }

            /**
             * The password to be used as part of the credentials. Must be 8 to 128 characters long.
             */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            fun rtcpSettings(rtcpSettings: ConnectionRtcpSettings) =
                rtcpSettings(JsonField.of(rtcpSettings))

            /**
             * Sets [Builder.rtcpSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rtcpSettings] with a well-typed
             * [ConnectionRtcpSettings] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun rtcpSettings(rtcpSettings: JsonField<ConnectionRtcpSettings>) = apply {
                this.rtcpSettings = rtcpSettings
            }

            /**
             * This feature enables inbound SIP URI calls to your Credential Auth Connection. If
             * enabled for all (unrestricted) then anyone who calls the SIP URI
             * <your-username>@telnyx.com will be connected to your Connection. You can also choose
             * to allow only calls that are originated on any Connections under your account
             * (internal).
             */
            fun sipUriCallingPreference(sipUriCallingPreference: SipUriCallingPreference) =
                sipUriCallingPreference(JsonField.of(sipUriCallingPreference))

            /**
             * Sets [Builder.sipUriCallingPreference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipUriCallingPreference] with a well-typed
             * [SipUriCallingPreference] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun sipUriCallingPreference(
                sipUriCallingPreference: JsonField<SipUriCallingPreference>
            ) = apply { this.sipUriCallingPreference = sipUriCallingPreference }

            /** Tags associated with the connection. */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /**
             * The user name to be used as part of the credentials. Must be 4-32 characters long and
             * alphanumeric values only (no spaces or special characters).
             */
            fun userName(userName: String) = userName(JsonField.of(userName))

            /**
             * Sets [Builder.userName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userName(userName: JsonField<String>) = apply { this.userName = userName }

            /**
             * Determines which webhook format will be used, Telnyx API v1, v2 or texml. Note -
             * texml can only be set when the outbound object parameter call_parking_enabled is
             * included and set to true.
             */
            fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
                webhookApiVersion(JsonField.of(webhookApiVersion))

            /**
             * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookApiVersion] with a well-typed
             * [WebhookApiVersion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
                this.webhookApiVersion = webhookApiVersion
            }

            /**
             * The failover URL where webhooks related to this connection will be sent if sending to
             * the primary URL fails. Must include a scheme, such as 'https'.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
                this.webhookEventFailoverUrl = webhookEventFailoverUrl
            }

            /**
             * The URL where webhooks related to this connection will be sent. Must include a
             * scheme, such as 'https'.
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
             * Alias for calling [Builder.webhookTimeoutSecs] with
             * `webhookTimeoutSecs.orElse(null)`.
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("connectionName", connectionName),
                    active,
                    anchorsiteOverride,
                    androidPushCredentialId,
                    callCostInWebhooks,
                    defaultOnHoldComfortNoiseEnabled,
                    dtmfType,
                    encodeContactHeaderEnabled,
                    encryptedMedia,
                    externalUacSettings,
                    inbound,
                    internalUacSettings,
                    iosPushCredentialId,
                    jitterBuffer,
                    noiseSuppression,
                    noiseSuppressionDetails,
                    onnetT38PassthroughEnabled,
                    outbound,
                    password,
                    rtcpSettings,
                    sipUriCallingPreference,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    userName,
                    webhookApiVersion,
                    webhookEventFailoverUrl,
                    webhookEventUrl,
                    webhookTimeoutSecs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            connectionName()
            active()
            anchorsiteOverride().ifPresent { it.validate() }
            androidPushCredentialId()
            callCostInWebhooks()
            defaultOnHoldComfortNoiseEnabled()
            dtmfType().ifPresent { it.validate() }
            encodeContactHeaderEnabled()
            encryptedMedia().ifPresent { it.validate() }
            externalUacSettings().ifPresent { it.validate() }
            inbound().ifPresent { it.validate() }
            internalUacSettings().ifPresent { it.validate() }
            iosPushCredentialId()
            jitterBuffer().ifPresent { it.validate() }
            noiseSuppression().ifPresent { it.validate() }
            noiseSuppressionDetails().ifPresent { it.validate() }
            onnetT38PassthroughEnabled()
            outbound().ifPresent { it.validate() }
            password()
            rtcpSettings().ifPresent { it.validate() }
            sipUriCallingPreference().ifPresent { it.validate() }
            tags()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (connectionName.asKnown().isPresent) 1 else 0) +
                (if (active.asKnown().isPresent) 1 else 0) +
                (anchorsiteOverride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (androidPushCredentialId.asKnown().isPresent) 1 else 0) +
                (if (callCostInWebhooks.asKnown().isPresent) 1 else 0) +
                (if (defaultOnHoldComfortNoiseEnabled.asKnown().isPresent) 1 else 0) +
                (dtmfType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (encodeContactHeaderEnabled.asKnown().isPresent) 1 else 0) +
                (encryptedMedia.asKnown().getOrNull()?.validity() ?: 0) +
                (externalUacSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (inbound.asKnown().getOrNull()?.validity() ?: 0) +
                (internalUacSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (iosPushCredentialId.asKnown().isPresent) 1 else 0) +
                (jitterBuffer.asKnown().getOrNull()?.validity() ?: 0) +
                (noiseSuppression.asKnown().getOrNull()?.validity() ?: 0) +
                (noiseSuppressionDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (onnetT38PassthroughEnabled.asKnown().isPresent) 1 else 0) +
                (outbound.asKnown().getOrNull()?.validity() ?: 0) +
                (if (password.asKnown().isPresent) 1 else 0) +
                (rtcpSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (sipUriCallingPreference.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (userName.asKnown().isPresent) 1 else 0) +
                (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                connectionName == other.connectionName &&
                active == other.active &&
                anchorsiteOverride == other.anchorsiteOverride &&
                androidPushCredentialId == other.androidPushCredentialId &&
                callCostInWebhooks == other.callCostInWebhooks &&
                defaultOnHoldComfortNoiseEnabled == other.defaultOnHoldComfortNoiseEnabled &&
                dtmfType == other.dtmfType &&
                encodeContactHeaderEnabled == other.encodeContactHeaderEnabled &&
                encryptedMedia == other.encryptedMedia &&
                externalUacSettings == other.externalUacSettings &&
                inbound == other.inbound &&
                internalUacSettings == other.internalUacSettings &&
                iosPushCredentialId == other.iosPushCredentialId &&
                jitterBuffer == other.jitterBuffer &&
                noiseSuppression == other.noiseSuppression &&
                noiseSuppressionDetails == other.noiseSuppressionDetails &&
                onnetT38PassthroughEnabled == other.onnetT38PassthroughEnabled &&
                outbound == other.outbound &&
                password == other.password &&
                rtcpSettings == other.rtcpSettings &&
                sipUriCallingPreference == other.sipUriCallingPreference &&
                tags == other.tags &&
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
                active,
                anchorsiteOverride,
                androidPushCredentialId,
                callCostInWebhooks,
                defaultOnHoldComfortNoiseEnabled,
                dtmfType,
                encodeContactHeaderEnabled,
                encryptedMedia,
                externalUacSettings,
                inbound,
                internalUacSettings,
                iosPushCredentialId,
                jitterBuffer,
                noiseSuppression,
                noiseSuppressionDetails,
                onnetT38PassthroughEnabled,
                outbound,
                password,
                rtcpSettings,
                sipUriCallingPreference,
                tags,
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
            "Body{connectionName=$connectionName, active=$active, anchorsiteOverride=$anchorsiteOverride, androidPushCredentialId=$androidPushCredentialId, callCostInWebhooks=$callCostInWebhooks, defaultOnHoldComfortNoiseEnabled=$defaultOnHoldComfortNoiseEnabled, dtmfType=$dtmfType, encodeContactHeaderEnabled=$encodeContactHeaderEnabled, encryptedMedia=$encryptedMedia, externalUacSettings=$externalUacSettings, inbound=$inbound, internalUacSettings=$internalUacSettings, iosPushCredentialId=$iosPushCredentialId, jitterBuffer=$jitterBuffer, noiseSuppression=$noiseSuppression, noiseSuppressionDetails=$noiseSuppressionDetails, onnetT38PassthroughEnabled=$onnetT38PassthroughEnabled, outbound=$outbound, password=$password, rtcpSettings=$rtcpSettings, sipUriCallingPreference=$sipUriCallingPreference, tags=$tags, userName=$userName, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
    }

    /**
     * Inbound settings that can be supplied when creating or updating a UAC connection. The SIP
     * subdomain fields returned in UAC connection responses are generated by Telnyx and are not
     * accepted as request parameters.
     */
    class Inbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aniNumberFormat: JsonField<AniNumberFormat>,
        private val channelLimit: JsonField<Long>,
        private val codecs: JsonField<List<String>>,
        private val defaultRoutingMethod: JsonField<DefaultRoutingMethod>,
        private val dnisNumberFormat: JsonField<DnisNumberFormat>,
        private val generateRingbackTone: JsonField<Boolean>,
        private val isupHeadersEnabled: JsonField<Boolean>,
        private val prackEnabled: JsonField<Boolean>,
        private val shakenStirEnabled: JsonField<Boolean>,
        private val simultaneousRinging: JsonField<SimultaneousRinging>,
        private val sipCompactHeadersEnabled: JsonField<Boolean>,
        private val timeout1xxSecs: JsonField<Long>,
        private val timeout2xxSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ani_number_format")
            @ExcludeMissing
            aniNumberFormat: JsonField<AniNumberFormat> = JsonMissing.of(),
            @JsonProperty("channel_limit")
            @ExcludeMissing
            channelLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("codecs")
            @ExcludeMissing
            codecs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("default_routing_method")
            @ExcludeMissing
            defaultRoutingMethod: JsonField<DefaultRoutingMethod> = JsonMissing.of(),
            @JsonProperty("dnis_number_format")
            @ExcludeMissing
            dnisNumberFormat: JsonField<DnisNumberFormat> = JsonMissing.of(),
            @JsonProperty("generate_ringback_tone")
            @ExcludeMissing
            generateRingbackTone: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isup_headers_enabled")
            @ExcludeMissing
            isupHeadersEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("prack_enabled")
            @ExcludeMissing
            prackEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("shaken_stir_enabled")
            @ExcludeMissing
            shakenStirEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("simultaneous_ringing")
            @ExcludeMissing
            simultaneousRinging: JsonField<SimultaneousRinging> = JsonMissing.of(),
            @JsonProperty("sip_compact_headers_enabled")
            @ExcludeMissing
            sipCompactHeadersEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("timeout_1xx_secs")
            @ExcludeMissing
            timeout1xxSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("timeout_2xx_secs")
            @ExcludeMissing
            timeout2xxSecs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            aniNumberFormat,
            channelLimit,
            codecs,
            defaultRoutingMethod,
            dnisNumberFormat,
            generateRingbackTone,
            isupHeadersEnabled,
            prackEnabled,
            shakenStirEnabled,
            simultaneousRinging,
            sipCompactHeadersEnabled,
            timeout1xxSecs,
            timeout2xxSecs,
            mutableMapOf(),
        )

        /**
         * This setting allows you to set the format with which the caller's number (ANI) is sent
         * for inbound phone calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aniNumberFormat(): Optional<AniNumberFormat> =
            aniNumberFormat.getOptional("ani_number_format")

        /**
         * When set, this will limit the total number of inbound calls to phone numbers associated
         * with this connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

        /**
         * Defines the list of codecs that Telnyx will send for inbound calls to a specific number
         * on your portal account, in priority order. This only works when the Connection the number
         * is assigned to uses Media Handling mode: default. OPUS and H.264 codecs are available
         * only when using TCP or TLS transport for SIP.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codecs(): Optional<List<String>> = codecs.getOptional("codecs")

        /**
         * Default routing method to be used when a number is associated with the connection. Must
         * be one of the routing method types or left blank, other values are not allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultRoutingMethod(): Optional<DefaultRoutingMethod> =
            defaultRoutingMethod.getOptional("default_routing_method")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dnisNumberFormat(): Optional<DnisNumberFormat> =
            dnisNumberFormat.getOptional("dnis_number_format")

        /**
         * Generate ringback tone through 183 session progress message with early media.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun generateRingbackTone(): Optional<Boolean> =
            generateRingbackTone.getOptional("generate_ringback_tone")

        /**
         * When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only when
         * available and only when using TCP or TLS transport.)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isupHeadersEnabled(): Optional<Boolean> =
            isupHeadersEnabled.getOptional("isup_headers_enabled")

        /**
         * Enable PRACK messages as defined in RFC3262.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prackEnabled(): Optional<Boolean> = prackEnabled.getOptional("prack_enabled")

        /**
         * When enabled the SIP Connection will receive the Identity header with Shaken/Stir data in
         * the SIP INVITE message of inbound calls, even when using UDP transport.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shakenStirEnabled(): Optional<Boolean> =
            shakenStirEnabled.getOptional("shaken_stir_enabled")

        /**
         * When enabled, allows multiple devices to ring simultaneously on incoming calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simultaneousRinging(): Optional<SimultaneousRinging> =
            simultaneousRinging.getOptional("simultaneous_ringing")

        /**
         * Defaults to true.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipCompactHeadersEnabled(): Optional<Boolean> =
            sipCompactHeadersEnabled.getOptional("sip_compact_headers_enabled")

        /**
         * Time(sec) before aborting if connection is not made.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout1xxSecs(): Optional<Long> = timeout1xxSecs.getOptional("timeout_1xx_secs")

        /**
         * Time(sec) before aborting if call is unanswered (min: 1, max: 600).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout2xxSecs(): Optional<Long> = timeout2xxSecs.getOptional("timeout_2xx_secs")

        /**
         * Returns the raw JSON value of [aniNumberFormat].
         *
         * Unlike [aniNumberFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ani_number_format")
        @ExcludeMissing
        fun _aniNumberFormat(): JsonField<AniNumberFormat> = aniNumberFormat

        /**
         * Returns the raw JSON value of [channelLimit].
         *
         * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("channel_limit")
        @ExcludeMissing
        fun _channelLimit(): JsonField<Long> = channelLimit

        /**
         * Returns the raw JSON value of [codecs].
         *
         * Unlike [codecs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("codecs") @ExcludeMissing fun _codecs(): JsonField<List<String>> = codecs

        /**
         * Returns the raw JSON value of [defaultRoutingMethod].
         *
         * Unlike [defaultRoutingMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_routing_method")
        @ExcludeMissing
        fun _defaultRoutingMethod(): JsonField<DefaultRoutingMethod> = defaultRoutingMethod

        /**
         * Returns the raw JSON value of [dnisNumberFormat].
         *
         * Unlike [dnisNumberFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dnis_number_format")
        @ExcludeMissing
        fun _dnisNumberFormat(): JsonField<DnisNumberFormat> = dnisNumberFormat

        /**
         * Returns the raw JSON value of [generateRingbackTone].
         *
         * Unlike [generateRingbackTone], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("generate_ringback_tone")
        @ExcludeMissing
        fun _generateRingbackTone(): JsonField<Boolean> = generateRingbackTone

        /**
         * Returns the raw JSON value of [isupHeadersEnabled].
         *
         * Unlike [isupHeadersEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("isup_headers_enabled")
        @ExcludeMissing
        fun _isupHeadersEnabled(): JsonField<Boolean> = isupHeadersEnabled

        /**
         * Returns the raw JSON value of [prackEnabled].
         *
         * Unlike [prackEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prack_enabled")
        @ExcludeMissing
        fun _prackEnabled(): JsonField<Boolean> = prackEnabled

        /**
         * Returns the raw JSON value of [shakenStirEnabled].
         *
         * Unlike [shakenStirEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shaken_stir_enabled")
        @ExcludeMissing
        fun _shakenStirEnabled(): JsonField<Boolean> = shakenStirEnabled

        /**
         * Returns the raw JSON value of [simultaneousRinging].
         *
         * Unlike [simultaneousRinging], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("simultaneous_ringing")
        @ExcludeMissing
        fun _simultaneousRinging(): JsonField<SimultaneousRinging> = simultaneousRinging

        /**
         * Returns the raw JSON value of [sipCompactHeadersEnabled].
         *
         * Unlike [sipCompactHeadersEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sip_compact_headers_enabled")
        @ExcludeMissing
        fun _sipCompactHeadersEnabled(): JsonField<Boolean> = sipCompactHeadersEnabled

        /**
         * Returns the raw JSON value of [timeout1xxSecs].
         *
         * Unlike [timeout1xxSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeout_1xx_secs")
        @ExcludeMissing
        fun _timeout1xxSecs(): JsonField<Long> = timeout1xxSecs

        /**
         * Returns the raw JSON value of [timeout2xxSecs].
         *
         * Unlike [timeout2xxSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeout_2xx_secs")
        @ExcludeMissing
        fun _timeout2xxSecs(): JsonField<Long> = timeout2xxSecs

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

            /** Returns a mutable builder for constructing an instance of [Inbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inbound]. */
        class Builder internal constructor() {

            private var aniNumberFormat: JsonField<AniNumberFormat> = JsonMissing.of()
            private var channelLimit: JsonField<Long> = JsonMissing.of()
            private var codecs: JsonField<MutableList<String>>? = null
            private var defaultRoutingMethod: JsonField<DefaultRoutingMethod> = JsonMissing.of()
            private var dnisNumberFormat: JsonField<DnisNumberFormat> = JsonMissing.of()
            private var generateRingbackTone: JsonField<Boolean> = JsonMissing.of()
            private var isupHeadersEnabled: JsonField<Boolean> = JsonMissing.of()
            private var prackEnabled: JsonField<Boolean> = JsonMissing.of()
            private var shakenStirEnabled: JsonField<Boolean> = JsonMissing.of()
            private var simultaneousRinging: JsonField<SimultaneousRinging> = JsonMissing.of()
            private var sipCompactHeadersEnabled: JsonField<Boolean> = JsonMissing.of()
            private var timeout1xxSecs: JsonField<Long> = JsonMissing.of()
            private var timeout2xxSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inbound: Inbound) = apply {
                aniNumberFormat = inbound.aniNumberFormat
                channelLimit = inbound.channelLimit
                codecs = inbound.codecs.map { it.toMutableList() }
                defaultRoutingMethod = inbound.defaultRoutingMethod
                dnisNumberFormat = inbound.dnisNumberFormat
                generateRingbackTone = inbound.generateRingbackTone
                isupHeadersEnabled = inbound.isupHeadersEnabled
                prackEnabled = inbound.prackEnabled
                shakenStirEnabled = inbound.shakenStirEnabled
                simultaneousRinging = inbound.simultaneousRinging
                sipCompactHeadersEnabled = inbound.sipCompactHeadersEnabled
                timeout1xxSecs = inbound.timeout1xxSecs
                timeout2xxSecs = inbound.timeout2xxSecs
                additionalProperties = inbound.additionalProperties.toMutableMap()
            }

            /**
             * This setting allows you to set the format with which the caller's number (ANI) is
             * sent for inbound phone calls.
             */
            fun aniNumberFormat(aniNumberFormat: AniNumberFormat) =
                aniNumberFormat(JsonField.of(aniNumberFormat))

            /**
             * Sets [Builder.aniNumberFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aniNumberFormat] with a well-typed [AniNumberFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun aniNumberFormat(aniNumberFormat: JsonField<AniNumberFormat>) = apply {
                this.aniNumberFormat = aniNumberFormat
            }

            /**
             * When set, this will limit the total number of inbound calls to phone numbers
             * associated with this connection.
             */
            fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

            /**
             * Sets [Builder.channelLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelLimit(channelLimit: JsonField<Long>) = apply {
                this.channelLimit = channelLimit
            }

            /**
             * Defines the list of codecs that Telnyx will send for inbound calls to a specific
             * number on your portal account, in priority order. This only works when the Connection
             * the number is assigned to uses Media Handling mode: default. OPUS and H.264 codecs
             * are available only when using TCP or TLS transport for SIP.
             */
            fun codecs(codecs: List<String>) = codecs(JsonField.of(codecs))

            /**
             * Sets [Builder.codecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codecs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codecs(codecs: JsonField<List<String>>) = apply {
                this.codecs = codecs.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [codecs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCodec(codec: String) = apply {
                codecs =
                    (codecs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("codecs", it).add(codec)
                    }
            }

            /**
             * Default routing method to be used when a number is associated with the connection.
             * Must be one of the routing method types or left blank, other values are not allowed.
             */
            fun defaultRoutingMethod(defaultRoutingMethod: DefaultRoutingMethod) =
                defaultRoutingMethod(JsonField.of(defaultRoutingMethod))

            /**
             * Sets [Builder.defaultRoutingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultRoutingMethod] with a well-typed
             * [DefaultRoutingMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun defaultRoutingMethod(defaultRoutingMethod: JsonField<DefaultRoutingMethod>) =
                apply {
                    this.defaultRoutingMethod = defaultRoutingMethod
                }

            fun dnisNumberFormat(dnisNumberFormat: DnisNumberFormat) =
                dnisNumberFormat(JsonField.of(dnisNumberFormat))

            /**
             * Sets [Builder.dnisNumberFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnisNumberFormat] with a well-typed
             * [DnisNumberFormat] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun dnisNumberFormat(dnisNumberFormat: JsonField<DnisNumberFormat>) = apply {
                this.dnisNumberFormat = dnisNumberFormat
            }

            /** Generate ringback tone through 183 session progress message with early media. */
            fun generateRingbackTone(generateRingbackTone: Boolean) =
                generateRingbackTone(JsonField.of(generateRingbackTone))

            /**
             * Sets [Builder.generateRingbackTone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.generateRingbackTone] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun generateRingbackTone(generateRingbackTone: JsonField<Boolean>) = apply {
                this.generateRingbackTone = generateRingbackTone
            }

            /**
             * When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only
             * when available and only when using TCP or TLS transport.)
             */
            fun isupHeadersEnabled(isupHeadersEnabled: Boolean) =
                isupHeadersEnabled(JsonField.of(isupHeadersEnabled))

            /**
             * Sets [Builder.isupHeadersEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isupHeadersEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isupHeadersEnabled(isupHeadersEnabled: JsonField<Boolean>) = apply {
                this.isupHeadersEnabled = isupHeadersEnabled
            }

            /** Enable PRACK messages as defined in RFC3262. */
            fun prackEnabled(prackEnabled: Boolean) = prackEnabled(JsonField.of(prackEnabled))

            /**
             * Sets [Builder.prackEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prackEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prackEnabled(prackEnabled: JsonField<Boolean>) = apply {
                this.prackEnabled = prackEnabled
            }

            /**
             * When enabled the SIP Connection will receive the Identity header with Shaken/Stir
             * data in the SIP INVITE message of inbound calls, even when using UDP transport.
             */
            fun shakenStirEnabled(shakenStirEnabled: Boolean) =
                shakenStirEnabled(JsonField.of(shakenStirEnabled))

            /**
             * Sets [Builder.shakenStirEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shakenStirEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shakenStirEnabled(shakenStirEnabled: JsonField<Boolean>) = apply {
                this.shakenStirEnabled = shakenStirEnabled
            }

            /** When enabled, allows multiple devices to ring simultaneously on incoming calls. */
            fun simultaneousRinging(simultaneousRinging: SimultaneousRinging) =
                simultaneousRinging(JsonField.of(simultaneousRinging))

            /**
             * Sets [Builder.simultaneousRinging] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simultaneousRinging] with a well-typed
             * [SimultaneousRinging] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun simultaneousRinging(simultaneousRinging: JsonField<SimultaneousRinging>) = apply {
                this.simultaneousRinging = simultaneousRinging
            }

            /** Defaults to true. */
            fun sipCompactHeadersEnabled(sipCompactHeadersEnabled: Boolean) =
                sipCompactHeadersEnabled(JsonField.of(sipCompactHeadersEnabled))

            /**
             * Sets [Builder.sipCompactHeadersEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipCompactHeadersEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun sipCompactHeadersEnabled(sipCompactHeadersEnabled: JsonField<Boolean>) = apply {
                this.sipCompactHeadersEnabled = sipCompactHeadersEnabled
            }

            /** Time(sec) before aborting if connection is not made. */
            fun timeout1xxSecs(timeout1xxSecs: Long) = timeout1xxSecs(JsonField.of(timeout1xxSecs))

            /**
             * Sets [Builder.timeout1xxSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout1xxSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout1xxSecs(timeout1xxSecs: JsonField<Long>) = apply {
                this.timeout1xxSecs = timeout1xxSecs
            }

            /** Time(sec) before aborting if call is unanswered (min: 1, max: 600). */
            fun timeout2xxSecs(timeout2xxSecs: Long) = timeout2xxSecs(JsonField.of(timeout2xxSecs))

            /**
             * Sets [Builder.timeout2xxSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout2xxSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout2xxSecs(timeout2xxSecs: JsonField<Long>) = apply {
                this.timeout2xxSecs = timeout2xxSecs
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
             * Returns an immutable instance of [Inbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Inbound =
                Inbound(
                    aniNumberFormat,
                    channelLimit,
                    (codecs ?: JsonMissing.of()).map { it.toImmutable() },
                    defaultRoutingMethod,
                    dnisNumberFormat,
                    generateRingbackTone,
                    isupHeadersEnabled,
                    prackEnabled,
                    shakenStirEnabled,
                    simultaneousRinging,
                    sipCompactHeadersEnabled,
                    timeout1xxSecs,
                    timeout2xxSecs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Inbound = apply {
            if (validated) {
                return@apply
            }

            aniNumberFormat().ifPresent { it.validate() }
            channelLimit()
            codecs()
            defaultRoutingMethod().ifPresent { it.validate() }
            dnisNumberFormat().ifPresent { it.validate() }
            generateRingbackTone()
            isupHeadersEnabled()
            prackEnabled()
            shakenStirEnabled()
            simultaneousRinging().ifPresent { it.validate() }
            sipCompactHeadersEnabled()
            timeout1xxSecs()
            timeout2xxSecs()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (aniNumberFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (channelLimit.asKnown().isPresent) 1 else 0) +
                (codecs.asKnown().getOrNull()?.size ?: 0) +
                (defaultRoutingMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (dnisNumberFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (generateRingbackTone.asKnown().isPresent) 1 else 0) +
                (if (isupHeadersEnabled.asKnown().isPresent) 1 else 0) +
                (if (prackEnabled.asKnown().isPresent) 1 else 0) +
                (if (shakenStirEnabled.asKnown().isPresent) 1 else 0) +
                (simultaneousRinging.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sipCompactHeadersEnabled.asKnown().isPresent) 1 else 0) +
                (if (timeout1xxSecs.asKnown().isPresent) 1 else 0) +
                (if (timeout2xxSecs.asKnown().isPresent) 1 else 0)

        /**
         * This setting allows you to set the format with which the caller's number (ANI) is sent
         * for inbound phone calls.
         */
        class AniNumberFormat
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PLUS_E_164 = of("+E.164")

                @JvmField val E_164 = of("E.164")

                @JvmField val PLUS_E_164_NATIONAL = of("+E.164-national")

                @JvmField val E_164_NATIONAL = of("E.164-national")

                @JvmStatic fun of(value: String) = AniNumberFormat(JsonField.of(value))
            }

            /** An enum containing [AniNumberFormat]'s known values. */
            enum class Known {
                PLUS_E_164,
                E_164,
                PLUS_E_164_NATIONAL,
                E_164_NATIONAL,
            }

            /**
             * An enum containing [AniNumberFormat]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AniNumberFormat] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PLUS_E_164,
                E_164,
                PLUS_E_164_NATIONAL,
                E_164_NATIONAL,
                /**
                 * An enum member indicating that [AniNumberFormat] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PLUS_E_164 -> Value.PLUS_E_164
                    E_164 -> Value.E_164
                    PLUS_E_164_NATIONAL -> Value.PLUS_E_164_NATIONAL
                    E_164_NATIONAL -> Value.E_164_NATIONAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PLUS_E_164 -> Known.PLUS_E_164
                    E_164 -> Known.E_164
                    PLUS_E_164_NATIONAL -> Known.PLUS_E_164_NATIONAL
                    E_164_NATIONAL -> Known.E_164_NATIONAL
                    else -> throw TelnyxInvalidDataException("Unknown AniNumberFormat: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): AniNumberFormat = apply {
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

                return other is AniNumberFormat && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Default routing method to be used when a number is associated with the connection. Must
         * be one of the routing method types or left blank, other values are not allowed.
         */
        class DefaultRoutingMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SEQUENTIAL = of("sequential")

                @JvmField val ROUND_ROBIN = of("round-robin")

                @JvmStatic fun of(value: String) = DefaultRoutingMethod(JsonField.of(value))
            }

            /** An enum containing [DefaultRoutingMethod]'s known values. */
            enum class Known {
                SEQUENTIAL,
                ROUND_ROBIN,
            }

            /**
             * An enum containing [DefaultRoutingMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DefaultRoutingMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SEQUENTIAL,
                ROUND_ROBIN,
                /**
                 * An enum member indicating that [DefaultRoutingMethod] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SEQUENTIAL -> Value.SEQUENTIAL
                    ROUND_ROBIN -> Value.ROUND_ROBIN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SEQUENTIAL -> Known.SEQUENTIAL
                    ROUND_ROBIN -> Known.ROUND_ROBIN
                    else -> throw TelnyxInvalidDataException("Unknown DefaultRoutingMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DefaultRoutingMethod = apply {
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

                return other is DefaultRoutingMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DnisNumberFormat
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PLUS_E164 = of("+e164")

                @JvmField val E164 = of("e164")

                @JvmField val NATIONAL = of("national")

                @JvmField val SIP_USERNAME = of("sip_username")

                @JvmStatic fun of(value: String) = DnisNumberFormat(JsonField.of(value))
            }

            /** An enum containing [DnisNumberFormat]'s known values. */
            enum class Known {
                PLUS_E164,
                E164,
                NATIONAL,
                SIP_USERNAME,
            }

            /**
             * An enum containing [DnisNumberFormat]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DnisNumberFormat] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PLUS_E164,
                E164,
                NATIONAL,
                SIP_USERNAME,
                /**
                 * An enum member indicating that [DnisNumberFormat] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PLUS_E164 -> Value.PLUS_E164
                    E164 -> Value.E164
                    NATIONAL -> Value.NATIONAL
                    SIP_USERNAME -> Value.SIP_USERNAME
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PLUS_E164 -> Known.PLUS_E164
                    E164 -> Known.E164
                    NATIONAL -> Known.NATIONAL
                    SIP_USERNAME -> Known.SIP_USERNAME
                    else -> throw TelnyxInvalidDataException("Unknown DnisNumberFormat: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DnisNumberFormat = apply {
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

                return other is DnisNumberFormat && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** When enabled, allows multiple devices to ring simultaneously on incoming calls. */
        class SimultaneousRinging
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DISABLED = of("disabled")

                @JvmField val ENABLED = of("enabled")

                @JvmStatic fun of(value: String) = SimultaneousRinging(JsonField.of(value))
            }

            /** An enum containing [SimultaneousRinging]'s known values. */
            enum class Known {
                DISABLED,
                ENABLED,
            }

            /**
             * An enum containing [SimultaneousRinging]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SimultaneousRinging] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISABLED,
                ENABLED,
                /**
                 * An enum member indicating that [SimultaneousRinging] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DISABLED -> Value.DISABLED
                    ENABLED -> Value.ENABLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DISABLED -> Known.DISABLED
                    ENABLED -> Known.ENABLED
                    else -> throw TelnyxInvalidDataException("Unknown SimultaneousRinging: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): SimultaneousRinging = apply {
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

                return other is SimultaneousRinging && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inbound &&
                aniNumberFormat == other.aniNumberFormat &&
                channelLimit == other.channelLimit &&
                codecs == other.codecs &&
                defaultRoutingMethod == other.defaultRoutingMethod &&
                dnisNumberFormat == other.dnisNumberFormat &&
                generateRingbackTone == other.generateRingbackTone &&
                isupHeadersEnabled == other.isupHeadersEnabled &&
                prackEnabled == other.prackEnabled &&
                shakenStirEnabled == other.shakenStirEnabled &&
                simultaneousRinging == other.simultaneousRinging &&
                sipCompactHeadersEnabled == other.sipCompactHeadersEnabled &&
                timeout1xxSecs == other.timeout1xxSecs &&
                timeout2xxSecs == other.timeout2xxSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                aniNumberFormat,
                channelLimit,
                codecs,
                defaultRoutingMethod,
                dnisNumberFormat,
                generateRingbackTone,
                isupHeadersEnabled,
                prackEnabled,
                shakenStirEnabled,
                simultaneousRinging,
                sipCompactHeadersEnabled,
                timeout1xxSecs,
                timeout2xxSecs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inbound{aniNumberFormat=$aniNumberFormat, channelLimit=$channelLimit, codecs=$codecs, defaultRoutingMethod=$defaultRoutingMethod, dnisNumberFormat=$dnisNumberFormat, generateRingbackTone=$generateRingbackTone, isupHeadersEnabled=$isupHeadersEnabled, prackEnabled=$prackEnabled, shakenStirEnabled=$shakenStirEnabled, simultaneousRinging=$simultaneousRinging, sipCompactHeadersEnabled=$sipCompactHeadersEnabled, timeout1xxSecs=$timeout1xxSecs, timeout2xxSecs=$timeout2xxSecs, additionalProperties=$additionalProperties}"
    }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
     * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for
     * all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will be
     * connected to your Connection. You can also choose to allow only calls that are originated on
     * any Connections under your account (internal).
     */
    class SipUriCallingPreference
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DISABLED = of("disabled")

            @JvmField val UNRESTRICTED = of("unrestricted")

            @JvmField val INTERNAL = of("internal")

            @JvmStatic fun of(value: String) = SipUriCallingPreference(JsonField.of(value))
        }

        /** An enum containing [SipUriCallingPreference]'s known values. */
        enum class Known {
            DISABLED,
            UNRESTRICTED,
            INTERNAL,
        }

        /**
         * An enum containing [SipUriCallingPreference]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SipUriCallingPreference] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISABLED,
            UNRESTRICTED,
            INTERNAL,
            /**
             * An enum member indicating that [SipUriCallingPreference] was instantiated with an
             * unknown value.
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
                DISABLED -> Value.DISABLED
                UNRESTRICTED -> Value.UNRESTRICTED
                INTERNAL -> Value.INTERNAL
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
                DISABLED -> Known.DISABLED
                UNRESTRICTED -> Known.UNRESTRICTED
                INTERNAL -> Known.INTERNAL
                else -> throw TelnyxInvalidDataException("Unknown SipUriCallingPreference: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SipUriCallingPreference = apply {
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

            return other is SipUriCallingPreference && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2 or texml. Note - texml can
     * only be set when the outbound object parameter call_parking_enabled is included and set to
     * true.
     */
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

            @JvmField val TEXML = of("texml")

            @JvmStatic fun of(value: String) = WebhookApiVersion(JsonField.of(value))
        }

        /** An enum containing [WebhookApiVersion]'s known values. */
        enum class Known {
            V1,
            V2,
            TEXML,
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
            TEXML,
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
                TEXML -> Value.TEXML
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
                TEXML -> Known.TEXML
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is UacConnectionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UacConnectionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
