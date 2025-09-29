// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SimCardStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reason: JsonField<String>,
    private val value: JsonField<Value>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
    ) : this(reason, value, mutableMapOf())

    /**
     * It describes why the SIM card is in the current status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * The current status of the SIM card. It will be one of the following: <br/>
     * <ul>
     * <li><code>registering</code> - the card is being registered</li>
     * <li><code>enabling</code> - the card is being enabled</li>
     * <li><code>enabled</code> - the card is enabled and ready for use</li>
     * <li><code>disabling</code> - the card is being disabled</li>
     * <li><code>disabled</code> - the card has been disabled and cannot be used</li>
     * <li><code>data_limit_exceeded</code> - the card has exceeded its data consumption limit</li>
     * <li><code>setting_standby</code> - the process to set the card in stand by is in
     *   progress</li>
     * <li><code>standby</code> - the card is in stand by</li>
     * </ul>
     *
     * Transitioning between the enabled and disabled states may take a period of time.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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

        /** Returns a mutable builder for constructing an instance of [SimCardStatus]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardStatus]. */
    class Builder internal constructor() {

        private var reason: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simCardStatus: SimCardStatus) = apply {
            reason = simCardStatus.reason
            value = simCardStatus.value
            additionalProperties = simCardStatus.additionalProperties.toMutableMap()
        }

        /** It describes why the SIM card is in the current status. */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * The current status of the SIM card. It will be one of the following: <br/>
         * <ul>
         * <li><code>registering</code> - the card is being registered</li>
         * <li><code>enabling</code> - the card is being enabled</li>
         * <li><code>enabled</code> - the card is enabled and ready for use</li>
         * <li><code>disabling</code> - the card is being disabled</li>
         * <li><code>disabled</code> - the card has been disabled and cannot be used</li>
         * <li><code>data_limit_exceeded</code> - the card has exceeded its data consumption
         *   limit</li>
         * <li><code>setting_standby</code> - the process to set the card in stand by is in
         *   progress</li>
         * <li><code>standby</code> - the card is in stand by</li>
         * </ul>
         *
         * Transitioning between the enabled and disabled states may take a period of time.
         */
        fun value(value: Value) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { this.value = value }

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
         * Returns an immutable instance of [SimCardStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardStatus =
            SimCardStatus(reason, value, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SimCardStatus = apply {
        if (validated) {
            return@apply
        }

        reason()
        value().ifPresent { it.validate() }
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
        (if (reason.asKnown().isPresent) 1 else 0) + (value.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The current status of the SIM card. It will be one of the following: <br/>
     * <ul>
     * <li><code>registering</code> - the card is being registered</li>
     * <li><code>enabling</code> - the card is being enabled</li>
     * <li><code>enabled</code> - the card is enabled and ready for use</li>
     * <li><code>disabling</code> - the card is being disabled</li>
     * <li><code>disabled</code> - the card has been disabled and cannot be used</li>
     * <li><code>data_limit_exceeded</code> - the card has exceeded its data consumption limit</li>
     * <li><code>setting_standby</code> - the process to set the card in stand by is in
     *   progress</li>
     * <li><code>standby</code> - the card is in stand by</li>
     * </ul>
     *
     * Transitioning between the enabled and disabled states may take a period of time.
     */
    class Value @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REGISTERING = of("registering")

            @JvmField val ENABLING = of("enabling")

            @JvmField val ENABLED = of("enabled")

            @JvmField val DISABLING = of("disabling")

            @JvmField val DISABLED = of("disabled")

            @JvmField val DATA_LIMIT_EXCEEDED = of("data_limit_exceeded")

            @JvmField val SETTING_STANDBY = of("setting_standby")

            @JvmField val STANDBY = of("standby")

            @JvmStatic fun of(value: String) = Value(JsonField.of(value))
        }

        /** An enum containing [Value]'s known values. */
        enum class Known {
            REGISTERING,
            ENABLING,
            ENABLED,
            DISABLING,
            DISABLED,
            DATA_LIMIT_EXCEEDED,
            SETTING_STANDBY,
            STANDBY,
        }

        /**
         * An enum containing [Value]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Value] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REGISTERING,
            ENABLING,
            ENABLED,
            DISABLING,
            DISABLED,
            DATA_LIMIT_EXCEEDED,
            SETTING_STANDBY,
            STANDBY,
            /** An enum member indicating that [Value] was instantiated with an unknown value. */
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
                REGISTERING -> Value.REGISTERING
                ENABLING -> Value.ENABLING
                ENABLED -> Value.ENABLED
                DISABLING -> Value.DISABLING
                DISABLED -> Value.DISABLED
                DATA_LIMIT_EXCEEDED -> Value.DATA_LIMIT_EXCEEDED
                SETTING_STANDBY -> Value.SETTING_STANDBY
                STANDBY -> Value.STANDBY
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
                REGISTERING -> Known.REGISTERING
                ENABLING -> Known.ENABLING
                ENABLED -> Known.ENABLED
                DISABLING -> Known.DISABLING
                DISABLED -> Known.DISABLED
                DATA_LIMIT_EXCEEDED -> Known.DATA_LIMIT_EXCEEDED
                SETTING_STANDBY -> Known.SETTING_STANDBY
                STANDBY -> Known.STANDBY
                else -> throw TelnyxInvalidDataException("Unknown Value: $value")
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

        fun validate(): Value = apply {
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

            return other is Value && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardStatus &&
            reason == other.reason &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(reason, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimCardStatus{reason=$reason, value=$value, additionalProperties=$additionalProperties}"
}
