// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ai.assistants.versions.UpdateAssistant
import com.telnyx.sdk.models.ai.chat.BucketIds
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an AI Assistant's attributes. */
class AssistantUpdateParams
private constructor(
    private val assistantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Map of dynamic variables and their default values
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariables(): Optional<UpdateAssistant.DynamicVariables> = body.dynamicVariables()

    /**
     * If the dynamic_variables_webhook_url is set for the assistant, we will send a request at the
     * start of the conversation. See our
     * [guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables) for
     * more information.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariablesWebhookUrl(): Optional<String> = body.dynamicVariablesWebhookUrl()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledFeatures(): Optional<List<EnabledFeatures>> = body.enabledFeatures()

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
    fun greeting(): Optional<String> = body.greeting()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insightSettings(): Optional<InsightSettings> = body.insightSettings()

    /**
     * System instructions for the assistant. These may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

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
    fun llmApiKeyRef(): Optional<String> = body.llmApiKeyRef()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingSettings(): Optional<MessagingSettings> = body.messagingSettings()

    /**
     * ID of the model to use. You can use the
     * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models) to
     * see all of your available models,
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privacySettings(): Optional<PrivacySettings> = body.privacySettings()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telephonySettings(): Optional<TelephonySettings> = body.telephonySettings()

    /**
     * The tools that the assistant can use. These may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<AssistantTool>> = body.tools()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcription(): Optional<TranscriptionSettings> = body.transcription()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettings(): Optional<VoiceSettings> = body.voiceSettings()

    /**
     * Configuration settings for the assistant's web widget.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun widgetSettings(): Optional<WidgetSettings> = body.widgetSettings()

    /**
     * Indicates whether the assistant should be promoted to the main version. Defaults to true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promoteToMain(): Optional<Boolean> = body.promoteToMain()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [dynamicVariables].
     *
     * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dynamicVariables(): JsonField<UpdateAssistant.DynamicVariables> = body._dynamicVariables()

    /**
     * Returns the raw JSON value of [dynamicVariablesWebhookUrl].
     *
     * Unlike [dynamicVariablesWebhookUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _dynamicVariablesWebhookUrl(): JsonField<String> = body._dynamicVariablesWebhookUrl()

    /**
     * Returns the raw JSON value of [enabledFeatures].
     *
     * Unlike [enabledFeatures], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabledFeatures(): JsonField<List<EnabledFeatures>> = body._enabledFeatures()

    /**
     * Returns the raw JSON value of [greeting].
     *
     * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _greeting(): JsonField<String> = body._greeting()

    /**
     * Returns the raw JSON value of [insightSettings].
     *
     * Unlike [insightSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _insightSettings(): JsonField<InsightSettings> = body._insightSettings()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [llmApiKeyRef].
     *
     * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmApiKeyRef(): JsonField<String> = body._llmApiKeyRef()

    /**
     * Returns the raw JSON value of [messagingSettings].
     *
     * Unlike [messagingSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messagingSettings(): JsonField<MessagingSettings> = body._messagingSettings()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [privacySettings].
     *
     * Unlike [privacySettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _privacySettings(): JsonField<PrivacySettings> = body._privacySettings()

    /**
     * Returns the raw JSON value of [telephonySettings].
     *
     * Unlike [telephonySettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _telephonySettings(): JsonField<TelephonySettings> = body._telephonySettings()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<AssistantTool>> = body._tools()

    /**
     * Returns the raw JSON value of [transcription].
     *
     * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transcription(): JsonField<TranscriptionSettings> = body._transcription()

    /**
     * Returns the raw JSON value of [voiceSettings].
     *
     * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceSettings(): JsonField<VoiceSettings> = body._voiceSettings()

    /**
     * Returns the raw JSON value of [widgetSettings].
     *
     * Unlike [widgetSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _widgetSettings(): JsonField<WidgetSettings> = body._widgetSettings()

    /**
     * Returns the raw JSON value of [promoteToMain].
     *
     * Unlike [promoteToMain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _promoteToMain(): JsonField<Boolean> = body._promoteToMain()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AssistantUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AssistantUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssistantUpdateParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assistantUpdateParams: AssistantUpdateParams) = apply {
            assistantId = assistantUpdateParams.assistantId
            body = assistantUpdateParams.body.toBuilder()
            additionalHeaders = assistantUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = assistantUpdateParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [dynamicVariables]
         * - [dynamicVariablesWebhookUrl]
         * - [enabledFeatures]
         * - [greeting]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Map of dynamic variables and their default values */
        fun dynamicVariables(dynamicVariables: UpdateAssistant.DynamicVariables) = apply {
            body.dynamicVariables(dynamicVariables)
        }

        /**
         * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariables] with a well-typed
         * [UpdateAssistant.DynamicVariables] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun dynamicVariables(dynamicVariables: JsonField<UpdateAssistant.DynamicVariables>) =
            apply {
                body.dynamicVariables(dynamicVariables)
            }

        /**
         * If the dynamic_variables_webhook_url is set for the assistant, we will send a request at
         * the start of the conversation. See our
         * [guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables) for
         * more information.
         */
        fun dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl: String) = apply {
            body.dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl)
        }

        /**
         * Sets [Builder.dynamicVariablesWebhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariablesWebhookUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl: JsonField<String>) = apply {
            body.dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl)
        }

        fun enabledFeatures(enabledFeatures: List<EnabledFeatures>) = apply {
            body.enabledFeatures(enabledFeatures)
        }

        /**
         * Sets [Builder.enabledFeatures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledFeatures] with a well-typed
         * `List<EnabledFeatures>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun enabledFeatures(enabledFeatures: JsonField<List<EnabledFeatures>>) = apply {
            body.enabledFeatures(enabledFeatures)
        }

        /**
         * Adds a single [EnabledFeatures] to [enabledFeatures].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledFeature(enabledFeature: EnabledFeatures) = apply {
            body.addEnabledFeature(enabledFeature)
        }

        /**
         * Text that the assistant will use to start the conversation. This may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
         * Use an empty string to have the assistant wait for the user to speak first. Use the
         * special value `<assistant-speaks-first-with-model-generated-message>` to have the
         * assistant generate the greeting based on the system instructions.
         */
        fun greeting(greeting: String) = apply { body.greeting(greeting) }

        /**
         * Sets [Builder.greeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.greeting] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun greeting(greeting: JsonField<String>) = apply { body.greeting(greeting) }

        fun insightSettings(insightSettings: InsightSettings) = apply {
            body.insightSettings(insightSettings)
        }

        /**
         * Sets [Builder.insightSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insightSettings] with a well-typed [InsightSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun insightSettings(insightSettings: JsonField<InsightSettings>) = apply {
            body.insightSettings(insightSettings)
        }

        /**
         * System instructions for the assistant. These may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
         */
        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        /**
         * This is only needed when using third-party inference providers. The `identifier` for an
         * integration secret
         * [/v2/integration_secrets](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
         * that refers to your LLM provider's API key. Warning: Free plans are unlikely to work with
         * this integration.
         */
        fun llmApiKeyRef(llmApiKeyRef: String) = apply { body.llmApiKeyRef(llmApiKeyRef) }

        /**
         * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
            body.llmApiKeyRef(llmApiKeyRef)
        }

        fun messagingSettings(messagingSettings: MessagingSettings) = apply {
            body.messagingSettings(messagingSettings)
        }

        /**
         * Sets [Builder.messagingSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingSettings] with a well-typed [MessagingSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messagingSettings(messagingSettings: JsonField<MessagingSettings>) = apply {
            body.messagingSettings(messagingSettings)
        }

        /**
         * ID of the model to use. You can use the
         * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models)
         * to see all of your available models,
         */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun privacySettings(privacySettings: PrivacySettings) = apply {
            body.privacySettings(privacySettings)
        }

        /**
         * Sets [Builder.privacySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacySettings] with a well-typed [PrivacySettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun privacySettings(privacySettings: JsonField<PrivacySettings>) = apply {
            body.privacySettings(privacySettings)
        }

        fun telephonySettings(telephonySettings: TelephonySettings) = apply {
            body.telephonySettings(telephonySettings)
        }

        /**
         * Sets [Builder.telephonySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telephonySettings] with a well-typed [TelephonySettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun telephonySettings(telephonySettings: JsonField<TelephonySettings>) = apply {
            body.telephonySettings(telephonySettings)
        }

        /**
         * The tools that the assistant can use. These may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
         */
        fun tools(tools: List<AssistantTool>) = apply { body.tools(tools) }

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<AssistantTool>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tools(tools: JsonField<List<AssistantTool>>) = apply { body.tools(tools) }

        /**
         * Adds a single [AssistantTool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: AssistantTool) = apply { body.addTool(tool) }

        /** Alias for calling [addTool] with `AssistantTool.ofWebhook(webhook)`. */
        fun addTool(webhook: InferenceEmbeddingWebhookToolParams) = apply { body.addTool(webhook) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * InferenceEmbeddingWebhookToolParams.builder()
         *     .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
         *     .webhook(webhook)
         *     .build()
         * ```
         */
        fun addWebhookTool(webhook: InferenceEmbeddingWebhookToolParams.Webhook) = apply {
            body.addWebhookTool(webhook)
        }

        /** Alias for calling [addTool] with `AssistantTool.ofRetrieval(retrieval)`. */
        fun addTool(retrieval: RetrievalTool) = apply { body.addTool(retrieval) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * RetrievalTool.builder()
         *     .type(RetrievalTool.Type.RETRIEVAL)
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: BucketIds) = apply { body.addRetrievalTool(retrieval) }

        /** Alias for calling [addTool] with `AssistantTool.ofHandoff(handoff)`. */
        fun addTool(handoff: AssistantTool.HandoffTool) = apply { body.addTool(handoff) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.HandoffTool.builder()
         *     .handoff(handoff)
         *     .build()
         * ```
         */
        fun addHandoffTool(handoff: AssistantTool.HandoffTool.Handoff) = apply {
            body.addHandoffTool(handoff)
        }

        /** Alias for calling [addTool] with `AssistantTool.ofHangup(hangup)`. */
        fun addTool(hangup: HangupTool) = apply { body.addTool(hangup) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * HangupTool.builder()
         *     .type(HangupTool.Type.HANGUP)
         *     .hangup(hangup)
         *     .build()
         * ```
         */
        fun addHangupTool(hangup: HangupToolParams) = apply { body.addHangupTool(hangup) }

        /** Alias for calling [addTool] with `AssistantTool.ofTransfer(transfer)`. */
        fun addTool(transfer: AssistantTool.Transfer) = apply { body.addTool(transfer) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.Transfer.builder()
         *     .transfer(transfer)
         *     .build()
         * ```
         */
        fun addTransferTool(transfer: AssistantTool.Transfer.TransferConfig) = apply {
            body.addTransferTool(transfer)
        }

        /** Alias for calling [addTool] with `AssistantTool.ofRefer(refer)`. */
        fun addTool(refer: AssistantTool.SipReferTool) = apply { body.addTool(refer) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.SipReferTool.builder()
         *     .refer(refer)
         *     .build()
         * ```
         */
        fun addReferTool(refer: AssistantTool.SipReferTool.Refer) = apply {
            body.addReferTool(refer)
        }

        /** Alias for calling [addTool] with `AssistantTool.ofSendDtmf(sendDtmf)`. */
        fun addTool(sendDtmf: AssistantTool.DtmfTool) = apply { body.addTool(sendDtmf) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.DtmfTool.builder()
         *     .sendDtmf(sendDtmf)
         *     .build()
         * ```
         */
        fun addSendDtmfTool(sendDtmf: AssistantTool.DtmfTool.SendDtmf) = apply {
            body.addSendDtmfTool(sendDtmf)
        }

        /** Alias for calling [addTool] with `AssistantTool.ofSendMessage(sendMessage)`. */
        fun addTool(sendMessage: AssistantTool.SendMessage) = apply { body.addTool(sendMessage) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.SendMessage.builder()
         *     .sendMessage(sendMessage)
         *     .build()
         * ```
         */
        fun addSendMessageTool(sendMessage: AssistantTool.SendMessage.SendMessageConfig) = apply {
            body.addSendMessageTool(sendMessage)
        }

        /** Alias for calling [addTool] with `AssistantTool.ofSkipTurn(skipTurn)`. */
        fun addTool(skipTurn: AssistantTool.SkipTurn) = apply { body.addTool(skipTurn) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * AssistantTool.SkipTurn.builder()
         *     .skipTurn(skipTurn)
         *     .build()
         * ```
         */
        fun addSkipTurnTool(skipTurn: AssistantTool.SkipTurn.SkipTurnConfig) = apply {
            body.addSkipTurnTool(skipTurn)
        }

        fun transcription(transcription: TranscriptionSettings) = apply {
            body.transcription(transcription)
        }

        /**
         * Sets [Builder.transcription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcription] with a well-typed [TranscriptionSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcription(transcription: JsonField<TranscriptionSettings>) = apply {
            body.transcription(transcription)
        }

        fun voiceSettings(voiceSettings: VoiceSettings) = apply {
            body.voiceSettings(voiceSettings)
        }

        /**
         * Sets [Builder.voiceSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
            body.voiceSettings(voiceSettings)
        }

        /** Configuration settings for the assistant's web widget. */
        fun widgetSettings(widgetSettings: WidgetSettings) = apply {
            body.widgetSettings(widgetSettings)
        }

        /**
         * Sets [Builder.widgetSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widgetSettings] with a well-typed [WidgetSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun widgetSettings(widgetSettings: JsonField<WidgetSettings>) = apply {
            body.widgetSettings(widgetSettings)
        }

        /**
         * Indicates whether the assistant should be promoted to the main version. Defaults to true.
         */
        fun promoteToMain(promoteToMain: Boolean) = apply { body.promoteToMain(promoteToMain) }

        /**
         * Sets [Builder.promoteToMain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promoteToMain] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promoteToMain(promoteToMain: JsonField<Boolean>) = apply {
            body.promoteToMain(promoteToMain)
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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [AssistantUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AssistantUpdateParams =
            AssistantUpdateParams(
                assistantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val dynamicVariables: JsonField<UpdateAssistant.DynamicVariables>,
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
        private val widgetSettings: JsonField<WidgetSettings>,
        private val promoteToMain: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dynamic_variables")
            @ExcludeMissing
            dynamicVariables: JsonField<UpdateAssistant.DynamicVariables> = JsonMissing.of(),
            @JsonProperty("dynamic_variables_webhook_url")
            @ExcludeMissing
            dynamicVariablesWebhookUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled_features")
            @ExcludeMissing
            enabledFeatures: JsonField<List<EnabledFeatures>> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("widget_settings")
            @ExcludeMissing
            widgetSettings: JsonField<WidgetSettings> = JsonMissing.of(),
            @JsonProperty("promote_to_main")
            @ExcludeMissing
            promoteToMain: JsonField<Boolean> = JsonMissing.of(),
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
            widgetSettings,
            promoteToMain,
            mutableMapOf(),
        )

        fun toUpdateAssistant(): UpdateAssistant =
            UpdateAssistant.builder()
                .description(description)
                .dynamicVariables(dynamicVariables)
                .dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl)
                .enabledFeatures(enabledFeatures)
                .greeting(greeting)
                .insightSettings(insightSettings)
                .instructions(instructions)
                .llmApiKeyRef(llmApiKeyRef)
                .messagingSettings(messagingSettings)
                .model(model)
                .name(name)
                .privacySettings(privacySettings)
                .telephonySettings(telephonySettings)
                .tools(tools)
                .transcription(transcription)
                .voiceSettings(voiceSettings)
                .widgetSettings(widgetSettings)
                .build()

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
        fun dynamicVariables(): Optional<UpdateAssistant.DynamicVariables> =
            dynamicVariables.getOptional("dynamic_variables")

        /**
         * If the dynamic_variables_webhook_url is set for the assistant, we will send a request at
         * the start of the conversation. See our
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
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
         * Use an empty string to have the assistant wait for the user to speak first. Use the
         * special value `<assistant-speaks-first-with-model-generated-message>` to have the
         * assistant generate the greeting based on the system instructions.
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
         * [Get models API](https://developers.telnyx.com/api-reference/chat/get-available-models)
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
         * Configuration settings for the assistant's web widget.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun widgetSettings(): Optional<WidgetSettings> =
            widgetSettings.getOptional("widget_settings")

        /**
         * Indicates whether the assistant should be promoted to the main version. Defaults to true.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun promoteToMain(): Optional<Boolean> = promoteToMain.getOptional("promote_to_main")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [dynamicVariables].
         *
         * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        fun _dynamicVariables(): JsonField<UpdateAssistant.DynamicVariables> = dynamicVariables

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
         * Unlike [enabledFeatures], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [insightSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("insight_settings")
        @ExcludeMissing
        fun _insightSettings(): JsonField<InsightSettings> = insightSettings

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

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
         * Unlike [privacySettings], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transcription")
        @ExcludeMissing
        fun _transcription(): JsonField<TranscriptionSettings> = transcription

        /**
         * Returns the raw JSON value of [voiceSettings].
         *
         * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voice_settings")
        @ExcludeMissing
        fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

        /**
         * Returns the raw JSON value of [widgetSettings].
         *
         * Unlike [widgetSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("widget_settings")
        @ExcludeMissing
        fun _widgetSettings(): JsonField<WidgetSettings> = widgetSettings

        /**
         * Returns the raw JSON value of [promoteToMain].
         *
         * Unlike [promoteToMain], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("promote_to_main")
        @ExcludeMissing
        fun _promoteToMain(): JsonField<Boolean> = promoteToMain

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

            private var description: JsonField<String> = JsonMissing.of()
            private var dynamicVariables: JsonField<UpdateAssistant.DynamicVariables> =
                JsonMissing.of()
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
            private var widgetSettings: JsonField<WidgetSettings> = JsonMissing.of()
            private var promoteToMain: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                dynamicVariables = body.dynamicVariables
                dynamicVariablesWebhookUrl = body.dynamicVariablesWebhookUrl
                enabledFeatures = body.enabledFeatures.map { it.toMutableList() }
                greeting = body.greeting
                insightSettings = body.insightSettings
                instructions = body.instructions
                llmApiKeyRef = body.llmApiKeyRef
                messagingSettings = body.messagingSettings
                model = body.model
                name = body.name
                privacySettings = body.privacySettings
                telephonySettings = body.telephonySettings
                tools = body.tools.map { it.toMutableList() }
                transcription = body.transcription
                voiceSettings = body.voiceSettings
                widgetSettings = body.widgetSettings
                promoteToMain = body.promoteToMain
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** Map of dynamic variables and their default values */
            fun dynamicVariables(dynamicVariables: UpdateAssistant.DynamicVariables) =
                dynamicVariables(JsonField.of(dynamicVariables))

            /**
             * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dynamicVariables] with a well-typed
             * [UpdateAssistant.DynamicVariables] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun dynamicVariables(dynamicVariables: JsonField<UpdateAssistant.DynamicVariables>) =
                apply {
                    this.dynamicVariables = dynamicVariables
                }

            /**
             * If the dynamic_variables_webhook_url is set for the assistant, we will send a request
             * at the start of the conversation. See our
             * [guide](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
             * for more information.
             */
            fun dynamicVariablesWebhookUrl(dynamicVariablesWebhookUrl: String) =
                dynamicVariablesWebhookUrl(JsonField.of(dynamicVariablesWebhookUrl))

            /**
             * Sets [Builder.dynamicVariablesWebhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dynamicVariablesWebhookUrl] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * `List<EnabledFeatures>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * Text that the assistant will use to start the conversation. This may be templated
             * with
             * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
             * Use an empty string to have the assistant wait for the user to speak first. Use the
             * special value `<assistant-speaks-first-with-model-generated-message>` to have the
             * assistant generate the greeting based on the system instructions.
             */
            fun greeting(greeting: String) = greeting(JsonField.of(greeting))

            /**
             * Sets [Builder.greeting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greeting] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun greeting(greeting: JsonField<String>) = apply { this.greeting = greeting }

            fun insightSettings(insightSettings: InsightSettings) =
                insightSettings(JsonField.of(insightSettings))

            /**
             * Sets [Builder.insightSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.insightSettings] with a well-typed [InsightSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            /**
             * This is only needed when using third-party inference providers. The `identifier` for
             * an integration secret
             * [/v2/integration_secrets](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
             * that refers to your LLM provider's API key. Warning: Free plans are unlikely to work
             * with this integration.
             */
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

            fun messagingSettings(messagingSettings: MessagingSettings) =
                messagingSettings(JsonField.of(messagingSettings))

            /**
             * Sets [Builder.messagingSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingSettings] with a well-typed
             * [MessagingSettings] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun privacySettings(privacySettings: PrivacySettings) =
                privacySettings(JsonField.of(privacySettings))

            /**
             * Sets [Builder.privacySettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privacySettings] with a well-typed [PrivacySettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun privacySettings(privacySettings: JsonField<PrivacySettings>) = apply {
                this.privacySettings = privacySettings
            }

            fun telephonySettings(telephonySettings: TelephonySettings) =
                telephonySettings(JsonField.of(telephonySettings))

            /**
             * Sets [Builder.telephonySettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telephonySettings] with a well-typed
             * [TelephonySettings] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
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
                addTool(HangupTool.builder().type(HangupTool.Type.HANGUP).hangup(hangup).build())

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

            fun transcription(transcription: TranscriptionSettings) =
                transcription(JsonField.of(transcription))

            /**
             * Sets [Builder.transcription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcription] with a well-typed
             * [TranscriptionSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcription(transcription: JsonField<TranscriptionSettings>) = apply {
                this.transcription = transcription
            }

            fun voiceSettings(voiceSettings: VoiceSettings) =
                voiceSettings(JsonField.of(voiceSettings))

            /**
             * Sets [Builder.voiceSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.widgetSettings] with a well-typed [WidgetSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun widgetSettings(widgetSettings: JsonField<WidgetSettings>) = apply {
                this.widgetSettings = widgetSettings
            }

            /**
             * Indicates whether the assistant should be promoted to the main version. Defaults to
             * true.
             */
            fun promoteToMain(promoteToMain: Boolean) = promoteToMain(JsonField.of(promoteToMain))

            /**
             * Sets [Builder.promoteToMain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promoteToMain] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promoteToMain(promoteToMain: JsonField<Boolean>) = apply {
                this.promoteToMain = promoteToMain
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
                    widgetSettings,
                    promoteToMain,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
            widgetSettings().ifPresent { it.validate() }
            promoteToMain()
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
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (widgetSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (promoteToMain.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
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
                widgetSettings == other.widgetSettings &&
                promoteToMain == other.promoteToMain &&
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
                widgetSettings,
                promoteToMain,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, dynamicVariables=$dynamicVariables, dynamicVariablesWebhookUrl=$dynamicVariablesWebhookUrl, enabledFeatures=$enabledFeatures, greeting=$greeting, insightSettings=$insightSettings, instructions=$instructions, llmApiKeyRef=$llmApiKeyRef, messagingSettings=$messagingSettings, model=$model, name=$name, privacySettings=$privacySettings, telephonySettings=$telephonySettings, tools=$tools, transcription=$transcription, voiceSettings=$voiceSettings, widgetSettings=$widgetSettings, promoteToMain=$promoteToMain, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantUpdateParams &&
            assistantId == other.assistantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(assistantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AssistantUpdateParams{assistantId=$assistantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
