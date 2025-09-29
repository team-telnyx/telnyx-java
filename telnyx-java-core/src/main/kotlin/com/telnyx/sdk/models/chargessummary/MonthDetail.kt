// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.chargessummary

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

class MonthDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mrc: JsonField<String>,
    private val quantity: JsonField<Long>,
    private val otc: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mrc") @ExcludeMissing mrc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("otc") @ExcludeMissing otc: JsonField<String> = JsonMissing.of(),
    ) : this(mrc, quantity, otc, mutableMapOf())

    /**
     * Monthly recurring charge amount as decimal string
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mrc(): String = mrc.getRequired("mrc")

    /**
     * Number of items
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Long = quantity.getRequired("quantity")

    /**
     * One-time charge amount as decimal string
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otc(): Optional<String> = otc.getOptional("otc")

    /**
     * Returns the raw JSON value of [mrc].
     *
     * Unlike [mrc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mrc") @ExcludeMissing fun _mrc(): JsonField<String> = mrc

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Returns the raw JSON value of [otc].
     *
     * Unlike [otc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("otc") @ExcludeMissing fun _otc(): JsonField<String> = otc

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
         * Returns a mutable builder for constructing an instance of [MonthDetail].
         *
         * The following fields are required:
         * ```java
         * .mrc()
         * .quantity()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MonthDetail]. */
    class Builder internal constructor() {

        private var mrc: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var otc: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(monthDetail: MonthDetail) = apply {
            mrc = monthDetail.mrc
            quantity = monthDetail.quantity
            otc = monthDetail.otc
            additionalProperties = monthDetail.additionalProperties.toMutableMap()
        }

        /** Monthly recurring charge amount as decimal string */
        fun mrc(mrc: String) = mrc(JsonField.of(mrc))

        /**
         * Sets [Builder.mrc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mrc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mrc(mrc: JsonField<String>) = apply { this.mrc = mrc }

        /** Number of items */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /** One-time charge amount as decimal string */
        fun otc(otc: String?) = otc(JsonField.ofNullable(otc))

        /** Alias for calling [Builder.otc] with `otc.orElse(null)`. */
        fun otc(otc: Optional<String>) = otc(otc.getOrNull())

        /**
         * Sets [Builder.otc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun otc(otc: JsonField<String>) = apply { this.otc = otc }

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
         * Returns an immutable instance of [MonthDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mrc()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MonthDetail =
            MonthDetail(
                checkRequired("mrc", mrc),
                checkRequired("quantity", quantity),
                otc,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MonthDetail = apply {
        if (validated) {
            return@apply
        }

        mrc()
        quantity()
        otc()
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
        (if (mrc.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (otc.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MonthDetail &&
            mrc == other.mrc &&
            quantity == other.quantity &&
            otc == other.otc &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(mrc, quantity, otc, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MonthDetail{mrc=$mrc, quantity=$quantity, otc=$otc, additionalProperties=$additionalProperties}"
}
