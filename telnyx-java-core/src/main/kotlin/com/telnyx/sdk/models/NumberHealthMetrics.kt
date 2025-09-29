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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

/** High level health metrics about the number and it's messaging sending patterns. */
class NumberHealthMetrics
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inboundOutboundRatio: JsonField<Float>,
    private val messageCount: JsonField<Long>,
    private val spamRatio: JsonField<Float>,
    private val successRatio: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inbound_outbound_ratio")
        @ExcludeMissing
        inboundOutboundRatio: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("message_count")
        @ExcludeMissing
        messageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spam_ratio") @ExcludeMissing spamRatio: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("success_ratio")
        @ExcludeMissing
        successRatio: JsonField<Float> = JsonMissing.of(),
    ) : this(inboundOutboundRatio, messageCount, spamRatio, successRatio, mutableMapOf())

    /**
     * The ratio of messages received to the number of messages sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inboundOutboundRatio(): Float = inboundOutboundRatio.getRequired("inbound_outbound_ratio")

    /**
     * The number of messages analyzed for the health metrics.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageCount(): Long = messageCount.getRequired("message_count")

    /**
     * The ratio of messages blocked for spam to the number of messages attempted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spamRatio(): Float = spamRatio.getRequired("spam_ratio")

    /**
     * The ratio of messages sucessfully delivered to the number of messages attempted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun successRatio(): Float = successRatio.getRequired("success_ratio")

    /**
     * Returns the raw JSON value of [inboundOutboundRatio].
     *
     * Unlike [inboundOutboundRatio], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inbound_outbound_ratio")
    @ExcludeMissing
    fun _inboundOutboundRatio(): JsonField<Float> = inboundOutboundRatio

    /**
     * Returns the raw JSON value of [messageCount].
     *
     * Unlike [messageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_count")
    @ExcludeMissing
    fun _messageCount(): JsonField<Long> = messageCount

    /**
     * Returns the raw JSON value of [spamRatio].
     *
     * Unlike [spamRatio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spam_ratio") @ExcludeMissing fun _spamRatio(): JsonField<Float> = spamRatio

    /**
     * Returns the raw JSON value of [successRatio].
     *
     * Unlike [successRatio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success_ratio")
    @ExcludeMissing
    fun _successRatio(): JsonField<Float> = successRatio

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
         * Returns a mutable builder for constructing an instance of [NumberHealthMetrics].
         *
         * The following fields are required:
         * ```java
         * .inboundOutboundRatio()
         * .messageCount()
         * .spamRatio()
         * .successRatio()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberHealthMetrics]. */
    class Builder internal constructor() {

        private var inboundOutboundRatio: JsonField<Float>? = null
        private var messageCount: JsonField<Long>? = null
        private var spamRatio: JsonField<Float>? = null
        private var successRatio: JsonField<Float>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberHealthMetrics: NumberHealthMetrics) = apply {
            inboundOutboundRatio = numberHealthMetrics.inboundOutboundRatio
            messageCount = numberHealthMetrics.messageCount
            spamRatio = numberHealthMetrics.spamRatio
            successRatio = numberHealthMetrics.successRatio
            additionalProperties = numberHealthMetrics.additionalProperties.toMutableMap()
        }

        /** The ratio of messages received to the number of messages sent. */
        fun inboundOutboundRatio(inboundOutboundRatio: Float) =
            inboundOutboundRatio(JsonField.of(inboundOutboundRatio))

        /**
         * Sets [Builder.inboundOutboundRatio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundOutboundRatio] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundOutboundRatio(inboundOutboundRatio: JsonField<Float>) = apply {
            this.inboundOutboundRatio = inboundOutboundRatio
        }

        /** The number of messages analyzed for the health metrics. */
        fun messageCount(messageCount: Long) = messageCount(JsonField.of(messageCount))

        /**
         * Sets [Builder.messageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageCount(messageCount: JsonField<Long>) = apply { this.messageCount = messageCount }

        /** The ratio of messages blocked for spam to the number of messages attempted. */
        fun spamRatio(spamRatio: Float) = spamRatio(JsonField.of(spamRatio))

        /**
         * Sets [Builder.spamRatio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spamRatio] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spamRatio(spamRatio: JsonField<Float>) = apply { this.spamRatio = spamRatio }

        /** The ratio of messages sucessfully delivered to the number of messages attempted. */
        fun successRatio(successRatio: Float) = successRatio(JsonField.of(successRatio))

        /**
         * Sets [Builder.successRatio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.successRatio] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun successRatio(successRatio: JsonField<Float>) = apply {
            this.successRatio = successRatio
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
         * Returns an immutable instance of [NumberHealthMetrics].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboundOutboundRatio()
         * .messageCount()
         * .spamRatio()
         * .successRatio()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NumberHealthMetrics =
            NumberHealthMetrics(
                checkRequired("inboundOutboundRatio", inboundOutboundRatio),
                checkRequired("messageCount", messageCount),
                checkRequired("spamRatio", spamRatio),
                checkRequired("successRatio", successRatio),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumberHealthMetrics = apply {
        if (validated) {
            return@apply
        }

        inboundOutboundRatio()
        messageCount()
        spamRatio()
        successRatio()
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
        (if (inboundOutboundRatio.asKnown().isPresent) 1 else 0) +
            (if (messageCount.asKnown().isPresent) 1 else 0) +
            (if (spamRatio.asKnown().isPresent) 1 else 0) +
            (if (successRatio.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberHealthMetrics &&
            inboundOutboundRatio == other.inboundOutboundRatio &&
            messageCount == other.messageCount &&
            spamRatio == other.spamRatio &&
            successRatio == other.successRatio &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            inboundOutboundRatio,
            messageCount,
            spamRatio,
            successRatio,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberHealthMetrics{inboundOutboundRatio=$inboundOutboundRatio, messageCount=$messageCount, spamRatio=$spamRatio, successRatio=$successRatio, additionalProperties=$additionalProperties}"
}
