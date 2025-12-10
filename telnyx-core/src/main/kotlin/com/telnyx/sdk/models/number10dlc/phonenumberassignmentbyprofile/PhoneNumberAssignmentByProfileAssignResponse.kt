// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

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
import java.util.Optional

class PhoneNumberAssignmentByProfileAssignResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val messagingProfileId: JsonField<String>,
    private val taskId: JsonField<String>,
    private val campaignId: JsonField<String>,
    private val tcrCampaignId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("messagingProfileId")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taskId") @ExcludeMissing taskId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("campaignId")
        @ExcludeMissing
        campaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tcrCampaignId")
        @ExcludeMissing
        tcrCampaignId: JsonField<String> = JsonMissing.of(),
    ) : this(messagingProfileId, taskId, campaignId, tcrCampaignId, mutableMapOf())

    /**
     * The ID of the messaging profile that you want to link to the specified campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messagingProfileId(): String = messagingProfileId.getRequired("messagingProfileId")

    /**
     * The ID of the task associated with assigning a messaging profile to a campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskId(): String = taskId.getRequired("taskId")

    /**
     * The ID of the campaign you want to link to the specified messaging profile. If you supply
     * this ID in the request, do not also include a tcrCampaignId.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun campaignId(): Optional<String> = campaignId.getOptional("campaignId")

    /**
     * The TCR ID of the shared campaign you want to link to the specified messaging profile (for
     * campaigns not created using Telnyx 10DLC services only). If you supply this ID in the
     * request, do not also include a campaignId.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrCampaignId(): Optional<String> = tcrCampaignId.getOptional("tcrCampaignId")

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messagingProfileId")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [taskId].
     *
     * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskId") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

    /**
     * Returns the raw JSON value of [campaignId].
     *
     * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignId") @ExcludeMissing fun _campaignId(): JsonField<String> = campaignId

    /**
     * Returns the raw JSON value of [tcrCampaignId].
     *
     * Unlike [tcrCampaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcrCampaignId")
    @ExcludeMissing
    fun _tcrCampaignId(): JsonField<String> = tcrCampaignId

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
         * [PhoneNumberAssignmentByProfileAssignResponse].
         *
         * The following fields are required:
         * ```java
         * .messagingProfileId()
         * .taskId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberAssignmentByProfileAssignResponse]. */
    class Builder internal constructor() {

        private var messagingProfileId: JsonField<String>? = null
        private var taskId: JsonField<String>? = null
        private var campaignId: JsonField<String> = JsonMissing.of()
        private var tcrCampaignId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            phoneNumberAssignmentByProfileAssignResponse:
                PhoneNumberAssignmentByProfileAssignResponse
        ) = apply {
            messagingProfileId = phoneNumberAssignmentByProfileAssignResponse.messagingProfileId
            taskId = phoneNumberAssignmentByProfileAssignResponse.taskId
            campaignId = phoneNumberAssignmentByProfileAssignResponse.campaignId
            tcrCampaignId = phoneNumberAssignmentByProfileAssignResponse.tcrCampaignId
            additionalProperties =
                phoneNumberAssignmentByProfileAssignResponse.additionalProperties.toMutableMap()
        }

        /** The ID of the messaging profile that you want to link to the specified campaign. */
        fun messagingProfileId(messagingProfileId: String) =
            messagingProfileId(JsonField.of(messagingProfileId))

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            this.messagingProfileId = messagingProfileId
        }

        /** The ID of the task associated with assigning a messaging profile to a campaign. */
        fun taskId(taskId: String) = taskId(JsonField.of(taskId))

        /**
         * Sets [Builder.taskId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

        /**
         * The ID of the campaign you want to link to the specified messaging profile. If you supply
         * this ID in the request, do not also include a tcrCampaignId.
         */
        fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

        /**
         * Sets [Builder.campaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

        /**
         * The TCR ID of the shared campaign you want to link to the specified messaging profile
         * (for campaigns not created using Telnyx 10DLC services only). If you supply this ID in
         * the request, do not also include a campaignId.
         */
        fun tcrCampaignId(tcrCampaignId: String) = tcrCampaignId(JsonField.of(tcrCampaignId))

        /**
         * Sets [Builder.tcrCampaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcrCampaignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tcrCampaignId(tcrCampaignId: JsonField<String>) = apply {
            this.tcrCampaignId = tcrCampaignId
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
         * Returns an immutable instance of [PhoneNumberAssignmentByProfileAssignResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messagingProfileId()
         * .taskId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse(
                checkRequired("messagingProfileId", messagingProfileId),
                checkRequired("taskId", taskId),
                campaignId,
                tcrCampaignId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberAssignmentByProfileAssignResponse = apply {
        if (validated) {
            return@apply
        }

        messagingProfileId()
        taskId()
        campaignId()
        tcrCampaignId()
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
        (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (if (taskId.asKnown().isPresent) 1 else 0) +
            (if (campaignId.asKnown().isPresent) 1 else 0) +
            (if (tcrCampaignId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberAssignmentByProfileAssignResponse &&
            messagingProfileId == other.messagingProfileId &&
            taskId == other.taskId &&
            campaignId == other.campaignId &&
            tcrCampaignId == other.tcrCampaignId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(messagingProfileId, taskId, campaignId, tcrCampaignId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberAssignmentByProfileAssignResponse{messagingProfileId=$messagingProfileId, taskId=$taskId, campaignId=$campaignId, tcrCampaignId=$tcrCampaignId, additionalProperties=$additionalProperties}"
}
