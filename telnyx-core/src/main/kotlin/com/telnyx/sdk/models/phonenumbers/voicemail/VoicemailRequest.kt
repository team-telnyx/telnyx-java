// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

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

class VoicemailRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enabled: JsonField<Boolean>,
    private val pin: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
    ) : this(enabled, pin, mutableMapOf())

    /**
     * Whether voicemail is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * The pin used for voicemail
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pin(): Optional<String> = pin.getOptional("pin")

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

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

        /** Returns a mutable builder for constructing an instance of [VoicemailRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoicemailRequest]. */
    class Builder internal constructor() {

        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var pin: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voicemailRequest: VoicemailRequest) = apply {
            enabled = voicemailRequest.enabled
            pin = voicemailRequest.pin
            additionalProperties = voicemailRequest.additionalProperties.toMutableMap()
        }

        /** Whether voicemail is enabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The pin used for voicemail */
        fun pin(pin: String) = pin(JsonField.of(pin))

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pin(pin: JsonField<String>) = apply { this.pin = pin }

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
         * Returns an immutable instance of [VoicemailRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoicemailRequest =
            VoicemailRequest(enabled, pin, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): VoicemailRequest = apply {
        if (validated) {
            return@apply
        }

        enabled()
        pin()
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
        (if (enabled.asKnown().isPresent) 1 else 0) + (if (pin.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoicemailRequest &&
            enabled == other.enabled &&
            pin == other.pin &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(enabled, pin, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoicemailRequest{enabled=$enabled, pin=$pin, additionalProperties=$additionalProperties}"
}
