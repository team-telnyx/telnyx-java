// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voice

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

/** The CNAM listing settings for a phone number. */
class CnamListing
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cnamListingDetails: JsonField<String>,
    private val cnamListingEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cnam_listing_details")
        @ExcludeMissing
        cnamListingDetails: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cnam_listing_enabled")
        @ExcludeMissing
        cnamListingEnabled: JsonField<Boolean> = JsonMissing.of(),
    ) : this(cnamListingDetails, cnamListingEnabled, mutableMapOf())

    /**
     * The CNAM listing details for this number. Must be alphanumeric characters or spaces with a
     * maximum length of 15. Requires cnam_listing_enabled to also be set to true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cnamListingDetails(): Optional<String> =
        cnamListingDetails.getOptional("cnam_listing_details")

    /**
     * Enables CNAM listings for this number. Requires cnam_listing_details to also be set.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cnamListingEnabled(): Optional<Boolean> =
        cnamListingEnabled.getOptional("cnam_listing_enabled")

    /**
     * Returns the raw JSON value of [cnamListingDetails].
     *
     * Unlike [cnamListingDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cnam_listing_details")
    @ExcludeMissing
    fun _cnamListingDetails(): JsonField<String> = cnamListingDetails

    /**
     * Returns the raw JSON value of [cnamListingEnabled].
     *
     * Unlike [cnamListingEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cnam_listing_enabled")
    @ExcludeMissing
    fun _cnamListingEnabled(): JsonField<Boolean> = cnamListingEnabled

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

        /** Returns a mutable builder for constructing an instance of [CnamListing]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CnamListing]. */
    class Builder internal constructor() {

        private var cnamListingDetails: JsonField<String> = JsonMissing.of()
        private var cnamListingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cnamListing: CnamListing) = apply {
            cnamListingDetails = cnamListing.cnamListingDetails
            cnamListingEnabled = cnamListing.cnamListingEnabled
            additionalProperties = cnamListing.additionalProperties.toMutableMap()
        }

        /**
         * The CNAM listing details for this number. Must be alphanumeric characters or spaces with
         * a maximum length of 15. Requires cnam_listing_enabled to also be set to true.
         */
        fun cnamListingDetails(cnamListingDetails: String) =
            cnamListingDetails(JsonField.of(cnamListingDetails))

        /**
         * Sets [Builder.cnamListingDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cnamListingDetails] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cnamListingDetails(cnamListingDetails: JsonField<String>) = apply {
            this.cnamListingDetails = cnamListingDetails
        }

        /** Enables CNAM listings for this number. Requires cnam_listing_details to also be set. */
        fun cnamListingEnabled(cnamListingEnabled: Boolean) =
            cnamListingEnabled(JsonField.of(cnamListingEnabled))

        /**
         * Sets [Builder.cnamListingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cnamListingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cnamListingEnabled(cnamListingEnabled: JsonField<Boolean>) = apply {
            this.cnamListingEnabled = cnamListingEnabled
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
         * Returns an immutable instance of [CnamListing].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CnamListing =
            CnamListing(cnamListingDetails, cnamListingEnabled, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CnamListing = apply {
        if (validated) {
            return@apply
        }

        cnamListingDetails()
        cnamListingEnabled()
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
        (if (cnamListingDetails.asKnown().isPresent) 1 else 0) +
            (if (cnamListingEnabled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CnamListing &&
            cnamListingDetails == other.cnamListingDetails &&
            cnamListingEnabled == other.cnamListingEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cnamListingDetails, cnamListingEnabled, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CnamListing{cnamListingDetails=$cnamListingDetails, cnamListingEnabled=$cnamListingEnabled, additionalProperties=$additionalProperties}"
}
