// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
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
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new voice clone by uploading an audio file directly. Supported formats: WAV, MP3, FLAC,
 * OGG, M4A. For best results, provide 5–10 seconds of clear speech. Maximum file size: 5MB for
 * Telnyx, 20MB for Minimax.
 */
class VoiceCloneCreateFromUploadParams
private constructor(
    private val params: MultipartField<Params>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Multipart form data for creating a voice clone from a direct audio upload. Maximum file size:
     * 5MB for Telnyx, 20MB for Minimax.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun params(): Params = params.value.getRequired("params")

    /**
     * Returns the raw multipart value of [params].
     *
     * Unlike [params], this method doesn't throw if the multipart field has an unexpected type.
     */
    @JsonProperty("params") @ExcludeMissing fun _params(): MultipartField<Params> = params

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VoiceCloneCreateFromUploadParams].
         *
         * The following fields are required:
         * ```java
         * .params()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceCloneCreateFromUploadParams]. */
    class Builder internal constructor() {

        private var params: MultipartField<Params>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceCloneCreateFromUploadParams: VoiceCloneCreateFromUploadParams) =
            apply {
                params = voiceCloneCreateFromUploadParams.params
                additionalHeaders = voiceCloneCreateFromUploadParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    voiceCloneCreateFromUploadParams.additionalQueryParams.toBuilder()
            }

        /**
         * Multipart form data for creating a voice clone from a direct audio upload. Maximum file
         * size: 5MB for Telnyx, 20MB for Minimax.
         */
        fun params(params: Params) =
            params(
                MultipartField.builder<Params>()
                    .value(params)
                    .contentType("application/octet-stream")
                    .build()
            )

        /**
         * Sets [Builder.params] to an arbitrary multipart value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: MultipartField<Params>) = apply { this.params = params }

        /** Alias for calling [params] with `Params.ofTelnyxQwen3TtsClone(telnyxQwen3TtsClone)`. */
        fun params(telnyxQwen3TtsClone: Params.TelnyxQwen3TtsClone) =
            params(Params.ofTelnyxQwen3TtsClone(telnyxQwen3TtsClone))

        /** Alias for calling [params] with `Params.ofTelnyxUltraClone(telnyxUltraClone)`. */
        fun params(telnyxUltraClone: Params.TelnyxUltraClone) =
            params(Params.ofTelnyxUltraClone(telnyxUltraClone))

        /** Alias for calling [params] with `Params.ofMinimaxClone(minimaxClone)`. */
        fun params(minimaxClone: Params.MinimaxClone) = params(Params.ofMinimaxClone(minimaxClone))

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
         * Returns an immutable instance of [VoiceCloneCreateFromUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .params()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceCloneCreateFromUploadParams =
            VoiceCloneCreateFromUploadParams(
                checkRequired("params", params),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("params" to _params()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Multipart form data for creating a voice clone from a direct audio upload. Maximum file size:
     * 5MB for Telnyx, 20MB for Minimax.
     */
    @JsonSerialize(using = Params.Serializer::class)
    class Params
    private constructor(
        private val telnyxQwen3TtsClone: TelnyxQwen3TtsClone? = null,
        private val telnyxUltraClone: TelnyxUltraClone? = null,
        private val minimaxClone: MinimaxClone? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Upload-based voice clone using the Telnyx Qwen3TTS model (default). */
        fun telnyxQwen3TtsClone(): Optional<TelnyxQwen3TtsClone> =
            Optional.ofNullable(telnyxQwen3TtsClone)

        /** Upload-based voice clone using the Telnyx Ultra model. */
        fun telnyxUltraClone(): Optional<TelnyxUltraClone> = Optional.ofNullable(telnyxUltraClone)

        /** Upload-based voice clone using the Minimax provider. */
        fun minimaxClone(): Optional<MinimaxClone> = Optional.ofNullable(minimaxClone)

        fun isTelnyxQwen3TtsClone(): Boolean = telnyxQwen3TtsClone != null

        fun isTelnyxUltraClone(): Boolean = telnyxUltraClone != null

        fun isMinimaxClone(): Boolean = minimaxClone != null

        /** Upload-based voice clone using the Telnyx Qwen3TTS model (default). */
        fun asTelnyxQwen3TtsClone(): TelnyxQwen3TtsClone =
            telnyxQwen3TtsClone.getOrThrow("telnyxQwen3TtsClone")

        /** Upload-based voice clone using the Telnyx Ultra model. */
        fun asTelnyxUltraClone(): TelnyxUltraClone = telnyxUltraClone.getOrThrow("telnyxUltraClone")

        /** Upload-based voice clone using the Minimax provider. */
        fun asMinimaxClone(): MinimaxClone = minimaxClone.getOrThrow("minimaxClone")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                telnyxQwen3TtsClone != null -> visitor.visitTelnyxQwen3TtsClone(telnyxQwen3TtsClone)
                telnyxUltraClone != null -> visitor.visitTelnyxUltraClone(telnyxUltraClone)
                minimaxClone != null -> visitor.visitMinimaxClone(minimaxClone)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitTelnyxQwen3TtsClone(
                        telnyxQwen3TtsClone: TelnyxQwen3TtsClone
                    ) {
                        telnyxQwen3TtsClone.validate()
                    }

                    override fun visitTelnyxUltraClone(telnyxUltraClone: TelnyxUltraClone) {
                        telnyxUltraClone.validate()
                    }

                    override fun visitMinimaxClone(minimaxClone: MinimaxClone) {
                        minimaxClone.validate()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Params &&
                telnyxQwen3TtsClone == other.telnyxQwen3TtsClone &&
                telnyxUltraClone == other.telnyxUltraClone &&
                minimaxClone == other.minimaxClone
        }

        override fun hashCode(): Int =
            Objects.hash(telnyxQwen3TtsClone, telnyxUltraClone, minimaxClone)

        override fun toString(): String =
            when {
                telnyxQwen3TtsClone != null -> "Params{telnyxQwen3TtsClone=$telnyxQwen3TtsClone}"
                telnyxUltraClone != null -> "Params{telnyxUltraClone=$telnyxUltraClone}"
                minimaxClone != null -> "Params{minimaxClone=$minimaxClone}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
            }

        companion object {

            /** Upload-based voice clone using the Telnyx Qwen3TTS model (default). */
            @JvmStatic
            fun ofTelnyxQwen3TtsClone(telnyxQwen3TtsClone: TelnyxQwen3TtsClone) =
                Params(telnyxQwen3TtsClone = telnyxQwen3TtsClone)

            /** Upload-based voice clone using the Telnyx Ultra model. */
            @JvmStatic
            fun ofTelnyxUltraClone(telnyxUltraClone: TelnyxUltraClone) =
                Params(telnyxUltraClone = telnyxUltraClone)

            /** Upload-based voice clone using the Minimax provider. */
            @JvmStatic
            fun ofMinimaxClone(minimaxClone: MinimaxClone) = Params(minimaxClone = minimaxClone)
        }

        /** An interface that defines how to map each variant of [Params] to a value of type [T]. */
        interface Visitor<out T> {

            /** Upload-based voice clone using the Telnyx Qwen3TTS model (default). */
            fun visitTelnyxQwen3TtsClone(telnyxQwen3TtsClone: TelnyxQwen3TtsClone): T

            /** Upload-based voice clone using the Telnyx Ultra model. */
            fun visitTelnyxUltraClone(telnyxUltraClone: TelnyxUltraClone): T

            /** Upload-based voice clone using the Minimax provider. */
            fun visitMinimaxClone(minimaxClone: MinimaxClone): T

            /**
             * Maps an unknown variant of [Params] to a value of type [T].
             *
             * An instance of [Params] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Params: $json")
            }
        }

        internal class Serializer : BaseSerializer<Params>(Params::class) {

            override fun serialize(
                value: Params,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.telnyxQwen3TtsClone != null ->
                        generator.writeObject(value.telnyxQwen3TtsClone)
                    value.telnyxUltraClone != null -> generator.writeObject(value.telnyxUltraClone)
                    value.minimaxClone != null -> generator.writeObject(value.minimaxClone)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Params")
                }
            }
        }

        /** Upload-based voice clone using the Telnyx Qwen3TTS model (default). */
        class TelnyxQwen3TtsClone
        private constructor(
            private val audioFile: MultipartField<InputStream>,
            private val gender: MultipartField<Gender>,
            private val language: MultipartField<String>,
            private val name: MultipartField<String>,
            private val provider: MultipartField<Provider>,
            private val label: MultipartField<String>,
            private val modelId: MultipartField<ModelId>,
            private val refText: MultipartField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For
             * best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 5MB.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audioFile(): InputStream = audioFile.value.getRequired("audio_file")

            /**
             * Gender of the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gender(): Gender = gender.value.getRequired("gender")

            /**
             * ISO 639-1 language code from the Qwen language set.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun language(): String = language.value.getRequired("language")

            /**
             * Name for the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.value.getRequired("name")

            /**
             * Voice synthesis provider. Must be `telnyx`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): Provider = provider.value.getRequired("provider")

            /**
             * Optional custom label describing the voice style.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.value.getOptional("label")

            /**
             * TTS model identifier. Nullable/omittable — defaults to Qwen3TTS.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelId(): Optional<ModelId> = modelId.value.getOptional("model_id")

            /**
             * Optional transcript of the audio file. Providing this improves clone quality.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun refText(): Optional<String> = refText.value.getOptional("ref_text")

            /**
             * Returns the raw multipart value of [audioFile].
             *
             * Unlike [audioFile], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("audio_file")
            @ExcludeMissing
            fun _audioFile(): MultipartField<InputStream> = audioFile

            /**
             * Returns the raw multipart value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): MultipartField<Gender> = gender

            /**
             * Returns the raw multipart value of [language].
             *
             * Unlike [language], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): MultipartField<String> = language

            /**
             * Returns the raw multipart value of [name].
             *
             * Unlike [name], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

            /**
             * Returns the raw multipart value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): MultipartField<Provider> = provider

            /**
             * Returns the raw multipart value of [label].
             *
             * Unlike [label], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): MultipartField<String> = label

            /**
             * Returns the raw multipart value of [modelId].
             *
             * Unlike [modelId], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("model_id")
            @ExcludeMissing
            fun _modelId(): MultipartField<ModelId> = modelId

            /**
             * Returns the raw multipart value of [refText].
             *
             * Unlike [refText], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("ref_text")
            @ExcludeMissing
            fun _refText(): MultipartField<String> = refText

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
                 * Returns a mutable builder for constructing an instance of [TelnyxQwen3TtsClone].
                 *
                 * The following fields are required:
                 * ```java
                 * .audioFile()
                 * .gender()
                 * .language()
                 * .name()
                 * .provider()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TelnyxQwen3TtsClone]. */
            class Builder internal constructor() {

                private var audioFile: MultipartField<InputStream>? = null
                private var gender: MultipartField<Gender>? = null
                private var language: MultipartField<String>? = null
                private var name: MultipartField<String>? = null
                private var provider: MultipartField<Provider>? = null
                private var label: MultipartField<String> = MultipartField.of(null)
                private var modelId: MultipartField<ModelId> = MultipartField.of(null)
                private var refText: MultipartField<String> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(telnyxQwen3TtsClone: TelnyxQwen3TtsClone) = apply {
                    audioFile = telnyxQwen3TtsClone.audioFile
                    gender = telnyxQwen3TtsClone.gender
                    language = telnyxQwen3TtsClone.language
                    name = telnyxQwen3TtsClone.name
                    provider = telnyxQwen3TtsClone.provider
                    label = telnyxQwen3TtsClone.label
                    modelId = telnyxQwen3TtsClone.modelId
                    refText = telnyxQwen3TtsClone.refText
                    additionalProperties = telnyxQwen3TtsClone.additionalProperties.toMutableMap()
                }

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 5MB.
                 */
                fun audioFile(audioFile: InputStream) = audioFile(MultipartField.of(audioFile))

                /**
                 * Sets [Builder.audioFile] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.audioFile] with a well-typed [InputStream] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun audioFile(audioFile: MultipartField<InputStream>) = apply {
                    this.audioFile = audioFile
                }

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 5MB.
                 */
                fun audioFile(audioFile: ByteArray) = audioFile(audioFile.inputStream())

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 5MB.
                 */
                fun audioFile(path: Path) =
                    audioFile(
                        MultipartField.builder<InputStream>()
                            .value(path.inputStream())
                            .filename(path.name)
                            .build()
                    )

                /** Gender of the voice clone. */
                fun gender(gender: Gender) = gender(MultipartField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: MultipartField<Gender>) = apply { this.gender = gender }

                /** ISO 639-1 language code from the Qwen language set. */
                fun language(language: String) = language(MultipartField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: MultipartField<String>) = apply { this.language = language }

                /** Name for the voice clone. */
                fun name(name: String) = name(MultipartField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: MultipartField<String>) = apply { this.name = name }

                /** Voice synthesis provider. Must be `telnyx`. */
                fun provider(provider: Provider) = provider(MultipartField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: MultipartField<Provider>) = apply {
                    this.provider = provider
                }

                /** Optional custom label describing the voice style. */
                fun label(label: String) = label(MultipartField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: MultipartField<String>) = apply { this.label = label }

                /** TTS model identifier. Nullable/omittable — defaults to Qwen3TTS. */
                fun modelId(modelId: ModelId?) = modelId(MultipartField.of(modelId))

                /** Alias for calling [Builder.modelId] with `modelId.orElse(null)`. */
                fun modelId(modelId: Optional<ModelId>) = modelId(modelId.getOrNull())

                /**
                 * Sets [Builder.modelId] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.modelId] with a well-typed [ModelId] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelId(modelId: MultipartField<ModelId>) = apply { this.modelId = modelId }

                /** Optional transcript of the audio file. Providing this improves clone quality. */
                fun refText(refText: String) = refText(MultipartField.of(refText))

                /**
                 * Sets [Builder.refText] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.refText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refText(refText: MultipartField<String>) = apply { this.refText = refText }

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
                 * Returns an immutable instance of [TelnyxQwen3TtsClone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .audioFile()
                 * .gender()
                 * .language()
                 * .name()
                 * .provider()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TelnyxQwen3TtsClone =
                    TelnyxQwen3TtsClone(
                        checkRequired("audioFile", audioFile),
                        checkRequired("gender", gender),
                        checkRequired("language", language),
                        checkRequired("name", name),
                        checkRequired("provider", provider),
                        label,
                        modelId,
                        refText,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TelnyxQwen3TtsClone = apply {
                if (validated) {
                    return@apply
                }

                audioFile()
                gender().validate()
                language()
                name()
                provider().validate()
                label()
                modelId().ifPresent { it.validate() }
                refText()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /** Gender of the voice clone. */
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

                    @JvmField val MALE = of("male")

                    @JvmField val FEMALE = of("female")

                    @JvmField val NEUTRAL = of("neutral")

                    @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
                }

                /** An enum containing [Gender]'s known values. */
                enum class Known {
                    MALE,
                    FEMALE,
                    NEUTRAL,
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
                    NEUTRAL,
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
                        NEUTRAL -> Value.NEUTRAL
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
                        NEUTRAL -> Known.NEUTRAL
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

            /** Voice synthesis provider. Must be `telnyx`. */
            class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TELNYX = of("telnyx")

                    @JvmField val TELNYX = of("Telnyx")

                    @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                }

                /** An enum containing [Provider]'s known values. */
                enum class Known {
                    TELNYX,
                    TELNYX,
                }

                /**
                 * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Provider] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TELNYX,
                    TELNYX,
                    /**
                     * An enum member indicating that [Provider] was instantiated with an unknown
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
                        TELNYX -> Value.TELNYX
                        TELNYX -> Value.TELNYX
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
                        TELNYX -> Known.TELNYX
                        TELNYX -> Known.TELNYX
                        else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

            /** TTS model identifier. Nullable/omittable — defaults to Qwen3TTS. */
            class ModelId @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val QWEN3_TTS = of("Qwen3TTS")

                    @JvmStatic fun of(value: String) = ModelId(JsonField.of(value))
                }

                /** An enum containing [ModelId]'s known values. */
                enum class Known {
                    QWEN3_TTS
                }

                /**
                 * An enum containing [ModelId]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ModelId] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QWEN3_TTS,
                    /**
                     * An enum member indicating that [ModelId] was instantiated with an unknown
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
                        QWEN3_TTS -> Value.QWEN3_TTS
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
                        QWEN3_TTS -> Known.QWEN3_TTS
                        else -> throw TelnyxInvalidDataException("Unknown ModelId: $value")
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

                fun validate(): ModelId = apply {
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

                    return other is ModelId && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TelnyxQwen3TtsClone &&
                    audioFile == other.audioFile &&
                    gender == other.gender &&
                    language == other.language &&
                    name == other.name &&
                    provider == other.provider &&
                    label == other.label &&
                    modelId == other.modelId &&
                    refText == other.refText &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    audioFile,
                    gender,
                    language,
                    name,
                    provider,
                    label,
                    modelId,
                    refText,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TelnyxQwen3TtsClone{audioFile=$audioFile, gender=$gender, language=$language, name=$name, provider=$provider, label=$label, modelId=$modelId, refText=$refText, additionalProperties=$additionalProperties}"
        }

        /** Upload-based voice clone using the Telnyx Ultra model. */
        class TelnyxUltraClone
        private constructor(
            private val audioFile: MultipartField<InputStream>,
            private val gender: MultipartField<Gender>,
            private val language: MultipartField<String>,
            private val modelId: MultipartField<ModelId>,
            private val name: MultipartField<String>,
            private val provider: MultipartField<Provider>,
            private val label: MultipartField<String>,
            private val refText: MultipartField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For
             * best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 5MB.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audioFile(): InputStream = audioFile.value.getRequired("audio_file")

            /**
             * Gender of the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gender(): Gender = gender.value.getRequired("gender")

            /**
             * ISO 639-1 language code from the Ultra language set (40 languages).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun language(): String = language.value.getRequired("language")

            /**
             * TTS model identifier. Must be `Ultra`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun modelId(): ModelId = modelId.value.getRequired("model_id")

            /**
             * Name for the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.value.getRequired("name")

            /**
             * Voice synthesis provider. Must be `telnyx`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): Provider = provider.value.getRequired("provider")

            /**
             * Optional custom label describing the voice style.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.value.getOptional("label")

            /**
             * Optional transcript of the audio file. Providing this improves clone quality.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun refText(): Optional<String> = refText.value.getOptional("ref_text")

            /**
             * Returns the raw multipart value of [audioFile].
             *
             * Unlike [audioFile], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("audio_file")
            @ExcludeMissing
            fun _audioFile(): MultipartField<InputStream> = audioFile

            /**
             * Returns the raw multipart value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): MultipartField<Gender> = gender

            /**
             * Returns the raw multipart value of [language].
             *
             * Unlike [language], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): MultipartField<String> = language

            /**
             * Returns the raw multipart value of [modelId].
             *
             * Unlike [modelId], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("model_id")
            @ExcludeMissing
            fun _modelId(): MultipartField<ModelId> = modelId

            /**
             * Returns the raw multipart value of [name].
             *
             * Unlike [name], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

            /**
             * Returns the raw multipart value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): MultipartField<Provider> = provider

            /**
             * Returns the raw multipart value of [label].
             *
             * Unlike [label], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): MultipartField<String> = label

            /**
             * Returns the raw multipart value of [refText].
             *
             * Unlike [refText], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("ref_text")
            @ExcludeMissing
            fun _refText(): MultipartField<String> = refText

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
                 * Returns a mutable builder for constructing an instance of [TelnyxUltraClone].
                 *
                 * The following fields are required:
                 * ```java
                 * .audioFile()
                 * .gender()
                 * .language()
                 * .modelId()
                 * .name()
                 * .provider()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TelnyxUltraClone]. */
            class Builder internal constructor() {

                private var audioFile: MultipartField<InputStream>? = null
                private var gender: MultipartField<Gender>? = null
                private var language: MultipartField<String>? = null
                private var modelId: MultipartField<ModelId>? = null
                private var name: MultipartField<String>? = null
                private var provider: MultipartField<Provider>? = null
                private var label: MultipartField<String> = MultipartField.of(null)
                private var refText: MultipartField<String> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(telnyxUltraClone: TelnyxUltraClone) = apply {
                    audioFile = telnyxUltraClone.audioFile
                    gender = telnyxUltraClone.gender
                    language = telnyxUltraClone.language
                    modelId = telnyxUltraClone.modelId
                    name = telnyxUltraClone.name
                    provider = telnyxUltraClone.provider
                    label = telnyxUltraClone.label
                    refText = telnyxUltraClone.refText
                    additionalProperties = telnyxUltraClone.additionalProperties.toMutableMap()
                }

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 5MB.
                 */
                fun audioFile(audioFile: InputStream) = audioFile(MultipartField.of(audioFile))

                /**
                 * Sets [Builder.audioFile] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.audioFile] with a well-typed [InputStream] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun audioFile(audioFile: MultipartField<InputStream>) = apply {
                    this.audioFile = audioFile
                }

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 5MB.
                 */
                fun audioFile(audioFile: ByteArray) = audioFile(audioFile.inputStream())

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 5MB.
                 */
                fun audioFile(path: Path) =
                    audioFile(
                        MultipartField.builder<InputStream>()
                            .value(path.inputStream())
                            .filename(path.name)
                            .build()
                    )

                /** Gender of the voice clone. */
                fun gender(gender: Gender) = gender(MultipartField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: MultipartField<Gender>) = apply { this.gender = gender }

                /** ISO 639-1 language code from the Ultra language set (40 languages). */
                fun language(language: String) = language(MultipartField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: MultipartField<String>) = apply { this.language = language }

                /** TTS model identifier. Must be `Ultra`. */
                fun modelId(modelId: ModelId) = modelId(MultipartField.of(modelId))

                /**
                 * Sets [Builder.modelId] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.modelId] with a well-typed [ModelId] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelId(modelId: MultipartField<ModelId>) = apply { this.modelId = modelId }

                /** Name for the voice clone. */
                fun name(name: String) = name(MultipartField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: MultipartField<String>) = apply { this.name = name }

                /** Voice synthesis provider. Must be `telnyx`. */
                fun provider(provider: Provider) = provider(MultipartField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: MultipartField<Provider>) = apply {
                    this.provider = provider
                }

                /** Optional custom label describing the voice style. */
                fun label(label: String) = label(MultipartField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: MultipartField<String>) = apply { this.label = label }

                /** Optional transcript of the audio file. Providing this improves clone quality. */
                fun refText(refText: String) = refText(MultipartField.of(refText))

                /**
                 * Sets [Builder.refText] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.refText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refText(refText: MultipartField<String>) = apply { this.refText = refText }

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
                 * Returns an immutable instance of [TelnyxUltraClone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .audioFile()
                 * .gender()
                 * .language()
                 * .modelId()
                 * .name()
                 * .provider()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TelnyxUltraClone =
                    TelnyxUltraClone(
                        checkRequired("audioFile", audioFile),
                        checkRequired("gender", gender),
                        checkRequired("language", language),
                        checkRequired("modelId", modelId),
                        checkRequired("name", name),
                        checkRequired("provider", provider),
                        label,
                        refText,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TelnyxUltraClone = apply {
                if (validated) {
                    return@apply
                }

                audioFile()
                gender().validate()
                language()
                modelId().validate()
                name()
                provider().validate()
                label()
                refText()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /** Gender of the voice clone. */
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

                    @JvmField val MALE = of("male")

                    @JvmField val FEMALE = of("female")

                    @JvmField val NEUTRAL = of("neutral")

                    @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
                }

                /** An enum containing [Gender]'s known values. */
                enum class Known {
                    MALE,
                    FEMALE,
                    NEUTRAL,
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
                    NEUTRAL,
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
                        NEUTRAL -> Value.NEUTRAL
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
                        NEUTRAL -> Known.NEUTRAL
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

            /** TTS model identifier. Must be `Ultra`. */
            class ModelId @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val ULTRA = of("Ultra")

                    @JvmStatic fun of(value: String) = ModelId(JsonField.of(value))
                }

                /** An enum containing [ModelId]'s known values. */
                enum class Known {
                    ULTRA
                }

                /**
                 * An enum containing [ModelId]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ModelId] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ULTRA,
                    /**
                     * An enum member indicating that [ModelId] was instantiated with an unknown
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
                        ULTRA -> Value.ULTRA
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
                        ULTRA -> Known.ULTRA
                        else -> throw TelnyxInvalidDataException("Unknown ModelId: $value")
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

                fun validate(): ModelId = apply {
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

                    return other is ModelId && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Voice synthesis provider. Must be `telnyx`. */
            class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TELNYX = of("telnyx")

                    @JvmField val TELNYX = of("Telnyx")

                    @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                }

                /** An enum containing [Provider]'s known values. */
                enum class Known {
                    TELNYX,
                    TELNYX,
                }

                /**
                 * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Provider] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TELNYX,
                    TELNYX,
                    /**
                     * An enum member indicating that [Provider] was instantiated with an unknown
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
                        TELNYX -> Value.TELNYX
                        TELNYX -> Value.TELNYX
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
                        TELNYX -> Known.TELNYX
                        TELNYX -> Known.TELNYX
                        else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TelnyxUltraClone &&
                    audioFile == other.audioFile &&
                    gender == other.gender &&
                    language == other.language &&
                    modelId == other.modelId &&
                    name == other.name &&
                    provider == other.provider &&
                    label == other.label &&
                    refText == other.refText &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    audioFile,
                    gender,
                    language,
                    modelId,
                    name,
                    provider,
                    label,
                    refText,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TelnyxUltraClone{audioFile=$audioFile, gender=$gender, language=$language, modelId=$modelId, name=$name, provider=$provider, label=$label, refText=$refText, additionalProperties=$additionalProperties}"
        }

        /** Upload-based voice clone using the Minimax provider. */
        class MinimaxClone
        private constructor(
            private val audioFile: MultipartField<InputStream>,
            private val gender: MultipartField<Gender>,
            private val language: MultipartField<String>,
            private val name: MultipartField<String>,
            private val provider: MultipartField<Provider>,
            private val label: MultipartField<String>,
            private val modelId: MultipartField<ModelId>,
            private val refText: MultipartField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For
             * best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size:
             * 20MB.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun audioFile(): InputStream = audioFile.value.getRequired("audio_file")

            /**
             * Gender of the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gender(): Gender = gender.value.getRequired("gender")

            /**
             * ISO 639-1 language code from the Minimax language set.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun language(): String = language.value.getRequired("language")

            /**
             * Name for the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.value.getRequired("name")

            /**
             * Voice synthesis provider. Must be `minimax`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): Provider = provider.value.getRequired("provider")

            /**
             * Optional custom label describing the voice style.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.value.getOptional("label")

            /**
             * TTS model identifier. Nullable — defaults to speech-2.8-turbo.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelId(): Optional<ModelId> = modelId.value.getOptional("model_id")

            /**
             * Optional transcript of the audio file. Providing this improves clone quality.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun refText(): Optional<String> = refText.value.getOptional("ref_text")

            /**
             * Returns the raw multipart value of [audioFile].
             *
             * Unlike [audioFile], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("audio_file")
            @ExcludeMissing
            fun _audioFile(): MultipartField<InputStream> = audioFile

            /**
             * Returns the raw multipart value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): MultipartField<Gender> = gender

            /**
             * Returns the raw multipart value of [language].
             *
             * Unlike [language], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): MultipartField<String> = language

            /**
             * Returns the raw multipart value of [name].
             *
             * Unlike [name], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

            /**
             * Returns the raw multipart value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): MultipartField<Provider> = provider

            /**
             * Returns the raw multipart value of [label].
             *
             * Unlike [label], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): MultipartField<String> = label

            /**
             * Returns the raw multipart value of [modelId].
             *
             * Unlike [modelId], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("model_id")
            @ExcludeMissing
            fun _modelId(): MultipartField<ModelId> = modelId

            /**
             * Returns the raw multipart value of [refText].
             *
             * Unlike [refText], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("ref_text")
            @ExcludeMissing
            fun _refText(): MultipartField<String> = refText

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
                 * Returns a mutable builder for constructing an instance of [MinimaxClone].
                 *
                 * The following fields are required:
                 * ```java
                 * .audioFile()
                 * .gender()
                 * .language()
                 * .name()
                 * .provider()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MinimaxClone]. */
            class Builder internal constructor() {

                private var audioFile: MultipartField<InputStream>? = null
                private var gender: MultipartField<Gender>? = null
                private var language: MultipartField<String>? = null
                private var name: MultipartField<String>? = null
                private var provider: MultipartField<Provider>? = null
                private var label: MultipartField<String> = MultipartField.of(null)
                private var modelId: MultipartField<ModelId> = MultipartField.of(null)
                private var refText: MultipartField<String> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimaxClone: MinimaxClone) = apply {
                    audioFile = minimaxClone.audioFile
                    gender = minimaxClone.gender
                    language = minimaxClone.language
                    name = minimaxClone.name
                    provider = minimaxClone.provider
                    label = minimaxClone.label
                    modelId = minimaxClone.modelId
                    refText = minimaxClone.refText
                    additionalProperties = minimaxClone.additionalProperties.toMutableMap()
                }

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 20MB.
                 */
                fun audioFile(audioFile: InputStream) = audioFile(MultipartField.of(audioFile))

                /**
                 * Sets [Builder.audioFile] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.audioFile] with a well-typed [InputStream] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun audioFile(audioFile: MultipartField<InputStream>) = apply {
                    this.audioFile = audioFile
                }

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 20MB.
                 */
                fun audioFile(audioFile: ByteArray) = audioFile(audioFile.inputStream())

                /**
                 * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A.
                 * For best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum
                 * size: 20MB.
                 */
                fun audioFile(path: Path) =
                    audioFile(
                        MultipartField.builder<InputStream>()
                            .value(path.inputStream())
                            .filename(path.name)
                            .build()
                    )

                /** Gender of the voice clone. */
                fun gender(gender: Gender) = gender(MultipartField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: MultipartField<Gender>) = apply { this.gender = gender }

                /** ISO 639-1 language code from the Minimax language set. */
                fun language(language: String) = language(MultipartField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: MultipartField<String>) = apply { this.language = language }

                /** Name for the voice clone. */
                fun name(name: String) = name(MultipartField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: MultipartField<String>) = apply { this.name = name }

                /** Voice synthesis provider. Must be `minimax`. */
                fun provider(provider: Provider) = provider(MultipartField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: MultipartField<Provider>) = apply {
                    this.provider = provider
                }

                /** Optional custom label describing the voice style. */
                fun label(label: String) = label(MultipartField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: MultipartField<String>) = apply { this.label = label }

                /** TTS model identifier. Nullable — defaults to speech-2.8-turbo. */
                fun modelId(modelId: ModelId?) = modelId(MultipartField.of(modelId))

                /** Alias for calling [Builder.modelId] with `modelId.orElse(null)`. */
                fun modelId(modelId: Optional<ModelId>) = modelId(modelId.getOrNull())

                /**
                 * Sets [Builder.modelId] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.modelId] with a well-typed [ModelId] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelId(modelId: MultipartField<ModelId>) = apply { this.modelId = modelId }

                /** Optional transcript of the audio file. Providing this improves clone quality. */
                fun refText(refText: String) = refText(MultipartField.of(refText))

                /**
                 * Sets [Builder.refText] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.refText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refText(refText: MultipartField<String>) = apply { this.refText = refText }

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
                 * Returns an immutable instance of [MinimaxClone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .audioFile()
                 * .gender()
                 * .language()
                 * .name()
                 * .provider()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MinimaxClone =
                    MinimaxClone(
                        checkRequired("audioFile", audioFile),
                        checkRequired("gender", gender),
                        checkRequired("language", language),
                        checkRequired("name", name),
                        checkRequired("provider", provider),
                        label,
                        modelId,
                        refText,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MinimaxClone = apply {
                if (validated) {
                    return@apply
                }

                audioFile()
                gender().validate()
                language()
                name()
                provider().validate()
                label()
                modelId().ifPresent { it.validate() }
                refText()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /** Gender of the voice clone. */
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

                    @JvmField val MALE = of("male")

                    @JvmField val FEMALE = of("female")

                    @JvmField val NEUTRAL = of("neutral")

                    @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
                }

                /** An enum containing [Gender]'s known values. */
                enum class Known {
                    MALE,
                    FEMALE,
                    NEUTRAL,
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
                    NEUTRAL,
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
                        NEUTRAL -> Value.NEUTRAL
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
                        NEUTRAL -> Known.NEUTRAL
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

            /** Voice synthesis provider. Must be `minimax`. */
            class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MINIMAX = of("minimax")

                    @JvmField val MINIMAX = of("Minimax")

                    @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                }

                /** An enum containing [Provider]'s known values. */
                enum class Known {
                    MINIMAX,
                    MINIMAX,
                }

                /**
                 * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Provider] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MINIMAX,
                    MINIMAX,
                    /**
                     * An enum member indicating that [Provider] was instantiated with an unknown
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
                        MINIMAX -> Value.MINIMAX
                        MINIMAX -> Value.MINIMAX
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
                        MINIMAX -> Known.MINIMAX
                        MINIMAX -> Known.MINIMAX
                        else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

            /** TTS model identifier. Nullable — defaults to speech-2.8-turbo. */
            class ModelId @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val SPEECH_2_8_TURBO = of("speech-2.8-turbo")

                    @JvmStatic fun of(value: String) = ModelId(JsonField.of(value))
                }

                /** An enum containing [ModelId]'s known values. */
                enum class Known {
                    SPEECH_2_8_TURBO
                }

                /**
                 * An enum containing [ModelId]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ModelId] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SPEECH_2_8_TURBO,
                    /**
                     * An enum member indicating that [ModelId] was instantiated with an unknown
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
                        SPEECH_2_8_TURBO -> Value.SPEECH_2_8_TURBO
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
                        SPEECH_2_8_TURBO -> Known.SPEECH_2_8_TURBO
                        else -> throw TelnyxInvalidDataException("Unknown ModelId: $value")
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

                fun validate(): ModelId = apply {
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

                    return other is ModelId && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MinimaxClone &&
                    audioFile == other.audioFile &&
                    gender == other.gender &&
                    language == other.language &&
                    name == other.name &&
                    provider == other.provider &&
                    label == other.label &&
                    modelId == other.modelId &&
                    refText == other.refText &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    audioFile,
                    gender,
                    language,
                    name,
                    provider,
                    label,
                    modelId,
                    refText,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MinimaxClone{audioFile=$audioFile, gender=$gender, language=$language, name=$name, provider=$provider, label=$label, modelId=$modelId, refText=$refText, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceCloneCreateFromUploadParams &&
            params == other.params &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(params, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoiceCloneCreateFromUploadParams{params=$params, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
