// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

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
import com.telnyx.sdk.models.MinimaxVoiceSettings
import com.telnyx.sdk.models.calls.actions.AwsVoiceSettings
import com.telnyx.sdk.models.calls.actions.ElevenLabsVoiceSettings
import com.telnyx.sdk.models.calls.actions.TelnyxVoiceSettings
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Convert text to speech and play it to all or some participants. */
class ActionSpeakParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

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
     * - **Azure:** Use `Azure.<VoiceId>` (e.g., `Azure.en-CA-ClaraNeural`,
     *   `Azure.en-US-BrianMultilingualNeural`, `Azure.en-US-Ava:DragonHDLatestNeural`). For a
     *   complete list of voices, go to
     *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery). Use
     *   `voice_settings` to configure custom deployments, regions, or API keys.
     * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
     *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is optional.
     *   To use ElevenLabs, you must provide your ElevenLabs API key as an integration identifier
     *   secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. See
     *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     *   for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
     * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>` (e.g., `Telnyx.KokoroTTS.af`). Use
     *   `voice_settings` to configure voice_speed and other synthesis parameters.
     * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g., `Minimax.speech-02-hd.Wise_Woman`).
     *   Supported models: `speech-02-turbo`, `speech-02-hd`, `speech-2.6-turbo`,
     *   `speech-2.8-turbo`. Use `voice_settings` to configure speed, volume, pitch, and
     *   language_boost.
     * - **Rime:** Use `Rime.<model_id>.<voice_id>` (e.g., `Rime.Arcana.cove`). Supported model_ids:
     *   `Arcana`, `Mist`. Use `voice_settings` to configure voice_speed.
     * - **Resemble:** Use `Resemble.Turbo.<voice_id>` (e.g., `Resemble.Turbo.my_voice`). Only
     *   `Turbo` model is supported. Use `voice_settings` to configure precision, sample_rate, and
     *   format.
     *
     * For service_level basic, you may define the gender of the speaker (male or female).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voice(): String = body.voice()

    /**
     * Call Control IDs of participants who will hear the spoken text. When empty all participants
     * will hear the spoken text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callControlIds(): Optional<List<String>> = body.callControlIds()

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
     * commands with the same `command_id` as one that has already been executed.
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
     * Region where the conference data is located. Defaults to the region defined in user's data
     * locality settings (Europe or US).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<Region> = body.region()

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
     * Returns the raw JSON value of [callControlIds].
     *
     * Unlike [callControlIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callControlIds(): JsonField<List<String>> = body._callControlIds()

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
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _region(): JsonField<Region> = body._region()

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

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionSpeakParams: ActionSpeakParams) = apply {
            id = actionSpeakParams.id
            body = actionSpeakParams.body.toBuilder()
            additionalHeaders = actionSpeakParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionSpeakParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [payload]
         * - [voice]
         * - [callControlIds]
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
         * - **Azure:** Use `Azure.<VoiceId>` (e.g., `Azure.en-CA-ClaraNeural`,
         *   `Azure.en-US-BrianMultilingualNeural`, `Azure.en-US-Ava:DragonHDLatestNeural`). For a
         *   complete list of voices, go to
         *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery). Use
         *   `voice_settings` to configure custom deployments, regions, or API keys.
         * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
         *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is
         *   optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration
         *   identifier secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>` (e.g., `Telnyx.KokoroTTS.af`). Use
         *   `voice_settings` to configure voice_speed and other synthesis parameters.
         * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g.,
         *   `Minimax.speech-02-hd.Wise_Woman`). Supported models: `speech-02-turbo`,
         *   `speech-02-hd`, `speech-2.6-turbo`, `speech-2.8-turbo`. Use `voice_settings` to
         *   configure speed, volume, pitch, and language_boost.
         * - **Rime:** Use `Rime.<model_id>.<voice_id>` (e.g., `Rime.Arcana.cove`). Supported
         *   model_ids: `Arcana`, `Mist`. Use `voice_settings` to configure voice_speed.
         * - **Resemble:** Use `Resemble.Turbo.<voice_id>` (e.g., `Resemble.Turbo.my_voice`). Only
         *   `Turbo` model is supported. Use `voice_settings` to configure precision, sample_rate,
         *   and format.
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
         * Call Control IDs of participants who will hear the spoken text. When empty all
         * participants will hear the spoken text.
         */
        fun callControlIds(callControlIds: List<String>) = apply {
            body.callControlIds(callControlIds)
        }

        /**
         * Sets [Builder.callControlIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callControlIds(callControlIds: JsonField<List<String>>) = apply {
            body.callControlIds(callControlIds)
        }

        /**
         * Adds a single [String] to [callControlIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallControlId(callControlId: String) = apply { body.addCallControlId(callControlId) }

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
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
         * Region where the conference data is located. Defaults to the region defined in user's
         * data locality settings (Europe or US).
         */
        fun region(region: Region) = apply { body.region(region) }

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [Region] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<Region>) = apply { body.region(region) }

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
        fun voiceSettings(azure: VoiceSettings.Azure) = apply { body.voiceSettings(azure) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
        fun voiceSettings(rime: VoiceSettings.Rime) = apply { body.voiceSettings(rime) }

        /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
        fun voiceSettings(resemble: VoiceSettings.Resemble) = apply { body.voiceSettings(resemble) }

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
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val payload: JsonField<String>,
        private val voice: JsonField<String>,
        private val callControlIds: JsonField<List<String>>,
        private val commandId: JsonField<String>,
        private val language: JsonField<Language>,
        private val payloadType: JsonField<PayloadType>,
        private val region: JsonField<Region>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_control_ids")
            @ExcludeMissing
            callControlIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
            @JsonProperty("payload_type")
            @ExcludeMissing
            payloadType: JsonField<PayloadType> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            payload,
            voice,
            callControlIds,
            commandId,
            language,
            payloadType,
            region,
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
         * - **Azure:** Use `Azure.<VoiceId>` (e.g., `Azure.en-CA-ClaraNeural`,
         *   `Azure.en-US-BrianMultilingualNeural`, `Azure.en-US-Ava:DragonHDLatestNeural`). For a
         *   complete list of voices, go to
         *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery). Use
         *   `voice_settings` to configure custom deployments, regions, or API keys.
         * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
         *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is
         *   optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration
         *   identifier secret in `"voice_settings": {"api_key_ref": "<secret_identifier>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>` (e.g., `Telnyx.KokoroTTS.af`). Use
         *   `voice_settings` to configure voice_speed and other synthesis parameters.
         * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g.,
         *   `Minimax.speech-02-hd.Wise_Woman`). Supported models: `speech-02-turbo`,
         *   `speech-02-hd`, `speech-2.6-turbo`, `speech-2.8-turbo`. Use `voice_settings` to
         *   configure speed, volume, pitch, and language_boost.
         * - **Rime:** Use `Rime.<model_id>.<voice_id>` (e.g., `Rime.Arcana.cove`). Supported
         *   model_ids: `Arcana`, `Mist`. Use `voice_settings` to configure voice_speed.
         * - **Resemble:** Use `Resemble.Turbo.<voice_id>` (e.g., `Resemble.Turbo.my_voice`). Only
         *   `Turbo` model is supported. Use `voice_settings` to configure precision, sample_rate,
         *   and format.
         *
         * For service_level basic, you may define the gender of the speaker (male or female).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voice(): String = voice.getRequired("voice")

        /**
         * Call Control IDs of participants who will hear the spoken text. When empty all
         * participants will hear the spoken text.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callControlIds(): Optional<List<String>> =
            callControlIds.getOptional("call_control_ids")

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
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
         * Region where the conference data is located. Defaults to the region defined in user's
         * data locality settings (Europe or US).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<Region> = region.getOptional("region")

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
         * Returns the raw JSON value of [callControlIds].
         *
         * Unlike [callControlIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_ids")
        @ExcludeMissing
        fun _callControlIds(): JsonField<List<String>> = callControlIds

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
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

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
            private var callControlIds: JsonField<MutableList<String>>? = null
            private var commandId: JsonField<String> = JsonMissing.of()
            private var language: JsonField<Language> = JsonMissing.of()
            private var payloadType: JsonField<PayloadType> = JsonMissing.of()
            private var region: JsonField<Region> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                payload = body.payload
                voice = body.voice
                callControlIds = body.callControlIds.map { it.toMutableList() }
                commandId = body.commandId
                language = body.language
                payloadType = body.payloadType
                region = body.region
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
             * - **Azure:** Use `Azure.<VoiceId>` (e.g., `Azure.en-CA-ClaraNeural`,
             *   `Azure.en-US-BrianMultilingualNeural`, `Azure.en-US-Ava:DragonHDLatestNeural`). For
             *   a complete list of voices, go to
             *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery). Use
             *   `voice_settings` to configure custom deployments, regions, or API keys.
             * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
             *   `ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM`). The `ModelId` part is
             *   optional. To use ElevenLabs, you must provide your ElevenLabs API key as an
             *   integration identifier secret in `"voice_settings": {"api_key_ref":
             *   "<secret_identifier>"}`. See
             *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
             *   for details. Check
             *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
             * - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>` (e.g., `Telnyx.KokoroTTS.af`). Use
             *   `voice_settings` to configure voice_speed and other synthesis parameters.
             * - **Minimax:** Use `Minimax.<ModelId>.<VoiceId>` (e.g.,
             *   `Minimax.speech-02-hd.Wise_Woman`). Supported models: `speech-02-turbo`,
             *   `speech-02-hd`, `speech-2.6-turbo`, `speech-2.8-turbo`. Use `voice_settings` to
             *   configure speed, volume, pitch, and language_boost.
             * - **Rime:** Use `Rime.<model_id>.<voice_id>` (e.g., `Rime.Arcana.cove`). Supported
             *   model_ids: `Arcana`, `Mist`. Use `voice_settings` to configure voice_speed.
             * - **Resemble:** Use `Resemble.Turbo.<voice_id>` (e.g., `Resemble.Turbo.my_voice`).
             *   Only `Turbo` model is supported. Use `voice_settings` to configure precision,
             *   sample_rate, and format.
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
             * Call Control IDs of participants who will hear the spoken text. When empty all
             * participants will hear the spoken text.
             */
            fun callControlIds(callControlIds: List<String>) =
                callControlIds(JsonField.of(callControlIds))

            /**
             * Sets [Builder.callControlIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callControlIds(callControlIds: JsonField<List<String>>) = apply {
                this.callControlIds = callControlIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [callControlIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallControlId(callControlId: String) = apply {
                callControlIds =
                    (callControlIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callControlIds", it).add(callControlId)
                    }
            }

            /**
             * Use this field to avoid execution of duplicate commands. Telnyx will ignore
             * subsequent commands with the same `command_id` as one that has already been executed.
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
             * Region where the conference data is located. Defaults to the region defined in user's
             * data locality settings (Europe or US).
             */
            fun region(region: Region) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [Region] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<Region>) = apply { this.region = region }

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
            fun voiceSettings(azure: VoiceSettings.Azure) =
                voiceSettings(VoiceSettings.ofAzure(azure))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
            fun voiceSettings(rime: VoiceSettings.Rime) = voiceSettings(VoiceSettings.ofRime(rime))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
            fun voiceSettings(resemble: VoiceSettings.Resemble) =
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
                    (callControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                    commandId,
                    language,
                    payloadType,
                    region,
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
            callControlIds()
            commandId()
            language().ifPresent { it.validate() }
            payloadType().ifPresent { it.validate() }
            region().ifPresent { it.validate() }
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
                (callControlIds.asKnown().getOrNull()?.size ?: 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (payloadType.asKnown().getOrNull()?.validity() ?: 0) +
                (region.asKnown().getOrNull()?.validity() ?: 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                payload == other.payload &&
                voice == other.voice &&
                callControlIds == other.callControlIds &&
                commandId == other.commandId &&
                language == other.language &&
                payloadType == other.payloadType &&
                region == other.region &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                payload,
                voice,
                callControlIds,
                commandId,
                language,
                payloadType,
                region,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{payload=$payload, voice=$voice, callControlIds=$callControlIds, commandId=$commandId, language=$language, payloadType=$payloadType, region=$region, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
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
     * Region where the conference data is located. Defaults to the region defined in user's data
     * locality settings (Europe or US).
     */
    class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUSTRALIA = of("Australia")

            @JvmField val EUROPE = of("Europe")

            @JvmField val MIDDLE_EAST = of("Middle East")

            @JvmField val US = of("US")

            @JvmStatic fun of(value: String) = Region(JsonField.of(value))
        }

        /** An enum containing [Region]'s known values. */
        enum class Known {
            AUSTRALIA,
            EUROPE,
            MIDDLE_EAST,
            US,
        }

        /**
         * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Region] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUSTRALIA,
            EUROPE,
            MIDDLE_EAST,
            US,
            /** An enum member indicating that [Region] was instantiated with an unknown value. */
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
                AUSTRALIA -> Value.AUSTRALIA
                EUROPE -> Value.EUROPE
                MIDDLE_EAST -> Value.MIDDLE_EAST
                US -> Value.US
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
                AUSTRALIA -> Known.AUSTRALIA
                EUROPE -> Known.EUROPE
                MIDDLE_EAST -> Known.MIDDLE_EAST
                US -> Known.US
                else -> throw TelnyxInvalidDataException("Unknown Region: $value")
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

        fun validate(): Region = apply {
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

            return other is Region && value == other.value
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
        private val minimax: MinimaxVoiceSettings? = null,
        private val azure: Azure? = null,
        private val rime: Rime? = null,
        private val resemble: Resemble? = null,
        private val _json: JsonValue? = null,
    ) {

        fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

        fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

        fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

        fun minimax(): Optional<MinimaxVoiceSettings> = Optional.ofNullable(minimax)

        fun azure(): Optional<Azure> = Optional.ofNullable(azure)

        fun rime(): Optional<Rime> = Optional.ofNullable(rime)

        fun resemble(): Optional<Resemble> = Optional.ofNullable(resemble)

        fun isElevenlabs(): Boolean = elevenlabs != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAws(): Boolean = aws != null

        fun isMinimax(): Boolean = minimax != null

        fun isAzure(): Boolean = azure != null

        fun isRime(): Boolean = rime != null

        fun isResemble(): Boolean = resemble != null

        fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

        fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

        fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

        fun asMinimax(): MinimaxVoiceSettings = minimax.getOrThrow("minimax")

        fun asAzure(): Azure = azure.getOrThrow("azure")

        fun asRime(): Rime = rime.getOrThrow("rime")

        fun asResemble(): Resemble = resemble.getOrThrow("resemble")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                aws != null -> visitor.visitAws(aws)
                minimax != null -> visitor.visitMinimax(minimax)
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

                    override fun visitMinimax(minimax: MinimaxVoiceSettings) {
                        minimax.validate()
                    }

                    override fun visitAzure(azure: Azure) {
                        azure.validate()
                    }

                    override fun visitRime(rime: Rime) {
                        rime.validate()
                    }

                    override fun visitResemble(resemble: Resemble) {
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

                    override fun visitMinimax(minimax: MinimaxVoiceSettings) = minimax.validity()

                    override fun visitAzure(azure: Azure) = azure.validity()

                    override fun visitRime(rime: Rime) = rime.validity()

                    override fun visitResemble(resemble: Resemble) = resemble.validity()

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
                resemble == other.resemble
        }

        override fun hashCode(): Int =
            Objects.hash(elevenlabs, telnyx, aws, minimax, azure, rime, resemble)

        override fun toString(): String =
            when {
                elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                aws != null -> "VoiceSettings{aws=$aws}"
                minimax != null -> "VoiceSettings{minimax=$minimax}"
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

            @JvmStatic
            fun ofMinimax(minimax: MinimaxVoiceSettings) = VoiceSettings(minimax = minimax)

            @JvmStatic fun ofAzure(azure: Azure) = VoiceSettings(azure = azure)

            @JvmStatic fun ofRime(rime: Rime) = VoiceSettings(rime = rime)

            @JvmStatic fun ofResemble(resemble: Resemble) = VoiceSettings(resemble = resemble)
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

            fun visitAzure(azure: Azure): T

            fun visitRime(rime: Rime): T

            fun visitResemble(resemble: Resemble): T

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
                        return tryDeserialize(node, jacksonTypeRef<Azure>())?.let {
                            VoiceSettings(azure = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                    "rime" -> {
                        return tryDeserialize(node, jacksonTypeRef<Rime>())?.let {
                            VoiceSettings(rime = it, _json = json)
                        } ?: VoiceSettings(_json = json)
                    }
                    "resemble" -> {
                        return tryDeserialize(node, jacksonTypeRef<Resemble>())?.let {
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
                    value.minimax != null -> generator.writeObject(value.minimax)
                    value.azure != null -> generator.writeObject(value.azure)
                    value.rime != null -> generator.writeObject(value.rime)
                    value.resemble != null -> generator.writeObject(value.resemble)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid VoiceSettings")
                }
            }
        }

        class Azure
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val apiKeyRef: JsonField<String>,
            private val deploymentId: JsonField<String>,
            private val effect: JsonField<Effect>,
            private val gender: JsonField<Gender>,
            private val region: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("api_key_ref")
                @ExcludeMissing
                apiKeyRef: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deployment_id")
                @ExcludeMissing
                deploymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("effect")
                @ExcludeMissing
                effect: JsonField<Effect> = JsonMissing.of(),
                @JsonProperty("gender")
                @ExcludeMissing
                gender: JsonField<Gender> = JsonMissing.of(),
                @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            ) : this(type, apiKeyRef, deploymentId, effect, gender, region, mutableMapOf())

            /**
             * Voice settings provider type
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("azure")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * The `identifier` for an integration secret that refers to your Azure Speech API key.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

            /**
             * The deployment ID for a custom Azure neural voice.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deploymentId(): Optional<String> = deploymentId.getOptional("deployment_id")

            /**
             * Audio effect to apply.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun effect(): Optional<Effect> = effect.getOptional("effect")

            /**
             * Voice gender filter.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun gender(): Optional<Gender> = gender.getOptional("gender")

            /**
             * The Azure region for the Speech service (e.g., `eastus`, `westeurope`). Required when
             * using a custom API key.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun region(): Optional<String> = region.getOptional("region")

            /**
             * Returns the raw JSON value of [apiKeyRef].
             *
             * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("api_key_ref")
            @ExcludeMissing
            fun _apiKeyRef(): JsonField<String> = apiKeyRef

            /**
             * Returns the raw JSON value of [deploymentId].
             *
             * Unlike [deploymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deployment_id")
            @ExcludeMissing
            fun _deploymentId(): JsonField<String> = deploymentId

            /**
             * Returns the raw JSON value of [effect].
             *
             * Unlike [effect], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("effect") @ExcludeMissing fun _effect(): JsonField<Effect> = effect

            /**
             * Returns the raw JSON value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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

                /** Returns a mutable builder for constructing an instance of [Azure]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Azure]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("azure")
                private var apiKeyRef: JsonField<String> = JsonMissing.of()
                private var deploymentId: JsonField<String> = JsonMissing.of()
                private var effect: JsonField<Effect> = JsonMissing.of()
                private var gender: JsonField<Gender> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(azure: Azure) = apply {
                    type = azure.type
                    apiKeyRef = azure.apiKeyRef
                    deploymentId = azure.deploymentId
                    effect = azure.effect
                    gender = azure.gender
                    region = azure.region
                    additionalProperties = azure.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("azure")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /**
                 * The `identifier` for an integration secret that refers to your Azure Speech API
                 * key.
                 */
                fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

                /**
                 * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.apiKeyRef] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

                /** The deployment ID for a custom Azure neural voice. */
                fun deploymentId(deploymentId: String) = deploymentId(JsonField.of(deploymentId))

                /**
                 * Sets [Builder.deploymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deploymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deploymentId(deploymentId: JsonField<String>) = apply {
                    this.deploymentId = deploymentId
                }

                /** Audio effect to apply. */
                fun effect(effect: Effect) = effect(JsonField.of(effect))

                /**
                 * Sets [Builder.effect] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effect] with a well-typed [Effect] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun effect(effect: JsonField<Effect>) = apply { this.effect = effect }

                /** Voice gender filter. */
                fun gender(gender: Gender) = gender(JsonField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

                /**
                 * The Azure region for the Speech service (e.g., `eastus`, `westeurope`). Required
                 * when using a custom API key.
                 */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

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
                 * Returns an immutable instance of [Azure].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Azure =
                    Azure(
                        type,
                        apiKeyRef,
                        deploymentId,
                        effect,
                        gender,
                        region,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Azure = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("azure")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                apiKeyRef()
                deploymentId()
                effect().ifPresent { it.validate() }
                gender().ifPresent { it.validate() }
                region()
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
                type.let { if (it == JsonValue.from("azure")) 1 else 0 } +
                    (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                    (if (deploymentId.asKnown().isPresent) 1 else 0) +
                    (effect.asKnown().getOrNull()?.validity() ?: 0) +
                    (gender.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (region.asKnown().isPresent) 1 else 0)

            /** Audio effect to apply. */
            class Effect @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val EQ_CAR = of("eq_car")

                    @JvmField val EQ_TELECOMHP8K = of("eq_telecomhp8k")

                    @JvmStatic fun of(value: String) = Effect(JsonField.of(value))
                }

                /** An enum containing [Effect]'s known values. */
                enum class Known {
                    EQ_CAR,
                    EQ_TELECOMHP8K,
                }

                /**
                 * An enum containing [Effect]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Effect] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EQ_CAR,
                    EQ_TELECOMHP8K,
                    /**
                     * An enum member indicating that [Effect] was instantiated with an unknown
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
                        EQ_CAR -> Value.EQ_CAR
                        EQ_TELECOMHP8K -> Value.EQ_TELECOMHP8K
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
                        EQ_CAR -> Known.EQ_CAR
                        EQ_TELECOMHP8K -> Known.EQ_TELECOMHP8K
                        else -> throw TelnyxInvalidDataException("Unknown Effect: $value")
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

                fun validate(): Effect = apply {
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

                    return other is Effect && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Voice gender filter. */
            class Gender @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MALE = of("Male")

                    @JvmField val FEMALE = of("Female")

                    @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
                }

                /** An enum containing [Gender]'s known values. */
                enum class Known {
                    MALE,
                    FEMALE,
                }

                /**
                 * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Gender] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MALE,
                    FEMALE,
                    /**
                     * An enum member indicating that [Gender] was instantiated with an unknown
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
                        MALE -> Value.MALE
                        FEMALE -> Value.FEMALE
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
                        MALE -> Known.MALE
                        FEMALE -> Known.FEMALE
                        else -> throw TelnyxInvalidDataException("Unknown Gender: $value")
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

                fun validate(): Gender = apply {
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

                    return other is Gender && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Azure &&
                    type == other.type &&
                    apiKeyRef == other.apiKeyRef &&
                    deploymentId == other.deploymentId &&
                    effect == other.effect &&
                    gender == other.gender &&
                    region == other.region &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    type,
                    apiKeyRef,
                    deploymentId,
                    effect,
                    gender,
                    region,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Azure{type=$type, apiKeyRef=$apiKeyRef, deploymentId=$deploymentId, effect=$effect, gender=$gender, region=$region, additionalProperties=$additionalProperties}"
        }

        class Rime
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val voiceSpeed: JsonField<Float>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("voice_speed")
                @ExcludeMissing
                voiceSpeed: JsonField<Float> = JsonMissing.of(),
            ) : this(type, voiceSpeed, mutableMapOf())

            /**
             * Voice settings provider type
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("rime")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Speech speed multiplier. Default is 1.0.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voiceSpeed(): Optional<Float> = voiceSpeed.getOptional("voice_speed")

            /**
             * Returns the raw JSON value of [voiceSpeed].
             *
             * Unlike [voiceSpeed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("voice_speed")
            @ExcludeMissing
            fun _voiceSpeed(): JsonField<Float> = voiceSpeed

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

                /** Returns a mutable builder for constructing an instance of [Rime]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rime]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("rime")
                private var voiceSpeed: JsonField<Float> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rime: Rime) = apply {
                    type = rime.type
                    voiceSpeed = rime.voiceSpeed
                    additionalProperties = rime.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("rime")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Speech speed multiplier. Default is 1.0. */
                fun voiceSpeed(voiceSpeed: Float) = voiceSpeed(JsonField.of(voiceSpeed))

                /**
                 * Sets [Builder.voiceSpeed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voiceSpeed] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun voiceSpeed(voiceSpeed: JsonField<Float>) = apply {
                    this.voiceSpeed = voiceSpeed
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
                 * Returns an immutable instance of [Rime].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Rime = Rime(type, voiceSpeed, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Rime = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("rime")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                voiceSpeed()
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
                type.let { if (it == JsonValue.from("rime")) 1 else 0 } +
                    (if (voiceSpeed.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rime &&
                    type == other.type &&
                    voiceSpeed == other.voiceSpeed &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, voiceSpeed, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rime{type=$type, voiceSpeed=$voiceSpeed, additionalProperties=$additionalProperties}"
        }

        class Resemble
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val format: JsonField<Format>,
            private val precision: JsonField<Precision>,
            private val sampleRate: JsonField<SampleRate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("format")
                @ExcludeMissing
                format: JsonField<Format> = JsonMissing.of(),
                @JsonProperty("precision")
                @ExcludeMissing
                precision: JsonField<Precision> = JsonMissing.of(),
                @JsonProperty("sample_rate")
                @ExcludeMissing
                sampleRate: JsonField<SampleRate> = JsonMissing.of(),
            ) : this(type, format, precision, sampleRate, mutableMapOf())

            /**
             * Voice settings provider type
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("resemble")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Output audio format.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun format(): Optional<Format> = format.getOptional("format")

            /**
             * Audio precision format.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun precision(): Optional<Precision> = precision.getOptional("precision")

            /**
             * Audio sample rate in Hz.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sampleRate(): Optional<SampleRate> = sampleRate.getOptional("sample_rate")

            /**
             * Returns the raw JSON value of [format].
             *
             * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

            /**
             * Returns the raw JSON value of [precision].
             *
             * Unlike [precision], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("precision")
            @ExcludeMissing
            fun _precision(): JsonField<Precision> = precision

            /**
             * Returns the raw JSON value of [sampleRate].
             *
             * Unlike [sampleRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sample_rate")
            @ExcludeMissing
            fun _sampleRate(): JsonField<SampleRate> = sampleRate

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

                /** Returns a mutable builder for constructing an instance of [Resemble]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Resemble]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("resemble")
                private var format: JsonField<Format> = JsonMissing.of()
                private var precision: JsonField<Precision> = JsonMissing.of()
                private var sampleRate: JsonField<SampleRate> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(resemble: Resemble) = apply {
                    type = resemble.type
                    format = resemble.format
                    precision = resemble.precision
                    sampleRate = resemble.sampleRate
                    additionalProperties = resemble.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("resemble")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Output audio format. */
                fun format(format: Format) = format(JsonField.of(format))

                /**
                 * Sets [Builder.format] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.format] with a well-typed [Format] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun format(format: JsonField<Format>) = apply { this.format = format }

                /** Audio precision format. */
                fun precision(precision: Precision) = precision(JsonField.of(precision))

                /**
                 * Sets [Builder.precision] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.precision] with a well-typed [Precision] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun precision(precision: JsonField<Precision>) = apply {
                    this.precision = precision
                }

                /** Audio sample rate in Hz. */
                fun sampleRate(sampleRate: SampleRate) = sampleRate(JsonField.of(sampleRate))

                /**
                 * Sets [Builder.sampleRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sampleRate] with a well-typed [SampleRate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sampleRate(sampleRate: JsonField<SampleRate>) = apply {
                    this.sampleRate = sampleRate
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
                 * Returns an immutable instance of [Resemble].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Resemble =
                    Resemble(
                        type,
                        format,
                        precision,
                        sampleRate,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Resemble = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("resemble")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                format().ifPresent { it.validate() }
                precision().ifPresent { it.validate() }
                sampleRate().ifPresent { it.validate() }
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
                type.let { if (it == JsonValue.from("resemble")) 1 else 0 } +
                    (format.asKnown().getOrNull()?.validity() ?: 0) +
                    (precision.asKnown().getOrNull()?.validity() ?: 0) +
                    (sampleRate.asKnown().getOrNull()?.validity() ?: 0)

            /** Output audio format. */
            class Format @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val WAV = of("wav")

                    @JvmField val MP3 = of("mp3")

                    @JvmStatic fun of(value: String) = Format(JsonField.of(value))
                }

                /** An enum containing [Format]'s known values. */
                enum class Known {
                    WAV,
                    MP3,
                }

                /**
                 * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Format] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WAV,
                    MP3,
                    /**
                     * An enum member indicating that [Format] was instantiated with an unknown
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
                        WAV -> Value.WAV
                        MP3 -> Value.MP3
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
                        WAV -> Known.WAV
                        MP3 -> Known.MP3
                        else -> throw TelnyxInvalidDataException("Unknown Format: $value")
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

                fun validate(): Format = apply {
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

                    return other is Format && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Audio precision format. */
            class Precision @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PCM_16 = of("PCM_16")

                    @JvmField val PCM_24 = of("PCM_24")

                    @JvmField val PCM_32 = of("PCM_32")

                    @JvmField val MULAW = of("MULAW")

                    @JvmStatic fun of(value: String) = Precision(JsonField.of(value))
                }

                /** An enum containing [Precision]'s known values. */
                enum class Known {
                    PCM_16,
                    PCM_24,
                    PCM_32,
                    MULAW,
                }

                /**
                 * An enum containing [Precision]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Precision] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PCM_16,
                    PCM_24,
                    PCM_32,
                    MULAW,
                    /**
                     * An enum member indicating that [Precision] was instantiated with an unknown
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
                        PCM_16 -> Value.PCM_16
                        PCM_24 -> Value.PCM_24
                        PCM_32 -> Value.PCM_32
                        MULAW -> Value.MULAW
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
                        PCM_16 -> Known.PCM_16
                        PCM_24 -> Known.PCM_24
                        PCM_32 -> Known.PCM_32
                        MULAW -> Known.MULAW
                        else -> throw TelnyxInvalidDataException("Unknown Precision: $value")
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

                fun validate(): Precision = apply {
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

                    return other is Precision && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Audio sample rate in Hz. */
            class SampleRate
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val _8000 = of("8000")

                    @JvmField val _16000 = of("16000")

                    @JvmField val _22050 = of("22050")

                    @JvmField val _32000 = of("32000")

                    @JvmField val _44100 = of("44100")

                    @JvmField val _48000 = of("48000")

                    @JvmStatic fun of(value: String) = SampleRate(JsonField.of(value))
                }

                /** An enum containing [SampleRate]'s known values. */
                enum class Known {
                    _8000,
                    _16000,
                    _22050,
                    _32000,
                    _44100,
                    _48000,
                }

                /**
                 * An enum containing [SampleRate]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SampleRate] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    _8000,
                    _16000,
                    _22050,
                    _32000,
                    _44100,
                    _48000,
                    /**
                     * An enum member indicating that [SampleRate] was instantiated with an unknown
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
                        _8000 -> Value._8000
                        _16000 -> Value._16000
                        _22050 -> Value._22050
                        _32000 -> Value._32000
                        _44100 -> Value._44100
                        _48000 -> Value._48000
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
                        _8000 -> Known._8000
                        _16000 -> Known._16000
                        _22050 -> Known._22050
                        _32000 -> Known._32000
                        _44100 -> Known._44100
                        _48000 -> Known._48000
                        else -> throw TelnyxInvalidDataException("Unknown SampleRate: $value")
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

                fun validate(): SampleRate = apply {
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

                    return other is SampleRate && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Resemble &&
                    type == other.type &&
                    format == other.format &&
                    precision == other.precision &&
                    sampleRate == other.sampleRate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, format, precision, sampleRate, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Resemble{type=$type, format=$format, precision=$precision, sampleRate=$sampleRate, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionSpeakParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionSpeakParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
