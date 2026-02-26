// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class BrandOptionalAttributes
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val taxExemptStatus: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("taxExemptStatus")
        @ExcludeMissing
        taxExemptStatus: JsonField<String> = JsonMissing.of()
    ) : this(taxExemptStatus, mutableMapOf())

    /**
     * The tax exempt status of the brand
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxExemptStatus(): Optional<String> = taxExemptStatus.getOptional("taxExemptStatus")

    /**
     * Returns the raw JSON value of [taxExemptStatus].
     *
     * Unlike [taxExemptStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxExemptStatus")
    @ExcludeMissing
    fun _taxExemptStatus(): JsonField<String> = taxExemptStatus

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

        /** Returns a mutable builder for constructing an instance of [BrandOptionalAttributes]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandOptionalAttributes]. */
    class Builder internal constructor() {

        private var taxExemptStatus: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandOptionalAttributes: BrandOptionalAttributes) = apply {
            taxExemptStatus = brandOptionalAttributes.taxExemptStatus
            additionalProperties = brandOptionalAttributes.additionalProperties.toMutableMap()
        }

        /** The tax exempt status of the brand */
        fun taxExemptStatus(taxExemptStatus: String) =
            taxExemptStatus(JsonField.of(taxExemptStatus))

        /**
         * Sets [Builder.taxExemptStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxExemptStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxExemptStatus(taxExemptStatus: JsonField<String>) = apply {
            this.taxExemptStatus = taxExemptStatus
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
         * Returns an immutable instance of [BrandOptionalAttributes].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandOptionalAttributes =
            BrandOptionalAttributes(taxExemptStatus, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandOptionalAttributes = apply {
        if (validated) {
            return@apply
        }

        taxExemptStatus()
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
    @JvmSynthetic internal fun validity(): Int = (if (taxExemptStatus.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandOptionalAttributes &&
            taxExemptStatus == other.taxExemptStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(taxExemptStatus, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandOptionalAttributes{taxExemptStatus=$taxExemptStatus, additionalProperties=$additionalProperties}"
}
