// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List of available voices. */
class TextToSpeechListVoicesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val voices: JsonField<List<Voice>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("voices") @ExcludeMissing voices: JsonField<List<Voice>> = JsonMissing.of()
    ) : this(voices, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voices(): Optional<List<Voice>> = voices.getOptional("voices")

    /**
     * Returns the raw JSON value of [voices].
     *
     * Unlike [voices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices") @ExcludeMissing fun _voices(): JsonField<List<Voice>> = voices

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
         * [TextToSpeechListVoicesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TextToSpeechListVoicesResponse]. */
    class Builder internal constructor() {

        private var voices: JsonField<MutableList<Voice>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(textToSpeechListVoicesResponse: TextToSpeechListVoicesResponse) = apply {
            voices = textToSpeechListVoicesResponse.voices.map { it.toMutableList() }
            additionalProperties =
                textToSpeechListVoicesResponse.additionalProperties.toMutableMap()
        }

        fun voices(voices: List<Voice>) = voices(JsonField.of(voices))

        /**
         * Sets [Builder.voices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voices] with a well-typed `List<Voice>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voices(voices: JsonField<List<Voice>>) = apply {
            this.voices = voices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Voice] to [voices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVoice(voice: Voice) = apply {
            voices =
                (voices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("voices", it).add(voice)
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
         * Returns an immutable instance of [TextToSpeechListVoicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextToSpeechListVoicesResponse =
            TextToSpeechListVoicesResponse(
                (voices ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TextToSpeechListVoicesResponse = apply {
        if (validated) {
            return@apply
        }

        voices().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (voices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A voice available for text-to-speech synthesis. */
    class Voice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val gender: JsonField<String>,
        private val language: JsonField<String>,
        private val name: JsonField<String>,
        private val provider: JsonField<String>,
        private val voiceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
        ) : this(gender, language, name, provider, voiceId, mutableMapOf())

        /**
         * Voice gender.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gender(): Optional<String> = gender.getOptional("gender")

        /**
         * Language code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Voice name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The TTS provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * Voice identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceId(): Optional<String> = voiceId.getOptional("voice_id")

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [voiceId].
         *
         * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice_id") @ExcludeMissing fun _voiceId(): JsonField<String> = voiceId

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

            /** Returns a mutable builder for constructing an instance of [Voice]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Voice]. */
        class Builder internal constructor() {

            private var gender: JsonField<String> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var voiceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voice: Voice) = apply {
                gender = voice.gender
                language = voice.language
                name = voice.name
                provider = voice.provider
                voiceId = voice.voiceId
                additionalProperties = voice.additionalProperties.toMutableMap()
            }

            /** Voice gender. */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Language code. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Voice name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The TTS provider. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /** Voice identifier. */
            fun voiceId(voiceId: String) = voiceId(JsonField.of(voiceId))

            /**
             * Sets [Builder.voiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceId(voiceId: JsonField<String>) = apply { this.voiceId = voiceId }

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
             * Returns an immutable instance of [Voice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Voice =
                Voice(
                    gender,
                    language,
                    name,
                    provider,
                    voiceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Voice = apply {
            if (validated) {
                return@apply
            }

            gender()
            language()
            name()
            provider()
            voiceId()
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
            (if (gender.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (voiceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Voice &&
                gender == other.gender &&
                language == other.language &&
                name == other.name &&
                provider == other.provider &&
                voiceId == other.voiceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(gender, language, name, provider, voiceId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Voice{gender=$gender, language=$language, name=$name, provider=$provider, voiceId=$voiceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextToSpeechListVoicesResponse &&
            voices == other.voices &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(voices, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TextToSpeechListVoicesResponse{voices=$voices, additionalProperties=$additionalProperties}"
}
