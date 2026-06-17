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
    private val integrations: JsonField<List<AssistantIntegration>>,
    private val interruptionSettings: JsonField<InferenceEmbeddingInterruptionSettings>,
    private val llmApiKeyRef: JsonField<String>,
    private val mcpServers: JsonField<List<AssistantMcpServer>>,
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
        integrations: JsonField<List<AssistantIntegration>> = JsonMissing.of(),
        @JsonProperty("interruption_settings")
        @ExcludeMissing
        interruptionSettings: JsonField<InferenceEmbeddingInterruptionSettings> = JsonMissing.of(),
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        mcpServers: JsonField<List<AssistantMcpServer>> = JsonMissing.of(),
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
    fun integrations(): Optional<List<AssistantIntegration>> =
        integrations.getOptional("integrations")

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
    fun interruptionSettings(): Optional<InferenceEmbeddingInterruptionSettings> =
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
    fun mcpServers(): Optional<List<AssistantMcpServer>> = mcpServers.getOptional("mcp_servers")

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
    fun _integrations(): JsonField<List<AssistantIntegration>> = integrations

    /**
     * Returns the raw JSON value of [interruptionSettings].
     *
     * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interruption_settings")
    @ExcludeMissing
    fun _interruptionSettings(): JsonField<InferenceEmbeddingInterruptionSettings> =
        interruptionSettings

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
    fun _mcpServers(): JsonField<List<AssistantMcpServer>> = mcpServers

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
        private var integrations: JsonField<MutableList<AssistantIntegration>>? = null
        private var interruptionSettings: JsonField<InferenceEmbeddingInterruptionSettings> =
            JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var mcpServers: JsonField<MutableList<AssistantMcpServer>>? = null
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
        fun integrations(integrations: List<AssistantIntegration>) =
            integrations(JsonField.of(integrations))

        /**
         * Sets [Builder.integrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrations] with a well-typed
         * `List<AssistantIntegration>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun integrations(integrations: JsonField<List<AssistantIntegration>>) = apply {
            this.integrations = integrations.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssistantIntegration] to [integrations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIntegration(integration: AssistantIntegration) = apply {
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
        fun interruptionSettings(interruptionSettings: InferenceEmbeddingInterruptionSettings) =
            interruptionSettings(JsonField.of(interruptionSettings))

        /**
         * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptionSettings] with a well-typed
         * [InferenceEmbeddingInterruptionSettings] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun interruptionSettings(
            interruptionSettings: JsonField<InferenceEmbeddingInterruptionSettings>
        ) = apply { this.interruptionSettings = interruptionSettings }

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
        fun mcpServers(mcpServers: List<AssistantMcpServer>) = mcpServers(JsonField.of(mcpServers))

        /**
         * Sets [Builder.mcpServers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpServers] with a well-typed `List<AssistantMcpServer>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mcpServers(mcpServers: JsonField<List<AssistantMcpServer>>) = apply {
            this.mcpServers = mcpServers.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssistantMcpServer] to [mcpServers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMcpServer(mcpServer: AssistantMcpServer) = apply {
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
        fun addInviteTool(invite: AssistantTool.Invite.InviteToolInviteConfig) =
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
        private val edges: JsonField<List<FlowEdge>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("nodes") @ExcludeMissing nodes: JsonField<List<Node>> = JsonMissing.of(),
            @JsonProperty("start_node_id")
            @ExcludeMissing
            startNodeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("edges")
            @ExcludeMissing
            edges: JsonField<List<FlowEdge>> = JsonMissing.of(),
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
        fun edges(): Optional<List<FlowEdge>> = edges.getOptional("edges")

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
        @JsonProperty("edges") @ExcludeMissing fun _edges(): JsonField<List<FlowEdge>> = edges

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
            private var edges: JsonField<MutableList<FlowEdge>>? = null
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
            fun edges(edges: List<FlowEdge>) = edges(JsonField.of(edges))

            /**
             * Sets [Builder.edges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.edges] with a well-typed `List<FlowEdge>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun edges(edges: JsonField<List<FlowEdge>>) = apply {
                this.edges = edges.map { it.toMutableList() }
            }

            /**
             * Adds a single [FlowEdge] to [edges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEdge(edge: FlowEdge) = apply {
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
                private val position: JsonField<NodePosition>,
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
                    position: JsonField<NodePosition> = JsonMissing.of(),
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
                fun position(): Optional<NodePosition> = position.getOptional("position")

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
                fun _position(): JsonField<NodePosition> = position

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
                    private var position: JsonField<NodePosition> = JsonMissing.of()
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
                    fun position(position: NodePosition) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [NodePosition]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun position(position: JsonField<NodePosition>) = apply {
                        this.position = position
                    }

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
                private val position: JsonField<NodePosition>,
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
                    position: JsonField<NodePosition> = JsonMissing.of(),
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
                fun position(): Optional<NodePosition> = position.getOptional("position")

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
                fun _position(): JsonField<NodePosition> = position

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
                    private var position: JsonField<NodePosition> = JsonMissing.of()
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
                    fun position(position: NodePosition) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [NodePosition]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun position(position: JsonField<NodePosition>) = apply {
                        this.position = position
                    }

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
                    fun addInviteTool(invite: AssistantTool.Invite.InviteToolInviteConfig) =
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
                private val position: JsonField<NodePosition>,
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
                    position: JsonField<NodePosition> = JsonMissing.of(),
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
                fun position(): Optional<NodePosition> = position.getOptional("position")

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
                fun _position(): JsonField<NodePosition> = position

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
                    private var position: JsonField<NodePosition> = JsonMissing.of()
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
                    fun position(position: NodePosition) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [NodePosition]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun position(position: JsonField<NodePosition>) = apply {
                        this.position = position
                    }

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
