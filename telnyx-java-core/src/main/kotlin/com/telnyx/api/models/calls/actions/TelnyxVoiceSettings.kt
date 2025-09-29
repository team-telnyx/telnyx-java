// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class TelnyxVoiceSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val voiceSpeed: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("voice_speed") @ExcludeMissing voiceSpeed: JsonField<Float> = JsonMissing.of()
    ) : this(voiceSpeed, mutableMapOf())

    /**
     * The voice speed to be used for the voice. The voice speed must be between 0.1 and 2.0.
     * Default value is 1.0.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSpeed(): Optional<Float> = voiceSpeed.getOptional("voice_speed")

    /**
     * Returns the raw JSON value of [voiceSpeed].
     *
     * Unlike [voiceSpeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_speed") @ExcludeMissing fun _voiceSpeed(): JsonField<Float> = voiceSpeed

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

        /** Returns a mutable builder for constructing an instance of [TelnyxVoiceSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelnyxVoiceSettings]. */
    class Builder internal constructor() {

        private var voiceSpeed: JsonField<Float> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telnyxVoiceSettings: TelnyxVoiceSettings) = apply {
            voiceSpeed = telnyxVoiceSettings.voiceSpeed
            additionalProperties = telnyxVoiceSettings.additionalProperties.toMutableMap()
        }

        /**
         * The voice speed to be used for the voice. The voice speed must be between 0.1 and 2.0.
         * Default value is 1.0.
         */
        fun voiceSpeed(voiceSpeed: Float) = voiceSpeed(JsonField.of(voiceSpeed))

        /**
         * Sets [Builder.voiceSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSpeed] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceSpeed(voiceSpeed: JsonField<Float>) = apply { this.voiceSpeed = voiceSpeed }

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
         * Returns an immutable instance of [TelnyxVoiceSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TelnyxVoiceSettings =
            TelnyxVoiceSettings(voiceSpeed, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TelnyxVoiceSettings = apply {
        if (validated) {
            return@apply
        }

        voiceSpeed()
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
    @JvmSynthetic internal fun validity(): Int = (if (voiceSpeed.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelnyxVoiceSettings &&
            voiceSpeed == other.voiceSpeed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(voiceSpeed, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelnyxVoiceSettings{voiceSpeed=$voiceSpeed, additionalProperties=$additionalProperties}"
}
