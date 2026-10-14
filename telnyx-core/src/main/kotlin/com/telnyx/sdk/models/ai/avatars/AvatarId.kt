// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Stable identifier of a Telnyx stock avatar or an organization-owned custom avatar. Custom avatar
 * IDs are returned by the Avatars API and use the `avatar_` prefix.
 */
class AvatarId @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ELENA = of("elena")

        @JvmField val BEN = of("ben")

        @JvmField val JORDAN = of("jordan")

        @JvmField val LIN = of("lin")

        @JvmField val AVERY = of("avery")

        @JvmField val RAPHAEL = of("raphael")

        @JvmStatic fun of(value: String) = AvatarId(JsonField.of(value))
    }

    /** An enum containing [AvatarId]'s known values. */
    enum class Known {
        ELENA,
        BEN,
        JORDAN,
        LIN,
        AVERY,
        RAPHAEL,
    }

    /**
     * An enum containing [AvatarId]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AvatarId] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ELENA,
        BEN,
        JORDAN,
        LIN,
        AVERY,
        RAPHAEL,
        /** An enum member indicating that [AvatarId] was instantiated with an unknown value. */
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
            ELENA -> Value.ELENA
            BEN -> Value.BEN
            JORDAN -> Value.JORDAN
            LIN -> Value.LIN
            AVERY -> Value.AVERY
            RAPHAEL -> Value.RAPHAEL
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
            ELENA -> Known.ELENA
            BEN -> Known.BEN
            JORDAN -> Known.JORDAN
            LIN -> Known.LIN
            AVERY -> Known.AVERY
            RAPHAEL -> Known.RAPHAEL
            else -> throw TelnyxInvalidDataException("Unknown AvatarId: $value")
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AvatarId = apply {
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

        return other is AvatarId && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
