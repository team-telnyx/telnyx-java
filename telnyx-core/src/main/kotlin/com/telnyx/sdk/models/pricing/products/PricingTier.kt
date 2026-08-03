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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PricingTier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val max: JsonField<Long>,
    private val min: JsonField<Long>,
    private val rate: JsonField<Rate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("max") @ExcludeMissing max: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("min") @ExcludeMissing min: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing rate: JsonField<Rate> = JsonMissing.of(),
    ) : this(max, min, rate, mutableMapOf())

    /**
     * Upper bound of the tier (exclusive). Null means no upper limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun max(): Optional<Long> = max.getOptional("max")

    /**
     * Lower bound of the tier (inclusive).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun min(): Long = min.getRequired("min")

    /**
     * Rate for this tier. Numeric for standard products, string for inference products.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rate(): Rate = rate.getRequired("rate")

    /**
     * Returns the raw JSON value of [max].
     *
     * Unlike [max], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Long> = max

    /**
     * Returns the raw JSON value of [min].
     *
     * Unlike [min], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Long> = min

    /**
     * Returns the raw JSON value of [rate].
     *
     * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Rate> = rate

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
         * Returns a mutable builder for constructing an instance of [PricingTier].
         *
         * The following fields are required:
         * ```java
         * .max()
         * .min()
         * .rate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingTier]. */
    class Builder internal constructor() {

        private var max: JsonField<Long>? = null
        private var min: JsonField<Long>? = null
        private var rate: JsonField<Rate>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pricingTier: PricingTier) = apply {
            max = pricingTier.max
            min = pricingTier.min
            rate = pricingTier.rate
            additionalProperties = pricingTier.additionalProperties.toMutableMap()
        }

        /** Upper bound of the tier (exclusive). Null means no upper limit. */
        fun max(max: Long?) = max(JsonField.ofNullable(max))

        /**
         * Alias for [Builder.max].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun max(max: Long) = max(max as Long?)

        /** Alias for calling [Builder.max] with `max.orElse(null)`. */
        fun max(max: Optional<Long>) = max(max.getOrNull())

        /**
         * Sets [Builder.max] to an arbitrary JSON value.
         *
         * You should usually call [Builder.max] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun max(max: JsonField<Long>) = apply { this.max = max }

        /** Lower bound of the tier (inclusive). */
        fun min(min: Long) = min(JsonField.of(min))

        /**
         * Sets [Builder.min] to an arbitrary JSON value.
         *
         * You should usually call [Builder.min] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun min(min: JsonField<Long>) = apply { this.min = min }

        /** Rate for this tier. Numeric for standard products, string for inference products. */
        fun rate(rate: Rate) = rate(JsonField.of(rate))

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [Rate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

        /** Alias for calling [rate] with `Rate.ofNumber(number)`. */
        fun rate(number: Double) = rate(Rate.ofNumber(number))

        /** Alias for calling [rate] with `Rate.ofString(string)`. */
        fun rate(string: String) = rate(Rate.ofString(string))

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
         * Returns an immutable instance of [PricingTier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .max()
         * .min()
         * .rate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PricingTier =
            PricingTier(
                checkRequired("max", max),
                checkRequired("min", min),
                checkRequired("rate", rate),
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
    fun validate(): PricingTier = apply {
        if (validated) {
            return@apply
        }

        max()
        min()
        rate().validate()
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
        (if (max.asKnown().isPresent) 1 else 0) +
            (if (min.asKnown().isPresent) 1 else 0) +
            (rate.asKnown().getOrNull()?.validity() ?: 0)

    /** Rate for this tier. Numeric for standard products, string for inference products. */
    @JsonDeserialize(using = Rate.Deserializer::class)
    @JsonSerialize(using = Rate.Serializer::class)
    class Rate
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

            @JvmStatic fun ofNumber(number: Double) = Rate(number = number)

            @JvmStatic fun ofString(string: String) = Rate(string = string)
        }

        /** An interface that defines how to map each variant of [Rate] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Rate] to a value of type [T].
             *
             * An instance of [Rate] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
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
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Rate(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
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

        return other is PricingTier &&
            max == other.max &&
            min == other.min &&
            rate == other.rate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(max, min, rate, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PricingTier{max=$max, min=$min, rate=$rate, additionalProperties=$additionalProperties}"
}
