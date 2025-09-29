// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardorderpreview

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
import kotlin.jvm.optionals.getOrNull

class SimCardOrderPreviewPreviewResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [SimCardOrderPreviewPreviewResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardOrderPreviewPreviewResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simCardOrderPreviewPreviewResponse: SimCardOrderPreviewPreviewResponse) =
            apply {
                data = simCardOrderPreviewPreviewResponse.data
                additionalProperties =
                    simCardOrderPreviewPreviewResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [SimCardOrderPreviewPreviewResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardOrderPreviewPreviewResponse =
            SimCardOrderPreviewPreviewResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SimCardOrderPreviewPreviewResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val quantity: JsonField<Long>,
        private val recordType: JsonField<String>,
        private val shippingCost: JsonField<ShippingCost>,
        private val simCardsCost: JsonField<SimCardsCost>,
        private val totalCost: JsonField<TotalCost>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shipping_cost")
            @ExcludeMissing
            shippingCost: JsonField<ShippingCost> = JsonMissing.of(),
            @JsonProperty("sim_cards_cost")
            @ExcludeMissing
            simCardsCost: JsonField<SimCardsCost> = JsonMissing.of(),
            @JsonProperty("total_cost")
            @ExcludeMissing
            totalCost: JsonField<TotalCost> = JsonMissing.of(),
        ) : this(quantity, recordType, shippingCost, simCardsCost, totalCost, mutableMapOf())

        /**
         * The amount of SIM cards requested in the SIM card order.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quantity(): Optional<Long> = quantity.getOptional("quantity")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippingCost(): Optional<ShippingCost> = shippingCost.getOptional("shipping_cost")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simCardsCost(): Optional<SimCardsCost> = simCardsCost.getOptional("sim_cards_cost")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCost(): Optional<TotalCost> = totalCost.getOptional("total_cost")

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [shippingCost].
         *
         * Unlike [shippingCost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_cost")
        @ExcludeMissing
        fun _shippingCost(): JsonField<ShippingCost> = shippingCost

        /**
         * Returns the raw JSON value of [simCardsCost].
         *
         * Unlike [simCardsCost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sim_cards_cost")
        @ExcludeMissing
        fun _simCardsCost(): JsonField<SimCardsCost> = simCardsCost

        /**
         * Returns the raw JSON value of [totalCost].
         *
         * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_cost")
        @ExcludeMissing
        fun _totalCost(): JsonField<TotalCost> = totalCost

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var quantity: JsonField<Long> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var shippingCost: JsonField<ShippingCost> = JsonMissing.of()
            private var simCardsCost: JsonField<SimCardsCost> = JsonMissing.of()
            private var totalCost: JsonField<TotalCost> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                quantity = data.quantity
                recordType = data.recordType
                shippingCost = data.shippingCost
                simCardsCost = data.simCardsCost
                totalCost = data.totalCost
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The amount of SIM cards requested in the SIM card order. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun shippingCost(shippingCost: ShippingCost) = shippingCost(JsonField.of(shippingCost))

            /**
             * Sets [Builder.shippingCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingCost] with a well-typed [ShippingCost] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippingCost(shippingCost: JsonField<ShippingCost>) = apply {
                this.shippingCost = shippingCost
            }

            fun simCardsCost(simCardsCost: SimCardsCost) = simCardsCost(JsonField.of(simCardsCost))

            /**
             * Sets [Builder.simCardsCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simCardsCost] with a well-typed [SimCardsCost] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simCardsCost(simCardsCost: JsonField<SimCardsCost>) = apply {
                this.simCardsCost = simCardsCost
            }

            fun totalCost(totalCost: TotalCost) = totalCost(JsonField.of(totalCost))

            /**
             * Sets [Builder.totalCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCost] with a well-typed [TotalCost] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCost(totalCost: JsonField<TotalCost>) = apply { this.totalCost = totalCost }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    quantity,
                    recordType,
                    shippingCost,
                    simCardsCost,
                    totalCost,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            quantity()
            recordType()
            shippingCost().ifPresent { it.validate() }
            simCardsCost().ifPresent { it.validate() }
            totalCost().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (shippingCost.asKnown().getOrNull()?.validity() ?: 0) +
                (simCardsCost.asKnown().getOrNull()?.validity() ?: 0) +
                (totalCost.asKnown().getOrNull()?.validity() ?: 0)

        class ShippingCost
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * A string representing the cost amount.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<String> = amount.getOptional("amount")

            /**
             * ISO 4217 currency string.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

                /** Returns a mutable builder for constructing an instance of [ShippingCost]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ShippingCost]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(shippingCost: ShippingCost) = apply {
                    amount = shippingCost.amount
                    currency = shippingCost.currency
                    additionalProperties = shippingCost.additionalProperties.toMutableMap()
                }

                /** A string representing the cost amount. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** ISO 4217 currency string. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ShippingCost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ShippingCost =
                    ShippingCost(amount, currency, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ShippingCost = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ShippingCost &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ShippingCost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class SimCardsCost
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * A string representing the cost amount.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<String> = amount.getOptional("amount")

            /**
             * ISO 4217 currency string.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

                /** Returns a mutable builder for constructing an instance of [SimCardsCost]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SimCardsCost]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(simCardsCost: SimCardsCost) = apply {
                    amount = simCardsCost.amount
                    currency = simCardsCost.currency
                    additionalProperties = simCardsCost.additionalProperties.toMutableMap()
                }

                /** A string representing the cost amount. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** ISO 4217 currency string. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SimCardsCost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SimCardsCost =
                    SimCardsCost(amount, currency, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): SimCardsCost = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SimCardsCost &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SimCardsCost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class TotalCost
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * A string representing the cost amount.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<String> = amount.getOptional("amount")

            /**
             * ISO 4217 currency string.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

                /** Returns a mutable builder for constructing an instance of [TotalCost]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TotalCost]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(totalCost: TotalCost) = apply {
                    amount = totalCost.amount
                    currency = totalCost.currency
                    additionalProperties = totalCost.additionalProperties.toMutableMap()
                }

                /** A string representing the cost amount. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** ISO 4217 currency string. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TotalCost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TotalCost =
                    TotalCost(amount, currency, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): TotalCost = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TotalCost &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TotalCost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                quantity == other.quantity &&
                recordType == other.recordType &&
                shippingCost == other.shippingCost &&
                simCardsCost == other.simCardsCost &&
                totalCost == other.totalCost &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                quantity,
                recordType,
                shippingCost,
                simCardsCost,
                totalCost,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{quantity=$quantity, recordType=$recordType, shippingCost=$shippingCost, simCardsCost=$simCardsCost, totalCost=$totalCost, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardOrderPreviewPreviewResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimCardOrderPreviewPreviewResponse{data=$data, additionalProperties=$additionalProperties}"
}
