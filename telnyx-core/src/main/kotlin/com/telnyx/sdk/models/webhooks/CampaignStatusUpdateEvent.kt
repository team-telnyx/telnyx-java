// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

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

class CampaignStatusUpdateEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val campaignId: JsonField<String>,
    private val createDate: JsonField<String>,
    private val cspId: JsonField<String>,
    private val isTMobileRegistered: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("campaignId")
        @ExcludeMissing
        campaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createDate")
        @ExcludeMissing
        createDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cspId") @ExcludeMissing cspId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isTMobileRegistered")
        @ExcludeMissing
        isTMobileRegistered: JsonField<Boolean> = JsonMissing.of(),
    ) : this(brandId, campaignId, createDate, cspId, isTMobileRegistered, mutableMapOf())

    /**
     * Brand ID associated with the campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = brandId.getOptional("brandId")

    /**
     * The ID of the campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun campaignId(): Optional<String> = campaignId.getOptional("campaignId")

    /**
     * Unix timestamp when campaign was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createDate(): Optional<String> = createDate.getOptional("createDate")

    /**
     * Alphanumeric identifier of the CSP associated with this campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cspId(): Optional<String> = cspId.getOptional("cspId")

    /**
     * Indicates whether the campaign is registered with T-Mobile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTMobileRegistered(): Optional<Boolean> =
        isTMobileRegistered.getOptional("isTMobileRegistered")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [campaignId].
     *
     * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignId") @ExcludeMissing fun _campaignId(): JsonField<String> = campaignId

    /**
     * Returns the raw JSON value of [createDate].
     *
     * Unlike [createDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createDate") @ExcludeMissing fun _createDate(): JsonField<String> = createDate

    /**
     * Returns the raw JSON value of [cspId].
     *
     * Unlike [cspId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cspId") @ExcludeMissing fun _cspId(): JsonField<String> = cspId

    /**
     * Returns the raw JSON value of [isTMobileRegistered].
     *
     * Unlike [isTMobileRegistered], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isTMobileRegistered")
    @ExcludeMissing
    fun _isTMobileRegistered(): JsonField<Boolean> = isTMobileRegistered

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
         * Returns a mutable builder for constructing an instance of [CampaignStatusUpdateEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignStatusUpdateEvent]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String> = JsonMissing.of()
        private var campaignId: JsonField<String> = JsonMissing.of()
        private var createDate: JsonField<String> = JsonMissing.of()
        private var cspId: JsonField<String> = JsonMissing.of()
        private var isTMobileRegistered: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignStatusUpdateEvent: CampaignStatusUpdateEvent) = apply {
            brandId = campaignStatusUpdateEvent.brandId
            campaignId = campaignStatusUpdateEvent.campaignId
            createDate = campaignStatusUpdateEvent.createDate
            cspId = campaignStatusUpdateEvent.cspId
            isTMobileRegistered = campaignStatusUpdateEvent.isTMobileRegistered
            additionalProperties = campaignStatusUpdateEvent.additionalProperties.toMutableMap()
        }

        /** Brand ID associated with the campaign. */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /** The ID of the campaign. */
        fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

        /**
         * Sets [Builder.campaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

        /** Unix timestamp when campaign was created. */
        fun createDate(createDate: String) = createDate(JsonField.of(createDate))

        /**
         * Sets [Builder.createDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createDate(createDate: JsonField<String>) = apply { this.createDate = createDate }

        /** Alphanumeric identifier of the CSP associated with this campaign. */
        fun cspId(cspId: String) = cspId(JsonField.of(cspId))

        /**
         * Sets [Builder.cspId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cspId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cspId(cspId: JsonField<String>) = apply { this.cspId = cspId }

        /** Indicates whether the campaign is registered with T-Mobile. */
        fun isTMobileRegistered(isTMobileRegistered: Boolean) =
            isTMobileRegistered(JsonField.of(isTMobileRegistered))

        /**
         * Sets [Builder.isTMobileRegistered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTMobileRegistered] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isTMobileRegistered(isTMobileRegistered: JsonField<Boolean>) = apply {
            this.isTMobileRegistered = isTMobileRegistered
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
         * Returns an immutable instance of [CampaignStatusUpdateEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignStatusUpdateEvent =
            CampaignStatusUpdateEvent(
                brandId,
                campaignId,
                createDate,
                cspId,
                isTMobileRegistered,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CampaignStatusUpdateEvent = apply {
        if (validated) {
            return@apply
        }

        brandId()
        campaignId()
        createDate()
        cspId()
        isTMobileRegistered()
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
        (if (brandId.asKnown().isPresent) 1 else 0) +
            (if (campaignId.asKnown().isPresent) 1 else 0) +
            (if (createDate.asKnown().isPresent) 1 else 0) +
            (if (cspId.asKnown().isPresent) 1 else 0) +
            (if (isTMobileRegistered.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignStatusUpdateEvent &&
            brandId == other.brandId &&
            campaignId == other.campaignId &&
            createDate == other.createDate &&
            cspId == other.cspId &&
            isTMobileRegistered == other.isTMobileRegistered &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            campaignId,
            createDate,
            cspId,
            isTMobileRegistered,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignStatusUpdateEvent{brandId=$brandId, campaignId=$campaignId, createDate=$createDate, cspId=$cspId, isTMobileRegistered=$isTMobileRegistered, additionalProperties=$additionalProperties}"
}
