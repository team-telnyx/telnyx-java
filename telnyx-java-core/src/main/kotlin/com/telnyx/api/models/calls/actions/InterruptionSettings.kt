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

/** Settings for handling user interruptions during assistant speech */
class InterruptionSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enable: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enable") @ExcludeMissing enable: JsonField<Boolean> = JsonMissing.of()
    ) : this(enable, mutableMapOf())

    /**
     * When true, allows users to interrupt the assistant while speaking
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enable(): Optional<Boolean> = enable.getOptional("enable")

    /**
     * Returns the raw JSON value of [enable].
     *
     * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

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

        /** Returns a mutable builder for constructing an instance of [InterruptionSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InterruptionSettings]. */
    class Builder internal constructor() {

        private var enable: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interruptionSettings: InterruptionSettings) = apply {
            enable = interruptionSettings.enable
            additionalProperties = interruptionSettings.additionalProperties.toMutableMap()
        }

        /** When true, allows users to interrupt the assistant while speaking */
        fun enable(enable: Boolean) = enable(JsonField.of(enable))

        /**
         * Sets [Builder.enable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enable] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

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
         * Returns an immutable instance of [InterruptionSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InterruptionSettings =
            InterruptionSettings(enable, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): InterruptionSettings = apply {
        if (validated) {
            return@apply
        }

        enable()
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
    @JvmSynthetic internal fun validity(): Int = (if (enable.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InterruptionSettings &&
            enable == other.enable &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(enable, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InterruptionSettings{enable=$enable, additionalProperties=$additionalProperties}"
}
