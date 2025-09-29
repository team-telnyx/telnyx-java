// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.fqdnconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InboundFqdn
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aniNumberFormat: JsonField<AniNumberFormat>,
    private val channelLimit: JsonField<Long>,
    private val codecs: JsonField<List<String>>,
    private val defaultPrimaryFqdnId: JsonField<String>,
    private val defaultRoutingMethod: JsonField<DefaultRoutingMethod>,
    private val defaultSecondaryFqdnId: JsonField<String>,
    private val defaultTertiaryFqdnId: JsonField<String>,
    private val dnisNumberFormat: JsonField<DnisNumberFormat>,
    private val generateRingbackTone: JsonField<Boolean>,
    private val isupHeadersEnabled: JsonField<Boolean>,
    private val prackEnabled: JsonField<Boolean>,
    private val shakenStirEnabled: JsonField<Boolean>,
    private val sipCompactHeadersEnabled: JsonField<Boolean>,
    private val sipRegion: JsonField<SipRegion>,
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
        @JsonProperty("codecs") @ExcludeMissing codecs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("default_primary_fqdn_id")
        @ExcludeMissing
        defaultPrimaryFqdnId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_routing_method")
        @ExcludeMissing
        defaultRoutingMethod: JsonField<DefaultRoutingMethod> = JsonMissing.of(),
        @JsonProperty("default_secondary_fqdn_id")
        @ExcludeMissing
        defaultSecondaryFqdnId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_tertiary_fqdn_id")
        @ExcludeMissing
        defaultTertiaryFqdnId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("sip_compact_headers_enabled")
        @ExcludeMissing
        sipCompactHeadersEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sip_region")
        @ExcludeMissing
        sipRegion: JsonField<SipRegion> = JsonMissing.of(),
        @JsonProperty("sip_subdomain")
        @ExcludeMissing
        sipSubdomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sip_subdomain_receive_settings")
        @ExcludeMissing
        sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> = JsonMissing.of(),
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
        defaultPrimaryFqdnId,
        defaultRoutingMethod,
        defaultSecondaryFqdnId,
        defaultTertiaryFqdnId,
        dnisNumberFormat,
        generateRingbackTone,
        isupHeadersEnabled,
        prackEnabled,
        shakenStirEnabled,
        sipCompactHeadersEnabled,
        sipRegion,
        sipSubdomain,
        sipSubdomainReceiveSettings,
        timeout1xxSecs,
        timeout2xxSecs,
        mutableMapOf(),
    )

    /**
     * This setting allows you to set the format with which the caller's number (ANI) is sent for
     * inbound phone calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aniNumberFormat(): Optional<AniNumberFormat> =
        aniNumberFormat.getOptional("ani_number_format")

    /**
     * When set, this will limit the total number of inbound calls to phone numbers associated with
     * this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

    /**
     * Defines the list of codecs that Telnyx will send for inbound calls to a specific number on
     * your portal account, in priority order. This only works when the Connection the number is
     * assigned to uses Media Handling mode: default. OPUS and H.264 codecs are available only when
     * using TCP or TLS transport for SIP.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codecs(): Optional<List<String>> = codecs.getOptional("codecs")

    /**
     * The default primary FQDN to use for the number. Only settable if the connection is of FQDN
     * type. Value must be the ID of an FQDN set on the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultPrimaryFqdnId(): Optional<String> =
        defaultPrimaryFqdnId.getOptional("default_primary_fqdn_id")

    /**
     * Default routing method to be used when a number is associated with the connection. Must be
     * one of the routing method types or null, other values are not allowed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultRoutingMethod(): Optional<DefaultRoutingMethod> =
        defaultRoutingMethod.getOptional("default_routing_method")

    /**
     * The default secondary FQDN to use for the number. Only settable if the connection is of FQDN
     * type. Value must be the ID of an FQDN set on the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultSecondaryFqdnId(): Optional<String> =
        defaultSecondaryFqdnId.getOptional("default_secondary_fqdn_id")

    /**
     * The default tertiary FQDN to use for the number. Only settable if the connection is of FQDN
     * type. Value must be the ID of an FQDN set on the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultTertiaryFqdnId(): Optional<String> =
        defaultTertiaryFqdnId.getOptional("default_tertiary_fqdn_id")

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
     * When enabled the SIP Connection will receive the Identity header with Shaken/Stir data in the
     * SIP INVITE message of inbound calls, even when using UDP transport.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shakenStirEnabled(): Optional<Boolean> =
        shakenStirEnabled.getOptional("shaken_stir_enabled")

    /**
     * Defaults to true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipCompactHeadersEnabled(): Optional<Boolean> =
        sipCompactHeadersEnabled.getOptional("sip_compact_headers_enabled")

    /**
     * Selects which `sip_region` to receive inbound calls from. If null, the default region (US)
     * will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipRegion(): Optional<SipRegion> = sipRegion.getOptional("sip_region")

    /**
     * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the same
     * way a phone number is used, from a SIP endpoint. Example: the subdomain
     * "example.sip.telnyx.com" can be called from any SIP endpoint by using the SIP URI
     * "sip:@example.sip.telnyx.com" where the user part can be any alphanumeric value. Please note
     * TLS encrypted calls are not allowed for subdomain calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipSubdomain(): Optional<String> = sipSubdomain.getOptional("sip_subdomain")

    /**
     * This option can be enabled to receive calls from: "Anyone" (any SIP endpoint in the public
     * Internet) or "Only my connections" (any connection assigned to the same Telnyx user).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipSubdomainReceiveSettings(): Optional<SipSubdomainReceiveSettings> =
        sipSubdomainReceiveSettings.getOptional("sip_subdomain_receive_settings")

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
     * Unlike [aniNumberFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ani_number_format")
    @ExcludeMissing
    fun _aniNumberFormat(): JsonField<AniNumberFormat> = aniNumberFormat

    /**
     * Returns the raw JSON value of [channelLimit].
     *
     * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [defaultPrimaryFqdnId].
     *
     * Unlike [defaultPrimaryFqdnId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_primary_fqdn_id")
    @ExcludeMissing
    fun _defaultPrimaryFqdnId(): JsonField<String> = defaultPrimaryFqdnId

    /**
     * Returns the raw JSON value of [defaultRoutingMethod].
     *
     * Unlike [defaultRoutingMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_routing_method")
    @ExcludeMissing
    fun _defaultRoutingMethod(): JsonField<DefaultRoutingMethod> = defaultRoutingMethod

    /**
     * Returns the raw JSON value of [defaultSecondaryFqdnId].
     *
     * Unlike [defaultSecondaryFqdnId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("default_secondary_fqdn_id")
    @ExcludeMissing
    fun _defaultSecondaryFqdnId(): JsonField<String> = defaultSecondaryFqdnId

    /**
     * Returns the raw JSON value of [defaultTertiaryFqdnId].
     *
     * Unlike [defaultTertiaryFqdnId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_tertiary_fqdn_id")
    @ExcludeMissing
    fun _defaultTertiaryFqdnId(): JsonField<String> = defaultTertiaryFqdnId

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
     * Unlike [generateRingbackTone], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("generate_ringback_tone")
    @ExcludeMissing
    fun _generateRingbackTone(): JsonField<Boolean> = generateRingbackTone

    /**
     * Returns the raw JSON value of [isupHeadersEnabled].
     *
     * Unlike [isupHeadersEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isup_headers_enabled")
    @ExcludeMissing
    fun _isupHeadersEnabled(): JsonField<Boolean> = isupHeadersEnabled

    /**
     * Returns the raw JSON value of [prackEnabled].
     *
     * Unlike [prackEnabled], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [sipCompactHeadersEnabled].
     *
     * Unlike [sipCompactHeadersEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sip_compact_headers_enabled")
    @ExcludeMissing
    fun _sipCompactHeadersEnabled(): JsonField<Boolean> = sipCompactHeadersEnabled

    /**
     * Returns the raw JSON value of [sipRegion].
     *
     * Unlike [sipRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sip_region") @ExcludeMissing fun _sipRegion(): JsonField<SipRegion> = sipRegion

    /**
     * Returns the raw JSON value of [sipSubdomain].
     *
     * Unlike [sipSubdomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sip_subdomain")
    @ExcludeMissing
    fun _sipSubdomain(): JsonField<String> = sipSubdomain

    /**
     * Returns the raw JSON value of [sipSubdomainReceiveSettings].
     *
     * Unlike [sipSubdomainReceiveSettings], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sip_subdomain_receive_settings")
    @ExcludeMissing
    fun _sipSubdomainReceiveSettings(): JsonField<SipSubdomainReceiveSettings> =
        sipSubdomainReceiveSettings

    /**
     * Returns the raw JSON value of [timeout1xxSecs].
     *
     * Unlike [timeout1xxSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_1xx_secs")
    @ExcludeMissing
    fun _timeout1xxSecs(): JsonField<Long> = timeout1xxSecs

    /**
     * Returns the raw JSON value of [timeout2xxSecs].
     *
     * Unlike [timeout2xxSecs], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [InboundFqdn]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundFqdn]. */
    class Builder internal constructor() {

        private var aniNumberFormat: JsonField<AniNumberFormat> = JsonMissing.of()
        private var channelLimit: JsonField<Long> = JsonMissing.of()
        private var codecs: JsonField<MutableList<String>>? = null
        private var defaultPrimaryFqdnId: JsonField<String> = JsonMissing.of()
        private var defaultRoutingMethod: JsonField<DefaultRoutingMethod> = JsonMissing.of()
        private var defaultSecondaryFqdnId: JsonField<String> = JsonMissing.of()
        private var defaultTertiaryFqdnId: JsonField<String> = JsonMissing.of()
        private var dnisNumberFormat: JsonField<DnisNumberFormat> = JsonMissing.of()
        private var generateRingbackTone: JsonField<Boolean> = JsonMissing.of()
        private var isupHeadersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var prackEnabled: JsonField<Boolean> = JsonMissing.of()
        private var shakenStirEnabled: JsonField<Boolean> = JsonMissing.of()
        private var sipCompactHeadersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var sipRegion: JsonField<SipRegion> = JsonMissing.of()
        private var sipSubdomain: JsonField<String> = JsonMissing.of()
        private var sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> =
            JsonMissing.of()
        private var timeout1xxSecs: JsonField<Long> = JsonMissing.of()
        private var timeout2xxSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundFqdn: InboundFqdn) = apply {
            aniNumberFormat = inboundFqdn.aniNumberFormat
            channelLimit = inboundFqdn.channelLimit
            codecs = inboundFqdn.codecs.map { it.toMutableList() }
            defaultPrimaryFqdnId = inboundFqdn.defaultPrimaryFqdnId
            defaultRoutingMethod = inboundFqdn.defaultRoutingMethod
            defaultSecondaryFqdnId = inboundFqdn.defaultSecondaryFqdnId
            defaultTertiaryFqdnId = inboundFqdn.defaultTertiaryFqdnId
            dnisNumberFormat = inboundFqdn.dnisNumberFormat
            generateRingbackTone = inboundFqdn.generateRingbackTone
            isupHeadersEnabled = inboundFqdn.isupHeadersEnabled
            prackEnabled = inboundFqdn.prackEnabled
            shakenStirEnabled = inboundFqdn.shakenStirEnabled
            sipCompactHeadersEnabled = inboundFqdn.sipCompactHeadersEnabled
            sipRegion = inboundFqdn.sipRegion
            sipSubdomain = inboundFqdn.sipSubdomain
            sipSubdomainReceiveSettings = inboundFqdn.sipSubdomainReceiveSettings
            timeout1xxSecs = inboundFqdn.timeout1xxSecs
            timeout2xxSecs = inboundFqdn.timeout2xxSecs
            additionalProperties = inboundFqdn.additionalProperties.toMutableMap()
        }

        /**
         * This setting allows you to set the format with which the caller's number (ANI) is sent
         * for inbound phone calls.
         */
        fun aniNumberFormat(aniNumberFormat: AniNumberFormat) =
            aniNumberFormat(JsonField.of(aniNumberFormat))

        /**
         * Sets [Builder.aniNumberFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aniNumberFormat] with a well-typed [AniNumberFormat]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aniNumberFormat(aniNumberFormat: JsonField<AniNumberFormat>) = apply {
            this.aniNumberFormat = aniNumberFormat
        }

        /**
         * When set, this will limit the total number of inbound calls to phone numbers associated
         * with this connection.
         */
        fun channelLimit(channelLimit: Long?) = channelLimit(JsonField.ofNullable(channelLimit))

        /**
         * Alias for [Builder.channelLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun channelLimit(channelLimit: Long) = channelLimit(channelLimit as Long?)

        /** Alias for calling [Builder.channelLimit] with `channelLimit.orElse(null)`. */
        fun channelLimit(channelLimit: Optional<Long>) = channelLimit(channelLimit.getOrNull())

        /**
         * Sets [Builder.channelLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelLimit(channelLimit: JsonField<Long>) = apply { this.channelLimit = channelLimit }

        /**
         * Defines the list of codecs that Telnyx will send for inbound calls to a specific number
         * on your portal account, in priority order. This only works when the Connection the number
         * is assigned to uses Media Handling mode: default. OPUS and H.264 codecs are available
         * only when using TCP or TLS transport for SIP.
         */
        fun codecs(codecs: List<String>) = codecs(JsonField.of(codecs))

        /**
         * Sets [Builder.codecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codecs] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * The default primary FQDN to use for the number. Only settable if the connection is of
         * FQDN type. Value must be the ID of an FQDN set on the connection.
         */
        fun defaultPrimaryFqdnId(defaultPrimaryFqdnId: String?) =
            defaultPrimaryFqdnId(JsonField.ofNullable(defaultPrimaryFqdnId))

        /**
         * Alias for calling [Builder.defaultPrimaryFqdnId] with
         * `defaultPrimaryFqdnId.orElse(null)`.
         */
        fun defaultPrimaryFqdnId(defaultPrimaryFqdnId: Optional<String>) =
            defaultPrimaryFqdnId(defaultPrimaryFqdnId.getOrNull())

        /**
         * Sets [Builder.defaultPrimaryFqdnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultPrimaryFqdnId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultPrimaryFqdnId(defaultPrimaryFqdnId: JsonField<String>) = apply {
            this.defaultPrimaryFqdnId = defaultPrimaryFqdnId
        }

        /**
         * Default routing method to be used when a number is associated with the connection. Must
         * be one of the routing method types or null, other values are not allowed.
         */
        fun defaultRoutingMethod(defaultRoutingMethod: DefaultRoutingMethod?) =
            defaultRoutingMethod(JsonField.ofNullable(defaultRoutingMethod))

        /**
         * Alias for calling [Builder.defaultRoutingMethod] with
         * `defaultRoutingMethod.orElse(null)`.
         */
        fun defaultRoutingMethod(defaultRoutingMethod: Optional<DefaultRoutingMethod>) =
            defaultRoutingMethod(defaultRoutingMethod.getOrNull())

        /**
         * Sets [Builder.defaultRoutingMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultRoutingMethod] with a well-typed
         * [DefaultRoutingMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun defaultRoutingMethod(defaultRoutingMethod: JsonField<DefaultRoutingMethod>) = apply {
            this.defaultRoutingMethod = defaultRoutingMethod
        }

        /**
         * The default secondary FQDN to use for the number. Only settable if the connection is of
         * FQDN type. Value must be the ID of an FQDN set on the connection.
         */
        fun defaultSecondaryFqdnId(defaultSecondaryFqdnId: String?) =
            defaultSecondaryFqdnId(JsonField.ofNullable(defaultSecondaryFqdnId))

        /**
         * Alias for calling [Builder.defaultSecondaryFqdnId] with
         * `defaultSecondaryFqdnId.orElse(null)`.
         */
        fun defaultSecondaryFqdnId(defaultSecondaryFqdnId: Optional<String>) =
            defaultSecondaryFqdnId(defaultSecondaryFqdnId.getOrNull())

        /**
         * Sets [Builder.defaultSecondaryFqdnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultSecondaryFqdnId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultSecondaryFqdnId(defaultSecondaryFqdnId: JsonField<String>) = apply {
            this.defaultSecondaryFqdnId = defaultSecondaryFqdnId
        }

        /**
         * The default tertiary FQDN to use for the number. Only settable if the connection is of
         * FQDN type. Value must be the ID of an FQDN set on the connection.
         */
        fun defaultTertiaryFqdnId(defaultTertiaryFqdnId: String?) =
            defaultTertiaryFqdnId(JsonField.ofNullable(defaultTertiaryFqdnId))

        /**
         * Alias for calling [Builder.defaultTertiaryFqdnId] with
         * `defaultTertiaryFqdnId.orElse(null)`.
         */
        fun defaultTertiaryFqdnId(defaultTertiaryFqdnId: Optional<String>) =
            defaultTertiaryFqdnId(defaultTertiaryFqdnId.getOrNull())

        /**
         * Sets [Builder.defaultTertiaryFqdnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultTertiaryFqdnId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultTertiaryFqdnId(defaultTertiaryFqdnId: JsonField<String>) = apply {
            this.defaultTertiaryFqdnId = defaultTertiaryFqdnId
        }

        fun dnisNumberFormat(dnisNumberFormat: DnisNumberFormat) =
            dnisNumberFormat(JsonField.of(dnisNumberFormat))

        /**
         * Sets [Builder.dnisNumberFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnisNumberFormat] with a well-typed [DnisNumberFormat]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.generateRingbackTone] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun generateRingbackTone(generateRingbackTone: JsonField<Boolean>) = apply {
            this.generateRingbackTone = generateRingbackTone
        }

        /**
         * When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only when
         * available and only when using TCP or TLS transport.)
         */
        fun isupHeadersEnabled(isupHeadersEnabled: Boolean) =
            isupHeadersEnabled(JsonField.of(isupHeadersEnabled))

        /**
         * Sets [Builder.isupHeadersEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isupHeadersEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isupHeadersEnabled(isupHeadersEnabled: JsonField<Boolean>) = apply {
            this.isupHeadersEnabled = isupHeadersEnabled
        }

        /** Enable PRACK messages as defined in RFC3262. */
        fun prackEnabled(prackEnabled: Boolean) = prackEnabled(JsonField.of(prackEnabled))

        /**
         * Sets [Builder.prackEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prackEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prackEnabled(prackEnabled: JsonField<Boolean>) = apply {
            this.prackEnabled = prackEnabled
        }

        /**
         * When enabled the SIP Connection will receive the Identity header with Shaken/Stir data in
         * the SIP INVITE message of inbound calls, even when using UDP transport.
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

        /** Defaults to true. */
        fun sipCompactHeadersEnabled(sipCompactHeadersEnabled: Boolean) =
            sipCompactHeadersEnabled(JsonField.of(sipCompactHeadersEnabled))

        /**
         * Sets [Builder.sipCompactHeadersEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipCompactHeadersEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sipCompactHeadersEnabled(sipCompactHeadersEnabled: JsonField<Boolean>) = apply {
            this.sipCompactHeadersEnabled = sipCompactHeadersEnabled
        }

        /**
         * Selects which `sip_region` to receive inbound calls from. If null, the default region
         * (US) will be used.
         */
        fun sipRegion(sipRegion: SipRegion) = sipRegion(JsonField.of(sipRegion))

        /**
         * Sets [Builder.sipRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipRegion] with a well-typed [SipRegion] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipRegion(sipRegion: JsonField<SipRegion>) = apply { this.sipRegion = sipRegion }

        /**
         * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the
         * same way a phone number is used, from a SIP endpoint. Example: the subdomain
         * "example.sip.telnyx.com" can be called from any SIP endpoint by using the SIP URI
         * "sip:@example.sip.telnyx.com" where the user part can be any alphanumeric value. Please
         * note TLS encrypted calls are not allowed for subdomain calls.
         */
        fun sipSubdomain(sipSubdomain: String?) = sipSubdomain(JsonField.ofNullable(sipSubdomain))

        /** Alias for calling [Builder.sipSubdomain] with `sipSubdomain.orElse(null)`. */
        fun sipSubdomain(sipSubdomain: Optional<String>) = sipSubdomain(sipSubdomain.getOrNull())

        /**
         * Sets [Builder.sipSubdomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipSubdomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipSubdomain(sipSubdomain: JsonField<String>) = apply {
            this.sipSubdomain = sipSubdomain
        }

        /**
         * This option can be enabled to receive calls from: "Anyone" (any SIP endpoint in the
         * public Internet) or "Only my connections" (any connection assigned to the same Telnyx
         * user).
         */
        fun sipSubdomainReceiveSettings(sipSubdomainReceiveSettings: SipSubdomainReceiveSettings) =
            sipSubdomainReceiveSettings(JsonField.of(sipSubdomainReceiveSettings))

        /**
         * Sets [Builder.sipSubdomainReceiveSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipSubdomainReceiveSettings] with a well-typed
         * [SipSubdomainReceiveSettings] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun sipSubdomainReceiveSettings(
            sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings>
        ) = apply { this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings }

        /** Time(sec) before aborting if connection is not made. */
        fun timeout1xxSecs(timeout1xxSecs: Long) = timeout1xxSecs(JsonField.of(timeout1xxSecs))

        /**
         * Sets [Builder.timeout1xxSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout1xxSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeout1xxSecs(timeout1xxSecs: JsonField<Long>) = apply {
            this.timeout1xxSecs = timeout1xxSecs
        }

        /** Time(sec) before aborting if call is unanswered (min: 1, max: 600). */
        fun timeout2xxSecs(timeout2xxSecs: Long) = timeout2xxSecs(JsonField.of(timeout2xxSecs))

        /**
         * Sets [Builder.timeout2xxSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout2xxSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [InboundFqdn].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboundFqdn =
            InboundFqdn(
                aniNumberFormat,
                channelLimit,
                (codecs ?: JsonMissing.of()).map { it.toImmutable() },
                defaultPrimaryFqdnId,
                defaultRoutingMethod,
                defaultSecondaryFqdnId,
                defaultTertiaryFqdnId,
                dnisNumberFormat,
                generateRingbackTone,
                isupHeadersEnabled,
                prackEnabled,
                shakenStirEnabled,
                sipCompactHeadersEnabled,
                sipRegion,
                sipSubdomain,
                sipSubdomainReceiveSettings,
                timeout1xxSecs,
                timeout2xxSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundFqdn = apply {
        if (validated) {
            return@apply
        }

        aniNumberFormat().ifPresent { it.validate() }
        channelLimit()
        codecs()
        defaultPrimaryFqdnId()
        defaultRoutingMethod().ifPresent { it.validate() }
        defaultSecondaryFqdnId()
        defaultTertiaryFqdnId()
        dnisNumberFormat().ifPresent { it.validate() }
        generateRingbackTone()
        isupHeadersEnabled()
        prackEnabled()
        shakenStirEnabled()
        sipCompactHeadersEnabled()
        sipRegion().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (aniNumberFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (channelLimit.asKnown().isPresent) 1 else 0) +
            (codecs.asKnown().getOrNull()?.size ?: 0) +
            (if (defaultPrimaryFqdnId.asKnown().isPresent) 1 else 0) +
            (defaultRoutingMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultSecondaryFqdnId.asKnown().isPresent) 1 else 0) +
            (if (defaultTertiaryFqdnId.asKnown().isPresent) 1 else 0) +
            (dnisNumberFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (generateRingbackTone.asKnown().isPresent) 1 else 0) +
            (if (isupHeadersEnabled.asKnown().isPresent) 1 else 0) +
            (if (prackEnabled.asKnown().isPresent) 1 else 0) +
            (if (shakenStirEnabled.asKnown().isPresent) 1 else 0) +
            (if (sipCompactHeadersEnabled.asKnown().isPresent) 1 else 0) +
            (sipRegion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sipSubdomain.asKnown().isPresent) 1 else 0) +
            (sipSubdomainReceiveSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeout1xxSecs.asKnown().isPresent) 1 else 0) +
            (if (timeout2xxSecs.asKnown().isPresent) 1 else 0)

    /**
     * This setting allows you to set the format with which the caller's number (ANI) is sent for
     * inbound phone calls.
     */
    class AniNumberFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

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
     * Default routing method to be used when a number is associated with the connection. Must be
     * one of the routing method types or null, other values are not allowed.
     */
    class DefaultRoutingMethod
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
         * An instance of [DefaultRoutingMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

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

    class DnisNumberFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [DnisNumberFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DnisNumberFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLUS_E164,
            E164,
            NATIONAL,
            SIP_USERNAME,
            /**
             * An enum member indicating that [DnisNumberFormat] was instantiated with an unknown
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
                PLUS_E164 -> Value.PLUS_E164
                E164 -> Value.E164
                NATIONAL -> Value.NATIONAL
                SIP_USERNAME -> Value.SIP_USERNAME
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
                PLUS_E164 -> Known.PLUS_E164
                E164 -> Known.E164
                NATIONAL -> Known.NATIONAL
                SIP_USERNAME -> Known.SIP_USERNAME
                else -> throw TelnyxInvalidDataException("Unknown DnisNumberFormat: $value")
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

    /**
     * Selects which `sip_region` to receive inbound calls from. If null, the default region (US)
     * will be used.
     */
    class SipRegion @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val US = of("US")

            @JvmField val EUROPE = of("Europe")

            @JvmField val AUSTRALIA = of("Australia")

            @JvmStatic fun of(value: String) = SipRegion(JsonField.of(value))
        }

        /** An enum containing [SipRegion]'s known values. */
        enum class Known {
            US,
            EUROPE,
            AUSTRALIA,
        }

        /**
         * An enum containing [SipRegion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SipRegion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            US,
            EUROPE,
            AUSTRALIA,
            /**
             * An enum member indicating that [SipRegion] was instantiated with an unknown value.
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
                US -> Value.US
                EUROPE -> Value.EUROPE
                AUSTRALIA -> Value.AUSTRALIA
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
                US -> Known.US
                EUROPE -> Known.EUROPE
                AUSTRALIA -> Known.AUSTRALIA
                else -> throw TelnyxInvalidDataException("Unknown SipRegion: $value")
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

        fun validate(): SipRegion = apply {
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

            return other is SipRegion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This option can be enabled to receive calls from: "Anyone" (any SIP endpoint in the public
     * Internet) or "Only my connections" (any connection assigned to the same Telnyx user).
     */
    class SipSubdomainReceiveSettings
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

            @JvmField val ONLY_MY_CONNECTIONS = of("only_my_connections")

            @JvmField val FROM_ANYONE = of("from_anyone")

            @JvmStatic fun of(value: String) = SipSubdomainReceiveSettings(JsonField.of(value))
        }

        /** An enum containing [SipSubdomainReceiveSettings]'s known values. */
        enum class Known {
            ONLY_MY_CONNECTIONS,
            FROM_ANYONE,
        }

        /**
         * An enum containing [SipSubdomainReceiveSettings]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SipSubdomainReceiveSettings] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONLY_MY_CONNECTIONS,
            FROM_ANYONE,
            /**
             * An enum member indicating that [SipSubdomainReceiveSettings] was instantiated with an
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
                ONLY_MY_CONNECTIONS -> Value.ONLY_MY_CONNECTIONS
                FROM_ANYONE -> Value.FROM_ANYONE
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
                ONLY_MY_CONNECTIONS -> Known.ONLY_MY_CONNECTIONS
                FROM_ANYONE -> Known.FROM_ANYONE
                else ->
                    throw TelnyxInvalidDataException("Unknown SipSubdomainReceiveSettings: $value")
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

        return other is InboundFqdn &&
            aniNumberFormat == other.aniNumberFormat &&
            channelLimit == other.channelLimit &&
            codecs == other.codecs &&
            defaultPrimaryFqdnId == other.defaultPrimaryFqdnId &&
            defaultRoutingMethod == other.defaultRoutingMethod &&
            defaultSecondaryFqdnId == other.defaultSecondaryFqdnId &&
            defaultTertiaryFqdnId == other.defaultTertiaryFqdnId &&
            dnisNumberFormat == other.dnisNumberFormat &&
            generateRingbackTone == other.generateRingbackTone &&
            isupHeadersEnabled == other.isupHeadersEnabled &&
            prackEnabled == other.prackEnabled &&
            shakenStirEnabled == other.shakenStirEnabled &&
            sipCompactHeadersEnabled == other.sipCompactHeadersEnabled &&
            sipRegion == other.sipRegion &&
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
            defaultPrimaryFqdnId,
            defaultRoutingMethod,
            defaultSecondaryFqdnId,
            defaultTertiaryFqdnId,
            dnisNumberFormat,
            generateRingbackTone,
            isupHeadersEnabled,
            prackEnabled,
            shakenStirEnabled,
            sipCompactHeadersEnabled,
            sipRegion,
            sipSubdomain,
            sipSubdomainReceiveSettings,
            timeout1xxSecs,
            timeout2xxSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundFqdn{aniNumberFormat=$aniNumberFormat, channelLimit=$channelLimit, codecs=$codecs, defaultPrimaryFqdnId=$defaultPrimaryFqdnId, defaultRoutingMethod=$defaultRoutingMethod, defaultSecondaryFqdnId=$defaultSecondaryFqdnId, defaultTertiaryFqdnId=$defaultTertiaryFqdnId, dnisNumberFormat=$dnisNumberFormat, generateRingbackTone=$generateRingbackTone, isupHeadersEnabled=$isupHeadersEnabled, prackEnabled=$prackEnabled, shakenStirEnabled=$shakenStirEnabled, sipCompactHeadersEnabled=$sipCompactHeadersEnabled, sipRegion=$sipRegion, sipSubdomain=$sipSubdomain, sipSubdomainReceiveSettings=$sipSubdomainReceiveSettings, timeout1xxSecs=$timeout1xxSecs, timeout2xxSecs=$timeout2xxSecs, additionalProperties=$additionalProperties}"
}
