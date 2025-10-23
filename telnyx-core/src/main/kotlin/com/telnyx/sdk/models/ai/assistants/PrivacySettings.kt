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

class PrivacySettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataRetention: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_retention")
        @ExcludeMissing
        dataRetention: JsonField<Boolean> = JsonMissing.of()
    ) : this(dataRetention, mutableMapOf())

    /**
     * If true, conversation history and insights will be stored. If false, they will not be stored.
     * This in‑tool toggle governs solely the retention of conversation history and insights via the
     * AI assistant. It has no effect on any separate recording, transcription, or storage
     * configuration that you have set at the account, number, or application level. All such
     * external settings remain in force regardless of your selection here.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataRetention(): Optional<Boolean> = dataRetention.getOptional("data_retention")

    /**
     * Returns the raw JSON value of [dataRetention].
     *
     * Unlike [dataRetention], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_retention")
    @ExcludeMissing
    fun _dataRetention(): JsonField<Boolean> = dataRetention

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

        /** Returns a mutable builder for constructing an instance of [PrivacySettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrivacySettings]. */
    class Builder internal constructor() {

        private var dataRetention: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(privacySettings: PrivacySettings) = apply {
            dataRetention = privacySettings.dataRetention
            additionalProperties = privacySettings.additionalProperties.toMutableMap()
        }

        /**
         * If true, conversation history and insights will be stored. If false, they will not be
         * stored. This in‑tool toggle governs solely the retention of conversation history and
         * insights via the AI assistant. It has no effect on any separate recording, transcription,
         * or storage configuration that you have set at the account, number, or application level.
         * All such external settings remain in force regardless of your selection here.
         */
        fun dataRetention(dataRetention: Boolean) = dataRetention(JsonField.of(dataRetention))

        /**
         * Sets [Builder.dataRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRetention] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataRetention(dataRetention: JsonField<Boolean>) = apply {
            this.dataRetention = dataRetention
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
         * Returns an immutable instance of [PrivacySettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PrivacySettings =
            PrivacySettings(dataRetention, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PrivacySettings = apply {
        if (validated) {
            return@apply
        }

        dataRetention()
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
    @JvmSynthetic internal fun validity(): Int = (if (dataRetention.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivacySettings &&
            dataRetention == other.dataRetention &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(dataRetention, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrivacySettings{dataRetention=$dataRetention, additionalProperties=$additionalProperties}"
}
