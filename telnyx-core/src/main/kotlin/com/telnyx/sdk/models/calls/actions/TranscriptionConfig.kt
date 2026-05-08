// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The settings associated with speech to text for the voice assistant. This is only relevant if the
 * assistant uses a text-to-text language model. Any assistant using a model with native audio
 * support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field.
 */
class TranscriptionConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val language: JsonField<String>,
    private val model: JsonField<Model>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
    ) : this(language, model, mutableMapOf())

    /**
     * The language of the audio to be transcribed. If not set, or if set to `auto`, supported
     * models will automatically detect the language. Supported and meaningful values depend on the
     * selected transcription `model`. For `deepgram/flux`, supported values are: `auto` (Telnyx
     * language detection controls the language hint), `multi` (no language hint), and
     * language-specific hints `en`, `es`, `fr`, `de`, `hi`, `ru`, `pt`, `ja`, `it`, and `nl`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * The speech to text model to be used by the voice assistant. Supported models include:
     * - `deepgram/flux` (or `flux`) for live streaming turn-taking.
     * - `deepgram/nova-3` and `deepgram/nova-2` for live streaming transcription.
     * - `speechmatics/standard` and `speechmatics/enhanced` for live streaming transcription.
     * - `assemblyai/universal-streaming` for live streaming transcription.
     * - `xai/grok-stt` for live streaming transcription.
     * - `azure/fast` and `azure/realtime`; Azure models require `region`, and unsupported regions
     *   require `api_key_ref`.
     * - `google/latest_long` for non-streaming multilingual transcription.
     * - `distil-whisper/distil-large-v2` for lower-latency English-only non-streaming
     *   transcription.
     * - `openai/whisper-large-v3-turbo` for multilingual non-streaming transcription with automatic
     *   language detection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<Model> = model.getOptional("model")

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
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

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

        /** Returns a mutable builder for constructing an instance of [TranscriptionConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionConfig]. */
    class Builder internal constructor() {

        private var language: JsonField<String> = JsonMissing.of()
        private var model: JsonField<Model> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionConfig: TranscriptionConfig) = apply {
            language = transcriptionConfig.language
            model = transcriptionConfig.model
            additionalProperties = transcriptionConfig.additionalProperties.toMutableMap()
        }

        /**
         * The language of the audio to be transcribed. If not set, or if set to `auto`, supported
         * models will automatically detect the language. Supported and meaningful values depend on
         * the selected transcription `model`. For `deepgram/flux`, supported values are: `auto`
         * (Telnyx language detection controls the language hint), `multi` (no language hint), and
         * language-specific hints `en`, `es`, `fr`, `de`, `hi`, `ru`, `pt`, `ja`, `it`, and `nl`.
         */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /**
         * The speech to text model to be used by the voice assistant. Supported models include:
         * - `deepgram/flux` (or `flux`) for live streaming turn-taking.
         * - `deepgram/nova-3` and `deepgram/nova-2` for live streaming transcription.
         * - `speechmatics/standard` and `speechmatics/enhanced` for live streaming transcription.
         * - `assemblyai/universal-streaming` for live streaming transcription.
         * - `xai/grok-stt` for live streaming transcription.
         * - `azure/fast` and `azure/realtime`; Azure models require `region`, and unsupported
         *   regions require `api_key_ref`.
         * - `google/latest_long` for non-streaming multilingual transcription.
         * - `distil-whisper/distil-large-v2` for lower-latency English-only non-streaming
         *   transcription.
         * - `openai/whisper-large-v3-turbo` for multilingual non-streaming transcription with
         *   automatic language detection.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

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
         * Returns an immutable instance of [TranscriptionConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionConfig =
            TranscriptionConfig(language, model, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TranscriptionConfig = apply {
        if (validated) {
            return@apply
        }

        language()
        model().ifPresent { it.validate() }
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
        (if (language.asKnown().isPresent) 1 else 0) +
            (model.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The speech to text model to be used by the voice assistant. Supported models include:
     * - `deepgram/flux` (or `flux`) for live streaming turn-taking.
     * - `deepgram/nova-3` and `deepgram/nova-2` for live streaming transcription.
     * - `speechmatics/standard` and `speechmatics/enhanced` for live streaming transcription.
     * - `assemblyai/universal-streaming` for live streaming transcription.
     * - `xai/grok-stt` for live streaming transcription.
     * - `azure/fast` and `azure/realtime`; Azure models require `region`, and unsupported regions
     *   require `api_key_ref`.
     * - `google/latest_long` for non-streaming multilingual transcription.
     * - `distil-whisper/distil-large-v2` for lower-latency English-only non-streaming
     *   transcription.
     * - `openai/whisper-large-v3-turbo` for multilingual non-streaming transcription with automatic
     *   language detection.
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

            @JvmField val DEEPGRAM_FLUX = of("deepgram/flux")

            @JvmField val FLUX = of("flux")

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

            @JvmField val SPEECHMATICS_STANDARD = of("speechmatics/standard")

            @JvmField val SPEECHMATICS_ENHANCED = of("speechmatics/enhanced")

            @JvmField val ASSEMBLYAI_UNIVERSAL_STREAMING = of("assemblyai/universal-streaming")

            @JvmField val XAI_GROK_STT = of("xai/grok-stt")

            @JvmField val AZURE_FAST = of("azure/fast")

            @JvmField val AZURE_REALTIME = of("azure/realtime")

            @JvmField val GOOGLE_LATEST_LONG = of("google/latest_long")

            @JvmField val DISTIL_WHISPER_DISTIL_LARGE_V2 = of("distil-whisper/distil-large-v2")

            @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            DEEPGRAM_FLUX,
            FLUX,
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            SPEECHMATICS_STANDARD,
            SPEECHMATICS_ENHANCED,
            ASSEMBLYAI_UNIVERSAL_STREAMING,
            XAI_GROK_STT,
            AZURE_FAST,
            AZURE_REALTIME,
            GOOGLE_LATEST_LONG,
            DISTIL_WHISPER_DISTIL_LARGE_V2,
            OPENAI_WHISPER_LARGE_V3_TURBO,
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
            DEEPGRAM_FLUX,
            FLUX,
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            SPEECHMATICS_STANDARD,
            SPEECHMATICS_ENHANCED,
            ASSEMBLYAI_UNIVERSAL_STREAMING,
            XAI_GROK_STT,
            AZURE_FAST,
            AZURE_REALTIME,
            GOOGLE_LATEST_LONG,
            DISTIL_WHISPER_DISTIL_LARGE_V2,
            OPENAI_WHISPER_LARGE_V3_TURBO,
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
                DEEPGRAM_FLUX -> Value.DEEPGRAM_FLUX
                FLUX -> Value.FLUX
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                SPEECHMATICS_STANDARD -> Value.SPEECHMATICS_STANDARD
                SPEECHMATICS_ENHANCED -> Value.SPEECHMATICS_ENHANCED
                ASSEMBLYAI_UNIVERSAL_STREAMING -> Value.ASSEMBLYAI_UNIVERSAL_STREAMING
                XAI_GROK_STT -> Value.XAI_GROK_STT
                AZURE_FAST -> Value.AZURE_FAST
                AZURE_REALTIME -> Value.AZURE_REALTIME
                GOOGLE_LATEST_LONG -> Value.GOOGLE_LATEST_LONG
                DISTIL_WHISPER_DISTIL_LARGE_V2 -> Value.DISTIL_WHISPER_DISTIL_LARGE_V2
                OPENAI_WHISPER_LARGE_V3_TURBO -> Value.OPENAI_WHISPER_LARGE_V3_TURBO
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
                DEEPGRAM_FLUX -> Known.DEEPGRAM_FLUX
                FLUX -> Known.FLUX
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                SPEECHMATICS_STANDARD -> Known.SPEECHMATICS_STANDARD
                SPEECHMATICS_ENHANCED -> Known.SPEECHMATICS_ENHANCED
                ASSEMBLYAI_UNIVERSAL_STREAMING -> Known.ASSEMBLYAI_UNIVERSAL_STREAMING
                XAI_GROK_STT -> Known.XAI_GROK_STT
                AZURE_FAST -> Known.AZURE_FAST
                AZURE_REALTIME -> Known.AZURE_REALTIME
                GOOGLE_LATEST_LONG -> Known.GOOGLE_LATEST_LONG
                DISTIL_WHISPER_DISTIL_LARGE_V2 -> Known.DISTIL_WHISPER_DISTIL_LARGE_V2
                OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionConfig &&
            language == other.language &&
            model == other.model &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(language, model, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionConfig{language=$language, model=$model, additionalProperties=$additionalProperties}"
}
