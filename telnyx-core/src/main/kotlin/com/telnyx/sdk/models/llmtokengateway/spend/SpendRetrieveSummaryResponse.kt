// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.spend

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SpendRetrieveSummaryResponse
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
         * Returns a mutable builder for constructing an instance of [SpendRetrieveSummaryResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendRetrieveSummaryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendRetrieveSummaryResponse: SpendRetrieveSummaryResponse) = apply {
            data = spendRetrieveSummaryResponse.data.map { it.toMutableList() }
            meta = spendRetrieveSummaryResponse.meta
            additionalProperties = spendRetrieveSummaryResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SpendRetrieveSummaryResponse].
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
        fun build(): SpendRetrieveSummaryResponse =
            SpendRetrieveSummaryResponse(
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
    fun validate(): SpendRetrieveSummaryResponse = apply {
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
        private val dimensionId: JsonField<String>,
        private val inputTokens: JsonField<Long>,
        private val name: JsonField<String>,
        private val outputTokens: JsonField<Long>,
        private val requests: JsonField<Long>,
        private val reservedSpend: JsonField<Double>,
        private val spend: JsonField<Double>,
        private val unknownRequests: JsonField<Long>,
        private val endUserId: JsonField<String>,
        private val metadataKey: JsonField<String>,
        private val tokenGroupId: JsonField<String>,
        private val tokenKeyId: JsonField<String>,
        private val tokenUserId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dimension_id")
            @ExcludeMissing
            dimensionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_tokens")
            @ExcludeMissing
            inputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_tokens")
            @ExcludeMissing
            outputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("requests") @ExcludeMissing requests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reserved_spend")
            @ExcludeMissing
            reservedSpend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unknown_requests")
            @ExcludeMissing
            unknownRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("end_user_id")
            @ExcludeMissing
            endUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata_key")
            @ExcludeMissing
            metadataKey: JsonField<String> = JsonMissing.of(),
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
            dimensionId,
            inputTokens,
            name,
            outputTokens,
            requests,
            reservedSpend,
            spend,
            unknownRequests,
            endUserId,
            metadataKey,
            tokenGroupId,
            tokenKeyId,
            tokenUserId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dimensionId(): Optional<String> = dimensionId.getOptional("dimension_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requests(): Long = requests.getRequired("requests")

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reservedSpend(): Double = reservedSpend.getRequired("reserved_spend")

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun spend(): Double = spend.getRequired("spend")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unknownRequests(): Long = unknownRequests.getRequired("unknown_requests")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endUserId(): Optional<String> = endUserId.getOptional("end_user_id")

        /**
         * Present only for group_by=metadata:<key>: the tag key. dimension_id is then the tag value
         * in text form (booleans as true/false, integers in decimal), or null for requests without
         * the key; name is null.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadataKey(): Optional<String> = metadataKey.getOptional("metadata_key")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenGroupId(): Optional<String> = tokenGroupId.getOptional("token_group_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenKeyId(): Optional<String> = tokenKeyId.getOptional("token_key_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

        /**
         * Returns the raw JSON value of [dimensionId].
         *
         * Unlike [dimensionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimension_id")
        @ExcludeMissing
        fun _dimensionId(): JsonField<String> = dimensionId

        /**
         * Returns the raw JSON value of [inputTokens].
         *
         * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_tokens")
        @ExcludeMissing
        fun _inputTokens(): JsonField<Long> = inputTokens

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [requests].
         *
         * Unlike [requests], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns the raw JSON value of [unknownRequests].
         *
         * Unlike [unknownRequests], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unknown_requests")
        @ExcludeMissing
        fun _unknownRequests(): JsonField<Long> = unknownRequests

        /**
         * Returns the raw JSON value of [endUserId].
         *
         * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_user_id") @ExcludeMissing fun _endUserId(): JsonField<String> = endUserId

        /**
         * Returns the raw JSON value of [metadataKey].
         *
         * Unlike [metadataKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata_key")
        @ExcludeMissing
        fun _metadataKey(): JsonField<String> = metadataKey

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
             * .dimensionId()
             * .inputTokens()
             * .name()
             * .outputTokens()
             * .requests()
             * .reservedSpend()
             * .spend()
             * .unknownRequests()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var dimensionId: JsonField<String>? = null
            private var inputTokens: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var outputTokens: JsonField<Long>? = null
            private var requests: JsonField<Long>? = null
            private var reservedSpend: JsonField<Double>? = null
            private var spend: JsonField<Double>? = null
            private var unknownRequests: JsonField<Long>? = null
            private var endUserId: JsonField<String> = JsonMissing.of()
            private var metadataKey: JsonField<String> = JsonMissing.of()
            private var tokenGroupId: JsonField<String> = JsonMissing.of()
            private var tokenKeyId: JsonField<String> = JsonMissing.of()
            private var tokenUserId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                dimensionId = data.dimensionId
                inputTokens = data.inputTokens
                name = data.name
                outputTokens = data.outputTokens
                requests = data.requests
                reservedSpend = data.reservedSpend
                spend = data.spend
                unknownRequests = data.unknownRequests
                endUserId = data.endUserId
                metadataKey = data.metadataKey
                tokenGroupId = data.tokenGroupId
                tokenKeyId = data.tokenKeyId
                tokenUserId = data.tokenUserId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun dimensionId(dimensionId: String?) = dimensionId(JsonField.ofNullable(dimensionId))

            /** Alias for calling [Builder.dimensionId] with `dimensionId.orElse(null)`. */
            fun dimensionId(dimensionId: Optional<String>) = dimensionId(dimensionId.getOrNull())

            /**
             * Sets [Builder.dimensionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensionId(dimensionId: JsonField<String>) = apply {
                this.dimensionId = dimensionId
            }

            fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

            /**
             * Sets [Builder.inputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

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

            fun requests(requests: Long) = requests(JsonField.of(requests))

            /**
             * Sets [Builder.requests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requests] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requests(requests: JsonField<Long>) = apply { this.requests = requests }

            /**
             * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never
             * binary float accounting.
             */
            fun reservedSpend(reservedSpend: Double) = reservedSpend(JsonField.of(reservedSpend))

            /**
             * Sets [Builder.reservedSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reservedSpend] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reservedSpend(reservedSpend: JsonField<Double>) = apply {
                this.reservedSpend = reservedSpend
            }

            /**
             * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never
             * binary float accounting.
             */
            fun spend(spend: Double) = spend(JsonField.of(spend))

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            fun unknownRequests(unknownRequests: Long) =
                unknownRequests(JsonField.of(unknownRequests))

            /**
             * Sets [Builder.unknownRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unknownRequests] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unknownRequests(unknownRequests: JsonField<Long>) = apply {
                this.unknownRequests = unknownRequests
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

            /**
             * Present only for group_by=metadata:<key>: the tag key. dimension_id is then the tag
             * value in text form (booleans as true/false, integers in decimal), or null for
             * requests without the key; name is null.
             */
            fun metadataKey(metadataKey: String) = metadataKey(JsonField.of(metadataKey))

            /**
             * Sets [Builder.metadataKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadataKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadataKey(metadataKey: JsonField<String>) = apply {
                this.metadataKey = metadataKey
            }

            fun tokenGroupId(tokenGroupId: String?) =
                tokenGroupId(JsonField.ofNullable(tokenGroupId))

            /** Alias for calling [Builder.tokenGroupId] with `tokenGroupId.orElse(null)`. */
            fun tokenGroupId(tokenGroupId: Optional<String>) =
                tokenGroupId(tokenGroupId.getOrNull())

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

            fun tokenKeyId(tokenKeyId: String?) = tokenKeyId(JsonField.ofNullable(tokenKeyId))

            /** Alias for calling [Builder.tokenKeyId] with `tokenKeyId.orElse(null)`. */
            fun tokenKeyId(tokenKeyId: Optional<String>) = tokenKeyId(tokenKeyId.getOrNull())

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
             * .dimensionId()
             * .inputTokens()
             * .name()
             * .outputTokens()
             * .requests()
             * .reservedSpend()
             * .spend()
             * .unknownRequests()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("dimensionId", dimensionId),
                    checkRequired("inputTokens", inputTokens),
                    checkRequired("name", name),
                    checkRequired("outputTokens", outputTokens),
                    checkRequired("requests", requests),
                    checkRequired("reservedSpend", reservedSpend),
                    checkRequired("spend", spend),
                    checkRequired("unknownRequests", unknownRequests),
                    endUserId,
                    metadataKey,
                    tokenGroupId,
                    tokenKeyId,
                    tokenUserId,
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

            dimensionId()
            inputTokens()
            name()
            outputTokens()
            requests()
            reservedSpend()
            spend()
            unknownRequests()
            endUserId()
            metadataKey()
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
            (if (dimensionId.asKnown().isPresent) 1 else 0) +
                (if (inputTokens.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (outputTokens.asKnown().isPresent) 1 else 0) +
                (if (requests.asKnown().isPresent) 1 else 0) +
                (if (reservedSpend.asKnown().isPresent) 1 else 0) +
                (if (spend.asKnown().isPresent) 1 else 0) +
                (if (unknownRequests.asKnown().isPresent) 1 else 0) +
                (if (endUserId.asKnown().isPresent) 1 else 0) +
                (if (metadataKey.asKnown().isPresent) 1 else 0) +
                (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
                (if (tokenKeyId.asKnown().isPresent) 1 else 0) +
                (if (tokenUserId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                dimensionId == other.dimensionId &&
                inputTokens == other.inputTokens &&
                name == other.name &&
                outputTokens == other.outputTokens &&
                requests == other.requests &&
                reservedSpend == other.reservedSpend &&
                spend == other.spend &&
                unknownRequests == other.unknownRequests &&
                endUserId == other.endUserId &&
                metadataKey == other.metadataKey &&
                tokenGroupId == other.tokenGroupId &&
                tokenKeyId == other.tokenKeyId &&
                tokenUserId == other.tokenUserId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dimensionId,
                inputTokens,
                name,
                outputTokens,
                requests,
                reservedSpend,
                spend,
                unknownRequests,
                endUserId,
                metadataKey,
                tokenGroupId,
                tokenKeyId,
                tokenUserId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{dimensionId=$dimensionId, inputTokens=$inputTokens, name=$name, outputTokens=$outputTokens, requests=$requests, reservedSpend=$reservedSpend, spend=$spend, unknownRequests=$unknownRequests, endUserId=$endUserId, metadataKey=$metadataKey, tokenGroupId=$tokenGroupId, tokenKeyId=$tokenKeyId, tokenUserId=$tokenUserId, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endDate: JsonField<LocalDate>,
        private val groupBy: JsonField<SpendGroupBy>,
        private val hasMore: JsonField<Boolean>,
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val snapshot: JsonField<String>,
        private val startDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("group_by")
            @ExcludeMissing
            groupBy: JsonField<SpendGroupBy> = JsonMissing.of(),
            @JsonProperty("has_more")
            @ExcludeMissing
            hasMore: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("snapshot")
            @ExcludeMissing
            snapshot: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            endDate,
            groupBy,
            hasMore,
            pageNumber,
            pageSize,
            snapshot,
            startDate,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        /**
         * Group by one request tag key. Keys starting with ltg_, telnyx_, litellm_ or cf_ (any
         * case) are rejected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun groupBy(): SpendGroupBy = groupBy.getRequired("group_by")

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<SpendGroupBy> = groupBy

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

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

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
             * .groupBy()
             * .hasMore()
             * .pageNumber()
             * .pageSize()
             * .snapshot()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var endDate: JsonField<LocalDate>? = null
            private var groupBy: JsonField<SpendGroupBy>? = null
            private var hasMore: JsonField<Boolean>? = null
            private var pageNumber: JsonField<Long>? = null
            private var pageSize: JsonField<Long>? = null
            private var snapshot: JsonField<String>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                endDate = meta.endDate
                groupBy = meta.groupBy
                hasMore = meta.hasMore
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                snapshot = meta.snapshot
                startDate = meta.startDate
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

            /**
             * Group by one request tag key. Keys starting with ltg_, telnyx_, litellm_ or cf_ (any
             * case) are rejected.
             */
            fun groupBy(groupBy: SpendGroupBy) = groupBy(JsonField.of(groupBy))

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed [SpendGroupBy] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(groupBy: JsonField<SpendGroupBy>) = apply { this.groupBy = groupBy }

            /**
             * Sets [groupBy] to an arbitrary [String].
             *
             * You should usually call [groupBy] with a well-typed [SpendGroupBy] constant instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(value: String) = groupBy(SpendGroupBy.of(value))

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

            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

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
             * .groupBy()
             * .hasMore()
             * .pageNumber()
             * .pageSize()
             * .snapshot()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("endDate", endDate),
                    checkRequired("groupBy", groupBy),
                    checkRequired("hasMore", hasMore),
                    checkRequired("pageNumber", pageNumber),
                    checkRequired("pageSize", pageSize),
                    checkRequired("snapshot", snapshot),
                    checkRequired("startDate", startDate),
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
            groupBy()
            hasMore()
            pageNumber()
            pageSize()
            snapshot()
            startDate()
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
                (if (groupBy.asKnown().isPresent) 1 else 0) +
                (if (hasMore.asKnown().isPresent) 1 else 0) +
                (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (snapshot.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                endDate == other.endDate &&
                groupBy == other.groupBy &&
                hasMore == other.hasMore &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                snapshot == other.snapshot &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endDate,
                groupBy,
                hasMore,
                pageNumber,
                pageSize,
                snapshot,
                startDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{endDate=$endDate, groupBy=$groupBy, hasMore=$hasMore, pageNumber=$pageNumber, pageSize=$pageSize, snapshot=$snapshot, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendRetrieveSummaryResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendRetrieveSummaryResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
