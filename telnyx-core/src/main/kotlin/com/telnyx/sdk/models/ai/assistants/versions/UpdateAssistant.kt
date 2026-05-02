// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.versions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ai.assistants.AssistantTool
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.HangupTool
import com.telnyx.sdk.models.ai.assistants.HangupToolParams
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.ObservabilityReq
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.RetrievalTool
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.WidgetSettings
import com.telnyx.sdk.models.ai.chat.BucketIds
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateAssistant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val dynamicVariables: JsonField<DynamicVariables>,
    private val dynamicVariablesWebhookTimeoutMs: JsonField<Long>,
    private val dynamicVariablesWebhookUrl: JsonField<String>,
    private val enabledFeatures: JsonField<List<EnabledFeatures>>,
    private val externalLlm: JsonField<ExternalLlm>,
    private val fallbackConfig: JsonField<FallbackConfig>,
    private val greeting: JsonField<String>,
    private val insightSettings: JsonField<InsightSettings>,
    private val instructions: JsonField<String>,
    private val integrations: JsonField<List<Integration>>,
    private val interruptionSettings: JsonField<InterruptionSettings>,
    private val llmApiKeyRef: JsonField<String>,
    private val mcpServers: JsonField<List<McpServer>>,
    private val messagingSettings: JsonField<MessagingSettings>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val observabilitySettings: JsonField<ObservabilityReq>,
    private val postConversationSettings: JsonField<PostConversationSettings>,
    private val privacySettings: JsonField<PrivacySettings>,
    private val tags: JsonField<List<String>>,
    private val telephonySettings: JsonField<TelephonySettings>,
    private val toolIds: JsonField<List<String>>,
    private val tools: JsonField<List<AssistantTool>>,
    private val transcription: JsonField<TranscriptionSettings>,
    private val versionName: JsonField<String>,
    private val voiceSettings: JsonField<VoiceSettings>,
    private val widgetSettings: JsonField<WidgetSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
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
        @JsonProperty("insight_settings")
        @ExcludeMissing
        insightSettings: JsonField<InsightSettings> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observability_settings")
        @ExcludeMissing
        observabilitySettings: JsonField<ObservabilityReq> = JsonMissing.of(),
        @JsonProperty("post_conversation_settings")
        @ExcludeMissing
        postConversationSettings: JsonField<PostConversationSettings> = JsonMissing.of(),
        @JsonProperty("privacy_settings")
        @ExcludeMissing
        privacySettings: JsonField<PrivacySettings> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("telephony_settings")
        @ExcludeMissing
        telephonySettings: JsonField<TelephonySettings> = JsonMissing.of(),
        @JsonProperty("tool_ids")
        @ExcludeMissing
        toolIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        tools: JsonField<List<AssistantTool>> = JsonMissing.of(),
        @JsonProperty("transcription")
        @ExcludeMissing
        transcription: JsonField<TranscriptionSettings> = JsonMissing.of(),
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
        description,
        dynamicVariables,
        dynamicVariablesWebhookTimeoutMs,
        dynamicVariablesWebhookUrl,
        enabledFeatures,
        externalLlm,
        fallbackConfig,
        greeting,
        insightSettings,
        instructions,
        integrations,
        interruptionSettings,
        llmApiKeyRef,
        mcpServers,
        messagingSettings,
        model,
        name,
        observabilitySettings,
        postConversationSettings,
        privacySettings,
        tags,
        telephonySettings,
        toolIds,
        tools,
        transcription,
        versionName,
        voiceSettings,
        widgetSettings,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Map of dynamic variables and their default values
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
    fun insightSettings(): Optional<InsightSettings> =
        insightSettings.getOptional("insight_settings")

    /**
     * System instructions for the assistant. These may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

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
     * ID of the model to use when `external_llm` is not set. You can use the
     * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models) to
     * see available models. If `external_llm` is provided, the assistant uses `external_llm`
     * instead of this field. If neither `model` nor `external_llm` is provided, Telnyx applies the
     * default model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observabilitySettings(): Optional<ObservabilityReq> =
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
     * IDs of shared tools to attach to the assistant. New integrations should prefer `tool_ids`
     * over inline `tools`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolIds(): Optional<List<String>> = toolIds.getOptional("tool_ids")

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
     * Returns the raw JSON value of [insightSettings].
     *
     * Unlike [insightSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insight_settings")
    @ExcludeMissing
    fun _insightSettings(): JsonField<InsightSettings> = insightSettings

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

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
    fun _observabilitySettings(): JsonField<ObservabilityReq> = observabilitySettings

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
     * Returns the raw JSON value of [toolIds].
     *
     * Unlike [toolIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_ids") @ExcludeMissing fun _toolIds(): JsonField<List<String>> = toolIds

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

        /** Returns a mutable builder for constructing an instance of [UpdateAssistant]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateAssistant]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        private var dynamicVariablesWebhookTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var dynamicVariablesWebhookUrl: JsonField<String> = JsonMissing.of()
        private var enabledFeatures: JsonField<MutableList<EnabledFeatures>>? = null
        private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
        private var fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of()
        private var greeting: JsonField<String> = JsonMissing.of()
        private var insightSettings: JsonField<InsightSettings> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var integrations: JsonField<MutableList<Integration>>? = null
        private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var mcpServers: JsonField<MutableList<McpServer>>? = null
        private var messagingSettings: JsonField<MessagingSettings> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var observabilitySettings: JsonField<ObservabilityReq> = JsonMissing.of()
        private var postConversationSettings: JsonField<PostConversationSettings> = JsonMissing.of()
        private var privacySettings: JsonField<PrivacySettings> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var telephonySettings: JsonField<TelephonySettings> = JsonMissing.of()
        private var toolIds: JsonField<MutableList<String>>? = null
        private var tools: JsonField<MutableList<AssistantTool>>? = null
        private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
        private var versionName: JsonField<String> = JsonMissing.of()
        private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
        private var widgetSettings: JsonField<WidgetSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateAssistant: UpdateAssistant) = apply {
            description = updateAssistant.description
            dynamicVariables = updateAssistant.dynamicVariables
            dynamicVariablesWebhookTimeoutMs = updateAssistant.dynamicVariablesWebhookTimeoutMs
            dynamicVariablesWebhookUrl = updateAssistant.dynamicVariablesWebhookUrl
            enabledFeatures = updateAssistant.enabledFeatures.map { it.toMutableList() }
            externalLlm = updateAssistant.externalLlm
            fallbackConfig = updateAssistant.fallbackConfig
            greeting = updateAssistant.greeting
            insightSettings = updateAssistant.insightSettings
            instructions = updateAssistant.instructions
            integrations = updateAssistant.integrations.map { it.toMutableList() }
            interruptionSettings = updateAssistant.interruptionSettings
            llmApiKeyRef = updateAssistant.llmApiKeyRef
            mcpServers = updateAssistant.mcpServers.map { it.toMutableList() }
            messagingSettings = updateAssistant.messagingSettings
            model = updateAssistant.model
            name = updateAssistant.name
            observabilitySettings = updateAssistant.observabilitySettings
            postConversationSettings = updateAssistant.postConversationSettings
            privacySettings = updateAssistant.privacySettings
            tags = updateAssistant.tags.map { it.toMutableList() }
            telephonySettings = updateAssistant.telephonySettings
            toolIds = updateAssistant.toolIds.map { it.toMutableList() }
            tools = updateAssistant.tools.map { it.toMutableList() }
            transcription = updateAssistant.transcription
            versionName = updateAssistant.versionName
            voiceSettings = updateAssistant.voiceSettings
            widgetSettings = updateAssistant.widgetSettings
            additionalProperties = updateAssistant.additionalProperties.toMutableMap()
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

        /** Map of dynamic variables and their default values */
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

        /**
         * ID of the model to use when `external_llm` is not set. You can use the
         * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models)
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

        fun observabilitySettings(observabilitySettings: ObservabilityReq) =
            observabilitySettings(JsonField.of(observabilitySettings))

        /**
         * Sets [Builder.observabilitySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observabilitySettings] with a well-typed
         * [ObservabilityReq] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun observabilitySettings(observabilitySettings: JsonField<ObservabilityReq>) = apply {
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
         * IDs of shared tools to attach to the assistant. New integrations should prefer `tool_ids`
         * over inline `tools`.
         */
        fun toolIds(toolIds: List<String>) = toolIds(JsonField.of(toolIds))

        /**
         * Sets [Builder.toolIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [UpdateAssistant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateAssistant =
            UpdateAssistant(
                description,
                dynamicVariables,
                dynamicVariablesWebhookTimeoutMs,
                dynamicVariablesWebhookUrl,
                (enabledFeatures ?: JsonMissing.of()).map { it.toImmutable() },
                externalLlm,
                fallbackConfig,
                greeting,
                insightSettings,
                instructions,
                (integrations ?: JsonMissing.of()).map { it.toImmutable() },
                interruptionSettings,
                llmApiKeyRef,
                (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                messagingSettings,
                model,
                name,
                observabilitySettings,
                postConversationSettings,
                privacySettings,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                telephonySettings,
                (toolIds ?: JsonMissing.of()).map { it.toImmutable() },
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                transcription,
                versionName,
                voiceSettings,
                widgetSettings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateAssistant = apply {
        if (validated) {
            return@apply
        }

        description()
        dynamicVariables().ifPresent { it.validate() }
        dynamicVariablesWebhookTimeoutMs()
        dynamicVariablesWebhookUrl()
        enabledFeatures().ifPresent { it.forEach { it.validate() } }
        externalLlm().ifPresent { it.validate() }
        fallbackConfig().ifPresent { it.validate() }
        greeting()
        insightSettings().ifPresent { it.validate() }
        instructions()
        integrations().ifPresent { it.forEach { it.validate() } }
        interruptionSettings().ifPresent { it.validate() }
        llmApiKeyRef()
        mcpServers().ifPresent { it.forEach { it.validate() } }
        messagingSettings().ifPresent { it.validate() }
        model()
        name()
        observabilitySettings().ifPresent { it.validate() }
        postConversationSettings().ifPresent { it.validate() }
        privacySettings().ifPresent { it.validate() }
        tags()
        telephonySettings().ifPresent { it.validate() }
        toolIds()
        tools().ifPresent { it.forEach { it.validate() } }
        transcription().ifPresent { it.validate() }
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dynamicVariablesWebhookTimeoutMs.asKnown().isPresent) 1 else 0) +
            (if (dynamicVariablesWebhookUrl.asKnown().isPresent) 1 else 0) +
            (enabledFeatures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
            (fallbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (greeting.asKnown().isPresent) 1 else 0) +
            (insightSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (integrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (mcpServers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (messagingSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (observabilitySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (postConversationSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (privacySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (telephonySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (toolIds.asKnown().getOrNull()?.size ?: 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (transcription.asKnown().getOrNull()?.validity() ?: 0) +
            (if (versionName.asKnown().isPresent) 1 else 0) +
            (voiceSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (widgetSettings.asKnown().getOrNull()?.validity() ?: 0)

    /** Map of dynamic variables and their default values */
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
        private val enable: JsonField<Boolean>,
        private val startSpeakingPlan: JsonField<StartSpeakingPlan>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enable") @ExcludeMissing enable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_speaking_plan")
            @ExcludeMissing
            startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of(),
        ) : this(enable, startSpeakingPlan, mutableMapOf())

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

            private var enable: JsonField<Boolean> = JsonMissing.of()
            private var startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interruptionSettings: InterruptionSettings) = apply {
                enable = interruptionSettings.enable
                startSpeakingPlan = interruptionSettings.startSpeakingPlan
                additionalProperties = interruptionSettings.additionalProperties.toMutableMap()
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
                InterruptionSettings(enable, startSpeakingPlan, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): InterruptionSettings = apply {
            if (validated) {
                return@apply
            }

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
                enable == other.enable &&
                startSpeakingPlan == other.startSpeakingPlan &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(enable, startSpeakingPlan, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterruptionSettings{enable=$enable, startSpeakingPlan=$startSpeakingPlan, additionalProperties=$additionalProperties}"
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

        return other is UpdateAssistant &&
            description == other.description &&
            dynamicVariables == other.dynamicVariables &&
            dynamicVariablesWebhookTimeoutMs == other.dynamicVariablesWebhookTimeoutMs &&
            dynamicVariablesWebhookUrl == other.dynamicVariablesWebhookUrl &&
            enabledFeatures == other.enabledFeatures &&
            externalLlm == other.externalLlm &&
            fallbackConfig == other.fallbackConfig &&
            greeting == other.greeting &&
            insightSettings == other.insightSettings &&
            instructions == other.instructions &&
            integrations == other.integrations &&
            interruptionSettings == other.interruptionSettings &&
            llmApiKeyRef == other.llmApiKeyRef &&
            mcpServers == other.mcpServers &&
            messagingSettings == other.messagingSettings &&
            model == other.model &&
            name == other.name &&
            observabilitySettings == other.observabilitySettings &&
            postConversationSettings == other.postConversationSettings &&
            privacySettings == other.privacySettings &&
            tags == other.tags &&
            telephonySettings == other.telephonySettings &&
            toolIds == other.toolIds &&
            tools == other.tools &&
            transcription == other.transcription &&
            versionName == other.versionName &&
            voiceSettings == other.voiceSettings &&
            widgetSettings == other.widgetSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            dynamicVariables,
            dynamicVariablesWebhookTimeoutMs,
            dynamicVariablesWebhookUrl,
            enabledFeatures,
            externalLlm,
            fallbackConfig,
            greeting,
            insightSettings,
            instructions,
            integrations,
            interruptionSettings,
            llmApiKeyRef,
            mcpServers,
            messagingSettings,
            model,
            name,
            observabilitySettings,
            postConversationSettings,
            privacySettings,
            tags,
            telephonySettings,
            toolIds,
            tools,
            transcription,
            versionName,
            voiceSettings,
            widgetSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateAssistant{description=$description, dynamicVariables=$dynamicVariables, dynamicVariablesWebhookTimeoutMs=$dynamicVariablesWebhookTimeoutMs, dynamicVariablesWebhookUrl=$dynamicVariablesWebhookUrl, enabledFeatures=$enabledFeatures, externalLlm=$externalLlm, fallbackConfig=$fallbackConfig, greeting=$greeting, insightSettings=$insightSettings, instructions=$instructions, integrations=$integrations, interruptionSettings=$interruptionSettings, llmApiKeyRef=$llmApiKeyRef, mcpServers=$mcpServers, messagingSettings=$messagingSettings, model=$model, name=$name, observabilitySettings=$observabilitySettings, postConversationSettings=$postConversationSettings, privacySettings=$privacySettings, tags=$tags, telephonySettings=$telephonySettings, toolIds=$toolIds, tools=$tools, transcription=$transcription, versionName=$versionName, voiceSettings=$voiceSettings, widgetSettings=$widgetSettings, additionalProperties=$additionalProperties}"
}
