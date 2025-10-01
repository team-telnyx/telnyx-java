// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbercampaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumberCampaign
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val campaignId: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val assignmentStatus: JsonField<AssignmentStatus>,
    private val brandId: JsonField<String>,
    private val failureReasons: JsonField<String>,
    private val tcrBrandId: JsonField<String>,
    private val tcrCampaignId: JsonField<String>,
    private val telnyxCampaignId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("campaignId")
        @ExcludeMissing
        campaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assignmentStatus")
        @ExcludeMissing
        assignmentStatus: JsonField<AssignmentStatus> = JsonMissing.of(),
        @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failureReasons")
        @ExcludeMissing
        failureReasons: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tcrBrandId")
        @ExcludeMissing
        tcrBrandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tcrCampaignId")
        @ExcludeMissing
        tcrCampaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("telnyxCampaignId")
        @ExcludeMissing
        telnyxCampaignId: JsonField<String> = JsonMissing.of(),
    ) : this(
        campaignId,
        createdAt,
        phoneNumber,
        updatedAt,
        assignmentStatus,
        brandId,
        failureReasons,
        tcrBrandId,
        tcrCampaignId,
        telnyxCampaignId,
        mutableMapOf(),
    )

    /**
     * For shared campaigns, this is the TCR campaign ID, otherwise it is the campaign ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaignId(): String = campaignId.getRequired("campaignId")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("createdAt")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): String = updatedAt.getRequired("updatedAt")

    /**
     * The assignment status of the number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignmentStatus(): Optional<AssignmentStatus> =
        assignmentStatus.getOptional("assignmentStatus")

    /**
     * Brand ID. Empty if the number is associated to a shared campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = brandId.getOptional("brandId")

    /**
     * Extra info about a failure to assign/unassign a number. Relevant only if the assignmentStatus
     * is either FAILED_ASSIGNMENT or FAILED_UNASSIGNMENT
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReasons(): Optional<String> = failureReasons.getOptional("failureReasons")

    /**
     * TCR's alphanumeric ID for the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrBrandId(): Optional<String> = tcrBrandId.getOptional("tcrBrandId")

    /**
     * TCR's alphanumeric ID for the campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrCampaignId(): Optional<String> = tcrCampaignId.getOptional("tcrCampaignId")

    /**
     * Campaign ID. Empty if the number is associated to a shared campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telnyxCampaignId(): Optional<String> = telnyxCampaignId.getOptional("telnyxCampaignId")

    /**
     * Returns the raw JSON value of [campaignId].
     *
     * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignId") @ExcludeMissing fun _campaignId(): JsonField<String> = campaignId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [assignmentStatus].
     *
     * Unlike [assignmentStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("assignmentStatus")
    @ExcludeMissing
    fun _assignmentStatus(): JsonField<AssignmentStatus> = assignmentStatus

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [failureReasons].
     *
     * Unlike [failureReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReasons")
    @ExcludeMissing
    fun _failureReasons(): JsonField<String> = failureReasons

    /**
     * Returns the raw JSON value of [tcrBrandId].
     *
     * Unlike [tcrBrandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcrBrandId") @ExcludeMissing fun _tcrBrandId(): JsonField<String> = tcrBrandId

    /**
     * Returns the raw JSON value of [tcrCampaignId].
     *
     * Unlike [tcrCampaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcrCampaignId")
    @ExcludeMissing
    fun _tcrCampaignId(): JsonField<String> = tcrCampaignId

    /**
     * Returns the raw JSON value of [telnyxCampaignId].
     *
     * Unlike [telnyxCampaignId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("telnyxCampaignId")
    @ExcludeMissing
    fun _telnyxCampaignId(): JsonField<String> = telnyxCampaignId

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
         * Returns a mutable builder for constructing an instance of [PhoneNumberCampaign].
         *
         * The following fields are required:
         * ```java
         * .campaignId()
         * .createdAt()
         * .phoneNumber()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberCampaign]. */
    class Builder internal constructor() {

        private var campaignId: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var phoneNumber: JsonField<String>? = null
        private var updatedAt: JsonField<String>? = null
        private var assignmentStatus: JsonField<AssignmentStatus> = JsonMissing.of()
        private var brandId: JsonField<String> = JsonMissing.of()
        private var failureReasons: JsonField<String> = JsonMissing.of()
        private var tcrBrandId: JsonField<String> = JsonMissing.of()
        private var tcrCampaignId: JsonField<String> = JsonMissing.of()
        private var telnyxCampaignId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberCampaign: PhoneNumberCampaign) = apply {
            campaignId = phoneNumberCampaign.campaignId
            createdAt = phoneNumberCampaign.createdAt
            phoneNumber = phoneNumberCampaign.phoneNumber
            updatedAt = phoneNumberCampaign.updatedAt
            assignmentStatus = phoneNumberCampaign.assignmentStatus
            brandId = phoneNumberCampaign.brandId
            failureReasons = phoneNumberCampaign.failureReasons
            tcrBrandId = phoneNumberCampaign.tcrBrandId
            tcrCampaignId = phoneNumberCampaign.tcrCampaignId
            telnyxCampaignId = phoneNumberCampaign.telnyxCampaignId
            additionalProperties = phoneNumberCampaign.additionalProperties.toMutableMap()
        }

        /** For shared campaigns, this is the TCR campaign ID, otherwise it is the campaign ID */
        fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

        /**
         * Sets [Builder.campaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** The assignment status of the number. */
        fun assignmentStatus(assignmentStatus: AssignmentStatus) =
            assignmentStatus(JsonField.of(assignmentStatus))

        /**
         * Sets [Builder.assignmentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignmentStatus] with a well-typed [AssignmentStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun assignmentStatus(assignmentStatus: JsonField<AssignmentStatus>) = apply {
            this.assignmentStatus = assignmentStatus
        }

        /** Brand ID. Empty if the number is associated to a shared campaign. */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /**
         * Extra info about a failure to assign/unassign a number. Relevant only if the
         * assignmentStatus is either FAILED_ASSIGNMENT or FAILED_UNASSIGNMENT
         */
        fun failureReasons(failureReasons: String) = failureReasons(JsonField.of(failureReasons))

        /**
         * Sets [Builder.failureReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReasons] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failureReasons(failureReasons: JsonField<String>) = apply {
            this.failureReasons = failureReasons
        }

        /** TCR's alphanumeric ID for the brand. */
        fun tcrBrandId(tcrBrandId: String) = tcrBrandId(JsonField.of(tcrBrandId))

        /**
         * Sets [Builder.tcrBrandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcrBrandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tcrBrandId(tcrBrandId: JsonField<String>) = apply { this.tcrBrandId = tcrBrandId }

        /** TCR's alphanumeric ID for the campaign. */
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

        /** Campaign ID. Empty if the number is associated to a shared campaign. */
        fun telnyxCampaignId(telnyxCampaignId: String) =
            telnyxCampaignId(JsonField.of(telnyxCampaignId))

        /**
         * Sets [Builder.telnyxCampaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxCampaignId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telnyxCampaignId(telnyxCampaignId: JsonField<String>) = apply {
            this.telnyxCampaignId = telnyxCampaignId
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
         * Returns an immutable instance of [PhoneNumberCampaign].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaignId()
         * .createdAt()
         * .phoneNumber()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberCampaign =
            PhoneNumberCampaign(
                checkRequired("campaignId", campaignId),
                checkRequired("createdAt", createdAt),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("updatedAt", updatedAt),
                assignmentStatus,
                brandId,
                failureReasons,
                tcrBrandId,
                tcrCampaignId,
                telnyxCampaignId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberCampaign = apply {
        if (validated) {
            return@apply
        }

        campaignId()
        createdAt()
        phoneNumber()
        updatedAt()
        assignmentStatus().ifPresent { it.validate() }
        brandId()
        failureReasons()
        tcrBrandId()
        tcrCampaignId()
        telnyxCampaignId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (assignmentStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (brandId.asKnown().isPresent) 1 else 0) +
            (if (failureReasons.asKnown().isPresent) 1 else 0) +
            (if (tcrBrandId.asKnown().isPresent) 1 else 0) +
            (if (tcrCampaignId.asKnown().isPresent) 1 else 0) +
            (if (telnyxCampaignId.asKnown().isPresent) 1 else 0)

    /** The assignment status of the number. */
    class AssignmentStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FAILED_ASSIGNMENT = of("FAILED_ASSIGNMENT")

            @JvmField val PENDING_ASSIGNMENT = of("PENDING_ASSIGNMENT")

            @JvmField val ASSIGNED = of("ASSIGNED")

            @JvmField val PENDING_UNASSIGNMENT = of("PENDING_UNASSIGNMENT")

            @JvmField val FAILED_UNASSIGNMENT = of("FAILED_UNASSIGNMENT")

            @JvmStatic fun of(value: String) = AssignmentStatus(JsonField.of(value))
        }

        /** An enum containing [AssignmentStatus]'s known values. */
        enum class Known {
            FAILED_ASSIGNMENT,
            PENDING_ASSIGNMENT,
            ASSIGNED,
            PENDING_UNASSIGNMENT,
            FAILED_UNASSIGNMENT,
        }

        /**
         * An enum containing [AssignmentStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AssignmentStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAILED_ASSIGNMENT,
            PENDING_ASSIGNMENT,
            ASSIGNED,
            PENDING_UNASSIGNMENT,
            FAILED_UNASSIGNMENT,
            /**
             * An enum member indicating that [AssignmentStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FAILED_ASSIGNMENT -> Value.FAILED_ASSIGNMENT
                PENDING_ASSIGNMENT -> Value.PENDING_ASSIGNMENT
                ASSIGNED -> Value.ASSIGNED
                PENDING_UNASSIGNMENT -> Value.PENDING_UNASSIGNMENT
                FAILED_UNASSIGNMENT -> Value.FAILED_UNASSIGNMENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FAILED_ASSIGNMENT -> Known.FAILED_ASSIGNMENT
                PENDING_ASSIGNMENT -> Known.PENDING_ASSIGNMENT
                ASSIGNED -> Known.ASSIGNED
                PENDING_UNASSIGNMENT -> Known.PENDING_UNASSIGNMENT
                FAILED_UNASSIGNMENT -> Known.FAILED_UNASSIGNMENT
                else -> throw TelnyxInvalidDataException("Unknown AssignmentStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): AssignmentStatus = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AssignmentStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberCampaign &&
            campaignId == other.campaignId &&
            createdAt == other.createdAt &&
            phoneNumber == other.phoneNumber &&
            updatedAt == other.updatedAt &&
            assignmentStatus == other.assignmentStatus &&
            brandId == other.brandId &&
            failureReasons == other.failureReasons &&
            tcrBrandId == other.tcrBrandId &&
            tcrCampaignId == other.tcrCampaignId &&
            telnyxCampaignId == other.telnyxCampaignId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            campaignId,
            createdAt,
            phoneNumber,
            updatedAt,
            assignmentStatus,
            brandId,
            failureReasons,
            tcrBrandId,
            tcrCampaignId,
            telnyxCampaignId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberCampaign{campaignId=$campaignId, createdAt=$createdAt, phoneNumber=$phoneNumber, updatedAt=$updatedAt, assignmentStatus=$assignmentStatus, brandId=$brandId, failureReasons=$failureReasons, tcrBrandId=$tcrBrandId, tcrCampaignId=$tcrCampaignId, telnyxCampaignId=$telnyxCampaignId, additionalProperties=$additionalProperties}"
}
