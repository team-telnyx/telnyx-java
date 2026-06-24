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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.AzureVoiceSettings
import com.telnyx.sdk.models.ResembleVoiceSettings
import com.telnyx.sdk.models.RimeVoiceSettings
import com.telnyx.sdk.models.XaiVoiceSettings
import com.telnyx.sdk.models.calls.CallAssistantRequest
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
    fun assistant(): Optional<CallAssistantRequest> = body.assistant()

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
    fun participants(): Optional<List<AiAssistantJoinParticipant>> = body.participants()

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
     *   `Inworld.Max.Oliver`, `Inworld.TTS2.Loretta`). Supported models: `Mini`, `Max`, `TTS2`.
     * - **xAI:** Use `xAI.<VoiceId>` (e.g., `xAI.eve`). Available voices: `eve`, `ara`, `rex`,
     *   `sal`, `leo`.
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
    fun _assistant(): JsonField<CallAssistantRequest> = body._assistant()

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
    fun _participants(): JsonField<List<AiAssistantJoinParticipant>> = body._participants()

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
        fun assistant(assistant: CallAssistantRequest) = apply { body.assistant(assistant) }

        /**
         * Sets [Builder.assistant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistant] with a well-typed [CallAssistantRequest]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun assistant(assistant: JsonField<CallAssistantRequest>) = apply {
            body.assistant(assistant)
        }

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
        fun addMessageHistory(user: UserMessage) = apply { body.addMessageHistory(user) }

        /**
         * Alias for calling [addMessageHistory] with the following:
         * ```java
         * UserMessage.builder()
         *     .role(UserMessage.Role.USER)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessageHistory(content: String) = apply { body.addUserMessageHistory(content) }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofAssistant(assistant)`. */
        fun addMessageHistory(assistant: AssistantMessage) = apply {
            body.addMessageHistory(assistant)
        }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofTool(tool)`. */
        fun addMessageHistory(tool: ToolMessage) = apply { body.addMessageHistory(tool) }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofSystem(system)`. */
        fun addMessageHistory(system: SystemMessage) = apply { body.addMessageHistory(system) }

        /**
         * Alias for calling [addMessageHistory] with the following:
         * ```java
         * SystemMessage.builder()
         *     .role(SystemMessage.Role.SYSTEM)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessageHistory(content: String) = apply {
            body.addSystemMessageHistory(content)
        }

        /** Alias for calling [addMessageHistory] with `MessageHistory.ofDeveloper(developer)`. */
        fun addMessageHistory(developer: DeveloperMessage) = apply {
            body.addMessageHistory(developer)
        }

        /**
         * Alias for calling [addMessageHistory] with the following:
         * ```java
         * DeveloperMessage.builder()
         *     .role(DeveloperMessage.Role.DEVELOPER)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addDeveloperMessageHistory(content: String) = apply {
            body.addDeveloperMessageHistory(content)
        }

        /** A list of participants to add to the conversation when it starts. */
        fun participants(participants: List<AiAssistantJoinParticipant>) = apply {
            body.participants(participants)
        }

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed
         * `List<AiAssistantJoinParticipant>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun participants(participants: JsonField<List<AiAssistantJoinParticipant>>) = apply {
            body.participants(participants)
        }

        /**
         * Adds a single [AiAssistantJoinParticipant] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: AiAssistantJoinParticipant) = apply {
            body.addParticipant(participant)
        }

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
         *   `Inworld.Max.Oliver`, `Inworld.TTS2.Loretta`). Supported models: `Mini`, `Max`, `TTS2`.
         * - **xAI:** Use `xAI.<VoiceId>` (e.g., `xAI.eve`). Available voices: `eve`, `ara`, `rex`,
         *   `sal`, `leo`.
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

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofXai(xai)`. */
        fun voiceSettings(xai: XaiVoiceSettings) = apply { body.voiceSettings(xai) }

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
        private val assistant: JsonField<CallAssistantRequest>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val greeting: JsonField<String>,
        private val interruptionSettings: JsonField<InterruptionSettings>,
        private val messageHistory: JsonField<List<MessageHistory>>,
        private val participants: JsonField<List<AiAssistantJoinParticipant>>,
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
            assistant: JsonField<CallAssistantRequest> = JsonMissing.of(),
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
            participants: JsonField<List<AiAssistantJoinParticipant>> = JsonMissing.of(),
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
        fun assistant(): Optional<CallAssistantRequest> = assistant.getOptional("assistant")

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
        fun participants(): Optional<List<AiAssistantJoinParticipant>> =
            participants.getOptional("participants")

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
         *   `Inworld.Max.Oliver`, `Inworld.TTS2.Loretta`). Supported models: `Mini`, `Max`, `TTS2`.
         * - **xAI:** Use `xAI.<VoiceId>` (e.g., `xAI.eve`). Available voices: `eve`, `ara`, `rex`,
         *   `sal`, `leo`.
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
        fun _assistant(): JsonField<CallAssistantRequest> = assistant

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
        fun _participants(): JsonField<List<AiAssistantJoinParticipant>> = participants

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

            private var assistant: JsonField<CallAssistantRequest> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
            private var messageHistory: JsonField<MutableList<MessageHistory>>? = null
            private var participants: JsonField<MutableList<AiAssistantJoinParticipant>>? = null
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
            fun assistant(assistant: CallAssistantRequest) = assistant(JsonField.of(assistant))

            /**
             * Sets [Builder.assistant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assistant] with a well-typed [CallAssistantRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun assistant(assistant: JsonField<CallAssistantRequest>) = apply {
                this.assistant = assistant
            }

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
            fun addMessageHistory(user: UserMessage) =
                addMessageHistory(MessageHistory.ofUser(user))

            /**
             * Alias for calling [addMessageHistory] with the following:
             * ```java
             * UserMessage.builder()
             *     .role(UserMessage.Role.USER)
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserMessageHistory(content: String) =
                addMessageHistory(
                    UserMessage.builder().role(UserMessage.Role.USER).content(content).build()
                )

            /**
             * Alias for calling [addMessageHistory] with `MessageHistory.ofAssistant(assistant)`.
             */
            fun addMessageHistory(assistant: AssistantMessage) =
                addMessageHistory(MessageHistory.ofAssistant(assistant))

            /** Alias for calling [addMessageHistory] with `MessageHistory.ofTool(tool)`. */
            fun addMessageHistory(tool: ToolMessage) =
                addMessageHistory(MessageHistory.ofTool(tool))

            /** Alias for calling [addMessageHistory] with `MessageHistory.ofSystem(system)`. */
            fun addMessageHistory(system: SystemMessage) =
                addMessageHistory(MessageHistory.ofSystem(system))

            /**
             * Alias for calling [addMessageHistory] with the following:
             * ```java
             * SystemMessage.builder()
             *     .role(SystemMessage.Role.SYSTEM)
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemMessageHistory(content: String) =
                addMessageHistory(
                    SystemMessage.builder().role(SystemMessage.Role.SYSTEM).content(content).build()
                )

            /**
             * Alias for calling [addMessageHistory] with `MessageHistory.ofDeveloper(developer)`.
             */
            fun addMessageHistory(developer: DeveloperMessage) =
                addMessageHistory(MessageHistory.ofDeveloper(developer))

            /**
             * Alias for calling [addMessageHistory] with the following:
             * ```java
             * DeveloperMessage.builder()
             *     .role(DeveloperMessage.Role.DEVELOPER)
             *     .content(content)
             *     .build()
             * ```
             */
            fun addDeveloperMessageHistory(content: String) =
                addMessageHistory(
                    DeveloperMessage.builder()
                        .role(DeveloperMessage.Role.DEVELOPER)
                        .content(content)
                        .build()
                )

            /** A list of participants to add to the conversation when it starts. */
            fun participants(participants: List<AiAssistantJoinParticipant>) =
                participants(JsonField.of(participants))

            /**
             * Sets [Builder.participants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participants] with a well-typed
             * `List<AiAssistantJoinParticipant>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun participants(participants: JsonField<List<AiAssistantJoinParticipant>>) = apply {
                this.participants = participants.map { it.toMutableList() }
            }

            /**
             * Adds a single [AiAssistantJoinParticipant] to [participants].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParticipant(participant: AiAssistantJoinParticipant) = apply {
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
             *   `Inworld.Max.Oliver`, `Inworld.TTS2.Loretta`). Supported models: `Mini`, `Max`,
             *   `TTS2`.
             * - **xAI:** Use `xAI.<VoiceId>` (e.g., `xAI.eve`). Available voices: `eve`, `ara`,
             *   `rex`, `sal`, `leo`.
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

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofXai(xai)`. */
            fun voiceSettings(xai: XaiVoiceSettings) = voiceSettings(VoiceSettings.ofXai(xai))

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** Messages sent by an end user */
    @JsonDeserialize(using = MessageHistory.Deserializer::class)
    @JsonSerialize(using = MessageHistory.Serializer::class)
    class MessageHistory
    private constructor(
        private val user: UserMessage? = null,
        private val assistant: AssistantMessage? = null,
        private val tool: ToolMessage? = null,
        private val system: SystemMessage? = null,
        private val developer: DeveloperMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Messages sent by an end user */
        fun user(): Optional<UserMessage> = Optional.ofNullable(user)

        /** Messages sent by the model in response to user messages. */
        fun assistant(): Optional<AssistantMessage> = Optional.ofNullable(assistant)

        fun tool(): Optional<ToolMessage> = Optional.ofNullable(tool)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun system(): Optional<SystemMessage> = Optional.ofNullable(system)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun developer(): Optional<DeveloperMessage> = Optional.ofNullable(developer)

        fun isUser(): Boolean = user != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isSystem(): Boolean = system != null

        fun isDeveloper(): Boolean = developer != null

        /** Messages sent by an end user */
        fun asUser(): UserMessage = user.getOrThrow("user")

        /** Messages sent by the model in response to user messages. */
        fun asAssistant(): AssistantMessage = assistant.getOrThrow("assistant")

        fun asTool(): ToolMessage = tool.getOrThrow("tool")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asSystem(): SystemMessage = system.getOrThrow("system")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asDeveloper(): DeveloperMessage = developer.getOrThrow("developer")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = messageHistory.accept(new MessageHistory.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUser(UserMessage user) {
         *         return Optional.of(user.toString());
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): MessageHistory = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: UserMessage) {
                        user.validate()
                    }

                    override fun visitAssistant(assistant: AssistantMessage) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: ToolMessage) {
                        tool.validate()
                    }

                    override fun visitSystem(system: SystemMessage) {
                        system.validate()
                    }

                    override fun visitDeveloper(developer: DeveloperMessage) {
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
                    override fun visitUser(user: UserMessage) = user.validity()

                    override fun visitAssistant(assistant: AssistantMessage) = assistant.validity()

                    override fun visitTool(tool: ToolMessage) = tool.validity()

                    override fun visitSystem(system: SystemMessage) = system.validity()

                    override fun visitDeveloper(developer: DeveloperMessage) = developer.validity()

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
            @JvmStatic fun ofUser(user: UserMessage) = MessageHistory(user = user)

            /** Messages sent by the model in response to user messages. */
            @JvmStatic
            fun ofAssistant(assistant: AssistantMessage) = MessageHistory(assistant = assistant)

            @JvmStatic fun ofTool(tool: ToolMessage) = MessageHistory(tool = tool)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofSystem(system: SystemMessage) = MessageHistory(system = system)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic
            fun ofDeveloper(developer: DeveloperMessage) = MessageHistory(developer = developer)
        }

        /**
         * An interface that defines how to map each variant of [MessageHistory] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** Messages sent by an end user */
            fun visitUser(user: UserMessage): T

            /** Messages sent by the model in response to user messages. */
            fun visitAssistant(assistant: AssistantMessage): T

            fun visitTool(tool: ToolMessage): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitSystem(system: SystemMessage): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitDeveloper(developer: DeveloperMessage): T

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
                        return tryDeserialize(node, jacksonTypeRef<UserMessage>())?.let {
                            MessageHistory(user = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<AssistantMessage>())?.let {
                            MessageHistory(assistant = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<ToolMessage>())?.let {
                            MessageHistory(tool = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(node, jacksonTypeRef<SystemMessage>())?.let {
                            MessageHistory(system = it, _json = json)
                        } ?: MessageHistory(_json = json)
                    }
                    "developer" -> {
                        return tryDeserialize(node, jacksonTypeRef<DeveloperMessage>())?.let {
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
        private val xai: XaiVoiceSettings? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun azure(): Optional<AzureVoiceSettings> = Optional.ofNullable(azure)

        fun rime(): Optional<RimeVoiceSettings> = Optional.ofNullable(rime)

        fun resemble(): Optional<ResembleVoiceSettings> = Optional.ofNullable(resemble)

        fun xai(): Optional<XaiVoiceSettings> = Optional.ofNullable(xai)

        fun isElevenlabs(): Boolean = elevenlabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun isAzure(): Boolean = azure != null

        fun isRime(): Boolean = rime != null

        fun isResemble(): Boolean = resemble != null

        fun isXai(): Boolean = xai != null

        fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun asAzure(): AzureVoiceSettings = azure.getOrThrow("azure")

        fun asRime(): RimeVoiceSettings = rime.getOrThrow("rime")

        fun asResemble(): ResembleVoiceSettings = resemble.getOrThrow("resemble")

        fun asXai(): XaiVoiceSettings = xai.getOrThrow("xai")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = voiceSettings.accept(new VoiceSettings.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitElevenlabs(ElevenLabsVoiceSettings elevenlabs) {
         *         return Optional.of(elevenlabs.toString());
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                aws != null -> visitor.visitAws(aws)
                azure != null -> visitor.visitAzure(azure)
                rime != null -> visitor.visitRime(rime)
                resemble != null -> visitor.visitResemble(resemble)
                xai != null -> visitor.visitXai(xai)
                else -> visitor.unknown(_json)
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

                    override fun visitXai(xai: XaiVoiceSettings) {
                        xai.validate()
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

                    override fun visitXai(xai: XaiVoiceSettings) = xai.validity()

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
                resemble == other.resemble &&
                xai == other.xai
        }

        override fun hashCode(): Int =
            Objects.hash(elevenlabs, telnyx, aws, azure, rime, resemble, xai)

        override fun toString(): String =
            when {
                elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                azure != null -> "VoiceSettings{azure=$azure}"
                rime != null -> "VoiceSettings{rime=$rime}"
                resemble != null -> "VoiceSettings{resemble=$resemble}"
                xai != null -> "VoiceSettings{xai=$xai}"
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

            @JvmStatic fun ofXai(xai: XaiVoiceSettings) = VoiceSettings(xai = xai)
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

            fun visitXai(xai: XaiVoiceSettings): T

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
                    "xai" -> {
                        return tryDeserialize(node, jacksonTypeRef<XaiVoiceSettings>())?.let {
                            VoiceSettings(xai = it, _json = json)
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
                    value.xai != null -> generator.writeObject(value.xai)
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
