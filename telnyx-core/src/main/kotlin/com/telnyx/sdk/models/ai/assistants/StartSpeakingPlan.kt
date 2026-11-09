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
 * Controls when the assistant starts speaking after the user stops. These thresholds primarily
 * apply to non turn-taking transcription models. For turn-taking models like `deepgram/flux`,
 * end-of-turn detection is driven by the transcription end-of-turn settings under
 * `transcription.settings` instead.
 *
 * Sending any `start_speaking_plan` object — an empty `{}` included (the stored config fills in
 * field defaults) — engages per-turn transcript matching: on each turn the transcript tail is
 * evaluated against the configured `transcription_endpointing_plan` tiers, and the wait is set to
 * the matching tier's seconds. When the transcript ends without terminal punctuation or a number
 * and `transcription_endpointing_plan` is set, its `on_no_punctuation_seconds` tier applies. Only
 * when no tier matches (`transcription_endpointing_plan` unset or null) does the wait stay on
 * `wait_seconds`. Setting `start_speaking_plan` to `null` (or omitting it) turns per-turn matching
 * off entirely, and the assistant starts speaking as soon as silence is detected.
 */
class StartSpeakingPlan
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan>,
    private val waitSeconds: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("transcription_endpointing_plan")
        @ExcludeMissing
        transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan> = JsonMissing.of(),
        @JsonProperty("wait_seconds")
        @ExcludeMissing
        waitSeconds: JsonField<Float> = JsonMissing.of(),
    ) : this(transcriptionEndpointingPlan, waitSeconds, mutableMapOf())

    /**
     * Endpointing thresholds used to decide when the user has finished speaking. Applies to non
     * turn-taking transcription models. For `deepgram/flux`, use
     * `transcription.settings.eot_threshold` / `eot_timeout_ms` / `eager_eot_threshold`. Evaluated
     * per turn, on each caller transcript, only while `start_speaking_plan` is present: the tier
     * whose suffix matches the transcript tail is applied (a transcript with no terminal
     * punctuation or number falls through to `on_no_punctuation_seconds`); with no tiers configured
     * (or a null nested plan), the per-turn wait stays on `start_speaking_plan.wait_seconds`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEndpointingPlan(): Optional<TranscriptionEndpointingPlan> =
        transcriptionEndpointingPlan.getOptional("transcription_endpointing_plan")

    /**
     * Wait used when per-turn endpointing does not select a tier. While the plan is present this
     * applies on every turn without a matching tier (including when
     * `transcription_endpointing_plan` is unset); a matching tier replaces it for that turn, and a
     * tier may be shorter or longer than this value.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun waitSeconds(): Optional<Float> = waitSeconds.getOptional("wait_seconds")

    /**
     * Returns the raw JSON value of [transcriptionEndpointingPlan].
     *
     * Unlike [transcriptionEndpointingPlan], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transcription_endpointing_plan")
    @ExcludeMissing
    fun _transcriptionEndpointingPlan(): JsonField<TranscriptionEndpointingPlan> =
        transcriptionEndpointingPlan

    /**
     * Returns the raw JSON value of [waitSeconds].
     *
     * Unlike [waitSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wait_seconds") @ExcludeMissing fun _waitSeconds(): JsonField<Float> = waitSeconds

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

        /** Returns a mutable builder for constructing an instance of [StartSpeakingPlan]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StartSpeakingPlan]. */
    class Builder internal constructor() {

        private var transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan> =
            JsonMissing.of()
        private var waitSeconds: JsonField<Float> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(startSpeakingPlan: StartSpeakingPlan) = apply {
            transcriptionEndpointingPlan = startSpeakingPlan.transcriptionEndpointingPlan
            waitSeconds = startSpeakingPlan.waitSeconds
            additionalProperties = startSpeakingPlan.additionalProperties.toMutableMap()
        }

        /**
         * Endpointing thresholds used to decide when the user has finished speaking. Applies to non
         * turn-taking transcription models. For `deepgram/flux`, use
         * `transcription.settings.eot_threshold` / `eot_timeout_ms` / `eager_eot_threshold`.
         * Evaluated per turn, on each caller transcript, only while `start_speaking_plan` is
         * present: the tier whose suffix matches the transcript tail is applied (a transcript with
         * no terminal punctuation or number falls through to `on_no_punctuation_seconds`); with no
         * tiers configured (or a null nested plan), the per-turn wait stays on
         * `start_speaking_plan.wait_seconds`.
         */
        fun transcriptionEndpointingPlan(
            transcriptionEndpointingPlan: TranscriptionEndpointingPlan?
        ) = transcriptionEndpointingPlan(JsonField.ofNullable(transcriptionEndpointingPlan))

        /**
         * Alias for calling [Builder.transcriptionEndpointingPlan] with
         * `transcriptionEndpointingPlan.orElse(null)`.
         */
        fun transcriptionEndpointingPlan(
            transcriptionEndpointingPlan: Optional<TranscriptionEndpointingPlan>
        ) = transcriptionEndpointingPlan(transcriptionEndpointingPlan.getOrNull())

        /**
         * Sets [Builder.transcriptionEndpointingPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEndpointingPlan] with a well-typed
         * [TranscriptionEndpointingPlan] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun transcriptionEndpointingPlan(
            transcriptionEndpointingPlan: JsonField<TranscriptionEndpointingPlan>
        ) = apply { this.transcriptionEndpointingPlan = transcriptionEndpointingPlan }

        /**
         * Wait used when per-turn endpointing does not select a tier. While the plan is present
         * this applies on every turn without a matching tier (including when
         * `transcription_endpointing_plan` is unset); a matching tier replaces it for that turn,
         * and a tier may be shorter or longer than this value.
         */
        fun waitSeconds(waitSeconds: Float) = waitSeconds(JsonField.of(waitSeconds))

        /**
         * Sets [Builder.waitSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waitSeconds] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun waitSeconds(waitSeconds: JsonField<Float>) = apply { this.waitSeconds = waitSeconds }

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
         * Returns an immutable instance of [StartSpeakingPlan].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StartSpeakingPlan =
            StartSpeakingPlan(
                transcriptionEndpointingPlan,
                waitSeconds,
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
    fun validate(): StartSpeakingPlan = apply {
        if (validated) {
            return@apply
        }

        transcriptionEndpointingPlan().ifPresent { it.validate() }
        waitSeconds()
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
        (transcriptionEndpointingPlan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (waitSeconds.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StartSpeakingPlan &&
            transcriptionEndpointingPlan == other.transcriptionEndpointingPlan &&
            waitSeconds == other.waitSeconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(transcriptionEndpointingPlan, waitSeconds, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StartSpeakingPlan{transcriptionEndpointingPlan=$transcriptionEndpointingPlan, waitSeconds=$waitSeconds, additionalProperties=$additionalProperties}"
}
