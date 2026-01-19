// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CampaignStatusUpdateWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val campaignId: JsonField<String>,
    private val createDate: JsonField<String>,
    private val cspId: JsonField<String>,
    private val description: JsonField<String>,
    private val isTMobileRegistered: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
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
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isTMobileRegistered")
        @ExcludeMissing
        isTMobileRegistered: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        brandId,
        campaignId,
        createDate,
        cspId,
        description,
        isTMobileRegistered,
        status,
        type,
        mutableMapOf(),
    )

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
     * Description of the event.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Indicates whether the campaign is registered with T-Mobile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTMobileRegistered(): Optional<Boolean> =
        isTMobileRegistered.getOptional("isTMobileRegistered")

    /**
     * The status of the campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [isTMobileRegistered].
     *
     * Unlike [isTMobileRegistered], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isTMobileRegistered")
    @ExcludeMissing
    fun _isTMobileRegistered(): JsonField<Boolean> = isTMobileRegistered

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [CampaignStatusUpdateWebhookEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignStatusUpdateWebhookEvent]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String> = JsonMissing.of()
        private var campaignId: JsonField<String> = JsonMissing.of()
        private var createDate: JsonField<String> = JsonMissing.of()
        private var cspId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var isTMobileRegistered: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignStatusUpdateWebhookEvent: CampaignStatusUpdateWebhookEvent) =
            apply {
                brandId = campaignStatusUpdateWebhookEvent.brandId
                campaignId = campaignStatusUpdateWebhookEvent.campaignId
                createDate = campaignStatusUpdateWebhookEvent.createDate
                cspId = campaignStatusUpdateWebhookEvent.cspId
                description = campaignStatusUpdateWebhookEvent.description
                isTMobileRegistered = campaignStatusUpdateWebhookEvent.isTMobileRegistered
                status = campaignStatusUpdateWebhookEvent.status
                type = campaignStatusUpdateWebhookEvent.type
                additionalProperties =
                    campaignStatusUpdateWebhookEvent.additionalProperties.toMutableMap()
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

        /** Description of the event. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /** The status of the campaign. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [CampaignStatusUpdateWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent(
                brandId,
                campaignId,
                createDate,
                cspId,
                description,
                isTMobileRegistered,
                status,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CampaignStatusUpdateWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        brandId()
        campaignId()
        createDate()
        cspId()
        description()
        isTMobileRegistered()
        status().ifPresent { it.validate() }
        type().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (isTMobileRegistered.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The status of the campaign. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmField val DORMANT = of("DORMANT")

            @JvmField val SUCCESS = of("success")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACCEPTED,
            REJECTED,
            DORMANT,
            SUCCESS,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCEPTED,
            REJECTED,
            DORMANT,
            SUCCESS,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                DORMANT -> Value.DORMANT
                SUCCESS -> Value.SUCCESS
                FAILED -> Value.FAILED
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
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                DORMANT -> Known.DORMANT
                SUCCESS -> Known.SUCCESS
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TELNYX_EVENT = of("TELNYX_EVENT")

            @JvmField val REGISTRATION = of("REGISTRATION")

            @JvmField val MNO_REVIEW = of("MNO_REVIEW")

            @JvmField val TELNYX_REVIEW = of("TELNYX_REVIEW")

            @JvmField val NUMBER_POOL_PROVISIONED = of("NUMBER_POOL_PROVISIONED")

            @JvmField val NUMBER_POOL_DEPROVISIONED = of("NUMBER_POOL_DEPROVISIONED")

            @JvmField val TCR_EVENT = of("TCR_EVENT")

            @JvmField val VERIFIED = of("VERIFIED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TELNYX_EVENT,
            REGISTRATION,
            MNO_REVIEW,
            TELNYX_REVIEW,
            NUMBER_POOL_PROVISIONED,
            NUMBER_POOL_DEPROVISIONED,
            TCR_EVENT,
            VERIFIED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX_EVENT,
            REGISTRATION,
            MNO_REVIEW,
            TELNYX_REVIEW,
            NUMBER_POOL_PROVISIONED,
            NUMBER_POOL_DEPROVISIONED,
            TCR_EVENT,
            VERIFIED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                TELNYX_EVENT -> Value.TELNYX_EVENT
                REGISTRATION -> Value.REGISTRATION
                MNO_REVIEW -> Value.MNO_REVIEW
                TELNYX_REVIEW -> Value.TELNYX_REVIEW
                NUMBER_POOL_PROVISIONED -> Value.NUMBER_POOL_PROVISIONED
                NUMBER_POOL_DEPROVISIONED -> Value.NUMBER_POOL_DEPROVISIONED
                TCR_EVENT -> Value.TCR_EVENT
                VERIFIED -> Value.VERIFIED
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
                TELNYX_EVENT -> Known.TELNYX_EVENT
                REGISTRATION -> Known.REGISTRATION
                MNO_REVIEW -> Known.MNO_REVIEW
                TELNYX_REVIEW -> Known.TELNYX_REVIEW
                NUMBER_POOL_PROVISIONED -> Known.NUMBER_POOL_PROVISIONED
                NUMBER_POOL_DEPROVISIONED -> Known.NUMBER_POOL_DEPROVISIONED
                TCR_EVENT -> Known.TCR_EVENT
                VERIFIED -> Known.VERIFIED
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignStatusUpdateWebhookEvent &&
            brandId == other.brandId &&
            campaignId == other.campaignId &&
            createDate == other.createDate &&
            cspId == other.cspId &&
            description == other.description &&
            isTMobileRegistered == other.isTMobileRegistered &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            campaignId,
            createDate,
            cspId,
            description,
            isTMobileRegistered,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignStatusUpdateWebhookEvent{brandId=$brandId, campaignId=$campaignId, createDate=$createDate, cspId=$cspId, description=$description, isTMobileRegistered=$isTMobileRegistered, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
