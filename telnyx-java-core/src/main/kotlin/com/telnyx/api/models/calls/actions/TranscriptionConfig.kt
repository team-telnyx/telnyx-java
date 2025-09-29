// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * The settings associated with speech to text for the voice assistant. This is only relevant if the
 * assistant uses a text-to-text language model. Any assistant using a model with native audio
 * support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field.
 */
class TranscriptionConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val model: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of()
    ) : this(model, mutableMapOf())

    /**
     * The speech to text model to be used by the voice assistant.
     * - `distil-whisper/distil-large-v2` is lower latency but English-only.
     * - `openai/whisper-large-v3-turbo` is multi-lingual with automatic language detection but
     *   slightly higher latency.
     * - `google` is a multi-lingual option, please describe the language in the `language` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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

        private var model: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionConfig: TranscriptionConfig) = apply {
            model = transcriptionConfig.model
            additionalProperties = transcriptionConfig.additionalProperties.toMutableMap()
        }

        /**
         * The speech to text model to be used by the voice assistant.
         * - `distil-whisper/distil-large-v2` is lower latency but English-only.
         * - `openai/whisper-large-v3-turbo` is multi-lingual with automatic language detection but
         *   slightly higher latency.
         * - `google` is a multi-lingual option, please describe the language in the `language`
         *   field.
         */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

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
            TranscriptionConfig(model, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionConfig = apply {
        if (validated) {
            return@apply
        }

        model()
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
    @JvmSynthetic internal fun validity(): Int = (if (model.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionConfig &&
            model == other.model &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(model, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionConfig{model=$model, additionalProperties=$additionalProperties}"
}
