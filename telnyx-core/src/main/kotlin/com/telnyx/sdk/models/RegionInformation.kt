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

class RegionInformation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val regionName: JsonField<String>,
    private val regionType: JsonField<RegionType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("region_name")
        @ExcludeMissing
        regionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region_type")
        @ExcludeMissing
        regionType: JsonField<RegionType> = JsonMissing.of(),
    ) : this(regionName, regionType, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionName(): Optional<String> = regionName.getOptional("region_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionType(): Optional<RegionType> = regionType.getOptional("region_type")

    /**
     * Returns the raw JSON value of [regionName].
     *
     * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region_name") @ExcludeMissing fun _regionName(): JsonField<String> = regionName

    /**
     * Returns the raw JSON value of [regionType].
     *
     * Unlike [regionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region_type")
    @ExcludeMissing
    fun _regionType(): JsonField<RegionType> = regionType

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

        /** Returns a mutable builder for constructing an instance of [RegionInformation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RegionInformation]. */
    class Builder internal constructor() {

        private var regionName: JsonField<String> = JsonMissing.of()
        private var regionType: JsonField<RegionType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(regionInformation: RegionInformation) = apply {
            regionName = regionInformation.regionName
            regionType = regionInformation.regionType
            additionalProperties = regionInformation.additionalProperties.toMutableMap()
        }

        fun regionName(regionName: String) = regionName(JsonField.of(regionName))

        /**
         * Sets [Builder.regionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

        fun regionType(regionType: RegionType) = regionType(JsonField.of(regionType))

        /**
         * Sets [Builder.regionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionType] with a well-typed [RegionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regionType(regionType: JsonField<RegionType>) = apply { this.regionType = regionType }

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
         * Returns an immutable instance of [RegionInformation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RegionInformation =
            RegionInformation(regionName, regionType, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): RegionInformation = apply {
        if (validated) {
            return@apply
        }

        regionName()
        regionType().ifPresent { it.validate() }
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
        (if (regionName.asKnown().isPresent) 1 else 0) +
            (regionType.asKnown().getOrNull()?.validity() ?: 0)

    class RegionType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COUNTRY_CODE = of("country_code")

            @JvmField val RATE_CENTER = of("rate_center")

            @JvmField val STATE = of("state")

            @JvmField val LOCATION = of("location")

            @JvmStatic fun of(value: String) = RegionType(JsonField.of(value))
        }

        /** An enum containing [RegionType]'s known values. */
        enum class Known {
            COUNTRY_CODE,
            RATE_CENTER,
            STATE,
            LOCATION,
        }

        /**
         * An enum containing [RegionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RegionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COUNTRY_CODE,
            RATE_CENTER,
            STATE,
            LOCATION,
            /**
             * An enum member indicating that [RegionType] was instantiated with an unknown value.
             */
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
                COUNTRY_CODE -> Value.COUNTRY_CODE
                RATE_CENTER -> Value.RATE_CENTER
                STATE -> Value.STATE
                LOCATION -> Value.LOCATION
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
                COUNTRY_CODE -> Known.COUNTRY_CODE
                RATE_CENTER -> Known.RATE_CENTER
                STATE -> Known.STATE
                LOCATION -> Known.LOCATION
                else -> throw TelnyxInvalidDataException("Unknown RegionType: $value")
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

        fun validate(): RegionType = apply {
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

            return other is RegionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegionInformation &&
            regionName == other.regionName &&
            regionType == other.regionType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(regionName, regionType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RegionInformation{regionName=$regionName, regionType=$regionType, additionalProperties=$additionalProperties}"
}
