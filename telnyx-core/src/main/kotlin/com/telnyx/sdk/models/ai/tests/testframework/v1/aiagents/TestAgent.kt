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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TestAgent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val agentName: JsonField<String>,
    private val assistantId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val autoUpdateDropoffNodes: JsonField<Boolean>,
    private val autoUpdateTopicNodes: JsonField<Boolean>,
    private val chatAssistantId: JsonField<String>,
    private val contactNumber: JsonField<String>,
    private val description: JsonField<String>,
    private val enabledPersonalities: JsonField<List<Long>>,
    private val hallucinationMetricKbFiles: JsonField<List<Long>>,
    private val inbound: JsonField<Boolean>,
    private val knowledgeBaseFiles: JsonField<List<JsonValue>>,
    private val language: JsonField<String>,
    private val llmMaxTokens: JsonField<Long>,
    private val llmModel: JsonField<String>,
    private val llmSystemPrompt: JsonField<String>,
    private val llmTemperature: JsonField<Double>,
    private val outboundAutoCall: JsonField<Boolean>,
    private val outboundNumbers: JsonField<List<JsonValue>>,
    private val sipAuth: JsonField<SipAuth>,
    private val sipEndpoint: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("agent_name") @ExcludeMissing agentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assistant_id")
        @ExcludeMissing
        assistantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("auto_update_dropoff_nodes")
        @ExcludeMissing
        autoUpdateDropoffNodes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("auto_update_topic_nodes")
        @ExcludeMissing
        autoUpdateTopicNodes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("chat_assistant_id")
        @ExcludeMissing
        chatAssistantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_number")
        @ExcludeMissing
        contactNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled_personalities")
        @ExcludeMissing
        enabledPersonalities: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("hallucination_metric_kb_files")
        @ExcludeMissing
        hallucinationMetricKbFiles: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("knowledge_base_files")
        @ExcludeMissing
        knowledgeBaseFiles: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llm_max_tokens")
        @ExcludeMissing
        llmMaxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("llm_model") @ExcludeMissing llmModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llm_system_prompt")
        @ExcludeMissing
        llmSystemPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llm_temperature")
        @ExcludeMissing
        llmTemperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("outbound_auto_call")
        @ExcludeMissing
        outboundAutoCall: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("outbound_numbers")
        @ExcludeMissing
        outboundNumbers: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("sip_auth") @ExcludeMissing sipAuth: JsonField<SipAuth> = JsonMissing.of(),
        @JsonProperty("sip_endpoint")
        @ExcludeMissing
        sipEndpoint: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        agentName,
        assistantId,
        createdAt,
        updatedAt,
        autoUpdateDropoffNodes,
        autoUpdateTopicNodes,
        chatAssistantId,
        contactNumber,
        description,
        enabledPersonalities,
        hallucinationMetricKbFiles,
        inbound,
        knowledgeBaseFiles,
        language,
        llmMaxTokens,
        llmModel,
        llmSystemPrompt,
        llmTemperature,
        outboundAutoCall,
        outboundNumbers,
        sipAuth,
        sipEndpoint,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * Name of the test agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentName(): String = agentName.getRequired("agent_name")

    /**
     * ID of the Telnyx AI assistant under test.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assistantId(): String = assistantId.getRequired("assistant_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

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
     * ID of the chat assistant under test, when testing text channels.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatAssistantId(): Optional<String> = chatAssistantId.getOptional("chat_assistant_id")

    /**
     * Contact phone number for the test agent.
     *
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
     * IDs of the test personalities enabled for this agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledPersonalities(): Optional<List<Long>> =
        enabledPersonalities.getOptional("enabled_personalities")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hallucinationMetricKbFiles(): Optional<List<Long>> =
        hallucinationMetricKbFiles.getOptional("hallucination_metric_kb_files")

    /**
     * Whether the test agent accepts inbound calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<Boolean> = inbound.getOptional("inbound")

    /**
     * Knowledge-base files associated with the test agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun knowledgeBaseFiles(): Optional<List<JsonValue>> =
        knowledgeBaseFiles.getOptional("knowledge_base_files")

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
     * Model used to drive the test agent's side of the conversation.
     *
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
    fun outboundAutoCall(): Optional<Boolean> = outboundAutoCall.getOptional("outbound_auto_call")

    /**
     * Outbound numbers associated with the test agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundNumbers(): Optional<List<JsonValue>> =
        outboundNumbers.getOptional("outbound_numbers")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuth(): Optional<SipAuth> = sipAuth.getOptional("sip_auth")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipEndpoint(): Optional<String> = sipEndpoint.getOptional("sip_endpoint")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
     * Unlike [autoUpdateTopicNodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("auto_update_topic_nodes")
    @ExcludeMissing
    fun _autoUpdateTopicNodes(): JsonField<Boolean> = autoUpdateTopicNodes

    /**
     * Returns the raw JSON value of [chatAssistantId].
     *
     * Unlike [chatAssistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_assistant_id")
    @ExcludeMissing
    fun _chatAssistantId(): JsonField<String> = chatAssistantId

    /**
     * Returns the raw JSON value of [contactNumber].
     *
     * Unlike [contactNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_number")
    @ExcludeMissing
    fun _contactNumber(): JsonField<String> = contactNumber

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [enabledPersonalities].
     *
     * Unlike [enabledPersonalities], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enabled_personalities")
    @ExcludeMissing
    fun _enabledPersonalities(): JsonField<List<Long>> = enabledPersonalities

    /**
     * Returns the raw JSON value of [hallucinationMetricKbFiles].
     *
     * Unlike [hallucinationMetricKbFiles], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hallucination_metric_kb_files")
    @ExcludeMissing
    fun _hallucinationMetricKbFiles(): JsonField<List<Long>> = hallucinationMetricKbFiles

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Boolean> = inbound

    /**
     * Returns the raw JSON value of [knowledgeBaseFiles].
     *
     * Unlike [knowledgeBaseFiles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("knowledge_base_files")
    @ExcludeMissing
    fun _knowledgeBaseFiles(): JsonField<List<JsonValue>> = knowledgeBaseFiles

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [llmMaxTokens].
     *
     * Unlike [llmMaxTokens], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [llmSystemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_system_prompt")
    @ExcludeMissing
    fun _llmSystemPrompt(): JsonField<String> = llmSystemPrompt

    /**
     * Returns the raw JSON value of [llmTemperature].
     *
     * Unlike [llmTemperature], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [outboundNumbers].
     *
     * Unlike [outboundNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outbound_numbers")
    @ExcludeMissing
    fun _outboundNumbers(): JsonField<List<JsonValue>> = outboundNumbers

    /**
     * Returns the raw JSON value of [sipAuth].
     *
     * Unlike [sipAuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sip_auth") @ExcludeMissing fun _sipAuth(): JsonField<SipAuth> = sipAuth

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

        /**
         * Returns a mutable builder for constructing an instance of [TestAgent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agentName()
         * .assistantId()
         * .createdAt()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestAgent]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var agentName: JsonField<String>? = null
        private var assistantId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var autoUpdateDropoffNodes: JsonField<Boolean> = JsonMissing.of()
        private var autoUpdateTopicNodes: JsonField<Boolean> = JsonMissing.of()
        private var chatAssistantId: JsonField<String> = JsonMissing.of()
        private var contactNumber: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var enabledPersonalities: JsonField<MutableList<Long>>? = null
        private var hallucinationMetricKbFiles: JsonField<MutableList<Long>>? = null
        private var inbound: JsonField<Boolean> = JsonMissing.of()
        private var knowledgeBaseFiles: JsonField<MutableList<JsonValue>>? = null
        private var language: JsonField<String> = JsonMissing.of()
        private var llmMaxTokens: JsonField<Long> = JsonMissing.of()
        private var llmModel: JsonField<String> = JsonMissing.of()
        private var llmSystemPrompt: JsonField<String> = JsonMissing.of()
        private var llmTemperature: JsonField<Double> = JsonMissing.of()
        private var outboundAutoCall: JsonField<Boolean> = JsonMissing.of()
        private var outboundNumbers: JsonField<MutableList<JsonValue>>? = null
        private var sipAuth: JsonField<SipAuth> = JsonMissing.of()
        private var sipEndpoint: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(testAgent: TestAgent) = apply {
            id = testAgent.id
            agentName = testAgent.agentName
            assistantId = testAgent.assistantId
            createdAt = testAgent.createdAt
            updatedAt = testAgent.updatedAt
            autoUpdateDropoffNodes = testAgent.autoUpdateDropoffNodes
            autoUpdateTopicNodes = testAgent.autoUpdateTopicNodes
            chatAssistantId = testAgent.chatAssistantId
            contactNumber = testAgent.contactNumber
            description = testAgent.description
            enabledPersonalities = testAgent.enabledPersonalities.map { it.toMutableList() }
            hallucinationMetricKbFiles =
                testAgent.hallucinationMetricKbFiles.map { it.toMutableList() }
            inbound = testAgent.inbound
            knowledgeBaseFiles = testAgent.knowledgeBaseFiles.map { it.toMutableList() }
            language = testAgent.language
            llmMaxTokens = testAgent.llmMaxTokens
            llmModel = testAgent.llmModel
            llmSystemPrompt = testAgent.llmSystemPrompt
            llmTemperature = testAgent.llmTemperature
            outboundAutoCall = testAgent.outboundAutoCall
            outboundNumbers = testAgent.outboundNumbers.map { it.toMutableList() }
            sipAuth = testAgent.sipAuth
            sipEndpoint = testAgent.sipEndpoint
            additionalProperties = testAgent.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Name of the test agent. */
        fun agentName(agentName: String) = agentName(JsonField.of(agentName))

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

        /** ID of the Telnyx AI assistant under test. */
        fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { this.assistantId = assistantId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun autoUpdateDropoffNodes(autoUpdateDropoffNodes: Boolean) =
            autoUpdateDropoffNodes(JsonField.of(autoUpdateDropoffNodes))

        /**
         * Sets [Builder.autoUpdateDropoffNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoUpdateDropoffNodes] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun autoUpdateDropoffNodes(autoUpdateDropoffNodes: JsonField<Boolean>) = apply {
            this.autoUpdateDropoffNodes = autoUpdateDropoffNodes
        }

        fun autoUpdateTopicNodes(autoUpdateTopicNodes: Boolean) =
            autoUpdateTopicNodes(JsonField.of(autoUpdateTopicNodes))

        /**
         * Sets [Builder.autoUpdateTopicNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoUpdateTopicNodes] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoUpdateTopicNodes(autoUpdateTopicNodes: JsonField<Boolean>) = apply {
            this.autoUpdateTopicNodes = autoUpdateTopicNodes
        }

        /** ID of the chat assistant under test, when testing text channels. */
        fun chatAssistantId(chatAssistantId: String) =
            chatAssistantId(JsonField.of(chatAssistantId))

        /**
         * Sets [Builder.chatAssistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatAssistantId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chatAssistantId(chatAssistantId: JsonField<String>) = apply {
            this.chatAssistantId = chatAssistantId
        }

        /** Contact phone number for the test agent. */
        fun contactNumber(contactNumber: String) = contactNumber(JsonField.of(contactNumber))

        /**
         * Sets [Builder.contactNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactNumber(contactNumber: JsonField<String>) = apply {
            this.contactNumber = contactNumber
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** IDs of the test personalities enabled for this agent. */
        fun enabledPersonalities(enabledPersonalities: List<Long>) =
            enabledPersonalities(JsonField.of(enabledPersonalities))

        /**
         * Sets [Builder.enabledPersonalities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledPersonalities] with a well-typed `List<Long>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enabledPersonalities(enabledPersonalities: JsonField<List<Long>>) = apply {
            this.enabledPersonalities = enabledPersonalities.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [enabledPersonalities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledPersonality(enabledPersonality: Long) = apply {
            enabledPersonalities =
                (enabledPersonalities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enabledPersonalities", it).add(enabledPersonality)
                }
        }

        fun hallucinationMetricKbFiles(hallucinationMetricKbFiles: List<Long>) =
            hallucinationMetricKbFiles(JsonField.of(hallucinationMetricKbFiles))

        /**
         * Sets [Builder.hallucinationMetricKbFiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hallucinationMetricKbFiles] with a well-typed
         * `List<Long>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun hallucinationMetricKbFiles(hallucinationMetricKbFiles: JsonField<List<Long>>) = apply {
            this.hallucinationMetricKbFiles = hallucinationMetricKbFiles.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [hallucinationMetricKbFiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHallucinationMetricKbFile(hallucinationMetricKbFile: Long) = apply {
            hallucinationMetricKbFiles =
                (hallucinationMetricKbFiles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("hallucinationMetricKbFiles", it).add(hallucinationMetricKbFile)
                }
        }

        /** Whether the test agent accepts inbound calls. */
        fun inbound(inbound: Boolean) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Boolean>) = apply { this.inbound = inbound }

        /** Knowledge-base files associated with the test agent. */
        fun knowledgeBaseFiles(knowledgeBaseFiles: List<JsonValue>) =
            knowledgeBaseFiles(JsonField.of(knowledgeBaseFiles))

        /**
         * Sets [Builder.knowledgeBaseFiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.knowledgeBaseFiles] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun knowledgeBaseFiles(knowledgeBaseFiles: JsonField<List<JsonValue>>) = apply {
            this.knowledgeBaseFiles = knowledgeBaseFiles.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [knowledgeBaseFiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKnowledgeBaseFile(knowledgeBaseFile: JsonValue) = apply {
            knowledgeBaseFiles =
                (knowledgeBaseFiles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("knowledgeBaseFiles", it).add(knowledgeBaseFile)
                }
        }

        /** ISO language code the test agent converses in. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        fun llmMaxTokens(llmMaxTokens: Long) = llmMaxTokens(JsonField.of(llmMaxTokens))

        /**
         * Sets [Builder.llmMaxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmMaxTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmMaxTokens(llmMaxTokens: JsonField<Long>) = apply { this.llmMaxTokens = llmMaxTokens }

        /** Model used to drive the test agent's side of the conversation. */
        fun llmModel(llmModel: String) = llmModel(JsonField.of(llmModel))

        /**
         * Sets [Builder.llmModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmModel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        fun llmTemperature(llmTemperature: Double) = llmTemperature(JsonField.of(llmTemperature))

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

        /** Outbound numbers associated with the test agent. */
        fun outboundNumbers(outboundNumbers: List<JsonValue>?) =
            outboundNumbers(JsonField.ofNullable(outboundNumbers))

        /** Alias for calling [Builder.outboundNumbers] with `outboundNumbers.orElse(null)`. */
        fun outboundNumbers(outboundNumbers: Optional<List<JsonValue>>) =
            outboundNumbers(outboundNumbers.getOrNull())

        /**
         * Sets [Builder.outboundNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundNumbers] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun outboundNumbers(outboundNumbers: JsonField<List<JsonValue>>) = apply {
            this.outboundNumbers = outboundNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [outboundNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutboundNumber(outboundNumber: JsonValue) = apply {
            outboundNumbers =
                (outboundNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("outboundNumbers", it).add(outboundNumber)
                }
        }

        fun sipAuth(sipAuth: SipAuth?) = sipAuth(JsonField.ofNullable(sipAuth))

        /** Alias for calling [Builder.sipAuth] with `sipAuth.orElse(null)`. */
        fun sipAuth(sipAuth: Optional<SipAuth>) = sipAuth(sipAuth.getOrNull())

        /**
         * Sets [Builder.sipAuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuth] with a well-typed [SipAuth] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sipAuth(sipAuth: JsonField<SipAuth>) = apply { this.sipAuth = sipAuth }

        fun sipEndpoint(sipEndpoint: String) = sipEndpoint(JsonField.of(sipEndpoint))

        /**
         * Sets [Builder.sipEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipEndpoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipEndpoint(sipEndpoint: JsonField<String>) = apply { this.sipEndpoint = sipEndpoint }

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
         * Returns an immutable instance of [TestAgent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agentName()
         * .assistantId()
         * .createdAt()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestAgent =
            TestAgent(
                checkRequired("id", id),
                checkRequired("agentName", agentName),
                checkRequired("assistantId", assistantId),
                checkRequired("createdAt", createdAt),
                checkRequired("updatedAt", updatedAt),
                autoUpdateDropoffNodes,
                autoUpdateTopicNodes,
                chatAssistantId,
                contactNumber,
                description,
                (enabledPersonalities ?: JsonMissing.of()).map { it.toImmutable() },
                (hallucinationMetricKbFiles ?: JsonMissing.of()).map { it.toImmutable() },
                inbound,
                (knowledgeBaseFiles ?: JsonMissing.of()).map { it.toImmutable() },
                language,
                llmMaxTokens,
                llmModel,
                llmSystemPrompt,
                llmTemperature,
                outboundAutoCall,
                (outboundNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                sipAuth,
                sipEndpoint,
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
    fun validate(): TestAgent = apply {
        if (validated) {
            return@apply
        }

        id()
        agentName()
        assistantId()
        createdAt()
        updatedAt()
        autoUpdateDropoffNodes()
        autoUpdateTopicNodes()
        chatAssistantId()
        contactNumber()
        description()
        enabledPersonalities()
        hallucinationMetricKbFiles()
        inbound()
        knowledgeBaseFiles()
        language()
        llmMaxTokens()
        llmModel()
        llmSystemPrompt()
        llmTemperature()
        outboundAutoCall()
        outboundNumbers()
        sipAuth().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (agentName.asKnown().isPresent) 1 else 0) +
            (if (assistantId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (autoUpdateDropoffNodes.asKnown().isPresent) 1 else 0) +
            (if (autoUpdateTopicNodes.asKnown().isPresent) 1 else 0) +
            (if (chatAssistantId.asKnown().isPresent) 1 else 0) +
            (if (contactNumber.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (enabledPersonalities.asKnown().getOrNull()?.size ?: 0) +
            (hallucinationMetricKbFiles.asKnown().getOrNull()?.size ?: 0) +
            (if (inbound.asKnown().isPresent) 1 else 0) +
            (knowledgeBaseFiles.asKnown().getOrNull()?.size ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (llmMaxTokens.asKnown().isPresent) 1 else 0) +
            (if (llmModel.asKnown().isPresent) 1 else 0) +
            (if (llmSystemPrompt.asKnown().isPresent) 1 else 0) +
            (if (llmTemperature.asKnown().isPresent) 1 else 0) +
            (if (outboundAutoCall.asKnown().isPresent) 1 else 0) +
            (outboundNumbers.asKnown().getOrNull()?.size ?: 0) +
            (sipAuth.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sipEndpoint.asKnown().isPresent) 1 else 0)

    class SipAuth
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

            /** Returns a mutable builder for constructing an instance of [SipAuth]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SipAuth]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sipAuth: SipAuth) = apply {
                additionalProperties = sipAuth.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SipAuth].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SipAuth = SipAuth(additionalProperties.toImmutable())
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
        fun validate(): SipAuth = apply {
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

            return other is SipAuth && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SipAuth{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestAgent &&
            id == other.id &&
            agentName == other.agentName &&
            assistantId == other.assistantId &&
            createdAt == other.createdAt &&
            updatedAt == other.updatedAt &&
            autoUpdateDropoffNodes == other.autoUpdateDropoffNodes &&
            autoUpdateTopicNodes == other.autoUpdateTopicNodes &&
            chatAssistantId == other.chatAssistantId &&
            contactNumber == other.contactNumber &&
            description == other.description &&
            enabledPersonalities == other.enabledPersonalities &&
            hallucinationMetricKbFiles == other.hallucinationMetricKbFiles &&
            inbound == other.inbound &&
            knowledgeBaseFiles == other.knowledgeBaseFiles &&
            language == other.language &&
            llmMaxTokens == other.llmMaxTokens &&
            llmModel == other.llmModel &&
            llmSystemPrompt == other.llmSystemPrompt &&
            llmTemperature == other.llmTemperature &&
            outboundAutoCall == other.outboundAutoCall &&
            outboundNumbers == other.outboundNumbers &&
            sipAuth == other.sipAuth &&
            sipEndpoint == other.sipEndpoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentName,
            assistantId,
            createdAt,
            updatedAt,
            autoUpdateDropoffNodes,
            autoUpdateTopicNodes,
            chatAssistantId,
            contactNumber,
            description,
            enabledPersonalities,
            hallucinationMetricKbFiles,
            inbound,
            knowledgeBaseFiles,
            language,
            llmMaxTokens,
            llmModel,
            llmSystemPrompt,
            llmTemperature,
            outboundAutoCall,
            outboundNumbers,
            sipAuth,
            sipEndpoint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TestAgent{id=$id, agentName=$agentName, assistantId=$assistantId, createdAt=$createdAt, updatedAt=$updatedAt, autoUpdateDropoffNodes=$autoUpdateDropoffNodes, autoUpdateTopicNodes=$autoUpdateTopicNodes, chatAssistantId=$chatAssistantId, contactNumber=$contactNumber, description=$description, enabledPersonalities=$enabledPersonalities, hallucinationMetricKbFiles=$hallucinationMetricKbFiles, inbound=$inbound, knowledgeBaseFiles=$knowledgeBaseFiles, language=$language, llmMaxTokens=$llmMaxTokens, llmModel=$llmModel, llmSystemPrompt=$llmSystemPrompt, llmTemperature=$llmTemperature, outboundAutoCall=$outboundAutoCall, outboundNumbers=$outboundNumbers, sipAuth=$sipAuth, sipEndpoint=$sipEndpoint, additionalProperties=$additionalProperties}"
}
