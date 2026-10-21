// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Whether the engine can serve traffic right now, independent of `visibility` and `review_status`.
 * `draft`: not yet approved (new and awaiting its first review, rejected and awaiting a fix, or
 * approved earlier and awaiting re-review after a review-sensitive change). `active`: serving
 * traffic. `disabled`: owner-paused, reversible via `enable`. `suspended`: paused by Telnyx
 * (repeated failures of a public engine, or an abuse action); the owner cannot clear this by
 * calling `enable`, and Telnyx can reinstate it.
 */
class CommunityTtsEngineStatus
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val DRAFT = of("draft")

        @JvmField val ACTIVE = of("active")

        @JvmField val DISABLED = of("disabled")

        @JvmField val SUSPENDED = of("suspended")

        @JvmStatic fun of(value: String) = CommunityTtsEngineStatus(JsonField.of(value))
    }

    /** An enum containing [CommunityTtsEngineStatus]'s known values. */
    enum class Known {
        DRAFT,
        ACTIVE,
        DISABLED,
        SUSPENDED,
    }

    /**
     * An enum containing [CommunityTtsEngineStatus]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [CommunityTtsEngineStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DRAFT,
        ACTIVE,
        DISABLED,
        SUSPENDED,
        /**
         * An enum member indicating that [CommunityTtsEngineStatus] was instantiated with an
         * unknown value.
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
            DRAFT -> Value.DRAFT
            ACTIVE -> Value.ACTIVE
            DISABLED -> Value.DISABLED
            SUSPENDED -> Value.SUSPENDED
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
            DRAFT -> Known.DRAFT
            ACTIVE -> Known.ACTIVE
            DISABLED -> Known.DISABLED
            SUSPENDED -> Known.SUSPENDED
            else -> throw TelnyxInvalidDataException("Unknown CommunityTtsEngineStatus: $value")
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
    fun validate(): CommunityTtsEngineStatus = apply {
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

        return other is CommunityTtsEngineStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
