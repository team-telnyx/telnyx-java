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
import com.telnyx.sdk.models.XaiVoiceSettings
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
 * - `call.conversation.ended` - Sent when the Conversation Relay session ends. If the customer
 *   WebSocket disconnects, the webhook payload `reason` is `customer_disconnect`.
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
     * Conversation Relay connection settings. This object is used by TeXML Call Scripting's
     * `<ConversationRelay>` verb. The `interruptible` and `interruptible_greeting` fields are
     * shorthand for `interruption_settings.interruptible` and
     * `interruption_settings.interruptible_greeting`; use top-level `interruption_settings` for the
     * full interruption settings shape.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationRelaySettings(): Optional<ConversationRelaySettings> =
        body.conversationRelaySettings()

    /**
     * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationRelayUrl(): Optional<String> = body.conversationRelayUrl()

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
     * Returns the raw JSON value of [conversationRelaySettings].
     *
     * Unlike [conversationRelaySettings], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conversationRelaySettings(): JsonField<ConversationRelaySettings> =
        body._conversationRelaySettings()

    /**
     * Returns the raw JSON value of [conversationRelayUrl].
     *
     * Unlike [conversationRelayUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conversationRelayUrl(): JsonField<String> = body._conversationRelayUrl()

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

        @JvmStatic fun none(): ActionStartConversationRelayParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionStartConversationRelayParams].
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
         * - [assistant]
         * - [clientState]
         * - [commandId]
         * - [conversationRelayDtmfDetection]
         * - [conversationRelaySettings]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        /**
         * Conversation Relay connection settings. This object is used by TeXML Call Scripting's
         * `<ConversationRelay>` verb. The `interruptible` and `interruptible_greeting` fields are
         * shorthand for `interruption_settings.interruptible` and
         * `interruption_settings.interruptible_greeting`; use top-level `interruption_settings` for
         * the full interruption settings shape.
         */
        fun conversationRelaySettings(conversationRelaySettings: ConversationRelaySettings) =
            apply {
                body.conversationRelaySettings(conversationRelaySettings)
            }

        /**
         * Sets [Builder.conversationRelaySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationRelaySettings] with a well-typed
         * [ConversationRelaySettings] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun conversationRelaySettings(
            conversationRelaySettings: JsonField<ConversationRelaySettings>
        ) = apply { body.conversationRelaySettings(conversationRelaySettings) }

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
         * Returns an immutable instance of [ActionStartConversationRelayParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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

    /**
     * Start a Conversation Relay session. Provide either `conversation_relay_url` or
     * `conversation_relay_settings.url`; when both nested and top-level equivalents are provided,
     * top-level values take precedence as described on `conversation_relay_settings`.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assistant: JsonField<Assistant>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val conversationRelayDtmfDetection: JsonField<Boolean>,
        private val conversationRelaySettings: JsonField<ConversationRelaySettings>,
        private val conversationRelayUrl: JsonField<String>,
        private val greeting: JsonField<String>,
        private val interruptionSettings: JsonField<InterruptionSettings>,
        private val language: JsonField<String>,
        private val languages: JsonField<List<Language>>,
        private val transcription: JsonField<Transcription>,
        private val transcriptionLanguage: JsonField<String>,
        private val ttsLanguage: JsonField<String>,
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
            @JsonProperty("conversation_relay_dtmf_detection")
            @ExcludeMissing
            conversationRelayDtmfDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("conversation_relay_settings")
            @ExcludeMissing
            conversationRelaySettings: JsonField<ConversationRelaySettings> = JsonMissing.of(),
            @JsonProperty("conversation_relay_url")
            @ExcludeMissing
            conversationRelayUrl: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<Transcription> = JsonMissing.of(),
            @JsonProperty("transcription_language")
            @ExcludeMissing
            transcriptionLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tts_language")
            @ExcludeMissing
            ttsLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            assistant,
            clientState,
            commandId,
            conversationRelayDtmfDetection,
            conversationRelaySettings,
            conversationRelayUrl,
            greeting,
            interruptionSettings,
            language,
            languages,
            transcription,
            transcriptionLanguage,
            ttsLanguage,
            voice,
            voiceSettings,
            mutableMapOf(),
        )

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
         * Conversation Relay connection settings. This object is used by TeXML Call Scripting's
         * `<ConversationRelay>` verb. The `interruptible` and `interruptible_greeting` fields are
         * shorthand for `interruption_settings.interruptible` and
         * `interruption_settings.interruptible_greeting`; use top-level `interruption_settings` for
         * the full interruption settings shape.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationRelaySettings(): Optional<ConversationRelaySettings> =
            conversationRelaySettings.getOptional("conversation_relay_settings")

        /**
         * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationRelayUrl(): Optional<String> =
            conversationRelayUrl.getOptional("conversation_relay_url")

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
         * Returns the raw JSON value of [conversationRelaySettings].
         *
         * Unlike [conversationRelaySettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_relay_settings")
        @ExcludeMissing
        fun _conversationRelaySettings(): JsonField<ConversationRelaySettings> =
            conversationRelaySettings

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
            private var conversationRelayDtmfDetection: JsonField<Boolean> = JsonMissing.of()
            private var conversationRelaySettings: JsonField<ConversationRelaySettings> =
                JsonMissing.of()
            private var conversationRelayUrl: JsonField<String> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var languages: JsonField<MutableList<Language>>? = null
            private var transcription: JsonField<Transcription> = JsonMissing.of()
            private var transcriptionLanguage: JsonField<String> = JsonMissing.of()
            private var ttsLanguage: JsonField<String> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assistant = body.assistant
                clientState = body.clientState
                commandId = body.commandId
                conversationRelayDtmfDetection = body.conversationRelayDtmfDetection
                conversationRelaySettings = body.conversationRelaySettings
                conversationRelayUrl = body.conversationRelayUrl
                greeting = body.greeting
                interruptionSettings = body.interruptionSettings
                language = body.language
                languages = body.languages.map { it.toMutableList() }
                transcription = body.transcription
                transcriptionLanguage = body.transcriptionLanguage
                ttsLanguage = body.ttsLanguage
                voice = body.voice
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /**
             * Conversation Relay connection settings. This object is used by TeXML Call Scripting's
             * `<ConversationRelay>` verb. The `interruptible` and `interruptible_greeting` fields
             * are shorthand for `interruption_settings.interruptible` and
             * `interruption_settings.interruptible_greeting`; use top-level `interruption_settings`
             * for the full interruption settings shape.
             */
            fun conversationRelaySettings(conversationRelaySettings: ConversationRelaySettings) =
                conversationRelaySettings(JsonField.of(conversationRelaySettings))

            /**
             * Sets [Builder.conversationRelaySettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationRelaySettings] with a well-typed
             * [ConversationRelaySettings] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun conversationRelaySettings(
                conversationRelaySettings: JsonField<ConversationRelaySettings>
            ) = apply { this.conversationRelaySettings = conversationRelaySettings }

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
                    conversationRelayDtmfDetection,
                    conversationRelaySettings,
                    conversationRelayUrl,
                    greeting,
                    interruptionSettings,
                    language,
                    (languages ?: JsonMissing.of()).map { it.toImmutable() },
                    transcription,
                    transcriptionLanguage,
                    ttsLanguage,
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
            conversationRelayDtmfDetection()
            conversationRelaySettings().ifPresent { it.validate() }
            conversationRelayUrl()
            greeting()
            interruptionSettings().ifPresent { it.validate() }
            language()
            languages().ifPresent { it.forEach { it.validate() } }
            transcription().ifPresent { it.validate() }
            transcriptionLanguage()
            ttsLanguage()
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
                (if (conversationRelayDtmfDetection.asKnown().isPresent) 1 else 0) +
                (conversationRelaySettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (conversationRelayUrl.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transcriptionLanguage.asKnown().isPresent) 1 else 0) +
                (if (ttsLanguage.asKnown().isPresent) 1 else 0) +
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
                conversationRelayDtmfDetection == other.conversationRelayDtmfDetection &&
                conversationRelaySettings == other.conversationRelaySettings &&
                conversationRelayUrl == other.conversationRelayUrl &&
                greeting == other.greeting &&
                interruptionSettings == other.interruptionSettings &&
                language == other.language &&
                languages == other.languages &&
                transcription == other.transcription &&
                transcriptionLanguage == other.transcriptionLanguage &&
                ttsLanguage == other.ttsLanguage &&
                voice == other.voice &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assistant,
                clientState,
                commandId,
                conversationRelayDtmfDetection,
                conversationRelaySettings,
                conversationRelayUrl,
                greeting,
                interruptionSettings,
                language,
                languages,
                transcription,
                transcriptionLanguage,
                ttsLanguage,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assistant=$assistant, clientState=$clientState, commandId=$commandId, conversationRelayDtmfDetection=$conversationRelayDtmfDetection, conversationRelaySettings=$conversationRelaySettings, conversationRelayUrl=$conversationRelayUrl, greeting=$greeting, interruptionSettings=$interruptionSettings, language=$language, languages=$languages, transcription=$transcription, transcriptionLanguage=$transcriptionLanguage, ttsLanguage=$ttsLanguage, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
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

    /**
     * Conversation Relay connection settings. This object is used by TeXML Call Scripting's
     * `<ConversationRelay>` verb. The `interruptible` and `interruptible_greeting` fields are
     * shorthand for `interruption_settings.interruptible` and
     * `interruption_settings.interruptible_greeting`; use top-level `interruption_settings` for the
     * full interruption settings shape.
     */
    class ConversationRelaySettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val dtmfDetection: JsonField<Boolean>,
        private val interruptible: JsonField<Interruptible>,
        private val interruptibleGreeting: JsonField<InterruptibleGreeting>,
        private val languages: JsonField<List<Language>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dtmf_detection")
            @ExcludeMissing
            dtmfDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("interruptible")
            @ExcludeMissing
            interruptible: JsonField<Interruptible> = JsonMissing.of(),
            @JsonProperty("interruptible_greeting")
            @ExcludeMissing
            interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of(),
            @JsonProperty("languages")
            @ExcludeMissing
            languages: JsonField<List<Language>> = JsonMissing.of(),
        ) : this(
            url,
            dtmfDetection,
            interruptible,
            interruptibleGreeting,
            languages,
            mutableMapOf(),
        )

        /**
         * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Whether to enable DTMF detection during the relay session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtmfDetection(): Optional<Boolean> = dtmfDetection.getOptional("dtmf_detection")

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
         * Language-specific TTS and transcription settings.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languages(): Optional<List<Language>> = languages.getOptional("languages")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [dtmfDetection].
         *
         * Unlike [dtmfDetection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dtmf_detection")
        @ExcludeMissing
        fun _dtmfDetection(): JsonField<Boolean> = dtmfDetection

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
         * Returns the raw JSON value of [languages].
         *
         * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("languages")
        @ExcludeMissing
        fun _languages(): JsonField<List<Language>> = languages

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
             * [ConversationRelaySettings].
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConversationRelaySettings]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var dtmfDetection: JsonField<Boolean> = JsonMissing.of()
            private var interruptible: JsonField<Interruptible> = JsonMissing.of()
            private var interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of()
            private var languages: JsonField<MutableList<Language>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conversationRelaySettings: ConversationRelaySettings) = apply {
                url = conversationRelaySettings.url
                dtmfDetection = conversationRelaySettings.dtmfDetection
                interruptible = conversationRelaySettings.interruptible
                interruptibleGreeting = conversationRelaySettings.interruptibleGreeting
                languages = conversationRelaySettings.languages.map { it.toMutableList() }
                additionalProperties = conversationRelaySettings.additionalProperties.toMutableMap()
            }

            /**
             * WebSocket URL for your Conversation Relay server. Must start with `ws://` or
             * `wss://`.
             */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Whether to enable DTMF detection during the relay session. */
            fun dtmfDetection(dtmfDetection: Boolean) = dtmfDetection(JsonField.of(dtmfDetection))

            /**
             * Sets [Builder.dtmfDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtmfDetection] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtmfDetection(dtmfDetection: JsonField<Boolean>) = apply {
                this.dtmfDetection = dtmfDetection
            }

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

            /** Language-specific TTS and transcription settings. */
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
             * Returns an immutable instance of [ConversationRelaySettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConversationRelaySettings =
                ConversationRelaySettings(
                    checkRequired("url", url),
                    dtmfDetection,
                    interruptible,
                    interruptibleGreeting,
                    (languages ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): ConversationRelaySettings = apply {
            if (validated) {
                return@apply
            }

            url()
            dtmfDetection()
            interruptible().ifPresent { it.validate() }
            interruptibleGreeting().ifPresent { it.validate() }
            languages().ifPresent { it.forEach { it.validate() } }
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (if (dtmfDetection.asKnown().isPresent) 1 else 0) +
                (interruptible.asKnown().getOrNull()?.validity() ?: 0) +
                (interruptibleGreeting.asKnown().getOrNull()?.validity() ?: 0) +
                (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun code(): Optional<String> = code.getOptional("code")

            /**
             * Speech recognition model for this language.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun speechModel(): Optional<String> = speechModel.getOptional("speech_model")

            /**
             * Speech-to-text provider for this language.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionProvider(): Optional<String> =
                transcriptionProvider.getOptional("transcription_provider")

            /**
             * Text-to-speech provider for this language.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ttsProvider(): Optional<String> = ttsProvider.getOptional("tts_provider")

            /**
             * Voice identifier for this language.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [speechModel], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** Speech recognition model for this language. */
                fun speechModel(speechModel: String) = speechModel(JsonField.of(speechModel))

                /**
                 * Sets [Builder.speechModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.speechModel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.transcriptionProvider] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConversationRelaySettings &&
                url == other.url &&
                dtmfDetection == other.dtmfDetection &&
                interruptible == other.interruptible &&
                interruptibleGreeting == other.interruptibleGreeting &&
                languages == other.languages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                url,
                dtmfDetection,
                interruptible,
                interruptibleGreeting,
                languages,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConversationRelaySettings{url=$url, dtmfDetection=$dtmfDetection, interruptible=$interruptible, interruptibleGreeting=$interruptibleGreeting, languages=$languages, additionalProperties=$additionalProperties}"
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
