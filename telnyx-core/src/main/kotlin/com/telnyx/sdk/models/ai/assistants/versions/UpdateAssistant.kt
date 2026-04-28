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
    private val dynamicVariablesWebhookUrl: JsonField<String>,
    private val enabledFeatures: JsonField<List<EnabledFeatures>>,
    private val externalLlm: JsonField<ExternalLlm>,
    private val fallbackConfig: JsonField<FallbackConfig>,
    private val greeting: JsonField<String>,
    private val insightSettings: JsonField<InsightSettings>,
    private val instructions: JsonField<String>,
    private val llmApiKeyRef: JsonField<String>,
    private val messagingSettings: JsonField<MessagingSettings>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val observabilitySettings: JsonField<ObservabilityReq>,
    private val postConversationSettings: JsonField<PostConversationSettings>,
    private val privacySettings: JsonField<PrivacySettings>,
    private val telephonySettings: JsonField<TelephonySettings>,
    private val toolIds: JsonField<List<String>>,
    private val tools: JsonField<List<AssistantTool>>,
    private val transcription: JsonField<TranscriptionSettings>,
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
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("voice_settings")
        @ExcludeMissing
        voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        @JsonProperty("widget_settings")
        @ExcludeMissing
        widgetSettings: JsonField<WidgetSettings> = JsonMissing.of(),
    ) : this(
        description,
        dynamicVariables,
        dynamicVariablesWebhookUrl,
        enabledFeatures,
        externalLlm,
        fallbackConfig,
        greeting,
        insightSettings,
        instructions,
        llmApiKeyRef,
        messagingSettings,
        model,
        name,
        observabilitySettings,
        postConversationSettings,
        privacySettings,
        telephonySettings,
        toolIds,
        tools,
        transcription,
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
     * If the dynamic_variables_webhook_url is set for the assistant, we will send a request at the
     * start of the conversation. See our
     * [guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables) for
     * more information.
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
     * This is only needed when using third-party inference providers. The `identifier` for an
     * integration secret
     * [/v2/integration_secrets](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
     * that refers to your LLM provider's API key. Warning: Free plans are unlikely to work with
     * this integration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingSettings(): Optional<MessagingSettings> =
        messagingSettings.getOptional("messaging_settings")

    /**
     * ID of the model to use. You can use the
     * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models) to
     * see all of your available models,
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telephonySettings(): Optional<TelephonySettings> =
        telephonySettings.getOptional("telephony_settings")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolIds(): Optional<List<String>> = toolIds.getOptional("tool_ids")

    /**
     * The tools that the assistant can use. These may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
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
     * Returns the raw JSON value of [llmApiKeyRef].
     *
     * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_api_key_ref")
    @ExcludeMissing
    fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

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
        private var dynamicVariablesWebhookUrl: JsonField<String> = JsonMissing.of()
        private var enabledFeatures: JsonField<MutableList<EnabledFeatures>>? = null
        private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
        private var fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of()
        private var greeting: JsonField<String> = JsonMissing.of()
        private var insightSettings: JsonField<InsightSettings> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var messagingSettings: JsonField<MessagingSettings> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var observabilitySettings: JsonField<ObservabilityReq> = JsonMissing.of()
        private var postConversationSettings: JsonField<PostConversationSettings> = JsonMissing.of()
        private var privacySettings: JsonField<PrivacySettings> = JsonMissing.of()
        private var telephonySettings: JsonField<TelephonySettings> = JsonMissing.of()
        private var toolIds: JsonField<MutableList<String>>? = null
        private var tools: JsonField<MutableList<AssistantTool>>? = null
        private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
        private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
        private var widgetSettings: JsonField<WidgetSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateAssistant: UpdateAssistant) = apply {
            description = updateAssistant.description
            dynamicVariables = updateAssistant.dynamicVariables
            dynamicVariablesWebhookUrl = updateAssistant.dynamicVariablesWebhookUrl
            enabledFeatures = updateAssistant.enabledFeatures.map { it.toMutableList() }
            externalLlm = updateAssistant.externalLlm
            fallbackConfig = updateAssistant.fallbackConfig
            greeting = updateAssistant.greeting
            insightSettings = updateAssistant.insightSettings
            instructions = updateAssistant.instructions
            llmApiKeyRef = updateAssistant.llmApiKeyRef
            messagingSettings = updateAssistant.messagingSettings
            model = updateAssistant.model
            name = updateAssistant.name
            observabilitySettings = updateAssistant.observabilitySettings
            postConversationSettings = updateAssistant.postConversationSettings
            privacySettings = updateAssistant.privacySettings
            telephonySettings = updateAssistant.telephonySettings
            toolIds = updateAssistant.toolIds.map { it.toMutableList() }
            tools = updateAssistant.tools.map { it.toMutableList() }
            transcription = updateAssistant.transcription
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
         * If the dynamic_variables_webhook_url is set for the assistant, we will send a request at
         * the start of the conversation. See our
         * [guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables) for
         * more information.
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
         * This is only needed when using third-party inference providers. The `identifier` for an
         * integration secret
         * [/v2/integration_secrets](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
         * that refers to your LLM provider's API key. Warning: Free plans are unlikely to work with
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
         * ID of the model to use. You can use the
         * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models)
         * to see all of your available models,
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
         * The tools that the assistant can use. These may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
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
         *     .inviteConfig(inviteConfig)
         *     .build()
         * ```
         */
        fun addInviteTool(inviteConfig: AssistantTool.Invite.InviteConfig) =
            addTool(AssistantTool.Invite.builder().inviteConfig(inviteConfig).build())

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
                dynamicVariablesWebhookUrl,
                (enabledFeatures ?: JsonMissing.of()).map { it.toImmutable() },
                externalLlm,
                fallbackConfig,
                greeting,
                insightSettings,
                instructions,
                llmApiKeyRef,
                messagingSettings,
                model,
                name,
                observabilitySettings,
                postConversationSettings,
                privacySettings,
                telephonySettings,
                (toolIds ?: JsonMissing.of()).map { it.toImmutable() },
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                transcription,
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
        dynamicVariablesWebhookUrl()
        enabledFeatures().ifPresent { it.forEach { it.validate() } }
        externalLlm().ifPresent { it.validate() }
        fallbackConfig().ifPresent { it.validate() }
        greeting()
        insightSettings().ifPresent { it.validate() }
        instructions()
        llmApiKeyRef()
        messagingSettings().ifPresent { it.validate() }
        model()
        name()
        observabilitySettings().ifPresent { it.validate() }
        postConversationSettings().ifPresent { it.validate() }
        privacySettings().ifPresent { it.validate() }
        telephonySettings().ifPresent { it.validate() }
        toolIds()
        tools().ifPresent { it.forEach { it.validate() } }
        transcription().ifPresent { it.validate() }
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
            (if (dynamicVariablesWebhookUrl.asKnown().isPresent) 1 else 0) +
            (enabledFeatures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
            (fallbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (greeting.asKnown().isPresent) 1 else 0) +
            (insightSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (messagingSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (observabilitySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (postConversationSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (privacySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (telephonySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (toolIds.asKnown().getOrNull()?.size ?: 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (transcription.asKnown().getOrNull()?.validity() ?: 0) +
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
         * When enabled, Telnyx forwards the assistant's dynamic variables to the external LLM
         * endpoint. Defaults to false. The chat completion request includes a top-level
         * `extra_metadata` object when dynamic variables are available. For example:
         * `{"extra_metadata":{"customer_name":"Jane","account_id":"acct_789","telnyx_agent_target":"+13125550100","telnyx_end_user_target":"+13125550123"}}`.
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
             * When enabled, Telnyx forwards the assistant's dynamic variables to the external LLM
             * endpoint. Defaults to false. The chat completion request includes a top-level
             * `extra_metadata` object when dynamic variables are available. For example:
             * `{"extra_metadata":{"customer_name":"Jane","account_id":"acct_789","telnyx_agent_target":"+13125550100","telnyx_end_user_target":"+13125550123"}}`.
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
             * When enabled, Telnyx forwards the assistant's dynamic variables to the external LLM
             * endpoint. Defaults to false. The chat completion request includes a top-level
             * `extra_metadata` object when dynamic variables are available. For example:
             * `{"extra_metadata":{"customer_name":"Jane","account_id":"acct_789","telnyx_agent_target":"+13125550100","telnyx_end_user_target":"+13125550123"}}`.
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
                 * When enabled, Telnyx forwards the assistant's dynamic variables to the external
                 * LLM endpoint. Defaults to false. The chat completion request includes a top-level
                 * `extra_metadata` object when dynamic variables are available. For example:
                 * `{"extra_metadata":{"customer_name":"Jane","account_id":"acct_789","telnyx_agent_target":"+13125550100","telnyx_end_user_target":"+13125550123"}}`.
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
            dynamicVariablesWebhookUrl == other.dynamicVariablesWebhookUrl &&
            enabledFeatures == other.enabledFeatures &&
            externalLlm == other.externalLlm &&
            fallbackConfig == other.fallbackConfig &&
            greeting == other.greeting &&
            insightSettings == other.insightSettings &&
            instructions == other.instructions &&
            llmApiKeyRef == other.llmApiKeyRef &&
            messagingSettings == other.messagingSettings &&
            model == other.model &&
            name == other.name &&
            observabilitySettings == other.observabilitySettings &&
            postConversationSettings == other.postConversationSettings &&
            privacySettings == other.privacySettings &&
            telephonySettings == other.telephonySettings &&
            toolIds == other.toolIds &&
            tools == other.tools &&
            transcription == other.transcription &&
            voiceSettings == other.voiceSettings &&
            widgetSettings == other.widgetSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            dynamicVariables,
            dynamicVariablesWebhookUrl,
            enabledFeatures,
            externalLlm,
            fallbackConfig,
            greeting,
            insightSettings,
            instructions,
            llmApiKeyRef,
            messagingSettings,
            model,
            name,
            observabilitySettings,
            postConversationSettings,
            privacySettings,
            telephonySettings,
            toolIds,
            tools,
            transcription,
            voiceSettings,
            widgetSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateAssistant{description=$description, dynamicVariables=$dynamicVariables, dynamicVariablesWebhookUrl=$dynamicVariablesWebhookUrl, enabledFeatures=$enabledFeatures, externalLlm=$externalLlm, fallbackConfig=$fallbackConfig, greeting=$greeting, insightSettings=$insightSettings, instructions=$instructions, llmApiKeyRef=$llmApiKeyRef, messagingSettings=$messagingSettings, model=$model, name=$name, observabilitySettings=$observabilitySettings, postConversationSettings=$postConversationSettings, privacySettings=$privacySettings, telephonySettings=$telephonySettings, toolIds=$toolIds, tools=$tools, transcription=$transcription, voiceSettings=$voiceSettings, widgetSettings=$widgetSettings, additionalProperties=$additionalProperties}"
}
