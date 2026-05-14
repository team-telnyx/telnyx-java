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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Start a Conversation Relay session on an active call. Conversation Relay connects the call audio
 * to your WebSocket so your application can exchange realtime messages with the caller while Telnyx
 * handles speech recognition and text-to-speech. Only one AI Assistant or Conversation Relay
 * session can be active on a call at a time.
 *
 * **Expected Webhooks:**
 * - `conversation_relay.disconnected`
 */
class ActionStartConversationRelayParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conversationRelayUrl(): String = body.conversationRelayUrl()

    /**
     * Custom parameters for the Conversation Relay session. Pass key-value data as
     * `assistant.dynamic_variables` to make it available to the relay session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistant(): Optional<Assistant> = body.assistant()

    /**
     * Use this field to add state to subsequent webhooks. It must be a valid Base-64 encoded
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
     * Enable DTMF detection for the relay session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationRelayDtmfDetection(): Optional<Boolean> = body.conversationRelayDtmfDetection()

    /**
     * Text played when the relay session starts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun greeting(): Optional<String> = body.greeting()

    /**
     * Settings for handling caller interruptions during Conversation Relay speech.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptionSettings(): Optional<InterruptionSettings> = body.interruptionSettings()

    /**
     * Default language for the relay session. This value is used for both text-to-speech and speech
     * recognition unless `tts_language` or `transcription_language` are provided.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * Language-specific TTS and transcription settings. Use this when the relay session needs
     * per-language provider, voice, or speech model configuration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languages(): Optional<List<Language>> = body.languages()

    /**
     * Participants to add to the conversation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<Participant>> = body.participants()

    /**
     * When true, sends message history update webhooks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendMessageHistoryUpdates(): Optional<Boolean> = body.sendMessageHistoryUpdates()

    /**
     * Speech-to-text settings for Conversation Relay.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcription(): Optional<Transcription> = body.transcription()

    /**
     * Language to use for speech recognition. Overrides `language` for transcription when provided.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionLanguage(): Optional<String> = body.transcriptionLanguage()

    /**
     * Language to use for text-to-speech. Overrides `language` for TTS when provided.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttsLanguage(): Optional<String> = body.ttsLanguage()

    /**
     * Time in milliseconds to wait for caller input before timing out.
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
     * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
     *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
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
     * Returns the raw JSON value of [conversationRelayUrl].
     *
     * Unlike [conversationRelayUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conversationRelayUrl(): JsonField<String> = body._conversationRelayUrl()

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
     * Returns the raw JSON value of [conversationRelayDtmfDetection].
     *
     * Unlike [conversationRelayDtmfDetection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conversationRelayDtmfDetection(): JsonField<Boolean> =
        body._conversationRelayDtmfDetection()

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
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [languages].
     *
     * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _languages(): JsonField<List<Language>> = body._languages()

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
    fun _transcription(): JsonField<Transcription> = body._transcription()

    /**
     * Returns the raw JSON value of [transcriptionLanguage].
     *
     * Unlike [transcriptionLanguage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transcriptionLanguage(): JsonField<String> = body._transcriptionLanguage()

    /**
     * Returns the raw JSON value of [ttsLanguage].
     *
     * Unlike [ttsLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ttsLanguage(): JsonField<String> = body._ttsLanguage()

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
         * Returns a mutable builder for constructing an instance of
         * [ActionStartConversationRelayParams].
         *
         * The following fields are required:
         * ```java
         * .conversationRelayUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartConversationRelayParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartConversationRelayParams: ActionStartConversationRelayParams) =
            apply {
                callControlId = actionStartConversationRelayParams.callControlId
                body = actionStartConversationRelayParams.body.toBuilder()
                additionalHeaders = actionStartConversationRelayParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    actionStartConversationRelayParams.additionalQueryParams.toBuilder()
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
         * - [conversationRelayUrl]
         * - [assistant]
         * - [clientState]
         * - [commandId]
         * - [conversationRelayDtmfDetection]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
         */
        fun conversationRelayUrl(conversationRelayUrl: String) = apply {
            body.conversationRelayUrl(conversationRelayUrl)
        }

        /**
         * Sets [Builder.conversationRelayUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationRelayUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationRelayUrl(conversationRelayUrl: JsonField<String>) = apply {
            body.conversationRelayUrl(conversationRelayUrl)
        }

        /**
         * Custom parameters for the Conversation Relay session. Pass key-value data as
         * `assistant.dynamic_variables` to make it available to the relay session.
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
         * Use this field to add state to subsequent webhooks. It must be a valid Base-64 encoded
         * string.
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

        /** Enable DTMF detection for the relay session. */
        fun conversationRelayDtmfDetection(conversationRelayDtmfDetection: Boolean) = apply {
            body.conversationRelayDtmfDetection(conversationRelayDtmfDetection)
        }

        /**
         * Sets [Builder.conversationRelayDtmfDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationRelayDtmfDetection] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun conversationRelayDtmfDetection(conversationRelayDtmfDetection: JsonField<Boolean>) =
            apply {
                body.conversationRelayDtmfDetection(conversationRelayDtmfDetection)
            }

        /** Text played when the relay session starts. */
        fun greeting(greeting: String) = apply { body.greeting(greeting) }

        /**
         * Sets [Builder.greeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.greeting] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun greeting(greeting: JsonField<String>) = apply { body.greeting(greeting) }

        /** Settings for handling caller interruptions during Conversation Relay speech. */
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
         * Default language for the relay session. This value is used for both text-to-speech and
         * speech recognition unless `tts_language` or `transcription_language` are provided.
         */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        /**
         * Language-specific TTS and transcription settings. Use this when the relay session needs
         * per-language provider, voice, or speech model configuration.
         */
        fun languages(languages: List<Language>) = apply { body.languages(languages) }

        /**
         * Sets [Builder.languages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languages] with a well-typed `List<Language>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun languages(languages: JsonField<List<Language>>) = apply { body.languages(languages) }

        /**
         * Adds a single [Language] to [languages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLanguage(language: Language) = apply { body.addLanguage(language) }

        /** Participants to add to the conversation. */
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

        /** When true, sends message history update webhooks. */
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

        /** Speech-to-text settings for Conversation Relay. */
        fun transcription(transcription: Transcription) = apply {
            body.transcription(transcription)
        }

        /**
         * Sets [Builder.transcription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcription] with a well-typed [Transcription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transcription(transcription: JsonField<Transcription>) = apply {
            body.transcription(transcription)
        }

        /**
         * Language to use for speech recognition. Overrides `language` for transcription when
         * provided.
         */
        fun transcriptionLanguage(transcriptionLanguage: String) = apply {
            body.transcriptionLanguage(transcriptionLanguage)
        }

        /**
         * Sets [Builder.transcriptionLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transcriptionLanguage(transcriptionLanguage: JsonField<String>) = apply {
            body.transcriptionLanguage(transcriptionLanguage)
        }

        /** Language to use for text-to-speech. Overrides `language` for TTS when provided. */
        fun ttsLanguage(ttsLanguage: String) = apply { body.ttsLanguage(ttsLanguage) }

        /**
         * Sets [Builder.ttsLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttsLanguage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ttsLanguage(ttsLanguage: JsonField<String>) = apply { body.ttsLanguage(ttsLanguage) }

        /** Time in milliseconds to wait for caller input before timing out. */
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
         * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
         *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
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
        fun voiceSettings(xai: VoiceSettings.Xai) = apply { body.voiceSettings(xai) }

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
         * Returns an immutable instance of [ActionStartConversationRelayParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .conversationRelayUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionStartConversationRelayParams =
            ActionStartConversationRelayParams(
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
        private val conversationRelayUrl: JsonField<String>,
        private val assistant: JsonField<Assistant>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val conversationRelayDtmfDetection: JsonField<Boolean>,
        private val greeting: JsonField<String>,
        private val interruptionSettings: JsonField<InterruptionSettings>,
        private val language: JsonField<String>,
        private val languages: JsonField<List<Language>>,
        private val participants: JsonField<List<Participant>>,
        private val sendMessageHistoryUpdates: JsonField<Boolean>,
        private val transcription: JsonField<Transcription>,
        private val transcriptionLanguage: JsonField<String>,
        private val ttsLanguage: JsonField<String>,
        private val userResponseTimeoutMs: JsonField<Long>,
        private val voice: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("conversation_relay_url")
            @ExcludeMissing
            conversationRelayUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assistant")
            @ExcludeMissing
            assistant: JsonField<Assistant> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conversation_relay_dtmf_detection")
            @ExcludeMissing
            conversationRelayDtmfDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interruption_settings")
            @ExcludeMissing
            interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("languages")
            @ExcludeMissing
            languages: JsonField<List<Language>> = JsonMissing.of(),
            @JsonProperty("participants")
            @ExcludeMissing
            participants: JsonField<List<Participant>> = JsonMissing.of(),
            @JsonProperty("send_message_history_updates")
            @ExcludeMissing
            sendMessageHistoryUpdates: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<Transcription> = JsonMissing.of(),
            @JsonProperty("transcription_language")
            @ExcludeMissing
            transcriptionLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tts_language")
            @ExcludeMissing
            ttsLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_response_timeout_ms")
            @ExcludeMissing
            userResponseTimeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            conversationRelayUrl,
            assistant,
            clientState,
            commandId,
            conversationRelayDtmfDetection,
            greeting,
            interruptionSettings,
            language,
            languages,
            participants,
            sendMessageHistoryUpdates,
            transcription,
            transcriptionLanguage,
            ttsLanguage,
            userResponseTimeoutMs,
            voice,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun conversationRelayUrl(): String =
            conversationRelayUrl.getRequired("conversation_relay_url")

        /**
         * Custom parameters for the Conversation Relay session. Pass key-value data as
         * `assistant.dynamic_variables` to make it available to the relay session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assistant(): Optional<Assistant> = assistant.getOptional("assistant")

        /**
         * Use this field to add state to subsequent webhooks. It must be a valid Base-64 encoded
         * string.
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
         * Enable DTMF detection for the relay session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationRelayDtmfDetection(): Optional<Boolean> =
            conversationRelayDtmfDetection.getOptional("conversation_relay_dtmf_detection")

        /**
         * Text played when the relay session starts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greeting(): Optional<String> = greeting.getOptional("greeting")

        /**
         * Settings for handling caller interruptions during Conversation Relay speech.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptionSettings(): Optional<InterruptionSettings> =
            interruptionSettings.getOptional("interruption_settings")

        /**
         * Default language for the relay session. This value is used for both text-to-speech and
         * speech recognition unless `tts_language` or `transcription_language` are provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Language-specific TTS and transcription settings. Use this when the relay session needs
         * per-language provider, voice, or speech model configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languages(): Optional<List<Language>> = languages.getOptional("languages")

        /**
         * Participants to add to the conversation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun participants(): Optional<List<Participant>> = participants.getOptional("participants")

        /**
         * When true, sends message history update webhooks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendMessageHistoryUpdates(): Optional<Boolean> =
            sendMessageHistoryUpdates.getOptional("send_message_history_updates")

        /**
         * Speech-to-text settings for Conversation Relay.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcription(): Optional<Transcription> = transcription.getOptional("transcription")

        /**
         * Language to use for speech recognition. Overrides `language` for transcription when
         * provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionLanguage(): Optional<String> =
            transcriptionLanguage.getOptional("transcription_language")

        /**
         * Language to use for text-to-speech. Overrides `language` for TTS when provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttsLanguage(): Optional<String> = ttsLanguage.getOptional("tts_language")

        /**
         * Time in milliseconds to wait for caller input before timing out.
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
         * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
         *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
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
         * Returns the raw JSON value of [conversationRelayUrl].
         *
         * Unlike [conversationRelayUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_relay_url")
        @ExcludeMissing
        fun _conversationRelayUrl(): JsonField<String> = conversationRelayUrl

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
         * Returns the raw JSON value of [conversationRelayDtmfDetection].
         *
         * Unlike [conversationRelayDtmfDetection], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("conversation_relay_dtmf_detection")
        @ExcludeMissing
        fun _conversationRelayDtmfDetection(): JsonField<Boolean> = conversationRelayDtmfDetection

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
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [languages].
         *
         * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("languages")
        @ExcludeMissing
        fun _languages(): JsonField<List<Language>> = languages

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
        fun _transcription(): JsonField<Transcription> = transcription

        /**
         * Returns the raw JSON value of [transcriptionLanguage].
         *
         * Unlike [transcriptionLanguage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_language")
        @ExcludeMissing
        fun _transcriptionLanguage(): JsonField<String> = transcriptionLanguage

        /**
         * Returns the raw JSON value of [ttsLanguage].
         *
         * Unlike [ttsLanguage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tts_language")
        @ExcludeMissing
        fun _ttsLanguage(): JsonField<String> = ttsLanguage

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
             * .conversationRelayUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var conversationRelayUrl: JsonField<String>? = null
            private var assistant: JsonField<Assistant> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var conversationRelayDtmfDetection: JsonField<Boolean> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var languages: JsonField<MutableList<Language>>? = null
            private var participants: JsonField<MutableList<Participant>>? = null
            private var sendMessageHistoryUpdates: JsonField<Boolean> = JsonMissing.of()
            private var transcription: JsonField<Transcription> = JsonMissing.of()
            private var transcriptionLanguage: JsonField<String> = JsonMissing.of()
            private var ttsLanguage: JsonField<String> = JsonMissing.of()
            private var userResponseTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                conversationRelayUrl = body.conversationRelayUrl
                assistant = body.assistant
                clientState = body.clientState
                commandId = body.commandId
                conversationRelayDtmfDetection = body.conversationRelayDtmfDetection
                greeting = body.greeting
                interruptionSettings = body.interruptionSettings
                language = body.language
                languages = body.languages.map { it.toMutableList() }
                participants = body.participants.map { it.toMutableList() }
                sendMessageHistoryUpdates = body.sendMessageHistoryUpdates
                transcription = body.transcription
                transcriptionLanguage = body.transcriptionLanguage
                ttsLanguage = body.ttsLanguage
                userResponseTimeoutMs = body.userResponseTimeoutMs
                voice = body.voice
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * WebSocket URL for your Conversation Relay server. Must start with `ws://` or
             * `wss://`.
             */
            fun conversationRelayUrl(conversationRelayUrl: String) =
                conversationRelayUrl(JsonField.of(conversationRelayUrl))

            /**
             * Sets [Builder.conversationRelayUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationRelayUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun conversationRelayUrl(conversationRelayUrl: JsonField<String>) = apply {
                this.conversationRelayUrl = conversationRelayUrl
            }

            /**
             * Custom parameters for the Conversation Relay session. Pass key-value data as
             * `assistant.dynamic_variables` to make it available to the relay session.
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
             * Use this field to add state to subsequent webhooks. It must be a valid Base-64
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

            /** Enable DTMF detection for the relay session. */
            fun conversationRelayDtmfDetection(conversationRelayDtmfDetection: Boolean) =
                conversationRelayDtmfDetection(JsonField.of(conversationRelayDtmfDetection))

            /**
             * Sets [Builder.conversationRelayDtmfDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationRelayDtmfDetection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun conversationRelayDtmfDetection(conversationRelayDtmfDetection: JsonField<Boolean>) =
                apply {
                    this.conversationRelayDtmfDetection = conversationRelayDtmfDetection
                }

            /** Text played when the relay session starts. */
            fun greeting(greeting: String) = greeting(JsonField.of(greeting))

            /**
             * Sets [Builder.greeting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greeting] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun greeting(greeting: JsonField<String>) = apply { this.greeting = greeting }

            /** Settings for handling caller interruptions during Conversation Relay speech. */
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
             * Default language for the relay session. This value is used for both text-to-speech
             * and speech recognition unless `tts_language` or `transcription_language` are
             * provided.
             */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * Language-specific TTS and transcription settings. Use this when the relay session
             * needs per-language provider, voice, or speech model configuration.
             */
            fun languages(languages: List<Language>) = languages(JsonField.of(languages))

            /**
             * Sets [Builder.languages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languages] with a well-typed `List<Language>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languages(languages: JsonField<List<Language>>) = apply {
                this.languages = languages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Language] to [languages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLanguage(language: Language) = apply {
                languages =
                    (languages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("languages", it).add(language)
                    }
            }

            /** Participants to add to the conversation. */
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

            /** When true, sends message history update webhooks. */
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

            /** Speech-to-text settings for Conversation Relay. */
            fun transcription(transcription: Transcription) =
                transcription(JsonField.of(transcription))

            /**
             * Sets [Builder.transcription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcription] with a well-typed [Transcription]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transcription(transcription: JsonField<Transcription>) = apply {
                this.transcription = transcription
            }

            /**
             * Language to use for speech recognition. Overrides `language` for transcription when
             * provided.
             */
            fun transcriptionLanguage(transcriptionLanguage: String) =
                transcriptionLanguage(JsonField.of(transcriptionLanguage))

            /**
             * Sets [Builder.transcriptionLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionLanguage] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transcriptionLanguage(transcriptionLanguage: JsonField<String>) = apply {
                this.transcriptionLanguage = transcriptionLanguage
            }

            /** Language to use for text-to-speech. Overrides `language` for TTS when provided. */
            fun ttsLanguage(ttsLanguage: String) = ttsLanguage(JsonField.of(ttsLanguage))

            /**
             * Sets [Builder.ttsLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttsLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttsLanguage(ttsLanguage: JsonField<String>) = apply {
                this.ttsLanguage = ttsLanguage
            }

            /** Time in milliseconds to wait for caller input before timing out. */
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
             * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
             *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
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
            fun voiceSettings(xai: VoiceSettings.Xai) = voiceSettings(VoiceSettings.ofXai(xai))

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
             * .conversationRelayUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("conversationRelayUrl", conversationRelayUrl),
                    assistant,
                    clientState,
                    commandId,
                    conversationRelayDtmfDetection,
                    greeting,
                    interruptionSettings,
                    language,
                    (languages ?: JsonMissing.of()).map { it.toImmutable() },
                    (participants ?: JsonMissing.of()).map { it.toImmutable() },
                    sendMessageHistoryUpdates,
                    transcription,
                    transcriptionLanguage,
                    ttsLanguage,
                    userResponseTimeoutMs,
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

            conversationRelayUrl()
            assistant().ifPresent { it.validate() }
            clientState()
            commandId()
            conversationRelayDtmfDetection()
            greeting()
            interruptionSettings().ifPresent { it.validate() }
            language()
            languages().ifPresent { it.forEach { it.validate() } }
            participants().ifPresent { it.forEach { it.validate() } }
            sendMessageHistoryUpdates()
            transcription().ifPresent { it.validate() }
            transcriptionLanguage()
            ttsLanguage()
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
            (if (conversationRelayUrl.asKnown().isPresent) 1 else 0) +
                (assistant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (conversationRelayDtmfDetection.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sendMessageHistoryUpdates.asKnown().isPresent) 1 else 0) +
                (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transcriptionLanguage.asKnown().isPresent) 1 else 0) +
                (if (ttsLanguage.asKnown().isPresent) 1 else 0) +
                (if (userResponseTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                conversationRelayUrl == other.conversationRelayUrl &&
                assistant == other.assistant &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                conversationRelayDtmfDetection == other.conversationRelayDtmfDetection &&
                greeting == other.greeting &&
                interruptionSettings == other.interruptionSettings &&
                language == other.language &&
                languages == other.languages &&
                participants == other.participants &&
                sendMessageHistoryUpdates == other.sendMessageHistoryUpdates &&
                transcription == other.transcription &&
                transcriptionLanguage == other.transcriptionLanguage &&
                ttsLanguage == other.ttsLanguage &&
                userResponseTimeoutMs == other.userResponseTimeoutMs &&
                voice == other.voice &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                conversationRelayUrl,
                assistant,
                clientState,
                commandId,
                conversationRelayDtmfDetection,
                greeting,
                interruptionSettings,
                language,
                languages,
                participants,
                sendMessageHistoryUpdates,
                transcription,
                transcriptionLanguage,
                ttsLanguage,
                userResponseTimeoutMs,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{conversationRelayUrl=$conversationRelayUrl, assistant=$assistant, clientState=$clientState, commandId=$commandId, conversationRelayDtmfDetection=$conversationRelayDtmfDetection, greeting=$greeting, interruptionSettings=$interruptionSettings, language=$language, languages=$languages, participants=$participants, sendMessageHistoryUpdates=$sendMessageHistoryUpdates, transcription=$transcription, transcriptionLanguage=$transcriptionLanguage, ttsLanguage=$ttsLanguage, userResponseTimeoutMs=$userResponseTimeoutMs, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /**
     * Custom parameters for the Conversation Relay session. Pass key-value data as
     * `assistant.dynamic_variables` to make it available to the relay session.
     */
    class Assistant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dynamicVariables: JsonField<DynamicVariables>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dynamic_variables")
            @ExcludeMissing
            dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        ) : this(dynamicVariables, mutableMapOf())

        /**
         * Custom key-value parameters forwarded to the Conversation Relay session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dynamicVariables(): Optional<DynamicVariables> =
            dynamicVariables.getOptional("dynamic_variables")

        /**
         * Returns the raw JSON value of [dynamicVariables].
         *
         * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        fun _dynamicVariables(): JsonField<DynamicVariables> = dynamicVariables

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

            private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(assistant: Assistant) = apply {
                dynamicVariables = assistant.dynamicVariables
                additionalProperties = assistant.additionalProperties.toMutableMap()
            }

            /** Custom key-value parameters forwarded to the Conversation Relay session. */
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
             */
            fun build(): Assistant =
                Assistant(dynamicVariables, additionalProperties.toMutableMap())
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
        fun validate(): Assistant = apply {
            if (validated) {
                return@apply
            }

            dynamicVariables().ifPresent { it.validate() }
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
        internal fun validity(): Int = (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0)

        /** Custom key-value parameters forwarded to the Conversation Relay session. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Assistant &&
                dynamicVariables == other.dynamicVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(dynamicVariables, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Assistant{dynamicVariables=$dynamicVariables, additionalProperties=$additionalProperties}"
    }

    /** Settings for handling caller interruptions during Conversation Relay speech. */
    class InterruptionSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enable: JsonField<Boolean>,
        private val interruptible: JsonField<Interruptible>,
        private val interruptibleGreeting: JsonField<InterruptibleGreeting>,
        private val welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enable") @ExcludeMissing enable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("interruptible")
            @ExcludeMissing
            interruptible: JsonField<Interruptible> = JsonMissing.of(),
            @JsonProperty("interruptible_greeting")
            @ExcludeMissing
            interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of(),
            @JsonProperty("welcome_greeting_interruptible")
            @ExcludeMissing
            welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible> = JsonMissing.of(),
        ) : this(
            enable,
            interruptible,
            interruptibleGreeting,
            welcomeGreetingInterruptible,
            mutableMapOf(),
        )

        /**
         * Legacy boolean form. `true` is equivalent to `interruptible=any`; `false` is equivalent
         * to `interruptible=none`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enable(): Optional<Boolean> = enable.getOptional("enable")

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptible(): Optional<Interruptible> = interruptible.getOptional("interruptible")

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptibleGreeting(): Optional<InterruptibleGreeting> =
            interruptibleGreeting.getOptional("interruptible_greeting")

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun welcomeGreetingInterruptible(): Optional<WelcomeGreetingInterruptible> =
            welcomeGreetingInterruptible.getOptional("welcome_greeting_interruptible")

        /**
         * Returns the raw JSON value of [enable].
         *
         * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

        /**
         * Returns the raw JSON value of [interruptible].
         *
         * Unlike [interruptible], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interruptible")
        @ExcludeMissing
        fun _interruptible(): JsonField<Interruptible> = interruptible

        /**
         * Returns the raw JSON value of [interruptibleGreeting].
         *
         * Unlike [interruptibleGreeting], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interruptible_greeting")
        @ExcludeMissing
        fun _interruptibleGreeting(): JsonField<InterruptibleGreeting> = interruptibleGreeting

        /**
         * Returns the raw JSON value of [welcomeGreetingInterruptible].
         *
         * Unlike [welcomeGreetingInterruptible], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("welcome_greeting_interruptible")
        @ExcludeMissing
        fun _welcomeGreetingInterruptible(): JsonField<WelcomeGreetingInterruptible> =
            welcomeGreetingInterruptible

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
            private var interruptible: JsonField<Interruptible> = JsonMissing.of()
            private var interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of()
            private var welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interruptionSettings: InterruptionSettings) = apply {
                enable = interruptionSettings.enable
                interruptible = interruptionSettings.interruptible
                interruptibleGreeting = interruptionSettings.interruptibleGreeting
                welcomeGreetingInterruptible = interruptionSettings.welcomeGreetingInterruptible
                additionalProperties = interruptionSettings.additionalProperties.toMutableMap()
            }

            /**
             * Legacy boolean form. `true` is equivalent to `interruptible=any`; `false` is
             * equivalent to `interruptible=none`.
             */
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
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            fun interruptible(interruptible: Interruptible) =
                interruptible(JsonField.of(interruptible))

            /**
             * Sets [Builder.interruptible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptible] with a well-typed [Interruptible]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interruptible(interruptible: JsonField<Interruptible>) = apply {
                this.interruptible = interruptible
            }

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            fun interruptibleGreeting(interruptibleGreeting: InterruptibleGreeting) =
                interruptibleGreeting(JsonField.of(interruptibleGreeting))

            /**
             * Sets [Builder.interruptibleGreeting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptibleGreeting] with a well-typed
             * [InterruptibleGreeting] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun interruptibleGreeting(interruptibleGreeting: JsonField<InterruptibleGreeting>) =
                apply {
                    this.interruptibleGreeting = interruptibleGreeting
                }

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            fun welcomeGreetingInterruptible(
                welcomeGreetingInterruptible: WelcomeGreetingInterruptible
            ) = welcomeGreetingInterruptible(JsonField.of(welcomeGreetingInterruptible))

            /**
             * Sets [Builder.welcomeGreetingInterruptible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.welcomeGreetingInterruptible] with a well-typed
             * [WelcomeGreetingInterruptible] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun welcomeGreetingInterruptible(
                welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible>
            ) = apply { this.welcomeGreetingInterruptible = welcomeGreetingInterruptible }

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
                    enable,
                    interruptible,
                    interruptibleGreeting,
                    welcomeGreetingInterruptible,
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

            enable()
            interruptible().ifPresent { it.validate() }
            interruptibleGreeting().ifPresent { it.validate() }
            welcomeGreetingInterruptible().ifPresent { it.validate() }
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
                (interruptible.asKnown().getOrNull()?.validity() ?: 0) +
                (interruptibleGreeting.asKnown().getOrNull()?.validity() ?: 0) +
                (welcomeGreetingInterruptible.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        class Interruptible @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NONE = of("none")

                @JvmField val ANY = of("any")

                @JvmField val SPEECH = of("speech")

                @JvmField val DTMF = of("dtmf")

                @JvmStatic fun of(value: String) = Interruptible(JsonField.of(value))
            }

            /** An enum containing [Interruptible]'s known values. */
            enum class Known {
                NONE,
                ANY,
                SPEECH,
                DTMF,
            }

            /**
             * An enum containing [Interruptible]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Interruptible] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                ANY,
                SPEECH,
                DTMF,
                /**
                 * An enum member indicating that [Interruptible] was instantiated with an unknown
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
                    NONE -> Value.NONE
                    ANY -> Value.ANY
                    SPEECH -> Value.SPEECH
                    DTMF -> Value.DTMF
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
                    NONE -> Known.NONE
                    ANY -> Known.ANY
                    SPEECH -> Known.SPEECH
                    DTMF -> Known.DTMF
                    else -> throw TelnyxInvalidDataException("Unknown Interruptible: $value")
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
            fun validate(): Interruptible = apply {
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

                return other is Interruptible && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        class InterruptibleGreeting
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

                @JvmField val NONE = of("none")

                @JvmField val ANY = of("any")

                @JvmField val SPEECH = of("speech")

                @JvmField val DTMF = of("dtmf")

                @JvmStatic fun of(value: String) = InterruptibleGreeting(JsonField.of(value))
            }

            /** An enum containing [InterruptibleGreeting]'s known values. */
            enum class Known {
                NONE,
                ANY,
                SPEECH,
                DTMF,
            }

            /**
             * An enum containing [InterruptibleGreeting]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [InterruptibleGreeting] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                ANY,
                SPEECH,
                DTMF,
                /**
                 * An enum member indicating that [InterruptibleGreeting] was instantiated with an
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
                    NONE -> Value.NONE
                    ANY -> Value.ANY
                    SPEECH -> Value.SPEECH
                    DTMF -> Value.DTMF
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
                    NONE -> Known.NONE
                    ANY -> Known.ANY
                    SPEECH -> Known.SPEECH
                    DTMF -> Known.DTMF
                    else ->
                        throw TelnyxInvalidDataException("Unknown InterruptibleGreeting: $value")
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
            fun validate(): InterruptibleGreeting = apply {
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

                return other is InterruptibleGreeting && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        class WelcomeGreetingInterruptible
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

                @JvmField val NONE = of("none")

                @JvmField val ANY = of("any")

                @JvmField val SPEECH = of("speech")

                @JvmField val DTMF = of("dtmf")

                @JvmStatic fun of(value: String) = WelcomeGreetingInterruptible(JsonField.of(value))
            }

            /** An enum containing [WelcomeGreetingInterruptible]'s known values. */
            enum class Known {
                NONE,
                ANY,
                SPEECH,
                DTMF,
            }

            /**
             * An enum containing [WelcomeGreetingInterruptible]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [WelcomeGreetingInterruptible] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                ANY,
                SPEECH,
                DTMF,
                /**
                 * An enum member indicating that [WelcomeGreetingInterruptible] was instantiated
                 * with an unknown value.
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
                    NONE -> Value.NONE
                    ANY -> Value.ANY
                    SPEECH -> Value.SPEECH
                    DTMF -> Value.DTMF
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
                    NONE -> Known.NONE
                    ANY -> Known.ANY
                    SPEECH -> Known.SPEECH
                    DTMF -> Known.DTMF
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown WelcomeGreetingInterruptible: $value"
                        )
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
            fun validate(): WelcomeGreetingInterruptible = apply {
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

                return other is WelcomeGreetingInterruptible && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InterruptionSettings &&
                enable == other.enable &&
                interruptible == other.interruptible &&
                interruptibleGreeting == other.interruptibleGreeting &&
                welcomeGreetingInterruptible == other.welcomeGreetingInterruptible &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                enable,
                interruptible,
                interruptibleGreeting,
                welcomeGreetingInterruptible,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterruptionSettings{enable=$enable, interruptible=$interruptible, interruptibleGreeting=$interruptibleGreeting, welcomeGreetingInterruptible=$welcomeGreetingInterruptible, additionalProperties=$additionalProperties}"
    }

    /** Language-specific speech and transcription settings for Conversation Relay. */
    class Language
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val speechModel: JsonField<String>,
        private val transcriptionProvider: JsonField<String>,
        private val ttsProvider: JsonField<String>,
        private val voice: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("speech_model")
            @ExcludeMissing
            speechModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transcription_provider")
            @ExcludeMissing
            transcriptionProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tts_provider")
            @ExcludeMissing
            ttsProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
        ) : this(code, speechModel, transcriptionProvider, ttsProvider, voice, mutableMapOf())

        /**
         * BCP 47 language code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Speech recognition model for this language.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speechModel(): Optional<String> = speechModel.getOptional("speech_model")

        /**
         * Speech-to-text provider for this language.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionProvider(): Optional<String> =
            transcriptionProvider.getOptional("transcription_provider")

        /**
         * Text-to-speech provider for this language.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttsProvider(): Optional<String> = ttsProvider.getOptional("tts_provider")

        /**
         * Voice identifier for this language.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [speechModel].
         *
         * Unlike [speechModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("speech_model")
        @ExcludeMissing
        fun _speechModel(): JsonField<String> = speechModel

        /**
         * Returns the raw JSON value of [transcriptionProvider].
         *
         * Unlike [transcriptionProvider], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_provider")
        @ExcludeMissing
        fun _transcriptionProvider(): JsonField<String> = transcriptionProvider

        /**
         * Returns the raw JSON value of [ttsProvider].
         *
         * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tts_provider")
        @ExcludeMissing
        fun _ttsProvider(): JsonField<String> = ttsProvider

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

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

            /** Returns a mutable builder for constructing an instance of [Language]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Language]. */
        class Builder internal constructor() {

            private var code: JsonField<String> = JsonMissing.of()
            private var speechModel: JsonField<String> = JsonMissing.of()
            private var transcriptionProvider: JsonField<String> = JsonMissing.of()
            private var ttsProvider: JsonField<String> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(language: Language) = apply {
                code = language.code
                speechModel = language.speechModel
                transcriptionProvider = language.transcriptionProvider
                ttsProvider = language.ttsProvider
                voice = language.voice
                additionalProperties = language.additionalProperties.toMutableMap()
            }

            /** BCP 47 language code. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Speech recognition model for this language. */
            fun speechModel(speechModel: String) = speechModel(JsonField.of(speechModel))

            /**
             * Sets [Builder.speechModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speechModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speechModel(speechModel: JsonField<String>) = apply {
                this.speechModel = speechModel
            }

            /** Speech-to-text provider for this language. */
            fun transcriptionProvider(transcriptionProvider: String) =
                transcriptionProvider(JsonField.of(transcriptionProvider))

            /**
             * Sets [Builder.transcriptionProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionProvider] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transcriptionProvider(transcriptionProvider: JsonField<String>) = apply {
                this.transcriptionProvider = transcriptionProvider
            }

            /** Text-to-speech provider for this language. */
            fun ttsProvider(ttsProvider: String) = ttsProvider(JsonField.of(ttsProvider))

            /**
             * Sets [Builder.ttsProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttsProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttsProvider(ttsProvider: JsonField<String>) = apply {
                this.ttsProvider = ttsProvider
            }

            /** Voice identifier for this language. */
            fun voice(voice: String) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<String>) = apply { this.voice = voice }

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
             * Returns an immutable instance of [Language].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Language =
                Language(
                    code,
                    speechModel,
                    transcriptionProvider,
                    ttsProvider,
                    voice,
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
        fun validate(): Language = apply {
            if (validated) {
                return@apply
            }

            code()
            speechModel()
            transcriptionProvider()
            ttsProvider()
            voice()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (speechModel.asKnown().isPresent) 1 else 0) +
                (if (transcriptionProvider.asKnown().isPresent) 1 else 0) +
                (if (ttsProvider.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Language &&
                code == other.code &&
                speechModel == other.speechModel &&
                transcriptionProvider == other.transcriptionProvider &&
                ttsProvider == other.ttsProvider &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                code,
                speechModel,
                transcriptionProvider,
                ttsProvider,
                voice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Language{code=$code, speechModel=$speechModel, transcriptionProvider=$transcriptionProvider, ttsProvider=$ttsProvider, voice=$voice, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** Speech-to-text settings for Conversation Relay. */
    class Transcription
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val language: JsonField<String>,
        private val model: JsonField<String>,
        private val provider: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        ) : this(language, model, provider, mutableMapOf())

        /**
         * Transcription language.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Transcription model to use.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Transcription provider to use.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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

            /** Returns a mutable builder for constructing an instance of [Transcription]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transcription]. */
        class Builder internal constructor() {

            private var language: JsonField<String> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transcription: Transcription) = apply {
                language = transcription.language
                model = transcription.model
                provider = transcription.provider
                additionalProperties = transcription.additionalProperties.toMutableMap()
            }

            /** Transcription language. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Transcription model to use. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Transcription provider to use. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [Transcription].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Transcription =
                Transcription(language, model, provider, additionalProperties.toMutableMap())
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
        fun validate(): Transcription = apply {
            if (validated) {
                return@apply
            }

            language()
            model()
            provider()
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
            (if (language.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transcription &&
                language == other.language &&
                model == other.model &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(language, model, provider, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transcription{language=$language, model=$model, provider=$provider, additionalProperties=$additionalProperties}"
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
        private val xai: Xai? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun azure(): Optional<AzureVoiceSettings> = Optional.ofNullable(azure)

        fun rime(): Optional<RimeVoiceSettings> = Optional.ofNullable(rime)

        fun resemble(): Optional<ResembleVoiceSettings> = Optional.ofNullable(resemble)

        fun xai(): Optional<Xai> = Optional.ofNullable(xai)

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

        fun asXai(): Xai = xai.getOrThrow("xai")

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

                    override fun visitXai(xai: Xai) {
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

                    override fun visitXai(xai: Xai) = xai.validity()

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

            @JvmStatic fun ofXai(xai: Xai) = VoiceSettings(xai = xai)
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

            fun visitXai(xai: Xai): T

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
                        return tryDeserialize(node, jacksonTypeRef<Xai>())?.let {
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

        class Xai
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val language: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
            ) : this(type, language, mutableMapOf())

            /**
             * Voice settings provider type
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("xai")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Language code, or `auto` to detect automatically.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<String> = language.getOptional("language")

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

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

                /** Returns a mutable builder for constructing an instance of [Xai]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Xai]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("xai")
                private var language: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(xai: Xai) = apply {
                    type = xai.type
                    language = xai.language
                    additionalProperties = xai.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("xai")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Language code, or `auto` to detect automatically. */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

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
                 * Returns an immutable instance of [Xai].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Xai = Xai(type, language, additionalProperties.toMutableMap())
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
            fun validate(): Xai = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("xai")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                language()
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
                type.let { if (it == JsonValue.from("xai")) 1 else 0 } +
                    (if (language.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Xai &&
                    type == other.type &&
                    language == other.language &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, language, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Xai{type=$type, language=$language, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartConversationRelayParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartConversationRelayParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
