// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Endpointing thresholds used to decide when the user has finished speaking. Applies to non
 * turn-taking transcription models. For `deepgram/flux`, use `transcription.settings.eot_threshold`
 * / `eot_timeout_ms` / `eager_eot_threshold`.
 */
class TranscriptionEndpointingPlan
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val onNoPunctuationSeconds: JsonField<Float>,
    private val onNumberSeconds: JsonField<Float>,
    private val onPunctuationSeconds: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("on_no_punctuation_seconds")
        @ExcludeMissing
        onNoPunctuationSeconds: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("on_number_seconds")
        @ExcludeMissing
        onNumberSeconds: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("on_punctuation_seconds")
        @ExcludeMissing
        onPunctuationSeconds: JsonField<Float> = JsonMissing.of(),
    ) : this(onNoPunctuationSeconds, onNumberSeconds, onPunctuationSeconds, mutableMapOf())

    /**
     * Seconds to wait after the transcript ends without punctuation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onNoPunctuationSeconds(): Optional<Float> =
        onNoPunctuationSeconds.getOptional("on_no_punctuation_seconds")

    /**
     * Seconds to wait after the transcript ends with a number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onNumberSeconds(): Optional<Float> = onNumberSeconds.getOptional("on_number_seconds")

    /**
     * Seconds to wait after the transcript ends with punctuation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onPunctuationSeconds(): Optional<Float> =
        onPunctuationSeconds.getOptional("on_punctuation_seconds")

    /**
     * Returns the raw JSON value of [onNoPunctuationSeconds].
     *
     * Unlike [onNoPunctuationSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("on_no_punctuation_seconds")
    @ExcludeMissing
    fun _onNoPunctuationSeconds(): JsonField<Float> = onNoPunctuationSeconds

    /**
     * Returns the raw JSON value of [onNumberSeconds].
     *
     * Unlike [onNumberSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("on_number_seconds")
    @ExcludeMissing
    fun _onNumberSeconds(): JsonField<Float> = onNumberSeconds

    /**
     * Returns the raw JSON value of [onPunctuationSeconds].
     *
     * Unlike [onPunctuationSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("on_punctuation_seconds")
    @ExcludeMissing
    fun _onPunctuationSeconds(): JsonField<Float> = onPunctuationSeconds

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
         * Returns a mutable builder for constructing an instance of [TranscriptionEndpointingPlan].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionEndpointingPlan]. */
    class Builder internal constructor() {

        private var onNoPunctuationSeconds: JsonField<Float> = JsonMissing.of()
        private var onNumberSeconds: JsonField<Float> = JsonMissing.of()
        private var onPunctuationSeconds: JsonField<Float> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionEndpointingPlan: TranscriptionEndpointingPlan) = apply {
            onNoPunctuationSeconds = transcriptionEndpointingPlan.onNoPunctuationSeconds
            onNumberSeconds = transcriptionEndpointingPlan.onNumberSeconds
            onPunctuationSeconds = transcriptionEndpointingPlan.onPunctuationSeconds
            additionalProperties = transcriptionEndpointingPlan.additionalProperties.toMutableMap()
        }

        /** Seconds to wait after the transcript ends without punctuation. */
        fun onNoPunctuationSeconds(onNoPunctuationSeconds: Float) =
            onNoPunctuationSeconds(JsonField.of(onNoPunctuationSeconds))

        /**
         * Sets [Builder.onNoPunctuationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onNoPunctuationSeconds] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onNoPunctuationSeconds(onNoPunctuationSeconds: JsonField<Float>) = apply {
            this.onNoPunctuationSeconds = onNoPunctuationSeconds
        }

        /** Seconds to wait after the transcript ends with a number. */
        fun onNumberSeconds(onNumberSeconds: Float) = onNumberSeconds(JsonField.of(onNumberSeconds))

        /**
         * Sets [Builder.onNumberSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onNumberSeconds] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onNumberSeconds(onNumberSeconds: JsonField<Float>) = apply {
            this.onNumberSeconds = onNumberSeconds
        }

        /** Seconds to wait after the transcript ends with punctuation. */
        fun onPunctuationSeconds(onPunctuationSeconds: Float) =
            onPunctuationSeconds(JsonField.of(onPunctuationSeconds))

        /**
         * Sets [Builder.onPunctuationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onPunctuationSeconds] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onPunctuationSeconds(onPunctuationSeconds: JsonField<Float>) = apply {
            this.onPunctuationSeconds = onPunctuationSeconds
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
         * Returns an immutable instance of [TranscriptionEndpointingPlan].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionEndpointingPlan =
            TranscriptionEndpointingPlan(
                onNoPunctuationSeconds,
                onNumberSeconds,
                onPunctuationSeconds,
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
    fun validate(): TranscriptionEndpointingPlan = apply {
        if (validated) {
            return@apply
        }

        onNoPunctuationSeconds()
        onNumberSeconds()
        onPunctuationSeconds()
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
        (if (onNoPunctuationSeconds.asKnown().isPresent) 1 else 0) +
            (if (onNumberSeconds.asKnown().isPresent) 1 else 0) +
            (if (onPunctuationSeconds.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEndpointingPlan &&
            onNoPunctuationSeconds == other.onNoPunctuationSeconds &&
            onNumberSeconds == other.onNumberSeconds &&
            onPunctuationSeconds == other.onPunctuationSeconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            onNoPunctuationSeconds,
            onNumberSeconds,
            onPunctuationSeconds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionEndpointingPlan{onNoPunctuationSeconds=$onNoPunctuationSeconds, onNumberSeconds=$onNumberSeconds, onPunctuationSeconds=$onPunctuationSeconds, additionalProperties=$additionalProperties}"
}
