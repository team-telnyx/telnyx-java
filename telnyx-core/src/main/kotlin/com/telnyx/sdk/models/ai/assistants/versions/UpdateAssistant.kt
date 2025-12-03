// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.versions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ai.assistants.AssistantTool
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.HangupTool
import com.telnyx.sdk.models.ai.assistants.HangupToolParams
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingBucketIds
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingTransferToolParams
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.RetrievalTool
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.TransferTool
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.WebhookTool
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
    private val greeting: JsonField<String>,
    private val insightSettings: JsonField<InsightSettings>,
    private val instructions: JsonField<String>,
    private val llmApiKeyRef: JsonField<String>,
    private val messagingSettings: JsonField<MessagingSettings>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val privacySettings: JsonField<PrivacySettings>,
    private val telephonySettings: JsonField<TelephonySettings>,
    private val tools: JsonField<List<AssistantTool>>,
    private val transcription: JsonField<TranscriptionSettings>,
    private val voiceSettings: JsonField<VoiceSettings>,
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
        @JsonProperty("privacy_settings")
        @ExcludeMissing
        privacySettings: JsonField<PrivacySettings> = JsonMissing.of(),
        @JsonProperty("telephony_settings")
        @ExcludeMissing
        telephonySettings: JsonField<TelephonySettings> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        tools: JsonField<List<AssistantTool>> = JsonMissing.of(),
        @JsonProperty("transcription")
        @ExcludeMissing
        transcription: JsonField<TranscriptionSettings> = JsonMissing.of(),
        @JsonProperty("voice_settings")
        @ExcludeMissing
        voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
    ) : this(
        description,
        dynamicVariables,
        dynamicVariablesWebhookUrl,
        enabledFeatures,
        greeting,
        insightSettings,
        instructions,
        llmApiKeyRef,
        messagingSettings,
        model,
        name,
        privacySettings,
        telephonySettings,
        tools,
        transcription,
        voiceSettings,
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
     * Text that the assistant will use to start the conversation. This may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
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
     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
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
     * [Get models API](https://developers.telnyx.com/api/inference/inference-embedding/get-models-public-models-get)
     * to see all of your available models,
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
    fun privacySettings(): Optional<PrivacySettings> =
        privacySettings.getOptional("privacy_settings")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telephonySettings(): Optional<TelephonySettings> =
        telephonySettings.getOptional("telephony_settings")

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
        private var greeting: JsonField<String> = JsonMissing.of()
        private var insightSettings: JsonField<InsightSettings> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var messagingSettings: JsonField<MessagingSettings> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var privacySettings: JsonField<PrivacySettings> = JsonMissing.of()
        private var telephonySettings: JsonField<TelephonySettings> = JsonMissing.of()
        private var tools: JsonField<MutableList<AssistantTool>>? = null
        private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
        private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateAssistant: UpdateAssistant) = apply {
            description = updateAssistant.description
            dynamicVariables = updateAssistant.dynamicVariables
            dynamicVariablesWebhookUrl = updateAssistant.dynamicVariablesWebhookUrl
            enabledFeatures = updateAssistant.enabledFeatures.map { it.toMutableList() }
            greeting = updateAssistant.greeting
            insightSettings = updateAssistant.insightSettings
            instructions = updateAssistant.instructions
            llmApiKeyRef = updateAssistant.llmApiKeyRef
            messagingSettings = updateAssistant.messagingSettings
            model = updateAssistant.model
            name = updateAssistant.name
            privacySettings = updateAssistant.privacySettings
            telephonySettings = updateAssistant.telephonySettings
            tools = updateAssistant.tools.map { it.toMutableList() }
            transcription = updateAssistant.transcription
            voiceSettings = updateAssistant.voiceSettings
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

        /**
         * Text that the assistant will use to start the conversation. This may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
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
         * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
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
         * [Get models API](https://developers.telnyx.com/api/inference/inference-embedding/get-models-public-models-get)
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
        fun addTool(webhook: WebhookTool) = addTool(AssistantTool.ofWebhook(webhook))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * WebhookTool.builder()
         *     .type(WebhookTool.Type.WEBHOOK)
         *     .webhook(webhook)
         *     .build()
         * ```
         */
        fun addWebhookTool(webhook: InferenceEmbeddingWebhookToolParams) =
            addTool(WebhookTool.builder().type(WebhookTool.Type.WEBHOOK).webhook(webhook).build())

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
        fun addRetrievalTool(retrieval: InferenceEmbeddingBucketIds) =
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
        fun addTool(transfer: TransferTool) = addTool(AssistantTool.ofTransfer(transfer))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * TransferTool.builder()
         *     .type(TransferTool.Type.TRANSFER)
         *     .transfer(transfer)
         *     .build()
         * ```
         */
        fun addTransferTool(transfer: InferenceEmbeddingTransferToolParams) =
            addTool(
                TransferTool.builder().type(TransferTool.Type.TRANSFER).transfer(transfer).build()
            )

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
                greeting,
                insightSettings,
                instructions,
                llmApiKeyRef,
                messagingSettings,
                model,
                name,
                privacySettings,
                telephonySettings,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                transcription,
                voiceSettings,
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
        greeting()
        insightSettings().ifPresent { it.validate() }
        instructions()
        llmApiKeyRef()
        messagingSettings().ifPresent { it.validate() }
        model()
        name()
        privacySettings().ifPresent { it.validate() }
        telephonySettings().ifPresent { it.validate() }
        tools().ifPresent { it.forEach { it.validate() } }
        transcription().ifPresent { it.validate() }
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
            (if (greeting.asKnown().isPresent) 1 else 0) +
            (insightSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (messagingSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (privacySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (telephonySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (transcription.asKnown().getOrNull()?.validity() ?: 0) +
            (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateAssistant &&
            description == other.description &&
            dynamicVariables == other.dynamicVariables &&
            dynamicVariablesWebhookUrl == other.dynamicVariablesWebhookUrl &&
            enabledFeatures == other.enabledFeatures &&
            greeting == other.greeting &&
            insightSettings == other.insightSettings &&
            instructions == other.instructions &&
            llmApiKeyRef == other.llmApiKeyRef &&
            messagingSettings == other.messagingSettings &&
            model == other.model &&
            name == other.name &&
            privacySettings == other.privacySettings &&
            telephonySettings == other.telephonySettings &&
            tools == other.tools &&
            transcription == other.transcription &&
            voiceSettings == other.voiceSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            dynamicVariables,
            dynamicVariablesWebhookUrl,
            enabledFeatures,
            greeting,
            insightSettings,
            instructions,
            llmApiKeyRef,
            messagingSettings,
            model,
            name,
            privacySettings,
            telephonySettings,
            tools,
            transcription,
            voiceSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateAssistant{description=$description, dynamicVariables=$dynamicVariables, dynamicVariablesWebhookUrl=$dynamicVariablesWebhookUrl, enabledFeatures=$enabledFeatures, greeting=$greeting, insightSettings=$insightSettings, instructions=$instructions, llmApiKeyRef=$llmApiKeyRef, messagingSettings=$messagingSettings, model=$model, name=$name, privacySettings=$privacySettings, telephonySettings=$telephonySettings, tools=$tools, transcription=$transcription, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
}
