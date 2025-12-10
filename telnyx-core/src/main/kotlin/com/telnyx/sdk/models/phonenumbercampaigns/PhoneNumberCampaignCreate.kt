// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbercampaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

class PhoneNumberCampaignCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val campaignId: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("campaignId")
        @ExcludeMissing
        campaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(campaignId, phoneNumber, mutableMapOf())

    /**
     * The ID of the campaign you want to link to the specified phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaignId(): String = campaignId.getRequired("campaignId")

    /**
     * The phone number you want to link to a specified campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

    /**
     * Returns the raw JSON value of [campaignId].
     *
     * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignId") @ExcludeMissing fun _campaignId(): JsonField<String> = campaignId

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * Returns a mutable builder for constructing an instance of [PhoneNumberCampaignCreate].
         *
         * The following fields are required:
         * ```java
         * .campaignId()
         * .phoneNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberCampaignCreate]. */
    class Builder internal constructor() {

        private var campaignId: JsonField<String>? = null
        private var phoneNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberCampaignCreate: PhoneNumberCampaignCreate) = apply {
            campaignId = phoneNumberCampaignCreate.campaignId
            phoneNumber = phoneNumberCampaignCreate.phoneNumber
            additionalProperties = phoneNumberCampaignCreate.additionalProperties.toMutableMap()
        }

        /** The ID of the campaign you want to link to the specified phone number. */
        fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

        /**
         * Sets [Builder.campaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

        /** The phone number you want to link to a specified campaign. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [PhoneNumberCampaignCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaignId()
         * .phoneNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberCampaignCreate =
            PhoneNumberCampaignCreate(
                checkRequired("campaignId", campaignId),
                checkRequired("phoneNumber", phoneNumber),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberCampaignCreate = apply {
        if (validated) {
            return@apply
        }

        campaignId()
        phoneNumber()
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
        (if (campaignId.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberCampaignCreate &&
            campaignId == other.campaignId &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(campaignId, phoneNumber, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberCampaignCreate{campaignId=$campaignId, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
