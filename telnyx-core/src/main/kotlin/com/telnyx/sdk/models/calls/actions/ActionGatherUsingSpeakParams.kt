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
 * Convert text to speech and play it on the call until the required DTMF signals are gathered to
 * build interactive menus.
 *
 * You can pass a list of valid digits along with an 'invalid_payload', which will be played back at
 * the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The
 * `Answer` command must be issued before the `gather_using_speak` command.
 *
 * **Expected Webhooks:**
 * - `call.dtmf.received` (you may receive many of these webhooks)
 * - `call.gather.ended`
 */
class ActionGatherUsingSpeakParams
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
     * **Supported Providers:**
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
     *   secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. Check
     *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
     * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
     * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g., `Minimax.speech-02-hd.Wise_Woman`).
     *   Supported models: `speech-02-turbo`, `speech-02-hd`, `speech-2.6-turbo`,
     *   `speech-2.8-turbo`. Optional parameters: `speed` (float, default 1.0), `vol` (float,
     *   default 1.0), `pitch` (integer, default 0).
     * - **Resemble:** Use `Resemble.<ModelId>.<VoiceId>` (e.g., `Resemble.Pro.my_voice`). Supported
     *   models: `Pro` (multilingual) and `Turbo` (English only).
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
     * The number of milliseconds to wait for input between digits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interDigitTimeoutMillis(): Optional<Int> = body.interDigitTimeoutMillis()

    /**
     * The text or SSML to be converted into speech when digits don't match the `valid_digits`
     * parameter or the number of digits is not between `min` and `max`. There is a 3,000 character
     * limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidPayload(): Optional<String> = body.invalidPayload()

    /**
     * The language you want spoken. This parameter is ignored when a `Polly.*` voice is specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = body.language()

    /**
     * The maximum number of digits to fetch. This parameter has a maximum value of 128.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumDigits(): Optional<Int> = body.maximumDigits()

    /**
     * The maximum number of times that a file should be played back if there is no input from the
     * user on the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumTries(): Optional<Int> = body.maximumTries()

    /**
     * The minimum number of digits to fetch. This parameter has a minimum value of 1.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumDigits(): Optional<Int> = body.minimumDigits()

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
     * The digit used to terminate input if fewer than `maximum_digits` digits have been gathered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun terminatingDigit(): Optional<String> = body.terminatingDigit()

    /**
     * The number of milliseconds to wait for a DTMF response after speak ends before a replaying
     * the sound file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMillis(): Optional<Int> = body.timeoutMillis()

    /**
     * A list of all digits accepted as valid.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validDigits(): Optional<String> = body.validDigits()

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
     * Returns the raw JSON value of [interDigitTimeoutMillis].
     *
     * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _interDigitTimeoutMillis(): JsonField<Int> = body._interDigitTimeoutMillis()

    /**
     * Returns the raw JSON value of [invalidPayload].
     *
     * Unlike [invalidPayload], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invalidPayload(): JsonField<String> = body._invalidPayload()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<Language> = body._language()

    /**
     * Returns the raw JSON value of [maximumDigits].
     *
     * Unlike [maximumDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maximumDigits(): JsonField<Int> = body._maximumDigits()

    /**
     * Returns the raw JSON value of [maximumTries].
     *
     * Unlike [maximumTries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maximumTries(): JsonField<Int> = body._maximumTries()

    /**
     * Returns the raw JSON value of [minimumDigits].
     *
     * Unlike [minimumDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumDigits(): JsonField<Int> = body._minimumDigits()

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
     * Returns the raw JSON value of [terminatingDigit].
     *
     * Unlike [terminatingDigit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _terminatingDigit(): JsonField<String> = body._terminatingDigit()

    /**
     * Returns the raw JSON value of [timeoutMillis].
     *
     * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutMillis(): JsonField<Int> = body._timeoutMillis()

    /**
     * Returns the raw JSON value of [validDigits].
     *
     * Unlike [validDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _validDigits(): JsonField<String> = body._validDigits()

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
         * Returns a mutable builder for constructing an instance of [ActionGatherUsingSpeakParams].
         *
         * The following fields are required:
         * ```java
         * .payload()
         * .voice()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGatherUsingSpeakParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionGatherUsingSpeakParams: ActionGatherUsingSpeakParams) = apply {
            callControlId = actionGatherUsingSpeakParams.callControlId
            body = actionGatherUsingSpeakParams.body.toBuilder()
            additionalHeaders = actionGatherUsingSpeakParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionGatherUsingSpeakParams.additionalQueryParams.toBuilder()
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
         * - [interDigitTimeoutMillis]
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
         * **Supported Providers:**
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
         *   identifier secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g.,
         *   `Minimax.speech-02-hd.Wise_Woman`). Supported models: `speech-02-turbo`,
         *   `speech-02-hd`, `speech-2.6-turbo`, `speech-2.8-turbo`. Optional parameters: `speed`
         *   (float, default 1.0), `vol` (float, default 1.0), `pitch` (integer, default 0).
         * - **Resemble:** Use `Resemble.<ModelId>.<VoiceId>` (e.g., `Resemble.Pro.my_voice`).
         *   Supported models: `Pro` (multilingual) and `Turbo` (English only).
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

        /** The number of milliseconds to wait for input between digits. */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: Int) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /**
         * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Int>) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /**
         * The text or SSML to be converted into speech when digits don't match the `valid_digits`
         * parameter or the number of digits is not between `min` and `max`. There is a 3,000
         * character limit.
         */
        fun invalidPayload(invalidPayload: String) = apply { body.invalidPayload(invalidPayload) }

        /**
         * Sets [Builder.invalidPayload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidPayload] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invalidPayload(invalidPayload: JsonField<String>) = apply {
            body.invalidPayload(invalidPayload)
        }

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

        /** The maximum number of digits to fetch. This parameter has a maximum value of 128. */
        fun maximumDigits(maximumDigits: Int) = apply { body.maximumDigits(maximumDigits) }

        /**
         * Sets [Builder.maximumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumDigits(maximumDigits: JsonField<Int>) = apply {
            body.maximumDigits(maximumDigits)
        }

        /**
         * The maximum number of times that a file should be played back if there is no input from
         * the user on the call.
         */
        fun maximumTries(maximumTries: Int) = apply { body.maximumTries(maximumTries) }

        /**
         * Sets [Builder.maximumTries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumTries] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumTries(maximumTries: JsonField<Int>) = apply { body.maximumTries(maximumTries) }

        /** The minimum number of digits to fetch. This parameter has a minimum value of 1. */
        fun minimumDigits(minimumDigits: Int) = apply { body.minimumDigits(minimumDigits) }

        /**
         * Sets [Builder.minimumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumDigits(minimumDigits: JsonField<Int>) = apply {
            body.minimumDigits(minimumDigits)
        }

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
         * The digit used to terminate input if fewer than `maximum_digits` digits have been
         * gathered.
         */
        fun terminatingDigit(terminatingDigit: String) = apply {
            body.terminatingDigit(terminatingDigit)
        }

        /**
         * Sets [Builder.terminatingDigit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.terminatingDigit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun terminatingDigit(terminatingDigit: JsonField<String>) = apply {
            body.terminatingDigit(terminatingDigit)
        }

        /**
         * The number of milliseconds to wait for a DTMF response after speak ends before a
         * replaying the sound file.
         */
        fun timeoutMillis(timeoutMillis: Int) = apply { body.timeoutMillis(timeoutMillis) }

        /**
         * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMillis] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutMillis(timeoutMillis: JsonField<Int>) = apply {
            body.timeoutMillis(timeoutMillis)
        }

        /** A list of all digits accepted as valid. */
        fun validDigits(validDigits: String) = apply { body.validDigits(validDigits) }

        /**
         * Sets [Builder.validDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validDigits] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun validDigits(validDigits: JsonField<String>) = apply { body.validDigits(validDigits) }

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
        fun voiceSettings(minimax: VoiceSettings.Minimax) = apply { body.voiceSettings(minimax) }

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
         * Returns an immutable instance of [ActionGatherUsingSpeakParams].
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
        fun build(): ActionGatherUsingSpeakParams =
            ActionGatherUsingSpeakParams(
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
        private val interDigitTimeoutMillis: JsonField<Int>,
        private val invalidPayload: JsonField<String>,
        private val language: JsonField<Language>,
        private val maximumDigits: JsonField<Int>,
        private val maximumTries: JsonField<Int>,
        private val minimumDigits: JsonField<Int>,
        private val payloadType: JsonField<PayloadType>,
        private val serviceLevel: JsonField<ServiceLevel>,
        private val terminatingDigit: JsonField<String>,
        private val timeoutMillis: JsonField<Int>,
        private val validDigits: JsonField<String>,
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
            @JsonProperty("inter_digit_timeout_millis")
            @ExcludeMissing
            interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("invalid_payload")
            @ExcludeMissing
            invalidPayload: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
            @JsonProperty("maximum_digits")
            @ExcludeMissing
            maximumDigits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("maximum_tries")
            @ExcludeMissing
            maximumTries: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("minimum_digits")
            @ExcludeMissing
            minimumDigits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payload_type")
            @ExcludeMissing
            payloadType: JsonField<PayloadType> = JsonMissing.of(),
            @JsonProperty("service_level")
            @ExcludeMissing
            serviceLevel: JsonField<ServiceLevel> = JsonMissing.of(),
            @JsonProperty("terminating_digit")
            @ExcludeMissing
            terminatingDigit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout_millis")
            @ExcludeMissing
            timeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("valid_digits")
            @ExcludeMissing
            validDigits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            payload,
            voice,
            clientState,
            commandId,
            interDigitTimeoutMillis,
            invalidPayload,
            language,
            maximumDigits,
            maximumTries,
            minimumDigits,
            payloadType,
            serviceLevel,
            terminatingDigit,
            timeoutMillis,
            validDigits,
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
         * **Supported Providers:**
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
         *   identifier secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g.,
         *   `Minimax.speech-02-hd.Wise_Woman`). Supported models: `speech-02-turbo`,
         *   `speech-02-hd`, `speech-2.6-turbo`, `speech-2.8-turbo`. Optional parameters: `speed`
         *   (float, default 1.0), `vol` (float, default 1.0), `pitch` (integer, default 0).
         * - **Resemble:** Use `Resemble.<ModelId>.<VoiceId>` (e.g., `Resemble.Pro.my_voice`).
         *   Supported models: `Pro` (multilingual) and `Turbo` (English only).
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
         * The number of milliseconds to wait for input between digits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interDigitTimeoutMillis(): Optional<Int> =
            interDigitTimeoutMillis.getOptional("inter_digit_timeout_millis")

        /**
         * The text or SSML to be converted into speech when digits don't match the `valid_digits`
         * parameter or the number of digits is not between `min` and `max`. There is a 3,000
         * character limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidPayload(): Optional<String> = invalidPayload.getOptional("invalid_payload")

        /**
         * The language you want spoken. This parameter is ignored when a `Polly.*` voice is
         * specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

        /**
         * The maximum number of digits to fetch. This parameter has a maximum value of 128.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumDigits(): Optional<Int> = maximumDigits.getOptional("maximum_digits")

        /**
         * The maximum number of times that a file should be played back if there is no input from
         * the user on the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumTries(): Optional<Int> = maximumTries.getOptional("maximum_tries")

        /**
         * The minimum number of digits to fetch. This parameter has a minimum value of 1.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumDigits(): Optional<Int> = minimumDigits.getOptional("minimum_digits")

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
         * The digit used to terminate input if fewer than `maximum_digits` digits have been
         * gathered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun terminatingDigit(): Optional<String> = terminatingDigit.getOptional("terminating_digit")

        /**
         * The number of milliseconds to wait for a DTMF response after speak ends before a
         * replaying the sound file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMillis(): Optional<Int> = timeoutMillis.getOptional("timeout_millis")

        /**
         * A list of all digits accepted as valid.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun validDigits(): Optional<String> = validDigits.getOptional("valid_digits")

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
         * Returns the raw JSON value of [interDigitTimeoutMillis].
         *
         * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inter_digit_timeout_millis")
        @ExcludeMissing
        fun _interDigitTimeoutMillis(): JsonField<Int> = interDigitTimeoutMillis

        /**
         * Returns the raw JSON value of [invalidPayload].
         *
         * Unlike [invalidPayload], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invalid_payload")
        @ExcludeMissing
        fun _invalidPayload(): JsonField<String> = invalidPayload

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

        /**
         * Returns the raw JSON value of [maximumDigits].
         *
         * Unlike [maximumDigits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_digits")
        @ExcludeMissing
        fun _maximumDigits(): JsonField<Int> = maximumDigits

        /**
         * Returns the raw JSON value of [maximumTries].
         *
         * Unlike [maximumTries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_tries")
        @ExcludeMissing
        fun _maximumTries(): JsonField<Int> = maximumTries

        /**
         * Returns the raw JSON value of [minimumDigits].
         *
         * Unlike [minimumDigits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_digits")
        @ExcludeMissing
        fun _minimumDigits(): JsonField<Int> = minimumDigits

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
         * Returns the raw JSON value of [terminatingDigit].
         *
         * Unlike [terminatingDigit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terminating_digit")
        @ExcludeMissing
        fun _terminatingDigit(): JsonField<String> = terminatingDigit

        /**
         * Returns the raw JSON value of [timeoutMillis].
         *
         * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeout_millis")
        @ExcludeMissing
        fun _timeoutMillis(): JsonField<Int> = timeoutMillis

        /**
         * Returns the raw JSON value of [validDigits].
         *
         * Unlike [validDigits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valid_digits")
        @ExcludeMissing
        fun _validDigits(): JsonField<String> = validDigits

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
            private var interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of()
            private var invalidPayload: JsonField<String> = JsonMissing.of()
            private var language: JsonField<Language> = JsonMissing.of()
            private var maximumDigits: JsonField<Int> = JsonMissing.of()
            private var maximumTries: JsonField<Int> = JsonMissing.of()
            private var minimumDigits: JsonField<Int> = JsonMissing.of()
            private var payloadType: JsonField<PayloadType> = JsonMissing.of()
            private var serviceLevel: JsonField<ServiceLevel> = JsonMissing.of()
            private var terminatingDigit: JsonField<String> = JsonMissing.of()
            private var timeoutMillis: JsonField<Int> = JsonMissing.of()
            private var validDigits: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                payload = body.payload
                voice = body.voice
                clientState = body.clientState
                commandId = body.commandId
                interDigitTimeoutMillis = body.interDigitTimeoutMillis
                invalidPayload = body.invalidPayload
                language = body.language
                maximumDigits = body.maximumDigits
                maximumTries = body.maximumTries
                minimumDigits = body.minimumDigits
                payloadType = body.payloadType
                serviceLevel = body.serviceLevel
                terminatingDigit = body.terminatingDigit
                timeoutMillis = body.timeoutMillis
                validDigits = body.validDigits
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
             * **Supported Providers:**
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
             *   "<secret_identifier>"}`. Check
             *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
             * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
             * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g.,
             *   `Minimax.speech-02-hd.Wise_Woman`). Supported models: `speech-02-turbo`,
             *   `speech-02-hd`, `speech-2.6-turbo`, `speech-2.8-turbo`. Optional parameters:
             *   `speed` (float, default 1.0), `vol` (float, default 1.0), `pitch` (integer, default
             *   0).
             * - **Resemble:** Use `Resemble.<ModelId>.<VoiceId>` (e.g., `Resemble.Pro.my_voice`).
             *   Supported models: `Pro` (multilingual) and `Turbo` (English only).
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

            /** The number of milliseconds to wait for input between digits. */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: Int) =
                interDigitTimeoutMillis(JsonField.of(interDigitTimeoutMillis))

            /**
             * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Int>) = apply {
                this.interDigitTimeoutMillis = interDigitTimeoutMillis
            }

            /**
             * The text or SSML to be converted into speech when digits don't match the
             * `valid_digits` parameter or the number of digits is not between `min` and `max`.
             * There is a 3,000 character limit.
             */
            fun invalidPayload(invalidPayload: String) =
                invalidPayload(JsonField.of(invalidPayload))

            /**
             * Sets [Builder.invalidPayload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invalidPayload] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invalidPayload(invalidPayload: JsonField<String>) = apply {
                this.invalidPayload = invalidPayload
            }

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

            /** The maximum number of digits to fetch. This parameter has a maximum value of 128. */
            fun maximumDigits(maximumDigits: Int) = maximumDigits(JsonField.of(maximumDigits))

            /**
             * Sets [Builder.maximumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumDigits] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumDigits(maximumDigits: JsonField<Int>) = apply {
                this.maximumDigits = maximumDigits
            }

            /**
             * The maximum number of times that a file should be played back if there is no input
             * from the user on the call.
             */
            fun maximumTries(maximumTries: Int) = maximumTries(JsonField.of(maximumTries))

            /**
             * Sets [Builder.maximumTries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumTries] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumTries(maximumTries: JsonField<Int>) = apply {
                this.maximumTries = maximumTries
            }

            /** The minimum number of digits to fetch. This parameter has a minimum value of 1. */
            fun minimumDigits(minimumDigits: Int) = minimumDigits(JsonField.of(minimumDigits))

            /**
             * Sets [Builder.minimumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumDigits] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumDigits(minimumDigits: JsonField<Int>) = apply {
                this.minimumDigits = minimumDigits
            }

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
             * The digit used to terminate input if fewer than `maximum_digits` digits have been
             * gathered.
             */
            fun terminatingDigit(terminatingDigit: String) =
                terminatingDigit(JsonField.of(terminatingDigit))

            /**
             * Sets [Builder.terminatingDigit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminatingDigit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terminatingDigit(terminatingDigit: JsonField<String>) = apply {
                this.terminatingDigit = terminatingDigit
            }

            /**
             * The number of milliseconds to wait for a DTMF response after speak ends before a
             * replaying the sound file.
             */
            fun timeoutMillis(timeoutMillis: Int) = timeoutMillis(JsonField.of(timeoutMillis))

            /**
             * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMillis] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMillis(timeoutMillis: JsonField<Int>) = apply {
                this.timeoutMillis = timeoutMillis
            }

            /** A list of all digits accepted as valid. */
            fun validDigits(validDigits: String) = validDigits(JsonField.of(validDigits))

            /**
             * Sets [Builder.validDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validDigits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validDigits(validDigits: JsonField<String>) = apply {
                this.validDigits = validDigits
            }

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
            fun voiceSettings(minimax: VoiceSettings.Minimax) =
                voiceSettings(VoiceSettings.ofMinimax(minimax))

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
                    interDigitTimeoutMillis,
                    invalidPayload,
                    language,
                    maximumDigits,
                    maximumTries,
                    minimumDigits,
                    payloadType,
                    serviceLevel,
                    terminatingDigit,
                    timeoutMillis,
                    validDigits,
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
            interDigitTimeoutMillis()
            invalidPayload()
            language().ifPresent { it.validate() }
            maximumDigits()
            maximumTries()
            minimumDigits()
            payloadType().ifPresent { it.validate() }
            serviceLevel().ifPresent { it.validate() }
            terminatingDigit()
            timeoutMillis()
            validDigits()
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
                (if (interDigitTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (invalidPayload.asKnown().isPresent) 1 else 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maximumDigits.asKnown().isPresent) 1 else 0) +
                (if (maximumTries.asKnown().isPresent) 1 else 0) +
                (if (minimumDigits.asKnown().isPresent) 1 else 0) +
                (payloadType.asKnown().getOrNull()?.validity() ?: 0) +
                (serviceLevel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (terminatingDigit.asKnown().isPresent) 1 else 0) +
                (if (timeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (validDigits.asKnown().isPresent) 1 else 0) +
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
                interDigitTimeoutMillis == other.interDigitTimeoutMillis &&
                invalidPayload == other.invalidPayload &&
                language == other.language &&
                maximumDigits == other.maximumDigits &&
                maximumTries == other.maximumTries &&
                minimumDigits == other.minimumDigits &&
                payloadType == other.payloadType &&
                serviceLevel == other.serviceLevel &&
                terminatingDigit == other.terminatingDigit &&
                timeoutMillis == other.timeoutMillis &&
                validDigits == other.validDigits &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                payload,
                voice,
                clientState,
                commandId,
                interDigitTimeoutMillis,
                invalidPayload,
                language,
                maximumDigits,
                maximumTries,
                minimumDigits,
                payloadType,
                serviceLevel,
                terminatingDigit,
                timeoutMillis,
                validDigits,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{payload=$payload, voice=$voice, clientState=$clientState, commandId=$commandId, interDigitTimeoutMillis=$interDigitTimeoutMillis, invalidPayload=$invalidPayload, language=$language, maximumDigits=$maximumDigits, maximumTries=$maximumTries, minimumDigits=$minimumDigits, payloadType=$payloadType, serviceLevel=$serviceLevel, terminatingDigit=$terminatingDigit, timeoutMillis=$timeoutMillis, validDigits=$validDigits, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
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
        private val elevenlabs: ElevenLabsVoiceSettings? = null,
        private val telnyx: TelnyxVoiceSettings? = null,
        private val aws: AwsVoiceSettings? = null,
        private val minimax: Minimax? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun minimax(): Optional<Minimax> = Optional.ofNullable(minimax)

        fun isElevenlabs(): Boolean = elevenlabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun isMinimax(): Boolean = minimax != null

        fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun asMinimax(): Minimax = minimax.getOrThrow("minimax")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                aws != null -> visitor.visitAws(aws)
                minimax != null -> visitor.visitMinimax(minimax)
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

                    override fun visitMinimax(minimax: Minimax) {
                        minimax.validate()
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

                    override fun visitMinimax(minimax: Minimax) = minimax.validity()

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
                minimax == other.minimax
        }

        override fun hashCode(): Int = Objects.hash(elevenlabs, telnyx, aws, minimax)

        override fun toString(): String =
            when {
                elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                minimax != null -> "VoiceSettings{minimax=$minimax}"
                _json != null -> "VoiceSettings{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid VoiceSettings")
            }

        companion object {

            @JvmStatic
            fun ofElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                VoiceSettings(elevenlabs = elevenlabs)

            @JvmStatic fun ofTelnyx(telnyx: TelnyxVoiceSettings) = VoiceSettings(telnyx = telnyx)

            @JvmStatic fun ofAws(aws: AwsVoiceSettings) = VoiceSettings(aws = aws)

            @JvmStatic fun ofMinimax(minimax: Minimax) = VoiceSettings(minimax = minimax)
        }

        /**
         * An interface that defines how to map each variant of [VoiceSettings] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings): T

            fun visitTelnyx(telnyx: TelnyxVoiceSettings): T

            fun visitAws(aws: AwsVoiceSettings): T

            fun visitMinimax(minimax: Minimax): T

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
                        return tryDeserialize(node, jacksonTypeRef<Minimax>())?.let {
                            VoiceSettings(minimax = it, _json = json)
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
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid VoiceSettings")
                }
            }
        }

        class Minimax
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val pitch: JsonField<Long>,
            private val speed: JsonField<Float>,
            private val vol: JsonField<Float>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("pitch") @ExcludeMissing pitch: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("speed") @ExcludeMissing speed: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("vol") @ExcludeMissing vol: JsonField<Float> = JsonMissing.of(),
            ) : this(type, pitch, speed, vol, mutableMapOf())

            /**
             * Voice settings provider type
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("minimax")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Voice pitch adjustment. Default is 0.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pitch(): Optional<Long> = pitch.getOptional("pitch")

            /**
             * Speech speed multiplier. Default is 1.0.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun speed(): Optional<Float> = speed.getOptional("speed")

            /**
             * Speech volume multiplier. Default is 1.0.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun vol(): Optional<Float> = vol.getOptional("vol")

            /**
             * Returns the raw JSON value of [pitch].
             *
             * Unlike [pitch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pitch") @ExcludeMissing fun _pitch(): JsonField<Long> = pitch

            /**
             * Returns the raw JSON value of [speed].
             *
             * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Float> = speed

            /**
             * Returns the raw JSON value of [vol].
             *
             * Unlike [vol], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vol") @ExcludeMissing fun _vol(): JsonField<Float> = vol

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

                /** Returns a mutable builder for constructing an instance of [Minimax]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Minimax]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("minimax")
                private var pitch: JsonField<Long> = JsonMissing.of()
                private var speed: JsonField<Float> = JsonMissing.of()
                private var vol: JsonField<Float> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimax: Minimax) = apply {
                    type = minimax.type
                    pitch = minimax.pitch
                    speed = minimax.speed
                    vol = minimax.vol
                    additionalProperties = minimax.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("minimax")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Voice pitch adjustment. Default is 0. */
                fun pitch(pitch: Long) = pitch(JsonField.of(pitch))

                /**
                 * Sets [Builder.pitch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pitch] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun pitch(pitch: JsonField<Long>) = apply { this.pitch = pitch }

                /** Speech speed multiplier. Default is 1.0. */
                fun speed(speed: Float) = speed(JsonField.of(speed))

                /**
                 * Sets [Builder.speed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.speed] with a well-typed [Float] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun speed(speed: JsonField<Float>) = apply { this.speed = speed }

                /** Speech volume multiplier. Default is 1.0. */
                fun vol(vol: Float) = vol(JsonField.of(vol))

                /**
                 * Sets [Builder.vol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vol] with a well-typed [Float] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun vol(vol: JsonField<Float>) = apply { this.vol = vol }

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
                 * Returns an immutable instance of [Minimax].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Minimax =
                    Minimax(type, pitch, speed, vol, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Minimax = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("minimax")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                pitch()
                speed()
                vol()
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
                type.let { if (it == JsonValue.from("minimax")) 1 else 0 } +
                    (if (pitch.asKnown().isPresent) 1 else 0) +
                    (if (speed.asKnown().isPresent) 1 else 0) +
                    (if (vol.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimax &&
                    type == other.type &&
                    pitch == other.pitch &&
                    speed == other.speed &&
                    vol == other.vol &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, pitch, speed, vol, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimax{type=$type, pitch=$pitch, speed=$speed, vol=$vol, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionGatherUsingSpeakParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionGatherUsingSpeakParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
