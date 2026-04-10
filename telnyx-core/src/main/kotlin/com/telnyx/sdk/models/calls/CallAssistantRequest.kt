// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.BookAppointmentTool
import com.telnyx.sdk.models.BookAppointmentToolParams
import com.telnyx.sdk.models.CallControlBucketIds
import com.telnyx.sdk.models.CallControlRetrievalTool
import com.telnyx.sdk.models.CheckAvailabilityTool
import com.telnyx.sdk.models.CheckAvailabilityToolParams
import com.telnyx.sdk.models.ai.assistants.HangupTool
import com.telnyx.sdk.models.ai.assistants.HangupToolParams
import com.telnyx.sdk.models.ai.assistants.TransferTool
import com.telnyx.sdk.models.ai.assistants.WebhookTool
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
 * configuration will be used as fallback for any omitted fields.
 */
class CallAssistantRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dynamicVariables: JsonField<DynamicVariables>,
    private val externalLlm: JsonField<ExternalLlm>,
    private val fallbackConfig: JsonField<FallbackConfig>,
    private val greeting: JsonField<String>,
    private val instructions: JsonField<String>,
    private val llmApiKeyRef: JsonField<String>,
    private val mcpServers: JsonField<List<McpServer>>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val observabilitySettings: JsonField<ObservabilitySettings>,
    private val openaiApiKeyRef: JsonField<String>,
    private val tools: JsonField<List<Tool>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of(),
        @JsonProperty("external_llm")
        @ExcludeMissing
        externalLlm: JsonField<ExternalLlm> = JsonMissing.of(),
        @JsonProperty("fallback_config")
        @ExcludeMissing
        fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of(),
        @JsonProperty("greeting") @ExcludeMissing greeting: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        mcpServers: JsonField<List<McpServer>> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observability_settings")
        @ExcludeMissing
        observabilitySettings: JsonField<ObservabilitySettings> = JsonMissing.of(),
        @JsonProperty("openai_api_key_ref")
        @ExcludeMissing
        openaiApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
    ) : this(
        id,
        dynamicVariables,
        externalLlm,
        fallbackConfig,
        greeting,
        instructions,
        llmApiKeyRef,
        mcpServers,
        model,
        name,
        observabilitySettings,
        openaiApiKeyRef,
        tools,
        mutableMapOf(),
    )

    /**
     * The identifier of the AI assistant to use.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Map of dynamic variables and their default values. Dynamic variables can be referenced in
     * instructions, greeting, and tool definitions using the `{{variable_name}}` syntax.
     * Call-control-agent automatically merges in `telnyx_call_*` variables (telnyx_call_to,
     * telnyx_call_from, telnyx_conversation_channel, telnyx_agent_target, telnyx_end_user_target,
     * telnyx_call_caller_id_name) and custom header variables.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariables(): Optional<DynamicVariables> =
        dynamicVariables.getOptional("dynamic_variables")

    /**
     * External LLM configuration for bringing your own LLM endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalLlm(): Optional<ExternalLlm> = externalLlm.getOptional("external_llm")

    /**
     * Fallback LLM configuration used when the primary LLM provider is unavailable.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackConfig(): Optional<FallbackConfig> = fallbackConfig.getOptional("fallback_config")

    /**
     * Initial greeting text spoken when the assistant starts. Can be plain text for any voice or
     * SSML for `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun greeting(): Optional<String> = greeting.getOptional("greeting")

    /**
     * System instructions for the voice assistant. Can be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
     * This will overwrite the instructions set in the assistant configuration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

    /**
     * Integration secret identifier for the LLM provider API key. Use this field to reference an
     * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * containing your LLM provider API key. Supports any LLM provider (OpenAI, Anthropic, etc.).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

    /**
     * MCP (Model Context Protocol) server configurations for extending the assistant's capabilities
     * with external tools and data sources.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpServers(): Optional<List<McpServer>> = mcpServers.getOptional("mcp_servers")

    /**
     * LLM model override for this call. If omitted, the assistant's configured model is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * Assistant name override for this call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Observability configuration for the assistant session, including Langfuse integration for
     * tracing and monitoring.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observabilitySettings(): Optional<ObservabilitySettings> =
        observabilitySettings.getOptional("observability_settings")

    /**
     * Deprecated — use `llm_api_key_ref` instead. Integration secret identifier for the OpenAI API
     * key. This field is maintained for backward compatibility; `llm_api_key_ref` is the canonical
     * field name and supports all LLM providers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("This field is deprecated and will be removed soon")
    fun openaiApiKeyRef(): Optional<String> = openaiApiKeyRef.getOptional("openai_api_key_ref")

    /**
     * Inline tool definitions available to the assistant (webhook, retrieval, transfer, hangup,
     * etc.). Overrides the assistant's stored tools if provided.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<Tool>> = tools.getOptional("tools")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [dynamicVariables].
     *
     * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dynamic_variables")
    @ExcludeMissing
    fun _dynamicVariables(): JsonField<DynamicVariables> = dynamicVariables

    /**
     * Returns the raw JSON value of [externalLlm].
     *
     * Unlike [externalLlm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_llm")
    @ExcludeMissing
    fun _externalLlm(): JsonField<ExternalLlm> = externalLlm

    /**
     * Returns the raw JSON value of [fallbackConfig].
     *
     * Unlike [fallbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fallback_config")
    @ExcludeMissing
    fun _fallbackConfig(): JsonField<FallbackConfig> = fallbackConfig

    /**
     * Returns the raw JSON value of [greeting].
     *
     * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<String> = greeting

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [llmApiKeyRef].
     *
     * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_api_key_ref")
    @ExcludeMissing
    fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

    /**
     * Returns the raw JSON value of [mcpServers].
     *
     * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_servers")
    @ExcludeMissing
    fun _mcpServers(): JsonField<List<McpServer>> = mcpServers

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [observabilitySettings].
     *
     * Unlike [observabilitySettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observability_settings")
    @ExcludeMissing
    fun _observabilitySettings(): JsonField<ObservabilitySettings> = observabilitySettings

    /**
     * Returns the raw JSON value of [openaiApiKeyRef].
     *
     * Unlike [openaiApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("This field is deprecated and will be removed soon")
    @JsonProperty("openai_api_key_ref")
    @ExcludeMissing
    fun _openaiApiKeyRef(): JsonField<String> = openaiApiKeyRef

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

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
         * Returns a mutable builder for constructing an instance of [CallAssistantRequest].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallAssistantRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
        private var fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of()
        private var greeting: JsonField<String> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var mcpServers: JsonField<MutableList<McpServer>>? = null
        private var model: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var observabilitySettings: JsonField<ObservabilitySettings> = JsonMissing.of()
        private var openaiApiKeyRef: JsonField<String> = JsonMissing.of()
        private var tools: JsonField<MutableList<Tool>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callAssistantRequest: CallAssistantRequest) = apply {
            id = callAssistantRequest.id
            dynamicVariables = callAssistantRequest.dynamicVariables
            externalLlm = callAssistantRequest.externalLlm
            fallbackConfig = callAssistantRequest.fallbackConfig
            greeting = callAssistantRequest.greeting
            instructions = callAssistantRequest.instructions
            llmApiKeyRef = callAssistantRequest.llmApiKeyRef
            mcpServers = callAssistantRequest.mcpServers.map { it.toMutableList() }
            model = callAssistantRequest.model
            name = callAssistantRequest.name
            observabilitySettings = callAssistantRequest.observabilitySettings
            openaiApiKeyRef = callAssistantRequest.openaiApiKeyRef
            tools = callAssistantRequest.tools.map { it.toMutableList() }
            additionalProperties = callAssistantRequest.additionalProperties.toMutableMap()
        }

        /** The identifier of the AI assistant to use. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Map of dynamic variables and their default values. Dynamic variables can be referenced in
         * instructions, greeting, and tool definitions using the `{{variable_name}}` syntax.
         * Call-control-agent automatically merges in `telnyx_call_*` variables (telnyx_call_to,
         * telnyx_call_from, telnyx_conversation_channel, telnyx_agent_target,
         * telnyx_end_user_target, telnyx_call_caller_id_name) and custom header variables.
         */
        fun dynamicVariables(dynamicVariables: DynamicVariables) =
            dynamicVariables(JsonField.of(dynamicVariables))

        /**
         * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariables] with a well-typed [DynamicVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
            this.dynamicVariables = dynamicVariables
        }

        /** External LLM configuration for bringing your own LLM endpoint. */
        fun externalLlm(externalLlm: ExternalLlm) = externalLlm(JsonField.of(externalLlm))

        /**
         * Sets [Builder.externalLlm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalLlm] with a well-typed [ExternalLlm] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalLlm(externalLlm: JsonField<ExternalLlm>) = apply {
            this.externalLlm = externalLlm
        }

        /** Fallback LLM configuration used when the primary LLM provider is unavailable. */
        fun fallbackConfig(fallbackConfig: FallbackConfig) =
            fallbackConfig(JsonField.of(fallbackConfig))

        /**
         * Sets [Builder.fallbackConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackConfig] with a well-typed [FallbackConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackConfig(fallbackConfig: JsonField<FallbackConfig>) = apply {
            this.fallbackConfig = fallbackConfig
        }

        /**
         * Initial greeting text spoken when the assistant starts. Can be plain text for any voice
         * or SSML for `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
         */
        fun greeting(greeting: String) = greeting(JsonField.of(greeting))

        /**
         * Sets [Builder.greeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.greeting] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun greeting(greeting: JsonField<String>) = apply { this.greeting = greeting }

        /**
         * System instructions for the voice assistant. Can be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
         * This will overwrite the instructions set in the assistant configuration.
         */
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

        /**
         * Integration secret identifier for the LLM provider API key. Use this field to reference
         * an
         * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * containing your LLM provider API key. Supports any LLM provider (OpenAI, Anthropic,
         * etc.).
         */
        fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

        /**
         * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
            this.llmApiKeyRef = llmApiKeyRef
        }

        /**
         * MCP (Model Context Protocol) server configurations for extending the assistant's
         * capabilities with external tools and data sources.
         */
        fun mcpServers(mcpServers: List<McpServer>) = mcpServers(JsonField.of(mcpServers))

        /**
         * Sets [Builder.mcpServers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpServers] with a well-typed `List<McpServer>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpServers(mcpServers: JsonField<List<McpServer>>) = apply {
            this.mcpServers = mcpServers.map { it.toMutableList() }
        }

        /**
         * Adds a single [McpServer] to [mcpServers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMcpServer(mcpServer: McpServer) = apply {
            mcpServers =
                (mcpServers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mcpServers", it).add(mcpServer)
                }
        }

        /**
         * LLM model override for this call. If omitted, the assistant's configured model is used.
         */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** Assistant name override for this call. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Observability configuration for the assistant session, including Langfuse integration for
         * tracing and monitoring.
         */
        fun observabilitySettings(observabilitySettings: ObservabilitySettings) =
            observabilitySettings(JsonField.of(observabilitySettings))

        /**
         * Sets [Builder.observabilitySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observabilitySettings] with a well-typed
         * [ObservabilitySettings] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun observabilitySettings(observabilitySettings: JsonField<ObservabilitySettings>) = apply {
            this.observabilitySettings = observabilitySettings
        }

        /**
         * Deprecated — use `llm_api_key_ref` instead. Integration secret identifier for the OpenAI
         * API key. This field is maintained for backward compatibility; `llm_api_key_ref` is the
         * canonical field name and supports all LLM providers.
         */
        @Deprecated("This field is deprecated and will be removed soon")
        fun openaiApiKeyRef(openaiApiKeyRef: String) =
            openaiApiKeyRef(JsonField.of(openaiApiKeyRef))

        /**
         * Sets [Builder.openaiApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openaiApiKeyRef] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("This field is deprecated and will be removed soon")
        fun openaiApiKeyRef(openaiApiKeyRef: JsonField<String>) = apply {
            this.openaiApiKeyRef = openaiApiKeyRef
        }

        /**
         * Inline tool definitions available to the assistant (webhook, retrieval, transfer, hangup,
         * etc.). Overrides the assistant's stored tools if provided.
         */
        fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: Tool) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** Alias for calling [addTool] with `Tool.ofBookAppointment(bookAppointment)`. */
        fun addTool(bookAppointment: BookAppointmentTool) =
            addTool(Tool.ofBookAppointment(bookAppointment))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * BookAppointmentTool.builder()
         *     .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
         *     .bookAppointment(bookAppointment)
         *     .build()
         * ```
         */
        fun addBookAppointmentTool(bookAppointment: BookAppointmentToolParams) =
            addTool(
                BookAppointmentTool.builder()
                    .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
                    .bookAppointment(bookAppointment)
                    .build()
            )

        /** Alias for calling [addTool] with `Tool.ofCheckAvailability(checkAvailability)`. */
        fun addTool(checkAvailability: CheckAvailabilityTool) =
            addTool(Tool.ofCheckAvailability(checkAvailability))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * CheckAvailabilityTool.builder()
         *     .type(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
         *     .checkAvailability(checkAvailability)
         *     .build()
         * ```
         */
        fun addCheckAvailabilityTool(checkAvailability: CheckAvailabilityToolParams) =
            addTool(
                CheckAvailabilityTool.builder()
                    .type(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
                    .checkAvailability(checkAvailability)
                    .build()
            )

        /** Alias for calling [addTool] with `Tool.ofWebhook(webhook)`. */
        fun addTool(webhook: WebhookTool) = addTool(Tool.ofWebhook(webhook))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * WebhookTool.builder()
         *     .type(WebhookTool.Type.WEBHOOK)
         *     .webhook(webhook)
         *     .build()
         * ```
         */
        fun addWebhookTool(webhook: WebhookTool.Webhook) =
            addTool(WebhookTool.builder().type(WebhookTool.Type.WEBHOOK).webhook(webhook).build())

        /** Alias for calling [addTool] with `Tool.ofHangup(hangup)`. */
        fun addTool(hangup: HangupTool) = addTool(Tool.ofHangup(hangup))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * HangupTool.builder()
         *     .type(HangupTool.Type.HANGUP)
         *     .hangup(hangup)
         *     .build()
         * ```
         */
        fun addHangupTool(hangup: HangupToolParams) =
            addTool(HangupTool.builder().type(HangupTool.Type.HANGUP).hangup(hangup).build())

        /** Alias for calling [addTool] with `Tool.ofTransfer(transfer)`. */
        fun addTool(transfer: TransferTool) = addTool(Tool.ofTransfer(transfer))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * TransferTool.builder()
         *     .type(TransferTool.Type.TRANSFER)
         *     .transfer(transfer)
         *     .build()
         * ```
         */
        fun addTransferTool(transfer: TransferTool.Transfer) =
            addTool(
                TransferTool.builder().type(TransferTool.Type.TRANSFER).transfer(transfer).build()
            )

        /** Alias for calling [addTool] with `Tool.ofRetrieval(retrieval)`. */
        fun addTool(retrieval: CallControlRetrievalTool) = addTool(Tool.ofRetrieval(retrieval))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * CallControlRetrievalTool.builder()
         *     .type(CallControlRetrievalTool.Type.RETRIEVAL)
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: CallControlBucketIds) =
            addTool(
                CallControlRetrievalTool.builder()
                    .type(CallControlRetrievalTool.Type.RETRIEVAL)
                    .retrieval(retrieval)
                    .build()
            )

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
         * Returns an immutable instance of [CallAssistantRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallAssistantRequest =
            CallAssistantRequest(
                checkRequired("id", id),
                dynamicVariables,
                externalLlm,
                fallbackConfig,
                greeting,
                instructions,
                llmApiKeyRef,
                (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                model,
                name,
                observabilitySettings,
                openaiApiKeyRef,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallAssistantRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        dynamicVariables().ifPresent { it.validate() }
        externalLlm().ifPresent { it.validate() }
        fallbackConfig().ifPresent { it.validate() }
        greeting()
        instructions()
        llmApiKeyRef()
        mcpServers().ifPresent { it.forEach { it.validate() } }
        model()
        name()
        observabilitySettings().ifPresent { it.validate() }
        openaiApiKeyRef()
        tools().ifPresent { it.forEach { it.validate() } }
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
            (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
            (fallbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (greeting.asKnown().isPresent) 1 else 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (mcpServers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (observabilitySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (openaiApiKeyRef.asKnown().isPresent) 1 else 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Map of dynamic variables and their default values. Dynamic variables can be referenced in
     * instructions, greeting, and tool definitions using the `{{variable_name}}` syntax.
     * Call-control-agent automatically merges in `telnyx_call_*` variables (telnyx_call_to,
     * telnyx_call_from, telnyx_conversation_channel, telnyx_agent_target, telnyx_end_user_target,
     * telnyx_call_caller_id_name) and custom header variables.
     */
    class DynamicVariables
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

            /** Returns a mutable builder for constructing an instance of [DynamicVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DynamicVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dynamicVariables: DynamicVariables) = apply {
                additionalProperties = dynamicVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DynamicVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DynamicVariables = DynamicVariables(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): DynamicVariables = apply {
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

            return other is DynamicVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DynamicVariables{additionalProperties=$additionalProperties}"
    }

    /** External LLM configuration for bringing your own LLM endpoint. */
    class ExternalLlm
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

            /** Returns a mutable builder for constructing an instance of [ExternalLlm]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalLlm]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalLlm: ExternalLlm) = apply {
                additionalProperties = externalLlm.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExternalLlm].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExternalLlm = ExternalLlm(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ExternalLlm = apply {
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

            return other is ExternalLlm && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExternalLlm{additionalProperties=$additionalProperties}"
    }

    /** Fallback LLM configuration used when the primary LLM provider is unavailable. */
    class FallbackConfig
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

            /** Returns a mutable builder for constructing an instance of [FallbackConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FallbackConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fallbackConfig: FallbackConfig) = apply {
                additionalProperties = fallbackConfig.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FallbackConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FallbackConfig = FallbackConfig(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): FallbackConfig = apply {
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

            return other is FallbackConfig && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FallbackConfig{additionalProperties=$additionalProperties}"
    }

    class McpServer
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

            /** Returns a mutable builder for constructing an instance of [McpServer]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [McpServer]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mcpServer: McpServer) = apply {
                additionalProperties = mcpServer.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [McpServer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): McpServer = McpServer(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): McpServer = apply {
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

            return other is McpServer && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "McpServer{additionalProperties=$additionalProperties}"
    }

    /**
     * Observability configuration for the assistant session, including Langfuse integration for
     * tracing and monitoring.
     */
    class ObservabilitySettings
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

            /**
             * Returns a mutable builder for constructing an instance of [ObservabilitySettings].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ObservabilitySettings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(observabilitySettings: ObservabilitySettings) = apply {
                additionalProperties = observabilitySettings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ObservabilitySettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ObservabilitySettings =
                ObservabilitySettings(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ObservabilitySettings = apply {
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

            return other is ObservabilitySettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ObservabilitySettings{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Tool.Deserializer::class)
    @JsonSerialize(using = Tool.Serializer::class)
    class Tool
    private constructor(
        private val bookAppointment: BookAppointmentTool? = null,
        private val checkAvailability: CheckAvailabilityTool? = null,
        private val webhook: WebhookTool? = null,
        private val hangup: HangupTool? = null,
        private val transfer: TransferTool? = null,
        private val retrieval: CallControlRetrievalTool? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bookAppointment(): Optional<BookAppointmentTool> = Optional.ofNullable(bookAppointment)

        fun checkAvailability(): Optional<CheckAvailabilityTool> =
            Optional.ofNullable(checkAvailability)

        fun webhook(): Optional<WebhookTool> = Optional.ofNullable(webhook)

        fun hangup(): Optional<HangupTool> = Optional.ofNullable(hangup)

        fun transfer(): Optional<TransferTool> = Optional.ofNullable(transfer)

        fun retrieval(): Optional<CallControlRetrievalTool> = Optional.ofNullable(retrieval)

        fun isBookAppointment(): Boolean = bookAppointment != null

        fun isCheckAvailability(): Boolean = checkAvailability != null

        fun isWebhook(): Boolean = webhook != null

        fun isHangup(): Boolean = hangup != null

        fun isTransfer(): Boolean = transfer != null

        fun isRetrieval(): Boolean = retrieval != null

        fun asBookAppointment(): BookAppointmentTool = bookAppointment.getOrThrow("bookAppointment")

        fun asCheckAvailability(): CheckAvailabilityTool =
            checkAvailability.getOrThrow("checkAvailability")

        fun asWebhook(): WebhookTool = webhook.getOrThrow("webhook")

        fun asHangup(): HangupTool = hangup.getOrThrow("hangup")

        fun asTransfer(): TransferTool = transfer.getOrThrow("transfer")

        fun asRetrieval(): CallControlRetrievalTool = retrieval.getOrThrow("retrieval")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                bookAppointment != null -> visitor.visitBookAppointment(bookAppointment)
                checkAvailability != null -> visitor.visitCheckAvailability(checkAvailability)
                webhook != null -> visitor.visitWebhook(webhook)
                hangup != null -> visitor.visitHangup(hangup)
                transfer != null -> visitor.visitTransfer(transfer)
                retrieval != null -> visitor.visitRetrieval(retrieval)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Tool = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBookAppointment(bookAppointment: BookAppointmentTool) {
                        bookAppointment.validate()
                    }

                    override fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool) {
                        checkAvailability.validate()
                    }

                    override fun visitWebhook(webhook: WebhookTool) {
                        webhook.validate()
                    }

                    override fun visitHangup(hangup: HangupTool) {
                        hangup.validate()
                    }

                    override fun visitTransfer(transfer: TransferTool) {
                        transfer.validate()
                    }

                    override fun visitRetrieval(retrieval: CallControlRetrievalTool) {
                        retrieval.validate()
                    }
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
                    override fun visitBookAppointment(bookAppointment: BookAppointmentTool) =
                        bookAppointment.validity()

                    override fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool) =
                        checkAvailability.validity()

                    override fun visitWebhook(webhook: WebhookTool) = webhook.validity()

                    override fun visitHangup(hangup: HangupTool) = hangup.validity()

                    override fun visitTransfer(transfer: TransferTool) = transfer.validity()

                    override fun visitRetrieval(retrieval: CallControlRetrievalTool) =
                        retrieval.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tool &&
                bookAppointment == other.bookAppointment &&
                checkAvailability == other.checkAvailability &&
                webhook == other.webhook &&
                hangup == other.hangup &&
                transfer == other.transfer &&
                retrieval == other.retrieval
        }

        override fun hashCode(): Int =
            Objects.hash(bookAppointment, checkAvailability, webhook, hangup, transfer, retrieval)

        override fun toString(): String =
            when {
                bookAppointment != null -> "Tool{bookAppointment=$bookAppointment}"
                checkAvailability != null -> "Tool{checkAvailability=$checkAvailability}"
                webhook != null -> "Tool{webhook=$webhook}"
                hangup != null -> "Tool{hangup=$hangup}"
                transfer != null -> "Tool{transfer=$transfer}"
                retrieval != null -> "Tool{retrieval=$retrieval}"
                _json != null -> "Tool{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Tool")
            }

        companion object {

            @JvmStatic
            fun ofBookAppointment(bookAppointment: BookAppointmentTool) =
                Tool(bookAppointment = bookAppointment)

            @JvmStatic
            fun ofCheckAvailability(checkAvailability: CheckAvailabilityTool) =
                Tool(checkAvailability = checkAvailability)

            @JvmStatic fun ofWebhook(webhook: WebhookTool) = Tool(webhook = webhook)

            @JvmStatic fun ofHangup(hangup: HangupTool) = Tool(hangup = hangup)

            @JvmStatic fun ofTransfer(transfer: TransferTool) = Tool(transfer = transfer)

            @JvmStatic
            fun ofRetrieval(retrieval: CallControlRetrievalTool) = Tool(retrieval = retrieval)
        }

        /** An interface that defines how to map each variant of [Tool] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitBookAppointment(bookAppointment: BookAppointmentTool): T

            fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool): T

            fun visitWebhook(webhook: WebhookTool): T

            fun visitHangup(hangup: HangupTool): T

            fun visitTransfer(transfer: TransferTool): T

            fun visitRetrieval(retrieval: CallControlRetrievalTool): T

            /**
             * Maps an unknown variant of [Tool] to a value of type [T].
             *
             * An instance of [Tool] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Tool: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Tool>(Tool::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Tool {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "book_appointment" -> {
                        return tryDeserialize(node, jacksonTypeRef<BookAppointmentTool>())?.let {
                            Tool(bookAppointment = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "check_availability" -> {
                        return tryDeserialize(node, jacksonTypeRef<CheckAvailabilityTool>())?.let {
                            Tool(checkAvailability = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "webhook" -> {
                        return tryDeserialize(node, jacksonTypeRef<WebhookTool>())?.let {
                            Tool(webhook = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "hangup" -> {
                        return tryDeserialize(node, jacksonTypeRef<HangupTool>())?.let {
                            Tool(hangup = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "transfer" -> {
                        return tryDeserialize(node, jacksonTypeRef<TransferTool>())?.let {
                            Tool(transfer = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "retrieval" -> {
                        return tryDeserialize(node, jacksonTypeRef<CallControlRetrievalTool>())
                            ?.let { Tool(retrieval = it, _json = json) } ?: Tool(_json = json)
                    }
                }

                return Tool(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Tool>(Tool::class) {

            override fun serialize(
                value: Tool,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bookAppointment != null -> generator.writeObject(value.bookAppointment)
                    value.checkAvailability != null ->
                        generator.writeObject(value.checkAvailability)
                    value.webhook != null -> generator.writeObject(value.webhook)
                    value.hangup != null -> generator.writeObject(value.hangup)
                    value.transfer != null -> generator.writeObject(value.transfer)
                    value.retrieval != null -> generator.writeObject(value.retrieval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Tool")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallAssistantRequest &&
            id == other.id &&
            dynamicVariables == other.dynamicVariables &&
            externalLlm == other.externalLlm &&
            fallbackConfig == other.fallbackConfig &&
            greeting == other.greeting &&
            instructions == other.instructions &&
            llmApiKeyRef == other.llmApiKeyRef &&
            mcpServers == other.mcpServers &&
            model == other.model &&
            name == other.name &&
            observabilitySettings == other.observabilitySettings &&
            openaiApiKeyRef == other.openaiApiKeyRef &&
            tools == other.tools &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dynamicVariables,
            externalLlm,
            fallbackConfig,
            greeting,
            instructions,
            llmApiKeyRef,
            mcpServers,
            model,
            name,
            observabilitySettings,
            openaiApiKeyRef,
            tools,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallAssistantRequest{id=$id, dynamicVariables=$dynamicVariables, externalLlm=$externalLlm, fallbackConfig=$fallbackConfig, greeting=$greeting, instructions=$instructions, llmApiKeyRef=$llmApiKeyRef, mcpServers=$mcpServers, model=$model, name=$name, observabilitySettings=$observabilitySettings, openaiApiKeyRef=$openaiApiKeyRef, tools=$tools, additionalProperties=$additionalProperties}"
}
