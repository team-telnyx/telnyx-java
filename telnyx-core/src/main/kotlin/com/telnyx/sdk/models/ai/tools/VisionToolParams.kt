// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

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

class VisionToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val maxFrameAgeSecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("max_frame_age_secs")
        @ExcludeMissing
        maxFrameAgeSecs: JsonField<Long> = JsonMissing.of()
    ) : this(maxFrameAgeSecs, mutableMapOf())

    /**
     * Frames received longer ago than this many seconds are not shown to the assistant, so it never
     * describes a frozen or disconnected camera as live.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxFrameAgeSecs(): Optional<Long> = maxFrameAgeSecs.getOptional("max_frame_age_secs")

    /**
     * Returns the raw JSON value of [maxFrameAgeSecs].
     *
     * Unlike [maxFrameAgeSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_frame_age_secs")
    @ExcludeMissing
    fun _maxFrameAgeSecs(): JsonField<Long> = maxFrameAgeSecs

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

        /** Returns a mutable builder for constructing an instance of [VisionToolParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VisionToolParams]. */
    class Builder internal constructor() {

        private var maxFrameAgeSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(visionToolParams: VisionToolParams) = apply {
            maxFrameAgeSecs = visionToolParams.maxFrameAgeSecs
            additionalProperties = visionToolParams.additionalProperties.toMutableMap()
        }

        /**
         * Frames received longer ago than this many seconds are not shown to the assistant, so it
         * never describes a frozen or disconnected camera as live.
         */
        fun maxFrameAgeSecs(maxFrameAgeSecs: Long) = maxFrameAgeSecs(JsonField.of(maxFrameAgeSecs))

        /**
         * Sets [Builder.maxFrameAgeSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFrameAgeSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxFrameAgeSecs(maxFrameAgeSecs: JsonField<Long>) = apply {
            this.maxFrameAgeSecs = maxFrameAgeSecs
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
         * Returns an immutable instance of [VisionToolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VisionToolParams =
            VisionToolParams(maxFrameAgeSecs, additionalProperties.toMutableMap())
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
    fun validate(): VisionToolParams = apply {
        if (validated) {
            return@apply
        }

        maxFrameAgeSecs()
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
    @JvmSynthetic internal fun validity(): Int = (if (maxFrameAgeSecs.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VisionToolParams &&
            maxFrameAgeSecs == other.maxFrameAgeSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(maxFrameAgeSecs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VisionToolParams{maxFrameAgeSecs=$maxFrameAgeSecs, additionalProperties=$additionalProperties}"
}
