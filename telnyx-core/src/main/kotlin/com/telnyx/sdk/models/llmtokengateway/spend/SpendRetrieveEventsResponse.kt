// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.spend

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SpendRetrieveEventsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
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
    fun meta(): Meta = meta.getRequired("meta")

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
         * Returns a mutable builder for constructing an instance of [SpendRetrieveEventsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendRetrieveEventsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendRetrieveEventsResponse: SpendRetrieveEventsResponse) = apply {
            data = spendRetrieveEventsResponse.data.map { it.toMutableList() }
            meta = spendRetrieveEventsResponse.meta
            additionalProperties = spendRetrieveEventsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SpendRetrieveEventsResponse].
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
        fun build(): SpendRetrieveEventsResponse =
            SpendRetrieveEventsResponse(
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
    fun validate(): SpendRetrieveEventsResponse = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val attempts: JsonField<Long>,
        private val biller: JsonField<Biller>,
        private val cacheHit: JsonField<Boolean>,
        private val configurationVersion: JsonField<Long>,
        private val cost: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val endUserId: JsonField<String>,
        private val inputTokens: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val model: JsonField<String>,
        private val outputTokens: JsonField<Long>,
        private val providerKeyId: JsonField<String>,
        private val rateVersion: JsonField<String>,
        private val requestId: JsonField<String>,
        private val requestedModel: JsonField<String>,
        private val reservationMicroUsd: JsonField<Long>,
        private val status: JsonField<Status>,
        private val tokenGroupId: JsonField<String>,
        private val tokenKeyId: JsonField<String>,
        private val tokenUserId: JsonField<String>,
        private val usageStatus: JsonField<UsageStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attempts") @ExcludeMissing attempts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("biller") @ExcludeMissing biller: JsonField<Biller> = JsonMissing.of(),
            @JsonProperty("cache_hit")
            @ExcludeMissing
            cacheHit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("configuration_version")
            @ExcludeMissing
            configurationVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("end_user_id")
            @ExcludeMissing
            endUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_tokens")
            @ExcludeMissing
            inputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_tokens")
            @ExcludeMissing
            outputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provider_key_id")
            @ExcludeMissing
            providerKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_version")
            @ExcludeMissing
            rateVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requested_model")
            @ExcludeMissing
            requestedModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reservation_micro_usd")
            @ExcludeMissing
            reservationMicroUsd: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("token_group_id")
            @ExcludeMissing
            tokenGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_key_id")
            @ExcludeMissing
            tokenKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_user_id")
            @ExcludeMissing
            tokenUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage_status")
            @ExcludeMissing
            usageStatus: JsonField<UsageStatus> = JsonMissing.of(),
        ) : this(
            id,
            attempts,
            biller,
            cacheHit,
            configurationVersion,
            cost,
            createdAt,
            endUserId,
            inputTokens,
            metadata,
            model,
            outputTokens,
            providerKeyId,
            rateVersion,
            requestId,
            requestedModel,
            reservationMicroUsd,
            status,
            tokenGroupId,
            tokenKeyId,
            tokenUserId,
            usageStatus,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Provider attempts begun for the request (fallbacks included); 0 for a cache hit. Token
         * and cost totals sum every attempt.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attempts(): Long = attempts.getRequired("attempts")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun biller(): Biller = biller.getRequired("biller")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cacheHit(): Boolean = cacheHit.getRequired("cache_hit")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun configurationVersion(): Long = configurationVersion.getRequired("configuration_version")

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<Double> = cost.getOptional("cost")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endUserId(): Optional<String> = endUserId.getOptional("end_user_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputTokens(): Optional<Long> = inputTokens.getOptional("input_tokens")

        /**
         * Customer request tags from the x-ltg-metadata header: up to 5 entries. Keys are
         * case-sensitive; keys starting with ltg_, telnyx_, litellm_ or cf_ (any case) are
         * reserved. Values are strings (1-256 characters, no control or format characters),
         * integers within +/-9007199254740991, or booleans; floats, null, objects and arrays are
         * rejected. Values that look like credentials are rejected. Tags are attribution only:
         * never forwarded upstream, never part of the response cache key, never used for budgets or
         * routing. An untagged request reports {}.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * Public alias that served (the last attempt); rate_version, biller and provider_key_id
         * follow it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputTokens(): Optional<Long> = outputTokens.getOptional("output_tokens")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerKeyId(): Optional<String> = providerKeyId.getOptional("provider_key_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rateVersion(): String = rateVersion.getRequired("rate_version")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestId(): String = requestId.getRequired("request_id")

        /**
         * Public alias the caller requested; differs from model only when a group fallback served.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestedModel(): String = requestedModel.getRequired("requested_model")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reservationMicroUsd(): Long = reservationMicroUsd.getRequired("reservation_micro_usd")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenKeyId(): String = tokenKeyId.getRequired("token_key_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usageStatus(): UsageStatus = usageStatus.getRequired("usage_status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [attempts].
         *
         * Unlike [attempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attempts") @ExcludeMissing fun _attempts(): JsonField<Long> = attempts

        /**
         * Returns the raw JSON value of [biller].
         *
         * Unlike [biller], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("biller") @ExcludeMissing fun _biller(): JsonField<Biller> = biller

        /**
         * Returns the raw JSON value of [cacheHit].
         *
         * Unlike [cacheHit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cache_hit") @ExcludeMissing fun _cacheHit(): JsonField<Boolean> = cacheHit

        /**
         * Returns the raw JSON value of [configurationVersion].
         *
         * Unlike [configurationVersion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("configuration_version")
        @ExcludeMissing
        fun _configurationVersion(): JsonField<Long> = configurationVersion

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [endUserId].
         *
         * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_user_id") @ExcludeMissing fun _endUserId(): JsonField<String> = endUserId

        /**
         * Returns the raw JSON value of [inputTokens].
         *
         * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_tokens")
        @ExcludeMissing
        fun _inputTokens(): JsonField<Long> = inputTokens

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns the raw JSON value of [providerKeyId].
         *
         * Unlike [providerKeyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provider_key_id")
        @ExcludeMissing
        fun _providerKeyId(): JsonField<String> = providerKeyId

        /**
         * Returns the raw JSON value of [rateVersion].
         *
         * Unlike [rateVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_version")
        @ExcludeMissing
        fun _rateVersion(): JsonField<String> = rateVersion

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

        /**
         * Returns the raw JSON value of [requestedModel].
         *
         * Unlike [requestedModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requested_model")
        @ExcludeMissing
        fun _requestedModel(): JsonField<String> = requestedModel

        /**
         * Returns the raw JSON value of [reservationMicroUsd].
         *
         * Unlike [reservationMicroUsd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reservation_micro_usd")
        @ExcludeMissing
        fun _reservationMicroUsd(): JsonField<Long> = reservationMicroUsd

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [tokenGroupId].
         *
         * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_group_id")
        @ExcludeMissing
        fun _tokenGroupId(): JsonField<String> = tokenGroupId

        /**
         * Returns the raw JSON value of [tokenKeyId].
         *
         * Unlike [tokenKeyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token_key_id")
        @ExcludeMissing
        fun _tokenKeyId(): JsonField<String> = tokenKeyId

        /**
         * Returns the raw JSON value of [tokenUserId].
         *
         * Unlike [tokenUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token_user_id")
        @ExcludeMissing
        fun _tokenUserId(): JsonField<String> = tokenUserId

        /**
         * Returns the raw JSON value of [usageStatus].
         *
         * Unlike [usageStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage_status")
        @ExcludeMissing
        fun _usageStatus(): JsonField<UsageStatus> = usageStatus

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
             * .id()
             * .attempts()
             * .biller()
             * .cacheHit()
             * .configurationVersion()
             * .cost()
             * .createdAt()
             * .endUserId()
             * .inputTokens()
             * .metadata()
             * .model()
             * .outputTokens()
             * .providerKeyId()
             * .rateVersion()
             * .requestId()
             * .requestedModel()
             * .reservationMicroUsd()
             * .status()
             * .tokenGroupId()
             * .tokenKeyId()
             * .tokenUserId()
             * .usageStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var attempts: JsonField<Long>? = null
            private var biller: JsonField<Biller>? = null
            private var cacheHit: JsonField<Boolean>? = null
            private var configurationVersion: JsonField<Long>? = null
            private var cost: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var endUserId: JsonField<String>? = null
            private var inputTokens: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var model: JsonField<String>? = null
            private var outputTokens: JsonField<Long>? = null
            private var providerKeyId: JsonField<String>? = null
            private var rateVersion: JsonField<String>? = null
            private var requestId: JsonField<String>? = null
            private var requestedModel: JsonField<String>? = null
            private var reservationMicroUsd: JsonField<Long>? = null
            private var status: JsonField<Status>? = null
            private var tokenGroupId: JsonField<String>? = null
            private var tokenKeyId: JsonField<String>? = null
            private var tokenUserId: JsonField<String>? = null
            private var usageStatus: JsonField<UsageStatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                attempts = data.attempts
                biller = data.biller
                cacheHit = data.cacheHit
                configurationVersion = data.configurationVersion
                cost = data.cost
                createdAt = data.createdAt
                endUserId = data.endUserId
                inputTokens = data.inputTokens
                metadata = data.metadata
                model = data.model
                outputTokens = data.outputTokens
                providerKeyId = data.providerKeyId
                rateVersion = data.rateVersion
                requestId = data.requestId
                requestedModel = data.requestedModel
                reservationMicroUsd = data.reservationMicroUsd
                status = data.status
                tokenGroupId = data.tokenGroupId
                tokenKeyId = data.tokenKeyId
                tokenUserId = data.tokenUserId
                usageStatus = data.usageStatus
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Provider attempts begun for the request (fallbacks included); 0 for a cache hit.
             * Token and cost totals sum every attempt.
             */
            fun attempts(attempts: Long) = attempts(JsonField.of(attempts))

            /**
             * Sets [Builder.attempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attempts] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attempts(attempts: JsonField<Long>) = apply { this.attempts = attempts }

            fun biller(biller: Biller) = biller(JsonField.of(biller))

            /**
             * Sets [Builder.biller] to an arbitrary JSON value.
             *
             * You should usually call [Builder.biller] with a well-typed [Biller] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun biller(biller: JsonField<Biller>) = apply { this.biller = biller }

            fun cacheHit(cacheHit: Boolean) = cacheHit(JsonField.of(cacheHit))

            /**
             * Sets [Builder.cacheHit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheHit] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheHit(cacheHit: JsonField<Boolean>) = apply { this.cacheHit = cacheHit }

            fun configurationVersion(configurationVersion: Long) =
                configurationVersion(JsonField.of(configurationVersion))

            /**
             * Sets [Builder.configurationVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configurationVersion] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configurationVersion(configurationVersion: JsonField<Long>) = apply {
                this.configurationVersion = configurationVersion
            }

            /**
             * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never
             * binary float accounting.
             */
            fun cost(cost: Double?) = cost(JsonField.ofNullable(cost))

            /**
             * Alias for [Builder.cost].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cost(cost: Double) = cost(cost as Double?)

            /** Alias for calling [Builder.cost] with `cost.orElse(null)`. */
            fun cost(cost: Optional<Double>) = cost(cost.getOrNull())

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.endUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endUserId(endUserId: JsonField<String>) = apply { this.endUserId = endUserId }

            fun inputTokens(inputTokens: Long?) = inputTokens(JsonField.ofNullable(inputTokens))

            /**
             * Alias for [Builder.inputTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputTokens(inputTokens: Long) = inputTokens(inputTokens as Long?)

            /** Alias for calling [Builder.inputTokens] with `inputTokens.orElse(null)`. */
            fun inputTokens(inputTokens: Optional<Long>) = inputTokens(inputTokens.getOrNull())

            /**
             * Sets [Builder.inputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

            /**
             * Customer request tags from the x-ltg-metadata header: up to 5 entries. Keys are
             * case-sensitive; keys starting with ltg_, telnyx_, litellm_ or cf_ (any case) are
             * reserved. Values are strings (1-256 characters, no control or format characters),
             * integers within +/-9007199254740991, or booleans; floats, null, objects and arrays
             * are rejected. Values that look like credentials are rejected. Tags are attribution
             * only: never forwarded upstream, never part of the response cache key, never used for
             * budgets or routing. An untagged request reports {}.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Public alias that served (the last attempt); rate_version, biller and provider_key_id
             * follow it.
             */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun outputTokens(outputTokens: Long?) = outputTokens(JsonField.ofNullable(outputTokens))

            /**
             * Alias for [Builder.outputTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputTokens(outputTokens: Long) = outputTokens(outputTokens as Long?)

            /** Alias for calling [Builder.outputTokens] with `outputTokens.orElse(null)`. */
            fun outputTokens(outputTokens: Optional<Long>) = outputTokens(outputTokens.getOrNull())

            /**
             * Sets [Builder.outputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputTokens(outputTokens: JsonField<Long>) = apply {
                this.outputTokens = outputTokens
            }

            fun providerKeyId(providerKeyId: String?) =
                providerKeyId(JsonField.ofNullable(providerKeyId))

            /** Alias for calling [Builder.providerKeyId] with `providerKeyId.orElse(null)`. */
            fun providerKeyId(providerKeyId: Optional<String>) =
                providerKeyId(providerKeyId.getOrNull())

            /**
             * Sets [Builder.providerKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerKeyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerKeyId(providerKeyId: JsonField<String>) = apply {
                this.providerKeyId = providerKeyId
            }

            fun rateVersion(rateVersion: String) = rateVersion(JsonField.of(rateVersion))

            /**
             * Sets [Builder.rateVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateVersion(rateVersion: JsonField<String>) = apply {
                this.rateVersion = rateVersion
            }

            fun requestId(requestId: String) = requestId(JsonField.of(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            /**
             * Public alias the caller requested; differs from model only when a group fallback
             * served.
             */
            fun requestedModel(requestedModel: String) =
                requestedModel(JsonField.of(requestedModel))

            /**
             * Sets [Builder.requestedModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestedModel(requestedModel: JsonField<String>) = apply {
                this.requestedModel = requestedModel
            }

            fun reservationMicroUsd(reservationMicroUsd: Long) =
                reservationMicroUsd(JsonField.of(reservationMicroUsd))

            /**
             * Sets [Builder.reservationMicroUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reservationMicroUsd] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reservationMicroUsd(reservationMicroUsd: JsonField<Long>) = apply {
                this.reservationMicroUsd = reservationMicroUsd
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun tokenKeyId(tokenKeyId: String) = tokenKeyId(JsonField.of(tokenKeyId))

            /**
             * Sets [Builder.tokenKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenKeyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenKeyId(tokenKeyId: JsonField<String>) = apply { this.tokenKeyId = tokenKeyId }

            fun tokenUserId(tokenUserId: String?) = tokenUserId(JsonField.ofNullable(tokenUserId))

            /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
            fun tokenUserId(tokenUserId: Optional<String>) = tokenUserId(tokenUserId.getOrNull())

            /**
             * Sets [Builder.tokenUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenUserId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenUserId(tokenUserId: JsonField<String>) = apply {
                this.tokenUserId = tokenUserId
            }

            fun usageStatus(usageStatus: UsageStatus) = usageStatus(JsonField.of(usageStatus))

            /**
             * Sets [Builder.usageStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageStatus] with a well-typed [UsageStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usageStatus(usageStatus: JsonField<UsageStatus>) = apply {
                this.usageStatus = usageStatus
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .attempts()
             * .biller()
             * .cacheHit()
             * .configurationVersion()
             * .cost()
             * .createdAt()
             * .endUserId()
             * .inputTokens()
             * .metadata()
             * .model()
             * .outputTokens()
             * .providerKeyId()
             * .rateVersion()
             * .requestId()
             * .requestedModel()
             * .reservationMicroUsd()
             * .status()
             * .tokenGroupId()
             * .tokenKeyId()
             * .tokenUserId()
             * .usageStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("attempts", attempts),
                    checkRequired("biller", biller),
                    checkRequired("cacheHit", cacheHit),
                    checkRequired("configurationVersion", configurationVersion),
                    checkRequired("cost", cost),
                    checkRequired("createdAt", createdAt),
                    checkRequired("endUserId", endUserId),
                    checkRequired("inputTokens", inputTokens),
                    checkRequired("metadata", metadata),
                    checkRequired("model", model),
                    checkRequired("outputTokens", outputTokens),
                    checkRequired("providerKeyId", providerKeyId),
                    checkRequired("rateVersion", rateVersion),
                    checkRequired("requestId", requestId),
                    checkRequired("requestedModel", requestedModel),
                    checkRequired("reservationMicroUsd", reservationMicroUsd),
                    checkRequired("status", status),
                    checkRequired("tokenGroupId", tokenGroupId),
                    checkRequired("tokenKeyId", tokenKeyId),
                    checkRequired("tokenUserId", tokenUserId),
                    checkRequired("usageStatus", usageStatus),
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

            id()
            attempts()
            biller().validate()
            cacheHit()
            configurationVersion()
            cost()
            createdAt()
            endUserId()
            inputTokens()
            metadata().validate()
            model()
            outputTokens()
            providerKeyId()
            rateVersion()
            requestId()
            requestedModel()
            reservationMicroUsd()
            status().validate()
            tokenGroupId()
            tokenKeyId()
            tokenUserId()
            usageStatus().validate()
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
                (if (attempts.asKnown().isPresent) 1 else 0) +
                (biller.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cacheHit.asKnown().isPresent) 1 else 0) +
                (if (configurationVersion.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (endUserId.asKnown().isPresent) 1 else 0) +
                (if (inputTokens.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (outputTokens.asKnown().isPresent) 1 else 0) +
                (if (providerKeyId.asKnown().isPresent) 1 else 0) +
                (if (rateVersion.asKnown().isPresent) 1 else 0) +
                (if (requestId.asKnown().isPresent) 1 else 0) +
                (if (requestedModel.asKnown().isPresent) 1 else 0) +
                (if (reservationMicroUsd.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
                (if (tokenKeyId.asKnown().isPresent) 1 else 0) +
                (if (tokenUserId.asKnown().isPresent) 1 else 0) +
                (usageStatus.asKnown().getOrNull()?.validity() ?: 0)

        class Biller @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val TELNYX = of("telnyx")

                @JvmField val PROVIDER = of("provider")

                @JvmField val NONE = of("none")

                @JvmStatic fun of(value: String) = Biller(JsonField.of(value))
            }

            /** An enum containing [Biller]'s known values. */
            enum class Known {
                TELNYX,
                PROVIDER,
                NONE,
            }

            /**
             * An enum containing [Biller]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Biller] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TELNYX,
                PROVIDER,
                NONE,
                /**
                 * An enum member indicating that [Biller] was instantiated with an unknown value.
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
                    TELNYX -> Value.TELNYX
                    PROVIDER -> Value.PROVIDER
                    NONE -> Value.NONE
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
                    TELNYX -> Known.TELNYX
                    PROVIDER -> Known.PROVIDER
                    NONE -> Known.NONE
                    else -> throw TelnyxInvalidDataException("Unknown Biller: $value")
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
            fun validate(): Biller = apply {
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

                return other is Biller && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Customer request tags from the x-ltg-metadata header: up to 5 entries. Keys are
         * case-sensitive; keys starting with ltg_, telnyx_, litellm_ or cf_ (any case) are
         * reserved. Values are strings (1-256 characters, no control or format characters),
         * integers within +/-9007199254740991, or booleans; floats, null, objects and arrays are
         * rejected. Values that look like credentials are rejected. Tags are attribution only:
         * never forwarded upstream, never part of the response cache key, never used for budgets or
         * routing. An untagged request reports {}.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val SUCCEEDED = of("succeeded")

                @JvmField val FAILED = of("failed")

                @JvmField val PARTIAL = of("partial")

                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SUCCEEDED,
                FAILED,
                PARTIAL,
                UNKNOWN,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUCCEEDED,
                FAILED,
                PARTIAL,
                UNKNOWN,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    SUCCEEDED -> Value.SUCCEEDED
                    FAILED -> Value.FAILED
                    PARTIAL -> Value.PARTIAL
                    UNKNOWN -> Value.UNKNOWN
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
                    SUCCEEDED -> Known.SUCCEEDED
                    FAILED -> Known.FAILED
                    PARTIAL -> Known.PARTIAL
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class UsageStatus @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val KNOWN = of("known")

                @JvmField val UNKNOWN = of("unknown")

                @JvmField val RECONCILED = of("reconciled")

                @JvmStatic fun of(value: String) = UsageStatus(JsonField.of(value))
            }

            /** An enum containing [UsageStatus]'s known values. */
            enum class Known {
                KNOWN,
                UNKNOWN,
                RECONCILED,
            }

            /**
             * An enum containing [UsageStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UsageStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                KNOWN,
                UNKNOWN,
                RECONCILED,
                /**
                 * An enum member indicating that [UsageStatus] was instantiated with an unknown
                 * value.
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
                    KNOWN -> Value.KNOWN
                    UNKNOWN -> Value.UNKNOWN
                    RECONCILED -> Value.RECONCILED
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
                    KNOWN -> Known.KNOWN
                    UNKNOWN -> Known.UNKNOWN
                    RECONCILED -> Known.RECONCILED
                    else -> throw TelnyxInvalidDataException("Unknown UsageStatus: $value")
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
            fun validate(): UsageStatus = apply {
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

                return other is UsageStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                attempts == other.attempts &&
                biller == other.biller &&
                cacheHit == other.cacheHit &&
                configurationVersion == other.configurationVersion &&
                cost == other.cost &&
                createdAt == other.createdAt &&
                endUserId == other.endUserId &&
                inputTokens == other.inputTokens &&
                metadata == other.metadata &&
                model == other.model &&
                outputTokens == other.outputTokens &&
                providerKeyId == other.providerKeyId &&
                rateVersion == other.rateVersion &&
                requestId == other.requestId &&
                requestedModel == other.requestedModel &&
                reservationMicroUsd == other.reservationMicroUsd &&
                status == other.status &&
                tokenGroupId == other.tokenGroupId &&
                tokenKeyId == other.tokenKeyId &&
                tokenUserId == other.tokenUserId &&
                usageStatus == other.usageStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                attempts,
                biller,
                cacheHit,
                configurationVersion,
                cost,
                createdAt,
                endUserId,
                inputTokens,
                metadata,
                model,
                outputTokens,
                providerKeyId,
                rateVersion,
                requestId,
                requestedModel,
                reservationMicroUsd,
                status,
                tokenGroupId,
                tokenKeyId,
                tokenUserId,
                usageStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, attempts=$attempts, biller=$biller, cacheHit=$cacheHit, configurationVersion=$configurationVersion, cost=$cost, createdAt=$createdAt, endUserId=$endUserId, inputTokens=$inputTokens, metadata=$metadata, model=$model, outputTokens=$outputTokens, providerKeyId=$providerKeyId, rateVersion=$rateVersion, requestId=$requestId, requestedModel=$requestedModel, reservationMicroUsd=$reservationMicroUsd, status=$status, tokenGroupId=$tokenGroupId, tokenKeyId=$tokenKeyId, tokenUserId=$tokenUserId, usageStatus=$usageStatus, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val hasMore: JsonField<Boolean>,
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val snapshot: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("has_more")
            @ExcludeMissing
            hasMore: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("snapshot") @ExcludeMissing snapshot: JsonField<String> = JsonMissing.of(),
        ) : this(hasMore, pageNumber, pageSize, snapshot, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pageNumber(): Long = pageNumber.getRequired("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pageSize(): Long = pageSize.getRequired("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun snapshot(): String = snapshot.getRequired("snapshot")

        /**
         * Returns the raw JSON value of [hasMore].
         *
         * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Long> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [snapshot].
         *
         * Unlike [snapshot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snapshot") @ExcludeMissing fun _snapshot(): JsonField<String> = snapshot

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
             * .hasMore()
             * .pageNumber()
             * .pageSize()
             * .snapshot()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var hasMore: JsonField<Boolean>? = null
            private var pageNumber: JsonField<Long>? = null
            private var pageSize: JsonField<Long>? = null
            private var snapshot: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                hasMore = meta.hasMore
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                snapshot = meta.snapshot
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            /**
             * Sets [Builder.hasMore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun snapshot(snapshot: String) = snapshot(JsonField.of(snapshot))

            /**
             * Sets [Builder.snapshot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshot] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapshot(snapshot: JsonField<String>) = apply { this.snapshot = snapshot }

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
             * .hasMore()
             * .pageNumber()
             * .pageSize()
             * .snapshot()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("hasMore", hasMore),
                    checkRequired("pageNumber", pageNumber),
                    checkRequired("pageSize", pageSize),
                    checkRequired("snapshot", snapshot),
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

            hasMore()
            pageNumber()
            pageSize()
            snapshot()
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
            (if (hasMore.asKnown().isPresent) 1 else 0) +
                (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (snapshot.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                hasMore == other.hasMore &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                snapshot == other.snapshot &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(hasMore, pageNumber, pageSize, snapshot, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{hasMore=$hasMore, pageNumber=$pageNumber, pageSize=$pageSize, snapshot=$snapshot, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendRetrieveEventsResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendRetrieveEventsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
