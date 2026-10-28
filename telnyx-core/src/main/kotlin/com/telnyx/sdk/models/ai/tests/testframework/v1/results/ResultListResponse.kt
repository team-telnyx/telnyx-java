// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.results

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ResultListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val next: JsonField<String>,
    private val previous: JsonField<String>,
    private val results: JsonField<List<Result>>,
    private val count: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
    ) : this(next, previous, results, count, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): Optional<String> = next.getOptional("next")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previous(): Optional<String> = previous.getOptional("previous")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

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
         * Returns a mutable builder for constructing an instance of [ResultListResponse].
         *
         * The following fields are required:
         * ```java
         * .next()
         * .previous()
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultListResponse]. */
    class Builder internal constructor() {

        private var next: JsonField<String>? = null
        private var previous: JsonField<String>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var count: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(resultListResponse: ResultListResponse) = apply {
            next = resultListResponse.next
            previous = resultListResponse.previous
            results = resultListResponse.results.map { it.toMutableList() }
            count = resultListResponse.count
            additionalProperties = resultListResponse.additionalProperties.toMutableMap()
        }

        fun next(next: String?) = next(JsonField.ofNullable(next))

        /** Alias for calling [Builder.next] with `next.orElse(null)`. */
        fun next(next: Optional<String>) = next(next.getOrNull())

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

        /** Alias for calling [Builder.previous] with `previous.orElse(null)`. */
        fun previous(previous: Optional<String>) = previous(previous.getOrNull())

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun previous(previous: JsonField<String>) = apply { this.previous = previous }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

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
         * Returns an immutable instance of [ResultListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .next()
         * .previous()
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResultListResponse =
            ResultListResponse(
                checkRequired("next", next),
                checkRequired("previous", previous),
                checkRequired("results", results).map { it.toImmutable() },
                count,
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
    fun validate(): ResultListResponse = apply {
        if (validated) {
            return@apply
        }

        next()
        previous()
        results().forEach { it.validate() }
        count()
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
        (if (next.asKnown().isPresent) 1 else 0) +
            (if (previous.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (count.asKnown().isPresent) 1 else 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val agent: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val status: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val agentInbound: JsonField<Boolean>,
        private val agentName: JsonField<String>,
        private val completedRunsCount: JsonField<CompletedRunsCount>,
        private val failedRunsCount: JsonField<FailedRunsCount>,
        private val isCronjob: JsonField<Boolean>,
        private val metExpectedOutcomeCount: JsonField<MetExpectedOutcomeCount>,
        private val runAsText: JsonField<Boolean>,
        private val runType: JsonField<String>,
        private val runs: JsonField<List<Run>>,
        private val scenarios: JsonField<List<Scenario>>,
        private val successRate: JsonField<SuccessRate>,
        private val successRunsCount: JsonField<SuccessRunsCount>,
        private val totalExpectedOutcomeCount: JsonField<TotalExpectedOutcomeCount>,
        private val totalRunsCount: JsonField<TotalRunsCount>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("agent_inbound")
            @ExcludeMissing
            agentInbound: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("agent_name")
            @ExcludeMissing
            agentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completed_runs_count")
            @ExcludeMissing
            completedRunsCount: JsonField<CompletedRunsCount> = JsonMissing.of(),
            @JsonProperty("failed_runs_count")
            @ExcludeMissing
            failedRunsCount: JsonField<FailedRunsCount> = JsonMissing.of(),
            @JsonProperty("is_cronjob")
            @ExcludeMissing
            isCronjob: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("met_expected_outcome_count")
            @ExcludeMissing
            metExpectedOutcomeCount: JsonField<MetExpectedOutcomeCount> = JsonMissing.of(),
            @JsonProperty("run_as_text")
            @ExcludeMissing
            runAsText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("run_type") @ExcludeMissing runType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runs") @ExcludeMissing runs: JsonField<List<Run>> = JsonMissing.of(),
            @JsonProperty("scenarios")
            @ExcludeMissing
            scenarios: JsonField<List<Scenario>> = JsonMissing.of(),
            @JsonProperty("success_rate")
            @ExcludeMissing
            successRate: JsonField<SuccessRate> = JsonMissing.of(),
            @JsonProperty("success_runs_count")
            @ExcludeMissing
            successRunsCount: JsonField<SuccessRunsCount> = JsonMissing.of(),
            @JsonProperty("total_expected_outcome_count")
            @ExcludeMissing
            totalExpectedOutcomeCount: JsonField<TotalExpectedOutcomeCount> = JsonMissing.of(),
            @JsonProperty("total_runs_count")
            @ExcludeMissing
            totalRunsCount: JsonField<TotalRunsCount> = JsonMissing.of(),
        ) : this(
            id,
            agent,
            createdAt,
            name,
            status,
            updatedAt,
            agentInbound,
            agentName,
            completedRunsCount,
            failedRunsCount,
            isCronjob,
            metExpectedOutcomeCount,
            runAsText,
            runType,
            runs,
            scenarios,
            successRate,
            successRunsCount,
            totalExpectedOutcomeCount,
            totalRunsCount,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long = id.getRequired("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agent(): Long = agent.getRequired("agent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Run batch status: running, completed, failed, pending, in_progress, evaluating, in_queue,
         * timeout, cancelled, or scaling_up.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentInbound(): Optional<Boolean> = agentInbound.getOptional("agent_inbound")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentName(): Optional<String> = agentName.getOptional("agent_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedRunsCount(): Optional<CompletedRunsCount> =
            completedRunsCount.getOptional("completed_runs_count")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failedRunsCount(): Optional<FailedRunsCount> =
            failedRunsCount.getOptional("failed_runs_count")

        /**
         * Whether this batch was started by a scheduled job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isCronjob(): Optional<Boolean> = isCronjob.getOptional("is_cronjob")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metExpectedOutcomeCount(): Optional<MetExpectedOutcomeCount> =
            metExpectedOutcomeCount.getOptional("met_expected_outcome_count")

        /**
         * Whether the batch ran as text chat rather than voice calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runAsText(): Optional<Boolean> = runAsText.getOptional("run_as_text")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runType(): Optional<String> = runType.getOptional("run_type")

        /**
         * Run summaries in this batch. Retrieve the batch for detail keyed by run ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runs(): Optional<List<Run>> = runs.getOptional("runs")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarios(): Optional<List<Scenario>> = scenarios.getOptional("scenarios")

        /**
         * Share of runs judged successful.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun successRate(): Optional<SuccessRate> = successRate.getOptional("success_rate")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun successRunsCount(): Optional<SuccessRunsCount> =
            successRunsCount.getOptional("success_runs_count")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalExpectedOutcomeCount(): Optional<TotalExpectedOutcomeCount> =
            totalExpectedOutcomeCount.getOptional("total_expected_outcome_count")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalRunsCount(): Optional<TotalRunsCount> =
            totalRunsCount.getOptional("total_runs_count")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [agentInbound].
         *
         * Unlike [agentInbound], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agent_inbound")
        @ExcludeMissing
        fun _agentInbound(): JsonField<Boolean> = agentInbound

        /**
         * Returns the raw JSON value of [agentName].
         *
         * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_name") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

        /**
         * Returns the raw JSON value of [completedRunsCount].
         *
         * Unlike [completedRunsCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("completed_runs_count")
        @ExcludeMissing
        fun _completedRunsCount(): JsonField<CompletedRunsCount> = completedRunsCount

        /**
         * Returns the raw JSON value of [failedRunsCount].
         *
         * Unlike [failedRunsCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failed_runs_count")
        @ExcludeMissing
        fun _failedRunsCount(): JsonField<FailedRunsCount> = failedRunsCount

        /**
         * Returns the raw JSON value of [isCronjob].
         *
         * Unlike [isCronjob], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_cronjob") @ExcludeMissing fun _isCronjob(): JsonField<Boolean> = isCronjob

        /**
         * Returns the raw JSON value of [metExpectedOutcomeCount].
         *
         * Unlike [metExpectedOutcomeCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("met_expected_outcome_count")
        @ExcludeMissing
        fun _metExpectedOutcomeCount(): JsonField<MetExpectedOutcomeCount> = metExpectedOutcomeCount

        /**
         * Returns the raw JSON value of [runAsText].
         *
         * Unlike [runAsText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_as_text")
        @ExcludeMissing
        fun _runAsText(): JsonField<Boolean> = runAsText

        /**
         * Returns the raw JSON value of [runType].
         *
         * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<String> = runType

        /**
         * Returns the raw JSON value of [runs].
         *
         * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<Run>> = runs

        /**
         * Returns the raw JSON value of [scenarios].
         *
         * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenarios")
        @ExcludeMissing
        fun _scenarios(): JsonField<List<Scenario>> = scenarios

        /**
         * Returns the raw JSON value of [successRate].
         *
         * Unlike [successRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success_rate")
        @ExcludeMissing
        fun _successRate(): JsonField<SuccessRate> = successRate

        /**
         * Returns the raw JSON value of [successRunsCount].
         *
         * Unlike [successRunsCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("success_runs_count")
        @ExcludeMissing
        fun _successRunsCount(): JsonField<SuccessRunsCount> = successRunsCount

        /**
         * Returns the raw JSON value of [totalExpectedOutcomeCount].
         *
         * Unlike [totalExpectedOutcomeCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("total_expected_outcome_count")
        @ExcludeMissing
        fun _totalExpectedOutcomeCount(): JsonField<TotalExpectedOutcomeCount> =
            totalExpectedOutcomeCount

        /**
         * Returns the raw JSON value of [totalRunsCount].
         *
         * Unlike [totalRunsCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_runs_count")
        @ExcludeMissing
        fun _totalRunsCount(): JsonField<TotalRunsCount> = totalRunsCount

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agent()
             * .createdAt()
             * .name()
             * .status()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var id: JsonField<Long>? = null
            private var agent: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var agentInbound: JsonField<Boolean> = JsonMissing.of()
            private var agentName: JsonField<String> = JsonMissing.of()
            private var completedRunsCount: JsonField<CompletedRunsCount> = JsonMissing.of()
            private var failedRunsCount: JsonField<FailedRunsCount> = JsonMissing.of()
            private var isCronjob: JsonField<Boolean> = JsonMissing.of()
            private var metExpectedOutcomeCount: JsonField<MetExpectedOutcomeCount> =
                JsonMissing.of()
            private var runAsText: JsonField<Boolean> = JsonMissing.of()
            private var runType: JsonField<String> = JsonMissing.of()
            private var runs: JsonField<MutableList<Run>>? = null
            private var scenarios: JsonField<MutableList<Scenario>>? = null
            private var successRate: JsonField<SuccessRate> = JsonMissing.of()
            private var successRunsCount: JsonField<SuccessRunsCount> = JsonMissing.of()
            private var totalExpectedOutcomeCount: JsonField<TotalExpectedOutcomeCount> =
                JsonMissing.of()
            private var totalRunsCount: JsonField<TotalRunsCount> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                id = result.id
                agent = result.agent
                createdAt = result.createdAt
                name = result.name
                status = result.status
                updatedAt = result.updatedAt
                agentInbound = result.agentInbound
                agentName = result.agentName
                completedRunsCount = result.completedRunsCount
                failedRunsCount = result.failedRunsCount
                isCronjob = result.isCronjob
                metExpectedOutcomeCount = result.metExpectedOutcomeCount
                runAsText = result.runAsText
                runType = result.runType
                runs = result.runs.map { it.toMutableList() }
                scenarios = result.scenarios.map { it.toMutableList() }
                successRate = result.successRate
                successRunsCount = result.successRunsCount
                totalExpectedOutcomeCount = result.totalExpectedOutcomeCount
                totalRunsCount = result.totalRunsCount
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            fun agent(agent: Long) = agent(JsonField.of(agent))

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Run batch status: running, completed, failed, pending, in_progress, evaluating,
             * in_queue, timeout, cancelled, or scaling_up.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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

            fun agentInbound(agentInbound: Boolean) = agentInbound(JsonField.of(agentInbound))

            /**
             * Sets [Builder.agentInbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentInbound] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentInbound(agentInbound: JsonField<Boolean>) = apply {
                this.agentInbound = agentInbound
            }

            fun agentName(agentName: String) = agentName(JsonField.of(agentName))

            /**
             * Sets [Builder.agentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

            fun completedRunsCount(completedRunsCount: CompletedRunsCount) =
                completedRunsCount(JsonField.of(completedRunsCount))

            /**
             * Sets [Builder.completedRunsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedRunsCount] with a well-typed
             * [CompletedRunsCount] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun completedRunsCount(completedRunsCount: JsonField<CompletedRunsCount>) = apply {
                this.completedRunsCount = completedRunsCount
            }

            /**
             * Alias for calling [completedRunsCount] with `CompletedRunsCount.ofInteger(integer)`.
             */
            fun completedRunsCount(integer: Long) =
                completedRunsCount(CompletedRunsCount.ofInteger(integer))

            /**
             * Alias for calling [completedRunsCount] with `CompletedRunsCount.ofString(string)`.
             */
            fun completedRunsCount(string: String) =
                completedRunsCount(CompletedRunsCount.ofString(string))

            fun failedRunsCount(failedRunsCount: FailedRunsCount) =
                failedRunsCount(JsonField.of(failedRunsCount))

            /**
             * Sets [Builder.failedRunsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failedRunsCount] with a well-typed [FailedRunsCount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun failedRunsCount(failedRunsCount: JsonField<FailedRunsCount>) = apply {
                this.failedRunsCount = failedRunsCount
            }

            /** Alias for calling [failedRunsCount] with `FailedRunsCount.ofInteger(integer)`. */
            fun failedRunsCount(integer: Long) = failedRunsCount(FailedRunsCount.ofInteger(integer))

            /** Alias for calling [failedRunsCount] with `FailedRunsCount.ofString(string)`. */
            fun failedRunsCount(string: String) = failedRunsCount(FailedRunsCount.ofString(string))

            /** Whether this batch was started by a scheduled job. */
            fun isCronjob(isCronjob: Boolean) = isCronjob(JsonField.of(isCronjob))

            /**
             * Sets [Builder.isCronjob] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isCronjob] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isCronjob(isCronjob: JsonField<Boolean>) = apply { this.isCronjob = isCronjob }

            fun metExpectedOutcomeCount(metExpectedOutcomeCount: MetExpectedOutcomeCount) =
                metExpectedOutcomeCount(JsonField.of(metExpectedOutcomeCount))

            /**
             * Sets [Builder.metExpectedOutcomeCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metExpectedOutcomeCount] with a well-typed
             * [MetExpectedOutcomeCount] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun metExpectedOutcomeCount(
                metExpectedOutcomeCount: JsonField<MetExpectedOutcomeCount>
            ) = apply { this.metExpectedOutcomeCount = metExpectedOutcomeCount }

            /**
             * Alias for calling [metExpectedOutcomeCount] with
             * `MetExpectedOutcomeCount.ofInteger(integer)`.
             */
            fun metExpectedOutcomeCount(integer: Long) =
                metExpectedOutcomeCount(MetExpectedOutcomeCount.ofInteger(integer))

            /**
             * Alias for calling [metExpectedOutcomeCount] with
             * `MetExpectedOutcomeCount.ofString(string)`.
             */
            fun metExpectedOutcomeCount(string: String) =
                metExpectedOutcomeCount(MetExpectedOutcomeCount.ofString(string))

            /** Whether the batch ran as text chat rather than voice calls. */
            fun runAsText(runAsText: Boolean) = runAsText(JsonField.of(runAsText))

            /**
             * Sets [Builder.runAsText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runAsText] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runAsText(runAsText: JsonField<Boolean>) = apply { this.runAsText = runAsText }

            fun runType(runType: String?) = runType(JsonField.ofNullable(runType))

            /** Alias for calling [Builder.runType] with `runType.orElse(null)`. */
            fun runType(runType: Optional<String>) = runType(runType.getOrNull())

            /**
             * Sets [Builder.runType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runType(runType: JsonField<String>) = apply { this.runType = runType }

            /** Run summaries in this batch. Retrieve the batch for detail keyed by run ID. */
            fun runs(runs: List<Run>?) = runs(JsonField.ofNullable(runs))

            /** Alias for calling [Builder.runs] with `runs.orElse(null)`. */
            fun runs(runs: Optional<List<Run>>) = runs(runs.getOrNull())

            /**
             * Sets [Builder.runs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runs] with a well-typed `List<Run>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runs(runs: JsonField<List<Run>>) = apply {
                this.runs = runs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Run] to [runs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRun(run: Run) = apply {
                runs =
                    (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
            }

            fun scenarios(scenarios: List<Scenario>?) = scenarios(JsonField.ofNullable(scenarios))

            /** Alias for calling [Builder.scenarios] with `scenarios.orElse(null)`. */
            fun scenarios(scenarios: Optional<List<Scenario>>) = scenarios(scenarios.getOrNull())

            /**
             * Sets [Builder.scenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarios] with a well-typed `List<Scenario>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarios(scenarios: JsonField<List<Scenario>>) = apply {
                this.scenarios = scenarios.map { it.toMutableList() }
            }

            /**
             * Adds a single [Scenario] to [scenarios].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScenario(scenario: Scenario) = apply {
                scenarios =
                    (scenarios ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scenarios", it).add(scenario)
                    }
            }

            /** Share of runs judged successful. */
            fun successRate(successRate: SuccessRate) = successRate(JsonField.of(successRate))

            /**
             * Sets [Builder.successRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.successRate] with a well-typed [SuccessRate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun successRate(successRate: JsonField<SuccessRate>) = apply {
                this.successRate = successRate
            }

            /** Alias for calling [successRate] with `SuccessRate.ofNumber(number)`. */
            fun successRate(number: Double) = successRate(SuccessRate.ofNumber(number))

            /** Alias for calling [successRate] with `SuccessRate.ofString(string)`. */
            fun successRate(string: String) = successRate(SuccessRate.ofString(string))

            fun successRunsCount(successRunsCount: SuccessRunsCount) =
                successRunsCount(JsonField.of(successRunsCount))

            /**
             * Sets [Builder.successRunsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.successRunsCount] with a well-typed
             * [SuccessRunsCount] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun successRunsCount(successRunsCount: JsonField<SuccessRunsCount>) = apply {
                this.successRunsCount = successRunsCount
            }

            /** Alias for calling [successRunsCount] with `SuccessRunsCount.ofInteger(integer)`. */
            fun successRunsCount(integer: Long) =
                successRunsCount(SuccessRunsCount.ofInteger(integer))

            /** Alias for calling [successRunsCount] with `SuccessRunsCount.ofString(string)`. */
            fun successRunsCount(string: String) =
                successRunsCount(SuccessRunsCount.ofString(string))

            fun totalExpectedOutcomeCount(totalExpectedOutcomeCount: TotalExpectedOutcomeCount) =
                totalExpectedOutcomeCount(JsonField.of(totalExpectedOutcomeCount))

            /**
             * Sets [Builder.totalExpectedOutcomeCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalExpectedOutcomeCount] with a well-typed
             * [TotalExpectedOutcomeCount] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun totalExpectedOutcomeCount(
                totalExpectedOutcomeCount: JsonField<TotalExpectedOutcomeCount>
            ) = apply { this.totalExpectedOutcomeCount = totalExpectedOutcomeCount }

            /**
             * Alias for calling [totalExpectedOutcomeCount] with
             * `TotalExpectedOutcomeCount.ofInteger(integer)`.
             */
            fun totalExpectedOutcomeCount(integer: Long) =
                totalExpectedOutcomeCount(TotalExpectedOutcomeCount.ofInteger(integer))

            /**
             * Alias for calling [totalExpectedOutcomeCount] with
             * `TotalExpectedOutcomeCount.ofString(string)`.
             */
            fun totalExpectedOutcomeCount(string: String) =
                totalExpectedOutcomeCount(TotalExpectedOutcomeCount.ofString(string))

            fun totalRunsCount(totalRunsCount: TotalRunsCount) =
                totalRunsCount(JsonField.of(totalRunsCount))

            /**
             * Sets [Builder.totalRunsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRunsCount] with a well-typed [TotalRunsCount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun totalRunsCount(totalRunsCount: JsonField<TotalRunsCount>) = apply {
                this.totalRunsCount = totalRunsCount
            }

            /** Alias for calling [totalRunsCount] with `TotalRunsCount.ofInteger(integer)`. */
            fun totalRunsCount(integer: Long) = totalRunsCount(TotalRunsCount.ofInteger(integer))

            /** Alias for calling [totalRunsCount] with `TotalRunsCount.ofString(string)`. */
            fun totalRunsCount(string: String) = totalRunsCount(TotalRunsCount.ofString(string))

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agent()
             * .createdAt()
             * .name()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("id", id),
                    checkRequired("agent", agent),
                    checkRequired("createdAt", createdAt),
                    checkRequired("name", name),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    agentInbound,
                    agentName,
                    completedRunsCount,
                    failedRunsCount,
                    isCronjob,
                    metExpectedOutcomeCount,
                    runAsText,
                    runType,
                    (runs ?: JsonMissing.of()).map { it.toImmutable() },
                    (scenarios ?: JsonMissing.of()).map { it.toImmutable() },
                    successRate,
                    successRunsCount,
                    totalExpectedOutcomeCount,
                    totalRunsCount,
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            id()
            agent()
            createdAt()
            name()
            status()
            updatedAt()
            agentInbound()
            agentName()
            completedRunsCount().ifPresent { it.validate() }
            failedRunsCount().ifPresent { it.validate() }
            isCronjob()
            metExpectedOutcomeCount().ifPresent { it.validate() }
            runAsText()
            runType()
            runs().ifPresent { it.forEach { it.validate() } }
            scenarios().ifPresent { it.forEach { it.validate() } }
            successRate().ifPresent { it.validate() }
            successRunsCount().ifPresent { it.validate() }
            totalExpectedOutcomeCount().ifPresent { it.validate() }
            totalRunsCount().ifPresent { it.validate() }
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
                (if (agent.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (agentInbound.asKnown().isPresent) 1 else 0) +
                (if (agentName.asKnown().isPresent) 1 else 0) +
                (completedRunsCount.asKnown().getOrNull()?.validity() ?: 0) +
                (failedRunsCount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isCronjob.asKnown().isPresent) 1 else 0) +
                (metExpectedOutcomeCount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (runAsText.asKnown().isPresent) 1 else 0) +
                (if (runType.asKnown().isPresent) 1 else 0) +
                (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (scenarios.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (successRate.asKnown().getOrNull()?.validity() ?: 0) +
                (successRunsCount.asKnown().getOrNull()?.validity() ?: 0) +
                (totalExpectedOutcomeCount.asKnown().getOrNull()?.validity() ?: 0) +
                (totalRunsCount.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = CompletedRunsCount.Deserializer::class)
        @JsonSerialize(using = CompletedRunsCount.Serializer::class)
        class CompletedRunsCount
        private constructor(
            private val integer: Long? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isInteger(): Boolean = integer != null

            fun isString(): Boolean = string != null

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = completedRunsCount.accept(new CompletedRunsCount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitInteger(Long integer) {
             *         return Optional.of(integer.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): CompletedRunsCount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInteger(integer: Long) {}

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
                        override fun visitInteger(integer: Long) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CompletedRunsCount &&
                    integer == other.integer &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(integer, string)

            override fun toString(): String =
                when {
                    integer != null -> "CompletedRunsCount{integer=$integer}"
                    string != null -> "CompletedRunsCount{string=$string}"
                    _json != null -> "CompletedRunsCount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid CompletedRunsCount")
                }

            companion object {

                @JvmStatic fun ofInteger(integer: Long) = CompletedRunsCount(integer = integer)

                @JvmStatic fun ofString(string: String) = CompletedRunsCount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [CompletedRunsCount] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitInteger(integer: Long): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [CompletedRunsCount] to a value of type [T].
                 *
                 * An instance of [CompletedRunsCount] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown CompletedRunsCount: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<CompletedRunsCount>(CompletedRunsCount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): CompletedRunsCount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    CompletedRunsCount(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    CompletedRunsCount(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> CompletedRunsCount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<CompletedRunsCount>(CompletedRunsCount::class) {

                override fun serialize(
                    value: CompletedRunsCount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.integer != null -> generator.writeObject(value.integer)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid CompletedRunsCount")
                    }
                }
            }
        }

        @JsonDeserialize(using = FailedRunsCount.Deserializer::class)
        @JsonSerialize(using = FailedRunsCount.Serializer::class)
        class FailedRunsCount
        private constructor(
            private val integer: Long? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isInteger(): Boolean = integer != null

            fun isString(): Boolean = string != null

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = failedRunsCount.accept(new FailedRunsCount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitInteger(Long integer) {
             *         return Optional.of(integer.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): FailedRunsCount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInteger(integer: Long) {}

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
                        override fun visitInteger(integer: Long) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FailedRunsCount &&
                    integer == other.integer &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(integer, string)

            override fun toString(): String =
                when {
                    integer != null -> "FailedRunsCount{integer=$integer}"
                    string != null -> "FailedRunsCount{string=$string}"
                    _json != null -> "FailedRunsCount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid FailedRunsCount")
                }

            companion object {

                @JvmStatic fun ofInteger(integer: Long) = FailedRunsCount(integer = integer)

                @JvmStatic fun ofString(string: String) = FailedRunsCount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [FailedRunsCount] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitInteger(integer: Long): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [FailedRunsCount] to a value of type [T].
                 *
                 * An instance of [FailedRunsCount] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown FailedRunsCount: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<FailedRunsCount>(FailedRunsCount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): FailedRunsCount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    FailedRunsCount(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    FailedRunsCount(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> FailedRunsCount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<FailedRunsCount>(FailedRunsCount::class) {

                override fun serialize(
                    value: FailedRunsCount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.integer != null -> generator.writeObject(value.integer)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid FailedRunsCount")
                    }
                }
            }
        }

        @JsonDeserialize(using = MetExpectedOutcomeCount.Deserializer::class)
        @JsonSerialize(using = MetExpectedOutcomeCount.Serializer::class)
        class MetExpectedOutcomeCount
        private constructor(
            private val integer: Long? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isInteger(): Boolean = integer != null

            fun isString(): Boolean = string != null

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = metExpectedOutcomeCount.accept(new MetExpectedOutcomeCount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitInteger(Long integer) {
             *         return Optional.of(integer.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): MetExpectedOutcomeCount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInteger(integer: Long) {}

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
                        override fun visitInteger(integer: Long) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MetExpectedOutcomeCount &&
                    integer == other.integer &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(integer, string)

            override fun toString(): String =
                when {
                    integer != null -> "MetExpectedOutcomeCount{integer=$integer}"
                    string != null -> "MetExpectedOutcomeCount{string=$string}"
                    _json != null -> "MetExpectedOutcomeCount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid MetExpectedOutcomeCount")
                }

            companion object {

                @JvmStatic fun ofInteger(integer: Long) = MetExpectedOutcomeCount(integer = integer)

                @JvmStatic fun ofString(string: String) = MetExpectedOutcomeCount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [MetExpectedOutcomeCount] to a
             * value of type [T].
             */
            interface Visitor<out T> {

                fun visitInteger(integer: Long): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [MetExpectedOutcomeCount] to a value of type [T].
                 *
                 * An instance of [MetExpectedOutcomeCount] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown MetExpectedOutcomeCount: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<MetExpectedOutcomeCount>(MetExpectedOutcomeCount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): MetExpectedOutcomeCount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    MetExpectedOutcomeCount(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    MetExpectedOutcomeCount(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> MetExpectedOutcomeCount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<MetExpectedOutcomeCount>(MetExpectedOutcomeCount::class) {

                override fun serialize(
                    value: MetExpectedOutcomeCount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.integer != null -> generator.writeObject(value.integer)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid MetExpectedOutcomeCount")
                    }
                }
            }
        }

        class Run
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<Long>,
            private val inboundNumber: JsonField<String>,
            private val number: JsonField<String>,
            private val scenario: JsonField<Long>,
            private val scenarioName: JsonField<String>,
            private val status: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("inbound_number")
                @ExcludeMissing
                inboundNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("number")
                @ExcludeMissing
                number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scenario")
                @ExcludeMissing
                scenario: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("scenario_name")
                @ExcludeMissing
                scenarioName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(id, inboundNumber, number, scenario, scenarioName, status, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<Long> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inboundNumber(): Optional<String> = inboundNumber.getOptional("inbound_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun number(): Optional<String> = number.getOptional("number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun scenario(): Optional<Long> = scenario.getOptional("scenario")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun scenarioName(): Optional<String> = scenarioName.getOptional("scenario_name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<String> = status.getOptional("status")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

            /**
             * Returns the raw JSON value of [inboundNumber].
             *
             * Unlike [inboundNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inbound_number")
            @ExcludeMissing
            fun _inboundNumber(): JsonField<String> = inboundNumber

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /**
             * Returns the raw JSON value of [scenario].
             *
             * Unlike [scenario], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("scenario") @ExcludeMissing fun _scenario(): JsonField<Long> = scenario

            /**
             * Returns the raw JSON value of [scenarioName].
             *
             * Unlike [scenarioName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("scenario_name")
            @ExcludeMissing
            fun _scenarioName(): JsonField<String> = scenarioName

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

                /** Returns a mutable builder for constructing an instance of [Run]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Run]. */
            class Builder internal constructor() {

                private var id: JsonField<Long> = JsonMissing.of()
                private var inboundNumber: JsonField<String> = JsonMissing.of()
                private var number: JsonField<String> = JsonMissing.of()
                private var scenario: JsonField<Long> = JsonMissing.of()
                private var scenarioName: JsonField<String> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(run: Run) = apply {
                    id = run.id
                    inboundNumber = run.inboundNumber
                    number = run.number
                    scenario = run.scenario
                    scenarioName = run.scenarioName
                    status = run.status
                    additionalProperties = run.additionalProperties.toMutableMap()
                }

                fun id(id: Long) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun id(id: JsonField<Long>) = apply { this.id = id }

                fun inboundNumber(inboundNumber: String?) =
                    inboundNumber(JsonField.ofNullable(inboundNumber))

                /** Alias for calling [Builder.inboundNumber] with `inboundNumber.orElse(null)`. */
                fun inboundNumber(inboundNumber: Optional<String>) =
                    inboundNumber(inboundNumber.getOrNull())

                /**
                 * Sets [Builder.inboundNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inboundNumber(inboundNumber: JsonField<String>) = apply {
                    this.inboundNumber = inboundNumber
                }

                fun number(number: String?) = number(JsonField.ofNullable(number))

                /** Alias for calling [Builder.number] with `number.orElse(null)`. */
                fun number(number: Optional<String>) = number(number.getOrNull())

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                fun scenario(scenario: Long) = scenario(JsonField.of(scenario))

                /**
                 * Sets [Builder.scenario] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scenario] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scenario(scenario: JsonField<Long>) = apply { this.scenario = scenario }

                fun scenarioName(scenarioName: String) = scenarioName(JsonField.of(scenarioName))

                /**
                 * Sets [Builder.scenarioName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scenarioName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scenarioName(scenarioName: JsonField<String>) = apply {
                    this.scenarioName = scenarioName
                }

                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

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
                 * Returns an immutable instance of [Run].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Run =
                    Run(
                        id,
                        inboundNumber,
                        number,
                        scenario,
                        scenarioName,
                        status,
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
            fun validate(): Run = apply {
                if (validated) {
                    return@apply
                }

                id()
                inboundNumber()
                number()
                scenario()
                scenarioName()
                status()
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
                    (if (inboundNumber.asKnown().isPresent) 1 else 0) +
                    (if (number.asKnown().isPresent) 1 else 0) +
                    (if (scenario.asKnown().isPresent) 1 else 0) +
                    (if (scenarioName.asKnown().isPresent) 1 else 0) +
                    (if (status.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Run &&
                    id == other.id &&
                    inboundNumber == other.inboundNumber &&
                    number == other.number &&
                    scenario == other.scenario &&
                    scenarioName == other.scenarioName &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    inboundNumber,
                    number,
                    scenario,
                    scenarioName,
                    status,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Run{id=$id, inboundNumber=$inboundNumber, number=$number, scenario=$scenario, scenarioName=$scenarioName, status=$status, additionalProperties=$additionalProperties}"
        }

        class Scenario
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<Long>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, name, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<Long> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Scenario]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Scenario]. */
            class Builder internal constructor() {

                private var id: JsonField<Long> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scenario: Scenario) = apply {
                    id = scenario.id
                    name = scenario.name
                    additionalProperties = scenario.additionalProperties.toMutableMap()
                }

                fun id(id: Long) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun id(id: JsonField<Long>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Scenario].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Scenario = Scenario(id, name, additionalProperties.toMutableMap())
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
            fun validate(): Scenario = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
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
                (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Scenario &&
                    id == other.id &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Scenario{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

        /** Share of runs judged successful. */
        @JsonDeserialize(using = SuccessRate.Deserializer::class)
        @JsonSerialize(using = SuccessRate.Serializer::class)
        class SuccessRate
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            /** Share of runs judged successful. */
            fun number(): Optional<Double> = Optional.ofNullable(number)

            /** Share of runs judged successful. */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            /** Share of runs judged successful. */
            fun asNumber(): Double = number.getOrThrow("number")

            /** Share of runs judged successful. */
            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = successRate.accept(new SuccessRate.Visitor<Optional<String>>() {
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): SuccessRate = apply {
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

                return other is SuccessRate && number == other.number && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(number, string)

            override fun toString(): String =
                when {
                    number != null -> "SuccessRate{number=$number}"
                    string != null -> "SuccessRate{string=$string}"
                    _json != null -> "SuccessRate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SuccessRate")
                }

            companion object {

                /** Share of runs judged successful. */
                @JvmStatic fun ofNumber(number: Double) = SuccessRate(number = number)

                /** Share of runs judged successful. */
                @JvmStatic fun ofString(string: String) = SuccessRate(string = string)
            }

            /**
             * An interface that defines how to map each variant of [SuccessRate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** Share of runs judged successful. */
                fun visitNumber(number: Double): T

                /** Share of runs judged successful. */
                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [SuccessRate] to a value of type [T].
                 *
                 * An instance of [SuccessRate] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown SuccessRate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<SuccessRate>(SuccessRate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): SuccessRate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    SuccessRate(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    SuccessRate(number = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> SuccessRate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<SuccessRate>(SuccessRate::class) {

                override fun serialize(
                    value: SuccessRate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SuccessRate")
                    }
                }
            }
        }

        @JsonDeserialize(using = SuccessRunsCount.Deserializer::class)
        @JsonSerialize(using = SuccessRunsCount.Serializer::class)
        class SuccessRunsCount
        private constructor(
            private val integer: Long? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isInteger(): Boolean = integer != null

            fun isString(): Boolean = string != null

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = successRunsCount.accept(new SuccessRunsCount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitInteger(Long integer) {
             *         return Optional.of(integer.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): SuccessRunsCount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInteger(integer: Long) {}

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
                        override fun visitInteger(integer: Long) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SuccessRunsCount &&
                    integer == other.integer &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(integer, string)

            override fun toString(): String =
                when {
                    integer != null -> "SuccessRunsCount{integer=$integer}"
                    string != null -> "SuccessRunsCount{string=$string}"
                    _json != null -> "SuccessRunsCount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SuccessRunsCount")
                }

            companion object {

                @JvmStatic fun ofInteger(integer: Long) = SuccessRunsCount(integer = integer)

                @JvmStatic fun ofString(string: String) = SuccessRunsCount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [SuccessRunsCount] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitInteger(integer: Long): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [SuccessRunsCount] to a value of type [T].
                 *
                 * An instance of [SuccessRunsCount] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown SuccessRunsCount: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<SuccessRunsCount>(SuccessRunsCount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): SuccessRunsCount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    SuccessRunsCount(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    SuccessRunsCount(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> SuccessRunsCount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<SuccessRunsCount>(SuccessRunsCount::class) {

                override fun serialize(
                    value: SuccessRunsCount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.integer != null -> generator.writeObject(value.integer)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SuccessRunsCount")
                    }
                }
            }
        }

        @JsonDeserialize(using = TotalExpectedOutcomeCount.Deserializer::class)
        @JsonSerialize(using = TotalExpectedOutcomeCount.Serializer::class)
        class TotalExpectedOutcomeCount
        private constructor(
            private val integer: Long? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isInteger(): Boolean = integer != null

            fun isString(): Boolean = string != null

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = totalExpectedOutcomeCount.accept(new TotalExpectedOutcomeCount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitInteger(Long integer) {
             *         return Optional.of(integer.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): TotalExpectedOutcomeCount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInteger(integer: Long) {}

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
                        override fun visitInteger(integer: Long) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TotalExpectedOutcomeCount &&
                    integer == other.integer &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(integer, string)

            override fun toString(): String =
                when {
                    integer != null -> "TotalExpectedOutcomeCount{integer=$integer}"
                    string != null -> "TotalExpectedOutcomeCount{string=$string}"
                    _json != null -> "TotalExpectedOutcomeCount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid TotalExpectedOutcomeCount")
                }

            companion object {

                @JvmStatic
                fun ofInteger(integer: Long) = TotalExpectedOutcomeCount(integer = integer)

                @JvmStatic fun ofString(string: String) = TotalExpectedOutcomeCount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [TotalExpectedOutcomeCount] to a
             * value of type [T].
             */
            interface Visitor<out T> {

                fun visitInteger(integer: Long): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [TotalExpectedOutcomeCount] to a value of type [T].
                 *
                 * An instance of [TotalExpectedOutcomeCount] can contain an unknown variant if it
                 * was deserialized from data that doesn't match any known variant. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown TotalExpectedOutcomeCount: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<TotalExpectedOutcomeCount>(TotalExpectedOutcomeCount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): TotalExpectedOutcomeCount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    TotalExpectedOutcomeCount(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    TotalExpectedOutcomeCount(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> TotalExpectedOutcomeCount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<TotalExpectedOutcomeCount>(TotalExpectedOutcomeCount::class) {

                override fun serialize(
                    value: TotalExpectedOutcomeCount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.integer != null -> generator.writeObject(value.integer)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid TotalExpectedOutcomeCount")
                    }
                }
            }
        }

        @JsonDeserialize(using = TotalRunsCount.Deserializer::class)
        @JsonSerialize(using = TotalRunsCount.Serializer::class)
        class TotalRunsCount
        private constructor(
            private val integer: Long? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isInteger(): Boolean = integer != null

            fun isString(): Boolean = string != null

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = totalRunsCount.accept(new TotalRunsCount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitInteger(Long integer) {
             *         return Optional.of(integer.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): TotalRunsCount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInteger(integer: Long) {}

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
                        override fun visitInteger(integer: Long) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TotalRunsCount && integer == other.integer && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(integer, string)

            override fun toString(): String =
                when {
                    integer != null -> "TotalRunsCount{integer=$integer}"
                    string != null -> "TotalRunsCount{string=$string}"
                    _json != null -> "TotalRunsCount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid TotalRunsCount")
                }

            companion object {

                @JvmStatic fun ofInteger(integer: Long) = TotalRunsCount(integer = integer)

                @JvmStatic fun ofString(string: String) = TotalRunsCount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [TotalRunsCount] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitInteger(integer: Long): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [TotalRunsCount] to a value of type [T].
                 *
                 * An instance of [TotalRunsCount] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown TotalRunsCount: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<TotalRunsCount>(TotalRunsCount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): TotalRunsCount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    TotalRunsCount(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    TotalRunsCount(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> TotalRunsCount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<TotalRunsCount>(TotalRunsCount::class) {

                override fun serialize(
                    value: TotalRunsCount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.integer != null -> generator.writeObject(value.integer)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid TotalRunsCount")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                id == other.id &&
                agent == other.agent &&
                createdAt == other.createdAt &&
                name == other.name &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                agentInbound == other.agentInbound &&
                agentName == other.agentName &&
                completedRunsCount == other.completedRunsCount &&
                failedRunsCount == other.failedRunsCount &&
                isCronjob == other.isCronjob &&
                metExpectedOutcomeCount == other.metExpectedOutcomeCount &&
                runAsText == other.runAsText &&
                runType == other.runType &&
                runs == other.runs &&
                scenarios == other.scenarios &&
                successRate == other.successRate &&
                successRunsCount == other.successRunsCount &&
                totalExpectedOutcomeCount == other.totalExpectedOutcomeCount &&
                totalRunsCount == other.totalRunsCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                agent,
                createdAt,
                name,
                status,
                updatedAt,
                agentInbound,
                agentName,
                completedRunsCount,
                failedRunsCount,
                isCronjob,
                metExpectedOutcomeCount,
                runAsText,
                runType,
                runs,
                scenarios,
                successRate,
                successRunsCount,
                totalExpectedOutcomeCount,
                totalRunsCount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{id=$id, agent=$agent, createdAt=$createdAt, name=$name, status=$status, updatedAt=$updatedAt, agentInbound=$agentInbound, agentName=$agentName, completedRunsCount=$completedRunsCount, failedRunsCount=$failedRunsCount, isCronjob=$isCronjob, metExpectedOutcomeCount=$metExpectedOutcomeCount, runAsText=$runAsText, runType=$runType, runs=$runs, scenarios=$scenarios, successRate=$successRate, successRunsCount=$successRunsCount, totalExpectedOutcomeCount=$totalExpectedOutcomeCount, totalRunsCount=$totalRunsCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResultListResponse &&
            next == other.next &&
            previous == other.previous &&
            results == other.results &&
            count == other.count &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(next, previous, results, count, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResultListResponse{next=$next, previous=$previous, results=$results, count=$count, additionalProperties=$additionalProperties}"
}
