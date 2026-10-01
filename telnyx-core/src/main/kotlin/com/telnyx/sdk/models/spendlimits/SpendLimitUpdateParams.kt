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
 * Replaces the value of the existing limit for the product and period. Send exactly one of `amount`
 * and `unlimited: true`. The period's spend is checked at once: raising the limit above the spend
 * lifts the period's block (`evaluation.released`), and lowering it below the spend blocks the
 * product (`evaluation.blocked_now`). Returns 404 when no limit is set; create it instead.
 */
class SpendLimitUpdateParams
private constructor(
    private val product: String?,
    private val period: SpendLimitPeriod?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun product(): Optional<String> = Optional.ofNullable(product)

    /** Limit period. Defaults to `daily`; send it explicitly. */
    fun period(): Optional<SpendLimitPeriod> = Optional.ofNullable(period)

    /** Send exactly one of `amount` and `unlimited: true`. */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpendLimitUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendLimitUpdateParams]. */
    class Builder internal constructor() {

        private var product: String? = null
        private var period: SpendLimitPeriod? = null
        private var body: Body? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(spendLimitUpdateParams: SpendLimitUpdateParams) = apply {
            product = spendLimitUpdateParams.product
            period = spendLimitUpdateParams.period
            body = spendLimitUpdateParams.body
            additionalHeaders = spendLimitUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = spendLimitUpdateParams.additionalQueryParams.toBuilder()
        }

        fun product(product: String?) = apply { this.product = product }

        /** Alias for calling [Builder.product] with `product.orElse(null)`. */
        fun product(product: Optional<String>) = product(product.getOrNull())

        /** Limit period. Defaults to `daily`; send it explicitly. */
        fun period(period: SpendLimitPeriod?) = apply { this.period = period }

        /** Alias for calling [Builder.period] with `period.orElse(null)`. */
        fun period(period: Optional<SpendLimitPeriod>) = period(period.getOrNull())

        /** Send exactly one of `amount` and `unlimited: true`. */
        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofUpdateSpendLimitWithAmount(updateSpendLimitWithAmount)`.
         */
        fun body(updateSpendLimitWithAmount: Body.UpdateSpendLimitWithAmount) =
            body(Body.ofUpdateSpendLimitWithAmount(updateSpendLimitWithAmount))

        /**
         * Alias for calling [body] with
         * `Body.ofUpdateSpendLimitUnlimited(updateSpendLimitUnlimited)`.
         */
        fun body(updateSpendLimitUnlimited: Body.UpdateSpendLimitUnlimited) =
            body(Body.ofUpdateSpendLimitUnlimited(updateSpendLimitUnlimited))

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
         * Returns an immutable instance of [SpendLimitUpdateParams].
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
        fun build(): SpendLimitUpdateParams =
            SpendLimitUpdateParams(
                product,
                period,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> product ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                period?.let { put("period", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Send exactly one of `amount` and `unlimited: true`. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val updateSpendLimitWithAmount: UpdateSpendLimitWithAmount? = null,
        private val updateSpendLimitUnlimited: UpdateSpendLimitUnlimited? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A new limit in USD. */
        fun updateSpendLimitWithAmount(): Optional<UpdateSpendLimitWithAmount> =
            Optional.ofNullable(updateSpendLimitWithAmount)

        /** Explicitly no cap. */
        fun updateSpendLimitUnlimited(): Optional<UpdateSpendLimitUnlimited> =
            Optional.ofNullable(updateSpendLimitUnlimited)

        fun isUpdateSpendLimitWithAmount(): Boolean = updateSpendLimitWithAmount != null

        fun isUpdateSpendLimitUnlimited(): Boolean = updateSpendLimitUnlimited != null

        /** A new limit in USD. */
        fun asUpdateSpendLimitWithAmount(): UpdateSpendLimitWithAmount =
            updateSpendLimitWithAmount.getOrThrow("updateSpendLimitWithAmount")

        /** Explicitly no cap. */
        fun asUpdateSpendLimitUnlimited(): UpdateSpendLimitUnlimited =
            updateSpendLimitUnlimited.getOrThrow("updateSpendLimitUnlimited")

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
         *     public Optional<String> visitUpdateSpendLimitWithAmount(UpdateSpendLimitWithAmount updateSpendLimitWithAmount) {
         *         return Optional.of(updateSpendLimitWithAmount.toString());
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
                updateSpendLimitWithAmount != null ->
                    visitor.visitUpdateSpendLimitWithAmount(updateSpendLimitWithAmount)
                updateSpendLimitUnlimited != null ->
                    visitor.visitUpdateSpendLimitUnlimited(updateSpendLimitUnlimited)
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
                    override fun visitUpdateSpendLimitWithAmount(
                        updateSpendLimitWithAmount: UpdateSpendLimitWithAmount
                    ) {
                        updateSpendLimitWithAmount.validate()
                    }

                    override fun visitUpdateSpendLimitUnlimited(
                        updateSpendLimitUnlimited: UpdateSpendLimitUnlimited
                    ) {
                        updateSpendLimitUnlimited.validate()
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
                    override fun visitUpdateSpendLimitWithAmount(
                        updateSpendLimitWithAmount: UpdateSpendLimitWithAmount
                    ) = updateSpendLimitWithAmount.validity()

                    override fun visitUpdateSpendLimitUnlimited(
                        updateSpendLimitUnlimited: UpdateSpendLimitUnlimited
                    ) = updateSpendLimitUnlimited.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                updateSpendLimitWithAmount == other.updateSpendLimitWithAmount &&
                updateSpendLimitUnlimited == other.updateSpendLimitUnlimited
        }

        override fun hashCode(): Int =
            Objects.hash(updateSpendLimitWithAmount, updateSpendLimitUnlimited)

        override fun toString(): String =
            when {
                updateSpendLimitWithAmount != null ->
                    "Body{updateSpendLimitWithAmount=$updateSpendLimitWithAmount}"
                updateSpendLimitUnlimited != null ->
                    "Body{updateSpendLimitUnlimited=$updateSpendLimitUnlimited}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** A new limit in USD. */
            @JvmStatic
            fun ofUpdateSpendLimitWithAmount(
                updateSpendLimitWithAmount: UpdateSpendLimitWithAmount
            ) = Body(updateSpendLimitWithAmount = updateSpendLimitWithAmount)

            /** Explicitly no cap. */
            @JvmStatic
            fun ofUpdateSpendLimitUnlimited(updateSpendLimitUnlimited: UpdateSpendLimitUnlimited) =
                Body(updateSpendLimitUnlimited = updateSpendLimitUnlimited)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** A new limit in USD. */
            fun visitUpdateSpendLimitWithAmount(
                updateSpendLimitWithAmount: UpdateSpendLimitWithAmount
            ): T

            /** Explicitly no cap. */
            fun visitUpdateSpendLimitUnlimited(
                updateSpendLimitUnlimited: UpdateSpendLimitUnlimited
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
                            tryDeserialize(node, jacksonTypeRef<UpdateSpendLimitWithAmount>())
                                ?.let { Body(updateSpendLimitWithAmount = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<UpdateSpendLimitUnlimited>())?.let {
                                Body(updateSpendLimitUnlimited = it, _json = json)
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
                    value.updateSpendLimitWithAmount != null ->
                        generator.writeObject(value.updateSpendLimitWithAmount)
                    value.updateSpendLimitUnlimited != null ->
                        generator.writeObject(value.updateSpendLimitUnlimited)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        /** A new limit in USD. */
        class UpdateSpendLimitWithAmount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val reason: JsonField<String>,
            private val unlimited: JsonField<Unlimited>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unlimited")
                @ExcludeMissing
                unlimited: JsonField<Unlimited> = JsonMissing.of(),
            ) : this(amount, reason, unlimited, mutableMapOf())

            /**
             * Limit in USD. `0` blocks at the first cent of spend.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

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
                 * [UpdateSpendLimitWithAmount].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateSpendLimitWithAmount]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var reason: JsonField<String> = JsonMissing.of()
                private var unlimited: JsonField<Unlimited> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateSpendLimitWithAmount: UpdateSpendLimitWithAmount) = apply {
                    amount = updateSpendLimitWithAmount.amount
                    reason = updateSpendLimitWithAmount.reason
                    unlimited = updateSpendLimitWithAmount.unlimited
                    additionalProperties =
                        updateSpendLimitWithAmount.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UpdateSpendLimitWithAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UpdateSpendLimitWithAmount =
                    UpdateSpendLimitWithAmount(
                        checkRequired("amount", amount),
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
            fun validate(): UpdateSpendLimitWithAmount = apply {
                if (validated) {
                    return@apply
                }

                amount()
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

                return other is UpdateSpendLimitWithAmount &&
                    amount == other.amount &&
                    reason == other.reason &&
                    unlimited == other.unlimited &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, reason, unlimited, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateSpendLimitWithAmount{amount=$amount, reason=$reason, unlimited=$unlimited, additionalProperties=$additionalProperties}"
        }

        /** Explicitly no cap. */
        class UpdateSpendLimitUnlimited
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unlimited: JsonField<Unlimited>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unlimited")
                @ExcludeMissing
                unlimited: JsonField<Unlimited> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(unlimited, reason, mutableMapOf())

            /**
             * `true`: explicitly no cap.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unlimited(): Unlimited = unlimited.getRequired("unlimited")

            /**
             * Why the limit is set or changed, kept for audit.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

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
                 * [UpdateSpendLimitUnlimited].
                 *
                 * The following fields are required:
                 * ```java
                 * .unlimited()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateSpendLimitUnlimited]. */
            class Builder internal constructor() {

                private var unlimited: JsonField<Unlimited>? = null
                private var reason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateSpendLimitUnlimited: UpdateSpendLimitUnlimited) = apply {
                    unlimited = updateSpendLimitUnlimited.unlimited
                    reason = updateSpendLimitUnlimited.reason
                    additionalProperties =
                        updateSpendLimitUnlimited.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [UpdateSpendLimitUnlimited].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unlimited()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UpdateSpendLimitUnlimited =
                    UpdateSpendLimitUnlimited(
                        checkRequired("unlimited", unlimited),
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
            fun validate(): UpdateSpendLimitUnlimited = apply {
                if (validated) {
                    return@apply
                }

                unlimited().validate()
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
                (unlimited.asKnown().getOrNull()?.validity() ?: 0) +
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

                return other is UpdateSpendLimitUnlimited &&
                    unlimited == other.unlimited &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(unlimited, reason, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateSpendLimitUnlimited{unlimited=$unlimited, reason=$reason, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendLimitUpdateParams &&
            product == other.product &&
            period == other.period &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(product, period, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SpendLimitUpdateParams{product=$product, period=$period, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
