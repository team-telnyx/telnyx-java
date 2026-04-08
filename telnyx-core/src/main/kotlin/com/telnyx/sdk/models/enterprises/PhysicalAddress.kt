// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhysicalAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val administrativeArea: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val streetAddress: JsonField<String>,
    private val extendedAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("administrative_area")
        @ExcludeMissing
        administrativeArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_address")
        @ExcludeMissing
        streetAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extended_address")
        @ExcludeMissing
        extendedAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        administrativeArea,
        city,
        country,
        postalCode,
        streetAddress,
        extendedAddress,
        mutableMapOf(),
    )

    /**
     * State or province
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

    /**
     * City name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * Country name (e.g., United States)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * ZIP or postal code
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * Street address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun streetAddress(): String = streetAddress.getRequired("street_address")

    /**
     * Additional address line (suite, apt, etc.)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

    /**
     * Returns the raw JSON value of [administrativeArea].
     *
     * Unlike [administrativeArea], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("administrative_area")
    @ExcludeMissing
    fun _administrativeArea(): JsonField<String> = administrativeArea

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [streetAddress].
     *
     * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street_address")
    @ExcludeMissing
    fun _streetAddress(): JsonField<String> = streetAddress

    /**
     * Returns the raw JSON value of [extendedAddress].
     *
     * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extended_address")
    @ExcludeMissing
    fun _extendedAddress(): JsonField<String> = extendedAddress

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

        /**
         * Returns a mutable builder for constructing an instance of [PhysicalAddress].
         *
         * The following fields are required:
         * ```java
         * .administrativeArea()
         * .city()
         * .country()
         * .postalCode()
         * .streetAddress()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhysicalAddress]. */
    class Builder internal constructor() {

        private var administrativeArea: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var streetAddress: JsonField<String>? = null
        private var extendedAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalAddress: PhysicalAddress) = apply {
            administrativeArea = physicalAddress.administrativeArea
            city = physicalAddress.city
            country = physicalAddress.country
            postalCode = physicalAddress.postalCode
            streetAddress = physicalAddress.streetAddress
            extendedAddress = physicalAddress.extendedAddress
            additionalProperties = physicalAddress.additionalProperties.toMutableMap()
        }

        /** State or province */
        fun administrativeArea(administrativeArea: String) =
            administrativeArea(JsonField.of(administrativeArea))

        /**
         * Sets [Builder.administrativeArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.administrativeArea] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun administrativeArea(administrativeArea: JsonField<String>) = apply {
            this.administrativeArea = administrativeArea
        }

        /** City name */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Country name (e.g., United States) */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** ZIP or postal code */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** Street address */
        fun streetAddress(streetAddress: String) = streetAddress(JsonField.of(streetAddress))

        /**
         * Sets [Builder.streetAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streetAddress(streetAddress: JsonField<String>) = apply {
            this.streetAddress = streetAddress
        }

        /** Additional address line (suite, apt, etc.) */
        fun extendedAddress(extendedAddress: String?) =
            extendedAddress(JsonField.ofNullable(extendedAddress))

        /** Alias for calling [Builder.extendedAddress] with `extendedAddress.orElse(null)`. */
        fun extendedAddress(extendedAddress: Optional<String>) =
            extendedAddress(extendedAddress.getOrNull())

        /**
         * Sets [Builder.extendedAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendedAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extendedAddress(extendedAddress: JsonField<String>) = apply {
            this.extendedAddress = extendedAddress
        }

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
         * Returns an immutable instance of [PhysicalAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .administrativeArea()
         * .city()
         * .country()
         * .postalCode()
         * .streetAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalAddress =
            PhysicalAddress(
                checkRequired("administrativeArea", administrativeArea),
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("postalCode", postalCode),
                checkRequired("streetAddress", streetAddress),
                extendedAddress,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhysicalAddress = apply {
        if (validated) {
            return@apply
        }

        administrativeArea()
        city()
        country()
        postalCode()
        streetAddress()
        extendedAddress()
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
        (if (administrativeArea.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (streetAddress.asKnown().isPresent) 1 else 0) +
            (if (extendedAddress.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalAddress &&
            administrativeArea == other.administrativeArea &&
            city == other.city &&
            country == other.country &&
            postalCode == other.postalCode &&
            streetAddress == other.streetAddress &&
            extendedAddress == other.extendedAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            administrativeArea,
            city,
            country,
            postalCode,
            streetAddress,
            extendedAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalAddress{administrativeArea=$administrativeArea, city=$city, country=$country, postalCode=$postalCode, streetAddress=$streetAddress, extendedAddress=$extendedAddress, additionalProperties=$additionalProperties}"
}
