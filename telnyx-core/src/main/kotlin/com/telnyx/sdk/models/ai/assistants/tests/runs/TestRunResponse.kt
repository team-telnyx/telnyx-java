// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.runs

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

/**
 * Response model containing test run execution details and results.
 *
 * Provides comprehensive information about a test execution including status, timing, logs, and
 * detailed evaluation results.
 */
class TestRunResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val runId: JsonField<String>,
    private val status: JsonField<TestStatus>,
    private val testId: JsonField<String>,
    private val triggeredBy: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val conversationId: JsonField<String>,
    private val conversationInsightsId: JsonField<String>,
    private val detailStatus: JsonField<List<DetailStatus>>,
    private val logs: JsonField<String>,
    private val testSuiteRunId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<TestStatus> = JsonMissing.of(),
        @JsonProperty("test_id") @ExcludeMissing testId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("triggered_by")
        @ExcludeMissing
        triggeredBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("conversation_id")
        @ExcludeMissing
        conversationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conversation_insights_id")
        @ExcludeMissing
        conversationInsightsId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detail_status")
        @ExcludeMissing
        detailStatus: JsonField<List<DetailStatus>> = JsonMissing.of(),
        @JsonProperty("logs") @ExcludeMissing logs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("test_suite_run_id")
        @ExcludeMissing
        testSuiteRunId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        createdAt,
        runId,
        status,
        testId,
        triggeredBy,
        completedAt,
        conversationId,
        conversationInsightsId,
        detailStatus,
        logs,
        testSuiteRunId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Timestamp when the test run was created and queued.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Unique identifier for this specific test run execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * Represents the lifecycle of a test:
     * - 'pending': Test is waiting to be executed.
     * - 'starting': Test execution is initializing.
     * - 'running': Test is currently executing.
     * - 'passed': Test completed successfully.
     * - 'failed': Test executed but did not pass.
     * - 'error': An error occurred during test execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): TestStatus = status.getRequired("status")

    /**
     * Identifier of the assistant test that was executed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun testId(): String = testId.getRequired("test_id")

    /**
     * How this test run was initiated (manual, scheduled, or API).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun triggeredBy(): String = triggeredBy.getRequired("triggered_by")

    /**
     * Timestamp when the test run finished execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * Identifier of the conversation created during test execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationId(): Optional<String> = conversationId.getOptional("conversation_id")

    /**
     * Identifier for conversation analysis and insights data.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationInsightsId(): Optional<String> =
        conversationInsightsId.getOptional("conversation_insights_id")

    /**
     * Detailed evaluation results for each rubric criteria. Name is name of the criteria from the
     * rubric and status is the result of the evaluation. This list will have a result for every
     * criteria in the rubric section.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailStatus(): Optional<List<DetailStatus>> = detailStatus.getOptional("detail_status")

    /**
     * Detailed execution logs and debug information.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logs(): Optional<String> = logs.getOptional("logs")

    /**
     * Identifier linking this run to a test suite execution batch.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testSuiteRunId(): Optional<String> = testSuiteRunId.getOptional("test_suite_run_id")

    /**
     * Timestamp of the last update to this test run.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TestStatus> = status

    /**
     * Returns the raw JSON value of [testId].
     *
     * Unlike [testId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_id") @ExcludeMissing fun _testId(): JsonField<String> = testId

    /**
     * Returns the raw JSON value of [triggeredBy].
     *
     * Unlike [triggeredBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggered_by")
    @ExcludeMissing
    fun _triggeredBy(): JsonField<String> = triggeredBy

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [conversationId].
     *
     * Unlike [conversationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversation_id")
    @ExcludeMissing
    fun _conversationId(): JsonField<String> = conversationId

    /**
     * Returns the raw JSON value of [conversationInsightsId].
     *
     * Unlike [conversationInsightsId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("conversation_insights_id")
    @ExcludeMissing
    fun _conversationInsightsId(): JsonField<String> = conversationInsightsId

    /**
     * Returns the raw JSON value of [detailStatus].
     *
     * Unlike [detailStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detail_status")
    @ExcludeMissing
    fun _detailStatus(): JsonField<List<DetailStatus>> = detailStatus

    /**
     * Returns the raw JSON value of [logs].
     *
     * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<String> = logs

    /**
     * Returns the raw JSON value of [testSuiteRunId].
     *
     * Unlike [testSuiteRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_suite_run_id")
    @ExcludeMissing
    fun _testSuiteRunId(): JsonField<String> = testSuiteRunId

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
         * Returns a mutable builder for constructing an instance of [TestRunResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .runId()
         * .status()
         * .testId()
         * .triggeredBy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestRunResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var runId: JsonField<String>? = null
        private var status: JsonField<TestStatus>? = null
        private var testId: JsonField<String>? = null
        private var triggeredBy: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var conversationId: JsonField<String> = JsonMissing.of()
        private var conversationInsightsId: JsonField<String> = JsonMissing.of()
        private var detailStatus: JsonField<MutableList<DetailStatus>>? = null
        private var logs: JsonField<String> = JsonMissing.of()
        private var testSuiteRunId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(testRunResponse: TestRunResponse) = apply {
            createdAt = testRunResponse.createdAt
            runId = testRunResponse.runId
            status = testRunResponse.status
            testId = testRunResponse.testId
            triggeredBy = testRunResponse.triggeredBy
            completedAt = testRunResponse.completedAt
            conversationId = testRunResponse.conversationId
            conversationInsightsId = testRunResponse.conversationInsightsId
            detailStatus = testRunResponse.detailStatus.map { it.toMutableList() }
            logs = testRunResponse.logs
            testSuiteRunId = testRunResponse.testSuiteRunId
            updatedAt = testRunResponse.updatedAt
            additionalProperties = testRunResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp when the test run was created and queued. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Unique identifier for this specific test run execution. */
        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        /**
         * Represents the lifecycle of a test:
         * - 'pending': Test is waiting to be executed.
         * - 'starting': Test execution is initializing.
         * - 'running': Test is currently executing.
         * - 'passed': Test completed successfully.
         * - 'failed': Test executed but did not pass.
         * - 'error': An error occurred during test execution.
         */
        fun status(status: TestStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [TestStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<TestStatus>) = apply { this.status = status }

        /** Identifier of the assistant test that was executed. */
        fun testId(testId: String) = testId(JsonField.of(testId))

        /**
         * Sets [Builder.testId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun testId(testId: JsonField<String>) = apply { this.testId = testId }

        /** How this test run was initiated (manual, scheduled, or API). */
        fun triggeredBy(triggeredBy: String) = triggeredBy(JsonField.of(triggeredBy))

        /**
         * Sets [Builder.triggeredBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggeredBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun triggeredBy(triggeredBy: JsonField<String>) = apply { this.triggeredBy = triggeredBy }

        /** Timestamp when the test run finished execution. */
        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /** Identifier of the conversation created during test execution. */
        fun conversationId(conversationId: String) = conversationId(JsonField.of(conversationId))

        /**
         * Sets [Builder.conversationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationId(conversationId: JsonField<String>) = apply {
            this.conversationId = conversationId
        }

        /** Identifier for conversation analysis and insights data. */
        fun conversationInsightsId(conversationInsightsId: String) =
            conversationInsightsId(JsonField.of(conversationInsightsId))

        /**
         * Sets [Builder.conversationInsightsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationInsightsId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationInsightsId(conversationInsightsId: JsonField<String>) = apply {
            this.conversationInsightsId = conversationInsightsId
        }

        /**
         * Detailed evaluation results for each rubric criteria. Name is name of the criteria from
         * the rubric and status is the result of the evaluation. This list will have a result for
         * every criteria in the rubric section.
         */
        fun detailStatus(detailStatus: List<DetailStatus>) =
            detailStatus(JsonField.of(detailStatus))

        /**
         * Sets [Builder.detailStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailStatus] with a well-typed `List<DetailStatus>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun detailStatus(detailStatus: JsonField<List<DetailStatus>>) = apply {
            this.detailStatus = detailStatus.map { it.toMutableList() }
        }

        /**
         * Adds a single [DetailStatus] to [Builder.detailStatus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDetailStatus(detailStatus: DetailStatus) = apply {
            this.detailStatus =
                (this.detailStatus ?: JsonField.of(mutableListOf())).also {
                    checkKnown("detailStatus", it).add(detailStatus)
                }
        }

        /** Detailed execution logs and debug information. */
        fun logs(logs: String) = logs(JsonField.of(logs))

        /**
         * Sets [Builder.logs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logs] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logs(logs: JsonField<String>) = apply { this.logs = logs }

        /** Identifier linking this run to a test suite execution batch. */
        fun testSuiteRunId(testSuiteRunId: String) = testSuiteRunId(JsonField.of(testSuiteRunId))

        /**
         * Sets [Builder.testSuiteRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testSuiteRunId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun testSuiteRunId(testSuiteRunId: JsonField<String>) = apply {
            this.testSuiteRunId = testSuiteRunId
        }

        /** Timestamp of the last update to this test run. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TestRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .runId()
         * .status()
         * .testId()
         * .triggeredBy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestRunResponse =
            TestRunResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("runId", runId),
                checkRequired("status", status),
                checkRequired("testId", testId),
                checkRequired("triggeredBy", triggeredBy),
                completedAt,
                conversationId,
                conversationInsightsId,
                (detailStatus ?: JsonMissing.of()).map { it.toImmutable() },
                logs,
                testSuiteRunId,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TestRunResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        runId()
        status().validate()
        testId()
        triggeredBy()
        completedAt()
        conversationId()
        conversationInsightsId()
        detailStatus().ifPresent { it.forEach { it.validate() } }
        logs()
        testSuiteRunId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (testId.asKnown().isPresent) 1 else 0) +
            (if (triggeredBy.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (conversationId.asKnown().isPresent) 1 else 0) +
            (if (conversationInsightsId.asKnown().isPresent) 1 else 0) +
            (detailStatus.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (logs.asKnown().isPresent) 1 else 0) +
            (if (testSuiteRunId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class DetailStatus
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val status: JsonField<TestStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<TestStatus> = JsonMissing.of(),
        ) : this(name, status, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Represents the lifecycle of a test:
         * - 'pending': Test is waiting to be executed.
         * - 'starting': Test execution is initializing.
         * - 'running': Test is currently executing.
         * - 'passed': Test completed successfully.
         * - 'failed': Test executed but did not pass.
         * - 'error': An error occurred during test execution.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): TestStatus = status.getRequired("status")

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
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TestStatus> = status

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
             * Returns a mutable builder for constructing an instance of [DetailStatus].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DetailStatus]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var status: JsonField<TestStatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(detailStatus: DetailStatus) = apply {
                name = detailStatus.name
                status = detailStatus.status
                additionalProperties = detailStatus.additionalProperties.toMutableMap()
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
             * Represents the lifecycle of a test:
             * - 'pending': Test is waiting to be executed.
             * - 'starting': Test execution is initializing.
             * - 'running': Test is currently executing.
             * - 'passed': Test completed successfully.
             * - 'failed': Test executed but did not pass.
             * - 'error': An error occurred during test execution.
             */
            fun status(status: TestStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [TestStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<TestStatus>) = apply { this.status = status }

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
             * Returns an immutable instance of [DetailStatus].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DetailStatus =
                DetailStatus(
                    checkRequired("name", name),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DetailStatus = apply {
            if (validated) {
                return@apply
            }

            name()
            status().validate()
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
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DetailStatus &&
                name == other.name &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DetailStatus{name=$name, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestRunResponse &&
            createdAt == other.createdAt &&
            runId == other.runId &&
            status == other.status &&
            testId == other.testId &&
            triggeredBy == other.triggeredBy &&
            completedAt == other.completedAt &&
            conversationId == other.conversationId &&
            conversationInsightsId == other.conversationInsightsId &&
            detailStatus == other.detailStatus &&
            logs == other.logs &&
            testSuiteRunId == other.testSuiteRunId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            runId,
            status,
            testId,
            triggeredBy,
            completedAt,
            conversationId,
            conversationInsightsId,
            detailStatus,
            logs,
            testSuiteRunId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TestRunResponse{createdAt=$createdAt, runId=$runId, status=$status, testId=$testId, triggeredBy=$triggeredBy, completedAt=$completedAt, conversationId=$conversationId, conversationInsightsId=$conversationInsightsId, detailStatus=$detailStatus, logs=$logs, testSuiteRunId=$testSuiteRunId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
