// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

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
 * Starts background generation of suggested metrics for a test agent. Returns a progress ID to poll
 * with the get-test-metric-generation-progress endpoint.
 */
class MetricGenerateMetricsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Test agent to suggest metrics for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): Long = body.agentId()

    /**
     * How many metrics to suggest.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numMetrics(): Long = body.numMetrics()

    /**
     * Scenario IDs to base the suggestions on.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarios(): Optional<List<Long>> = body.scenarios()

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentId(): JsonField<Long> = body._agentId()

    /**
     * Returns the raw JSON value of [numMetrics].
     *
     * Unlike [numMetrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numMetrics(): JsonField<Long> = body._numMetrics()

    /**
     * Returns the raw JSON value of [scenarios].
     *
     * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scenarios(): JsonField<List<Long>> = body._scenarios()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricGenerateMetricsParams].
         *
         * The following fields are required:
         * ```java
         * .agentId()
         * .numMetrics()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetricGenerateMetricsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(metricGenerateMetricsParams: MetricGenerateMetricsParams) = apply {
            body = metricGenerateMetricsParams.body.toBuilder()
            additionalHeaders = metricGenerateMetricsParams.additionalHeaders.toBuilder()
            additionalQueryParams = metricGenerateMetricsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agentId]
         * - [numMetrics]
         * - [scenarios]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Test agent to suggest metrics for. */
        fun agentId(agentId: Long) = apply { body.agentId(agentId) }

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<Long>) = apply { body.agentId(agentId) }

        /** How many metrics to suggest. */
        fun numMetrics(numMetrics: Long) = apply { body.numMetrics(numMetrics) }

        /**
         * Sets [Builder.numMetrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numMetrics] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numMetrics(numMetrics: JsonField<Long>) = apply { body.numMetrics(numMetrics) }

        /** Scenario IDs to base the suggestions on. */
        fun scenarios(scenarios: List<Long>) = apply { body.scenarios(scenarios) }

        /**
         * Sets [Builder.scenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarios] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scenarios(scenarios: JsonField<List<Long>>) = apply { body.scenarios(scenarios) }

        /**
         * Adds a single [Long] to [scenarios].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScenario(scenario: Long) = apply { body.addScenario(scenario) }

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
         * Returns an immutable instance of [MetricGenerateMetricsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agentId()
         * .numMetrics()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetricGenerateMetricsParams =
            MetricGenerateMetricsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentId: JsonField<Long>,
        private val numMetrics: JsonField<Long>,
        private val scenarios: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("num_metrics")
            @ExcludeMissing
            numMetrics: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("scenarios")
            @ExcludeMissing
            scenarios: JsonField<List<Long>> = JsonMissing.of(),
        ) : this(agentId, numMetrics, scenarios, mutableMapOf())

        /**
         * Test agent to suggest metrics for.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agentId(): Long = agentId.getRequired("agent_id")

        /**
         * How many metrics to suggest.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numMetrics(): Long = numMetrics.getRequired("num_metrics")

        /**
         * Scenario IDs to base the suggestions on.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarios(): Optional<List<Long>> = scenarios.getOptional("scenarios")

        /**
         * Returns the raw JSON value of [agentId].
         *
         * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<Long> = agentId

        /**
         * Returns the raw JSON value of [numMetrics].
         *
         * Unlike [numMetrics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_metrics") @ExcludeMissing fun _numMetrics(): JsonField<Long> = numMetrics

        /**
         * Returns the raw JSON value of [scenarios].
         *
         * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenarios")
        @ExcludeMissing
        fun _scenarios(): JsonField<List<Long>> = scenarios

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
             * .agentId()
             * .numMetrics()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var agentId: JsonField<Long>? = null
            private var numMetrics: JsonField<Long>? = null
            private var scenarios: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentId = body.agentId
                numMetrics = body.numMetrics
                scenarios = body.scenarios.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Test agent to suggest metrics for. */
            fun agentId(agentId: Long) = agentId(JsonField.of(agentId))

            /**
             * Sets [Builder.agentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentId(agentId: JsonField<Long>) = apply { this.agentId = agentId }

            /** How many metrics to suggest. */
            fun numMetrics(numMetrics: Long) = numMetrics(JsonField.of(numMetrics))

            /**
             * Sets [Builder.numMetrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numMetrics] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numMetrics(numMetrics: JsonField<Long>) = apply { this.numMetrics = numMetrics }

            /** Scenario IDs to base the suggestions on. */
            fun scenarios(scenarios: List<Long>) = scenarios(JsonField.of(scenarios))

            /**
             * Sets [Builder.scenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarios] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarios(scenarios: JsonField<List<Long>>) = apply {
                this.scenarios = scenarios.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [scenarios].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScenario(scenario: Long) = apply {
                scenarios =
                    (scenarios ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scenarios", it).add(scenario)
                    }
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
             * .agentId()
             * .numMetrics()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("agentId", agentId),
                    checkRequired("numMetrics", numMetrics),
                    (scenarios ?: JsonMissing.of()).map { it.toImmutable() },
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

            agentId()
            numMetrics()
            scenarios()
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
            (if (agentId.asKnown().isPresent) 1 else 0) +
                (if (numMetrics.asKnown().isPresent) 1 else 0) +
                (scenarios.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agentId == other.agentId &&
                numMetrics == other.numMetrics &&
                scenarios == other.scenarios &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agentId, numMetrics, scenarios, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentId=$agentId, numMetrics=$numMetrics, scenarios=$scenarios, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricGenerateMetricsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MetricGenerateMetricsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
