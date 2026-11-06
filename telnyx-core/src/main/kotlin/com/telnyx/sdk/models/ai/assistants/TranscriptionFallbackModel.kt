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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A streaming speech-to-text model that takes over transcription when the model in use fails. */
class TranscriptionFallbackModel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val model: JsonField<Model>,
    private val language: JsonField<String>,
    private val settings: JsonField<TranscriptionSettingsConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of(),
    ) : this(model, language, settings, mutableMapOf())

    /**
     * The fallback model. It must be a streaming model other than `transcription.model` and the
     * other fallbacks: `deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
     * `assemblyai/universal-3-6-pro` (or its legacy aliases `assemblyai/universal-3-5-pro` and
     * `assemblyai/universal-streaming`), `xai/grok-stt`, `soniox/stt-rt-v4`, `soniox/stt-rt-v5`,
     * `humain/realtime`, or `reson8/turns`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): Model = model.getRequired("model")

    /**
     * The language the fallback transcribes. Omit it or set it to `null` to use the language of
     * `transcription.model`. The request is rejected when the fallback model doesn't support the
     * language it would run.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * Settings for the fallback, with the same fields and limits as `transcription.settings`.
     * Fields that don't apply to this model's provider are dropped, and the provider's defaults
     * fill in the rest. Omit it or set it to `null` to use the settings of `transcription.model`
     * where they apply to this model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<TranscriptionSettingsConfig> = settings.getOptional("settings")

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

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

        /**
         * Returns a mutable builder for constructing an instance of [TranscriptionFallbackModel].
         *
         * The following fields are required:
         * ```java
         * .model()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionFallbackModel]. */
    class Builder internal constructor() {

        private var model: JsonField<Model>? = null
        private var language: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionFallbackModel: TranscriptionFallbackModel) = apply {
            model = transcriptionFallbackModel.model
            language = transcriptionFallbackModel.language
            settings = transcriptionFallbackModel.settings
            additionalProperties = transcriptionFallbackModel.additionalProperties.toMutableMap()
        }

        /**
         * The fallback model. It must be a streaming model other than `transcription.model` and the
         * other fallbacks: `deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
         * `assemblyai/universal-3-6-pro` (or its legacy aliases `assemblyai/universal-3-5-pro` and
         * `assemblyai/universal-streaming`), `xai/grok-stt`, `soniox/stt-rt-v4`,
         * `soniox/stt-rt-v5`, `humain/realtime`, or `reson8/turns`.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /**
         * The language the fallback transcribes. Omit it or set it to `null` to use the language of
         * `transcription.model`. The request is rejected when the fallback model doesn't support
         * the language it would run.
         */
        fun language(language: String?) = language(JsonField.ofNullable(language))

        /** Alias for calling [Builder.language] with `language.orElse(null)`. */
        fun language(language: Optional<String>) = language(language.getOrNull())

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /**
         * Settings for the fallback, with the same fields and limits as `transcription.settings`.
         * Fields that don't apply to this model's provider are dropped, and the provider's defaults
         * fill in the rest. Omit it or set it to `null` to use the settings of
         * `transcription.model` where they apply to this model.
         */
        fun settings(settings: TranscriptionSettingsConfig?) =
            settings(JsonField.ofNullable(settings))

        /** Alias for calling [Builder.settings] with `settings.orElse(null)`. */
        fun settings(settings: Optional<TranscriptionSettingsConfig>) =
            settings(settings.getOrNull())

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
         * Returns an immutable instance of [TranscriptionFallbackModel].
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
        fun build(): TranscriptionFallbackModel =
            TranscriptionFallbackModel(
                checkRequired("model", model),
                language,
                settings,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): TranscriptionFallbackModel = apply {
        if (validated) {
            return@apply
        }

        model().validate()
        language()
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
        (model.asKnown().getOrNull()?.validity() ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (settings.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The fallback model. It must be a streaming model other than `transcription.model` and the
     * other fallbacks: `deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
     * `assemblyai/universal-3-6-pro` (or its legacy aliases `assemblyai/universal-3-5-pro` and
     * `assemblyai/universal-streaming`), `xai/grok-stt`, `soniox/stt-rt-v4`, `soniox/stt-rt-v5`,
     * `humain/realtime`, or `reson8/turns`.
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

            @JvmField val ASSEMBLYAI_UNIVERSAL_3_6_PRO = of("assemblyai/universal-3-6-pro")

            @JvmField val ASSEMBLYAI_UNIVERSAL_3_5_PRO = of("assemblyai/universal-3-5-pro")

            @JvmField val ASSEMBLYAI_UNIVERSAL_STREAMING = of("assemblyai/universal-streaming")

            @JvmField val XAI_GROK_STT = of("xai/grok-stt")

            @JvmField val SONIOX_STT_RT_V4 = of("soniox/stt-rt-v4")

            @JvmField val SONIOX_STT_RT_V5 = of("soniox/stt-rt-v5")

            @JvmField val HUMAIN_REALTIME = of("humain/realtime")

            @JvmField val RESON8_TURNS = of("reson8/turns")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            DEEPGRAM_FLUX,
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            ASSEMBLYAI_UNIVERSAL_3_6_PRO,
            ASSEMBLYAI_UNIVERSAL_3_5_PRO,
            ASSEMBLYAI_UNIVERSAL_STREAMING,
            XAI_GROK_STT,
            SONIOX_STT_RT_V4,
            SONIOX_STT_RT_V5,
            HUMAIN_REALTIME,
            RESON8_TURNS,
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
            ASSEMBLYAI_UNIVERSAL_3_6_PRO,
            ASSEMBLYAI_UNIVERSAL_3_5_PRO,
            ASSEMBLYAI_UNIVERSAL_STREAMING,
            XAI_GROK_STT,
            SONIOX_STT_RT_V4,
            SONIOX_STT_RT_V5,
            HUMAIN_REALTIME,
            RESON8_TURNS,
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
                ASSEMBLYAI_UNIVERSAL_3_6_PRO -> Value.ASSEMBLYAI_UNIVERSAL_3_6_PRO
                ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Value.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                ASSEMBLYAI_UNIVERSAL_STREAMING -> Value.ASSEMBLYAI_UNIVERSAL_STREAMING
                XAI_GROK_STT -> Value.XAI_GROK_STT
                SONIOX_STT_RT_V4 -> Value.SONIOX_STT_RT_V4
                SONIOX_STT_RT_V5 -> Value.SONIOX_STT_RT_V5
                HUMAIN_REALTIME -> Value.HUMAIN_REALTIME
                RESON8_TURNS -> Value.RESON8_TURNS
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
                ASSEMBLYAI_UNIVERSAL_3_6_PRO -> Known.ASSEMBLYAI_UNIVERSAL_3_6_PRO
                ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Known.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                ASSEMBLYAI_UNIVERSAL_STREAMING -> Known.ASSEMBLYAI_UNIVERSAL_STREAMING
                XAI_GROK_STT -> Known.XAI_GROK_STT
                SONIOX_STT_RT_V4 -> Known.SONIOX_STT_RT_V4
                SONIOX_STT_RT_V5 -> Known.SONIOX_STT_RT_V5
                HUMAIN_REALTIME -> Known.HUMAIN_REALTIME
                RESON8_TURNS -> Known.RESON8_TURNS
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

        return other is TranscriptionFallbackModel &&
            model == other.model &&
            language == other.language &&
            settings == other.settings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(model, language, settings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionFallbackModel{model=$model, language=$language, settings=$settings, additionalProperties=$additionalProperties}"
}
