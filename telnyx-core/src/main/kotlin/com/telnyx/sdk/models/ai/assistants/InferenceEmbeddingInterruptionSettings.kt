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
import kotlin.jvm.optionals.getOrNull

/**
 * Settings for interruptions and how the assistant decides the user has finished speaking. These
 * timings are most relevant when using non turn-taking transcription models. For turn-taking models
 * like `deepgram/flux`, end-of-turn behavior is controlled by the transcription end-of-turn
 * settings under `transcription.settings` (`eot_threshold`, `eot_timeout_ms`,
 * `eager_eot_threshold`).
 */
class InferenceEmbeddingInterruptionSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val disableGreetingInterruption: JsonField<Boolean>,
    private val enable: JsonField<Boolean>,
    private val interruptPredictionThreshold: JsonField<Double>,
    private val startSpeakingPlan: JsonField<StartSpeakingPlan>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("disable_greeting_interruption")
        @ExcludeMissing
        disableGreetingInterruption: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable") @ExcludeMissing enable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("interrupt_prediction_threshold")
        @ExcludeMissing
        interruptPredictionThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_speaking_plan")
        @ExcludeMissing
        startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of(),
    ) : this(
        disableGreetingInterruption,
        enable,
        interruptPredictionThreshold,
        startSpeakingPlan,
        mutableMapOf(),
    )

    /**
     * When true, disables user interruptions while the assistant greeting is playing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disableGreetingInterruption(): Optional<Boolean> =
        disableGreetingInterruption.getOptional("disable_greeting_interruption")

    /**
     * Whether users can interrupt the assistant while it is speaking.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enable(): Optional<Boolean> = enable.getOptional("enable")

    /**
     * Interrupt-prediction sensitivity, from 0.0 to 1.0. Set to null or 0.0 to disable interrupt
     * prediction.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptPredictionThreshold(): Optional<Double> =
        interruptPredictionThreshold.getOptional("interrupt_prediction_threshold")

    /**
     * Controls when the assistant starts speaking after the user stops. These thresholds primarily
     * apply to non turn-taking transcription models. For turn-taking models like `deepgram/flux`,
     * end-of-turn detection is driven by the transcription end-of-turn settings under
     * `transcription.settings` instead.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startSpeakingPlan(): Optional<StartSpeakingPlan> =
        startSpeakingPlan.getOptional("start_speaking_plan")

    /**
     * Returns the raw JSON value of [disableGreetingInterruption].
     *
     * Unlike [disableGreetingInterruption], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("disable_greeting_interruption")
    @ExcludeMissing
    fun _disableGreetingInterruption(): JsonField<Boolean> = disableGreetingInterruption

    /**
     * Returns the raw JSON value of [enable].
     *
     * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

    /**
     * Returns the raw JSON value of [interruptPredictionThreshold].
     *
     * Unlike [interruptPredictionThreshold], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("interrupt_prediction_threshold")
    @ExcludeMissing
    fun _interruptPredictionThreshold(): JsonField<Double> = interruptPredictionThreshold

    /**
     * Returns the raw JSON value of [startSpeakingPlan].
     *
     * Unlike [startSpeakingPlan], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("start_speaking_plan")
    @ExcludeMissing
    fun _startSpeakingPlan(): JsonField<StartSpeakingPlan> = startSpeakingPlan

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
         * [InferenceEmbeddingInterruptionSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingInterruptionSettings]. */
    class Builder internal constructor() {

        private var disableGreetingInterruption: JsonField<Boolean> = JsonMissing.of()
        private var enable: JsonField<Boolean> = JsonMissing.of()
        private var interruptPredictionThreshold: JsonField<Double> = JsonMissing.of()
        private var startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferenceEmbeddingInterruptionSettings: InferenceEmbeddingInterruptionSettings
        ) = apply {
            disableGreetingInterruption =
                inferenceEmbeddingInterruptionSettings.disableGreetingInterruption
            enable = inferenceEmbeddingInterruptionSettings.enable
            interruptPredictionThreshold =
                inferenceEmbeddingInterruptionSettings.interruptPredictionThreshold
            startSpeakingPlan = inferenceEmbeddingInterruptionSettings.startSpeakingPlan
            additionalProperties =
                inferenceEmbeddingInterruptionSettings.additionalProperties.toMutableMap()
        }

        /** When true, disables user interruptions while the assistant greeting is playing. */
        fun disableGreetingInterruption(disableGreetingInterruption: Boolean) =
            disableGreetingInterruption(JsonField.of(disableGreetingInterruption))

        /**
         * Sets [Builder.disableGreetingInterruption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableGreetingInterruption] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun disableGreetingInterruption(disableGreetingInterruption: JsonField<Boolean>) = apply {
            this.disableGreetingInterruption = disableGreetingInterruption
        }

        /** Whether users can interrupt the assistant while it is speaking. */
        fun enable(enable: Boolean) = enable(JsonField.of(enable))

        /**
         * Sets [Builder.enable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enable] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

        /**
         * Interrupt-prediction sensitivity, from 0.0 to 1.0. Set to null or 0.0 to disable
         * interrupt prediction.
         */
        fun interruptPredictionThreshold(interruptPredictionThreshold: Double?) =
            interruptPredictionThreshold(JsonField.ofNullable(interruptPredictionThreshold))

        /**
         * Alias for [Builder.interruptPredictionThreshold].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun interruptPredictionThreshold(interruptPredictionThreshold: Double) =
            interruptPredictionThreshold(interruptPredictionThreshold as Double?)

        /**
         * Alias for calling [Builder.interruptPredictionThreshold] with
         * `interruptPredictionThreshold.orElse(null)`.
         */
        fun interruptPredictionThreshold(interruptPredictionThreshold: Optional<Double>) =
            interruptPredictionThreshold(interruptPredictionThreshold.getOrNull())

        /**
         * Sets [Builder.interruptPredictionThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptPredictionThreshold] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun interruptPredictionThreshold(interruptPredictionThreshold: JsonField<Double>) = apply {
            this.interruptPredictionThreshold = interruptPredictionThreshold
        }

        /**
         * Controls when the assistant starts speaking after the user stops. These thresholds
         * primarily apply to non turn-taking transcription models. For turn-taking models like
         * `deepgram/flux`, end-of-turn detection is driven by the transcription end-of-turn
         * settings under `transcription.settings` instead.
         */
        fun startSpeakingPlan(startSpeakingPlan: StartSpeakingPlan) =
            startSpeakingPlan(JsonField.of(startSpeakingPlan))

        /**
         * Sets [Builder.startSpeakingPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startSpeakingPlan] with a well-typed [StartSpeakingPlan]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startSpeakingPlan(startSpeakingPlan: JsonField<StartSpeakingPlan>) = apply {
            this.startSpeakingPlan = startSpeakingPlan
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
         * Returns an immutable instance of [InferenceEmbeddingInterruptionSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InferenceEmbeddingInterruptionSettings =
            InferenceEmbeddingInterruptionSettings(
                disableGreetingInterruption,
                enable,
                interruptPredictionThreshold,
                startSpeakingPlan,
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
    fun validate(): InferenceEmbeddingInterruptionSettings = apply {
        if (validated) {
            return@apply
        }

        disableGreetingInterruption()
        enable()
        interruptPredictionThreshold()
        startSpeakingPlan().ifPresent { it.validate() }
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
        (if (disableGreetingInterruption.asKnown().isPresent) 1 else 0) +
            (if (enable.asKnown().isPresent) 1 else 0) +
            (if (interruptPredictionThreshold.asKnown().isPresent) 1 else 0) +
            (startSpeakingPlan.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceEmbeddingInterruptionSettings &&
            disableGreetingInterruption == other.disableGreetingInterruption &&
            enable == other.enable &&
            interruptPredictionThreshold == other.interruptPredictionThreshold &&
            startSpeakingPlan == other.startSpeakingPlan &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            disableGreetingInterruption,
            enable,
            interruptPredictionThreshold,
            startSpeakingPlan,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbeddingInterruptionSettings{disableGreetingInterruption=$disableGreetingInterruption, enable=$enable, interruptPredictionThreshold=$interruptPredictionThreshold, startSpeakingPlan=$startSpeakingPlan, additionalProperties=$additionalProperties}"
}
