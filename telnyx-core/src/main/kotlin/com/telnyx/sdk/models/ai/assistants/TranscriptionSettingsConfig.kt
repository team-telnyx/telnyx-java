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
    private val eotThreshold: JsonField<Double>,
    private val eotTimeoutMs: JsonField<Long>,
    private val numerals: JsonField<Boolean>,
    private val smartFormat: JsonField<Boolean>,
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
        @JsonProperty("eot_timeout_ms")
        @ExcludeMissing
        eotTimeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numerals") @ExcludeMissing numerals: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("smart_format")
        @ExcludeMissing
        smartFormat: JsonField<Boolean> = JsonMissing.of(),
    ) : this(eagerEotThreshold, eotThreshold, eotTimeoutMs, numerals, smartFormat, mutableMapOf())

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
        private var eotThreshold: JsonField<Double> = JsonMissing.of()
        private var eotTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var numerals: JsonField<Boolean> = JsonMissing.of()
        private var smartFormat: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionSettingsConfig: TranscriptionSettingsConfig) = apply {
            eagerEotThreshold = transcriptionSettingsConfig.eagerEotThreshold
            eotThreshold = transcriptionSettingsConfig.eotThreshold
            eotTimeoutMs = transcriptionSettingsConfig.eotTimeoutMs
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
                eotThreshold,
                eotTimeoutMs,
                numerals,
                smartFormat,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionSettingsConfig = apply {
        if (validated) {
            return@apply
        }

        eagerEotThreshold()
        eotThreshold()
        eotTimeoutMs()
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
            (if (eotThreshold.asKnown().isPresent) 1 else 0) +
            (if (eotTimeoutMs.asKnown().isPresent) 1 else 0) +
            (if (numerals.asKnown().isPresent) 1 else 0) +
            (if (smartFormat.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionSettingsConfig &&
            eagerEotThreshold == other.eagerEotThreshold &&
            eotThreshold == other.eotThreshold &&
            eotTimeoutMs == other.eotTimeoutMs &&
            numerals == other.numerals &&
            smartFormat == other.smartFormat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eagerEotThreshold,
            eotThreshold,
            eotTimeoutMs,
            numerals,
            smartFormat,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionSettingsConfig{eagerEotThreshold=$eagerEotThreshold, eotThreshold=$eotThreshold, eotTimeoutMs=$eotTimeoutMs, numerals=$numerals, smartFormat=$smartFormat, additionalProperties=$additionalProperties}"
}
