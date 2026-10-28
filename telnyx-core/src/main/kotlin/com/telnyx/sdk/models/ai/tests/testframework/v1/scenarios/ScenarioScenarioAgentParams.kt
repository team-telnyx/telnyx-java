// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Starts an interactive session that improves selected evaluator scenarios from a natural-language
 * instruction. Returns a progress ID to poll with the improve-scenarios-progress endpoint.
 */
class ScenarioScenarioAgentParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Scenario IDs to improve, or the literal string 'all'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scenarios(): Scenarios = body.scenarios()

    /**
     * What the assistant should improve about the selected scenarios.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userMessage(): String = body.userMessage()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentId(): Optional<Long> = body.agentId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentResolutionResponse(): Optional<String> = body.agentResolutionResponse()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyChanges(): Optional<Boolean> = body.applyChanges()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<List<Context>> = body.context()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun knowledgeBase(): Optional<List<Long>> = body.knowledgeBase()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numScenarios(): Optional<Long> = body.numScenarios()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingToolCalls(): Optional<List<PendingToolCall>> = body.pendingToolCalls()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenariosNeedingAgent(): Optional<List<Long>> = body.scenariosNeedingAgent()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<Long> = body.sessionId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedScenarios(): Optional<List<UpdatedScenario>> = body.updatedScenarios()

    /**
     * Returns the raw JSON value of [scenarios].
     *
     * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scenarios(): JsonField<Scenarios> = body._scenarios()

    /**
     * Returns the raw JSON value of [userMessage].
     *
     * Unlike [userMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userMessage(): JsonField<String> = body._userMessage()

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentId(): JsonField<Long> = body._agentId()

    /**
     * Returns the raw JSON value of [agentResolutionResponse].
     *
     * Unlike [agentResolutionResponse], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _agentResolutionResponse(): JsonField<String> = body._agentResolutionResponse()

    /**
     * Returns the raw JSON value of [applyChanges].
     *
     * Unlike [applyChanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applyChanges(): JsonField<Boolean> = body._applyChanges()

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _context(): JsonField<List<Context>> = body._context()

    /**
     * Returns the raw JSON value of [knowledgeBase].
     *
     * Unlike [knowledgeBase], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _knowledgeBase(): JsonField<List<Long>> = body._knowledgeBase()

    /**
     * Returns the raw JSON value of [numScenarios].
     *
     * Unlike [numScenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numScenarios(): JsonField<Long> = body._numScenarios()

    /**
     * Returns the raw JSON value of [pendingToolCalls].
     *
     * Unlike [pendingToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _pendingToolCalls(): JsonField<List<PendingToolCall>> = body._pendingToolCalls()

    /**
     * Returns the raw JSON value of [scenariosNeedingAgent].
     *
     * Unlike [scenariosNeedingAgent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scenariosNeedingAgent(): JsonField<List<Long>> = body._scenariosNeedingAgent()

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sessionId(): JsonField<Long> = body._sessionId()

    /**
     * Returns the raw JSON value of [updatedScenarios].
     *
     * Unlike [updatedScenarios], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _updatedScenarios(): JsonField<List<UpdatedScenario>> = body._updatedScenarios()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScenarioScenarioAgentParams].
         *
         * The following fields are required:
         * ```java
         * .scenarios()
         * .userMessage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioScenarioAgentParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scenarioScenarioAgentParams: ScenarioScenarioAgentParams) = apply {
            body = scenarioScenarioAgentParams.body.toBuilder()
            additionalHeaders = scenarioScenarioAgentParams.additionalHeaders.toBuilder()
            additionalQueryParams = scenarioScenarioAgentParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [scenarios]
         * - [userMessage]
         * - [agentId]
         * - [agentResolutionResponse]
         * - [applyChanges]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Scenario IDs to improve, or the literal string 'all'. */
        fun scenarios(scenarios: Scenarios) = apply { body.scenarios(scenarios) }

        /**
         * Sets [Builder.scenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarios] with a well-typed [Scenarios] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scenarios(scenarios: JsonField<Scenarios>) = apply { body.scenarios(scenarios) }

        /** Alias for calling [scenarios] with `Scenarios.ofJsonValues(jsonValues)`. */
        fun scenariosOfJsonValues(jsonValues: List<JsonValue>) = apply {
            body.scenariosOfJsonValues(jsonValues)
        }

        /** Alias for calling [scenarios] with `Scenarios.ofString(string)`. */
        fun scenarios(string: String) = apply { body.scenarios(string) }

        /** What the assistant should improve about the selected scenarios. */
        fun userMessage(userMessage: String) = apply { body.userMessage(userMessage) }

        /**
         * Sets [Builder.userMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userMessage(userMessage: JsonField<String>) = apply { body.userMessage(userMessage) }

        fun agentId(agentId: Long?) = apply { body.agentId(agentId) }

        /**
         * Alias for [Builder.agentId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun agentId(agentId: Long) = agentId(agentId as Long?)

        /** Alias for calling [Builder.agentId] with `agentId.orElse(null)`. */
        fun agentId(agentId: Optional<Long>) = agentId(agentId.getOrNull())

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<Long>) = apply { body.agentId(agentId) }

        fun agentResolutionResponse(agentResolutionResponse: String) = apply {
            body.agentResolutionResponse(agentResolutionResponse)
        }

        /**
         * Sets [Builder.agentResolutionResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentResolutionResponse] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun agentResolutionResponse(agentResolutionResponse: JsonField<String>) = apply {
            body.agentResolutionResponse(agentResolutionResponse)
        }

        fun applyChanges(applyChanges: Boolean) = apply { body.applyChanges(applyChanges) }

        /**
         * Sets [Builder.applyChanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyChanges] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applyChanges(applyChanges: JsonField<Boolean>) = apply {
            body.applyChanges(applyChanges)
        }

        fun context(context: List<Context>?) = apply { body.context(context) }

        /** Alias for calling [Builder.context] with `context.orElse(null)`. */
        fun context(context: Optional<List<Context>>) = context(context.getOrNull())

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed `List<Context>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun context(context: JsonField<List<Context>>) = apply { body.context(context) }

        /**
         * Adds a single [Context] to [Builder.context].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContext(context: Context) = apply { body.addContext(context) }

        fun knowledgeBase(knowledgeBase: List<Long>) = apply { body.knowledgeBase(knowledgeBase) }

        /**
         * Sets [Builder.knowledgeBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.knowledgeBase] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun knowledgeBase(knowledgeBase: JsonField<List<Long>>) = apply {
            body.knowledgeBase(knowledgeBase)
        }

        /**
         * Adds a single [Long] to [Builder.knowledgeBase].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKnowledgeBase(knowledgeBase: Long) = apply { body.addKnowledgeBase(knowledgeBase) }

        fun numScenarios(numScenarios: Long) = apply { body.numScenarios(numScenarios) }

        /**
         * Sets [Builder.numScenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numScenarios] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numScenarios(numScenarios: JsonField<Long>) = apply { body.numScenarios(numScenarios) }

        fun pendingToolCalls(pendingToolCalls: List<PendingToolCall>?) = apply {
            body.pendingToolCalls(pendingToolCalls)
        }

        /** Alias for calling [Builder.pendingToolCalls] with `pendingToolCalls.orElse(null)`. */
        fun pendingToolCalls(pendingToolCalls: Optional<List<PendingToolCall>>) =
            pendingToolCalls(pendingToolCalls.getOrNull())

        /**
         * Sets [Builder.pendingToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingToolCalls] with a well-typed
         * `List<PendingToolCall>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun pendingToolCalls(pendingToolCalls: JsonField<List<PendingToolCall>>) = apply {
            body.pendingToolCalls(pendingToolCalls)
        }

        /**
         * Adds a single [PendingToolCall] to [pendingToolCalls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPendingToolCall(pendingToolCall: PendingToolCall) = apply {
            body.addPendingToolCall(pendingToolCall)
        }

        fun scenariosNeedingAgent(scenariosNeedingAgent: List<Long>) = apply {
            body.scenariosNeedingAgent(scenariosNeedingAgent)
        }

        /**
         * Sets [Builder.scenariosNeedingAgent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenariosNeedingAgent] with a well-typed `List<Long>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scenariosNeedingAgent(scenariosNeedingAgent: JsonField<List<Long>>) = apply {
            body.scenariosNeedingAgent(scenariosNeedingAgent)
        }

        /**
         * Adds a single [Long] to [Builder.scenariosNeedingAgent].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScenariosNeedingAgent(scenariosNeedingAgent: Long) = apply {
            body.addScenariosNeedingAgent(scenariosNeedingAgent)
        }

        fun sessionId(sessionId: Long?) = apply { body.sessionId(sessionId) }

        /**
         * Alias for [Builder.sessionId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sessionId(sessionId: Long) = sessionId(sessionId as Long?)

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<Long>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sessionId(sessionId: JsonField<Long>) = apply { body.sessionId(sessionId) }

        fun updatedScenarios(updatedScenarios: List<UpdatedScenario>) = apply {
            body.updatedScenarios(updatedScenarios)
        }

        /**
         * Sets [Builder.updatedScenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedScenarios] with a well-typed
         * `List<UpdatedScenario>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun updatedScenarios(updatedScenarios: JsonField<List<UpdatedScenario>>) = apply {
            body.updatedScenarios(updatedScenarios)
        }

        /**
         * Adds a single [UpdatedScenario] to [updatedScenarios].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatedScenario(updatedScenario: UpdatedScenario) = apply {
            body.addUpdatedScenario(updatedScenario)
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
         * Returns an immutable instance of [ScenarioScenarioAgentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scenarios()
         * .userMessage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScenarioScenarioAgentParams =
            ScenarioScenarioAgentParams(
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
        private val scenarios: JsonField<Scenarios>,
        private val userMessage: JsonField<String>,
        private val agentId: JsonField<Long>,
        private val agentResolutionResponse: JsonField<String>,
        private val applyChanges: JsonField<Boolean>,
        private val context: JsonField<List<Context>>,
        private val knowledgeBase: JsonField<List<Long>>,
        private val numScenarios: JsonField<Long>,
        private val pendingToolCalls: JsonField<List<PendingToolCall>>,
        private val scenariosNeedingAgent: JsonField<List<Long>>,
        private val sessionId: JsonField<Long>,
        private val updatedScenarios: JsonField<List<UpdatedScenario>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scenarios")
            @ExcludeMissing
            scenarios: JsonField<Scenarios> = JsonMissing.of(),
            @JsonProperty("user_message")
            @ExcludeMissing
            userMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent_resolution_response")
            @ExcludeMissing
            agentResolutionResponse: JsonField<String> = JsonMissing.of(),
            @JsonProperty("apply_changes")
            @ExcludeMissing
            applyChanges: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("context")
            @ExcludeMissing
            context: JsonField<List<Context>> = JsonMissing.of(),
            @JsonProperty("knowledge_base")
            @ExcludeMissing
            knowledgeBase: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("num_scenarios")
            @ExcludeMissing
            numScenarios: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pending_tool_calls")
            @ExcludeMissing
            pendingToolCalls: JsonField<List<PendingToolCall>> = JsonMissing.of(),
            @JsonProperty("scenarios_needing_agent")
            @ExcludeMissing
            scenariosNeedingAgent: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updated_scenarios")
            @ExcludeMissing
            updatedScenarios: JsonField<List<UpdatedScenario>> = JsonMissing.of(),
        ) : this(
            scenarios,
            userMessage,
            agentId,
            agentResolutionResponse,
            applyChanges,
            context,
            knowledgeBase,
            numScenarios,
            pendingToolCalls,
            scenariosNeedingAgent,
            sessionId,
            updatedScenarios,
            mutableMapOf(),
        )

        /**
         * Scenario IDs to improve, or the literal string 'all'.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scenarios(): Scenarios = scenarios.getRequired("scenarios")

        /**
         * What the assistant should improve about the selected scenarios.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userMessage(): String = userMessage.getRequired("user_message")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentId(): Optional<Long> = agentId.getOptional("agent_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentResolutionResponse(): Optional<String> =
            agentResolutionResponse.getOptional("agent_resolution_response")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applyChanges(): Optional<Boolean> = applyChanges.getOptional("apply_changes")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<List<Context>> = context.getOptional("context")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun knowledgeBase(): Optional<List<Long>> = knowledgeBase.getOptional("knowledge_base")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numScenarios(): Optional<Long> = numScenarios.getOptional("num_scenarios")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pendingToolCalls(): Optional<List<PendingToolCall>> =
            pendingToolCalls.getOptional("pending_tool_calls")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenariosNeedingAgent(): Optional<List<Long>> =
            scenariosNeedingAgent.getOptional("scenarios_needing_agent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sessionId(): Optional<Long> = sessionId.getOptional("session_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedScenarios(): Optional<List<UpdatedScenario>> =
            updatedScenarios.getOptional("updated_scenarios")

        /**
         * Returns the raw JSON value of [scenarios].
         *
         * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenarios")
        @ExcludeMissing
        fun _scenarios(): JsonField<Scenarios> = scenarios

        /**
         * Returns the raw JSON value of [userMessage].
         *
         * Unlike [userMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_message")
        @ExcludeMissing
        fun _userMessage(): JsonField<String> = userMessage

        /**
         * Returns the raw JSON value of [agentId].
         *
         * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<Long> = agentId

        /**
         * Returns the raw JSON value of [agentResolutionResponse].
         *
         * Unlike [agentResolutionResponse], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("agent_resolution_response")
        @ExcludeMissing
        fun _agentResolutionResponse(): JsonField<String> = agentResolutionResponse

        /**
         * Returns the raw JSON value of [applyChanges].
         *
         * Unlike [applyChanges], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("apply_changes")
        @ExcludeMissing
        fun _applyChanges(): JsonField<Boolean> = applyChanges

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<List<Context>> = context

        /**
         * Returns the raw JSON value of [knowledgeBase].
         *
         * Unlike [knowledgeBase], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("knowledge_base")
        @ExcludeMissing
        fun _knowledgeBase(): JsonField<List<Long>> = knowledgeBase

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
         * Returns the raw JSON value of [pendingToolCalls].
         *
         * Unlike [pendingToolCalls], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pending_tool_calls")
        @ExcludeMissing
        fun _pendingToolCalls(): JsonField<List<PendingToolCall>> = pendingToolCalls

        /**
         * Returns the raw JSON value of [scenariosNeedingAgent].
         *
         * Unlike [scenariosNeedingAgent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scenarios_needing_agent")
        @ExcludeMissing
        fun _scenariosNeedingAgent(): JsonField<List<Long>> = scenariosNeedingAgent

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<Long> = sessionId

        /**
         * Returns the raw JSON value of [updatedScenarios].
         *
         * Unlike [updatedScenarios], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("updated_scenarios")
        @ExcludeMissing
        fun _updatedScenarios(): JsonField<List<UpdatedScenario>> = updatedScenarios

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
             * .scenarios()
             * .userMessage()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var scenarios: JsonField<Scenarios>? = null
            private var userMessage: JsonField<String>? = null
            private var agentId: JsonField<Long> = JsonMissing.of()
            private var agentResolutionResponse: JsonField<String> = JsonMissing.of()
            private var applyChanges: JsonField<Boolean> = JsonMissing.of()
            private var context: JsonField<MutableList<Context>>? = null
            private var knowledgeBase: JsonField<MutableList<Long>>? = null
            private var numScenarios: JsonField<Long> = JsonMissing.of()
            private var pendingToolCalls: JsonField<MutableList<PendingToolCall>>? = null
            private var scenariosNeedingAgent: JsonField<MutableList<Long>>? = null
            private var sessionId: JsonField<Long> = JsonMissing.of()
            private var updatedScenarios: JsonField<MutableList<UpdatedScenario>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                scenarios = body.scenarios
                userMessage = body.userMessage
                agentId = body.agentId
                agentResolutionResponse = body.agentResolutionResponse
                applyChanges = body.applyChanges
                context = body.context.map { it.toMutableList() }
                knowledgeBase = body.knowledgeBase.map { it.toMutableList() }
                numScenarios = body.numScenarios
                pendingToolCalls = body.pendingToolCalls.map { it.toMutableList() }
                scenariosNeedingAgent = body.scenariosNeedingAgent.map { it.toMutableList() }
                sessionId = body.sessionId
                updatedScenarios = body.updatedScenarios.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Scenario IDs to improve, or the literal string 'all'. */
            fun scenarios(scenarios: Scenarios) = scenarios(JsonField.of(scenarios))

            /**
             * Sets [Builder.scenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarios] with a well-typed [Scenarios] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarios(scenarios: JsonField<Scenarios>) = apply { this.scenarios = scenarios }

            /** Alias for calling [scenarios] with `Scenarios.ofJsonValues(jsonValues)`. */
            fun scenariosOfJsonValues(jsonValues: List<JsonValue>) =
                scenarios(Scenarios.ofJsonValues(jsonValues))

            /** Alias for calling [scenarios] with `Scenarios.ofString(string)`. */
            fun scenarios(string: String) = scenarios(Scenarios.ofString(string))

            /** What the assistant should improve about the selected scenarios. */
            fun userMessage(userMessage: String) = userMessage(JsonField.of(userMessage))

            /**
             * Sets [Builder.userMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userMessage(userMessage: JsonField<String>) = apply {
                this.userMessage = userMessage
            }

            fun agentId(agentId: Long?) = agentId(JsonField.ofNullable(agentId))

            /**
             * Alias for [Builder.agentId].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun agentId(agentId: Long) = agentId(agentId as Long?)

            /** Alias for calling [Builder.agentId] with `agentId.orElse(null)`. */
            fun agentId(agentId: Optional<Long>) = agentId(agentId.getOrNull())

            /**
             * Sets [Builder.agentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentId(agentId: JsonField<Long>) = apply { this.agentId = agentId }

            fun agentResolutionResponse(agentResolutionResponse: String) =
                agentResolutionResponse(JsonField.of(agentResolutionResponse))

            /**
             * Sets [Builder.agentResolutionResponse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentResolutionResponse] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun agentResolutionResponse(agentResolutionResponse: JsonField<String>) = apply {
                this.agentResolutionResponse = agentResolutionResponse
            }

            fun applyChanges(applyChanges: Boolean) = applyChanges(JsonField.of(applyChanges))

            /**
             * Sets [Builder.applyChanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applyChanges] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applyChanges(applyChanges: JsonField<Boolean>) = apply {
                this.applyChanges = applyChanges
            }

            fun context(context: List<Context>?) = context(JsonField.ofNullable(context))

            /** Alias for calling [Builder.context] with `context.orElse(null)`. */
            fun context(context: Optional<List<Context>>) = context(context.getOrNull())

            /**
             * Sets [Builder.context] to an arbitrary JSON value.
             *
             * You should usually call [Builder.context] with a well-typed `List<Context>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<List<Context>>) = apply {
                this.context = context.map { it.toMutableList() }
            }

            /**
             * Adds a single [Context] to [Builder.context].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContext(context: Context) = apply {
                this.context =
                    (this.context ?: JsonField.of(mutableListOf())).also {
                        checkKnown("context", it).add(context)
                    }
            }

            fun knowledgeBase(knowledgeBase: List<Long>) =
                knowledgeBase(JsonField.of(knowledgeBase))

            /**
             * Sets [Builder.knowledgeBase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.knowledgeBase] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun knowledgeBase(knowledgeBase: JsonField<List<Long>>) = apply {
                this.knowledgeBase = knowledgeBase.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.knowledgeBase].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKnowledgeBase(knowledgeBase: Long) = apply {
                this.knowledgeBase =
                    (this.knowledgeBase ?: JsonField.of(mutableListOf())).also {
                        checkKnown("knowledgeBase", it).add(knowledgeBase)
                    }
            }

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

            fun pendingToolCalls(pendingToolCalls: List<PendingToolCall>?) =
                pendingToolCalls(JsonField.ofNullable(pendingToolCalls))

            /**
             * Alias for calling [Builder.pendingToolCalls] with `pendingToolCalls.orElse(null)`.
             */
            fun pendingToolCalls(pendingToolCalls: Optional<List<PendingToolCall>>) =
                pendingToolCalls(pendingToolCalls.getOrNull())

            /**
             * Sets [Builder.pendingToolCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingToolCalls] with a well-typed
             * `List<PendingToolCall>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun pendingToolCalls(pendingToolCalls: JsonField<List<PendingToolCall>>) = apply {
                this.pendingToolCalls = pendingToolCalls.map { it.toMutableList() }
            }

            /**
             * Adds a single [PendingToolCall] to [pendingToolCalls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPendingToolCall(pendingToolCall: PendingToolCall) = apply {
                pendingToolCalls =
                    (pendingToolCalls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pendingToolCalls", it).add(pendingToolCall)
                    }
            }

            fun scenariosNeedingAgent(scenariosNeedingAgent: List<Long>) =
                scenariosNeedingAgent(JsonField.of(scenariosNeedingAgent))

            /**
             * Sets [Builder.scenariosNeedingAgent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenariosNeedingAgent] with a well-typed
             * `List<Long>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun scenariosNeedingAgent(scenariosNeedingAgent: JsonField<List<Long>>) = apply {
                this.scenariosNeedingAgent = scenariosNeedingAgent.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.scenariosNeedingAgent].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScenariosNeedingAgent(scenariosNeedingAgent: Long) = apply {
                this.scenariosNeedingAgent =
                    (this.scenariosNeedingAgent ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scenariosNeedingAgent", it).add(scenariosNeedingAgent)
                    }
            }

            fun sessionId(sessionId: Long?) = sessionId(JsonField.ofNullable(sessionId))

            /**
             * Alias for [Builder.sessionId].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sessionId(sessionId: Long) = sessionId(sessionId as Long?)

            /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
            fun sessionId(sessionId: Optional<Long>) = sessionId(sessionId.getOrNull())

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<Long>) = apply { this.sessionId = sessionId }

            fun updatedScenarios(updatedScenarios: List<UpdatedScenario>) =
                updatedScenarios(JsonField.of(updatedScenarios))

            /**
             * Sets [Builder.updatedScenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedScenarios] with a well-typed
             * `List<UpdatedScenario>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun updatedScenarios(updatedScenarios: JsonField<List<UpdatedScenario>>) = apply {
                this.updatedScenarios = updatedScenarios.map { it.toMutableList() }
            }

            /**
             * Adds a single [UpdatedScenario] to [updatedScenarios].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUpdatedScenario(updatedScenario: UpdatedScenario) = apply {
                updatedScenarios =
                    (updatedScenarios ?: JsonField.of(mutableListOf())).also {
                        checkKnown("updatedScenarios", it).add(updatedScenario)
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
             * .scenarios()
             * .userMessage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("scenarios", scenarios),
                    checkRequired("userMessage", userMessage),
                    agentId,
                    agentResolutionResponse,
                    applyChanges,
                    (context ?: JsonMissing.of()).map { it.toImmutable() },
                    (knowledgeBase ?: JsonMissing.of()).map { it.toImmutable() },
                    numScenarios,
                    (pendingToolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                    (scenariosNeedingAgent ?: JsonMissing.of()).map { it.toImmutable() },
                    sessionId,
                    (updatedScenarios ?: JsonMissing.of()).map { it.toImmutable() },
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

            scenarios().validate()
            userMessage()
            agentId()
            agentResolutionResponse()
            applyChanges()
            context().ifPresent { it.forEach { it.validate() } }
            knowledgeBase()
            numScenarios()
            pendingToolCalls().ifPresent { it.forEach { it.validate() } }
            scenariosNeedingAgent()
            sessionId()
            updatedScenarios().ifPresent { it.forEach { it.validate() } }
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
            (scenarios.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userMessage.asKnown().isPresent) 1 else 0) +
                (if (agentId.asKnown().isPresent) 1 else 0) +
                (if (agentResolutionResponse.asKnown().isPresent) 1 else 0) +
                (if (applyChanges.asKnown().isPresent) 1 else 0) +
                (context.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (knowledgeBase.asKnown().getOrNull()?.size ?: 0) +
                (if (numScenarios.asKnown().isPresent) 1 else 0) +
                (pendingToolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (scenariosNeedingAgent.asKnown().getOrNull()?.size ?: 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (updatedScenarios.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                scenarios == other.scenarios &&
                userMessage == other.userMessage &&
                agentId == other.agentId &&
                agentResolutionResponse == other.agentResolutionResponse &&
                applyChanges == other.applyChanges &&
                context == other.context &&
                knowledgeBase == other.knowledgeBase &&
                numScenarios == other.numScenarios &&
                pendingToolCalls == other.pendingToolCalls &&
                scenariosNeedingAgent == other.scenariosNeedingAgent &&
                sessionId == other.sessionId &&
                updatedScenarios == other.updatedScenarios &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                scenarios,
                userMessage,
                agentId,
                agentResolutionResponse,
                applyChanges,
                context,
                knowledgeBase,
                numScenarios,
                pendingToolCalls,
                scenariosNeedingAgent,
                sessionId,
                updatedScenarios,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{scenarios=$scenarios, userMessage=$userMessage, agentId=$agentId, agentResolutionResponse=$agentResolutionResponse, applyChanges=$applyChanges, context=$context, knowledgeBase=$knowledgeBase, numScenarios=$numScenarios, pendingToolCalls=$pendingToolCalls, scenariosNeedingAgent=$scenariosNeedingAgent, sessionId=$sessionId, updatedScenarios=$updatedScenarios, additionalProperties=$additionalProperties}"
    }

    /** Scenario IDs to improve, or the literal string 'all'. */
    @JsonDeserialize(using = Scenarios.Deserializer::class)
    @JsonSerialize(using = Scenarios.Serializer::class)
    class Scenarios
    private constructor(
        private val jsonValues: List<JsonValue>? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Scenario IDs to improve, or the literal string 'all'. */
        fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

        /** Scenario IDs to improve, or the literal string 'all'. */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isJsonValues(): Boolean = jsonValues != null

        fun isString(): Boolean = string != null

        /** Scenario IDs to improve, or the literal string 'all'. */
        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        /** Scenario IDs to improve, or the literal string 'all'. */
        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = scenarios.accept(new Scenarios.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitJsonValues(List<JsonValue> jsonValues) {
         *         return Optional.of(jsonValues.toString());
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
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
        fun validate(): Scenarios = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

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
                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scenarios && jsonValues == other.jsonValues && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(jsonValues, string)

        override fun toString(): String =
            when {
                jsonValues != null -> "Scenarios{jsonValues=$jsonValues}"
                string != null -> "Scenarios{string=$string}"
                _json != null -> "Scenarios{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Scenarios")
            }

        companion object {

            /** Scenario IDs to improve, or the literal string 'all'. */
            @JvmStatic
            fun ofJsonValues(jsonValues: List<JsonValue>) =
                Scenarios(jsonValues = jsonValues.toImmutable())

            /** Scenario IDs to improve, or the literal string 'all'. */
            @JvmStatic fun ofString(string: String) = Scenarios(string = string)
        }

        /**
         * An interface that defines how to map each variant of [Scenarios] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Scenario IDs to improve, or the literal string 'all'. */
            fun visitJsonValues(jsonValues: List<JsonValue>): T

            /** Scenario IDs to improve, or the literal string 'all'. */
            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Scenarios] to a value of type [T].
             *
             * An instance of [Scenarios] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Scenarios: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Scenarios>(Scenarios::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Scenarios {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Scenarios(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Scenarios(jsonValues = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Scenarios(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Scenarios>(Scenarios::class) {

            override fun serialize(
                value: Scenarios,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Scenarios")
                }
            }
        }
    }

    class Context
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val content: JsonField<String>,
        private val role: JsonField<String>,
        private val timestamp: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<String> = JsonMissing.of(),
        ) : this(content, role, timestamp, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun role(): Optional<String> = role.getOptional("role")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

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

            /** Returns a mutable builder for constructing an instance of [Context]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Context]. */
        class Builder internal constructor() {

            private var content: JsonField<String> = JsonMissing.of()
            private var role: JsonField<String> = JsonMissing.of()
            private var timestamp: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(context: Context) = apply {
                content = context.content
                role = context.role
                timestamp = context.timestamp
                additionalProperties = context.additionalProperties.toMutableMap()
            }

            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            fun role(role: String) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<String>) = apply { this.role = role }

            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

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
             * Returns an immutable instance of [Context].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Context =
                Context(content, role, timestamp, additionalProperties.toMutableMap())
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
        fun validate(): Context = apply {
            if (validated) {
                return@apply
            }

            content()
            role()
            timestamp()
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
            (if (content.asKnown().isPresent) 1 else 0) +
                (if (role.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Context &&
                content == other.content &&
                role == other.role &&
                timestamp == other.timestamp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(content, role, timestamp, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Context{content=$content, role=$role, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    class PendingToolCall
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PendingToolCall]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PendingToolCall]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pendingToolCall: PendingToolCall) = apply {
                additionalProperties = pendingToolCall.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PendingToolCall].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PendingToolCall = PendingToolCall(additionalProperties.toImmutable())
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
        fun validate(): PendingToolCall = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PendingToolCall && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PendingToolCall{additionalProperties=$additionalProperties}"
    }

    class UpdatedScenario
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UpdatedScenario]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdatedScenario]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updatedScenario: UpdatedScenario) = apply {
                additionalProperties = updatedScenario.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UpdatedScenario].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UpdatedScenario = UpdatedScenario(additionalProperties.toImmutable())
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
        fun validate(): UpdatedScenario = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedScenario && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UpdatedScenario{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioScenarioAgentParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScenarioScenarioAgentParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
