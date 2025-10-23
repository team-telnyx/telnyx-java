// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallControlApplicationInbound
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channelLimit: JsonField<Long>,
    private val shakenStirEnabled: JsonField<Boolean>,
    private val sipSubdomain: JsonField<String>,
    private val sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel_limit")
        @ExcludeMissing
        channelLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shaken_stir_enabled")
        @ExcludeMissing
        shakenStirEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sip_subdomain")
        @ExcludeMissing
        sipSubdomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sip_subdomain_receive_settings")
        @ExcludeMissing
        sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> = JsonMissing.of(),
    ) : this(
        channelLimit,
        shakenStirEnabled,
        sipSubdomain,
        sipSubdomainReceiveSettings,
        mutableMapOf(),
    )

    /**
     * When set, this will limit the total number of inbound calls to phone numbers associated with
     * this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

    /**
     * When enabled Telnyx will include Shaken/Stir data in the Webhook for new inbound calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shakenStirEnabled(): Optional<Boolean> =
        shakenStirEnabled.getOptional("shaken_stir_enabled")

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
     * Returns the raw JSON value of [channelLimit].
     *
     * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_limit")
    @ExcludeMissing
    fun _channelLimit(): JsonField<Long> = channelLimit

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
         * Returns a mutable builder for constructing an instance of
         * [CallControlApplicationInbound].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallControlApplicationInbound]. */
    class Builder internal constructor() {

        private var channelLimit: JsonField<Long> = JsonMissing.of()
        private var shakenStirEnabled: JsonField<Boolean> = JsonMissing.of()
        private var sipSubdomain: JsonField<String> = JsonMissing.of()
        private var sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callControlApplicationInbound: CallControlApplicationInbound) = apply {
            channelLimit = callControlApplicationInbound.channelLimit
            shakenStirEnabled = callControlApplicationInbound.shakenStirEnabled
            sipSubdomain = callControlApplicationInbound.sipSubdomain
            sipSubdomainReceiveSettings = callControlApplicationInbound.sipSubdomainReceiveSettings
            additionalProperties = callControlApplicationInbound.additionalProperties.toMutableMap()
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
         * When enabled Telnyx will include Shaken/Stir data in the Webhook for new inbound calls.
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

        /**
         * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the
         * same way a phone number is used, from a SIP endpoint. Example: the subdomain
         * "example.sip.telnyx.com" can be called from any SIP endpoint by using the SIP URI
         * "sip:@example.sip.telnyx.com" where the user part can be any alphanumeric value. Please
         * note TLS encrypted calls are not allowed for subdomain calls.
         */
        fun sipSubdomain(sipSubdomain: String) = sipSubdomain(JsonField.of(sipSubdomain))

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
         * Returns an immutable instance of [CallControlApplicationInbound].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallControlApplicationInbound =
            CallControlApplicationInbound(
                channelLimit,
                shakenStirEnabled,
                sipSubdomain,
                sipSubdomainReceiveSettings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallControlApplicationInbound = apply {
        if (validated) {
            return@apply
        }

        channelLimit()
        shakenStirEnabled()
        sipSubdomain()
        sipSubdomainReceiveSettings().ifPresent { it.validate() }
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
        (if (channelLimit.asKnown().isPresent) 1 else 0) +
            (if (shakenStirEnabled.asKnown().isPresent) 1 else 0) +
            (if (sipSubdomain.asKnown().isPresent) 1 else 0) +
            (sipSubdomainReceiveSettings.asKnown().getOrNull()?.validity() ?: 0)

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

        return other is CallControlApplicationInbound &&
            channelLimit == other.channelLimit &&
            shakenStirEnabled == other.shakenStirEnabled &&
            sipSubdomain == other.sipSubdomain &&
            sipSubdomainReceiveSettings == other.sipSubdomainReceiveSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channelLimit,
            shakenStirEnabled,
            sipSubdomain,
            sipSubdomainReceiveSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallControlApplicationInbound{channelLimit=$channelLimit, shakenStirEnabled=$shakenStirEnabled, sipSubdomain=$sipSubdomain, sipSubdomainReceiveSettings=$sipSubdomainReceiveSettings, additionalProperties=$additionalProperties}"
}
