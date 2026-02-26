// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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

class CostInformation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currency: JsonField<String>,
    private val monthlyCost: JsonField<String>,
    private val upfrontCost: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("monthly_cost")
        @ExcludeMissing
        monthlyCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upfront_cost")
        @ExcludeMissing
        upfrontCost: JsonField<String> = JsonMissing.of(),
    ) : this(currency, monthlyCost, upfrontCost, mutableMapOf())

    /**
     * The ISO 4217 code for the currency.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyCost(): Optional<String> = monthlyCost.getOptional("monthly_cost")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upfrontCost(): Optional<String> = upfrontCost.getOptional("upfront_cost")

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [monthlyCost].
     *
     * Unlike [monthlyCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthly_cost")
    @ExcludeMissing
    fun _monthlyCost(): JsonField<String> = monthlyCost

    /**
     * Returns the raw JSON value of [upfrontCost].
     *
     * Unlike [upfrontCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upfront_cost")
    @ExcludeMissing
    fun _upfrontCost(): JsonField<String> = upfrontCost

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

        /** Returns a mutable builder for constructing an instance of [CostInformation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CostInformation]. */
    class Builder internal constructor() {

        private var currency: JsonField<String> = JsonMissing.of()
        private var monthlyCost: JsonField<String> = JsonMissing.of()
        private var upfrontCost: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(costInformation: CostInformation) = apply {
            currency = costInformation.currency
            monthlyCost = costInformation.monthlyCost
            upfrontCost = costInformation.upfrontCost
            additionalProperties = costInformation.additionalProperties.toMutableMap()
        }

        /** The ISO 4217 code for the currency. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun monthlyCost(monthlyCost: String) = monthlyCost(JsonField.of(monthlyCost))

        /**
         * Sets [Builder.monthlyCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyCost(monthlyCost: JsonField<String>) = apply { this.monthlyCost = monthlyCost }

        fun upfrontCost(upfrontCost: String) = upfrontCost(JsonField.of(upfrontCost))

        /**
         * Sets [Builder.upfrontCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upfrontCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upfrontCost(upfrontCost: JsonField<String>) = apply { this.upfrontCost = upfrontCost }

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
         * Returns an immutable instance of [CostInformation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CostInformation =
            CostInformation(currency, monthlyCost, upfrontCost, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CostInformation = apply {
        if (validated) {
            return@apply
        }

        currency()
        monthlyCost()
        upfrontCost()
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
        (if (currency.asKnown().isPresent) 1 else 0) +
            (if (monthlyCost.asKnown().isPresent) 1 else 0) +
            (if (upfrontCost.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CostInformation &&
            currency == other.currency &&
            monthlyCost == other.monthlyCost &&
            upfrontCost == other.upfrontCost &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currency, monthlyCost, upfrontCost, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CostInformation{currency=$currency, monthlyCost=$monthlyCost, upfrontCost=$upfrontCost, additionalProperties=$additionalProperties}"
}
