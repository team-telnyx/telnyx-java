// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ai.chat.BucketIds
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InferenceEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val instructions: JsonField<String>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val conversationFlow: JsonField<ConversationFlow>,
    private val description: JsonField<String>,
    private val dynamicVariables: JsonField<DynamicVariables>,
    private val dynamicVariablesWebhookTimeoutMs: JsonField<Long>,
    private val dynamicVariablesWebhookUrl: JsonField<String>,
    private val enabledFeatures: JsonField<List<EnabledFeatures>>,
    private val externalLlm: JsonField<ExternalLlm>,
    private val fallbackConfig: JsonField<FallbackConfig>,
    private val greeting: JsonField<String>,
    private val importMetadata: JsonField<ImportMetadata>,
    private val insightSettings: JsonField<InsightSettings>,
    private val integrations: JsonField<List<Integration>>,
    private val interruptionSettings: JsonField<InterruptionSettings>,
    private val llmApiKeyRef: JsonField<String>,
    private val mcpServers: JsonField<List<McpServer>>,
    private val messagingSettings: JsonField<MessagingSettings>,
    private val observabilitySettings: JsonField<Observability>,
    private val postConversationSettings: JsonField<PostConversationSettings>,
    private val privacySettings: JsonField<PrivacySettings>,
    private val relatedMissionIds: JsonField<List<String>>,
    private val tags: JsonField<List<String>>,
    private val telephonySettings: JsonField<TelephonySettings>,
    private val tools: JsonField<List<AssistantTool>>,
    private val transcription: JsonField<TranscriptionSettings>,
    private val versionCreatedAt: JsonField<OffsetDateTime>,
    private val versionId: JsonField<String>,
    private val versionName: JsonField<String>,
    private val voiceSettings: JsonField<VoiceSettings>,
    private val widgetSettings: JsonField<WidgetSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conversation_flow")
        @ExcludeMissing
        conversationFlow: JsonField<ConversationFlow> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of(),
        @JsonProperty("dynamic_variables_webhook_timeout_ms")
        @ExcludeMissing
        dynamicVariablesWebhookTimeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dynamic_variables_webhook_url")
        @ExcludeMissing
        dynamicVariablesWebhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled_features")
        @ExcludeMissing
        enabledFeatures: JsonField<List<EnabledFeatures>> = JsonMissing.of(),
        @JsonProperty("external_llm")
        @ExcludeMissing
        externalLlm: JsonField<ExternalLlm> = JsonMissing.of(),
        @JsonProperty("fallback_config")
        @ExcludeMissing
        fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of(),
        @JsonProperty("greeting") @ExcludeMissing greeting: JsonField<String> = JsonMissing.of(),
        @JsonProperty("import_metadata")
        @ExcludeMissing
        importMetadata: JsonField<ImportMetadata> = JsonMissing.of(),
        @JsonProperty("insight_settings")
        @ExcludeMissing
        insightSettings: JsonField<InsightSettings> = JsonMissing.of(),
        @JsonProperty("integrations")
        @ExcludeMissing
        integrations: JsonField<List<Integration>> = JsonMissing.of(),
        @JsonProperty("interruption_settings")
        @ExcludeMissing
        interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of(),
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        mcpServers: JsonField<List<McpServer>> = JsonMissing.of(),
        @JsonProperty("messaging_settings")
        @ExcludeMissing
        messagingSettings: JsonField<MessagingSettings> = JsonMissing.of(),
        @JsonProperty("observability_settings")
        @ExcludeMissing
        observabilitySettings: JsonField<Observability> = JsonMissing.of(),
        @JsonProperty("post_conversation_settings")
        @ExcludeMissing
        postConversationSettings: JsonField<PostConversationSettings> = JsonMissing.of(),
        @JsonProperty("privacy_settings")
        @ExcludeMissing
        privacySettings: JsonField<PrivacySettings> = JsonMissing.of(),
        @JsonProperty("related_mission_ids")
        @ExcludeMissing
        relatedMissionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("telephony_settings")
        @ExcludeMissing
        telephonySettings: JsonField<TelephonySettings> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        tools: JsonField<List<AssistantTool>> = JsonMissing.of(),
        @JsonProperty("transcription")
        @ExcludeMissing
        transcription: JsonField<TranscriptionSettings> = JsonMissing.of(),
        @JsonProperty("version_created_at")
        @ExcludeMissing
        versionCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("version_id") @ExcludeMissing versionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version_name")
        @ExcludeMissing
        versionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voice_settings")
        @ExcludeMissing
        voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        @JsonProperty("widget_settings")
        @ExcludeMissing
        widgetSettings: JsonField<WidgetSettings> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        instructions,
        model,
        name,
        conversationFlow,
        description,
        dynamicVariables,
        dynamicVariablesWebhookTimeoutMs,
        dynamicVariablesWebhookUrl,
        enabledFeatures,
        externalLlm,
        fallbackConfig,
        greeting,
        importMetadata,
        insightSettings,
        integrations,
        interruptionSettings,
        llmApiKeyRef,
        mcpServers,
        messagingSettings,
        observabilitySettings,
        postConversationSettings,
        privacySettings,
        relatedMissionIds,
        tags,
        telephonySettings,
        tools,
        transcription,
        versionCreatedAt,
        versionId,
        versionName,
        voiceSettings,
        widgetSettings,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * System instructions for the assistant. These may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): String = instructions.getRequired("instructions")

    /**
     * ID of the model to use when `external_llm` is not set. You can use the
     * [Get models API](https://developers.telnyx.com/api-reference/openai-chat/get-available-models-openai-compatible)
     * to see available models. If `external_llm` is provided, the assistant uses `external_llm`
     * instead of this field. If neither `model` nor `external_llm` is provided, Telnyx applies the
     * default model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Conversation flow as returned by the API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationFlow(): Optional<ConversationFlow> =
        conversationFlow.getOptional("conversation_flow")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Map of dynamic variables and their values
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariables(): Optional<DynamicVariables> =
        dynamicVariables.getOptional("dynamic_variables")

    /**
     * Timeout in milliseconds for the dynamic variables webhook. Must be between 1 and 10000 ms. If
     * the webhook does not respond within this timeout, the call proceeds with default values. See
     * the
     * [dynamic variables guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariablesWebhookTimeoutMs(): Optional<Long> =
        dynamicVariablesWebhookTimeoutMs.getOptional("dynamic_variables_webhook_timeout_ms")

    /**
     * If `dynamic_variables_webhook_url` is set, Telnyx sends a POST request to this URL at the
     * start of the conversation to resolve dynamic variables. **Gotcha:** the webhook response must
     * wrap variables under a top-level `dynamic_variables` object, e.g. `{"dynamic_variables":
     * {"customer_name": "Jane"}}`. Returning a flat object will be ignored and variables will fall
     * back to their defaults. See the
     * [dynamic variables guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
     * for the full request/response format and timeout behavior.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariablesWebhookUrl(): Optional<String> =
        dynamicVariablesWebhookUrl.getOptional("dynamic_variables_webhook_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledFeatures(): Optional<List<EnabledFeatures>> =
        enabledFeatures.getOptional("enabled_features")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalLlm(): Optional<ExternalLlm> = externalLlm.getOptional("external_llm")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackConfig(): Optional<FallbackConfig> = fallbackConfig.getOptional("fallback_config")

    /**
     * Text that the assistant will use to start the conversation. This may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
     * Use an empty string to have the assistant wait for the user to speak first. Use the special
     * value `<assistant-speaks-first-with-model-generated-message>` to have the assistant generate
     * the greeting based on the system instructions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun greeting(): Optional<String> = greeting.getOptional("greeting")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun importMetadata(): Optional<ImportMetadata> = importMetadata.getOptional("import_metadata")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insightSettings(): Optional<InsightSettings> =
        insightSettings.getOptional("insight_settings")

    /**
     * Connected integrations attached to the assistant. The catalog of available integrations is at
     * `/ai/integrations`; the user's connected integrations are at `/ai/integrations/connections`.
     * Each item references a catalog integration by `integration_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrations(): Optional<List<Integration>> = integrations.getOptional("integrations")

    /**
     * Settings for interruptions and how the assistant decides the user has finished speaking.
     * These timings are most relevant when using non turn-taking transcription models. For
     * turn-taking models like `deepgram/flux`, end-of-turn behavior is controlled by the
     * transcription end-of-turn settings under `transcription.settings` (`eot_threshold`,
     * `eot_timeout_ms`, `eager_eot_threshold`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptionSettings(): Optional<InterruptionSettings> =
        interruptionSettings.getOptional("interruption_settings")

    /**
     * This is only needed when using third-party inference providers selected by `model`. The
     * `identifier` for an integration secret
     * [/v2/integration_secrets](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
     * that refers to your LLM provider's API key. For bring-your-own endpoint authentication, use
     * `external_llm.llm_api_key_ref` instead. Warning: Free plans are unlikely to work with this
     * integration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

    /**
     * MCP servers attached to the assistant. Create MCP servers with `/ai/mcp_servers`, then
     * reference them by `id` here.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpServers(): Optional<List<McpServer>> = mcpServers.getOptional("mcp_servers")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingSettings(): Optional<MessagingSettings> =
        messagingSettings.getOptional("messaging_settings")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observabilitySettings(): Optional<Observability> =
        observabilitySettings.getOptional("observability_settings")

    /**
     * Configuration for post-conversation processing. When enabled, the assistant receives one
     * additional LLM turn after the conversation ends, allowing it to execute tool calls such as
     * logging to a CRM or sending a summary. The assistant can execute multiple parallel or
     * sequential tools during this phase. Telephony-control tools (e.g. hangup, transfer) are
     * unavailable post-conversation. Beta feature.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postConversationSettings(): Optional<PostConversationSettings> =
        postConversationSettings.getOptional("post_conversation_settings")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privacySettings(): Optional<PrivacySettings> =
        privacySettings.getOptional("privacy_settings")

    /**
     * IDs of missions related to this assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relatedMissionIds(): Optional<List<String>> =
        relatedMissionIds.getOptional("related_mission_ids")

    /**
     * Tags associated with the assistant. Tags can also be managed with the assistant tag
     * endpoints.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telephonySettings(): Optional<TelephonySettings> =
        telephonySettings.getOptional("telephony_settings")

    /**
     * Deprecated for new integrations. Inline tool definitions available to the assistant. Prefer
     * `tool_ids` to attach shared tools created with the AI Tools endpoints.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<AssistantTool>> = tools.getOptional("tools")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcription(): Optional<TranscriptionSettings> =
        transcription.getOptional("transcription")

    /**
     * Timestamp when this assistant version was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun versionCreatedAt(): Optional<OffsetDateTime> =
        versionCreatedAt.getOptional("version_created_at")

    /**
     * Identifier for the assistant version returned by version-aware assistant endpoints.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun versionId(): Optional<String> = versionId.getOptional("version_id")

    /**
     * Human-readable name for the assistant version.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun versionName(): Optional<String> = versionName.getOptional("version_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

    /**
     * Configuration settings for the assistant's web widget.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun widgetSettings(): Optional<WidgetSettings> = widgetSettings.getOptional("widget_settings")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

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
     * Returns the raw JSON value of [conversationFlow].
     *
     * Unlike [conversationFlow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conversation_flow")
    @ExcludeMissing
    fun _conversationFlow(): JsonField<ConversationFlow> = conversationFlow

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [dynamicVariablesWebhookTimeoutMs].
     *
     * Unlike [dynamicVariablesWebhookTimeoutMs], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dynamic_variables_webhook_timeout_ms")
    @ExcludeMissing
    fun _dynamicVariablesWebhookTimeoutMs(): JsonField<Long> = dynamicVariablesWebhookTimeoutMs

    /**
     * Returns the raw JSON value of [dynamicVariablesWebhookUrl].
     *
     * Unlike [dynamicVariablesWebhookUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dynamic_variables_webhook_url")
    @ExcludeMissing
    fun _dynamicVariablesWebhookUrl(): JsonField<String> = dynamicVariablesWebhookUrl

    /**
     * Returns the raw JSON value of [enabledFeatures].
     *
     * Unlike [enabledFeatures], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled_features")
    @ExcludeMissing
    fun _enabledFeatures(): JsonField<List<EnabledFeatures>> = enabledFeatures

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
     * Returns the raw JSON value of [importMetadata].
     *
     * Unlike [importMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("import_metadata")
    @ExcludeMissing
    fun _importMetadata(): JsonField<ImportMetadata> = importMetadata

    /**
     * Returns the raw JSON value of [insightSettings].
     *
     * Unlike [insightSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insight_settings")
    @ExcludeMissing
    fun _insightSettings(): JsonField<InsightSettings> = insightSettings

    /**
     * Returns the raw JSON value of [integrations].
     *
     * Unlike [integrations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integrations")
    @ExcludeMissing
    fun _integrations(): JsonField<List<Integration>> = integrations

    /**
     * Returns the raw JSON value of [interruptionSettings].
     *
     * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interruption_settings")
    @ExcludeMissing
    fun _interruptionSettings(): JsonField<InterruptionSettings> = interruptionSettings

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
     * Returns the raw JSON value of [messagingSettings].
     *
     * Unlike [messagingSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_settings")
    @ExcludeMissing
    fun _messagingSettings(): JsonField<MessagingSettings> = messagingSettings

    /**
     * Returns the raw JSON value of [observabilitySettings].
     *
     * Unlike [observabilitySettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observability_settings")
    @ExcludeMissing
    fun _observabilitySettings(): JsonField<Observability> = observabilitySettings

    /**
     * Returns the raw JSON value of [postConversationSettings].
     *
     * Unlike [postConversationSettings], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("post_conversation_settings")
    @ExcludeMissing
    fun _postConversationSettings(): JsonField<PostConversationSettings> = postConversationSettings

    /**
     * Returns the raw JSON value of [privacySettings].
     *
     * Unlike [privacySettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privacy_settings")
    @ExcludeMissing
    fun _privacySettings(): JsonField<PrivacySettings> = privacySettings

    /**
     * Returns the raw JSON value of [relatedMissionIds].
     *
     * Unlike [relatedMissionIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("related_mission_ids")
    @ExcludeMissing
    fun _relatedMissionIds(): JsonField<List<String>> = relatedMissionIds

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [telephonySettings].
     *
     * Unlike [telephonySettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("telephony_settings")
    @ExcludeMissing
    fun _telephonySettings(): JsonField<TelephonySettings> = telephonySettings

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<AssistantTool>> = tools

    /**
     * Returns the raw JSON value of [transcription].
     *
     * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transcription")
    @ExcludeMissing
    fun _transcription(): JsonField<TranscriptionSettings> = transcription

    /**
     * Returns the raw JSON value of [versionCreatedAt].
     *
     * Unlike [versionCreatedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("version_created_at")
    @ExcludeMissing
    fun _versionCreatedAt(): JsonField<OffsetDateTime> = versionCreatedAt

    /**
     * Returns the raw JSON value of [versionId].
     *
     * Unlike [versionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version_id") @ExcludeMissing fun _versionId(): JsonField<String> = versionId

    /**
     * Returns the raw JSON value of [versionName].
     *
     * Unlike [versionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version_name")
    @ExcludeMissing
    fun _versionName(): JsonField<String> = versionName

    /**
     * Returns the raw JSON value of [voiceSettings].
     *
     * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_settings")
    @ExcludeMissing
    fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

    /**
     * Returns the raw JSON value of [widgetSettings].
     *
     * Unlike [widgetSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("widget_settings")
    @ExcludeMissing
    fun _widgetSettings(): JsonField<WidgetSettings> = widgetSettings

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
         * Returns a mutable builder for constructing an instance of [InferenceEmbedding].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .instructions()
         * .model()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferenceEmbedding]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var instructions: JsonField<String>? = null
        private var model: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var conversationFlow: JsonField<ConversationFlow> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        private var dynamicVariablesWebhookTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var dynamicVariablesWebhookUrl: JsonField<String> = JsonMissing.of()
        private var enabledFeatures: JsonField<MutableList<EnabledFeatures>>? = null
        private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
        private var fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of()
        private var greeting: JsonField<String> = JsonMissing.of()
        private var importMetadata: JsonField<ImportMetadata> = JsonMissing.of()
        private var insightSettings: JsonField<InsightSettings> = JsonMissing.of()
        private var integrations: JsonField<MutableList<Integration>>? = null
        private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var mcpServers: JsonField<MutableList<McpServer>>? = null
        private var messagingSettings: JsonField<MessagingSettings> = JsonMissing.of()
        private var observabilitySettings: JsonField<Observability> = JsonMissing.of()
        private var postConversationSettings: JsonField<PostConversationSettings> = JsonMissing.of()
        private var privacySettings: JsonField<PrivacySettings> = JsonMissing.of()
        private var relatedMissionIds: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var telephonySettings: JsonField<TelephonySettings> = JsonMissing.of()
        private var tools: JsonField<MutableList<AssistantTool>>? = null
        private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
        private var versionCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var versionId: JsonField<String> = JsonMissing.of()
        private var versionName: JsonField<String> = JsonMissing.of()
        private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
        private var widgetSettings: JsonField<WidgetSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferenceEmbedding: InferenceEmbedding) = apply {
            id = inferenceEmbedding.id
            createdAt = inferenceEmbedding.createdAt
            instructions = inferenceEmbedding.instructions
            model = inferenceEmbedding.model
            name = inferenceEmbedding.name
            conversationFlow = inferenceEmbedding.conversationFlow
            description = inferenceEmbedding.description
            dynamicVariables = inferenceEmbedding.dynamicVariables
            dynamicVariablesWebhookTimeoutMs = inferenceEmbedding.dynamicVariablesWebhookTimeoutMs
            dynamicVariablesWebhookUrl = inferenceEmbedding.dynamicVariablesWebhookUrl
            enabledFeatures = inferenceEmbedding.enabledFeatures.map { it.toMutableList() }
            externalLlm = inferenceEmbedding.externalLlm
            fallbackConfig = inferenceEmbedding.fallbackConfig
            greeting = inferenceEmbedding.greeting
            importMetadata = inferenceEmbedding.importMetadata
            insightSettings = inferenceEmbedding.insightSettings
            integrations = inferenceEmbedding.integrations.map { it.toMutableList() }
            interruptionSettings = inferenceEmbedding.interruptionSettings
            llmApiKeyRef = inferenceEmbedding.llmApiKeyRef
            mcpServers = inferenceEmbedding.mcpServers.map { it.toMutableList() }
            messagingSettings = inferenceEmbedding.messagingSettings
            observabilitySettings = inferenceEmbedding.observabilitySettings
            postConversationSettings = inferenceEmbedding.postConversationSettings
            privacySettings = inferenceEmbedding.privacySettings
            relatedMissionIds = inferenceEmbedding.relatedMissionIds.map { it.toMutableList() }
            tags = inferenceEmbedding.tags.map { it.toMutableList() }
            telephonySettings = inferenceEmbedding.telephonySettings
            tools = inferenceEmbedding.tools.map { it.toMutableList() }
            transcription = inferenceEmbedding.transcription
            versionCreatedAt = inferenceEmbedding.versionCreatedAt
            versionId = inferenceEmbedding.versionId
            versionName = inferenceEmbedding.versionName
            voiceSettings = inferenceEmbedding.voiceSettings
            widgetSettings = inferenceEmbedding.widgetSettings
            additionalProperties = inferenceEmbedding.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * System instructions for the assistant. These may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
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
         * ID of the model to use when `external_llm` is not set. You can use the
         * [Get models API](https://developers.telnyx.com/api-reference/openai-chat/get-available-models-openai-compatible)
         * to see available models. If `external_llm` is provided, the assistant uses `external_llm`
         * instead of this field. If neither `model` nor `external_llm` is provided, Telnyx applies
         * the default model.
         */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Conversation flow as returned by the API. */
        fun conversationFlow(conversationFlow: ConversationFlow) =
            conversationFlow(JsonField.of(conversationFlow))

        /**
         * Sets [Builder.conversationFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationFlow] with a well-typed [ConversationFlow]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conversationFlow(conversationFlow: JsonField<ConversationFlow>) = apply {
            this.conversationFlow = conversationFlow
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

        /** Map of dynamic variables and their values */
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

        /**
         * Timeout in milliseconds for the dynamic variables webhook. Must be between 1 and 10000
         * ms. If the webhook does not respond within this timeout, the call proceeds with default
         * values. See the
         * [dynamic variables guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
         */
        fun dynamicVariablesWebhookTimeoutMs(dynamicVariablesWebhookTimeoutMs: Long) =
            dynamicVariablesWebhookTimeoutMs(JsonField.of(dynamicVariablesWebhookTimeoutMs))

        /**
         * Sets [Builder.dynamicVariablesWebhookTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariablesWebhookTimeoutMs] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun dynamicVariablesWebhookTimeoutMs(dynamicVariablesWebhookTimeoutMs: JsonField<Long>) =
            apply {
                this.dynamicVariablesWebhookTimeoutMs = dynamicVariablesWebhookTimeoutMs
            }

        /**
         * If `dynamic_variables_webhook_url` is set, Telnyx sends a POST request to this URL at the
         * start of the conversation to resolve dynamic variables. **Gotcha:** the webhook response
         * must wrap variables under a top-level `dynamic_variables` object, e.g.
         * `{"dynamic_variables": {"customer_name": "Jane"}}`. Returning a flat object will be
         * ignored and variables will fall back to their defaults. See the
         * [dynamic variables guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
         * for the full request/response format and timeout behavior.
         */
        fun dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl: String) =
            dynamicVariablesWebhookUrl(JsonField.of(dynamicVariablesWebhookUrl))

        /**
         * Sets [Builder.dynamicVariablesWebhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariablesWebhookUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl: JsonField<String>) = apply {
            this.dynamicVariablesWebhookUrl = dynamicVariablesWebhookUrl
        }

        fun enabledFeatures(enabledFeatures: List<EnabledFeatures>) =
            enabledFeatures(JsonField.of(enabledFeatures))

        /**
         * Sets [Builder.enabledFeatures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledFeatures] with a well-typed
         * `List<EnabledFeatures>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun enabledFeatures(enabledFeatures: JsonField<List<EnabledFeatures>>) = apply {
            this.enabledFeatures = enabledFeatures.map { it.toMutableList() }
        }

        /**
         * Adds a single [EnabledFeatures] to [enabledFeatures].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledFeature(enabledFeature: EnabledFeatures) = apply {
            enabledFeatures =
                (enabledFeatures ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enabledFeatures", it).add(enabledFeature)
                }
        }

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
         * Text that the assistant will use to start the conversation. This may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
         * Use an empty string to have the assistant wait for the user to speak first. Use the
         * special value `<assistant-speaks-first-with-model-generated-message>` to have the
         * assistant generate the greeting based on the system instructions.
         */
        fun greeting(greeting: String) = greeting(JsonField.of(greeting))

        /**
         * Sets [Builder.greeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.greeting] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun greeting(greeting: JsonField<String>) = apply { this.greeting = greeting }

        fun importMetadata(importMetadata: ImportMetadata) =
            importMetadata(JsonField.of(importMetadata))

        /**
         * Sets [Builder.importMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.importMetadata] with a well-typed [ImportMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun importMetadata(importMetadata: JsonField<ImportMetadata>) = apply {
            this.importMetadata = importMetadata
        }

        fun insightSettings(insightSettings: InsightSettings) =
            insightSettings(JsonField.of(insightSettings))

        /**
         * Sets [Builder.insightSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insightSettings] with a well-typed [InsightSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun insightSettings(insightSettings: JsonField<InsightSettings>) = apply {
            this.insightSettings = insightSettings
        }

        /**
         * Connected integrations attached to the assistant. The catalog of available integrations
         * is at `/ai/integrations`; the user's connected integrations are at
         * `/ai/integrations/connections`. Each item references a catalog integration by
         * `integration_id`.
         */
        fun integrations(integrations: List<Integration>) = integrations(JsonField.of(integrations))

        /**
         * Sets [Builder.integrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrations] with a well-typed `List<Integration>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrations(integrations: JsonField<List<Integration>>) = apply {
            this.integrations = integrations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Integration] to [integrations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIntegration(integration: Integration) = apply {
            integrations =
                (integrations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("integrations", it).add(integration)
                }
        }

        /**
         * Settings for interruptions and how the assistant decides the user has finished speaking.
         * These timings are most relevant when using non turn-taking transcription models. For
         * turn-taking models like `deepgram/flux`, end-of-turn behavior is controlled by the
         * transcription end-of-turn settings under `transcription.settings` (`eot_threshold`,
         * `eot_timeout_ms`, `eager_eot_threshold`).
         */
        fun interruptionSettings(interruptionSettings: InterruptionSettings) =
            interruptionSettings(JsonField.of(interruptionSettings))

        /**
         * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptionSettings] with a well-typed
         * [InterruptionSettings] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun interruptionSettings(interruptionSettings: JsonField<InterruptionSettings>) = apply {
            this.interruptionSettings = interruptionSettings
        }

        /**
         * This is only needed when using third-party inference providers selected by `model`. The
         * `identifier` for an integration secret
         * [/v2/integration_secrets](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
         * that refers to your LLM provider's API key. For bring-your-own endpoint authentication,
         * use `external_llm.llm_api_key_ref` instead. Warning: Free plans are unlikely to work with
         * this integration.
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
         * MCP servers attached to the assistant. Create MCP servers with `/ai/mcp_servers`, then
         * reference them by `id` here.
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

        fun messagingSettings(messagingSettings: MessagingSettings) =
            messagingSettings(JsonField.of(messagingSettings))

        /**
         * Sets [Builder.messagingSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingSettings] with a well-typed [MessagingSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messagingSettings(messagingSettings: JsonField<MessagingSettings>) = apply {
            this.messagingSettings = messagingSettings
        }

        fun observabilitySettings(observabilitySettings: Observability) =
            observabilitySettings(JsonField.of(observabilitySettings))

        /**
         * Sets [Builder.observabilitySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observabilitySettings] with a well-typed [Observability]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun observabilitySettings(observabilitySettings: JsonField<Observability>) = apply {
            this.observabilitySettings = observabilitySettings
        }

        /**
         * Configuration for post-conversation processing. When enabled, the assistant receives one
         * additional LLM turn after the conversation ends, allowing it to execute tool calls such
         * as logging to a CRM or sending a summary. The assistant can execute multiple parallel or
         * sequential tools during this phase. Telephony-control tools (e.g. hangup, transfer) are
         * unavailable post-conversation. Beta feature.
         */
        fun postConversationSettings(postConversationSettings: PostConversationSettings) =
            postConversationSettings(JsonField.of(postConversationSettings))

        /**
         * Sets [Builder.postConversationSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postConversationSettings] with a well-typed
         * [PostConversationSettings] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun postConversationSettings(
            postConversationSettings: JsonField<PostConversationSettings>
        ) = apply { this.postConversationSettings = postConversationSettings }

        fun privacySettings(privacySettings: PrivacySettings) =
            privacySettings(JsonField.of(privacySettings))

        /**
         * Sets [Builder.privacySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacySettings] with a well-typed [PrivacySettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun privacySettings(privacySettings: JsonField<PrivacySettings>) = apply {
            this.privacySettings = privacySettings
        }

        /** IDs of missions related to this assistant. */
        fun relatedMissionIds(relatedMissionIds: List<String>) =
            relatedMissionIds(JsonField.of(relatedMissionIds))

        /**
         * Sets [Builder.relatedMissionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedMissionIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun relatedMissionIds(relatedMissionIds: JsonField<List<String>>) = apply {
            this.relatedMissionIds = relatedMissionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [relatedMissionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRelatedMissionId(relatedMissionId: String) = apply {
            relatedMissionIds =
                (relatedMissionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("relatedMissionIds", it).add(relatedMissionId)
                }
        }

        /**
         * Tags associated with the assistant. Tags can also be managed with the assistant tag
         * endpoints.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun telephonySettings(telephonySettings: TelephonySettings) =
            telephonySettings(JsonField.of(telephonySettings))

        /**
         * Sets [Builder.telephonySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telephonySettings] with a well-typed [TelephonySettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun telephonySettings(telephonySettings: JsonField<TelephonySettings>) = apply {
            this.telephonySettings = telephonySettings
        }

        /**
         * Deprecated for new integrations. Inline tool definitions available to the assistant.
         * Prefer `tool_ids` to attach shared tools created with the AI Tools endpoints.
         */
        fun tools(tools: List<AssistantTool>) = tools(JsonField.of(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<AssistantTool>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tools(tools: JsonField<List<AssistantTool>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssistantTool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: AssistantTool) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** Alias for calling [addTool] with `AssistantTool.ofWebhook(webhook)`. */
        fun addTool(webhook: InferenceEmbeddingWebhookToolParams) =
            addTool(AssistantTool.ofWebhook(webhook))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * InferenceEmbeddingWebhookToolParams.builder()
         *     .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
         *     .webhook(webhook)
         *     .build()
         * ```
         */
        fun addWebhookTool(webhook: InferenceEmbeddingWebhookToolParams.Webhook) =
            addTool(
                InferenceEmbeddingWebhookToolParams.builder()
                    .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                    .webhook(webhook)
                    .build()
            )

        /** Alias for calling [addTool] with `AssistantTool.ofRetrieval(retrieval)`. */
        fun addTool(retrieval: RetrievalTool) = addTool(AssistantTool.ofRetrieval(retrieval))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * RetrievalTool.builder()
         *     .type(RetrievalTool.Type.RETRIEVAL)
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: BucketIds) =
            addTool(
                RetrievalTool.builder()
                    .type(RetrievalTool.Type.RETRIEVAL)
                    .retrieval(retrieval)
                    .build()
            )

        /** Alias for calling [addTool] with `AssistantTool.ofHandoff(handoff)`. */
        fun addTool(handoff: AssistantTool.HandoffTool) = addTool(AssistantTool.ofHandoff(handoff))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.HandoffTool.builder()
         *     .handoff(handoff)
         *     .build()
         * ```
         */
        fun addHandoffTool(handoff: AssistantTool.HandoffTool.Handoff) =
            addTool(AssistantTool.HandoffTool.builder().handoff(handoff).build())

        /** Alias for calling [addTool] with `AssistantTool.ofHangup(hangup)`. */
        fun addTool(hangup: HangupTool) = addTool(AssistantTool.ofHangup(hangup))

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

        /** Alias for calling [addTool] with `AssistantTool.ofTransfer(transfer)`. */
        fun addTool(transfer: AssistantTool.Transfer) = addTool(AssistantTool.ofTransfer(transfer))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.Transfer.builder()
         *     .transfer(transfer)
         *     .build()
         * ```
         */
        fun addTransferTool(transfer: AssistantTool.Transfer.TransferConfig) =
            addTool(AssistantTool.Transfer.builder().transfer(transfer).build())

        /** Alias for calling [addTool] with `AssistantTool.ofInvite(invite)`. */
        fun addTool(invite: AssistantTool.Invite) = addTool(AssistantTool.ofInvite(invite))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.Invite.builder()
         *     .invite(invite)
         *     .build()
         * ```
         */
        fun addInviteTool(invite: AssistantTool.Invite.InnerInvite) =
            addTool(AssistantTool.Invite.builder().invite(invite).build())

        /** Alias for calling [addTool] with `AssistantTool.ofRefer(refer)`. */
        fun addTool(refer: AssistantTool.SipReferTool) = addTool(AssistantTool.ofRefer(refer))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.SipReferTool.builder()
         *     .refer(refer)
         *     .build()
         * ```
         */
        fun addReferTool(refer: AssistantTool.SipReferTool.Refer) =
            addTool(AssistantTool.SipReferTool.builder().refer(refer).build())

        /** Alias for calling [addTool] with `AssistantTool.ofSendDtmf(sendDtmf)`. */
        fun addTool(sendDtmf: AssistantTool.DtmfTool) = addTool(AssistantTool.ofSendDtmf(sendDtmf))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.DtmfTool.builder()
         *     .sendDtmf(sendDtmf)
         *     .build()
         * ```
         */
        fun addSendDtmfTool(sendDtmf: AssistantTool.DtmfTool.SendDtmf) =
            addTool(AssistantTool.DtmfTool.builder().sendDtmf(sendDtmf).build())

        /** Alias for calling [addTool] with `AssistantTool.ofSendMessage(sendMessage)`. */
        fun addTool(sendMessage: AssistantTool.SendMessage) =
            addTool(AssistantTool.ofSendMessage(sendMessage))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.SendMessage.builder()
         *     .sendMessage(sendMessage)
         *     .build()
         * ```
         */
        fun addSendMessageTool(sendMessage: AssistantTool.SendMessage.SendMessageConfig) =
            addTool(AssistantTool.SendMessage.builder().sendMessage(sendMessage).build())

        /** Alias for calling [addTool] with `AssistantTool.ofSkipTurn(skipTurn)`. */
        fun addTool(skipTurn: AssistantTool.SkipTurn) = addTool(AssistantTool.ofSkipTurn(skipTurn))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.SkipTurn.builder()
         *     .skipTurn(skipTurn)
         *     .build()
         * ```
         */
        fun addSkipTurnTool(skipTurn: AssistantTool.SkipTurn.SkipTurnConfig) =
            addTool(AssistantTool.SkipTurn.builder().skipTurn(skipTurn).build())

        fun transcription(transcription: TranscriptionSettings) =
            transcription(JsonField.of(transcription))

        /**
         * Sets [Builder.transcription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcription] with a well-typed [TranscriptionSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcription(transcription: JsonField<TranscriptionSettings>) = apply {
            this.transcription = transcription
        }

        /** Timestamp when this assistant version was created. */
        fun versionCreatedAt(versionCreatedAt: OffsetDateTime) =
            versionCreatedAt(JsonField.of(versionCreatedAt))

        /**
         * Sets [Builder.versionCreatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versionCreatedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun versionCreatedAt(versionCreatedAt: JsonField<OffsetDateTime>) = apply {
            this.versionCreatedAt = versionCreatedAt
        }

        /** Identifier for the assistant version returned by version-aware assistant endpoints. */
        fun versionId(versionId: String) = versionId(JsonField.of(versionId))

        /**
         * Sets [Builder.versionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun versionId(versionId: JsonField<String>) = apply { this.versionId = versionId }

        /** Human-readable name for the assistant version. */
        fun versionName(versionName: String) = versionName(JsonField.of(versionName))

        /**
         * Sets [Builder.versionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun versionName(versionName: JsonField<String>) = apply { this.versionName = versionName }

        fun voiceSettings(voiceSettings: VoiceSettings) = voiceSettings(JsonField.of(voiceSettings))

        /**
         * Sets [Builder.voiceSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
            this.voiceSettings = voiceSettings
        }

        /** Configuration settings for the assistant's web widget. */
        fun widgetSettings(widgetSettings: WidgetSettings) =
            widgetSettings(JsonField.of(widgetSettings))

        /**
         * Sets [Builder.widgetSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widgetSettings] with a well-typed [WidgetSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun widgetSettings(widgetSettings: JsonField<WidgetSettings>) = apply {
            this.widgetSettings = widgetSettings
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
         * Returns an immutable instance of [InferenceEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .instructions()
         * .model()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferenceEmbedding =
            InferenceEmbedding(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("instructions", instructions),
                checkRequired("model", model),
                checkRequired("name", name),
                conversationFlow,
                description,
                dynamicVariables,
                dynamicVariablesWebhookTimeoutMs,
                dynamicVariablesWebhookUrl,
                (enabledFeatures ?: JsonMissing.of()).map { it.toImmutable() },
                externalLlm,
                fallbackConfig,
                greeting,
                importMetadata,
                insightSettings,
                (integrations ?: JsonMissing.of()).map { it.toImmutable() },
                interruptionSettings,
                llmApiKeyRef,
                (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                messagingSettings,
                observabilitySettings,
                postConversationSettings,
                privacySettings,
                (relatedMissionIds ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                telephonySettings,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                transcription,
                versionCreatedAt,
                versionId,
                versionName,
                voiceSettings,
                widgetSettings,
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
    fun validate(): InferenceEmbedding = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        instructions()
        model()
        name()
        conversationFlow().ifPresent { it.validate() }
        description()
        dynamicVariables().ifPresent { it.validate() }
        dynamicVariablesWebhookTimeoutMs()
        dynamicVariablesWebhookUrl()
        enabledFeatures().ifPresent { it.forEach { it.validate() } }
        externalLlm().ifPresent { it.validate() }
        fallbackConfig().ifPresent { it.validate() }
        greeting()
        importMetadata().ifPresent { it.validate() }
        insightSettings().ifPresent { it.validate() }
        integrations().ifPresent { it.forEach { it.validate() } }
        interruptionSettings().ifPresent { it.validate() }
        llmApiKeyRef()
        mcpServers().ifPresent { it.forEach { it.validate() } }
        messagingSettings().ifPresent { it.validate() }
        observabilitySettings().ifPresent { it.validate() }
        postConversationSettings().ifPresent { it.validate() }
        privacySettings().ifPresent { it.validate() }
        relatedMissionIds()
        tags()
        telephonySettings().ifPresent { it.validate() }
        tools().ifPresent { it.forEach { it.validate() } }
        transcription().ifPresent { it.validate() }
        versionCreatedAt()
        versionId()
        versionName()
        voiceSettings().ifPresent { it.validate() }
        widgetSettings().ifPresent { it.validate() }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (conversationFlow.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dynamicVariablesWebhookTimeoutMs.asKnown().isPresent) 1 else 0) +
            (if (dynamicVariablesWebhookUrl.asKnown().isPresent) 1 else 0) +
            (enabledFeatures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
            (fallbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (greeting.asKnown().isPresent) 1 else 0) +
            (importMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (insightSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (integrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (mcpServers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (messagingSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (observabilitySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (postConversationSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (privacySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (relatedMissionIds.asKnown().getOrNull()?.size ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (telephonySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (transcription.asKnown().getOrNull()?.validity() ?: 0) +
            (if (versionCreatedAt.asKnown().isPresent) 1 else 0) +
            (if (versionId.asKnown().isPresent) 1 else 0) +
            (if (versionName.asKnown().isPresent) 1 else 0) +
            (voiceSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (widgetSettings.asKnown().getOrNull()?.validity() ?: 0)

    /** Conversation flow as returned by the API. */
    class ConversationFlow
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val nodes: JsonField<List<Node>>,
        private val startNodeId: JsonField<String>,
        private val edges: JsonField<List<Edge>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("nodes") @ExcludeMissing nodes: JsonField<List<Node>> = JsonMissing.of(),
            @JsonProperty("start_node_id")
            @ExcludeMissing
            startNodeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("edges") @ExcludeMissing edges: JsonField<List<Edge>> = JsonMissing.of(),
        ) : this(nodes, startNodeId, edges, mutableMapOf())

        /**
         * All nodes in the flow.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nodes(): List<Node> = nodes.getRequired("nodes")

        /**
         * ID of the node where the conversation begins.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startNodeId(): String = startNodeId.getRequired("start_node_id")

        /**
         * Directed transitions between nodes.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun edges(): Optional<List<Edge>> = edges.getOptional("edges")

        /**
         * Returns the raw JSON value of [nodes].
         *
         * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nodes") @ExcludeMissing fun _nodes(): JsonField<List<Node>> = nodes

        /**
         * Returns the raw JSON value of [startNodeId].
         *
         * Unlike [startNodeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_node_id")
        @ExcludeMissing
        fun _startNodeId(): JsonField<String> = startNodeId

        /**
         * Returns the raw JSON value of [edges].
         *
         * Unlike [edges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("edges") @ExcludeMissing fun _edges(): JsonField<List<Edge>> = edges

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
             * Returns a mutable builder for constructing an instance of [ConversationFlow].
             *
             * The following fields are required:
             * ```java
             * .nodes()
             * .startNodeId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConversationFlow]. */
        class Builder internal constructor() {

            private var nodes: JsonField<MutableList<Node>>? = null
            private var startNodeId: JsonField<String>? = null
            private var edges: JsonField<MutableList<Edge>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conversationFlow: ConversationFlow) = apply {
                nodes = conversationFlow.nodes.map { it.toMutableList() }
                startNodeId = conversationFlow.startNodeId
                edges = conversationFlow.edges.map { it.toMutableList() }
                additionalProperties = conversationFlow.additionalProperties.toMutableMap()
            }

            /** All nodes in the flow. */
            fun nodes(nodes: List<Node>) = nodes(JsonField.of(nodes))

            /**
             * Sets [Builder.nodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nodes] with a well-typed `List<Node>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nodes(nodes: JsonField<List<Node>>) = apply {
                this.nodes = nodes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Node] to [nodes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNode(node: Node) = apply {
                nodes =
                    (nodes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("nodes", it).add(node)
                    }
            }

            /** Alias for calling [addNode] with `Node.ofPrompt(prompt)`. */
            fun addNode(prompt: Node.Prompt) = addNode(Node.ofPrompt(prompt))

            /** Alias for calling [addNode] with `Node.ofTool(tool)`. */
            fun addNode(tool: Node.Tool) = addNode(Node.ofTool(tool))

            /** Alias for calling [addNode] with `Node.ofSpeak(speak)`. */
            fun addNode(speak: Node.Speak) = addNode(Node.ofSpeak(speak))

            /** ID of the node where the conversation begins. */
            fun startNodeId(startNodeId: String) = startNodeId(JsonField.of(startNodeId))

            /**
             * Sets [Builder.startNodeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startNodeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startNodeId(startNodeId: JsonField<String>) = apply {
                this.startNodeId = startNodeId
            }

            /** Directed transitions between nodes. */
            fun edges(edges: List<Edge>) = edges(JsonField.of(edges))

            /**
             * Sets [Builder.edges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.edges] with a well-typed `List<Edge>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun edges(edges: JsonField<List<Edge>>) = apply {
                this.edges = edges.map { it.toMutableList() }
            }

            /**
             * Adds a single [Edge] to [edges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEdge(edge: Edge) = apply {
                edges =
                    (edges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("edges", it).add(edge)
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
             * Returns an immutable instance of [ConversationFlow].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .nodes()
             * .startNodeId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConversationFlow =
                ConversationFlow(
                    checkRequired("nodes", nodes).map { it.toImmutable() },
                    checkRequired("startNodeId", startNodeId),
                    (edges ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): ConversationFlow = apply {
            if (validated) {
                return@apply
            }

            nodes().forEach { it.validate() }
            startNodeId()
            edges().ifPresent { it.forEach { it.validate() } }
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
            (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startNodeId.asKnown().isPresent) 1 else 0) +
                (edges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** One step in a conversation flow, as returned by the API. */
        @JsonDeserialize(using = Node.Deserializer::class)
        @JsonSerialize(using = Node.Serializer::class)
        class Node
        private constructor(
            private val prompt: Prompt? = null,
            private val tool: Tool? = null,
            private val speak: Speak? = null,
            private val _json: JsonValue? = null,
        ) {

            /** One step in a conversation flow, as returned by the API. */
            fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt)

            /** A standalone tool step in a conversation flow, as returned by the API. */
            fun tool(): Optional<Tool> = Optional.ofNullable(tool)

            /** A standalone scripted-message step in a flow, as returned by the API. */
            fun speak(): Optional<Speak> = Optional.ofNullable(speak)

            fun isPrompt(): Boolean = prompt != null

            fun isTool(): Boolean = tool != null

            fun isSpeak(): Boolean = speak != null

            /** One step in a conversation flow, as returned by the API. */
            fun asPrompt(): Prompt = prompt.getOrThrow("prompt")

            /** A standalone tool step in a conversation flow, as returned by the API. */
            fun asTool(): Tool = tool.getOrThrow("tool")

            /** A standalone scripted-message step in a flow, as returned by the API. */
            fun asSpeak(): Speak = speak.getOrThrow("speak")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = node.accept(new Node.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitPrompt(Prompt prompt) {
             *         return Optional.of(prompt.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    prompt != null -> visitor.visitPrompt(prompt)
                    tool != null -> visitor.visitTool(tool)
                    speak != null -> visitor.visitSpeak(speak)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Node = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitPrompt(prompt: Prompt) {
                            prompt.validate()
                        }

                        override fun visitTool(tool: Tool) {
                            tool.validate()
                        }

                        override fun visitSpeak(speak: Speak) {
                            speak.validate()
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
                        override fun visitPrompt(prompt: Prompt) = prompt.validity()

                        override fun visitTool(tool: Tool) = tool.validity()

                        override fun visitSpeak(speak: Speak) = speak.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Node &&
                    prompt == other.prompt &&
                    tool == other.tool &&
                    speak == other.speak
            }

            override fun hashCode(): Int = Objects.hash(prompt, tool, speak)

            override fun toString(): String =
                when {
                    prompt != null -> "Node{prompt=$prompt}"
                    tool != null -> "Node{tool=$tool}"
                    speak != null -> "Node{speak=$speak}"
                    _json != null -> "Node{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Node")
                }

            companion object {

                /** One step in a conversation flow, as returned by the API. */
                @JvmStatic fun ofPrompt(prompt: Prompt) = Node(prompt = prompt)

                /** A standalone tool step in a conversation flow, as returned by the API. */
                @JvmStatic fun ofTool(tool: Tool) = Node(tool = tool)

                /** A standalone scripted-message step in a flow, as returned by the API. */
                @JvmStatic fun ofSpeak(speak: Speak) = Node(speak = speak)
            }

            /**
             * An interface that defines how to map each variant of [Node] to a value of type [T].
             */
            interface Visitor<out T> {

                /** One step in a conversation flow, as returned by the API. */
                fun visitPrompt(prompt: Prompt): T

                /** A standalone tool step in a conversation flow, as returned by the API. */
                fun visitTool(tool: Tool): T

                /** A standalone scripted-message step in a flow, as returned by the API. */
                fun visitSpeak(speak: Speak): T

                /**
                 * Maps an unknown variant of [Node] to a value of type [T].
                 *
                 * An instance of [Node] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Node: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Node>(Node::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Node {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {
                        "prompt" -> {
                            return tryDeserialize(node, jacksonTypeRef<Prompt>())?.let {
                                Node(prompt = it, _json = json)
                            } ?: Node(_json = json)
                        }
                        "tool" -> {
                            return tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                                Node(tool = it, _json = json)
                            } ?: Node(_json = json)
                        }
                        "speak" -> {
                            return tryDeserialize(node, jacksonTypeRef<Speak>())?.let {
                                Node(speak = it, _json = json)
                            } ?: Node(_json = json)
                        }
                    }

                    return Node(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Node>(Node::class) {

                override fun serialize(
                    value: Node,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.prompt != null -> generator.writeObject(value.prompt)
                        value.tool != null -> generator.writeObject(value.tool)
                        value.speak != null -> generator.writeObject(value.speak)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Node")
                    }
                }
            }

            /** One step in a conversation flow, as returned by the API. */
            class Prompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val instructions: JsonField<String>,
                private val externalLlm: JsonField<ExternalLlm>,
                private val instructionsMode: JsonField<InstructionsMode>,
                private val llmApiKeyRef: JsonField<String>,
                private val model: JsonField<String>,
                private val name: JsonField<String>,
                private val position: JsonField<Position>,
                private val sharedToolIds: JsonField<List<String>>,
                private val tools: JsonField<List<List<AssistantTool>>>,
                private val toolsMode: JsonField<ToolsMode>,
                private val transcription: JsonField<TranscriptionSettings>,
                private val type: JsonField<Type>,
                private val voiceSettings: JsonField<VoiceSettings>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("instructions")
                    @ExcludeMissing
                    instructions: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("external_llm")
                    @ExcludeMissing
                    externalLlm: JsonField<ExternalLlm> = JsonMissing.of(),
                    @JsonProperty("instructions_mode")
                    @ExcludeMissing
                    instructionsMode: JsonField<InstructionsMode> = JsonMissing.of(),
                    @JsonProperty("llm_api_key_ref")
                    @ExcludeMissing
                    llmApiKeyRef: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model")
                    @ExcludeMissing
                    model: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("position")
                    @ExcludeMissing
                    position: JsonField<Position> = JsonMissing.of(),
                    @JsonProperty("shared_tool_ids")
                    @ExcludeMissing
                    sharedToolIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("tools")
                    @ExcludeMissing
                    tools: JsonField<List<List<AssistantTool>>> = JsonMissing.of(),
                    @JsonProperty("tools_mode")
                    @ExcludeMissing
                    toolsMode: JsonField<ToolsMode> = JsonMissing.of(),
                    @JsonProperty("transcription")
                    @ExcludeMissing
                    transcription: JsonField<TranscriptionSettings> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("voice_settings")
                    @ExcludeMissing
                    voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
                ) : this(
                    id,
                    instructions,
                    externalLlm,
                    instructionsMode,
                    llmApiKeyRef,
                    model,
                    name,
                    position,
                    sharedToolIds,
                    tools,
                    toolsMode,
                    transcription,
                    type,
                    voiceSettings,
                    mutableMapOf(),
                )

                /**
                 * Caller-supplied unique identifier for this node within the flow.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Prompt that drives the LLM while this node is active. Required.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun instructions(): String = instructions.getRequired("instructions")

                /**
                 * Override for `Assistant.external_llm` while this node is active. Use this to
                 * route a node's turns to a different external LLM (different `model`, `base_url`,
                 * credentials). Part of the LLM bundle — see `model` for cascade semantics.
                 * Mutually exclusive with `model` on the node (a single LLM identity per node).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun externalLlm(): Optional<ExternalLlm> = externalLlm.getOptional("external_llm")

                /**
                 * How `instructions` combine with the assistant-level instructions. `replace`
                 * (default): the node's instructions are used alone. `append`: the node's
                 * instructions are concatenated after the assistant's instructions.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun instructionsMode(): Optional<InstructionsMode> =
                    instructionsMode.getOptional("instructions_mode")

                /**
                 * Override for `Assistant.llm_api_key_ref` while this node is active. Part of the
                 * LLM bundle — see `model` for cascade semantics.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

                /**
                 * Override for `Assistant.model` while this node is active. Part of the LLM bundle
                 * (`model` + `llm_api_key_ref` + `external_llm`): when any of the three is set on
                 * the node, all three are taken from the node and the assistant-level LLM identity
                 * is not consulted. When none of the three is set, the assistant's bundle cascades
                 * unchanged.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun model(): Optional<String> = model.getOptional("model")

                /**
                 * Optional human-readable label, displayed in authoring UIs.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun position(): Optional<Position> = position.getOptional("position")

                /**
                 * IDs of shared (org-level) tools available at this node. Knowledge bases are
                 * attached the same way — via a shared retrieval tool. Tools not listed here are
                 * not callable while this node is active.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun sharedToolIds(): Optional<List<String>> =
                    sharedToolIds.getOptional("shared_tool_ids")

                /**
                 * Full tool definitions for this node, resolved from `shared_tool_ids` server-side.
                 * Populated on responses so clients can render the flow without a follow-up fetch
                 * per shared tool. Ignored on input — set `shared_tool_ids` to configure a node's
                 * tools.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tools(): Optional<List<List<AssistantTool>>> = tools.getOptional("tools")

                /**
                 * How `shared_tool_ids` combine with the assistant-level tool set. `replace`
                 * (default): only the node's tools are callable. `append`: the node's tools are
                 * added to the assistant's tools. Ignored when `shared_tool_ids` is null.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun toolsMode(): Optional<ToolsMode> = toolsMode.getOptional("tools_mode")

                /**
                 * Per-node transcription override (response form).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun transcription(): Optional<TranscriptionSettings> =
                    transcription.getOptional("transcription")

                /**
                 * Node kind discriminator. `prompt` is an LLM-driven step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Per-node voice override (response form).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun voiceSettings(): Optional<VoiceSettings> =
                    voiceSettings.getOptional("voice_settings")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [instructions].
                 *
                 * Unlike [instructions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("instructions")
                @ExcludeMissing
                fun _instructions(): JsonField<String> = instructions

                /**
                 * Returns the raw JSON value of [externalLlm].
                 *
                 * Unlike [externalLlm], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_llm")
                @ExcludeMissing
                fun _externalLlm(): JsonField<ExternalLlm> = externalLlm

                /**
                 * Returns the raw JSON value of [instructionsMode].
                 *
                 * Unlike [instructionsMode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("instructions_mode")
                @ExcludeMissing
                fun _instructionsMode(): JsonField<InstructionsMode> = instructionsMode

                /**
                 * Returns the raw JSON value of [llmApiKeyRef].
                 *
                 * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("llm_api_key_ref")
                @ExcludeMissing
                fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

                /**
                 * Returns the raw JSON value of [model].
                 *
                 * Unlike [model], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [position].
                 *
                 * Unlike [position], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("position")
                @ExcludeMissing
                fun _position(): JsonField<Position> = position

                /**
                 * Returns the raw JSON value of [sharedToolIds].
                 *
                 * Unlike [sharedToolIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("shared_tool_ids")
                @ExcludeMissing
                fun _sharedToolIds(): JsonField<List<String>> = sharedToolIds

                /**
                 * Returns the raw JSON value of [tools].
                 *
                 * Unlike [tools], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tools")
                @ExcludeMissing
                fun _tools(): JsonField<List<List<AssistantTool>>> = tools

                /**
                 * Returns the raw JSON value of [toolsMode].
                 *
                 * Unlike [toolsMode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tools_mode")
                @ExcludeMissing
                fun _toolsMode(): JsonField<ToolsMode> = toolsMode

                /**
                 * Returns the raw JSON value of [transcription].
                 *
                 * Unlike [transcription], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transcription")
                @ExcludeMissing
                fun _transcription(): JsonField<TranscriptionSettings> = transcription

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [voiceSettings].
                 *
                 * Unlike [voiceSettings], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("voice_settings")
                @ExcludeMissing
                fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

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
                     * Returns a mutable builder for constructing an instance of [Prompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .instructions()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Prompt]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var instructions: JsonField<String>? = null
                    private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
                    private var instructionsMode: JsonField<InstructionsMode> = JsonMissing.of()
                    private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
                    private var model: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var position: JsonField<Position> = JsonMissing.of()
                    private var sharedToolIds: JsonField<MutableList<String>>? = null
                    private var tools: JsonField<MutableList<List<AssistantTool>>>? = null
                    private var toolsMode: JsonField<ToolsMode> = JsonMissing.of()
                    private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(prompt: Prompt) = apply {
                        id = prompt.id
                        instructions = prompt.instructions
                        externalLlm = prompt.externalLlm
                        instructionsMode = prompt.instructionsMode
                        llmApiKeyRef = prompt.llmApiKeyRef
                        model = prompt.model
                        name = prompt.name
                        position = prompt.position
                        sharedToolIds = prompt.sharedToolIds.map { it.toMutableList() }
                        tools = prompt.tools.map { it.toMutableList() }
                        toolsMode = prompt.toolsMode
                        transcription = prompt.transcription
                        type = prompt.type
                        voiceSettings = prompt.voiceSettings
                        additionalProperties = prompt.additionalProperties.toMutableMap()
                    }

                    /** Caller-supplied unique identifier for this node within the flow. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Prompt that drives the LLM while this node is active. Required. */
                    fun instructions(instructions: String) =
                        instructions(JsonField.of(instructions))

                    /**
                     * Sets [Builder.instructions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.instructions] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun instructions(instructions: JsonField<String>) = apply {
                        this.instructions = instructions
                    }

                    /**
                     * Override for `Assistant.external_llm` while this node is active. Use this to
                     * route a node's turns to a different external LLM (different `model`,
                     * `base_url`, credentials). Part of the LLM bundle — see `model` for cascade
                     * semantics. Mutually exclusive with `model` on the node (a single LLM identity
                     * per node).
                     */
                    fun externalLlm(externalLlm: ExternalLlm) =
                        externalLlm(JsonField.of(externalLlm))

                    /**
                     * Sets [Builder.externalLlm] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalLlm] with a well-typed [ExternalLlm]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalLlm(externalLlm: JsonField<ExternalLlm>) = apply {
                        this.externalLlm = externalLlm
                    }

                    /**
                     * How `instructions` combine with the assistant-level instructions. `replace`
                     * (default): the node's instructions are used alone. `append`: the node's
                     * instructions are concatenated after the assistant's instructions.
                     */
                    fun instructionsMode(instructionsMode: InstructionsMode) =
                        instructionsMode(JsonField.of(instructionsMode))

                    /**
                     * Sets [Builder.instructionsMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.instructionsMode] with a well-typed
                     * [InstructionsMode] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun instructionsMode(instructionsMode: JsonField<InstructionsMode>) = apply {
                        this.instructionsMode = instructionsMode
                    }

                    /**
                     * Override for `Assistant.llm_api_key_ref` while this node is active. Part of
                     * the LLM bundle — see `model` for cascade semantics.
                     */
                    fun llmApiKeyRef(llmApiKeyRef: String) =
                        llmApiKeyRef(JsonField.of(llmApiKeyRef))

                    /**
                     * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.llmApiKeyRef] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
                        this.llmApiKeyRef = llmApiKeyRef
                    }

                    /**
                     * Override for `Assistant.model` while this node is active. Part of the LLM
                     * bundle (`model` + `llm_api_key_ref` + `external_llm`): when any of the three
                     * is set on the node, all three are taken from the node and the assistant-level
                     * LLM identity is not consulted. When none of the three is set, the assistant's
                     * bundle cascades unchanged.
                     */
                    fun model(model: String) = model(JsonField.of(model))

                    /**
                     * Sets [Builder.model] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.model] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun model(model: JsonField<String>) = apply { this.model = model }

                    /** Optional human-readable label, displayed in authoring UIs. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Optional canvas coordinates used by authoring UIs to lay out the graph.
                     * Ignored by the runtime; round-trips so frontends can persist graph layout
                     * across reloads.
                     */
                    fun position(position: Position) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [Position] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun position(position: JsonField<Position>) = apply { this.position = position }

                    /**
                     * IDs of shared (org-level) tools available at this node. Knowledge bases are
                     * attached the same way — via a shared retrieval tool. Tools not listed here
                     * are not callable while this node is active.
                     */
                    fun sharedToolIds(sharedToolIds: List<String>) =
                        sharedToolIds(JsonField.of(sharedToolIds))

                    /**
                     * Sets [Builder.sharedToolIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sharedToolIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun sharedToolIds(sharedToolIds: JsonField<List<String>>) = apply {
                        this.sharedToolIds = sharedToolIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [sharedToolIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSharedToolId(sharedToolId: String) = apply {
                        sharedToolIds =
                            (sharedToolIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("sharedToolIds", it).add(sharedToolId)
                            }
                    }

                    /**
                     * Full tool definitions for this node, resolved from `shared_tool_ids`
                     * server-side. Populated on responses so clients can render the flow without a
                     * follow-up fetch per shared tool. Ignored on input — set `shared_tool_ids` to
                     * configure a node's tools.
                     */
                    fun tools(tools: List<List<AssistantTool>>) = tools(JsonField.of(tools))

                    /**
                     * Sets [Builder.tools] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tools] with a well-typed
                     * `List<List<AssistantTool>>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun tools(tools: JsonField<List<List<AssistantTool>>>) = apply {
                        this.tools = tools.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [List<AssistantTool>] to [tools].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTool(tool: List<AssistantTool>) = apply {
                        tools =
                            (tools ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tools", it).add(tool)
                            }
                    }

                    /**
                     * How `shared_tool_ids` combine with the assistant-level tool set. `replace`
                     * (default): only the node's tools are callable. `append`: the node's tools are
                     * added to the assistant's tools. Ignored when `shared_tool_ids` is null.
                     */
                    fun toolsMode(toolsMode: ToolsMode) = toolsMode(JsonField.of(toolsMode))

                    /**
                     * Sets [Builder.toolsMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.toolsMode] with a well-typed [ToolsMode]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun toolsMode(toolsMode: JsonField<ToolsMode>) = apply {
                        this.toolsMode = toolsMode
                    }

                    /** Per-node transcription override (response form). */
                    fun transcription(transcription: TranscriptionSettings) =
                        transcription(JsonField.of(transcription))

                    /**
                     * Sets [Builder.transcription] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transcription] with a well-typed
                     * [TranscriptionSettings] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun transcription(transcription: JsonField<TranscriptionSettings>) = apply {
                        this.transcription = transcription
                    }

                    /** Node kind discriminator. `prompt` is an LLM-driven step. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** Per-node voice override (response form). */
                    fun voiceSettings(voiceSettings: VoiceSettings) =
                        voiceSettings(JsonField.of(voiceSettings))

                    /**
                     * Sets [Builder.voiceSettings] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.voiceSettings] with a well-typed
                     * [VoiceSettings] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
                        this.voiceSettings = voiceSettings
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Prompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .instructions()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Prompt =
                        Prompt(
                            checkRequired("id", id),
                            checkRequired("instructions", instructions),
                            externalLlm,
                            instructionsMode,
                            llmApiKeyRef,
                            model,
                            name,
                            position,
                            (sharedToolIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (tools ?: JsonMissing.of()).map { it.toImmutable() },
                            toolsMode,
                            transcription,
                            type,
                            voiceSettings,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Prompt = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    instructions()
                    externalLlm().ifPresent { it.validate() }
                    instructionsMode().ifPresent { it.validate() }
                    llmApiKeyRef()
                    model()
                    name()
                    position().ifPresent { it.validate() }
                    sharedToolIds()
                    tools().ifPresent { it.forEach { it.forEach { it.validate() } } }
                    toolsMode().ifPresent { it.validate() }
                    transcription().ifPresent { it.validate() }
                    type().ifPresent { it.validate() }
                    voiceSettings().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (instructions.asKnown().isPresent) 1 else 0) +
                        (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
                        (instructionsMode.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                        (if (model.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (position.asKnown().getOrNull()?.validity() ?: 0) +
                        (sharedToolIds.asKnown().getOrNull()?.size ?: 0) +
                        (tools.asKnown().getOrNull()?.sumOf {
                            it.sumOf { it.validity().toInt() }.toInt()
                        } ?: 0) +
                        (toolsMode.asKnown().getOrNull()?.validity() ?: 0) +
                        (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Override for `Assistant.external_llm` while this node is active. Use this to
                 * route a node's turns to a different external LLM (different `model`, `base_url`,
                 * credentials). Part of the LLM bundle — see `model` for cascade semantics.
                 * Mutually exclusive with `model` on the node (a single LLM identity per node).
                 */
                class ExternalLlm
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val baseUrl: JsonField<String>,
                    private val model: JsonField<String>,
                    private val authenticationMethod: JsonField<AuthenticationMethod>,
                    private val certificateRef: JsonField<String>,
                    private val forwardMetadata: JsonField<Boolean>,
                    private val llmApiKeyRef: JsonField<String>,
                    private val tokenRetrievalUrl: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("base_url")
                        @ExcludeMissing
                        baseUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("model")
                        @ExcludeMissing
                        model: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("authentication_method")
                        @ExcludeMissing
                        authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
                        @JsonProperty("certificate_ref")
                        @ExcludeMissing
                        certificateRef: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("forward_metadata")
                        @ExcludeMissing
                        forwardMetadata: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("llm_api_key_ref")
                        @ExcludeMissing
                        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("token_retrieval_url")
                        @ExcludeMissing
                        tokenRetrievalUrl: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        baseUrl,
                        model,
                        authenticationMethod,
                        certificateRef,
                        forwardMetadata,
                        llmApiKeyRef,
                        tokenRetrievalUrl,
                        mutableMapOf(),
                    )

                    /**
                     * Base URL for the external LLM endpoint.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun baseUrl(): String = baseUrl.getRequired("base_url")

                    /**
                     * Model identifier to use with the external LLM endpoint.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun model(): String = model.getRequired("model")

                    /**
                     * Authentication method used when connecting to the external LLM endpoint.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun authenticationMethod(): Optional<AuthenticationMethod> =
                        authenticationMethod.getOptional("authentication_method")

                    /**
                     * Integration secret identifier for the client certificate used with
                     * certificate authentication.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun certificateRef(): Optional<String> =
                        certificateRef.getOptional("certificate_ref")

                    /**
                     * When `true`, Telnyx forwards the assistant's dynamic variables to the
                     * external LLM endpoint as a top-level `extra_metadata` object on the chat
                     * completion request body. Defaults to `false`. Example payload sent to the
                     * external endpoint: `{"extra_metadata": {"customer_name": "Jane",
                     * "account_id": "acct_789", "telnyx_agent_target": "+13125550100",
                     * "telnyx_end_user_target": "+13125550123"}}`. Distinct from OpenAI's native
                     * `metadata` field, which has its own size and type limits.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun forwardMetadata(): Optional<Boolean> =
                        forwardMetadata.getOptional("forward_metadata")

                    /**
                     * Integration secret identifier for the external LLM API key.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun llmApiKeyRef(): Optional<String> =
                        llmApiKeyRef.getOptional("llm_api_key_ref")

                    /**
                     * URL used to retrieve an access token when certificate authentication is
                     * enabled.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun tokenRetrievalUrl(): Optional<String> =
                        tokenRetrievalUrl.getOptional("token_retrieval_url")

                    /**
                     * Returns the raw JSON value of [baseUrl].
                     *
                     * Unlike [baseUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("base_url")
                    @ExcludeMissing
                    fun _baseUrl(): JsonField<String> = baseUrl

                    /**
                     * Returns the raw JSON value of [model].
                     *
                     * Unlike [model], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

                    /**
                     * Returns the raw JSON value of [authenticationMethod].
                     *
                     * Unlike [authenticationMethod], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("authentication_method")
                    @ExcludeMissing
                    fun _authenticationMethod(): JsonField<AuthenticationMethod> =
                        authenticationMethod

                    /**
                     * Returns the raw JSON value of [certificateRef].
                     *
                     * Unlike [certificateRef], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("certificate_ref")
                    @ExcludeMissing
                    fun _certificateRef(): JsonField<String> = certificateRef

                    /**
                     * Returns the raw JSON value of [forwardMetadata].
                     *
                     * Unlike [forwardMetadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("forward_metadata")
                    @ExcludeMissing
                    fun _forwardMetadata(): JsonField<Boolean> = forwardMetadata

                    /**
                     * Returns the raw JSON value of [llmApiKeyRef].
                     *
                     * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("llm_api_key_ref")
                    @ExcludeMissing
                    fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

                    /**
                     * Returns the raw JSON value of [tokenRetrievalUrl].
                     *
                     * Unlike [tokenRetrievalUrl], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("token_retrieval_url")
                    @ExcludeMissing
                    fun _tokenRetrievalUrl(): JsonField<String> = tokenRetrievalUrl

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
                         * Returns a mutable builder for constructing an instance of [ExternalLlm].
                         *
                         * The following fields are required:
                         * ```java
                         * .baseUrl()
                         * .model()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ExternalLlm]. */
                    class Builder internal constructor() {

                        private var baseUrl: JsonField<String>? = null
                        private var model: JsonField<String>? = null
                        private var authenticationMethod: JsonField<AuthenticationMethod> =
                            JsonMissing.of()
                        private var certificateRef: JsonField<String> = JsonMissing.of()
                        private var forwardMetadata: JsonField<Boolean> = JsonMissing.of()
                        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
                        private var tokenRetrievalUrl: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(externalLlm: ExternalLlm) = apply {
                            baseUrl = externalLlm.baseUrl
                            model = externalLlm.model
                            authenticationMethod = externalLlm.authenticationMethod
                            certificateRef = externalLlm.certificateRef
                            forwardMetadata = externalLlm.forwardMetadata
                            llmApiKeyRef = externalLlm.llmApiKeyRef
                            tokenRetrievalUrl = externalLlm.tokenRetrievalUrl
                            additionalProperties = externalLlm.additionalProperties.toMutableMap()
                        }

                        /** Base URL for the external LLM endpoint. */
                        fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

                        /**
                         * Sets [Builder.baseUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.baseUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

                        /** Model identifier to use with the external LLM endpoint. */
                        fun model(model: String) = model(JsonField.of(model))

                        /**
                         * Sets [Builder.model] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.model] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun model(model: JsonField<String>) = apply { this.model = model }

                        /**
                         * Authentication method used when connecting to the external LLM endpoint.
                         */
                        fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                            authenticationMethod(JsonField.of(authenticationMethod))

                        /**
                         * Sets [Builder.authenticationMethod] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.authenticationMethod] with a well-typed
                         * [AuthenticationMethod] value instead. This method is primarily for
                         * setting the field to an undocumented or not yet supported value.
                         */
                        fun authenticationMethod(
                            authenticationMethod: JsonField<AuthenticationMethod>
                        ) = apply { this.authenticationMethod = authenticationMethod }

                        /**
                         * Integration secret identifier for the client certificate used with
                         * certificate authentication.
                         */
                        fun certificateRef(certificateRef: String) =
                            certificateRef(JsonField.of(certificateRef))

                        /**
                         * Sets [Builder.certificateRef] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.certificateRef] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun certificateRef(certificateRef: JsonField<String>) = apply {
                            this.certificateRef = certificateRef
                        }

                        /**
                         * When `true`, Telnyx forwards the assistant's dynamic variables to the
                         * external LLM endpoint as a top-level `extra_metadata` object on the chat
                         * completion request body. Defaults to `false`. Example payload sent to the
                         * external endpoint: `{"extra_metadata": {"customer_name": "Jane",
                         * "account_id": "acct_789", "telnyx_agent_target": "+13125550100",
                         * "telnyx_end_user_target": "+13125550123"}}`. Distinct from OpenAI's
                         * native `metadata` field, which has its own size and type limits.
                         */
                        fun forwardMetadata(forwardMetadata: Boolean) =
                            forwardMetadata(JsonField.of(forwardMetadata))

                        /**
                         * Sets [Builder.forwardMetadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.forwardMetadata] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun forwardMetadata(forwardMetadata: JsonField<Boolean>) = apply {
                            this.forwardMetadata = forwardMetadata
                        }

                        /** Integration secret identifier for the external LLM API key. */
                        fun llmApiKeyRef(llmApiKeyRef: String) =
                            llmApiKeyRef(JsonField.of(llmApiKeyRef))

                        /**
                         * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.llmApiKeyRef] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
                            this.llmApiKeyRef = llmApiKeyRef
                        }

                        /**
                         * URL used to retrieve an access token when certificate authentication is
                         * enabled.
                         */
                        fun tokenRetrievalUrl(tokenRetrievalUrl: String) =
                            tokenRetrievalUrl(JsonField.of(tokenRetrievalUrl))

                        /**
                         * Sets [Builder.tokenRetrievalUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tokenRetrievalUrl] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun tokenRetrievalUrl(tokenRetrievalUrl: JsonField<String>) = apply {
                            this.tokenRetrievalUrl = tokenRetrievalUrl
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ExternalLlm].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .baseUrl()
                         * .model()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ExternalLlm =
                            ExternalLlm(
                                checkRequired("baseUrl", baseUrl),
                                checkRequired("model", model),
                                authenticationMethod,
                                certificateRef,
                                forwardMetadata,
                                llmApiKeyRef,
                                tokenRetrievalUrl,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ExternalLlm = apply {
                        if (validated) {
                            return@apply
                        }

                        baseUrl()
                        model()
                        authenticationMethod().ifPresent { it.validate() }
                        certificateRef()
                        forwardMetadata()
                        llmApiKeyRef()
                        tokenRetrievalUrl()
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
                        (if (baseUrl.asKnown().isPresent) 1 else 0) +
                            (if (model.asKnown().isPresent) 1 else 0) +
                            (authenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (certificateRef.asKnown().isPresent) 1 else 0) +
                            (if (forwardMetadata.asKnown().isPresent) 1 else 0) +
                            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                            (if (tokenRetrievalUrl.asKnown().isPresent) 1 else 0)

                    /** Authentication method used when connecting to the external LLM endpoint. */
                    class AuthenticationMethod
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val TOKEN = of("token")

                            @JvmField val CERTIFICATE = of("certificate")

                            @JvmStatic
                            fun of(value: String) = AuthenticationMethod(JsonField.of(value))
                        }

                        /** An enum containing [AuthenticationMethod]'s known values. */
                        enum class Known {
                            TOKEN,
                            CERTIFICATE,
                        }

                        /**
                         * An enum containing [AuthenticationMethod]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [AuthenticationMethod] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TOKEN,
                            CERTIFICATE,
                            /**
                             * An enum member indicating that [AuthenticationMethod] was
                             * instantiated with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                TOKEN -> Value.TOKEN
                                CERTIFICATE -> Value.CERTIFICATE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                TOKEN -> Known.TOKEN
                                CERTIFICATE -> Known.CERTIFICATE
                                else ->
                                    throw TelnyxInvalidDataException(
                                        "Unknown AuthenticationMethod: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                TelnyxInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): AuthenticationMethod = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is AuthenticationMethod && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ExternalLlm &&
                            baseUrl == other.baseUrl &&
                            model == other.model &&
                            authenticationMethod == other.authenticationMethod &&
                            certificateRef == other.certificateRef &&
                            forwardMetadata == other.forwardMetadata &&
                            llmApiKeyRef == other.llmApiKeyRef &&
                            tokenRetrievalUrl == other.tokenRetrievalUrl &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            baseUrl,
                            model,
                            authenticationMethod,
                            certificateRef,
                            forwardMetadata,
                            llmApiKeyRef,
                            tokenRetrievalUrl,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ExternalLlm{baseUrl=$baseUrl, model=$model, authenticationMethod=$authenticationMethod, certificateRef=$certificateRef, forwardMetadata=$forwardMetadata, llmApiKeyRef=$llmApiKeyRef, tokenRetrievalUrl=$tokenRetrievalUrl, additionalProperties=$additionalProperties}"
                }

                /**
                 * How `instructions` combine with the assistant-level instructions. `replace`
                 * (default): the node's instructions are used alone. `append`: the node's
                 * instructions are concatenated after the assistant's instructions.
                 */
                class InstructionsMode
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val REPLACE = of("replace")

                        @JvmField val APPEND = of("append")

                        @JvmStatic fun of(value: String) = InstructionsMode(JsonField.of(value))
                    }

                    /** An enum containing [InstructionsMode]'s known values. */
                    enum class Known {
                        REPLACE,
                        APPEND,
                    }

                    /**
                     * An enum containing [InstructionsMode]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [InstructionsMode] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        REPLACE,
                        APPEND,
                        /**
                         * An enum member indicating that [InstructionsMode] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            REPLACE -> Value.REPLACE
                            APPEND -> Value.APPEND
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            REPLACE -> Known.REPLACE
                            APPEND -> Known.APPEND
                            else ->
                                throw TelnyxInvalidDataException("Unknown InstructionsMode: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): InstructionsMode = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InstructionsMode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 */
                class Position
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val x: JsonField<Double>,
                    private val y: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
                    ) : this(x, y, mutableMapOf())

                    /**
                     * Horizontal coordinate in the authoring canvas.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun x(): Double = x.getRequired("x")

                    /**
                     * Vertical coordinate in the authoring canvas.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun y(): Double = y.getRequired("y")

                    /**
                     * Returns the raw JSON value of [x].
                     *
                     * Unlike [x], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

                    /**
                     * Returns the raw JSON value of [y].
                     *
                     * Unlike [y], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

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
                         * Returns a mutable builder for constructing an instance of [Position].
                         *
                         * The following fields are required:
                         * ```java
                         * .x()
                         * .y()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Position]. */
                    class Builder internal constructor() {

                        private var x: JsonField<Double>? = null
                        private var y: JsonField<Double>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(position: Position) = apply {
                            x = position.x
                            y = position.y
                            additionalProperties = position.additionalProperties.toMutableMap()
                        }

                        /** Horizontal coordinate in the authoring canvas. */
                        fun x(x: Double) = x(JsonField.of(x))

                        /**
                         * Sets [Builder.x] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.x] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun x(x: JsonField<Double>) = apply { this.x = x }

                        /** Vertical coordinate in the authoring canvas. */
                        fun y(y: Double) = y(JsonField.of(y))

                        /**
                         * Sets [Builder.y] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.y] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun y(y: JsonField<Double>) = apply { this.y = y }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Position].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .x()
                         * .y()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Position =
                            Position(
                                checkRequired("x", x),
                                checkRequired("y", y),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Position = apply {
                        if (validated) {
                            return@apply
                        }

                        x()
                        y()
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
                        (if (x.asKnown().isPresent) 1 else 0) +
                            (if (y.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Position &&
                            x == other.x &&
                            y == other.y &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(x, y, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Position{x=$x, y=$y, additionalProperties=$additionalProperties}"
                }

                /**
                 * How `shared_tool_ids` combine with the assistant-level tool set. `replace`
                 * (default): only the node's tools are callable. `append`: the node's tools are
                 * added to the assistant's tools. Ignored when `shared_tool_ids` is null.
                 */
                class ToolsMode
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val REPLACE = of("replace")

                        @JvmField val APPEND = of("append")

                        @JvmStatic fun of(value: String) = ToolsMode(JsonField.of(value))
                    }

                    /** An enum containing [ToolsMode]'s known values. */
                    enum class Known {
                        REPLACE,
                        APPEND,
                    }

                    /**
                     * An enum containing [ToolsMode]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ToolsMode] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        REPLACE,
                        APPEND,
                        /**
                         * An enum member indicating that [ToolsMode] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            REPLACE -> Value.REPLACE
                            APPEND -> Value.APPEND
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            REPLACE -> Known.REPLACE
                            APPEND -> Known.APPEND
                            else -> throw TelnyxInvalidDataException("Unknown ToolsMode: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ToolsMode = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ToolsMode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Node kind discriminator. `prompt` is an LLM-driven step. */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PROMPT = of("prompt")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PROMPT
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PROMPT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PROMPT -> Value.PROMPT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PROMPT -> Known.PROMPT
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Type = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Prompt &&
                        id == other.id &&
                        instructions == other.instructions &&
                        externalLlm == other.externalLlm &&
                        instructionsMode == other.instructionsMode &&
                        llmApiKeyRef == other.llmApiKeyRef &&
                        model == other.model &&
                        name == other.name &&
                        position == other.position &&
                        sharedToolIds == other.sharedToolIds &&
                        tools == other.tools &&
                        toolsMode == other.toolsMode &&
                        transcription == other.transcription &&
                        type == other.type &&
                        voiceSettings == other.voiceSettings &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        instructions,
                        externalLlm,
                        instructionsMode,
                        llmApiKeyRef,
                        model,
                        name,
                        position,
                        sharedToolIds,
                        tools,
                        toolsMode,
                        transcription,
                        type,
                        voiceSettings,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Prompt{id=$id, instructions=$instructions, externalLlm=$externalLlm, instructionsMode=$instructionsMode, llmApiKeyRef=$llmApiKeyRef, model=$model, name=$name, position=$position, sharedToolIds=$sharedToolIds, tools=$tools, toolsMode=$toolsMode, transcription=$transcription, type=$type, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
            }

            /** A standalone tool step in a conversation flow, as returned by the API. */
            class Tool
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val sharedToolId: JsonField<String>,
                private val name: JsonField<String>,
                private val position: JsonField<Position>,
                private val tool: JsonField<List<AssistantTool>>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("shared_tool_id")
                    @ExcludeMissing
                    sharedToolId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("position")
                    @ExcludeMissing
                    position: JsonField<Position> = JsonMissing.of(),
                    @JsonProperty("tool")
                    @ExcludeMissing
                    tool: JsonField<List<AssistantTool>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(id, sharedToolId, name, position, tool, type, mutableMapOf())

                /**
                 * Caller-supplied unique identifier for this node within the flow.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * ID of the single shared (org-level) tool this node executes. When the flow
                 * reaches this node the tool runs as a deliberate step (no LLM turn); its outgoing
                 * `tool_result` edges then route on the outcome. Arguments are filled from the
                 * conversation's dynamic variables by name — a dynamic variable whose name matches
                 * one of the tool's parameters supplies that argument. Cross-validated against the
                 * org's shared tools on write.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun sharedToolId(): String = sharedToolId.getRequired("shared_tool_id")

                /**
                 * Optional human-readable label, displayed in authoring UIs.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun position(): Optional<Position> = position.getOptional("position")

                /**
                 * Full tool definition resolved from `shared_tool_id` server-side. Populated on
                 * responses so clients can render the node without a follow-up fetch. Ignored on
                 * input — set `shared_tool_id`.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tool(): Optional<List<AssistantTool>> = tool.getOptional("tool")

                /**
                 * Node kind discriminator. Always `tool` for a tool node.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [sharedToolId].
                 *
                 * Unlike [sharedToolId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("shared_tool_id")
                @ExcludeMissing
                fun _sharedToolId(): JsonField<String> = sharedToolId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [position].
                 *
                 * Unlike [position], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("position")
                @ExcludeMissing
                fun _position(): JsonField<Position> = position

                /**
                 * Returns the raw JSON value of [tool].
                 *
                 * Unlike [tool], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tool")
                @ExcludeMissing
                fun _tool(): JsonField<List<AssistantTool>> = tool

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * Returns a mutable builder for constructing an instance of [Tool].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .sharedToolId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tool]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var sharedToolId: JsonField<String>? = null
                    private var name: JsonField<String> = JsonMissing.of()
                    private var position: JsonField<Position> = JsonMissing.of()
                    private var tool: JsonField<MutableList<AssistantTool>>? = null
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tool: Tool) = apply {
                        id = tool.id
                        sharedToolId = tool.sharedToolId
                        name = tool.name
                        position = tool.position
                        this.tool = tool.tool.map { it.toMutableList() }
                        type = tool.type
                        additionalProperties = tool.additionalProperties.toMutableMap()
                    }

                    /** Caller-supplied unique identifier for this node within the flow. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * ID of the single shared (org-level) tool this node executes. When the flow
                     * reaches this node the tool runs as a deliberate step (no LLM turn); its
                     * outgoing `tool_result` edges then route on the outcome. Arguments are filled
                     * from the conversation's dynamic variables by name — a dynamic variable whose
                     * name matches one of the tool's parameters supplies that argument.
                     * Cross-validated against the org's shared tools on write.
                     */
                    fun sharedToolId(sharedToolId: String) =
                        sharedToolId(JsonField.of(sharedToolId))

                    /**
                     * Sets [Builder.sharedToolId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sharedToolId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sharedToolId(sharedToolId: JsonField<String>) = apply {
                        this.sharedToolId = sharedToolId
                    }

                    /** Optional human-readable label, displayed in authoring UIs. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Optional canvas coordinates used by authoring UIs to lay out the graph.
                     * Ignored by the runtime; round-trips so frontends can persist graph layout
                     * across reloads.
                     */
                    fun position(position: Position) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [Position] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun position(position: JsonField<Position>) = apply { this.position = position }

                    /**
                     * Full tool definition resolved from `shared_tool_id` server-side. Populated on
                     * responses so clients can render the node without a follow-up fetch. Ignored
                     * on input — set `shared_tool_id`.
                     */
                    fun tool(tool: List<AssistantTool>) = tool(JsonField.of(tool))

                    /**
                     * Sets [Builder.tool] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tool] with a well-typed
                     * `List<AssistantTool>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun tool(tool: JsonField<List<AssistantTool>>) = apply {
                        this.tool = tool.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [AssistantTool] to [Builder.tool].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTool(tool: AssistantTool) = apply {
                        this.tool =
                            (this.tool ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tool", it).add(tool)
                            }
                    }

                    /** Alias for calling [addTool] with `AssistantTool.ofWebhook(webhook)`. */
                    fun addTool(webhook: InferenceEmbeddingWebhookToolParams) =
                        addTool(AssistantTool.ofWebhook(webhook))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * InferenceEmbeddingWebhookToolParams.builder()
                     *     .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                     *     .webhook(webhook)
                     *     .build()
                     * ```
                     */
                    fun addWebhookTool(webhook: InferenceEmbeddingWebhookToolParams.Webhook) =
                        addTool(
                            InferenceEmbeddingWebhookToolParams.builder()
                                .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                                .webhook(webhook)
                                .build()
                        )

                    /** Alias for calling [addTool] with `AssistantTool.ofRetrieval(retrieval)`. */
                    fun addTool(retrieval: RetrievalTool) =
                        addTool(AssistantTool.ofRetrieval(retrieval))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * RetrievalTool.builder()
                     *     .type(RetrievalTool.Type.RETRIEVAL)
                     *     .retrieval(retrieval)
                     *     .build()
                     * ```
                     */
                    fun addRetrievalTool(retrieval: BucketIds) =
                        addTool(
                            RetrievalTool.builder()
                                .type(RetrievalTool.Type.RETRIEVAL)
                                .retrieval(retrieval)
                                .build()
                        )

                    /** Alias for calling [addTool] with `AssistantTool.ofHandoff(handoff)`. */
                    fun addTool(handoff: AssistantTool.HandoffTool) =
                        addTool(AssistantTool.ofHandoff(handoff))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.HandoffTool.builder()
                     *     .handoff(handoff)
                     *     .build()
                     * ```
                     */
                    fun addHandoffTool(handoff: AssistantTool.HandoffTool.Handoff) =
                        addTool(AssistantTool.HandoffTool.builder().handoff(handoff).build())

                    /** Alias for calling [addTool] with `AssistantTool.ofHangup(hangup)`. */
                    fun addTool(hangup: HangupTool) = addTool(AssistantTool.ofHangup(hangup))

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
                        addTool(
                            HangupTool.builder().type(HangupTool.Type.HANGUP).hangup(hangup).build()
                        )

                    /** Alias for calling [addTool] with `AssistantTool.ofTransfer(transfer)`. */
                    fun addTool(transfer: AssistantTool.Transfer) =
                        addTool(AssistantTool.ofTransfer(transfer))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.Transfer.builder()
                     *     .transfer(transfer)
                     *     .build()
                     * ```
                     */
                    fun addTransferTool(transfer: AssistantTool.Transfer.TransferConfig) =
                        addTool(AssistantTool.Transfer.builder().transfer(transfer).build())

                    /** Alias for calling [addTool] with `AssistantTool.ofInvite(invite)`. */
                    fun addTool(invite: AssistantTool.Invite) =
                        addTool(AssistantTool.ofInvite(invite))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.Invite.builder()
                     *     .invite(invite)
                     *     .build()
                     * ```
                     */
                    fun addInviteTool(invite: AssistantTool.Invite.InnerInvite) =
                        addTool(AssistantTool.Invite.builder().invite(invite).build())

                    /** Alias for calling [addTool] with `AssistantTool.ofRefer(refer)`. */
                    fun addTool(refer: AssistantTool.SipReferTool) =
                        addTool(AssistantTool.ofRefer(refer))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.SipReferTool.builder()
                     *     .refer(refer)
                     *     .build()
                     * ```
                     */
                    fun addReferTool(refer: AssistantTool.SipReferTool.Refer) =
                        addTool(AssistantTool.SipReferTool.builder().refer(refer).build())

                    /** Alias for calling [addTool] with `AssistantTool.ofSendDtmf(sendDtmf)`. */
                    fun addTool(sendDtmf: AssistantTool.DtmfTool) =
                        addTool(AssistantTool.ofSendDtmf(sendDtmf))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.DtmfTool.builder()
                     *     .sendDtmf(sendDtmf)
                     *     .build()
                     * ```
                     */
                    fun addSendDtmfTool(sendDtmf: AssistantTool.DtmfTool.SendDtmf) =
                        addTool(AssistantTool.DtmfTool.builder().sendDtmf(sendDtmf).build())

                    /**
                     * Alias for calling [addTool] with `AssistantTool.ofSendMessage(sendMessage)`.
                     */
                    fun addTool(sendMessage: AssistantTool.SendMessage) =
                        addTool(AssistantTool.ofSendMessage(sendMessage))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.SendMessage.builder()
                     *     .sendMessage(sendMessage)
                     *     .build()
                     * ```
                     */
                    fun addSendMessageTool(
                        sendMessage: AssistantTool.SendMessage.SendMessageConfig
                    ) =
                        addTool(
                            AssistantTool.SendMessage.builder().sendMessage(sendMessage).build()
                        )

                    /** Alias for calling [addTool] with `AssistantTool.ofSkipTurn(skipTurn)`. */
                    fun addTool(skipTurn: AssistantTool.SkipTurn) =
                        addTool(AssistantTool.ofSkipTurn(skipTurn))

                    /**
                     * Alias for calling [addTool] with the following:
                     * ```java
                     * AssistantTool.SkipTurn.builder()
                     *     .skipTurn(skipTurn)
                     *     .build()
                     * ```
                     */
                    fun addSkipTurnTool(skipTurn: AssistantTool.SkipTurn.SkipTurnConfig) =
                        addTool(AssistantTool.SkipTurn.builder().skipTurn(skipTurn).build())

                    /** Node kind discriminator. Always `tool` for a tool node. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tool].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .sharedToolId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tool =
                        Tool(
                            checkRequired("id", id),
                            checkRequired("sharedToolId", sharedToolId),
                            name,
                            position,
                            (tool ?: JsonMissing.of()).map { it.toImmutable() },
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Tool = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    sharedToolId()
                    name()
                    position().ifPresent { it.validate() }
                    tool().ifPresent { it.forEach { it.validate() } }
                    type().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (sharedToolId.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (position.asKnown().getOrNull()?.validity() ?: 0) +
                        (tool.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 */
                class Position
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val x: JsonField<Double>,
                    private val y: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
                    ) : this(x, y, mutableMapOf())

                    /**
                     * Horizontal coordinate in the authoring canvas.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun x(): Double = x.getRequired("x")

                    /**
                     * Vertical coordinate in the authoring canvas.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun y(): Double = y.getRequired("y")

                    /**
                     * Returns the raw JSON value of [x].
                     *
                     * Unlike [x], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

                    /**
                     * Returns the raw JSON value of [y].
                     *
                     * Unlike [y], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

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
                         * Returns a mutable builder for constructing an instance of [Position].
                         *
                         * The following fields are required:
                         * ```java
                         * .x()
                         * .y()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Position]. */
                    class Builder internal constructor() {

                        private var x: JsonField<Double>? = null
                        private var y: JsonField<Double>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(position: Position) = apply {
                            x = position.x
                            y = position.y
                            additionalProperties = position.additionalProperties.toMutableMap()
                        }

                        /** Horizontal coordinate in the authoring canvas. */
                        fun x(x: Double) = x(JsonField.of(x))

                        /**
                         * Sets [Builder.x] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.x] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun x(x: JsonField<Double>) = apply { this.x = x }

                        /** Vertical coordinate in the authoring canvas. */
                        fun y(y: Double) = y(JsonField.of(y))

                        /**
                         * Sets [Builder.y] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.y] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun y(y: JsonField<Double>) = apply { this.y = y }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Position].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .x()
                         * .y()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Position =
                            Position(
                                checkRequired("x", x),
                                checkRequired("y", y),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Position = apply {
                        if (validated) {
                            return@apply
                        }

                        x()
                        y()
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
                        (if (x.asKnown().isPresent) 1 else 0) +
                            (if (y.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Position &&
                            x == other.x &&
                            y == other.y &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(x, y, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Position{x=$x, y=$y, additionalProperties=$additionalProperties}"
                }

                /** Node kind discriminator. Always `tool` for a tool node. */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TOOL = of("tool")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        TOOL
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TOOL,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TOOL -> Value.TOOL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TOOL -> Known.TOOL
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Type = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tool &&
                        id == other.id &&
                        sharedToolId == other.sharedToolId &&
                        name == other.name &&
                        position == other.position &&
                        tool == other.tool &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, sharedToolId, name, position, tool, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tool{id=$id, sharedToolId=$sharedToolId, name=$name, position=$position, tool=$tool, type=$type, additionalProperties=$additionalProperties}"
            }

            /** A standalone scripted-message step in a flow, as returned by the API. */
            class Speak
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val message: JsonField<String>,
                private val name: JsonField<String>,
                private val position: JsonField<Position>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("position")
                    @ExcludeMissing
                    position: JsonField<Position> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(id, message, name, position, type, mutableMapOf())

                /**
                 * Caller-supplied unique identifier for this node within the flow.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Message delivered to the user verbatim when the flow reaches this node. No LLM
                 * turn — the text is spoken/sent exactly as written. `{{variable}}` placeholders
                 * are interpolated from the conversation's dynamic variables; an unresolved
                 * placeholder renders as an empty string. After delivering, the flow routes via the
                 * node's outgoing `llm` / `expression` edges (commonly a single unconditional
                 * edge).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun message(): String = message.getRequired("message")

                /**
                 * Optional human-readable label, displayed in authoring UIs.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun position(): Optional<Position> = position.getOptional("position")

                /**
                 * Node kind discriminator. Always `speak` for a speak node.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [message].
                 *
                 * Unlike [message], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [position].
                 *
                 * Unlike [position], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("position")
                @ExcludeMissing
                fun _position(): JsonField<Position> = position

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * Returns a mutable builder for constructing an instance of [Speak].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .message()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Speak]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var message: JsonField<String>? = null
                    private var name: JsonField<String> = JsonMissing.of()
                    private var position: JsonField<Position> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(speak: Speak) = apply {
                        id = speak.id
                        message = speak.message
                        name = speak.name
                        position = speak.position
                        type = speak.type
                        additionalProperties = speak.additionalProperties.toMutableMap()
                    }

                    /** Caller-supplied unique identifier for this node within the flow. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Message delivered to the user verbatim when the flow reaches this node. No
                     * LLM turn — the text is spoken/sent exactly as written. `{{variable}}`
                     * placeholders are interpolated from the conversation's dynamic variables; an
                     * unresolved placeholder renders as an empty string. After delivering, the flow
                     * routes via the node's outgoing `llm` / `expression` edges (commonly a single
                     * unconditional edge).
                     */
                    fun message(message: String) = message(JsonField.of(message))

                    /**
                     * Sets [Builder.message] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.message] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<String>) = apply { this.message = message }

                    /** Optional human-readable label, displayed in authoring UIs. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Optional canvas coordinates used by authoring UIs to lay out the graph.
                     * Ignored by the runtime; round-trips so frontends can persist graph layout
                     * across reloads.
                     */
                    fun position(position: Position) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [Position] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun position(position: JsonField<Position>) = apply { this.position = position }

                    /** Node kind discriminator. Always `speak` for a speak node. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Speak].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .message()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Speak =
                        Speak(
                            checkRequired("id", id),
                            checkRequired("message", message),
                            name,
                            position,
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Speak = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    message()
                    name()
                    position().ifPresent { it.validate() }
                    type().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (message.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (position.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 */
                class Position
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val x: JsonField<Double>,
                    private val y: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
                    ) : this(x, y, mutableMapOf())

                    /**
                     * Horizontal coordinate in the authoring canvas.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun x(): Double = x.getRequired("x")

                    /**
                     * Vertical coordinate in the authoring canvas.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun y(): Double = y.getRequired("y")

                    /**
                     * Returns the raw JSON value of [x].
                     *
                     * Unlike [x], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

                    /**
                     * Returns the raw JSON value of [y].
                     *
                     * Unlike [y], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

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
                         * Returns a mutable builder for constructing an instance of [Position].
                         *
                         * The following fields are required:
                         * ```java
                         * .x()
                         * .y()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Position]. */
                    class Builder internal constructor() {

                        private var x: JsonField<Double>? = null
                        private var y: JsonField<Double>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(position: Position) = apply {
                            x = position.x
                            y = position.y
                            additionalProperties = position.additionalProperties.toMutableMap()
                        }

                        /** Horizontal coordinate in the authoring canvas. */
                        fun x(x: Double) = x(JsonField.of(x))

                        /**
                         * Sets [Builder.x] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.x] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun x(x: JsonField<Double>) = apply { this.x = x }

                        /** Vertical coordinate in the authoring canvas. */
                        fun y(y: Double) = y(JsonField.of(y))

                        /**
                         * Sets [Builder.y] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.y] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun y(y: JsonField<Double>) = apply { this.y = y }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Position].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .x()
                         * .y()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Position =
                            Position(
                                checkRequired("x", x),
                                checkRequired("y", y),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Position = apply {
                        if (validated) {
                            return@apply
                        }

                        x()
                        y()
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
                        (if (x.asKnown().isPresent) 1 else 0) +
                            (if (y.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Position &&
                            x == other.x &&
                            y == other.y &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(x, y, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Position{x=$x, y=$y, additionalProperties=$additionalProperties}"
                }

                /** Node kind discriminator. Always `speak` for a speak node. */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SPEAK = of("speak")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        SPEAK
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SPEAK,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SPEAK -> Value.SPEAK
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SPEAK -> Known.SPEAK
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Type = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Speak &&
                        id == other.id &&
                        message == other.message &&
                        name == other.name &&
                        position == other.position &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, message, name, position, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Speak{id=$id, message=$message, name=$name, position=$position, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        /**
         * Directed transition from one node to a target, gated by a condition.
         *
         * The target is either another node in the same flow (`NodeTarget`) or a different
         * assistant (`AssistantTarget`). Multiple edges may share a `start_node_id`; the runtime
         * evaluates them in the order they're declared and takes the first whose condition is true.
         */
        class Edge
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val condition: JsonField<Condition>,
            private val startNodeId: JsonField<String>,
            private val target: JsonField<Target>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("condition")
                @ExcludeMissing
                condition: JsonField<Condition> = JsonMissing.of(),
                @JsonProperty("start_node_id")
                @ExcludeMissing
                startNodeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
            ) : this(id, condition, startNodeId, target, mutableMapOf())

            /**
             * Caller-supplied unique identifier for this edge within the flow.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Condition that gates the transition. Discriminated by `type`: `llm`, `expression`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun condition(): Condition = condition.getRequired("condition")

            /**
             * ID of the node this edge transitions away from.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startNodeId(): String = startNodeId.getRequired("start_node_id")

            /**
             * Destination of the transition. Discriminated by `type`: `node` (jump to another node
             * in this flow) or `assistant` (hand off to a different assistant).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun target(): Target = target.getRequired("target")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [condition].
             *
             * Unlike [condition], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("condition")
            @ExcludeMissing
            fun _condition(): JsonField<Condition> = condition

            /**
             * Returns the raw JSON value of [startNodeId].
             *
             * Unlike [startNodeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_node_id")
            @ExcludeMissing
            fun _startNodeId(): JsonField<String> = startNodeId

            /**
             * Returns the raw JSON value of [target].
             *
             * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

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
                 * Returns a mutable builder for constructing an instance of [Edge].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .condition()
                 * .startNodeId()
                 * .target()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Edge]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var condition: JsonField<Condition>? = null
                private var startNodeId: JsonField<String>? = null
                private var target: JsonField<Target>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(edge: Edge) = apply {
                    id = edge.id
                    condition = edge.condition
                    startNodeId = edge.startNodeId
                    target = edge.target
                    additionalProperties = edge.additionalProperties.toMutableMap()
                }

                /** Caller-supplied unique identifier for this edge within the flow. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Condition that gates the transition. Discriminated by `type`: `llm`,
                 * `expression`.
                 */
                fun condition(condition: Condition) = condition(JsonField.of(condition))

                /**
                 * Sets [Builder.condition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.condition] with a well-typed [Condition] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun condition(condition: JsonField<Condition>) = apply {
                    this.condition = condition
                }

                /** Alias for calling [condition] with `Condition.ofLlm(llm)`. */
                fun condition(llm: Condition.Llm) = condition(Condition.ofLlm(llm))

                /**
                 * Alias for calling [condition] with the following:
                 * ```java
                 * Condition.Llm.builder()
                 *     .prompt(prompt)
                 *     .build()
                 * ```
                 */
                fun llmCondition(prompt: String) =
                    condition(Condition.Llm.builder().prompt(prompt).build())

                /** Alias for calling [condition] with `Condition.ofExpression(expression)`. */
                fun condition(expression: Condition.Expression) =
                    condition(Condition.ofExpression(expression))

                /**
                 * Alias for calling [condition] with the following:
                 * ```java
                 * Condition.Expression.builder()
                 *     .expression(expression)
                 *     .build()
                 * ```
                 */
                fun expressionCondition(expression: Condition.Expression.InnerExpression) =
                    condition(Condition.Expression.builder().expression(expression).build())

                /**
                 * Alias for calling [expressionCondition] with
                 * `Condition.Expression.InnerExpression.ofJsonValue(jsonValue)`.
                 */
                fun expressionCondition(jsonValue: JsonValue) =
                    expressionCondition(Condition.Expression.InnerExpression.ofJsonValue(jsonValue))

                /**
                 * Alias for calling [expressionCondition] with
                 * `Condition.Expression.InnerExpression.ofDynamicVariable(dynamicVariable)`.
                 */
                fun expressionCondition(
                    dynamicVariable: Condition.Expression.InnerExpression.DynamicVariableExpression
                ) =
                    expressionCondition(
                        Condition.Expression.InnerExpression.ofDynamicVariable(dynamicVariable)
                    )

                /**
                 * Alias for calling [expressionCondition] with
                 * `Condition.Expression.InnerExpression.ofStringLiteral(stringLiteral)`.
                 */
                fun expressionCondition(
                    stringLiteral: Condition.Expression.InnerExpression.StringLiteralExpression
                ) =
                    expressionCondition(
                        Condition.Expression.InnerExpression.ofStringLiteral(stringLiteral)
                    )

                /**
                 * Alias for calling [expressionCondition] with
                 * `Condition.Expression.InnerExpression.ofNumberLiteral(numberLiteral)`.
                 */
                fun expressionCondition(
                    numberLiteral: Condition.Expression.InnerExpression.NumberLiteralExpression
                ) =
                    expressionCondition(
                        Condition.Expression.InnerExpression.ofNumberLiteral(numberLiteral)
                    )

                /**
                 * Alias for calling [expressionCondition] with
                 * `Condition.Expression.InnerExpression.ofBooleanLiteral(booleanLiteral)`.
                 */
                fun expressionCondition(
                    booleanLiteral: Condition.Expression.InnerExpression.BooleanLiteralExpression
                ) =
                    expressionCondition(
                        Condition.Expression.InnerExpression.ofBooleanLiteral(booleanLiteral)
                    )

                /** Alias for calling [condition] with `Condition.ofDefault()`. */
                fun conditionDefault() = condition(Condition.ofDefault())

                /** ID of the node this edge transitions away from. */
                fun startNodeId(startNodeId: String) = startNodeId(JsonField.of(startNodeId))

                /**
                 * Sets [Builder.startNodeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startNodeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startNodeId(startNodeId: JsonField<String>) = apply {
                    this.startNodeId = startNodeId
                }

                /**
                 * Destination of the transition. Discriminated by `type`: `node` (jump to another
                 * node in this flow) or `assistant` (hand off to a different assistant).
                 */
                fun target(target: Target) = target(JsonField.of(target))

                /**
                 * Sets [Builder.target] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.target] with a well-typed [Target] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun target(target: JsonField<Target>) = apply { this.target = target }

                /** Alias for calling [target] with `Target.ofNode(node)`. */
                fun target(node: Target.Node) = target(Target.ofNode(node))

                /**
                 * Alias for calling [target] with the following:
                 * ```java
                 * Target.Node.builder()
                 *     .nodeId(nodeId)
                 *     .build()
                 * ```
                 */
                fun nodeTarget(nodeId: String) =
                    target(Target.Node.builder().nodeId(nodeId).build())

                /** Alias for calling [target] with `Target.ofAssistant(assistant)`. */
                fun target(assistant: Target.Assistant) = target(Target.ofAssistant(assistant))

                /**
                 * Alias for calling [target] with the following:
                 * ```java
                 * Target.Assistant.builder()
                 *     .assistantId(assistantId)
                 *     .build()
                 * ```
                 */
                fun assistantTarget(assistantId: String) =
                    target(Target.Assistant.builder().assistantId(assistantId).build())

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Edge].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .condition()
                 * .startNodeId()
                 * .target()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Edge =
                    Edge(
                        checkRequired("id", id),
                        checkRequired("condition", condition),
                        checkRequired("startNodeId", startNodeId),
                        checkRequired("target", target),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Edge = apply {
                if (validated) {
                    return@apply
                }

                id()
                condition().validate()
                startNodeId()
                target().validate()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (condition.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (startNodeId.asKnown().isPresent) 1 else 0) +
                    (target.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Condition that gates the transition. Discriminated by `type`: `llm`, `expression`.
             */
            @JsonDeserialize(using = Condition.Deserializer::class)
            @JsonSerialize(using = Condition.Serializer::class)
            class Condition
            private constructor(
                private val llm: Llm? = null,
                private val expression: Expression? = null,
                private val default_: JsonValue? = null,
                private val _json: JsonValue? = null,
            ) {

                /**
                 * Edge condition evaluated by the LLM from a natural-language prompt.
                 *
                 * The model is asked to judge the prompt against conversation context and returns
                 * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
                 * expression (e.g. 'user wants to escalate to a human').
                 */
                fun llm(): Optional<Llm> = Optional.ofNullable(llm)

                /**
                 * Edge condition evaluated as a deterministic expression AST.
                 *
                 * The expression is computed against runtime dynamic variables and must evaluate to
                 * a boolean. Prefer this over `LLMCondition` when the rule is a clean function of
                 * known variables — it's cheaper and predictable.
                 */
                fun expression(): Optional<Expression> = Optional.ofNullable(expression)

                /**
                 * Fallback edge condition: fires only when no other edge's condition is true.
                 *
                 * Evaluated after every conditioned (`llm` / `expression`) edge regardless of
                 * declaration order, so it routes the flow whenever none of the node's other
                 * outgoing edges match. Valid **only** on edges leaving a `tool` or `speak` node,
                 * where the deterministic step auto-advances and must always have somewhere to go.
                 * A tool/speak node with any outgoing edge is required to carry exactly one
                 * `default` edge so it never dead-ends; a tool/speak node with no outgoing edges is
                 * a valid terminal step. Carries no parameters.
                 */
                fun default_(): Optional<JsonValue> = Optional.ofNullable(default_)

                fun isLlm(): Boolean = llm != null

                fun isExpression(): Boolean = expression != null

                fun isDefault(): Boolean = default_ != null

                /**
                 * Edge condition evaluated by the LLM from a natural-language prompt.
                 *
                 * The model is asked to judge the prompt against conversation context and returns
                 * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
                 * expression (e.g. 'user wants to escalate to a human').
                 */
                fun asLlm(): Llm = llm.getOrThrow("llm")

                /**
                 * Edge condition evaluated as a deterministic expression AST.
                 *
                 * The expression is computed against runtime dynamic variables and must evaluate to
                 * a boolean. Prefer this over `LLMCondition` when the rule is a clean function of
                 * known variables — it's cheaper and predictable.
                 */
                fun asExpression(): Expression = expression.getOrThrow("expression")

                /**
                 * Fallback edge condition: fires only when no other edge's condition is true.
                 *
                 * Evaluated after every conditioned (`llm` / `expression`) edge regardless of
                 * declaration order, so it routes the flow whenever none of the node's other
                 * outgoing edges match. Valid **only** on edges leaving a `tool` or `speak` node,
                 * where the deterministic step auto-advances and must always have somewhere to go.
                 * A tool/speak node with any outgoing edge is required to carry exactly one
                 * `default` edge so it never dead-ends; a tool/speak node with no outgoing edges is
                 * a valid terminal step. Carries no parameters.
                 */
                fun asDefault(): JsonValue = default_.getOrThrow("default_")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = condition.accept(new Condition.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitLlm(Llm llm) {
                 *         return Optional.of(llm.toString());
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
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        llm != null -> visitor.visitLlm(llm)
                        expression != null -> visitor.visitExpression(expression)
                        default_ != null -> visitor.visitDefault(default_)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Condition = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitLlm(llm: Llm) {
                                llm.validate()
                            }

                            override fun visitExpression(expression: Expression) {
                                expression.validate()
                            }

                            override fun visitDefault(default_: JsonValue) {
                                default_.let {
                                    if (it != JsonValue.from(mapOf("type" to "default"))) {
                                        throw TelnyxInvalidDataException(
                                            "'default_' is invalid, received $it"
                                        )
                                    }
                                }
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
                            override fun visitLlm(llm: Llm) = llm.validity()

                            override fun visitExpression(expression: Expression) =
                                expression.validity()

                            override fun visitDefault(default_: JsonValue) =
                                default_.let {
                                    if (it == JsonValue.from(mapOf("type" to "default"))) 1 else 0
                                }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Condition &&
                        llm == other.llm &&
                        expression == other.expression &&
                        default_ == other.default_
                }

                override fun hashCode(): Int = Objects.hash(llm, expression, default_)

                override fun toString(): String =
                    when {
                        llm != null -> "Condition{llm=$llm}"
                        expression != null -> "Condition{expression=$expression}"
                        default_ != null -> "Condition{default_=$default_}"
                        _json != null -> "Condition{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Condition")
                    }

                companion object {

                    /**
                     * Edge condition evaluated by the LLM from a natural-language prompt.
                     *
                     * The model is asked to judge the prompt against conversation context and
                     * returns true/false. Use this for fuzzy intents that aren't expressible as a
                     * deterministic expression (e.g. 'user wants to escalate to a human').
                     */
                    @JvmStatic fun ofLlm(llm: Llm) = Condition(llm = llm)

                    /**
                     * Edge condition evaluated as a deterministic expression AST.
                     *
                     * The expression is computed against runtime dynamic variables and must
                     * evaluate to a boolean. Prefer this over `LLMCondition` when the rule is a
                     * clean function of known variables — it's cheaper and predictable.
                     */
                    @JvmStatic
                    fun ofExpression(expression: Expression) = Condition(expression = expression)

                    /**
                     * Fallback edge condition: fires only when no other edge's condition is true.
                     *
                     * Evaluated after every conditioned (`llm` / `expression`) edge regardless of
                     * declaration order, so it routes the flow whenever none of the node's other
                     * outgoing edges match. Valid **only** on edges leaving a `tool` or `speak`
                     * node, where the deterministic step auto-advances and must always have
                     * somewhere to go. A tool/speak node with any outgoing edge is required to
                     * carry exactly one `default` edge so it never dead-ends; a tool/speak node
                     * with no outgoing edges is a valid terminal step. Carries no parameters.
                     */
                    @JvmStatic
                    fun ofDefault() =
                        Condition(default_ = JsonValue.from(mapOf("type" to "default")))
                }

                /**
                 * An interface that defines how to map each variant of [Condition] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    /**
                     * Edge condition evaluated by the LLM from a natural-language prompt.
                     *
                     * The model is asked to judge the prompt against conversation context and
                     * returns true/false. Use this for fuzzy intents that aren't expressible as a
                     * deterministic expression (e.g. 'user wants to escalate to a human').
                     */
                    fun visitLlm(llm: Llm): T

                    /**
                     * Edge condition evaluated as a deterministic expression AST.
                     *
                     * The expression is computed against runtime dynamic variables and must
                     * evaluate to a boolean. Prefer this over `LLMCondition` when the rule is a
                     * clean function of known variables — it's cheaper and predictable.
                     */
                    fun visitExpression(expression: Expression): T

                    /**
                     * Fallback edge condition: fires only when no other edge's condition is true.
                     *
                     * Evaluated after every conditioned (`llm` / `expression`) edge regardless of
                     * declaration order, so it routes the flow whenever none of the node's other
                     * outgoing edges match. Valid **only** on edges leaving a `tool` or `speak`
                     * node, where the deterministic step auto-advances and must always have
                     * somewhere to go. A tool/speak node with any outgoing edge is required to
                     * carry exactly one `default` edge so it never dead-ends; a tool/speak node
                     * with no outgoing edges is a valid terminal step. Carries no parameters.
                     */
                    fun visitDefault(default_: JsonValue): T

                    /**
                     * Maps an unknown variant of [Condition] to a value of type [T].
                     *
                     * An instance of [Condition] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Condition: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Condition>(Condition::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Condition {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                        when (type) {
                            "llm" -> {
                                return tryDeserialize(node, jacksonTypeRef<Llm>())?.let {
                                    Condition(llm = it, _json = json)
                                } ?: Condition(_json = json)
                            }
                            "expression" -> {
                                return tryDeserialize(node, jacksonTypeRef<Expression>())?.let {
                                    Condition(expression = it, _json = json)
                                } ?: Condition(_json = json)
                            }
                            "default" -> {
                                return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                    ?.let { Condition(default_ = it, _json = json) }
                                    ?.takeIf { it.isValid() } ?: Condition(_json = json)
                            }
                        }

                        return Condition(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Condition>(Condition::class) {

                    override fun serialize(
                        value: Condition,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.llm != null -> generator.writeObject(value.llm)
                            value.expression != null -> generator.writeObject(value.expression)
                            value.default_ != null -> generator.writeObject(value.default_)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Condition")
                        }
                    }
                }

                /**
                 * Edge condition evaluated by the LLM from a natural-language prompt.
                 *
                 * The model is asked to judge the prompt against conversation context and returns
                 * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
                 * expression (e.g. 'user wants to escalate to a human').
                 */
                class Llm
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val prompt: JsonField<String>,
                    private val type: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("prompt")
                        @ExcludeMissing
                        prompt: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    ) : this(prompt, type, mutableMapOf())

                    /**
                     * Natural-language criterion the LLM judges as true/false.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun prompt(): String = prompt.getRequired("prompt")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("llm")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Returns the raw JSON value of [prompt].
                     *
                     * Unlike [prompt], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prompt")
                    @ExcludeMissing
                    fun _prompt(): JsonField<String> = prompt

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
                         * Returns a mutable builder for constructing an instance of [Llm].
                         *
                         * The following fields are required:
                         * ```java
                         * .prompt()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Llm]. */
                    class Builder internal constructor() {

                        private var prompt: JsonField<String>? = null
                        private var type: JsonValue = JsonValue.from("llm")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(llm: Llm) = apply {
                            prompt = llm.prompt
                            type = llm.type
                            additionalProperties = llm.additionalProperties.toMutableMap()
                        }

                        /** Natural-language criterion the LLM judges as true/false. */
                        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

                        /**
                         * Sets [Builder.prompt] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prompt] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("llm")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Llm].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .prompt()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Llm =
                            Llm(
                                checkRequired("prompt", prompt),
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Llm = apply {
                        if (validated) {
                            return@apply
                        }

                        prompt()
                        _type().let {
                            if (it != JsonValue.from("llm")) {
                                throw TelnyxInvalidDataException("'type' is invalid, received $it")
                            }
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
                        (if (prompt.asKnown().isPresent) 1 else 0) +
                            type.let { if (it == JsonValue.from("llm")) 1 else 0 }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Llm &&
                            prompt == other.prompt &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(prompt, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Llm{prompt=$prompt, type=$type, additionalProperties=$additionalProperties}"
                }

                /**
                 * Edge condition evaluated as a deterministic expression AST.
                 *
                 * The expression is computed against runtime dynamic variables and must evaluate to
                 * a boolean. Prefer this over `LLMCondition` when the rule is a clean function of
                 * known variables — it's cheaper and predictable.
                 */
                class Expression
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val expression: JsonField<InnerExpression>,
                    private val type: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("expression")
                        @ExcludeMissing
                        expression: JsonField<InnerExpression> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    ) : this(expression, type, mutableMapOf())

                    /**
                     * A node in a deterministic expression AST. Exactly one variant is selected by
                     * the `type` discriminator. Terminal variants (`number_literal`,
                     * `string_literal`, `bool_literal`, `variable`) bottom out the recursion;
                     * `arithmetic`, `bool_op`, and `comparison` nest further sub-expressions.
                     *
                     * Extracted into a single named schema so the recursive union is defined once
                     * (was previously inlined at every operand site).
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun expression(): InnerExpression = expression.getRequired("expression")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("expression")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Returns the raw JSON value of [expression].
                     *
                     * Unlike [expression], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expression")
                    @ExcludeMissing
                    fun _expression(): JsonField<InnerExpression> = expression

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
                         * Returns a mutable builder for constructing an instance of [Expression].
                         *
                         * The following fields are required:
                         * ```java
                         * .expression()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Expression]. */
                    class Builder internal constructor() {

                        private var expression: JsonField<InnerExpression>? = null
                        private var type: JsonValue = JsonValue.from("expression")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(expression: Expression) = apply {
                            this.expression = expression.expression
                            type = expression.type
                            additionalProperties = expression.additionalProperties.toMutableMap()
                        }

                        /**
                         * A node in a deterministic expression AST. Exactly one variant is selected
                         * by the `type` discriminator. Terminal variants (`number_literal`,
                         * `string_literal`, `bool_literal`, `variable`) bottom out the recursion;
                         * `arithmetic`, `bool_op`, and `comparison` nest further sub-expressions.
                         *
                         * Extracted into a single named schema so the recursive union is defined
                         * once (was previously inlined at every operand site).
                         */
                        fun expression(expression: InnerExpression) =
                            expression(JsonField.of(expression))

                        /**
                         * Sets [Builder.expression] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expression] with a well-typed
                         * [InnerExpression] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun expression(expression: JsonField<InnerExpression>) = apply {
                            this.expression = expression
                        }

                        /**
                         * Alias for calling [expression] with
                         * `InnerExpression.ofJsonValue(jsonValue)`.
                         */
                        fun expression(jsonValue: JsonValue) =
                            expression(InnerExpression.ofJsonValue(jsonValue))

                        /**
                         * Alias for calling [expression] with
                         * `InnerExpression.ofDynamicVariable(dynamicVariable)`.
                         */
                        fun expression(dynamicVariable: InnerExpression.DynamicVariableExpression) =
                            expression(InnerExpression.ofDynamicVariable(dynamicVariable))

                        /**
                         * Alias for calling [expression] with
                         * `InnerExpression.ofStringLiteral(stringLiteral)`.
                         */
                        fun expression(stringLiteral: InnerExpression.StringLiteralExpression) =
                            expression(InnerExpression.ofStringLiteral(stringLiteral))

                        /**
                         * Alias for calling [expression] with
                         * `InnerExpression.ofNumberLiteral(numberLiteral)`.
                         */
                        fun expression(numberLiteral: InnerExpression.NumberLiteralExpression) =
                            expression(InnerExpression.ofNumberLiteral(numberLiteral))

                        /**
                         * Alias for calling [expression] with
                         * `InnerExpression.ofBooleanLiteral(booleanLiteral)`.
                         */
                        fun expression(booleanLiteral: InnerExpression.BooleanLiteralExpression) =
                            expression(InnerExpression.ofBooleanLiteral(booleanLiteral))

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("expression")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Expression].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .expression()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Expression =
                            Expression(
                                checkRequired("expression", expression),
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Expression = apply {
                        if (validated) {
                            return@apply
                        }

                        expression().validate()
                        _type().let {
                            if (it != JsonValue.from("expression")) {
                                throw TelnyxInvalidDataException("'type' is invalid, received $it")
                            }
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
                        (expression.asKnown().getOrNull()?.validity() ?: 0) +
                            type.let { if (it == JsonValue.from("expression")) 1 else 0 }

                    /**
                     * A node in a deterministic expression AST. Exactly one variant is selected by
                     * the `type` discriminator. Terminal variants (`number_literal`,
                     * `string_literal`, `bool_literal`, `variable`) bottom out the recursion;
                     * `arithmetic`, `bool_op`, and `comparison` nest further sub-expressions.
                     *
                     * Extracted into a single named schema so the recursive union is defined once
                     * (was previously inlined at every operand site).
                     */
                    @JsonDeserialize(using = InnerExpression.Deserializer::class)
                    @JsonSerialize(using = InnerExpression.Serializer::class)
                    class InnerExpression
                    private constructor(
                        private val jsonValue: JsonValue? = null,
                        private val dynamicVariable: DynamicVariableExpression? = null,
                        private val stringLiteral: StringLiteralExpression? = null,
                        private val numberLiteral: NumberLiteralExpression? = null,
                        private val booleanLiteral: BooleanLiteralExpression? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                        /**
                         * Reference a dynamic variable by name.
                         *
                         * Resolved at runtime from the assistant's dynamic-variables context (see
                         * `Assistant.dynamic_variables` and the dynamic-variables webhook).
                         */
                        fun dynamicVariable(): Optional<DynamicVariableExpression> =
                            Optional.ofNullable(dynamicVariable)

                        /** Constant string value. */
                        fun stringLiteral(): Optional<StringLiteralExpression> =
                            Optional.ofNullable(stringLiteral)

                        /**
                         * Constant numeric value (float; integers are accepted and stored as
                         * float).
                         */
                        fun numberLiteral(): Optional<NumberLiteralExpression> =
                            Optional.ofNullable(numberLiteral)

                        /** Constant boolean value. Useful for unconditional ('always') edges. */
                        fun booleanLiteral(): Optional<BooleanLiteralExpression> =
                            Optional.ofNullable(booleanLiteral)

                        fun isJsonValue(): Boolean = jsonValue != null

                        fun isDynamicVariable(): Boolean = dynamicVariable != null

                        fun isStringLiteral(): Boolean = stringLiteral != null

                        fun isNumberLiteral(): Boolean = numberLiteral != null

                        fun isBooleanLiteral(): Boolean = booleanLiteral != null

                        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                        /**
                         * Reference a dynamic variable by name.
                         *
                         * Resolved at runtime from the assistant's dynamic-variables context (see
                         * `Assistant.dynamic_variables` and the dynamic-variables webhook).
                         */
                        fun asDynamicVariable(): DynamicVariableExpression =
                            dynamicVariable.getOrThrow("dynamicVariable")

                        /** Constant string value. */
                        fun asStringLiteral(): StringLiteralExpression =
                            stringLiteral.getOrThrow("stringLiteral")

                        /**
                         * Constant numeric value (float; integers are accepted and stored as
                         * float).
                         */
                        fun asNumberLiteral(): NumberLiteralExpression =
                            numberLiteral.getOrThrow("numberLiteral")

                        /** Constant boolean value. Useful for unconditional ('always') edges. */
                        fun asBooleanLiteral(): BooleanLiteralExpression =
                            booleanLiteral.getOrThrow("booleanLiteral")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        /**
                         * Maps this instance's current variant to a value of type [T] using the
                         * given [visitor].
                         *
                         * Note that this method is _not_ forwards compatible with new variants from
                         * the API, unless [visitor] overrides [Visitor.unknown]. To handle variants
                         * not known to this version of the SDK gracefully, consider overriding
                         * [Visitor.unknown]:
                         * ```java
                         * import com.telnyx.sdk.core.JsonValue;
                         * import java.util.Optional;
                         *
                         * Optional<String> result = innerExpression.accept(new InnerExpression.Visitor<Optional<String>>() {
                         *     @Override
                         *     public Optional<String> visitJsonValue(JsonValue jsonValue) {
                         *         return Optional.of(jsonValue.toString());
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
                         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden
                         *   in [visitor] and the current variant is unknown.
                         */
                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                                dynamicVariable != null ->
                                    visitor.visitDynamicVariable(dynamicVariable)
                                stringLiteral != null -> visitor.visitStringLiteral(stringLiteral)
                                numberLiteral != null -> visitor.visitNumberLiteral(numberLiteral)
                                booleanLiteral != null ->
                                    visitor.visitBooleanLiteral(booleanLiteral)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): InnerExpression = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitJsonValue(jsonValue: JsonValue) {}

                                    override fun visitDynamicVariable(
                                        dynamicVariable: DynamicVariableExpression
                                    ) {
                                        dynamicVariable.validate()
                                    }

                                    override fun visitStringLiteral(
                                        stringLiteral: StringLiteralExpression
                                    ) {
                                        stringLiteral.validate()
                                    }

                                    override fun visitNumberLiteral(
                                        numberLiteral: NumberLiteralExpression
                                    ) {
                                        numberLiteral.validate()
                                    }

                                    override fun visitBooleanLiteral(
                                        booleanLiteral: BooleanLiteralExpression
                                    ) {
                                        booleanLiteral.validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                                    override fun visitDynamicVariable(
                                        dynamicVariable: DynamicVariableExpression
                                    ) = dynamicVariable.validity()

                                    override fun visitStringLiteral(
                                        stringLiteral: StringLiteralExpression
                                    ) = stringLiteral.validity()

                                    override fun visitNumberLiteral(
                                        numberLiteral: NumberLiteralExpression
                                    ) = numberLiteral.validity()

                                    override fun visitBooleanLiteral(
                                        booleanLiteral: BooleanLiteralExpression
                                    ) = booleanLiteral.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is InnerExpression &&
                                jsonValue == other.jsonValue &&
                                dynamicVariable == other.dynamicVariable &&
                                stringLiteral == other.stringLiteral &&
                                numberLiteral == other.numberLiteral &&
                                booleanLiteral == other.booleanLiteral
                        }

                        override fun hashCode(): Int =
                            Objects.hash(
                                jsonValue,
                                dynamicVariable,
                                stringLiteral,
                                numberLiteral,
                                booleanLiteral,
                            )

                        override fun toString(): String =
                            when {
                                jsonValue != null -> "InnerExpression{jsonValue=$jsonValue}"
                                dynamicVariable != null ->
                                    "InnerExpression{dynamicVariable=$dynamicVariable}"
                                stringLiteral != null ->
                                    "InnerExpression{stringLiteral=$stringLiteral}"
                                numberLiteral != null ->
                                    "InnerExpression{numberLiteral=$numberLiteral}"
                                booleanLiteral != null ->
                                    "InnerExpression{booleanLiteral=$booleanLiteral}"
                                _json != null -> "InnerExpression{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid InnerExpression")
                            }

                        companion object {

                            @JvmStatic
                            fun ofJsonValue(jsonValue: JsonValue) =
                                InnerExpression(jsonValue = jsonValue)

                            /**
                             * Reference a dynamic variable by name.
                             *
                             * Resolved at runtime from the assistant's dynamic-variables context
                             * (see `Assistant.dynamic_variables` and the dynamic-variables
                             * webhook).
                             */
                            @JvmStatic
                            fun ofDynamicVariable(dynamicVariable: DynamicVariableExpression) =
                                InnerExpression(dynamicVariable = dynamicVariable)

                            /** Constant string value. */
                            @JvmStatic
                            fun ofStringLiteral(stringLiteral: StringLiteralExpression) =
                                InnerExpression(stringLiteral = stringLiteral)

                            /**
                             * Constant numeric value (float; integers are accepted and stored as
                             * float).
                             */
                            @JvmStatic
                            fun ofNumberLiteral(numberLiteral: NumberLiteralExpression) =
                                InnerExpression(numberLiteral = numberLiteral)

                            /**
                             * Constant boolean value. Useful for unconditional ('always') edges.
                             */
                            @JvmStatic
                            fun ofBooleanLiteral(booleanLiteral: BooleanLiteralExpression) =
                                InnerExpression(booleanLiteral = booleanLiteral)
                        }

                        /**
                         * An interface that defines how to map each variant of [InnerExpression] to
                         * a value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitJsonValue(jsonValue: JsonValue): T

                            /**
                             * Reference a dynamic variable by name.
                             *
                             * Resolved at runtime from the assistant's dynamic-variables context
                             * (see `Assistant.dynamic_variables` and the dynamic-variables
                             * webhook).
                             */
                            fun visitDynamicVariable(dynamicVariable: DynamicVariableExpression): T

                            /** Constant string value. */
                            fun visitStringLiteral(stringLiteral: StringLiteralExpression): T

                            /**
                             * Constant numeric value (float; integers are accepted and stored as
                             * float).
                             */
                            fun visitNumberLiteral(numberLiteral: NumberLiteralExpression): T

                            /**
                             * Constant boolean value. Useful for unconditional ('always') edges.
                             */
                            fun visitBooleanLiteral(booleanLiteral: BooleanLiteralExpression): T

                            /**
                             * Maps an unknown variant of [InnerExpression] to a value of type [T].
                             *
                             * An instance of [InnerExpression] can contain an unknown variant if it
                             * was deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws TelnyxInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw TelnyxInvalidDataException("Unknown InnerExpression: $json")
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<InnerExpression>(InnerExpression::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): InnerExpression {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<DynamicVariableExpression>(),
                                                )
                                                ?.let {
                                                    InnerExpression(
                                                        dynamicVariable = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<StringLiteralExpression>(),
                                                )
                                                ?.let {
                                                    InnerExpression(
                                                        stringLiteral = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<NumberLiteralExpression>(),
                                                )
                                                ?.let {
                                                    InnerExpression(
                                                        numberLiteral = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<BooleanLiteralExpression>(),
                                                )
                                                ?.let {
                                                    InnerExpression(
                                                        booleanLiteral = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                                InnerExpression(jsonValue = it, _json = json)
                                            },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants.
                                    0 -> InnerExpression(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<InnerExpression>(InnerExpression::class) {

                            override fun serialize(
                                value: InnerExpression,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.jsonValue != null ->
                                        generator.writeObject(value.jsonValue)
                                    value.dynamicVariable != null ->
                                        generator.writeObject(value.dynamicVariable)
                                    value.stringLiteral != null ->
                                        generator.writeObject(value.stringLiteral)
                                    value.numberLiteral != null ->
                                        generator.writeObject(value.numberLiteral)
                                    value.booleanLiteral != null ->
                                        generator.writeObject(value.booleanLiteral)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid InnerExpression")
                                }
                            }
                        }

                        /**
                         * Reference a dynamic variable by name.
                         *
                         * Resolved at runtime from the assistant's dynamic-variables context (see
                         * `Assistant.dynamic_variables` and the dynamic-variables webhook).
                         */
                        class DynamicVariableExpression
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val name: JsonField<String>,
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("name")
                                @ExcludeMissing
                                name: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(name, type, mutableMapOf())

                            /**
                             * Variable name to look up in the runtime context.
                             *
                             * @throws TelnyxInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun name(): String = name.getRequired("name")

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("variable")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [name].
                             *
                             * Unlike [name], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<String> = name

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [DynamicVariableExpression].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .name()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [DynamicVariableExpression]. */
                            class Builder internal constructor() {

                                private var name: JsonField<String>? = null
                                private var type: JsonValue = JsonValue.from("variable")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    dynamicVariableExpression: DynamicVariableExpression
                                ) = apply {
                                    name = dynamicVariableExpression.name
                                    type = dynamicVariableExpression.type
                                    additionalProperties =
                                        dynamicVariableExpression.additionalProperties
                                            .toMutableMap()
                                }

                                /** Variable name to look up in the runtime context. */
                                fun name(name: String) = name(JsonField.of(name))

                                /**
                                 * Sets [Builder.name] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.name] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun name(name: JsonField<String>) = apply { this.name = name }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("variable")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [DynamicVariableExpression].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .name()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): DynamicVariableExpression =
                                    DynamicVariableExpression(
                                        checkRequired("name", name),
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
                             */
                            fun validate(): DynamicVariableExpression = apply {
                                if (validated) {
                                    return@apply
                                }

                                name()
                                _type().let {
                                    if (it != JsonValue.from("variable")) {
                                        throw TelnyxInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (if (name.asKnown().isPresent) 1 else 0) +
                                    type.let { if (it == JsonValue.from("variable")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is DynamicVariableExpression &&
                                    name == other.name &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(name, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "DynamicVariableExpression{name=$name, type=$type, additionalProperties=$additionalProperties}"
                        }

                        /** Constant string value. */
                        class StringLiteralExpression
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val type: JsonValue,
                            private val value: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("value")
                                @ExcludeMissing
                                value: JsonField<String> = JsonMissing.of(),
                            ) : this(type, value, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("string_literal")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Literal string value.
                             *
                             * @throws TelnyxInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun value(): String = value.getRequired("value")

                            /**
                             * Returns the raw JSON value of [value].
                             *
                             * Unlike [value], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("value")
                            @ExcludeMissing
                            fun _value(): JsonField<String> = value

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [StringLiteralExpression].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .value()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [StringLiteralExpression]. */
                            class Builder internal constructor() {

                                private var type: JsonValue = JsonValue.from("string_literal")
                                private var value: JsonField<String>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    stringLiteralExpression: StringLiteralExpression
                                ) = apply {
                                    type = stringLiteralExpression.type
                                    value = stringLiteralExpression.value
                                    additionalProperties =
                                        stringLiteralExpression.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("string_literal")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                /** Literal string value. */
                                fun value(value: String) = value(JsonField.of(value))

                                /**
                                 * Sets [Builder.value] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.value] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun value(value: JsonField<String>) = apply { this.value = value }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [StringLiteralExpression].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .value()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): StringLiteralExpression =
                                    StringLiteralExpression(
                                        type,
                                        checkRequired("value", value),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
                             */
                            fun validate(): StringLiteralExpression = apply {
                                if (validated) {
                                    return@apply
                                }

                                _type().let {
                                    if (it != JsonValue.from("string_literal")) {
                                        throw TelnyxInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                value()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                type.let { if (it == JsonValue.from("string_literal")) 1 else 0 } +
                                    (if (value.asKnown().isPresent) 1 else 0)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is StringLiteralExpression &&
                                    type == other.type &&
                                    value == other.value &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(type, value, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "StringLiteralExpression{type=$type, value=$value, additionalProperties=$additionalProperties}"
                        }

                        /**
                         * Constant numeric value (float; integers are accepted and stored as
                         * float).
                         */
                        class NumberLiteralExpression
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val type: JsonValue,
                            private val value: JsonField<Double>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("value")
                                @ExcludeMissing
                                value: JsonField<Double> = JsonMissing.of(),
                            ) : this(type, value, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("number_literal")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Literal numeric value.
                             *
                             * @throws TelnyxInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun value(): Double = value.getRequired("value")

                            /**
                             * Returns the raw JSON value of [value].
                             *
                             * Unlike [value], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("value")
                            @ExcludeMissing
                            fun _value(): JsonField<Double> = value

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [NumberLiteralExpression].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .value()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [NumberLiteralExpression]. */
                            class Builder internal constructor() {

                                private var type: JsonValue = JsonValue.from("number_literal")
                                private var value: JsonField<Double>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    numberLiteralExpression: NumberLiteralExpression
                                ) = apply {
                                    type = numberLiteralExpression.type
                                    value = numberLiteralExpression.value
                                    additionalProperties =
                                        numberLiteralExpression.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("number_literal")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                /** Literal numeric value. */
                                fun value(value: Double) = value(JsonField.of(value))

                                /**
                                 * Sets [Builder.value] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.value] with a well-typed
                                 * [Double] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun value(value: JsonField<Double>) = apply { this.value = value }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [NumberLiteralExpression].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .value()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): NumberLiteralExpression =
                                    NumberLiteralExpression(
                                        type,
                                        checkRequired("value", value),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
                             */
                            fun validate(): NumberLiteralExpression = apply {
                                if (validated) {
                                    return@apply
                                }

                                _type().let {
                                    if (it != JsonValue.from("number_literal")) {
                                        throw TelnyxInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                value()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                type.let { if (it == JsonValue.from("number_literal")) 1 else 0 } +
                                    (if (value.asKnown().isPresent) 1 else 0)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is NumberLiteralExpression &&
                                    type == other.type &&
                                    value == other.value &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(type, value, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "NumberLiteralExpression{type=$type, value=$value, additionalProperties=$additionalProperties}"
                        }

                        /** Constant boolean value. Useful for unconditional ('always') edges. */
                        class BooleanLiteralExpression
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val type: JsonValue,
                            private val value: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("value")
                                @ExcludeMissing
                                value: JsonField<Boolean> = JsonMissing.of(),
                            ) : this(type, value, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("bool_literal")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Literal boolean value.
                             *
                             * @throws TelnyxInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun value(): Boolean = value.getRequired("value")

                            /**
                             * Returns the raw JSON value of [value].
                             *
                             * Unlike [value], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("value")
                            @ExcludeMissing
                            fun _value(): JsonField<Boolean> = value

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [BooleanLiteralExpression].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .value()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [BooleanLiteralExpression]. */
                            class Builder internal constructor() {

                                private var type: JsonValue = JsonValue.from("bool_literal")
                                private var value: JsonField<Boolean>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    booleanLiteralExpression: BooleanLiteralExpression
                                ) = apply {
                                    type = booleanLiteralExpression.type
                                    value = booleanLiteralExpression.value
                                    additionalProperties =
                                        booleanLiteralExpression.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("bool_literal")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                /** Literal boolean value. */
                                fun value(value: Boolean) = value(JsonField.of(value))

                                /**
                                 * Sets [Builder.value] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.value] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun value(value: JsonField<Boolean>) = apply { this.value = value }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [BooleanLiteralExpression].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .value()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): BooleanLiteralExpression =
                                    BooleanLiteralExpression(
                                        type,
                                        checkRequired("value", value),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
                             */
                            fun validate(): BooleanLiteralExpression = apply {
                                if (validated) {
                                    return@apply
                                }

                                _type().let {
                                    if (it != JsonValue.from("bool_literal")) {
                                        throw TelnyxInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                value()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                type.let { if (it == JsonValue.from("bool_literal")) 1 else 0 } +
                                    (if (value.asKnown().isPresent) 1 else 0)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is BooleanLiteralExpression &&
                                    type == other.type &&
                                    value == other.value &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(type, value, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "BooleanLiteralExpression{type=$type, value=$value, additionalProperties=$additionalProperties}"
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Expression &&
                            expression == other.expression &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(expression, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Expression{expression=$expression, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            /**
             * Destination of the transition. Discriminated by `type`: `node` (jump to another node
             * in this flow) or `assistant` (hand off to a different assistant).
             */
            @JsonDeserialize(using = Target.Deserializer::class)
            @JsonSerialize(using = Target.Serializer::class)
            class Target
            private constructor(
                private val node: Node? = null,
                private val assistant: Assistant? = null,
                private val _json: JsonValue? = null,
            ) {

                /**
                 * Edge target referencing another node within the same flow.
                 *
                 * The runtime transitions the active node to `node_id` and continues processing
                 * within the current assistant's flow.
                 */
                fun node(): Optional<Node> = Optional.ofNullable(node)

                /**
                 * Edge target referencing a different assistant.
                 *
                 * When the edge fires, the conversation hands off to `assistant_id`: the active
                 * assistant on the conversation row is rewritten and the new assistant's flow
                 * starts at its own `start_node_id`. The current turn's LLM response is delivered
                 * to the user as-is; subsequent turns route to the new assistant.
                 */
                fun assistant(): Optional<Assistant> = Optional.ofNullable(assistant)

                fun isNode(): Boolean = node != null

                fun isAssistant(): Boolean = assistant != null

                /**
                 * Edge target referencing another node within the same flow.
                 *
                 * The runtime transitions the active node to `node_id` and continues processing
                 * within the current assistant's flow.
                 */
                fun asNode(): Node = node.getOrThrow("node")

                /**
                 * Edge target referencing a different assistant.
                 *
                 * When the edge fires, the conversation hands off to `assistant_id`: the active
                 * assistant on the conversation row is rewritten and the new assistant's flow
                 * starts at its own `start_node_id`. The current turn's LLM response is delivered
                 * to the user as-is; subsequent turns route to the new assistant.
                 */
                fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = target.accept(new Target.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitNode(Node node) {
                 *         return Optional.of(node.toString());
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
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        node != null -> visitor.visitNode(node)
                        assistant != null -> visitor.visitAssistant(assistant)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Target = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNode(node: Node) {
                                node.validate()
                            }

                            override fun visitAssistant(assistant: Assistant) {
                                assistant.validate()
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
                            override fun visitNode(node: Node) = node.validity()

                            override fun visitAssistant(assistant: Assistant) = assistant.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Target && node == other.node && assistant == other.assistant
                }

                override fun hashCode(): Int = Objects.hash(node, assistant)

                override fun toString(): String =
                    when {
                        node != null -> "Target{node=$node}"
                        assistant != null -> "Target{assistant=$assistant}"
                        _json != null -> "Target{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Target")
                    }

                companion object {

                    /**
                     * Edge target referencing another node within the same flow.
                     *
                     * The runtime transitions the active node to `node_id` and continues processing
                     * within the current assistant's flow.
                     */
                    @JvmStatic fun ofNode(node: Node) = Target(node = node)

                    /**
                     * Edge target referencing a different assistant.
                     *
                     * When the edge fires, the conversation hands off to `assistant_id`: the active
                     * assistant on the conversation row is rewritten and the new assistant's flow
                     * starts at its own `start_node_id`. The current turn's LLM response is
                     * delivered to the user as-is; subsequent turns route to the new assistant.
                     */
                    @JvmStatic fun ofAssistant(assistant: Assistant) = Target(assistant = assistant)
                }

                /**
                 * An interface that defines how to map each variant of [Target] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    /**
                     * Edge target referencing another node within the same flow.
                     *
                     * The runtime transitions the active node to `node_id` and continues processing
                     * within the current assistant's flow.
                     */
                    fun visitNode(node: Node): T

                    /**
                     * Edge target referencing a different assistant.
                     *
                     * When the edge fires, the conversation hands off to `assistant_id`: the active
                     * assistant on the conversation row is rewritten and the new assistant's flow
                     * starts at its own `start_node_id`. The current turn's LLM response is
                     * delivered to the user as-is; subsequent turns route to the new assistant.
                     */
                    fun visitAssistant(assistant: Assistant): T

                    /**
                     * Maps an unknown variant of [Target] to a value of type [T].
                     *
                     * An instance of [Target] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Target: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Target>(Target::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Target {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                        when (type) {
                            "node" -> {
                                return tryDeserialize(node, jacksonTypeRef<Node>())?.let {
                                    Target(node = it, _json = json)
                                } ?: Target(_json = json)
                            }
                            "assistant" -> {
                                return tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                                    Target(assistant = it, _json = json)
                                } ?: Target(_json = json)
                            }
                        }

                        return Target(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Target>(Target::class) {

                    override fun serialize(
                        value: Target,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.node != null -> generator.writeObject(value.node)
                            value.assistant != null -> generator.writeObject(value.assistant)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Target")
                        }
                    }
                }

                /**
                 * Edge target referencing another node within the same flow.
                 *
                 * The runtime transitions the active node to `node_id` and continues processing
                 * within the current assistant's flow.
                 */
                class Node
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val nodeId: JsonField<String>,
                    private val type: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("node_id")
                        @ExcludeMissing
                        nodeId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    ) : this(nodeId, type, mutableMapOf())

                    /**
                     * ID of the node this edge transitions into.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun nodeId(): String = nodeId.getRequired("node_id")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("node")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Returns the raw JSON value of [nodeId].
                     *
                     * Unlike [nodeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("node_id")
                    @ExcludeMissing
                    fun _nodeId(): JsonField<String> = nodeId

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
                         * Returns a mutable builder for constructing an instance of [Node].
                         *
                         * The following fields are required:
                         * ```java
                         * .nodeId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Node]. */
                    class Builder internal constructor() {

                        private var nodeId: JsonField<String>? = null
                        private var type: JsonValue = JsonValue.from("node")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(node: Node) = apply {
                            nodeId = node.nodeId
                            type = node.type
                            additionalProperties = node.additionalProperties.toMutableMap()
                        }

                        /** ID of the node this edge transitions into. */
                        fun nodeId(nodeId: String) = nodeId(JsonField.of(nodeId))

                        /**
                         * Sets [Builder.nodeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.nodeId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun nodeId(nodeId: JsonField<String>) = apply { this.nodeId = nodeId }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("node")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Node].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .nodeId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Node =
                            Node(
                                checkRequired("nodeId", nodeId),
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Node = apply {
                        if (validated) {
                            return@apply
                        }

                        nodeId()
                        _type().let {
                            if (it != JsonValue.from("node")) {
                                throw TelnyxInvalidDataException("'type' is invalid, received $it")
                            }
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
                        (if (nodeId.asKnown().isPresent) 1 else 0) +
                            type.let { if (it == JsonValue.from("node")) 1 else 0 }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Node &&
                            nodeId == other.nodeId &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(nodeId, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Node{nodeId=$nodeId, type=$type, additionalProperties=$additionalProperties}"
                }

                /**
                 * Edge target referencing a different assistant.
                 *
                 * When the edge fires, the conversation hands off to `assistant_id`: the active
                 * assistant on the conversation row is rewritten and the new assistant's flow
                 * starts at its own `start_node_id`. The current turn's LLM response is delivered
                 * to the user as-is; subsequent turns route to the new assistant.
                 */
                class Assistant
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val assistantId: JsonField<String>,
                    private val type: JsonValue,
                    private val position: JsonField<Position>,
                    private val voiceMode: JsonField<VoiceMode>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("assistant_id")
                        @ExcludeMissing
                        assistantId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("position")
                        @ExcludeMissing
                        position: JsonField<Position> = JsonMissing.of(),
                        @JsonProperty("voice_mode")
                        @ExcludeMissing
                        voiceMode: JsonField<VoiceMode> = JsonMissing.of(),
                    ) : this(assistantId, type, position, voiceMode, mutableMapOf())

                    /**
                     * ID of the assistant the conversation transitions to.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun assistantId(): String = assistantId.getRequired("assistant_id")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("assistant")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Optional canvas coordinates for rendering the target assistant as a node in
                     * authoring UIs. Pure presentation — the runtime ignores it; round-trips so
                     * frontends can persist graph layout across reloads. When multiple edges target
                     * the same assistant, each edge's `position` is independent (frontends
                     * typically use the first non-null one).
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun position(): Optional<Position> = position.getOptional("position")

                    /**
                     * Voice behavior when handing off to the target assistant, mirroring the
                     * handoff tool's `voice_mode`. `unified` (default) keeps the current voice
                     * across the handoff; `distinct` lets the target assistant speak with its own
                     * configured voice. Only applies to assistant targets — node targets override
                     * voice via the node's own `voice_settings`.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun voiceMode(): Optional<VoiceMode> = voiceMode.getOptional("voice_mode")

                    /**
                     * Returns the raw JSON value of [assistantId].
                     *
                     * Unlike [assistantId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("assistant_id")
                    @ExcludeMissing
                    fun _assistantId(): JsonField<String> = assistantId

                    /**
                     * Returns the raw JSON value of [position].
                     *
                     * Unlike [position], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("position")
                    @ExcludeMissing
                    fun _position(): JsonField<Position> = position

                    /**
                     * Returns the raw JSON value of [voiceMode].
                     *
                     * Unlike [voiceMode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("voice_mode")
                    @ExcludeMissing
                    fun _voiceMode(): JsonField<VoiceMode> = voiceMode

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
                         * Returns a mutable builder for constructing an instance of [Assistant].
                         *
                         * The following fields are required:
                         * ```java
                         * .assistantId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Assistant]. */
                    class Builder internal constructor() {

                        private var assistantId: JsonField<String>? = null
                        private var type: JsonValue = JsonValue.from("assistant")
                        private var position: JsonField<Position> = JsonMissing.of()
                        private var voiceMode: JsonField<VoiceMode> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(assistant: Assistant) = apply {
                            assistantId = assistant.assistantId
                            type = assistant.type
                            position = assistant.position
                            voiceMode = assistant.voiceMode
                            additionalProperties = assistant.additionalProperties.toMutableMap()
                        }

                        /** ID of the assistant the conversation transitions to. */
                        fun assistantId(assistantId: String) =
                            assistantId(JsonField.of(assistantId))

                        /**
                         * Sets [Builder.assistantId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.assistantId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun assistantId(assistantId: JsonField<String>) = apply {
                            this.assistantId = assistantId
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("assistant")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        /**
                         * Optional canvas coordinates for rendering the target assistant as a node
                         * in authoring UIs. Pure presentation — the runtime ignores it; round-trips
                         * so frontends can persist graph layout across reloads. When multiple edges
                         * target the same assistant, each edge's `position` is independent
                         * (frontends typically use the first non-null one).
                         */
                        fun position(position: Position) = position(JsonField.of(position))

                        /**
                         * Sets [Builder.position] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.position] with a well-typed [Position]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun position(position: JsonField<Position>) = apply {
                            this.position = position
                        }

                        /**
                         * Voice behavior when handing off to the target assistant, mirroring the
                         * handoff tool's `voice_mode`. `unified` (default) keeps the current voice
                         * across the handoff; `distinct` lets the target assistant speak with its
                         * own configured voice. Only applies to assistant targets — node targets
                         * override voice via the node's own `voice_settings`.
                         */
                        fun voiceMode(voiceMode: VoiceMode) = voiceMode(JsonField.of(voiceMode))

                        /**
                         * Sets [Builder.voiceMode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.voiceMode] with a well-typed [VoiceMode]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun voiceMode(voiceMode: JsonField<VoiceMode>) = apply {
                            this.voiceMode = voiceMode
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Assistant].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .assistantId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Assistant =
                            Assistant(
                                checkRequired("assistantId", assistantId),
                                type,
                                position,
                                voiceMode,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Assistant = apply {
                        if (validated) {
                            return@apply
                        }

                        assistantId()
                        _type().let {
                            if (it != JsonValue.from("assistant")) {
                                throw TelnyxInvalidDataException("'type' is invalid, received $it")
                            }
                        }
                        position().ifPresent { it.validate() }
                        voiceMode().ifPresent { it.validate() }
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
                        (if (assistantId.asKnown().isPresent) 1 else 0) +
                            type.let { if (it == JsonValue.from("assistant")) 1 else 0 } +
                            (position.asKnown().getOrNull()?.validity() ?: 0) +
                            (voiceMode.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * Optional canvas coordinates for rendering the target assistant as a node in
                     * authoring UIs. Pure presentation — the runtime ignores it; round-trips so
                     * frontends can persist graph layout across reloads. When multiple edges target
                     * the same assistant, each edge's `position` is independent (frontends
                     * typically use the first non-null one).
                     */
                    class Position
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val x: JsonField<Double>,
                        private val y: JsonField<Double>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("x")
                            @ExcludeMissing
                            x: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("y")
                            @ExcludeMissing
                            y: JsonField<Double> = JsonMissing.of(),
                        ) : this(x, y, mutableMapOf())

                        /**
                         * Horizontal coordinate in the authoring canvas.
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun x(): Double = x.getRequired("x")

                        /**
                         * Vertical coordinate in the authoring canvas.
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun y(): Double = y.getRequired("y")

                        /**
                         * Returns the raw JSON value of [x].
                         *
                         * Unlike [x], this method doesn't throw if the JSON field has an unexpected
                         * type.
                         */
                        @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

                        /**
                         * Returns the raw JSON value of [y].
                         *
                         * Unlike [y], this method doesn't throw if the JSON field has an unexpected
                         * type.
                         */
                        @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

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
                             * Returns a mutable builder for constructing an instance of [Position].
                             *
                             * The following fields are required:
                             * ```java
                             * .x()
                             * .y()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Position]. */
                        class Builder internal constructor() {

                            private var x: JsonField<Double>? = null
                            private var y: JsonField<Double>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(position: Position) = apply {
                                x = position.x
                                y = position.y
                                additionalProperties = position.additionalProperties.toMutableMap()
                            }

                            /** Horizontal coordinate in the authoring canvas. */
                            fun x(x: Double) = x(JsonField.of(x))

                            /**
                             * Sets [Builder.x] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.x] with a well-typed [Double] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun x(x: JsonField<Double>) = apply { this.x = x }

                            /** Vertical coordinate in the authoring canvas. */
                            fun y(y: Double) = y(JsonField.of(y))

                            /**
                             * Sets [Builder.y] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.y] with a well-typed [Double] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun y(y: JsonField<Double>) = apply { this.y = y }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Position].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .x()
                             * .y()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Position =
                                Position(
                                    checkRequired("x", x),
                                    checkRequired("y", y),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Position = apply {
                            if (validated) {
                                return@apply
                            }

                            x()
                            y()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (x.asKnown().isPresent) 1 else 0) +
                                (if (y.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Position &&
                                x == other.x &&
                                y == other.y &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(x, y, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Position{x=$x, y=$y, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Voice behavior when handing off to the target assistant, mirroring the
                     * handoff tool's `voice_mode`. `unified` (default) keeps the current voice
                     * across the handoff; `distinct` lets the target assistant speak with its own
                     * configured voice. Only applies to assistant targets — node targets override
                     * voice via the node's own `voice_settings`.
                     */
                    class VoiceMode
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val UNIFIED = of("unified")

                            @JvmField val DISTINCT = of("distinct")

                            @JvmStatic fun of(value: String) = VoiceMode(JsonField.of(value))
                        }

                        /** An enum containing [VoiceMode]'s known values. */
                        enum class Known {
                            UNIFIED,
                            DISTINCT,
                        }

                        /**
                         * An enum containing [VoiceMode]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [VoiceMode] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            UNIFIED,
                            DISTINCT,
                            /**
                             * An enum member indicating that [VoiceMode] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                UNIFIED -> Value.UNIFIED
                                DISTINCT -> Value.DISTINCT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                UNIFIED -> Known.UNIFIED
                                DISTINCT -> Known.DISTINCT
                                else ->
                                    throw TelnyxInvalidDataException("Unknown VoiceMode: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                TelnyxInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): VoiceMode = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is VoiceMode && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Assistant &&
                            assistantId == other.assistantId &&
                            type == other.type &&
                            position == other.position &&
                            voiceMode == other.voiceMode &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(assistantId, type, position, voiceMode, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Assistant{assistantId=$assistantId, type=$type, position=$position, voiceMode=$voiceMode, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Edge &&
                    id == other.id &&
                    condition == other.condition &&
                    startNodeId == other.startNodeId &&
                    target == other.target &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, condition, startNodeId, target, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Edge{id=$id, condition=$condition, startNodeId=$startNodeId, target=$target, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConversationFlow &&
                nodes == other.nodes &&
                startNodeId == other.startNodeId &&
                edges == other.edges &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(nodes, startNodeId, edges, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConversationFlow{nodes=$nodes, startNodeId=$startNodeId, edges=$edges, additionalProperties=$additionalProperties}"
    }

    /** Map of dynamic variables and their values */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class ExternalLlm
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val baseUrl: JsonField<String>,
        private val model: JsonField<String>,
        private val authenticationMethod: JsonField<AuthenticationMethod>,
        private val certificateRef: JsonField<String>,
        private val forwardMetadata: JsonField<Boolean>,
        private val llmApiKeyRef: JsonField<String>,
        private val tokenRetrievalUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("base_url") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authentication_method")
            @ExcludeMissing
            authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
            @JsonProperty("certificate_ref")
            @ExcludeMissing
            certificateRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("forward_metadata")
            @ExcludeMissing
            forwardMetadata: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("llm_api_key_ref")
            @ExcludeMissing
            llmApiKeyRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_retrieval_url")
            @ExcludeMissing
            tokenRetrievalUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            baseUrl,
            model,
            authenticationMethod,
            certificateRef,
            forwardMetadata,
            llmApiKeyRef,
            tokenRetrievalUrl,
            mutableMapOf(),
        )

        /**
         * Base URL for the external LLM endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseUrl(): String = baseUrl.getRequired("base_url")

        /**
         * Model identifier to use with the external LLM endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * Authentication method used when connecting to the external LLM endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authenticationMethod(): Optional<AuthenticationMethod> =
            authenticationMethod.getOptional("authentication_method")

        /**
         * Integration secret identifier for the client certificate used with certificate
         * authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun certificateRef(): Optional<String> = certificateRef.getOptional("certificate_ref")

        /**
         * When `true`, Telnyx forwards the assistant's dynamic variables to the external LLM
         * endpoint as a top-level `extra_metadata` object on the chat completion request body.
         * Defaults to `false`. Example payload sent to the external endpoint: `{"extra_metadata":
         * {"customer_name": "Jane", "account_id": "acct_789", "telnyx_agent_target":
         * "+13125550100", "telnyx_end_user_target": "+13125550123"}}`. Distinct from OpenAI's
         * native `metadata` field, which has its own size and type limits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forwardMetadata(): Optional<Boolean> = forwardMetadata.getOptional("forward_metadata")

        /**
         * Integration secret identifier for the external LLM API key.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

        /**
         * URL used to retrieve an access token when certificate authentication is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenRetrievalUrl(): Optional<String> =
            tokenRetrievalUrl.getOptional("token_retrieval_url")

        /**
         * Returns the raw JSON value of [baseUrl].
         *
         * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [authenticationMethod].
         *
         * Unlike [authenticationMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("authentication_method")
        @ExcludeMissing
        fun _authenticationMethod(): JsonField<AuthenticationMethod> = authenticationMethod

        /**
         * Returns the raw JSON value of [certificateRef].
         *
         * Unlike [certificateRef], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("certificate_ref")
        @ExcludeMissing
        fun _certificateRef(): JsonField<String> = certificateRef

        /**
         * Returns the raw JSON value of [forwardMetadata].
         *
         * Unlike [forwardMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("forward_metadata")
        @ExcludeMissing
        fun _forwardMetadata(): JsonField<Boolean> = forwardMetadata

        /**
         * Returns the raw JSON value of [llmApiKeyRef].
         *
         * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

        /**
         * Returns the raw JSON value of [tokenRetrievalUrl].
         *
         * Unlike [tokenRetrievalUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_retrieval_url")
        @ExcludeMissing
        fun _tokenRetrievalUrl(): JsonField<String> = tokenRetrievalUrl

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
             * Returns a mutable builder for constructing an instance of [ExternalLlm].
             *
             * The following fields are required:
             * ```java
             * .baseUrl()
             * .model()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalLlm]. */
        class Builder internal constructor() {

            private var baseUrl: JsonField<String>? = null
            private var model: JsonField<String>? = null
            private var authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of()
            private var certificateRef: JsonField<String> = JsonMissing.of()
            private var forwardMetadata: JsonField<Boolean> = JsonMissing.of()
            private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
            private var tokenRetrievalUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalLlm: ExternalLlm) = apply {
                baseUrl = externalLlm.baseUrl
                model = externalLlm.model
                authenticationMethod = externalLlm.authenticationMethod
                certificateRef = externalLlm.certificateRef
                forwardMetadata = externalLlm.forwardMetadata
                llmApiKeyRef = externalLlm.llmApiKeyRef
                tokenRetrievalUrl = externalLlm.tokenRetrievalUrl
                additionalProperties = externalLlm.additionalProperties.toMutableMap()
            }

            /** Base URL for the external LLM endpoint. */
            fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

            /** Model identifier to use with the external LLM endpoint. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Authentication method used when connecting to the external LLM endpoint. */
            fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                authenticationMethod(JsonField.of(authenticationMethod))

            /**
             * Sets [Builder.authenticationMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authenticationMethod] with a well-typed
             * [AuthenticationMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) =
                apply {
                    this.authenticationMethod = authenticationMethod
                }

            /**
             * Integration secret identifier for the client certificate used with certificate
             * authentication.
             */
            fun certificateRef(certificateRef: String) =
                certificateRef(JsonField.of(certificateRef))

            /**
             * Sets [Builder.certificateRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certificateRef] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun certificateRef(certificateRef: JsonField<String>) = apply {
                this.certificateRef = certificateRef
            }

            /**
             * When `true`, Telnyx forwards the assistant's dynamic variables to the external LLM
             * endpoint as a top-level `extra_metadata` object on the chat completion request body.
             * Defaults to `false`. Example payload sent to the external endpoint:
             * `{"extra_metadata": {"customer_name": "Jane", "account_id": "acct_789",
             * "telnyx_agent_target": "+13125550100", "telnyx_end_user_target": "+13125550123"}}`.
             * Distinct from OpenAI's native `metadata` field, which has its own size and type
             * limits.
             */
            fun forwardMetadata(forwardMetadata: Boolean) =
                forwardMetadata(JsonField.of(forwardMetadata))

            /**
             * Sets [Builder.forwardMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forwardMetadata] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forwardMetadata(forwardMetadata: JsonField<Boolean>) = apply {
                this.forwardMetadata = forwardMetadata
            }

            /** Integration secret identifier for the external LLM API key. */
            fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

            /**
             * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
                this.llmApiKeyRef = llmApiKeyRef
            }

            /** URL used to retrieve an access token when certificate authentication is enabled. */
            fun tokenRetrievalUrl(tokenRetrievalUrl: String) =
                tokenRetrievalUrl(JsonField.of(tokenRetrievalUrl))

            /**
             * Sets [Builder.tokenRetrievalUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenRetrievalUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenRetrievalUrl(tokenRetrievalUrl: JsonField<String>) = apply {
                this.tokenRetrievalUrl = tokenRetrievalUrl
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
             *
             * The following fields are required:
             * ```java
             * .baseUrl()
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalLlm =
                ExternalLlm(
                    checkRequired("baseUrl", baseUrl),
                    checkRequired("model", model),
                    authenticationMethod,
                    certificateRef,
                    forwardMetadata,
                    llmApiKeyRef,
                    tokenRetrievalUrl,
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
        fun validate(): ExternalLlm = apply {
            if (validated) {
                return@apply
            }

            baseUrl()
            model()
            authenticationMethod().ifPresent { it.validate() }
            certificateRef()
            forwardMetadata()
            llmApiKeyRef()
            tokenRetrievalUrl()
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
            (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (authenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (certificateRef.asKnown().isPresent) 1 else 0) +
                (if (forwardMetadata.asKnown().isPresent) 1 else 0) +
                (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                (if (tokenRetrievalUrl.asKnown().isPresent) 1 else 0)

        /** Authentication method used when connecting to the external LLM endpoint. */
        class AuthenticationMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TOKEN = of("token")

                @JvmField val CERTIFICATE = of("certificate")

                @JvmStatic fun of(value: String) = AuthenticationMethod(JsonField.of(value))
            }

            /** An enum containing [AuthenticationMethod]'s known values. */
            enum class Known {
                TOKEN,
                CERTIFICATE,
            }

            /**
             * An enum containing [AuthenticationMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AuthenticationMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TOKEN,
                CERTIFICATE,
                /**
                 * An enum member indicating that [AuthenticationMethod] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TOKEN -> Value.TOKEN
                    CERTIFICATE -> Value.CERTIFICATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TOKEN -> Known.TOKEN
                    CERTIFICATE -> Known.CERTIFICATE
                    else -> throw TelnyxInvalidDataException("Unknown AuthenticationMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): AuthenticationMethod = apply {
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

                return other is AuthenticationMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalLlm &&
                baseUrl == other.baseUrl &&
                model == other.model &&
                authenticationMethod == other.authenticationMethod &&
                certificateRef == other.certificateRef &&
                forwardMetadata == other.forwardMetadata &&
                llmApiKeyRef == other.llmApiKeyRef &&
                tokenRetrievalUrl == other.tokenRetrievalUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                baseUrl,
                model,
                authenticationMethod,
                certificateRef,
                forwardMetadata,
                llmApiKeyRef,
                tokenRetrievalUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalLlm{baseUrl=$baseUrl, model=$model, authenticationMethod=$authenticationMethod, certificateRef=$certificateRef, forwardMetadata=$forwardMetadata, llmApiKeyRef=$llmApiKeyRef, tokenRetrievalUrl=$tokenRetrievalUrl, additionalProperties=$additionalProperties}"
    }

    class FallbackConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val externalLlm: JsonField<ExternalLlm>,
        private val llmApiKeyRef: JsonField<String>,
        private val model: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_llm")
            @ExcludeMissing
            externalLlm: JsonField<ExternalLlm> = JsonMissing.of(),
            @JsonProperty("llm_api_key_ref")
            @ExcludeMissing
            llmApiKeyRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        ) : this(externalLlm, llmApiKeyRef, model, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalLlm(): Optional<ExternalLlm> = externalLlm.getOptional("external_llm")

        /**
         * Integration secret identifier for the fallback model API key.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

        /**
         * Fallback Telnyx-hosted model to use when the primary LLM provider is unavailable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Returns the raw JSON value of [externalLlm].
         *
         * Unlike [externalLlm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_llm")
        @ExcludeMissing
        fun _externalLlm(): JsonField<ExternalLlm> = externalLlm

        /**
         * Returns the raw JSON value of [llmApiKeyRef].
         *
         * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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

            /** Returns a mutable builder for constructing an instance of [FallbackConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FallbackConfig]. */
        class Builder internal constructor() {

            private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
            private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fallbackConfig: FallbackConfig) = apply {
                externalLlm = fallbackConfig.externalLlm
                llmApiKeyRef = fallbackConfig.llmApiKeyRef
                model = fallbackConfig.model
                additionalProperties = fallbackConfig.additionalProperties.toMutableMap()
            }

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

            /** Integration secret identifier for the fallback model API key. */
            fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

            /**
             * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
                this.llmApiKeyRef = llmApiKeyRef
            }

            /** Fallback Telnyx-hosted model to use when the primary LLM provider is unavailable. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

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
            fun build(): FallbackConfig =
                FallbackConfig(
                    externalLlm,
                    llmApiKeyRef,
                    model,
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
        fun validate(): FallbackConfig = apply {
            if (validated) {
                return@apply
            }

            externalLlm().ifPresent { it.validate() }
            llmApiKeyRef()
            model()
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
            (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
                (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0)

        class ExternalLlm
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val baseUrl: JsonField<String>,
            private val model: JsonField<String>,
            private val authenticationMethod: JsonField<AuthenticationMethod>,
            private val certificateRef: JsonField<String>,
            private val forwardMetadata: JsonField<Boolean>,
            private val llmApiKeyRef: JsonField<String>,
            private val tokenRetrievalUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("base_url")
                @ExcludeMissing
                baseUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("authentication_method")
                @ExcludeMissing
                authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
                @JsonProperty("certificate_ref")
                @ExcludeMissing
                certificateRef: JsonField<String> = JsonMissing.of(),
                @JsonProperty("forward_metadata")
                @ExcludeMissing
                forwardMetadata: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("llm_api_key_ref")
                @ExcludeMissing
                llmApiKeyRef: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_retrieval_url")
                @ExcludeMissing
                tokenRetrievalUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                baseUrl,
                model,
                authenticationMethod,
                certificateRef,
                forwardMetadata,
                llmApiKeyRef,
                tokenRetrievalUrl,
                mutableMapOf(),
            )

            /**
             * Base URL for the external LLM endpoint.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun baseUrl(): String = baseUrl.getRequired("base_url")

            /**
             * Model identifier to use with the external LLM endpoint.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun model(): String = model.getRequired("model")

            /**
             * Authentication method used when connecting to the external LLM endpoint.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authenticationMethod(): Optional<AuthenticationMethod> =
                authenticationMethod.getOptional("authentication_method")

            /**
             * Integration secret identifier for the client certificate used with certificate
             * authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun certificateRef(): Optional<String> = certificateRef.getOptional("certificate_ref")

            /**
             * When `true`, Telnyx forwards the assistant's dynamic variables to the external LLM
             * endpoint as a top-level `extra_metadata` object on the chat completion request body.
             * Defaults to `false`. Example payload sent to the external endpoint:
             * `{"extra_metadata": {"customer_name": "Jane", "account_id": "acct_789",
             * "telnyx_agent_target": "+13125550100", "telnyx_end_user_target": "+13125550123"}}`.
             * Distinct from OpenAI's native `metadata` field, which has its own size and type
             * limits.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun forwardMetadata(): Optional<Boolean> =
                forwardMetadata.getOptional("forward_metadata")

            /**
             * Integration secret identifier for the external LLM API key.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

            /**
             * URL used to retrieve an access token when certificate authentication is enabled.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tokenRetrievalUrl(): Optional<String> =
                tokenRetrievalUrl.getOptional("token_retrieval_url")

            /**
             * Returns the raw JSON value of [baseUrl].
             *
             * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [authenticationMethod].
             *
             * Unlike [authenticationMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authentication_method")
            @ExcludeMissing
            fun _authenticationMethod(): JsonField<AuthenticationMethod> = authenticationMethod

            /**
             * Returns the raw JSON value of [certificateRef].
             *
             * Unlike [certificateRef], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("certificate_ref")
            @ExcludeMissing
            fun _certificateRef(): JsonField<String> = certificateRef

            /**
             * Returns the raw JSON value of [forwardMetadata].
             *
             * Unlike [forwardMetadata], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("forward_metadata")
            @ExcludeMissing
            fun _forwardMetadata(): JsonField<Boolean> = forwardMetadata

            /**
             * Returns the raw JSON value of [llmApiKeyRef].
             *
             * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("llm_api_key_ref")
            @ExcludeMissing
            fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

            /**
             * Returns the raw JSON value of [tokenRetrievalUrl].
             *
             * Unlike [tokenRetrievalUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("token_retrieval_url")
            @ExcludeMissing
            fun _tokenRetrievalUrl(): JsonField<String> = tokenRetrievalUrl

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
                 * Returns a mutable builder for constructing an instance of [ExternalLlm].
                 *
                 * The following fields are required:
                 * ```java
                 * .baseUrl()
                 * .model()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExternalLlm]. */
            class Builder internal constructor() {

                private var baseUrl: JsonField<String>? = null
                private var model: JsonField<String>? = null
                private var authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of()
                private var certificateRef: JsonField<String> = JsonMissing.of()
                private var forwardMetadata: JsonField<Boolean> = JsonMissing.of()
                private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
                private var tokenRetrievalUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(externalLlm: ExternalLlm) = apply {
                    baseUrl = externalLlm.baseUrl
                    model = externalLlm.model
                    authenticationMethod = externalLlm.authenticationMethod
                    certificateRef = externalLlm.certificateRef
                    forwardMetadata = externalLlm.forwardMetadata
                    llmApiKeyRef = externalLlm.llmApiKeyRef
                    tokenRetrievalUrl = externalLlm.tokenRetrievalUrl
                    additionalProperties = externalLlm.additionalProperties.toMutableMap()
                }

                /** Base URL for the external LLM endpoint. */
                fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

                /**
                 * Sets [Builder.baseUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.baseUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

                /** Model identifier to use with the external LLM endpoint. */
                fun model(model: String) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                /** Authentication method used when connecting to the external LLM endpoint. */
                fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                    authenticationMethod(JsonField.of(authenticationMethod))

                /**
                 * Sets [Builder.authenticationMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authenticationMethod] with a well-typed
                 * [AuthenticationMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) =
                    apply {
                        this.authenticationMethod = authenticationMethod
                    }

                /**
                 * Integration secret identifier for the client certificate used with certificate
                 * authentication.
                 */
                fun certificateRef(certificateRef: String) =
                    certificateRef(JsonField.of(certificateRef))

                /**
                 * Sets [Builder.certificateRef] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.certificateRef] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun certificateRef(certificateRef: JsonField<String>) = apply {
                    this.certificateRef = certificateRef
                }

                /**
                 * When `true`, Telnyx forwards the assistant's dynamic variables to the external
                 * LLM endpoint as a top-level `extra_metadata` object on the chat completion
                 * request body. Defaults to `false`. Example payload sent to the external endpoint:
                 * `{"extra_metadata": {"customer_name": "Jane", "account_id": "acct_789",
                 * "telnyx_agent_target": "+13125550100", "telnyx_end_user_target":
                 * "+13125550123"}}`. Distinct from OpenAI's native `metadata` field, which has its
                 * own size and type limits.
                 */
                fun forwardMetadata(forwardMetadata: Boolean) =
                    forwardMetadata(JsonField.of(forwardMetadata))

                /**
                 * Sets [Builder.forwardMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.forwardMetadata] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun forwardMetadata(forwardMetadata: JsonField<Boolean>) = apply {
                    this.forwardMetadata = forwardMetadata
                }

                /** Integration secret identifier for the external LLM API key. */
                fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

                /**
                 * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
                    this.llmApiKeyRef = llmApiKeyRef
                }

                /**
                 * URL used to retrieve an access token when certificate authentication is enabled.
                 */
                fun tokenRetrievalUrl(tokenRetrievalUrl: String) =
                    tokenRetrievalUrl(JsonField.of(tokenRetrievalUrl))

                /**
                 * Sets [Builder.tokenRetrievalUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenRetrievalUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun tokenRetrievalUrl(tokenRetrievalUrl: JsonField<String>) = apply {
                    this.tokenRetrievalUrl = tokenRetrievalUrl
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ExternalLlm].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .baseUrl()
                 * .model()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExternalLlm =
                    ExternalLlm(
                        checkRequired("baseUrl", baseUrl),
                        checkRequired("model", model),
                        authenticationMethod,
                        certificateRef,
                        forwardMetadata,
                        llmApiKeyRef,
                        tokenRetrievalUrl,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ExternalLlm = apply {
                if (validated) {
                    return@apply
                }

                baseUrl()
                model()
                authenticationMethod().ifPresent { it.validate() }
                certificateRef()
                forwardMetadata()
                llmApiKeyRef()
                tokenRetrievalUrl()
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
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (authenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (certificateRef.asKnown().isPresent) 1 else 0) +
                    (if (forwardMetadata.asKnown().isPresent) 1 else 0) +
                    (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                    (if (tokenRetrievalUrl.asKnown().isPresent) 1 else 0)

            /** Authentication method used when connecting to the external LLM endpoint. */
            class AuthenticationMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TOKEN = of("token")

                    @JvmField val CERTIFICATE = of("certificate")

                    @JvmStatic fun of(value: String) = AuthenticationMethod(JsonField.of(value))
                }

                /** An enum containing [AuthenticationMethod]'s known values. */
                enum class Known {
                    TOKEN,
                    CERTIFICATE,
                }

                /**
                 * An enum containing [AuthenticationMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [AuthenticationMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOKEN,
                    CERTIFICATE,
                    /**
                     * An enum member indicating that [AuthenticationMethod] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TOKEN -> Value.TOKEN
                        CERTIFICATE -> Value.CERTIFICATE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TOKEN -> Known.TOKEN
                        CERTIFICATE -> Known.CERTIFICATE
                        else ->
                            throw TelnyxInvalidDataException("Unknown AuthenticationMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): AuthenticationMethod = apply {
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

                    return other is AuthenticationMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternalLlm &&
                    baseUrl == other.baseUrl &&
                    model == other.model &&
                    authenticationMethod == other.authenticationMethod &&
                    certificateRef == other.certificateRef &&
                    forwardMetadata == other.forwardMetadata &&
                    llmApiKeyRef == other.llmApiKeyRef &&
                    tokenRetrievalUrl == other.tokenRetrievalUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    baseUrl,
                    model,
                    authenticationMethod,
                    certificateRef,
                    forwardMetadata,
                    llmApiKeyRef,
                    tokenRetrievalUrl,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExternalLlm{baseUrl=$baseUrl, model=$model, authenticationMethod=$authenticationMethod, certificateRef=$certificateRef, forwardMetadata=$forwardMetadata, llmApiKeyRef=$llmApiKeyRef, tokenRetrievalUrl=$tokenRetrievalUrl, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FallbackConfig &&
                externalLlm == other.externalLlm &&
                llmApiKeyRef == other.llmApiKeyRef &&
                model == other.model &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(externalLlm, llmApiKeyRef, model, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FallbackConfig{externalLlm=$externalLlm, llmApiKeyRef=$llmApiKeyRef, model=$model, additionalProperties=$additionalProperties}"
    }

    /**
     * Reference to a connected integration attached to an assistant. Discover available
     * integrations with `/ai/integrations` and connected integrations with
     * `/ai/integrations/connections`.
     */
    class Integration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val integrationId: JsonField<String>,
        private val allowedList: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("integration_id")
            @ExcludeMissing
            integrationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowed_list")
            @ExcludeMissing
            allowedList: JsonField<List<String>> = JsonMissing.of(),
        ) : this(integrationId, allowedList, mutableMapOf())

        /**
         * Catalog integration ID to attach. This is the `id` from the integrations catalog at
         * `/ai/integrations` (the same value also appears as `integration_id` on entries returned
         * by `/ai/integrations/connections`). It is **not** the connection-level `id` from
         * `/ai/integrations/connections`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationId(): String = integrationId.getRequired("integration_id")

        /**
         * Optional per-assistant allowlist of integration tool names. When omitted or empty, all
         * tools allowed by the connected integration are available to the assistant.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedList(): Optional<List<String>> = allowedList.getOptional("allowed_list")

        /**
         * Returns the raw JSON value of [integrationId].
         *
         * Unlike [integrationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_id")
        @ExcludeMissing
        fun _integrationId(): JsonField<String> = integrationId

        /**
         * Returns the raw JSON value of [allowedList].
         *
         * Unlike [allowedList], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allowed_list")
        @ExcludeMissing
        fun _allowedList(): JsonField<List<String>> = allowedList

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
             * Returns a mutable builder for constructing an instance of [Integration].
             *
             * The following fields are required:
             * ```java
             * .integrationId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Integration]. */
        class Builder internal constructor() {

            private var integrationId: JsonField<String>? = null
            private var allowedList: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(integration: Integration) = apply {
                integrationId = integration.integrationId
                allowedList = integration.allowedList.map { it.toMutableList() }
                additionalProperties = integration.additionalProperties.toMutableMap()
            }

            /**
             * Catalog integration ID to attach. This is the `id` from the integrations catalog at
             * `/ai/integrations` (the same value also appears as `integration_id` on entries
             * returned by `/ai/integrations/connections`). It is **not** the connection-level `id`
             * from `/ai/integrations/connections`.
             */
            fun integrationId(integrationId: String) = integrationId(JsonField.of(integrationId))

            /**
             * Sets [Builder.integrationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun integrationId(integrationId: JsonField<String>) = apply {
                this.integrationId = integrationId
            }

            /**
             * Optional per-assistant allowlist of integration tool names. When omitted or empty,
             * all tools allowed by the connected integration are available to the assistant.
             */
            fun allowedList(allowedList: List<String>) = allowedList(JsonField.of(allowedList))

            /**
             * Sets [Builder.allowedList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedList] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowedList(allowedList: JsonField<List<String>>) = apply {
                this.allowedList = allowedList.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.allowedList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedList(allowedList: String) = apply {
                this.allowedList =
                    (this.allowedList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedList", it).add(allowedList)
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
             * Returns an immutable instance of [Integration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .integrationId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Integration =
                Integration(
                    checkRequired("integrationId", integrationId),
                    (allowedList ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Integration = apply {
            if (validated) {
                return@apply
            }

            integrationId()
            allowedList()
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
            (if (integrationId.asKnown().isPresent) 1 else 0) +
                (allowedList.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Integration &&
                integrationId == other.integrationId &&
                allowedList == other.allowedList &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(integrationId, allowedList, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Integration{integrationId=$integrationId, allowedList=$allowedList, additionalProperties=$additionalProperties}"
    }

    /**
     * Settings for interruptions and how the assistant decides the user has finished speaking.
     * These timings are most relevant when using non turn-taking transcription models. For
     * turn-taking models like `deepgram/flux`, end-of-turn behavior is controlled by the
     * transcription end-of-turn settings under `transcription.settings` (`eot_threshold`,
     * `eot_timeout_ms`, `eager_eot_threshold`).
     */
    class InterruptionSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val disableGreetingInterruption: JsonField<Boolean>,
        private val enable: JsonField<Boolean>,
        private val startSpeakingPlan: JsonField<StartSpeakingPlan>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("disable_greeting_interruption")
            @ExcludeMissing
            disableGreetingInterruption: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enable") @ExcludeMissing enable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_speaking_plan")
            @ExcludeMissing
            startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of(),
        ) : this(disableGreetingInterruption, enable, startSpeakingPlan, mutableMapOf())

        /**
         * When true, disables user interruptions while the assistant greeting is playing.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun disableGreetingInterruption(): Optional<Boolean> =
            disableGreetingInterruption.getOptional("disable_greeting_interruption")

        /**
         * Whether users can interrupt the assistant while it is speaking.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enable(): Optional<Boolean> = enable.getOptional("enable")

        /**
         * Controls when the assistant starts speaking after the user stops. These thresholds
         * primarily apply to non turn-taking transcription models. For turn-taking models like
         * `deepgram/flux`, end-of-turn detection is driven by the transcription end-of-turn
         * settings under `transcription.settings` instead.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startSpeakingPlan(): Optional<StartSpeakingPlan> =
            startSpeakingPlan.getOptional("start_speaking_plan")

        /**
         * Returns the raw JSON value of [disableGreetingInterruption].
         *
         * Unlike [disableGreetingInterruption], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("disable_greeting_interruption")
        @ExcludeMissing
        fun _disableGreetingInterruption(): JsonField<Boolean> = disableGreetingInterruption

        /**
         * Returns the raw JSON value of [enable].
         *
         * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

        /**
         * Returns the raw JSON value of [startSpeakingPlan].
         *
         * Unlike [startSpeakingPlan], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("start_speaking_plan")
        @ExcludeMissing
        fun _startSpeakingPlan(): JsonField<StartSpeakingPlan> = startSpeakingPlan

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

            /** Returns a mutable builder for constructing an instance of [InterruptionSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InterruptionSettings]. */
        class Builder internal constructor() {

            private var disableGreetingInterruption: JsonField<Boolean> = JsonMissing.of()
            private var enable: JsonField<Boolean> = JsonMissing.of()
            private var startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interruptionSettings: InterruptionSettings) = apply {
                disableGreetingInterruption = interruptionSettings.disableGreetingInterruption
                enable = interruptionSettings.enable
                startSpeakingPlan = interruptionSettings.startSpeakingPlan
                additionalProperties = interruptionSettings.additionalProperties.toMutableMap()
            }

            /** When true, disables user interruptions while the assistant greeting is playing. */
            fun disableGreetingInterruption(disableGreetingInterruption: Boolean) =
                disableGreetingInterruption(JsonField.of(disableGreetingInterruption))

            /**
             * Sets [Builder.disableGreetingInterruption] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableGreetingInterruption] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun disableGreetingInterruption(disableGreetingInterruption: JsonField<Boolean>) =
                apply {
                    this.disableGreetingInterruption = disableGreetingInterruption
                }

            /** Whether users can interrupt the assistant while it is speaking. */
            fun enable(enable: Boolean) = enable(JsonField.of(enable))

            /**
             * Sets [Builder.enable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enable] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

            /**
             * Controls when the assistant starts speaking after the user stops. These thresholds
             * primarily apply to non turn-taking transcription models. For turn-taking models like
             * `deepgram/flux`, end-of-turn detection is driven by the transcription end-of-turn
             * settings under `transcription.settings` instead.
             */
            fun startSpeakingPlan(startSpeakingPlan: StartSpeakingPlan) =
                startSpeakingPlan(JsonField.of(startSpeakingPlan))

            /**
             * Sets [Builder.startSpeakingPlan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startSpeakingPlan] with a well-typed
             * [StartSpeakingPlan] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun startSpeakingPlan(startSpeakingPlan: JsonField<StartSpeakingPlan>) = apply {
                this.startSpeakingPlan = startSpeakingPlan
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
             * Returns an immutable instance of [InterruptionSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InterruptionSettings =
                InterruptionSettings(
                    disableGreetingInterruption,
                    enable,
                    startSpeakingPlan,
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
        fun validate(): InterruptionSettings = apply {
            if (validated) {
                return@apply
            }

            disableGreetingInterruption()
            enable()
            startSpeakingPlan().ifPresent { it.validate() }
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
            (if (disableGreetingInterruption.asKnown().isPresent) 1 else 0) +
                (if (enable.asKnown().isPresent) 1 else 0) +
                (startSpeakingPlan.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Controls when the assistant starts speaking after the user stops. These thresholds
         * primarily apply to non turn-taking transcription models. For turn-taking models like
         * `deepgram/flux`, end-of-turn detection is driven by the transcription end-of-turn
         * settings under `transcription.settings` instead.
         */
        class StartSpeakingPlan
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan>,
            private val waitSeconds: JsonField<Float>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("transcription_endpointing_plan")
                @ExcludeMissing
                transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan> =
                    JsonMissing.of(),
                @JsonProperty("wait_seconds")
                @ExcludeMissing
                waitSeconds: JsonField<Float> = JsonMissing.of(),
            ) : this(transcriptionEndpointingPlan, waitSeconds, mutableMapOf())

            /**
             * Endpointing thresholds used to decide when the user has finished speaking. Applies to
             * non turn-taking transcription models. For `deepgram/flux`, use
             * `transcription.settings.eot_threshold` / `eot_timeout_ms` / `eager_eot_threshold`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionEndpointingPlan(): Optional<TranscriptionEndpointingPlan> =
                transcriptionEndpointingPlan.getOptional("transcription_endpointing_plan")

            /**
             * Minimum seconds to wait before the assistant starts speaking.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun waitSeconds(): Optional<Float> = waitSeconds.getOptional("wait_seconds")

            /**
             * Returns the raw JSON value of [transcriptionEndpointingPlan].
             *
             * Unlike [transcriptionEndpointingPlan], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("transcription_endpointing_plan")
            @ExcludeMissing
            fun _transcriptionEndpointingPlan(): JsonField<TranscriptionEndpointingPlan> =
                transcriptionEndpointingPlan

            /**
             * Returns the raw JSON value of [waitSeconds].
             *
             * Unlike [waitSeconds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("wait_seconds")
            @ExcludeMissing
            fun _waitSeconds(): JsonField<Float> = waitSeconds

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
                 * Returns a mutable builder for constructing an instance of [StartSpeakingPlan].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartSpeakingPlan]. */
            class Builder internal constructor() {

                private var transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan> =
                    JsonMissing.of()
                private var waitSeconds: JsonField<Float> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startSpeakingPlan: StartSpeakingPlan) = apply {
                    transcriptionEndpointingPlan = startSpeakingPlan.transcriptionEndpointingPlan
                    waitSeconds = startSpeakingPlan.waitSeconds
                    additionalProperties = startSpeakingPlan.additionalProperties.toMutableMap()
                }

                /**
                 * Endpointing thresholds used to decide when the user has finished speaking.
                 * Applies to non turn-taking transcription models. For `deepgram/flux`, use
                 * `transcription.settings.eot_threshold` / `eot_timeout_ms` /
                 * `eager_eot_threshold`.
                 */
                fun transcriptionEndpointingPlan(
                    transcriptionEndpointingPlan: TranscriptionEndpointingPlan
                ) = transcriptionEndpointingPlan(JsonField.of(transcriptionEndpointingPlan))

                /**
                 * Sets [Builder.transcriptionEndpointingPlan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionEndpointingPlan] with a well-typed
                 * [TranscriptionEndpointingPlan] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun transcriptionEndpointingPlan(
                    transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan>
                ) = apply { this.transcriptionEndpointingPlan = transcriptionEndpointingPlan }

                /** Minimum seconds to wait before the assistant starts speaking. */
                fun waitSeconds(waitSeconds: Float) = waitSeconds(JsonField.of(waitSeconds))

                /**
                 * Sets [Builder.waitSeconds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waitSeconds] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun waitSeconds(waitSeconds: JsonField<Float>) = apply {
                    this.waitSeconds = waitSeconds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [StartSpeakingPlan].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StartSpeakingPlan =
                    StartSpeakingPlan(
                        transcriptionEndpointingPlan,
                        waitSeconds,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): StartSpeakingPlan = apply {
                if (validated) {
                    return@apply
                }

                transcriptionEndpointingPlan().ifPresent { it.validate() }
                waitSeconds()
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
                (transcriptionEndpointingPlan.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (waitSeconds.asKnown().isPresent) 1 else 0)

            /**
             * Endpointing thresholds used to decide when the user has finished speaking. Applies to
             * non turn-taking transcription models. For `deepgram/flux`, use
             * `transcription.settings.eot_threshold` / `eot_timeout_ms` / `eager_eot_threshold`.
             */
            class TranscriptionEndpointingPlan
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val onNoPunctuationSeconds: JsonField<Float>,
                private val onNumberSeconds: JsonField<Float>,
                private val onPunctuationSeconds: JsonField<Float>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("on_no_punctuation_seconds")
                    @ExcludeMissing
                    onNoPunctuationSeconds: JsonField<Float> = JsonMissing.of(),
                    @JsonProperty("on_number_seconds")
                    @ExcludeMissing
                    onNumberSeconds: JsonField<Float> = JsonMissing.of(),
                    @JsonProperty("on_punctuation_seconds")
                    @ExcludeMissing
                    onPunctuationSeconds: JsonField<Float> = JsonMissing.of(),
                ) : this(
                    onNoPunctuationSeconds,
                    onNumberSeconds,
                    onPunctuationSeconds,
                    mutableMapOf(),
                )

                /**
                 * Seconds to wait after the transcript ends without punctuation.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onNoPunctuationSeconds(): Optional<Float> =
                    onNoPunctuationSeconds.getOptional("on_no_punctuation_seconds")

                /**
                 * Seconds to wait after the transcript ends with a number.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onNumberSeconds(): Optional<Float> =
                    onNumberSeconds.getOptional("on_number_seconds")

                /**
                 * Seconds to wait after the transcript ends with punctuation.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onPunctuationSeconds(): Optional<Float> =
                    onPunctuationSeconds.getOptional("on_punctuation_seconds")

                /**
                 * Returns the raw JSON value of [onNoPunctuationSeconds].
                 *
                 * Unlike [onNoPunctuationSeconds], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("on_no_punctuation_seconds")
                @ExcludeMissing
                fun _onNoPunctuationSeconds(): JsonField<Float> = onNoPunctuationSeconds

                /**
                 * Returns the raw JSON value of [onNumberSeconds].
                 *
                 * Unlike [onNumberSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_number_seconds")
                @ExcludeMissing
                fun _onNumberSeconds(): JsonField<Float> = onNumberSeconds

                /**
                 * Returns the raw JSON value of [onPunctuationSeconds].
                 *
                 * Unlike [onPunctuationSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_punctuation_seconds")
                @ExcludeMissing
                fun _onPunctuationSeconds(): JsonField<Float> = onPunctuationSeconds

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
                     * Returns a mutable builder for constructing an instance of
                     * [TranscriptionEndpointingPlan].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TranscriptionEndpointingPlan]. */
                class Builder internal constructor() {

                    private var onNoPunctuationSeconds: JsonField<Float> = JsonMissing.of()
                    private var onNumberSeconds: JsonField<Float> = JsonMissing.of()
                    private var onPunctuationSeconds: JsonField<Float> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(transcriptionEndpointingPlan: TranscriptionEndpointingPlan) =
                        apply {
                            onNoPunctuationSeconds =
                                transcriptionEndpointingPlan.onNoPunctuationSeconds
                            onNumberSeconds = transcriptionEndpointingPlan.onNumberSeconds
                            onPunctuationSeconds = transcriptionEndpointingPlan.onPunctuationSeconds
                            additionalProperties =
                                transcriptionEndpointingPlan.additionalProperties.toMutableMap()
                        }

                    /** Seconds to wait after the transcript ends without punctuation. */
                    fun onNoPunctuationSeconds(onNoPunctuationSeconds: Float) =
                        onNoPunctuationSeconds(JsonField.of(onNoPunctuationSeconds))

                    /**
                     * Sets [Builder.onNoPunctuationSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onNoPunctuationSeconds] with a well-typed
                     * [Float] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onNoPunctuationSeconds(onNoPunctuationSeconds: JsonField<Float>) = apply {
                        this.onNoPunctuationSeconds = onNoPunctuationSeconds
                    }

                    /** Seconds to wait after the transcript ends with a number. */
                    fun onNumberSeconds(onNumberSeconds: Float) =
                        onNumberSeconds(JsonField.of(onNumberSeconds))

                    /**
                     * Sets [Builder.onNumberSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onNumberSeconds] with a well-typed [Float]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onNumberSeconds(onNumberSeconds: JsonField<Float>) = apply {
                        this.onNumberSeconds = onNumberSeconds
                    }

                    /** Seconds to wait after the transcript ends with punctuation. */
                    fun onPunctuationSeconds(onPunctuationSeconds: Float) =
                        onPunctuationSeconds(JsonField.of(onPunctuationSeconds))

                    /**
                     * Sets [Builder.onPunctuationSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onPunctuationSeconds] with a well-typed
                     * [Float] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onPunctuationSeconds(onPunctuationSeconds: JsonField<Float>) = apply {
                        this.onPunctuationSeconds = onPunctuationSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [TranscriptionEndpointingPlan].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TranscriptionEndpointingPlan =
                        TranscriptionEndpointingPlan(
                            onNoPunctuationSeconds,
                            onNumberSeconds,
                            onPunctuationSeconds,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): TranscriptionEndpointingPlan = apply {
                    if (validated) {
                        return@apply
                    }

                    onNoPunctuationSeconds()
                    onNumberSeconds()
                    onPunctuationSeconds()
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
                    (if (onNoPunctuationSeconds.asKnown().isPresent) 1 else 0) +
                        (if (onNumberSeconds.asKnown().isPresent) 1 else 0) +
                        (if (onPunctuationSeconds.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TranscriptionEndpointingPlan &&
                        onNoPunctuationSeconds == other.onNoPunctuationSeconds &&
                        onNumberSeconds == other.onNumberSeconds &&
                        onPunctuationSeconds == other.onPunctuationSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        onNoPunctuationSeconds,
                        onNumberSeconds,
                        onPunctuationSeconds,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TranscriptionEndpointingPlan{onNoPunctuationSeconds=$onNoPunctuationSeconds, onNumberSeconds=$onNumberSeconds, onPunctuationSeconds=$onPunctuationSeconds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartSpeakingPlan &&
                    transcriptionEndpointingPlan == other.transcriptionEndpointingPlan &&
                    waitSeconds == other.waitSeconds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(transcriptionEndpointingPlan, waitSeconds, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartSpeakingPlan{transcriptionEndpointingPlan=$transcriptionEndpointingPlan, waitSeconds=$waitSeconds, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InterruptionSettings &&
                disableGreetingInterruption == other.disableGreetingInterruption &&
                enable == other.enable &&
                startSpeakingPlan == other.startSpeakingPlan &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                disableGreetingInterruption,
                enable,
                startSpeakingPlan,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterruptionSettings{disableGreetingInterruption=$disableGreetingInterruption, enable=$enable, startSpeakingPlan=$startSpeakingPlan, additionalProperties=$additionalProperties}"
    }

    /**
     * Reference to an MCP server attached to an assistant. Create and manage MCP servers with the
     * `/ai/mcp_servers` endpoints, then attach them to assistants by ID.
     */
    class McpServer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val allowedTools: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowed_tools")
            @ExcludeMissing
            allowedTools: JsonField<List<String>> = JsonMissing.of(),
        ) : this(id, allowedTools, mutableMapOf())

        /**
         * ID of the MCP server to attach. This must be the `id` of an MCP server returned by the
         * `/ai/mcp_servers` endpoints.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Optional per-assistant allowlist of MCP tool names. When omitted, the assistant uses the
         * MCP server's configured `allowed_tools`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedTools(): Optional<List<String>> = allowedTools.getOptional("allowed_tools")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [allowedTools].
         *
         * Unlike [allowedTools], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_tools")
        @ExcludeMissing
        fun _allowedTools(): JsonField<List<String>> = allowedTools

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
             * Returns a mutable builder for constructing an instance of [McpServer].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [McpServer]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var allowedTools: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mcpServer: McpServer) = apply {
                id = mcpServer.id
                allowedTools = mcpServer.allowedTools.map { it.toMutableList() }
                additionalProperties = mcpServer.additionalProperties.toMutableMap()
            }

            /**
             * ID of the MCP server to attach. This must be the `id` of an MCP server returned by
             * the `/ai/mcp_servers` endpoints.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Optional per-assistant allowlist of MCP tool names. When omitted, the assistant uses
             * the MCP server's configured `allowed_tools`.
             */
            fun allowedTools(allowedTools: List<String>) = allowedTools(JsonField.of(allowedTools))

            /**
             * Sets [Builder.allowedTools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedTools] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowedTools(allowedTools: JsonField<List<String>>) = apply {
                this.allowedTools = allowedTools.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedTools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedTool(allowedTool: String) = apply {
                allowedTools =
                    (allowedTools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedTools", it).add(allowedTool)
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
             * Returns an immutable instance of [McpServer].
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
            fun build(): McpServer =
                McpServer(
                    checkRequired("id", id),
                    (allowedTools ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): McpServer = apply {
            if (validated) {
                return@apply
            }

            id()
            allowedTools()
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
            (if (id.asKnown().isPresent) 1 else 0) + (allowedTools.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is McpServer &&
                id == other.id &&
                allowedTools == other.allowedTools &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, allowedTools, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "McpServer{id=$id, allowedTools=$allowedTools, additionalProperties=$additionalProperties}"
    }

    /**
     * Configuration for post-conversation processing. When enabled, the assistant receives one
     * additional LLM turn after the conversation ends, allowing it to execute tool calls such as
     * logging to a CRM or sending a summary. The assistant can execute multiple parallel or
     * sequential tools during this phase. Telephony-control tools (e.g. hangup, transfer) are
     * unavailable post-conversation. Beta feature.
     */
    class PostConversationSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of()
        ) : this(enabled, mutableMapOf())

        /**
         * Whether post-conversation processing is enabled. When true, the assistant will be invoked
         * after the conversation ends to perform any final tool calls. Defaults to false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

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
             * Returns a mutable builder for constructing an instance of [PostConversationSettings].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PostConversationSettings]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(postConversationSettings: PostConversationSettings) = apply {
                enabled = postConversationSettings.enabled
                additionalProperties = postConversationSettings.additionalProperties.toMutableMap()
            }

            /**
             * Whether post-conversation processing is enabled. When true, the assistant will be
             * invoked after the conversation ends to perform any final tool calls. Defaults to
             * false.
             */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

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
             * Returns an immutable instance of [PostConversationSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PostConversationSettings =
                PostConversationSettings(enabled, additionalProperties.toMutableMap())
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
        fun validate(): PostConversationSettings = apply {
            if (validated) {
                return@apply
            }

            enabled()
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
        @JvmSynthetic internal fun validity(): Int = (if (enabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PostConversationSettings &&
                enabled == other.enabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(enabled, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostConversationSettings{enabled=$enabled, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceEmbedding &&
            id == other.id &&
            createdAt == other.createdAt &&
            instructions == other.instructions &&
            model == other.model &&
            name == other.name &&
            conversationFlow == other.conversationFlow &&
            description == other.description &&
            dynamicVariables == other.dynamicVariables &&
            dynamicVariablesWebhookTimeoutMs == other.dynamicVariablesWebhookTimeoutMs &&
            dynamicVariablesWebhookUrl == other.dynamicVariablesWebhookUrl &&
            enabledFeatures == other.enabledFeatures &&
            externalLlm == other.externalLlm &&
            fallbackConfig == other.fallbackConfig &&
            greeting == other.greeting &&
            importMetadata == other.importMetadata &&
            insightSettings == other.insightSettings &&
            integrations == other.integrations &&
            interruptionSettings == other.interruptionSettings &&
            llmApiKeyRef == other.llmApiKeyRef &&
            mcpServers == other.mcpServers &&
            messagingSettings == other.messagingSettings &&
            observabilitySettings == other.observabilitySettings &&
            postConversationSettings == other.postConversationSettings &&
            privacySettings == other.privacySettings &&
            relatedMissionIds == other.relatedMissionIds &&
            tags == other.tags &&
            telephonySettings == other.telephonySettings &&
            tools == other.tools &&
            transcription == other.transcription &&
            versionCreatedAt == other.versionCreatedAt &&
            versionId == other.versionId &&
            versionName == other.versionName &&
            voiceSettings == other.voiceSettings &&
            widgetSettings == other.widgetSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            instructions,
            model,
            name,
            conversationFlow,
            description,
            dynamicVariables,
            dynamicVariablesWebhookTimeoutMs,
            dynamicVariablesWebhookUrl,
            enabledFeatures,
            externalLlm,
            fallbackConfig,
            greeting,
            importMetadata,
            insightSettings,
            integrations,
            interruptionSettings,
            llmApiKeyRef,
            mcpServers,
            messagingSettings,
            observabilitySettings,
            postConversationSettings,
            privacySettings,
            relatedMissionIds,
            tags,
            telephonySettings,
            tools,
            transcription,
            versionCreatedAt,
            versionId,
            versionName,
            voiceSettings,
            widgetSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbedding{id=$id, createdAt=$createdAt, instructions=$instructions, model=$model, name=$name, conversationFlow=$conversationFlow, description=$description, dynamicVariables=$dynamicVariables, dynamicVariablesWebhookTimeoutMs=$dynamicVariablesWebhookTimeoutMs, dynamicVariablesWebhookUrl=$dynamicVariablesWebhookUrl, enabledFeatures=$enabledFeatures, externalLlm=$externalLlm, fallbackConfig=$fallbackConfig, greeting=$greeting, importMetadata=$importMetadata, insightSettings=$insightSettings, integrations=$integrations, interruptionSettings=$interruptionSettings, llmApiKeyRef=$llmApiKeyRef, mcpServers=$mcpServers, messagingSettings=$messagingSettings, observabilitySettings=$observabilitySettings, postConversationSettings=$postConversationSettings, privacySettings=$privacySettings, relatedMissionIds=$relatedMissionIds, tags=$tags, telephonySettings=$telephonySettings, tools=$tools, transcription=$transcription, versionCreatedAt=$versionCreatedAt, versionId=$versionId, versionName=$versionName, voiceSettings=$voiceSettings, widgetSettings=$widgetSettings, additionalProperties=$additionalProperties}"
}
