// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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

class TranscriptionSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val language: JsonField<String>,
    private val model: JsonField<Model>,
    private val region: JsonField<String>,
    private val settings: JsonField<TranscriptionSettingsConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of(),
    ) : this(language, model, region, settings, mutableMapOf())

    /**
     * The language of the audio to be transcribed. If not set, of if set to `auto`, the model will
     * automatically detect the language.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * The speech to text model to be used by the voice assistant. All the deepgram models are run
     * on-premise.
     * - `deepgram/flux` is optimized for turn-taking but is English-only.
     * - `deepgram/nova-3` is multi-lingual with automatic language detection but slightly higher
     *   latency.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<Model> = model.getOptional("model")

    /**
     * Region on third party cloud providers (currently Azure) if using one of their models
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<TranscriptionSettingsConfig> = settings.getOptional("settings")

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

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings")
    @ExcludeMissing
    fun _settings(): JsonField<TranscriptionSettingsConfig> = settings

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

        /** Returns a mutable builder for constructing an instance of [TranscriptionSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionSettings]. */
    class Builder internal constructor() {

        private var language: JsonField<String> = JsonMissing.of()
        private var model: JsonField<Model> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionSettings: TranscriptionSettings) = apply {
            language = transcriptionSettings.language
            model = transcriptionSettings.model
            region = transcriptionSettings.region
            settings = transcriptionSettings.settings
            additionalProperties = transcriptionSettings.additionalProperties.toMutableMap()
        }

        /**
         * The language of the audio to be transcribed. If not set, of if set to `auto`, the model
         * will automatically detect the language.
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
         * The speech to text model to be used by the voice assistant. All the deepgram models are
         * run on-premise.
         * - `deepgram/flux` is optimized for turn-taking but is English-only.
         * - `deepgram/nova-3` is multi-lingual with automatic language detection but slightly
         *   higher latency.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /** Region on third party cloud providers (currently Azure) if using one of their models */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        fun settings(settings: TranscriptionSettingsConfig) = settings(JsonField.of(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed
         * [TranscriptionSettingsConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun settings(settings: JsonField<TranscriptionSettingsConfig>) = apply {
            this.settings = settings
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
         * Returns an immutable instance of [TranscriptionSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionSettings =
            TranscriptionSettings(
                language,
                model,
                region,
                settings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionSettings = apply {
        if (validated) {
            return@apply
        }

        language()
        model().ifPresent { it.validate() }
        region()
        settings().ifPresent { it.validate() }
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
            (model.asKnown().getOrNull()?.validity() ?: 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (settings.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The speech to text model to be used by the voice assistant. All the deepgram models are run
     * on-premise.
     * - `deepgram/flux` is optimized for turn-taking but is English-only.
     * - `deepgram/nova-3` is multi-lingual with automatic language detection but slightly higher
     *   latency.
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

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

            @JvmField val AZURE_FAST = of("azure/fast")

            @JvmField val DISTIL_WHISPER_DISTIL_LARGE_V2 = of("distil-whisper/distil-large-v2")

            @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            DEEPGRAM_FLUX,
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            AZURE_FAST,
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
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            AZURE_FAST,
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
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                AZURE_FAST -> Value.AZURE_FAST
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
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                AZURE_FAST -> Known.AZURE_FAST
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

        return other is TranscriptionSettings &&
            language == other.language &&
            model == other.model &&
            region == other.region &&
            settings == other.settings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(language, model, region, settings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionSettings{language=$language, model=$model, region=$region, settings=$settings, additionalProperties=$additionalProperties}"
}
