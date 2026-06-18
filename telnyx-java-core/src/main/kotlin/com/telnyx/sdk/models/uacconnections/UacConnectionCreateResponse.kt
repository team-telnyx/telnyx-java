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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import com.telnyx.sdk.models.fqdns.Fqdn
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UacConnectionCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * A UAC (User Agent Client) Connection registers Telnyx to your PBX — the opposite of a
     * standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your PBX doesn’t support
     * outbound SIP registration or you need Telnyx to maintain the registration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [UacConnectionCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UacConnectionCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uacConnectionCreateResponse: UacConnectionCreateResponse) = apply {
            data = uacConnectionCreateResponse.data
            additionalProperties = uacConnectionCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * A UAC (User Agent Client) Connection registers Telnyx to your PBX — the opposite of a
         * standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your PBX doesn’t
         * support outbound SIP registration or you need Telnyx to maintain the registration.
         */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [UacConnectionCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UacConnectionCreateResponse =
            UacConnectionCreateResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UacConnectionCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A UAC (User Agent Client) Connection registers Telnyx to your PBX — the opposite of a
     * standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your PBX doesn’t support
     * outbound SIP registration or you need Telnyx to maintain the registration.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
        private val androidPushCredentialId: JsonField<String>,
        private val authentication: JsonField<Authentication>,
        private val callCostInWebhooks: JsonField<Boolean>,
        private val connectionName: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val defaultOnHoldComfortNoiseEnabled: JsonField<Boolean>,
        private val dtmfType: JsonField<DtmfType>,
        private val encodeContactHeaderEnabled: JsonField<Boolean>,
        private val encryptedMedia: JsonField<EncryptedMedia>,
        private val externalUacSettings: JsonField<ExternalUacSettings>,
        private val fqdn: JsonField<String>,
        private val fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication>,
        private val fqdns: JsonField<List<Fqdn>>,
        private val inbound: JsonField<Inbound>,
        private val internalUacSettings: JsonField<InternalUacSettings>,
        private val iosPushCredentialId: JsonField<String>,
        private val jitterBuffer: JsonField<ConnectionJitterBuffer>,
        private val noiseSuppression: JsonField<NoiseSuppression>,
        private val noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails>,
        private val onnetT38PassthroughEnabled: JsonField<Boolean>,
        private val outbound: JsonField<Outbound>,
        private val password: JsonField<String>,
        private val recordType: JsonField<String>,
        private val registrationStatus: JsonField<String>,
        private val registrationStatusUpdatedAt: JsonField<String>,
        private val rtcpSettings: JsonField<ConnectionRtcpSettings>,
        private val sipUriCallingPreference: JsonField<SipUriCallingPreference>,
        private val tags: JsonField<List<String>>,
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
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("anchorsite_override")
            @ExcludeMissing
            anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of(),
            @JsonProperty("android_push_credential_id")
            @ExcludeMissing
            androidPushCredentialId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authentication")
            @ExcludeMissing
            authentication: JsonField<Authentication> = JsonMissing.of(),
            @JsonProperty("call_cost_in_webhooks")
            @ExcludeMissing
            callCostInWebhooks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("connection_name")
            @ExcludeMissing
            connectionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
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
            externalUacSettings: JsonField<ExternalUacSettings> = JsonMissing.of(),
            @JsonProperty("fqdn") @ExcludeMissing fqdn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fqdn_outbound_authentication")
            @ExcludeMissing
            fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication> = JsonMissing.of(),
            @JsonProperty("fqdns") @ExcludeMissing fqdns: JsonField<List<Fqdn>> = JsonMissing.of(),
            @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
            @JsonProperty("internal_uac_settings")
            @ExcludeMissing
            internalUacSettings: JsonField<InternalUacSettings> = JsonMissing.of(),
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
            outbound: JsonField<Outbound> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_status")
            @ExcludeMissing
            registrationStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_status_updated_at")
            @ExcludeMissing
            registrationStatusUpdatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rtcp_settings")
            @ExcludeMissing
            rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of(),
            @JsonProperty("sip_uri_calling_preference")
            @ExcludeMissing
            sipUriCallingPreference: JsonField<SipUriCallingPreference> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
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
            id,
            active,
            anchorsiteOverride,
            androidPushCredentialId,
            authentication,
            callCostInWebhooks,
            connectionName,
            createdAt,
            defaultOnHoldComfortNoiseEnabled,
            dtmfType,
            encodeContactHeaderEnabled,
            encryptedMedia,
            externalUacSettings,
            fqdn,
            fqdnOutboundAuthentication,
            fqdns,
            inbound,
            internalUacSettings,
            iosPushCredentialId,
            jitterBuffer,
            noiseSuppression,
            noiseSuppressionDetails,
            onnetT38PassthroughEnabled,
            outbound,
            password,
            recordType,
            registrationStatus,
            registrationStatusUpdatedAt,
            rtcpSettings,
            sipUriCallingPreference,
            tags,
            updatedAt,
            userName,
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
         * The authentication strategy used by this connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authentication(): Optional<Authentication> =
            authentication.getOptional("authentication")

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
         * ISO-8601 formatted date indicating when the resource was created.
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
        fun externalUacSettings(): Optional<ExternalUacSettings> =
            externalUacSettings.getOptional("external_uac_settings")

        /**
         * The Telnyx-managed FQDN generated for the UAC connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fqdn(): Optional<String> = fqdn.getOptional("fqdn")

        /**
         * The fixed outbound authentication mode used by UAC FQDN records.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fqdnOutboundAuthentication(): Optional<FqdnOutboundAuthentication> =
            fqdnOutboundAuthentication.getOptional("fqdn_outbound_authentication")

        /**
         * FQDN records managed automatically by the UAC connection lifecycle.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fqdns(): Optional<List<Fqdn>> = fqdns.getOptional("fqdns")

        /**
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
        fun internalUacSettings(): Optional<InternalUacSettings> =
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
        fun outbound(): Optional<Outbound> = outbound.getOptional("outbound")

        /**
         * The password to be used as part of the credentials. Must be 8 to 128 characters long.
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
         * The most recently known SIP registration status for this UAC connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun registrationStatus(): Optional<String> =
            registrationStatus.getOptional("registration_status")

        /**
         * ISO 8601 formatted date indicating when the registration status was last updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun registrationStatusUpdatedAt(): Optional<String> =
            registrationStatusUpdatedAt.getOptional("registration_status_updated_at")

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
         * ISO-8601 formatted date indicating when the resource was updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

        /**
         * The user name to be used as part of the credentials. Must be 4-32 characters long and
         * alphanumeric values only (no spaces or special characters). At least one of the first 5
         * characters must be a letter.
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
         * Returns the raw JSON value of [authentication].
         *
         * Unlike [authentication], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authentication")
        @ExcludeMissing
        fun _authentication(): JsonField<Authentication> = authentication

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
         * Returns the raw JSON value of [connectionName].
         *
         * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        fun _externalUacSettings(): JsonField<ExternalUacSettings> = externalUacSettings

        /**
         * Returns the raw JSON value of [fqdn].
         *
         * Unlike [fqdn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fqdn") @ExcludeMissing fun _fqdn(): JsonField<String> = fqdn

        /**
         * Returns the raw JSON value of [fqdnOutboundAuthentication].
         *
         * Unlike [fqdnOutboundAuthentication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fqdn_outbound_authentication")
        @ExcludeMissing
        fun _fqdnOutboundAuthentication(): JsonField<FqdnOutboundAuthentication> =
            fqdnOutboundAuthentication

        /**
         * Returns the raw JSON value of [fqdns].
         *
         * Unlike [fqdns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fqdns") @ExcludeMissing fun _fqdns(): JsonField<List<Fqdn>> = fqdns

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
        fun _internalUacSettings(): JsonField<InternalUacSettings> = internalUacSettings

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
        @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<Outbound> = outbound

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
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [registrationStatus].
         *
         * Unlike [registrationStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("registration_status")
        @ExcludeMissing
        fun _registrationStatus(): JsonField<String> = registrationStatus

        /**
         * Returns the raw JSON value of [registrationStatusUpdatedAt].
         *
         * Unlike [registrationStatusUpdatedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("registration_status_updated_at")
        @ExcludeMissing
        fun _registrationStatusUpdatedAt(): JsonField<String> = registrationStatusUpdatedAt

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
            private var androidPushCredentialId: JsonField<String> = JsonMissing.of()
            private var authentication: JsonField<Authentication> = JsonMissing.of()
            private var callCostInWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var connectionName: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var defaultOnHoldComfortNoiseEnabled: JsonField<Boolean> = JsonMissing.of()
            private var dtmfType: JsonField<DtmfType> = JsonMissing.of()
            private var encodeContactHeaderEnabled: JsonField<Boolean> = JsonMissing.of()
            private var encryptedMedia: JsonField<EncryptedMedia> = JsonMissing.of()
            private var externalUacSettings: JsonField<ExternalUacSettings> = JsonMissing.of()
            private var fqdn: JsonField<String> = JsonMissing.of()
            private var fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication> =
                JsonMissing.of()
            private var fqdns: JsonField<MutableList<Fqdn>>? = null
            private var inbound: JsonField<Inbound> = JsonMissing.of()
            private var internalUacSettings: JsonField<InternalUacSettings> = JsonMissing.of()
            private var iosPushCredentialId: JsonField<String> = JsonMissing.of()
            private var jitterBuffer: JsonField<ConnectionJitterBuffer> = JsonMissing.of()
            private var noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of()
            private var noiseSuppressionDetails: JsonField<ConnectionNoiseSuppressionDetails> =
                JsonMissing.of()
            private var onnetT38PassthroughEnabled: JsonField<Boolean> = JsonMissing.of()
            private var outbound: JsonField<Outbound> = JsonMissing.of()
            private var password: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var registrationStatus: JsonField<String> = JsonMissing.of()
            private var registrationStatusUpdatedAt: JsonField<String> = JsonMissing.of()
            private var rtcpSettings: JsonField<ConnectionRtcpSettings> = JsonMissing.of()
            private var sipUriCallingPreference: JsonField<SipUriCallingPreference> =
                JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var userName: JsonField<String> = JsonMissing.of()
            private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
            private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookEventUrl: JsonField<String> = JsonMissing.of()
            private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                active = data.active
                anchorsiteOverride = data.anchorsiteOverride
                androidPushCredentialId = data.androidPushCredentialId
                authentication = data.authentication
                callCostInWebhooks = data.callCostInWebhooks
                connectionName = data.connectionName
                createdAt = data.createdAt
                defaultOnHoldComfortNoiseEnabled = data.defaultOnHoldComfortNoiseEnabled
                dtmfType = data.dtmfType
                encodeContactHeaderEnabled = data.encodeContactHeaderEnabled
                encryptedMedia = data.encryptedMedia
                externalUacSettings = data.externalUacSettings
                fqdn = data.fqdn
                fqdnOutboundAuthentication = data.fqdnOutboundAuthentication
                fqdns = data.fqdns.map { it.toMutableList() }
                inbound = data.inbound
                internalUacSettings = data.internalUacSettings
                iosPushCredentialId = data.iosPushCredentialId
                jitterBuffer = data.jitterBuffer
                noiseSuppression = data.noiseSuppression
                noiseSuppressionDetails = data.noiseSuppressionDetails
                onnetT38PassthroughEnabled = data.onnetT38PassthroughEnabled
                outbound = data.outbound
                password = data.password
                recordType = data.recordType
                registrationStatus = data.registrationStatus
                registrationStatusUpdatedAt = data.registrationStatusUpdatedAt
                rtcpSettings = data.rtcpSettings
                sipUriCallingPreference = data.sipUriCallingPreference
                tags = data.tags.map { it.toMutableList() }
                updatedAt = data.updatedAt
                userName = data.userName
                webhookApiVersion = data.webhookApiVersion
                webhookEventFailoverUrl = data.webhookEventFailoverUrl
                webhookEventUrl = data.webhookEventUrl
                webhookTimeoutSecs = data.webhookTimeoutSecs
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the type of resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** The authentication strategy used by this connection. */
            fun authentication(authentication: Authentication) =
                authentication(JsonField.of(authentication))

            /**
             * Sets [Builder.authentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authentication] with a well-typed [Authentication]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun authentication(authentication: JsonField<Authentication>) = apply {
                this.authentication = authentication
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

            /** ISO-8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

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
            fun externalUacSettings(externalUacSettings: ExternalUacSettings) =
                externalUacSettings(JsonField.of(externalUacSettings))

            /**
             * Sets [Builder.externalUacSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalUacSettings] with a well-typed
             * [ExternalUacSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun externalUacSettings(externalUacSettings: JsonField<ExternalUacSettings>) = apply {
                this.externalUacSettings = externalUacSettings
            }

            /** The Telnyx-managed FQDN generated for the UAC connection. */
            fun fqdn(fqdn: String) = fqdn(JsonField.of(fqdn))

            /**
             * Sets [Builder.fqdn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fqdn] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fqdn(fqdn: JsonField<String>) = apply { this.fqdn = fqdn }

            /** The fixed outbound authentication mode used by UAC FQDN records. */
            fun fqdnOutboundAuthentication(fqdnOutboundAuthentication: FqdnOutboundAuthentication) =
                fqdnOutboundAuthentication(JsonField.of(fqdnOutboundAuthentication))

            /**
             * Sets [Builder.fqdnOutboundAuthentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fqdnOutboundAuthentication] with a well-typed
             * [FqdnOutboundAuthentication] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun fqdnOutboundAuthentication(
                fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication>
            ) = apply { this.fqdnOutboundAuthentication = fqdnOutboundAuthentication }

            /** FQDN records managed automatically by the UAC connection lifecycle. */
            fun fqdns(fqdns: List<Fqdn>) = fqdns(JsonField.of(fqdns))

            /**
             * Sets [Builder.fqdns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fqdns] with a well-typed `List<Fqdn>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fqdns(fqdns: JsonField<List<Fqdn>>) = apply {
                this.fqdns = fqdns.map { it.toMutableList() }
            }

            /**
             * Adds a single [Fqdn] to [fqdns].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFqdn(fqdn: Fqdn) = apply {
                fqdns =
                    (fqdns ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fqdns", it).add(fqdn)
                    }
            }

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
            fun internalUacSettings(internalUacSettings: InternalUacSettings) =
                internalUacSettings(JsonField.of(internalUacSettings))

            /**
             * Sets [Builder.internalUacSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalUacSettings] with a well-typed
             * [InternalUacSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun internalUacSettings(internalUacSettings: JsonField<InternalUacSettings>) = apply {
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

            fun outbound(outbound: Outbound) = outbound(JsonField.of(outbound))

            /**
             * Sets [Builder.outbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outbound] with a well-typed [Outbound] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outbound(outbound: JsonField<Outbound>) = apply { this.outbound = outbound }

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

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The most recently known SIP registration status for this UAC connection. */
            fun registrationStatus(registrationStatus: String?) =
                registrationStatus(JsonField.ofNullable(registrationStatus))

            /**
             * Alias for calling [Builder.registrationStatus] with
             * `registrationStatus.orElse(null)`.
             */
            fun registrationStatus(registrationStatus: Optional<String>) =
                registrationStatus(registrationStatus.getOrNull())

            /**
             * Sets [Builder.registrationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationStatus(registrationStatus: JsonField<String>) = apply {
                this.registrationStatus = registrationStatus
            }

            /** ISO 8601 formatted date indicating when the registration status was last updated. */
            fun registrationStatusUpdatedAt(registrationStatusUpdatedAt: String?) =
                registrationStatusUpdatedAt(JsonField.ofNullable(registrationStatusUpdatedAt))

            /**
             * Alias for calling [Builder.registrationStatusUpdatedAt] with
             * `registrationStatusUpdatedAt.orElse(null)`.
             */
            fun registrationStatusUpdatedAt(registrationStatusUpdatedAt: Optional<String>) =
                registrationStatusUpdatedAt(registrationStatusUpdatedAt.getOrNull())

            /**
             * Sets [Builder.registrationStatusUpdatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationStatusUpdatedAt] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun registrationStatusUpdatedAt(registrationStatusUpdatedAt: JsonField<String>) =
                apply {
                    this.registrationStatusUpdatedAt = registrationStatusUpdatedAt
                }

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

            /** ISO-8601 formatted date indicating when the resource was updated. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /**
             * The user name to be used as part of the credentials. Must be 4-32 characters long and
             * alphanumeric values only (no spaces or special characters). At least one of the first
             * 5 characters must be a letter.
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

            /** Determines which webhook format will be used, Telnyx API v1 or v2. */
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    active,
                    anchorsiteOverride,
                    androidPushCredentialId,
                    authentication,
                    callCostInWebhooks,
                    connectionName,
                    createdAt,
                    defaultOnHoldComfortNoiseEnabled,
                    dtmfType,
                    encodeContactHeaderEnabled,
                    encryptedMedia,
                    externalUacSettings,
                    fqdn,
                    fqdnOutboundAuthentication,
                    (fqdns ?: JsonMissing.of()).map { it.toImmutable() },
                    inbound,
                    internalUacSettings,
                    iosPushCredentialId,
                    jitterBuffer,
                    noiseSuppression,
                    noiseSuppressionDetails,
                    onnetT38PassthroughEnabled,
                    outbound,
                    password,
                    recordType,
                    registrationStatus,
                    registrationStatusUpdatedAt,
                    rtcpSettings,
                    sipUriCallingPreference,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            active()
            anchorsiteOverride().ifPresent { it.validate() }
            androidPushCredentialId()
            authentication().ifPresent { it.validate() }
            callCostInWebhooks()
            connectionName()
            createdAt()
            defaultOnHoldComfortNoiseEnabled()
            dtmfType().ifPresent { it.validate() }
            encodeContactHeaderEnabled()
            encryptedMedia().ifPresent { it.validate() }
            externalUacSettings().ifPresent { it.validate() }
            fqdn()
            fqdnOutboundAuthentication().ifPresent { it.validate() }
            fqdns().ifPresent { it.forEach { it.validate() } }
            inbound().ifPresent { it.validate() }
            internalUacSettings().ifPresent { it.validate() }
            iosPushCredentialId()
            jitterBuffer().ifPresent { it.validate() }
            noiseSuppression().ifPresent { it.validate() }
            noiseSuppressionDetails().ifPresent { it.validate() }
            onnetT38PassthroughEnabled()
            outbound().ifPresent { it.validate() }
            password()
            recordType()
            registrationStatus()
            registrationStatusUpdatedAt()
            rtcpSettings().ifPresent { it.validate() }
            sipUriCallingPreference().ifPresent { it.validate() }
            tags()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (active.asKnown().isPresent) 1 else 0) +
                (anchorsiteOverride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (androidPushCredentialId.asKnown().isPresent) 1 else 0) +
                (authentication.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callCostInWebhooks.asKnown().isPresent) 1 else 0) +
                (if (connectionName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (defaultOnHoldComfortNoiseEnabled.asKnown().isPresent) 1 else 0) +
                (dtmfType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (encodeContactHeaderEnabled.asKnown().isPresent) 1 else 0) +
                (encryptedMedia.asKnown().getOrNull()?.validity() ?: 0) +
                (externalUacSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fqdn.asKnown().isPresent) 1 else 0) +
                (fqdnOutboundAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
                (fqdns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (inbound.asKnown().getOrNull()?.validity() ?: 0) +
                (internalUacSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (iosPushCredentialId.asKnown().isPresent) 1 else 0) +
                (jitterBuffer.asKnown().getOrNull()?.validity() ?: 0) +
                (noiseSuppression.asKnown().getOrNull()?.validity() ?: 0) +
                (noiseSuppressionDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (onnetT38PassthroughEnabled.asKnown().isPresent) 1 else 0) +
                (outbound.asKnown().getOrNull()?.validity() ?: 0) +
                (if (password.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (registrationStatus.asKnown().isPresent) 1 else 0) +
                (if (registrationStatusUpdatedAt.asKnown().isPresent) 1 else 0) +
                (rtcpSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (sipUriCallingPreference.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userName.asKnown().isPresent) 1 else 0) +
                (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

        /** The authentication strategy used by this connection. */
        class Authentication
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

                @JvmField val UAC_AUTHENTICATION = of("uac-authentication")

                @JvmStatic fun of(value: String) = Authentication(JsonField.of(value))
            }

            /** An enum containing [Authentication]'s known values. */
            enum class Known {
                UAC_AUTHENTICATION
            }

            /**
             * An enum containing [Authentication]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Authentication] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UAC_AUTHENTICATION,
                /**
                 * An enum member indicating that [Authentication] was instantiated with an unknown
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
                    UAC_AUTHENTICATION -> Value.UAC_AUTHENTICATION
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
                    UAC_AUTHENTICATION -> Known.UAC_AUTHENTICATION
                    else -> throw TelnyxInvalidDataException("Unknown Authentication: $value")
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
            fun validate(): Authentication = apply {
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

                return other is Authentication && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * External SIP peer settings used by Telnyx when registering to your PBX and routing
         * outbound calls.
         */
        class ExternalUacSettings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authUsername: JsonField<String>,
            private val expirationSec: JsonField<Long>,
            private val fromUser: JsonField<String>,
            private val outboundProxy: JsonField<String>,
            private val password: JsonField<String>,
            private val proxy: JsonField<String>,
            private val transport: JsonField<Transport>,
            private val username: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_username")
                @ExcludeMissing
                authUsername: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiration_sec")
                @ExcludeMissing
                expirationSec: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("from_user")
                @ExcludeMissing
                fromUser: JsonField<String> = JsonMissing.of(),
                @JsonProperty("outbound_proxy")
                @ExcludeMissing
                outboundProxy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("password")
                @ExcludeMissing
                password: JsonField<String> = JsonMissing.of(),
                @JsonProperty("proxy") @ExcludeMissing proxy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transport")
                @ExcludeMissing
                transport: JsonField<Transport> = JsonMissing.of(),
                @JsonProperty("username")
                @ExcludeMissing
                username: JsonField<String> = JsonMissing.of(),
            ) : this(
                authUsername,
                expirationSec,
                fromUser,
                outboundProxy,
                password,
                proxy,
                transport,
                username,
                mutableMapOf(),
            )

            /**
             * The authentication username used in SIP digest authentication. If not set, the
             * Username value will be used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authUsername(): Optional<String> = authUsername.getOptional("auth_username")

            /**
             * The registration interval, in seconds, indicating how often the system refreshes the
             * SIP registration with the external SIP peer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expirationSec(): Optional<Long> = expirationSec.getOptional("expiration_sec")

            /**
             * The user portion of the SIP From header used in outbound requests. This controls the
             * caller identity presented to the external SIP peer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fromUser(): Optional<String> = fromUser.getOptional("from_user")

            /**
             * An optional SIP proxy used to route outbound requests before reaching the external
             * SIP peer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun outboundProxy(): Optional<String> = outboundProxy.getOptional("outbound_proxy")

            /**
             * The SIP password used for digest authentication with the external SIP peer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun password(): Optional<String> = password.getOptional("password")

            /**
             * The SIP proxy address of the external SIP peer used for registrations and outbound
             * call routing.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun proxy(): Optional<String> = proxy.getOptional("proxy")

            /**
             * The transport protocol used for SIP signaling when communicating with the external
             * SIP peer. One of UDP, TLS, or TCP.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transport(): Optional<Transport> = transport.getOptional("transport")

            /**
             * The SIP username used to authenticate with the external SIP peer for registrations
             * and outbound calls. Must start with a letter or number and contain only letters,
             * numbers, hyphens, and underscores.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun username(): Optional<String> = username.getOptional("username")

            /**
             * Returns the raw JSON value of [authUsername].
             *
             * Unlike [authUsername], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_username")
            @ExcludeMissing
            fun _authUsername(): JsonField<String> = authUsername

            /**
             * Returns the raw JSON value of [expirationSec].
             *
             * Unlike [expirationSec], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiration_sec")
            @ExcludeMissing
            fun _expirationSec(): JsonField<Long> = expirationSec

            /**
             * Returns the raw JSON value of [fromUser].
             *
             * Unlike [fromUser], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("from_user") @ExcludeMissing fun _fromUser(): JsonField<String> = fromUser

            /**
             * Returns the raw JSON value of [outboundProxy].
             *
             * Unlike [outboundProxy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("outbound_proxy")
            @ExcludeMissing
            fun _outboundProxy(): JsonField<String> = outboundProxy

            /**
             * Returns the raw JSON value of [password].
             *
             * Unlike [password], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

            /**
             * Returns the raw JSON value of [proxy].
             *
             * Unlike [proxy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("proxy") @ExcludeMissing fun _proxy(): JsonField<String> = proxy

            /**
             * Returns the raw JSON value of [transport].
             *
             * Unlike [transport], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transport")
            @ExcludeMissing
            fun _transport(): JsonField<Transport> = transport

            /**
             * Returns the raw JSON value of [username].
             *
             * Unlike [username], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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
                 * Returns a mutable builder for constructing an instance of [ExternalUacSettings].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExternalUacSettings]. */
            class Builder internal constructor() {

                private var authUsername: JsonField<String> = JsonMissing.of()
                private var expirationSec: JsonField<Long> = JsonMissing.of()
                private var fromUser: JsonField<String> = JsonMissing.of()
                private var outboundProxy: JsonField<String> = JsonMissing.of()
                private var password: JsonField<String> = JsonMissing.of()
                private var proxy: JsonField<String> = JsonMissing.of()
                private var transport: JsonField<Transport> = JsonMissing.of()
                private var username: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(externalUacSettings: ExternalUacSettings) = apply {
                    authUsername = externalUacSettings.authUsername
                    expirationSec = externalUacSettings.expirationSec
                    fromUser = externalUacSettings.fromUser
                    outboundProxy = externalUacSettings.outboundProxy
                    password = externalUacSettings.password
                    proxy = externalUacSettings.proxy
                    transport = externalUacSettings.transport
                    username = externalUacSettings.username
                    additionalProperties = externalUacSettings.additionalProperties.toMutableMap()
                }

                /**
                 * The authentication username used in SIP digest authentication. If not set, the
                 * Username value will be used.
                 */
                fun authUsername(authUsername: String?) =
                    authUsername(JsonField.ofNullable(authUsername))

                /** Alias for calling [Builder.authUsername] with `authUsername.orElse(null)`. */
                fun authUsername(authUsername: Optional<String>) =
                    authUsername(authUsername.getOrNull())

                /**
                 * Sets [Builder.authUsername] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authUsername] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authUsername(authUsername: JsonField<String>) = apply {
                    this.authUsername = authUsername
                }

                /**
                 * The registration interval, in seconds, indicating how often the system refreshes
                 * the SIP registration with the external SIP peer.
                 */
                fun expirationSec(expirationSec: Long?) =
                    expirationSec(JsonField.ofNullable(expirationSec))

                /**
                 * Alias for [Builder.expirationSec].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun expirationSec(expirationSec: Long) = expirationSec(expirationSec as Long?)

                /** Alias for calling [Builder.expirationSec] with `expirationSec.orElse(null)`. */
                fun expirationSec(expirationSec: Optional<Long>) =
                    expirationSec(expirationSec.getOrNull())

                /**
                 * Sets [Builder.expirationSec] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expirationSec] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expirationSec(expirationSec: JsonField<Long>) = apply {
                    this.expirationSec = expirationSec
                }

                /**
                 * The user portion of the SIP From header used in outbound requests. This controls
                 * the caller identity presented to the external SIP peer.
                 */
                fun fromUser(fromUser: String?) = fromUser(JsonField.ofNullable(fromUser))

                /** Alias for calling [Builder.fromUser] with `fromUser.orElse(null)`. */
                fun fromUser(fromUser: Optional<String>) = fromUser(fromUser.getOrNull())

                /**
                 * Sets [Builder.fromUser] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fromUser] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fromUser(fromUser: JsonField<String>) = apply { this.fromUser = fromUser }

                /**
                 * An optional SIP proxy used to route outbound requests before reaching the
                 * external SIP peer.
                 */
                fun outboundProxy(outboundProxy: String?) =
                    outboundProxy(JsonField.ofNullable(outboundProxy))

                /** Alias for calling [Builder.outboundProxy] with `outboundProxy.orElse(null)`. */
                fun outboundProxy(outboundProxy: Optional<String>) =
                    outboundProxy(outboundProxy.getOrNull())

                /**
                 * Sets [Builder.outboundProxy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outboundProxy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outboundProxy(outboundProxy: JsonField<String>) = apply {
                    this.outboundProxy = outboundProxy
                }

                /** The SIP password used for digest authentication with the external SIP peer. */
                fun password(password: String) = password(JsonField.of(password))

                /**
                 * Sets [Builder.password] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.password] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun password(password: JsonField<String>) = apply { this.password = password }

                /**
                 * The SIP proxy address of the external SIP peer used for registrations and
                 * outbound call routing.
                 */
                fun proxy(proxy: String) = proxy(JsonField.of(proxy))

                /**
                 * Sets [Builder.proxy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.proxy] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun proxy(proxy: JsonField<String>) = apply { this.proxy = proxy }

                /**
                 * The transport protocol used for SIP signaling when communicating with the
                 * external SIP peer. One of UDP, TLS, or TCP.
                 */
                fun transport(transport: Transport?) = transport(JsonField.ofNullable(transport))

                /** Alias for calling [Builder.transport] with `transport.orElse(null)`. */
                fun transport(transport: Optional<Transport>) = transport(transport.getOrNull())

                /**
                 * Sets [Builder.transport] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transport] with a well-typed [Transport] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transport(transport: JsonField<Transport>) = apply {
                    this.transport = transport
                }

                /**
                 * The SIP username used to authenticate with the external SIP peer for
                 * registrations and outbound calls. Must start with a letter or number and contain
                 * only letters, numbers, hyphens, and underscores.
                 */
                fun username(username: String) = username(JsonField.of(username))

                /**
                 * Sets [Builder.username] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.username] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun username(username: JsonField<String>) = apply { this.username = username }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ExternalUacSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ExternalUacSettings =
                    ExternalUacSettings(
                        authUsername,
                        expirationSec,
                        fromUser,
                        outboundProxy,
                        password,
                        proxy,
                        transport,
                        username,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): ExternalUacSettings = apply {
                if (validated) {
                    return@apply
                }

                authUsername()
                expirationSec()
                fromUser()
                outboundProxy()
                password()
                proxy()
                transport().ifPresent { it.validate() }
                username()
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
                (if (authUsername.asKnown().isPresent) 1 else 0) +
                    (if (expirationSec.asKnown().isPresent) 1 else 0) +
                    (if (fromUser.asKnown().isPresent) 1 else 0) +
                    (if (outboundProxy.asKnown().isPresent) 1 else 0) +
                    (if (password.asKnown().isPresent) 1 else 0) +
                    (if (proxy.asKnown().isPresent) 1 else 0) +
                    (transport.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (username.asKnown().isPresent) 1 else 0)

            /**
             * The transport protocol used for SIP signaling when communicating with the external
             * SIP peer. One of UDP, TLS, or TCP.
             */
            class Transport @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val UDP = of("UDP")

                    @JvmField val TLS = of("TLS")

                    @JvmField val TCP = of("TCP")

                    @JvmStatic fun of(value: String) = Transport(JsonField.of(value))
                }

                /** An enum containing [Transport]'s known values. */
                enum class Known {
                    UDP,
                    TLS,
                    TCP,
                }

                /**
                 * An enum containing [Transport]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Transport] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UDP,
                    TLS,
                    TCP,
                    /**
                     * An enum member indicating that [Transport] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UDP -> Value.UDP
                        TLS -> Value.TLS
                        TCP -> Value.TCP
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        UDP -> Known.UDP
                        TLS -> Known.TLS
                        TCP -> Known.TCP
                        else -> throw TelnyxInvalidDataException("Unknown Transport: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Transport = apply {
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

                    return other is Transport && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternalUacSettings &&
                    authUsername == other.authUsername &&
                    expirationSec == other.expirationSec &&
                    fromUser == other.fromUser &&
                    outboundProxy == other.outboundProxy &&
                    password == other.password &&
                    proxy == other.proxy &&
                    transport == other.transport &&
                    username == other.username &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authUsername,
                    expirationSec,
                    fromUser,
                    outboundProxy,
                    password,
                    proxy,
                    transport,
                    username,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExternalUacSettings{authUsername=$authUsername, expirationSec=$expirationSec, fromUser=$fromUser, outboundProxy=$outboundProxy, password=$password, proxy=$proxy, transport=$transport, username=$username, additionalProperties=$additionalProperties}"
        }

        /** The fixed outbound authentication mode used by UAC FQDN records. */
        class FqdnOutboundAuthentication
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

                @JvmField val CREDENTIAL_AUTHENTICATION = of("credential-authentication")

                @JvmStatic fun of(value: String) = FqdnOutboundAuthentication(JsonField.of(value))
            }

            /** An enum containing [FqdnOutboundAuthentication]'s known values. */
            enum class Known {
                CREDENTIAL_AUTHENTICATION
            }

            /**
             * An enum containing [FqdnOutboundAuthentication]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [FqdnOutboundAuthentication] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREDENTIAL_AUTHENTICATION,
                /**
                 * An enum member indicating that [FqdnOutboundAuthentication] was instantiated with
                 * an unknown value.
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
                    CREDENTIAL_AUTHENTICATION -> Value.CREDENTIAL_AUTHENTICATION
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
                    CREDENTIAL_AUTHENTICATION -> Known.CREDENTIAL_AUTHENTICATION
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown FqdnOutboundAuthentication: $value"
                        )
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
            fun validate(): FqdnOutboundAuthentication = apply {
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

                return other is FqdnOutboundAuthentication && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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
            private val sipSubdomain: JsonField<String>,
            private val sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings>,
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
                @JsonProperty("sip_subdomain")
                @ExcludeMissing
                sipSubdomain: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sip_subdomain_receive_settings")
                @ExcludeMissing
                sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> =
                    JsonMissing.of(),
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
                sipSubdomain,
                sipSubdomainReceiveSettings,
                timeout1xxSecs,
                timeout2xxSecs,
                mutableMapOf(),
            )

            /**
             * This setting allows you to set the format with which the caller's number (ANI) is
             * sent for inbound phone calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aniNumberFormat(): Optional<AniNumberFormat> =
                aniNumberFormat.getOptional("ani_number_format")

            /**
             * When set, this will limit the total number of inbound calls to phone numbers
             * associated with this connection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

            /**
             * Defines the list of codecs that Telnyx will send for inbound calls to a specific
             * number on your portal account, in priority order. This only works when the Connection
             * the number is assigned to uses Media Handling mode: default. OPUS and H.264 codecs
             * are available only when using TCP or TLS transport for SIP.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun codecs(): Optional<List<String>> = codecs.getOptional("codecs")

            /**
             * Default routing method to be used when a number is associated with the connection.
             * Must be one of the routing method types or left blank, other values are not allowed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun defaultRoutingMethod(): Optional<DefaultRoutingMethod> =
                defaultRoutingMethod.getOptional("default_routing_method")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dnisNumberFormat(): Optional<DnisNumberFormat> =
                dnisNumberFormat.getOptional("dnis_number_format")

            /**
             * Generate ringback tone through 183 session progress message with early media.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun generateRingbackTone(): Optional<Boolean> =
                generateRingbackTone.getOptional("generate_ringback_tone")

            /**
             * When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only
             * when available and only when using TCP or TLS transport.)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isupHeadersEnabled(): Optional<Boolean> =
                isupHeadersEnabled.getOptional("isup_headers_enabled")

            /**
             * Enable PRACK messages as defined in RFC3262.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun prackEnabled(): Optional<Boolean> = prackEnabled.getOptional("prack_enabled")

            /**
             * When enabled the SIP Connection will receive the Identity header with Shaken/Stir
             * data in the SIP INVITE message of inbound calls, even when using UDP transport.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun shakenStirEnabled(): Optional<Boolean> =
                shakenStirEnabled.getOptional("shaken_stir_enabled")

            /**
             * When enabled, allows multiple devices to ring simultaneously on incoming calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun simultaneousRinging(): Optional<SimultaneousRinging> =
                simultaneousRinging.getOptional("simultaneous_ringing")

            /**
             * Defaults to true.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipCompactHeadersEnabled(): Optional<Boolean> =
                sipCompactHeadersEnabled.getOptional("sip_compact_headers_enabled")

            /**
             * The Telnyx-generated SIP subdomain for this UAC connection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipSubdomain(): Optional<String> = sipSubdomain.getOptional("sip_subdomain")

            /**
             * Controls which SIP URI callers may reach this connection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipSubdomainReceiveSettings(): Optional<SipSubdomainReceiveSettings> =
                sipSubdomainReceiveSettings.getOptional("sip_subdomain_receive_settings")

            /**
             * Time(sec) before aborting if connection is not made.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout1xxSecs(): Optional<Long> = timeout1xxSecs.getOptional("timeout_1xx_secs")

            /**
             * Time(sec) before aborting if call is unanswered (min: 1, max: 600).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout2xxSecs(): Optional<Long> = timeout2xxSecs.getOptional("timeout_2xx_secs")

            /**
             * Returns the raw JSON value of [aniNumberFormat].
             *
             * Unlike [aniNumberFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [dnisNumberFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [shakenStirEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Returns the raw JSON value of [sipSubdomain].
             *
             * Unlike [sipSubdomain], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sip_subdomain")
            @ExcludeMissing
            fun _sipSubdomain(): JsonField<String> = sipSubdomain

            /**
             * Returns the raw JSON value of [sipSubdomainReceiveSettings].
             *
             * Unlike [sipSubdomainReceiveSettings], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("sip_subdomain_receive_settings")
            @ExcludeMissing
            fun _sipSubdomainReceiveSettings(): JsonField<SipSubdomainReceiveSettings> =
                sipSubdomainReceiveSettings

            /**
             * Returns the raw JSON value of [timeout1xxSecs].
             *
             * Unlike [timeout1xxSecs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("timeout_1xx_secs")
            @ExcludeMissing
            fun _timeout1xxSecs(): JsonField<Long> = timeout1xxSecs

            /**
             * Returns the raw JSON value of [timeout2xxSecs].
             *
             * Unlike [timeout2xxSecs], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                private var sipSubdomain: JsonField<String> = JsonMissing.of()
                private var sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> =
                    JsonMissing.of()
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
                    sipSubdomain = inbound.sipSubdomain
                    sipSubdomainReceiveSettings = inbound.sipSubdomainReceiveSettings
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
                 * You should usually call [Builder.aniNumberFormat] with a well-typed
                 * [AniNumberFormat] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun channelLimit(channelLimit: JsonField<Long>) = apply {
                    this.channelLimit = channelLimit
                }

                /**
                 * Defines the list of codecs that Telnyx will send for inbound calls to a specific
                 * number on your portal account, in priority order. This only works when the
                 * Connection the number is assigned to uses Media Handling mode: default. OPUS and
                 * H.264 codecs are available only when using TCP or TLS transport for SIP.
                 */
                fun codecs(codecs: List<String>) = codecs(JsonField.of(codecs))

                /**
                 * Sets [Builder.codecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.codecs] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Default routing method to be used when a number is associated with the
                 * connection. Must be one of the routing method types or left blank, other values
                 * are not allowed.
                 */
                fun defaultRoutingMethod(defaultRoutingMethod: DefaultRoutingMethod) =
                    defaultRoutingMethod(JsonField.of(defaultRoutingMethod))

                /**
                 * Sets [Builder.defaultRoutingMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defaultRoutingMethod] with a well-typed
                 * [DefaultRoutingMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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
                 * [DnisNumberFormat] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
                 * You should usually call [Builder.generateRingbackTone] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.shakenStirEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun shakenStirEnabled(shakenStirEnabled: JsonField<Boolean>) = apply {
                    this.shakenStirEnabled = shakenStirEnabled
                }

                /**
                 * When enabled, allows multiple devices to ring simultaneously on incoming calls.
                 */
                fun simultaneousRinging(simultaneousRinging: SimultaneousRinging) =
                    simultaneousRinging(JsonField.of(simultaneousRinging))

                /**
                 * Sets [Builder.simultaneousRinging] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.simultaneousRinging] with a well-typed
                 * [SimultaneousRinging] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun simultaneousRinging(simultaneousRinging: JsonField<SimultaneousRinging>) =
                    apply {
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

                /** The Telnyx-generated SIP subdomain for this UAC connection. */
                fun sipSubdomain(sipSubdomain: String) = sipSubdomain(JsonField.of(sipSubdomain))

                /**
                 * Sets [Builder.sipSubdomain] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipSubdomain] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sipSubdomain(sipSubdomain: JsonField<String>) = apply {
                    this.sipSubdomain = sipSubdomain
                }

                /** Controls which SIP URI callers may reach this connection. */
                fun sipSubdomainReceiveSettings(
                    sipSubdomainReceiveSettings: SipSubdomainReceiveSettings
                ) = sipSubdomainReceiveSettings(JsonField.of(sipSubdomainReceiveSettings))

                /**
                 * Sets [Builder.sipSubdomainReceiveSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipSubdomainReceiveSettings] with a well-typed
                 * [SipSubdomainReceiveSettings] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun sipSubdomainReceiveSettings(
                    sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings>
                ) = apply { this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings }

                /** Time(sec) before aborting if connection is not made. */
                fun timeout1xxSecs(timeout1xxSecs: Long) =
                    timeout1xxSecs(JsonField.of(timeout1xxSecs))

                /**
                 * Sets [Builder.timeout1xxSecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout1xxSecs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeout1xxSecs(timeout1xxSecs: JsonField<Long>) = apply {
                    this.timeout1xxSecs = timeout1xxSecs
                }

                /** Time(sec) before aborting if call is unanswered (min: 1, max: 600). */
                fun timeout2xxSecs(timeout2xxSecs: Long) =
                    timeout2xxSecs(JsonField.of(timeout2xxSecs))

                /**
                 * Sets [Builder.timeout2xxSecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout2xxSecs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                        sipSubdomain,
                        sipSubdomainReceiveSettings,
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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
                sipSubdomain()
                sipSubdomainReceiveSettings().ifPresent { it.validate() }
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
                    (if (sipSubdomain.asKnown().isPresent) 1 else 0) +
                    (sipSubdomainReceiveSettings.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (timeout1xxSecs.asKnown().isPresent) 1 else 0) +
                    (if (timeout2xxSecs.asKnown().isPresent) 1 else 0)

            /**
             * This setting allows you to set the format with which the caller's number (ANI) is
             * sent for inbound phone calls.
             */
            class AniNumberFormat
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An enum containing [AniNumberFormat]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AniNumberFormat] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PLUS_E_164,
                    E_164,
                    PLUS_E_164_NATIONAL,
                    E_164_NATIONAL,
                    /**
                     * An enum member indicating that [AniNumberFormat] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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
             * Default routing method to be used when a number is associated with the connection.
             * Must be one of the routing method types or left blank, other values are not allowed.
             */
            class DefaultRoutingMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An enum containing [DefaultRoutingMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [DefaultRoutingMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SEQUENTIAL,
                    ROUND_ROBIN,
                    /**
                     * An enum member indicating that [DefaultRoutingMethod] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SEQUENTIAL -> Known.SEQUENTIAL
                        ROUND_ROBIN -> Known.ROUND_ROBIN
                        else ->
                            throw TelnyxInvalidDataException("Unknown DefaultRoutingMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [DnisNumberFormat] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DISABLED -> Known.DISABLED
                        ENABLED -> Known.ENABLED
                        else ->
                            throw TelnyxInvalidDataException("Unknown SimultaneousRinging: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

            /** Controls which SIP URI callers may reach this connection. */
            class SipSubdomainReceiveSettings
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ONLY_MY_CONNECTIONS = of("only_my_connections")

                    @JvmField val FROM_ANYONE = of("from_anyone")

                    @JvmStatic
                    fun of(value: String) = SipSubdomainReceiveSettings(JsonField.of(value))
                }

                /** An enum containing [SipSubdomainReceiveSettings]'s known values. */
                enum class Known {
                    ONLY_MY_CONNECTIONS,
                    FROM_ANYONE,
                }

                /**
                 * An enum containing [SipSubdomainReceiveSettings]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [SipSubdomainReceiveSettings] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ONLY_MY_CONNECTIONS,
                    FROM_ANYONE,
                    /**
                     * An enum member indicating that [SipSubdomainReceiveSettings] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ONLY_MY_CONNECTIONS -> Value.ONLY_MY_CONNECTIONS
                        FROM_ANYONE -> Value.FROM_ANYONE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ONLY_MY_CONNECTIONS -> Known.ONLY_MY_CONNECTIONS
                        FROM_ANYONE -> Known.FROM_ANYONE
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown SipSubdomainReceiveSettings: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): SipSubdomainReceiveSettings = apply {
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

                    return other is SipSubdomainReceiveSettings && value == other.value
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
                    sipSubdomain == other.sipSubdomain &&
                    sipSubdomainReceiveSettings == other.sipSubdomainReceiveSettings &&
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
                    sipSubdomain,
                    sipSubdomainReceiveSettings,
                    timeout1xxSecs,
                    timeout2xxSecs,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Inbound{aniNumberFormat=$aniNumberFormat, channelLimit=$channelLimit, codecs=$codecs, defaultRoutingMethod=$defaultRoutingMethod, dnisNumberFormat=$dnisNumberFormat, generateRingbackTone=$generateRingbackTone, isupHeadersEnabled=$isupHeadersEnabled, prackEnabled=$prackEnabled, shakenStirEnabled=$shakenStirEnabled, simultaneousRinging=$simultaneousRinging, sipCompactHeadersEnabled=$sipCompactHeadersEnabled, sipSubdomain=$sipSubdomain, sipSubdomainReceiveSettings=$sipSubdomainReceiveSettings, timeout1xxSecs=$timeout1xxSecs, timeout2xxSecs=$timeout2xxSecs, additionalProperties=$additionalProperties}"
        }

        /** Internal Telnyx-side settings for a UAC connection. */
        class InternalUacSettings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destinationUri: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("destination_uri")
                @ExcludeMissing
                destinationUri: JsonField<String> = JsonMissing.of()
            ) : this(destinationUri, mutableMapOf())

            /**
             * The SIP URI that Telnyx will call when handling an inbound request from the external
             * peer. Do not include a `sip:` prefix. The value must be in the format
             * `userinfo@<subdomain.>sip.telnyx.com` or `userinfo@<subdomain.>sipdev.telnyx.com`;
             * the userinfo portion may contain only letters, digits, hyphens, and underscores.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destinationUri(): Optional<String> = destinationUri.getOptional("destination_uri")

            /**
             * Returns the raw JSON value of [destinationUri].
             *
             * Unlike [destinationUri], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destination_uri")
            @ExcludeMissing
            fun _destinationUri(): JsonField<String> = destinationUri

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
                 * Returns a mutable builder for constructing an instance of [InternalUacSettings].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InternalUacSettings]. */
            class Builder internal constructor() {

                private var destinationUri: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(internalUacSettings: InternalUacSettings) = apply {
                    destinationUri = internalUacSettings.destinationUri
                    additionalProperties = internalUacSettings.additionalProperties.toMutableMap()
                }

                /**
                 * The SIP URI that Telnyx will call when handling an inbound request from the
                 * external peer. Do not include a `sip:` prefix. The value must be in the format
                 * `userinfo@<subdomain.>sip.telnyx.com` or
                 * `userinfo@<subdomain.>sipdev.telnyx.com`; the userinfo portion may contain only
                 * letters, digits, hyphens, and underscores.
                 */
                fun destinationUri(destinationUri: String) =
                    destinationUri(JsonField.of(destinationUri))

                /**
                 * Sets [Builder.destinationUri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationUri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun destinationUri(destinationUri: JsonField<String>) = apply {
                    this.destinationUri = destinationUri
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [InternalUacSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InternalUacSettings =
                    InternalUacSettings(destinationUri, additionalProperties.toMutableMap())
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
            fun validate(): InternalUacSettings = apply {
                if (validated) {
                    return@apply
                }

                destinationUri()
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
            internal fun validity(): Int = (if (destinationUri.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InternalUacSettings &&
                    destinationUri == other.destinationUri &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(destinationUri, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InternalUacSettings{destinationUri=$destinationUri, additionalProperties=$additionalProperties}"
        }

        /**
         * Controls when noise suppression is applied to calls. When set to 'inbound', noise
         * suppression is applied to incoming audio. When set to 'outbound', it's applied to
         * outgoing audio. When set to 'both', it's applied in both directions. When set to
         * 'disabled', noise suppression is turned off.
         */
        class NoiseSuppression
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
             * An enum containing [NoiseSuppression]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [NoiseSuppression] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
                OUTBOUND,
                BOTH,
                DISABLED,
                /**
                 * An enum member indicating that [NoiseSuppression] was instantiated with an
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
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
                    BOTH -> Value.BOTH
                    DISABLED -> Value.DISABLED
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
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    BOTH -> Known.BOTH
                    DISABLED -> Known.DISABLED
                    else -> throw TelnyxInvalidDataException("Unknown NoiseSuppression: $value")
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

        class Outbound
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val aniOverride: JsonField<String>,
            private val aniOverrideType: JsonField<AniOverrideType>,
            private val callParkingEnabled: JsonField<Boolean>,
            private val channelLimit: JsonField<Long>,
            private val generateRingbackTone: JsonField<Boolean>,
            private val instantRingbackEnabled: JsonField<Boolean>,
            private val localization: JsonField<String>,
            private val outboundVoiceProfileId: JsonField<String>,
            private val t38ReinviteSource: JsonField<T38ReinviteSource>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ani_override")
                @ExcludeMissing
                aniOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ani_override_type")
                @ExcludeMissing
                aniOverrideType: JsonField<AniOverrideType> = JsonMissing.of(),
                @JsonProperty("call_parking_enabled")
                @ExcludeMissing
                callParkingEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("channel_limit")
                @ExcludeMissing
                channelLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("generate_ringback_tone")
                @ExcludeMissing
                generateRingbackTone: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("instant_ringback_enabled")
                @ExcludeMissing
                instantRingbackEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("localization")
                @ExcludeMissing
                localization: JsonField<String> = JsonMissing.of(),
                @JsonProperty("outbound_voice_profile_id")
                @ExcludeMissing
                outboundVoiceProfileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("t38_reinvite_source")
                @ExcludeMissing
                t38ReinviteSource: JsonField<T38ReinviteSource> = JsonMissing.of(),
            ) : this(
                aniOverride,
                aniOverrideType,
                callParkingEnabled,
                channelLimit,
                generateRingbackTone,
                instantRingbackEnabled,
                localization,
                outboundVoiceProfileId,
                t38ReinviteSource,
                mutableMapOf(),
            )

            /**
             * Set a phone number as the ani_override value to override caller id number on outbound
             * calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aniOverride(): Optional<String> = aniOverride.getOptional("ani_override")

            /**
             * Specifies when we apply your ani_override setting. Only applies when ani_override is
             * not blank.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aniOverrideType(): Optional<AniOverrideType> =
                aniOverrideType.getOptional("ani_override_type")

            /**
             * Forces all SIP calls originated on this connection to be "parked" instead of
             * "bridged" to the destination specified on the URI. Parked calls will return ringback
             * to the caller and will await for a Call Control command to define which action will
             * be taken next.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callParkingEnabled(): Optional<Boolean> =
                callParkingEnabled.getOptional("call_parking_enabled")

            /**
             * When set, this will limit the total number of outbound calls to phone numbers
             * associated with this connection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

            /**
             * Generate ringback tone through 183 session progress message with early media.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun generateRingbackTone(): Optional<Boolean> =
                generateRingbackTone.getOptional("generate_ringback_tone")

            /**
             * When set, ringback will not wait for indication before sending ringback tone to
             * calling party.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun instantRingbackEnabled(): Optional<Boolean> =
                instantRingbackEnabled.getOptional("instant_ringback_enabled")

            /**
             * A 2-character country code specifying the country whose national dialing rules should
             * be used. For example, if set to `US` then any US number can be dialed without
             * preprending +1 to the number. When left blank, Telnyx will try US and GB dialing
             * rules, in that order, by default.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun localization(): Optional<String> = localization.getOptional("localization")

            /**
             * Identifies the associated outbound voice profile.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun outboundVoiceProfileId(): Optional<String> =
                outboundVoiceProfileId.getOptional("outbound_voice_profile_id")

            /**
             * This setting only affects connections with Fax-type Outbound Voice Profiles. The
             * setting dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default,
             * Telnyx will send the re-invite. If set to `customer`, the caller is expected to send
             * the t.38 reinvite.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun t38ReinviteSource(): Optional<T38ReinviteSource> =
                t38ReinviteSource.getOptional("t38_reinvite_source")

            /**
             * Returns the raw JSON value of [aniOverride].
             *
             * Unlike [aniOverride], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ani_override")
            @ExcludeMissing
            fun _aniOverride(): JsonField<String> = aniOverride

            /**
             * Returns the raw JSON value of [aniOverrideType].
             *
             * Unlike [aniOverrideType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ani_override_type")
            @ExcludeMissing
            fun _aniOverrideType(): JsonField<AniOverrideType> = aniOverrideType

            /**
             * Returns the raw JSON value of [callParkingEnabled].
             *
             * Unlike [callParkingEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("call_parking_enabled")
            @ExcludeMissing
            fun _callParkingEnabled(): JsonField<Boolean> = callParkingEnabled

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
             * Returns the raw JSON value of [generateRingbackTone].
             *
             * Unlike [generateRingbackTone], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("generate_ringback_tone")
            @ExcludeMissing
            fun _generateRingbackTone(): JsonField<Boolean> = generateRingbackTone

            /**
             * Returns the raw JSON value of [instantRingbackEnabled].
             *
             * Unlike [instantRingbackEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("instant_ringback_enabled")
            @ExcludeMissing
            fun _instantRingbackEnabled(): JsonField<Boolean> = instantRingbackEnabled

            /**
             * Returns the raw JSON value of [localization].
             *
             * Unlike [localization], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("localization")
            @ExcludeMissing
            fun _localization(): JsonField<String> = localization

            /**
             * Returns the raw JSON value of [outboundVoiceProfileId].
             *
             * Unlike [outboundVoiceProfileId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("outbound_voice_profile_id")
            @ExcludeMissing
            fun _outboundVoiceProfileId(): JsonField<String> = outboundVoiceProfileId

            /**
             * Returns the raw JSON value of [t38ReinviteSource].
             *
             * Unlike [t38ReinviteSource], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("t38_reinvite_source")
            @ExcludeMissing
            fun _t38ReinviteSource(): JsonField<T38ReinviteSource> = t38ReinviteSource

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

                /** Returns a mutable builder for constructing an instance of [Outbound]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Outbound]. */
            class Builder internal constructor() {

                private var aniOverride: JsonField<String> = JsonMissing.of()
                private var aniOverrideType: JsonField<AniOverrideType> = JsonMissing.of()
                private var callParkingEnabled: JsonField<Boolean> = JsonMissing.of()
                private var channelLimit: JsonField<Long> = JsonMissing.of()
                private var generateRingbackTone: JsonField<Boolean> = JsonMissing.of()
                private var instantRingbackEnabled: JsonField<Boolean> = JsonMissing.of()
                private var localization: JsonField<String> = JsonMissing.of()
                private var outboundVoiceProfileId: JsonField<String> = JsonMissing.of()
                private var t38ReinviteSource: JsonField<T38ReinviteSource> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(outbound: Outbound) = apply {
                    aniOverride = outbound.aniOverride
                    aniOverrideType = outbound.aniOverrideType
                    callParkingEnabled = outbound.callParkingEnabled
                    channelLimit = outbound.channelLimit
                    generateRingbackTone = outbound.generateRingbackTone
                    instantRingbackEnabled = outbound.instantRingbackEnabled
                    localization = outbound.localization
                    outboundVoiceProfileId = outbound.outboundVoiceProfileId
                    t38ReinviteSource = outbound.t38ReinviteSource
                    additionalProperties = outbound.additionalProperties.toMutableMap()
                }

                /**
                 * Set a phone number as the ani_override value to override caller id number on
                 * outbound calls.
                 */
                fun aniOverride(aniOverride: String) = aniOverride(JsonField.of(aniOverride))

                /**
                 * Sets [Builder.aniOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aniOverride] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun aniOverride(aniOverride: JsonField<String>) = apply {
                    this.aniOverride = aniOverride
                }

                /**
                 * Specifies when we apply your ani_override setting. Only applies when ani_override
                 * is not blank.
                 */
                fun aniOverrideType(aniOverrideType: AniOverrideType) =
                    aniOverrideType(JsonField.of(aniOverrideType))

                /**
                 * Sets [Builder.aniOverrideType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aniOverrideType] with a well-typed
                 * [AniOverrideType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun aniOverrideType(aniOverrideType: JsonField<AniOverrideType>) = apply {
                    this.aniOverrideType = aniOverrideType
                }

                /**
                 * Forces all SIP calls originated on this connection to be "parked" instead of
                 * "bridged" to the destination specified on the URI. Parked calls will return
                 * ringback to the caller and will await for a Call Control command to define which
                 * action will be taken next.
                 */
                fun callParkingEnabled(callParkingEnabled: Boolean?) =
                    callParkingEnabled(JsonField.ofNullable(callParkingEnabled))

                /**
                 * Alias for [Builder.callParkingEnabled].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun callParkingEnabled(callParkingEnabled: Boolean) =
                    callParkingEnabled(callParkingEnabled as Boolean?)

                /**
                 * Alias for calling [Builder.callParkingEnabled] with
                 * `callParkingEnabled.orElse(null)`.
                 */
                fun callParkingEnabled(callParkingEnabled: Optional<Boolean>) =
                    callParkingEnabled(callParkingEnabled.getOrNull())

                /**
                 * Sets [Builder.callParkingEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callParkingEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun callParkingEnabled(callParkingEnabled: JsonField<Boolean>) = apply {
                    this.callParkingEnabled = callParkingEnabled
                }

                /**
                 * When set, this will limit the total number of outbound calls to phone numbers
                 * associated with this connection.
                 */
                fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

                /**
                 * Sets [Builder.channelLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channelLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun channelLimit(channelLimit: JsonField<Long>) = apply {
                    this.channelLimit = channelLimit
                }

                /** Generate ringback tone through 183 session progress message with early media. */
                fun generateRingbackTone(generateRingbackTone: Boolean) =
                    generateRingbackTone(JsonField.of(generateRingbackTone))

                /**
                 * Sets [Builder.generateRingbackTone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.generateRingbackTone] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun generateRingbackTone(generateRingbackTone: JsonField<Boolean>) = apply {
                    this.generateRingbackTone = generateRingbackTone
                }

                /**
                 * When set, ringback will not wait for indication before sending ringback tone to
                 * calling party.
                 */
                fun instantRingbackEnabled(instantRingbackEnabled: Boolean) =
                    instantRingbackEnabled(JsonField.of(instantRingbackEnabled))

                /**
                 * Sets [Builder.instantRingbackEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instantRingbackEnabled] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun instantRingbackEnabled(instantRingbackEnabled: JsonField<Boolean>) = apply {
                    this.instantRingbackEnabled = instantRingbackEnabled
                }

                /**
                 * A 2-character country code specifying the country whose national dialing rules
                 * should be used. For example, if set to `US` then any US number can be dialed
                 * without preprending +1 to the number. When left blank, Telnyx will try US and GB
                 * dialing rules, in that order, by default.
                 */
                fun localization(localization: String) = localization(JsonField.of(localization))

                /**
                 * Sets [Builder.localization] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localization] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun localization(localization: JsonField<String>) = apply {
                    this.localization = localization
                }

                /** Identifies the associated outbound voice profile. */
                fun outboundVoiceProfileId(outboundVoiceProfileId: String) =
                    outboundVoiceProfileId(JsonField.of(outboundVoiceProfileId))

                /**
                 * Sets [Builder.outboundVoiceProfileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outboundVoiceProfileId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun outboundVoiceProfileId(outboundVoiceProfileId: JsonField<String>) = apply {
                    this.outboundVoiceProfileId = outboundVoiceProfileId
                }

                /**
                 * This setting only affects connections with Fax-type Outbound Voice Profiles. The
                 * setting dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By
                 * default, Telnyx will send the re-invite. If set to `customer`, the caller is
                 * expected to send the t.38 reinvite.
                 */
                fun t38ReinviteSource(t38ReinviteSource: T38ReinviteSource) =
                    t38ReinviteSource(JsonField.of(t38ReinviteSource))

                /**
                 * Sets [Builder.t38ReinviteSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.t38ReinviteSource] with a well-typed
                 * [T38ReinviteSource] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun t38ReinviteSource(t38ReinviteSource: JsonField<T38ReinviteSource>) = apply {
                    this.t38ReinviteSource = t38ReinviteSource
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Outbound].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Outbound =
                    Outbound(
                        aniOverride,
                        aniOverrideType,
                        callParkingEnabled,
                        channelLimit,
                        generateRingbackTone,
                        instantRingbackEnabled,
                        localization,
                        outboundVoiceProfileId,
                        t38ReinviteSource,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Outbound = apply {
                if (validated) {
                    return@apply
                }

                aniOverride()
                aniOverrideType().ifPresent { it.validate() }
                callParkingEnabled()
                channelLimit()
                generateRingbackTone()
                instantRingbackEnabled()
                localization()
                outboundVoiceProfileId()
                t38ReinviteSource().ifPresent { it.validate() }
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
                (if (aniOverride.asKnown().isPresent) 1 else 0) +
                    (aniOverrideType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callParkingEnabled.asKnown().isPresent) 1 else 0) +
                    (if (channelLimit.asKnown().isPresent) 1 else 0) +
                    (if (generateRingbackTone.asKnown().isPresent) 1 else 0) +
                    (if (instantRingbackEnabled.asKnown().isPresent) 1 else 0) +
                    (if (localization.asKnown().isPresent) 1 else 0) +
                    (if (outboundVoiceProfileId.asKnown().isPresent) 1 else 0) +
                    (t38ReinviteSource.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Specifies when we apply your ani_override setting. Only applies when ani_override is
             * not blank.
             */
            class AniOverrideType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ALWAYS = of("always")

                    @JvmField val NORMAL = of("normal")

                    @JvmField val EMERGENCY = of("emergency")

                    @JvmStatic fun of(value: String) = AniOverrideType(JsonField.of(value))
                }

                /** An enum containing [AniOverrideType]'s known values. */
                enum class Known {
                    ALWAYS,
                    NORMAL,
                    EMERGENCY,
                }

                /**
                 * An enum containing [AniOverrideType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AniOverrideType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALWAYS,
                    NORMAL,
                    EMERGENCY,
                    /**
                     * An enum member indicating that [AniOverrideType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ALWAYS -> Value.ALWAYS
                        NORMAL -> Value.NORMAL
                        EMERGENCY -> Value.EMERGENCY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ALWAYS -> Known.ALWAYS
                        NORMAL -> Known.NORMAL
                        EMERGENCY -> Known.EMERGENCY
                        else -> throw TelnyxInvalidDataException("Unknown AniOverrideType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): AniOverrideType = apply {
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

                    return other is AniOverrideType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * This setting only affects connections with Fax-type Outbound Voice Profiles. The
             * setting dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default,
             * Telnyx will send the re-invite. If set to `customer`, the caller is expected to send
             * the t.38 reinvite.
             */
            class T38ReinviteSource
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TELNYX = of("telnyx")

                    @JvmField val CUSTOMER = of("customer")

                    @JvmField val DISABLED = of("disabled")

                    @JvmField val PASSTHRU = of("passthru")

                    @JvmField val CALLER_PASSTHRU = of("caller-passthru")

                    @JvmField val CALLEE_PASSTHRU = of("callee-passthru")

                    @JvmStatic fun of(value: String) = T38ReinviteSource(JsonField.of(value))
                }

                /** An enum containing [T38ReinviteSource]'s known values. */
                enum class Known {
                    TELNYX,
                    CUSTOMER,
                    DISABLED,
                    PASSTHRU,
                    CALLER_PASSTHRU,
                    CALLEE_PASSTHRU,
                }

                /**
                 * An enum containing [T38ReinviteSource]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [T38ReinviteSource] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TELNYX,
                    CUSTOMER,
                    DISABLED,
                    PASSTHRU,
                    CALLER_PASSTHRU,
                    CALLEE_PASSTHRU,
                    /**
                     * An enum member indicating that [T38ReinviteSource] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TELNYX -> Value.TELNYX
                        CUSTOMER -> Value.CUSTOMER
                        DISABLED -> Value.DISABLED
                        PASSTHRU -> Value.PASSTHRU
                        CALLER_PASSTHRU -> Value.CALLER_PASSTHRU
                        CALLEE_PASSTHRU -> Value.CALLEE_PASSTHRU
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TELNYX -> Known.TELNYX
                        CUSTOMER -> Known.CUSTOMER
                        DISABLED -> Known.DISABLED
                        PASSTHRU -> Known.PASSTHRU
                        CALLER_PASSTHRU -> Known.CALLER_PASSTHRU
                        CALLEE_PASSTHRU -> Known.CALLEE_PASSTHRU
                        else ->
                            throw TelnyxInvalidDataException("Unknown T38ReinviteSource: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): T38ReinviteSource = apply {
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

                    return other is T38ReinviteSource && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Outbound &&
                    aniOverride == other.aniOverride &&
                    aniOverrideType == other.aniOverrideType &&
                    callParkingEnabled == other.callParkingEnabled &&
                    channelLimit == other.channelLimit &&
                    generateRingbackTone == other.generateRingbackTone &&
                    instantRingbackEnabled == other.instantRingbackEnabled &&
                    localization == other.localization &&
                    outboundVoiceProfileId == other.outboundVoiceProfileId &&
                    t38ReinviteSource == other.t38ReinviteSource &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    aniOverride,
                    aniOverrideType,
                    callParkingEnabled,
                    channelLimit,
                    generateRingbackTone,
                    instantRingbackEnabled,
                    localization,
                    outboundVoiceProfileId,
                    t38ReinviteSource,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Outbound{aniOverride=$aniOverride, aniOverrideType=$aniOverrideType, callParkingEnabled=$callParkingEnabled, channelLimit=$channelLimit, generateRingbackTone=$generateRingbackTone, instantRingbackEnabled=$instantRingbackEnabled, localization=$localization, outboundVoiceProfileId=$outboundVoiceProfileId, t38ReinviteSource=$t38ReinviteSource, additionalProperties=$additionalProperties}"
        }

        /**
         * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled
         * for all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will
         * be connected to your Connection. You can also choose to allow only calls that are
         * originated on any Connections under your account (internal).
         */
        class SipUriCallingPreference
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DISABLED -> Known.DISABLED
                    UNRESTRICTED -> Known.UNRESTRICTED
                    INTERNAL -> Known.INTERNAL
                    else ->
                        throw TelnyxInvalidDataException("Unknown SipUriCallingPreference: $value")
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

        /** Determines which webhook format will be used, Telnyx API v1 or v2. */
        class WebhookApiVersion
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
             * An enum containing [WebhookApiVersion]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [WebhookApiVersion] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                V1,
                V2,
                /**
                 * An enum member indicating that [WebhookApiVersion] was instantiated with an
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
                    V1 -> Value.V1
                    V2 -> Value.V2
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
                    V1 -> Known.V1
                    V2 -> Known.V2
                    else -> throw TelnyxInvalidDataException("Unknown WebhookApiVersion: $value")
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

            return other is Data &&
                id == other.id &&
                active == other.active &&
                anchorsiteOverride == other.anchorsiteOverride &&
                androidPushCredentialId == other.androidPushCredentialId &&
                authentication == other.authentication &&
                callCostInWebhooks == other.callCostInWebhooks &&
                connectionName == other.connectionName &&
                createdAt == other.createdAt &&
                defaultOnHoldComfortNoiseEnabled == other.defaultOnHoldComfortNoiseEnabled &&
                dtmfType == other.dtmfType &&
                encodeContactHeaderEnabled == other.encodeContactHeaderEnabled &&
                encryptedMedia == other.encryptedMedia &&
                externalUacSettings == other.externalUacSettings &&
                fqdn == other.fqdn &&
                fqdnOutboundAuthentication == other.fqdnOutboundAuthentication &&
                fqdns == other.fqdns &&
                inbound == other.inbound &&
                internalUacSettings == other.internalUacSettings &&
                iosPushCredentialId == other.iosPushCredentialId &&
                jitterBuffer == other.jitterBuffer &&
                noiseSuppression == other.noiseSuppression &&
                noiseSuppressionDetails == other.noiseSuppressionDetails &&
                onnetT38PassthroughEnabled == other.onnetT38PassthroughEnabled &&
                outbound == other.outbound &&
                password == other.password &&
                recordType == other.recordType &&
                registrationStatus == other.registrationStatus &&
                registrationStatusUpdatedAt == other.registrationStatusUpdatedAt &&
                rtcpSettings == other.rtcpSettings &&
                sipUriCallingPreference == other.sipUriCallingPreference &&
                tags == other.tags &&
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
                id,
                active,
                anchorsiteOverride,
                androidPushCredentialId,
                authentication,
                callCostInWebhooks,
                connectionName,
                createdAt,
                defaultOnHoldComfortNoiseEnabled,
                dtmfType,
                encodeContactHeaderEnabled,
                encryptedMedia,
                externalUacSettings,
                fqdn,
                fqdnOutboundAuthentication,
                fqdns,
                inbound,
                internalUacSettings,
                iosPushCredentialId,
                jitterBuffer,
                noiseSuppression,
                noiseSuppressionDetails,
                onnetT38PassthroughEnabled,
                outbound,
                password,
                recordType,
                registrationStatus,
                registrationStatusUpdatedAt,
                rtcpSettings,
                sipUriCallingPreference,
                tags,
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
            "Data{id=$id, active=$active, anchorsiteOverride=$anchorsiteOverride, androidPushCredentialId=$androidPushCredentialId, authentication=$authentication, callCostInWebhooks=$callCostInWebhooks, connectionName=$connectionName, createdAt=$createdAt, defaultOnHoldComfortNoiseEnabled=$defaultOnHoldComfortNoiseEnabled, dtmfType=$dtmfType, encodeContactHeaderEnabled=$encodeContactHeaderEnabled, encryptedMedia=$encryptedMedia, externalUacSettings=$externalUacSettings, fqdn=$fqdn, fqdnOutboundAuthentication=$fqdnOutboundAuthentication, fqdns=$fqdns, inbound=$inbound, internalUacSettings=$internalUacSettings, iosPushCredentialId=$iosPushCredentialId, jitterBuffer=$jitterBuffer, noiseSuppression=$noiseSuppression, noiseSuppressionDetails=$noiseSuppressionDetails, onnetT38PassthroughEnabled=$onnetT38PassthroughEnabled, outbound=$outbound, password=$password, recordType=$recordType, registrationStatus=$registrationStatus, registrationStatusUpdatedAt=$registrationStatusUpdatedAt, rtcpSettings=$rtcpSettings, sipUriCallingPreference=$sipUriCallingPreference, tags=$tags, updatedAt=$updatedAt, userName=$userName, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UacConnectionCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UacConnectionCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
