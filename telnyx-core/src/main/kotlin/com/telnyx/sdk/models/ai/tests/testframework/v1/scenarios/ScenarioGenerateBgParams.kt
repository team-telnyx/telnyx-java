// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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
 * Starts background generation of evaluator scenarios for a test agent. Returns a progress ID to
 * poll with the generate-scenarios-progress endpoint.
 */
class ScenarioGenerateBgParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * How many scenarios to generate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numScenarios(): Long = body.numScenarios()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentId(): Optional<Long> = body.agentId()

    /**
     * Optional guidance steering scenario generation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extraInstructions(): Optional<String> = body.extraInstructions()

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
     * Whether to generate expected-outcome prompts for the scenarios.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generateExpectedOutcomes(): Optional<Boolean> = body.generateExpectedOutcomes()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundPhoneNumber(): Optional<Long> = body.inboundPhoneNumber()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun personalities(): Optional<List<Long>> = body.personalities()

    /**
     * Type of scenario to generate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarioType(): Optional<ScenarioType> = body.scenarioType()

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
     * Returns the raw JSON value of [numScenarios].
     *
     * Unlike [numScenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numScenarios(): JsonField<Long> = body._numScenarios()

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentId(): JsonField<Long> = body._agentId()

    /**
     * Returns the raw JSON value of [extraInstructions].
     *
     * Unlike [extraInstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _extraInstructions(): JsonField<String> = body._extraInstructions()

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
     * Returns the raw JSON value of [generateExpectedOutcomes].
     *
     * Unlike [generateExpectedOutcomes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _generateExpectedOutcomes(): JsonField<Boolean> = body._generateExpectedOutcomes()

    /**
     * Returns the raw JSON value of [inboundPhoneNumber].
     *
     * Unlike [inboundPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _inboundPhoneNumber(): JsonField<Long> = body._inboundPhoneNumber()

    /**
     * Returns the raw JSON value of [personalities].
     *
     * Unlike [personalities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _personalities(): JsonField<List<Long>> = body._personalities()

    /**
     * Returns the raw JSON value of [scenarioType].
     *
     * Unlike [scenarioType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scenarioType(): JsonField<ScenarioType> = body._scenarioType()

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

        /**
         * Returns a mutable builder for constructing an instance of [ScenarioGenerateBgParams].
         *
         * The following fields are required:
         * ```java
         * .numScenarios()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioGenerateBgParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scenarioGenerateBgParams: ScenarioGenerateBgParams) = apply {
            body = scenarioGenerateBgParams.body.toBuilder()
            additionalHeaders = scenarioGenerateBgParams.additionalHeaders.toBuilder()
            additionalQueryParams = scenarioGenerateBgParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [numScenarios]
         * - [agentId]
         * - [extraInstructions]
         * - [firstMessage]
         * - [folderPath]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** How many scenarios to generate. */
        fun numScenarios(numScenarios: Long) = apply { body.numScenarios(numScenarios) }

        /**
         * Sets [Builder.numScenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numScenarios] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numScenarios(numScenarios: JsonField<Long>) = apply { body.numScenarios(numScenarios) }

        fun agentId(agentId: Long) = apply { body.agentId(agentId) }

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<Long>) = apply { body.agentId(agentId) }

        /** Optional guidance steering scenario generation. */
        fun extraInstructions(extraInstructions: String) = apply {
            body.extraInstructions(extraInstructions)
        }

        /**
         * Sets [Builder.extraInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraInstructions] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extraInstructions(extraInstructions: JsonField<String>) = apply {
            body.extraInstructions(extraInstructions)
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

        /** Whether to generate expected-outcome prompts for the scenarios. */
        fun generateExpectedOutcomes(generateExpectedOutcomes: Boolean) = apply {
            body.generateExpectedOutcomes(generateExpectedOutcomes)
        }

        /**
         * Sets [Builder.generateExpectedOutcomes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generateExpectedOutcomes] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun generateExpectedOutcomes(generateExpectedOutcomes: JsonField<Boolean>) = apply {
            body.generateExpectedOutcomes(generateExpectedOutcomes)
        }

        fun inboundPhoneNumber(inboundPhoneNumber: Long?) = apply {
            body.inboundPhoneNumber(inboundPhoneNumber)
        }

        /**
         * Alias for [Builder.inboundPhoneNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inboundPhoneNumber(inboundPhoneNumber: Long) =
            inboundPhoneNumber(inboundPhoneNumber as Long?)

        /**
         * Alias for calling [Builder.inboundPhoneNumber] with `inboundPhoneNumber.orElse(null)`.
         */
        fun inboundPhoneNumber(inboundPhoneNumber: Optional<Long>) =
            inboundPhoneNumber(inboundPhoneNumber.getOrNull())

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

        fun personalities(personalities: List<Long>) = apply { body.personalities(personalities) }

        /**
         * Sets [Builder.personalities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalities] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun personalities(personalities: JsonField<List<Long>>) = apply {
            body.personalities(personalities)
        }

        /**
         * Adds a single [Long] to [personalities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPersonality(personality: Long) = apply { body.addPersonality(personality) }

        /** Type of scenario to generate. */
        fun scenarioType(scenarioType: ScenarioType) = apply { body.scenarioType(scenarioType) }

        /**
         * Sets [Builder.scenarioType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarioType] with a well-typed [ScenarioType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scenarioType(scenarioType: JsonField<ScenarioType>) = apply {
            body.scenarioType(scenarioType)
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
         * Returns an immutable instance of [ScenarioGenerateBgParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .numScenarios()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScenarioGenerateBgParams =
            ScenarioGenerateBgParams(
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
        private val numScenarios: JsonField<Long>,
        private val agentId: JsonField<Long>,
        private val extraInstructions: JsonField<String>,
        private val firstMessage: JsonField<String>,
        private val folderPath: JsonField<String>,
        private val generateExpectedOutcomes: JsonField<Boolean>,
        private val inboundPhoneNumber: JsonField<Long>,
        private val personalities: JsonField<List<Long>>,
        private val scenarioType: JsonField<ScenarioType>,
        private val tags: JsonField<List<String>>,
        private val testProfile: JsonField<Long>,
        private val toolIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("num_scenarios")
            @ExcludeMissing
            numScenarios: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("extra_instructions")
            @ExcludeMissing
            extraInstructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_message")
            @ExcludeMissing
            firstMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("folder_path")
            @ExcludeMissing
            folderPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("generate_expected_outcomes")
            @ExcludeMissing
            generateExpectedOutcomes: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("inbound_phone_number")
            @ExcludeMissing
            inboundPhoneNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("personalities")
            @ExcludeMissing
            personalities: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("scenario_type")
            @ExcludeMissing
            scenarioType: JsonField<ScenarioType> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("test_profile")
            @ExcludeMissing
            testProfile: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tool_ids")
            @ExcludeMissing
            toolIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            numScenarios,
            agentId,
            extraInstructions,
            firstMessage,
            folderPath,
            generateExpectedOutcomes,
            inboundPhoneNumber,
            personalities,
            scenarioType,
            tags,
            testProfile,
            toolIds,
            mutableMapOf(),
        )

        /**
         * How many scenarios to generate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numScenarios(): Long = numScenarios.getRequired("num_scenarios")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentId(): Optional<Long> = agentId.getOptional("agent_id")

        /**
         * Optional guidance steering scenario generation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extraInstructions(): Optional<String> =
            extraInstructions.getOptional("extra_instructions")

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
         * Whether to generate expected-outcome prompts for the scenarios.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun generateExpectedOutcomes(): Optional<Boolean> =
            generateExpectedOutcomes.getOptional("generate_expected_outcomes")

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
        fun personalities(): Optional<List<Long>> = personalities.getOptional("personalities")

        /**
         * Type of scenario to generate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarioType(): Optional<ScenarioType> = scenarioType.getOptional("scenario_type")

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
         * Returns the raw JSON value of [numScenarios].
         *
         * Unlike [numScenarios], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("num_scenarios")
        @ExcludeMissing
        fun _numScenarios(): JsonField<Long> = numScenarios

        /**
         * Returns the raw JSON value of [agentId].
         *
         * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<Long> = agentId

        /**
         * Returns the raw JSON value of [extraInstructions].
         *
         * Unlike [extraInstructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extra_instructions")
        @ExcludeMissing
        fun _extraInstructions(): JsonField<String> = extraInstructions

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
         * Returns the raw JSON value of [generateExpectedOutcomes].
         *
         * Unlike [generateExpectedOutcomes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("generate_expected_outcomes")
        @ExcludeMissing
        fun _generateExpectedOutcomes(): JsonField<Boolean> = generateExpectedOutcomes

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
         * Returns the raw JSON value of [personalities].
         *
         * Unlike [personalities], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personalities")
        @ExcludeMissing
        fun _personalities(): JsonField<List<Long>> = personalities

        /**
         * Returns the raw JSON value of [scenarioType].
         *
         * Unlike [scenarioType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scenario_type")
        @ExcludeMissing
        fun _scenarioType(): JsonField<ScenarioType> = scenarioType

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .numScenarios()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var numScenarios: JsonField<Long>? = null
            private var agentId: JsonField<Long> = JsonMissing.of()
            private var extraInstructions: JsonField<String> = JsonMissing.of()
            private var firstMessage: JsonField<String> = JsonMissing.of()
            private var folderPath: JsonField<String> = JsonMissing.of()
            private var generateExpectedOutcomes: JsonField<Boolean> = JsonMissing.of()
            private var inboundPhoneNumber: JsonField<Long> = JsonMissing.of()
            private var personalities: JsonField<MutableList<Long>>? = null
            private var scenarioType: JsonField<ScenarioType> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var testProfile: JsonField<Long> = JsonMissing.of()
            private var toolIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                numScenarios = body.numScenarios
                agentId = body.agentId
                extraInstructions = body.extraInstructions
                firstMessage = body.firstMessage
                folderPath = body.folderPath
                generateExpectedOutcomes = body.generateExpectedOutcomes
                inboundPhoneNumber = body.inboundPhoneNumber
                personalities = body.personalities.map { it.toMutableList() }
                scenarioType = body.scenarioType
                tags = body.tags.map { it.toMutableList() }
                testProfile = body.testProfile
                toolIds = body.toolIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** How many scenarios to generate. */
            fun numScenarios(numScenarios: Long) = numScenarios(JsonField.of(numScenarios))

            /**
             * Sets [Builder.numScenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numScenarios] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numScenarios(numScenarios: JsonField<Long>) = apply {
                this.numScenarios = numScenarios
            }

            fun agentId(agentId: Long) = agentId(JsonField.of(agentId))

            /**
             * Sets [Builder.agentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentId(agentId: JsonField<Long>) = apply { this.agentId = agentId }

            /** Optional guidance steering scenario generation. */
            fun extraInstructions(extraInstructions: String) =
                extraInstructions(JsonField.of(extraInstructions))

            /**
             * Sets [Builder.extraInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extraInstructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extraInstructions(extraInstructions: JsonField<String>) = apply {
                this.extraInstructions = extraInstructions
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

            /** Whether to generate expected-outcome prompts for the scenarios. */
            fun generateExpectedOutcomes(generateExpectedOutcomes: Boolean) =
                generateExpectedOutcomes(JsonField.of(generateExpectedOutcomes))

            /**
             * Sets [Builder.generateExpectedOutcomes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.generateExpectedOutcomes] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun generateExpectedOutcomes(generateExpectedOutcomes: JsonField<Boolean>) = apply {
                this.generateExpectedOutcomes = generateExpectedOutcomes
            }

            fun inboundPhoneNumber(inboundPhoneNumber: Long?) =
                inboundPhoneNumber(JsonField.ofNullable(inboundPhoneNumber))

            /**
             * Alias for [Builder.inboundPhoneNumber].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inboundPhoneNumber(inboundPhoneNumber: Long) =
                inboundPhoneNumber(inboundPhoneNumber as Long?)

            /**
             * Alias for calling [Builder.inboundPhoneNumber] with
             * `inboundPhoneNumber.orElse(null)`.
             */
            fun inboundPhoneNumber(inboundPhoneNumber: Optional<Long>) =
                inboundPhoneNumber(inboundPhoneNumber.getOrNull())

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

            fun personalities(personalities: List<Long>) =
                personalities(JsonField.of(personalities))

            /**
             * Sets [Builder.personalities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personalities] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personalities(personalities: JsonField<List<Long>>) = apply {
                this.personalities = personalities.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [personalities].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPersonality(personality: Long) = apply {
                personalities =
                    (personalities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("personalities", it).add(personality)
                    }
            }

            /** Type of scenario to generate. */
            fun scenarioType(scenarioType: ScenarioType) = scenarioType(JsonField.of(scenarioType))

            /**
             * Sets [Builder.scenarioType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarioType] with a well-typed [ScenarioType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarioType(scenarioType: JsonField<ScenarioType>) = apply {
                this.scenarioType = scenarioType
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
             *
             * The following fields are required:
             * ```java
             * .numScenarios()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("numScenarios", numScenarios),
                    agentId,
                    extraInstructions,
                    firstMessage,
                    folderPath,
                    generateExpectedOutcomes,
                    inboundPhoneNumber,
                    (personalities ?: JsonMissing.of()).map { it.toImmutable() },
                    scenarioType,
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

            numScenarios()
            agentId()
            extraInstructions()
            firstMessage()
            folderPath()
            generateExpectedOutcomes()
            inboundPhoneNumber()
            personalities()
            scenarioType().ifPresent { it.validate() }
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
            (if (numScenarios.asKnown().isPresent) 1 else 0) +
                (if (agentId.asKnown().isPresent) 1 else 0) +
                (if (extraInstructions.asKnown().isPresent) 1 else 0) +
                (if (firstMessage.asKnown().isPresent) 1 else 0) +
                (if (folderPath.asKnown().isPresent) 1 else 0) +
                (if (generateExpectedOutcomes.asKnown().isPresent) 1 else 0) +
                (if (inboundPhoneNumber.asKnown().isPresent) 1 else 0) +
                (personalities.asKnown().getOrNull()?.size ?: 0) +
                (scenarioType.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (testProfile.asKnown().isPresent) 1 else 0) +
                (toolIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                numScenarios == other.numScenarios &&
                agentId == other.agentId &&
                extraInstructions == other.extraInstructions &&
                firstMessage == other.firstMessage &&
                folderPath == other.folderPath &&
                generateExpectedOutcomes == other.generateExpectedOutcomes &&
                inboundPhoneNumber == other.inboundPhoneNumber &&
                personalities == other.personalities &&
                scenarioType == other.scenarioType &&
                tags == other.tags &&
                testProfile == other.testProfile &&
                toolIds == other.toolIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                numScenarios,
                agentId,
                extraInstructions,
                firstMessage,
                folderPath,
                generateExpectedOutcomes,
                inboundPhoneNumber,
                personalities,
                scenarioType,
                tags,
                testProfile,
                toolIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{numScenarios=$numScenarios, agentId=$agentId, extraInstructions=$extraInstructions, firstMessage=$firstMessage, folderPath=$folderPath, generateExpectedOutcomes=$generateExpectedOutcomes, inboundPhoneNumber=$inboundPhoneNumber, personalities=$personalities, scenarioType=$scenarioType, tags=$tags, testProfile=$testProfile, toolIds=$toolIds, additionalProperties=$additionalProperties}"
    }

    /** Type of scenario to generate. */
    class ScenarioType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WORKFLOW = of("workflow")

            @JvmField val RED_TEAMING_VOICE = of("red_teaming_voice")

            @JvmField val RED_TEAMING_TEXT = of("red_teaming_text")

            @JvmStatic fun of(value: String) = ScenarioType(JsonField.of(value))
        }

        /** An enum containing [ScenarioType]'s known values. */
        enum class Known {
            WORKFLOW,
            RED_TEAMING_VOICE,
            RED_TEAMING_TEXT,
        }

        /**
         * An enum containing [ScenarioType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScenarioType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WORKFLOW,
            RED_TEAMING_VOICE,
            RED_TEAMING_TEXT,
            /**
             * An enum member indicating that [ScenarioType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                WORKFLOW -> Value.WORKFLOW
                RED_TEAMING_VOICE -> Value.RED_TEAMING_VOICE
                RED_TEAMING_TEXT -> Value.RED_TEAMING_TEXT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                WORKFLOW -> Known.WORKFLOW
                RED_TEAMING_VOICE -> Known.RED_TEAMING_VOICE
                RED_TEAMING_TEXT -> Known.RED_TEAMING_TEXT
                else -> throw TelnyxInvalidDataException("Unknown ScenarioType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
        fun validate(): ScenarioType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScenarioType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioGenerateBgParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScenarioGenerateBgParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
