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
import com.telnyx.sdk.models.ai.assistants.Assistant
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Gather parameters defined in the request payload using a voice assistant.
 *
 * You can pass parameters described as a JSON Schema object and the voice assistant will attempt to
 * gather these informations.
 *
 * **Expected Webhooks:**
 * - `call.ai_gather.ended`
 * - `call.conversation.ended`
 * - `call.ai_gather.partial_results` (if `send_partial_results` is set to `true`)
 * - `call.ai_gather.message_history_updated` (if `send_message_history_updates` is set to `true`)
 */
class ActionGatherUsingAiParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * The parameters described as a JSON Schema object that needs to be gathered by the voice
     * assistant. See the [JSON Schema reference](https://json-schema.org/understanding-json-schema)
     * for documentation about the format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Parameters = body.parameters()

    /**
     * Assistant configuration including choice of LLM, custom instructions, and tools.
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
     * Text that will be played when the gathering has finished. There is a 3,000 character limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gatherEndedSpeech(): Optional<String> = body.gatherEndedSpeech()

    /**
     * Text that will be played when the gathering starts, if none then nothing will be played when
     * the gathering starts. The greeting can be text for any voice or SSML for
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
     * Language to use for speech recognition
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<GoogleTranscriptionLanguage> = body.language()

    /**
     * The message history you want the voice assistant to be aware of, this can be useful to keep
     * the context of the conversation, or to pass additional information to the voice assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageHistory(): Optional<List<MessageHistory>> = body.messageHistory()

    /**
     * Default is `false`. If set to `true`, the voice assistant will send updates to the message
     * history via the `call.ai_gather.message_history_updated` callback in real time as the message
     * history is updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendMessageHistoryUpdates(): Optional<Boolean> = body.sendMessageHistoryUpdates()

    /**
     * Default is `false`. If set to `true`, the voice assistant will send partial results via the
     * `call.ai_gather.partial_results` callback in real time as individual fields are gathered. If
     * set to `false`, the voice assistant will only send the final result via the
     * `call.ai_gather.ended` callback.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendPartialResults(): Optional<Boolean> = body.sendPartialResults()

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
     * The maximum time in milliseconds to wait for user response before timing out.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userResponseTimeoutMs(): Optional<Long> = body.userResponseTimeoutMs()

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
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parameters(): JsonField<Parameters> = body._parameters()

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
     * Returns the raw JSON value of [gatherEndedSpeech].
     *
     * Unlike [gatherEndedSpeech], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _gatherEndedSpeech(): JsonField<String> = body._gatherEndedSpeech()

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
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<GoogleTranscriptionLanguage> = body._language()

    /**
     * Returns the raw JSON value of [messageHistory].
     *
     * Unlike [messageHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageHistory(): JsonField<List<MessageHistory>> = body._messageHistory()

    /**
     * Returns the raw JSON value of [sendMessageHistoryUpdates].
     *
     * Unlike [sendMessageHistoryUpdates], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _sendMessageHistoryUpdates(): JsonField<Boolean> = body._sendMessageHistoryUpdates()

    /**
     * Returns the raw JSON value of [sendPartialResults].
     *
     * Unlike [sendPartialResults], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sendPartialResults(): JsonField<Boolean> = body._sendPartialResults()

    /**
     * Returns the raw JSON value of [transcription].
     *
     * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transcription(): JsonField<TranscriptionConfig> = body._transcription()

    /**
     * Returns the raw JSON value of [userResponseTimeoutMs].
     *
     * Unlike [userResponseTimeoutMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _userResponseTimeoutMs(): JsonField<Long> = body._userResponseTimeoutMs()

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

        /**
         * Returns a mutable builder for constructing an instance of [ActionGatherUsingAiParams].
         *
         * The following fields are required:
         * ```java
         * .parameters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGatherUsingAiParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionGatherUsingAiParams: ActionGatherUsingAiParams) = apply {
            callControlId = actionGatherUsingAiParams.callControlId
            body = actionGatherUsingAiParams.body.toBuilder()
            additionalHeaders = actionGatherUsingAiParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionGatherUsingAiParams.additionalQueryParams.toBuilder()
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
         * - [parameters]
         * - [assistant]
         * - [clientState]
         * - [commandId]
         * - [gatherEndedSpeech]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The parameters described as a JSON Schema object that needs to be gathered by the voice
         * assistant. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         */
        fun parameters(parameters: Parameters) = apply { body.parameters(parameters) }

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { body.parameters(parameters) }

        /** Assistant configuration including choice of LLM, custom instructions, and tools. */
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
         * Text that will be played when the gathering has finished. There is a 3,000 character
         * limit.
         */
        fun gatherEndedSpeech(gatherEndedSpeech: String) = apply {
            body.gatherEndedSpeech(gatherEndedSpeech)
        }

        /**
         * Sets [Builder.gatherEndedSpeech] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatherEndedSpeech] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gatherEndedSpeech(gatherEndedSpeech: JsonField<String>) = apply {
            body.gatherEndedSpeech(gatherEndedSpeech)
        }

        /**
         * Text that will be played when the gathering starts, if none then nothing will be played
         * when the gathering starts. The greeting can be text for any voice or SSML for
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

        /** Language to use for speech recognition */
        fun language(language: GoogleTranscriptionLanguage) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed
         * [GoogleTranscriptionLanguage] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<GoogleTranscriptionLanguage>) = apply {
            body.language(language)
        }

        /**
         * The message history you want the voice assistant to be aware of, this can be useful to
         * keep the context of the conversation, or to pass additional information to the voice
         * assistant.
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

        /**
         * Default is `false`. If set to `true`, the voice assistant will send updates to the
         * message history via the `call.ai_gather.message_history_updated` callback in real time as
         * the message history is updated.
         */
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
         * Default is `false`. If set to `true`, the voice assistant will send partial results via
         * the `call.ai_gather.partial_results` callback in real time as individual fields are
         * gathered. If set to `false`, the voice assistant will only send the final result via the
         * `call.ai_gather.ended` callback.
         */
        fun sendPartialResults(sendPartialResults: Boolean) = apply {
            body.sendPartialResults(sendPartialResults)
        }

        /**
         * Sets [Builder.sendPartialResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendPartialResults] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendPartialResults(sendPartialResults: JsonField<Boolean>) = apply {
            body.sendPartialResults(sendPartialResults)
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

        /** The maximum time in milliseconds to wait for user response before timing out. */
        fun userResponseTimeoutMs(userResponseTimeoutMs: Long) = apply {
            body.userResponseTimeoutMs(userResponseTimeoutMs)
        }

        /**
         * Sets [Builder.userResponseTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userResponseTimeoutMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userResponseTimeoutMs(userResponseTimeoutMs: JsonField<Long>) = apply {
            body.userResponseTimeoutMs(userResponseTimeoutMs)
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
         * Returns an immutable instance of [ActionGatherUsingAiParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .parameters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionGatherUsingAiParams =
            ActionGatherUsingAiParams(
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
        private val parameters: JsonField<Parameters>,
        private val assistant: JsonField<Assistant>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val gatherEndedSpeech: JsonField<String>,
        private val greeting: JsonField<String>,
        private val interruptionSettings: JsonField<InterruptionSettings>,
        private val language: JsonField<GoogleTranscriptionLanguage>,
        private val messageHistory: JsonField<List<MessageHistory>>,
        private val sendMessageHistoryUpdates: JsonField<Boolean>,
        private val sendPartialResults: JsonField<Boolean>,
        private val transcription: JsonField<TranscriptionConfig>,
        private val userResponseTimeoutMs: JsonField<Long>,
        private val voice: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("assistant")
            @ExcludeMissing
            assistant: JsonField<Assistant> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gather_ended_speech")
            @ExcludeMissing
            gatherEndedSpeech: JsonField<String> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interruption_settings")
            @ExcludeMissing
            interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<GoogleTranscriptionLanguage> = JsonMissing.of(),
            @JsonProperty("message_history")
            @ExcludeMissing
            messageHistory: JsonField<List<MessageHistory>> = JsonMissing.of(),
            @JsonProperty("send_message_history_updates")
            @ExcludeMissing
            sendMessageHistoryUpdates: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("send_partial_results")
            @ExcludeMissing
            sendPartialResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<TranscriptionConfig> = JsonMissing.of(),
            @JsonProperty("user_response_timeout_ms")
            @ExcludeMissing
            userResponseTimeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            parameters,
            assistant,
            clientState,
            commandId,
            gatherEndedSpeech,
            greeting,
            interruptionSettings,
            language,
            messageHistory,
            sendMessageHistoryUpdates,
            sendPartialResults,
            transcription,
            userResponseTimeoutMs,
            voice,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * The parameters described as a JSON Schema object that needs to be gathered by the voice
         * assistant. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /**
         * Assistant configuration including choice of LLM, custom instructions, and tools.
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
         * Text that will be played when the gathering has finished. There is a 3,000 character
         * limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gatherEndedSpeech(): Optional<String> =
            gatherEndedSpeech.getOptional("gather_ended_speech")

        /**
         * Text that will be played when the gathering starts, if none then nothing will be played
         * when the gathering starts. The greeting can be text for any voice or SSML for
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
         * Language to use for speech recognition
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<GoogleTranscriptionLanguage> = language.getOptional("language")

        /**
         * The message history you want the voice assistant to be aware of, this can be useful to
         * keep the context of the conversation, or to pass additional information to the voice
         * assistant.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageHistory(): Optional<List<MessageHistory>> =
            messageHistory.getOptional("message_history")

        /**
         * Default is `false`. If set to `true`, the voice assistant will send updates to the
         * message history via the `call.ai_gather.message_history_updated` callback in real time as
         * the message history is updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendMessageHistoryUpdates(): Optional<Boolean> =
            sendMessageHistoryUpdates.getOptional("send_message_history_updates")

        /**
         * Default is `false`. If set to `true`, the voice assistant will send partial results via
         * the `call.ai_gather.partial_results` callback in real time as individual fields are
         * gathered. If set to `false`, the voice assistant will only send the final result via the
         * `call.ai_gather.ended` callback.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendPartialResults(): Optional<Boolean> =
            sendPartialResults.getOptional("send_partial_results")

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
         * The maximum time in milliseconds to wait for user response before timing out.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userResponseTimeoutMs(): Optional<Long> =
            userResponseTimeoutMs.getOptional("user_response_timeout_ms")

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
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

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
         * Returns the raw JSON value of [gatherEndedSpeech].
         *
         * Unlike [gatherEndedSpeech], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gather_ended_speech")
        @ExcludeMissing
        fun _gatherEndedSpeech(): JsonField<String> = gatherEndedSpeech

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
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language")
        @ExcludeMissing
        fun _language(): JsonField<GoogleTranscriptionLanguage> = language

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
         * Returns the raw JSON value of [sendMessageHistoryUpdates].
         *
         * Unlike [sendMessageHistoryUpdates], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("send_message_history_updates")
        @ExcludeMissing
        fun _sendMessageHistoryUpdates(): JsonField<Boolean> = sendMessageHistoryUpdates

        /**
         * Returns the raw JSON value of [sendPartialResults].
         *
         * Unlike [sendPartialResults], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("send_partial_results")
        @ExcludeMissing
        fun _sendPartialResults(): JsonField<Boolean> = sendPartialResults

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
         * Returns the raw JSON value of [userResponseTimeoutMs].
         *
         * Unlike [userResponseTimeoutMs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("user_response_timeout_ms")
        @ExcludeMissing
        fun _userResponseTimeoutMs(): JsonField<Long> = userResponseTimeoutMs

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .parameters()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var parameters: JsonField<Parameters>? = null
            private var assistant: JsonField<Assistant> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var gatherEndedSpeech: JsonField<String> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
            private var language: JsonField<GoogleTranscriptionLanguage> = JsonMissing.of()
            private var messageHistory: JsonField<MutableList<MessageHistory>>? = null
            private var sendMessageHistoryUpdates: JsonField<Boolean> = JsonMissing.of()
            private var sendPartialResults: JsonField<Boolean> = JsonMissing.of()
            private var transcription: JsonField<TranscriptionConfig> = JsonMissing.of()
            private var userResponseTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                parameters = body.parameters
                assistant = body.assistant
                clientState = body.clientState
                commandId = body.commandId
                gatherEndedSpeech = body.gatherEndedSpeech
                greeting = body.greeting
                interruptionSettings = body.interruptionSettings
                language = body.language
                messageHistory = body.messageHistory.map { it.toMutableList() }
                sendMessageHistoryUpdates = body.sendMessageHistoryUpdates
                sendPartialResults = body.sendPartialResults
                transcription = body.transcription
                userResponseTimeoutMs = body.userResponseTimeoutMs
                voice = body.voice
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The parameters described as a JSON Schema object that needs to be gathered by the
             * voice assistant. See the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
             * documentation about the format
             */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /** Assistant configuration including choice of LLM, custom instructions, and tools. */
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
             * Text that will be played when the gathering has finished. There is a 3,000 character
             * limit.
             */
            fun gatherEndedSpeech(gatherEndedSpeech: String) =
                gatherEndedSpeech(JsonField.of(gatherEndedSpeech))

            /**
             * Sets [Builder.gatherEndedSpeech] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gatherEndedSpeech] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gatherEndedSpeech(gatherEndedSpeech: JsonField<String>) = apply {
                this.gatherEndedSpeech = gatherEndedSpeech
            }

            /**
             * Text that will be played when the gathering starts, if none then nothing will be
             * played when the gathering starts. The greeting can be text for any voice or SSML for
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

            /** Language to use for speech recognition */
            fun language(language: GoogleTranscriptionLanguage) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed
             * [GoogleTranscriptionLanguage] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun language(language: JsonField<GoogleTranscriptionLanguage>) = apply {
                this.language = language
            }

            /**
             * The message history you want the voice assistant to be aware of, this can be useful
             * to keep the context of the conversation, or to pass additional information to the
             * voice assistant.
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

            /**
             * Default is `false`. If set to `true`, the voice assistant will send updates to the
             * message history via the `call.ai_gather.message_history_updated` callback in real
             * time as the message history is updated.
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
             * Default is `false`. If set to `true`, the voice assistant will send partial results
             * via the `call.ai_gather.partial_results` callback in real time as individual fields
             * are gathered. If set to `false`, the voice assistant will only send the final result
             * via the `call.ai_gather.ended` callback.
             */
            fun sendPartialResults(sendPartialResults: Boolean) =
                sendPartialResults(JsonField.of(sendPartialResults))

            /**
             * Sets [Builder.sendPartialResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendPartialResults] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendPartialResults(sendPartialResults: JsonField<Boolean>) = apply {
                this.sendPartialResults = sendPartialResults
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

            /** The maximum time in milliseconds to wait for user response before timing out. */
            fun userResponseTimeoutMs(userResponseTimeoutMs: Long) =
                userResponseTimeoutMs(JsonField.of(userResponseTimeoutMs))

            /**
             * Sets [Builder.userResponseTimeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userResponseTimeoutMs] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun userResponseTimeoutMs(userResponseTimeoutMs: JsonField<Long>) = apply {
                this.userResponseTimeoutMs = userResponseTimeoutMs
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
             *
             * The following fields are required:
             * ```java
             * .parameters()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("parameters", parameters),
                    assistant,
                    clientState,
                    commandId,
                    gatherEndedSpeech,
                    greeting,
                    interruptionSettings,
                    language,
                    (messageHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    sendMessageHistoryUpdates,
                    sendPartialResults,
                    transcription,
                    userResponseTimeoutMs,
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

            parameters().validate()
            assistant().ifPresent { it.validate() }
            clientState()
            commandId()
            gatherEndedSpeech()
            greeting()
            interruptionSettings().ifPresent { it.validate() }
            language().ifPresent { it.validate() }
            messageHistory().ifPresent { it.forEach { it.validate() } }
            sendMessageHistoryUpdates()
            sendPartialResults()
            transcription().ifPresent { it.validate() }
            userResponseTimeoutMs()
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
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                (assistant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (gatherEndedSpeech.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (messageHistory.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sendMessageHistoryUpdates.asKnown().isPresent) 1 else 0) +
                (if (sendPartialResults.asKnown().isPresent) 1 else 0) +
                (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userResponseTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                parameters == other.parameters &&
                assistant == other.assistant &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                gatherEndedSpeech == other.gatherEndedSpeech &&
                greeting == other.greeting &&
                interruptionSettings == other.interruptionSettings &&
                language == other.language &&
                messageHistory == other.messageHistory &&
                sendMessageHistoryUpdates == other.sendMessageHistoryUpdates &&
                sendPartialResults == other.sendPartialResults &&
                transcription == other.transcription &&
                userResponseTimeoutMs == other.userResponseTimeoutMs &&
                voice == other.voice &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                parameters,
                assistant,
                clientState,
                commandId,
                gatherEndedSpeech,
                greeting,
                interruptionSettings,
                language,
                messageHistory,
                sendMessageHistoryUpdates,
                sendPartialResults,
                transcription,
                userResponseTimeoutMs,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{parameters=$parameters, assistant=$assistant, clientState=$clientState, commandId=$commandId, gatherEndedSpeech=$gatherEndedSpeech, greeting=$greeting, interruptionSettings=$interruptionSettings, language=$language, messageHistory=$messageHistory, sendMessageHistoryUpdates=$sendMessageHistoryUpdates, sendPartialResults=$sendPartialResults, transcription=$transcription, userResponseTimeoutMs=$userResponseTimeoutMs, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /**
     * The parameters described as a JSON Schema object that needs to be gathered by the voice
     * assistant. See the [JSON Schema reference](https://json-schema.org/understanding-json-schema)
     * for documentation about the format
     */
    class Parameters
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

            /** Returns a mutable builder for constructing an instance of [Parameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                additionalProperties = parameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters = Parameters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Parameters = apply {
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

            return other is Parameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
    }

    class MessageHistory
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val content: JsonField<String>,
        private val role: JsonField<Role>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
        ) : this(content, role, mutableMapOf())

        /**
         * The content of the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * The role of the message sender
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun role(): Optional<Role> = role.getOptional("role")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

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

            /** Returns a mutable builder for constructing an instance of [MessageHistory]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MessageHistory]. */
        class Builder internal constructor() {

            private var content: JsonField<String> = JsonMissing.of()
            private var role: JsonField<Role> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(messageHistory: MessageHistory) = apply {
                content = messageHistory.content
                role = messageHistory.role
                additionalProperties = messageHistory.additionalProperties.toMutableMap()
            }

            /** The content of the message */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** The role of the message sender */
            fun role(role: Role) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<Role>) = apply { this.role = role }

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
             * Returns an immutable instance of [MessageHistory].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MessageHistory =
                MessageHistory(content, role, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): MessageHistory = apply {
            if (validated) {
                return@apply
            }

            content()
            role().ifPresent { it.validate() }
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
                (role.asKnown().getOrNull()?.validity() ?: 0)

        /** The role of the message sender */
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

                @JvmField val ASSISTANT = of("assistant")

                @JvmField val USER = of("user")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                ASSISTANT,
                USER,
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
                ASSISTANT,
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
                    ASSISTANT -> Value.ASSISTANT
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
                    ASSISTANT -> Known.ASSISTANT
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MessageHistory &&
                content == other.content &&
                role == other.role &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(content, role, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MessageHistory{content=$content, role=$role, additionalProperties=$additionalProperties}"
    }

    /** The settings associated with the voice selected */
    @JsonDeserialize(using = VoiceSettings.Deserializer::class)
    @JsonSerialize(using = VoiceSettings.Serializer::class)
    class VoiceSettings
    private constructor(
        private val elevenlabs: ElevenLabsVoiceSettings? = null,
        private val telnyx: TelnyxVoiceSettings? = null,
        private val aws: AwsVoiceSettings? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun isElevenlabs(): Boolean = elevenlabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                aws != null -> visitor.visitAws(aws)
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
                aws == other.aws
        }

        override fun hashCode(): Int = Objects.hash(elevenlabs, telnyx, aws)

        override fun toString(): String =
            when {
                elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                _json != null -> "VoiceSettings{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid VoiceSettings")
            }

        companion object {

            @JvmStatic
            fun ofElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                VoiceSettings(elevenlabs = elevenlabs)

            @JvmStatic fun ofTelnyx(telnyx: TelnyxVoiceSettings) = VoiceSettings(telnyx = telnyx)

            @JvmStatic fun ofAws(aws: AwsVoiceSettings) = VoiceSettings(aws = aws)
        }

        /**
         * An interface that defines how to map each variant of [VoiceSettings] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings): T

            fun visitTelnyx(telnyx: TelnyxVoiceSettings): T

            fun visitAws(aws: AwsVoiceSettings): T

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

        return other is ActionGatherUsingAiParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionGatherUsingAiParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
