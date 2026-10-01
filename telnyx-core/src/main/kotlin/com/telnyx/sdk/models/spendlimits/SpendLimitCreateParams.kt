// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Sets a limit for a product and period that has none. Send exactly one of `amount` and `unlimited:
 * true`. The period's spend is checked at once: if it is already above the new limit, the product
 * is blocked immediately (`evaluation.blocked_now`). Returns 409 when a limit already exists for
 * the product and period; update it instead.
 */
class SpendLimitCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Send exactly one of `amount` and `unlimited: true`. */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpendLimitCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendLimitCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(spendLimitCreateParams: SpendLimitCreateParams) = apply {
            body = spendLimitCreateParams.body
            additionalHeaders = spendLimitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = spendLimitCreateParams.additionalQueryParams.toBuilder()
        }

        /** Send exactly one of `amount` and `unlimited: true`. */
        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofCreateSpendLimitWithAmount(createSpendLimitWithAmount)`.
         */
        fun body(createSpendLimitWithAmount: Body.CreateSpendLimitWithAmount) =
            body(Body.ofCreateSpendLimitWithAmount(createSpendLimitWithAmount))

        /**
         * Alias for calling [body] with
         * `Body.ofCreateSpendLimitUnlimited(createSpendLimitUnlimited)`.
         */
        fun body(createSpendLimitUnlimited: Body.CreateSpendLimitUnlimited) =
            body(Body.ofCreateSpendLimitUnlimited(createSpendLimitUnlimited))

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SpendLimitCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpendLimitCreateParams =
            SpendLimitCreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Send exactly one of `amount` and `unlimited: true`. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val createSpendLimitWithAmount: CreateSpendLimitWithAmount? = null,
        private val createSpendLimitUnlimited: CreateSpendLimitUnlimited? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A limit in USD. */
        fun createSpendLimitWithAmount(): Optional<CreateSpendLimitWithAmount> =
            Optional.ofNullable(createSpendLimitWithAmount)

        /** Explicitly no cap. */
        fun createSpendLimitUnlimited(): Optional<CreateSpendLimitUnlimited> =
            Optional.ofNullable(createSpendLimitUnlimited)

        fun isCreateSpendLimitWithAmount(): Boolean = createSpendLimitWithAmount != null

        fun isCreateSpendLimitUnlimited(): Boolean = createSpendLimitUnlimited != null

        /** A limit in USD. */
        fun asCreateSpendLimitWithAmount(): CreateSpendLimitWithAmount =
            createSpendLimitWithAmount.getOrThrow("createSpendLimitWithAmount")

        /** Explicitly no cap. */
        fun asCreateSpendLimitUnlimited(): CreateSpendLimitUnlimited =
            createSpendLimitUnlimited.getOrThrow("createSpendLimitUnlimited")

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
         * Optional<String> result = body.accept(new Body.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitCreateSpendLimitWithAmount(CreateSpendLimitWithAmount createSpendLimitWithAmount) {
         *         return Optional.of(createSpendLimitWithAmount.toString());
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
                createSpendLimitWithAmount != null ->
                    visitor.visitCreateSpendLimitWithAmount(createSpendLimitWithAmount)
                createSpendLimitUnlimited != null ->
                    visitor.visitCreateSpendLimitUnlimited(createSpendLimitUnlimited)
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCreateSpendLimitWithAmount(
                        createSpendLimitWithAmount: CreateSpendLimitWithAmount
                    ) {
                        createSpendLimitWithAmount.validate()
                    }

                    override fun visitCreateSpendLimitUnlimited(
                        createSpendLimitUnlimited: CreateSpendLimitUnlimited
                    ) {
                        createSpendLimitUnlimited.validate()
                    }
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
                    override fun visitCreateSpendLimitWithAmount(
                        createSpendLimitWithAmount: CreateSpendLimitWithAmount
                    ) = createSpendLimitWithAmount.validity()

                    override fun visitCreateSpendLimitUnlimited(
                        createSpendLimitUnlimited: CreateSpendLimitUnlimited
                    ) = createSpendLimitUnlimited.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                createSpendLimitWithAmount == other.createSpendLimitWithAmount &&
                createSpendLimitUnlimited == other.createSpendLimitUnlimited
        }

        override fun hashCode(): Int =
            Objects.hash(createSpendLimitWithAmount, createSpendLimitUnlimited)

        override fun toString(): String =
            when {
                createSpendLimitWithAmount != null ->
                    "Body{createSpendLimitWithAmount=$createSpendLimitWithAmount}"
                createSpendLimitUnlimited != null ->
                    "Body{createSpendLimitUnlimited=$createSpendLimitUnlimited}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** A limit in USD. */
            @JvmStatic
            fun ofCreateSpendLimitWithAmount(
                createSpendLimitWithAmount: CreateSpendLimitWithAmount
            ) = Body(createSpendLimitWithAmount = createSpendLimitWithAmount)

            /** Explicitly no cap. */
            @JvmStatic
            fun ofCreateSpendLimitUnlimited(createSpendLimitUnlimited: CreateSpendLimitUnlimited) =
                Body(createSpendLimitUnlimited = createSpendLimitUnlimited)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** A limit in USD. */
            fun visitCreateSpendLimitWithAmount(
                createSpendLimitWithAmount: CreateSpendLimitWithAmount
            ): T

            /** Explicitly no cap. */
            fun visitCreateSpendLimitUnlimited(
                createSpendLimitUnlimited: CreateSpendLimitUnlimited
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<CreateSpendLimitWithAmount>())
                                ?.let { Body(createSpendLimitWithAmount = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<CreateSpendLimitUnlimited>())?.let {
                                Body(createSpendLimitUnlimited = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.createSpendLimitWithAmount != null ->
                        generator.writeObject(value.createSpendLimitWithAmount)
                    value.createSpendLimitUnlimited != null ->
                        generator.writeObject(value.createSpendLimitUnlimited)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        /** A limit in USD. */
        class CreateSpendLimitWithAmount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val product: JsonField<String>,
            private val period: JsonField<SpendLimitPeriod>,
            private val reason: JsonField<String>,
            private val unlimited: JsonField<Unlimited>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("product")
                @ExcludeMissing
                product: JsonField<String> = JsonMissing.of(),
                @JsonProperty("period")
                @ExcludeMissing
                period: JsonField<SpendLimitPeriod> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unlimited")
                @ExcludeMissing
                unlimited: JsonField<Unlimited> = JsonMissing.of(),
            ) : this(amount, product, period, reason, unlimited, mutableMapOf())

            /**
             * Limit in USD. `0` blocks at the first cent of spend.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * Product to limit, as returned in `product` by the list operation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun product(): String = product.getRequired("product")

            /**
             * `daily` is the current UTC day; `monthly` is the current UTC calendar month.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun period(): Optional<SpendLimitPeriod> = period.getOptional("period")

            /**
             * Why the limit is set or changed, kept for audit.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

            /**
             * Optional; only `false` is allowed together with `amount`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unlimited(): Optional<Unlimited> = unlimited.getOptional("unlimited")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [product].
             *
             * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

            /**
             * Returns the raw JSON value of [period].
             *
             * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("period")
            @ExcludeMissing
            fun _period(): JsonField<SpendLimitPeriod> = period

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [unlimited].
             *
             * Unlike [unlimited], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unlimited")
            @ExcludeMissing
            fun _unlimited(): JsonField<Unlimited> = unlimited

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
                 * [CreateSpendLimitWithAmount].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .product()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreateSpendLimitWithAmount]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var product: JsonField<String>? = null
                private var period: JsonField<SpendLimitPeriod> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var unlimited: JsonField<Unlimited> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createSpendLimitWithAmount: CreateSpendLimitWithAmount) = apply {
                    amount = createSpendLimitWithAmount.amount
                    product = createSpendLimitWithAmount.product
                    period = createSpendLimitWithAmount.period
                    reason = createSpendLimitWithAmount.reason
                    unlimited = createSpendLimitWithAmount.unlimited
                    additionalProperties =
                        createSpendLimitWithAmount.additionalProperties.toMutableMap()
                }

                /** Limit in USD. `0` blocks at the first cent of spend. */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** Product to limit, as returned in `product` by the list operation. */
                fun product(product: String) = product(JsonField.of(product))

                /**
                 * Sets [Builder.product] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.product] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun product(product: JsonField<String>) = apply { this.product = product }

                /** `daily` is the current UTC day; `monthly` is the current UTC calendar month. */
                fun period(period: SpendLimitPeriod) = period(JsonField.of(period))

                /**
                 * Sets [Builder.period] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.period] with a well-typed [SpendLimitPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun period(period: JsonField<SpendLimitPeriod>) = apply { this.period = period }

                /** Why the limit is set or changed, kept for audit. */
                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /** Optional; only `false` is allowed together with `amount`. */
                fun unlimited(unlimited: Unlimited) = unlimited(JsonField.of(unlimited))

                /**
                 * Sets [Builder.unlimited] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unlimited] with a well-typed [Unlimited] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unlimited(unlimited: JsonField<Unlimited>) = apply {
                    this.unlimited = unlimited
                }

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
                 * Returns an immutable instance of [CreateSpendLimitWithAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .product()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateSpendLimitWithAmount =
                    CreateSpendLimitWithAmount(
                        checkRequired("amount", amount),
                        checkRequired("product", product),
                        period,
                        reason,
                        unlimited,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): CreateSpendLimitWithAmount = apply {
                if (validated) {
                    return@apply
                }

                amount()
                product()
                period().ifPresent { it.validate() }
                reason()
                unlimited().ifPresent { it.validate() }
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
                    (if (product.asKnown().isPresent) 1 else 0) +
                    (period.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (reason.asKnown().isPresent) 1 else 0) +
                    (unlimited.asKnown().getOrNull()?.validity() ?: 0)

            /** Optional; only `false` is allowed together with `amount`. */
            class Unlimited
            @JsonCreator
            private constructor(private val value: JsonField<Boolean>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

                companion object {

                    @JvmField val FALSE = of(false)

                    @JvmStatic fun of(value: Boolean) = Unlimited(JsonField.of(value))
                }

                /** An enum containing [Unlimited]'s known values. */
                enum class Known {
                    FALSE
                }

                /**
                 * An enum containing [Unlimited]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Unlimited] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FALSE,
                    /**
                     * An enum member indicating that [Unlimited] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FALSE -> Value.FALSE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FALSE -> Known.FALSE
                        else -> throw TelnyxInvalidDataException("Unknown Unlimited: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asBoolean(): Boolean =
                    _value().asBoolean().orElseThrow {
                        TelnyxInvalidDataException("Value is not a Boolean")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Unlimited = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unlimited && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreateSpendLimitWithAmount &&
                    amount == other.amount &&
                    product == other.product &&
                    period == other.period &&
                    reason == other.reason &&
                    unlimited == other.unlimited &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, product, period, reason, unlimited, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateSpendLimitWithAmount{amount=$amount, product=$product, period=$period, reason=$reason, unlimited=$unlimited, additionalProperties=$additionalProperties}"
        }

        /** Explicitly no cap. */
        class CreateSpendLimitUnlimited
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val product: JsonField<String>,
            private val unlimited: JsonField<Unlimited>,
            private val period: JsonField<SpendLimitPeriod>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("product")
                @ExcludeMissing
                product: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unlimited")
                @ExcludeMissing
                unlimited: JsonField<Unlimited> = JsonMissing.of(),
                @JsonProperty("period")
                @ExcludeMissing
                period: JsonField<SpendLimitPeriod> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(product, unlimited, period, reason, mutableMapOf())

            /**
             * Product to limit, as returned in `product` by the list operation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun product(): String = product.getRequired("product")

            /**
             * `true`: explicitly no cap.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unlimited(): Unlimited = unlimited.getRequired("unlimited")

            /**
             * `daily` is the current UTC day; `monthly` is the current UTC calendar month.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun period(): Optional<SpendLimitPeriod> = period.getOptional("period")

            /**
             * Why the limit is set or changed, kept for audit.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

            /**
             * Returns the raw JSON value of [product].
             *
             * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

            /**
             * Returns the raw JSON value of [unlimited].
             *
             * Unlike [unlimited], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unlimited")
            @ExcludeMissing
            fun _unlimited(): JsonField<Unlimited> = unlimited

            /**
             * Returns the raw JSON value of [period].
             *
             * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("period")
            @ExcludeMissing
            fun _period(): JsonField<SpendLimitPeriod> = period

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * [CreateSpendLimitUnlimited].
                 *
                 * The following fields are required:
                 * ```java
                 * .product()
                 * .unlimited()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreateSpendLimitUnlimited]. */
            class Builder internal constructor() {

                private var product: JsonField<String>? = null
                private var unlimited: JsonField<Unlimited>? = null
                private var period: JsonField<SpendLimitPeriod> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createSpendLimitUnlimited: CreateSpendLimitUnlimited) = apply {
                    product = createSpendLimitUnlimited.product
                    unlimited = createSpendLimitUnlimited.unlimited
                    period = createSpendLimitUnlimited.period
                    reason = createSpendLimitUnlimited.reason
                    additionalProperties =
                        createSpendLimitUnlimited.additionalProperties.toMutableMap()
                }

                /** Product to limit, as returned in `product` by the list operation. */
                fun product(product: String) = product(JsonField.of(product))

                /**
                 * Sets [Builder.product] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.product] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun product(product: JsonField<String>) = apply { this.product = product }

                /** `true`: explicitly no cap. */
                fun unlimited(unlimited: Unlimited) = unlimited(JsonField.of(unlimited))

                /**
                 * Sets [Builder.unlimited] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unlimited] with a well-typed [Unlimited] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unlimited(unlimited: JsonField<Unlimited>) = apply {
                    this.unlimited = unlimited
                }

                /** `daily` is the current UTC day; `monthly` is the current UTC calendar month. */
                fun period(period: SpendLimitPeriod) = period(JsonField.of(period))

                /**
                 * Sets [Builder.period] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.period] with a well-typed [SpendLimitPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun period(period: JsonField<SpendLimitPeriod>) = apply { this.period = period }

                /** Why the limit is set or changed, kept for audit. */
                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [CreateSpendLimitUnlimited].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .product()
                 * .unlimited()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateSpendLimitUnlimited =
                    CreateSpendLimitUnlimited(
                        checkRequired("product", product),
                        checkRequired("unlimited", unlimited),
                        period,
                        reason,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): CreateSpendLimitUnlimited = apply {
                if (validated) {
                    return@apply
                }

                product()
                unlimited().validate()
                period().ifPresent { it.validate() }
                reason()
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
                (if (product.asKnown().isPresent) 1 else 0) +
                    (unlimited.asKnown().getOrNull()?.validity() ?: 0) +
                    (period.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (reason.asKnown().isPresent) 1 else 0)

            /** `true`: explicitly no cap. */
            class Unlimited
            @JsonCreator
            private constructor(private val value: JsonField<Boolean>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

                companion object {

                    @JvmField val TRUE = of(true)

                    @JvmStatic fun of(value: Boolean) = Unlimited(JsonField.of(value))
                }

                /** An enum containing [Unlimited]'s known values. */
                enum class Known {
                    TRUE
                }

                /**
                 * An enum containing [Unlimited]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Unlimited] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRUE,
                    /**
                     * An enum member indicating that [Unlimited] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TRUE -> Value.TRUE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRUE -> Known.TRUE
                        else -> throw TelnyxInvalidDataException("Unknown Unlimited: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asBoolean(): Boolean =
                    _value().asBoolean().orElseThrow {
                        TelnyxInvalidDataException("Value is not a Boolean")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Unlimited = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unlimited && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreateSpendLimitUnlimited &&
                    product == other.product &&
                    unlimited == other.unlimited &&
                    period == other.period &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(product, unlimited, period, reason, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateSpendLimitUnlimited{product=$product, unlimited=$unlimited, period=$period, reason=$reason, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendLimitCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SpendLimitCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
