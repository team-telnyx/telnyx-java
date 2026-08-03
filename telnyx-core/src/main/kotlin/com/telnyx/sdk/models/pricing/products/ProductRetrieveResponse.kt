// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProductRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PricingPaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<PricingPaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): PricingPaginationMeta = meta.getRequired("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PricingPaginationMeta> = meta

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
         * Returns a mutable builder for constructing an instance of [ProductRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PricingPaginationMeta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productRetrieveResponse: ProductRetrieveResponse) = apply {
            data = productRetrieveResponse.data.map { it.toMutableList() }
            meta = productRetrieveResponse.meta
            additionalProperties = productRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PricingPaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PricingPaginationMeta] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meta(meta: JsonField<PricingPaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [ProductRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductRetrieveResponse =
            ProductRetrieveResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ProductRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        meta().validate()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A single pricing entry. Standard products include rate, unit, currency, type, country_iso,
     * direction, and tiers. Inference products include model, input_rate, output_rate,
     * cached_input_rate, and their respective tier arrays. Rate-deck products include pricing_type
     * and note fields with null rate and empty tiers.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cachedInputRate: JsonField<String>,
        private val cachedInputTiers: JsonField<List<PricingTier>>,
        private val countryIso: JsonField<String>,
        private val currency: JsonField<String>,
        private val direction: JsonField<String>,
        private val inputRate: JsonField<String>,
        private val inputTiers: JsonField<List<PricingTier>>,
        private val model: JsonField<String>,
        private val name: JsonField<String>,
        private val note: JsonField<String>,
        private val outputRate: JsonField<String>,
        private val outputTiers: JsonField<List<PricingTier>>,
        private val pricingType: JsonField<String>,
        private val rate: JsonField<Rate>,
        private val tiers: JsonField<List<PricingTier>>,
        private val type: JsonField<String>,
        private val unit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cached_input_rate")
            @ExcludeMissing
            cachedInputRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cached_input_tiers")
            @ExcludeMissing
            cachedInputTiers: JsonField<List<PricingTier>> = JsonMissing.of(),
            @JsonProperty("country_iso")
            @ExcludeMissing
            countryIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_rate")
            @ExcludeMissing
            inputRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_tiers")
            @ExcludeMissing
            inputTiers: JsonField<List<PricingTier>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_rate")
            @ExcludeMissing
            outputRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_tiers")
            @ExcludeMissing
            outputTiers: JsonField<List<PricingTier>> = JsonMissing.of(),
            @JsonProperty("pricing_type")
            @ExcludeMissing
            pricingType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<Rate> = JsonMissing.of(),
            @JsonProperty("tiers")
            @ExcludeMissing
            tiers: JsonField<List<PricingTier>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        ) : this(
            cachedInputRate,
            cachedInputTiers,
            countryIso,
            currency,
            direction,
            inputRate,
            inputTiers,
            model,
            name,
            note,
            outputRate,
            outputTiers,
            pricingType,
            rate,
            tiers,
            type,
            unit,
            mutableMapOf(),
        )

        /**
         * Cached input token rate. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cachedInputRate(): Optional<String> = cachedInputRate.getOptional("cached_input_rate")

        /**
         * Cached input token tiered pricing. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cachedInputTiers(): Optional<List<PricingTier>> =
            cachedInputTiers.getOptional("cached_input_tiers")

        /**
         * ISO country code. Null for non-geographic products.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryIso(): Optional<String> = countryIso.getOptional("country_iso")

        /**
         * ISO currency code (e.g., USD).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Direction (e.g., termination). Null for non-directional products.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<String> = direction.getOptional("direction")

        /**
         * Input token rate. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputRate(): Optional<String> = inputRate.getOptional("input_rate")

        /**
         * Input token tiered pricing. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputTiers(): Optional<List<PricingTier>> = inputTiers.getOptional("input_tiers")

        /**
         * Model identifier. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Human-readable name describing the pricing entry.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Additional note for rate-deck products (e.g., "Pricing is determined by the WhatsApp rate
         * deck.").
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun note(): Optional<String> = note.getOptional("note")

        /**
         * Output token rate. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputRate(): Optional<String> = outputRate.getOptional("output_rate")

        /**
         * Output token tiered pricing. Present only on inference product entries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputTiers(): Optional<List<PricingTier>> = outputTiers.getOptional("output_tiers")

        /**
         * Pricing type for non-standard products (e.g., rate_deck). Absent on standard products.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricingType(): Optional<String> = pricingType.getOptional("pricing_type")

        /**
         * Per-unit rate. Numeric for standard products, string for inference products. Null for
         * rate-deck products.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<Rate> = rate.getOptional("rate")

        /**
         * Volume-based tiered pricing. Empty for rate-deck products.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tiers(): Optional<List<PricingTier>> = tiers.getOptional("tiers")

        /**
         * Pricing type (e.g., usage).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Unit of measurement (e.g., part, message, GB, per_1k_tokens).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<String> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [cachedInputRate].
         *
         * Unlike [cachedInputRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cached_input_rate")
        @ExcludeMissing
        fun _cachedInputRate(): JsonField<String> = cachedInputRate

        /**
         * Returns the raw JSON value of [cachedInputTiers].
         *
         * Unlike [cachedInputTiers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cached_input_tiers")
        @ExcludeMissing
        fun _cachedInputTiers(): JsonField<List<PricingTier>> = cachedInputTiers

        /**
         * Returns the raw JSON value of [countryIso].
         *
         * Unlike [countryIso], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_iso")
        @ExcludeMissing
        fun _countryIso(): JsonField<String> = countryIso

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [inputRate].
         *
         * Unlike [inputRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_rate") @ExcludeMissing fun _inputRate(): JsonField<String> = inputRate

        /**
         * Returns the raw JSON value of [inputTiers].
         *
         * Unlike [inputTiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_tiers")
        @ExcludeMissing
        fun _inputTiers(): JsonField<List<PricingTier>> = inputTiers

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

        /**
         * Returns the raw JSON value of [outputRate].
         *
         * Unlike [outputRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_rate")
        @ExcludeMissing
        fun _outputRate(): JsonField<String> = outputRate

        /**
         * Returns the raw JSON value of [outputTiers].
         *
         * Unlike [outputTiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_tiers")
        @ExcludeMissing
        fun _outputTiers(): JsonField<List<PricingTier>> = outputTiers

        /**
         * Returns the raw JSON value of [pricingType].
         *
         * Unlike [pricingType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pricing_type")
        @ExcludeMissing
        fun _pricingType(): JsonField<String> = pricingType

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Rate> = rate

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<PricingTier>> = tiers

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var cachedInputRate: JsonField<String> = JsonMissing.of()
            private var cachedInputTiers: JsonField<MutableList<PricingTier>>? = null
            private var countryIso: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var inputRate: JsonField<String> = JsonMissing.of()
            private var inputTiers: JsonField<MutableList<PricingTier>>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var outputRate: JsonField<String> = JsonMissing.of()
            private var outputTiers: JsonField<MutableList<PricingTier>>? = null
            private var pricingType: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<Rate> = JsonMissing.of()
            private var tiers: JsonField<MutableList<PricingTier>>? = null
            private var type: JsonField<String> = JsonMissing.of()
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                cachedInputRate = data.cachedInputRate
                cachedInputTiers = data.cachedInputTiers.map { it.toMutableList() }
                countryIso = data.countryIso
                currency = data.currency
                direction = data.direction
                inputRate = data.inputRate
                inputTiers = data.inputTiers.map { it.toMutableList() }
                model = data.model
                name = data.name
                note = data.note
                outputRate = data.outputRate
                outputTiers = data.outputTiers.map { it.toMutableList() }
                pricingType = data.pricingType
                rate = data.rate
                tiers = data.tiers.map { it.toMutableList() }
                type = data.type
                unit = data.unit
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Cached input token rate. Present only on inference product entries. */
            fun cachedInputRate(cachedInputRate: String) =
                cachedInputRate(JsonField.of(cachedInputRate))

            /**
             * Sets [Builder.cachedInputRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cachedInputRate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cachedInputRate(cachedInputRate: JsonField<String>) = apply {
                this.cachedInputRate = cachedInputRate
            }

            /** Cached input token tiered pricing. Present only on inference product entries. */
            fun cachedInputTiers(cachedInputTiers: List<PricingTier>) =
                cachedInputTiers(JsonField.of(cachedInputTiers))

            /**
             * Sets [Builder.cachedInputTiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cachedInputTiers] with a well-typed
             * `List<PricingTier>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cachedInputTiers(cachedInputTiers: JsonField<List<PricingTier>>) = apply {
                this.cachedInputTiers = cachedInputTiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingTier] to [cachedInputTiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCachedInputTier(cachedInputTier: PricingTier) = apply {
                cachedInputTiers =
                    (cachedInputTiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cachedInputTiers", it).add(cachedInputTier)
                    }
            }

            /** ISO country code. Null for non-geographic products. */
            fun countryIso(countryIso: String?) = countryIso(JsonField.ofNullable(countryIso))

            /** Alias for calling [Builder.countryIso] with `countryIso.orElse(null)`. */
            fun countryIso(countryIso: Optional<String>) = countryIso(countryIso.getOrNull())

            /**
             * Sets [Builder.countryIso] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryIso] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryIso(countryIso: JsonField<String>) = apply { this.countryIso = countryIso }

            /** ISO currency code (e.g., USD). */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Direction (e.g., termination). Null for non-directional products. */
            fun direction(direction: String?) = direction(JsonField.ofNullable(direction))

            /** Alias for calling [Builder.direction] with `direction.orElse(null)`. */
            fun direction(direction: Optional<String>) = direction(direction.getOrNull())

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            /** Input token rate. Present only on inference product entries. */
            fun inputRate(inputRate: String) = inputRate(JsonField.of(inputRate))

            /**
             * Sets [Builder.inputRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputRate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputRate(inputRate: JsonField<String>) = apply { this.inputRate = inputRate }

            /** Input token tiered pricing. Present only on inference product entries. */
            fun inputTiers(inputTiers: List<PricingTier>) = inputTiers(JsonField.of(inputTiers))

            /**
             * Sets [Builder.inputTiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputTiers] with a well-typed `List<PricingTier>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputTiers(inputTiers: JsonField<List<PricingTier>>) = apply {
                this.inputTiers = inputTiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingTier] to [inputTiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInputTier(inputTier: PricingTier) = apply {
                inputTiers =
                    (inputTiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("inputTiers", it).add(inputTier)
                    }
            }

            /** Model identifier. Present only on inference product entries. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Human-readable name describing the pricing entry. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Additional note for rate-deck products (e.g., "Pricing is determined by the WhatsApp
             * rate deck.").
             */
            fun note(note: String?) = note(JsonField.ofNullable(note))

            /** Alias for calling [Builder.note] with `note.orElse(null)`. */
            fun note(note: Optional<String>) = note(note.getOrNull())

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

            /** Output token rate. Present only on inference product entries. */
            fun outputRate(outputRate: String) = outputRate(JsonField.of(outputRate))

            /**
             * Sets [Builder.outputRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputRate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputRate(outputRate: JsonField<String>) = apply { this.outputRate = outputRate }

            /** Output token tiered pricing. Present only on inference product entries. */
            fun outputTiers(outputTiers: List<PricingTier>) = outputTiers(JsonField.of(outputTiers))

            /**
             * Sets [Builder.outputTiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputTiers] with a well-typed `List<PricingTier>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputTiers(outputTiers: JsonField<List<PricingTier>>) = apply {
                this.outputTiers = outputTiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingTier] to [outputTiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOutputTier(outputTier: PricingTier) = apply {
                outputTiers =
                    (outputTiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("outputTiers", it).add(outputTier)
                    }
            }

            /**
             * Pricing type for non-standard products (e.g., rate_deck). Absent on standard
             * products.
             */
            fun pricingType(pricingType: String?) = pricingType(JsonField.ofNullable(pricingType))

            /** Alias for calling [Builder.pricingType] with `pricingType.orElse(null)`. */
            fun pricingType(pricingType: Optional<String>) = pricingType(pricingType.getOrNull())

            /**
             * Sets [Builder.pricingType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricingType(pricingType: JsonField<String>) = apply {
                this.pricingType = pricingType
            }

            /**
             * Per-unit rate. Numeric for standard products, string for inference products. Null for
             * rate-deck products.
             */
            fun rate(rate: Rate?) = rate(JsonField.ofNullable(rate))

            /** Alias for calling [Builder.rate] with `rate.orElse(null)`. */
            fun rate(rate: Optional<Rate>) = rate(rate.getOrNull())

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [Rate] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

            /** Alias for calling [rate] with `Rate.ofNumber(number)`. */
            fun rate(number: Double) = rate(Rate.ofNumber(number))

            /** Alias for calling [rate] with `Rate.ofString(string)`. */
            fun rate(string: String) = rate(Rate.ofString(string))

            /** Volume-based tiered pricing. Empty for rate-deck products. */
            fun tiers(tiers: List<PricingTier>) = tiers(JsonField.of(tiers))

            /**
             * Sets [Builder.tiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiers] with a well-typed `List<PricingTier>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiers(tiers: JsonField<List<PricingTier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingTier] to [tiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTier(tier: PricingTier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tiers", it).add(tier)
                    }
            }

            /** Pricing type (e.g., usage). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Unit of measurement (e.g., part, message, GB, per_1k_tokens). */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    cachedInputRate,
                    (cachedInputTiers ?: JsonMissing.of()).map { it.toImmutable() },
                    countryIso,
                    currency,
                    direction,
                    inputRate,
                    (inputTiers ?: JsonMissing.of()).map { it.toImmutable() },
                    model,
                    name,
                    note,
                    outputRate,
                    (outputTiers ?: JsonMissing.of()).map { it.toImmutable() },
                    pricingType,
                    rate,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    unit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            cachedInputRate()
            cachedInputTiers().ifPresent { it.forEach { it.validate() } }
            countryIso()
            currency()
            direction()
            inputRate()
            inputTiers().ifPresent { it.forEach { it.validate() } }
            model()
            name()
            note()
            outputRate()
            outputTiers().ifPresent { it.forEach { it.validate() } }
            pricingType()
            rate().ifPresent { it.validate() }
            tiers().ifPresent { it.forEach { it.validate() } }
            type()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (cachedInputRate.asKnown().isPresent) 1 else 0) +
                (cachedInputTiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (countryIso.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (direction.asKnown().isPresent) 1 else 0) +
                (if (inputRate.asKnown().isPresent) 1 else 0) +
                (inputTiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (note.asKnown().isPresent) 1 else 0) +
                (if (outputRate.asKnown().isPresent) 1 else 0) +
                (outputTiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (pricingType.asKnown().isPresent) 1 else 0) +
                (rate.asKnown().getOrNull()?.validity() ?: 0) +
                (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (unit.asKnown().isPresent) 1 else 0)

        /**
         * Per-unit rate. Numeric for standard products, string for inference products. Null for
         * rate-deck products.
         */
        @JsonDeserialize(using = Rate.Deserializer::class)
        @JsonSerialize(using = Rate.Serializer::class)
        class Rate
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            /** Rate for standard products (e.g., 0.004). */
            fun number(): Optional<Double> = Optional.ofNullable(number)

            /** Rate for inference products (e.g., "0.001"). */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            /** Rate for standard products (e.g., 0.004). */
            fun asNumber(): Double = number.getOrThrow("number")

            /** Rate for inference products (e.g., "0.001"). */
            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = rate.accept(new Rate.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitNumber(Double number) {
             *         return Optional.of(number.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Rate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rate && number == other.number && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(number, string)

            override fun toString(): String =
                when {
                    number != null -> "Rate{number=$number}"
                    string != null -> "Rate{string=$string}"
                    _json != null -> "Rate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Rate")
                }

            companion object {

                /** Rate for standard products (e.g., 0.004). */
                @JvmStatic fun ofNumber(number: Double) = Rate(number = number)

                /** Rate for inference products (e.g., "0.001"). */
                @JvmStatic fun ofString(string: String) = Rate(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Rate] to a value of type [T].
             */
            interface Visitor<out T> {

                /** Rate for standard products (e.g., 0.004). */
                fun visitNumber(number: Double): T

                /** Rate for inference products (e.g., "0.001"). */
                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Rate] to a value of type [T].
                 *
                 * An instance of [Rate] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Rate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Rate>(Rate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Rate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Rate(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Rate(number = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Rate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Rate>(Rate::class) {

                override fun serialize(
                    value: Rate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Rate")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                cachedInputRate == other.cachedInputRate &&
                cachedInputTiers == other.cachedInputTiers &&
                countryIso == other.countryIso &&
                currency == other.currency &&
                direction == other.direction &&
                inputRate == other.inputRate &&
                inputTiers == other.inputTiers &&
                model == other.model &&
                name == other.name &&
                note == other.note &&
                outputRate == other.outputRate &&
                outputTiers == other.outputTiers &&
                pricingType == other.pricingType &&
                rate == other.rate &&
                tiers == other.tiers &&
                type == other.type &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cachedInputRate,
                cachedInputTiers,
                countryIso,
                currency,
                direction,
                inputRate,
                inputTiers,
                model,
                name,
                note,
                outputRate,
                outputTiers,
                pricingType,
                rate,
                tiers,
                type,
                unit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{cachedInputRate=$cachedInputRate, cachedInputTiers=$cachedInputTiers, countryIso=$countryIso, currency=$currency, direction=$direction, inputRate=$inputRate, inputTiers=$inputTiers, model=$model, name=$name, note=$note, outputRate=$outputRate, outputTiers=$outputTiers, pricingType=$pricingType, rate=$rate, tiers=$tiers, type=$type, unit=$unit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductRetrieveResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductRetrieveResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
