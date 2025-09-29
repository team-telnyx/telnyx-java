// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.brand

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** The verification status of an active brand */
class BrandIdentityStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val VERIFIED = of("VERIFIED")

        @JvmField val UNVERIFIED = of("UNVERIFIED")

        @JvmField val SELF_DECLARED = of("SELF_DECLARED")

        @JvmField val VETTED_VERIFIED = of("VETTED_VERIFIED")

        @JvmStatic fun of(value: String) = BrandIdentityStatus(JsonField.of(value))
    }

    /** An enum containing [BrandIdentityStatus]'s known values. */
    enum class Known {
        VERIFIED,
        UNVERIFIED,
        SELF_DECLARED,
        VETTED_VERIFIED,
    }

    /**
     * An enum containing [BrandIdentityStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BrandIdentityStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        VERIFIED,
        UNVERIFIED,
        SELF_DECLARED,
        VETTED_VERIFIED,
        /**
         * An enum member indicating that [BrandIdentityStatus] was instantiated with an unknown
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
            VERIFIED -> Value.VERIFIED
            UNVERIFIED -> Value.UNVERIFIED
            SELF_DECLARED -> Value.SELF_DECLARED
            VETTED_VERIFIED -> Value.VETTED_VERIFIED
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
            VERIFIED -> Known.VERIFIED
            UNVERIFIED -> Known.UNVERIFIED
            SELF_DECLARED -> Known.SELF_DECLARED
            VETTED_VERIFIED -> Known.VETTED_VERIFIED
            else -> throw TelnyxInvalidDataException("Unknown BrandIdentityStatus: $value")
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

    fun validate(): BrandIdentityStatus = apply {
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

        return other is BrandIdentityStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
