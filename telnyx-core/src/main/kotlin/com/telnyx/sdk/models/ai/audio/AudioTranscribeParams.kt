// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.audio

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Transcribe speech to text. This endpoint is consistent with the
 * [OpenAI Transcription API](https://platform.openai.com/docs/api-reference/audio/createTranscription)
 * and may be used with the OpenAI JS or Python SDK.
 */
class AudioTranscribeParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ID of the model to use. `distil-whisper/distil-large-v2` is lower latency but English-only.
     * `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher latency.
     * `deepgram/nova-3` supports English variants (en, en-US, en-GB, en-AU, en-NZ, en-IN) and only
     * accepts mp3/wav files.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): Model = body.model()

    /**
     * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga,
     * m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with
     * `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun file(): Optional<InputStream> = body.file()

    /**
     * Link to audio file in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or
     * webm. Support for hosted files is limited to 100MB. Cannot be used together with `file`.
     * Note: `deepgram/nova-3` only supports mp3 and wav formats.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileUrl(): Optional<String> = body.fileUrl()

    /**
     * The language of the audio to be transcribed. For `deepgram/nova-3`, only English variants are
     * supported: `en`, `en-US`, `en-GB`, `en-AU`, `en-NZ`, `en-IN`. For
     * `openai/whisper-large-v3-turbo`, supports multiple languages.
     * `distil-whisper/distil-large-v2` does not support language parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * Additional model-specific configuration parameters. Only allowed with `deepgram/nova-3`
     * model. Can include Deepgram-specific options such as `smart_format`, `punctuate`, `diarize`,
     * `utterance`, `numerals`, and `language`. If `language` is provided both as a top-level
     * parameter and in `model_config`, the top-level parameter takes precedence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelConfig(): Optional<ModelConfig> = body.modelConfig()

    /**
     * The format of the transcript output. Use `verbose_json` to take advantage of timestamps.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): Optional<ResponseFormat> = body.responseFormat()

    /**
     * The timestamp granularities to populate for this transcription. `response_format` must be set
     * verbose_json to use timestamp granularities. Currently `segment` is supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestampGranularities(): Optional<TimestampGranularities> = body.timestampGranularities()

    /**
     * Returns the raw multipart value of [model].
     *
     * Unlike [model], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _model(): MultipartField<Model> = body._model()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [fileUrl].
     *
     * Unlike [fileUrl], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _fileUrl(): MultipartField<String> = body._fileUrl()

    /**
     * Returns the raw multipart value of [language].
     *
     * Unlike [language], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _language(): MultipartField<String> = body._language()

    /**
     * Returns the raw multipart value of [modelConfig].
     *
     * Unlike [modelConfig], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _modelConfig(): MultipartField<ModelConfig> = body._modelConfig()

    /**
     * Returns the raw multipart value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _responseFormat(): MultipartField<ResponseFormat> = body._responseFormat()

    /**
     * Returns the raw multipart value of [timestampGranularities].
     *
     * Unlike [timestampGranularities], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _timestampGranularities(): MultipartField<TimestampGranularities> =
        body._timestampGranularities()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudioTranscribeParams].
         *
         * The following fields are required:
         * ```java
         * .model()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AudioTranscribeParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(audioTranscribeParams: AudioTranscribeParams) = apply {
            body = audioTranscribeParams.body.toBuilder()
            additionalHeaders = audioTranscribeParams.additionalHeaders.toBuilder()
            additionalQueryParams = audioTranscribeParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [model]
         * - [file]
         * - [fileUrl]
         * - [language]
         * - [modelConfig]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * ID of the model to use. `distil-whisper/distil-large-v2` is lower latency but
         * English-only. `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher
         * latency. `deepgram/nova-3` supports English variants (en, en-US, en-GB, en-AU, en-NZ,
         * en-IN) and only accepts mp3/wav files.
         */
        fun model(model: Model) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary multipart value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: MultipartField<Model>) = apply { body.model(model) }

        /**
         * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga,
         * m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with
         * `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
         */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /**
         * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga,
         * m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with
         * `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
         */
        fun file(file: ByteArray) = apply { body.file(file) }

        /**
         * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga,
         * m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with
         * `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
         */
        fun file(path: Path) = apply { body.file(path) }

        /**
         * Link to audio file in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or
         * webm. Support for hosted files is limited to 100MB. Cannot be used together with `file`.
         * Note: `deepgram/nova-3` only supports mp3 and wav formats.
         */
        fun fileUrl(fileUrl: String) = apply { body.fileUrl(fileUrl) }

        /**
         * Sets [Builder.fileUrl] to an arbitrary multipart value.
         *
         * You should usually call [Builder.fileUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileUrl(fileUrl: MultipartField<String>) = apply { body.fileUrl(fileUrl) }

        /**
         * The language of the audio to be transcribed. For `deepgram/nova-3`, only English variants
         * are supported: `en`, `en-US`, `en-GB`, `en-AU`, `en-NZ`, `en-IN`. For
         * `openai/whisper-large-v3-turbo`, supports multiple languages.
         * `distil-whisper/distil-large-v2` does not support language parameter.
         */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary multipart value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: MultipartField<String>) = apply { body.language(language) }

        /**
         * Additional model-specific configuration parameters. Only allowed with `deepgram/nova-3`
         * model. Can include Deepgram-specific options such as `smart_format`, `punctuate`,
         * `diarize`, `utterance`, `numerals`, and `language`. If `language` is provided both as a
         * top-level parameter and in `model_config`, the top-level parameter takes precedence.
         */
        fun modelConfig(modelConfig: ModelConfig) = apply { body.modelConfig(modelConfig) }

        /**
         * Sets [Builder.modelConfig] to an arbitrary multipart value.
         *
         * You should usually call [Builder.modelConfig] with a well-typed [ModelConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelConfig(modelConfig: MultipartField<ModelConfig>) = apply {
            body.modelConfig(modelConfig)
        }

        /**
         * The format of the transcript output. Use `verbose_json` to take advantage of timestamps.
         */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * Sets [Builder.responseFormat] to an arbitrary multipart value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: MultipartField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * The timestamp granularities to populate for this transcription. `response_format` must be
         * set verbose_json to use timestamp granularities. Currently `segment` is supported.
         */
        fun timestampGranularities(timestampGranularities: TimestampGranularities) = apply {
            body.timestampGranularities(timestampGranularities)
        }

        /**
         * Sets [Builder.timestampGranularities] to an arbitrary multipart value.
         *
         * You should usually call [Builder.timestampGranularities] with a well-typed
         * [TimestampGranularities] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun timestampGranularities(timestampGranularities: MultipartField<TimestampGranularities>) =
            apply {
                body.timestampGranularities(timestampGranularities)
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
         * Returns an immutable instance of [AudioTranscribeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AudioTranscribeParams =
            AudioTranscribeParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "model" to _model(),
                "file" to _file(),
                "file_url" to _fileUrl(),
                "language" to _language(),
                "model_config" to _modelConfig(),
                "response_format" to _responseFormat(),
                "timestamp_granularities[]" to _timestampGranularities(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val model: MultipartField<Model>,
        private val file: MultipartField<InputStream>,
        private val fileUrl: MultipartField<String>,
        private val language: MultipartField<String>,
        private val modelConfig: MultipartField<ModelConfig>,
        private val responseFormat: MultipartField<ResponseFormat>,
        private val timestampGranularities: MultipartField<TimestampGranularities>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * ID of the model to use. `distil-whisper/distil-large-v2` is lower latency but
         * English-only. `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher
         * latency. `deepgram/nova-3` supports English variants (en, en-US, en-GB, en-AU, en-NZ,
         * en-IN) and only accepts mp3/wav files.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): Model = model.value.getRequired("model")

        /**
         * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga,
         * m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with
         * `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun file(): Optional<InputStream> = file.value.getOptional("file")

        /**
         * Link to audio file in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or
         * webm. Support for hosted files is limited to 100MB. Cannot be used together with `file`.
         * Note: `deepgram/nova-3` only supports mp3 and wav formats.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fileUrl(): Optional<String> = fileUrl.value.getOptional("file_url")

        /**
         * The language of the audio to be transcribed. For `deepgram/nova-3`, only English variants
         * are supported: `en`, `en-US`, `en-GB`, `en-AU`, `en-NZ`, `en-IN`. For
         * `openai/whisper-large-v3-turbo`, supports multiple languages.
         * `distil-whisper/distil-large-v2` does not support language parameter.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.value.getOptional("language")

        /**
         * Additional model-specific configuration parameters. Only allowed with `deepgram/nova-3`
         * model. Can include Deepgram-specific options such as `smart_format`, `punctuate`,
         * `diarize`, `utterance`, `numerals`, and `language`. If `language` is provided both as a
         * top-level parameter and in `model_config`, the top-level parameter takes precedence.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelConfig(): Optional<ModelConfig> = modelConfig.value.getOptional("model_config")

        /**
         * The format of the transcript output. Use `verbose_json` to take advantage of timestamps.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): Optional<ResponseFormat> =
            responseFormat.value.getOptional("response_format")

        /**
         * The timestamp granularities to populate for this transcription. `response_format` must be
         * set verbose_json to use timestamp granularities. Currently `segment` is supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestampGranularities(): Optional<TimestampGranularities> =
            timestampGranularities.value.getOptional("timestamp_granularities[]")

        /**
         * Returns the raw multipart value of [model].
         *
         * Unlike [model], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): MultipartField<Model> = model

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [fileUrl].
         *
         * Unlike [fileUrl], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("file_url") @ExcludeMissing fun _fileUrl(): MultipartField<String> = fileUrl

        /**
         * Returns the raw multipart value of [language].
         *
         * Unlike [language], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): MultipartField<String> = language

        /**
         * Returns the raw multipart value of [modelConfig].
         *
         * Unlike [modelConfig], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("model_config")
        @ExcludeMissing
        fun _modelConfig(): MultipartField<ModelConfig> = modelConfig

        /**
         * Returns the raw multipart value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): MultipartField<ResponseFormat> = responseFormat

        /**
         * Returns the raw multipart value of [timestampGranularities].
         *
         * Unlike [timestampGranularities], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("timestamp_granularities[]")
        @ExcludeMissing
        fun _timestampGranularities(): MultipartField<TimestampGranularities> =
            timestampGranularities

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
             * .model()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var model: MultipartField<Model>? = null
            private var file: MultipartField<InputStream> = MultipartField.of(null)
            private var fileUrl: MultipartField<String> = MultipartField.of(null)
            private var language: MultipartField<String> = MultipartField.of(null)
            private var modelConfig: MultipartField<ModelConfig> = MultipartField.of(null)
            private var responseFormat: MultipartField<ResponseFormat> = MultipartField.of(null)
            private var timestampGranularities: MultipartField<TimestampGranularities> =
                MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                model = body.model
                file = body.file
                fileUrl = body.fileUrl
                language = body.language
                modelConfig = body.modelConfig
                responseFormat = body.responseFormat
                timestampGranularities = body.timestampGranularities
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * ID of the model to use. `distil-whisper/distil-large-v2` is lower latency but
             * English-only. `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher
             * latency. `deepgram/nova-3` supports English variants (en, en-US, en-GB, en-AU, en-NZ,
             * en-IN) and only accepts mp3/wav files.
             */
            fun model(model: Model) = model(MultipartField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary multipart value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: MultipartField<Model>) = apply { this.model = model }

            /**
             * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg,
             * mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used
             * together with `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
             */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /**
             * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg,
             * mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used
             * together with `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
             */
            fun file(file: ByteArray) = file(file.inputStream())

            /**
             * The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg,
             * mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used
             * together with `file_url`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
             */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /**
             * Link to audio file in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg,
             * wav, or webm. Support for hosted files is limited to 100MB. Cannot be used together
             * with `file`. Note: `deepgram/nova-3` only supports mp3 and wav formats.
             */
            fun fileUrl(fileUrl: String) = fileUrl(MultipartField.of(fileUrl))

            /**
             * Sets [Builder.fileUrl] to an arbitrary multipart value.
             *
             * You should usually call [Builder.fileUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileUrl(fileUrl: MultipartField<String>) = apply { this.fileUrl = fileUrl }

            /**
             * The language of the audio to be transcribed. For `deepgram/nova-3`, only English
             * variants are supported: `en`, `en-US`, `en-GB`, `en-AU`, `en-NZ`, `en-IN`. For
             * `openai/whisper-large-v3-turbo`, supports multiple languages.
             * `distil-whisper/distil-large-v2` does not support language parameter.
             */
            fun language(language: String) = language(MultipartField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary multipart value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: MultipartField<String>) = apply { this.language = language }

            /**
             * Additional model-specific configuration parameters. Only allowed with
             * `deepgram/nova-3` model. Can include Deepgram-specific options such as
             * `smart_format`, `punctuate`, `diarize`, `utterance`, `numerals`, and `language`. If
             * `language` is provided both as a top-level parameter and in `model_config`, the
             * top-level parameter takes precedence.
             */
            fun modelConfig(modelConfig: ModelConfig) = modelConfig(MultipartField.of(modelConfig))

            /**
             * Sets [Builder.modelConfig] to an arbitrary multipart value.
             *
             * You should usually call [Builder.modelConfig] with a well-typed [ModelConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelConfig(modelConfig: MultipartField<ModelConfig>) = apply {
                this.modelConfig = modelConfig
            }

            /**
             * The format of the transcript output. Use `verbose_json` to take advantage of
             * timestamps.
             */
            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(MultipartField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary multipart value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responseFormat(responseFormat: MultipartField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /**
             * The timestamp granularities to populate for this transcription. `response_format`
             * must be set verbose_json to use timestamp granularities. Currently `segment` is
             * supported.
             */
            fun timestampGranularities(timestampGranularities: TimestampGranularities) =
                timestampGranularities(MultipartField.of(timestampGranularities))

            /**
             * Sets [Builder.timestampGranularities] to an arbitrary multipart value.
             *
             * You should usually call [Builder.timestampGranularities] with a well-typed
             * [TimestampGranularities] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun timestampGranularities(
                timestampGranularities: MultipartField<TimestampGranularities>
            ) = apply { this.timestampGranularities = timestampGranularities }

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
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("model", model),
                    file,
                    fileUrl,
                    language,
                    modelConfig,
                    responseFormat,
                    timestampGranularities,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            model().validate()
            file()
            fileUrl()
            language()
            modelConfig().ifPresent { it.validate() }
            responseFormat().ifPresent { it.validate() }
            timestampGranularities().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                model == other.model &&
                file == other.file &&
                fileUrl == other.fileUrl &&
                language == other.language &&
                modelConfig == other.modelConfig &&
                responseFormat == other.responseFormat &&
                timestampGranularities == other.timestampGranularities &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                model,
                file,
                fileUrl,
                language,
                modelConfig,
                responseFormat,
                timestampGranularities,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{model=$model, file=$file, fileUrl=$fileUrl, language=$language, modelConfig=$modelConfig, responseFormat=$responseFormat, timestampGranularities=$timestampGranularities, additionalProperties=$additionalProperties}"
    }

    /**
     * ID of the model to use. `distil-whisper/distil-large-v2` is lower latency but English-only.
     * `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher latency.
     * `deepgram/nova-3` supports English variants (en, en-US, en-GB, en-AU, en-NZ, en-IN) and only
     * accepts mp3/wav files.
     */
    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DISTIL_WHISPER_DISTIL_LARGE_V2 = of("distil-whisper/distil-large-v2")

            @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            DISTIL_WHISPER_DISTIL_LARGE_V2,
            OPENAI_WHISPER_LARGE_V3_TURBO,
            DEEPGRAM_NOVA_3,
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISTIL_WHISPER_DISTIL_LARGE_V2,
            OPENAI_WHISPER_LARGE_V3_TURBO,
            DEEPGRAM_NOVA_3,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
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
                DISTIL_WHISPER_DISTIL_LARGE_V2 -> Value.DISTIL_WHISPER_DISTIL_LARGE_V2
                OPENAI_WHISPER_LARGE_V3_TURBO -> Value.OPENAI_WHISPER_LARGE_V3_TURBO
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
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
                DISTIL_WHISPER_DISTIL_LARGE_V2 -> Known.DISTIL_WHISPER_DISTIL_LARGE_V2
                OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                else -> throw TelnyxInvalidDataException("Unknown Model: $value")
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

        fun validate(): Model = apply {
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

            return other is Model && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Additional model-specific configuration parameters. Only allowed with `deepgram/nova-3`
     * model. Can include Deepgram-specific options such as `smart_format`, `punctuate`, `diarize`,
     * `utterance`, `numerals`, and `language`. If `language` is provided both as a top-level
     * parameter and in `model_config`, the top-level parameter takes precedence.
     */
    class ModelConfig
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modelConfig: ModelConfig) = apply {
                additionalProperties = modelConfig.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelConfig = ModelConfig(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelConfig = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelConfig && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelConfig{additionalProperties=$additionalProperties}"
    }

    /** The format of the transcript output. Use `verbose_json` to take advantage of timestamps. */
    class ResponseFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val JSON = of("json")

            @JvmField val VERBOSE_JSON = of("verbose_json")

            @JvmStatic fun of(value: String) = ResponseFormat(JsonField.of(value))
        }

        /** An enum containing [ResponseFormat]'s known values. */
        enum class Known {
            JSON,
            VERBOSE_JSON,
        }

        /**
         * An enum containing [ResponseFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResponseFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JSON,
            VERBOSE_JSON,
            /**
             * An enum member indicating that [ResponseFormat] was instantiated with an unknown
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
                JSON -> Value.JSON
                VERBOSE_JSON -> Value.VERBOSE_JSON
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
                JSON -> Known.JSON
                VERBOSE_JSON -> Known.VERBOSE_JSON
                else -> throw TelnyxInvalidDataException("Unknown ResponseFormat: $value")
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

        fun validate(): ResponseFormat = apply {
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

            return other is ResponseFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The timestamp granularities to populate for this transcription. `response_format` must be set
     * verbose_json to use timestamp granularities. Currently `segment` is supported.
     */
    class TimestampGranularities
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

            @JvmField val SEGMENT = of("segment")

            @JvmStatic fun of(value: String) = TimestampGranularities(JsonField.of(value))
        }

        /** An enum containing [TimestampGranularities]'s known values. */
        enum class Known {
            SEGMENT
        }

        /**
         * An enum containing [TimestampGranularities]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [TimestampGranularities] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SEGMENT,
            /**
             * An enum member indicating that [TimestampGranularities] was instantiated with an
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
                SEGMENT -> Value.SEGMENT
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
                SEGMENT -> Known.SEGMENT
                else -> throw TelnyxInvalidDataException("Unknown TimestampGranularities: $value")
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

        fun validate(): TimestampGranularities = apply {
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

            return other is TimestampGranularities && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudioTranscribeParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AudioTranscribeParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
