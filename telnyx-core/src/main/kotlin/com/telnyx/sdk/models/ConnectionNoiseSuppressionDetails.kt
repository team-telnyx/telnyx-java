// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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

/**
 * Configuration options for noise suppression. These settings are stored regardless of the
 * noise_suppression value, but only take effect when noise_suppression is not 'disabled'. If you
 * disable noise suppression and later re-enable it, the previously configured settings will be
 * used.
 */
class ConnectionNoiseSuppressionDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attenuationLimit: JsonField<Long>,
    private val engine: JsonField<Engine>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attenuation_limit")
        @ExcludeMissing
        attenuationLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("engine") @ExcludeMissing engine: JsonField<Engine> = JsonMissing.of(),
    ) : this(attenuationLimit, engine, mutableMapOf())

    /**
     * The attenuation limit value for the selected engine. Default values vary by engine: 0 for
     * 'denoiser', 80 for 'deep_filter_net', 'deep_filter_net_large', and all Krisp engines
     * ('krisp_viva_tel', 'krisp_viva_tel_lite', 'krisp_viva_promodel', 'krisp_viva_ss').
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attenuationLimit(): Optional<Long> = attenuationLimit.getOptional("attenuation_limit")

    /**
     * The noise suppression engine to use. 'denoiser' is the default engine. 'deep_filter_net' and
     * 'deep_filter_net_large' are alternative engines with different performance characteristics.
     * Krisp engines ('krisp_viva_tel', 'krisp_viva_tel_lite', 'krisp_viva_promodel',
     * 'krisp_viva_ss') provide advanced noise suppression capabilities.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun engine(): Optional<Engine> = engine.getOptional("engine")

    /**
     * Returns the raw JSON value of [attenuationLimit].
     *
     * Unlike [attenuationLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attenuation_limit")
    @ExcludeMissing
    fun _attenuationLimit(): JsonField<Long> = attenuationLimit

    /**
     * Returns the raw JSON value of [engine].
     *
     * Unlike [engine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engine") @ExcludeMissing fun _engine(): JsonField<Engine> = engine

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
         * [ConnectionNoiseSuppressionDetails].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionNoiseSuppressionDetails]. */
    class Builder internal constructor() {

        private var attenuationLimit: JsonField<Long> = JsonMissing.of()
        private var engine: JsonField<Engine> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionNoiseSuppressionDetails: ConnectionNoiseSuppressionDetails) =
            apply {
                attenuationLimit = connectionNoiseSuppressionDetails.attenuationLimit
                engine = connectionNoiseSuppressionDetails.engine
                additionalProperties =
                    connectionNoiseSuppressionDetails.additionalProperties.toMutableMap()
            }

        /**
         * The attenuation limit value for the selected engine. Default values vary by engine: 0 for
         * 'denoiser', 80 for 'deep_filter_net', 'deep_filter_net_large', and all Krisp engines
         * ('krisp_viva_tel', 'krisp_viva_tel_lite', 'krisp_viva_promodel', 'krisp_viva_ss').
         */
        fun attenuationLimit(attenuationLimit: Long) =
            attenuationLimit(JsonField.of(attenuationLimit))

        /**
         * Sets [Builder.attenuationLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attenuationLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attenuationLimit(attenuationLimit: JsonField<Long>) = apply {
            this.attenuationLimit = attenuationLimit
        }

        /**
         * The noise suppression engine to use. 'denoiser' is the default engine. 'deep_filter_net'
         * and 'deep_filter_net_large' are alternative engines with different performance
         * characteristics. Krisp engines ('krisp_viva_tel', 'krisp_viva_tel_lite',
         * 'krisp_viva_promodel', 'krisp_viva_ss') provide advanced noise suppression capabilities.
         */
        fun engine(engine: Engine) = engine(JsonField.of(engine))

        /**
         * Sets [Builder.engine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engine] with a well-typed [Engine] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun engine(engine: JsonField<Engine>) = apply { this.engine = engine }

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
         * Returns an immutable instance of [ConnectionNoiseSuppressionDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectionNoiseSuppressionDetails =
            ConnectionNoiseSuppressionDetails(
                attenuationLimit,
                engine,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectionNoiseSuppressionDetails = apply {
        if (validated) {
            return@apply
        }

        attenuationLimit()
        engine().ifPresent { it.validate() }
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
        (if (attenuationLimit.asKnown().isPresent) 1 else 0) +
            (engine.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The noise suppression engine to use. 'denoiser' is the default engine. 'deep_filter_net' and
     * 'deep_filter_net_large' are alternative engines with different performance characteristics.
     * Krisp engines ('krisp_viva_tel', 'krisp_viva_tel_lite', 'krisp_viva_promodel',
     * 'krisp_viva_ss') provide advanced noise suppression capabilities.
     */
    class Engine @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DENOISER = of("denoiser")

            @JvmField val DEEP_FILTER_NET = of("deep_filter_net")

            @JvmField val DEEP_FILTER_NET_LARGE = of("deep_filter_net_large")

            @JvmField val KRISP_VIVA_TEL = of("krisp_viva_tel")

            @JvmField val KRISP_VIVA_TEL_LITE = of("krisp_viva_tel_lite")

            @JvmField val KRISP_VIVA_PROMODEL = of("krisp_viva_promodel")

            @JvmField val KRISP_VIVA_SS = of("krisp_viva_ss")

            @JvmStatic fun of(value: String) = Engine(JsonField.of(value))
        }

        /** An enum containing [Engine]'s known values. */
        enum class Known {
            DENOISER,
            DEEP_FILTER_NET,
            DEEP_FILTER_NET_LARGE,
            KRISP_VIVA_TEL,
            KRISP_VIVA_TEL_LITE,
            KRISP_VIVA_PROMODEL,
            KRISP_VIVA_SS,
        }

        /**
         * An enum containing [Engine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Engine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DENOISER,
            DEEP_FILTER_NET,
            DEEP_FILTER_NET_LARGE,
            KRISP_VIVA_TEL,
            KRISP_VIVA_TEL_LITE,
            KRISP_VIVA_PROMODEL,
            KRISP_VIVA_SS,
            /** An enum member indicating that [Engine] was instantiated with an unknown value. */
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
                DENOISER -> Value.DENOISER
                DEEP_FILTER_NET -> Value.DEEP_FILTER_NET
                DEEP_FILTER_NET_LARGE -> Value.DEEP_FILTER_NET_LARGE
                KRISP_VIVA_TEL -> Value.KRISP_VIVA_TEL
                KRISP_VIVA_TEL_LITE -> Value.KRISP_VIVA_TEL_LITE
                KRISP_VIVA_PROMODEL -> Value.KRISP_VIVA_PROMODEL
                KRISP_VIVA_SS -> Value.KRISP_VIVA_SS
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
                DENOISER -> Known.DENOISER
                DEEP_FILTER_NET -> Known.DEEP_FILTER_NET
                DEEP_FILTER_NET_LARGE -> Known.DEEP_FILTER_NET_LARGE
                KRISP_VIVA_TEL -> Known.KRISP_VIVA_TEL
                KRISP_VIVA_TEL_LITE -> Known.KRISP_VIVA_TEL_LITE
                KRISP_VIVA_PROMODEL -> Known.KRISP_VIVA_PROMODEL
                KRISP_VIVA_SS -> Known.KRISP_VIVA_SS
                else -> throw TelnyxInvalidDataException("Unknown Engine: $value")
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

        fun validate(): Engine = apply {
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

            return other is Engine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionNoiseSuppressionDetails &&
            attenuationLimit == other.attenuationLimit &&
            engine == other.engine &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(attenuationLimit, engine, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionNoiseSuppressionDetails{attenuationLimit=$attenuationLimit, engine=$engine, additionalProperties=$additionalProperties}"
}
