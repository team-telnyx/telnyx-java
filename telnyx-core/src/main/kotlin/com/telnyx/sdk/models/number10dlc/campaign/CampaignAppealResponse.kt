// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class CampaignAppealResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appealedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("appealed_at")
        @ExcludeMissing
        appealedAt: JsonField<OffsetDateTime> = JsonMissing.of()
    ) : this(appealedAt, mutableMapOf())

    /**
     * Timestamp when the appeal was submitted
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appealedAt(): Optional<OffsetDateTime> = appealedAt.getOptional("appealed_at")

    /**
     * Returns the raw JSON value of [appealedAt].
     *
     * Unlike [appealedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appealed_at")
    @ExcludeMissing
    fun _appealedAt(): JsonField<OffsetDateTime> = appealedAt

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

        /** Returns a mutable builder for constructing an instance of [CampaignAppealResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignAppealResponse]. */
    class Builder internal constructor() {

        private var appealedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignAppealResponse: CampaignAppealResponse) = apply {
            appealedAt = campaignAppealResponse.appealedAt
            additionalProperties = campaignAppealResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp when the appeal was submitted */
        fun appealedAt(appealedAt: OffsetDateTime) = appealedAt(JsonField.of(appealedAt))

        /**
         * Sets [Builder.appealedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appealedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appealedAt(appealedAt: JsonField<OffsetDateTime>) = apply {
            this.appealedAt = appealedAt
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
         * Returns an immutable instance of [CampaignAppealResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignAppealResponse =
            CampaignAppealResponse(appealedAt, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CampaignAppealResponse = apply {
        if (validated) {
            return@apply
        }

        appealedAt()
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
    @JvmSynthetic internal fun validity(): Int = (if (appealedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignAppealResponse &&
            appealedAt == other.appealedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(appealedAt, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignAppealResponse{appealedAt=$appealedAt, additionalProperties=$additionalProperties}"
}
