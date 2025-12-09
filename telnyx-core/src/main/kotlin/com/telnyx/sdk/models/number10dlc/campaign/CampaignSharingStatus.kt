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
import java.util.Collections
import java.util.Objects
import java.util.Optional

class CampaignSharingStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val downstreamCnpId: JsonField<String>,
    private val sharedDate: JsonField<String>,
    private val sharingStatus: JsonField<String>,
    private val statusDate: JsonField<String>,
    private val upstreamCnpId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("downstreamCnpId")
        @ExcludeMissing
        downstreamCnpId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sharedDate")
        @ExcludeMissing
        sharedDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sharingStatus")
        @ExcludeMissing
        sharingStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statusDate")
        @ExcludeMissing
        statusDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upstreamCnpId")
        @ExcludeMissing
        upstreamCnpId: JsonField<String> = JsonMissing.of(),
    ) : this(downstreamCnpId, sharedDate, sharingStatus, statusDate, upstreamCnpId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downstreamCnpId(): Optional<String> = downstreamCnpId.getOptional("downstreamCnpId")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharedDate(): Optional<String> = sharedDate.getOptional("sharedDate")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharingStatus(): Optional<String> = sharingStatus.getOptional("sharingStatus")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusDate(): Optional<String> = statusDate.getOptional("statusDate")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upstreamCnpId(): Optional<String> = upstreamCnpId.getOptional("upstreamCnpId")

    /**
     * Returns the raw JSON value of [downstreamCnpId].
     *
     * Unlike [downstreamCnpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downstreamCnpId")
    @ExcludeMissing
    fun _downstreamCnpId(): JsonField<String> = downstreamCnpId

    /**
     * Returns the raw JSON value of [sharedDate].
     *
     * Unlike [sharedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sharedDate") @ExcludeMissing fun _sharedDate(): JsonField<String> = sharedDate

    /**
     * Returns the raw JSON value of [sharingStatus].
     *
     * Unlike [sharingStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sharingStatus")
    @ExcludeMissing
    fun _sharingStatus(): JsonField<String> = sharingStatus

    /**
     * Returns the raw JSON value of [statusDate].
     *
     * Unlike [statusDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusDate") @ExcludeMissing fun _statusDate(): JsonField<String> = statusDate

    /**
     * Returns the raw JSON value of [upstreamCnpId].
     *
     * Unlike [upstreamCnpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upstreamCnpId")
    @ExcludeMissing
    fun _upstreamCnpId(): JsonField<String> = upstreamCnpId

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

        /** Returns a mutable builder for constructing an instance of [CampaignSharingStatus]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignSharingStatus]. */
    class Builder internal constructor() {

        private var downstreamCnpId: JsonField<String> = JsonMissing.of()
        private var sharedDate: JsonField<String> = JsonMissing.of()
        private var sharingStatus: JsonField<String> = JsonMissing.of()
        private var statusDate: JsonField<String> = JsonMissing.of()
        private var upstreamCnpId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignSharingStatus: CampaignSharingStatus) = apply {
            downstreamCnpId = campaignSharingStatus.downstreamCnpId
            sharedDate = campaignSharingStatus.sharedDate
            sharingStatus = campaignSharingStatus.sharingStatus
            statusDate = campaignSharingStatus.statusDate
            upstreamCnpId = campaignSharingStatus.upstreamCnpId
            additionalProperties = campaignSharingStatus.additionalProperties.toMutableMap()
        }

        fun downstreamCnpId(downstreamCnpId: String) =
            downstreamCnpId(JsonField.of(downstreamCnpId))

        /**
         * Sets [Builder.downstreamCnpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downstreamCnpId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downstreamCnpId(downstreamCnpId: JsonField<String>) = apply {
            this.downstreamCnpId = downstreamCnpId
        }

        fun sharedDate(sharedDate: String) = sharedDate(JsonField.of(sharedDate))

        /**
         * Sets [Builder.sharedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharedDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sharedDate(sharedDate: JsonField<String>) = apply { this.sharedDate = sharedDate }

        fun sharingStatus(sharingStatus: String) = sharingStatus(JsonField.of(sharingStatus))

        /**
         * Sets [Builder.sharingStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharingStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sharingStatus(sharingStatus: JsonField<String>) = apply {
            this.sharingStatus = sharingStatus
        }

        fun statusDate(statusDate: String) = statusDate(JsonField.of(statusDate))

        /**
         * Sets [Builder.statusDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusDate(statusDate: JsonField<String>) = apply { this.statusDate = statusDate }

        fun upstreamCnpId(upstreamCnpId: String) = upstreamCnpId(JsonField.of(upstreamCnpId))

        /**
         * Sets [Builder.upstreamCnpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upstreamCnpId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upstreamCnpId(upstreamCnpId: JsonField<String>) = apply {
            this.upstreamCnpId = upstreamCnpId
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
         * Returns an immutable instance of [CampaignSharingStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignSharingStatus =
            CampaignSharingStatus(
                downstreamCnpId,
                sharedDate,
                sharingStatus,
                statusDate,
                upstreamCnpId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CampaignSharingStatus = apply {
        if (validated) {
            return@apply
        }

        downstreamCnpId()
        sharedDate()
        sharingStatus()
        statusDate()
        upstreamCnpId()
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
        (if (downstreamCnpId.asKnown().isPresent) 1 else 0) +
            (if (sharedDate.asKnown().isPresent) 1 else 0) +
            (if (sharingStatus.asKnown().isPresent) 1 else 0) +
            (if (statusDate.asKnown().isPresent) 1 else 0) +
            (if (upstreamCnpId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignSharingStatus &&
            downstreamCnpId == other.downstreamCnpId &&
            sharedDate == other.sharedDate &&
            sharingStatus == other.sharingStatus &&
            statusDate == other.statusDate &&
            upstreamCnpId == other.upstreamCnpId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            downstreamCnpId,
            sharedDate,
            sharingStatus,
            statusDate,
            upstreamCnpId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignSharingStatus{downstreamCnpId=$downstreamCnpId, sharedDate=$sharedDate, sharingStatus=$sharingStatus, statusDate=$statusDate, upstreamCnpId=$upstreamCnpId, additionalProperties=$additionalProperties}"
}
