// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate synthesized speech audio from text input. Returns audio in the requested format (binary
 * audio stream, base64-encoded JSON, or an audio URL for later retrieval).
 *
 * Authentication is provided via the standard `Authorization: Bearer <API_KEY>` header.
 *
 * The `voice` parameter provides a convenient shorthand to specify provider, model, and voice in a
 * single string (e.g. `telnyx.NaturalHD.Alloy`). Alternatively, specify `provider` explicitly along
 * with provider-specific parameters.
 *
 * Supported providers: `aws`, `telnyx`, `azure`, `elevenlabs`, `minimax`, `rime`, `resemble`,
 * `inworld`.
 */
class TextToSpeechGenerateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * AWS Polly provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aws(): Optional<Aws> = body.aws()

    /**
     * Azure Cognitive Services provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun azure(): Optional<Azure> = body.azure()

    /**
     * When `true`, bypass the audio cache and generate fresh audio.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disableCache(): Optional<Boolean> = body.disableCache()

    /**
     * ElevenLabs provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun elevenlabs(): Optional<Elevenlabs> = body.elevenlabs()

    /**
     * Inworld provider-specific parameters.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = textToSpeechGenerateParams.inworld().convert(MyClass.class);
     * ```
     */
    fun _inworld(): JsonValue = body._inworld()

    /**
     * Language code (e.g. `en-US`). Usage varies by provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * Minimax provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimax(): Optional<Minimax> = body.minimax()

    /**
     * Determines the response format. `binary_output` returns raw audio bytes, `base64_output`
     * returns base64-encoded audio in JSON.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputType(): Optional<OutputType> = body.outputType()

    /**
     * TTS provider. Required unless `voice` is provided.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = body.provider()

    /**
     * Resemble AI provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resemble(): Optional<Resemble> = body.resemble()

    /**
     * Rime provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rime(): Optional<Rime> = body.rime()

    /**
     * Telnyx provider-specific parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telnyx(): Optional<Telnyx> = body.telnyx()

    /**
     * The text to convert to speech.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Text type. Use `ssml` for SSML-formatted input (supported by AWS and Azure).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textType(): Optional<TextType> = body.textType()

    /**
     * Voice identifier in the format `provider.model_id.voice_id` or `provider.voice_id`. Examples:
     * `telnyx.NaturalHD.Alloy`, `azure.en-US-AvaMultilingualNeural`, `aws.Polly.Generative.Lucia`.
     * When provided, `provider`, `model_id`, and `voice_id` are extracted automatically and take
     * precedence over individual parameters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<String> = body.voice()

    /**
     * Provider-specific voice settings. Contents vary by provider — see provider-specific parameter
     * objects below.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettings(): Optional<VoiceSettings> = body.voiceSettings()

    /**
     * Returns the raw JSON value of [aws].
     *
     * Unlike [aws], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aws(): JsonField<Aws> = body._aws()

    /**
     * Returns the raw JSON value of [azure].
     *
     * Unlike [azure], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _azure(): JsonField<Azure> = body._azure()

    /**
     * Returns the raw JSON value of [disableCache].
     *
     * Unlike [disableCache], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _disableCache(): JsonField<Boolean> = body._disableCache()

    /**
     * Returns the raw JSON value of [elevenlabs].
     *
     * Unlike [elevenlabs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _elevenlabs(): JsonField<Elevenlabs> = body._elevenlabs()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [minimax].
     *
     * Unlike [minimax], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimax(): JsonField<Minimax> = body._minimax()

    /**
     * Returns the raw JSON value of [outputType].
     *
     * Unlike [outputType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputType(): JsonField<OutputType> = body._outputType()

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _provider(): JsonField<Provider> = body._provider()

    /**
     * Returns the raw JSON value of [resemble].
     *
     * Unlike [resemble], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resemble(): JsonField<Resemble> = body._resemble()

    /**
     * Returns the raw JSON value of [rime].
     *
     * Unlike [rime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rime(): JsonField<Rime> = body._rime()

    /**
     * Returns the raw JSON value of [telnyx].
     *
     * Unlike [telnyx], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _telnyx(): JsonField<Telnyx> = body._telnyx()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [textType].
     *
     * Unlike [textType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _textType(): JsonField<TextType> = body._textType()

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

        @JvmStatic fun none(): TextToSpeechGenerateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [TextToSpeechGenerateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TextToSpeechGenerateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(textToSpeechGenerateParams: TextToSpeechGenerateParams) = apply {
            body = textToSpeechGenerateParams.body.toBuilder()
            additionalHeaders = textToSpeechGenerateParams.additionalHeaders.toBuilder()
            additionalQueryParams = textToSpeechGenerateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [aws]
         * - [azure]
         * - [disableCache]
         * - [elevenlabs]
         * - [inworld]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** AWS Polly provider-specific parameters. */
        fun aws(aws: Aws) = apply { body.aws(aws) }

        /**
         * Sets [Builder.aws] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aws] with a well-typed [Aws] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aws(aws: JsonField<Aws>) = apply { body.aws(aws) }

        /** Azure Cognitive Services provider-specific parameters. */
        fun azure(azure: Azure) = apply { body.azure(azure) }

        /**
         * Sets [Builder.azure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azure] with a well-typed [Azure] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azure(azure: JsonField<Azure>) = apply { body.azure(azure) }

        /** When `true`, bypass the audio cache and generate fresh audio. */
        fun disableCache(disableCache: Boolean) = apply { body.disableCache(disableCache) }

        /**
         * Sets [Builder.disableCache] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableCache] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disableCache(disableCache: JsonField<Boolean>) = apply {
            body.disableCache(disableCache)
        }

        /** ElevenLabs provider-specific parameters. */
        fun elevenlabs(elevenlabs: Elevenlabs) = apply { body.elevenlabs(elevenlabs) }

        /**
         * Sets [Builder.elevenlabs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elevenlabs] with a well-typed [Elevenlabs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elevenlabs(elevenlabs: JsonField<Elevenlabs>) = apply { body.elevenlabs(elevenlabs) }

        /** Inworld provider-specific parameters. */
        fun inworld(inworld: JsonValue) = apply { body.inworld(inworld) }

        /** Language code (e.g. `en-US`). Usage varies by provider. */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        /** Minimax provider-specific parameters. */
        fun minimax(minimax: Minimax) = apply { body.minimax(minimax) }

        /**
         * Sets [Builder.minimax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimax] with a well-typed [Minimax] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minimax(minimax: JsonField<Minimax>) = apply { body.minimax(minimax) }

        /**
         * Determines the response format. `binary_output` returns raw audio bytes, `base64_output`
         * returns base64-encoded audio in JSON.
         */
        fun outputType(outputType: OutputType) = apply { body.outputType(outputType) }

        /**
         * Sets [Builder.outputType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputType] with a well-typed [OutputType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputType(outputType: JsonField<OutputType>) = apply { body.outputType(outputType) }

        /** TTS provider. Required unless `voice` is provided. */
        fun provider(provider: Provider) = apply { body.provider(provider) }

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { body.provider(provider) }

        /** Resemble AI provider-specific parameters. */
        fun resemble(resemble: Resemble) = apply { body.resemble(resemble) }

        /**
         * Sets [Builder.resemble] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resemble] with a well-typed [Resemble] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resemble(resemble: JsonField<Resemble>) = apply { body.resemble(resemble) }

        /** Rime provider-specific parameters. */
        fun rime(rime: Rime) = apply { body.rime(rime) }

        /**
         * Sets [Builder.rime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rime] with a well-typed [Rime] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rime(rime: JsonField<Rime>) = apply { body.rime(rime) }

        /** Telnyx provider-specific parameters. */
        fun telnyx(telnyx: Telnyx) = apply { body.telnyx(telnyx) }

        /**
         * Sets [Builder.telnyx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyx] with a well-typed [Telnyx] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun telnyx(telnyx: JsonField<Telnyx>) = apply { body.telnyx(telnyx) }

        /** The text to convert to speech. */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /** Text type. Use `ssml` for SSML-formatted input (supported by AWS and Azure). */
        fun textType(textType: TextType) = apply { body.textType(textType) }

        /**
         * Sets [Builder.textType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textType] with a well-typed [TextType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textType(textType: JsonField<TextType>) = apply { body.textType(textType) }

        /**
         * Voice identifier in the format `provider.model_id.voice_id` or `provider.voice_id`.
         * Examples: `telnyx.NaturalHD.Alloy`, `azure.en-US-AvaMultilingualNeural`,
         * `aws.Polly.Generative.Lucia`. When provided, `provider`, `model_id`, and `voice_id` are
         * extracted automatically and take precedence over individual parameters.
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
         * Provider-specific voice settings. Contents vary by provider — see provider-specific
         * parameter objects below.
         */
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
         * Returns an immutable instance of [TextToSpeechGenerateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextToSpeechGenerateParams =
            TextToSpeechGenerateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for generating speech from text. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aws: JsonField<Aws>,
        private val azure: JsonField<Azure>,
        private val disableCache: JsonField<Boolean>,
        private val elevenlabs: JsonField<Elevenlabs>,
        private val inworld: JsonValue,
        private val language: JsonField<String>,
        private val minimax: JsonField<Minimax>,
        private val outputType: JsonField<OutputType>,
        private val provider: JsonField<Provider>,
        private val resemble: JsonField<Resemble>,
        private val rime: JsonField<Rime>,
        private val telnyx: JsonField<Telnyx>,
        private val text: JsonField<String>,
        private val textType: JsonField<TextType>,
        private val voice: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aws") @ExcludeMissing aws: JsonField<Aws> = JsonMissing.of(),
            @JsonProperty("azure") @ExcludeMissing azure: JsonField<Azure> = JsonMissing.of(),
            @JsonProperty("disable_cache")
            @ExcludeMissing
            disableCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("elevenlabs")
            @ExcludeMissing
            elevenlabs: JsonField<Elevenlabs> = JsonMissing.of(),
            @JsonProperty("inworld") @ExcludeMissing inworld: JsonValue = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimax") @ExcludeMissing minimax: JsonField<Minimax> = JsonMissing.of(),
            @JsonProperty("output_type")
            @ExcludeMissing
            outputType: JsonField<OutputType> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("resemble")
            @ExcludeMissing
            resemble: JsonField<Resemble> = JsonMissing.of(),
            @JsonProperty("rime") @ExcludeMissing rime: JsonField<Rime> = JsonMissing.of(),
            @JsonProperty("telnyx") @ExcludeMissing telnyx: JsonField<Telnyx> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text_type")
            @ExcludeMissing
            textType: JsonField<TextType> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            aws,
            azure,
            disableCache,
            elevenlabs,
            inworld,
            language,
            minimax,
            outputType,
            provider,
            resemble,
            rime,
            telnyx,
            text,
            textType,
            voice,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * AWS Polly provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aws(): Optional<Aws> = aws.getOptional("aws")

        /**
         * Azure Cognitive Services provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun azure(): Optional<Azure> = azure.getOptional("azure")

        /**
         * When `true`, bypass the audio cache and generate fresh audio.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun disableCache(): Optional<Boolean> = disableCache.getOptional("disable_cache")

        /**
         * ElevenLabs provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun elevenlabs(): Optional<Elevenlabs> = elevenlabs.getOptional("elevenlabs")

        /**
         * Inworld provider-specific parameters.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.inworld().convert(MyClass.class);
         * ```
         */
        @JsonProperty("inworld") @ExcludeMissing fun _inworld(): JsonValue = inworld

        /**
         * Language code (e.g. `en-US`). Usage varies by provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Minimax provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimax(): Optional<Minimax> = minimax.getOptional("minimax")

        /**
         * Determines the response format. `binary_output` returns raw audio bytes, `base64_output`
         * returns base64-encoded audio in JSON.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputType(): Optional<OutputType> = outputType.getOptional("output_type")

        /**
         * TTS provider. Required unless `voice` is provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Resemble AI provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resemble(): Optional<Resemble> = resemble.getOptional("resemble")

        /**
         * Rime provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rime(): Optional<Rime> = rime.getOptional("rime")

        /**
         * Telnyx provider-specific parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telnyx(): Optional<Telnyx> = telnyx.getOptional("telnyx")

        /**
         * The text to convert to speech.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Text type. Use `ssml` for SSML-formatted input (supported by AWS and Azure).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textType(): Optional<TextType> = textType.getOptional("text_type")

        /**
         * Voice identifier in the format `provider.model_id.voice_id` or `provider.voice_id`.
         * Examples: `telnyx.NaturalHD.Alloy`, `azure.en-US-AvaMultilingualNeural`,
         * `aws.Polly.Generative.Lucia`. When provided, `provider`, `model_id`, and `voice_id` are
         * extracted automatically and take precedence over individual parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * Provider-specific voice settings. Contents vary by provider — see provider-specific
         * parameter objects below.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

        /**
         * Returns the raw JSON value of [aws].
         *
         * Unlike [aws], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws") @ExcludeMissing fun _aws(): JsonField<Aws> = aws

        /**
         * Returns the raw JSON value of [azure].
         *
         * Unlike [azure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("azure") @ExcludeMissing fun _azure(): JsonField<Azure> = azure

        /**
         * Returns the raw JSON value of [disableCache].
         *
         * Unlike [disableCache], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disable_cache")
        @ExcludeMissing
        fun _disableCache(): JsonField<Boolean> = disableCache

        /**
         * Returns the raw JSON value of [elevenlabs].
         *
         * Unlike [elevenlabs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elevenlabs")
        @ExcludeMissing
        fun _elevenlabs(): JsonField<Elevenlabs> = elevenlabs

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [minimax].
         *
         * Unlike [minimax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minimax") @ExcludeMissing fun _minimax(): JsonField<Minimax> = minimax

        /**
         * Returns the raw JSON value of [outputType].
         *
         * Unlike [outputType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_type")
        @ExcludeMissing
        fun _outputType(): JsonField<OutputType> = outputType

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [resemble].
         *
         * Unlike [resemble], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resemble") @ExcludeMissing fun _resemble(): JsonField<Resemble> = resemble

        /**
         * Returns the raw JSON value of [rime].
         *
         * Unlike [rime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rime") @ExcludeMissing fun _rime(): JsonField<Rime> = rime

        /**
         * Returns the raw JSON value of [telnyx].
         *
         * Unlike [telnyx], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("telnyx") @ExcludeMissing fun _telnyx(): JsonField<Telnyx> = telnyx

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [textType].
         *
         * Unlike [textType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_type") @ExcludeMissing fun _textType(): JsonField<TextType> = textType

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

            private var aws: JsonField<Aws> = JsonMissing.of()
            private var azure: JsonField<Azure> = JsonMissing.of()
            private var disableCache: JsonField<Boolean> = JsonMissing.of()
            private var elevenlabs: JsonField<Elevenlabs> = JsonMissing.of()
            private var inworld: JsonValue = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var minimax: JsonField<Minimax> = JsonMissing.of()
            private var outputType: JsonField<OutputType> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var resemble: JsonField<Resemble> = JsonMissing.of()
            private var rime: JsonField<Rime> = JsonMissing.of()
            private var telnyx: JsonField<Telnyx> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var textType: JsonField<TextType> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                aws = body.aws
                azure = body.azure
                disableCache = body.disableCache
                elevenlabs = body.elevenlabs
                inworld = body.inworld
                language = body.language
                minimax = body.minimax
                outputType = body.outputType
                provider = body.provider
                resemble = body.resemble
                rime = body.rime
                telnyx = body.telnyx
                text = body.text
                textType = body.textType
                voice = body.voice
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** AWS Polly provider-specific parameters. */
            fun aws(aws: Aws) = aws(JsonField.of(aws))

            /**
             * Sets [Builder.aws] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aws] with a well-typed [Aws] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun aws(aws: JsonField<Aws>) = apply { this.aws = aws }

            /** Azure Cognitive Services provider-specific parameters. */
            fun azure(azure: Azure) = azure(JsonField.of(azure))

            /**
             * Sets [Builder.azure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azure] with a well-typed [Azure] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun azure(azure: JsonField<Azure>) = apply { this.azure = azure }

            /** When `true`, bypass the audio cache and generate fresh audio. */
            fun disableCache(disableCache: Boolean) = disableCache(JsonField.of(disableCache))

            /**
             * Sets [Builder.disableCache] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableCache] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disableCache(disableCache: JsonField<Boolean>) = apply {
                this.disableCache = disableCache
            }

            /** ElevenLabs provider-specific parameters. */
            fun elevenlabs(elevenlabs: Elevenlabs) = elevenlabs(JsonField.of(elevenlabs))

            /**
             * Sets [Builder.elevenlabs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevenlabs] with a well-typed [Elevenlabs] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevenlabs(elevenlabs: JsonField<Elevenlabs>) = apply {
                this.elevenlabs = elevenlabs
            }

            /** Inworld provider-specific parameters. */
            fun inworld(inworld: JsonValue) = apply { this.inworld = inworld }

            /** Language code (e.g. `en-US`). Usage varies by provider. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Minimax provider-specific parameters. */
            fun minimax(minimax: Minimax) = minimax(JsonField.of(minimax))

            /**
             * Sets [Builder.minimax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimax] with a well-typed [Minimax] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimax(minimax: JsonField<Minimax>) = apply { this.minimax = minimax }

            /**
             * Determines the response format. `binary_output` returns raw audio bytes,
             * `base64_output` returns base64-encoded audio in JSON.
             */
            fun outputType(outputType: OutputType) = outputType(JsonField.of(outputType))

            /**
             * Sets [Builder.outputType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputType] with a well-typed [OutputType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputType(outputType: JsonField<OutputType>) = apply {
                this.outputType = outputType
            }

            /** TTS provider. Required unless `voice` is provided. */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /** Resemble AI provider-specific parameters. */
            fun resemble(resemble: Resemble) = resemble(JsonField.of(resemble))

            /**
             * Sets [Builder.resemble] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resemble] with a well-typed [Resemble] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resemble(resemble: JsonField<Resemble>) = apply { this.resemble = resemble }

            /** Rime provider-specific parameters. */
            fun rime(rime: Rime) = rime(JsonField.of(rime))

            /**
             * Sets [Builder.rime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rime] with a well-typed [Rime] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rime(rime: JsonField<Rime>) = apply { this.rime = rime }

            /** Telnyx provider-specific parameters. */
            fun telnyx(telnyx: Telnyx) = telnyx(JsonField.of(telnyx))

            /**
             * Sets [Builder.telnyx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telnyx] with a well-typed [Telnyx] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun telnyx(telnyx: JsonField<Telnyx>) = apply { this.telnyx = telnyx }

            /** The text to convert to speech. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Text type. Use `ssml` for SSML-formatted input (supported by AWS and Azure). */
            fun textType(textType: TextType) = textType(JsonField.of(textType))

            /**
             * Sets [Builder.textType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textType] with a well-typed [TextType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textType(textType: JsonField<TextType>) = apply { this.textType = textType }

            /**
             * Voice identifier in the format `provider.model_id.voice_id` or `provider.voice_id`.
             * Examples: `telnyx.NaturalHD.Alloy`, `azure.en-US-AvaMultilingualNeural`,
             * `aws.Polly.Generative.Lucia`. When provided, `provider`, `model_id`, and `voice_id`
             * are extracted automatically and take precedence over individual parameters.
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
             * Provider-specific voice settings. Contents vary by provider — see provider-specific
             * parameter objects below.
             */
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
                    aws,
                    azure,
                    disableCache,
                    elevenlabs,
                    inworld,
                    language,
                    minimax,
                    outputType,
                    provider,
                    resemble,
                    rime,
                    telnyx,
                    text,
                    textType,
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

            aws().ifPresent { it.validate() }
            azure().ifPresent { it.validate() }
            disableCache()
            elevenlabs().ifPresent { it.validate() }
            language()
            minimax().ifPresent { it.validate() }
            outputType().ifPresent { it.validate() }
            provider().ifPresent { it.validate() }
            resemble().ifPresent { it.validate() }
            rime().ifPresent { it.validate() }
            telnyx().ifPresent { it.validate() }
            text()
            textType().ifPresent { it.validate() }
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
            (aws.asKnown().getOrNull()?.validity() ?: 0) +
                (azure.asKnown().getOrNull()?.validity() ?: 0) +
                (if (disableCache.asKnown().isPresent) 1 else 0) +
                (elevenlabs.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (minimax.asKnown().getOrNull()?.validity() ?: 0) +
                (outputType.asKnown().getOrNull()?.validity() ?: 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (resemble.asKnown().getOrNull()?.validity() ?: 0) +
                (rime.asKnown().getOrNull()?.validity() ?: 0) +
                (telnyx.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (textType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                aws == other.aws &&
                azure == other.azure &&
                disableCache == other.disableCache &&
                elevenlabs == other.elevenlabs &&
                inworld == other.inworld &&
                language == other.language &&
                minimax == other.minimax &&
                outputType == other.outputType &&
                provider == other.provider &&
                resemble == other.resemble &&
                rime == other.rime &&
                telnyx == other.telnyx &&
                text == other.text &&
                textType == other.textType &&
                voice == other.voice &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                aws,
                azure,
                disableCache,
                elevenlabs,
                inworld,
                language,
                minimax,
                outputType,
                provider,
                resemble,
                rime,
                telnyx,
                text,
                textType,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aws=$aws, azure=$azure, disableCache=$disableCache, elevenlabs=$elevenlabs, inworld=$inworld, language=$language, minimax=$minimax, outputType=$outputType, provider=$provider, resemble=$resemble, rime=$rime, telnyx=$telnyx, text=$text, textType=$textType, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /** AWS Polly provider-specific parameters. */
    class Aws
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val languageCode: JsonField<String>,
        private val lexiconNames: JsonField<List<String>>,
        private val outputFormat: JsonField<String>,
        private val sampleRate: JsonField<String>,
        private val textType: JsonField<TextType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("language_code")
            @ExcludeMissing
            languageCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lexicon_names")
            @ExcludeMissing
            lexiconNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("output_format")
            @ExcludeMissing
            outputFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample_rate")
            @ExcludeMissing
            sampleRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text_type")
            @ExcludeMissing
            textType: JsonField<TextType> = JsonMissing.of(),
        ) : this(languageCode, lexiconNames, outputFormat, sampleRate, textType, mutableMapOf())

        /**
         * Language code (e.g. `en-US`, `es-ES`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageCode(): Optional<String> = languageCode.getOptional("language_code")

        /**
         * List of lexicon names to apply.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lexiconNames(): Optional<List<String>> = lexiconNames.getOptional("lexicon_names")

        /**
         * Audio output format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputFormat(): Optional<String> = outputFormat.getOptional("output_format")

        /**
         * Audio sample rate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sampleRate(): Optional<String> = sampleRate.getOptional("sample_rate")

        /**
         * Input text type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textType(): Optional<TextType> = textType.getOptional("text_type")

        /**
         * Returns the raw JSON value of [languageCode].
         *
         * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("language_code")
        @ExcludeMissing
        fun _languageCode(): JsonField<String> = languageCode

        /**
         * Returns the raw JSON value of [lexiconNames].
         *
         * Unlike [lexiconNames], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lexicon_names")
        @ExcludeMissing
        fun _lexiconNames(): JsonField<List<String>> = lexiconNames

        /**
         * Returns the raw JSON value of [outputFormat].
         *
         * Unlike [outputFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_format")
        @ExcludeMissing
        fun _outputFormat(): JsonField<String> = outputFormat

        /**
         * Returns the raw JSON value of [sampleRate].
         *
         * Unlike [sampleRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample_rate")
        @ExcludeMissing
        fun _sampleRate(): JsonField<String> = sampleRate

        /**
         * Returns the raw JSON value of [textType].
         *
         * Unlike [textType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_type") @ExcludeMissing fun _textType(): JsonField<TextType> = textType

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

            /** Returns a mutable builder for constructing an instance of [Aws]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Aws]. */
        class Builder internal constructor() {

            private var languageCode: JsonField<String> = JsonMissing.of()
            private var lexiconNames: JsonField<MutableList<String>>? = null
            private var outputFormat: JsonField<String> = JsonMissing.of()
            private var sampleRate: JsonField<String> = JsonMissing.of()
            private var textType: JsonField<TextType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aws: Aws) = apply {
                languageCode = aws.languageCode
                lexiconNames = aws.lexiconNames.map { it.toMutableList() }
                outputFormat = aws.outputFormat
                sampleRate = aws.sampleRate
                textType = aws.textType
                additionalProperties = aws.additionalProperties.toMutableMap()
            }

            /** Language code (e.g. `en-US`, `es-ES`). */
            fun languageCode(languageCode: String) = languageCode(JsonField.of(languageCode))

            /**
             * Sets [Builder.languageCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languageCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languageCode(languageCode: JsonField<String>) = apply {
                this.languageCode = languageCode
            }

            /** List of lexicon names to apply. */
            fun lexiconNames(lexiconNames: List<String>) = lexiconNames(JsonField.of(lexiconNames))

            /**
             * Sets [Builder.lexiconNames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lexiconNames] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lexiconNames(lexiconNames: JsonField<List<String>>) = apply {
                this.lexiconNames = lexiconNames.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [lexiconNames].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLexiconName(lexiconName: String) = apply {
                lexiconNames =
                    (lexiconNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lexiconNames", it).add(lexiconName)
                    }
            }

            /** Audio output format. */
            fun outputFormat(outputFormat: String) = outputFormat(JsonField.of(outputFormat))

            /**
             * Sets [Builder.outputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputFormat(outputFormat: JsonField<String>) = apply {
                this.outputFormat = outputFormat
            }

            /** Audio sample rate. */
            fun sampleRate(sampleRate: String) = sampleRate(JsonField.of(sampleRate))

            /**
             * Sets [Builder.sampleRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sampleRate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sampleRate(sampleRate: JsonField<String>) = apply { this.sampleRate = sampleRate }

            /** Input text type. */
            fun textType(textType: TextType) = textType(JsonField.of(textType))

            /**
             * Sets [Builder.textType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textType] with a well-typed [TextType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textType(textType: JsonField<TextType>) = apply { this.textType = textType }

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
             * Returns an immutable instance of [Aws].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Aws =
                Aws(
                    languageCode,
                    (lexiconNames ?: JsonMissing.of()).map { it.toImmutable() },
                    outputFormat,
                    sampleRate,
                    textType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Aws = apply {
            if (validated) {
                return@apply
            }

            languageCode()
            lexiconNames()
            outputFormat()
            sampleRate()
            textType().ifPresent { it.validate() }
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
            (if (languageCode.asKnown().isPresent) 1 else 0) +
                (lexiconNames.asKnown().getOrNull()?.size ?: 0) +
                (if (outputFormat.asKnown().isPresent) 1 else 0) +
                (if (sampleRate.asKnown().isPresent) 1 else 0) +
                (textType.asKnown().getOrNull()?.validity() ?: 0)

        /** Input text type. */
        class TextType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TEXT = of("text")

                @JvmField val SSML = of("ssml")

                @JvmStatic fun of(value: String) = TextType(JsonField.of(value))
            }

            /** An enum containing [TextType]'s known values. */
            enum class Known {
                TEXT,
                SSML,
            }

            /**
             * An enum containing [TextType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TextType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                SSML,
                /**
                 * An enum member indicating that [TextType] was instantiated with an unknown value.
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
                    TEXT -> Value.TEXT
                    SSML -> Value.SSML
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
                    TEXT -> Known.TEXT
                    SSML -> Known.SSML
                    else -> throw TelnyxInvalidDataException("Unknown TextType: $value")
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

            fun validate(): TextType = apply {
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

                return other is TextType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Aws &&
                languageCode == other.languageCode &&
                lexiconNames == other.lexiconNames &&
                outputFormat == other.outputFormat &&
                sampleRate == other.sampleRate &&
                textType == other.textType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                languageCode,
                lexiconNames,
                outputFormat,
                sampleRate,
                textType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Aws{languageCode=$languageCode, lexiconNames=$lexiconNames, outputFormat=$outputFormat, sampleRate=$sampleRate, textType=$textType, additionalProperties=$additionalProperties}"
    }

    /** Azure Cognitive Services provider-specific parameters. */
    class Azure
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiKey: JsonField<String>,
        private val deploymentId: JsonField<String>,
        private val effect: JsonField<String>,
        private val gender: JsonField<String>,
        private val languageCode: JsonField<String>,
        private val outputFormat: JsonField<String>,
        private val region: JsonField<String>,
        private val textType: JsonField<TextType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deployment_id")
            @ExcludeMissing
            deploymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effect") @ExcludeMissing effect: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language_code")
            @ExcludeMissing
            languageCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_format")
            @ExcludeMissing
            outputFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text_type")
            @ExcludeMissing
            textType: JsonField<TextType> = JsonMissing.of(),
        ) : this(
            apiKey,
            deploymentId,
            effect,
            gender,
            languageCode,
            outputFormat,
            region,
            textType,
            mutableMapOf(),
        )

        /**
         * Custom Azure API key. If not provided, the default Telnyx key is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

        /**
         * Custom Azure deployment ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deploymentId(): Optional<String> = deploymentId.getOptional("deployment_id")

        /**
         * Azure audio effect to apply.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun effect(): Optional<String> = effect.getOptional("effect")

        /**
         * Voice gender preference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gender(): Optional<String> = gender.getOptional("gender")

        /**
         * Language code (e.g. `en-US`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageCode(): Optional<String> = languageCode.getOptional("language_code")

        /**
         * Azure audio output format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputFormat(): Optional<String> = outputFormat.getOptional("output_format")

        /**
         * Azure region (e.g. `eastus`, `westeurope`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * Input text type. Use `ssml` for SSML-formatted input.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textType(): Optional<TextType> = textType.getOptional("text_type")

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

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
        @JsonProperty("effect") @ExcludeMissing fun _effect(): JsonField<String> = effect

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [languageCode].
         *
         * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("language_code")
        @ExcludeMissing
        fun _languageCode(): JsonField<String> = languageCode

        /**
         * Returns the raw JSON value of [outputFormat].
         *
         * Unlike [outputFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_format")
        @ExcludeMissing
        fun _outputFormat(): JsonField<String> = outputFormat

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [textType].
         *
         * Unlike [textType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_type") @ExcludeMissing fun _textType(): JsonField<TextType> = textType

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

            private var apiKey: JsonField<String> = JsonMissing.of()
            private var deploymentId: JsonField<String> = JsonMissing.of()
            private var effect: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var languageCode: JsonField<String> = JsonMissing.of()
            private var outputFormat: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var textType: JsonField<TextType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(azure: Azure) = apply {
                apiKey = azure.apiKey
                deploymentId = azure.deploymentId
                effect = azure.effect
                gender = azure.gender
                languageCode = azure.languageCode
                outputFormat = azure.outputFormat
                region = azure.region
                textType = azure.textType
                additionalProperties = azure.additionalProperties.toMutableMap()
            }

            /** Custom Azure API key. If not provided, the default Telnyx key is used. */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Custom Azure deployment ID. */
            fun deploymentId(deploymentId: String) = deploymentId(JsonField.of(deploymentId))

            /**
             * Sets [Builder.deploymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deploymentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deploymentId(deploymentId: JsonField<String>) = apply {
                this.deploymentId = deploymentId
            }

            /** Azure audio effect to apply. */
            fun effect(effect: String) = effect(JsonField.of(effect))

            /**
             * Sets [Builder.effect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effect] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effect(effect: JsonField<String>) = apply { this.effect = effect }

            /** Voice gender preference. */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Language code (e.g. `en-US`). */
            fun languageCode(languageCode: String) = languageCode(JsonField.of(languageCode))

            /**
             * Sets [Builder.languageCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languageCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languageCode(languageCode: JsonField<String>) = apply {
                this.languageCode = languageCode
            }

            /** Azure audio output format. */
            fun outputFormat(outputFormat: String) = outputFormat(JsonField.of(outputFormat))

            /**
             * Sets [Builder.outputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputFormat(outputFormat: JsonField<String>) = apply {
                this.outputFormat = outputFormat
            }

            /** Azure region (e.g. `eastus`, `westeurope`). */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** Input text type. Use `ssml` for SSML-formatted input. */
            fun textType(textType: TextType) = textType(JsonField.of(textType))

            /**
             * Sets [Builder.textType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textType] with a well-typed [TextType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textType(textType: JsonField<TextType>) = apply { this.textType = textType }

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
             * Returns an immutable instance of [Azure].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Azure =
                Azure(
                    apiKey,
                    deploymentId,
                    effect,
                    gender,
                    languageCode,
                    outputFormat,
                    region,
                    textType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Azure = apply {
            if (validated) {
                return@apply
            }

            apiKey()
            deploymentId()
            effect()
            gender()
            languageCode()
            outputFormat()
            region()
            textType().ifPresent { it.validate() }
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
            (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (deploymentId.asKnown().isPresent) 1 else 0) +
                (if (effect.asKnown().isPresent) 1 else 0) +
                (if (gender.asKnown().isPresent) 1 else 0) +
                (if (languageCode.asKnown().isPresent) 1 else 0) +
                (if (outputFormat.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (textType.asKnown().getOrNull()?.validity() ?: 0)

        /** Input text type. Use `ssml` for SSML-formatted input. */
        class TextType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TEXT = of("text")

                @JvmField val SSML = of("ssml")

                @JvmStatic fun of(value: String) = TextType(JsonField.of(value))
            }

            /** An enum containing [TextType]'s known values. */
            enum class Known {
                TEXT,
                SSML,
            }

            /**
             * An enum containing [TextType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TextType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                SSML,
                /**
                 * An enum member indicating that [TextType] was instantiated with an unknown value.
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
                    TEXT -> Value.TEXT
                    SSML -> Value.SSML
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
                    TEXT -> Known.TEXT
                    SSML -> Known.SSML
                    else -> throw TelnyxInvalidDataException("Unknown TextType: $value")
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

            fun validate(): TextType = apply {
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

                return other is TextType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Azure &&
                apiKey == other.apiKey &&
                deploymentId == other.deploymentId &&
                effect == other.effect &&
                gender == other.gender &&
                languageCode == other.languageCode &&
                outputFormat == other.outputFormat &&
                region == other.region &&
                textType == other.textType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                apiKey,
                deploymentId,
                effect,
                gender,
                languageCode,
                outputFormat,
                region,
                textType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Azure{apiKey=$apiKey, deploymentId=$deploymentId, effect=$effect, gender=$gender, languageCode=$languageCode, outputFormat=$outputFormat, region=$region, textType=$textType, additionalProperties=$additionalProperties}"
    }

    /** ElevenLabs provider-specific parameters. */
    class Elevenlabs
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiKey: JsonField<String>,
        private val languageCode: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language_code")
            @ExcludeMissing
            languageCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(apiKey, languageCode, voiceSettings, mutableMapOf())

        /**
         * Custom ElevenLabs API key. If not provided, the default Telnyx key is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

        /**
         * Language code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageCode(): Optional<String> = languageCode.getOptional("language_code")

        /**
         * ElevenLabs voice settings (stability, similarity_boost, etc.).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

        /**
         * Returns the raw JSON value of [languageCode].
         *
         * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("language_code")
        @ExcludeMissing
        fun _languageCode(): JsonField<String> = languageCode

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

            /** Returns a mutable builder for constructing an instance of [Elevenlabs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Elevenlabs]. */
        class Builder internal constructor() {

            private var apiKey: JsonField<String> = JsonMissing.of()
            private var languageCode: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(elevenlabs: Elevenlabs) = apply {
                apiKey = elevenlabs.apiKey
                languageCode = elevenlabs.languageCode
                voiceSettings = elevenlabs.voiceSettings
                additionalProperties = elevenlabs.additionalProperties.toMutableMap()
            }

            /** Custom ElevenLabs API key. If not provided, the default Telnyx key is used. */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Language code. */
            fun languageCode(languageCode: String) = languageCode(JsonField.of(languageCode))

            /**
             * Sets [Builder.languageCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languageCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languageCode(languageCode: JsonField<String>) = apply {
                this.languageCode = languageCode
            }

            /** ElevenLabs voice settings (stability, similarity_boost, etc.). */
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
             * Returns an immutable instance of [Elevenlabs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Elevenlabs =
                Elevenlabs(apiKey, languageCode, voiceSettings, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Elevenlabs = apply {
            if (validated) {
                return@apply
            }

            apiKey()
            languageCode()
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
            (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (languageCode.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        /** ElevenLabs voice settings (stability, similarity_boost, etc.). */
        class VoiceSettings
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

                /** Returns a mutable builder for constructing an instance of [VoiceSettings]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VoiceSettings]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(voiceSettings: VoiceSettings) = apply {
                    additionalProperties = voiceSettings.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [VoiceSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VoiceSettings = VoiceSettings(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): VoiceSettings = apply {
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

                return other is VoiceSettings && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "VoiceSettings{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Elevenlabs &&
                apiKey == other.apiKey &&
                languageCode == other.languageCode &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiKey, languageCode, voiceSettings, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Elevenlabs{apiKey=$apiKey, languageCode=$languageCode, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /** Minimax provider-specific parameters. */
    class Minimax
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val languageBoost: JsonField<String>,
        private val pitch: JsonField<Long>,
        private val responseFormat: JsonField<String>,
        private val speed: JsonField<Float>,
        private val vol: JsonField<Float>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("language_boost")
            @ExcludeMissing
            languageBoost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pitch") @ExcludeMissing pitch: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("response_format")
            @ExcludeMissing
            responseFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("speed") @ExcludeMissing speed: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("vol") @ExcludeMissing vol: JsonField<Float> = JsonMissing.of(),
        ) : this(languageBoost, pitch, responseFormat, speed, vol, mutableMapOf())

        /**
         * Language code to boost pronunciation for.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageBoost(): Optional<String> = languageBoost.getOptional("language_boost")

        /**
         * Pitch adjustment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pitch(): Optional<Long> = pitch.getOptional("pitch")

        /**
         * Audio output format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): Optional<String> = responseFormat.getOptional("response_format")

        /**
         * Speech speed multiplier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speed(): Optional<Float> = speed.getOptional("speed")

        /**
         * Volume level.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vol(): Optional<Float> = vol.getOptional("vol")

        /**
         * Returns the raw JSON value of [languageBoost].
         *
         * Unlike [languageBoost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("language_boost")
        @ExcludeMissing
        fun _languageBoost(): JsonField<String> = languageBoost

        /**
         * Returns the raw JSON value of [pitch].
         *
         * Unlike [pitch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pitch") @ExcludeMissing fun _pitch(): JsonField<Long> = pitch

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<String> = responseFormat

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

            private var languageBoost: JsonField<String> = JsonMissing.of()
            private var pitch: JsonField<Long> = JsonMissing.of()
            private var responseFormat: JsonField<String> = JsonMissing.of()
            private var speed: JsonField<Float> = JsonMissing.of()
            private var vol: JsonField<Float> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimax: Minimax) = apply {
                languageBoost = minimax.languageBoost
                pitch = minimax.pitch
                responseFormat = minimax.responseFormat
                speed = minimax.speed
                vol = minimax.vol
                additionalProperties = minimax.additionalProperties.toMutableMap()
            }

            /** Language code to boost pronunciation for. */
            fun languageBoost(languageBoost: String) = languageBoost(JsonField.of(languageBoost))

            /**
             * Sets [Builder.languageBoost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languageBoost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languageBoost(languageBoost: JsonField<String>) = apply {
                this.languageBoost = languageBoost
            }

            /** Pitch adjustment. */
            fun pitch(pitch: Long) = pitch(JsonField.of(pitch))

            /**
             * Sets [Builder.pitch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pitch] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pitch(pitch: JsonField<Long>) = apply { this.pitch = pitch }

            /** Audio output format. */
            fun responseFormat(responseFormat: String) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseFormat(responseFormat: JsonField<String>) = apply {
                this.responseFormat = responseFormat
            }

            /** Speech speed multiplier. */
            fun speed(speed: Float) = speed(JsonField.of(speed))

            /**
             * Sets [Builder.speed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speed] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun speed(speed: JsonField<Float>) = apply { this.speed = speed }

            /** Volume level. */
            fun vol(vol: Float) = vol(JsonField.of(vol))

            /**
             * Sets [Builder.vol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vol] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun vol(vol: JsonField<Float>) = apply { this.vol = vol }

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
             * Returns an immutable instance of [Minimax].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Minimax =
                Minimax(
                    languageBoost,
                    pitch,
                    responseFormat,
                    speed,
                    vol,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Minimax = apply {
            if (validated) {
                return@apply
            }

            languageBoost()
            pitch()
            responseFormat()
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
            (if (languageBoost.asKnown().isPresent) 1 else 0) +
                (if (pitch.asKnown().isPresent) 1 else 0) +
                (if (responseFormat.asKnown().isPresent) 1 else 0) +
                (if (speed.asKnown().isPresent) 1 else 0) +
                (if (vol.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Minimax &&
                languageBoost == other.languageBoost &&
                pitch == other.pitch &&
                responseFormat == other.responseFormat &&
                speed == other.speed &&
                vol == other.vol &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(languageBoost, pitch, responseFormat, speed, vol, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimax{languageBoost=$languageBoost, pitch=$pitch, responseFormat=$responseFormat, speed=$speed, vol=$vol, additionalProperties=$additionalProperties}"
    }

    /**
     * Determines the response format. `binary_output` returns raw audio bytes, `base64_output`
     * returns base64-encoded audio in JSON.
     */
    class OutputType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BINARY_OUTPUT = of("binary_output")

            @JvmField val BASE64_OUTPUT = of("base64_output")

            @JvmStatic fun of(value: String) = OutputType(JsonField.of(value))
        }

        /** An enum containing [OutputType]'s known values. */
        enum class Known {
            BINARY_OUTPUT,
            BASE64_OUTPUT,
        }

        /**
         * An enum containing [OutputType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OutputType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BINARY_OUTPUT,
            BASE64_OUTPUT,
            /**
             * An enum member indicating that [OutputType] was instantiated with an unknown value.
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
                BINARY_OUTPUT -> Value.BINARY_OUTPUT
                BASE64_OUTPUT -> Value.BASE64_OUTPUT
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
                BINARY_OUTPUT -> Known.BINARY_OUTPUT
                BASE64_OUTPUT -> Known.BASE64_OUTPUT
                else -> throw TelnyxInvalidDataException("Unknown OutputType: $value")
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

        fun validate(): OutputType = apply {
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

            return other is OutputType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** TTS provider. Required unless `voice` is provided. */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AWS = of("aws")

            @JvmField val TELNYX = of("telnyx")

            @JvmField val AZURE = of("azure")

            @JvmField val ELEVENLABS = of("elevenlabs")

            @JvmField val MINIMAX = of("minimax")

            @JvmField val RIME = of("rime")

            @JvmField val RESEMBLE = of("resemble")

            @JvmField val INWORLD = of("inworld")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            AWS,
            TELNYX,
            AZURE,
            ELEVENLABS,
            MINIMAX,
            RIME,
            RESEMBLE,
            INWORLD,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AWS,
            TELNYX,
            AZURE,
            ELEVENLABS,
            MINIMAX,
            RIME,
            RESEMBLE,
            INWORLD,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                AWS -> Value.AWS
                TELNYX -> Value.TELNYX
                AZURE -> Value.AZURE
                ELEVENLABS -> Value.ELEVENLABS
                MINIMAX -> Value.MINIMAX
                RIME -> Value.RIME
                RESEMBLE -> Value.RESEMBLE
                INWORLD -> Value.INWORLD
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
                AWS -> Known.AWS
                TELNYX -> Known.TELNYX
                AZURE -> Known.AZURE
                ELEVENLABS -> Known.ELEVENLABS
                MINIMAX -> Known.MINIMAX
                RIME -> Known.RIME
                RESEMBLE -> Known.RESEMBLE
                INWORLD -> Known.INWORLD
                else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Resemble AI provider-specific parameters. */
    class Resemble
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiKey: JsonField<String>,
        private val format: JsonField<String>,
        private val precision: JsonField<String>,
        private val sampleRate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
            @JsonProperty("precision")
            @ExcludeMissing
            precision: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample_rate")
            @ExcludeMissing
            sampleRate: JsonField<String> = JsonMissing.of(),
        ) : this(apiKey, format, precision, sampleRate, mutableMapOf())

        /**
         * Custom Resemble API key.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

        /**
         * Audio output format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun format(): Optional<String> = format.getOptional("format")

        /**
         * Synthesis precision.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun precision(): Optional<String> = precision.getOptional("precision")

        /**
         * Audio sample rate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sampleRate(): Optional<String> = sampleRate.getOptional("sample_rate")

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

        /**
         * Returns the raw JSON value of [precision].
         *
         * Unlike [precision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("precision") @ExcludeMissing fun _precision(): JsonField<String> = precision

        /**
         * Returns the raw JSON value of [sampleRate].
         *
         * Unlike [sampleRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample_rate")
        @ExcludeMissing
        fun _sampleRate(): JsonField<String> = sampleRate

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

            private var apiKey: JsonField<String> = JsonMissing.of()
            private var format: JsonField<String> = JsonMissing.of()
            private var precision: JsonField<String> = JsonMissing.of()
            private var sampleRate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resemble: Resemble) = apply {
                apiKey = resemble.apiKey
                format = resemble.format
                precision = resemble.precision
                sampleRate = resemble.sampleRate
                additionalProperties = resemble.additionalProperties.toMutableMap()
            }

            /** Custom Resemble API key. */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Audio output format. */
            fun format(format: String) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<String>) = apply { this.format = format }

            /** Synthesis precision. */
            fun precision(precision: String) = precision(JsonField.of(precision))

            /**
             * Sets [Builder.precision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.precision] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun precision(precision: JsonField<String>) = apply { this.precision = precision }

            /** Audio sample rate. */
            fun sampleRate(sampleRate: String) = sampleRate(JsonField.of(sampleRate))

            /**
             * Sets [Builder.sampleRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sampleRate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sampleRate(sampleRate: JsonField<String>) = apply { this.sampleRate = sampleRate }

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
             * Returns an immutable instance of [Resemble].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Resemble =
                Resemble(apiKey, format, precision, sampleRate, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Resemble = apply {
            if (validated) {
                return@apply
            }

            apiKey()
            format()
            precision()
            sampleRate()
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
            (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (format.asKnown().isPresent) 1 else 0) +
                (if (precision.asKnown().isPresent) 1 else 0) +
                (if (sampleRate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Resemble &&
                apiKey == other.apiKey &&
                format == other.format &&
                precision == other.precision &&
                sampleRate == other.sampleRate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiKey, format, precision, sampleRate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Resemble{apiKey=$apiKey, format=$format, precision=$precision, sampleRate=$sampleRate, additionalProperties=$additionalProperties}"
    }

    /** Rime provider-specific parameters. */
    class Rime
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val responseFormat: JsonField<String>,
        private val samplingRate: JsonField<Long>,
        private val voiceSpeed: JsonField<Float>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("response_format")
            @ExcludeMissing
            responseFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sampling_rate")
            @ExcludeMissing
            samplingRate: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("voice_speed")
            @ExcludeMissing
            voiceSpeed: JsonField<Float> = JsonMissing.of(),
        ) : this(responseFormat, samplingRate, voiceSpeed, mutableMapOf())

        /**
         * Audio output format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): Optional<String> = responseFormat.getOptional("response_format")

        /**
         * Audio sampling rate in Hz.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun samplingRate(): Optional<Long> = samplingRate.getOptional("sampling_rate")

        /**
         * Voice speed multiplier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSpeed(): Optional<Float> = voiceSpeed.getOptional("voice_speed")

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<String> = responseFormat

        /**
         * Returns the raw JSON value of [samplingRate].
         *
         * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        fun _samplingRate(): JsonField<Long> = samplingRate

        /**
         * Returns the raw JSON value of [voiceSpeed].
         *
         * Unlike [voiceSpeed], this method doesn't throw if the JSON field has an unexpected type.
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

            private var responseFormat: JsonField<String> = JsonMissing.of()
            private var samplingRate: JsonField<Long> = JsonMissing.of()
            private var voiceSpeed: JsonField<Float> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rime: Rime) = apply {
                responseFormat = rime.responseFormat
                samplingRate = rime.samplingRate
                voiceSpeed = rime.voiceSpeed
                additionalProperties = rime.additionalProperties.toMutableMap()
            }

            /** Audio output format. */
            fun responseFormat(responseFormat: String) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseFormat(responseFormat: JsonField<String>) = apply {
                this.responseFormat = responseFormat
            }

            /** Audio sampling rate in Hz. */
            fun samplingRate(samplingRate: Long) = samplingRate(JsonField.of(samplingRate))

            /**
             * Sets [Builder.samplingRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingRate] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samplingRate(samplingRate: JsonField<Long>) = apply {
                this.samplingRate = samplingRate
            }

            /** Voice speed multiplier. */
            fun voiceSpeed(voiceSpeed: Float) = voiceSpeed(JsonField.of(voiceSpeed))

            /**
             * Sets [Builder.voiceSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceSpeed] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceSpeed(voiceSpeed: JsonField<Float>) = apply { this.voiceSpeed = voiceSpeed }

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
             * Returns an immutable instance of [Rime].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Rime =
                Rime(responseFormat, samplingRate, voiceSpeed, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Rime = apply {
            if (validated) {
                return@apply
            }

            responseFormat()
            samplingRate()
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
            (if (responseFormat.asKnown().isPresent) 1 else 0) +
                (if (samplingRate.asKnown().isPresent) 1 else 0) +
                (if (voiceSpeed.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rime &&
                responseFormat == other.responseFormat &&
                samplingRate == other.samplingRate &&
                voiceSpeed == other.voiceSpeed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(responseFormat, samplingRate, voiceSpeed, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rime{responseFormat=$responseFormat, samplingRate=$samplingRate, voiceSpeed=$voiceSpeed, additionalProperties=$additionalProperties}"
    }

    /** Telnyx provider-specific parameters. */
    class Telnyx
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val responseFormat: JsonField<String>,
        private val samplingRate: JsonField<Long>,
        private val temperature: JsonField<Float>,
        private val voiceSpeed: JsonField<Float>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("response_format")
            @ExcludeMissing
            responseFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sampling_rate")
            @ExcludeMissing
            samplingRate: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("voice_speed")
            @ExcludeMissing
            voiceSpeed: JsonField<Float> = JsonMissing.of(),
        ) : this(responseFormat, samplingRate, temperature, voiceSpeed, mutableMapOf())

        /**
         * Audio response format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): Optional<String> = responseFormat.getOptional("response_format")

        /**
         * Audio sampling rate in Hz.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun samplingRate(): Optional<Long> = samplingRate.getOptional("sampling_rate")

        /**
         * Sampling temperature.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Optional<Float> = temperature.getOptional("temperature")

        /**
         * Voice speed multiplier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSpeed(): Optional<Float> = voiceSpeed.getOptional("voice_speed")

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<String> = responseFormat

        /**
         * Returns the raw JSON value of [samplingRate].
         *
         * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        fun _samplingRate(): JsonField<Long> = samplingRate

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Float> = temperature

        /**
         * Returns the raw JSON value of [voiceSpeed].
         *
         * Unlike [voiceSpeed], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Telnyx]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Telnyx]. */
        class Builder internal constructor() {

            private var responseFormat: JsonField<String> = JsonMissing.of()
            private var samplingRate: JsonField<Long> = JsonMissing.of()
            private var temperature: JsonField<Float> = JsonMissing.of()
            private var voiceSpeed: JsonField<Float> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(telnyx: Telnyx) = apply {
                responseFormat = telnyx.responseFormat
                samplingRate = telnyx.samplingRate
                temperature = telnyx.temperature
                voiceSpeed = telnyx.voiceSpeed
                additionalProperties = telnyx.additionalProperties.toMutableMap()
            }

            /** Audio response format. */
            fun responseFormat(responseFormat: String) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseFormat(responseFormat: JsonField<String>) = apply {
                this.responseFormat = responseFormat
            }

            /** Audio sampling rate in Hz. */
            fun samplingRate(samplingRate: Long) = samplingRate(JsonField.of(samplingRate))

            /**
             * Sets [Builder.samplingRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingRate] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samplingRate(samplingRate: JsonField<Long>) = apply {
                this.samplingRate = samplingRate
            }

            /** Sampling temperature. */
            fun temperature(temperature: Float) = temperature(JsonField.of(temperature))

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Float] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Float>) = apply {
                this.temperature = temperature
            }

            /** Voice speed multiplier. */
            fun voiceSpeed(voiceSpeed: Float) = voiceSpeed(JsonField.of(voiceSpeed))

            /**
             * Sets [Builder.voiceSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceSpeed] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceSpeed(voiceSpeed: JsonField<Float>) = apply { this.voiceSpeed = voiceSpeed }

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
             * Returns an immutable instance of [Telnyx].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Telnyx =
                Telnyx(
                    responseFormat,
                    samplingRate,
                    temperature,
                    voiceSpeed,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Telnyx = apply {
            if (validated) {
                return@apply
            }

            responseFormat()
            samplingRate()
            temperature()
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
            (if (responseFormat.asKnown().isPresent) 1 else 0) +
                (if (samplingRate.asKnown().isPresent) 1 else 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (if (voiceSpeed.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Telnyx &&
                responseFormat == other.responseFormat &&
                samplingRate == other.samplingRate &&
                temperature == other.temperature &&
                voiceSpeed == other.voiceSpeed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                responseFormat,
                samplingRate,
                temperature,
                voiceSpeed,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Telnyx{responseFormat=$responseFormat, samplingRate=$samplingRate, temperature=$temperature, voiceSpeed=$voiceSpeed, additionalProperties=$additionalProperties}"
    }

    /** Text type. Use `ssml` for SSML-formatted input (supported by AWS and Azure). */
    class TextType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = TextType(JsonField.of(value))
        }

        /** An enum containing [TextType]'s known values. */
        enum class Known {
            TEXT,
            SSML,
        }

        /**
         * An enum containing [TextType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TextType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEXT,
            SSML,
            /** An enum member indicating that [TextType] was instantiated with an unknown value. */
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
                else -> throw TelnyxInvalidDataException("Unknown TextType: $value")
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

        fun validate(): TextType = apply {
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

            return other is TextType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Provider-specific voice settings. Contents vary by provider — see provider-specific parameter
     * objects below.
     */
    class VoiceSettings
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

            /** Returns a mutable builder for constructing an instance of [VoiceSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoiceSettings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voiceSettings: VoiceSettings) = apply {
                additionalProperties = voiceSettings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [VoiceSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VoiceSettings = VoiceSettings(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): VoiceSettings = apply {
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

            return other is VoiceSettings && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "VoiceSettings{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextToSpeechGenerateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TextToSpeechGenerateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
