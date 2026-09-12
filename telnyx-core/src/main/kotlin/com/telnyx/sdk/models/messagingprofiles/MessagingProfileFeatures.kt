// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

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
 * Telnyx product features the messaging customer can enable on the messaging profile. Keys map to
 * individual feature flags; unknown keys are accepted and preserved for forward compatibility with
 * rolling deployments.
 */
class MessagingProfileFeatures
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aiOptOutDetectionEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ai_opt_out_detection_enabled")
        @ExcludeMissing
        aiOptOutDetectionEnabled: JsonField<Boolean> = JsonMissing.of()
    ) : this(aiOptOutDetectionEnabled, mutableMapOf())

    /**
     * Enables AI detection of inbound opt-out messages that do not follow the standard
     * STOP/UNSTOP/HELP opt-out keyword pattern. When enabled, the messaging platform applies an AI
     * model to identify non-standard opt-out requests (e.g. natural-language phrases) and treats
     * them as opt-outs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aiOptOutDetectionEnabled(): Optional<Boolean> =
        aiOptOutDetectionEnabled.getOptional("ai_opt_out_detection_enabled")

    /**
     * Returns the raw JSON value of [aiOptOutDetectionEnabled].
     *
     * Unlike [aiOptOutDetectionEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ai_opt_out_detection_enabled")
    @ExcludeMissing
    fun _aiOptOutDetectionEnabled(): JsonField<Boolean> = aiOptOutDetectionEnabled

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

        /** Returns a mutable builder for constructing an instance of [MessagingProfileFeatures]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingProfileFeatures]. */
    class Builder internal constructor() {

        private var aiOptOutDetectionEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingProfileFeatures: MessagingProfileFeatures) = apply {
            aiOptOutDetectionEnabled = messagingProfileFeatures.aiOptOutDetectionEnabled
            additionalProperties = messagingProfileFeatures.additionalProperties.toMutableMap()
        }

        /**
         * Enables AI detection of inbound opt-out messages that do not follow the standard
         * STOP/UNSTOP/HELP opt-out keyword pattern. When enabled, the messaging platform applies an
         * AI model to identify non-standard opt-out requests (e.g. natural-language phrases) and
         * treats them as opt-outs.
         */
        fun aiOptOutDetectionEnabled(aiOptOutDetectionEnabled: Boolean) =
            aiOptOutDetectionEnabled(JsonField.of(aiOptOutDetectionEnabled))

        /**
         * Sets [Builder.aiOptOutDetectionEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aiOptOutDetectionEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aiOptOutDetectionEnabled(aiOptOutDetectionEnabled: JsonField<Boolean>) = apply {
            this.aiOptOutDetectionEnabled = aiOptOutDetectionEnabled
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
         * Returns an immutable instance of [MessagingProfileFeatures].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingProfileFeatures =
            MessagingProfileFeatures(aiOptOutDetectionEnabled, additionalProperties.toMutableMap())
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
    fun validate(): MessagingProfileFeatures = apply {
        if (validated) {
            return@apply
        }

        aiOptOutDetectionEnabled()
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
    internal fun validity(): Int = (if (aiOptOutDetectionEnabled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfileFeatures &&
            aiOptOutDetectionEnabled == other.aiOptOutDetectionEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(aiOptOutDetectionEnabled, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingProfileFeatures{aiOptOutDetectionEnabled=$aiOptOutDetectionEnabled, additionalProperties=$additionalProperties}"
}
