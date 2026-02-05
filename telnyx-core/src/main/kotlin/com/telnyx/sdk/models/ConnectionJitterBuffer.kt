// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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
 * Configuration options for Jitter Buffer. Enables Jitter Buffer for RTP streams of SIP Trunking
 * calls. The feature is off unless enabled. You may define min and max values in msec for
 * customized buffering behaviors. Larger values add latency but tolerate more jitter, while smaller
 * values reduce latency but are more sensitive to jitter and reordering.
 */
class ConnectionJitterBuffer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enableJitterBuffer: JsonField<Boolean>,
    private val jitterbufferMsecMax: JsonField<Long>,
    private val jitterbufferMsecMin: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enable_jitter_buffer")
        @ExcludeMissing
        enableJitterBuffer: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("jitterbuffer_msec_max")
        @ExcludeMissing
        jitterbufferMsecMax: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("jitterbuffer_msec_min")
        @ExcludeMissing
        jitterbufferMsecMin: JsonField<Long> = JsonMissing.of(),
    ) : this(enableJitterBuffer, jitterbufferMsecMax, jitterbufferMsecMin, mutableMapOf())

    /**
     * Enables Jitter Buffer for RTP streams of SIP Trunking calls. The feature is off unless
     * enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableJitterBuffer(): Optional<Boolean> =
        enableJitterBuffer.getOptional("enable_jitter_buffer")

    /**
     * The maximum jitter buffer size in milliseconds. Must be between 40 and 400. Has no effect if
     * enable_jitter_buffer is not true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitterbufferMsecMax(): Optional<Long> =
        jitterbufferMsecMax.getOptional("jitterbuffer_msec_max")

    /**
     * The minimum jitter buffer size in milliseconds. Must be between 40 and 400. Has no effect if
     * enable_jitter_buffer is not true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitterbufferMsecMin(): Optional<Long> =
        jitterbufferMsecMin.getOptional("jitterbuffer_msec_min")

    /**
     * Returns the raw JSON value of [enableJitterBuffer].
     *
     * Unlike [enableJitterBuffer], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enable_jitter_buffer")
    @ExcludeMissing
    fun _enableJitterBuffer(): JsonField<Boolean> = enableJitterBuffer

    /**
     * Returns the raw JSON value of [jitterbufferMsecMax].
     *
     * Unlike [jitterbufferMsecMax], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("jitterbuffer_msec_max")
    @ExcludeMissing
    fun _jitterbufferMsecMax(): JsonField<Long> = jitterbufferMsecMax

    /**
     * Returns the raw JSON value of [jitterbufferMsecMin].
     *
     * Unlike [jitterbufferMsecMin], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("jitterbuffer_msec_min")
    @ExcludeMissing
    fun _jitterbufferMsecMin(): JsonField<Long> = jitterbufferMsecMin

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

        /** Returns a mutable builder for constructing an instance of [ConnectionJitterBuffer]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionJitterBuffer]. */
    class Builder internal constructor() {

        private var enableJitterBuffer: JsonField<Boolean> = JsonMissing.of()
        private var jitterbufferMsecMax: JsonField<Long> = JsonMissing.of()
        private var jitterbufferMsecMin: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionJitterBuffer: ConnectionJitterBuffer) = apply {
            enableJitterBuffer = connectionJitterBuffer.enableJitterBuffer
            jitterbufferMsecMax = connectionJitterBuffer.jitterbufferMsecMax
            jitterbufferMsecMin = connectionJitterBuffer.jitterbufferMsecMin
            additionalProperties = connectionJitterBuffer.additionalProperties.toMutableMap()
        }

        /**
         * Enables Jitter Buffer for RTP streams of SIP Trunking calls. The feature is off unless
         * enabled.
         */
        fun enableJitterBuffer(enableJitterBuffer: Boolean) =
            enableJitterBuffer(JsonField.of(enableJitterBuffer))

        /**
         * Sets [Builder.enableJitterBuffer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableJitterBuffer] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableJitterBuffer(enableJitterBuffer: JsonField<Boolean>) = apply {
            this.enableJitterBuffer = enableJitterBuffer
        }

        /**
         * The maximum jitter buffer size in milliseconds. Must be between 40 and 400. Has no effect
         * if enable_jitter_buffer is not true.
         */
        fun jitterbufferMsecMax(jitterbufferMsecMax: Long) =
            jitterbufferMsecMax(JsonField.of(jitterbufferMsecMax))

        /**
         * Sets [Builder.jitterbufferMsecMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitterbufferMsecMax] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jitterbufferMsecMax(jitterbufferMsecMax: JsonField<Long>) = apply {
            this.jitterbufferMsecMax = jitterbufferMsecMax
        }

        /**
         * The minimum jitter buffer size in milliseconds. Must be between 40 and 400. Has no effect
         * if enable_jitter_buffer is not true.
         */
        fun jitterbufferMsecMin(jitterbufferMsecMin: Long) =
            jitterbufferMsecMin(JsonField.of(jitterbufferMsecMin))

        /**
         * Sets [Builder.jitterbufferMsecMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitterbufferMsecMin] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jitterbufferMsecMin(jitterbufferMsecMin: JsonField<Long>) = apply {
            this.jitterbufferMsecMin = jitterbufferMsecMin
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
         * Returns an immutable instance of [ConnectionJitterBuffer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectionJitterBuffer =
            ConnectionJitterBuffer(
                enableJitterBuffer,
                jitterbufferMsecMax,
                jitterbufferMsecMin,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectionJitterBuffer = apply {
        if (validated) {
            return@apply
        }

        enableJitterBuffer()
        jitterbufferMsecMax()
        jitterbufferMsecMin()
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
        (if (enableJitterBuffer.asKnown().isPresent) 1 else 0) +
            (if (jitterbufferMsecMax.asKnown().isPresent) 1 else 0) +
            (if (jitterbufferMsecMin.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionJitterBuffer &&
            enableJitterBuffer == other.enableJitterBuffer &&
            jitterbufferMsecMax == other.jitterbufferMsecMax &&
            jitterbufferMsecMin == other.jitterbufferMsecMin &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enableJitterBuffer,
            jitterbufferMsecMax,
            jitterbufferMsecMin,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionJitterBuffer{enableJitterBuffer=$enableJitterBuffer, jitterbufferMsecMax=$jitterbufferMsecMax, jitterbufferMsecMin=$jitterbufferMsecMin, additionalProperties=$additionalProperties}"
}
