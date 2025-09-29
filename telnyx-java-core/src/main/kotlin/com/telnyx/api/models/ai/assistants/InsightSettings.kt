// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

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

class InsightSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val insightGroupId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("insight_group_id")
        @ExcludeMissing
        insightGroupId: JsonField<String> = JsonMissing.of()
    ) : this(insightGroupId, mutableMapOf())

    /**
     * Reference to an Insight Group. Insights in this group will be run automatically for all the
     * assistant's conversations.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insightGroupId(): Optional<String> = insightGroupId.getOptional("insight_group_id")

    /**
     * Returns the raw JSON value of [insightGroupId].
     *
     * Unlike [insightGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insight_group_id")
    @ExcludeMissing
    fun _insightGroupId(): JsonField<String> = insightGroupId

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

        /** Returns a mutable builder for constructing an instance of [InsightSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightSettings]. */
    class Builder internal constructor() {

        private var insightGroupId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insightSettings: InsightSettings) = apply {
            insightGroupId = insightSettings.insightGroupId
            additionalProperties = insightSettings.additionalProperties.toMutableMap()
        }

        /**
         * Reference to an Insight Group. Insights in this group will be run automatically for all
         * the assistant's conversations.
         */
        fun insightGroupId(insightGroupId: String) = insightGroupId(JsonField.of(insightGroupId))

        /**
         * Sets [Builder.insightGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insightGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insightGroupId(insightGroupId: JsonField<String>) = apply {
            this.insightGroupId = insightGroupId
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
         * Returns an immutable instance of [InsightSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InsightSettings =
            InsightSettings(insightGroupId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): InsightSettings = apply {
        if (validated) {
            return@apply
        }

        insightGroupId()
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
    @JvmSynthetic internal fun validity(): Int = (if (insightGroupId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightSettings &&
            insightGroupId == other.insightGroupId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(insightGroupId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightSettings{insightGroupId=$insightGroupId, additionalProperties=$additionalProperties}"
}
