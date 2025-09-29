// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.errors.TelnyxInvalidDataException

/** Status of an embeddings task. */
class BackgroundTaskStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val QUEUED = of("queued")

        @JvmField val PROCESSING = of("processing")

        @JvmField val SUCCESS = of("success")

        @JvmField val FAILURE = of("failure")

        @JvmField val PARTIAL_SUCCESS = of("partial_success")

        @JvmStatic fun of(value: String) = BackgroundTaskStatus(JsonField.of(value))
    }

    /** An enum containing [BackgroundTaskStatus]'s known values. */
    enum class Known {
        QUEUED,
        PROCESSING,
        SUCCESS,
        FAILURE,
        PARTIAL_SUCCESS,
    }

    /**
     * An enum containing [BackgroundTaskStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BackgroundTaskStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        QUEUED,
        PROCESSING,
        SUCCESS,
        FAILURE,
        PARTIAL_SUCCESS,
        /**
         * An enum member indicating that [BackgroundTaskStatus] was instantiated with an unknown
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
            QUEUED -> Value.QUEUED
            PROCESSING -> Value.PROCESSING
            SUCCESS -> Value.SUCCESS
            FAILURE -> Value.FAILURE
            PARTIAL_SUCCESS -> Value.PARTIAL_SUCCESS
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
            QUEUED -> Known.QUEUED
            PROCESSING -> Known.PROCESSING
            SUCCESS -> Known.SUCCESS
            FAILURE -> Known.FAILURE
            PARTIAL_SUCCESS -> Known.PARTIAL_SUCCESS
            else -> throw TelnyxInvalidDataException("Unknown BackgroundTaskStatus: $value")
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

    fun validate(): BackgroundTaskStatus = apply {
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

        return other is BackgroundTaskStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
