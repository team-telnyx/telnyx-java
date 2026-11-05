// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class KeyCreateResponse
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
     * A key that was just issued: the only response that carries its value.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

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
         * Returns a mutable builder for constructing an instance of [KeyCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KeyCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(keyCreateResponse: KeyCreateResponse) = apply {
            data = keyCreateResponse.data
            additionalProperties = keyCreateResponse.additionalProperties.toMutableMap()
        }

        /** A key that was just issued: the only response that carries its value. */
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
         * Returns an immutable instance of [KeyCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KeyCreateResponse =
            KeyCreateResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): KeyCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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

    /** A key that was just issued: the only response that carries its value. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val blocked: JsonField<Boolean>,
        private val budgetResetsAt: JsonField<OffsetDateTime>,
        private val budgetResetsEvery: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val key: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val models: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val requestsPerMinute: JsonField<Long>,
        private val spend: JsonField<Double>,
        private val teamId: JsonField<String>,
        private val tokensPerMinute: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_resets_at")
            @ExcludeMissing
            budgetResetsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("budget_resets_every")
            @ExcludeMissing
            budgetResetsEvery: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            maxParallelRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("models")
            @ExcludeMissing
            models: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requests_per_minute")
            @ExcludeMissing
            requestsPerMinute: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tokens_per_minute")
            @ExcludeMissing
            tokensPerMinute: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            blocked,
            budgetResetsAt,
            budgetResetsEvery,
            createdAt,
            expiresAt,
            key,
            maxBudget,
            maxParallelRequests,
            models,
            name,
            requestsPerMinute,
            spend,
            teamId,
            tokensPerMinute,
            mutableMapOf(),
        )

        /**
         * Identifies the key. It is a 64-character hash the instance stores in place of the key's
         * value.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Whether the instance refuses the key.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun blocked(): Boolean = blocked.getRequired("blocked")

        /**
         * When the key's spend next resets.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetResetsAt(): Optional<OffsetDateTime> =
            budgetResetsAt.getOptional("budget_resets_at")

        /**
         * How often the key's spend resets, such as `30d`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetResetsEvery(): Optional<String> =
            budgetResetsEvery.getOptional("budget_resets_every")

        /**
         * When the key was issued.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * When the key stops working; `null` when it does not expire.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

        /**
         * The key's value, sent as `Authorization: Bearer <key>` to the instance. Shown only in
         * this response.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * The most the key may spend, in USD, until its budget resets.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

        /**
         * The most requests the key may have in flight at once.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParallelRequests(): Optional<Long> =
            maxParallelRequests.getOptional("max_parallel_requests")

        /**
         * The models the key may use. Empty means every model the instance serves.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun models(): List<String> = models.getRequired("models")

        /**
         * A label for people; `null` when none was given.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The most requests the key may make per minute.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestsPerMinute(): Optional<Long> =
            requestsPerMinute.getOptional("requests_per_minute")

        /**
         * What the key has spent since its budget last reset, in USD.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun spend(): Double = spend.getRequired("spend")

        /**
         * The team the key belongs to, if any.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamId(): Optional<String> = teamId.getOptional("team_id")

        /**
         * The most tokens the key may use per minute.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokensPerMinute(): Optional<Long> = tokensPerMinute.getOptional("tokens_per_minute")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [blocked].
         *
         * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

        /**
         * Returns the raw JSON value of [budgetResetsAt].
         *
         * Unlike [budgetResetsAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_resets_at")
        @ExcludeMissing
        fun _budgetResetsAt(): JsonField<OffsetDateTime> = budgetResetsAt

        /**
         * Returns the raw JSON value of [budgetResetsEvery].
         *
         * Unlike [budgetResetsEvery], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_resets_every")
        @ExcludeMissing
        fun _budgetResetsEvery(): JsonField<String> = budgetResetsEvery

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxParallelRequests].
         *
         * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

        /**
         * Returns the raw JSON value of [models].
         *
         * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<String>> = models

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [requestsPerMinute].
         *
         * Unlike [requestsPerMinute], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requests_per_minute")
        @ExcludeMissing
        fun _requestsPerMinute(): JsonField<Long> = requestsPerMinute

        /**
         * Returns the raw JSON value of [spend].
         *
         * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

        /**
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

        /**
         * Returns the raw JSON value of [tokensPerMinute].
         *
         * Unlike [tokensPerMinute], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tokens_per_minute")
        @ExcludeMissing
        fun _tokensPerMinute(): JsonField<Long> = tokensPerMinute

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
             * .blocked()
             * .budgetResetsAt()
             * .budgetResetsEvery()
             * .createdAt()
             * .expiresAt()
             * .key()
             * .maxBudget()
             * .maxParallelRequests()
             * .models()
             * .name()
             * .requestsPerMinute()
             * .spend()
             * .teamId()
             * .tokensPerMinute()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var blocked: JsonField<Boolean>? = null
            private var budgetResetsAt: JsonField<OffsetDateTime>? = null
            private var budgetResetsEvery: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var key: JsonField<String>? = null
            private var maxBudget: JsonField<Double>? = null
            private var maxParallelRequests: JsonField<Long>? = null
            private var models: JsonField<MutableList<String>>? = null
            private var name: JsonField<String>? = null
            private var requestsPerMinute: JsonField<Long>? = null
            private var spend: JsonField<Double>? = null
            private var teamId: JsonField<String>? = null
            private var tokensPerMinute: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                blocked = data.blocked
                budgetResetsAt = data.budgetResetsAt
                budgetResetsEvery = data.budgetResetsEvery
                createdAt = data.createdAt
                expiresAt = data.expiresAt
                key = data.key
                maxBudget = data.maxBudget
                maxParallelRequests = data.maxParallelRequests
                models = data.models.map { it.toMutableList() }
                name = data.name
                requestsPerMinute = data.requestsPerMinute
                spend = data.spend
                teamId = data.teamId
                tokensPerMinute = data.tokensPerMinute
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Identifies the key. It is a 64-character hash the instance stores in place of the
             * key's value.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Whether the instance refuses the key. */
            fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

            /**
             * Sets [Builder.blocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

            /** When the key's spend next resets. */
            fun budgetResetsAt(budgetResetsAt: OffsetDateTime?) =
                budgetResetsAt(JsonField.ofNullable(budgetResetsAt))

            /** Alias for calling [Builder.budgetResetsAt] with `budgetResetsAt.orElse(null)`. */
            fun budgetResetsAt(budgetResetsAt: Optional<OffsetDateTime>) =
                budgetResetsAt(budgetResetsAt.getOrNull())

            /**
             * Sets [Builder.budgetResetsAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetResetsAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun budgetResetsAt(budgetResetsAt: JsonField<OffsetDateTime>) = apply {
                this.budgetResetsAt = budgetResetsAt
            }

            /** How often the key's spend resets, such as `30d`. */
            fun budgetResetsEvery(budgetResetsEvery: String?) =
                budgetResetsEvery(JsonField.ofNullable(budgetResetsEvery))

            /**
             * Alias for calling [Builder.budgetResetsEvery] with `budgetResetsEvery.orElse(null)`.
             */
            fun budgetResetsEvery(budgetResetsEvery: Optional<String>) =
                budgetResetsEvery(budgetResetsEvery.getOrNull())

            /**
             * Sets [Builder.budgetResetsEvery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetResetsEvery] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetResetsEvery(budgetResetsEvery: JsonField<String>) = apply {
                this.budgetResetsEvery = budgetResetsEvery
            }

            /** When the key was issued. */
            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

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

            /** When the key stops working; `null` when it does not expire. */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
            fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * The key's value, sent as `Authorization: Bearer <key>` to the instance. Shown only in
             * this response.
             */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** The most the key may spend, in USD, until its budget resets. */
            fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

            /**
             * Alias for [Builder.maxBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

            /** Alias for calling [Builder.maxBudget] with `maxBudget.orElse(null)`. */
            fun maxBudget(maxBudget: Optional<Double>) = maxBudget(maxBudget.getOrNull())

            /**
             * Sets [Builder.maxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

            /** The most requests the key may have in flight at once. */
            fun maxParallelRequests(maxParallelRequests: Long?) =
                maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

            /**
             * Alias for [Builder.maxParallelRequests].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxParallelRequests(maxParallelRequests: Long) =
                maxParallelRequests(maxParallelRequests as Long?)

            /**
             * Alias for calling [Builder.maxParallelRequests] with
             * `maxParallelRequests.orElse(null)`.
             */
            fun maxParallelRequests(maxParallelRequests: Optional<Long>) =
                maxParallelRequests(maxParallelRequests.getOrNull())

            /**
             * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                this.maxParallelRequests = maxParallelRequests
            }

            /** The models the key may use. Empty means every model the instance serves. */
            fun models(models: List<String>) = models(JsonField.of(models))

            /**
             * Sets [Builder.models] to an arbitrary JSON value.
             *
             * You should usually call [Builder.models] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun models(models: JsonField<List<String>>) = apply {
                this.models = models.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [models].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addModel(model: String) = apply {
                models =
                    (models ?: JsonField.of(mutableListOf())).also {
                        checkKnown("models", it).add(model)
                    }
            }

            /** A label for people; `null` when none was given. */
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

            /** The most requests the key may make per minute. */
            fun requestsPerMinute(requestsPerMinute: Long?) =
                requestsPerMinute(JsonField.ofNullable(requestsPerMinute))

            /**
             * Alias for [Builder.requestsPerMinute].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestsPerMinute(requestsPerMinute: Long) =
                requestsPerMinute(requestsPerMinute as Long?)

            /**
             * Alias for calling [Builder.requestsPerMinute] with `requestsPerMinute.orElse(null)`.
             */
            fun requestsPerMinute(requestsPerMinute: Optional<Long>) =
                requestsPerMinute(requestsPerMinute.getOrNull())

            /**
             * Sets [Builder.requestsPerMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestsPerMinute] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestsPerMinute(requestsPerMinute: JsonField<Long>) = apply {
                this.requestsPerMinute = requestsPerMinute
            }

            /** What the key has spent since its budget last reset, in USD. */
            fun spend(spend: Double) = spend(JsonField.of(spend))

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            /** The team the key belongs to, if any. */
            fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

            /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
            fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            /** The most tokens the key may use per minute. */
            fun tokensPerMinute(tokensPerMinute: Long?) =
                tokensPerMinute(JsonField.ofNullable(tokensPerMinute))

            /**
             * Alias for [Builder.tokensPerMinute].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tokensPerMinute(tokensPerMinute: Long) = tokensPerMinute(tokensPerMinute as Long?)

            /** Alias for calling [Builder.tokensPerMinute] with `tokensPerMinute.orElse(null)`. */
            fun tokensPerMinute(tokensPerMinute: Optional<Long>) =
                tokensPerMinute(tokensPerMinute.getOrNull())

            /**
             * Sets [Builder.tokensPerMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokensPerMinute] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokensPerMinute(tokensPerMinute: JsonField<Long>) = apply {
                this.tokensPerMinute = tokensPerMinute
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
             * .blocked()
             * .budgetResetsAt()
             * .budgetResetsEvery()
             * .createdAt()
             * .expiresAt()
             * .key()
             * .maxBudget()
             * .maxParallelRequests()
             * .models()
             * .name()
             * .requestsPerMinute()
             * .spend()
             * .teamId()
             * .tokensPerMinute()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("blocked", blocked),
                    checkRequired("budgetResetsAt", budgetResetsAt),
                    checkRequired("budgetResetsEvery", budgetResetsEvery),
                    checkRequired("createdAt", createdAt),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("key", key),
                    checkRequired("maxBudget", maxBudget),
                    checkRequired("maxParallelRequests", maxParallelRequests),
                    checkRequired("models", models).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("requestsPerMinute", requestsPerMinute),
                    checkRequired("spend", spend),
                    checkRequired("teamId", teamId),
                    checkRequired("tokensPerMinute", tokensPerMinute),
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
            blocked()
            budgetResetsAt()
            budgetResetsEvery()
            createdAt()
            expiresAt()
            key()
            maxBudget()
            maxParallelRequests()
            models()
            name()
            requestsPerMinute()
            spend()
            teamId()
            tokensPerMinute()
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
                (if (blocked.asKnown().isPresent) 1 else 0) +
                (if (budgetResetsAt.asKnown().isPresent) 1 else 0) +
                (if (budgetResetsEvery.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (key.asKnown().isPresent) 1 else 0) +
                (if (maxBudget.asKnown().isPresent) 1 else 0) +
                (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                (models.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (requestsPerMinute.asKnown().isPresent) 1 else 0) +
                (if (spend.asKnown().isPresent) 1 else 0) +
                (if (teamId.asKnown().isPresent) 1 else 0) +
                (if (tokensPerMinute.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                blocked == other.blocked &&
                budgetResetsAt == other.budgetResetsAt &&
                budgetResetsEvery == other.budgetResetsEvery &&
                createdAt == other.createdAt &&
                expiresAt == other.expiresAt &&
                key == other.key &&
                maxBudget == other.maxBudget &&
                maxParallelRequests == other.maxParallelRequests &&
                models == other.models &&
                name == other.name &&
                requestsPerMinute == other.requestsPerMinute &&
                spend == other.spend &&
                teamId == other.teamId &&
                tokensPerMinute == other.tokensPerMinute &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                blocked,
                budgetResetsAt,
                budgetResetsEvery,
                createdAt,
                expiresAt,
                key,
                maxBudget,
                maxParallelRequests,
                models,
                name,
                requestsPerMinute,
                spend,
                teamId,
                tokensPerMinute,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, blocked=$blocked, budgetResetsAt=$budgetResetsAt, budgetResetsEvery=$budgetResetsEvery, createdAt=$createdAt, expiresAt=$expiresAt, key=$key, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, models=$models, name=$name, requestsPerMinute=$requestsPerMinute, spend=$spend, teamId=$teamId, tokensPerMinute=$tokensPerMinute, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KeyCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
