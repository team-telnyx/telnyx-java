// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
    private val description: JsonField<String>,
    private val dynamicVariables: JsonField<DynamicVariables>,
    private val dynamicVariablesWebhookUrl: JsonField<String>,
    private val enabledFeatures: JsonField<List<EnabledFeatures>>,
    private val greeting: JsonField<String>,
    private val importMetadata: JsonField<ImportMetadata>,
    private val insightSettings: JsonField<InsightSettings>,
    private val llmApiKeyRef: JsonField<String>,
    private val messagingSettings: JsonField<MessagingSettings>,
    private val privacySettings: JsonField<PrivacySettings>,
    private val telephonySettings: JsonField<TelephonySettings>,
    private val tools: JsonField<List<AssistantTool>>,
    private val transcription: JsonField<TranscriptionSettings>,
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
        @JsonProperty("import_metadata")
        @ExcludeMissing
        importMetadata: JsonField<ImportMetadata> = JsonMissing.of(),
        @JsonProperty("insight_settings")
        @ExcludeMissing
        insightSettings: JsonField<InsightSettings> = JsonMissing.of(),
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_settings")
        @ExcludeMissing
        messagingSettings: JsonField<MessagingSettings> = JsonMissing.of(),
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
        @JsonProperty("widget_settings")
        @ExcludeMissing
        widgetSettings: JsonField<WidgetSettings> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        instructions,
        model,
        name,
        description,
        dynamicVariables,
        dynamicVariablesWebhookUrl,
        enabledFeatures,
        greeting,
        importMetadata,
        insightSettings,
        llmApiKeyRef,
        messagingSettings,
        privacySettings,
        telephonySettings,
        tools,
        transcription,
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
     * ID of the model to use. You can use the
     * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models) to
     * see all of your available models,
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
    fun importMetadata(): Optional<ImportMetadata> = importMetadata.getOptional("import_metadata")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insightSettings(): Optional<InsightSettings> =
        insightSettings.getOptional("insight_settings")

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
        private var description: JsonField<String> = JsonMissing.of()
        private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        private var dynamicVariablesWebhookUrl: JsonField<String> = JsonMissing.of()
        private var enabledFeatures: JsonField<MutableList<EnabledFeatures>>? = null
        private var greeting: JsonField<String> = JsonMissing.of()
        private var importMetadata: JsonField<ImportMetadata> = JsonMissing.of()
        private var insightSettings: JsonField<InsightSettings> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var messagingSettings: JsonField<MessagingSettings> = JsonMissing.of()
        private var privacySettings: JsonField<PrivacySettings> = JsonMissing.of()
        private var telephonySettings: JsonField<TelephonySettings> = JsonMissing.of()
        private var tools: JsonField<MutableList<AssistantTool>>? = null
        private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
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
            description = inferenceEmbedding.description
            dynamicVariables = inferenceEmbedding.dynamicVariables
            dynamicVariablesWebhookUrl = inferenceEmbedding.dynamicVariablesWebhookUrl
            enabledFeatures = inferenceEmbedding.enabledFeatures.map { it.toMutableList() }
            greeting = inferenceEmbedding.greeting
            importMetadata = inferenceEmbedding.importMetadata
            insightSettings = inferenceEmbedding.insightSettings
            llmApiKeyRef = inferenceEmbedding.llmApiKeyRef
            messagingSettings = inferenceEmbedding.messagingSettings
            privacySettings = inferenceEmbedding.privacySettings
            telephonySettings = inferenceEmbedding.telephonySettings
            tools = inferenceEmbedding.tools.map { it.toMutableList() }
            transcription = inferenceEmbedding.transcription
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
        fun addSendMessageTool(sendMessage: AssistantTool.SendMessage.InnerSendMessage) =
            addTool(AssistantTool.SendMessage.builder().sendMessage(sendMessage).build())

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
                description,
                dynamicVariables,
                dynamicVariablesWebhookUrl,
                (enabledFeatures ?: JsonMissing.of()).map { it.toImmutable() },
                greeting,
                importMetadata,
                insightSettings,
                llmApiKeyRef,
                messagingSettings,
                privacySettings,
                telephonySettings,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                transcription,
                voiceSettings,
                widgetSettings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferenceEmbedding = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        instructions()
        model()
        name()
        description()
        dynamicVariables().ifPresent { it.validate() }
        dynamicVariablesWebhookUrl()
        enabledFeatures().ifPresent { it.forEach { it.validate() } }
        greeting()
        importMetadata().ifPresent { it.validate() }
        insightSettings().ifPresent { it.validate() }
        llmApiKeyRef()
        messagingSettings().ifPresent { it.validate() }
        privacySettings().ifPresent { it.validate() }
        telephonySettings().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dynamicVariablesWebhookUrl.asKnown().isPresent) 1 else 0) +
            (enabledFeatures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (greeting.asKnown().isPresent) 1 else 0) +
            (importMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (insightSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (messagingSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (privacySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (telephonySettings.asKnown().getOrNull()?.validity() ?: 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (transcription.asKnown().getOrNull()?.validity() ?: 0) +
            (voiceSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (widgetSettings.asKnown().getOrNull()?.validity() ?: 0)

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

    /** Configuration settings for the assistant's web widget. */
    class WidgetSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentThinkingText: JsonField<String>,
        private val audioVisualizerConfig: JsonField<AudioVisualizerConfig>,
        private val defaultState: JsonField<DefaultState>,
        private val giveFeedbackUrl: JsonField<String>,
        private val logoIconUrl: JsonField<String>,
        private val position: JsonField<Position>,
        private val reportIssueUrl: JsonField<String>,
        private val speakToInterruptText: JsonField<String>,
        private val startCallText: JsonField<String>,
        private val theme: JsonField<Theme>,
        private val viewHistoryUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_thinking_text")
            @ExcludeMissing
            agentThinkingText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audio_visualizer_config")
            @ExcludeMissing
            audioVisualizerConfig: JsonField<AudioVisualizerConfig> = JsonMissing.of(),
            @JsonProperty("default_state")
            @ExcludeMissing
            defaultState: JsonField<DefaultState> = JsonMissing.of(),
            @JsonProperty("give_feedback_url")
            @ExcludeMissing
            giveFeedbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logo_icon_url")
            @ExcludeMissing
            logoIconUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("position")
            @ExcludeMissing
            position: JsonField<Position> = JsonMissing.of(),
            @JsonProperty("report_issue_url")
            @ExcludeMissing
            reportIssueUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("speak_to_interrupt_text")
            @ExcludeMissing
            speakToInterruptText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_call_text")
            @ExcludeMissing
            startCallText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
            @JsonProperty("view_history_url")
            @ExcludeMissing
            viewHistoryUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            agentThinkingText,
            audioVisualizerConfig,
            defaultState,
            giveFeedbackUrl,
            logoIconUrl,
            position,
            reportIssueUrl,
            speakToInterruptText,
            startCallText,
            theme,
            viewHistoryUrl,
            mutableMapOf(),
        )

        /**
         * Text displayed while the agent is processing.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentThinkingText(): Optional<String> =
            agentThinkingText.getOptional("agent_thinking_text")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioVisualizerConfig(): Optional<AudioVisualizerConfig> =
            audioVisualizerConfig.getOptional("audio_visualizer_config")

        /**
         * The default state of the widget.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultState(): Optional<DefaultState> = defaultState.getOptional("default_state")

        /**
         * URL for users to give feedback.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun giveFeedbackUrl(): Optional<String> = giveFeedbackUrl.getOptional("give_feedback_url")

        /**
         * URL to a custom logo icon for the widget.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logoIconUrl(): Optional<String> = logoIconUrl.getOptional("logo_icon_url")

        /**
         * The positioning style for the widget.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun position(): Optional<Position> = position.getOptional("position")

        /**
         * URL for users to report issues.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportIssueUrl(): Optional<String> = reportIssueUrl.getOptional("report_issue_url")

        /**
         * Text prompting users to speak to interrupt.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speakToInterruptText(): Optional<String> =
            speakToInterruptText.getOptional("speak_to_interrupt_text")

        /**
         * Custom text displayed on the start call button.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startCallText(): Optional<String> = startCallText.getOptional("start_call_text")

        /**
         * The visual theme for the widget.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun theme(): Optional<Theme> = theme.getOptional("theme")

        /**
         * URL to view conversation history.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun viewHistoryUrl(): Optional<String> = viewHistoryUrl.getOptional("view_history_url")

        /**
         * Returns the raw JSON value of [agentThinkingText].
         *
         * Unlike [agentThinkingText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agent_thinking_text")
        @ExcludeMissing
        fun _agentThinkingText(): JsonField<String> = agentThinkingText

        /**
         * Returns the raw JSON value of [audioVisualizerConfig].
         *
         * Unlike [audioVisualizerConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("audio_visualizer_config")
        @ExcludeMissing
        fun _audioVisualizerConfig(): JsonField<AudioVisualizerConfig> = audioVisualizerConfig

        /**
         * Returns the raw JSON value of [defaultState].
         *
         * Unlike [defaultState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_state")
        @ExcludeMissing
        fun _defaultState(): JsonField<DefaultState> = defaultState

        /**
         * Returns the raw JSON value of [giveFeedbackUrl].
         *
         * Unlike [giveFeedbackUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("give_feedback_url")
        @ExcludeMissing
        fun _giveFeedbackUrl(): JsonField<String> = giveFeedbackUrl

        /**
         * Returns the raw JSON value of [logoIconUrl].
         *
         * Unlike [logoIconUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logo_icon_url")
        @ExcludeMissing
        fun _logoIconUrl(): JsonField<String> = logoIconUrl

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Position> = position

        /**
         * Returns the raw JSON value of [reportIssueUrl].
         *
         * Unlike [reportIssueUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("report_issue_url")
        @ExcludeMissing
        fun _reportIssueUrl(): JsonField<String> = reportIssueUrl

        /**
         * Returns the raw JSON value of [speakToInterruptText].
         *
         * Unlike [speakToInterruptText], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("speak_to_interrupt_text")
        @ExcludeMissing
        fun _speakToInterruptText(): JsonField<String> = speakToInterruptText

        /**
         * Returns the raw JSON value of [startCallText].
         *
         * Unlike [startCallText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("start_call_text")
        @ExcludeMissing
        fun _startCallText(): JsonField<String> = startCallText

        /**
         * Returns the raw JSON value of [theme].
         *
         * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

        /**
         * Returns the raw JSON value of [viewHistoryUrl].
         *
         * Unlike [viewHistoryUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("view_history_url")
        @ExcludeMissing
        fun _viewHistoryUrl(): JsonField<String> = viewHistoryUrl

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

            /** Returns a mutable builder for constructing an instance of [WidgetSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WidgetSettings]. */
        class Builder internal constructor() {

            private var agentThinkingText: JsonField<String> = JsonMissing.of()
            private var audioVisualizerConfig: JsonField<AudioVisualizerConfig> = JsonMissing.of()
            private var defaultState: JsonField<DefaultState> = JsonMissing.of()
            private var giveFeedbackUrl: JsonField<String> = JsonMissing.of()
            private var logoIconUrl: JsonField<String> = JsonMissing.of()
            private var position: JsonField<Position> = JsonMissing.of()
            private var reportIssueUrl: JsonField<String> = JsonMissing.of()
            private var speakToInterruptText: JsonField<String> = JsonMissing.of()
            private var startCallText: JsonField<String> = JsonMissing.of()
            private var theme: JsonField<Theme> = JsonMissing.of()
            private var viewHistoryUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(widgetSettings: WidgetSettings) = apply {
                agentThinkingText = widgetSettings.agentThinkingText
                audioVisualizerConfig = widgetSettings.audioVisualizerConfig
                defaultState = widgetSettings.defaultState
                giveFeedbackUrl = widgetSettings.giveFeedbackUrl
                logoIconUrl = widgetSettings.logoIconUrl
                position = widgetSettings.position
                reportIssueUrl = widgetSettings.reportIssueUrl
                speakToInterruptText = widgetSettings.speakToInterruptText
                startCallText = widgetSettings.startCallText
                theme = widgetSettings.theme
                viewHistoryUrl = widgetSettings.viewHistoryUrl
                additionalProperties = widgetSettings.additionalProperties.toMutableMap()
            }

            /** Text displayed while the agent is processing. */
            fun agentThinkingText(agentThinkingText: String) =
                agentThinkingText(JsonField.of(agentThinkingText))

            /**
             * Sets [Builder.agentThinkingText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentThinkingText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentThinkingText(agentThinkingText: JsonField<String>) = apply {
                this.agentThinkingText = agentThinkingText
            }

            fun audioVisualizerConfig(audioVisualizerConfig: AudioVisualizerConfig) =
                audioVisualizerConfig(JsonField.of(audioVisualizerConfig))

            /**
             * Sets [Builder.audioVisualizerConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioVisualizerConfig] with a well-typed
             * [AudioVisualizerConfig] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun audioVisualizerConfig(audioVisualizerConfig: JsonField<AudioVisualizerConfig>) =
                apply {
                    this.audioVisualizerConfig = audioVisualizerConfig
                }

            /** The default state of the widget. */
            fun defaultState(defaultState: DefaultState) = defaultState(JsonField.of(defaultState))

            /**
             * Sets [Builder.defaultState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultState] with a well-typed [DefaultState] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultState(defaultState: JsonField<DefaultState>) = apply {
                this.defaultState = defaultState
            }

            /** URL for users to give feedback. */
            fun giveFeedbackUrl(giveFeedbackUrl: String?) =
                giveFeedbackUrl(JsonField.ofNullable(giveFeedbackUrl))

            /** Alias for calling [Builder.giveFeedbackUrl] with `giveFeedbackUrl.orElse(null)`. */
            fun giveFeedbackUrl(giveFeedbackUrl: Optional<String>) =
                giveFeedbackUrl(giveFeedbackUrl.getOrNull())

            /**
             * Sets [Builder.giveFeedbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.giveFeedbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun giveFeedbackUrl(giveFeedbackUrl: JsonField<String>) = apply {
                this.giveFeedbackUrl = giveFeedbackUrl
            }

            /** URL to a custom logo icon for the widget. */
            fun logoIconUrl(logoIconUrl: String?) = logoIconUrl(JsonField.ofNullable(logoIconUrl))

            /** Alias for calling [Builder.logoIconUrl] with `logoIconUrl.orElse(null)`. */
            fun logoIconUrl(logoIconUrl: Optional<String>) = logoIconUrl(logoIconUrl.getOrNull())

            /**
             * Sets [Builder.logoIconUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoIconUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoIconUrl(logoIconUrl: JsonField<String>) = apply {
                this.logoIconUrl = logoIconUrl
            }

            /** The positioning style for the widget. */
            fun position(position: Position) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [Position] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<Position>) = apply { this.position = position }

            /** URL for users to report issues. */
            fun reportIssueUrl(reportIssueUrl: String?) =
                reportIssueUrl(JsonField.ofNullable(reportIssueUrl))

            /** Alias for calling [Builder.reportIssueUrl] with `reportIssueUrl.orElse(null)`. */
            fun reportIssueUrl(reportIssueUrl: Optional<String>) =
                reportIssueUrl(reportIssueUrl.getOrNull())

            /**
             * Sets [Builder.reportIssueUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportIssueUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportIssueUrl(reportIssueUrl: JsonField<String>) = apply {
                this.reportIssueUrl = reportIssueUrl
            }

            /** Text prompting users to speak to interrupt. */
            fun speakToInterruptText(speakToInterruptText: String) =
                speakToInterruptText(JsonField.of(speakToInterruptText))

            /**
             * Sets [Builder.speakToInterruptText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speakToInterruptText] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun speakToInterruptText(speakToInterruptText: JsonField<String>) = apply {
                this.speakToInterruptText = speakToInterruptText
            }

            /** Custom text displayed on the start call button. */
            fun startCallText(startCallText: String) = startCallText(JsonField.of(startCallText))

            /**
             * Sets [Builder.startCallText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startCallText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startCallText(startCallText: JsonField<String>) = apply {
                this.startCallText = startCallText
            }

            /** The visual theme for the widget. */
            fun theme(theme: Theme) = theme(JsonField.of(theme))

            /**
             * Sets [Builder.theme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

            /** URL to view conversation history. */
            fun viewHistoryUrl(viewHistoryUrl: String?) =
                viewHistoryUrl(JsonField.ofNullable(viewHistoryUrl))

            /** Alias for calling [Builder.viewHistoryUrl] with `viewHistoryUrl.orElse(null)`. */
            fun viewHistoryUrl(viewHistoryUrl: Optional<String>) =
                viewHistoryUrl(viewHistoryUrl.getOrNull())

            /**
             * Sets [Builder.viewHistoryUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.viewHistoryUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun viewHistoryUrl(viewHistoryUrl: JsonField<String>) = apply {
                this.viewHistoryUrl = viewHistoryUrl
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
             * Returns an immutable instance of [WidgetSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WidgetSettings =
                WidgetSettings(
                    agentThinkingText,
                    audioVisualizerConfig,
                    defaultState,
                    giveFeedbackUrl,
                    logoIconUrl,
                    position,
                    reportIssueUrl,
                    speakToInterruptText,
                    startCallText,
                    theme,
                    viewHistoryUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): WidgetSettings = apply {
            if (validated) {
                return@apply
            }

            agentThinkingText()
            audioVisualizerConfig().ifPresent { it.validate() }
            defaultState().ifPresent { it.validate() }
            giveFeedbackUrl()
            logoIconUrl()
            position().ifPresent { it.validate() }
            reportIssueUrl()
            speakToInterruptText()
            startCallText()
            theme().ifPresent { it.validate() }
            viewHistoryUrl()
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
            (if (agentThinkingText.asKnown().isPresent) 1 else 0) +
                (audioVisualizerConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (defaultState.asKnown().getOrNull()?.validity() ?: 0) +
                (if (giveFeedbackUrl.asKnown().isPresent) 1 else 0) +
                (if (logoIconUrl.asKnown().isPresent) 1 else 0) +
                (position.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reportIssueUrl.asKnown().isPresent) 1 else 0) +
                (if (speakToInterruptText.asKnown().isPresent) 1 else 0) +
                (if (startCallText.asKnown().isPresent) 1 else 0) +
                (theme.asKnown().getOrNull()?.validity() ?: 0) +
                (if (viewHistoryUrl.asKnown().isPresent) 1 else 0)

        class AudioVisualizerConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val color: JsonField<Color>,
            private val preset: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("color") @ExcludeMissing color: JsonField<Color> = JsonMissing.of(),
                @JsonProperty("preset") @ExcludeMissing preset: JsonField<String> = JsonMissing.of(),
            ) : this(color, preset, mutableMapOf())

            /**
             * The color theme for the audio visualizer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun color(): Optional<Color> = color.getOptional("color")

            /**
             * The preset style for the audio visualizer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preset(): Optional<String> = preset.getOptional("preset")

            /**
             * Returns the raw JSON value of [color].
             *
             * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<Color> = color

            /**
             * Returns the raw JSON value of [preset].
             *
             * Unlike [preset], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("preset") @ExcludeMissing fun _preset(): JsonField<String> = preset

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
                 * [AudioVisualizerConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AudioVisualizerConfig]. */
            class Builder internal constructor() {

                private var color: JsonField<Color> = JsonMissing.of()
                private var preset: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(audioVisualizerConfig: AudioVisualizerConfig) = apply {
                    color = audioVisualizerConfig.color
                    preset = audioVisualizerConfig.preset
                    additionalProperties = audioVisualizerConfig.additionalProperties.toMutableMap()
                }

                /** The color theme for the audio visualizer. */
                fun color(color: Color) = color(JsonField.of(color))

                /**
                 * Sets [Builder.color] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.color] with a well-typed [Color] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun color(color: JsonField<Color>) = apply { this.color = color }

                /** The preset style for the audio visualizer. */
                fun preset(preset: String) = preset(JsonField.of(preset))

                /**
                 * Sets [Builder.preset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preset] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun preset(preset: JsonField<String>) = apply { this.preset = preset }

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
                 * Returns an immutable instance of [AudioVisualizerConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AudioVisualizerConfig =
                    AudioVisualizerConfig(color, preset, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): AudioVisualizerConfig = apply {
                if (validated) {
                    return@apply
                }

                color().ifPresent { it.validate() }
                preset()
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
                (color.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (preset.asKnown().isPresent) 1 else 0)

            /** The color theme for the audio visualizer. */
            class Color @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val VERDANT = of("verdant")

                    @JvmField val TWILIGHT = of("twilight")

                    @JvmField val BLOOM = of("bloom")

                    @JvmField val MYSTIC = of("mystic")

                    @JvmField val FLARE = of("flare")

                    @JvmField val GLACIER = of("glacier")

                    @JvmStatic fun of(value: String) = Color(JsonField.of(value))
                }

                /** An enum containing [Color]'s known values. */
                enum class Known {
                    VERDANT,
                    TWILIGHT,
                    BLOOM,
                    MYSTIC,
                    FLARE,
                    GLACIER,
                }

                /**
                 * An enum containing [Color]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Color] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    VERDANT,
                    TWILIGHT,
                    BLOOM,
                    MYSTIC,
                    FLARE,
                    GLACIER,
                    /**
                     * An enum member indicating that [Color] was instantiated with an unknown
                     * value.
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
                        VERDANT -> Value.VERDANT
                        TWILIGHT -> Value.TWILIGHT
                        BLOOM -> Value.BLOOM
                        MYSTIC -> Value.MYSTIC
                        FLARE -> Value.FLARE
                        GLACIER -> Value.GLACIER
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
                        VERDANT -> Known.VERDANT
                        TWILIGHT -> Known.TWILIGHT
                        BLOOM -> Known.BLOOM
                        MYSTIC -> Known.MYSTIC
                        FLARE -> Known.FLARE
                        GLACIER -> Known.GLACIER
                        else -> throw TelnyxInvalidDataException("Unknown Color: $value")
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

                fun validate(): Color = apply {
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

                    return other is Color && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AudioVisualizerConfig &&
                    color == other.color &&
                    preset == other.preset &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(color, preset, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AudioVisualizerConfig{color=$color, preset=$preset, additionalProperties=$additionalProperties}"
        }

        /** The default state of the widget. */
        class DefaultState @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val EXPANDED = of("expanded")

                @JvmField val COLLAPSED = of("collapsed")

                @JvmStatic fun of(value: String) = DefaultState(JsonField.of(value))
            }

            /** An enum containing [DefaultState]'s known values. */
            enum class Known {
                EXPANDED,
                COLLAPSED,
            }

            /**
             * An enum containing [DefaultState]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DefaultState] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXPANDED,
                COLLAPSED,
                /**
                 * An enum member indicating that [DefaultState] was instantiated with an unknown
                 * value.
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
                    EXPANDED -> Value.EXPANDED
                    COLLAPSED -> Value.COLLAPSED
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
                    EXPANDED -> Known.EXPANDED
                    COLLAPSED -> Known.COLLAPSED
                    else -> throw TelnyxInvalidDataException("Unknown DefaultState: $value")
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

            fun validate(): DefaultState = apply {
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

                return other is DefaultState && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The positioning style for the widget. */
        class Position @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val FIXED = of("fixed")

                @JvmField val STATIC = of("static")

                @JvmStatic fun of(value: String) = Position(JsonField.of(value))
            }

            /** An enum containing [Position]'s known values. */
            enum class Known {
                FIXED,
                STATIC,
            }

            /**
             * An enum containing [Position]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Position] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FIXED,
                STATIC,
                /**
                 * An enum member indicating that [Position] was instantiated with an unknown value.
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
                    FIXED -> Value.FIXED
                    STATIC -> Value.STATIC
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
                    FIXED -> Known.FIXED
                    STATIC -> Known.STATIC
                    else -> throw TelnyxInvalidDataException("Unknown Position: $value")
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

            fun validate(): Position = apply {
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

                return other is Position && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The visual theme for the widget. */
        class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val LIGHT = of("light")

                @JvmField val DARK = of("dark")

                @JvmStatic fun of(value: String) = Theme(JsonField.of(value))
            }

            /** An enum containing [Theme]'s known values. */
            enum class Known {
                LIGHT,
                DARK,
            }

            /**
             * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Theme] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LIGHT,
                DARK,
                /**
                 * An enum member indicating that [Theme] was instantiated with an unknown value.
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
                    LIGHT -> Value.LIGHT
                    DARK -> Value.DARK
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
                    LIGHT -> Known.LIGHT
                    DARK -> Known.DARK
                    else -> throw TelnyxInvalidDataException("Unknown Theme: $value")
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

            fun validate(): Theme = apply {
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

                return other is Theme && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WidgetSettings &&
                agentThinkingText == other.agentThinkingText &&
                audioVisualizerConfig == other.audioVisualizerConfig &&
                defaultState == other.defaultState &&
                giveFeedbackUrl == other.giveFeedbackUrl &&
                logoIconUrl == other.logoIconUrl &&
                position == other.position &&
                reportIssueUrl == other.reportIssueUrl &&
                speakToInterruptText == other.speakToInterruptText &&
                startCallText == other.startCallText &&
                theme == other.theme &&
                viewHistoryUrl == other.viewHistoryUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agentThinkingText,
                audioVisualizerConfig,
                defaultState,
                giveFeedbackUrl,
                logoIconUrl,
                position,
                reportIssueUrl,
                speakToInterruptText,
                startCallText,
                theme,
                viewHistoryUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WidgetSettings{agentThinkingText=$agentThinkingText, audioVisualizerConfig=$audioVisualizerConfig, defaultState=$defaultState, giveFeedbackUrl=$giveFeedbackUrl, logoIconUrl=$logoIconUrl, position=$position, reportIssueUrl=$reportIssueUrl, speakToInterruptText=$speakToInterruptText, startCallText=$startCallText, theme=$theme, viewHistoryUrl=$viewHistoryUrl, additionalProperties=$additionalProperties}"
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
            description == other.description &&
            dynamicVariables == other.dynamicVariables &&
            dynamicVariablesWebhookUrl == other.dynamicVariablesWebhookUrl &&
            enabledFeatures == other.enabledFeatures &&
            greeting == other.greeting &&
            importMetadata == other.importMetadata &&
            insightSettings == other.insightSettings &&
            llmApiKeyRef == other.llmApiKeyRef &&
            messagingSettings == other.messagingSettings &&
            privacySettings == other.privacySettings &&
            telephonySettings == other.telephonySettings &&
            tools == other.tools &&
            transcription == other.transcription &&
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
            description,
            dynamicVariables,
            dynamicVariablesWebhookUrl,
            enabledFeatures,
            greeting,
            importMetadata,
            insightSettings,
            llmApiKeyRef,
            messagingSettings,
            privacySettings,
            telephonySettings,
            tools,
            transcription,
            voiceSettings,
            widgetSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbedding{id=$id, createdAt=$createdAt, instructions=$instructions, model=$model, name=$name, description=$description, dynamicVariables=$dynamicVariables, dynamicVariablesWebhookUrl=$dynamicVariablesWebhookUrl, enabledFeatures=$enabledFeatures, greeting=$greeting, importMetadata=$importMetadata, insightSettings=$insightSettings, llmApiKeyRef=$llmApiKeyRef, messagingSettings=$messagingSettings, privacySettings=$privacySettings, telephonySettings=$telephonySettings, tools=$tools, transcription=$transcription, voiceSettings=$voiceSettings, widgetSettings=$widgetSettings, additionalProperties=$additionalProperties}"
}
