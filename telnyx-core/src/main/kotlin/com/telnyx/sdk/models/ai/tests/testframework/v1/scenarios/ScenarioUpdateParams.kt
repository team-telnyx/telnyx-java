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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates the specified evaluator scenario. */
class ScenarioUpdateParams
private constructor(
    private val id: Long?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<Long> = Optional.ofNullable(id)

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
    fun inboundPhoneNumber(): Optional<Long> = body.inboundPhoneNumber()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDuration(): Optional<Long> = body.maxDuration()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Optional<List<Long>> = body.metrics()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun personality(): Optional<Long> = body.personality()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<Long> = body.phoneNumber()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarioLanguage(): Optional<String> = body.scenarioLanguage()

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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolIds(): Optional<List<String>> = body.toolIds()

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
     * Returns the raw JSON value of [inboundPhoneNumber].
     *
     * Unlike [inboundPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _inboundPhoneNumber(): JsonField<Long> = body._inboundPhoneNumber()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [maxDuration].
     *
     * Unlike [maxDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxDuration(): JsonField<Long> = body._maxDuration()

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metrics(): JsonField<List<Long>> = body._metrics()

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
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<Long> = body._phoneNumber()

    /**
     * Returns the raw JSON value of [scenarioLanguage].
     *
     * Unlike [scenarioLanguage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scenarioLanguage(): JsonField<String> = body._scenarioLanguage()

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

    /**
     * Returns the raw JSON value of [toolIds].
     *
     * Unlike [toolIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolIds(): JsonField<List<String>> = body._toolIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ScenarioUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ScenarioUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioUpdateParams]. */
    class Builder internal constructor() {

        private var id: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scenarioUpdateParams: ScenarioUpdateParams) = apply {
            id = scenarioUpdateParams.id
            body = scenarioUpdateParams.body.toBuilder()
            additionalHeaders = scenarioUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = scenarioUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: Long?) = apply { this.id = id }

        /**
         * Alias for [Builder.id].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun id(id: Long) = id(id as Long?)

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<Long>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agent]
         * - [expectedOutcomePrompt]
         * - [firstMessage]
         * - [folderPath]
         * - [inboundPhoneNumber]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        fun inboundPhoneNumber(inboundPhoneNumber: Long) = apply {
            body.inboundPhoneNumber(inboundPhoneNumber)
        }

        /**
         * Sets [Builder.inboundPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundPhoneNumber] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundPhoneNumber(inboundPhoneNumber: JsonField<Long>) = apply {
            body.inboundPhoneNumber(inboundPhoneNumber)
        }

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

        fun maxDuration(maxDuration: Long?) = apply { body.maxDuration(maxDuration) }

        /**
         * Alias for [Builder.maxDuration].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxDuration(maxDuration: Long) = maxDuration(maxDuration as Long?)

        /** Alias for calling [Builder.maxDuration] with `maxDuration.orElse(null)`. */
        fun maxDuration(maxDuration: Optional<Long>) = maxDuration(maxDuration.getOrNull())

        /**
         * Sets [Builder.maxDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDuration] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDuration(maxDuration: JsonField<Long>) = apply { body.maxDuration(maxDuration) }

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

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun personality(personality: Long) = apply { body.personality(personality) }

        /**
         * Sets [Builder.personality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personality] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun personality(personality: JsonField<Long>) = apply { body.personality(personality) }

        fun phoneNumber(phoneNumber: Long) = apply { body.phoneNumber(phoneNumber) }

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<Long>) = apply { body.phoneNumber(phoneNumber) }

        fun scenarioLanguage(scenarioLanguage: String) = apply {
            body.scenarioLanguage(scenarioLanguage)
        }

        /**
         * Sets [Builder.scenarioLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarioLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scenarioLanguage(scenarioLanguage: JsonField<String>) = apply {
            body.scenarioLanguage(scenarioLanguage)
        }

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

        fun toolIds(toolIds: List<String>) = apply { body.toolIds(toolIds) }

        /**
         * Sets [Builder.toolIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolIds(toolIds: JsonField<List<String>>) = apply { body.toolIds(toolIds) }

        /**
         * Adds a single [String] to [toolIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolId(toolId: String) = apply { body.addToolId(toolId) }

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
         * Returns an immutable instance of [ScenarioUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScenarioUpdateParams =
            ScenarioUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agent: JsonField<Long>,
        private val expectedOutcomePrompt: JsonField<String>,
        private val firstMessage: JsonField<String>,
        private val folderPath: JsonField<String>,
        private val inboundPhoneNumber: JsonField<Long>,
        private val instructions: JsonField<String>,
        private val maxDuration: JsonField<Long>,
        private val metrics: JsonField<List<Long>>,
        private val name: JsonField<String>,
        private val personality: JsonField<Long>,
        private val phoneNumber: JsonField<Long>,
        private val scenarioLanguage: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val testProfile: JsonField<Long>,
        private val toolIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
            @JsonProperty("inbound_phone_number")
            @ExcludeMissing
            inboundPhoneNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_duration")
            @ExcludeMissing
            maxDuration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metrics")
            @ExcludeMissing
            metrics: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("personality")
            @ExcludeMissing
            personality: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("scenario_language")
            @ExcludeMissing
            scenarioLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("test_profile")
            @ExcludeMissing
            testProfile: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tool_ids")
            @ExcludeMissing
            toolIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            agent,
            expectedOutcomePrompt,
            firstMessage,
            folderPath,
            inboundPhoneNumber,
            instructions,
            maxDuration,
            metrics,
            name,
            personality,
            phoneNumber,
            scenarioLanguage,
            tags,
            testProfile,
            toolIds,
            mutableMapOf(),
        )

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
        fun inboundPhoneNumber(): Optional<Long> =
            inboundPhoneNumber.getOptional("inbound_phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxDuration(): Optional<Long> = maxDuration.getOptional("max_duration")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metrics(): Optional<List<Long>> = metrics.getOptional("metrics")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun personality(): Optional<Long> = personality.getOptional("personality")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<Long> = phoneNumber.getOptional("phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarioLanguage(): Optional<String> = scenarioLanguage.getOptional("scenario_language")

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolIds(): Optional<List<String>> = toolIds.getOptional("tool_ids")

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
         * Returns the raw JSON value of [inboundPhoneNumber].
         *
         * Unlike [inboundPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_phone_number")
        @ExcludeMissing
        fun _inboundPhoneNumber(): JsonField<Long> = inboundPhoneNumber

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
         * Returns the raw JSON value of [maxDuration].
         *
         * Unlike [maxDuration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_duration")
        @ExcludeMissing
        fun _maxDuration(): JsonField<Long> = maxDuration

        /**
         * Returns the raw JSON value of [metrics].
         *
         * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<List<Long>> = metrics

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
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<Long> = phoneNumber

        /**
         * Returns the raw JSON value of [scenarioLanguage].
         *
         * Unlike [scenarioLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scenario_language")
        @ExcludeMissing
        fun _scenarioLanguage(): JsonField<String> = scenarioLanguage

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

        /**
         * Returns the raw JSON value of [toolIds].
         *
         * Unlike [toolIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_ids") @ExcludeMissing fun _toolIds(): JsonField<List<String>> = toolIds

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

            private var agent: JsonField<Long> = JsonMissing.of()
            private var expectedOutcomePrompt: JsonField<String> = JsonMissing.of()
            private var firstMessage: JsonField<String> = JsonMissing.of()
            private var folderPath: JsonField<String> = JsonMissing.of()
            private var inboundPhoneNumber: JsonField<Long> = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var maxDuration: JsonField<Long> = JsonMissing.of()
            private var metrics: JsonField<MutableList<Long>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var personality: JsonField<Long> = JsonMissing.of()
            private var phoneNumber: JsonField<Long> = JsonMissing.of()
            private var scenarioLanguage: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var testProfile: JsonField<Long> = JsonMissing.of()
            private var toolIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agent = body.agent
                expectedOutcomePrompt = body.expectedOutcomePrompt
                firstMessage = body.firstMessage
                folderPath = body.folderPath
                inboundPhoneNumber = body.inboundPhoneNumber
                instructions = body.instructions
                maxDuration = body.maxDuration
                metrics = body.metrics.map { it.toMutableList() }
                name = body.name
                personality = body.personality
                phoneNumber = body.phoneNumber
                scenarioLanguage = body.scenarioLanguage
                tags = body.tags.map { it.toMutableList() }
                testProfile = body.testProfile
                toolIds = body.toolIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            fun inboundPhoneNumber(inboundPhoneNumber: Long) =
                inboundPhoneNumber(JsonField.of(inboundPhoneNumber))

            /**
             * Sets [Builder.inboundPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundPhoneNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inboundPhoneNumber(inboundPhoneNumber: JsonField<Long>) = apply {
                this.inboundPhoneNumber = inboundPhoneNumber
            }

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

            fun maxDuration(maxDuration: Long?) = maxDuration(JsonField.ofNullable(maxDuration))

            /**
             * Alias for [Builder.maxDuration].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxDuration(maxDuration: Long) = maxDuration(maxDuration as Long?)

            /** Alias for calling [Builder.maxDuration] with `maxDuration.orElse(null)`. */
            fun maxDuration(maxDuration: Optional<Long>) = maxDuration(maxDuration.getOrNull())

            /**
             * Sets [Builder.maxDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxDuration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxDuration(maxDuration: JsonField<Long>) = apply { this.maxDuration = maxDuration }

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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun personality(personality: Long) = personality(JsonField.of(personality))

            /**
             * Sets [Builder.personality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personality] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personality(personality: JsonField<Long>) = apply { this.personality = personality }

            fun phoneNumber(phoneNumber: Long) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<Long>) = apply { this.phoneNumber = phoneNumber }

            fun scenarioLanguage(scenarioLanguage: String) =
                scenarioLanguage(JsonField.of(scenarioLanguage))

            /**
             * Sets [Builder.scenarioLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarioLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarioLanguage(scenarioLanguage: JsonField<String>) = apply {
                this.scenarioLanguage = scenarioLanguage
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

            fun toolIds(toolIds: List<String>) = toolIds(JsonField.of(toolIds))

            /**
             * Sets [Builder.toolIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolIds(toolIds: JsonField<List<String>>) = apply {
                this.toolIds = toolIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [toolIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addToolId(toolId: String) = apply {
                toolIds =
                    (toolIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("toolIds", it).add(toolId)
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
             */
            fun build(): Body =
                Body(
                    agent,
                    expectedOutcomePrompt,
                    firstMessage,
                    folderPath,
                    inboundPhoneNumber,
                    instructions,
                    maxDuration,
                    (metrics ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    personality,
                    phoneNumber,
                    scenarioLanguage,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    testProfile,
                    (toolIds ?: JsonMissing.of()).map { it.toImmutable() },
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

            agent()
            expectedOutcomePrompt()
            firstMessage()
            folderPath()
            inboundPhoneNumber()
            instructions()
            maxDuration()
            metrics()
            name()
            personality()
            phoneNumber()
            scenarioLanguage()
            tags()
            testProfile()
            toolIds()
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
            (if (agent.asKnown().isPresent) 1 else 0) +
                (if (expectedOutcomePrompt.asKnown().isPresent) 1 else 0) +
                (if (firstMessage.asKnown().isPresent) 1 else 0) +
                (if (folderPath.asKnown().isPresent) 1 else 0) +
                (if (inboundPhoneNumber.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (maxDuration.asKnown().isPresent) 1 else 0) +
                (metrics.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (personality.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (scenarioLanguage.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (testProfile.asKnown().isPresent) 1 else 0) +
                (toolIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agent == other.agent &&
                expectedOutcomePrompt == other.expectedOutcomePrompt &&
                firstMessage == other.firstMessage &&
                folderPath == other.folderPath &&
                inboundPhoneNumber == other.inboundPhoneNumber &&
                instructions == other.instructions &&
                maxDuration == other.maxDuration &&
                metrics == other.metrics &&
                name == other.name &&
                personality == other.personality &&
                phoneNumber == other.phoneNumber &&
                scenarioLanguage == other.scenarioLanguage &&
                tags == other.tags &&
                testProfile == other.testProfile &&
                toolIds == other.toolIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agent,
                expectedOutcomePrompt,
                firstMessage,
                folderPath,
                inboundPhoneNumber,
                instructions,
                maxDuration,
                metrics,
                name,
                personality,
                phoneNumber,
                scenarioLanguage,
                tags,
                testProfile,
                toolIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agent=$agent, expectedOutcomePrompt=$expectedOutcomePrompt, firstMessage=$firstMessage, folderPath=$folderPath, inboundPhoneNumber=$inboundPhoneNumber, instructions=$instructions, maxDuration=$maxDuration, metrics=$metrics, name=$name, personality=$personality, phoneNumber=$phoneNumber, scenarioLanguage=$scenarioLanguage, tags=$tags, testProfile=$testProfile, toolIds=$toolIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScenarioUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
