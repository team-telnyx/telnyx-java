// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** Vertical or industry segment of the brand or campaign. */
class Vertical @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val AGRICULTURE = of("AGRICULTURE")

        @JvmField val COMMUNICATION = of("COMMUNICATION")

        @JvmField val CONSTRUCTION = of("CONSTRUCTION")

        @JvmField val EDUCATION = of("EDUCATION")

        @JvmField val ENERGY = of("ENERGY")

        @JvmField val ENTERTAINMENT = of("ENTERTAINMENT")

        @JvmField val FINANCIAL = of("FINANCIAL")

        @JvmField val GAMBLING = of("GAMBLING")

        @JvmField val GOVERNMENT = of("GOVERNMENT")

        @JvmField val HEALTHCARE = of("HEALTHCARE")

        @JvmField val HOSPITALITY = of("HOSPITALITY")

        @JvmField val HUMAN_RESOURCES = of("HUMAN_RESOURCES")

        @JvmField val INSURANCE = of("INSURANCE")

        @JvmField val LEGAL = of("LEGAL")

        @JvmField val MANUFACTURING = of("MANUFACTURING")

        @JvmField val NGO = of("NGO")

        @JvmField val POLITICAL = of("POLITICAL")

        @JvmField val POSTAL = of("POSTAL")

        @JvmField val PROFESSIONAL = of("PROFESSIONAL")

        @JvmField val REAL_ESTATE = of("REAL_ESTATE")

        @JvmField val RETAIL = of("RETAIL")

        @JvmField val TECHNOLOGY = of("TECHNOLOGY")

        @JvmField val TRANSPORTATION = of("TRANSPORTATION")

        @JvmStatic fun of(value: String) = Vertical(JsonField.of(value))
    }

    /** An enum containing [Vertical]'s known values. */
    enum class Known {
        AGRICULTURE,
        COMMUNICATION,
        CONSTRUCTION,
        EDUCATION,
        ENERGY,
        ENTERTAINMENT,
        FINANCIAL,
        GAMBLING,
        GOVERNMENT,
        HEALTHCARE,
        HOSPITALITY,
        HUMAN_RESOURCES,
        INSURANCE,
        LEGAL,
        MANUFACTURING,
        NGO,
        POLITICAL,
        POSTAL,
        PROFESSIONAL,
        REAL_ESTATE,
        RETAIL,
        TECHNOLOGY,
        TRANSPORTATION,
    }

    /**
     * An enum containing [Vertical]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Vertical] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AGRICULTURE,
        COMMUNICATION,
        CONSTRUCTION,
        EDUCATION,
        ENERGY,
        ENTERTAINMENT,
        FINANCIAL,
        GAMBLING,
        GOVERNMENT,
        HEALTHCARE,
        HOSPITALITY,
        HUMAN_RESOURCES,
        INSURANCE,
        LEGAL,
        MANUFACTURING,
        NGO,
        POLITICAL,
        POSTAL,
        PROFESSIONAL,
        REAL_ESTATE,
        RETAIL,
        TECHNOLOGY,
        TRANSPORTATION,
        /** An enum member indicating that [Vertical] was instantiated with an unknown value. */
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
            AGRICULTURE -> Value.AGRICULTURE
            COMMUNICATION -> Value.COMMUNICATION
            CONSTRUCTION -> Value.CONSTRUCTION
            EDUCATION -> Value.EDUCATION
            ENERGY -> Value.ENERGY
            ENTERTAINMENT -> Value.ENTERTAINMENT
            FINANCIAL -> Value.FINANCIAL
            GAMBLING -> Value.GAMBLING
            GOVERNMENT -> Value.GOVERNMENT
            HEALTHCARE -> Value.HEALTHCARE
            HOSPITALITY -> Value.HOSPITALITY
            HUMAN_RESOURCES -> Value.HUMAN_RESOURCES
            INSURANCE -> Value.INSURANCE
            LEGAL -> Value.LEGAL
            MANUFACTURING -> Value.MANUFACTURING
            NGO -> Value.NGO
            POLITICAL -> Value.POLITICAL
            POSTAL -> Value.POSTAL
            PROFESSIONAL -> Value.PROFESSIONAL
            REAL_ESTATE -> Value.REAL_ESTATE
            RETAIL -> Value.RETAIL
            TECHNOLOGY -> Value.TECHNOLOGY
            TRANSPORTATION -> Value.TRANSPORTATION
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
            AGRICULTURE -> Known.AGRICULTURE
            COMMUNICATION -> Known.COMMUNICATION
            CONSTRUCTION -> Known.CONSTRUCTION
            EDUCATION -> Known.EDUCATION
            ENERGY -> Known.ENERGY
            ENTERTAINMENT -> Known.ENTERTAINMENT
            FINANCIAL -> Known.FINANCIAL
            GAMBLING -> Known.GAMBLING
            GOVERNMENT -> Known.GOVERNMENT
            HEALTHCARE -> Known.HEALTHCARE
            HOSPITALITY -> Known.HOSPITALITY
            HUMAN_RESOURCES -> Known.HUMAN_RESOURCES
            INSURANCE -> Known.INSURANCE
            LEGAL -> Known.LEGAL
            MANUFACTURING -> Known.MANUFACTURING
            NGO -> Known.NGO
            POLITICAL -> Known.POLITICAL
            POSTAL -> Known.POSTAL
            PROFESSIONAL -> Known.PROFESSIONAL
            REAL_ESTATE -> Known.REAL_ESTATE
            RETAIL -> Known.RETAIL
            TECHNOLOGY -> Known.TECHNOLOGY
            TRANSPORTATION -> Known.TRANSPORTATION
            else -> throw TelnyxInvalidDataException("Unknown Vertical: $value")
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

    fun validate(): Vertical = apply {
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

        return other is Vertical && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
