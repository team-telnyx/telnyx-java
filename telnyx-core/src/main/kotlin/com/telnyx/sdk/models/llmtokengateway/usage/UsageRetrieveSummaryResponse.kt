// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

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

class UsageRetrieveSummaryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
         * Returns a mutable builder for constructing an instance of [UsageRetrieveSummaryResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveSummaryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageRetrieveSummaryResponse: UsageRetrieveSummaryResponse) = apply {
            data = usageRetrieveSummaryResponse.data
            meta = usageRetrieveSummaryResponse.meta
            additionalProperties = usageRetrieveSummaryResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [UsageRetrieveSummaryResponse].
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
        fun build(): UsageRetrieveSummaryResponse =
            UsageRetrieveSummaryResponse(
                checkRequired("data", data),
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
    fun validate(): UsageRetrieveSummaryResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val byDay: JsonField<List<ByDay>>,
        private val byModel: JsonField<List<ByModel>>,
        private val guardrails: JsonField<Guardrails>,
        private val totals: JsonField<Totals>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("by_day")
            @ExcludeMissing
            byDay: JsonField<List<ByDay>> = JsonMissing.of(),
            @JsonProperty("by_model")
            @ExcludeMissing
            byModel: JsonField<List<ByModel>> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<Guardrails> = JsonMissing.of(),
            @JsonProperty("totals") @ExcludeMissing totals: JsonField<Totals> = JsonMissing.of(),
        ) : this(byDay, byModel, guardrails, totals, mutableMapOf())

        /**
         * One row per UTC day, including zero-activity days.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun byDay(): List<ByDay> = byDay.getRequired("by_day")

        /**
         * One row per model, ordered by request count descending then model name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun byModel(): List<ByModel> = byModel.getRequired("by_model")

        /**
         * Complete guardrail event counts and bounded recent findings for the same group and range.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun guardrails(): Guardrails = guardrails.getRequired("guardrails")

        /**
         * Metrics for all matching requests.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totals(): Totals = totals.getRequired("totals")

        /**
         * Returns the raw JSON value of [byDay].
         *
         * Unlike [byDay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("by_day") @ExcludeMissing fun _byDay(): JsonField<List<ByDay>> = byDay

        /**
         * Returns the raw JSON value of [byModel].
         *
         * Unlike [byModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("by_model") @ExcludeMissing fun _byModel(): JsonField<List<ByModel>> = byModel

        /**
         * Returns the raw JSON value of [guardrails].
         *
         * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrails")
        @ExcludeMissing
        fun _guardrails(): JsonField<Guardrails> = guardrails

        /**
         * Returns the raw JSON value of [totals].
         *
         * Unlike [totals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totals") @ExcludeMissing fun _totals(): JsonField<Totals> = totals

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .byDay()
             * .byModel()
             * .guardrails()
             * .totals()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var byDay: JsonField<MutableList<ByDay>>? = null
            private var byModel: JsonField<MutableList<ByModel>>? = null
            private var guardrails: JsonField<Guardrails>? = null
            private var totals: JsonField<Totals>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                byDay = data.byDay.map { it.toMutableList() }
                byModel = data.byModel.map { it.toMutableList() }
                guardrails = data.guardrails
                totals = data.totals
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** One row per UTC day, including zero-activity days. */
            fun byDay(byDay: List<ByDay>) = byDay(JsonField.of(byDay))

            /**
             * Sets [Builder.byDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.byDay] with a well-typed `List<ByDay>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun byDay(byDay: JsonField<List<ByDay>>) = apply {
                this.byDay = byDay.map { it.toMutableList() }
            }

            /**
             * Adds a single [ByDay] to [Builder.byDay].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addByDay(byDay: ByDay) = apply {
                this.byDay =
                    (this.byDay ?: JsonField.of(mutableListOf())).also {
                        checkKnown("byDay", it).add(byDay)
                    }
            }

            /** One row per model, ordered by request count descending then model name. */
            fun byModel(byModel: List<ByModel>) = byModel(JsonField.of(byModel))

            /**
             * Sets [Builder.byModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.byModel] with a well-typed `List<ByModel>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun byModel(byModel: JsonField<List<ByModel>>) = apply {
                this.byModel = byModel.map { it.toMutableList() }
            }

            /**
             * Adds a single [ByModel] to [Builder.byModel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addByModel(byModel: ByModel) = apply {
                this.byModel =
                    (this.byModel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("byModel", it).add(byModel)
                    }
            }

            /**
             * Complete guardrail event counts and bounded recent findings for the same group and
             * range.
             */
            fun guardrails(guardrails: Guardrails) = guardrails(JsonField.of(guardrails))

            /**
             * Sets [Builder.guardrails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrails] with a well-typed [Guardrails] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrails(guardrails: JsonField<Guardrails>) = apply {
                this.guardrails = guardrails
            }

            /** Metrics for all matching requests. */
            fun totals(totals: Totals) = totals(JsonField.of(totals))

            /**
             * Sets [Builder.totals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totals] with a well-typed [Totals] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totals(totals: JsonField<Totals>) = apply { this.totals = totals }

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
             *
             * The following fields are required:
             * ```java
             * .byDay()
             * .byModel()
             * .guardrails()
             * .totals()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("byDay", byDay).map { it.toImmutable() },
                    checkRequired("byModel", byModel).map { it.toImmutable() },
                    checkRequired("guardrails", guardrails),
                    checkRequired("totals", totals),
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

            byDay().forEach { it.validate() }
            byModel().forEach { it.validate() }
            guardrails().validate()
            totals().validate()
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
            (byDay.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (byModel.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (guardrails.asKnown().getOrNull()?.validity() ?: 0) +
                (totals.asKnown().getOrNull()?.validity() ?: 0)

        class ByDay
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cacheHits: JsonField<Long>,
            private val date: JsonField<LocalDate>,
            private val failedRequests: JsonField<Long>,
            private val inputTokens: JsonField<Long>,
            private val outputTokens: JsonField<Long>,
            private val partialRequests: JsonField<Long>,
            private val requests: JsonField<Long>,
            private val reservedSpend: JsonField<Double>,
            private val spend: JsonField<Double>,
            private val succeededRequests: JsonField<Long>,
            private val unknownRequests: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cache_hits")
                @ExcludeMissing
                cacheHits: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("failed_requests")
                @ExcludeMissing
                failedRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("input_tokens")
                @ExcludeMissing
                inputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("output_tokens")
                @ExcludeMissing
                outputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("partial_requests")
                @ExcludeMissing
                partialRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("requests")
                @ExcludeMissing
                requests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reserved_spend")
                @ExcludeMissing
                reservedSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("succeeded_requests")
                @ExcludeMissing
                succeededRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("unknown_requests")
                @ExcludeMissing
                unknownRequests: JsonField<Long> = JsonMissing.of(),
            ) : this(
                cacheHits,
                date,
                failedRequests,
                inputTokens,
                outputTokens,
                partialRequests,
                requests,
                reservedSpend,
                spend,
                succeededRequests,
                unknownRequests,
                mutableMapOf(),
            )

            /**
             * Requests served from the gateway cache.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cacheHits(): Long = cacheHits.getRequired("cache_hits")

            /**
             * UTC day.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun date(): LocalDate = date.getRequired("date")

            /**
             * Requests classified as failed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun failedRequests(): Long = failedRequests.getRequired("failed_requests")

            /**
             * Independently known input tokens across attempts, including corrected usage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

            /**
             * Independently known output tokens across attempts, including corrected usage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

            /**
             * Requests classified as partial after streaming began.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun partialRequests(): Long = partialRequests.getRequired("partial_requests")

            /**
             * Number of matching requests.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requests(): Long = requests.getRequired("requests")

            /**
             * Unresolved budget reservations in USD.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reservedSpend(): Double = reservedSpend.getRequired("reserved_spend")

            /**
             * Sum of known reference/enforcement cost in USD.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun spend(): Double = spend.getRequired("spend")

            /**
             * Requests classified as succeeded.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun succeededRequests(): Long = succeededRequests.getRequired("succeeded_requests")

            /**
             * Requests whose cost remains unresolved; unknown cost is excluded from spend.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unknownRequests(): Long = unknownRequests.getRequired("unknown_requests")

            /**
             * Returns the raw JSON value of [cacheHits].
             *
             * Unlike [cacheHits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_hits")
            @ExcludeMissing
            fun _cacheHits(): JsonField<Long> = cacheHits

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

            /**
             * Returns the raw JSON value of [failedRequests].
             *
             * Unlike [failedRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("failed_requests")
            @ExcludeMissing
            fun _failedRequests(): JsonField<Long> = failedRequests

            /**
             * Returns the raw JSON value of [inputTokens].
             *
             * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("input_tokens")
            @ExcludeMissing
            fun _inputTokens(): JsonField<Long> = inputTokens

            /**
             * Returns the raw JSON value of [outputTokens].
             *
             * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("output_tokens")
            @ExcludeMissing
            fun _outputTokens(): JsonField<Long> = outputTokens

            /**
             * Returns the raw JSON value of [partialRequests].
             *
             * Unlike [partialRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("partial_requests")
            @ExcludeMissing
            fun _partialRequests(): JsonField<Long> = partialRequests

            /**
             * Returns the raw JSON value of [requests].
             *
             * Unlike [requests], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requests") @ExcludeMissing fun _requests(): JsonField<Long> = requests

            /**
             * Returns the raw JSON value of [reservedSpend].
             *
             * Unlike [reservedSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reserved_spend")
            @ExcludeMissing
            fun _reservedSpend(): JsonField<Double> = reservedSpend

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [succeededRequests].
             *
             * Unlike [succeededRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("succeeded_requests")
            @ExcludeMissing
            fun _succeededRequests(): JsonField<Long> = succeededRequests

            /**
             * Returns the raw JSON value of [unknownRequests].
             *
             * Unlike [unknownRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("unknown_requests")
            @ExcludeMissing
            fun _unknownRequests(): JsonField<Long> = unknownRequests

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
                 * Returns a mutable builder for constructing an instance of [ByDay].
                 *
                 * The following fields are required:
                 * ```java
                 * .cacheHits()
                 * .date()
                 * .failedRequests()
                 * .inputTokens()
                 * .outputTokens()
                 * .partialRequests()
                 * .requests()
                 * .reservedSpend()
                 * .spend()
                 * .succeededRequests()
                 * .unknownRequests()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByDay]. */
            class Builder internal constructor() {

                private var cacheHits: JsonField<Long>? = null
                private var date: JsonField<LocalDate>? = null
                private var failedRequests: JsonField<Long>? = null
                private var inputTokens: JsonField<Long>? = null
                private var outputTokens: JsonField<Long>? = null
                private var partialRequests: JsonField<Long>? = null
                private var requests: JsonField<Long>? = null
                private var reservedSpend: JsonField<Double>? = null
                private var spend: JsonField<Double>? = null
                private var succeededRequests: JsonField<Long>? = null
                private var unknownRequests: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byDay: ByDay) = apply {
                    cacheHits = byDay.cacheHits
                    date = byDay.date
                    failedRequests = byDay.failedRequests
                    inputTokens = byDay.inputTokens
                    outputTokens = byDay.outputTokens
                    partialRequests = byDay.partialRequests
                    requests = byDay.requests
                    reservedSpend = byDay.reservedSpend
                    spend = byDay.spend
                    succeededRequests = byDay.succeededRequests
                    unknownRequests = byDay.unknownRequests
                    additionalProperties = byDay.additionalProperties.toMutableMap()
                }

                /** Requests served from the gateway cache. */
                fun cacheHits(cacheHits: Long) = cacheHits(JsonField.of(cacheHits))

                /**
                 * Sets [Builder.cacheHits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheHits] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cacheHits(cacheHits: JsonField<Long>) = apply { this.cacheHits = cacheHits }

                /** UTC day. */
                fun date(date: LocalDate) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<LocalDate>) = apply { this.date = date }

                /** Requests classified as failed. */
                fun failedRequests(failedRequests: Long) =
                    failedRequests(JsonField.of(failedRequests))

                /**
                 * Sets [Builder.failedRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failedRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun failedRequests(failedRequests: JsonField<Long>) = apply {
                    this.failedRequests = failedRequests
                }

                /** Independently known input tokens across attempts, including corrected usage. */
                fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

                /**
                 * Sets [Builder.inputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inputTokens(inputTokens: JsonField<Long>) = apply {
                    this.inputTokens = inputTokens
                }

                /** Independently known output tokens across attempts, including corrected usage. */
                fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

                /**
                 * Sets [Builder.outputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outputTokens(outputTokens: JsonField<Long>) = apply {
                    this.outputTokens = outputTokens
                }

                /** Requests classified as partial after streaming began. */
                fun partialRequests(partialRequests: Long) =
                    partialRequests(JsonField.of(partialRequests))

                /**
                 * Sets [Builder.partialRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partialRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partialRequests(partialRequests: JsonField<Long>) = apply {
                    this.partialRequests = partialRequests
                }

                /** Number of matching requests. */
                fun requests(requests: Long) = requests(JsonField.of(requests))

                /**
                 * Sets [Builder.requests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requests(requests: JsonField<Long>) = apply { this.requests = requests }

                /** Unresolved budget reservations in USD. */
                fun reservedSpend(reservedSpend: Double) =
                    reservedSpend(JsonField.of(reservedSpend))

                /**
                 * Sets [Builder.reservedSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reservedSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reservedSpend(reservedSpend: JsonField<Double>) = apply {
                    this.reservedSpend = reservedSpend
                }

                /** Sum of known reference/enforcement cost in USD. */
                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                /** Requests classified as succeeded. */
                fun succeededRequests(succeededRequests: Long) =
                    succeededRequests(JsonField.of(succeededRequests))

                /**
                 * Sets [Builder.succeededRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.succeededRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun succeededRequests(succeededRequests: JsonField<Long>) = apply {
                    this.succeededRequests = succeededRequests
                }

                /** Requests whose cost remains unresolved; unknown cost is excluded from spend. */
                fun unknownRequests(unknownRequests: Long) =
                    unknownRequests(JsonField.of(unknownRequests))

                /**
                 * Sets [Builder.unknownRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unknownRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unknownRequests(unknownRequests: JsonField<Long>) = apply {
                    this.unknownRequests = unknownRequests
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
                 * Returns an immutable instance of [ByDay].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cacheHits()
                 * .date()
                 * .failedRequests()
                 * .inputTokens()
                 * .outputTokens()
                 * .partialRequests()
                 * .requests()
                 * .reservedSpend()
                 * .spend()
                 * .succeededRequests()
                 * .unknownRequests()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ByDay =
                    ByDay(
                        checkRequired("cacheHits", cacheHits),
                        checkRequired("date", date),
                        checkRequired("failedRequests", failedRequests),
                        checkRequired("inputTokens", inputTokens),
                        checkRequired("outputTokens", outputTokens),
                        checkRequired("partialRequests", partialRequests),
                        checkRequired("requests", requests),
                        checkRequired("reservedSpend", reservedSpend),
                        checkRequired("spend", spend),
                        checkRequired("succeededRequests", succeededRequests),
                        checkRequired("unknownRequests", unknownRequests),
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
            fun validate(): ByDay = apply {
                if (validated) {
                    return@apply
                }

                cacheHits()
                date()
                failedRequests()
                inputTokens()
                outputTokens()
                partialRequests()
                requests()
                reservedSpend()
                spend()
                succeededRequests()
                unknownRequests()
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
                (if (cacheHits.asKnown().isPresent) 1 else 0) +
                    (if (date.asKnown().isPresent) 1 else 0) +
                    (if (failedRequests.asKnown().isPresent) 1 else 0) +
                    (if (inputTokens.asKnown().isPresent) 1 else 0) +
                    (if (outputTokens.asKnown().isPresent) 1 else 0) +
                    (if (partialRequests.asKnown().isPresent) 1 else 0) +
                    (if (requests.asKnown().isPresent) 1 else 0) +
                    (if (reservedSpend.asKnown().isPresent) 1 else 0) +
                    (if (spend.asKnown().isPresent) 1 else 0) +
                    (if (succeededRequests.asKnown().isPresent) 1 else 0) +
                    (if (unknownRequests.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByDay &&
                    cacheHits == other.cacheHits &&
                    date == other.date &&
                    failedRequests == other.failedRequests &&
                    inputTokens == other.inputTokens &&
                    outputTokens == other.outputTokens &&
                    partialRequests == other.partialRequests &&
                    requests == other.requests &&
                    reservedSpend == other.reservedSpend &&
                    spend == other.spend &&
                    succeededRequests == other.succeededRequests &&
                    unknownRequests == other.unknownRequests &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cacheHits,
                    date,
                    failedRequests,
                    inputTokens,
                    outputTokens,
                    partialRequests,
                    requests,
                    reservedSpend,
                    spend,
                    succeededRequests,
                    unknownRequests,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByDay{cacheHits=$cacheHits, date=$date, failedRequests=$failedRequests, inputTokens=$inputTokens, outputTokens=$outputTokens, partialRequests=$partialRequests, requests=$requests, reservedSpend=$reservedSpend, spend=$spend, succeededRequests=$succeededRequests, unknownRequests=$unknownRequests, additionalProperties=$additionalProperties}"
        }

        class ByModel
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cacheHits: JsonField<Long>,
            private val failedRequests: JsonField<Long>,
            private val inputTokens: JsonField<Long>,
            private val model: JsonField<String>,
            private val outputTokens: JsonField<Long>,
            private val partialRequests: JsonField<Long>,
            private val requests: JsonField<Long>,
            private val reservedSpend: JsonField<Double>,
            private val spend: JsonField<Double>,
            private val succeededRequests: JsonField<Long>,
            private val unknownRequests: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cache_hits")
                @ExcludeMissing
                cacheHits: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("failed_requests")
                @ExcludeMissing
                failedRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("input_tokens")
                @ExcludeMissing
                inputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("output_tokens")
                @ExcludeMissing
                outputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("partial_requests")
                @ExcludeMissing
                partialRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("requests")
                @ExcludeMissing
                requests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reserved_spend")
                @ExcludeMissing
                reservedSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("succeeded_requests")
                @ExcludeMissing
                succeededRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("unknown_requests")
                @ExcludeMissing
                unknownRequests: JsonField<Long> = JsonMissing.of(),
            ) : this(
                cacheHits,
                failedRequests,
                inputTokens,
                model,
                outputTokens,
                partialRequests,
                requests,
                reservedSpend,
                spend,
                succeededRequests,
                unknownRequests,
                mutableMapOf(),
            )

            /**
             * Requests served from the gateway cache.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cacheHits(): Long = cacheHits.getRequired("cache_hits")

            /**
             * Requests classified as failed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun failedRequests(): Long = failedRequests.getRequired("failed_requests")

            /**
             * Independently known input tokens across attempts, including corrected usage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

            /**
             * Model identifier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun model(): String = model.getRequired("model")

            /**
             * Independently known output tokens across attempts, including corrected usage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

            /**
             * Requests classified as partial after streaming began.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun partialRequests(): Long = partialRequests.getRequired("partial_requests")

            /**
             * Number of matching requests.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requests(): Long = requests.getRequired("requests")

            /**
             * Unresolved budget reservations in USD.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reservedSpend(): Double = reservedSpend.getRequired("reserved_spend")

            /**
             * Sum of known reference/enforcement cost in USD.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun spend(): Double = spend.getRequired("spend")

            /**
             * Requests classified as succeeded.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun succeededRequests(): Long = succeededRequests.getRequired("succeeded_requests")

            /**
             * Requests whose cost remains unresolved; unknown cost is excluded from spend.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unknownRequests(): Long = unknownRequests.getRequired("unknown_requests")

            /**
             * Returns the raw JSON value of [cacheHits].
             *
             * Unlike [cacheHits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_hits")
            @ExcludeMissing
            fun _cacheHits(): JsonField<Long> = cacheHits

            /**
             * Returns the raw JSON value of [failedRequests].
             *
             * Unlike [failedRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("failed_requests")
            @ExcludeMissing
            fun _failedRequests(): JsonField<Long> = failedRequests

            /**
             * Returns the raw JSON value of [inputTokens].
             *
             * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("input_tokens")
            @ExcludeMissing
            fun _inputTokens(): JsonField<Long> = inputTokens

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [outputTokens].
             *
             * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("output_tokens")
            @ExcludeMissing
            fun _outputTokens(): JsonField<Long> = outputTokens

            /**
             * Returns the raw JSON value of [partialRequests].
             *
             * Unlike [partialRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("partial_requests")
            @ExcludeMissing
            fun _partialRequests(): JsonField<Long> = partialRequests

            /**
             * Returns the raw JSON value of [requests].
             *
             * Unlike [requests], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requests") @ExcludeMissing fun _requests(): JsonField<Long> = requests

            /**
             * Returns the raw JSON value of [reservedSpend].
             *
             * Unlike [reservedSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reserved_spend")
            @ExcludeMissing
            fun _reservedSpend(): JsonField<Double> = reservedSpend

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [succeededRequests].
             *
             * Unlike [succeededRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("succeeded_requests")
            @ExcludeMissing
            fun _succeededRequests(): JsonField<Long> = succeededRequests

            /**
             * Returns the raw JSON value of [unknownRequests].
             *
             * Unlike [unknownRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("unknown_requests")
            @ExcludeMissing
            fun _unknownRequests(): JsonField<Long> = unknownRequests

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
                 * Returns a mutable builder for constructing an instance of [ByModel].
                 *
                 * The following fields are required:
                 * ```java
                 * .cacheHits()
                 * .failedRequests()
                 * .inputTokens()
                 * .model()
                 * .outputTokens()
                 * .partialRequests()
                 * .requests()
                 * .reservedSpend()
                 * .spend()
                 * .succeededRequests()
                 * .unknownRequests()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByModel]. */
            class Builder internal constructor() {

                private var cacheHits: JsonField<Long>? = null
                private var failedRequests: JsonField<Long>? = null
                private var inputTokens: JsonField<Long>? = null
                private var model: JsonField<String>? = null
                private var outputTokens: JsonField<Long>? = null
                private var partialRequests: JsonField<Long>? = null
                private var requests: JsonField<Long>? = null
                private var reservedSpend: JsonField<Double>? = null
                private var spend: JsonField<Double>? = null
                private var succeededRequests: JsonField<Long>? = null
                private var unknownRequests: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byModel: ByModel) = apply {
                    cacheHits = byModel.cacheHits
                    failedRequests = byModel.failedRequests
                    inputTokens = byModel.inputTokens
                    model = byModel.model
                    outputTokens = byModel.outputTokens
                    partialRequests = byModel.partialRequests
                    requests = byModel.requests
                    reservedSpend = byModel.reservedSpend
                    spend = byModel.spend
                    succeededRequests = byModel.succeededRequests
                    unknownRequests = byModel.unknownRequests
                    additionalProperties = byModel.additionalProperties.toMutableMap()
                }

                /** Requests served from the gateway cache. */
                fun cacheHits(cacheHits: Long) = cacheHits(JsonField.of(cacheHits))

                /**
                 * Sets [Builder.cacheHits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheHits] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cacheHits(cacheHits: JsonField<Long>) = apply { this.cacheHits = cacheHits }

                /** Requests classified as failed. */
                fun failedRequests(failedRequests: Long) =
                    failedRequests(JsonField.of(failedRequests))

                /**
                 * Sets [Builder.failedRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failedRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun failedRequests(failedRequests: JsonField<Long>) = apply {
                    this.failedRequests = failedRequests
                }

                /** Independently known input tokens across attempts, including corrected usage. */
                fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

                /**
                 * Sets [Builder.inputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inputTokens(inputTokens: JsonField<Long>) = apply {
                    this.inputTokens = inputTokens
                }

                /** Model identifier. */
                fun model(model: String) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                /** Independently known output tokens across attempts, including corrected usage. */
                fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

                /**
                 * Sets [Builder.outputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outputTokens(outputTokens: JsonField<Long>) = apply {
                    this.outputTokens = outputTokens
                }

                /** Requests classified as partial after streaming began. */
                fun partialRequests(partialRequests: Long) =
                    partialRequests(JsonField.of(partialRequests))

                /**
                 * Sets [Builder.partialRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partialRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partialRequests(partialRequests: JsonField<Long>) = apply {
                    this.partialRequests = partialRequests
                }

                /** Number of matching requests. */
                fun requests(requests: Long) = requests(JsonField.of(requests))

                /**
                 * Sets [Builder.requests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requests(requests: JsonField<Long>) = apply { this.requests = requests }

                /** Unresolved budget reservations in USD. */
                fun reservedSpend(reservedSpend: Double) =
                    reservedSpend(JsonField.of(reservedSpend))

                /**
                 * Sets [Builder.reservedSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reservedSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reservedSpend(reservedSpend: JsonField<Double>) = apply {
                    this.reservedSpend = reservedSpend
                }

                /** Sum of known reference/enforcement cost in USD. */
                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                /** Requests classified as succeeded. */
                fun succeededRequests(succeededRequests: Long) =
                    succeededRequests(JsonField.of(succeededRequests))

                /**
                 * Sets [Builder.succeededRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.succeededRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun succeededRequests(succeededRequests: JsonField<Long>) = apply {
                    this.succeededRequests = succeededRequests
                }

                /** Requests whose cost remains unresolved; unknown cost is excluded from spend. */
                fun unknownRequests(unknownRequests: Long) =
                    unknownRequests(JsonField.of(unknownRequests))

                /**
                 * Sets [Builder.unknownRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unknownRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unknownRequests(unknownRequests: JsonField<Long>) = apply {
                    this.unknownRequests = unknownRequests
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
                 * Returns an immutable instance of [ByModel].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cacheHits()
                 * .failedRequests()
                 * .inputTokens()
                 * .model()
                 * .outputTokens()
                 * .partialRequests()
                 * .requests()
                 * .reservedSpend()
                 * .spend()
                 * .succeededRequests()
                 * .unknownRequests()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ByModel =
                    ByModel(
                        checkRequired("cacheHits", cacheHits),
                        checkRequired("failedRequests", failedRequests),
                        checkRequired("inputTokens", inputTokens),
                        checkRequired("model", model),
                        checkRequired("outputTokens", outputTokens),
                        checkRequired("partialRequests", partialRequests),
                        checkRequired("requests", requests),
                        checkRequired("reservedSpend", reservedSpend),
                        checkRequired("spend", spend),
                        checkRequired("succeededRequests", succeededRequests),
                        checkRequired("unknownRequests", unknownRequests),
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
            fun validate(): ByModel = apply {
                if (validated) {
                    return@apply
                }

                cacheHits()
                failedRequests()
                inputTokens()
                model()
                outputTokens()
                partialRequests()
                requests()
                reservedSpend()
                spend()
                succeededRequests()
                unknownRequests()
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
                (if (cacheHits.asKnown().isPresent) 1 else 0) +
                    (if (failedRequests.asKnown().isPresent) 1 else 0) +
                    (if (inputTokens.asKnown().isPresent) 1 else 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (if (outputTokens.asKnown().isPresent) 1 else 0) +
                    (if (partialRequests.asKnown().isPresent) 1 else 0) +
                    (if (requests.asKnown().isPresent) 1 else 0) +
                    (if (reservedSpend.asKnown().isPresent) 1 else 0) +
                    (if (spend.asKnown().isPresent) 1 else 0) +
                    (if (succeededRequests.asKnown().isPresent) 1 else 0) +
                    (if (unknownRequests.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByModel &&
                    cacheHits == other.cacheHits &&
                    failedRequests == other.failedRequests &&
                    inputTokens == other.inputTokens &&
                    model == other.model &&
                    outputTokens == other.outputTokens &&
                    partialRequests == other.partialRequests &&
                    requests == other.requests &&
                    reservedSpend == other.reservedSpend &&
                    spend == other.spend &&
                    succeededRequests == other.succeededRequests &&
                    unknownRequests == other.unknownRequests &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cacheHits,
                    failedRequests,
                    inputTokens,
                    model,
                    outputTokens,
                    partialRequests,
                    requests,
                    reservedSpend,
                    spend,
                    succeededRequests,
                    unknownRequests,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByModel{cacheHits=$cacheHits, failedRequests=$failedRequests, inputTokens=$inputTokens, model=$model, outputTokens=$outputTokens, partialRequests=$partialRequests, requests=$requests, reservedSpend=$reservedSpend, spend=$spend, succeededRequests=$succeededRequests, unknownRequests=$unknownRequests, additionalProperties=$additionalProperties}"
        }

        /**
         * Complete guardrail event counts and bounded recent findings for the same group and range.
         */
        class Guardrails
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val blockedEvents: JsonField<Long>,
            private val flaggedEvents: JsonField<Long>,
            private val recentEvents: JsonField<List<RecentEvent>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("blocked_events")
                @ExcludeMissing
                blockedEvents: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("flagged_events")
                @ExcludeMissing
                flaggedEvents: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("recent_events")
                @ExcludeMissing
                recentEvents: JsonField<List<RecentEvent>> = JsonMissing.of(),
            ) : this(blockedEvents, flaggedEvents, recentEvents, mutableMapOf())

            /**
             * Total blocked guardrail events, not distinct requests.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun blockedEvents(): Long = blockedEvents.getRequired("blocked_events")

            /**
             * Total flagged guardrail events, not distinct requests.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun flaggedEvents(): Long = flaggedEvents.getRequired("flagged_events")

            /**
             * Up to 20 newest privacy-safe guardrail events, ordered by creation time descending
             * and event ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun recentEvents(): List<RecentEvent> = recentEvents.getRequired("recent_events")

            /**
             * Returns the raw JSON value of [blockedEvents].
             *
             * Unlike [blockedEvents], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("blocked_events")
            @ExcludeMissing
            fun _blockedEvents(): JsonField<Long> = blockedEvents

            /**
             * Returns the raw JSON value of [flaggedEvents].
             *
             * Unlike [flaggedEvents], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("flagged_events")
            @ExcludeMissing
            fun _flaggedEvents(): JsonField<Long> = flaggedEvents

            /**
             * Returns the raw JSON value of [recentEvents].
             *
             * Unlike [recentEvents], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recent_events")
            @ExcludeMissing
            fun _recentEvents(): JsonField<List<RecentEvent>> = recentEvents

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
                 * Returns a mutable builder for constructing an instance of [Guardrails].
                 *
                 * The following fields are required:
                 * ```java
                 * .blockedEvents()
                 * .flaggedEvents()
                 * .recentEvents()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Guardrails]. */
            class Builder internal constructor() {

                private var blockedEvents: JsonField<Long>? = null
                private var flaggedEvents: JsonField<Long>? = null
                private var recentEvents: JsonField<MutableList<RecentEvent>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(guardrails: Guardrails) = apply {
                    blockedEvents = guardrails.blockedEvents
                    flaggedEvents = guardrails.flaggedEvents
                    recentEvents = guardrails.recentEvents.map { it.toMutableList() }
                    additionalProperties = guardrails.additionalProperties.toMutableMap()
                }

                /** Total blocked guardrail events, not distinct requests. */
                fun blockedEvents(blockedEvents: Long) = blockedEvents(JsonField.of(blockedEvents))

                /**
                 * Sets [Builder.blockedEvents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockedEvents] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockedEvents(blockedEvents: JsonField<Long>) = apply {
                    this.blockedEvents = blockedEvents
                }

                /** Total flagged guardrail events, not distinct requests. */
                fun flaggedEvents(flaggedEvents: Long) = flaggedEvents(JsonField.of(flaggedEvents))

                /**
                 * Sets [Builder.flaggedEvents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.flaggedEvents] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun flaggedEvents(flaggedEvents: JsonField<Long>) = apply {
                    this.flaggedEvents = flaggedEvents
                }

                /**
                 * Up to 20 newest privacy-safe guardrail events, ordered by creation time
                 * descending and event ID.
                 */
                fun recentEvents(recentEvents: List<RecentEvent>) =
                    recentEvents(JsonField.of(recentEvents))

                /**
                 * Sets [Builder.recentEvents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recentEvents] with a well-typed
                 * `List<RecentEvent>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recentEvents(recentEvents: JsonField<List<RecentEvent>>) = apply {
                    this.recentEvents = recentEvents.map { it.toMutableList() }
                }

                /**
                 * Adds a single [RecentEvent] to [recentEvents].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRecentEvent(recentEvent: RecentEvent) = apply {
                    recentEvents =
                        (recentEvents ?: JsonField.of(mutableListOf())).also {
                            checkKnown("recentEvents", it).add(recentEvent)
                        }
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
                 * Returns an immutable instance of [Guardrails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .blockedEvents()
                 * .flaggedEvents()
                 * .recentEvents()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Guardrails =
                    Guardrails(
                        checkRequired("blockedEvents", blockedEvents),
                        checkRequired("flaggedEvents", flaggedEvents),
                        checkRequired("recentEvents", recentEvents).map { it.toImmutable() },
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
            fun validate(): Guardrails = apply {
                if (validated) {
                    return@apply
                }

                blockedEvents()
                flaggedEvents()
                recentEvents().forEach { it.validate() }
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
                (if (blockedEvents.asKnown().isPresent) 1 else 0) +
                    (if (flaggedEvents.asKnown().isPresent) 1 else 0) +
                    (recentEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class RecentEvent
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val endUserId: JsonField<String>,
                private val evaluationInputTokens: JsonField<Long>,
                private val evaluationOutputTokens: JsonField<Long>,
                private val findings: JsonField<List<Finding>>,
                private val model: JsonField<String>,
                private val outcome: JsonField<Outcome>,
                private val recordType: JsonValue,
                private val requestId: JsonField<String>,
                private val stage: JsonField<Stage>,
                private val tokenGroupId: JsonField<String>,
                private val tokenKeyId: JsonField<String>,
                private val tokenUserId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("end_user_id")
                    @ExcludeMissing
                    endUserId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("evaluation_input_tokens")
                    @ExcludeMissing
                    evaluationInputTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("evaluation_output_tokens")
                    @ExcludeMissing
                    evaluationOutputTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("findings")
                    @ExcludeMissing
                    findings: JsonField<List<Finding>> = JsonMissing.of(),
                    @JsonProperty("model")
                    @ExcludeMissing
                    model: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("outcome")
                    @ExcludeMissing
                    outcome: JsonField<Outcome> = JsonMissing.of(),
                    @JsonProperty("record_type")
                    @ExcludeMissing
                    recordType: JsonValue = JsonMissing.of(),
                    @JsonProperty("request_id")
                    @ExcludeMissing
                    requestId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("stage")
                    @ExcludeMissing
                    stage: JsonField<Stage> = JsonMissing.of(),
                    @JsonProperty("token_group_id")
                    @ExcludeMissing
                    tokenGroupId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("token_key_id")
                    @ExcludeMissing
                    tokenKeyId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("token_user_id")
                    @ExcludeMissing
                    tokenUserId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    createdAt,
                    endUserId,
                    evaluationInputTokens,
                    evaluationOutputTokens,
                    findings,
                    model,
                    outcome,
                    recordType,
                    requestId,
                    stage,
                    tokenGroupId,
                    tokenKeyId,
                    tokenUserId,
                    mutableMapOf(),
                )

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun endUserId(): Optional<String> = endUserId.getOptional("end_user_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun evaluationInputTokens(): Optional<Long> =
                    evaluationInputTokens.getOptional("evaluation_input_tokens")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun evaluationOutputTokens(): Optional<Long> =
                    evaluationOutputTokens.getOptional("evaluation_output_tokens")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun findings(): List<Finding> = findings.getRequired("findings")

                /**
                 * Model identifier.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun model(): String = model.getRequired("model")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun outcome(): Outcome = outcome.getRequired("outcome")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("guardrail_event")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("record_type")
                @ExcludeMissing
                fun _recordType(): JsonValue = recordType

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun requestId(): String = requestId.getRequired("request_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun stage(): Stage = stage.getRequired("stage")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun tokenKeyId(): String = tokenKeyId.getRequired("token_key_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [endUserId].
                 *
                 * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("end_user_id")
                @ExcludeMissing
                fun _endUserId(): JsonField<String> = endUserId

                /**
                 * Returns the raw JSON value of [evaluationInputTokens].
                 *
                 * Unlike [evaluationInputTokens], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("evaluation_input_tokens")
                @ExcludeMissing
                fun _evaluationInputTokens(): JsonField<Long> = evaluationInputTokens

                /**
                 * Returns the raw JSON value of [evaluationOutputTokens].
                 *
                 * Unlike [evaluationOutputTokens], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("evaluation_output_tokens")
                @ExcludeMissing
                fun _evaluationOutputTokens(): JsonField<Long> = evaluationOutputTokens

                /**
                 * Returns the raw JSON value of [findings].
                 *
                 * Unlike [findings], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("findings")
                @ExcludeMissing
                fun _findings(): JsonField<List<Finding>> = findings

                /**
                 * Returns the raw JSON value of [model].
                 *
                 * Unlike [model], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

                /**
                 * Returns the raw JSON value of [outcome].
                 *
                 * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("outcome")
                @ExcludeMissing
                fun _outcome(): JsonField<Outcome> = outcome

                /**
                 * Returns the raw JSON value of [requestId].
                 *
                 * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("request_id")
                @ExcludeMissing
                fun _requestId(): JsonField<String> = requestId

                /**
                 * Returns the raw JSON value of [stage].
                 *
                 * Unlike [stage], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stage") @ExcludeMissing fun _stage(): JsonField<Stage> = stage

                /**
                 * Returns the raw JSON value of [tokenGroupId].
                 *
                 * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("token_group_id")
                @ExcludeMissing
                fun _tokenGroupId(): JsonField<String> = tokenGroupId

                /**
                 * Returns the raw JSON value of [tokenKeyId].
                 *
                 * Unlike [tokenKeyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("token_key_id")
                @ExcludeMissing
                fun _tokenKeyId(): JsonField<String> = tokenKeyId

                /**
                 * Returns the raw JSON value of [tokenUserId].
                 *
                 * Unlike [tokenUserId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("token_user_id")
                @ExcludeMissing
                fun _tokenUserId(): JsonField<String> = tokenUserId

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
                     * Returns a mutable builder for constructing an instance of [RecentEvent].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .createdAt()
                     * .endUserId()
                     * .evaluationInputTokens()
                     * .evaluationOutputTokens()
                     * .findings()
                     * .model()
                     * .outcome()
                     * .requestId()
                     * .stage()
                     * .tokenGroupId()
                     * .tokenKeyId()
                     * .tokenUserId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecentEvent]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var createdAt: JsonField<OffsetDateTime>? = null
                    private var endUserId: JsonField<String>? = null
                    private var evaluationInputTokens: JsonField<Long>? = null
                    private var evaluationOutputTokens: JsonField<Long>? = null
                    private var findings: JsonField<MutableList<Finding>>? = null
                    private var model: JsonField<String>? = null
                    private var outcome: JsonField<Outcome>? = null
                    private var recordType: JsonValue = JsonValue.from("guardrail_event")
                    private var requestId: JsonField<String>? = null
                    private var stage: JsonField<Stage>? = null
                    private var tokenGroupId: JsonField<String>? = null
                    private var tokenKeyId: JsonField<String>? = null
                    private var tokenUserId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recentEvent: RecentEvent) = apply {
                        id = recentEvent.id
                        createdAt = recentEvent.createdAt
                        endUserId = recentEvent.endUserId
                        evaluationInputTokens = recentEvent.evaluationInputTokens
                        evaluationOutputTokens = recentEvent.evaluationOutputTokens
                        findings = recentEvent.findings.map { it.toMutableList() }
                        model = recentEvent.model
                        outcome = recentEvent.outcome
                        recordType = recentEvent.recordType
                        requestId = recentEvent.requestId
                        stage = recentEvent.stage
                        tokenGroupId = recentEvent.tokenGroupId
                        tokenKeyId = recentEvent.tokenKeyId
                        tokenUserId = recentEvent.tokenUserId
                        additionalProperties = recentEvent.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    fun endUserId(endUserId: String?) = endUserId(JsonField.ofNullable(endUserId))

                    /** Alias for calling [Builder.endUserId] with `endUserId.orElse(null)`. */
                    fun endUserId(endUserId: Optional<String>) = endUserId(endUserId.getOrNull())

                    /**
                     * Sets [Builder.endUserId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endUserId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endUserId(endUserId: JsonField<String>) = apply {
                        this.endUserId = endUserId
                    }

                    fun evaluationInputTokens(evaluationInputTokens: Long?) =
                        evaluationInputTokens(JsonField.ofNullable(evaluationInputTokens))

                    /**
                     * Alias for [Builder.evaluationInputTokens].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun evaluationInputTokens(evaluationInputTokens: Long) =
                        evaluationInputTokens(evaluationInputTokens as Long?)

                    /**
                     * Alias for calling [Builder.evaluationInputTokens] with
                     * `evaluationInputTokens.orElse(null)`.
                     */
                    fun evaluationInputTokens(evaluationInputTokens: Optional<Long>) =
                        evaluationInputTokens(evaluationInputTokens.getOrNull())

                    /**
                     * Sets [Builder.evaluationInputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.evaluationInputTokens] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun evaluationInputTokens(evaluationInputTokens: JsonField<Long>) = apply {
                        this.evaluationInputTokens = evaluationInputTokens
                    }

                    fun evaluationOutputTokens(evaluationOutputTokens: Long?) =
                        evaluationOutputTokens(JsonField.ofNullable(evaluationOutputTokens))

                    /**
                     * Alias for [Builder.evaluationOutputTokens].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun evaluationOutputTokens(evaluationOutputTokens: Long) =
                        evaluationOutputTokens(evaluationOutputTokens as Long?)

                    /**
                     * Alias for calling [Builder.evaluationOutputTokens] with
                     * `evaluationOutputTokens.orElse(null)`.
                     */
                    fun evaluationOutputTokens(evaluationOutputTokens: Optional<Long>) =
                        evaluationOutputTokens(evaluationOutputTokens.getOrNull())

                    /**
                     * Sets [Builder.evaluationOutputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.evaluationOutputTokens] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun evaluationOutputTokens(evaluationOutputTokens: JsonField<Long>) = apply {
                        this.evaluationOutputTokens = evaluationOutputTokens
                    }

                    fun findings(findings: List<Finding>) = findings(JsonField.of(findings))

                    /**
                     * Sets [Builder.findings] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.findings] with a well-typed `List<Finding>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun findings(findings: JsonField<List<Finding>>) = apply {
                        this.findings = findings.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Finding] to [findings].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFinding(finding: Finding) = apply {
                        findings =
                            (findings ?: JsonField.of(mutableListOf())).also {
                                checkKnown("findings", it).add(finding)
                            }
                    }

                    /** Model identifier. */
                    fun model(model: String) = model(JsonField.of(model))

                    /**
                     * Sets [Builder.model] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.model] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun model(model: JsonField<String>) = apply { this.model = model }

                    fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

                    /**
                     * Sets [Builder.outcome] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outcome] with a well-typed [Outcome] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("guardrail_event")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun recordType(recordType: JsonValue) = apply { this.recordType = recordType }

                    fun requestId(requestId: String) = requestId(JsonField.of(requestId))

                    /**
                     * Sets [Builder.requestId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requestId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun requestId(requestId: JsonField<String>) = apply {
                        this.requestId = requestId
                    }

                    fun stage(stage: Stage) = stage(JsonField.of(stage))

                    /**
                     * Sets [Builder.stage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stage] with a well-typed [Stage] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun stage(stage: JsonField<Stage>) = apply { this.stage = stage }

                    fun tokenGroupId(tokenGroupId: String) =
                        tokenGroupId(JsonField.of(tokenGroupId))

                    /**
                     * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tokenGroupId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
                        this.tokenGroupId = tokenGroupId
                    }

                    fun tokenKeyId(tokenKeyId: String) = tokenKeyId(JsonField.of(tokenKeyId))

                    /**
                     * Sets [Builder.tokenKeyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tokenKeyId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tokenKeyId(tokenKeyId: JsonField<String>) = apply {
                        this.tokenKeyId = tokenKeyId
                    }

                    fun tokenUserId(tokenUserId: String?) =
                        tokenUserId(JsonField.ofNullable(tokenUserId))

                    /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
                    fun tokenUserId(tokenUserId: Optional<String>) =
                        tokenUserId(tokenUserId.getOrNull())

                    /**
                     * Sets [Builder.tokenUserId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tokenUserId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tokenUserId(tokenUserId: JsonField<String>) = apply {
                        this.tokenUserId = tokenUserId
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
                     * Returns an immutable instance of [RecentEvent].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .createdAt()
                     * .endUserId()
                     * .evaluationInputTokens()
                     * .evaluationOutputTokens()
                     * .findings()
                     * .model()
                     * .outcome()
                     * .requestId()
                     * .stage()
                     * .tokenGroupId()
                     * .tokenKeyId()
                     * .tokenUserId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RecentEvent =
                        RecentEvent(
                            checkRequired("id", id),
                            checkRequired("createdAt", createdAt),
                            checkRequired("endUserId", endUserId),
                            checkRequired("evaluationInputTokens", evaluationInputTokens),
                            checkRequired("evaluationOutputTokens", evaluationOutputTokens),
                            checkRequired("findings", findings).map { it.toImmutable() },
                            checkRequired("model", model),
                            checkRequired("outcome", outcome),
                            recordType,
                            checkRequired("requestId", requestId),
                            checkRequired("stage", stage),
                            checkRequired("tokenGroupId", tokenGroupId),
                            checkRequired("tokenKeyId", tokenKeyId),
                            checkRequired("tokenUserId", tokenUserId),
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RecentEvent = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    createdAt()
                    endUserId()
                    evaluationInputTokens()
                    evaluationOutputTokens()
                    findings().forEach { it.validate() }
                    model()
                    outcome().validate()
                    _recordType().let {
                        if (it != JsonValue.from("guardrail_event")) {
                            throw TelnyxInvalidDataException(
                                "'recordType' is invalid, received $it"
                            )
                        }
                    }
                    requestId()
                    stage().validate()
                    tokenGroupId()
                    tokenKeyId()
                    tokenUserId()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (createdAt.asKnown().isPresent) 1 else 0) +
                        (if (endUserId.asKnown().isPresent) 1 else 0) +
                        (if (evaluationInputTokens.asKnown().isPresent) 1 else 0) +
                        (if (evaluationOutputTokens.asKnown().isPresent) 1 else 0) +
                        (findings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (model.asKnown().isPresent) 1 else 0) +
                        (outcome.asKnown().getOrNull()?.validity() ?: 0) +
                        recordType.let { if (it == JsonValue.from("guardrail_event")) 1 else 0 } +
                        (if (requestId.asKnown().isPresent) 1 else 0) +
                        (stage.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
                        (if (tokenKeyId.asKnown().isPresent) 1 else 0) +
                        (if (tokenUserId.asKnown().isPresent) 1 else 0)

                class Finding
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val action: JsonField<Action>,
                    private val code: JsonField<String>,
                    private val count: JsonField<Long>,
                    private val detector: JsonField<Detector>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("action")
                        @ExcludeMissing
                        action: JsonField<Action> = JsonMissing.of(),
                        @JsonProperty("code")
                        @ExcludeMissing
                        code: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("count")
                        @ExcludeMissing
                        count: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("detector")
                        @ExcludeMissing
                        detector: JsonField<Detector> = JsonMissing.of(),
                    ) : this(action, code, count, detector, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun action(): Action = action.getRequired("action")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun code(): String = code.getRequired("code")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun count(): Long = count.getRequired("count")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun detector(): Detector = detector.getRequired("detector")

                    /**
                     * Returns the raw JSON value of [action].
                     *
                     * Unlike [action], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("action")
                    @ExcludeMissing
                    fun _action(): JsonField<Action> = action

                    /**
                     * Returns the raw JSON value of [code].
                     *
                     * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                    /**
                     * Returns the raw JSON value of [count].
                     *
                     * Unlike [count], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

                    /**
                     * Returns the raw JSON value of [detector].
                     *
                     * Unlike [detector], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("detector")
                    @ExcludeMissing
                    fun _detector(): JsonField<Detector> = detector

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
                         * Returns a mutable builder for constructing an instance of [Finding].
                         *
                         * The following fields are required:
                         * ```java
                         * .action()
                         * .code()
                         * .count()
                         * .detector()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Finding]. */
                    class Builder internal constructor() {

                        private var action: JsonField<Action>? = null
                        private var code: JsonField<String>? = null
                        private var count: JsonField<Long>? = null
                        private var detector: JsonField<Detector>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(finding: Finding) = apply {
                            action = finding.action
                            code = finding.code
                            count = finding.count
                            detector = finding.detector
                            additionalProperties = finding.additionalProperties.toMutableMap()
                        }

                        fun action(action: Action) = action(JsonField.of(action))

                        /**
                         * Sets [Builder.action] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.action] with a well-typed [Action] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun action(action: JsonField<Action>) = apply { this.action = action }

                        fun code(code: String) = code(JsonField.of(code))

                        /**
                         * Sets [Builder.code] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.code] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun code(code: JsonField<String>) = apply { this.code = code }

                        fun count(count: Long) = count(JsonField.of(count))

                        /**
                         * Sets [Builder.count] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.count] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun count(count: JsonField<Long>) = apply { this.count = count }

                        fun detector(detector: Detector) = detector(JsonField.of(detector))

                        /**
                         * Sets [Builder.detector] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.detector] with a well-typed [Detector]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun detector(detector: JsonField<Detector>) = apply {
                            this.detector = detector
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Finding].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .action()
                         * .code()
                         * .count()
                         * .detector()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Finding =
                            Finding(
                                checkRequired("action", action),
                                checkRequired("code", code),
                                checkRequired("count", count),
                                checkRequired("detector", detector),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Finding = apply {
                        if (validated) {
                            return@apply
                        }

                        action().validate()
                        code()
                        count()
                        detector().validate()
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
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (code.asKnown().isPresent) 1 else 0) +
                            (if (count.asKnown().isPresent) 1 else 0) +
                            (detector.asKnown().getOrNull()?.validity() ?: 0)

                    class Action
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val FLAG = of("flag")

                            @JvmField val BLOCK = of("block")

                            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                        }

                        /** An enum containing [Action]'s known values. */
                        enum class Known {
                            FLAG,
                            BLOCK,
                        }

                        /**
                         * An enum containing [Action]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Action] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FLAG,
                            BLOCK,
                            /**
                             * An enum member indicating that [Action] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                FLAG -> Value.FLAG
                                BLOCK -> Value.BLOCK
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                FLAG -> Known.FLAG
                                BLOCK -> Known.BLOCK
                                else -> throw TelnyxInvalidDataException("Unknown Action: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                TelnyxInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Action = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Action && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Detector
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val SECRETS = of("secrets")

                            @JvmField val DLP = of("dlp")

                            @JvmField val SAFETY = of("safety")

                            @JvmStatic fun of(value: String) = Detector(JsonField.of(value))
                        }

                        /** An enum containing [Detector]'s known values. */
                        enum class Known {
                            SECRETS,
                            DLP,
                            SAFETY,
                        }

                        /**
                         * An enum containing [Detector]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Detector] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            SECRETS,
                            DLP,
                            SAFETY,
                            /**
                             * An enum member indicating that [Detector] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                SECRETS -> Value.SECRETS
                                DLP -> Value.DLP
                                SAFETY -> Value.SAFETY
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                SECRETS -> Known.SECRETS
                                DLP -> Known.DLP
                                SAFETY -> Known.SAFETY
                                else -> throw TelnyxInvalidDataException("Unknown Detector: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                TelnyxInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Detector = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Detector && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Finding &&
                            action == other.action &&
                            code == other.code &&
                            count == other.count &&
                            detector == other.detector &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(action, code, count, detector, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Finding{action=$action, code=$code, count=$count, detector=$detector, additionalProperties=$additionalProperties}"
                }

                class Outcome
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val EVALUATED = of("evaluated")

                        @JvmField val FLAGGED = of("flagged")

                        @JvmField val BLOCKED = of("blocked")

                        @JvmField val UNEVALUATED = of("unevaluated")

                        @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
                    }

                    /** An enum containing [Outcome]'s known values. */
                    enum class Known {
                        EVALUATED,
                        FLAGGED,
                        BLOCKED,
                        UNEVALUATED,
                    }

                    /**
                     * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Outcome] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        EVALUATED,
                        FLAGGED,
                        BLOCKED,
                        UNEVALUATED,
                        /**
                         * An enum member indicating that [Outcome] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            EVALUATED -> Value.EVALUATED
                            FLAGGED -> Value.FLAGGED
                            BLOCKED -> Value.BLOCKED
                            UNEVALUATED -> Value.UNEVALUATED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            EVALUATED -> Known.EVALUATED
                            FLAGGED -> Known.FLAGGED
                            BLOCKED -> Known.BLOCKED
                            UNEVALUATED -> Known.UNEVALUATED
                            else -> throw TelnyxInvalidDataException("Unknown Outcome: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Outcome = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Outcome && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Stage @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PROMPT = of("prompt")

                        @JvmField val RESPONSE = of("response")

                        @JvmStatic fun of(value: String) = Stage(JsonField.of(value))
                    }

                    /** An enum containing [Stage]'s known values. */
                    enum class Known {
                        PROMPT,
                        RESPONSE,
                    }

                    /**
                     * An enum containing [Stage]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Stage] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PROMPT,
                        RESPONSE,
                        /**
                         * An enum member indicating that [Stage] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PROMPT -> Value.PROMPT
                            RESPONSE -> Value.RESPONSE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PROMPT -> Known.PROMPT
                            RESPONSE -> Known.RESPONSE
                            else -> throw TelnyxInvalidDataException("Unknown Stage: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Stage = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Stage && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecentEvent &&
                        id == other.id &&
                        createdAt == other.createdAt &&
                        endUserId == other.endUserId &&
                        evaluationInputTokens == other.evaluationInputTokens &&
                        evaluationOutputTokens == other.evaluationOutputTokens &&
                        findings == other.findings &&
                        model == other.model &&
                        outcome == other.outcome &&
                        recordType == other.recordType &&
                        requestId == other.requestId &&
                        stage == other.stage &&
                        tokenGroupId == other.tokenGroupId &&
                        tokenKeyId == other.tokenKeyId &&
                        tokenUserId == other.tokenUserId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        createdAt,
                        endUserId,
                        evaluationInputTokens,
                        evaluationOutputTokens,
                        findings,
                        model,
                        outcome,
                        recordType,
                        requestId,
                        stage,
                        tokenGroupId,
                        tokenKeyId,
                        tokenUserId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecentEvent{id=$id, createdAt=$createdAt, endUserId=$endUserId, evaluationInputTokens=$evaluationInputTokens, evaluationOutputTokens=$evaluationOutputTokens, findings=$findings, model=$model, outcome=$outcome, recordType=$recordType, requestId=$requestId, stage=$stage, tokenGroupId=$tokenGroupId, tokenKeyId=$tokenKeyId, tokenUserId=$tokenUserId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Guardrails &&
                    blockedEvents == other.blockedEvents &&
                    flaggedEvents == other.flaggedEvents &&
                    recentEvents == other.recentEvents &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(blockedEvents, flaggedEvents, recentEvents, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Guardrails{blockedEvents=$blockedEvents, flaggedEvents=$flaggedEvents, recentEvents=$recentEvents, additionalProperties=$additionalProperties}"
        }

        /** Metrics for all matching requests. */
        class Totals
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cacheHits: JsonField<Long>,
            private val failedRequests: JsonField<Long>,
            private val inputTokens: JsonField<Long>,
            private val outputTokens: JsonField<Long>,
            private val partialRequests: JsonField<Long>,
            private val requests: JsonField<Long>,
            private val reservedSpend: JsonField<Double>,
            private val spend: JsonField<Double>,
            private val succeededRequests: JsonField<Long>,
            private val unknownRequests: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cache_hits")
                @ExcludeMissing
                cacheHits: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("failed_requests")
                @ExcludeMissing
                failedRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("input_tokens")
                @ExcludeMissing
                inputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("output_tokens")
                @ExcludeMissing
                outputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("partial_requests")
                @ExcludeMissing
                partialRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("requests")
                @ExcludeMissing
                requests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reserved_spend")
                @ExcludeMissing
                reservedSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("succeeded_requests")
                @ExcludeMissing
                succeededRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("unknown_requests")
                @ExcludeMissing
                unknownRequests: JsonField<Long> = JsonMissing.of(),
            ) : this(
                cacheHits,
                failedRequests,
                inputTokens,
                outputTokens,
                partialRequests,
                requests,
                reservedSpend,
                spend,
                succeededRequests,
                unknownRequests,
                mutableMapOf(),
            )

            /**
             * Requests served from the gateway cache.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cacheHits(): Long = cacheHits.getRequired("cache_hits")

            /**
             * Requests classified as failed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun failedRequests(): Long = failedRequests.getRequired("failed_requests")

            /**
             * Independently known input tokens across attempts, including corrected usage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

            /**
             * Independently known output tokens across attempts, including corrected usage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

            /**
             * Requests classified as partial after streaming began.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun partialRequests(): Long = partialRequests.getRequired("partial_requests")

            /**
             * Number of matching requests.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requests(): Long = requests.getRequired("requests")

            /**
             * Unresolved budget reservations in USD.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reservedSpend(): Double = reservedSpend.getRequired("reserved_spend")

            /**
             * Sum of known reference/enforcement cost in USD.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun spend(): Double = spend.getRequired("spend")

            /**
             * Requests classified as succeeded.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun succeededRequests(): Long = succeededRequests.getRequired("succeeded_requests")

            /**
             * Requests whose cost remains unresolved; unknown cost is excluded from spend.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unknownRequests(): Long = unknownRequests.getRequired("unknown_requests")

            /**
             * Returns the raw JSON value of [cacheHits].
             *
             * Unlike [cacheHits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_hits")
            @ExcludeMissing
            fun _cacheHits(): JsonField<Long> = cacheHits

            /**
             * Returns the raw JSON value of [failedRequests].
             *
             * Unlike [failedRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("failed_requests")
            @ExcludeMissing
            fun _failedRequests(): JsonField<Long> = failedRequests

            /**
             * Returns the raw JSON value of [inputTokens].
             *
             * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("input_tokens")
            @ExcludeMissing
            fun _inputTokens(): JsonField<Long> = inputTokens

            /**
             * Returns the raw JSON value of [outputTokens].
             *
             * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("output_tokens")
            @ExcludeMissing
            fun _outputTokens(): JsonField<Long> = outputTokens

            /**
             * Returns the raw JSON value of [partialRequests].
             *
             * Unlike [partialRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("partial_requests")
            @ExcludeMissing
            fun _partialRequests(): JsonField<Long> = partialRequests

            /**
             * Returns the raw JSON value of [requests].
             *
             * Unlike [requests], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requests") @ExcludeMissing fun _requests(): JsonField<Long> = requests

            /**
             * Returns the raw JSON value of [reservedSpend].
             *
             * Unlike [reservedSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reserved_spend")
            @ExcludeMissing
            fun _reservedSpend(): JsonField<Double> = reservedSpend

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [succeededRequests].
             *
             * Unlike [succeededRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("succeeded_requests")
            @ExcludeMissing
            fun _succeededRequests(): JsonField<Long> = succeededRequests

            /**
             * Returns the raw JSON value of [unknownRequests].
             *
             * Unlike [unknownRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("unknown_requests")
            @ExcludeMissing
            fun _unknownRequests(): JsonField<Long> = unknownRequests

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
                 * Returns a mutable builder for constructing an instance of [Totals].
                 *
                 * The following fields are required:
                 * ```java
                 * .cacheHits()
                 * .failedRequests()
                 * .inputTokens()
                 * .outputTokens()
                 * .partialRequests()
                 * .requests()
                 * .reservedSpend()
                 * .spend()
                 * .succeededRequests()
                 * .unknownRequests()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Totals]. */
            class Builder internal constructor() {

                private var cacheHits: JsonField<Long>? = null
                private var failedRequests: JsonField<Long>? = null
                private var inputTokens: JsonField<Long>? = null
                private var outputTokens: JsonField<Long>? = null
                private var partialRequests: JsonField<Long>? = null
                private var requests: JsonField<Long>? = null
                private var reservedSpend: JsonField<Double>? = null
                private var spend: JsonField<Double>? = null
                private var succeededRequests: JsonField<Long>? = null
                private var unknownRequests: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(totals: Totals) = apply {
                    cacheHits = totals.cacheHits
                    failedRequests = totals.failedRequests
                    inputTokens = totals.inputTokens
                    outputTokens = totals.outputTokens
                    partialRequests = totals.partialRequests
                    requests = totals.requests
                    reservedSpend = totals.reservedSpend
                    spend = totals.spend
                    succeededRequests = totals.succeededRequests
                    unknownRequests = totals.unknownRequests
                    additionalProperties = totals.additionalProperties.toMutableMap()
                }

                /** Requests served from the gateway cache. */
                fun cacheHits(cacheHits: Long) = cacheHits(JsonField.of(cacheHits))

                /**
                 * Sets [Builder.cacheHits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheHits] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cacheHits(cacheHits: JsonField<Long>) = apply { this.cacheHits = cacheHits }

                /** Requests classified as failed. */
                fun failedRequests(failedRequests: Long) =
                    failedRequests(JsonField.of(failedRequests))

                /**
                 * Sets [Builder.failedRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failedRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun failedRequests(failedRequests: JsonField<Long>) = apply {
                    this.failedRequests = failedRequests
                }

                /** Independently known input tokens across attempts, including corrected usage. */
                fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

                /**
                 * Sets [Builder.inputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inputTokens(inputTokens: JsonField<Long>) = apply {
                    this.inputTokens = inputTokens
                }

                /** Independently known output tokens across attempts, including corrected usage. */
                fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

                /**
                 * Sets [Builder.outputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outputTokens(outputTokens: JsonField<Long>) = apply {
                    this.outputTokens = outputTokens
                }

                /** Requests classified as partial after streaming began. */
                fun partialRequests(partialRequests: Long) =
                    partialRequests(JsonField.of(partialRequests))

                /**
                 * Sets [Builder.partialRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partialRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partialRequests(partialRequests: JsonField<Long>) = apply {
                    this.partialRequests = partialRequests
                }

                /** Number of matching requests. */
                fun requests(requests: Long) = requests(JsonField.of(requests))

                /**
                 * Sets [Builder.requests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requests(requests: JsonField<Long>) = apply { this.requests = requests }

                /** Unresolved budget reservations in USD. */
                fun reservedSpend(reservedSpend: Double) =
                    reservedSpend(JsonField.of(reservedSpend))

                /**
                 * Sets [Builder.reservedSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reservedSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reservedSpend(reservedSpend: JsonField<Double>) = apply {
                    this.reservedSpend = reservedSpend
                }

                /** Sum of known reference/enforcement cost in USD. */
                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                /** Requests classified as succeeded. */
                fun succeededRequests(succeededRequests: Long) =
                    succeededRequests(JsonField.of(succeededRequests))

                /**
                 * Sets [Builder.succeededRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.succeededRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun succeededRequests(succeededRequests: JsonField<Long>) = apply {
                    this.succeededRequests = succeededRequests
                }

                /** Requests whose cost remains unresolved; unknown cost is excluded from spend. */
                fun unknownRequests(unknownRequests: Long) =
                    unknownRequests(JsonField.of(unknownRequests))

                /**
                 * Sets [Builder.unknownRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unknownRequests] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unknownRequests(unknownRequests: JsonField<Long>) = apply {
                    this.unknownRequests = unknownRequests
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
                 * Returns an immutable instance of [Totals].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cacheHits()
                 * .failedRequests()
                 * .inputTokens()
                 * .outputTokens()
                 * .partialRequests()
                 * .requests()
                 * .reservedSpend()
                 * .spend()
                 * .succeededRequests()
                 * .unknownRequests()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Totals =
                    Totals(
                        checkRequired("cacheHits", cacheHits),
                        checkRequired("failedRequests", failedRequests),
                        checkRequired("inputTokens", inputTokens),
                        checkRequired("outputTokens", outputTokens),
                        checkRequired("partialRequests", partialRequests),
                        checkRequired("requests", requests),
                        checkRequired("reservedSpend", reservedSpend),
                        checkRequired("spend", spend),
                        checkRequired("succeededRequests", succeededRequests),
                        checkRequired("unknownRequests", unknownRequests),
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
            fun validate(): Totals = apply {
                if (validated) {
                    return@apply
                }

                cacheHits()
                failedRequests()
                inputTokens()
                outputTokens()
                partialRequests()
                requests()
                reservedSpend()
                spend()
                succeededRequests()
                unknownRequests()
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
                (if (cacheHits.asKnown().isPresent) 1 else 0) +
                    (if (failedRequests.asKnown().isPresent) 1 else 0) +
                    (if (inputTokens.asKnown().isPresent) 1 else 0) +
                    (if (outputTokens.asKnown().isPresent) 1 else 0) +
                    (if (partialRequests.asKnown().isPresent) 1 else 0) +
                    (if (requests.asKnown().isPresent) 1 else 0) +
                    (if (reservedSpend.asKnown().isPresent) 1 else 0) +
                    (if (spend.asKnown().isPresent) 1 else 0) +
                    (if (succeededRequests.asKnown().isPresent) 1 else 0) +
                    (if (unknownRequests.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Totals &&
                    cacheHits == other.cacheHits &&
                    failedRequests == other.failedRequests &&
                    inputTokens == other.inputTokens &&
                    outputTokens == other.outputTokens &&
                    partialRequests == other.partialRequests &&
                    requests == other.requests &&
                    reservedSpend == other.reservedSpend &&
                    spend == other.spend &&
                    succeededRequests == other.succeededRequests &&
                    unknownRequests == other.unknownRequests &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cacheHits,
                    failedRequests,
                    inputTokens,
                    outputTokens,
                    partialRequests,
                    requests,
                    reservedSpend,
                    spend,
                    succeededRequests,
                    unknownRequests,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Totals{cacheHits=$cacheHits, failedRequests=$failedRequests, inputTokens=$inputTokens, outputTokens=$outputTokens, partialRequests=$partialRequests, requests=$requests, reservedSpend=$reservedSpend, spend=$spend, succeededRequests=$succeededRequests, unknownRequests=$unknownRequests, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                byDay == other.byDay &&
                byModel == other.byModel &&
                guardrails == other.guardrails &&
                totals == other.totals &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(byDay, byModel, guardrails, totals, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{byDay=$byDay, byModel=$byModel, guardrails=$guardrails, totals=$totals, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endDate: JsonField<LocalDate>,
        private val startDate: JsonField<LocalDate>,
        private val tokenGroupId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("token_group_id")
            @ExcludeMissing
            tokenGroupId: JsonField<String> = JsonMissing.of(),
        ) : this(endDate, startDate, tokenGroupId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        /**
         * Returns the raw JSON value of [tokenGroupId].
         *
         * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_group_id")
        @ExcludeMissing
        fun _tokenGroupId(): JsonField<String> = tokenGroupId

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
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * .startDate()
             * .tokenGroupId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var endDate: JsonField<LocalDate>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var tokenGroupId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                endDate = meta.endDate
                startDate = meta.startDate
                tokenGroupId = meta.tokenGroupId
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            fun tokenGroupId(tokenGroupId: String) = tokenGroupId(JsonField.of(tokenGroupId))

            /**
             * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
                this.tokenGroupId = tokenGroupId
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * .startDate()
             * .tokenGroupId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    checkRequired("tokenGroupId", tokenGroupId),
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
        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            endDate()
            startDate()
            tokenGroupId()
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
            (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (tokenGroupId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                endDate == other.endDate &&
                startDate == other.startDate &&
                tokenGroupId == other.tokenGroupId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endDate, startDate, tokenGroupId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{endDate=$endDate, startDate=$startDate, tokenGroupId=$tokenGroupId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveSummaryResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageRetrieveSummaryResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
