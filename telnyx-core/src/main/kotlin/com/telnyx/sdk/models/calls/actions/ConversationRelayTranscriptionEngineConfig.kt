// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

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
 * Engine-specific transcription settings for Conversation Relay. This accepts the same
 * provider-specific options used by the Call Transcription Start command, such as
 * `transcription_model`, without requiring the engine discriminator to be repeated inside this
 * object. With Deepgram Flux (`deepgram/flux`), `interim_results`, `eot_threshold` and
 * `eager_eot_threshold` control the interim prompts and the `eagerEndOfTurn` and `turnResumed`
 * frames sent to your WebSocket server.
 */
class ConversationRelayTranscriptionEngineConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eagerEotThreshold: JsonField<Double>,
    private val eotThreshold: JsonField<Double>,
    private val interimResults: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eager_eot_threshold")
        @ExcludeMissing
        eagerEotThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("eot_threshold")
        @ExcludeMissing
        eotThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("interim_results")
        @ExcludeMissing
        interimResults: JsonField<Boolean> = JsonMissing.of(),
    ) : this(eagerEotThreshold, eotThreshold, interimResults, mutableMapOf())

    /**
     * Deepgram Flux: confidence at which an `eagerEndOfTurn` frame is sent before the final prompt,
     * followed by `turnResumed` if the caller keeps talking. When omitted, these frames are not
     * sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eagerEotThreshold(): Optional<Double> = eagerEotThreshold.getOptional("eager_eot_threshold")

    /**
     * Deepgram Flux: confidence required to end the caller's turn.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eotThreshold(): Optional<Double> = eotThreshold.getOptional("eot_threshold")

    /**
     * Deepgram Flux: send interim transcripts as `prompt` frames with `last: false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

    /**
     * Returns the raw JSON value of [eagerEotThreshold].
     *
     * Unlike [eagerEotThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eager_eot_threshold")
    @ExcludeMissing
    fun _eagerEotThreshold(): JsonField<Double> = eagerEotThreshold

    /**
     * Returns the raw JSON value of [eotThreshold].
     *
     * Unlike [eotThreshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eot_threshold")
    @ExcludeMissing
    fun _eotThreshold(): JsonField<Double> = eotThreshold

    /**
     * Returns the raw JSON value of [interimResults].
     *
     * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interim_results")
    @ExcludeMissing
    fun _interimResults(): JsonField<Boolean> = interimResults

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
         * [ConversationRelayTranscriptionEngineConfig].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationRelayTranscriptionEngineConfig]. */
    class Builder internal constructor() {

        private var eagerEotThreshold: JsonField<Double> = JsonMissing.of()
        private var eotThreshold: JsonField<Double> = JsonMissing.of()
        private var interimResults: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conversationRelayTranscriptionEngineConfig: ConversationRelayTranscriptionEngineConfig
        ) = apply {
            eagerEotThreshold = conversationRelayTranscriptionEngineConfig.eagerEotThreshold
            eotThreshold = conversationRelayTranscriptionEngineConfig.eotThreshold
            interimResults = conversationRelayTranscriptionEngineConfig.interimResults
            additionalProperties =
                conversationRelayTranscriptionEngineConfig.additionalProperties.toMutableMap()
        }

        /**
         * Deepgram Flux: confidence at which an `eagerEndOfTurn` frame is sent before the final
         * prompt, followed by `turnResumed` if the caller keeps talking. When omitted, these frames
         * are not sent.
         */
        fun eagerEotThreshold(eagerEotThreshold: Double) =
            eagerEotThreshold(JsonField.of(eagerEotThreshold))

        /**
         * Sets [Builder.eagerEotThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eagerEotThreshold] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eagerEotThreshold(eagerEotThreshold: JsonField<Double>) = apply {
            this.eagerEotThreshold = eagerEotThreshold
        }

        /** Deepgram Flux: confidence required to end the caller's turn. */
        fun eotThreshold(eotThreshold: Double) = eotThreshold(JsonField.of(eotThreshold))

        /**
         * Sets [Builder.eotThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eotThreshold] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eotThreshold(eotThreshold: JsonField<Double>) = apply {
            this.eotThreshold = eotThreshold
        }

        /** Deepgram Flux: send interim transcripts as `prompt` frames with `last: false`. */
        fun interimResults(interimResults: Boolean) = interimResults(JsonField.of(interimResults))

        /**
         * Sets [Builder.interimResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interimResults] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interimResults(interimResults: JsonField<Boolean>) = apply {
            this.interimResults = interimResults
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
         * Returns an immutable instance of [ConversationRelayTranscriptionEngineConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationRelayTranscriptionEngineConfig =
            ConversationRelayTranscriptionEngineConfig(
                eagerEotThreshold,
                eotThreshold,
                interimResults,
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
    fun validate(): ConversationRelayTranscriptionEngineConfig = apply {
        if (validated) {
            return@apply
        }

        eagerEotThreshold()
        eotThreshold()
        interimResults()
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
        (if (eagerEotThreshold.asKnown().isPresent) 1 else 0) +
            (if (eotThreshold.asKnown().isPresent) 1 else 0) +
            (if (interimResults.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationRelayTranscriptionEngineConfig &&
            eagerEotThreshold == other.eagerEotThreshold &&
            eotThreshold == other.eotThreshold &&
            interimResults == other.interimResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(eagerEotThreshold, eotThreshold, interimResults, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConversationRelayTranscriptionEngineConfig{eagerEotThreshold=$eagerEotThreshold, eotThreshold=$eotThreshold, interimResults=$interimResults, additionalProperties=$additionalProperties}"
}
