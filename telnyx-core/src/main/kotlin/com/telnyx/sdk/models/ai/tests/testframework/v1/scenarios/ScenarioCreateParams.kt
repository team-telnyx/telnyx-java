// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

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

/** Creates an evaluator scenario in your organization. */
class ScenarioCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * ID of the personality the caller simulates.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun personality(): Long = body.personality()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agent(): Optional<Long> = body.agent()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expectedOutcomePrompt(): Optional<String> = body.expectedOutcomePrompt()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstMessage(): Optional<String> = body.firstMessage()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderPath(): Optional<String> = body.folderPath()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Optional<List<Long>> = body.metrics()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testProfile(): Optional<Long> = body.testProfile()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [personality].
     *
     * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _personality(): JsonField<Long> = body._personality()

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agent(): JsonField<Long> = body._agent()

    /**
     * Returns the raw JSON value of [expectedOutcomePrompt].
     *
     * Unlike [expectedOutcomePrompt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expectedOutcomePrompt(): JsonField<String> = body._expectedOutcomePrompt()

    /**
     * Returns the raw JSON value of [firstMessage].
     *
     * Unlike [firstMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstMessage(): JsonField<String> = body._firstMessage()

    /**
     * Returns the raw JSON value of [folderPath].
     *
     * Unlike [folderPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _folderPath(): JsonField<String> = body._folderPath()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metrics(): JsonField<List<Long>> = body._metrics()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [testProfile].
     *
     * Unlike [testProfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _testProfile(): JsonField<Long> = body._testProfile()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScenarioCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .personality()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scenarioCreateParams: ScenarioCreateParams) = apply {
            body = scenarioCreateParams.body.toBuilder()
            additionalHeaders = scenarioCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = scenarioCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [personality]
         * - [agent]
         * - [expectedOutcomePrompt]
         * - [firstMessage]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** ID of the personality the caller simulates. */
        fun personality(personality: Long) = apply { body.personality(personality) }

        /**
         * Sets [Builder.personality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personality] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun personality(personality: JsonField<Long>) = apply { body.personality(personality) }

        fun agent(agent: Long?) = apply { body.agent(agent) }

        /**
         * Alias for [Builder.agent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun agent(agent: Long) = agent(agent as Long?)

        /** Alias for calling [Builder.agent] with `agent.orElse(null)`. */
        fun agent(agent: Optional<Long>) = agent(agent.getOrNull())

        /**
         * Sets [Builder.agent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Long>) = apply { body.agent(agent) }

        fun expectedOutcomePrompt(expectedOutcomePrompt: String) = apply {
            body.expectedOutcomePrompt(expectedOutcomePrompt)
        }

        /**
         * Sets [Builder.expectedOutcomePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedOutcomePrompt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedOutcomePrompt(expectedOutcomePrompt: JsonField<String>) = apply {
            body.expectedOutcomePrompt(expectedOutcomePrompt)
        }

        fun firstMessage(firstMessage: String) = apply { body.firstMessage(firstMessage) }

        /**
         * Sets [Builder.firstMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstMessage(firstMessage: JsonField<String>) = apply {
            body.firstMessage(firstMessage)
        }

        fun folderPath(folderPath: String?) = apply { body.folderPath(folderPath) }

        /** Alias for calling [Builder.folderPath] with `folderPath.orElse(null)`. */
        fun folderPath(folderPath: Optional<String>) = folderPath(folderPath.getOrNull())

        /**
         * Sets [Builder.folderPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun folderPath(folderPath: JsonField<String>) = apply { body.folderPath(folderPath) }

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

        fun metrics(metrics: List<Long>) = apply { body.metrics(metrics) }

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metrics(metrics: JsonField<List<Long>>) = apply { body.metrics(metrics) }

        /**
         * Adds a single [Long] to [metrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetric(metric: Long) = apply { body.addMetric(metric) }

        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun testProfile(testProfile: Long) = apply { body.testProfile(testProfile) }

        /**
         * Sets [Builder.testProfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testProfile] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun testProfile(testProfile: JsonField<Long>) = apply { body.testProfile(testProfile) }

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
         * Returns an immutable instance of [ScenarioCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .personality()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScenarioCreateParams =
            ScenarioCreateParams(
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
        private val name: JsonField<String>,
        private val personality: JsonField<Long>,
        private val agent: JsonField<Long>,
        private val expectedOutcomePrompt: JsonField<String>,
        private val firstMessage: JsonField<String>,
        private val folderPath: JsonField<String>,
        private val instructions: JsonField<String>,
        private val metrics: JsonField<List<Long>>,
        private val tags: JsonField<List<String>>,
        private val testProfile: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("personality")
            @ExcludeMissing
            personality: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expected_outcome_prompt")
            @ExcludeMissing
            expectedOutcomePrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_message")
            @ExcludeMissing
            firstMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("folder_path")
            @ExcludeMissing
            folderPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metrics")
            @ExcludeMissing
            metrics: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("test_profile")
            @ExcludeMissing
            testProfile: JsonField<Long> = JsonMissing.of(),
        ) : this(
            name,
            personality,
            agent,
            expectedOutcomePrompt,
            firstMessage,
            folderPath,
            instructions,
            metrics,
            tags,
            testProfile,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * ID of the personality the caller simulates.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun personality(): Long = personality.getRequired("personality")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<Long> = agent.getOptional("agent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expectedOutcomePrompt(): Optional<String> =
            expectedOutcomePrompt.getOptional("expected_outcome_prompt")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstMessage(): Optional<String> = firstMessage.getOptional("first_message")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun folderPath(): Optional<String> = folderPath.getOptional("folder_path")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metrics(): Optional<List<Long>> = metrics.getOptional("metrics")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun testProfile(): Optional<Long> = testProfile.getOptional("test_profile")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [personality].
         *
         * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("personality")
        @ExcludeMissing
        fun _personality(): JsonField<Long> = personality

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

        /**
         * Returns the raw JSON value of [expectedOutcomePrompt].
         *
         * Unlike [expectedOutcomePrompt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("expected_outcome_prompt")
        @ExcludeMissing
        fun _expectedOutcomePrompt(): JsonField<String> = expectedOutcomePrompt

        /**
         * Returns the raw JSON value of [firstMessage].
         *
         * Unlike [firstMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("first_message")
        @ExcludeMissing
        fun _firstMessage(): JsonField<String> = firstMessage

        /**
         * Returns the raw JSON value of [folderPath].
         *
         * Unlike [folderPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("folder_path")
        @ExcludeMissing
        fun _folderPath(): JsonField<String> = folderPath

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
         * Returns the raw JSON value of [metrics].
         *
         * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<List<Long>> = metrics

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [testProfile].
         *
         * Unlike [testProfile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("test_profile")
        @ExcludeMissing
        fun _testProfile(): JsonField<Long> = testProfile

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
             * .personality()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var personality: JsonField<Long>? = null
            private var agent: JsonField<Long> = JsonMissing.of()
            private var expectedOutcomePrompt: JsonField<String> = JsonMissing.of()
            private var firstMessage: JsonField<String> = JsonMissing.of()
            private var folderPath: JsonField<String> = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var metrics: JsonField<MutableList<Long>>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var testProfile: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                personality = body.personality
                agent = body.agent
                expectedOutcomePrompt = body.expectedOutcomePrompt
                firstMessage = body.firstMessage
                folderPath = body.folderPath
                instructions = body.instructions
                metrics = body.metrics.map { it.toMutableList() }
                tags = body.tags.map { it.toMutableList() }
                testProfile = body.testProfile
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** ID of the personality the caller simulates. */
            fun personality(personality: Long) = personality(JsonField.of(personality))

            /**
             * Sets [Builder.personality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personality] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personality(personality: JsonField<Long>) = apply { this.personality = personality }

            fun agent(agent: Long?) = agent(JsonField.ofNullable(agent))

            /**
             * Alias for [Builder.agent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun agent(agent: Long) = agent(agent as Long?)

            /** Alias for calling [Builder.agent] with `agent.orElse(null)`. */
            fun agent(agent: Optional<Long>) = agent(agent.getOrNull())

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

            fun expectedOutcomePrompt(expectedOutcomePrompt: String) =
                expectedOutcomePrompt(JsonField.of(expectedOutcomePrompt))

            /**
             * Sets [Builder.expectedOutcomePrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedOutcomePrompt] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expectedOutcomePrompt(expectedOutcomePrompt: JsonField<String>) = apply {
                this.expectedOutcomePrompt = expectedOutcomePrompt
            }

            fun firstMessage(firstMessage: String) = firstMessage(JsonField.of(firstMessage))

            /**
             * Sets [Builder.firstMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstMessage(firstMessage: JsonField<String>) = apply {
                this.firstMessage = firstMessage
            }

            fun folderPath(folderPath: String?) = folderPath(JsonField.ofNullable(folderPath))

            /** Alias for calling [Builder.folderPath] with `folderPath.orElse(null)`. */
            fun folderPath(folderPath: Optional<String>) = folderPath(folderPath.getOrNull())

            /**
             * Sets [Builder.folderPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.folderPath] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folderPath(folderPath: JsonField<String>) = apply { this.folderPath = folderPath }

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

            fun metrics(metrics: List<Long>) = metrics(JsonField.of(metrics))

            /**
             * Sets [Builder.metrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metrics] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metrics(metrics: JsonField<List<Long>>) = apply {
                this.metrics = metrics.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [metrics].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMetric(metric: Long) = apply {
                metrics =
                    (metrics ?: JsonField.of(mutableListOf())).also {
                        checkKnown("metrics", it).add(metric)
                    }
            }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun testProfile(testProfile: Long) = testProfile(JsonField.of(testProfile))

            /**
             * Sets [Builder.testProfile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.testProfile] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun testProfile(testProfile: JsonField<Long>) = apply { this.testProfile = testProfile }

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
             * .personality()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("personality", personality),
                    agent,
                    expectedOutcomePrompt,
                    firstMessage,
                    folderPath,
                    instructions,
                    (metrics ?: JsonMissing.of()).map { it.toImmutable() },
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    testProfile,
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
            personality()
            agent()
            expectedOutcomePrompt()
            firstMessage()
            folderPath()
            instructions()
            metrics()
            tags()
            testProfile()
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
                (if (personality.asKnown().isPresent) 1 else 0) +
                (if (agent.asKnown().isPresent) 1 else 0) +
                (if (expectedOutcomePrompt.asKnown().isPresent) 1 else 0) +
                (if (firstMessage.asKnown().isPresent) 1 else 0) +
                (if (folderPath.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (metrics.asKnown().getOrNull()?.size ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (testProfile.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                personality == other.personality &&
                agent == other.agent &&
                expectedOutcomePrompt == other.expectedOutcomePrompt &&
                firstMessage == other.firstMessage &&
                folderPath == other.folderPath &&
                instructions == other.instructions &&
                metrics == other.metrics &&
                tags == other.tags &&
                testProfile == other.testProfile &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                personality,
                agent,
                expectedOutcomePrompt,
                firstMessage,
                folderPath,
                instructions,
                metrics,
                tags,
                testProfile,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, personality=$personality, agent=$agent, expectedOutcomePrompt=$expectedOutcomePrompt, firstMessage=$firstMessage, folderPath=$folderPath, instructions=$instructions, metrics=$metrics, tags=$tags, testProfile=$testProfile, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScenarioCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
