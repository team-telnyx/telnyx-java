// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates an existing assistant test configuration with new settings */
class TestUpdateParams
private constructor(
    private val testId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun testId(): Optional<String> = Optional.ofNullable(testId)

    /**
     * Updated description of the test's purpose and evaluation criteria.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Updated target destination for test conversations.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destination(): Optional<String> = body.destination()

    /**
     * Updated test scenario instructions and objectives.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

    /**
     * Updated maximum test duration in seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDurationSeconds(): Optional<Long> = body.maxDurationSeconds()

    /**
     * Updated name for the assistant test. Must be unique and descriptive.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Updated evaluation criteria for assessing assistant performance.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rubric(): Optional<List<Rubric>> = body.rubric()

    /**
     * Updated communication channel for the test execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telnyxConversationChannel(): Optional<TelnyxConversationChannel> =
        body.telnyxConversationChannel()

    /**
     * Updated test suite assignment for better organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testSuite(): Optional<String> = body.testSuite()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destination(): JsonField<String> = body._destination()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [maxDurationSeconds].
     *
     * Unlike [maxDurationSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxDurationSeconds(): JsonField<Long> = body._maxDurationSeconds()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [rubric].
     *
     * Unlike [rubric], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rubric(): JsonField<List<Rubric>> = body._rubric()

    /**
     * Returns the raw JSON value of [telnyxConversationChannel].
     *
     * Unlike [telnyxConversationChannel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _telnyxConversationChannel(): JsonField<TelnyxConversationChannel> =
        body._telnyxConversationChannel()

    /**
     * Returns the raw JSON value of [testSuite].
     *
     * Unlike [testSuite], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _testSuite(): JsonField<String> = body._testSuite()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TestUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TestUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestUpdateParams]. */
    class Builder internal constructor() {

        private var testId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(testUpdateParams: TestUpdateParams) = apply {
            testId = testUpdateParams.testId
            body = testUpdateParams.body.toBuilder()
            additionalHeaders = testUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = testUpdateParams.additionalQueryParams.toBuilder()
        }

        fun testId(testId: String?) = apply { this.testId = testId }

        /** Alias for calling [Builder.testId] with `testId.orElse(null)`. */
        fun testId(testId: Optional<String>) = testId(testId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [destination]
         * - [instructions]
         * - [maxDurationSeconds]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Updated description of the test's purpose and evaluation criteria. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Updated target destination for test conversations. */
        fun destination(destination: String) = apply { body.destination(destination) }

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { body.destination(destination) }

        /** Updated test scenario instructions and objectives. */
        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        /** Updated maximum test duration in seconds. */
        fun maxDurationSeconds(maxDurationSeconds: Long) = apply {
            body.maxDurationSeconds(maxDurationSeconds)
        }

        /**
         * Sets [Builder.maxDurationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDurationSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxDurationSeconds(maxDurationSeconds: JsonField<Long>) = apply {
            body.maxDurationSeconds(maxDurationSeconds)
        }

        /** Updated name for the assistant test. Must be unique and descriptive. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Updated evaluation criteria for assessing assistant performance. */
        fun rubric(rubric: List<Rubric>) = apply { body.rubric(rubric) }

        /**
         * Sets [Builder.rubric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rubric] with a well-typed `List<Rubric>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rubric(rubric: JsonField<List<Rubric>>) = apply { body.rubric(rubric) }

        /**
         * Adds a single [Rubric] to [Builder.rubric].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRubric(rubric: Rubric) = apply { body.addRubric(rubric) }

        /** Updated communication channel for the test execution. */
        fun telnyxConversationChannel(telnyxConversationChannel: TelnyxConversationChannel) =
            apply {
                body.telnyxConversationChannel(telnyxConversationChannel)
            }

        /**
         * Sets [Builder.telnyxConversationChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxConversationChannel] with a well-typed
         * [TelnyxConversationChannel] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun telnyxConversationChannel(
            telnyxConversationChannel: JsonField<TelnyxConversationChannel>
        ) = apply { body.telnyxConversationChannel(telnyxConversationChannel) }

        /** Updated test suite assignment for better organization. */
        fun testSuite(testSuite: String) = apply { body.testSuite(testSuite) }

        /**
         * Sets [Builder.testSuite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testSuite] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun testSuite(testSuite: JsonField<String>) = apply { body.testSuite(testSuite) }

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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [TestUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TestUpdateParams =
            TestUpdateParams(
                testId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> testId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request model for updating an existing assistant test.
     *
     * All fields are optional, allowing partial updates of test configuration. Only provided fields
     * will be updated, others remain unchanged.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val destination: JsonField<String>,
        private val instructions: JsonField<String>,
        private val maxDurationSeconds: JsonField<Long>,
        private val name: JsonField<String>,
        private val rubric: JsonField<List<Rubric>>,
        private val telnyxConversationChannel: JsonField<TelnyxConversationChannel>,
        private val testSuite: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rubric")
            @ExcludeMissing
            rubric: JsonField<List<Rubric>> = JsonMissing.of(),
            @JsonProperty("telnyx_conversation_channel")
            @ExcludeMissing
            telnyxConversationChannel: JsonField<TelnyxConversationChannel> = JsonMissing.of(),
            @JsonProperty("test_suite")
            @ExcludeMissing
            testSuite: JsonField<String> = JsonMissing.of(),
        ) : this(
            description,
            destination,
            instructions,
            maxDurationSeconds,
            name,
            rubric,
            telnyxConversationChannel,
            testSuite,
            mutableMapOf(),
        )

        /**
         * Updated description of the test's purpose and evaluation criteria.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Updated target destination for test conversations.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destination(): Optional<String> = destination.getOptional("destination")

        /**
         * Updated test scenario instructions and objectives.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * Updated maximum test duration in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxDurationSeconds(): Optional<Long> =
            maxDurationSeconds.getOptional("max_duration_seconds")

        /**
         * Updated name for the assistant test. Must be unique and descriptive.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Updated evaluation criteria for assessing assistant performance.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rubric(): Optional<List<Rubric>> = rubric.getOptional("rubric")

        /**
         * Updated communication channel for the test execution.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telnyxConversationChannel(): Optional<TelnyxConversationChannel> =
            telnyxConversationChannel.getOptional("telnyx_conversation_channel")

        /**
         * Updated test suite assignment for better organization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun testSuite(): Optional<String> = testSuite.getOptional("test_suite")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<String> = destination

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [maxDurationSeconds].
         *
         * Unlike [maxDurationSeconds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_duration_seconds")
        @ExcludeMissing
        fun _maxDurationSeconds(): JsonField<Long> = maxDurationSeconds

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var destination: JsonField<String> = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var maxDurationSeconds: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var rubric: JsonField<MutableList<Rubric>>? = null
            private var telnyxConversationChannel: JsonField<TelnyxConversationChannel> =
                JsonMissing.of()
            private var testSuite: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                destination = body.destination
                instructions = body.instructions
                maxDurationSeconds = body.maxDurationSeconds
                name = body.name
                rubric = body.rubric.map { it.toMutableList() }
                telnyxConversationChannel = body.telnyxConversationChannel
                testSuite = body.testSuite
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Updated description of the test's purpose and evaluation criteria. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Updated target destination for test conversations. */
            fun destination(destination: String) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<String>) = apply {
                this.destination = destination
            }

            /** Updated test scenario instructions and objectives. */
            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            /** Updated maximum test duration in seconds. */
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

            /** Updated name for the assistant test. Must be unique and descriptive. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Updated evaluation criteria for assessing assistant performance. */
            fun rubric(rubric: List<Rubric>) = rubric(JsonField.of(rubric))

            /**
             * Sets [Builder.rubric] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rubric] with a well-typed `List<Rubric>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Updated communication channel for the test execution. */
            fun telnyxConversationChannel(telnyxConversationChannel: TelnyxConversationChannel) =
                telnyxConversationChannel(JsonField.of(telnyxConversationChannel))

            /**
             * Sets [Builder.telnyxConversationChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telnyxConversationChannel] with a well-typed
             * [TelnyxConversationChannel] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun telnyxConversationChannel(
                telnyxConversationChannel: JsonField<TelnyxConversationChannel>
            ) = apply { this.telnyxConversationChannel = telnyxConversationChannel }

            /** Updated test suite assignment for better organization. */
            fun testSuite(testSuite: String) = testSuite(JsonField.of(testSuite))

            /**
             * Sets [Builder.testSuite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.testSuite] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    description,
                    destination,
                    instructions,
                    maxDurationSeconds,
                    name,
                    (rubric ?: JsonMissing.of()).map { it.toImmutable() },
                    telnyxConversationChannel,
                    testSuite,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            destination()
            instructions()
            maxDurationSeconds()
            name()
            rubric().ifPresent { it.forEach { it.validate() } }
            telnyxConversationChannel().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (destination.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (maxDurationSeconds.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (rubric.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (telnyxConversationChannel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (testSuite.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                destination == other.destination &&
                instructions == other.instructions &&
                maxDurationSeconds == other.maxDurationSeconds &&
                name == other.name &&
                rubric == other.rubric &&
                telnyxConversationChannel == other.telnyxConversationChannel &&
                testSuite == other.testSuite &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                destination,
                instructions,
                maxDurationSeconds,
                name,
                rubric,
                telnyxConversationChannel,
                testSuite,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, destination=$destination, instructions=$instructions, maxDurationSeconds=$maxDurationSeconds, name=$name, rubric=$rubric, telnyxConversationChannel=$telnyxConversationChannel, testSuite=$testSuite, additionalProperties=$additionalProperties}"
    }

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

        return other is TestUpdateParams &&
            testId == other.testId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(testId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TestUpdateParams{testId=$testId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
