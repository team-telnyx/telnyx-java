// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

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
 * Creates a new voice clone by uploading an audio file directly. Supported formats: WAV, MP3, FLAC,
 * OGG, M4A. For best results, provide 5–10 seconds of clear speech. Maximum file size: 2MB.
 */
class VoiceCloneCreateFromUploadParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For best
     * quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun audioFile(): InputStream = body.audioFile()

    /**
     * ISO 639-1 language code (e.g. `en`, `fr`) or `auto` for automatic detection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): String = body.language()

    /**
     * Name for the voice clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Gender of the voice clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gender(): Optional<Gender> = body.gender()

    /**
     * Optional custom label describing the voice style. If omitted, falls back to the source
     * design's prompt text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = body.label()

    /**
     * Optional transcript of the audio file. Providing this improves clone quality.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refText(): Optional<String> = body.refText()

    /**
     * Returns the raw multipart value of [audioFile].
     *
     * Unlike [audioFile], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _audioFile(): MultipartField<InputStream> = body._audioFile()

    /**
     * Returns the raw multipart value of [language].
     *
     * Unlike [language], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _language(): MultipartField<String> = body._language()

    /**
     * Returns the raw multipart value of [name].
     *
     * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _name(): MultipartField<String> = body._name()

    /**
     * Returns the raw multipart value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _gender(): MultipartField<Gender> = body._gender()

    /**
     * Returns the raw multipart value of [label].
     *
     * Unlike [label], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _label(): MultipartField<String> = body._label()

    /**
     * Returns the raw multipart value of [refText].
     *
     * Unlike [refText], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _refText(): MultipartField<String> = body._refText()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

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
         * .audioFile()
         * .language()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceCloneCreateFromUploadParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceCloneCreateFromUploadParams: VoiceCloneCreateFromUploadParams) =
            apply {
                body = voiceCloneCreateFromUploadParams.body.toBuilder()
                additionalHeaders = voiceCloneCreateFromUploadParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    voiceCloneCreateFromUploadParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [audioFile]
         * - [language]
         * - [name]
         * - [gender]
         * - [label]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For best
         * quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
         */
        fun audioFile(audioFile: InputStream) = apply { body.audioFile(audioFile) }

        /**
         * Sets [Builder.audioFile] to an arbitrary multipart value.
         *
         * You should usually call [Builder.audioFile] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audioFile(audioFile: MultipartField<InputStream>) = apply { body.audioFile(audioFile) }

        /**
         * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For best
         * quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
         */
        fun audioFile(audioFile: ByteArray) = apply { body.audioFile(audioFile) }

        /**
         * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For best
         * quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
         */
        fun audioFile(path: Path) = apply { body.audioFile(path) }

        /** ISO 639-1 language code (e.g. `en`, `fr`) or `auto` for automatic detection. */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary multipart value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: MultipartField<String>) = apply { body.language(language) }

        /** Name for the voice clone. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary multipart value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: MultipartField<String>) = apply { body.name(name) }

        /** Gender of the voice clone. */
        fun gender(gender: Gender) = apply { body.gender(gender) }

        /**
         * Sets [Builder.gender] to an arbitrary multipart value.
         *
         * You should usually call [Builder.gender] with a well-typed [Gender] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: MultipartField<Gender>) = apply { body.gender(gender) }

        /**
         * Optional custom label describing the voice style. If omitted, falls back to the source
         * design's prompt text.
         */
        fun label(label: String) = apply { body.label(label) }

        /**
         * Sets [Builder.label] to an arbitrary multipart value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: MultipartField<String>) = apply { body.label(label) }

        /** Optional transcript of the audio file. Providing this improves clone quality. */
        fun refText(refText: String) = apply { body.refText(refText) }

        /**
         * Sets [Builder.refText] to an arbitrary multipart value.
         *
         * You should usually call [Builder.refText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refText(refText: MultipartField<String>) = apply { body.refText(refText) }

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
         * Returns an immutable instance of [VoiceCloneCreateFromUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .audioFile()
         * .language()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceCloneCreateFromUploadParams =
            VoiceCloneCreateFromUploadParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "audio_file" to _audioFile(),
                "language" to _language(),
                "name" to _name(),
                "gender" to _gender(),
                "label" to _label(),
                "ref_text" to _refText(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Multipart form data for creating a voice clone from a direct audio upload. */
    class Body
    private constructor(
        private val audioFile: MultipartField<InputStream>,
        private val language: MultipartField<String>,
        private val name: MultipartField<String>,
        private val gender: MultipartField<Gender>,
        private val label: MultipartField<String>,
        private val refText: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For best
         * quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun audioFile(): InputStream = audioFile.value.getRequired("audio_file")

        /**
         * ISO 639-1 language code (e.g. `en`, `fr`) or `auto` for automatic detection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun language(): String = language.value.getRequired("language")

        /**
         * Name for the voice clone.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.value.getRequired("name")

        /**
         * Gender of the voice clone.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gender(): Optional<Gender> = gender.value.getOptional("gender")

        /**
         * Optional custom label describing the voice style. If omitted, falls back to the source
         * design's prompt text.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun label(): Optional<String> = label.value.getOptional("label")

        /**
         * Optional transcript of the audio file. Providing this improves clone quality.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun refText(): Optional<String> = refText.value.getOptional("ref_text")

        /**
         * Returns the raw multipart value of [audioFile].
         *
         * Unlike [audioFile], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("audio_file")
        @ExcludeMissing
        fun _audioFile(): MultipartField<InputStream> = audioFile

        /**
         * Returns the raw multipart value of [language].
         *
         * Unlike [language], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): MultipartField<String> = language

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

        /**
         * Returns the raw multipart value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): MultipartField<Gender> = gender

        /**
         * Returns the raw multipart value of [label].
         *
         * Unlike [label], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): MultipartField<String> = label

        /**
         * Returns the raw multipart value of [refText].
         *
         * Unlike [refText], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("ref_text") @ExcludeMissing fun _refText(): MultipartField<String> = refText

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
             * .audioFile()
             * .language()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var audioFile: MultipartField<InputStream>? = null
            private var language: MultipartField<String>? = null
            private var name: MultipartField<String>? = null
            private var gender: MultipartField<Gender> = MultipartField.of(null)
            private var label: MultipartField<String> = MultipartField.of(null)
            private var refText: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                audioFile = body.audioFile
                language = body.language
                name = body.name
                gender = body.gender
                label = body.label
                refText = body.refText
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For
             * best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
             */
            fun audioFile(audioFile: InputStream) = audioFile(MultipartField.of(audioFile))

            /**
             * Sets [Builder.audioFile] to an arbitrary multipart value.
             *
             * You should usually call [Builder.audioFile] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioFile(audioFile: MultipartField<InputStream>) = apply {
                this.audioFile = audioFile
            }

            /**
             * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For
             * best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
             */
            fun audioFile(audioFile: ByteArray) = audioFile(audioFile.inputStream())

            /**
             * Audio file to clone the voice from. Supported formats: WAV, MP3, FLAC, OGG, M4A. For
             * best quality, provide 5–10 seconds of clear, uninterrupted speech. Maximum size: 2MB.
             */
            fun audioFile(path: Path) =
                audioFile(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** ISO 639-1 language code (e.g. `en`, `fr`) or `auto` for automatic detection. */
            fun language(language: String) = language(MultipartField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary multipart value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: MultipartField<String>) = apply { this.language = language }

            /** Name for the voice clone. */
            fun name(name: String) = name(MultipartField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

            /** Gender of the voice clone. */
            fun gender(gender: Gender) = gender(MultipartField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary multipart value.
             *
             * You should usually call [Builder.gender] with a well-typed [Gender] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: MultipartField<Gender>) = apply { this.gender = gender }

            /**
             * Optional custom label describing the voice style. If omitted, falls back to the
             * source design's prompt text.
             */
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
             * You should usually call [Builder.refText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refText(refText: MultipartField<String>) = apply { this.refText = refText }

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
             * .audioFile()
             * .language()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("audioFile", audioFile),
                    checkRequired("language", language),
                    checkRequired("name", name),
                    gender,
                    label,
                    refText,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            audioFile()
            language()
            name()
            gender().ifPresent { it.validate() }
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                audioFile == other.audioFile &&
                language == other.language &&
                name == other.name &&
                gender == other.gender &&
                label == other.label &&
                refText == other.refText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(audioFile, language, name, gender, label, refText, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{audioFile=$audioFile, language=$language, name=$name, gender=$gender, label=$label, refText=$refText, additionalProperties=$additionalProperties}"
    }

    /** Gender of the voice clone. */
    class Gender @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MALE,
            FEMALE,
            NEUTRAL,
            /** An enum member indicating that [Gender] was instantiated with an unknown value. */
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
                MALE -> Value.MALE
                FEMALE -> Value.FEMALE
                NEUTRAL -> Value.NEUTRAL
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
                MALE -> Known.MALE
                FEMALE -> Known.FEMALE
                NEUTRAL -> Known.NEUTRAL
                else -> throw TelnyxInvalidDataException("Unknown Gender: $value")
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

        return other is VoiceCloneCreateFromUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoiceCloneCreateFromUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
