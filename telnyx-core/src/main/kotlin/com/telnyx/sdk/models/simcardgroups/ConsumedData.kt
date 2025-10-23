// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

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

/** Represents the amount of data consumed. */
class ConsumedData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<String>,
    private val unit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
    ) : this(amount, unit, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<String> = amount.getOptional("amount")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

        /** Returns a mutable builder for constructing an instance of [ConsumedData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConsumedData]. */
    class Builder internal constructor() {

        private var amount: JsonField<String> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(consumedData: ConsumedData) = apply {
            amount = consumedData.amount
            unit = consumedData.unit
            additionalProperties = consumedData.additionalProperties.toMutableMap()
        }

        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
         * Returns an immutable instance of [ConsumedData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConsumedData = ConsumedData(amount, unit, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ConsumedData = apply {
        if (validated) {
            return@apply
        }

        amount()
        unit()
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
        (if (amount.asKnown().isPresent) 1 else 0) + (if (unit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConsumedData &&
            amount == other.amount &&
            unit == other.unit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConsumedData{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
}
