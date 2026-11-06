// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a team on the instance. A team is a model list, a budget, and rate limits that its keys
 * share. Names need not be unique; the `id` identifies the team. The instance must be `ready`;
 * otherwise the request answers `409`.
 */
class TeamCreateParams
private constructor(
    private val instanceId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): Optional<String> = Optional.ofNullable(instanceId)

    /**
     * A label for people.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * How often the spend resets: a number and a unit, `s`, `m`, `h`, or `d`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetResetsEvery(): Optional<String> = body.budgetResetsEvery()

    /**
     * The most the team's keys may spend together, in USD.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Optional<Double> = body.maxBudget()

    /**
     * The models the team's keys may use. Leave it out to allow every model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): Optional<List<String>> = body.models()

    /**
     * The most requests the team's keys may make per minute, together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestsPerMinute(): Optional<Long> = body.requestsPerMinute()

    /**
     * The most tokens the team's keys may use per minute, together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokensPerMinute(): Optional<Long> = body.tokensPerMinute()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [budgetResetsEvery].
     *
     * Unlike [budgetResetsEvery], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _budgetResetsEvery(): JsonField<String> = body._budgetResetsEvery()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _models(): JsonField<List<String>> = body._models()

    /**
     * Returns the raw JSON value of [requestsPerMinute].
     *
     * Unlike [requestsPerMinute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requestsPerMinute(): JsonField<Long> = body._requestsPerMinute()

    /**
     * Returns the raw JSON value of [tokensPerMinute].
     *
     * Unlike [tokensPerMinute], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tokensPerMinute(): JsonField<Long> = body._tokensPerMinute()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamCreateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamCreateParams: TeamCreateParams) = apply {
            instanceId = teamCreateParams.instanceId
            body = teamCreateParams.body.toBuilder()
            additionalHeaders = teamCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamCreateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String?) = apply { this.instanceId = instanceId }

        /** Alias for calling [Builder.instanceId] with `instanceId.orElse(null)`. */
        fun instanceId(instanceId: Optional<String>) = instanceId(instanceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [budgetResetsEvery]
         * - [maxBudget]
         * - [models]
         * - [requestsPerMinute]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A label for people. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** How often the spend resets: a number and a unit, `s`, `m`, `h`, or `d`. */
        fun budgetResetsEvery(budgetResetsEvery: String?) = apply {
            body.budgetResetsEvery(budgetResetsEvery)
        }

        /** Alias for calling [Builder.budgetResetsEvery] with `budgetResetsEvery.orElse(null)`. */
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
            body.budgetResetsEvery(budgetResetsEvery)
        }

        /** The most the team's keys may spend together, in USD. */
        fun maxBudget(maxBudget: Double?) = apply { body.maxBudget(maxBudget) }

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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { body.maxBudget(maxBudget) }

        /** The models the team's keys may use. Leave it out to allow every model. */
        fun models(models: List<String>?) = apply { body.models(models) }

        /** Alias for calling [Builder.models] with `models.orElse(null)`. */
        fun models(models: Optional<List<String>>) = models(models.getOrNull())

        /**
         * Sets [Builder.models] to an arbitrary JSON value.
         *
         * You should usually call [Builder.models] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun models(models: JsonField<List<String>>) = apply { body.models(models) }

        /**
         * Adds a single [String] to [models].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModel(model: String) = apply { body.addModel(model) }

        /** The most requests the team's keys may make per minute, together. */
        fun requestsPerMinute(requestsPerMinute: Long?) = apply {
            body.requestsPerMinute(requestsPerMinute)
        }

        /**
         * Alias for [Builder.requestsPerMinute].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun requestsPerMinute(requestsPerMinute: Long) =
            requestsPerMinute(requestsPerMinute as Long?)

        /** Alias for calling [Builder.requestsPerMinute] with `requestsPerMinute.orElse(null)`. */
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
            body.requestsPerMinute(requestsPerMinute)
        }

        /** The most tokens the team's keys may use per minute, together. */
        fun tokensPerMinute(tokensPerMinute: Long?) = apply {
            body.tokensPerMinute(tokensPerMinute)
        }

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
         * You should usually call [Builder.tokensPerMinute] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokensPerMinute(tokensPerMinute: JsonField<Long>) = apply {
            body.tokensPerMinute(tokensPerMinute)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [TeamCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamCreateParams =
            TeamCreateParams(
                instanceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val budgetResetsEvery: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val models: JsonField<List<String>>,
        private val requestsPerMinute: JsonField<Long>,
        private val tokensPerMinute: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_resets_every")
            @ExcludeMissing
            budgetResetsEvery: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("models")
            @ExcludeMissing
            models: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("requests_per_minute")
            @ExcludeMissing
            requestsPerMinute: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tokens_per_minute")
            @ExcludeMissing
            tokensPerMinute: JsonField<Long> = JsonMissing.of(),
        ) : this(
            name,
            budgetResetsEvery,
            maxBudget,
            models,
            requestsPerMinute,
            tokensPerMinute,
            mutableMapOf(),
        )

        /**
         * A label for people.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * How often the spend resets: a number and a unit, `s`, `m`, `h`, or `d`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetResetsEvery(): Optional<String> =
            budgetResetsEvery.getOptional("budget_resets_every")

        /**
         * The most the team's keys may spend together, in USD.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

        /**
         * The models the team's keys may use. Leave it out to allow every model.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): Optional<List<String>> = models.getOptional("models")

        /**
         * The most requests the team's keys may make per minute, together.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestsPerMinute(): Optional<Long> =
            requestsPerMinute.getOptional("requests_per_minute")

        /**
         * The most tokens the team's keys may use per minute, together.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokensPerMinute(): Optional<Long> = tokensPerMinute.getOptional("tokens_per_minute")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [models].
         *
         * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<String>> = models

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var budgetResetsEvery: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var models: JsonField<MutableList<String>>? = null
            private var requestsPerMinute: JsonField<Long> = JsonMissing.of()
            private var tokensPerMinute: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                budgetResetsEvery = body.budgetResetsEvery
                maxBudget = body.maxBudget
                models = body.models.map { it.toMutableList() }
                requestsPerMinute = body.requestsPerMinute
                tokensPerMinute = body.tokensPerMinute
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A label for people. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** How often the spend resets: a number and a unit, `s`, `m`, `h`, or `d`. */
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

            /** The most the team's keys may spend together, in USD. */
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

            /** The models the team's keys may use. Leave it out to allow every model. */
            fun models(models: List<String>?) = models(JsonField.ofNullable(models))

            /** Alias for calling [Builder.models] with `models.orElse(null)`. */
            fun models(models: Optional<List<String>>) = models(models.getOrNull())

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

            /** The most requests the team's keys may make per minute, together. */
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

            /** The most tokens the team's keys may use per minute, together. */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    budgetResetsEvery,
                    maxBudget,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    requestsPerMinute,
                    tokensPerMinute,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            budgetResetsEvery()
            maxBudget()
            models()
            requestsPerMinute()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (budgetResetsEvery.asKnown().isPresent) 1 else 0) +
                (if (maxBudget.asKnown().isPresent) 1 else 0) +
                (models.asKnown().getOrNull()?.size ?: 0) +
                (if (requestsPerMinute.asKnown().isPresent) 1 else 0) +
                (if (tokensPerMinute.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                budgetResetsEvery == other.budgetResetsEvery &&
                maxBudget == other.maxBudget &&
                models == other.models &&
                requestsPerMinute == other.requestsPerMinute &&
                tokensPerMinute == other.tokensPerMinute &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                budgetResetsEvery,
                maxBudget,
                models,
                requestsPerMinute,
                tokensPerMinute,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, budgetResetsEvery=$budgetResetsEvery, maxBudget=$maxBudget, models=$models, requestsPerMinute=$requestsPerMinute, tokensPerMinute=$tokensPerMinute, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamCreateParams &&
            instanceId == other.instanceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instanceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamCreateParams{instanceId=$instanceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
