// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.credentialconnections

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

class CredentialInbound
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aniNumberFormat: JsonField<AniNumberFormat>,
    private val channelLimit: JsonField<Long>,
    private val codecs: JsonField<List<String>>,
    private val dnisNumberFormat: JsonField<DnisNumberFormat>,
    private val generateRingbackTone: JsonField<Boolean>,
    private val isupHeadersEnabled: JsonField<Boolean>,
    private val prackEnabled: JsonField<Boolean>,
    private val shakenStirEnabled: JsonField<Boolean>,
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
        @JsonProperty("codecs") @ExcludeMissing codecs: JsonField<List<String>> = JsonMissing.of(),
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
        dnisNumberFormat,
        generateRingbackTone,
        isupHeadersEnabled,
        prackEnabled,
        shakenStirEnabled,
        sipCompactHeadersEnabled,
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

        /** Returns a mutable builder for constructing an instance of [CredentialInbound]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CredentialInbound]. */
    class Builder internal constructor() {

        private var aniNumberFormat: JsonField<AniNumberFormat> = JsonMissing.of()
        private var channelLimit: JsonField<Long> = JsonMissing.of()
        private var codecs: JsonField<MutableList<String>>? = null
        private var dnisNumberFormat: JsonField<DnisNumberFormat> = JsonMissing.of()
        private var generateRingbackTone: JsonField<Boolean> = JsonMissing.of()
        private var isupHeadersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var prackEnabled: JsonField<Boolean> = JsonMissing.of()
        private var shakenStirEnabled: JsonField<Boolean> = JsonMissing.of()
        private var sipCompactHeadersEnabled: JsonField<Boolean> = JsonMissing.of()
        private var timeout1xxSecs: JsonField<Long> = JsonMissing.of()
        private var timeout2xxSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(credentialInbound: CredentialInbound) = apply {
            aniNumberFormat = credentialInbound.aniNumberFormat
            channelLimit = credentialInbound.channelLimit
            codecs = credentialInbound.codecs.map { it.toMutableList() }
            dnisNumberFormat = credentialInbound.dnisNumberFormat
            generateRingbackTone = credentialInbound.generateRingbackTone
            isupHeadersEnabled = credentialInbound.isupHeadersEnabled
            prackEnabled = credentialInbound.prackEnabled
            shakenStirEnabled = credentialInbound.shakenStirEnabled
            sipCompactHeadersEnabled = credentialInbound.sipCompactHeadersEnabled
            timeout1xxSecs = credentialInbound.timeout1xxSecs
            timeout2xxSecs = credentialInbound.timeout2xxSecs
            additionalProperties = credentialInbound.additionalProperties.toMutableMap()
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
        fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

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
         * Returns an immutable instance of [CredentialInbound].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CredentialInbound =
            CredentialInbound(
                aniNumberFormat,
                channelLimit,
                (codecs ?: JsonMissing.of()).map { it.toImmutable() },
                dnisNumberFormat,
                generateRingbackTone,
                isupHeadersEnabled,
                prackEnabled,
                shakenStirEnabled,
                sipCompactHeadersEnabled,
                timeout1xxSecs,
                timeout2xxSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CredentialInbound = apply {
        if (validated) {
            return@apply
        }

        aniNumberFormat().ifPresent { it.validate() }
        channelLimit()
        codecs()
        dnisNumberFormat().ifPresent { it.validate() }
        generateRingbackTone()
        isupHeadersEnabled()
        prackEnabled()
        shakenStirEnabled()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (aniNumberFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (channelLimit.asKnown().isPresent) 1 else 0) +
            (codecs.asKnown().getOrNull()?.size ?: 0) +
            (dnisNumberFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (generateRingbackTone.asKnown().isPresent) 1 else 0) +
            (if (isupHeadersEnabled.asKnown().isPresent) 1 else 0) +
            (if (prackEnabled.asKnown().isPresent) 1 else 0) +
            (if (shakenStirEnabled.asKnown().isPresent) 1 else 0) +
            (if (sipCompactHeadersEnabled.asKnown().isPresent) 1 else 0) +
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialInbound &&
            aniNumberFormat == other.aniNumberFormat &&
            channelLimit == other.channelLimit &&
            codecs == other.codecs &&
            dnisNumberFormat == other.dnisNumberFormat &&
            generateRingbackTone == other.generateRingbackTone &&
            isupHeadersEnabled == other.isupHeadersEnabled &&
            prackEnabled == other.prackEnabled &&
            shakenStirEnabled == other.shakenStirEnabled &&
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
            dnisNumberFormat,
            generateRingbackTone,
            isupHeadersEnabled,
            prackEnabled,
            shakenStirEnabled,
            sipCompactHeadersEnabled,
            timeout1xxSecs,
            timeout2xxSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CredentialInbound{aniNumberFormat=$aniNumberFormat, channelLimit=$channelLimit, codecs=$codecs, dnisNumberFormat=$dnisNumberFormat, generateRingbackTone=$generateRingbackTone, isupHeadersEnabled=$isupHeadersEnabled, prackEnabled=$prackEnabled, shakenStirEnabled=$shakenStirEnabled, sipCompactHeadersEnabled=$sipCompactHeadersEnabled, timeout1xxSecs=$timeout1xxSecs, timeout2xxSecs=$timeout2xxSecs, additionalProperties=$additionalProperties}"
}
