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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Convert text to speech and play it back on the call. If multiple speak text commands are issued
 * consecutively, the audio files will be placed in a queue awaiting playback.
 *
 * **Expected Webhooks:**
 * - `call.speak.started`
 * - `call.speak.ended`
 */
class ActionSpeakParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * The text or SSML to be converted into speech. There is a 3,000 character limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payload(): String = body.payload()

    /**
     * Specifies the voice used in speech synthesis.
     * - Define voices using the format `<Provider>.<Model>.<VoiceId>`. Specifying only the provider
     *   will give default values for voice_id and model_id.
     *
     *   **Supported Providers:**
     * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices, which
     *   provide more realistic, human-like speech, append `-Neural` to the `VoiceId` (e.g.,
     *   `AWS.Polly.Joanna-Neural`). Check the
     *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html) for
     *   compatibility.
     * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural,
     *   Azure.en-US-BrianMultilingualNeural, Azure.en-US-Ava:DragonHDLatestNeural. For a complete
     *   list of voices, go to
     *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
     * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
     *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is optional.
     *   To use ElevenLabs, you must provide your ElevenLabs API key as an integration identifier
     *   secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. See
     *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     *   for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
     *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
     *
     * For service_level basic, you may define the gender of the speaker (male or female).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voice(): String = body.voice()

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
     * The language you want spoken. This parameter is ignored when a `Polly.*` voice is specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = body.language()

    /**
     * The type of the provided payload. The payload can either be plain text, or Speech Synthesis
     * Markup Language (SSML).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payloadType(): Optional<PayloadType> = body.payloadType()

    /**
     * This parameter impacts speech quality, language options and payload types. When using
     * `basic`, only the `en-US` language and payload type `text` are allowed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceLevel(): Optional<ServiceLevel> = body.serviceLevel()

    /**
     * When specified, it stops the current audio being played. Specify `current` to stop the
     * current audio being played, and to play the next file in the queue. Specify `all` to stop the
     * current audio file being played and to also clear all audio files from the queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Optional<String> = body.stop()

    /**
     * The settings associated with the voice selected
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettings(): Optional<VoiceSettings> = body.voiceSettings()

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payload(): JsonField<String> = body._payload()

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voice(): JsonField<String> = body._voice()

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
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<Language> = body._language()

    /**
     * Returns the raw JSON value of [payloadType].
     *
     * Unlike [payloadType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payloadType(): JsonField<PayloadType> = body._payloadType()

    /**
     * Returns the raw JSON value of [serviceLevel].
     *
     * Unlike [serviceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _serviceLevel(): JsonField<ServiceLevel> = body._serviceLevel()

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stop(): JsonField<String> = body._stop()

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
         * Returns a mutable builder for constructing an instance of [ActionSpeakParams].
         *
         * The following fields are required:
         * ```java
         * .payload()
         * .voice()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionSpeakParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionSpeakParams: ActionSpeakParams) = apply {
            callControlId = actionSpeakParams.callControlId
            body = actionSpeakParams.body.toBuilder()
            additionalHeaders = actionSpeakParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionSpeakParams.additionalQueryParams.toBuilder()
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
         * - [payload]
         * - [voice]
         * - [clientState]
         * - [commandId]
         * - [language]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The text or SSML to be converted into speech. There is a 3,000 character limit. */
        fun payload(payload: String) = apply { body.payload(payload) }

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<String>) = apply { body.payload(payload) }

        /**
         * Specifies the voice used in speech synthesis.
         * - Define voices using the format `<Provider>.<Model>.<VoiceId>`. Specifying only the
         *   provider will give default values for voice_id and model_id.
         *
         *   **Supported Providers:**
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
         *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is
         *   optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration
         *   identifier secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         *
         * For service_level basic, you may define the gender of the speaker (male or female).
         */
        fun voice(voice: String) = apply { body.voice(voice) }

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<String>) = apply { body.voice(voice) }

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
         * The language you want spoken. This parameter is ignored when a `Polly.*` voice is
         * specified.
         */
        fun language(language: Language) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { body.language(language) }

        /**
         * The type of the provided payload. The payload can either be plain text, or Speech
         * Synthesis Markup Language (SSML).
         */
        fun payloadType(payloadType: PayloadType) = apply { body.payloadType(payloadType) }

        /**
         * Sets [Builder.payloadType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadType] with a well-typed [PayloadType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadType(payloadType: JsonField<PayloadType>) = apply {
            body.payloadType(payloadType)
        }

        /**
         * This parameter impacts speech quality, language options and payload types. When using
         * `basic`, only the `en-US` language and payload type `text` are allowed.
         */
        fun serviceLevel(serviceLevel: ServiceLevel) = apply { body.serviceLevel(serviceLevel) }

        /**
         * Sets [Builder.serviceLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceLevel] with a well-typed [ServiceLevel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceLevel(serviceLevel: JsonField<ServiceLevel>) = apply {
            body.serviceLevel(serviceLevel)
        }

        /**
         * When specified, it stops the current audio being played. Specify `current` to stop the
         * current audio being played, and to play the next file in the queue. Specify `all` to stop
         * the current audio file being played and to also clear all audio files from the queue.
         */
        fun stop(stop: String) = apply { body.stop(stop) }

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<String>) = apply { body.stop(stop) }

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

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofElevenLabs(elevenLabs)`. */
        fun voiceSettings(elevenLabs: ElevenLabsVoiceSettings) = apply {
            body.voiceSettings(elevenLabs)
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
         * Returns an immutable instance of [ActionSpeakParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .payload()
         * .voice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionSpeakParams =
            ActionSpeakParams(
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
        private val payload: JsonField<String>,
        private val voice: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val language: JsonField<Language>,
        private val payloadType: JsonField<PayloadType>,
        private val serviceLevel: JsonField<ServiceLevel>,
        private val stop: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
            @JsonProperty("payload_type")
            @ExcludeMissing
            payloadType: JsonField<PayloadType> = JsonMissing.of(),
            @JsonProperty("service_level")
            @ExcludeMissing
            serviceLevel: JsonField<ServiceLevel> = JsonMissing.of(),
            @JsonProperty("stop") @ExcludeMissing stop: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            payload,
            voice,
            clientState,
            commandId,
            language,
            payloadType,
            serviceLevel,
            stop,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * The text or SSML to be converted into speech. There is a 3,000 character limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): String = payload.getRequired("payload")

        /**
         * Specifies the voice used in speech synthesis.
         * - Define voices using the format `<Provider>.<Model>.<VoiceId>`. Specifying only the
         *   provider will give default values for voice_id and model_id.
         *
         *   **Supported Providers:**
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
         *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is
         *   optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration
         *   identifier secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         *
         * For service_level basic, you may define the gender of the speaker (male or female).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voice(): String = voice.getRequired("voice")

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
         * The language you want spoken. This parameter is ignored when a `Polly.*` voice is
         * specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

        /**
         * The type of the provided payload. The payload can either be plain text, or Speech
         * Synthesis Markup Language (SSML).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payloadType(): Optional<PayloadType> = payloadType.getOptional("payload_type")

        /**
         * This parameter impacts speech quality, language options and payload types. When using
         * `basic`, only the `en-US` language and payload type `text` are allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceLevel(): Optional<ServiceLevel> = serviceLevel.getOptional("service_level")

        /**
         * When specified, it stops the current audio being played. Specify `current` to stop the
         * current audio being played, and to play the next file in the queue. Specify `all` to stop
         * the current audio file being played and to also clear all audio files from the queue.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stop(): Optional<String> = stop.getOptional("stop")

        /**
         * The settings associated with the voice selected
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<String> = payload

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

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
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

        /**
         * Returns the raw JSON value of [payloadType].
         *
         * Unlike [payloadType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload_type")
        @ExcludeMissing
        fun _payloadType(): JsonField<PayloadType> = payloadType

        /**
         * Returns the raw JSON value of [serviceLevel].
         *
         * Unlike [serviceLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("service_level")
        @ExcludeMissing
        fun _serviceLevel(): JsonField<ServiceLevel> = serviceLevel

        /**
         * Returns the raw JSON value of [stop].
         *
         * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<String> = stop

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
             * .payload()
             * .voice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var payload: JsonField<String>? = null
            private var voice: JsonField<String>? = null
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var language: JsonField<Language> = JsonMissing.of()
            private var payloadType: JsonField<PayloadType> = JsonMissing.of()
            private var serviceLevel: JsonField<ServiceLevel> = JsonMissing.of()
            private var stop: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                payload = body.payload
                voice = body.voice
                clientState = body.clientState
                commandId = body.commandId
                language = body.language
                payloadType = body.payloadType
                serviceLevel = body.serviceLevel
                stop = body.stop
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The text or SSML to be converted into speech. There is a 3,000 character limit. */
            fun payload(payload: String) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<String>) = apply { this.payload = payload }

            /**
             * Specifies the voice used in speech synthesis.
             * - Define voices using the format `<Provider>.<Model>.<VoiceId>`. Specifying only the
             *   provider will give default values for voice_id and model_id.
             *
             *   **Supported Providers:**
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
             *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is
             *   optional. To use ElevenLabs, you must provide your ElevenLabs API key as an
             *   integration identifier secret in `"voice_settings": {"api_key_ref":
             *   "<secret_identifier>"}`. See
             *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
             *   for details. Check
             *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
             *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
             *
             * For service_level basic, you may define the gender of the speaker (male or female).
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
             * The language you want spoken. This parameter is ignored when a `Polly.*` voice is
             * specified.
             */
            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

            /**
             * The type of the provided payload. The payload can either be plain text, or Speech
             * Synthesis Markup Language (SSML).
             */
            fun payloadType(payloadType: PayloadType) = payloadType(JsonField.of(payloadType))

            /**
             * Sets [Builder.payloadType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadType] with a well-typed [PayloadType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadType(payloadType: JsonField<PayloadType>) = apply {
                this.payloadType = payloadType
            }

            /**
             * This parameter impacts speech quality, language options and payload types. When using
             * `basic`, only the `en-US` language and payload type `text` are allowed.
             */
            fun serviceLevel(serviceLevel: ServiceLevel) = serviceLevel(JsonField.of(serviceLevel))

            /**
             * Sets [Builder.serviceLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceLevel] with a well-typed [ServiceLevel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceLevel(serviceLevel: JsonField<ServiceLevel>) = apply {
                this.serviceLevel = serviceLevel
            }

            /**
             * When specified, it stops the current audio being played. Specify `current` to stop
             * the current audio being played, and to play the next file in the queue. Specify `all`
             * to stop the current audio file being played and to also clear all audio files from
             * the queue.
             */
            fun stop(stop: String) = stop(JsonField.of(stop))

            /**
             * Sets [Builder.stop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun stop(stop: JsonField<String>) = apply { this.stop = stop }

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

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofElevenLabs(elevenLabs)`. */
            fun voiceSettings(elevenLabs: ElevenLabsVoiceSettings) =
                voiceSettings(VoiceSettings.ofElevenLabs(elevenLabs))

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
             * .payload()
             * .voice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("payload", payload),
                    checkRequired("voice", voice),
                    clientState,
                    commandId,
                    language,
                    payloadType,
                    serviceLevel,
                    stop,
                    voiceSettings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            payload()
            voice()
            clientState()
            commandId()
            language().ifPresent { it.validate() }
            payloadType().ifPresent { it.validate() }
            serviceLevel().ifPresent { it.validate() }
            stop()
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
            (if (payload.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (payloadType.asKnown().getOrNull()?.validity() ?: 0) +
                (serviceLevel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stop.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                payload == other.payload &&
                voice == other.voice &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                language == other.language &&
                payloadType == other.payloadType &&
                serviceLevel == other.serviceLevel &&
                stop == other.stop &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                payload,
                voice,
                clientState,
                commandId,
                language,
                payloadType,
                serviceLevel,
                stop,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{payload=$payload, voice=$voice, clientState=$clientState, commandId=$commandId, language=$language, payloadType=$payloadType, serviceLevel=$serviceLevel, stop=$stop, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /**
     * The language you want spoken. This parameter is ignored when a `Polly.*` voice is specified.
     */
    class Language @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ARB = of("arb")

            @JvmField val CMN_CN = of("cmn-CN")

            @JvmField val CY_GB = of("cy-GB")

            @JvmField val DA_DK = of("da-DK")

            @JvmField val DE_DE = of("de-DE")

            @JvmField val EN_AU = of("en-AU")

            @JvmField val EN_GB = of("en-GB")

            @JvmField val EN_GB_WLS = of("en-GB-WLS")

            @JvmField val EN_IN = of("en-IN")

            @JvmField val EN_US = of("en-US")

            @JvmField val ES_ES = of("es-ES")

            @JvmField val ES_MX = of("es-MX")

            @JvmField val ES_US = of("es-US")

            @JvmField val FR_CA = of("fr-CA")

            @JvmField val FR_FR = of("fr-FR")

            @JvmField val HI_IN = of("hi-IN")

            @JvmField val IS_IS = of("is-IS")

            @JvmField val IT_IT = of("it-IT")

            @JvmField val JA_JP = of("ja-JP")

            @JvmField val KO_KR = of("ko-KR")

            @JvmField val NB_NO = of("nb-NO")

            @JvmField val NL_NL = of("nl-NL")

            @JvmField val PL_PL = of("pl-PL")

            @JvmField val PT_BR = of("pt-BR")

            @JvmField val PT_PT = of("pt-PT")

            @JvmField val RO_RO = of("ro-RO")

            @JvmField val RU_RU = of("ru-RU")

            @JvmField val SV_SE = of("sv-SE")

            @JvmField val TR_TR = of("tr-TR")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            ARB,
            CMN_CN,
            CY_GB,
            DA_DK,
            DE_DE,
            EN_AU,
            EN_GB,
            EN_GB_WLS,
            EN_IN,
            EN_US,
            ES_ES,
            ES_MX,
            ES_US,
            FR_CA,
            FR_FR,
            HI_IN,
            IS_IS,
            IT_IT,
            JA_JP,
            KO_KR,
            NB_NO,
            NL_NL,
            PL_PL,
            PT_BR,
            PT_PT,
            RO_RO,
            RU_RU,
            SV_SE,
            TR_TR,
        }

        /**
         * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Language] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ARB,
            CMN_CN,
            CY_GB,
            DA_DK,
            DE_DE,
            EN_AU,
            EN_GB,
            EN_GB_WLS,
            EN_IN,
            EN_US,
            ES_ES,
            ES_MX,
            ES_US,
            FR_CA,
            FR_FR,
            HI_IN,
            IS_IS,
            IT_IT,
            JA_JP,
            KO_KR,
            NB_NO,
            NL_NL,
            PL_PL,
            PT_BR,
            PT_PT,
            RO_RO,
            RU_RU,
            SV_SE,
            TR_TR,
            /** An enum member indicating that [Language] was instantiated with an unknown value. */
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
                ARB -> Value.ARB
                CMN_CN -> Value.CMN_CN
                CY_GB -> Value.CY_GB
                DA_DK -> Value.DA_DK
                DE_DE -> Value.DE_DE
                EN_AU -> Value.EN_AU
                EN_GB -> Value.EN_GB
                EN_GB_WLS -> Value.EN_GB_WLS
                EN_IN -> Value.EN_IN
                EN_US -> Value.EN_US
                ES_ES -> Value.ES_ES
                ES_MX -> Value.ES_MX
                ES_US -> Value.ES_US
                FR_CA -> Value.FR_CA
                FR_FR -> Value.FR_FR
                HI_IN -> Value.HI_IN
                IS_IS -> Value.IS_IS
                IT_IT -> Value.IT_IT
                JA_JP -> Value.JA_JP
                KO_KR -> Value.KO_KR
                NB_NO -> Value.NB_NO
                NL_NL -> Value.NL_NL
                PL_PL -> Value.PL_PL
                PT_BR -> Value.PT_BR
                PT_PT -> Value.PT_PT
                RO_RO -> Value.RO_RO
                RU_RU -> Value.RU_RU
                SV_SE -> Value.SV_SE
                TR_TR -> Value.TR_TR
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
                ARB -> Known.ARB
                CMN_CN -> Known.CMN_CN
                CY_GB -> Known.CY_GB
                DA_DK -> Known.DA_DK
                DE_DE -> Known.DE_DE
                EN_AU -> Known.EN_AU
                EN_GB -> Known.EN_GB
                EN_GB_WLS -> Known.EN_GB_WLS
                EN_IN -> Known.EN_IN
                EN_US -> Known.EN_US
                ES_ES -> Known.ES_ES
                ES_MX -> Known.ES_MX
                ES_US -> Known.ES_US
                FR_CA -> Known.FR_CA
                FR_FR -> Known.FR_FR
                HI_IN -> Known.HI_IN
                IS_IS -> Known.IS_IS
                IT_IT -> Known.IT_IT
                JA_JP -> Known.JA_JP
                KO_KR -> Known.KO_KR
                NB_NO -> Known.NB_NO
                NL_NL -> Known.NL_NL
                PL_PL -> Known.PL_PL
                PT_BR -> Known.PT_BR
                PT_PT -> Known.PT_PT
                RO_RO -> Known.RO_RO
                RU_RU -> Known.RU_RU
                SV_SE -> Known.SV_SE
                TR_TR -> Known.TR_TR
                else -> throw TelnyxInvalidDataException("Unknown Language: $value")
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

        fun validate(): Language = apply {
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

            return other is Language && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of the provided payload. The payload can either be plain text, or Speech Synthesis
     * Markup Language (SSML).
     */
    class PayloadType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TEXT = of("text")

            @JvmField val SSML = of("ssml")

            @JvmStatic fun of(value: String) = PayloadType(JsonField.of(value))
        }

        /** An enum containing [PayloadType]'s known values. */
        enum class Known {
            TEXT,
            SSML,
        }

        /**
         * An enum containing [PayloadType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayloadType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEXT,
            SSML,
            /**
             * An enum member indicating that [PayloadType] was instantiated with an unknown value.
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
                TEXT -> Value.TEXT
                SSML -> Value.SSML
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
                TEXT -> Known.TEXT
                SSML -> Known.SSML
                else -> throw TelnyxInvalidDataException("Unknown PayloadType: $value")
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

        fun validate(): PayloadType = apply {
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

            return other is PayloadType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This parameter impacts speech quality, language options and payload types. When using
     * `basic`, only the `en-US` language and payload type `text` are allowed.
     */
    class ServiceLevel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BASIC = of("basic")

            @JvmField val PREMIUM = of("premium")

            @JvmStatic fun of(value: String) = ServiceLevel(JsonField.of(value))
        }

        /** An enum containing [ServiceLevel]'s known values. */
        enum class Known {
            BASIC,
            PREMIUM,
        }

        /**
         * An enum containing [ServiceLevel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ServiceLevel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BASIC,
            PREMIUM,
            /**
             * An enum member indicating that [ServiceLevel] was instantiated with an unknown value.
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
                BASIC -> Value.BASIC
                PREMIUM -> Value.PREMIUM
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
                BASIC -> Known.BASIC
                PREMIUM -> Known.PREMIUM
                else -> throw TelnyxInvalidDataException("Unknown ServiceLevel: $value")
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

        fun validate(): ServiceLevel = apply {
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

            return other is ServiceLevel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The settings associated with the voice selected */
    @JsonDeserialize(using = VoiceSettings.Deserializer::class)
    @JsonSerialize(using = VoiceSettings.Serializer::class)
    class VoiceSettings
    private constructor(
        private val elevenLabs: ElevenLabsVoiceSettings? = null,
        private val telnyx: TelnyxVoiceSettings? = null,
        private val aws: AwsVoiceSettings? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenLabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenLabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun isElevenLabs(): Boolean = elevenLabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun asElevenLabs(): ElevenLabsVoiceSettings = elevenLabs.getOrThrow("elevenLabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elevenLabs != null -> visitor.visitElevenLabs(elevenLabs)
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
                    override fun visitElevenLabs(elevenLabs: ElevenLabsVoiceSettings) {
                        elevenLabs.validate()
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
                    override fun visitElevenLabs(elevenLabs: ElevenLabsVoiceSettings) =
                        elevenLabs.validity()

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
                elevenLabs == other.elevenLabs &&
                telnyx == other.telnyx &&
                aws == other.aws
        }

        override fun hashCode(): Int = Objects.hash(elevenLabs, telnyx, aws)

        override fun toString(): String =
            when {
                elevenLabs != null -> "VoiceSettings{elevenLabs=$elevenLabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                _json != null -> "VoiceSettings{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid VoiceSettings")
            }

        companion object {

            @JvmStatic
            fun ofElevenLabs(elevenLabs: ElevenLabsVoiceSettings) =
                VoiceSettings(elevenLabs = elevenLabs)

            @JvmStatic fun ofTelnyx(telnyx: TelnyxVoiceSettings) = VoiceSettings(telnyx = telnyx)

            @JvmStatic fun ofAws(aws: AwsVoiceSettings) = VoiceSettings(aws = aws)
        }

        /**
         * An interface that defines how to map each variant of [VoiceSettings] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitElevenLabs(elevenLabs: ElevenLabsVoiceSettings): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ElevenLabsVoiceSettings>())?.let {
                                VoiceSettings(elevenLabs = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TelnyxVoiceSettings>())?.let {
                                VoiceSettings(telnyx = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AwsVoiceSettings>())?.let {
                                VoiceSettings(aws = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> VoiceSettings(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<VoiceSettings>(VoiceSettings::class) {

            override fun serialize(
                value: VoiceSettings,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.elevenLabs != null -> generator.writeObject(value.elevenLabs)
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

        return other is ActionSpeakParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionSpeakParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
