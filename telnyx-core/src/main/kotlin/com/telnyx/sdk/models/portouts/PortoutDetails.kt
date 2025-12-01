// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortoutDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val alreadyPorted: JsonField<Boolean>,
    private val authorizedName: JsonField<String>,
    private val carrierName: JsonField<String>,
    private val city: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val currentCarrier: JsonField<String>,
    private val endUserName: JsonField<String>,
    private val focDate: JsonField<String>,
    private val hostMessaging: JsonField<Boolean>,
    private val insertedAt: JsonField<String>,
    private val lsr: JsonField<List<String>>,
    private val phoneNumbers: JsonField<List<String>>,
    private val pon: JsonField<String>,
    private val reason: JsonField<String>,
    private val recordType: JsonField<String>,
    private val rejectionCode: JsonField<Long>,
    private val requestedFocDate: JsonField<String>,
    private val serviceAddress: JsonField<String>,
    private val spid: JsonField<String>,
    private val state: JsonField<String>,
    private val status: JsonField<Status>,
    private val supportKey: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val userId: JsonField<String>,
    private val vendor: JsonField<String>,
    private val zip: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("already_ported")
        @ExcludeMissing
        alreadyPorted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("authorized_name")
        @ExcludeMissing
        authorizedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("carrier_name")
        @ExcludeMissing
        carrierName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current_carrier")
        @ExcludeMissing
        currentCarrier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_user_name")
        @ExcludeMissing
        endUserName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foc_date") @ExcludeMissing focDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("host_messaging")
        @ExcludeMissing
        hostMessaging: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inserted_at")
        @ExcludeMissing
        insertedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lsr") @ExcludeMissing lsr: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pon") @ExcludeMissing pon: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejection_code")
        @ExcludeMissing
        rejectionCode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("requested_foc_date")
        @ExcludeMissing
        requestedFocDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_address")
        @ExcludeMissing
        serviceAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spid") @ExcludeMissing spid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("support_key")
        @ExcludeMissing
        supportKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor") @ExcludeMissing vendor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        alreadyPorted,
        authorizedName,
        carrierName,
        city,
        createdAt,
        currentCarrier,
        endUserName,
        focDate,
        hostMessaging,
        insertedAt,
        lsr,
        phoneNumbers,
        pon,
        reason,
        recordType,
        rejectionCode,
        requestedFocDate,
        serviceAddress,
        spid,
        state,
        status,
        supportKey,
        updatedAt,
        userId,
        vendor,
        zip,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Is true when the number is already ported
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alreadyPorted(): Optional<Boolean> = alreadyPorted.getOptional("already_ported")

    /**
     * Name of person authorizing the porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizedName(): Optional<String> = authorizedName.getOptional("authorized_name")

    /**
     * Carrier the number will be ported out to
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrierName(): Optional<String> = carrierName.getOptional("carrier_name")

    /**
     * City or municipality of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * ISO 8601 formatted date of when the portout was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * The current carrier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentCarrier(): Optional<String> = currentCarrier.getOptional("current_carrier")

    /**
     * Person name or company name requesting the port
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endUserName(): Optional<String> = endUserName.getOptional("end_user_name")

    /**
     * ISO 8601 formatted Date/Time of the FOC date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun focDate(): Optional<String> = focDate.getOptional("foc_date")

    /**
     * Indicates whether messaging services should be maintained with Telnyx after the port out
     * completes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostMessaging(): Optional<Boolean> = hostMessaging.getOptional("host_messaging")

    /**
     * ISO 8601 formatted date of when the portout was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insertedAt(): Optional<String> = insertedAt.getOptional("inserted_at")

    /**
     * The Local Service Request
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lsr(): Optional<List<String>> = lsr.getOptional("lsr")

    /**
     * Phone numbers associated with this portout
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<String>> = phoneNumbers.getOptional("phone_numbers")

    /**
     * Port order number assigned by the carrier the number will be ported out to
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pon(): Optional<String> = pon.getOptional("pon")

    /**
     * The reason why the order is being rejected by the user. If the order is authorized, this
     * field can be left null
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The rejection code for one of the valid rejections to reject a port out order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionCode(): Optional<Long> = rejectionCode.getOptional("rejection_code")

    /**
     * ISO 8601 formatted Date/Time of the user requested FOC date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestedFocDate(): Optional<String> = requestedFocDate.getOptional("requested_foc_date")

    /**
     * First line of billing address (street address)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceAddress(): Optional<String> = serviceAddress.getOptional("service_address")

    /**
     * New service provider spid
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spid(): Optional<String> = spid.getOptional("spid")

    /**
     * State, province, or similar of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Status of portout request
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * A key to reference this port out request when contacting Telnyx customer support
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

    /**
     * ISO 8601 formatted date of when the portout was last updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Identifies the user (or organization) who requested the port out
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Telnyx partner providing network coverage
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendor(): Optional<String> = vendor.getOptional("vendor")

    /**
     * Postal Code of billing address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zip(): Optional<String> = zip.getOptional("zip")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [alreadyPorted].
     *
     * Unlike [alreadyPorted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("already_ported")
    @ExcludeMissing
    fun _alreadyPorted(): JsonField<Boolean> = alreadyPorted

    /**
     * Returns the raw JSON value of [authorizedName].
     *
     * Unlike [authorizedName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized_name")
    @ExcludeMissing
    fun _authorizedName(): JsonField<String> = authorizedName

    /**
     * Returns the raw JSON value of [carrierName].
     *
     * Unlike [carrierName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("carrier_name")
    @ExcludeMissing
    fun _carrierName(): JsonField<String> = carrierName

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [currentCarrier].
     *
     * Unlike [currentCarrier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_carrier")
    @ExcludeMissing
    fun _currentCarrier(): JsonField<String> = currentCarrier

    /**
     * Returns the raw JSON value of [endUserName].
     *
     * Unlike [endUserName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_user_name")
    @ExcludeMissing
    fun _endUserName(): JsonField<String> = endUserName

    /**
     * Returns the raw JSON value of [focDate].
     *
     * Unlike [focDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foc_date") @ExcludeMissing fun _focDate(): JsonField<String> = focDate

    /**
     * Returns the raw JSON value of [hostMessaging].
     *
     * Unlike [hostMessaging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host_messaging")
    @ExcludeMissing
    fun _hostMessaging(): JsonField<Boolean> = hostMessaging

    /**
     * Returns the raw JSON value of [insertedAt].
     *
     * Unlike [insertedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inserted_at") @ExcludeMissing fun _insertedAt(): JsonField<String> = insertedAt

    /**
     * Returns the raw JSON value of [lsr].
     *
     * Unlike [lsr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lsr") @ExcludeMissing fun _lsr(): JsonField<List<String>> = lsr

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

    /**
     * Returns the raw JSON value of [pon].
     *
     * Unlike [pon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pon") @ExcludeMissing fun _pon(): JsonField<String> = pon

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [rejectionCode].
     *
     * Unlike [rejectionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejection_code")
    @ExcludeMissing
    fun _rejectionCode(): JsonField<Long> = rejectionCode

    /**
     * Returns the raw JSON value of [requestedFocDate].
     *
     * Unlike [requestedFocDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requested_foc_date")
    @ExcludeMissing
    fun _requestedFocDate(): JsonField<String> = requestedFocDate

    /**
     * Returns the raw JSON value of [serviceAddress].
     *
     * Unlike [serviceAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_address")
    @ExcludeMissing
    fun _serviceAddress(): JsonField<String> = serviceAddress

    /**
     * Returns the raw JSON value of [spid].
     *
     * Unlike [spid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spid") @ExcludeMissing fun _spid(): JsonField<String> = spid

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [supportKey].
     *
     * Unlike [supportKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("support_key") @ExcludeMissing fun _supportKey(): JsonField<String> = supportKey

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [vendor].
     *
     * Unlike [vendor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor") @ExcludeMissing fun _vendor(): JsonField<String> = vendor

    /**
     * Returns the raw JSON value of [zip].
     *
     * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

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

        /** Returns a mutable builder for constructing an instance of [PortoutDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortoutDetails]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var alreadyPorted: JsonField<Boolean> = JsonMissing.of()
        private var authorizedName: JsonField<String> = JsonMissing.of()
        private var carrierName: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var currentCarrier: JsonField<String> = JsonMissing.of()
        private var endUserName: JsonField<String> = JsonMissing.of()
        private var focDate: JsonField<String> = JsonMissing.of()
        private var hostMessaging: JsonField<Boolean> = JsonMissing.of()
        private var insertedAt: JsonField<String> = JsonMissing.of()
        private var lsr: JsonField<MutableList<String>>? = null
        private var phoneNumbers: JsonField<MutableList<String>>? = null
        private var pon: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var rejectionCode: JsonField<Long> = JsonMissing.of()
        private var requestedFocDate: JsonField<String> = JsonMissing.of()
        private var serviceAddress: JsonField<String> = JsonMissing.of()
        private var spid: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var supportKey: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var vendor: JsonField<String> = JsonMissing.of()
        private var zip: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portoutDetails: PortoutDetails) = apply {
            id = portoutDetails.id
            alreadyPorted = portoutDetails.alreadyPorted
            authorizedName = portoutDetails.authorizedName
            carrierName = portoutDetails.carrierName
            city = portoutDetails.city
            createdAt = portoutDetails.createdAt
            currentCarrier = portoutDetails.currentCarrier
            endUserName = portoutDetails.endUserName
            focDate = portoutDetails.focDate
            hostMessaging = portoutDetails.hostMessaging
            insertedAt = portoutDetails.insertedAt
            lsr = portoutDetails.lsr.map { it.toMutableList() }
            phoneNumbers = portoutDetails.phoneNumbers.map { it.toMutableList() }
            pon = portoutDetails.pon
            reason = portoutDetails.reason
            recordType = portoutDetails.recordType
            rejectionCode = portoutDetails.rejectionCode
            requestedFocDate = portoutDetails.requestedFocDate
            serviceAddress = portoutDetails.serviceAddress
            spid = portoutDetails.spid
            state = portoutDetails.state
            status = portoutDetails.status
            supportKey = portoutDetails.supportKey
            updatedAt = portoutDetails.updatedAt
            userId = portoutDetails.userId
            vendor = portoutDetails.vendor
            zip = portoutDetails.zip
            additionalProperties = portoutDetails.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Is true when the number is already ported */
        fun alreadyPorted(alreadyPorted: Boolean) = alreadyPorted(JsonField.of(alreadyPorted))

        /**
         * Sets [Builder.alreadyPorted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alreadyPorted] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alreadyPorted(alreadyPorted: JsonField<Boolean>) = apply {
            this.alreadyPorted = alreadyPorted
        }

        /** Name of person authorizing the porting order */
        fun authorizedName(authorizedName: String) = authorizedName(JsonField.of(authorizedName))

        /**
         * Sets [Builder.authorizedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizedName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizedName(authorizedName: JsonField<String>) = apply {
            this.authorizedName = authorizedName
        }

        /** Carrier the number will be ported out to */
        fun carrierName(carrierName: String) = carrierName(JsonField.of(carrierName))

        /**
         * Sets [Builder.carrierName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun carrierName(carrierName: JsonField<String>) = apply { this.carrierName = carrierName }

        /** City or municipality of billing address */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** ISO 8601 formatted date of when the portout was created */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The current carrier */
        fun currentCarrier(currentCarrier: String) = currentCarrier(JsonField.of(currentCarrier))

        /**
         * Sets [Builder.currentCarrier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentCarrier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentCarrier(currentCarrier: JsonField<String>) = apply {
            this.currentCarrier = currentCarrier
        }

        /** Person name or company name requesting the port */
        fun endUserName(endUserName: String) = endUserName(JsonField.of(endUserName))

        /**
         * Sets [Builder.endUserName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endUserName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endUserName(endUserName: JsonField<String>) = apply { this.endUserName = endUserName }

        /** ISO 8601 formatted Date/Time of the FOC date */
        fun focDate(focDate: String) = focDate(JsonField.of(focDate))

        /**
         * Sets [Builder.focDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.focDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun focDate(focDate: JsonField<String>) = apply { this.focDate = focDate }

        /**
         * Indicates whether messaging services should be maintained with Telnyx after the port out
         * completes
         */
        fun hostMessaging(hostMessaging: Boolean) = hostMessaging(JsonField.of(hostMessaging))

        /**
         * Sets [Builder.hostMessaging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostMessaging] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostMessaging(hostMessaging: JsonField<Boolean>) = apply {
            this.hostMessaging = hostMessaging
        }

        /** ISO 8601 formatted date of when the portout was created */
        fun insertedAt(insertedAt: String) = insertedAt(JsonField.of(insertedAt))

        /**
         * Sets [Builder.insertedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insertedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun insertedAt(insertedAt: JsonField<String>) = apply { this.insertedAt = insertedAt }

        /** The Local Service Request */
        fun lsr(lsr: List<String>) = lsr(JsonField.of(lsr))

        /**
         * Sets [Builder.lsr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lsr] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lsr(lsr: JsonField<List<String>>) = apply { this.lsr = lsr.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.lsr].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLsr(lsr: String) = apply {
            this.lsr =
                (this.lsr ?: JsonField.of(mutableListOf())).also { checkKnown("lsr", it).add(lsr) }
        }

        /** Phone numbers associated with this portout */
        fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: String) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /** Port order number assigned by the carrier the number will be ported out to */
        fun pon(pon: String) = pon(JsonField.of(pon))

        /**
         * Sets [Builder.pon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pon] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pon(pon: JsonField<String>) = apply { this.pon = pon }

        /**
         * The reason why the order is being rejected by the user. If the order is authorized, this
         * field can be left null
         */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** The rejection code for one of the valid rejections to reject a port out order */
        fun rejectionCode(rejectionCode: Long) = rejectionCode(JsonField.of(rejectionCode))

        /**
         * Sets [Builder.rejectionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionCode] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rejectionCode(rejectionCode: JsonField<Long>) = apply {
            this.rejectionCode = rejectionCode
        }

        /** ISO 8601 formatted Date/Time of the user requested FOC date */
        fun requestedFocDate(requestedFocDate: String) =
            requestedFocDate(JsonField.of(requestedFocDate))

        /**
         * Sets [Builder.requestedFocDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedFocDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedFocDate(requestedFocDate: JsonField<String>) = apply {
            this.requestedFocDate = requestedFocDate
        }

        /** First line of billing address (street address) */
        fun serviceAddress(serviceAddress: String) = serviceAddress(JsonField.of(serviceAddress))

        /**
         * Sets [Builder.serviceAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceAddress(serviceAddress: JsonField<String>) = apply {
            this.serviceAddress = serviceAddress
        }

        /** New service provider spid */
        fun spid(spid: String) = spid(JsonField.of(spid))

        /**
         * Sets [Builder.spid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spid(spid: JsonField<String>) = apply { this.spid = spid }

        /** State, province, or similar of billing address */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Status of portout request */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** A key to reference this port out request when contacting Telnyx customer support */
        fun supportKey(supportKey: String) = supportKey(JsonField.of(supportKey))

        /**
         * Sets [Builder.supportKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun supportKey(supportKey: JsonField<String>) = apply { this.supportKey = supportKey }

        /** ISO 8601 formatted date of when the portout was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** Identifies the user (or organization) who requested the port out */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Telnyx partner providing network coverage */
        fun vendor(vendor: String) = vendor(JsonField.of(vendor))

        /**
         * Sets [Builder.vendor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vendor(vendor: JsonField<String>) = apply { this.vendor = vendor }

        /** Postal Code of billing address */
        fun zip(zip: String) = zip(JsonField.of(zip))

        /**
         * Sets [Builder.zip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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
         * Returns an immutable instance of [PortoutDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortoutDetails =
            PortoutDetails(
                id,
                alreadyPorted,
                authorizedName,
                carrierName,
                city,
                createdAt,
                currentCarrier,
                endUserName,
                focDate,
                hostMessaging,
                insertedAt,
                (lsr ?: JsonMissing.of()).map { it.toImmutable() },
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                pon,
                reason,
                recordType,
                rejectionCode,
                requestedFocDate,
                serviceAddress,
                spid,
                state,
                status,
                supportKey,
                updatedAt,
                userId,
                vendor,
                zip,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortoutDetails = apply {
        if (validated) {
            return@apply
        }

        id()
        alreadyPorted()
        authorizedName()
        carrierName()
        city()
        createdAt()
        currentCarrier()
        endUserName()
        focDate()
        hostMessaging()
        insertedAt()
        lsr()
        phoneNumbers()
        pon()
        reason()
        recordType()
        rejectionCode()
        requestedFocDate()
        serviceAddress()
        spid()
        state()
        status().ifPresent { it.validate() }
        supportKey()
        updatedAt()
        userId()
        vendor()
        zip()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (alreadyPorted.asKnown().isPresent) 1 else 0) +
            (if (authorizedName.asKnown().isPresent) 1 else 0) +
            (if (carrierName.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currentCarrier.asKnown().isPresent) 1 else 0) +
            (if (endUserName.asKnown().isPresent) 1 else 0) +
            (if (focDate.asKnown().isPresent) 1 else 0) +
            (if (hostMessaging.asKnown().isPresent) 1 else 0) +
            (if (insertedAt.asKnown().isPresent) 1 else 0) +
            (lsr.asKnown().getOrNull()?.size ?: 0) +
            (phoneNumbers.asKnown().getOrNull()?.size ?: 0) +
            (if (pon.asKnown().isPresent) 1 else 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (rejectionCode.asKnown().isPresent) 1 else 0) +
            (if (requestedFocDate.asKnown().isPresent) 1 else 0) +
            (if (serviceAddress.asKnown().isPresent) 1 else 0) +
            (if (spid.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (supportKey.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (vendor.asKnown().isPresent) 1 else 0) +
            (if (zip.asKnown().isPresent) 1 else 0)

    /** Status of portout request */
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

            @JvmField val PENDING = of("pending")

            @JvmField val AUTHORIZED = of("authorized")

            @JvmField val PORTED = of("ported")

            @JvmField val REJECTED = of("rejected")

            @JvmField val REJECTED_PENDING = of("rejected-pending")

            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            AUTHORIZED,
            PORTED,
            REJECTED,
            REJECTED_PENDING,
            CANCELED,
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
            PENDING,
            AUTHORIZED,
            PORTED,
            REJECTED,
            REJECTED_PENDING,
            CANCELED,
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
                PENDING -> Value.PENDING
                AUTHORIZED -> Value.AUTHORIZED
                PORTED -> Value.PORTED
                REJECTED -> Value.REJECTED
                REJECTED_PENDING -> Value.REJECTED_PENDING
                CANCELED -> Value.CANCELED
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
                PENDING -> Known.PENDING
                AUTHORIZED -> Known.AUTHORIZED
                PORTED -> Known.PORTED
                REJECTED -> Known.REJECTED
                REJECTED_PENDING -> Known.REJECTED_PENDING
                CANCELED -> Known.CANCELED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortoutDetails &&
            id == other.id &&
            alreadyPorted == other.alreadyPorted &&
            authorizedName == other.authorizedName &&
            carrierName == other.carrierName &&
            city == other.city &&
            createdAt == other.createdAt &&
            currentCarrier == other.currentCarrier &&
            endUserName == other.endUserName &&
            focDate == other.focDate &&
            hostMessaging == other.hostMessaging &&
            insertedAt == other.insertedAt &&
            lsr == other.lsr &&
            phoneNumbers == other.phoneNumbers &&
            pon == other.pon &&
            reason == other.reason &&
            recordType == other.recordType &&
            rejectionCode == other.rejectionCode &&
            requestedFocDate == other.requestedFocDate &&
            serviceAddress == other.serviceAddress &&
            spid == other.spid &&
            state == other.state &&
            status == other.status &&
            supportKey == other.supportKey &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            vendor == other.vendor &&
            zip == other.zip &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            alreadyPorted,
            authorizedName,
            carrierName,
            city,
            createdAt,
            currentCarrier,
            endUserName,
            focDate,
            hostMessaging,
            insertedAt,
            lsr,
            phoneNumbers,
            pon,
            reason,
            recordType,
            rejectionCode,
            requestedFocDate,
            serviceAddress,
            spid,
            state,
            status,
            supportKey,
            updatedAt,
            userId,
            vendor,
            zip,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortoutDetails{id=$id, alreadyPorted=$alreadyPorted, authorizedName=$authorizedName, carrierName=$carrierName, city=$city, createdAt=$createdAt, currentCarrier=$currentCarrier, endUserName=$endUserName, focDate=$focDate, hostMessaging=$hostMessaging, insertedAt=$insertedAt, lsr=$lsr, phoneNumbers=$phoneNumbers, pon=$pon, reason=$reason, recordType=$recordType, rejectionCode=$rejectionCode, requestedFocDate=$requestedFocDate, serviceAddress=$serviceAddress, spid=$spid, state=$state, status=$status, supportKey=$supportKey, updatedAt=$updatedAt, userId=$userId, vendor=$vendor, zip=$zip, additionalProperties=$additionalProperties}"
}
