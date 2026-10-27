// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The spend limit, spend and block state of one product and period. The top-level fields describe
 * the total limit of the account; API key limits are nested in `credential_limits`.
 */
class SpendLimit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val block: JsonField<SpendLimitBlock>,
    private val blocked: JsonField<Boolean>,
    private val effectiveLimitUsd: JsonField<String>,
    private val limit: JsonField<Limit>,
    private val period: JsonField<SpendLimitPeriod>,
    private val periodEnd: JsonField<LocalDate>,
    private val periodStart: JsonField<LocalDate>,
    private val product: JsonField<String>,
    private val productName: JsonField<String>,
    private val recordType: JsonField<String>,
    private val spendError: JsonField<String>,
    private val spendUsd: JsonField<String>,
    private val credentialId: JsonField<String>,
    private val credentialLimits: JsonField<List<CredentialLimit>>,
    private val evaluation: JsonField<Evaluation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("block") @ExcludeMissing block: JsonField<SpendLimitBlock> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("effective_limit_usd")
        @ExcludeMissing
        effectiveLimitUsd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Limit> = JsonMissing.of(),
        @JsonProperty("period")
        @ExcludeMissing
        period: JsonField<SpendLimitPeriod> = JsonMissing.of(),
        @JsonProperty("period_end")
        @ExcludeMissing
        periodEnd: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        periodStart: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_name")
        @ExcludeMissing
        productName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_error")
        @ExcludeMissing
        spendError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_usd") @ExcludeMissing spendUsd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credential_id")
        @ExcludeMissing
        credentialId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credential_limits")
        @ExcludeMissing
        credentialLimits: JsonField<List<CredentialLimit>> = JsonMissing.of(),
        @JsonProperty("evaluation")
        @ExcludeMissing
        evaluation: JsonField<Evaluation> = JsonMissing.of(),
    ) : this(
        block,
        blocked,
        effectiveLimitUsd,
        limit,
        period,
        periodEnd,
        periodStart,
        product,
        productName,
        recordType,
        spendError,
        spendUsd,
        credentialId,
        credentialLimits,
        evaluation,
        mutableMapOf(),
    )

    /**
     * The active block of the period. `null` when the period is not blocked.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun block(): Optional<SpendLimitBlock> = block.getOptional("block")

    /**
     * The product is blocked for the whole account in this period (total limit). An API key's own
     * block appears only in `credential_limits`. Always `false` in write responses; list the limits
     * to read the block state.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blocked(): Boolean = blocked.getRequired("blocked")

    /**
     * The limit in USD that is enforced, as a decimal string. `null` means unlimited.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveLimitUsd(): Optional<String> = effectiveLimitUsd.getOptional("effective_limit_usd")

    /**
     * The limit set on the account for the product and period, whoever set it. `null` when none is
     * set.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Limit> = limit.getOptional("limit")

    /**
     * `daily` is the current UTC day; `monthly` is the current UTC calendar month.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun period(): SpendLimitPeriod = period.getRequired("period")

    /**
     * Exclusive end of the current period, a UTC date.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodEnd(): LocalDate = periodEnd.getRequired("period_end")

    /**
     * First UTC day of the current period.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodStart(): LocalDate = periodStart.getRequired("period_start")

    /**
     * Product the entry applies to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun product(): String = product.getRequired("product")

    /**
     * Display name of the product.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productName(): String = productName.getRequired("product_name")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): String = recordType.getRequired("record_type")

    /**
     * Set when `spend_usd` is `null`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendError(): Optional<String> = spendError.getOptional("spend_error")

    /**
     * Spend in USD so far in the period, as a decimal string. It can lag actual usage by about a
     * minute. `null` when it could not be read.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendUsd(): Optional<String> = spendUsd.getOptional("spend_usd")

    /**
     * In write responses, the API key the write was about; `null` for the total limit. Always
     * `null` in list entries, which describe the total limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentialId(): Optional<String> = credentialId.getOptional("credential_id")

    /**
     * List responses only. One item per API key limit of the product and period, sorted by
     * `credential_id`, plus every API key that is still blocked. `[]` when there are none.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentialLimits(): Optional<List<CredentialLimit>> =
        credentialLimits.getOptional("credential_limits")

    /**
     * What a create, update or delete did to the period at once. Only present in write responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluation(): Optional<Evaluation> = evaluation.getOptional("evaluation")

    /**
     * Returns the raw JSON value of [block].
     *
     * Unlike [block], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("block") @ExcludeMissing fun _block(): JsonField<SpendLimitBlock> = block

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

    /**
     * Returns the raw JSON value of [effectiveLimitUsd].
     *
     * Unlike [effectiveLimitUsd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_limit_usd")
    @ExcludeMissing
    fun _effectiveLimitUsd(): JsonField<String> = effectiveLimitUsd

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Limit> = limit

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<SpendLimitPeriod> = period

    /**
     * Returns the raw JSON value of [periodEnd].
     *
     * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_end") @ExcludeMissing fun _periodEnd(): JsonField<LocalDate> = periodEnd

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_start")
    @ExcludeMissing
    fun _periodStart(): JsonField<LocalDate> = periodStart

    /**
     * Returns the raw JSON value of [product].
     *
     * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

    /**
     * Returns the raw JSON value of [productName].
     *
     * Unlike [productName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_name")
    @ExcludeMissing
    fun _productName(): JsonField<String> = productName

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [spendError].
     *
     * Unlike [spendError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_error") @ExcludeMissing fun _spendError(): JsonField<String> = spendError

    /**
     * Returns the raw JSON value of [spendUsd].
     *
     * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<String> = spendUsd

    /**
     * Returns the raw JSON value of [credentialId].
     *
     * Unlike [credentialId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credential_id")
    @ExcludeMissing
    fun _credentialId(): JsonField<String> = credentialId

    /**
     * Returns the raw JSON value of [credentialLimits].
     *
     * Unlike [credentialLimits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credential_limits")
    @ExcludeMissing
    fun _credentialLimits(): JsonField<List<CredentialLimit>> = credentialLimits

    /**
     * Returns the raw JSON value of [evaluation].
     *
     * Unlike [evaluation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluation")
    @ExcludeMissing
    fun _evaluation(): JsonField<Evaluation> = evaluation

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
         * Returns a mutable builder for constructing an instance of [SpendLimit].
         *
         * The following fields are required:
         * ```java
         * .block()
         * .blocked()
         * .effectiveLimitUsd()
         * .limit()
         * .period()
         * .periodEnd()
         * .periodStart()
         * .product()
         * .productName()
         * .recordType()
         * .spendError()
         * .spendUsd()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendLimit]. */
    class Builder internal constructor() {

        private var block: JsonField<SpendLimitBlock>? = null
        private var blocked: JsonField<Boolean>? = null
        private var effectiveLimitUsd: JsonField<String>? = null
        private var limit: JsonField<Limit>? = null
        private var period: JsonField<SpendLimitPeriod>? = null
        private var periodEnd: JsonField<LocalDate>? = null
        private var periodStart: JsonField<LocalDate>? = null
        private var product: JsonField<String>? = null
        private var productName: JsonField<String>? = null
        private var recordType: JsonField<String>? = null
        private var spendError: JsonField<String>? = null
        private var spendUsd: JsonField<String>? = null
        private var credentialId: JsonField<String> = JsonMissing.of()
        private var credentialLimits: JsonField<MutableList<CredentialLimit>>? = null
        private var evaluation: JsonField<Evaluation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendLimit: SpendLimit) = apply {
            block = spendLimit.block
            blocked = spendLimit.blocked
            effectiveLimitUsd = spendLimit.effectiveLimitUsd
            limit = spendLimit.limit
            period = spendLimit.period
            periodEnd = spendLimit.periodEnd
            periodStart = spendLimit.periodStart
            product = spendLimit.product
            productName = spendLimit.productName
            recordType = spendLimit.recordType
            spendError = spendLimit.spendError
            spendUsd = spendLimit.spendUsd
            credentialId = spendLimit.credentialId
            credentialLimits = spendLimit.credentialLimits.map { it.toMutableList() }
            evaluation = spendLimit.evaluation
            additionalProperties = spendLimit.additionalProperties.toMutableMap()
        }

        /** The active block of the period. `null` when the period is not blocked. */
        fun block(block: SpendLimitBlock?) = block(JsonField.ofNullable(block))

        /** Alias for calling [Builder.block] with `block.orElse(null)`. */
        fun block(block: Optional<SpendLimitBlock>) = block(block.getOrNull())

        /**
         * Sets [Builder.block] to an arbitrary JSON value.
         *
         * You should usually call [Builder.block] with a well-typed [SpendLimitBlock] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun block(block: JsonField<SpendLimitBlock>) = apply { this.block = block }

        /**
         * The product is blocked for the whole account in this period (total limit). An API key's
         * own block appears only in `credential_limits`. Always `false` in write responses; list
         * the limits to read the block state.
         */
        fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

        /** The limit in USD that is enforced, as a decimal string. `null` means unlimited. */
        fun effectiveLimitUsd(effectiveLimitUsd: String?) =
            effectiveLimitUsd(JsonField.ofNullable(effectiveLimitUsd))

        /** Alias for calling [Builder.effectiveLimitUsd] with `effectiveLimitUsd.orElse(null)`. */
        fun effectiveLimitUsd(effectiveLimitUsd: Optional<String>) =
            effectiveLimitUsd(effectiveLimitUsd.getOrNull())

        /**
         * Sets [Builder.effectiveLimitUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveLimitUsd] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveLimitUsd(effectiveLimitUsd: JsonField<String>) = apply {
            this.effectiveLimitUsd = effectiveLimitUsd
        }

        /**
         * The limit set on the account for the product and period, whoever set it. `null` when none
         * is set.
         */
        fun limit(limit: Limit?) = limit(JsonField.ofNullable(limit))

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Limit>) = limit(limit.getOrNull())

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Limit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Limit>) = apply { this.limit = limit }

        /** `daily` is the current UTC day; `monthly` is the current UTC calendar month. */
        fun period(period: SpendLimitPeriod) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [SpendLimitPeriod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun period(period: JsonField<SpendLimitPeriod>) = apply { this.period = period }

        /** Exclusive end of the current period, a UTC date. */
        fun periodEnd(periodEnd: LocalDate) = periodEnd(JsonField.of(periodEnd))

        /**
         * Sets [Builder.periodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodEnd] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun periodEnd(periodEnd: JsonField<LocalDate>) = apply { this.periodEnd = periodEnd }

        /** First UTC day of the current period. */
        fun periodStart(periodStart: LocalDate) = periodStart(JsonField.of(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<LocalDate>) = apply {
            this.periodStart = periodStart
        }

        /** Product the entry applies to. */
        fun product(product: String) = product(JsonField.of(product))

        /**
         * Sets [Builder.product] to an arbitrary JSON value.
         *
         * You should usually call [Builder.product] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<String>) = apply { this.product = product }

        /** Display name of the product. */
        fun productName(productName: String) = productName(JsonField.of(productName))

        /**
         * Sets [Builder.productName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Set when `spend_usd` is `null`. */
        fun spendError(spendError: String?) = spendError(JsonField.ofNullable(spendError))

        /** Alias for calling [Builder.spendError] with `spendError.orElse(null)`. */
        fun spendError(spendError: Optional<String>) = spendError(spendError.getOrNull())

        /**
         * Sets [Builder.spendError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendError] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spendError(spendError: JsonField<String>) = apply { this.spendError = spendError }

        /**
         * Spend in USD so far in the period, as a decimal string. It can lag actual usage by about
         * a minute. `null` when it could not be read.
         */
        fun spendUsd(spendUsd: String?) = spendUsd(JsonField.ofNullable(spendUsd))

        /** Alias for calling [Builder.spendUsd] with `spendUsd.orElse(null)`. */
        fun spendUsd(spendUsd: Optional<String>) = spendUsd(spendUsd.getOrNull())

        /**
         * Sets [Builder.spendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendUsd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spendUsd(spendUsd: JsonField<String>) = apply { this.spendUsd = spendUsd }

        /**
         * In write responses, the API key the write was about; `null` for the total limit. Always
         * `null` in list entries, which describe the total limit.
         */
        fun credentialId(credentialId: String?) = credentialId(JsonField.ofNullable(credentialId))

        /** Alias for calling [Builder.credentialId] with `credentialId.orElse(null)`. */
        fun credentialId(credentialId: Optional<String>) = credentialId(credentialId.getOrNull())

        /**
         * Sets [Builder.credentialId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun credentialId(credentialId: JsonField<String>) = apply {
            this.credentialId = credentialId
        }

        /**
         * List responses only. One item per API key limit of the product and period, sorted by
         * `credential_id`, plus every API key that is still blocked. `[]` when there are none.
         */
        fun credentialLimits(credentialLimits: List<CredentialLimit>) =
            credentialLimits(JsonField.of(credentialLimits))

        /**
         * Sets [Builder.credentialLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialLimits] with a well-typed
         * `List<CredentialLimit>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun credentialLimits(credentialLimits: JsonField<List<CredentialLimit>>) = apply {
            this.credentialLimits = credentialLimits.map { it.toMutableList() }
        }

        /**
         * Adds a single [CredentialLimit] to [credentialLimits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCredentialLimit(credentialLimit: CredentialLimit) = apply {
            credentialLimits =
                (credentialLimits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("credentialLimits", it).add(credentialLimit)
                }
        }

        /**
         * What a create, update or delete did to the period at once. Only present in write
         * responses.
         */
        fun evaluation(evaluation: Evaluation) = evaluation(JsonField.of(evaluation))

        /**
         * Sets [Builder.evaluation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluation] with a well-typed [Evaluation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluation(evaluation: JsonField<Evaluation>) = apply { this.evaluation = evaluation }

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
         * Returns an immutable instance of [SpendLimit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .block()
         * .blocked()
         * .effectiveLimitUsd()
         * .limit()
         * .period()
         * .periodEnd()
         * .periodStart()
         * .product()
         * .productName()
         * .recordType()
         * .spendError()
         * .spendUsd()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpendLimit =
            SpendLimit(
                checkRequired("block", block),
                checkRequired("blocked", blocked),
                checkRequired("effectiveLimitUsd", effectiveLimitUsd),
                checkRequired("limit", limit),
                checkRequired("period", period),
                checkRequired("periodEnd", periodEnd),
                checkRequired("periodStart", periodStart),
                checkRequired("product", product),
                checkRequired("productName", productName),
                checkRequired("recordType", recordType),
                checkRequired("spendError", spendError),
                checkRequired("spendUsd", spendUsd),
                credentialId,
                (credentialLimits ?: JsonMissing.of()).map { it.toImmutable() },
                evaluation,
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
    fun validate(): SpendLimit = apply {
        if (validated) {
            return@apply
        }

        block().ifPresent { it.validate() }
        blocked()
        effectiveLimitUsd()
        limit().ifPresent { it.validate() }
        period().validate()
        periodEnd()
        periodStart()
        product()
        productName()
        recordType()
        spendError()
        spendUsd()
        credentialId()
        credentialLimits().ifPresent { it.forEach { it.validate() } }
        evaluation().ifPresent { it.validate() }
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
        (block.asKnown().getOrNull()?.validity() ?: 0) +
            (if (blocked.asKnown().isPresent) 1 else 0) +
            (if (effectiveLimitUsd.asKnown().isPresent) 1 else 0) +
            (limit.asKnown().getOrNull()?.validity() ?: 0) +
            (period.asKnown().getOrNull()?.validity() ?: 0) +
            (if (periodEnd.asKnown().isPresent) 1 else 0) +
            (if (periodStart.asKnown().isPresent) 1 else 0) +
            (if (product.asKnown().isPresent) 1 else 0) +
            (if (productName.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (spendError.asKnown().isPresent) 1 else 0) +
            (if (spendUsd.asKnown().isPresent) 1 else 0) +
            (if (credentialId.asKnown().isPresent) 1 else 0) +
            (credentialLimits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (evaluation.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The limit set on the account for the product and period, whoever set it. `null` when none is
     * set.
     */
    class Limit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val origin: JsonField<Origin>,
        private val unlimited: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<Origin> = JsonMissing.of(),
            @JsonProperty("unlimited")
            @ExcludeMissing
            unlimited: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(amount, origin, unlimited, updatedAt, mutableMapOf())

        /**
         * Limit in USD, as a decimal string. `null` when `unlimited` is true.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * `self_service` when a user of the account set it, `operator` when Telnyx support did.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Origin = origin.getRequired("origin")

        /**
         * True when the limit was set to explicitly no cap.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unlimited(): Boolean = unlimited.getRequired("unlimited")

        /**
         * When the limit was last set or changed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

        /**
         * Returns the raw JSON value of [unlimited].
         *
         * Unlike [unlimited], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unlimited") @ExcludeMissing fun _unlimited(): JsonField<Boolean> = unlimited

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Limit].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .origin()
             * .unlimited()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Limit]. */
        class Builder internal constructor() {

            private var amount: JsonField<String>? = null
            private var origin: JsonField<Origin>? = null
            private var unlimited: JsonField<Boolean>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(limit: Limit) = apply {
                amount = limit.amount
                origin = limit.origin
                unlimited = limit.unlimited
                updatedAt = limit.updatedAt
                additionalProperties = limit.additionalProperties.toMutableMap()
            }

            /** Limit in USD, as a decimal string. `null` when `unlimited` is true. */
            fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<String>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /**
             * `self_service` when a user of the account set it, `operator` when Telnyx support did.
             */
            fun origin(origin: Origin) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [Origin] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

            /** True when the limit was set to explicitly no cap. */
            fun unlimited(unlimited: Boolean) = unlimited(JsonField.of(unlimited))

            /**
             * Sets [Builder.unlimited] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unlimited] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unlimited(unlimited: JsonField<Boolean>) = apply { this.unlimited = unlimited }

            /** When the limit was last set or changed. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Limit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .origin()
             * .unlimited()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Limit =
                Limit(
                    checkRequired("amount", amount),
                    checkRequired("origin", origin),
                    checkRequired("unlimited", unlimited),
                    checkRequired("updatedAt", updatedAt),
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
        fun validate(): Limit = apply {
            if (validated) {
                return@apply
            }

            amount()
            origin().validate()
            unlimited()
            updatedAt()
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
                (origin.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unlimited.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** `self_service` when a user of the account set it, `operator` when Telnyx support did. */
        class Origin @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SELF_SERVICE = of("self_service")

                @JvmField val OPERATOR = of("operator")

                @JvmStatic fun of(value: String) = Origin(JsonField.of(value))
            }

            /** An enum containing [Origin]'s known values. */
            enum class Known {
                SELF_SERVICE,
                OPERATOR,
            }

            /**
             * An enum containing [Origin]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Origin] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SELF_SERVICE,
                OPERATOR,
                /**
                 * An enum member indicating that [Origin] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SELF_SERVICE -> Value.SELF_SERVICE
                    OPERATOR -> Value.OPERATOR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SELF_SERVICE -> Known.SELF_SERVICE
                    OPERATOR -> Known.OPERATOR
                    else -> throw TelnyxInvalidDataException("Unknown Origin: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
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
            fun validate(): Origin = apply {
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

                return other is Origin && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Limit &&
                amount == other.amount &&
                origin == other.origin &&
                unlimited == other.unlimited &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, origin, unlimited, updatedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Limit{amount=$amount, origin=$origin, unlimited=$unlimited, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The limit, spend and block state of one API key in the product and period. */
    class CredentialLimit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val block: JsonField<SpendLimitBlock>,
        private val blocked: JsonField<Boolean>,
        private val credentialId: JsonField<String>,
        private val limit: JsonField<Limit>,
        private val spendError: JsonField<String>,
        private val spendUsd: JsonField<String>,
        private val exceedsTotal: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("block")
            @ExcludeMissing
            block: JsonField<SpendLimitBlock> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("credential_id")
            @ExcludeMissing
            credentialId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Limit> = JsonMissing.of(),
            @JsonProperty("spend_error")
            @ExcludeMissing
            spendError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spend_usd")
            @ExcludeMissing
            spendUsd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exceeds_total")
            @ExcludeMissing
            exceedsTotal: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            block,
            blocked,
            credentialId,
            limit,
            spendError,
            spendUsd,
            exceedsTotal,
            mutableMapOf(),
        )

        /**
         * The active block of the period. `null` when the period is not blocked.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun block(): Optional<SpendLimitBlock> = block.getOptional("block")

        /**
         * This API key is blocked for the period.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun blocked(): Boolean = blocked.getRequired("blocked")

        /**
         * Identifier of the API key as recorded on usage. Never the key's secret.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun credentialId(): String = credentialId.getRequired("credential_id")

        /**
         * The limit of one API key. It always has an amount. `null` for an API key that is still
         * blocked after its limit was removed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Limit> = limit.getOptional("limit")

        /**
         * Set when `spend_usd` is `null`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendError(): Optional<String> = spendError.getOptional("spend_error")

        /**
         * Spend in USD in the period made with exactly this API key, as a decimal string. Usage
         * without an API key identifier, or with another one, counts only toward the total. `null`
         * when it could not be read.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendUsd(): Optional<String> = spendUsd.getOptional("spend_usd")

        /**
         * The API key's limit is above the period's total limit. Only a change by Telnyx support
         * can cause it; the total limit still applies to the whole account. Lower the API key limit
         * or raise the total.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun exceedsTotal(): Optional<Boolean> = exceedsTotal.getOptional("exceeds_total")

        /**
         * Returns the raw JSON value of [block].
         *
         * Unlike [block], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("block") @ExcludeMissing fun _block(): JsonField<SpendLimitBlock> = block

        /**
         * Returns the raw JSON value of [blocked].
         *
         * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

        /**
         * Returns the raw JSON value of [credentialId].
         *
         * Unlike [credentialId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credential_id")
        @ExcludeMissing
        fun _credentialId(): JsonField<String> = credentialId

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Limit> = limit

        /**
         * Returns the raw JSON value of [spendError].
         *
         * Unlike [spendError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend_error")
        @ExcludeMissing
        fun _spendError(): JsonField<String> = spendError

        /**
         * Returns the raw JSON value of [spendUsd].
         *
         * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<String> = spendUsd

        /**
         * Returns the raw JSON value of [exceedsTotal].
         *
         * Unlike [exceedsTotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exceeds_total")
        @ExcludeMissing
        fun _exceedsTotal(): JsonField<Boolean> = exceedsTotal

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
             * Returns a mutable builder for constructing an instance of [CredentialLimit].
             *
             * The following fields are required:
             * ```java
             * .block()
             * .blocked()
             * .credentialId()
             * .limit()
             * .spendError()
             * .spendUsd()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CredentialLimit]. */
        class Builder internal constructor() {

            private var block: JsonField<SpendLimitBlock>? = null
            private var blocked: JsonField<Boolean>? = null
            private var credentialId: JsonField<String>? = null
            private var limit: JsonField<Limit>? = null
            private var spendError: JsonField<String>? = null
            private var spendUsd: JsonField<String>? = null
            private var exceedsTotal: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credentialLimit: CredentialLimit) = apply {
                block = credentialLimit.block
                blocked = credentialLimit.blocked
                credentialId = credentialLimit.credentialId
                limit = credentialLimit.limit
                spendError = credentialLimit.spendError
                spendUsd = credentialLimit.spendUsd
                exceedsTotal = credentialLimit.exceedsTotal
                additionalProperties = credentialLimit.additionalProperties.toMutableMap()
            }

            /** The active block of the period. `null` when the period is not blocked. */
            fun block(block: SpendLimitBlock?) = block(JsonField.ofNullable(block))

            /** Alias for calling [Builder.block] with `block.orElse(null)`. */
            fun block(block: Optional<SpendLimitBlock>) = block(block.getOrNull())

            /**
             * Sets [Builder.block] to an arbitrary JSON value.
             *
             * You should usually call [Builder.block] with a well-typed [SpendLimitBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun block(block: JsonField<SpendLimitBlock>) = apply { this.block = block }

            /** This API key is blocked for the period. */
            fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

            /**
             * Sets [Builder.blocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

            /** Identifier of the API key as recorded on usage. Never the key's secret. */
            fun credentialId(credentialId: String) = credentialId(JsonField.of(credentialId))

            /**
             * Sets [Builder.credentialId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credentialId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credentialId(credentialId: JsonField<String>) = apply {
                this.credentialId = credentialId
            }

            /**
             * The limit of one API key. It always has an amount. `null` for an API key that is
             * still blocked after its limit was removed.
             */
            fun limit(limit: Limit?) = limit(JsonField.ofNullable(limit))

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Limit>) = limit(limit.getOrNull())

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Limit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Limit>) = apply { this.limit = limit }

            /** Set when `spend_usd` is `null`. */
            fun spendError(spendError: String?) = spendError(JsonField.ofNullable(spendError))

            /** Alias for calling [Builder.spendError] with `spendError.orElse(null)`. */
            fun spendError(spendError: Optional<String>) = spendError(spendError.getOrNull())

            /**
             * Sets [Builder.spendError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendError] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spendError(spendError: JsonField<String>) = apply { this.spendError = spendError }

            /**
             * Spend in USD in the period made with exactly this API key, as a decimal string. Usage
             * without an API key identifier, or with another one, counts only toward the total.
             * `null` when it could not be read.
             */
            fun spendUsd(spendUsd: String?) = spendUsd(JsonField.ofNullable(spendUsd))

            /** Alias for calling [Builder.spendUsd] with `spendUsd.orElse(null)`. */
            fun spendUsd(spendUsd: Optional<String>) = spendUsd(spendUsd.getOrNull())

            /**
             * Sets [Builder.spendUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendUsd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spendUsd(spendUsd: JsonField<String>) = apply { this.spendUsd = spendUsd }

            /**
             * The API key's limit is above the period's total limit. Only a change by Telnyx
             * support can cause it; the total limit still applies to the whole account. Lower the
             * API key limit or raise the total.
             */
            fun exceedsTotal(exceedsTotal: Boolean) = exceedsTotal(JsonField.of(exceedsTotal))

            /**
             * Sets [Builder.exceedsTotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exceedsTotal] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exceedsTotal(exceedsTotal: JsonField<Boolean>) = apply {
                this.exceedsTotal = exceedsTotal
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
             * Returns an immutable instance of [CredentialLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .block()
             * .blocked()
             * .credentialId()
             * .limit()
             * .spendError()
             * .spendUsd()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CredentialLimit =
                CredentialLimit(
                    checkRequired("block", block),
                    checkRequired("blocked", blocked),
                    checkRequired("credentialId", credentialId),
                    checkRequired("limit", limit),
                    checkRequired("spendError", spendError),
                    checkRequired("spendUsd", spendUsd),
                    exceedsTotal,
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
        fun validate(): CredentialLimit = apply {
            if (validated) {
                return@apply
            }

            block().ifPresent { it.validate() }
            blocked()
            credentialId()
            limit().ifPresent { it.validate() }
            spendError()
            spendUsd()
            exceedsTotal()
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
            (block.asKnown().getOrNull()?.validity() ?: 0) +
                (if (blocked.asKnown().isPresent) 1 else 0) +
                (if (credentialId.asKnown().isPresent) 1 else 0) +
                (limit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (spendError.asKnown().isPresent) 1 else 0) +
                (if (spendUsd.asKnown().isPresent) 1 else 0) +
                (if (exceedsTotal.asKnown().isPresent) 1 else 0)

        /**
         * The limit of one API key. It always has an amount. `null` for an API key that is still
         * blocked after its limit was removed.
         */
        class Limit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val origin: JsonField<Origin>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origin")
                @ExcludeMissing
                origin: JsonField<Origin> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(amount, origin, updatedAt, mutableMapOf())

            /**
             * Limit in USD, as a decimal string.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * `self_service` when a user of the account set it, `operator` when Telnyx support did.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun origin(): Origin = origin.getRequired("origin")

            /**
             * When the limit was last set or changed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [origin].
             *
             * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                 * Returns a mutable builder for constructing an instance of [Limit].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .origin()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Limit]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var origin: JsonField<Origin>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(limit: Limit) = apply {
                    amount = limit.amount
                    origin = limit.origin
                    updatedAt = limit.updatedAt
                    additionalProperties = limit.additionalProperties.toMutableMap()
                }

                /** Limit in USD, as a decimal string. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /**
                 * `self_service` when a user of the account set it, `operator` when Telnyx support
                 * did.
                 */
                fun origin(origin: Origin) = origin(JsonField.of(origin))

                /**
                 * Sets [Builder.origin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origin] with a well-typed [Origin] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

                /** When the limit was last set or changed. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
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
                 * Returns an immutable instance of [Limit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .origin()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Limit =
                    Limit(
                        checkRequired("amount", amount),
                        checkRequired("origin", origin),
                        checkRequired("updatedAt", updatedAt),
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
            fun validate(): Limit = apply {
                if (validated) {
                    return@apply
                }

                amount()
                origin().validate()
                updatedAt()
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
                    (origin.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            /**
             * `self_service` when a user of the account set it, `operator` when Telnyx support did.
             */
            class Origin @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SELF_SERVICE = of("self_service")

                    @JvmField val OPERATOR = of("operator")

                    @JvmStatic fun of(value: String) = Origin(JsonField.of(value))
                }

                /** An enum containing [Origin]'s known values. */
                enum class Known {
                    SELF_SERVICE,
                    OPERATOR,
                }

                /**
                 * An enum containing [Origin]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Origin] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SELF_SERVICE,
                    OPERATOR,
                    /**
                     * An enum member indicating that [Origin] was instantiated with an unknown
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
                        SELF_SERVICE -> Value.SELF_SERVICE
                        OPERATOR -> Value.OPERATOR
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
                        SELF_SERVICE -> Known.SELF_SERVICE
                        OPERATOR -> Known.OPERATOR
                        else -> throw TelnyxInvalidDataException("Unknown Origin: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
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
                fun validate(): Origin = apply {
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

                    return other is Origin && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Limit &&
                    amount == other.amount &&
                    origin == other.origin &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, origin, updatedAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Limit{amount=$amount, origin=$origin, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CredentialLimit &&
                block == other.block &&
                blocked == other.blocked &&
                credentialId == other.credentialId &&
                limit == other.limit &&
                spendError == other.spendError &&
                spendUsd == other.spendUsd &&
                exceedsTotal == other.exceedsTotal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                block,
                blocked,
                credentialId,
                limit,
                spendError,
                spendUsd,
                exceedsTotal,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CredentialLimit{block=$block, blocked=$blocked, credentialId=$credentialId, limit=$limit, spendError=$spendError, spendUsd=$spendUsd, exceedsTotal=$exceedsTotal, additionalProperties=$additionalProperties}"
    }

    /**
     * What a create, update or delete did to the period at once. Only present in write responses.
     */
    class Evaluation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val blockedNow: JsonField<Boolean>,
        private val evaluationDeferred: JsonField<Boolean>,
        private val released: JsonField<Boolean>,
        private val spendUsd: JsonField<String>,
        private val stillBlockedOtherPeriod: JsonField<Boolean>,
        private val stillOverLimit: JsonField<Boolean>,
        private val accountBlocked: JsonField<Boolean>,
        private val note: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("blocked_now")
            @ExcludeMissing
            blockedNow: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("evaluation_deferred")
            @ExcludeMissing
            evaluationDeferred: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("released")
            @ExcludeMissing
            released: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("spend_usd")
            @ExcludeMissing
            spendUsd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("still_blocked_other_period")
            @ExcludeMissing
            stillBlockedOtherPeriod: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("still_over_limit")
            @ExcludeMissing
            stillOverLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("account_blocked")
            @ExcludeMissing
            accountBlocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        ) : this(
            blockedNow,
            evaluationDeferred,
            released,
            spendUsd,
            stillBlockedOtherPeriod,
            stillOverLimit,
            accountBlocked,
            note,
            mutableMapOf(),
        )

        /**
         * The change blocked the product: the spend was already above the new limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun blockedNow(): Boolean = blockedNow.getRequired("blocked_now")

        /**
         * The spend could not be checked now. The change is saved and applied within a few minutes.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun evaluationDeferred(): Boolean = evaluationDeferred.getRequired("evaluation_deferred")

        /**
         * The change lifted a block of this period.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun released(): Boolean = released.getRequired("released")

        /**
         * Spend in USD used for the check, as a decimal string. `null` when the spend was not
         * checked.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spendUsd(): Optional<String> = spendUsd.getOptional("spend_usd")

        /**
         * The other period has an active block, so the product stays blocked whatever this period's
         * result. For an API key write, the API key's limit in the other period.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun stillBlockedOtherPeriod(): Boolean =
            stillBlockedOtherPeriod.getRequired("still_blocked_other_period")

        /**
         * A block of this period remains because the spend is still above the new limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun stillOverLimit(): Boolean = stillOverLimit.getRequired("still_over_limit")

        /**
         * API key writes only: the account itself remains blocked for the product under a total
         * limit. Absent for total limit writes.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountBlocked(): Optional<Boolean> = accountBlocked.getOptional("account_blocked")

        /**
         * Additional information about the result, when there is any.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun note(): Optional<String> = note.getOptional("note")

        /**
         * Returns the raw JSON value of [blockedNow].
         *
         * Unlike [blockedNow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked_now")
        @ExcludeMissing
        fun _blockedNow(): JsonField<Boolean> = blockedNow

        /**
         * Returns the raw JSON value of [evaluationDeferred].
         *
         * Unlike [evaluationDeferred], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("evaluation_deferred")
        @ExcludeMissing
        fun _evaluationDeferred(): JsonField<Boolean> = evaluationDeferred

        /**
         * Returns the raw JSON value of [released].
         *
         * Unlike [released], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("released") @ExcludeMissing fun _released(): JsonField<Boolean> = released

        /**
         * Returns the raw JSON value of [spendUsd].
         *
         * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<String> = spendUsd

        /**
         * Returns the raw JSON value of [stillBlockedOtherPeriod].
         *
         * Unlike [stillBlockedOtherPeriod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("still_blocked_other_period")
        @ExcludeMissing
        fun _stillBlockedOtherPeriod(): JsonField<Boolean> = stillBlockedOtherPeriod

        /**
         * Returns the raw JSON value of [stillOverLimit].
         *
         * Unlike [stillOverLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("still_over_limit")
        @ExcludeMissing
        fun _stillOverLimit(): JsonField<Boolean> = stillOverLimit

        /**
         * Returns the raw JSON value of [accountBlocked].
         *
         * Unlike [accountBlocked], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_blocked")
        @ExcludeMissing
        fun _accountBlocked(): JsonField<Boolean> = accountBlocked

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

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
             * Returns a mutable builder for constructing an instance of [Evaluation].
             *
             * The following fields are required:
             * ```java
             * .blockedNow()
             * .evaluationDeferred()
             * .released()
             * .spendUsd()
             * .stillBlockedOtherPeriod()
             * .stillOverLimit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Evaluation]. */
        class Builder internal constructor() {

            private var blockedNow: JsonField<Boolean>? = null
            private var evaluationDeferred: JsonField<Boolean>? = null
            private var released: JsonField<Boolean>? = null
            private var spendUsd: JsonField<String>? = null
            private var stillBlockedOtherPeriod: JsonField<Boolean>? = null
            private var stillOverLimit: JsonField<Boolean>? = null
            private var accountBlocked: JsonField<Boolean> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(evaluation: Evaluation) = apply {
                blockedNow = evaluation.blockedNow
                evaluationDeferred = evaluation.evaluationDeferred
                released = evaluation.released
                spendUsd = evaluation.spendUsd
                stillBlockedOtherPeriod = evaluation.stillBlockedOtherPeriod
                stillOverLimit = evaluation.stillOverLimit
                accountBlocked = evaluation.accountBlocked
                note = evaluation.note
                additionalProperties = evaluation.additionalProperties.toMutableMap()
            }

            /** The change blocked the product: the spend was already above the new limit. */
            fun blockedNow(blockedNow: Boolean) = blockedNow(JsonField.of(blockedNow))

            /**
             * Sets [Builder.blockedNow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockedNow] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockedNow(blockedNow: JsonField<Boolean>) = apply { this.blockedNow = blockedNow }

            /**
             * The spend could not be checked now. The change is saved and applied within a few
             * minutes.
             */
            fun evaluationDeferred(evaluationDeferred: Boolean) =
                evaluationDeferred(JsonField.of(evaluationDeferred))

            /**
             * Sets [Builder.evaluationDeferred] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluationDeferred] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluationDeferred(evaluationDeferred: JsonField<Boolean>) = apply {
                this.evaluationDeferred = evaluationDeferred
            }

            /** The change lifted a block of this period. */
            fun released(released: Boolean) = released(JsonField.of(released))

            /**
             * Sets [Builder.released] to an arbitrary JSON value.
             *
             * You should usually call [Builder.released] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun released(released: JsonField<Boolean>) = apply { this.released = released }

            /**
             * Spend in USD used for the check, as a decimal string. `null` when the spend was not
             * checked.
             */
            fun spendUsd(spendUsd: String?) = spendUsd(JsonField.ofNullable(spendUsd))

            /** Alias for calling [Builder.spendUsd] with `spendUsd.orElse(null)`. */
            fun spendUsd(spendUsd: Optional<String>) = spendUsd(spendUsd.getOrNull())

            /**
             * Sets [Builder.spendUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendUsd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spendUsd(spendUsd: JsonField<String>) = apply { this.spendUsd = spendUsd }

            /**
             * The other period has an active block, so the product stays blocked whatever this
             * period's result. For an API key write, the API key's limit in the other period.
             */
            fun stillBlockedOtherPeriod(stillBlockedOtherPeriod: Boolean) =
                stillBlockedOtherPeriod(JsonField.of(stillBlockedOtherPeriod))

            /**
             * Sets [Builder.stillBlockedOtherPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stillBlockedOtherPeriod] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun stillBlockedOtherPeriod(stillBlockedOtherPeriod: JsonField<Boolean>) = apply {
                this.stillBlockedOtherPeriod = stillBlockedOtherPeriod
            }

            /** A block of this period remains because the spend is still above the new limit. */
            fun stillOverLimit(stillOverLimit: Boolean) =
                stillOverLimit(JsonField.of(stillOverLimit))

            /**
             * Sets [Builder.stillOverLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stillOverLimit] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stillOverLimit(stillOverLimit: JsonField<Boolean>) = apply {
                this.stillOverLimit = stillOverLimit
            }

            /**
             * API key writes only: the account itself remains blocked for the product under a total
             * limit. Absent for total limit writes.
             */
            fun accountBlocked(accountBlocked: Boolean) =
                accountBlocked(JsonField.of(accountBlocked))

            /**
             * Sets [Builder.accountBlocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountBlocked] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountBlocked(accountBlocked: JsonField<Boolean>) = apply {
                this.accountBlocked = accountBlocked
            }

            /** Additional information about the result, when there is any. */
            fun note(note: String) = note(JsonField.of(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

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
             * Returns an immutable instance of [Evaluation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .blockedNow()
             * .evaluationDeferred()
             * .released()
             * .spendUsd()
             * .stillBlockedOtherPeriod()
             * .stillOverLimit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Evaluation =
                Evaluation(
                    checkRequired("blockedNow", blockedNow),
                    checkRequired("evaluationDeferred", evaluationDeferred),
                    checkRequired("released", released),
                    checkRequired("spendUsd", spendUsd),
                    checkRequired("stillBlockedOtherPeriod", stillBlockedOtherPeriod),
                    checkRequired("stillOverLimit", stillOverLimit),
                    accountBlocked,
                    note,
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
        fun validate(): Evaluation = apply {
            if (validated) {
                return@apply
            }

            blockedNow()
            evaluationDeferred()
            released()
            spendUsd()
            stillBlockedOtherPeriod()
            stillOverLimit()
            accountBlocked()
            note()
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
            (if (blockedNow.asKnown().isPresent) 1 else 0) +
                (if (evaluationDeferred.asKnown().isPresent) 1 else 0) +
                (if (released.asKnown().isPresent) 1 else 0) +
                (if (spendUsd.asKnown().isPresent) 1 else 0) +
                (if (stillBlockedOtherPeriod.asKnown().isPresent) 1 else 0) +
                (if (stillOverLimit.asKnown().isPresent) 1 else 0) +
                (if (accountBlocked.asKnown().isPresent) 1 else 0) +
                (if (note.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Evaluation &&
                blockedNow == other.blockedNow &&
                evaluationDeferred == other.evaluationDeferred &&
                released == other.released &&
                spendUsd == other.spendUsd &&
                stillBlockedOtherPeriod == other.stillBlockedOtherPeriod &&
                stillOverLimit == other.stillOverLimit &&
                accountBlocked == other.accountBlocked &&
                note == other.note &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                blockedNow,
                evaluationDeferred,
                released,
                spendUsd,
                stillBlockedOtherPeriod,
                stillOverLimit,
                accountBlocked,
                note,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Evaluation{blockedNow=$blockedNow, evaluationDeferred=$evaluationDeferred, released=$released, spendUsd=$spendUsd, stillBlockedOtherPeriod=$stillBlockedOtherPeriod, stillOverLimit=$stillOverLimit, accountBlocked=$accountBlocked, note=$note, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendLimit &&
            block == other.block &&
            blocked == other.blocked &&
            effectiveLimitUsd == other.effectiveLimitUsd &&
            limit == other.limit &&
            period == other.period &&
            periodEnd == other.periodEnd &&
            periodStart == other.periodStart &&
            product == other.product &&
            productName == other.productName &&
            recordType == other.recordType &&
            spendError == other.spendError &&
            spendUsd == other.spendUsd &&
            credentialId == other.credentialId &&
            credentialLimits == other.credentialLimits &&
            evaluation == other.evaluation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            block,
            blocked,
            effectiveLimitUsd,
            limit,
            period,
            periodEnd,
            periodStart,
            product,
            productName,
            recordType,
            spendError,
            spendUsd,
            credentialId,
            credentialLimits,
            evaluation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendLimit{block=$block, blocked=$blocked, effectiveLimitUsd=$effectiveLimitUsd, limit=$limit, period=$period, periodEnd=$periodEnd, periodStart=$periodStart, product=$product, productName=$productName, recordType=$recordType, spendError=$spendError, spendUsd=$spendUsd, credentialId=$credentialId, credentialLimits=$credentialLimits, evaluation=$evaluation, additionalProperties=$additionalProperties}"
}
