// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * `Latency` directs Telnyx to route media through the site with the lowest round-trip time to the
 * user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by
 * specifying a site to handle all media.
 */
class AnchorsiteOverride @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val LATENCY = of("Latency")

        @JvmField val CHICAGO_IL = of("Chicago, IL")

        @JvmField val ASHBURN_VA = of("Ashburn, VA")

        @JvmField val SAN_JOSE_CA = of("San Jose, CA")

        @JvmField val SYDNEY_AUSTRALIA = of("Sydney, Australia")

        @JvmField val AMSTERDAM_NETHERLANDS = of("Amsterdam, Netherlands")

        @JvmField val LONDON_UK = of("London, UK")

        @JvmField val TORONTO_CANADA = of("Toronto, Canada")

        @JvmField val VANCOUVER_CANADA = of("Vancouver, Canada")

        @JvmField val FRANKFURT_GERMANY = of("Frankfurt, Germany")

        @JvmStatic fun of(value: String) = AnchorsiteOverride(JsonField.of(value))
    }

    /** An enum containing [AnchorsiteOverride]'s known values. */
    enum class Known {
        LATENCY,
        CHICAGO_IL,
        ASHBURN_VA,
        SAN_JOSE_CA,
        SYDNEY_AUSTRALIA,
        AMSTERDAM_NETHERLANDS,
        LONDON_UK,
        TORONTO_CANADA,
        VANCOUVER_CANADA,
        FRANKFURT_GERMANY,
    }

    /**
     * An enum containing [AnchorsiteOverride]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AnchorsiteOverride] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        LATENCY,
        CHICAGO_IL,
        ASHBURN_VA,
        SAN_JOSE_CA,
        SYDNEY_AUSTRALIA,
        AMSTERDAM_NETHERLANDS,
        LONDON_UK,
        TORONTO_CANADA,
        VANCOUVER_CANADA,
        FRANKFURT_GERMANY,
        /**
         * An enum member indicating that [AnchorsiteOverride] was instantiated with an unknown
         * value.
         */
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
            LATENCY -> Value.LATENCY
            CHICAGO_IL -> Value.CHICAGO_IL
            ASHBURN_VA -> Value.ASHBURN_VA
            SAN_JOSE_CA -> Value.SAN_JOSE_CA
            SYDNEY_AUSTRALIA -> Value.SYDNEY_AUSTRALIA
            AMSTERDAM_NETHERLANDS -> Value.AMSTERDAM_NETHERLANDS
            LONDON_UK -> Value.LONDON_UK
            TORONTO_CANADA -> Value.TORONTO_CANADA
            VANCOUVER_CANADA -> Value.VANCOUVER_CANADA
            FRANKFURT_GERMANY -> Value.FRANKFURT_GERMANY
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
            LATENCY -> Known.LATENCY
            CHICAGO_IL -> Known.CHICAGO_IL
            ASHBURN_VA -> Known.ASHBURN_VA
            SAN_JOSE_CA -> Known.SAN_JOSE_CA
            SYDNEY_AUSTRALIA -> Known.SYDNEY_AUSTRALIA
            AMSTERDAM_NETHERLANDS -> Known.AMSTERDAM_NETHERLANDS
            LONDON_UK -> Known.LONDON_UK
            TORONTO_CANADA -> Known.TORONTO_CANADA
            VANCOUVER_CANADA -> Known.VANCOUVER_CANADA
            FRANKFURT_GERMANY -> Known.FRANKFURT_GERMANY
            else -> throw TelnyxInvalidDataException("Unknown AnchorsiteOverride: $value")
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

    fun validate(): AnchorsiteOverride = apply {
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

        return other is AnchorsiteOverride && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
