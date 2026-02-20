// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Status information for an SMS OTP sent during Sole Proprietor brand verification */
class BrandGetSmsOtpByReferenceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val deliveryStatus: JsonField<String>,
    private val mobilePhone: JsonField<String>,
    private val referenceId: JsonField<String>,
    private val requestDate: JsonField<OffsetDateTime>,
    private val deliveryStatusDate: JsonField<OffsetDateTime>,
    private val deliveryStatusDetails: JsonField<String>,
    private val verifyDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deliveryStatus")
        @ExcludeMissing
        deliveryStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mobilePhone")
        @ExcludeMissing
        mobilePhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceId")
        @ExcludeMissing
        referenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestDate")
        @ExcludeMissing
        requestDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deliveryStatusDate")
        @ExcludeMissing
        deliveryStatusDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deliveryStatusDetails")
        @ExcludeMissing
        deliveryStatusDetails: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verifyDate")
        @ExcludeMissing
        verifyDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        brandId,
        deliveryStatus,
        mobilePhone,
        referenceId,
        requestDate,
        deliveryStatusDate,
        deliveryStatusDetails,
        verifyDate,
        mutableMapOf(),
    )

    /**
     * The Brand ID associated with this OTP request
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brandId")

    /**
     * The current delivery status of the OTP SMS message. Common values include:
     * `DELIVERED_HANDSET`, `PENDING`, `FAILED`, `EXPIRED`
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveryStatus(): String = deliveryStatus.getRequired("deliveryStatus")

    /**
     * The mobile phone number where the OTP was sent, in E.164 format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mobilePhone(): String = mobilePhone.getRequired("mobilePhone")

    /**
     * The reference ID for this OTP request, used for status queries
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceId(): String = referenceId.getRequired("referenceId")

    /**
     * The timestamp when the OTP request was initiated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestDate(): OffsetDateTime = requestDate.getRequired("requestDate")

    /**
     * The timestamp when the delivery status was last updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryStatusDate(): Optional<OffsetDateTime> =
        deliveryStatusDate.getOptional("deliveryStatusDate")

    /**
     * Additional details about the delivery status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryStatusDetails(): Optional<String> =
        deliveryStatusDetails.getOptional("deliveryStatusDetails")

    /**
     * The timestamp when the OTP was successfully verified (if applicable)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verifyDate(): Optional<OffsetDateTime> = verifyDate.getOptional("verifyDate")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [deliveryStatus].
     *
     * Unlike [deliveryStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deliveryStatus")
    @ExcludeMissing
    fun _deliveryStatus(): JsonField<String> = deliveryStatus

    /**
     * Returns the raw JSON value of [mobilePhone].
     *
     * Unlike [mobilePhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mobilePhone") @ExcludeMissing fun _mobilePhone(): JsonField<String> = mobilePhone

    /**
     * Returns the raw JSON value of [referenceId].
     *
     * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceId") @ExcludeMissing fun _referenceId(): JsonField<String> = referenceId

    /**
     * Returns the raw JSON value of [requestDate].
     *
     * Unlike [requestDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestDate")
    @ExcludeMissing
    fun _requestDate(): JsonField<OffsetDateTime> = requestDate

    /**
     * Returns the raw JSON value of [deliveryStatusDate].
     *
     * Unlike [deliveryStatusDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deliveryStatusDate")
    @ExcludeMissing
    fun _deliveryStatusDate(): JsonField<OffsetDateTime> = deliveryStatusDate

    /**
     * Returns the raw JSON value of [deliveryStatusDetails].
     *
     * Unlike [deliveryStatusDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deliveryStatusDetails")
    @ExcludeMissing
    fun _deliveryStatusDetails(): JsonField<String> = deliveryStatusDetails

    /**
     * Returns the raw JSON value of [verifyDate].
     *
     * Unlike [verifyDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verifyDate")
    @ExcludeMissing
    fun _verifyDate(): JsonField<OffsetDateTime> = verifyDate

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
         * [BrandGetSmsOtpByReferenceResponse].
         *
         * The following fields are required:
         * ```java
         * .brandId()
         * .deliveryStatus()
         * .mobilePhone()
         * .referenceId()
         * .requestDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandGetSmsOtpByReferenceResponse]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String>? = null
        private var deliveryStatus: JsonField<String>? = null
        private var mobilePhone: JsonField<String>? = null
        private var referenceId: JsonField<String>? = null
        private var requestDate: JsonField<OffsetDateTime>? = null
        private var deliveryStatusDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deliveryStatusDetails: JsonField<String> = JsonMissing.of()
        private var verifyDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandGetSmsOtpByReferenceResponse: BrandGetSmsOtpByReferenceResponse) =
            apply {
                brandId = brandGetSmsOtpByReferenceResponse.brandId
                deliveryStatus = brandGetSmsOtpByReferenceResponse.deliveryStatus
                mobilePhone = brandGetSmsOtpByReferenceResponse.mobilePhone
                referenceId = brandGetSmsOtpByReferenceResponse.referenceId
                requestDate = brandGetSmsOtpByReferenceResponse.requestDate
                deliveryStatusDate = brandGetSmsOtpByReferenceResponse.deliveryStatusDate
                deliveryStatusDetails = brandGetSmsOtpByReferenceResponse.deliveryStatusDetails
                verifyDate = brandGetSmsOtpByReferenceResponse.verifyDate
                additionalProperties =
                    brandGetSmsOtpByReferenceResponse.additionalProperties.toMutableMap()
            }

        /** The Brand ID associated with this OTP request */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /**
         * The current delivery status of the OTP SMS message. Common values include:
         * `DELIVERED_HANDSET`, `PENDING`, `FAILED`, `EXPIRED`
         */
        fun deliveryStatus(deliveryStatus: String) = deliveryStatus(JsonField.of(deliveryStatus))

        /**
         * Sets [Builder.deliveryStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deliveryStatus(deliveryStatus: JsonField<String>) = apply {
            this.deliveryStatus = deliveryStatus
        }

        /** The mobile phone number where the OTP was sent, in E.164 format */
        fun mobilePhone(mobilePhone: String) = mobilePhone(JsonField.of(mobilePhone))

        /**
         * Sets [Builder.mobilePhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobilePhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mobilePhone(mobilePhone: JsonField<String>) = apply { this.mobilePhone = mobilePhone }

        /** The reference ID for this OTP request, used for status queries */
        fun referenceId(referenceId: String) = referenceId(JsonField.of(referenceId))

        /**
         * Sets [Builder.referenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

        /** The timestamp when the OTP request was initiated */
        fun requestDate(requestDate: OffsetDateTime) = requestDate(JsonField.of(requestDate))

        /**
         * Sets [Builder.requestDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestDate(requestDate: JsonField<OffsetDateTime>) = apply {
            this.requestDate = requestDate
        }

        /** The timestamp when the delivery status was last updated */
        fun deliveryStatusDate(deliveryStatusDate: OffsetDateTime) =
            deliveryStatusDate(JsonField.of(deliveryStatusDate))

        /**
         * Sets [Builder.deliveryStatusDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryStatusDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deliveryStatusDate(deliveryStatusDate: JsonField<OffsetDateTime>) = apply {
            this.deliveryStatusDate = deliveryStatusDate
        }

        /** Additional details about the delivery status */
        fun deliveryStatusDetails(deliveryStatusDetails: String) =
            deliveryStatusDetails(JsonField.of(deliveryStatusDetails))

        /**
         * Sets [Builder.deliveryStatusDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryStatusDetails] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deliveryStatusDetails(deliveryStatusDetails: JsonField<String>) = apply {
            this.deliveryStatusDetails = deliveryStatusDetails
        }

        /** The timestamp when the OTP was successfully verified (if applicable) */
        fun verifyDate(verifyDate: OffsetDateTime) = verifyDate(JsonField.of(verifyDate))

        /**
         * Sets [Builder.verifyDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifyDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verifyDate(verifyDate: JsonField<OffsetDateTime>) = apply {
            this.verifyDate = verifyDate
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
         * Returns an immutable instance of [BrandGetSmsOtpByReferenceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .brandId()
         * .deliveryStatus()
         * .mobilePhone()
         * .referenceId()
         * .requestDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandGetSmsOtpByReferenceResponse =
            BrandGetSmsOtpByReferenceResponse(
                checkRequired("brandId", brandId),
                checkRequired("deliveryStatus", deliveryStatus),
                checkRequired("mobilePhone", mobilePhone),
                checkRequired("referenceId", referenceId),
                checkRequired("requestDate", requestDate),
                deliveryStatusDate,
                deliveryStatusDetails,
                verifyDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandGetSmsOtpByReferenceResponse = apply {
        if (validated) {
            return@apply
        }

        brandId()
        deliveryStatus()
        mobilePhone()
        referenceId()
        requestDate()
        deliveryStatusDate()
        deliveryStatusDetails()
        verifyDate()
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
            (if (deliveryStatus.asKnown().isPresent) 1 else 0) +
            (if (mobilePhone.asKnown().isPresent) 1 else 0) +
            (if (referenceId.asKnown().isPresent) 1 else 0) +
            (if (requestDate.asKnown().isPresent) 1 else 0) +
            (if (deliveryStatusDate.asKnown().isPresent) 1 else 0) +
            (if (deliveryStatusDetails.asKnown().isPresent) 1 else 0) +
            (if (verifyDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandGetSmsOtpByReferenceResponse &&
            brandId == other.brandId &&
            deliveryStatus == other.deliveryStatus &&
            mobilePhone == other.mobilePhone &&
            referenceId == other.referenceId &&
            requestDate == other.requestDate &&
            deliveryStatusDate == other.deliveryStatusDate &&
            deliveryStatusDetails == other.deliveryStatusDetails &&
            verifyDate == other.verifyDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            deliveryStatus,
            mobilePhone,
            referenceId,
            requestDate,
            deliveryStatusDate,
            deliveryStatusDetails,
            verifyDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandGetSmsOtpByReferenceResponse{brandId=$brandId, deliveryStatus=$deliveryStatus, mobilePhone=$mobilePhone, referenceId=$referenceId, requestDate=$requestDate, deliveryStatusDate=$deliveryStatusDate, deliveryStatusDetails=$deliveryStatusDetails, verifyDate=$verifyDate, additionalProperties=$additionalProperties}"
}
