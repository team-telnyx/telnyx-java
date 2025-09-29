// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumberSlimListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * Returns a mutable builder for constructing an instance of [PhoneNumberSlimListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberSlimListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberSlimListResponse: PhoneNumberSlimListResponse) = apply {
            data = phoneNumberSlimListResponse.data.map { it.toMutableList() }
            meta = phoneNumberSlimListResponse.meta
            additionalProperties = phoneNumberSlimListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [PhoneNumberSlimListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberSlimListResponse =
            PhoneNumberSlimListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberSlimListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val billingGroupId: JsonField<String>,
        private val callForwardingEnabled: JsonField<Boolean>,
        private val callRecordingEnabled: JsonField<Boolean>,
        private val callerIdNameEnabled: JsonField<Boolean>,
        private val cnamListingEnabled: JsonField<Boolean>,
        private val connectionId: JsonField<String>,
        private val countryIsoAlpha2: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val emergencyAddressId: JsonField<String>,
        private val emergencyEnabled: JsonField<Boolean>,
        private val emergencyStatus: JsonField<EmergencyStatus>,
        private val externalPin: JsonField<String>,
        private val inboundCallScreening: JsonField<InboundCallScreening>,
        private val phoneNumber: JsonField<String>,
        private val phoneNumberType: JsonField<PhoneNumberType>,
        private val purchasedAt: JsonField<String>,
        private val recordType: JsonField<String>,
        private val status: JsonField<Status>,
        private val t38FaxGatewayEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_forwarding_enabled")
            @ExcludeMissing
            callForwardingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("call_recording_enabled")
            @ExcludeMissing
            callRecordingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("caller_id_name_enabled")
            @ExcludeMissing
            callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cnam_listing_enabled")
            @ExcludeMissing
            cnamListingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_iso_alpha2")
            @ExcludeMissing
            countryIsoAlpha2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emergency_address_id")
            @ExcludeMissing
            emergencyAddressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emergency_enabled")
            @ExcludeMissing
            emergencyEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("emergency_status")
            @ExcludeMissing
            emergencyStatus: JsonField<EmergencyStatus> = JsonMissing.of(),
            @JsonProperty("external_pin")
            @ExcludeMissing
            externalPin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_call_screening")
            @ExcludeMissing
            inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
            @JsonProperty("purchased_at")
            @ExcludeMissing
            purchasedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("t38_fax_gateway_enabled")
            @ExcludeMissing
            t38FaxGatewayEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            billingGroupId,
            callForwardingEnabled,
            callRecordingEnabled,
            callerIdNameEnabled,
            cnamListingEnabled,
            connectionId,
            countryIsoAlpha2,
            createdAt,
            customerReference,
            emergencyAddressId,
            emergencyEnabled,
            emergencyStatus,
            externalPin,
            inboundCallScreening,
            phoneNumber,
            phoneNumberType,
            purchasedAt,
            recordType,
            status,
            t38FaxGatewayEnabled,
            mutableMapOf(),
        )

        /**
         * Identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Identifies the billing group associated with the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Indicates if call forwarding will be enabled for this number if forwards_to and
         * forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1
         * use of numbers endpoints.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callForwardingEnabled(): Optional<Boolean> =
            callForwardingEnabled.getOptional("call_forwarding_enabled")

        /**
         * Indicates whether call recording is enabled for this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callRecordingEnabled(): Optional<Boolean> =
            callRecordingEnabled.getOptional("call_recording_enabled")

        /**
         * Indicates whether caller ID is enabled for this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerIdNameEnabled(): Optional<Boolean> =
            callerIdNameEnabled.getOptional("caller_id_name_enabled")

        /**
         * Indicates whether a CNAM listing is enabled for this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cnamListingEnabled(): Optional<Boolean> =
            cnamListingEnabled.getOptional("cnam_listing_enabled")

        /**
         * Identifies the connection associated with the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * The ISO 3166-1 alpha-2 country code of the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryIsoAlpha2(): Optional<String> =
            countryIsoAlpha2.getOptional("country_iso_alpha2")

        /**
         * ISO 8601 formatted date indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * A customer reference string for customer look ups.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Identifies the emergency address associated with the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyAddressId(): Optional<String> =
            emergencyAddressId.getOptional("emergency_address_id")

        /**
         * Indicates whether emergency services are enabled for this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyEnabled(): Optional<Boolean> =
            emergencyEnabled.getOptional("emergency_enabled")

        /**
         * Indicates the status of the provisioning of emergency services for the phone number. This
         * field contains information about activity that may be ongoing for a number where it
         * either is being provisioned or deprovisioned but is not yet enabled/disabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyStatus(): Optional<EmergencyStatus> =
            emergencyStatus.getOptional("emergency_status")

        /**
         * If someone attempts to port your phone number away from Telnyx and your phone number has
         * an external PIN set, Telnyx will attempt to verify that you provided the correct external
         * PIN to the winning carrier. Note that not all carriers cooperate with this security
         * mechanism.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPin(): Optional<String> = externalPin.getOptional("external_pin")

        /**
         * The inbound_call_screening setting is a phone number configuration option variable that
         * allows users to configure their settings to block or flag fraudulent calls. It can be set
         * to disabled, reject_calls, or flag_calls. This feature has an additional per-number
         * monthly cost associated with it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCallScreening(): Optional<InboundCallScreening> =
            inboundCallScreening.getOptional("inbound_call_screening")

        /**
         * The +E.164-formatted phone number associated with this record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * The phone number's type. Note: For numbers purchased prior to July 2023 or when fetching
         * a number's details immediately after a purchase completes, the legacy values `tollfree`,
         * `shortcode` or `longcode` may be returned instead.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberType(): Optional<PhoneNumberType> =
            phoneNumberType.getOptional("phone_number_type")

        /**
         * ISO 8601 formatted date indicating when the resource was purchased.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun purchasedAt(): Optional<String> = purchasedAt.getOptional("purchased_at")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The phone number's current status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Indicates whether T38 Fax Gateway for inbound calls to this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun t38FaxGatewayEnabled(): Optional<Boolean> =
            t38FaxGatewayEnabled.getOptional("t38_fax_gateway_enabled")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [callForwardingEnabled].
         *
         * Unlike [callForwardingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("call_forwarding_enabled")
        @ExcludeMissing
        fun _callForwardingEnabled(): JsonField<Boolean> = callForwardingEnabled

        /**
         * Returns the raw JSON value of [callRecordingEnabled].
         *
         * Unlike [callRecordingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("call_recording_enabled")
        @ExcludeMissing
        fun _callRecordingEnabled(): JsonField<Boolean> = callRecordingEnabled

        /**
         * Returns the raw JSON value of [callerIdNameEnabled].
         *
         * Unlike [callerIdNameEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("caller_id_name_enabled")
        @ExcludeMissing
        fun _callerIdNameEnabled(): JsonField<Boolean> = callerIdNameEnabled

        /**
         * Returns the raw JSON value of [cnamListingEnabled].
         *
         * Unlike [cnamListingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cnam_listing_enabled")
        @ExcludeMissing
        fun _cnamListingEnabled(): JsonField<Boolean> = cnamListingEnabled

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [countryIsoAlpha2].
         *
         * Unlike [countryIsoAlpha2], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("country_iso_alpha2")
        @ExcludeMissing
        fun _countryIsoAlpha2(): JsonField<String> = countryIsoAlpha2

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

        /**
         * Returns the raw JSON value of [emergencyAddressId].
         *
         * Unlike [emergencyAddressId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("emergency_address_id")
        @ExcludeMissing
        fun _emergencyAddressId(): JsonField<String> = emergencyAddressId

        /**
         * Returns the raw JSON value of [emergencyEnabled].
         *
         * Unlike [emergencyEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emergency_enabled")
        @ExcludeMissing
        fun _emergencyEnabled(): JsonField<Boolean> = emergencyEnabled

        /**
         * Returns the raw JSON value of [emergencyStatus].
         *
         * Unlike [emergencyStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emergency_status")
        @ExcludeMissing
        fun _emergencyStatus(): JsonField<EmergencyStatus> = emergencyStatus

        /**
         * Returns the raw JSON value of [externalPin].
         *
         * Unlike [externalPin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_pin")
        @ExcludeMissing
        fun _externalPin(): JsonField<String> = externalPin

        /**
         * Returns the raw JSON value of [inboundCallScreening].
         *
         * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_call_screening")
        @ExcludeMissing
        fun _inboundCallScreening(): JsonField<InboundCallScreening> = inboundCallScreening

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [phoneNumberType].
         *
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

        /**
         * Returns the raw JSON value of [purchasedAt].
         *
         * Unlike [purchasedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("purchased_at")
        @ExcludeMissing
        fun _purchasedAt(): JsonField<String> = purchasedAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [t38FaxGatewayEnabled].
         *
         * Unlike [t38FaxGatewayEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("t38_fax_gateway_enabled")
        @ExcludeMissing
        fun _t38FaxGatewayEnabled(): JsonField<Boolean> = t38FaxGatewayEnabled

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var callForwardingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var callRecordingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of()
            private var cnamListingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var countryIsoAlpha2: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var emergencyAddressId: JsonField<String> = JsonMissing.of()
            private var emergencyEnabled: JsonField<Boolean> = JsonMissing.of()
            private var emergencyStatus: JsonField<EmergencyStatus> = JsonMissing.of()
            private var externalPin: JsonField<String> = JsonMissing.of()
            private var inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
            private var purchasedAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var t38FaxGatewayEnabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                billingGroupId = data.billingGroupId
                callForwardingEnabled = data.callForwardingEnabled
                callRecordingEnabled = data.callRecordingEnabled
                callerIdNameEnabled = data.callerIdNameEnabled
                cnamListingEnabled = data.cnamListingEnabled
                connectionId = data.connectionId
                countryIsoAlpha2 = data.countryIsoAlpha2
                createdAt = data.createdAt
                customerReference = data.customerReference
                emergencyAddressId = data.emergencyAddressId
                emergencyEnabled = data.emergencyEnabled
                emergencyStatus = data.emergencyStatus
                externalPin = data.externalPin
                inboundCallScreening = data.inboundCallScreening
                phoneNumber = data.phoneNumber
                phoneNumberType = data.phoneNumberType
                purchasedAt = data.purchasedAt
                recordType = data.recordType
                status = data.status
                t38FaxGatewayEnabled = data.t38FaxGatewayEnabled
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Identifies the billing group associated with the phone number. */
            fun billingGroupId(billingGroupId: String) =
                billingGroupId(JsonField.of(billingGroupId))

            /**
             * Sets [Builder.billingGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                this.billingGroupId = billingGroupId
            }

            /**
             * Indicates if call forwarding will be enabled for this number if forwards_to and
             * forwarding_type are filled in. Defaults to true for backwards compatibility with
             * APIV1 use of numbers endpoints.
             */
            fun callForwardingEnabled(callForwardingEnabled: Boolean) =
                callForwardingEnabled(JsonField.of(callForwardingEnabled))

            /**
             * Sets [Builder.callForwardingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callForwardingEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callForwardingEnabled(callForwardingEnabled: JsonField<Boolean>) = apply {
                this.callForwardingEnabled = callForwardingEnabled
            }

            /** Indicates whether call recording is enabled for this number. */
            fun callRecordingEnabled(callRecordingEnabled: Boolean) =
                callRecordingEnabled(JsonField.of(callRecordingEnabled))

            /**
             * Sets [Builder.callRecordingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callRecordingEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callRecordingEnabled(callRecordingEnabled: JsonField<Boolean>) = apply {
                this.callRecordingEnabled = callRecordingEnabled
            }

            /** Indicates whether caller ID is enabled for this number. */
            fun callerIdNameEnabled(callerIdNameEnabled: Boolean) =
                callerIdNameEnabled(JsonField.of(callerIdNameEnabled))

            /**
             * Sets [Builder.callerIdNameEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerIdNameEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callerIdNameEnabled(callerIdNameEnabled: JsonField<Boolean>) = apply {
                this.callerIdNameEnabled = callerIdNameEnabled
            }

            /** Indicates whether a CNAM listing is enabled for this number. */
            fun cnamListingEnabled(cnamListingEnabled: Boolean) =
                cnamListingEnabled(JsonField.of(cnamListingEnabled))

            /**
             * Sets [Builder.cnamListingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cnamListingEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cnamListingEnabled(cnamListingEnabled: JsonField<Boolean>) = apply {
                this.cnamListingEnabled = cnamListingEnabled
            }

            /** Identifies the connection associated with the phone number. */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** The ISO 3166-1 alpha-2 country code of the phone number. */
            fun countryIsoAlpha2(countryIsoAlpha2: String) =
                countryIsoAlpha2(JsonField.of(countryIsoAlpha2))

            /**
             * Sets [Builder.countryIsoAlpha2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryIsoAlpha2] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryIsoAlpha2(countryIsoAlpha2: JsonField<String>) = apply {
                this.countryIsoAlpha2 = countryIsoAlpha2
            }

            /** ISO 8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** A customer reference string for customer look ups. */
            fun customerReference(customerReference: String) =
                customerReference(JsonField.of(customerReference))

            /**
             * Sets [Builder.customerReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerReference(customerReference: JsonField<String>) = apply {
                this.customerReference = customerReference
            }

            /** Identifies the emergency address associated with the phone number. */
            fun emergencyAddressId(emergencyAddressId: String) =
                emergencyAddressId(JsonField.of(emergencyAddressId))

            /**
             * Sets [Builder.emergencyAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyAddressId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyAddressId(emergencyAddressId: JsonField<String>) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /** Indicates whether emergency services are enabled for this number. */
            fun emergencyEnabled(emergencyEnabled: Boolean) =
                emergencyEnabled(JsonField.of(emergencyEnabled))

            /**
             * Sets [Builder.emergencyEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyEnabled(emergencyEnabled: JsonField<Boolean>) = apply {
                this.emergencyEnabled = emergencyEnabled
            }

            /**
             * Indicates the status of the provisioning of emergency services for the phone number.
             * This field contains information about activity that may be ongoing for a number where
             * it either is being provisioned or deprovisioned but is not yet enabled/disabled.
             */
            fun emergencyStatus(emergencyStatus: EmergencyStatus) =
                emergencyStatus(JsonField.of(emergencyStatus))

            /**
             * Sets [Builder.emergencyStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyStatus] with a well-typed [EmergencyStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emergencyStatus(emergencyStatus: JsonField<EmergencyStatus>) = apply {
                this.emergencyStatus = emergencyStatus
            }

            /**
             * If someone attempts to port your phone number away from Telnyx and your phone number
             * has an external PIN set, Telnyx will attempt to verify that you provided the correct
             * external PIN to the winning carrier. Note that not all carriers cooperate with this
             * security mechanism.
             */
            fun externalPin(externalPin: String) = externalPin(JsonField.of(externalPin))

            /**
             * Sets [Builder.externalPin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPin] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPin(externalPin: JsonField<String>) = apply {
                this.externalPin = externalPin
            }

            /**
             * The inbound_call_screening setting is a phone number configuration option variable
             * that allows users to configure their settings to block or flag fraudulent calls. It
             * can be set to disabled, reject_calls, or flag_calls. This feature has an additional
             * per-number monthly cost associated with it.
             */
            fun inboundCallScreening(inboundCallScreening: InboundCallScreening) =
                inboundCallScreening(JsonField.of(inboundCallScreening))

            /**
             * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCallScreening] with a well-typed
             * [InboundCallScreening] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun inboundCallScreening(inboundCallScreening: JsonField<InboundCallScreening>) =
                apply {
                    this.inboundCallScreening = inboundCallScreening
                }

            /** The +E.164-formatted phone number associated with this record. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * The phone number's type. Note: For numbers purchased prior to July 2023 or when
             * fetching a number's details immediately after a purchase completes, the legacy values
             * `tollfree`, `shortcode` or `longcode` may be returned instead.
             */
            fun phoneNumberType(phoneNumberType: PhoneNumberType) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
                this.phoneNumberType = phoneNumberType
            }

            /** ISO 8601 formatted date indicating when the resource was purchased. */
            fun purchasedAt(purchasedAt: String) = purchasedAt(JsonField.of(purchasedAt))

            /**
             * Sets [Builder.purchasedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchasedAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purchasedAt(purchasedAt: JsonField<String>) = apply {
                this.purchasedAt = purchasedAt
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The phone number's current status. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Indicates whether T38 Fax Gateway for inbound calls to this number. */
            fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: Boolean) =
                t38FaxGatewayEnabled(JsonField.of(t38FaxGatewayEnabled))

            /**
             * Sets [Builder.t38FaxGatewayEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.t38FaxGatewayEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: JsonField<Boolean>) = apply {
                this.t38FaxGatewayEnabled = t38FaxGatewayEnabled
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    billingGroupId,
                    callForwardingEnabled,
                    callRecordingEnabled,
                    callerIdNameEnabled,
                    cnamListingEnabled,
                    connectionId,
                    countryIsoAlpha2,
                    createdAt,
                    customerReference,
                    emergencyAddressId,
                    emergencyEnabled,
                    emergencyStatus,
                    externalPin,
                    inboundCallScreening,
                    phoneNumber,
                    phoneNumberType,
                    purchasedAt,
                    recordType,
                    status,
                    t38FaxGatewayEnabled,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            billingGroupId()
            callForwardingEnabled()
            callRecordingEnabled()
            callerIdNameEnabled()
            cnamListingEnabled()
            connectionId()
            countryIsoAlpha2()
            createdAt()
            customerReference()
            emergencyAddressId()
            emergencyEnabled()
            emergencyStatus().ifPresent { it.validate() }
            externalPin()
            inboundCallScreening().ifPresent { it.validate() }
            phoneNumber()
            phoneNumberType().ifPresent { it.validate() }
            purchasedAt()
            recordType()
            status().ifPresent { it.validate() }
            t38FaxGatewayEnabled()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (callForwardingEnabled.asKnown().isPresent) 1 else 0) +
                (if (callRecordingEnabled.asKnown().isPresent) 1 else 0) +
                (if (callerIdNameEnabled.asKnown().isPresent) 1 else 0) +
                (if (cnamListingEnabled.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (countryIsoAlpha2.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (emergencyAddressId.asKnown().isPresent) 1 else 0) +
                (if (emergencyEnabled.asKnown().isPresent) 1 else 0) +
                (emergencyStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalPin.asKnown().isPresent) 1 else 0) +
                (inboundCallScreening.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (purchasedAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (t38FaxGatewayEnabled.asKnown().isPresent) 1 else 0)

        /**
         * Indicates the status of the provisioning of emergency services for the phone number. This
         * field contains information about activity that may be ongoing for a number where it
         * either is being provisioned or deprovisioned but is not yet enabled/disabled.
         */
        class EmergencyStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACTIVE = of("active")

                @JvmField val DEPROVISIONING = of("deprovisioning")

                @JvmField val DISABLED = of("disabled")

                @JvmField val PROVISIONING = of("provisioning")

                @JvmField val PROVISIONING_FAILED = of("provisioning-failed")

                @JvmStatic fun of(value: String) = EmergencyStatus(JsonField.of(value))
            }

            /** An enum containing [EmergencyStatus]'s known values. */
            enum class Known {
                ACTIVE,
                DEPROVISIONING,
                DISABLED,
                PROVISIONING,
                PROVISIONING_FAILED,
            }

            /**
             * An enum containing [EmergencyStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EmergencyStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                DEPROVISIONING,
                DISABLED,
                PROVISIONING,
                PROVISIONING_FAILED,
                /**
                 * An enum member indicating that [EmergencyStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACTIVE -> Value.ACTIVE
                    DEPROVISIONING -> Value.DEPROVISIONING
                    DISABLED -> Value.DISABLED
                    PROVISIONING -> Value.PROVISIONING
                    PROVISIONING_FAILED -> Value.PROVISIONING_FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACTIVE -> Known.ACTIVE
                    DEPROVISIONING -> Known.DEPROVISIONING
                    DISABLED -> Known.DISABLED
                    PROVISIONING -> Known.PROVISIONING
                    PROVISIONING_FAILED -> Known.PROVISIONING_FAILED
                    else -> throw TelnyxInvalidDataException("Unknown EmergencyStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EmergencyStatus = apply {
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

                return other is EmergencyStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The inbound_call_screening setting is a phone number configuration option variable that
         * allows users to configure their settings to block or flag fraudulent calls. It can be set
         * to disabled, reject_calls, or flag_calls. This feature has an additional per-number
         * monthly cost associated with it.
         */
        class InboundCallScreening
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DISABLED = of("disabled")

                @JvmField val REJECT_CALLS = of("reject_calls")

                @JvmField val FLAG_CALLS = of("flag_calls")

                @JvmStatic fun of(value: String) = InboundCallScreening(JsonField.of(value))
            }

            /** An enum containing [InboundCallScreening]'s known values. */
            enum class Known {
                DISABLED,
                REJECT_CALLS,
                FLAG_CALLS,
            }

            /**
             * An enum containing [InboundCallScreening]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [InboundCallScreening] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISABLED,
                REJECT_CALLS,
                FLAG_CALLS,
                /**
                 * An enum member indicating that [InboundCallScreening] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DISABLED -> Value.DISABLED
                    REJECT_CALLS -> Value.REJECT_CALLS
                    FLAG_CALLS -> Value.FLAG_CALLS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DISABLED -> Known.DISABLED
                    REJECT_CALLS -> Known.REJECT_CALLS
                    FLAG_CALLS -> Known.FLAG_CALLS
                    else -> throw TelnyxInvalidDataException("Unknown InboundCallScreening: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): InboundCallScreening = apply {
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

                return other is InboundCallScreening && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The phone number's type. Note: For numbers purchased prior to July 2023 or when fetching
         * a number's details immediately after a purchase completes, the legacy values `tollfree`,
         * `shortcode` or `longcode` may be returned instead.
         */
        class PhoneNumberType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LOCAL = of("local")

                @JvmField val TOLL_FREE = of("toll_free")

                @JvmField val MOBILE = of("mobile")

                @JvmField val NATIONAL = of("national")

                @JvmField val SHARED_COST = of("shared_cost")

                @JvmField val LANDLINE = of("landline")

                @JvmField val TOLLFREE = of("tollfree")

                @JvmField val SHORTCODE = of("shortcode")

                @JvmField val LONGCODE = of("longcode")

                @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
            }

            /** An enum containing [PhoneNumberType]'s known values. */
            enum class Known {
                LOCAL,
                TOLL_FREE,
                MOBILE,
                NATIONAL,
                SHARED_COST,
                LANDLINE,
                TOLLFREE,
                SHORTCODE,
                LONGCODE,
            }

            /**
             * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCAL,
                TOLL_FREE,
                MOBILE,
                NATIONAL,
                SHARED_COST,
                LANDLINE,
                TOLLFREE,
                SHORTCODE,
                LONGCODE,
                /**
                 * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LOCAL -> Value.LOCAL
                    TOLL_FREE -> Value.TOLL_FREE
                    MOBILE -> Value.MOBILE
                    NATIONAL -> Value.NATIONAL
                    SHARED_COST -> Value.SHARED_COST
                    LANDLINE -> Value.LANDLINE
                    TOLLFREE -> Value.TOLLFREE
                    SHORTCODE -> Value.SHORTCODE
                    LONGCODE -> Value.LONGCODE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LOCAL -> Known.LOCAL
                    TOLL_FREE -> Known.TOLL_FREE
                    MOBILE -> Known.MOBILE
                    NATIONAL -> Known.NATIONAL
                    SHARED_COST -> Known.SHARED_COST
                    LANDLINE -> Known.LANDLINE
                    TOLLFREE -> Known.TOLLFREE
                    SHORTCODE -> Known.SHORTCODE
                    LONGCODE -> Known.LONGCODE
                    else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): PhoneNumberType = apply {
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

                return other is PhoneNumberType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The phone number's current status. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PURCHASE_PENDING = of("purchase-pending")

                @JvmField val PURCHASE_FAILED = of("purchase-failed")

                @JvmField val PORT_PENDING = of("port-pending")

                @JvmField val PORT_FAILED = of("port-failed")

                @JvmField val ACTIVE = of("active")

                @JvmField val DELETED = of("deleted")

                @JvmField val EMERGENCY_ONLY = of("emergency-only")

                @JvmField val PORTED_OUT = of("ported-out")

                @JvmField val PORT_OUT_PENDING = of("port-out-pending")

                @JvmField val REQUIREMENT_INFO_PENDING = of("requirement-info-pending")

                @JvmField val REQUIREMENT_INFO_UNDER_REVIEW = of("requirement-info-under-review")

                @JvmField val REQUIREMENT_INFO_EXCEPTION = of("requirement-info-exception")

                @JvmField val PROVISION_PENDING = of("provision-pending")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                PORT_FAILED,
                ACTIVE,
                DELETED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
                REQUIREMENT_INFO_PENDING,
                REQUIREMENT_INFO_UNDER_REVIEW,
                REQUIREMENT_INFO_EXCEPTION,
                PROVISION_PENDING,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                PORT_FAILED,
                ACTIVE,
                DELETED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
                REQUIREMENT_INFO_PENDING,
                REQUIREMENT_INFO_UNDER_REVIEW,
                REQUIREMENT_INFO_EXCEPTION,
                PROVISION_PENDING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PURCHASE_PENDING -> Value.PURCHASE_PENDING
                    PURCHASE_FAILED -> Value.PURCHASE_FAILED
                    PORT_PENDING -> Value.PORT_PENDING
                    PORT_FAILED -> Value.PORT_FAILED
                    ACTIVE -> Value.ACTIVE
                    DELETED -> Value.DELETED
                    EMERGENCY_ONLY -> Value.EMERGENCY_ONLY
                    PORTED_OUT -> Value.PORTED_OUT
                    PORT_OUT_PENDING -> Value.PORT_OUT_PENDING
                    REQUIREMENT_INFO_PENDING -> Value.REQUIREMENT_INFO_PENDING
                    REQUIREMENT_INFO_UNDER_REVIEW -> Value.REQUIREMENT_INFO_UNDER_REVIEW
                    REQUIREMENT_INFO_EXCEPTION -> Value.REQUIREMENT_INFO_EXCEPTION
                    PROVISION_PENDING -> Value.PROVISION_PENDING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PURCHASE_PENDING -> Known.PURCHASE_PENDING
                    PURCHASE_FAILED -> Known.PURCHASE_FAILED
                    PORT_PENDING -> Known.PORT_PENDING
                    PORT_FAILED -> Known.PORT_FAILED
                    ACTIVE -> Known.ACTIVE
                    DELETED -> Known.DELETED
                    EMERGENCY_ONLY -> Known.EMERGENCY_ONLY
                    PORTED_OUT -> Known.PORTED_OUT
                    PORT_OUT_PENDING -> Known.PORT_OUT_PENDING
                    REQUIREMENT_INFO_PENDING -> Known.REQUIREMENT_INFO_PENDING
                    REQUIREMENT_INFO_UNDER_REVIEW -> Known.REQUIREMENT_INFO_UNDER_REVIEW
                    REQUIREMENT_INFO_EXCEPTION -> Known.REQUIREMENT_INFO_EXCEPTION
                    PROVISION_PENDING -> Known.PROVISION_PENDING
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                billingGroupId == other.billingGroupId &&
                callForwardingEnabled == other.callForwardingEnabled &&
                callRecordingEnabled == other.callRecordingEnabled &&
                callerIdNameEnabled == other.callerIdNameEnabled &&
                cnamListingEnabled == other.cnamListingEnabled &&
                connectionId == other.connectionId &&
                countryIsoAlpha2 == other.countryIsoAlpha2 &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                emergencyAddressId == other.emergencyAddressId &&
                emergencyEnabled == other.emergencyEnabled &&
                emergencyStatus == other.emergencyStatus &&
                externalPin == other.externalPin &&
                inboundCallScreening == other.inboundCallScreening &&
                phoneNumber == other.phoneNumber &&
                phoneNumberType == other.phoneNumberType &&
                purchasedAt == other.purchasedAt &&
                recordType == other.recordType &&
                status == other.status &&
                t38FaxGatewayEnabled == other.t38FaxGatewayEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                billingGroupId,
                callForwardingEnabled,
                callRecordingEnabled,
                callerIdNameEnabled,
                cnamListingEnabled,
                connectionId,
                countryIsoAlpha2,
                createdAt,
                customerReference,
                emergencyAddressId,
                emergencyEnabled,
                emergencyStatus,
                externalPin,
                inboundCallScreening,
                phoneNumber,
                phoneNumberType,
                purchasedAt,
                recordType,
                status,
                t38FaxGatewayEnabled,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, billingGroupId=$billingGroupId, callForwardingEnabled=$callForwardingEnabled, callRecordingEnabled=$callRecordingEnabled, callerIdNameEnabled=$callerIdNameEnabled, cnamListingEnabled=$cnamListingEnabled, connectionId=$connectionId, countryIsoAlpha2=$countryIsoAlpha2, createdAt=$createdAt, customerReference=$customerReference, emergencyAddressId=$emergencyAddressId, emergencyEnabled=$emergencyEnabled, emergencyStatus=$emergencyStatus, externalPin=$externalPin, inboundCallScreening=$inboundCallScreening, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, purchasedAt=$purchasedAt, recordType=$recordType, status=$status, t38FaxGatewayEnabled=$t38FaxGatewayEnabled, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberSlimListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberSlimListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
