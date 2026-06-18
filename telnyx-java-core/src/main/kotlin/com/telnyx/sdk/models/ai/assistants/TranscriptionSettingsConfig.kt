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

class TranscriptionSettingsConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eagerEotThreshold: JsonField<Double>,
    private val enableEndpointDetection: JsonField<Boolean>,
    private val endOfTurnConfidenceThreshold: JsonField<Double>,
    private val eotThreshold: JsonField<Double>,
    private val eotTimeoutMs: JsonField<Long>,
    private val interimResults: JsonField<Boolean>,
    private val keyterm: JsonField<String>,
    private val maxEndpointDelayMs: JsonField<Long>,
    private val maxTurnSilence: JsonField<Long>,
    private val minTurnSilence: JsonField<Long>,
    private val numerals: JsonField<Boolean>,
    private val smartFormat: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eager_eot_threshold")
        @ExcludeMissing
        eagerEotThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("enable_endpoint_detection")
        @ExcludeMissing
        enableEndpointDetection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("end_of_turn_confidence_threshold")
        @ExcludeMissing
        endOfTurnConfidenceThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("eot_threshold")
        @ExcludeMissing
        eotThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("eot_timeout_ms")
        @ExcludeMissing
        eotTimeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interim_results")
        @ExcludeMissing
        interimResults: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("keyterm") @ExcludeMissing keyterm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_endpoint_delay_ms")
        @ExcludeMissing
        maxEndpointDelayMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_turn_silence")
        @ExcludeMissing
        maxTurnSilence: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("min_turn_silence")
        @ExcludeMissing
        minTurnSilence: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numerals") @ExcludeMissing numerals: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("smart_format")
        @ExcludeMissing
        smartFormat: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        eagerEotThreshold,
        enableEndpointDetection,
        endOfTurnConfidenceThreshold,
        eotThreshold,
        eotTimeoutMs,
        interimResults,
        keyterm,
        maxEndpointDelayMs,
        maxTurnSilence,
        minTurnSilence,
        numerals,
        smartFormat,
        mutableMapOf(),
    )

    /**
     * Available only for deepgram/flux. Confidence threshold for eager end of turn detection. Must
     * be lower than or equal to eot_threshold. Setting this equal to eot_threshold effectively
     * disables eager end of turn.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eagerEotThreshold(): Optional<Double> = eagerEotThreshold.getOptional("eager_eot_threshold")

    /**
     * Available only for soniox/stt-rt-v4. When true, Soniox emits end-of-utterance events at the
     * cadence configured by `max_endpoint_delay_ms`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableEndpointDetection(): Optional<Boolean> =
        enableEndpointDetection.getOptional("enable_endpoint_detection")

    /**
     * Available only for assemblyai/universal-streaming. Confidence level required to trigger an
     * end of turn. Higher values require more certainty before ending a turn.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endOfTurnConfidenceThreshold(): Optional<Double> =
        endOfTurnConfidenceThreshold.getOptional("end_of_turn_confidence_threshold")

    /**
     * Available only for deepgram/flux. Confidence required to trigger an end of turn. Higher
     * values = more reliable turn detection but slightly increased latency.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eotThreshold(): Optional<Double> = eotThreshold.getOptional("eot_threshold")

    /**
     * Available only for deepgram/flux. Maximum milliseconds of silence before forcing an end of
     * turn, regardless of confidence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eotTimeoutMs(): Optional<Long> = eotTimeoutMs.getOptional("eot_timeout_ms")

    /**
     * Available only for soniox/stt-rt-v4. When true, Soniox streams interim (non-final) results in
     * addition to finalized transcripts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

    /**
     * Available only for deepgram/nova-3 and deepgram/flux. A comma-separated list of key terms to
     * boost for recognition during transcription. Helps improve accuracy for domain-specific
     * terminology, proper nouns, or uncommon words. This field may be templated with
     * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
     * using mustache syntax (e.g. `Telnyx,{{customer_name}},VoIP`). Variables are resolved at call
     * time before the value is sent to the speech-to-text engine.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyterm(): Optional<String> = keyterm.getOptional("keyterm")

    /**
     * Available only for soniox/stt-rt-v4. Maximum silence (in milliseconds) before Soniox emits an
     * end-of-utterance event. Only honored when `enable_endpoint_detection` is true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxEndpointDelayMs(): Optional<Long> =
        maxEndpointDelayMs.getOptional("max_endpoint_delay_ms")

    /**
     * Available only for assemblyai/universal-streaming. Maximum duration of silence in
     * milliseconds before forcing an end of turn.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTurnSilence(): Optional<Long> = maxTurnSilence.getOptional("max_turn_silence")

    /**
     * Available only for assemblyai/universal-streaming. Minimum duration of silence in
     * milliseconds before a turn can end. Must be less than or equal to max_turn_silence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minTurnSilence(): Optional<Long> = minTurnSilence.getOptional("min_turn_silence")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numerals(): Optional<Boolean> = numerals.getOptional("numerals")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smartFormat(): Optional<Boolean> = smartFormat.getOptional("smart_format")

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
     * Returns the raw JSON value of [enableEndpointDetection].
     *
     * Unlike [enableEndpointDetection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_endpoint_detection")
    @ExcludeMissing
    fun _enableEndpointDetection(): JsonField<Boolean> = enableEndpointDetection

    /**
     * Returns the raw JSON value of [endOfTurnConfidenceThreshold].
     *
     * Unlike [endOfTurnConfidenceThreshold], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("end_of_turn_confidence_threshold")
    @ExcludeMissing
    fun _endOfTurnConfidenceThreshold(): JsonField<Double> = endOfTurnConfidenceThreshold

    /**
     * Returns the raw JSON value of [eotThreshold].
     *
     * Unlike [eotThreshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eot_threshold")
    @ExcludeMissing
    fun _eotThreshold(): JsonField<Double> = eotThreshold

    /**
     * Returns the raw JSON value of [eotTimeoutMs].
     *
     * Unlike [eotTimeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eot_timeout_ms")
    @ExcludeMissing
    fun _eotTimeoutMs(): JsonField<Long> = eotTimeoutMs

    /**
     * Returns the raw JSON value of [interimResults].
     *
     * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interim_results")
    @ExcludeMissing
    fun _interimResults(): JsonField<Boolean> = interimResults

    /**
     * Returns the raw JSON value of [keyterm].
     *
     * Unlike [keyterm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keyterm") @ExcludeMissing fun _keyterm(): JsonField<String> = keyterm

    /**
     * Returns the raw JSON value of [maxEndpointDelayMs].
     *
     * Unlike [maxEndpointDelayMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_endpoint_delay_ms")
    @ExcludeMissing
    fun _maxEndpointDelayMs(): JsonField<Long> = maxEndpointDelayMs

    /**
     * Returns the raw JSON value of [maxTurnSilence].
     *
     * Unlike [maxTurnSilence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_turn_silence")
    @ExcludeMissing
    fun _maxTurnSilence(): JsonField<Long> = maxTurnSilence

    /**
     * Returns the raw JSON value of [minTurnSilence].
     *
     * Unlike [minTurnSilence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_turn_silence")
    @ExcludeMissing
    fun _minTurnSilence(): JsonField<Long> = minTurnSilence

    /**
     * Returns the raw JSON value of [numerals].
     *
     * Unlike [numerals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numerals") @ExcludeMissing fun _numerals(): JsonField<Boolean> = numerals

    /**
     * Returns the raw JSON value of [smartFormat].
     *
     * Unlike [smartFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("smart_format")
    @ExcludeMissing
    fun _smartFormat(): JsonField<Boolean> = smartFormat

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
         * Returns a mutable builder for constructing an instance of [TranscriptionSettingsConfig].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionSettingsConfig]. */
    class Builder internal constructor() {

        private var eagerEotThreshold: JsonField<Double> = JsonMissing.of()
        private var enableEndpointDetection: JsonField<Boolean> = JsonMissing.of()
        private var endOfTurnConfidenceThreshold: JsonField<Double> = JsonMissing.of()
        private var eotThreshold: JsonField<Double> = JsonMissing.of()
        private var eotTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var interimResults: JsonField<Boolean> = JsonMissing.of()
        private var keyterm: JsonField<String> = JsonMissing.of()
        private var maxEndpointDelayMs: JsonField<Long> = JsonMissing.of()
        private var maxTurnSilence: JsonField<Long> = JsonMissing.of()
        private var minTurnSilence: JsonField<Long> = JsonMissing.of()
        private var numerals: JsonField<Boolean> = JsonMissing.of()
        private var smartFormat: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionSettingsConfig: TranscriptionSettingsConfig) = apply {
            eagerEotThreshold = transcriptionSettingsConfig.eagerEotThreshold
            enableEndpointDetection = transcriptionSettingsConfig.enableEndpointDetection
            endOfTurnConfidenceThreshold = transcriptionSettingsConfig.endOfTurnConfidenceThreshold
            eotThreshold = transcriptionSettingsConfig.eotThreshold
            eotTimeoutMs = transcriptionSettingsConfig.eotTimeoutMs
            interimResults = transcriptionSettingsConfig.interimResults
            keyterm = transcriptionSettingsConfig.keyterm
            maxEndpointDelayMs = transcriptionSettingsConfig.maxEndpointDelayMs
            maxTurnSilence = transcriptionSettingsConfig.maxTurnSilence
            minTurnSilence = transcriptionSettingsConfig.minTurnSilence
            numerals = transcriptionSettingsConfig.numerals
            smartFormat = transcriptionSettingsConfig.smartFormat
            additionalProperties = transcriptionSettingsConfig.additionalProperties.toMutableMap()
        }

        /**
         * Available only for deepgram/flux. Confidence threshold for eager end of turn detection.
         * Must be lower than or equal to eot_threshold. Setting this equal to eot_threshold
         * effectively disables eager end of turn.
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

        /**
         * Available only for soniox/stt-rt-v4. When true, Soniox emits end-of-utterance events at
         * the cadence configured by `max_endpoint_delay_ms`.
         */
        fun enableEndpointDetection(enableEndpointDetection: Boolean) =
            enableEndpointDetection(JsonField.of(enableEndpointDetection))

        /**
         * Sets [Builder.enableEndpointDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableEndpointDetection] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableEndpointDetection(enableEndpointDetection: JsonField<Boolean>) = apply {
            this.enableEndpointDetection = enableEndpointDetection
        }

        /**
         * Available only for assemblyai/universal-streaming. Confidence level required to trigger
         * an end of turn. Higher values require more certainty before ending a turn.
         */
        fun endOfTurnConfidenceThreshold(endOfTurnConfidenceThreshold: Double) =
            endOfTurnConfidenceThreshold(JsonField.of(endOfTurnConfidenceThreshold))

        /**
         * Sets [Builder.endOfTurnConfidenceThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endOfTurnConfidenceThreshold] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun endOfTurnConfidenceThreshold(endOfTurnConfidenceThreshold: JsonField<Double>) = apply {
            this.endOfTurnConfidenceThreshold = endOfTurnConfidenceThreshold
        }

        /**
         * Available only for deepgram/flux. Confidence required to trigger an end of turn. Higher
         * values = more reliable turn detection but slightly increased latency.
         */
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

        /**
         * Available only for deepgram/flux. Maximum milliseconds of silence before forcing an end
         * of turn, regardless of confidence.
         */
        fun eotTimeoutMs(eotTimeoutMs: Long) = eotTimeoutMs(JsonField.of(eotTimeoutMs))

        /**
         * Sets [Builder.eotTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eotTimeoutMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eotTimeoutMs(eotTimeoutMs: JsonField<Long>) = apply { this.eotTimeoutMs = eotTimeoutMs }

        /**
         * Available only for soniox/stt-rt-v4. When true, Soniox streams interim (non-final)
         * results in addition to finalized transcripts.
         */
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

        /**
         * Available only for deepgram/nova-3 and deepgram/flux. A comma-separated list of key terms
         * to boost for recognition during transcription. Helps improve accuracy for domain-specific
         * terminology, proper nouns, or uncommon words. This field may be templated with
         * [dynamic variables](https://developers.telnyx.com/docs/inference/ai-assistants/dynamic-variables)
         * using mustache syntax (e.g. `Telnyx,{{customer_name}},VoIP`). Variables are resolved at
         * call time before the value is sent to the speech-to-text engine.
         */
        fun keyterm(keyterm: String) = keyterm(JsonField.of(keyterm))

        /**
         * Sets [Builder.keyterm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyterm] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyterm(keyterm: JsonField<String>) = apply { this.keyterm = keyterm }

        /**
         * Available only for soniox/stt-rt-v4. Maximum silence (in milliseconds) before Soniox
         * emits an end-of-utterance event. Only honored when `enable_endpoint_detection` is true.
         */
        fun maxEndpointDelayMs(maxEndpointDelayMs: Long) =
            maxEndpointDelayMs(JsonField.of(maxEndpointDelayMs))

        /**
         * Sets [Builder.maxEndpointDelayMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxEndpointDelayMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxEndpointDelayMs(maxEndpointDelayMs: JsonField<Long>) = apply {
            this.maxEndpointDelayMs = maxEndpointDelayMs
        }

        /**
         * Available only for assemblyai/universal-streaming. Maximum duration of silence in
         * milliseconds before forcing an end of turn.
         */
        fun maxTurnSilence(maxTurnSilence: Long) = maxTurnSilence(JsonField.of(maxTurnSilence))

        /**
         * Sets [Builder.maxTurnSilence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTurnSilence] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxTurnSilence(maxTurnSilence: JsonField<Long>) = apply {
            this.maxTurnSilence = maxTurnSilence
        }

        /**
         * Available only for assemblyai/universal-streaming. Minimum duration of silence in
         * milliseconds before a turn can end. Must be less than or equal to max_turn_silence.
         */
        fun minTurnSilence(minTurnSilence: Long) = minTurnSilence(JsonField.of(minTurnSilence))

        /**
         * Sets [Builder.minTurnSilence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minTurnSilence] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minTurnSilence(minTurnSilence: JsonField<Long>) = apply {
            this.minTurnSilence = minTurnSilence
        }

        fun numerals(numerals: Boolean) = numerals(JsonField.of(numerals))

        /**
         * Sets [Builder.numerals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numerals] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numerals(numerals: JsonField<Boolean>) = apply { this.numerals = numerals }

        fun smartFormat(smartFormat: Boolean) = smartFormat(JsonField.of(smartFormat))

        /**
         * Sets [Builder.smartFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smartFormat] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun smartFormat(smartFormat: JsonField<Boolean>) = apply { this.smartFormat = smartFormat }

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
         * Returns an immutable instance of [TranscriptionSettingsConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionSettingsConfig =
            TranscriptionSettingsConfig(
                eagerEotThreshold,
                enableEndpointDetection,
                endOfTurnConfidenceThreshold,
                eotThreshold,
                eotTimeoutMs,
                interimResults,
                keyterm,
                maxEndpointDelayMs,
                maxTurnSilence,
                minTurnSilence,
                numerals,
                smartFormat,
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
    fun validate(): TranscriptionSettingsConfig = apply {
        if (validated) {
            return@apply
        }

        eagerEotThreshold()
        enableEndpointDetection()
        endOfTurnConfidenceThreshold()
        eotThreshold()
        eotTimeoutMs()
        interimResults()
        keyterm()
        maxEndpointDelayMs()
        maxTurnSilence()
        minTurnSilence()
        numerals()
        smartFormat()
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
            (if (enableEndpointDetection.asKnown().isPresent) 1 else 0) +
            (if (endOfTurnConfidenceThreshold.asKnown().isPresent) 1 else 0) +
            (if (eotThreshold.asKnown().isPresent) 1 else 0) +
            (if (eotTimeoutMs.asKnown().isPresent) 1 else 0) +
            (if (interimResults.asKnown().isPresent) 1 else 0) +
            (if (keyterm.asKnown().isPresent) 1 else 0) +
            (if (maxEndpointDelayMs.asKnown().isPresent) 1 else 0) +
            (if (maxTurnSilence.asKnown().isPresent) 1 else 0) +
            (if (minTurnSilence.asKnown().isPresent) 1 else 0) +
            (if (numerals.asKnown().isPresent) 1 else 0) +
            (if (smartFormat.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionSettingsConfig &&
            eagerEotThreshold == other.eagerEotThreshold &&
            enableEndpointDetection == other.enableEndpointDetection &&
            endOfTurnConfidenceThreshold == other.endOfTurnConfidenceThreshold &&
            eotThreshold == other.eotThreshold &&
            eotTimeoutMs == other.eotTimeoutMs &&
            interimResults == other.interimResults &&
            keyterm == other.keyterm &&
            maxEndpointDelayMs == other.maxEndpointDelayMs &&
            maxTurnSilence == other.maxTurnSilence &&
            minTurnSilence == other.minTurnSilence &&
            numerals == other.numerals &&
            smartFormat == other.smartFormat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eagerEotThreshold,
            enableEndpointDetection,
            endOfTurnConfidenceThreshold,
            eotThreshold,
            eotTimeoutMs,
            interimResults,
            keyterm,
            maxEndpointDelayMs,
            maxTurnSilence,
            minTurnSilence,
            numerals,
            smartFormat,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionSettingsConfig{eagerEotThreshold=$eagerEotThreshold, enableEndpointDetection=$enableEndpointDetection, endOfTurnConfidenceThreshold=$endOfTurnConfidenceThreshold, eotThreshold=$eotThreshold, eotTimeoutMs=$eotTimeoutMs, interimResults=$interimResults, keyterm=$keyterm, maxEndpointDelayMs=$maxEndpointDelayMs, maxTurnSilence=$maxTurnSilence, minTurnSilence=$minTurnSilence, numerals=$numerals, smartFormat=$smartFormat, additionalProperties=$additionalProperties}"
}
