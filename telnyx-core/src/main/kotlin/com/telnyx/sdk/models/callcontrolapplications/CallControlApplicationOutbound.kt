// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

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

class CallControlApplicationOutbound
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channelLimit: JsonField<Long>,
    private val outboundVoiceProfileId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel_limit")
        @ExcludeMissing
        channelLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("outbound_voice_profile_id")
        @ExcludeMissing
        outboundVoiceProfileId: JsonField<String> = JsonMissing.of(),
    ) : this(channelLimit, outboundVoiceProfileId, mutableMapOf())

    /**
     * When set, this will limit the total number of outbound calls to phone numbers associated with
     * this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

    /**
     * Identifies the associated outbound voice profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundVoiceProfileId(): Optional<String> =
        outboundVoiceProfileId.getOptional("outbound_voice_profile_id")

    /**
     * Returns the raw JSON value of [channelLimit].
     *
     * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_limit")
    @ExcludeMissing
    fun _channelLimit(): JsonField<Long> = channelLimit

    /**
     * Returns the raw JSON value of [outboundVoiceProfileId].
     *
     * Unlike [outboundVoiceProfileId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("outbound_voice_profile_id")
    @ExcludeMissing
    fun _outboundVoiceProfileId(): JsonField<String> = outboundVoiceProfileId

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
         * [CallControlApplicationOutbound].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallControlApplicationOutbound]. */
    class Builder internal constructor() {

        private var channelLimit: JsonField<Long> = JsonMissing.of()
        private var outboundVoiceProfileId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callControlApplicationOutbound: CallControlApplicationOutbound) = apply {
            channelLimit = callControlApplicationOutbound.channelLimit
            outboundVoiceProfileId = callControlApplicationOutbound.outboundVoiceProfileId
            additionalProperties =
                callControlApplicationOutbound.additionalProperties.toMutableMap()
        }

        /**
         * When set, this will limit the total number of outbound calls to phone numbers associated
         * with this connection.
         */
        fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

        /**
         * Sets [Builder.channelLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelLimit(channelLimit: JsonField<Long>) = apply { this.channelLimit = channelLimit }

        /** Identifies the associated outbound voice profile. */
        fun outboundVoiceProfileId(outboundVoiceProfileId: String) =
            outboundVoiceProfileId(JsonField.of(outboundVoiceProfileId))

        /**
         * Sets [Builder.outboundVoiceProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundVoiceProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outboundVoiceProfileId(outboundVoiceProfileId: JsonField<String>) = apply {
            this.outboundVoiceProfileId = outboundVoiceProfileId
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
         * Returns an immutable instance of [CallControlApplicationOutbound].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallControlApplicationOutbound =
            CallControlApplicationOutbound(
                channelLimit,
                outboundVoiceProfileId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallControlApplicationOutbound = apply {
        if (validated) {
            return@apply
        }

        channelLimit()
        outboundVoiceProfileId()
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
        (if (channelLimit.asKnown().isPresent) 1 else 0) +
            (if (outboundVoiceProfileId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallControlApplicationOutbound &&
            channelLimit == other.channelLimit &&
            outboundVoiceProfileId == other.outboundVoiceProfileId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(channelLimit, outboundVoiceProfileId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallControlApplicationOutbound{channelLimit=$channelLimit, outboundVoiceProfileId=$outboundVoiceProfileId, additionalProperties=$additionalProperties}"
}
