// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** Message Volume Enums */
class Volume @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val _10 = of("10")

        @JvmField val _100 = of("100")

        @JvmField val _1_000 = of("1,000")

        @JvmField val _10_000 = of("10,000")

        @JvmField val _100_000 = of("100,000")

        @JvmField val _250_000 = of("250,000")

        @JvmField val _500_000 = of("500,000")

        @JvmField val _750_000 = of("750,000")

        @JvmField val _1_000_000 = of("1,000,000")

        @JvmField val _5_000_000 = of("5,000,000")

        @JvmField val _10_000_000 = of("10,000,000+")

        @JvmStatic fun of(value: String) = Volume(JsonField.of(value))
    }

    /** An enum containing [Volume]'s known values. */
    enum class Known {
        _10,
        _100,
        _1_000,
        _10_000,
        _100_000,
        _250_000,
        _500_000,
        _750_000,
        _1_000_000,
        _5_000_000,
        _10_000_000,
    }

    /**
     * An enum containing [Volume]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Volume] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        _10,
        _100,
        _1_000,
        _10_000,
        _100_000,
        _250_000,
        _500_000,
        _750_000,
        _1_000_000,
        _5_000_000,
        _10_000_000,
        /** An enum member indicating that [Volume] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            _10 -> Value._10
            _100 -> Value._100
            _1_000 -> Value._1_000
            _10_000 -> Value._10_000
            _100_000 -> Value._100_000
            _250_000 -> Value._250_000
            _500_000 -> Value._500_000
            _750_000 -> Value._750_000
            _1_000_000 -> Value._1_000_000
            _5_000_000 -> Value._5_000_000
            _10_000_000 -> Value._10_000_000
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TelnyxInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            _10 -> Known._10
            _100 -> Known._100
            _1_000 -> Known._1_000
            _10_000 -> Known._10_000
            _100_000 -> Known._100_000
            _250_000 -> Known._250_000
            _500_000 -> Known._500_000
            _750_000 -> Known._750_000
            _1_000_000 -> Known._1_000_000
            _5_000_000 -> Known._5_000_000
            _10_000_000 -> Known._10_000_000
            else -> throw TelnyxInvalidDataException("Unknown Volume: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): Volume = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Volume && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
