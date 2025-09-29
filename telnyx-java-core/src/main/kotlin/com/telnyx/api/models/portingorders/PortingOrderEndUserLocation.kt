// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PortingOrderEndUserLocation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val administrativeArea: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val extendedAddress: JsonField<String>,
    private val locality: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val streetAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("administrative_area")
        @ExcludeMissing
        administrativeArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extended_address")
        @ExcludeMissing
        extendedAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_address")
        @ExcludeMissing
        streetAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        administrativeArea,
        countryCode,
        extendedAddress,
        locality,
        postalCode,
        streetAddress,
        mutableMapOf(),
    )

    /**
     * State, province, or similar of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun administrativeArea(): Optional<String> =
        administrativeArea.getOptional("administrative_area")

    /**
     * ISO3166-1 alpha-2 country code of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * Second line of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

    /**
     * City or municipality of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locality(): Optional<String> = locality.getOptional("locality")

    /**
     * Postal Code of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

    /**
     * First line of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streetAddress(): Optional<String> = streetAddress.getOptional("street_address")

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
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [extendedAddress].
     *
     * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extended_address")
    @ExcludeMissing
    fun _extendedAddress(): JsonField<String> = extendedAddress

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

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
         * Returns a mutable builder for constructing an instance of [PortingOrderEndUserLocation].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderEndUserLocation]. */
    class Builder internal constructor() {

        private var administrativeArea: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var extendedAddress: JsonField<String> = JsonMissing.of()
        private var locality: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var streetAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderEndUserLocation: PortingOrderEndUserLocation) = apply {
            administrativeArea = portingOrderEndUserLocation.administrativeArea
            countryCode = portingOrderEndUserLocation.countryCode
            extendedAddress = portingOrderEndUserLocation.extendedAddress
            locality = portingOrderEndUserLocation.locality
            postalCode = portingOrderEndUserLocation.postalCode
            streetAddress = portingOrderEndUserLocation.streetAddress
            additionalProperties = portingOrderEndUserLocation.additionalProperties.toMutableMap()
        }

        /** State, province, or similar of billing address */
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

        /** ISO3166-1 alpha-2 country code of billing address */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Second line of billing address */
        fun extendedAddress(extendedAddress: String) =
            extendedAddress(JsonField.of(extendedAddress))

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

        /** City or municipality of billing address */
        fun locality(locality: String) = locality(JsonField.of(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        /** Postal Code of billing address */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** First line of billing address */
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
         * Returns an immutable instance of [PortingOrderEndUserLocation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderEndUserLocation =
            PortingOrderEndUserLocation(
                administrativeArea,
                countryCode,
                extendedAddress,
                locality,
                postalCode,
                streetAddress,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderEndUserLocation = apply {
        if (validated) {
            return@apply
        }

        administrativeArea()
        countryCode()
        extendedAddress()
        locality()
        postalCode()
        streetAddress()
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
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (extendedAddress.asKnown().isPresent) 1 else 0) +
            (if (locality.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (streetAddress.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderEndUserLocation &&
            administrativeArea == other.administrativeArea &&
            countryCode == other.countryCode &&
            extendedAddress == other.extendedAddress &&
            locality == other.locality &&
            postalCode == other.postalCode &&
            streetAddress == other.streetAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            administrativeArea,
            countryCode,
            extendedAddress,
            locality,
            postalCode,
            streetAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderEndUserLocation{administrativeArea=$administrativeArea, countryCode=$countryCode, extendedAddress=$extendedAddress, locality=$locality, postalCode=$postalCode, streetAddress=$streetAddress, additionalProperties=$additionalProperties}"
}
