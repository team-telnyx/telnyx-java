// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** Language to transcribe. Deepgram's medical and phonecall models support English only. */
class DeepgramEnglishTranscriptionLanguage
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

        @JvmField val EN = of("en")

        @JvmField val EN_US = of("en-US")

        @JvmField val EN_AU = of("en-AU")

        @JvmField val EN_GB = of("en-GB")

        @JvmField val EN_IN = of("en-IN")

        @JvmField val EN_NZ = of("en-NZ")

        @JvmStatic fun of(value: String) = DeepgramEnglishTranscriptionLanguage(JsonField.of(value))
    }

    /** An enum containing [DeepgramEnglishTranscriptionLanguage]'s known values. */
    enum class Known {
        EN,
        EN_US,
        EN_AU,
        EN_GB,
        EN_IN,
        EN_NZ,
    }

    /**
     * An enum containing [DeepgramEnglishTranscriptionLanguage]'s known values, as well as an
     * [_UNKNOWN] member.
     *
     * An instance of [DeepgramEnglishTranscriptionLanguage] can contain an unknown value in a
     * couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        EN,
        EN_US,
        EN_AU,
        EN_GB,
        EN_IN,
        EN_NZ,
        /**
         * An enum member indicating that [DeepgramEnglishTranscriptionLanguage] was instantiated
         * with an unknown value.
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
            EN -> Value.EN
            EN_US -> Value.EN_US
            EN_AU -> Value.EN_AU
            EN_GB -> Value.EN_GB
            EN_IN -> Value.EN_IN
            EN_NZ -> Value.EN_NZ
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
            EN -> Known.EN
            EN_US -> Known.EN_US
            EN_AU -> Known.EN_AU
            EN_GB -> Known.EN_GB
            EN_IN -> Known.EN_IN
            EN_NZ -> Known.EN_NZ
            else ->
                throw TelnyxInvalidDataException(
                    "Unknown DeepgramEnglishTranscriptionLanguage: $value"
                )
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
    fun validate(): DeepgramEnglishTranscriptionLanguage = apply {
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

        return other is DeepgramEnglishTranscriptionLanguage && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
