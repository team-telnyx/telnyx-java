// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates the specified test agent. */
class AiagentUpdateParams
private constructor(
    private val id: Long?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<Long> = Optional.ofNullable(id)

    /**
     * Name of the test agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentName(): Optional<String> = body.agentName()

    /**
     * ID of the Telnyx AI assistant under test.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistantId(): Optional<String> = body.assistantId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoFetchCallsEnabled(): Optional<Boolean> = body.autoFetchCallsEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoSyncPromptEnabled(): Optional<Boolean> = body.autoSyncPromptEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoUpdateDropoffNodes(): Optional<Boolean> = body.autoUpdateDropoffNodes()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoUpdateTopicNodes(): Optional<Boolean> = body.autoUpdateTopicNodes()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactNumber(): Optional<String> = body.contactNumber()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<Boolean> = body.inbound()

    /**
     * ISO language code the test agent converses in.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmMaxTokens(): Optional<Long> = body.llmMaxTokens()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmModel(): Optional<String> = body.llmModel()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmSystemPrompt(): Optional<String> = body.llmSystemPrompt()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmTemperature(): Optional<Double> = body.llmTemperature()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundAutoCall(): Optional<Boolean> = body.outboundAutoCall()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipEndpoint(): Optional<String> = body.sipEndpoint()

    /**
     * Returns the raw JSON value of [agentName].
     *
     * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentName(): JsonField<String> = body._agentName()

    /**
     * Returns the raw JSON value of [assistantId].
     *
     * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assistantId(): JsonField<String> = body._assistantId()

    /**
     * Returns the raw JSON value of [autoFetchCallsEnabled].
     *
     * Unlike [autoFetchCallsEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoFetchCallsEnabled(): JsonField<Boolean> = body._autoFetchCallsEnabled()

    /**
     * Returns the raw JSON value of [autoSyncPromptEnabled].
     *
     * Unlike [autoSyncPromptEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoSyncPromptEnabled(): JsonField<Boolean> = body._autoSyncPromptEnabled()

    /**
     * Returns the raw JSON value of [autoUpdateDropoffNodes].
     *
     * Unlike [autoUpdateDropoffNodes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _autoUpdateDropoffNodes(): JsonField<Boolean> = body._autoUpdateDropoffNodes()

    /**
     * Returns the raw JSON value of [autoUpdateTopicNodes].
     *
     * Unlike [autoUpdateTopicNodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoUpdateTopicNodes(): JsonField<Boolean> = body._autoUpdateTopicNodes()

    /**
     * Returns the raw JSON value of [contactNumber].
     *
     * Unlike [contactNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactNumber(): JsonField<String> = body._contactNumber()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inbound(): JsonField<Boolean> = body._inbound()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [llmMaxTokens].
     *
     * Unlike [llmMaxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmMaxTokens(): JsonField<Long> = body._llmMaxTokens()

    /**
     * Returns the raw JSON value of [llmModel].
     *
     * Unlike [llmModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmModel(): JsonField<String> = body._llmModel()

    /**
     * Returns the raw JSON value of [llmSystemPrompt].
     *
     * Unlike [llmSystemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmSystemPrompt(): JsonField<String> = body._llmSystemPrompt()

    /**
     * Returns the raw JSON value of [llmTemperature].
     *
     * Unlike [llmTemperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmTemperature(): JsonField<Double> = body._llmTemperature()

    /**
     * Returns the raw JSON value of [outboundAutoCall].
     *
     * Unlike [outboundAutoCall], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _outboundAutoCall(): JsonField<Boolean> = body._outboundAutoCall()

    /**
     * Returns the raw JSON value of [sipEndpoint].
     *
     * Unlike [sipEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipEndpoint(): JsonField<String> = body._sipEndpoint()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AiagentUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AiagentUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiagentUpdateParams]. */
    class Builder internal constructor() {

        private var id: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aiagentUpdateParams: AiagentUpdateParams) = apply {
            id = aiagentUpdateParams.id
            body = aiagentUpdateParams.body.toBuilder()
            additionalHeaders = aiagentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiagentUpdateParams.additionalQueryParams.toBuilder()
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
         * - [agentName]
         * - [assistantId]
         * - [autoFetchCallsEnabled]
         * - [autoSyncPromptEnabled]
         * - [autoUpdateDropoffNodes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Name of the test agent. */
        fun agentName(agentName: String) = apply { body.agentName(agentName) }

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { body.agentName(agentName) }

        /** ID of the Telnyx AI assistant under test. */
        fun assistantId(assistantId: String) = apply { body.assistantId(assistantId) }

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { body.assistantId(assistantId) }

        fun autoFetchCallsEnabled(autoFetchCallsEnabled: Boolean) = apply {
            body.autoFetchCallsEnabled(autoFetchCallsEnabled)
        }

        /**
         * Sets [Builder.autoFetchCallsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoFetchCallsEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoFetchCallsEnabled(autoFetchCallsEnabled: JsonField<Boolean>) = apply {
            body.autoFetchCallsEnabled(autoFetchCallsEnabled)
        }

        fun autoSyncPromptEnabled(autoSyncPromptEnabled: Boolean) = apply {
            body.autoSyncPromptEnabled(autoSyncPromptEnabled)
        }

        /**
         * Sets [Builder.autoSyncPromptEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoSyncPromptEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoSyncPromptEnabled(autoSyncPromptEnabled: JsonField<Boolean>) = apply {
            body.autoSyncPromptEnabled(autoSyncPromptEnabled)
        }

        fun autoUpdateDropoffNodes(autoUpdateDropoffNodes: Boolean) = apply {
            body.autoUpdateDropoffNodes(autoUpdateDropoffNodes)
        }

        /**
         * Sets [Builder.autoUpdateDropoffNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoUpdateDropoffNodes] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun autoUpdateDropoffNodes(autoUpdateDropoffNodes: JsonField<Boolean>) = apply {
            body.autoUpdateDropoffNodes(autoUpdateDropoffNodes)
        }

        fun autoUpdateTopicNodes(autoUpdateTopicNodes: Boolean) = apply {
            body.autoUpdateTopicNodes(autoUpdateTopicNodes)
        }

        /**
         * Sets [Builder.autoUpdateTopicNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoUpdateTopicNodes] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoUpdateTopicNodes(autoUpdateTopicNodes: JsonField<Boolean>) = apply {
            body.autoUpdateTopicNodes(autoUpdateTopicNodes)
        }

        fun contactNumber(contactNumber: String) = apply { body.contactNumber(contactNumber) }

        /**
         * Sets [Builder.contactNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactNumber(contactNumber: JsonField<String>) = apply {
            body.contactNumber(contactNumber)
        }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun inbound(inbound: Boolean) = apply { body.inbound(inbound) }

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Boolean>) = apply { body.inbound(inbound) }

        /** ISO language code the test agent converses in. */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        fun llmMaxTokens(llmMaxTokens: Long) = apply { body.llmMaxTokens(llmMaxTokens) }

        /**
         * Sets [Builder.llmMaxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmMaxTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmMaxTokens(llmMaxTokens: JsonField<Long>) = apply { body.llmMaxTokens(llmMaxTokens) }

        fun llmModel(llmModel: String) = apply { body.llmModel(llmModel) }

        /**
         * Sets [Builder.llmModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmModel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun llmModel(llmModel: JsonField<String>) = apply { body.llmModel(llmModel) }

        fun llmSystemPrompt(llmSystemPrompt: String) = apply {
            body.llmSystemPrompt(llmSystemPrompt)
        }

        /**
         * Sets [Builder.llmSystemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmSystemPrompt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmSystemPrompt(llmSystemPrompt: JsonField<String>) = apply {
            body.llmSystemPrompt(llmSystemPrompt)
        }

        fun llmTemperature(llmTemperature: Double) = apply { body.llmTemperature(llmTemperature) }

        /**
         * Sets [Builder.llmTemperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmTemperature] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmTemperature(llmTemperature: JsonField<Double>) = apply {
            body.llmTemperature(llmTemperature)
        }

        fun outboundAutoCall(outboundAutoCall: Boolean) = apply {
            body.outboundAutoCall(outboundAutoCall)
        }

        /**
         * Sets [Builder.outboundAutoCall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundAutoCall] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outboundAutoCall(outboundAutoCall: JsonField<Boolean>) = apply {
            body.outboundAutoCall(outboundAutoCall)
        }

        fun sipEndpoint(sipEndpoint: String) = apply { body.sipEndpoint(sipEndpoint) }

        /**
         * Sets [Builder.sipEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipEndpoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipEndpoint(sipEndpoint: JsonField<String>) = apply { body.sipEndpoint(sipEndpoint) }

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
         * Returns an immutable instance of [AiagentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AiagentUpdateParams =
            AiagentUpdateParams(
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
        private val agentName: JsonField<String>,
        private val assistantId: JsonField<String>,
        private val autoFetchCallsEnabled: JsonField<Boolean>,
        private val autoSyncPromptEnabled: JsonField<Boolean>,
        private val autoUpdateDropoffNodes: JsonField<Boolean>,
        private val autoUpdateTopicNodes: JsonField<Boolean>,
        private val contactNumber: JsonField<String>,
        private val description: JsonField<String>,
        private val inbound: JsonField<Boolean>,
        private val language: JsonField<String>,
        private val llmMaxTokens: JsonField<Long>,
        private val llmModel: JsonField<String>,
        private val llmSystemPrompt: JsonField<String>,
        private val llmTemperature: JsonField<Double>,
        private val outboundAutoCall: JsonField<Boolean>,
        private val sipEndpoint: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_name")
            @ExcludeMissing
            agentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assistant_id")
            @ExcludeMissing
            assistantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_fetch_calls_enabled")
            @ExcludeMissing
            autoFetchCallsEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_sync_prompt_enabled")
            @ExcludeMissing
            autoSyncPromptEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_update_dropoff_nodes")
            @ExcludeMissing
            autoUpdateDropoffNodes: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_update_topic_nodes")
            @ExcludeMissing
            autoUpdateTopicNodes: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("contact_number")
            @ExcludeMissing
            contactNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_max_tokens")
            @ExcludeMissing
            llmMaxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("llm_model")
            @ExcludeMissing
            llmModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_system_prompt")
            @ExcludeMissing
            llmSystemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_temperature")
            @ExcludeMissing
            llmTemperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("outbound_auto_call")
            @ExcludeMissing
            outboundAutoCall: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sip_endpoint")
            @ExcludeMissing
            sipEndpoint: JsonField<String> = JsonMissing.of(),
        ) : this(
            agentName,
            assistantId,
            autoFetchCallsEnabled,
            autoSyncPromptEnabled,
            autoUpdateDropoffNodes,
            autoUpdateTopicNodes,
            contactNumber,
            description,
            inbound,
            language,
            llmMaxTokens,
            llmModel,
            llmSystemPrompt,
            llmTemperature,
            outboundAutoCall,
            sipEndpoint,
            mutableMapOf(),
        )

        /**
         * Name of the test agent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentName(): Optional<String> = agentName.getOptional("agent_name")

        /**
         * ID of the Telnyx AI assistant under test.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assistantId(): Optional<String> = assistantId.getOptional("assistant_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoFetchCallsEnabled(): Optional<Boolean> =
            autoFetchCallsEnabled.getOptional("auto_fetch_calls_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoSyncPromptEnabled(): Optional<Boolean> =
            autoSyncPromptEnabled.getOptional("auto_sync_prompt_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoUpdateDropoffNodes(): Optional<Boolean> =
            autoUpdateDropoffNodes.getOptional("auto_update_dropoff_nodes")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoUpdateTopicNodes(): Optional<Boolean> =
            autoUpdateTopicNodes.getOptional("auto_update_topic_nodes")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactNumber(): Optional<String> = contactNumber.getOptional("contact_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inbound(): Optional<Boolean> = inbound.getOptional("inbound")

        /**
         * ISO language code the test agent converses in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmMaxTokens(): Optional<Long> = llmMaxTokens.getOptional("llm_max_tokens")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmModel(): Optional<String> = llmModel.getOptional("llm_model")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmSystemPrompt(): Optional<String> = llmSystemPrompt.getOptional("llm_system_prompt")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmTemperature(): Optional<Double> = llmTemperature.getOptional("llm_temperature")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundAutoCall(): Optional<Boolean> =
            outboundAutoCall.getOptional("outbound_auto_call")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipEndpoint(): Optional<String> = sipEndpoint.getOptional("sip_endpoint")

        /**
         * Returns the raw JSON value of [agentName].
         *
         * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_name") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

        /**
         * Returns the raw JSON value of [assistantId].
         *
         * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assistant_id")
        @ExcludeMissing
        fun _assistantId(): JsonField<String> = assistantId

        /**
         * Returns the raw JSON value of [autoFetchCallsEnabled].
         *
         * Unlike [autoFetchCallsEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_fetch_calls_enabled")
        @ExcludeMissing
        fun _autoFetchCallsEnabled(): JsonField<Boolean> = autoFetchCallsEnabled

        /**
         * Returns the raw JSON value of [autoSyncPromptEnabled].
         *
         * Unlike [autoSyncPromptEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_sync_prompt_enabled")
        @ExcludeMissing
        fun _autoSyncPromptEnabled(): JsonField<Boolean> = autoSyncPromptEnabled

        /**
         * Returns the raw JSON value of [autoUpdateDropoffNodes].
         *
         * Unlike [autoUpdateDropoffNodes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_update_dropoff_nodes")
        @ExcludeMissing
        fun _autoUpdateDropoffNodes(): JsonField<Boolean> = autoUpdateDropoffNodes

        /**
         * Returns the raw JSON value of [autoUpdateTopicNodes].
         *
         * Unlike [autoUpdateTopicNodes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_update_topic_nodes")
        @ExcludeMissing
        fun _autoUpdateTopicNodes(): JsonField<Boolean> = autoUpdateTopicNodes

        /**
         * Returns the raw JSON value of [contactNumber].
         *
         * Unlike [contactNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_number")
        @ExcludeMissing
        fun _contactNumber(): JsonField<String> = contactNumber

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [inbound].
         *
         * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Boolean> = inbound

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [llmMaxTokens].
         *
         * Unlike [llmMaxTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_max_tokens")
        @ExcludeMissing
        fun _llmMaxTokens(): JsonField<Long> = llmMaxTokens

        /**
         * Returns the raw JSON value of [llmModel].
         *
         * Unlike [llmModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("llm_model") @ExcludeMissing fun _llmModel(): JsonField<String> = llmModel

        /**
         * Returns the raw JSON value of [llmSystemPrompt].
         *
         * Unlike [llmSystemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_system_prompt")
        @ExcludeMissing
        fun _llmSystemPrompt(): JsonField<String> = llmSystemPrompt

        /**
         * Returns the raw JSON value of [llmTemperature].
         *
         * Unlike [llmTemperature], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_temperature")
        @ExcludeMissing
        fun _llmTemperature(): JsonField<Double> = llmTemperature

        /**
         * Returns the raw JSON value of [outboundAutoCall].
         *
         * Unlike [outboundAutoCall], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("outbound_auto_call")
        @ExcludeMissing
        fun _outboundAutoCall(): JsonField<Boolean> = outboundAutoCall

        /**
         * Returns the raw JSON value of [sipEndpoint].
         *
         * Unlike [sipEndpoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_endpoint")
        @ExcludeMissing
        fun _sipEndpoint(): JsonField<String> = sipEndpoint

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

            private var agentName: JsonField<String> = JsonMissing.of()
            private var assistantId: JsonField<String> = JsonMissing.of()
            private var autoFetchCallsEnabled: JsonField<Boolean> = JsonMissing.of()
            private var autoSyncPromptEnabled: JsonField<Boolean> = JsonMissing.of()
            private var autoUpdateDropoffNodes: JsonField<Boolean> = JsonMissing.of()
            private var autoUpdateTopicNodes: JsonField<Boolean> = JsonMissing.of()
            private var contactNumber: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var inbound: JsonField<Boolean> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var llmMaxTokens: JsonField<Long> = JsonMissing.of()
            private var llmModel: JsonField<String> = JsonMissing.of()
            private var llmSystemPrompt: JsonField<String> = JsonMissing.of()
            private var llmTemperature: JsonField<Double> = JsonMissing.of()
            private var outboundAutoCall: JsonField<Boolean> = JsonMissing.of()
            private var sipEndpoint: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentName = body.agentName
                assistantId = body.assistantId
                autoFetchCallsEnabled = body.autoFetchCallsEnabled
                autoSyncPromptEnabled = body.autoSyncPromptEnabled
                autoUpdateDropoffNodes = body.autoUpdateDropoffNodes
                autoUpdateTopicNodes = body.autoUpdateTopicNodes
                contactNumber = body.contactNumber
                description = body.description
                inbound = body.inbound
                language = body.language
                llmMaxTokens = body.llmMaxTokens
                llmModel = body.llmModel
                llmSystemPrompt = body.llmSystemPrompt
                llmTemperature = body.llmTemperature
                outboundAutoCall = body.outboundAutoCall
                sipEndpoint = body.sipEndpoint
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the test agent. */
            fun agentName(agentName: String) = agentName(JsonField.of(agentName))

            /**
             * Sets [Builder.agentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

            /** ID of the Telnyx AI assistant under test. */
            fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

            /**
             * Sets [Builder.assistantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assistantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assistantId(assistantId: JsonField<String>) = apply {
                this.assistantId = assistantId
            }

            fun autoFetchCallsEnabled(autoFetchCallsEnabled: Boolean) =
                autoFetchCallsEnabled(JsonField.of(autoFetchCallsEnabled))

            /**
             * Sets [Builder.autoFetchCallsEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoFetchCallsEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoFetchCallsEnabled(autoFetchCallsEnabled: JsonField<Boolean>) = apply {
                this.autoFetchCallsEnabled = autoFetchCallsEnabled
            }

            fun autoSyncPromptEnabled(autoSyncPromptEnabled: Boolean) =
                autoSyncPromptEnabled(JsonField.of(autoSyncPromptEnabled))

            /**
             * Sets [Builder.autoSyncPromptEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoSyncPromptEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoSyncPromptEnabled(autoSyncPromptEnabled: JsonField<Boolean>) = apply {
                this.autoSyncPromptEnabled = autoSyncPromptEnabled
            }

            fun autoUpdateDropoffNodes(autoUpdateDropoffNodes: Boolean) =
                autoUpdateDropoffNodes(JsonField.of(autoUpdateDropoffNodes))

            /**
             * Sets [Builder.autoUpdateDropoffNodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoUpdateDropoffNodes] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoUpdateDropoffNodes(autoUpdateDropoffNodes: JsonField<Boolean>) = apply {
                this.autoUpdateDropoffNodes = autoUpdateDropoffNodes
            }

            fun autoUpdateTopicNodes(autoUpdateTopicNodes: Boolean) =
                autoUpdateTopicNodes(JsonField.of(autoUpdateTopicNodes))

            /**
             * Sets [Builder.autoUpdateTopicNodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoUpdateTopicNodes] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoUpdateTopicNodes(autoUpdateTopicNodes: JsonField<Boolean>) = apply {
                this.autoUpdateTopicNodes = autoUpdateTopicNodes
            }

            fun contactNumber(contactNumber: String) = contactNumber(JsonField.of(contactNumber))

            /**
             * Sets [Builder.contactNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactNumber(contactNumber: JsonField<String>) = apply {
                this.contactNumber = contactNumber
            }

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

            fun inbound(inbound: Boolean) = inbound(JsonField.of(inbound))

            /**
             * Sets [Builder.inbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inbound] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inbound(inbound: JsonField<Boolean>) = apply { this.inbound = inbound }

            /** ISO language code the test agent converses in. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            fun llmMaxTokens(llmMaxTokens: Long) = llmMaxTokens(JsonField.of(llmMaxTokens))

            /**
             * Sets [Builder.llmMaxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmMaxTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmMaxTokens(llmMaxTokens: JsonField<Long>) = apply {
                this.llmMaxTokens = llmMaxTokens
            }

            fun llmModel(llmModel: String) = llmModel(JsonField.of(llmModel))

            /**
             * Sets [Builder.llmModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmModel] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmModel(llmModel: JsonField<String>) = apply { this.llmModel = llmModel }

            fun llmSystemPrompt(llmSystemPrompt: String) =
                llmSystemPrompt(JsonField.of(llmSystemPrompt))

            /**
             * Sets [Builder.llmSystemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmSystemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmSystemPrompt(llmSystemPrompt: JsonField<String>) = apply {
                this.llmSystemPrompt = llmSystemPrompt
            }

            fun llmTemperature(llmTemperature: Double) =
                llmTemperature(JsonField.of(llmTemperature))

            /**
             * Sets [Builder.llmTemperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmTemperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmTemperature(llmTemperature: JsonField<Double>) = apply {
                this.llmTemperature = llmTemperature
            }

            fun outboundAutoCall(outboundAutoCall: Boolean) =
                outboundAutoCall(JsonField.of(outboundAutoCall))

            /**
             * Sets [Builder.outboundAutoCall] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundAutoCall] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outboundAutoCall(outboundAutoCall: JsonField<Boolean>) = apply {
                this.outboundAutoCall = outboundAutoCall
            }

            fun sipEndpoint(sipEndpoint: String) = sipEndpoint(JsonField.of(sipEndpoint))

            /**
             * Sets [Builder.sipEndpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipEndpoint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipEndpoint(sipEndpoint: JsonField<String>) = apply {
                this.sipEndpoint = sipEndpoint
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
                    agentName,
                    assistantId,
                    autoFetchCallsEnabled,
                    autoSyncPromptEnabled,
                    autoUpdateDropoffNodes,
                    autoUpdateTopicNodes,
                    contactNumber,
                    description,
                    inbound,
                    language,
                    llmMaxTokens,
                    llmModel,
                    llmSystemPrompt,
                    llmTemperature,
                    outboundAutoCall,
                    sipEndpoint,
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

            agentName()
            assistantId()
            autoFetchCallsEnabled()
            autoSyncPromptEnabled()
            autoUpdateDropoffNodes()
            autoUpdateTopicNodes()
            contactNumber()
            description()
            inbound()
            language()
            llmMaxTokens()
            llmModel()
            llmSystemPrompt()
            llmTemperature()
            outboundAutoCall()
            sipEndpoint()
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
            (if (agentName.asKnown().isPresent) 1 else 0) +
                (if (assistantId.asKnown().isPresent) 1 else 0) +
                (if (autoFetchCallsEnabled.asKnown().isPresent) 1 else 0) +
                (if (autoSyncPromptEnabled.asKnown().isPresent) 1 else 0) +
                (if (autoUpdateDropoffNodes.asKnown().isPresent) 1 else 0) +
                (if (autoUpdateTopicNodes.asKnown().isPresent) 1 else 0) +
                (if (contactNumber.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (inbound.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (llmMaxTokens.asKnown().isPresent) 1 else 0) +
                (if (llmModel.asKnown().isPresent) 1 else 0) +
                (if (llmSystemPrompt.asKnown().isPresent) 1 else 0) +
                (if (llmTemperature.asKnown().isPresent) 1 else 0) +
                (if (outboundAutoCall.asKnown().isPresent) 1 else 0) +
                (if (sipEndpoint.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agentName == other.agentName &&
                assistantId == other.assistantId &&
                autoFetchCallsEnabled == other.autoFetchCallsEnabled &&
                autoSyncPromptEnabled == other.autoSyncPromptEnabled &&
                autoUpdateDropoffNodes == other.autoUpdateDropoffNodes &&
                autoUpdateTopicNodes == other.autoUpdateTopicNodes &&
                contactNumber == other.contactNumber &&
                description == other.description &&
                inbound == other.inbound &&
                language == other.language &&
                llmMaxTokens == other.llmMaxTokens &&
                llmModel == other.llmModel &&
                llmSystemPrompt == other.llmSystemPrompt &&
                llmTemperature == other.llmTemperature &&
                outboundAutoCall == other.outboundAutoCall &&
                sipEndpoint == other.sipEndpoint &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agentName,
                assistantId,
                autoFetchCallsEnabled,
                autoSyncPromptEnabled,
                autoUpdateDropoffNodes,
                autoUpdateTopicNodes,
                contactNumber,
                description,
                inbound,
                language,
                llmMaxTokens,
                llmModel,
                llmSystemPrompt,
                llmTemperature,
                outboundAutoCall,
                sipEndpoint,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentName=$agentName, assistantId=$assistantId, autoFetchCallsEnabled=$autoFetchCallsEnabled, autoSyncPromptEnabled=$autoSyncPromptEnabled, autoUpdateDropoffNodes=$autoUpdateDropoffNodes, autoUpdateTopicNodes=$autoUpdateTopicNodes, contactNumber=$contactNumber, description=$description, inbound=$inbound, language=$language, llmMaxTokens=$llmMaxTokens, llmModel=$llmModel, llmSystemPrompt=$llmSystemPrompt, llmTemperature=$llmTemperature, outboundAutoCall=$outboundAutoCall, sipEndpoint=$sipEndpoint, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiagentUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AiagentUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
