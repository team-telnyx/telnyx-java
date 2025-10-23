// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

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
import kotlin.jvm.optionals.getOrNull

class CampaignGetSharingStatusResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sharedByMe: JsonField<CampaignSharingStatus>,
    private val sharedWithMe: JsonField<CampaignSharingStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sharedByMe")
        @ExcludeMissing
        sharedByMe: JsonField<CampaignSharingStatus> = JsonMissing.of(),
        @JsonProperty("sharedWithMe")
        @ExcludeMissing
        sharedWithMe: JsonField<CampaignSharingStatus> = JsonMissing.of(),
    ) : this(sharedByMe, sharedWithMe, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharedByMe(): Optional<CampaignSharingStatus> = sharedByMe.getOptional("sharedByMe")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharedWithMe(): Optional<CampaignSharingStatus> = sharedWithMe.getOptional("sharedWithMe")

    /**
     * Returns the raw JSON value of [sharedByMe].
     *
     * Unlike [sharedByMe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sharedByMe")
    @ExcludeMissing
    fun _sharedByMe(): JsonField<CampaignSharingStatus> = sharedByMe

    /**
     * Returns the raw JSON value of [sharedWithMe].
     *
     * Unlike [sharedWithMe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sharedWithMe")
    @ExcludeMissing
    fun _sharedWithMe(): JsonField<CampaignSharingStatus> = sharedWithMe

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
         * [CampaignGetSharingStatusResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignGetSharingStatusResponse]. */
    class Builder internal constructor() {

        private var sharedByMe: JsonField<CampaignSharingStatus> = JsonMissing.of()
        private var sharedWithMe: JsonField<CampaignSharingStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignGetSharingStatusResponse: CampaignGetSharingStatusResponse) =
            apply {
                sharedByMe = campaignGetSharingStatusResponse.sharedByMe
                sharedWithMe = campaignGetSharingStatusResponse.sharedWithMe
                additionalProperties =
                    campaignGetSharingStatusResponse.additionalProperties.toMutableMap()
            }

        fun sharedByMe(sharedByMe: CampaignSharingStatus) = sharedByMe(JsonField.of(sharedByMe))

        /**
         * Sets [Builder.sharedByMe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharedByMe] with a well-typed [CampaignSharingStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sharedByMe(sharedByMe: JsonField<CampaignSharingStatus>) = apply {
            this.sharedByMe = sharedByMe
        }

        fun sharedWithMe(sharedWithMe: CampaignSharingStatus) =
            sharedWithMe(JsonField.of(sharedWithMe))

        /**
         * Sets [Builder.sharedWithMe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharedWithMe] with a well-typed [CampaignSharingStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sharedWithMe(sharedWithMe: JsonField<CampaignSharingStatus>) = apply {
            this.sharedWithMe = sharedWithMe
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
         * Returns an immutable instance of [CampaignGetSharingStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignGetSharingStatusResponse =
            CampaignGetSharingStatusResponse(
                sharedByMe,
                sharedWithMe,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CampaignGetSharingStatusResponse = apply {
        if (validated) {
            return@apply
        }

        sharedByMe().ifPresent { it.validate() }
        sharedWithMe().ifPresent { it.validate() }
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
        (sharedByMe.asKnown().getOrNull()?.validity() ?: 0) +
            (sharedWithMe.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignGetSharingStatusResponse &&
            sharedByMe == other.sharedByMe &&
            sharedWithMe == other.sharedWithMe &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(sharedByMe, sharedWithMe, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignGetSharingStatusResponse{sharedByMe=$sharedByMe, sharedWithMe=$sharedWithMe, additionalProperties=$additionalProperties}"
}
