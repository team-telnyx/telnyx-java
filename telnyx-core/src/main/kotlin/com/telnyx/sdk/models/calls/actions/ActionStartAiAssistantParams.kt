// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.AzureVoiceSettings
import com.telnyx.sdk.models.ResembleVoiceSettings
import com.telnyx.sdk.models.RimeVoiceSettings
import com.telnyx.sdk.models.ai.assistants.HangupTool
import com.telnyx.sdk.models.ai.assistants.HangupToolParams
import com.telnyx.sdk.models.ai.assistants.TransferTool
import com.telnyx.sdk.models.ai.assistants.WebhookTool
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Start an AI assistant on the call.
 *
 * **Expected Webhooks:**
 * - `call.conversation.ended`
 * - `call.conversation_insights.generated`
 */
class ActionStartAiAssistantParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
     * configuration will be used as fallback for any omitted fields.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistant(): Optional<Assistant> = body.assistant()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Text that will be played when the assistant starts, if none then nothing will be played when
     * the assistant starts. The greeting can be text for any voice or SSML for
     * `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun greeting(): Optional<String> = body.greeting()

    /**
     * Settings for handling user interruptions during assistant speech
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptionSettings(): Optional<InterruptionSettings> = body.interruptionSettings()

    /**
     * A list of messages to seed the conversation history before the assistant starts. Follows the
     * same message format as the `ai_assistant_add_messages` command.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageHistory(): Optional<List<MessageHistory>> = body.messageHistory()

    /**
     * A list of participants to add to the conversation when it starts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<Participant>> = body.participants()

    /**
     * When `true`, a webhook is sent each time the conversation message history is updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendMessageHistoryUpdates(): Optional<Boolean> = body.sendMessageHistoryUpdates()

    /**
     * The settings associated with speech to text for the voice assistant. This is only relevant if
     * the assistant uses a text-to-text language model. Any assistant using a model with native
     * audio support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcription(): Optional<TranscriptionConfig> = body.transcription()

    /**
     * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS
     * voices.
     *
     *     **Supported Providers:**
     * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices, which
     *   provide more realistic, human-like speech, append `-Neural` to the `VoiceId` (e.g.,
     *   `AWS.Polly.Joanna-Neural`). Check the
     *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html) for
     *   compatibility.
     * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural,
     *   Azure.en-US-BrianMultilingualNeural, Azure.en-US-Ava:DragonHDLatestNeural. For a complete
     *   list of voices, go to
     *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
     * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g., `ElevenLabs.BaseModel.John`).
     *   The `ModelId` part is optional. To use ElevenLabs, you must provide your ElevenLabs API key
     *   as an integration secret under `"voice_settings": {"api_key_ref": "<secret_id>"}`. See
     *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     *   for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
     *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
     * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
     *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<String> = body.voice()

    /**
     * The settings associated with the voice selected
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettings(): Optional<VoiceSettings> = body.voiceSettings()

    /**
     * Returns the raw JSON value of [assistant].
     *
     * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assistant(): JsonField<Assistant> = body._assistant()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [greeting].
     *
     * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _greeting(): JsonField<String> = body._greeting()

    /**
     * Returns the raw JSON value of [interruptionSettings].
     *
     * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _interruptionSettings(): JsonField<InterruptionSettings> = body._interruptionSettings()

    /**
     * Returns the raw JSON value of [messageHistory].
     *
     * Unlike [messageHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageHistory(): JsonField<List<MessageHistory>> = body._messageHistory()

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _participants(): JsonField<List<Participant>> = body._participants()

    /**
     * Returns the raw JSON value of [sendMessageHistoryUpdates].
     *
     * Unlike [sendMessageHistoryUpdates], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _sendMessageHistoryUpdates(): JsonField<Boolean> = body._sendMessageHistoryUpdates()

    /**
     * Returns the raw JSON value of [transcription].
     *
     * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transcription(): JsonField<TranscriptionConfig> = body._transcription()

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voice(): JsonField<String> = body._voice()

    /**
     * Returns the raw JSON value of [voiceSettings].
     *
     * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceSettings(): JsonField<VoiceSettings> = body._voiceSettings()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionStartAiAssistantParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ActionStartAiAssistantParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartAiAssistantParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartAiAssistantParams: ActionStartAiAssistantParams) = apply {
            callControlId = actionStartAiAssistantParams.callControlId
            body = actionStartAiAssistantParams.body.toBuilder()
            additionalHeaders = actionStartAiAssistantParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionStartAiAssistantParams.additionalQueryParams.toBuilder()
        }

        fun callControlId(callControlId: String?) = apply { this.callControlId = callControlId }

        /** Alias for calling [Builder.callControlId] with `callControlId.orElse(null)`. */
        fun callControlId(callControlId: Optional<String>) =
            callControlId(callControlId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [assistant]
         * - [clientState]
         * - [commandId]
         * - [greeting]
         * - [interruptionSettings]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
         * configuration will be used as fallback for any omitted fields.
         */
        fun assistant(assistant: Assistant) = apply { body.assistant(assistant) }

        /**
         * Sets [Builder.assistant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistant] with a well-typed [Assistant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistant(assistant: JsonField<Assistant>) = apply { body.assistant(assistant) }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         */
        fun commandId(commandId: String) = apply { body.commandId(commandId) }

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { body.commandId(commandId) }

        /**
         * Text that will be played when the assistant starts, if none then nothing will be played
         * when the assistant starts. The greeting can be text for any voice or SSML for
         * `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
         */
        fun greeting(greeting: String) = apply { body.greeting(greeting) }

        /**
         * Sets [Builder.greeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.greeting] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun greeting(greeting: JsonField<String>) = apply { body.greeting(greeting) }

        /** Settings for handling user interruptions during assistant speech */
        fun interruptionSettings(interruptionSettings: InterruptionSettings) = apply {
            body.interruptionSettings(interruptionSettings)
        }

        /**
         * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptionSettings] with a well-typed
         * [InterruptionSettings] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun interruptionSettings(interruptionSettings: JsonField<InterruptionSettings>) = apply {
            body.interruptionSettings(interruptionSettings)
        }

        /**
         * A list of messages to seed the conversation history before the assistant starts. Follows
         * the same message format as the `ai_assistant_add_messages` command.
         */
        fun messageHistory(messageHistory: List<MessageHistory>) = apply {
            body.messageHistory(messageHistory)
        }

        /**
         * Sets [Builder.messageHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageHistory] with a well-typed `List<MessageHistory>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messageHistory(messageHistory: JsonField<List<MessageHistory>>) = apply {
            body.messageHistory(messageHistory)
        }

        /**
         * Adds a single [MessageHistory] to [Builder.messageHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessageHistory(messageHistory: MessageHistory) = apply {
            body.addMessageHistory(messageHistory)
        }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofUser(user)`. */
        fun addMessageHistory(user: MessageHistory.User) = apply { body.addMessageHistory(user) }

        /**
         * Alias for calling [addMessageHistory] with the following:
         * ```java
         * MessageHistory.User.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessageHistory(content: String) = apply { body.addUserMessageHistory(content) }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofAssistant(assistant)`. */
        fun addMessageHistory(assistant: MessageHistory.Assistant) = apply {
            body.addMessageHistory(assistant)
        }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofTool(tool)`. */
        fun addMessageHistory(tool: MessageHistory.Tool) = apply { body.addMessageHistory(tool) }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofSystem(system)`. */
        fun addMessageHistory(system: MessageHistory.System) = apply {
            body.addMessageHistory(system)
        }

        /**
         * Alias for calling [addMessageHistory] with the following:
         * ```java
         * MessageHistory.System.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessageHistory(content: String) = apply {
            body.addSystemMessageHistory(content)
        }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofDeveloper(developer)`. */
        fun addMessageHistory(developer: MessageHistory.Developer) = apply {
            body.addMessageHistory(developer)
        }

        /**
         * Alias for calling [addMessageHistory] with the following:
         * ```java
         * MessageHistory.Developer.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addDeveloperMessageHistory(content: String) = apply {
            body.addDeveloperMessageHistory(content)
        }

        /** A list of participants to add to the conversation when it starts. */
        fun participants(participants: List<Participant>) = apply {
            body.participants(participants)
        }

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<Participant>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun participants(participants: JsonField<List<Participant>>) = apply {
            body.participants(participants)
        }

        /**
         * Adds a single [Participant] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: Participant) = apply { body.addParticipant(participant) }

        /** When `true`, a webhook is sent each time the conversation message history is updated. */
        fun sendMessageHistoryUpdates(sendMessageHistoryUpdates: Boolean) = apply {
            body.sendMessageHistoryUpdates(sendMessageHistoryUpdates)
        }

        /**
         * Sets [Builder.sendMessageHistoryUpdates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendMessageHistoryUpdates] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sendMessageHistoryUpdates(sendMessageHistoryUpdates: JsonField<Boolean>) = apply {
            body.sendMessageHistoryUpdates(sendMessageHistoryUpdates)
        }

        /**
         * The settings associated with speech to text for the voice assistant. This is only
         * relevant if the assistant uses a text-to-text language model. Any assistant using a model
         * with native audio support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field.
         */
        fun transcription(transcription: TranscriptionConfig) = apply {
            body.transcription(transcription)
        }

        /**
         * Sets [Builder.transcription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcription] with a well-typed [TranscriptionConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcription(transcription: JsonField<TranscriptionConfig>) = apply {
            body.transcription(transcription)
        }

        /**
         * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and
         * AWS voices.
         *
         *     **Supported Providers:**
         * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices, which
         *   provide more realistic, human-like speech, append `-Neural` to the `VoiceId` (e.g.,
         *   `AWS.Polly.Joanna-Neural`). Check the
         *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html)
         *   for compatibility.
         * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural,
         *   Azure.en-US-BrianMultilingualNeural, Azure.en-US-Ava:DragonHDLatestNeural. For a
         *   complete list of voices, go to
         *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
         * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
         *   `ElevenLabs.BaseModel.John`). The `ModelId` part is optional. To use ElevenLabs, you
         *   must provide your ElevenLabs API key as an integration secret under `"voice_settings":
         *   {"api_key_ref": "<secret_id>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
         *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
         */
        fun voice(voice: String) = apply { body.voice(voice) }

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<String>) = apply { body.voice(voice) }

        /** The settings associated with the voice selected */
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

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofElevenlabs(elevenlabs)`. */
        fun voiceSettings(elevenlabs: ElevenLabsVoiceSettings) = apply {
            body.voiceSettings(elevenlabs)
        }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofTelnyx(telnyx)`. */
        fun voiceSettings(telnyx: TelnyxVoiceSettings) = apply { body.voiceSettings(telnyx) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofAws(aws)`. */
        fun voiceSettings(aws: AwsVoiceSettings) = apply { body.voiceSettings(aws) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofAzure(azure)`. */
        fun voiceSettings(azure: AzureVoiceSettings) = apply { body.voiceSettings(azure) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
        fun voiceSettings(rime: RimeVoiceSettings) = apply { body.voiceSettings(rime) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
        fun voiceSettings(resemble: ResembleVoiceSettings) = apply { body.voiceSettings(resemble) }

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
         * Returns an immutable instance of [ActionStartAiAssistantParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionStartAiAssistantParams =
            ActionStartAiAssistantParams(
                callControlId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> callControlId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assistant: JsonField<Assistant>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val greeting: JsonField<String>,
        private val interruptionSettings: JsonField<InterruptionSettings>,
        private val messageHistory: JsonField<List<MessageHistory>>,
        private val participants: JsonField<List<Participant>>,
        private val sendMessageHistoryUpdates: JsonField<Boolean>,
        private val transcription: JsonField<TranscriptionConfig>,
        private val voice: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assistant")
            @ExcludeMissing
            assistant: JsonField<Assistant> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interruption_settings")
            @ExcludeMissing
            interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of(),
            @JsonProperty("message_history")
            @ExcludeMissing
            messageHistory: JsonField<List<MessageHistory>> = JsonMissing.of(),
            @JsonProperty("participants")
            @ExcludeMissing
            participants: JsonField<List<Participant>> = JsonMissing.of(),
            @JsonProperty("send_message_history_updates")
            @ExcludeMissing
            sendMessageHistoryUpdates: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<TranscriptionConfig> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            assistant,
            clientState,
            commandId,
            greeting,
            interruptionSettings,
            messageHistory,
            participants,
            sendMessageHistoryUpdates,
            transcription,
            voice,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
         * configuration will be used as fallback for any omitted fields.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assistant(): Optional<Assistant> = assistant.getOptional("assistant")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Text that will be played when the assistant starts, if none then nothing will be played
         * when the assistant starts. The greeting can be text for any voice or SSML for
         * `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greeting(): Optional<String> = greeting.getOptional("greeting")

        /**
         * Settings for handling user interruptions during assistant speech
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptionSettings(): Optional<InterruptionSettings> =
            interruptionSettings.getOptional("interruption_settings")

        /**
         * A list of messages to seed the conversation history before the assistant starts. Follows
         * the same message format as the `ai_assistant_add_messages` command.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageHistory(): Optional<List<MessageHistory>> =
            messageHistory.getOptional("message_history")

        /**
         * A list of participants to add to the conversation when it starts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun participants(): Optional<List<Participant>> = participants.getOptional("participants")

        /**
         * When `true`, a webhook is sent each time the conversation message history is updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendMessageHistoryUpdates(): Optional<Boolean> =
            sendMessageHistoryUpdates.getOptional("send_message_history_updates")

        /**
         * The settings associated with speech to text for the voice assistant. This is only
         * relevant if the assistant uses a text-to-text language model. Any assistant using a model
         * with native audio support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcription(): Optional<TranscriptionConfig> =
            transcription.getOptional("transcription")

        /**
         * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and
         * AWS voices.
         *
         *     **Supported Providers:**
         * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices, which
         *   provide more realistic, human-like speech, append `-Neural` to the `VoiceId` (e.g.,
         *   `AWS.Polly.Joanna-Neural`). Check the
         *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html)
         *   for compatibility.
         * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural,
         *   Azure.en-US-BrianMultilingualNeural, Azure.en-US-Ava:DragonHDLatestNeural. For a
         *   complete list of voices, go to
         *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
         * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
         *   `ElevenLabs.BaseModel.John`). The `ModelId` part is optional. To use ElevenLabs, you
         *   must provide your ElevenLabs API key as an integration secret under `"voice_settings":
         *   {"api_key_ref": "<secret_id>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
         *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * The settings associated with the voice selected
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

        /**
         * Returns the raw JSON value of [assistant].
         *
         * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assistant")
        @ExcludeMissing
        fun _assistant(): JsonField<Assistant> = assistant

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [greeting].
         *
         * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<String> = greeting

        /**
         * Returns the raw JSON value of [interruptionSettings].
         *
         * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interruption_settings")
        @ExcludeMissing
        fun _interruptionSettings(): JsonField<InterruptionSettings> = interruptionSettings

        /**
         * Returns the raw JSON value of [messageHistory].
         *
         * Unlike [messageHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("message_history")
        @ExcludeMissing
        fun _messageHistory(): JsonField<List<MessageHistory>> = messageHistory

        /**
         * Returns the raw JSON value of [participants].
         *
         * Unlike [participants], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("participants")
        @ExcludeMissing
        fun _participants(): JsonField<List<Participant>> = participants

        /**
         * Returns the raw JSON value of [sendMessageHistoryUpdates].
         *
         * Unlike [sendMessageHistoryUpdates], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("send_message_history_updates")
        @ExcludeMissing
        fun _sendMessageHistoryUpdates(): JsonField<Boolean> = sendMessageHistoryUpdates

        /**
         * Returns the raw JSON value of [transcription].
         *
         * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transcription")
        @ExcludeMissing
        fun _transcription(): JsonField<TranscriptionConfig> = transcription

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

        /**
         * Returns the raw JSON value of [voiceSettings].
         *
         * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var assistant: JsonField<Assistant> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
            private var messageHistory: JsonField<MutableList<MessageHistory>>? = null
            private var participants: JsonField<MutableList<Participant>>? = null
            private var sendMessageHistoryUpdates: JsonField<Boolean> = JsonMissing.of()
            private var transcription: JsonField<TranscriptionConfig> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assistant = body.assistant
                clientState = body.clientState
                commandId = body.commandId
                greeting = body.greeting
                interruptionSettings = body.interruptionSettings
                messageHistory = body.messageHistory.map { it.toMutableList() }
                participants = body.participants.map { it.toMutableList() }
                sendMessageHistoryUpdates = body.sendMessageHistoryUpdates
                transcription = body.transcription
                voice = body.voice
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * AI Assistant configuration. All fields except `id` are optional — the assistant's
             * stored configuration will be used as fallback for any omitted fields.
             */
            fun assistant(assistant: Assistant) = assistant(JsonField.of(assistant))

            /**
             * Sets [Builder.assistant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assistant] with a well-typed [Assistant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assistant(assistant: JsonField<Assistant>) = apply { this.assistant = assistant }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * Use this field to avoid duplicate commands. Telnyx will ignore any command with the
             * same `command_id` for the same `call_control_id`.
             */
            fun commandId(commandId: String) = commandId(JsonField.of(commandId))

            /**
             * Sets [Builder.commandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

            /**
             * Text that will be played when the assistant starts, if none then nothing will be
             * played when the assistant starts. The greeting can be text for any voice or SSML for
             * `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
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

            /** Settings for handling user interruptions during assistant speech */
            fun interruptionSettings(interruptionSettings: InterruptionSettings) =
                interruptionSettings(JsonField.of(interruptionSettings))

            /**
             * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptionSettings] with a well-typed
             * [InterruptionSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun interruptionSettings(interruptionSettings: JsonField<InterruptionSettings>) =
                apply {
                    this.interruptionSettings = interruptionSettings
                }

            /**
             * A list of messages to seed the conversation history before the assistant starts.
             * Follows the same message format as the `ai_assistant_add_messages` command.
             */
            fun messageHistory(messageHistory: List<MessageHistory>) =
                messageHistory(JsonField.of(messageHistory))

            /**
             * Sets [Builder.messageHistory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageHistory] with a well-typed
             * `List<MessageHistory>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun messageHistory(messageHistory: JsonField<List<MessageHistory>>) = apply {
                this.messageHistory = messageHistory.map { it.toMutableList() }
            }

            /**
             * Adds a single [MessageHistory] to [Builder.messageHistory].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessageHistory(messageHistory: MessageHistory) = apply {
                this.messageHistory =
                    (this.messageHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messageHistory", it).add(messageHistory)
                    }
            }

            /** Alias for calling [addMessageHistory] with `MessageHistory.ofUser(user)`. */
            fun addMessageHistory(user: MessageHistory.User) =
                addMessageHistory(MessageHistory.ofUser(user))

            /**
             * Alias for calling [addMessageHistory] with the following:
             * ```java
             * MessageHistory.User.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserMessageHistory(content: String) =
                addMessageHistory(MessageHistory.User.builder().content(content).build())

            /**
             * Alias for calling [addMessageHistory] with `MessageHistory.ofAssistant(assistant)`.
             */
            fun addMessageHistory(assistant: MessageHistory.Assistant) =
                addMessageHistory(MessageHistory.ofAssistant(assistant))

            /** Alias for calling [addMessageHistory] with `MessageHistory.ofTool(tool)`. */
            fun addMessageHistory(tool: MessageHistory.Tool) =
                addMessageHistory(MessageHistory.ofTool(tool))

            /** Alias for calling [addMessageHistory] with `MessageHistory.ofSystem(system)`. */
            fun addMessageHistory(system: MessageHistory.System) =
                addMessageHistory(MessageHistory.ofSystem(system))

            /**
             * Alias for calling [addMessageHistory] with the following:
             * ```java
             * MessageHistory.System.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemMessageHistory(content: String) =
                addMessageHistory(MessageHistory.System.builder().content(content).build())

            /**
             * Alias for calling [addMessageHistory] with `MessageHistory.ofDeveloper(developer)`.
             */
            fun addMessageHistory(developer: MessageHistory.Developer) =
                addMessageHistory(MessageHistory.ofDeveloper(developer))

            /**
             * Alias for calling [addMessageHistory] with the following:
             * ```java
             * MessageHistory.Developer.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addDeveloperMessageHistory(content: String) =
                addMessageHistory(MessageHistory.Developer.builder().content(content).build())

            /** A list of participants to add to the conversation when it starts. */
            fun participants(participants: List<Participant>) =
                participants(JsonField.of(participants))

            /**
             * Sets [Builder.participants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participants] with a well-typed `List<Participant>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun participants(participants: JsonField<List<Participant>>) = apply {
                this.participants = participants.map { it.toMutableList() }
            }

            /**
             * Adds a single [Participant] to [participants].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParticipant(participant: Participant) = apply {
                participants =
                    (participants ?: JsonField.of(mutableListOf())).also {
                        checkKnown("participants", it).add(participant)
                    }
            }

            /**
             * When `true`, a webhook is sent each time the conversation message history is updated.
             */
            fun sendMessageHistoryUpdates(sendMessageHistoryUpdates: Boolean) =
                sendMessageHistoryUpdates(JsonField.of(sendMessageHistoryUpdates))

            /**
             * Sets [Builder.sendMessageHistoryUpdates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendMessageHistoryUpdates] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun sendMessageHistoryUpdates(sendMessageHistoryUpdates: JsonField<Boolean>) = apply {
                this.sendMessageHistoryUpdates = sendMessageHistoryUpdates
            }

            /**
             * The settings associated with speech to text for the voice assistant. This is only
             * relevant if the assistant uses a text-to-text language model. Any assistant using a
             * model with native audio support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this
             * field.
             */
            fun transcription(transcription: TranscriptionConfig) =
                transcription(JsonField.of(transcription))

            /**
             * Sets [Builder.transcription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcription] with a well-typed
             * [TranscriptionConfig] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcription(transcription: JsonField<TranscriptionConfig>) = apply {
                this.transcription = transcription
            }

            /**
             * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx
             * and AWS voices.
             *
             *     **Supported Providers:**
             * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices,
             *   which provide more realistic, human-like speech, append `-Neural` to the `VoiceId`
             *   (e.g., `AWS.Polly.Joanna-Neural`). Check the
             *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html)
             *   for compatibility.
             * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural,
             *   Azure.en-CA-LiamNeural, Azure.en-US-BrianMultilingualNeural,
             *   Azure.en-US-Ava:DragonHDLatestNeural. For a complete list of voices, go to
             *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
             * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
             *   `ElevenLabs.BaseModel.John`). The `ModelId` part is optional. To use ElevenLabs,
             *   you must provide your ElevenLabs API key as an integration secret under
             *   `"voice_settings": {"api_key_ref": "<secret_id>"}`. See
             *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
             *   for details. Check
             *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
             *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
             * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
             *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
             */
            fun voice(voice: String) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<String>) = apply { this.voice = voice }

            /** The settings associated with the voice selected */
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

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofElevenlabs(elevenlabs)`. */
            fun voiceSettings(elevenlabs: ElevenLabsVoiceSettings) =
                voiceSettings(VoiceSettings.ofElevenlabs(elevenlabs))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofTelnyx(telnyx)`. */
            fun voiceSettings(telnyx: TelnyxVoiceSettings) =
                voiceSettings(VoiceSettings.ofTelnyx(telnyx))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofAws(aws)`. */
            fun voiceSettings(aws: AwsVoiceSettings) = voiceSettings(VoiceSettings.ofAws(aws))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofAzure(azure)`. */
            fun voiceSettings(azure: AzureVoiceSettings) =
                voiceSettings(VoiceSettings.ofAzure(azure))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
            fun voiceSettings(rime: RimeVoiceSettings) = voiceSettings(VoiceSettings.ofRime(rime))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
            fun voiceSettings(resemble: ResembleVoiceSettings) =
                voiceSettings(VoiceSettings.ofResemble(resemble))

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
                    assistant,
                    clientState,
                    commandId,
                    greeting,
                    interruptionSettings,
                    (messageHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    (participants ?: JsonMissing.of()).map { it.toImmutable() },
                    sendMessageHistoryUpdates,
                    transcription,
                    voice,
                    voiceSettings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            assistant().ifPresent { it.validate() }
            clientState()
            commandId()
            greeting()
            interruptionSettings().ifPresent { it.validate() }
            messageHistory().ifPresent { it.forEach { it.validate() } }
            participants().ifPresent { it.forEach { it.validate() } }
            sendMessageHistoryUpdates()
            transcription().ifPresent { it.validate() }
            voice()
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
            (assistant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (messageHistory.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sendMessageHistoryUpdates.asKnown().isPresent) 1 else 0) +
                (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assistant == other.assistant &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                greeting == other.greeting &&
                interruptionSettings == other.interruptionSettings &&
                messageHistory == other.messageHistory &&
                participants == other.participants &&
                sendMessageHistoryUpdates == other.sendMessageHistoryUpdates &&
                transcription == other.transcription &&
                voice == other.voice &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assistant,
                clientState,
                commandId,
                greeting,
                interruptionSettings,
                messageHistory,
                participants,
                sendMessageHistoryUpdates,
                transcription,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assistant=$assistant, clientState=$clientState, commandId=$commandId, greeting=$greeting, interruptionSettings=$interruptionSettings, messageHistory=$messageHistory, participants=$participants, sendMessageHistoryUpdates=$sendMessageHistoryUpdates, transcription=$transcription, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /**
     * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
     * configuration will be used as fallback for any omitted fields.
     */
    class Assistant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val dynamicVariables: JsonField<DynamicVariables>,
        private val externalLlm: JsonValue,
        private val fallbackConfig: JsonValue,
        private val greeting: JsonField<String>,
        private val instructions: JsonField<String>,
        private val llmApiKeyRef: JsonField<String>,
        private val mcpServers: JsonField<List<JsonValue>>,
        private val model: JsonField<String>,
        private val name: JsonField<String>,
        private val observabilitySettings: JsonValue,
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
            @JsonProperty("external_llm") @ExcludeMissing externalLlm: JsonValue = JsonMissing.of(),
            @JsonProperty("fallback_config")
            @ExcludeMissing
            fallbackConfig: JsonValue = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_api_key_ref")
            @ExcludeMissing
            llmApiKeyRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcp_servers")
            @ExcludeMissing
            mcpServers: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("observability_settings")
            @ExcludeMissing
            observabilitySettings: JsonValue = JsonMissing.of(),
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
         * telnyx_call_from, telnyx_conversation_channel, telnyx_agent_target,
         * telnyx_end_user_target, telnyx_call_caller_id_name) and custom header variables.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dynamicVariables(): Optional<DynamicVariables> =
            dynamicVariables.getOptional("dynamic_variables")

        /**
         * External LLM configuration for bringing your own LLM endpoint.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = assistant.externalLlm().convert(MyClass.class);
         * ```
         */
        @JsonProperty("external_llm") @ExcludeMissing fun _externalLlm(): JsonValue = externalLlm

        /**
         * Fallback LLM configuration used when the primary LLM provider is unavailable.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = assistant.fallbackConfig().convert(MyClass.class);
         * ```
         */
        @JsonProperty("fallback_config")
        @ExcludeMissing
        fun _fallbackConfig(): JsonValue = fallbackConfig

        /**
         * Initial greeting text spoken when the assistant starts. Can be plain text for any voice
         * or SSML for `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
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
         * Integration secret identifier for the LLM provider API key. Use this field to reference
         * an
         * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * containing your LLM provider API key. Supports any LLM provider (OpenAI, Anthropic,
         * etc.).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

        /**
         * MCP (Model Context Protocol) server configurations for extending the assistant's
         * capabilities with external tools and data sources.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpServers(): Optional<List<JsonValue>> = mcpServers.getOptional("mcp_servers")

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
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = assistant.observabilitySettings().convert(MyClass.class);
         * ```
         */
        @JsonProperty("observability_settings")
        @ExcludeMissing
        fun _observabilitySettings(): JsonValue = observabilitySettings

        /**
         * Deprecated — use `llm_api_key_ref` instead. Integration secret identifier for the OpenAI
         * API key. This field is maintained for backward compatibility; `llm_api_key_ref` is the
         * canonical field name and supports all LLM providers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
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
         * Returns the raw JSON value of [greeting].
         *
         * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<String> = greeting

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
         * Returns the raw JSON value of [mcpServers].
         *
         * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        fun _mcpServers(): JsonField<List<JsonValue>> = mcpServers

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
         * Returns the raw JSON value of [openaiApiKeyRef].
         *
         * Unlike [openaiApiKeyRef], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
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
             * Returns a mutable builder for constructing an instance of [Assistant].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Assistant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
            private var externalLlm: JsonValue = JsonMissing.of()
            private var fallbackConfig: JsonValue = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
            private var mcpServers: JsonField<MutableList<JsonValue>>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var observabilitySettings: JsonValue = JsonMissing.of()
            private var openaiApiKeyRef: JsonField<String> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(assistant: Assistant) = apply {
                id = assistant.id
                dynamicVariables = assistant.dynamicVariables
                externalLlm = assistant.externalLlm
                fallbackConfig = assistant.fallbackConfig
                greeting = assistant.greeting
                instructions = assistant.instructions
                llmApiKeyRef = assistant.llmApiKeyRef
                mcpServers = assistant.mcpServers.map { it.toMutableList() }
                model = assistant.model
                name = assistant.name
                observabilitySettings = assistant.observabilitySettings
                openaiApiKeyRef = assistant.openaiApiKeyRef
                tools = assistant.tools.map { it.toMutableList() }
                additionalProperties = assistant.additionalProperties.toMutableMap()
            }

            /** The identifier of the AI assistant to use. */
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
             * Map of dynamic variables and their default values. Dynamic variables can be
             * referenced in instructions, greeting, and tool definitions using the
             * `{{variable_name}}` syntax. Call-control-agent automatically merges in
             * `telnyx_call_*` variables (telnyx_call_to, telnyx_call_from,
             * telnyx_conversation_channel, telnyx_agent_target, telnyx_end_user_target,
             * telnyx_call_caller_id_name) and custom header variables.
             */
            fun dynamicVariables(dynamicVariables: DynamicVariables) =
                dynamicVariables(JsonField.of(dynamicVariables))

            /**
             * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dynamicVariables] with a well-typed
             * [DynamicVariables] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
                this.dynamicVariables = dynamicVariables
            }

            /** External LLM configuration for bringing your own LLM endpoint. */
            fun externalLlm(externalLlm: JsonValue) = apply { this.externalLlm = externalLlm }

            /** Fallback LLM configuration used when the primary LLM provider is unavailable. */
            fun fallbackConfig(fallbackConfig: JsonValue) = apply {
                this.fallbackConfig = fallbackConfig
            }

            /**
             * Initial greeting text spoken when the assistant starts. Can be plain text for any
             * voice or SSML for `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.
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

            /**
             * System instructions for the voice assistant. Can be templated with
             * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables).
             * This will overwrite the instructions set in the assistant configuration.
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
             * Integration secret identifier for the LLM provider API key. Use this field to
             * reference an
             * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
             * containing your LLM provider API key. Supports any LLM provider (OpenAI, Anthropic,
             * etc.).
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

            /**
             * MCP (Model Context Protocol) server configurations for extending the assistant's
             * capabilities with external tools and data sources.
             */
            fun mcpServers(mcpServers: List<JsonValue>) = mcpServers(JsonField.of(mcpServers))

            /**
             * Sets [Builder.mcpServers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpServers] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mcpServers(mcpServers: JsonField<List<JsonValue>>) = apply {
                this.mcpServers = mcpServers.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [mcpServers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMcpServer(mcpServer: JsonValue) = apply {
                mcpServers =
                    (mcpServers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mcpServers", it).add(mcpServer)
                    }
            }

            /**
             * LLM model override for this call. If omitted, the assistant's configured model is
             * used.
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

            /** Assistant name override for this call. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Observability configuration for the assistant session, including Langfuse integration
             * for tracing and monitoring.
             */
            fun observabilitySettings(observabilitySettings: JsonValue) = apply {
                this.observabilitySettings = observabilitySettings
            }

            /**
             * Deprecated — use `llm_api_key_ref` instead. Integration secret identifier for the
             * OpenAI API key. This field is maintained for backward compatibility;
             * `llm_api_key_ref` is the canonical field name and supports all LLM providers.
             */
            @Deprecated("deprecated")
            fun openaiApiKeyRef(openaiApiKeyRef: String) =
                openaiApiKeyRef(JsonField.of(openaiApiKeyRef))

            /**
             * Sets [Builder.openaiApiKeyRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openaiApiKeyRef] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun openaiApiKeyRef(openaiApiKeyRef: JsonField<String>) = apply {
                this.openaiApiKeyRef = openaiApiKeyRef
            }

            /**
             * Inline tool definitions available to the assistant (webhook, retrieval, transfer,
             * hangup, etc.). Overrides the assistant's stored tools if provided.
             */
            fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
                    }
            }

            /** Alias for calling [addTool] with `Tool.ofBookAppointment(bookAppointment)`. */
            fun addTool(bookAppointment: Tool.BookAppointmentTool) =
                addTool(Tool.ofBookAppointment(bookAppointment))

            /**
             * Alias for calling [addTool] with the following:
             * ```java
             * Tool.BookAppointmentTool.builder()
             *     .bookAppointment(bookAppointment)
             *     .build()
             * ```
             */
            fun addBookAppointmentTool(bookAppointment: Tool.BookAppointmentTool.BookAppointment) =
                addTool(Tool.BookAppointmentTool.builder().bookAppointment(bookAppointment).build())

            /** Alias for calling [addTool] with `Tool.ofCheckAvailability(checkAvailability)`. */
            fun addTool(checkAvailability: Tool.CheckAvailabilityTool) =
                addTool(Tool.ofCheckAvailability(checkAvailability))

            /**
             * Alias for calling [addTool] with the following:
             * ```java
             * Tool.CheckAvailabilityTool.builder()
             *     .checkAvailability(checkAvailability)
             *     .build()
             * ```
             */
            fun addCheckAvailabilityTool(
                checkAvailability: Tool.CheckAvailabilityTool.CheckAvailability
            ) =
                addTool(
                    Tool.CheckAvailabilityTool.builder()
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
                addTool(
                    WebhookTool.builder().type(WebhookTool.Type.WEBHOOK).webhook(webhook).build()
                )

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
                    TransferTool.builder()
                        .type(TransferTool.Type.TRANSFER)
                        .transfer(transfer)
                        .build()
                )

            /** Alias for calling [addTool] with `Tool.ofRetrieval(retrieval)`. */
            fun addTool(retrieval: Tool.Retrieval) = addTool(Tool.ofRetrieval(retrieval))

            /**
             * Alias for calling [addTool] with the following:
             * ```java
             * Tool.Retrieval.builder()
             *     .retrieval(retrieval)
             *     .build()
             * ```
             */
            fun addRetrievalTool(retrieval: Tool.Retrieval.RetrievalConfig) =
                addTool(Tool.Retrieval.builder().retrieval(retrieval).build())

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
             * Returns an immutable instance of [Assistant].
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
            fun build(): Assistant =
                Assistant(
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

        fun validate(): Assistant = apply {
            if (validated) {
                return@apply
            }

            id()
            dynamicVariables().ifPresent { it.validate() }
            greeting()
            instructions()
            llmApiKeyRef()
            mcpServers()
            model()
            name()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                (mcpServers.asKnown().getOrNull()?.size ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (openaiApiKeyRef.asKnown().isPresent) 1 else 0) +
                (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * Map of dynamic variables and their default values. Dynamic variables can be referenced in
         * instructions, greeting, and tool definitions using the `{{variable_name}}` syntax.
         * Call-control-agent automatically merges in `telnyx_call_*` variables (telnyx_call_to,
         * telnyx_call_from, telnyx_conversation_channel, telnyx_agent_target,
         * telnyx_end_user_target, telnyx_call_caller_id_name) and custom header variables.
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

                return other is DynamicVariables &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "DynamicVariables{additionalProperties=$additionalProperties}"
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
            private val retrieval: Retrieval? = null,
            private val _json: JsonValue? = null,
        ) {

            fun bookAppointment(): Optional<BookAppointmentTool> =
                Optional.ofNullable(bookAppointment)

            fun checkAvailability(): Optional<CheckAvailabilityTool> =
                Optional.ofNullable(checkAvailability)

            fun webhook(): Optional<WebhookTool> = Optional.ofNullable(webhook)

            fun hangup(): Optional<HangupTool> = Optional.ofNullable(hangup)

            fun transfer(): Optional<TransferTool> = Optional.ofNullable(transfer)

            fun retrieval(): Optional<Retrieval> = Optional.ofNullable(retrieval)

            fun isBookAppointment(): Boolean = bookAppointment != null

            fun isCheckAvailability(): Boolean = checkAvailability != null

            fun isWebhook(): Boolean = webhook != null

            fun isHangup(): Boolean = hangup != null

            fun isTransfer(): Boolean = transfer != null

            fun isRetrieval(): Boolean = retrieval != null

            fun asBookAppointment(): BookAppointmentTool =
                bookAppointment.getOrThrow("bookAppointment")

            fun asCheckAvailability(): CheckAvailabilityTool =
                checkAvailability.getOrThrow("checkAvailability")

            fun asWebhook(): WebhookTool = webhook.getOrThrow("webhook")

            fun asHangup(): HangupTool = hangup.getOrThrow("hangup")

            fun asTransfer(): TransferTool = transfer.getOrThrow("transfer")

            fun asRetrieval(): Retrieval = retrieval.getOrThrow("retrieval")

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

                        override fun visitCheckAvailability(
                            checkAvailability: CheckAvailabilityTool
                        ) {
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

                        override fun visitRetrieval(retrieval: Retrieval) {
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

                        override fun visitCheckAvailability(
                            checkAvailability: CheckAvailabilityTool
                        ) = checkAvailability.validity()

                        override fun visitWebhook(webhook: WebhookTool) = webhook.validity()

                        override fun visitHangup(hangup: HangupTool) = hangup.validity()

                        override fun visitTransfer(transfer: TransferTool) = transfer.validity()

                        override fun visitRetrieval(retrieval: Retrieval) = retrieval.validity()

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
                Objects.hash(
                    bookAppointment,
                    checkAvailability,
                    webhook,
                    hangup,
                    transfer,
                    retrieval,
                )

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

                @JvmStatic fun ofRetrieval(retrieval: Retrieval) = Tool(retrieval = retrieval)
            }

            /**
             * An interface that defines how to map each variant of [Tool] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitBookAppointment(bookAppointment: BookAppointmentTool): T

                fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool): T

                fun visitWebhook(webhook: WebhookTool): T

                fun visitHangup(hangup: HangupTool): T

                fun visitTransfer(transfer: TransferTool): T

                fun visitRetrieval(retrieval: Retrieval): T

                /**
                 * Maps an unknown variant of [Tool] to a value of type [T].
                 *
                 * An instance of [Tool] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
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
                            return tryDeserialize(node, jacksonTypeRef<BookAppointmentTool>())
                                ?.let { Tool(bookAppointment = it, _json = json) }
                                ?: Tool(_json = json)
                        }
                        "check_availability" -> {
                            return tryDeserialize(node, jacksonTypeRef<CheckAvailabilityTool>())
                                ?.let { Tool(checkAvailability = it, _json = json) }
                                ?: Tool(_json = json)
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
                            return tryDeserialize(node, jacksonTypeRef<Retrieval>())?.let {
                                Tool(retrieval = it, _json = json)
                            } ?: Tool(_json = json)
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
                        value.bookAppointment != null ->
                            generator.writeObject(value.bookAppointment)
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

            class BookAppointmentTool
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bookAppointment: JsonField<BookAppointment>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("book_appointment")
                    @ExcludeMissing
                    bookAppointment: JsonField<BookAppointment> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(bookAppointment, type, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun bookAppointment(): BookAppointment =
                    bookAppointment.getRequired("book_appointment")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("book_appointment")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [bookAppointment].
                 *
                 * Unlike [bookAppointment], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("book_appointment")
                @ExcludeMissing
                fun _bookAppointment(): JsonField<BookAppointment> = bookAppointment

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
                     * [BookAppointmentTool].
                     *
                     * The following fields are required:
                     * ```java
                     * .bookAppointment()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BookAppointmentTool]. */
                class Builder internal constructor() {

                    private var bookAppointment: JsonField<BookAppointment>? = null
                    private var type: JsonValue = JsonValue.from("book_appointment")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bookAppointmentTool: BookAppointmentTool) = apply {
                        bookAppointment = bookAppointmentTool.bookAppointment
                        type = bookAppointmentTool.type
                        additionalProperties =
                            bookAppointmentTool.additionalProperties.toMutableMap()
                    }

                    fun bookAppointment(bookAppointment: BookAppointment) =
                        bookAppointment(JsonField.of(bookAppointment))

                    /**
                     * Sets [Builder.bookAppointment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bookAppointment] with a well-typed
                     * [BookAppointment] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun bookAppointment(bookAppointment: JsonField<BookAppointment>) = apply {
                        this.bookAppointment = bookAppointment
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("book_appointment")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [BookAppointmentTool].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bookAppointment()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BookAppointmentTool =
                        BookAppointmentTool(
                            checkRequired("bookAppointment", bookAppointment),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BookAppointmentTool = apply {
                    if (validated) {
                        return@apply
                    }

                    bookAppointment().validate()
                    _type().let {
                        if (it != JsonValue.from("book_appointment")) {
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
                    (bookAppointment.asKnown().getOrNull()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("book_appointment")) 1 else 0 }

                class BookAppointment
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val apiKeyRef: JsonField<String>,
                    private val eventTypeId: JsonField<Long>,
                    private val attendeeName: JsonField<String>,
                    private val attendeeTimezone: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("api_key_ref")
                        @ExcludeMissing
                        apiKeyRef: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("event_type_id")
                        @ExcludeMissing
                        eventTypeId: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("attendee_name")
                        @ExcludeMissing
                        attendeeName: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("attendee_timezone")
                        @ExcludeMissing
                        attendeeTimezone: JsonField<String> = JsonMissing.of(),
                    ) : this(apiKeyRef, eventTypeId, attendeeName, attendeeTimezone, mutableMapOf())

                    /**
                     * Reference to an integration secret that contains your Cal.com API key. You
                     * would pass the `identifier` for an integration secret
                     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                     * that refers to your Cal.com API key.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun apiKeyRef(): String = apiKeyRef.getRequired("api_key_ref")

                    /**
                     * Event Type ID for which slots are being fetched.
                     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-event-type-id)
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun eventTypeId(): Long = eventTypeId.getRequired("event_type_id")

                    /**
                     * The name of the attendee
                     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-name).
                     * If not provided, the assistant will ask for the attendee's name.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun attendeeName(): Optional<String> = attendeeName.getOptional("attendee_name")

                    /**
                     * The timezone of the attendee
                     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-timezone).
                     * If not provided, the assistant will ask for the attendee's timezone.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun attendeeTimezone(): Optional<String> =
                        attendeeTimezone.getOptional("attendee_timezone")

                    /**
                     * Returns the raw JSON value of [apiKeyRef].
                     *
                     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("api_key_ref")
                    @ExcludeMissing
                    fun _apiKeyRef(): JsonField<String> = apiKeyRef

                    /**
                     * Returns the raw JSON value of [eventTypeId].
                     *
                     * Unlike [eventTypeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("event_type_id")
                    @ExcludeMissing
                    fun _eventTypeId(): JsonField<Long> = eventTypeId

                    /**
                     * Returns the raw JSON value of [attendeeName].
                     *
                     * Unlike [attendeeName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attendee_name")
                    @ExcludeMissing
                    fun _attendeeName(): JsonField<String> = attendeeName

                    /**
                     * Returns the raw JSON value of [attendeeTimezone].
                     *
                     * Unlike [attendeeTimezone], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attendee_timezone")
                    @ExcludeMissing
                    fun _attendeeTimezone(): JsonField<String> = attendeeTimezone

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
                         * [BookAppointment].
                         *
                         * The following fields are required:
                         * ```java
                         * .apiKeyRef()
                         * .eventTypeId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [BookAppointment]. */
                    class Builder internal constructor() {

                        private var apiKeyRef: JsonField<String>? = null
                        private var eventTypeId: JsonField<Long>? = null
                        private var attendeeName: JsonField<String> = JsonMissing.of()
                        private var attendeeTimezone: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(bookAppointment: BookAppointment) = apply {
                            apiKeyRef = bookAppointment.apiKeyRef
                            eventTypeId = bookAppointment.eventTypeId
                            attendeeName = bookAppointment.attendeeName
                            attendeeTimezone = bookAppointment.attendeeTimezone
                            additionalProperties =
                                bookAppointment.additionalProperties.toMutableMap()
                        }

                        /**
                         * Reference to an integration secret that contains your Cal.com API key.
                         * You would pass the `identifier` for an integration secret
                         * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                         * that refers to your Cal.com API key.
                         */
                        fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

                        /**
                         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.apiKeyRef] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply {
                            this.apiKeyRef = apiKeyRef
                        }

                        /**
                         * Event Type ID for which slots are being fetched.
                         * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-event-type-id)
                         */
                        fun eventTypeId(eventTypeId: Long) = eventTypeId(JsonField.of(eventTypeId))

                        /**
                         * Sets [Builder.eventTypeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.eventTypeId] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun eventTypeId(eventTypeId: JsonField<Long>) = apply {
                            this.eventTypeId = eventTypeId
                        }

                        /**
                         * The name of the attendee
                         * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-name).
                         * If not provided, the assistant will ask for the attendee's name.
                         */
                        fun attendeeName(attendeeName: String) =
                            attendeeName(JsonField.of(attendeeName))

                        /**
                         * Sets [Builder.attendeeName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attendeeName] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun attendeeName(attendeeName: JsonField<String>) = apply {
                            this.attendeeName = attendeeName
                        }

                        /**
                         * The timezone of the attendee
                         * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-timezone).
                         * If not provided, the assistant will ask for the attendee's timezone.
                         */
                        fun attendeeTimezone(attendeeTimezone: String) =
                            attendeeTimezone(JsonField.of(attendeeTimezone))

                        /**
                         * Sets [Builder.attendeeTimezone] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attendeeTimezone] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun attendeeTimezone(attendeeTimezone: JsonField<String>) = apply {
                            this.attendeeTimezone = attendeeTimezone
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
                         * Returns an immutable instance of [BookAppointment].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .apiKeyRef()
                         * .eventTypeId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): BookAppointment =
                            BookAppointment(
                                checkRequired("apiKeyRef", apiKeyRef),
                                checkRequired("eventTypeId", eventTypeId),
                                attendeeName,
                                attendeeTimezone,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): BookAppointment = apply {
                        if (validated) {
                            return@apply
                        }

                        apiKeyRef()
                        eventTypeId()
                        attendeeName()
                        attendeeTimezone()
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
                        (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                            (if (eventTypeId.asKnown().isPresent) 1 else 0) +
                            (if (attendeeName.asKnown().isPresent) 1 else 0) +
                            (if (attendeeTimezone.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BookAppointment &&
                            apiKeyRef == other.apiKeyRef &&
                            eventTypeId == other.eventTypeId &&
                            attendeeName == other.attendeeName &&
                            attendeeTimezone == other.attendeeTimezone &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            apiKeyRef,
                            eventTypeId,
                            attendeeName,
                            attendeeTimezone,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "BookAppointment{apiKeyRef=$apiKeyRef, eventTypeId=$eventTypeId, attendeeName=$attendeeName, attendeeTimezone=$attendeeTimezone, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BookAppointmentTool &&
                        bookAppointment == other.bookAppointment &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bookAppointment, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BookAppointmentTool{bookAppointment=$bookAppointment, type=$type, additionalProperties=$additionalProperties}"
            }

            class CheckAvailabilityTool
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val checkAvailability: JsonField<CheckAvailability>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("check_availability")
                    @ExcludeMissing
                    checkAvailability: JsonField<CheckAvailability> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(checkAvailability, type, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun checkAvailability(): CheckAvailability =
                    checkAvailability.getRequired("check_availability")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("check_availability")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [checkAvailability].
                 *
                 * Unlike [checkAvailability], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("check_availability")
                @ExcludeMissing
                fun _checkAvailability(): JsonField<CheckAvailability> = checkAvailability

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
                     * [CheckAvailabilityTool].
                     *
                     * The following fields are required:
                     * ```java
                     * .checkAvailability()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CheckAvailabilityTool]. */
                class Builder internal constructor() {

                    private var checkAvailability: JsonField<CheckAvailability>? = null
                    private var type: JsonValue = JsonValue.from("check_availability")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkAvailabilityTool: CheckAvailabilityTool) = apply {
                        checkAvailability = checkAvailabilityTool.checkAvailability
                        type = checkAvailabilityTool.type
                        additionalProperties =
                            checkAvailabilityTool.additionalProperties.toMutableMap()
                    }

                    fun checkAvailability(checkAvailability: CheckAvailability) =
                        checkAvailability(JsonField.of(checkAvailability))

                    /**
                     * Sets [Builder.checkAvailability] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.checkAvailability] with a well-typed
                     * [CheckAvailability] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun checkAvailability(checkAvailability: JsonField<CheckAvailability>) = apply {
                        this.checkAvailability = checkAvailability
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("check_availability")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [CheckAvailabilityTool].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .checkAvailability()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CheckAvailabilityTool =
                        CheckAvailabilityTool(
                            checkRequired("checkAvailability", checkAvailability),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CheckAvailabilityTool = apply {
                    if (validated) {
                        return@apply
                    }

                    checkAvailability().validate()
                    _type().let {
                        if (it != JsonValue.from("check_availability")) {
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
                    (checkAvailability.asKnown().getOrNull()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("check_availability")) 1 else 0 }

                class CheckAvailability
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val apiKeyRef: JsonField<String>,
                    private val eventTypeId: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("api_key_ref")
                        @ExcludeMissing
                        apiKeyRef: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("event_type_id")
                        @ExcludeMissing
                        eventTypeId: JsonField<Long> = JsonMissing.of(),
                    ) : this(apiKeyRef, eventTypeId, mutableMapOf())

                    /**
                     * Reference to an integration secret that contains your Cal.com API key. You
                     * would pass the `identifier` for an integration secret
                     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                     * that refers to your Cal.com API key.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun apiKeyRef(): String = apiKeyRef.getRequired("api_key_ref")

                    /**
                     * Event Type ID for which slots are being fetched.
                     * [cal.com](https://cal.com/docs/api-reference/v2/slots/get-available-slots#parameter-event-type-id)
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun eventTypeId(): Long = eventTypeId.getRequired("event_type_id")

                    /**
                     * Returns the raw JSON value of [apiKeyRef].
                     *
                     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("api_key_ref")
                    @ExcludeMissing
                    fun _apiKeyRef(): JsonField<String> = apiKeyRef

                    /**
                     * Returns the raw JSON value of [eventTypeId].
                     *
                     * Unlike [eventTypeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("event_type_id")
                    @ExcludeMissing
                    fun _eventTypeId(): JsonField<Long> = eventTypeId

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
                         * [CheckAvailability].
                         *
                         * The following fields are required:
                         * ```java
                         * .apiKeyRef()
                         * .eventTypeId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CheckAvailability]. */
                    class Builder internal constructor() {

                        private var apiKeyRef: JsonField<String>? = null
                        private var eventTypeId: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(checkAvailability: CheckAvailability) = apply {
                            apiKeyRef = checkAvailability.apiKeyRef
                            eventTypeId = checkAvailability.eventTypeId
                            additionalProperties =
                                checkAvailability.additionalProperties.toMutableMap()
                        }

                        /**
                         * Reference to an integration secret that contains your Cal.com API key.
                         * You would pass the `identifier` for an integration secret
                         * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                         * that refers to your Cal.com API key.
                         */
                        fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

                        /**
                         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.apiKeyRef] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply {
                            this.apiKeyRef = apiKeyRef
                        }

                        /**
                         * Event Type ID for which slots are being fetched.
                         * [cal.com](https://cal.com/docs/api-reference/v2/slots/get-available-slots#parameter-event-type-id)
                         */
                        fun eventTypeId(eventTypeId: Long) = eventTypeId(JsonField.of(eventTypeId))

                        /**
                         * Sets [Builder.eventTypeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.eventTypeId] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun eventTypeId(eventTypeId: JsonField<Long>) = apply {
                            this.eventTypeId = eventTypeId
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
                         * Returns an immutable instance of [CheckAvailability].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .apiKeyRef()
                         * .eventTypeId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CheckAvailability =
                            CheckAvailability(
                                checkRequired("apiKeyRef", apiKeyRef),
                                checkRequired("eventTypeId", eventTypeId),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CheckAvailability = apply {
                        if (validated) {
                            return@apply
                        }

                        apiKeyRef()
                        eventTypeId()
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
                        (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                            (if (eventTypeId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CheckAvailability &&
                            apiKeyRef == other.apiKeyRef &&
                            eventTypeId == other.eventTypeId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(apiKeyRef, eventTypeId, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CheckAvailability{apiKeyRef=$apiKeyRef, eventTypeId=$eventTypeId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckAvailabilityTool &&
                        checkAvailability == other.checkAvailability &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(checkAvailability, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CheckAvailabilityTool{checkAvailability=$checkAvailability, type=$type, additionalProperties=$additionalProperties}"
            }

            class Retrieval
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val retrieval: JsonField<RetrievalConfig>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("retrieval")
                    @ExcludeMissing
                    retrieval: JsonField<RetrievalConfig> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(retrieval, type, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun retrieval(): RetrievalConfig = retrieval.getRequired("retrieval")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("retrieval")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [retrieval].
                 *
                 * Unlike [retrieval], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("retrieval")
                @ExcludeMissing
                fun _retrieval(): JsonField<RetrievalConfig> = retrieval

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
                     * Returns a mutable builder for constructing an instance of [Retrieval].
                     *
                     * The following fields are required:
                     * ```java
                     * .retrieval()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Retrieval]. */
                class Builder internal constructor() {

                    private var retrieval: JsonField<RetrievalConfig>? = null
                    private var type: JsonValue = JsonValue.from("retrieval")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(retrieval: Retrieval) = apply {
                        this.retrieval = retrieval.retrieval
                        type = retrieval.type
                        additionalProperties = retrieval.additionalProperties.toMutableMap()
                    }

                    fun retrieval(retrieval: RetrievalConfig) = retrieval(JsonField.of(retrieval))

                    /**
                     * Sets [Builder.retrieval] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retrieval] with a well-typed
                     * [RetrievalConfig] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun retrieval(retrieval: JsonField<RetrievalConfig>) = apply {
                        this.retrieval = retrieval
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("retrieval")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Retrieval].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .retrieval()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Retrieval =
                        Retrieval(
                            checkRequired("retrieval", retrieval),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Retrieval = apply {
                    if (validated) {
                        return@apply
                    }

                    retrieval().validate()
                    _type().let {
                        if (it != JsonValue.from("retrieval")) {
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
                    (retrieval.asKnown().getOrNull()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("retrieval")) 1 else 0 }

                class RetrievalConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucketIds: JsonField<List<String>>,
                    private val maxNumResults: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket_ids")
                        @ExcludeMissing
                        bucketIds: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("max_num_results")
                        @ExcludeMissing
                        maxNumResults: JsonField<Long> = JsonMissing.of(),
                    ) : this(bucketIds, maxNumResults, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun bucketIds(): List<String> = bucketIds.getRequired("bucket_ids")

                    /**
                     * The maximum number of results to retrieve as context for the language model.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun maxNumResults(): Optional<Long> =
                        maxNumResults.getOptional("max_num_results")

                    /**
                     * Returns the raw JSON value of [bucketIds].
                     *
                     * Unlike [bucketIds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket_ids")
                    @ExcludeMissing
                    fun _bucketIds(): JsonField<List<String>> = bucketIds

                    /**
                     * Returns the raw JSON value of [maxNumResults].
                     *
                     * Unlike [maxNumResults], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("max_num_results")
                    @ExcludeMissing
                    fun _maxNumResults(): JsonField<Long> = maxNumResults

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
                         * [RetrievalConfig].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucketIds()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RetrievalConfig]. */
                    class Builder internal constructor() {

                        private var bucketIds: JsonField<MutableList<String>>? = null
                        private var maxNumResults: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(retrievalConfig: RetrievalConfig) = apply {
                            bucketIds = retrievalConfig.bucketIds.map { it.toMutableList() }
                            maxNumResults = retrievalConfig.maxNumResults
                            additionalProperties =
                                retrievalConfig.additionalProperties.toMutableMap()
                        }

                        fun bucketIds(bucketIds: List<String>) = bucketIds(JsonField.of(bucketIds))

                        /**
                         * Sets [Builder.bucketIds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucketIds] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun bucketIds(bucketIds: JsonField<List<String>>) = apply {
                            this.bucketIds = bucketIds.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [bucketIds].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addBucketId(bucketId: String) = apply {
                            bucketIds =
                                (bucketIds ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("bucketIds", it).add(bucketId)
                                }
                        }

                        /**
                         * The maximum number of results to retrieve as context for the language
                         * model.
                         */
                        fun maxNumResults(maxNumResults: Long) =
                            maxNumResults(JsonField.of(maxNumResults))

                        /**
                         * Sets [Builder.maxNumResults] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxNumResults] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxNumResults(maxNumResults: JsonField<Long>) = apply {
                            this.maxNumResults = maxNumResults
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
                         * Returns an immutable instance of [RetrievalConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucketIds()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): RetrievalConfig =
                            RetrievalConfig(
                                checkRequired("bucketIds", bucketIds).map { it.toImmutable() },
                                maxNumResults,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): RetrievalConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        bucketIds()
                        maxNumResults()
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
                        (bucketIds.asKnown().getOrNull()?.size ?: 0) +
                            (if (maxNumResults.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RetrievalConfig &&
                            bucketIds == other.bucketIds &&
                            maxNumResults == other.maxNumResults &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bucketIds, maxNumResults, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RetrievalConfig{bucketIds=$bucketIds, maxNumResults=$maxNumResults, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Retrieval &&
                        retrieval == other.retrieval &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(retrieval, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Retrieval{retrieval=$retrieval, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Assistant &&
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
            "Assistant{id=$id, dynamicVariables=$dynamicVariables, externalLlm=$externalLlm, fallbackConfig=$fallbackConfig, greeting=$greeting, instructions=$instructions, llmApiKeyRef=$llmApiKeyRef, mcpServers=$mcpServers, model=$model, name=$name, observabilitySettings=$observabilitySettings, openaiApiKeyRef=$openaiApiKeyRef, tools=$tools, additionalProperties=$additionalProperties}"
    }

    /** Messages sent by an end user */
    @JsonDeserialize(using = MessageHistory.Deserializer::class)
    @JsonSerialize(using = MessageHistory.Serializer::class)
    class MessageHistory
    private constructor(
        private val user: User? = null,
        private val assistant: Assistant? = null,
        private val tool: Tool? = null,
        private val system: System? = null,
        private val developer: Developer? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Messages sent by an end user */
        fun user(): Optional<User> = Optional.ofNullable(user)

        /** Messages sent by the model in response to user messages. */
        fun assistant(): Optional<Assistant> = Optional.ofNullable(assistant)

        fun tool(): Optional<Tool> = Optional.ofNullable(tool)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun system(): Optional<System> = Optional.ofNullable(system)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun developer(): Optional<Developer> = Optional.ofNullable(developer)

        fun isUser(): Boolean = user != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isSystem(): Boolean = system != null

        fun isDeveloper(): Boolean = developer != null

        /** Messages sent by an end user */
        fun asUser(): User = user.getOrThrow("user")

        /** Messages sent by the model in response to user messages. */
        fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

        fun asTool(): Tool = tool.getOrThrow("tool")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asSystem(): System = system.getOrThrow("system")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asDeveloper(): Developer = developer.getOrThrow("developer")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                user != null -> visitor.visitUser(user)
                assistant != null -> visitor.visitAssistant(assistant)
                tool != null -> visitor.visitTool(tool)
                system != null -> visitor.visitSystem(system)
                developer != null -> visitor.visitDeveloper(developer)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): MessageHistory = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: User) {
                        user.validate()
                    }

                    override fun visitAssistant(assistant: Assistant) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: Tool) {
                        tool.validate()
                    }

                    override fun visitSystem(system: System) {
                        system.validate()
                    }

                    override fun visitDeveloper(developer: Developer) {
                        developer.validate()
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
                    override fun visitUser(user: User) = user.validity()

                    override fun visitAssistant(assistant: Assistant) = assistant.validity()

                    override fun visitTool(tool: Tool) = tool.validity()

                    override fun visitSystem(system: System) = system.validity()

                    override fun visitDeveloper(developer: Developer) = developer.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MessageHistory &&
                user == other.user &&
                assistant == other.assistant &&
                tool == other.tool &&
                system == other.system &&
                developer == other.developer
        }

        override fun hashCode(): Int = Objects.hash(user, assistant, tool, system, developer)

        override fun toString(): String =
            when {
                user != null -> "MessageHistory{user=$user}"
                assistant != null -> "MessageHistory{assistant=$assistant}"
                tool != null -> "MessageHistory{tool=$tool}"
                system != null -> "MessageHistory{system=$system}"
                developer != null -> "MessageHistory{developer=$developer}"
                _json != null -> "MessageHistory{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MessageHistory")
            }

        companion object {

            /** Messages sent by an end user */
            @JvmStatic fun ofUser(user: User) = MessageHistory(user = user)

            /** Messages sent by the model in response to user messages. */
            @JvmStatic fun ofAssistant(assistant: Assistant) = MessageHistory(assistant = assistant)

            @JvmStatic fun ofTool(tool: Tool) = MessageHistory(tool = tool)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofSystem(system: System) = MessageHistory(system = system)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofDeveloper(developer: Developer) = MessageHistory(developer = developer)
        }

        /**
         * An interface that defines how to map each variant of [MessageHistory] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** Messages sent by an end user */
            fun visitUser(user: User): T

            /** Messages sent by the model in response to user messages. */
            fun visitAssistant(assistant: Assistant): T

            fun visitTool(tool: Tool): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitSystem(system: System): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitDeveloper(developer: Developer): T

            /**
             * Maps an unknown variant of [MessageHistory] to a value of type [T].
             *
             * An instance of [MessageHistory] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown MessageHistory: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MessageHistory>(MessageHistory::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MessageHistory {
                val json = JsonValue.fromJsonNode(node)
                val role = json.asObject().getOrNull()?.get("role")?.asString()?.getOrNull()

                when (role) {
                    "user" -> {
                        return tryDeserialize(node, jacksonTypeRef<User>())?.let {
                            MessageHistory(user = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                            MessageHistory(assistant = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                            MessageHistory(tool = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(node, jacksonTypeRef<System>())?.let {
                            MessageHistory(system = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "developer" -> {
                        return tryDeserialize(node, jacksonTypeRef<Developer>())?.let {
                            MessageHistory(developer = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                }

                return MessageHistory(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<MessageHistory>(MessageHistory::class) {

            override fun serialize(
                value: MessageHistory,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.user != null -> generator.writeObject(value.user)
                    value.assistant != null -> generator.writeObject(value.assistant)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.system != null -> generator.writeObject(value.system)
                    value.developer != null -> generator.writeObject(value.developer)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MessageHistory")
                }
            }
        }

        /** Messages sent by an end user */
        class User
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(content, role, metadata, mutableMapOf())

            /**
             * The contents of the user message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case `user`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("user")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * Metadata to add to the message
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("user")
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    content = user.content
                    role = user.role
                    metadata = user.metadata
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The contents of the user message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("user")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Metadata to add to the message */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(
                        checkRequired("content", content),
                        role,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("user")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                metadata().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("user")) 1 else 0 } +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0)

            /** Metadata to add to the message */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    content == other.content &&
                    role == other.role &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{content=$content, role=$role, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /** Messages sent by the model in response to user messages. */
        class Assistant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val role: JsonValue,
            private val content: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            ) : this(role, content, metadata, toolCalls, mutableMapOf())

            /**
             * The role of the messages author, in this case `assistant`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("assistant")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * The contents of the assistant message. Required unless `tool_calls`
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Optional<String> = content.getOptional("content")

            /**
             * Metadata to add to the message
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * The tool calls generated by the model, such as function calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun toolCalls(): Optional<List<ToolCall>> = toolCalls.getOptional("tool_calls")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [toolCalls].
             *
             * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

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

                /** Returns a mutable builder for constructing an instance of [Assistant]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Assistant]. */
            class Builder internal constructor() {

                private var role: JsonValue = JsonValue.from("assistant")
                private var content: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assistant: Assistant) = apply {
                    role = assistant.role
                    content = assistant.content
                    metadata = assistant.metadata
                    toolCalls = assistant.toolCalls.map { it.toMutableList() }
                    additionalProperties = assistant.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("assistant")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** The contents of the assistant message. Required unless `tool_calls` */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /** Metadata to add to the message */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The tool calls generated by the model, such as function calls. */
                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /**
                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolCall] to [toolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolCall(toolCall: ToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
                        }
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
                 * Returns an immutable instance of [Assistant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Assistant =
                    Assistant(
                        role,
                        content,
                        metadata,
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Assistant = apply {
                if (validated) {
                    return@apply
                }

                _role().let {
                    if (it != JsonValue.from("assistant")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                content()
                metadata().ifPresent { it.validate() }
                toolCalls().ifPresent { it.forEach { it.validate() } }
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
                role.let { if (it == JsonValue.from("assistant")) 1 else 0 } +
                    (if (content.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (toolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** Metadata to add to the message */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /** A call to a function tool created by the model. */
            class ToolCall
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val function: JsonField<Function>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("function")
                    @ExcludeMissing
                    function: JsonField<Function> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(id, function, type, mutableMapOf())

                /**
                 * The ID of the tool call.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The function that the model called.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun function(): Function = function.getRequired("function")

                /**
                 * The type of the tool. Currently, only `function` is supported.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [function].
                 *
                 * Unlike [function], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("function")
                @ExcludeMissing
                fun _function(): JsonField<Function> = function

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
                     * Returns a mutable builder for constructing an instance of [ToolCall].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .function()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ToolCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var function: JsonField<Function>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(toolCall: ToolCall) = apply {
                        id = toolCall.id
                        function = toolCall.function
                        type = toolCall.type
                        additionalProperties = toolCall.additionalProperties.toMutableMap()
                    }

                    /** The ID of the tool call. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The function that the model called. */
                    fun function(function: Function) = function(JsonField.of(function))

                    /**
                     * Sets [Builder.function] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.function] with a well-typed [Function] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun function(function: JsonField<Function>) = apply { this.function = function }

                    /** The type of the tool. Currently, only `function` is supported. */
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
                     * Returns an immutable instance of [ToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .function()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ToolCall =
                        ToolCall(
                            checkRequired("id", id),
                            checkRequired("function", function),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    function().validate()
                    type().validate()
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
                        (function.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** The function that the model called. */
                class Function
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of()
                    ) : this(name, mutableMapOf())

                    /**
                     * The name of the function to call.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                         * Returns a mutable builder for constructing an instance of [Function].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) = apply {
                            name = function.name
                            additionalProperties = function.additionalProperties.toMutableMap()
                        }

                        /** The name of the function to call. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

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
                         * Returns an immutable instance of [Function].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Function =
                            Function(
                                checkRequired("name", name),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
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
                    internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Function &&
                            name == other.name &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{name=$name, additionalProperties=$additionalProperties}"
                }

                /** The type of the tool. Currently, only `function` is supported. */
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

                        @JvmField val FUNCTION = of("function")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        FUNCTION
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
                        FUNCTION,
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
                            FUNCTION -> Value.FUNCTION
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
                            FUNCTION -> Known.FUNCTION
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

                    return other is ToolCall &&
                        id == other.id &&
                        function == other.function &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, function, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Assistant &&
                    role == other.role &&
                    content == other.content &&
                    metadata == other.metadata &&
                    toolCalls == other.toolCalls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(role, content, metadata, toolCalls, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Assistant{role=$role, content=$content, metadata=$metadata, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        class Tool
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val toolCallId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(content, role, toolCallId, metadata, mutableMapOf())

            /**
             * The contents of the tool message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case `tool`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("tool")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * Tool call that this message is responding to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /**
             * Metadata to add to the message
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * .content()
                 * .toolCallId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tool]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("tool")
                private var toolCallId: JsonField<String>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tool: Tool) = apply {
                    content = tool.content
                    role = tool.role
                    toolCallId = tool.toolCallId
                    metadata = tool.metadata
                    additionalProperties = tool.additionalProperties.toMutableMap()
                }

                /** The contents of the tool message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("tool")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Tool call that this message is responding to. */
                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
                }

                /** Metadata to add to the message */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * .content()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tool =
                    Tool(
                        checkRequired("content", content),
                        role,
                        checkRequired("toolCallId", toolCallId),
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tool = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("tool")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                toolCallId()
                metadata().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("tool")) 1 else 0 } +
                    (if (toolCallId.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0)

            /** Metadata to add to the message */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tool &&
                    content == other.content &&
                    role == other.role &&
                    toolCallId == other.toolCallId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, toolCallId, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tool{content=$content, role=$role, toolCallId=$toolCallId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        class System
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(content, role, metadata, mutableMapOf())

            /**
             * The contents of the system message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case `system`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("system")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * Metadata to add to the message
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [System].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [System]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("system")
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(system: System) = apply {
                    content = system.content
                    role = system.role
                    metadata = system.metadata
                    additionalProperties = system.additionalProperties.toMutableMap()
                }

                /** The contents of the system message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("system")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Metadata to add to the message */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [System].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): System =
                    System(
                        checkRequired("content", content),
                        role,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): System = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("system")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                metadata().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("system")) 1 else 0 } +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0)

            /** Metadata to add to the message */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is System &&
                    content == other.content &&
                    role == other.role &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "System{content=$content, role=$role, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        class Developer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(content, role, metadata, mutableMapOf())

            /**
             * The contents of the developer message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case developer.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("developer")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * Metadata to add to the message
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [Developer].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Developer]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("developer")
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(developer: Developer) = apply {
                    content = developer.content
                    role = developer.role
                    metadata = developer.metadata
                    additionalProperties = developer.additionalProperties.toMutableMap()
                }

                /** The contents of the developer message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("developer")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Metadata to add to the message */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [Developer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Developer =
                    Developer(
                        checkRequired("content", content),
                        role,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Developer = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("developer")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                metadata().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("developer")) 1 else 0 } +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0)

            /** Metadata to add to the message */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Developer &&
                    content == other.content &&
                    role == other.role &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Developer{content=$content, role=$role, metadata=$metadata, additionalProperties=$additionalProperties}"
        }
    }

    class Participant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val role: JsonField<Role>,
        private val name: JsonField<String>,
        private val onHangup: JsonField<OnHangup>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("on_hangup")
            @ExcludeMissing
            onHangup: JsonField<OnHangup> = JsonMissing.of(),
        ) : this(id, role, name, onHangup, mutableMapOf())

        /**
         * The call_control_id of the participant to add to the conversation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The role of the participant in the conversation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun role(): Role = role.getRequired("role")

        /**
         * Display name for the participant.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Determines what happens to the conversation when this participant hangs up.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onHangup(): Optional<OnHangup> = onHangup.getOptional("on_hangup")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [onHangup].
         *
         * Unlike [onHangup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_hangup") @ExcludeMissing fun _onHangup(): JsonField<OnHangup> = onHangup

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
             * Returns a mutable builder for constructing an instance of [Participant].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .role()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Participant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var role: JsonField<Role>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var onHangup: JsonField<OnHangup> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(participant: Participant) = apply {
                id = participant.id
                role = participant.role
                name = participant.name
                onHangup = participant.onHangup
                additionalProperties = participant.additionalProperties.toMutableMap()
            }

            /** The call_control_id of the participant to add to the conversation. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The role of the participant in the conversation. */
            fun role(role: Role) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<Role>) = apply { this.role = role }

            /** Display name for the participant. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Determines what happens to the conversation when this participant hangs up. */
            fun onHangup(onHangup: OnHangup) = onHangup(JsonField.of(onHangup))

            /**
             * Sets [Builder.onHangup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onHangup] with a well-typed [OnHangup] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onHangup(onHangup: JsonField<OnHangup>) = apply { this.onHangup = onHangup }

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
             * Returns an immutable instance of [Participant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .role()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Participant =
                Participant(
                    checkRequired("id", id),
                    checkRequired("role", role),
                    name,
                    onHangup,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Participant = apply {
            if (validated) {
                return@apply
            }

            id()
            role().validate()
            name()
            onHangup().ifPresent { it.validate() }
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
                (role.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (onHangup.asKnown().getOrNull()?.validity() ?: 0)

        /** The role of the participant in the conversation. */
        class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val USER = of("user")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                USER
            }

            /**
             * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Role] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USER,
                /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                    USER -> Value.USER
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
                    USER -> Known.USER
                    else -> throw TelnyxInvalidDataException("Unknown Role: $value")
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

            fun validate(): Role = apply {
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

                return other is Role && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Determines what happens to the conversation when this participant hangs up. */
        class OnHangup @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CONTINUE_CONVERSATION = of("continue_conversation")

                @JvmField val END_CONVERSATION = of("end_conversation")

                @JvmStatic fun of(value: String) = OnHangup(JsonField.of(value))
            }

            /** An enum containing [OnHangup]'s known values. */
            enum class Known {
                CONTINUE_CONVERSATION,
                END_CONVERSATION,
            }

            /**
             * An enum containing [OnHangup]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OnHangup] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONTINUE_CONVERSATION,
                END_CONVERSATION,
                /**
                 * An enum member indicating that [OnHangup] was instantiated with an unknown value.
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
                    CONTINUE_CONVERSATION -> Value.CONTINUE_CONVERSATION
                    END_CONVERSATION -> Value.END_CONVERSATION
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
                    CONTINUE_CONVERSATION -> Known.CONTINUE_CONVERSATION
                    END_CONVERSATION -> Known.END_CONVERSATION
                    else -> throw TelnyxInvalidDataException("Unknown OnHangup: $value")
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

            fun validate(): OnHangup = apply {
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

                return other is OnHangup && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Participant &&
                id == other.id &&
                role == other.role &&
                name == other.name &&
                onHangup == other.onHangup &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, role, name, onHangup, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Participant{id=$id, role=$role, name=$name, onHangup=$onHangup, additionalProperties=$additionalProperties}"
    }

    /** The settings associated with the voice selected */
    @JsonDeserialize(using = VoiceSettings.Deserializer::class)
    @JsonSerialize(using = VoiceSettings.Serializer::class)
    class VoiceSettings
    private constructor(
        private val elevenlabs: ElevenLabsVoiceSettings? = null,
        private val telnyx: TelnyxVoiceSettings? = null,
        private val aws: AwsVoiceSettings? = null,
        private val azure: AzureVoiceSettings? = null,
        private val rime: RimeVoiceSettings? = null,
        private val resemble: ResembleVoiceSettings? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun azure(): Optional<AzureVoiceSettings> = Optional.ofNullable(azure)

        fun rime(): Optional<RimeVoiceSettings> = Optional.ofNullable(rime)

        fun resemble(): Optional<ResembleVoiceSettings> = Optional.ofNullable(resemble)

        fun isElevenlabs(): Boolean = elevenlabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun isAzure(): Boolean = azure != null

        fun isRime(): Boolean = rime != null

        fun isResemble(): Boolean = resemble != null

        fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun asAzure(): AzureVoiceSettings = azure.getOrThrow("azure")

        fun asRime(): RimeVoiceSettings = rime.getOrThrow("rime")

        fun asResemble(): ResembleVoiceSettings = resemble.getOrThrow("resemble")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                aws != null -> visitor.visitAws(aws)
                azure != null -> visitor.visitAzure(azure)
                rime != null -> visitor.visitRime(rime)
                resemble != null -> visitor.visitResemble(resemble)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): VoiceSettings = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings) {
                        elevenlabs.validate()
                    }

                    override fun visitTelnyx(telnyx: TelnyxVoiceSettings) {
                        telnyx.validate()
                    }

                    override fun visitAws(aws: AwsVoiceSettings) {
                        aws.validate()
                    }

                    override fun visitAzure(azure: AzureVoiceSettings) {
                        azure.validate()
                    }

                    override fun visitRime(rime: RimeVoiceSettings) {
                        rime.validate()
                    }

                    override fun visitResemble(resemble: ResembleVoiceSettings) {
                        resemble.validate()
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
                    override fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                        elevenlabs.validity()

                    override fun visitTelnyx(telnyx: TelnyxVoiceSettings) = telnyx.validity()

                    override fun visitAws(aws: AwsVoiceSettings) = aws.validity()

                    override fun visitAzure(azure: AzureVoiceSettings) = azure.validity()

                    override fun visitRime(rime: RimeVoiceSettings) = rime.validity()

                    override fun visitResemble(resemble: ResembleVoiceSettings) =
                        resemble.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoiceSettings &&
                elevenlabs == other.elevenlabs &&
                telnyx == other.telnyx &&
                aws == other.aws &&
                azure == other.azure &&
                rime == other.rime &&
                resemble == other.resemble
        }

        override fun hashCode(): Int = Objects.hash(elevenlabs, telnyx, aws, azure, rime, resemble)

        override fun toString(): String =
            when {
                elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                azure != null -> "VoiceSettings{azure=$azure}"
                rime != null -> "VoiceSettings{rime=$rime}"
                resemble != null -> "VoiceSettings{resemble=$resemble}"
                _json != null -> "VoiceSettings{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid VoiceSettings")
            }

        companion object {

            @JvmStatic
            fun ofElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                VoiceSettings(elevenlabs = elevenlabs)

            @JvmStatic fun ofTelnyx(telnyx: TelnyxVoiceSettings) = VoiceSettings(telnyx = telnyx)

            @JvmStatic fun ofAws(aws: AwsVoiceSettings) = VoiceSettings(aws = aws)

            @JvmStatic fun ofAzure(azure: AzureVoiceSettings) = VoiceSettings(azure = azure)

            @JvmStatic fun ofRime(rime: RimeVoiceSettings) = VoiceSettings(rime = rime)

            @JvmStatic
            fun ofResemble(resemble: ResembleVoiceSettings) = VoiceSettings(resemble = resemble)
        }

        /**
         * An interface that defines how to map each variant of [VoiceSettings] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings): T

            fun visitTelnyx(telnyx: TelnyxVoiceSettings): T

            fun visitAws(aws: AwsVoiceSettings): T

            fun visitAzure(azure: AzureVoiceSettings): T

            fun visitRime(rime: RimeVoiceSettings): T

            fun visitResemble(resemble: ResembleVoiceSettings): T

            /**
             * Maps an unknown variant of [VoiceSettings] to a value of type [T].
             *
             * An instance of [VoiceSettings] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown VoiceSettings: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<VoiceSettings>(VoiceSettings::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): VoiceSettings {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "elevenlabs" -> {
                        return tryDeserialize(node, jacksonTypeRef<ElevenLabsVoiceSettings>())
                            ?.let { VoiceSettings(elevenlabs = it, _json = json) }
                            ?: VoiceSettings(_json = json)
                    }
                    "telnyx" -> {
                        return tryDeserialize(node, jacksonTypeRef<TelnyxVoiceSettings>())?.let {
                            VoiceSettings(telnyx = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                    "aws" -> {
                        return tryDeserialize(node, jacksonTypeRef<AwsVoiceSettings>())?.let {
                            VoiceSettings(aws = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                    "azure" -> {
                        return tryDeserialize(node, jacksonTypeRef<AzureVoiceSettings>())?.let {
                            VoiceSettings(azure = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                    "rime" -> {
                        return tryDeserialize(node, jacksonTypeRef<RimeVoiceSettings>())?.let {
                            VoiceSettings(rime = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                    "resemble" -> {
                        return tryDeserialize(node, jacksonTypeRef<ResembleVoiceSettings>())?.let {
                            VoiceSettings(resemble = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                }

                return VoiceSettings(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<VoiceSettings>(VoiceSettings::class) {

            override fun serialize(
                value: VoiceSettings,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.elevenlabs != null -> generator.writeObject(value.elevenlabs)
                    value.telnyx != null -> generator.writeObject(value.telnyx)
                    value.aws != null -> generator.writeObject(value.aws)
                    value.azure != null -> generator.writeObject(value.azure)
                    value.rime != null -> generator.writeObject(value.rime)
                    value.resemble != null -> generator.writeObject(value.resemble)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid VoiceSettings")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartAiAssistantParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartAiAssistantParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
