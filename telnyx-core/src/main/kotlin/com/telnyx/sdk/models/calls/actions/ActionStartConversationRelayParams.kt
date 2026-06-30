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
import com.telnyx.sdk.models.InworldVoiceSettings
import com.telnyx.sdk.models.MinimaxVoiceSettings
import com.telnyx.sdk.models.ResembleVoiceSettings
import com.telnyx.sdk.models.RimeVoiceSettings
import com.telnyx.sdk.models.XaiVoiceSettings
import com.telnyx.sdk.models.calls.ConversationRelayInterruptionSettings
import com.telnyx.sdk.models.calls.ConversationRelayLanguage
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
     * Conversation Relay connection settings. This object can provide `url`, `dtmf_detection`,
     * `interruptible`, `interruptible_greeting`, and `languages`. Top-level aliases override nested
     * values when both are present.
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
     * Custom key-value parameters forwarded to the relay session as `assistant.dynamic_variables`.
     * If `assistant.dynamic_variables` is also present, these values are merged in.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customParameters(): Optional<CustomParameters> = body.customParameters()

    /**
     * Public alias for `conversation_relay_dtmf_detection`. If both are present, this value wins.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtmfDetection(): Optional<Boolean> = body.dtmfDetection()

    /**
     * Text played when the relay session starts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun greeting(): Optional<String> = body.greeting()

    /**
     * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptible(): Optional<Interruptible> = body.interruptible()

    /**
     * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptibleGreeting(): Optional<InterruptibleGreeting> = body.interruptibleGreeting()

    /**
     * Settings for handling caller interruptions during Conversation Relay speech.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptionSettings(): Optional<ConversationRelayInterruptionSettings> =
        body.interruptionSettings()

    /**
     * Default language for the relay session. This value is used for both text-to-speech and speech
     * recognition.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * Per-language TTS and transcription settings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languages(): Optional<List<ConversationRelayLanguage>> = body.languages()

    /**
     * Structured voice provider. Must be supplied together with `structured_provider`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<String> = body.provider()

    /**
     * Provider-specific structured voice settings. Must be supplied together with `provider`;
     * Telnyx sends the value as the nested provider configuration for Conversation Relay.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun structuredProvider(): Optional<StructuredProvider> = body.structuredProvider()

    /**
     * Not supported for Conversation Relay start requests. Use `transcription_engine` and
     * `transcription_engine_config` instead.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated(
        "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
    )
    fun transcription(): Optional<Transcription> = body.transcription()

    /**
     * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
     * supported for backward compatibility. For Conversation Relay, use this field with
     * `transcription_engine_config`; the `transcription` object is not supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngine(): Optional<TranscriptionEngine> = body.transcriptionEngine()

    /**
     * Engine-specific transcription settings for Conversation Relay. This accepts the same
     * provider-specific options used by the Call Transcription Start command, such as
     * `transcription_model`, without requiring the engine discriminator to be repeated inside this
     * object.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngineConfig(): Optional<TranscriptionEngineConfig> =
        body.transcriptionEngineConfig()

    /**
     * Text-to-speech provider. If omitted, Telnyx derives it from `voice` or `provider`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttsProvider(): Optional<String> = body.ttsProvider()

    /**
     * Public alias for `conversation_relay_url`. Must start with `ws://` or `wss://`. If both are
     * present, this value wins.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

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
     * Returns the raw JSON value of [customParameters].
     *
     * Unlike [customParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customParameters(): JsonField<CustomParameters> = body._customParameters()

    /**
     * Returns the raw JSON value of [dtmfDetection].
     *
     * Unlike [dtmfDetection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dtmfDetection(): JsonField<Boolean> = body._dtmfDetection()

    /**
     * Returns the raw JSON value of [greeting].
     *
     * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _greeting(): JsonField<String> = body._greeting()

    /**
     * Returns the raw JSON value of [interruptible].
     *
     * Unlike [interruptible], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _interruptible(): JsonField<Interruptible> = body._interruptible()

    /**
     * Returns the raw JSON value of [interruptibleGreeting].
     *
     * Unlike [interruptibleGreeting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _interruptibleGreeting(): JsonField<InterruptibleGreeting> = body._interruptibleGreeting()

    /**
     * Returns the raw JSON value of [interruptionSettings].
     *
     * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _interruptionSettings(): JsonField<ConversationRelayInterruptionSettings> =
        body._interruptionSettings()

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
    fun _languages(): JsonField<List<ConversationRelayLanguage>> = body._languages()

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _provider(): JsonField<String> = body._provider()

    /**
     * Returns the raw JSON value of [structuredProvider].
     *
     * Unlike [structuredProvider], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _structuredProvider(): JsonField<StructuredProvider> = body._structuredProvider()

    /**
     * Returns the raw JSON value of [transcription].
     *
     * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated(
        "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
    )
    fun _transcription(): JsonField<Transcription> = body._transcription()

    /**
     * Returns the raw JSON value of [transcriptionEngine].
     *
     * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transcriptionEngine(): JsonField<TranscriptionEngine> = body._transcriptionEngine()

    /**
     * Returns the raw JSON value of [transcriptionEngineConfig].
     *
     * Unlike [transcriptionEngineConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _transcriptionEngineConfig(): JsonField<TranscriptionEngineConfig> =
        body._transcriptionEngineConfig()

    /**
     * Returns the raw JSON value of [ttsProvider].
     *
     * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ttsProvider(): JsonField<String> = body._ttsProvider()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

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
         * Conversation Relay connection settings. This object can provide `url`, `dtmf_detection`,
         * `interruptible`, `interruptible_greeting`, and `languages`. Top-level aliases override
         * nested values when both are present.
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

        /**
         * Custom key-value parameters forwarded to the relay session as
         * `assistant.dynamic_variables`. If `assistant.dynamic_variables` is also present, these
         * values are merged in.
         */
        fun customParameters(customParameters: CustomParameters) = apply {
            body.customParameters(customParameters)
        }

        /**
         * Sets [Builder.customParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customParameters] with a well-typed [CustomParameters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customParameters(customParameters: JsonField<CustomParameters>) = apply {
            body.customParameters(customParameters)
        }

        /**
         * Public alias for `conversation_relay_dtmf_detection`. If both are present, this value
         * wins.
         */
        fun dtmfDetection(dtmfDetection: Boolean) = apply { body.dtmfDetection(dtmfDetection) }

        /**
         * Sets [Builder.dtmfDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtmfDetection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtmfDetection(dtmfDetection: JsonField<Boolean>) = apply {
            body.dtmfDetection(dtmfDetection)
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

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        fun interruptible(interruptible: Interruptible) = apply {
            body.interruptible(interruptible)
        }

        /**
         * Sets [Builder.interruptible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptible] with a well-typed [Interruptible] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interruptible(interruptible: JsonField<Interruptible>) = apply {
            body.interruptible(interruptible)
        }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        fun interruptibleGreeting(interruptibleGreeting: InterruptibleGreeting) = apply {
            body.interruptibleGreeting(interruptibleGreeting)
        }

        /**
         * Sets [Builder.interruptibleGreeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptibleGreeting] with a well-typed
         * [InterruptibleGreeting] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun interruptibleGreeting(interruptibleGreeting: JsonField<InterruptibleGreeting>) = apply {
            body.interruptibleGreeting(interruptibleGreeting)
        }

        /** Settings for handling caller interruptions during Conversation Relay speech. */
        fun interruptionSettings(interruptionSettings: ConversationRelayInterruptionSettings) =
            apply {
                body.interruptionSettings(interruptionSettings)
            }

        /**
         * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptionSettings] with a well-typed
         * [ConversationRelayInterruptionSettings] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun interruptionSettings(
            interruptionSettings: JsonField<ConversationRelayInterruptionSettings>
        ) = apply { body.interruptionSettings(interruptionSettings) }

        /**
         * Default language for the relay session. This value is used for both text-to-speech and
         * speech recognition.
         */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        /** Per-language TTS and transcription settings. */
        fun languages(languages: List<ConversationRelayLanguage>) = apply {
            body.languages(languages)
        }

        /**
         * Sets [Builder.languages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languages] with a well-typed
         * `List<ConversationRelayLanguage>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun languages(languages: JsonField<List<ConversationRelayLanguage>>) = apply {
            body.languages(languages)
        }

        /**
         * Adds a single [ConversationRelayLanguage] to [languages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLanguage(language: ConversationRelayLanguage) = apply { body.addLanguage(language) }

        /** Structured voice provider. Must be supplied together with `structured_provider`. */
        fun provider(provider: String) = apply { body.provider(provider) }

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { body.provider(provider) }

        /**
         * Provider-specific structured voice settings. Must be supplied together with `provider`;
         * Telnyx sends the value as the nested provider configuration for Conversation Relay.
         */
        fun structuredProvider(structuredProvider: StructuredProvider) = apply {
            body.structuredProvider(structuredProvider)
        }

        /**
         * Sets [Builder.structuredProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structuredProvider] with a well-typed
         * [StructuredProvider] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun structuredProvider(structuredProvider: JsonField<StructuredProvider>) = apply {
            body.structuredProvider(structuredProvider)
        }

        /**
         * Not supported for Conversation Relay start requests. Use `transcription_engine` and
         * `transcription_engine_config` instead.
         */
        @Deprecated(
            "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
        )
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
        @Deprecated(
            "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
        )
        fun transcription(transcription: JsonField<Transcription>) = apply {
            body.transcription(transcription)
        }

        /**
         * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
         * supported for backward compatibility. For Conversation Relay, use this field with
         * `transcription_engine_config`; the `transcription` object is not supported.
         */
        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) = apply {
            body.transcriptionEngine(transcriptionEngine)
        }

        /**
         * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEngine] with a well-typed
         * [TranscriptionEngine] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
            body.transcriptionEngine(transcriptionEngine)
        }

        /**
         * Engine-specific transcription settings for Conversation Relay. This accepts the same
         * provider-specific options used by the Call Transcription Start command, such as
         * `transcription_model`, without requiring the engine discriminator to be repeated inside
         * this object.
         */
        fun transcriptionEngineConfig(transcriptionEngineConfig: TranscriptionEngineConfig) =
            apply {
                body.transcriptionEngineConfig(transcriptionEngineConfig)
            }

        /**
         * Sets [Builder.transcriptionEngineConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEngineConfig] with a well-typed
         * [TranscriptionEngineConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun transcriptionEngineConfig(
            transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>
        ) = apply { body.transcriptionEngineConfig(transcriptionEngineConfig) }

        /** Text-to-speech provider. If omitted, Telnyx derives it from `voice` or `provider`. */
        fun ttsProvider(ttsProvider: String) = apply { body.ttsProvider(ttsProvider) }

        /**
         * Sets [Builder.ttsProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttsProvider] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ttsProvider(ttsProvider: JsonField<String>) = apply { body.ttsProvider(ttsProvider) }

        /**
         * Public alias for `conversation_relay_url`. Must start with `ws://` or `wss://`. If both
         * are present, this value wins.
         */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

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

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofMinimax(minimax)`. */
        fun voiceSettings(minimax: MinimaxVoiceSettings) = apply { body.voiceSettings(minimax) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofAzure(azure)`. */
        fun voiceSettings(azure: AzureVoiceSettings) = apply { body.voiceSettings(azure) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
        fun voiceSettings(rime: RimeVoiceSettings) = apply { body.voiceSettings(rime) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
        fun voiceSettings(resemble: ResembleVoiceSettings) = apply { body.voiceSettings(resemble) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofInworld(inworld)`. */
        fun voiceSettings(inworld: InworldVoiceSettings) = apply { body.voiceSettings(inworld) }

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
     * Start a Conversation Relay session. You may provide the WebSocket URL as `url`,
     * `conversation_relay_url`, or `conversation_relay_settings.url`; top-level values take
     * precedence over nested settings. Use `transcription_engine` and `transcription_engine_config`
     * for speech-to-text configuration; the `transcription` object is not supported.
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
        private val customParameters: JsonField<CustomParameters>,
        private val dtmfDetection: JsonField<Boolean>,
        private val greeting: JsonField<String>,
        private val interruptible: JsonField<Interruptible>,
        private val interruptibleGreeting: JsonField<InterruptibleGreeting>,
        private val interruptionSettings: JsonField<ConversationRelayInterruptionSettings>,
        private val language: JsonField<String>,
        private val languages: JsonField<List<ConversationRelayLanguage>>,
        private val provider: JsonField<String>,
        private val structuredProvider: JsonField<StructuredProvider>,
        private val transcription: JsonField<Transcription>,
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>,
        private val ttsProvider: JsonField<String>,
        private val url: JsonField<String>,
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
            @JsonProperty("custom_parameters")
            @ExcludeMissing
            customParameters: JsonField<CustomParameters> = JsonMissing.of(),
            @JsonProperty("dtmf_detection")
            @ExcludeMissing
            dtmfDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interruptible")
            @ExcludeMissing
            interruptible: JsonField<Interruptible> = JsonMissing.of(),
            @JsonProperty("interruptible_greeting")
            @ExcludeMissing
            interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of(),
            @JsonProperty("interruption_settings")
            @ExcludeMissing
            interruptionSettings: JsonField<ConversationRelayInterruptionSettings> =
                JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("languages")
            @ExcludeMissing
            languages: JsonField<List<ConversationRelayLanguage>> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("structured_provider")
            @ExcludeMissing
            structuredProvider: JsonField<StructuredProvider> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<Transcription> = JsonMissing.of(),
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_engine_config")
            @ExcludeMissing
            transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> = JsonMissing.of(),
            @JsonProperty("tts_provider")
            @ExcludeMissing
            ttsProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
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
            customParameters,
            dtmfDetection,
            greeting,
            interruptible,
            interruptibleGreeting,
            interruptionSettings,
            language,
            languages,
            provider,
            structuredProvider,
            transcription,
            transcriptionEngine,
            transcriptionEngineConfig,
            ttsProvider,
            url,
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
         * Conversation Relay connection settings. This object can provide `url`, `dtmf_detection`,
         * `interruptible`, `interruptible_greeting`, and `languages`. Top-level aliases override
         * nested values when both are present.
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
         * Custom key-value parameters forwarded to the relay session as
         * `assistant.dynamic_variables`. If `assistant.dynamic_variables` is also present, these
         * values are merged in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customParameters(): Optional<CustomParameters> =
            customParameters.getOptional("custom_parameters")

        /**
         * Public alias for `conversation_relay_dtmf_detection`. If both are present, this value
         * wins.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtmfDetection(): Optional<Boolean> = dtmfDetection.getOptional("dtmf_detection")

        /**
         * Text played when the relay session starts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greeting(): Optional<String> = greeting.getOptional("greeting")

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
         * Settings for handling caller interruptions during Conversation Relay speech.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptionSettings(): Optional<ConversationRelayInterruptionSettings> =
            interruptionSettings.getOptional("interruption_settings")

        /**
         * Default language for the relay session. This value is used for both text-to-speech and
         * speech recognition.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Per-language TTS and transcription settings.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languages(): Optional<List<ConversationRelayLanguage>> =
            languages.getOptional("languages")

        /**
         * Structured voice provider. Must be supplied together with `structured_provider`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * Provider-specific structured voice settings. Must be supplied together with `provider`;
         * Telnyx sends the value as the nested provider configuration for Conversation Relay.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun structuredProvider(): Optional<StructuredProvider> =
            structuredProvider.getOptional("structured_provider")

        /**
         * Not supported for Conversation Relay start requests. Use `transcription_engine` and
         * `transcription_engine_config` instead.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated(
            "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
        )
        fun transcription(): Optional<Transcription> = transcription.getOptional("transcription")

        /**
         * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
         * supported for backward compatibility. For Conversation Relay, use this field with
         * `transcription_engine_config`; the `transcription` object is not supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionEngine(): Optional<TranscriptionEngine> =
            transcriptionEngine.getOptional("transcription_engine")

        /**
         * Engine-specific transcription settings for Conversation Relay. This accepts the same
         * provider-specific options used by the Call Transcription Start command, such as
         * `transcription_model`, without requiring the engine discriminator to be repeated inside
         * this object.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionEngineConfig(): Optional<TranscriptionEngineConfig> =
            transcriptionEngineConfig.getOptional("transcription_engine_config")

        /**
         * Text-to-speech provider. If omitted, Telnyx derives it from `voice` or `provider`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttsProvider(): Optional<String> = ttsProvider.getOptional("tts_provider")

        /**
         * Public alias for `conversation_relay_url`. Must start with `ws://` or `wss://`. If both
         * are present, this value wins.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

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
         * Returns the raw JSON value of [customParameters].
         *
         * Unlike [customParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_parameters")
        @ExcludeMissing
        fun _customParameters(): JsonField<CustomParameters> = customParameters

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
         * Returns the raw JSON value of [greeting].
         *
         * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<String> = greeting

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
         * Returns the raw JSON value of [interruptionSettings].
         *
         * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interruption_settings")
        @ExcludeMissing
        fun _interruptionSettings(): JsonField<ConversationRelayInterruptionSettings> =
            interruptionSettings

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
        fun _languages(): JsonField<List<ConversationRelayLanguage>> = languages

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [structuredProvider].
         *
         * Unlike [structuredProvider], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("structured_provider")
        @ExcludeMissing
        fun _structuredProvider(): JsonField<StructuredProvider> = structuredProvider

        /**
         * Returns the raw JSON value of [transcription].
         *
         * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated(
            "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
        )
        @JsonProperty("transcription")
        @ExcludeMissing
        fun _transcription(): JsonField<Transcription> = transcription

        /**
         * Returns the raw JSON value of [transcriptionEngine].
         *
         * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

        /**
         * Returns the raw JSON value of [transcriptionEngineConfig].
         *
         * Unlike [transcriptionEngineConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine_config")
        @ExcludeMissing
        fun _transcriptionEngineConfig(): JsonField<TranscriptionEngineConfig> =
            transcriptionEngineConfig

        /**
         * Returns the raw JSON value of [ttsProvider].
         *
         * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tts_provider")
        @ExcludeMissing
        fun _ttsProvider(): JsonField<String> = ttsProvider

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
            private var customParameters: JsonField<CustomParameters> = JsonMissing.of()
            private var dtmfDetection: JsonField<Boolean> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptible: JsonField<Interruptible> = JsonMissing.of()
            private var interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of()
            private var interruptionSettings: JsonField<ConversationRelayInterruptionSettings> =
                JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var languages: JsonField<MutableList<ConversationRelayLanguage>>? = null
            private var provider: JsonField<String> = JsonMissing.of()
            private var structuredProvider: JsonField<StructuredProvider> = JsonMissing.of()
            private var transcription: JsonField<Transcription> = JsonMissing.of()
            private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
            private var transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> =
                JsonMissing.of()
            private var ttsProvider: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
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
                customParameters = body.customParameters
                dtmfDetection = body.dtmfDetection
                greeting = body.greeting
                interruptible = body.interruptible
                interruptibleGreeting = body.interruptibleGreeting
                interruptionSettings = body.interruptionSettings
                language = body.language
                languages = body.languages.map { it.toMutableList() }
                provider = body.provider
                structuredProvider = body.structuredProvider
                transcription = body.transcription
                transcriptionEngine = body.transcriptionEngine
                transcriptionEngineConfig = body.transcriptionEngineConfig
                ttsProvider = body.ttsProvider
                url = body.url
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
             * Conversation Relay connection settings. This object can provide `url`,
             * `dtmf_detection`, `interruptible`, `interruptible_greeting`, and `languages`.
             * Top-level aliases override nested values when both are present.
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

            /**
             * Custom key-value parameters forwarded to the relay session as
             * `assistant.dynamic_variables`. If `assistant.dynamic_variables` is also present,
             * these values are merged in.
             */
            fun customParameters(customParameters: CustomParameters) =
                customParameters(JsonField.of(customParameters))

            /**
             * Sets [Builder.customParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customParameters] with a well-typed
             * [CustomParameters] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun customParameters(customParameters: JsonField<CustomParameters>) = apply {
                this.customParameters = customParameters
            }

            /**
             * Public alias for `conversation_relay_dtmf_detection`. If both are present, this value
             * wins.
             */
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

            /** Settings for handling caller interruptions during Conversation Relay speech. */
            fun interruptionSettings(interruptionSettings: ConversationRelayInterruptionSettings) =
                interruptionSettings(JsonField.of(interruptionSettings))

            /**
             * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptionSettings] with a well-typed
             * [ConversationRelayInterruptionSettings] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun interruptionSettings(
                interruptionSettings: JsonField<ConversationRelayInterruptionSettings>
            ) = apply { this.interruptionSettings = interruptionSettings }

            /**
             * Default language for the relay session. This value is used for both text-to-speech
             * and speech recognition.
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

            /** Per-language TTS and transcription settings. */
            fun languages(languages: List<ConversationRelayLanguage>) =
                languages(JsonField.of(languages))

            /**
             * Sets [Builder.languages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languages] with a well-typed
             * `List<ConversationRelayLanguage>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun languages(languages: JsonField<List<ConversationRelayLanguage>>) = apply {
                this.languages = languages.map { it.toMutableList() }
            }

            /**
             * Adds a single [ConversationRelayLanguage] to [languages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLanguage(language: ConversationRelayLanguage) = apply {
                languages =
                    (languages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("languages", it).add(language)
                    }
            }

            /** Structured voice provider. Must be supplied together with `structured_provider`. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /**
             * Provider-specific structured voice settings. Must be supplied together with
             * `provider`; Telnyx sends the value as the nested provider configuration for
             * Conversation Relay.
             */
            fun structuredProvider(structuredProvider: StructuredProvider) =
                structuredProvider(JsonField.of(structuredProvider))

            /**
             * Sets [Builder.structuredProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.structuredProvider] with a well-typed
             * [StructuredProvider] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun structuredProvider(structuredProvider: JsonField<StructuredProvider>) = apply {
                this.structuredProvider = structuredProvider
            }

            /**
             * Not supported for Conversation Relay start requests. Use `transcription_engine` and
             * `transcription_engine_config` instead.
             */
            @Deprecated(
                "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
            )
            fun transcription(transcription: Transcription) =
                transcription(JsonField.of(transcription))

            /**
             * Sets [Builder.transcription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcription] with a well-typed [Transcription]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated(
                "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
            )
            fun transcription(transcription: JsonField<Transcription>) = apply {
                this.transcription = transcription
            }

            /**
             * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx`
             * are supported for backward compatibility. For Conversation Relay, use this field with
             * `transcription_engine_config`; the `transcription` object is not supported.
             */
            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Engine-specific transcription settings for Conversation Relay. This accepts the same
             * provider-specific options used by the Call Transcription Start command, such as
             * `transcription_model`, without requiring the engine discriminator to be repeated
             * inside this object.
             */
            fun transcriptionEngineConfig(transcriptionEngineConfig: TranscriptionEngineConfig) =
                transcriptionEngineConfig(JsonField.of(transcriptionEngineConfig))

            /**
             * Sets [Builder.transcriptionEngineConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngineConfig] with a well-typed
             * [TranscriptionEngineConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun transcriptionEngineConfig(
                transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>
            ) = apply { this.transcriptionEngineConfig = transcriptionEngineConfig }

            /**
             * Text-to-speech provider. If omitted, Telnyx derives it from `voice` or `provider`.
             */
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

            /**
             * Public alias for `conversation_relay_url`. Must start with `ws://` or `wss://`. If
             * both are present, this value wins.
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

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofMinimax(minimax)`. */
            fun voiceSettings(minimax: MinimaxVoiceSettings) =
                voiceSettings(VoiceSettings.ofMinimax(minimax))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofAzure(azure)`. */
            fun voiceSettings(azure: AzureVoiceSettings) =
                voiceSettings(VoiceSettings.ofAzure(azure))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
            fun voiceSettings(rime: RimeVoiceSettings) = voiceSettings(VoiceSettings.ofRime(rime))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
            fun voiceSettings(resemble: ResembleVoiceSettings) =
                voiceSettings(VoiceSettings.ofResemble(resemble))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofInworld(inworld)`. */
            fun voiceSettings(inworld: InworldVoiceSettings) =
                voiceSettings(VoiceSettings.ofInworld(inworld))

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
                    customParameters,
                    dtmfDetection,
                    greeting,
                    interruptible,
                    interruptibleGreeting,
                    interruptionSettings,
                    language,
                    (languages ?: JsonMissing.of()).map { it.toImmutable() },
                    provider,
                    structuredProvider,
                    transcription,
                    transcriptionEngine,
                    transcriptionEngineConfig,
                    ttsProvider,
                    url,
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
            customParameters().ifPresent { it.validate() }
            dtmfDetection()
            greeting()
            interruptible().ifPresent { it.validate() }
            interruptibleGreeting().ifPresent { it.validate() }
            interruptionSettings().ifPresent { it.validate() }
            language()
            languages().ifPresent { it.forEach { it.validate() } }
            provider()
            structuredProvider().ifPresent { it.validate() }
            transcription().ifPresent { it.validate() }
            transcriptionEngine().ifPresent { it.validate() }
            transcriptionEngineConfig().ifPresent { it.validate() }
            ttsProvider()
            url()
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
                (customParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dtmfDetection.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (interruptible.asKnown().getOrNull()?.validity() ?: 0) +
                (interruptibleGreeting.asKnown().getOrNull()?.validity() ?: 0) +
                (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (structuredProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                (transcriptionEngineConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ttsProvider.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
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
                customParameters == other.customParameters &&
                dtmfDetection == other.dtmfDetection &&
                greeting == other.greeting &&
                interruptible == other.interruptible &&
                interruptibleGreeting == other.interruptibleGreeting &&
                interruptionSettings == other.interruptionSettings &&
                language == other.language &&
                languages == other.languages &&
                provider == other.provider &&
                structuredProvider == other.structuredProvider &&
                transcription == other.transcription &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionEngineConfig == other.transcriptionEngineConfig &&
                ttsProvider == other.ttsProvider &&
                url == other.url &&
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
                customParameters,
                dtmfDetection,
                greeting,
                interruptible,
                interruptibleGreeting,
                interruptionSettings,
                language,
                languages,
                provider,
                structuredProvider,
                transcription,
                transcriptionEngine,
                transcriptionEngineConfig,
                ttsProvider,
                url,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assistant=$assistant, clientState=$clientState, commandId=$commandId, conversationRelayDtmfDetection=$conversationRelayDtmfDetection, conversationRelaySettings=$conversationRelaySettings, conversationRelayUrl=$conversationRelayUrl, customParameters=$customParameters, dtmfDetection=$dtmfDetection, greeting=$greeting, interruptible=$interruptible, interruptibleGreeting=$interruptibleGreeting, interruptionSettings=$interruptionSettings, language=$language, languages=$languages, provider=$provider, structuredProvider=$structuredProvider, transcription=$transcription, transcriptionEngine=$transcriptionEngine, transcriptionEngineConfig=$transcriptionEngineConfig, ttsProvider=$ttsProvider, url=$url, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
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
     * Conversation Relay connection settings. This object can provide `url`, `dtmf_detection`,
     * `interruptible`, `interruptible_greeting`, and `languages`. Top-level aliases override nested
     * values when both are present.
     */
    class ConversationRelaySettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val dtmfDetection: JsonField<Boolean>,
        private val interruptible: JsonField<Interruptible>,
        private val interruptibleGreeting: JsonField<InterruptibleGreeting>,
        private val languages: JsonField<List<ConversationRelayLanguage>>,
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
            languages: JsonField<List<ConversationRelayLanguage>> = JsonMissing.of(),
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
        fun languages(): Optional<List<ConversationRelayLanguage>> =
            languages.getOptional("languages")

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
        fun _languages(): JsonField<List<ConversationRelayLanguage>> = languages

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
            private var languages: JsonField<MutableList<ConversationRelayLanguage>>? = null
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
            fun languages(languages: List<ConversationRelayLanguage>) =
                languages(JsonField.of(languages))

            /**
             * Sets [Builder.languages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languages] with a well-typed
             * `List<ConversationRelayLanguage>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun languages(languages: JsonField<List<ConversationRelayLanguage>>) = apply {
                this.languages = languages.map { it.toMutableList() }
            }

            /**
             * Adds a single [ConversationRelayLanguage] to [languages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLanguage(language: ConversationRelayLanguage) = apply {
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

    /**
     * Custom key-value parameters forwarded to the relay session as `assistant.dynamic_variables`.
     * If `assistant.dynamic_variables` is also present, these values are merged in.
     */
    class CustomParameters
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

            /** Returns a mutable builder for constructing an instance of [CustomParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomParameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customParameters: CustomParameters) = apply {
                additionalProperties = customParameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomParameters = CustomParameters(additionalProperties.toImmutable())
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
        fun validate(): CustomParameters = apply {
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

            return other is CustomParameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomParameters{additionalProperties=$additionalProperties}"
    }

    /**
     * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     */
    class Interruptible @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     */
    class InterruptibleGreeting
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * An instance of [InterruptibleGreeting] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                else -> throw TelnyxInvalidDataException("Unknown InterruptibleGreeting: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
     * Provider-specific structured voice settings. Must be supplied together with `provider`;
     * Telnyx sends the value as the nested provider configuration for Conversation Relay.
     */
    class StructuredProvider
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

            /** Returns a mutable builder for constructing an instance of [StructuredProvider]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StructuredProvider]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(structuredProvider: StructuredProvider) = apply {
                additionalProperties = structuredProvider.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [StructuredProvider].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StructuredProvider = StructuredProvider(additionalProperties.toImmutable())
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
        fun validate(): StructuredProvider = apply {
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

            return other is StructuredProvider && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "StructuredProvider{additionalProperties=$additionalProperties}"
    }

    /**
     * Not supported for Conversation Relay start requests. Use `transcription_engine` and
     * `transcription_engine_config` instead.
     */
    @Deprecated(
        "Not supported for Conversation Relay start requests. Use `transcription_engine` and `transcription_engine_config` instead."
    )
    class Transcription
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

            /** Returns a mutable builder for constructing an instance of [Transcription]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transcription]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transcription: Transcription) = apply {
                additionalProperties = transcription.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Transcription].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Transcription = Transcription(additionalProperties.toImmutable())
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

            return other is Transcription && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Transcription{additionalProperties=$additionalProperties}"
    }

    /**
     * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
     * supported for backward compatibility. For Conversation Relay, use this field with
     * `transcription_engine_config`; the `transcription` object is not supported.
     */
    class TranscriptionEngine
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GOOGLE = of("Google")

            @JvmField val TELNYX = of("Telnyx")

            @JvmField val DEEPGRAM = of("Deepgram")

            @JvmField val AZURE = of("Azure")

            @JvmField val X_AI = of("xAI")

            @JvmField val ASSEMBLY_AI = of("AssemblyAI")

            @JvmField val SPEECHMATICS = of("Speechmatics")

            @JvmField val SONIOX = of("Soniox")

            @JvmField val A = of("A")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            GOOGLE,
            TELNYX,
            DEEPGRAM,
            AZURE,
            X_AI,
            ASSEMBLY_AI,
            SPEECHMATICS,
            SONIOX,
            A,
            B,
        }

        /**
         * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionEngine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GOOGLE,
            TELNYX,
            DEEPGRAM,
            AZURE,
            X_AI,
            ASSEMBLY_AI,
            SPEECHMATICS,
            SONIOX,
            A,
            B,
            /**
             * An enum member indicating that [TranscriptionEngine] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GOOGLE -> Value.GOOGLE
                TELNYX -> Value.TELNYX
                DEEPGRAM -> Value.DEEPGRAM
                AZURE -> Value.AZURE
                X_AI -> Value.X_AI
                ASSEMBLY_AI -> Value.ASSEMBLY_AI
                SPEECHMATICS -> Value.SPEECHMATICS
                SONIOX -> Value.SONIOX
                A -> Value.A
                B -> Value.B
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                GOOGLE -> Known.GOOGLE
                TELNYX -> Known.TELNYX
                DEEPGRAM -> Known.DEEPGRAM
                AZURE -> Known.AZURE
                X_AI -> Known.X_AI
                ASSEMBLY_AI -> Known.ASSEMBLY_AI
                SPEECHMATICS -> Known.SPEECHMATICS
                SONIOX -> Known.SONIOX
                A -> Known.A
                B -> Known.B
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
        fun validate(): TranscriptionEngine = apply {
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

            return other is TranscriptionEngine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Engine-specific transcription settings for Conversation Relay. This accepts the same
     * provider-specific options used by the Call Transcription Start command, such as
     * `transcription_model`, without requiring the engine discriminator to be repeated inside this
     * object.
     */
    class TranscriptionEngineConfig
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [TranscriptionEngineConfig].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TranscriptionEngineConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transcriptionEngineConfig: TranscriptionEngineConfig) = apply {
                additionalProperties = transcriptionEngineConfig.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TranscriptionEngineConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TranscriptionEngineConfig =
                TranscriptionEngineConfig(additionalProperties.toImmutable())
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
        fun validate(): TranscriptionEngineConfig = apply {
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

            return other is TranscriptionEngineConfig &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TranscriptionEngineConfig{additionalProperties=$additionalProperties}"
    }

    /** The settings associated with the voice selected */
    @JsonDeserialize(using = VoiceSettings.Deserializer::class)
    @JsonSerialize(using = VoiceSettings.Serializer::class)
    class VoiceSettings
    private constructor(
        private val elevenlabs: ElevenLabsVoiceSettings? = null,
        private val telnyx: TelnyxVoiceSettings? = null,
        private val aws: AwsVoiceSettings? = null,
        private val minimax: MinimaxVoiceSettings? = null,
        private val azure: AzureVoiceSettings? = null,
        private val rime: RimeVoiceSettings? = null,
        private val resemble: ResembleVoiceSettings? = null,
        private val inworld: InworldVoiceSettings? = null,
        private val xai: XaiVoiceSettings? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun minimax(): Optional<MinimaxVoiceSettings> = Optional.ofNullable(minimax)

        fun azure(): Optional<AzureVoiceSettings> = Optional.ofNullable(azure)

        fun rime(): Optional<RimeVoiceSettings> = Optional.ofNullable(rime)

        fun resemble(): Optional<ResembleVoiceSettings> = Optional.ofNullable(resemble)

        fun inworld(): Optional<InworldVoiceSettings> = Optional.ofNullable(inworld)

        fun xai(): Optional<XaiVoiceSettings> = Optional.ofNullable(xai)

        fun isElevenlabs(): Boolean = elevenlabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun isMinimax(): Boolean = minimax != null

        fun isAzure(): Boolean = azure != null

        fun isRime(): Boolean = rime != null

        fun isResemble(): Boolean = resemble != null

        fun isInworld(): Boolean = inworld != null

        fun isXai(): Boolean = xai != null

        fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun asMinimax(): MinimaxVoiceSettings = minimax.getOrThrow("minimax")

        fun asAzure(): AzureVoiceSettings = azure.getOrThrow("azure")

        fun asRime(): RimeVoiceSettings = rime.getOrThrow("rime")

        fun asResemble(): ResembleVoiceSettings = resemble.getOrThrow("resemble")

        fun asInworld(): InworldVoiceSettings = inworld.getOrThrow("inworld")

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
                minimax != null -> visitor.visitMinimax(minimax)
                azure != null -> visitor.visitAzure(azure)
                rime != null -> visitor.visitRime(rime)
                resemble != null -> visitor.visitResemble(resemble)
                inworld != null -> visitor.visitInworld(inworld)
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

                    override fun visitMinimax(minimax: MinimaxVoiceSettings) {
                        minimax.validate()
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

                    override fun visitInworld(inworld: InworldVoiceSettings) {
                        inworld.validate()
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

                    override fun visitMinimax(minimax: MinimaxVoiceSettings) = minimax.validity()

                    override fun visitAzure(azure: AzureVoiceSettings) = azure.validity()

                    override fun visitRime(rime: RimeVoiceSettings) = rime.validity()

                    override fun visitResemble(resemble: ResembleVoiceSettings) =
                        resemble.validity()

                    override fun visitInworld(inworld: InworldVoiceSettings) = inworld.validity()

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
                minimax == other.minimax &&
                azure == other.azure &&
                rime == other.rime &&
                resemble == other.resemble &&
                inworld == other.inworld &&
                xai == other.xai
        }

        override fun hashCode(): Int =
            Objects.hash(elevenlabs, telnyx, aws, minimax, azure, rime, resemble, inworld, xai)

        override fun toString(): String =
            when {
                elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                minimax != null -> "VoiceSettings{minimax=$minimax}"
                azure != null -> "VoiceSettings{azure=$azure}"
                rime != null -> "VoiceSettings{rime=$rime}"
                resemble != null -> "VoiceSettings{resemble=$resemble}"
                inworld != null -> "VoiceSettings{inworld=$inworld}"
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

            @JvmStatic
            fun ofMinimax(minimax: MinimaxVoiceSettings) = VoiceSettings(minimax = minimax)

            @JvmStatic fun ofAzure(azure: AzureVoiceSettings) = VoiceSettings(azure = azure)

            @JvmStatic fun ofRime(rime: RimeVoiceSettings) = VoiceSettings(rime = rime)

            @JvmStatic
            fun ofResemble(resemble: ResembleVoiceSettings) = VoiceSettings(resemble = resemble)

            @JvmStatic
            fun ofInworld(inworld: InworldVoiceSettings) = VoiceSettings(inworld = inworld)

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

            fun visitMinimax(minimax: MinimaxVoiceSettings): T

            fun visitAzure(azure: AzureVoiceSettings): T

            fun visitRime(rime: RimeVoiceSettings): T

            fun visitResemble(resemble: ResembleVoiceSettings): T

            fun visitInworld(inworld: InworldVoiceSettings): T

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
                    "minimax" -> {
                        return tryDeserialize(node, jacksonTypeRef<MinimaxVoiceSettings>())?.let {
                            VoiceSettings(minimax = it, _json = json)
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
                    "inworld" -> {
                        return tryDeserialize(node, jacksonTypeRef<InworldVoiceSettings>())?.let {
                            VoiceSettings(inworld = it, _json = json)
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
                    value.minimax != null -> generator.writeObject(value.minimax)
                    value.azure != null -> generator.writeObject(value.azure)
                    value.rime != null -> generator.writeObject(value.rime)
                    value.resemble != null -> generator.writeObject(value.resemble)
                    value.inworld != null -> generator.writeObject(value.inworld)
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
