// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response model containing complete assistant test information.
 *
 * Returns all test configuration details including evaluation criteria, scheduling, and metadata.
 * Used when retrieving individual tests or after creating/updating tests.
 */
class AssistantTest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val rubric: JsonField<List<Rubric>>,
    private val telnyxConversationChannel: JsonField<TelnyxConversationChannel>,
    private val testId: JsonField<String>,
    private val description: JsonField<String>,
    private val destination: JsonField<String>,
    private val instructions: JsonField<String>,
    private val maxDurationSeconds: JsonField<Long>,
    private val testSuite: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rubric") @ExcludeMissing rubric: JsonField<List<Rubric>> = JsonMissing.of(),
        @JsonProperty("telnyx_conversation_channel")
        @ExcludeMissing
        telnyxConversationChannel: JsonField<TelnyxConversationChannel> = JsonMissing.of(),
        @JsonProperty("test_id") @ExcludeMissing testId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_duration_seconds")
        @ExcludeMissing
        maxDurationSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("test_suite") @ExcludeMissing testSuite: JsonField<String> = JsonMissing.of(),
    ) : this(
        createdAt,
        name,
        rubric,
        telnyxConversationChannel,
        testId,
        description,
        destination,
        instructions,
        maxDurationSeconds,
        testSuite,
        mutableMapOf(),
    )

    /**
     * Timestamp when the test was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Human-readable name of the test.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Evaluation criteria used to assess test performance.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rubric(): List<Rubric> = rubric.getRequired("rubric")

    /**
     * Communication channel used for test execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxConversationChannel(): TelnyxConversationChannel =
        telnyxConversationChannel.getRequired("telnyx_conversation_channel")

    /**
     * Unique identifier for the assistant test.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun testId(): String = testId.getRequired("test_id")

    /**
     * Detailed description of the test's purpose and scope.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Target destination for test conversations.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destination(): Optional<String> = destination.getOptional("destination")

    /**
     * Detailed test scenario instructions and objectives.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

    /**
     * Maximum allowed duration for test execution in seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDurationSeconds(): Optional<Long> =
        maxDurationSeconds.getOptional("max_duration_seconds")

    /**
     * Test suite grouping for organizational purposes.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testSuite(): Optional<String> = testSuite.getOptional("test_suite")

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
     * Returns the raw JSON value of [rubric].
     *
     * Unlike [rubric], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rubric") @ExcludeMissing fun _rubric(): JsonField<List<Rubric>> = rubric

    /**
     * Returns the raw JSON value of [telnyxConversationChannel].
     *
     * Unlike [telnyxConversationChannel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("telnyx_conversation_channel")
    @ExcludeMissing
    fun _telnyxConversationChannel(): JsonField<TelnyxConversationChannel> =
        telnyxConversationChannel

    /**
     * Returns the raw JSON value of [testId].
     *
     * Unlike [testId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_id") @ExcludeMissing fun _testId(): JsonField<String> = testId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [maxDurationSeconds].
     *
     * Unlike [maxDurationSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_duration_seconds")
    @ExcludeMissing
    fun _maxDurationSeconds(): JsonField<Long> = maxDurationSeconds

    /**
     * Returns the raw JSON value of [testSuite].
     *
     * Unlike [testSuite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_suite") @ExcludeMissing fun _testSuite(): JsonField<String> = testSuite

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
         * Returns a mutable builder for constructing an instance of [AssistantTest].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .name()
         * .rubric()
         * .telnyxConversationChannel()
         * .testId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssistantTest]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var rubric: JsonField<MutableList<Rubric>>? = null
        private var telnyxConversationChannel: JsonField<TelnyxConversationChannel>? = null
        private var testId: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var destination: JsonField<String> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var maxDurationSeconds: JsonField<Long> = JsonMissing.of()
        private var testSuite: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assistantTest: AssistantTest) = apply {
            createdAt = assistantTest.createdAt
            name = assistantTest.name
            rubric = assistantTest.rubric.map { it.toMutableList() }
            telnyxConversationChannel = assistantTest.telnyxConversationChannel
            testId = assistantTest.testId
            description = assistantTest.description
            destination = assistantTest.destination
            instructions = assistantTest.instructions
            maxDurationSeconds = assistantTest.maxDurationSeconds
            testSuite = assistantTest.testSuite
            additionalProperties = assistantTest.additionalProperties.toMutableMap()
        }

        /** Timestamp when the test was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Human-readable name of the test. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Evaluation criteria used to assess test performance. */
        fun rubric(rubric: List<Rubric>) = rubric(JsonField.of(rubric))

        /**
         * Sets [Builder.rubric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rubric] with a well-typed `List<Rubric>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rubric(rubric: JsonField<List<Rubric>>) = apply {
            this.rubric = rubric.map { it.toMutableList() }
        }

        /**
         * Adds a single [Rubric] to [Builder.rubric].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRubric(rubric: Rubric) = apply {
            this.rubric =
                (this.rubric ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rubric", it).add(rubric)
                }
        }

        /** Communication channel used for test execution. */
        fun telnyxConversationChannel(telnyxConversationChannel: TelnyxConversationChannel) =
            telnyxConversationChannel(JsonField.of(telnyxConversationChannel))

        /**
         * Sets [Builder.telnyxConversationChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxConversationChannel] with a well-typed
         * [TelnyxConversationChannel] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun telnyxConversationChannel(
            telnyxConversationChannel: JsonField<TelnyxConversationChannel>
        ) = apply { this.telnyxConversationChannel = telnyxConversationChannel }

        /** Unique identifier for the assistant test. */
        fun testId(testId: String) = testId(JsonField.of(testId))

        /**
         * Sets [Builder.testId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun testId(testId: JsonField<String>) = apply { this.testId = testId }

        /** Detailed description of the test's purpose and scope. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Target destination for test conversations. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** Detailed test scenario instructions and objectives. */
        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        /** Maximum allowed duration for test execution in seconds. */
        fun maxDurationSeconds(maxDurationSeconds: Long) =
            maxDurationSeconds(JsonField.of(maxDurationSeconds))

        /**
         * Sets [Builder.maxDurationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDurationSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxDurationSeconds(maxDurationSeconds: JsonField<Long>) = apply {
            this.maxDurationSeconds = maxDurationSeconds
        }

        /** Test suite grouping for organizational purposes. */
        fun testSuite(testSuite: String) = testSuite(JsonField.of(testSuite))

        /**
         * Sets [Builder.testSuite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testSuite] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun testSuite(testSuite: JsonField<String>) = apply { this.testSuite = testSuite }

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
         * Returns an immutable instance of [AssistantTest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .name()
         * .rubric()
         * .telnyxConversationChannel()
         * .testId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssistantTest =
            AssistantTest(
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                checkRequired("rubric", rubric).map { it.toImmutable() },
                checkRequired("telnyxConversationChannel", telnyxConversationChannel),
                checkRequired("testId", testId),
                description,
                destination,
                instructions,
                maxDurationSeconds,
                testSuite,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssistantTest = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        name()
        rubric().forEach { it.validate() }
        telnyxConversationChannel().validate()
        testId()
        description()
        destination()
        instructions()
        maxDurationSeconds()
        testSuite()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (rubric.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (telnyxConversationChannel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (testId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (maxDurationSeconds.asKnown().isPresent) 1 else 0) +
            (if (testSuite.asKnown().isPresent) 1 else 0)

    class Rubric
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val criteria: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("criteria")
            @ExcludeMissing
            criteria: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(criteria, name, mutableMapOf())

        /**
         * Specific guidance on how to assess the assistant’s performance for this rubric item.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun criteria(): String = criteria.getRequired("criteria")

        /**
         * Label for the evaluation criterion, e.g., Empathy, Accuracy, Clarity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [criteria].
         *
         * Unlike [criteria], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("criteria") @ExcludeMissing fun _criteria(): JsonField<String> = criteria

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

            /**
             * Returns a mutable builder for constructing an instance of [Rubric].
             *
             * The following fields are required:
             * ```java
             * .criteria()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rubric]. */
        class Builder internal constructor() {

            private var criteria: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rubric: Rubric) = apply {
                criteria = rubric.criteria
                name = rubric.name
                additionalProperties = rubric.additionalProperties.toMutableMap()
            }

            /**
             * Specific guidance on how to assess the assistant’s performance for this rubric item.
             */
            fun criteria(criteria: String) = criteria(JsonField.of(criteria))

            /**
             * Sets [Builder.criteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.criteria] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun criteria(criteria: JsonField<String>) = apply { this.criteria = criteria }

            /** Label for the evaluation criterion, e.g., Empathy, Accuracy, Clarity. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Rubric].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .criteria()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rubric =
                Rubric(
                    checkRequired("criteria", criteria),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Rubric = apply {
            if (validated) {
                return@apply
            }

            criteria()
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
            (if (criteria.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rubric &&
                criteria == other.criteria &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(criteria, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rubric{criteria=$criteria, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantTest &&
            createdAt == other.createdAt &&
            name == other.name &&
            rubric == other.rubric &&
            telnyxConversationChannel == other.telnyxConversationChannel &&
            testId == other.testId &&
            description == other.description &&
            destination == other.destination &&
            instructions == other.instructions &&
            maxDurationSeconds == other.maxDurationSeconds &&
            testSuite == other.testSuite &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            name,
            rubric,
            telnyxConversationChannel,
            testId,
            description,
            destination,
            instructions,
            maxDurationSeconds,
            testSuite,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssistantTest{createdAt=$createdAt, name=$name, rubric=$rubric, telnyxConversationChannel=$telnyxConversationChannel, testId=$testId, description=$description, destination=$destination, instructions=$instructions, maxDurationSeconds=$maxDurationSeconds, testSuite=$testSuite, additionalProperties=$additionalProperties}"
}
