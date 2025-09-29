// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.uploads

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TnUploadEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val civicAddressId: JsonField<String>,
    private val errorCode: JsonField<ErrorCode>,
    private val errorMessage: JsonField<String>,
    private val internalStatus: JsonField<InternalStatus>,
    private val locationId: JsonField<String>,
    private val numberId: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("civic_address_id")
        @ExcludeMissing
        civicAddressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_code")
        @ExcludeMissing
        errorCode: JsonField<ErrorCode> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internal_status")
        @ExcludeMissing
        internalStatus: JsonField<InternalStatus> = JsonMissing.of(),
        @JsonProperty("location_id")
        @ExcludeMissing
        locationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number_id") @ExcludeMissing numberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        civicAddressId,
        errorCode,
        errorMessage,
        internalStatus,
        locationId,
        numberId,
        phoneNumber,
        status,
        mutableMapOf(),
    )

    /**
     * Identifies the civic address assigned to the phone number entry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun civicAddressId(): Optional<String> = civicAddressId.getOptional("civic_address_id")

    /**
     * A code returned by Microsoft Teams if there is an error with the phone number entry upload.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<ErrorCode> = errorCode.getOptional("error_code")

    /**
     * A message returned by Microsoft Teams if there is an error with the upload process.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Represents the status of the phone number entry upload on Telnyx.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun internalStatus(): Optional<InternalStatus> = internalStatus.getOptional("internal_status")

    /**
     * Identifies the location assigned to the phone number entry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationId(): Optional<String> = locationId.getOptional("location_id")

    /**
     * Uniquely identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberId(): Optional<String> = numberId.getOptional("number_id")

    /**
     * Phone number in E164 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Represents the status of the phone number entry upload on Microsoft Teams.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [civicAddressId].
     *
     * Unlike [civicAddressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("civic_address_id")
    @ExcludeMissing
    fun _civicAddressId(): JsonField<String> = civicAddressId

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<ErrorCode> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [internalStatus].
     *
     * Unlike [internalStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("internal_status")
    @ExcludeMissing
    fun _internalStatus(): JsonField<InternalStatus> = internalStatus

    /**
     * Returns the raw JSON value of [locationId].
     *
     * Unlike [locationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location_id") @ExcludeMissing fun _locationId(): JsonField<String> = locationId

    /**
     * Returns the raw JSON value of [numberId].
     *
     * Unlike [numberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number_id") @ExcludeMissing fun _numberId(): JsonField<String> = numberId

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [TnUploadEntry]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TnUploadEntry]. */
    class Builder internal constructor() {

        private var civicAddressId: JsonField<String> = JsonMissing.of()
        private var errorCode: JsonField<ErrorCode> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var internalStatus: JsonField<InternalStatus> = JsonMissing.of()
        private var locationId: JsonField<String> = JsonMissing.of()
        private var numberId: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tnUploadEntry: TnUploadEntry) = apply {
            civicAddressId = tnUploadEntry.civicAddressId
            errorCode = tnUploadEntry.errorCode
            errorMessage = tnUploadEntry.errorMessage
            internalStatus = tnUploadEntry.internalStatus
            locationId = tnUploadEntry.locationId
            numberId = tnUploadEntry.numberId
            phoneNumber = tnUploadEntry.phoneNumber
            status = tnUploadEntry.status
            additionalProperties = tnUploadEntry.additionalProperties.toMutableMap()
        }

        /** Identifies the civic address assigned to the phone number entry. */
        fun civicAddressId(civicAddressId: String) = civicAddressId(JsonField.of(civicAddressId))

        /**
         * Sets [Builder.civicAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civicAddressId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun civicAddressId(civicAddressId: JsonField<String>) = apply {
            this.civicAddressId = civicAddressId
        }

        /**
         * A code returned by Microsoft Teams if there is an error with the phone number entry
         * upload.
         */
        fun errorCode(errorCode: ErrorCode) = errorCode(JsonField.of(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [ErrorCode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<ErrorCode>) = apply { this.errorCode = errorCode }

        /** A message returned by Microsoft Teams if there is an error with the upload process. */
        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Represents the status of the phone number entry upload on Telnyx. */
        fun internalStatus(internalStatus: InternalStatus) =
            internalStatus(JsonField.of(internalStatus))

        /**
         * Sets [Builder.internalStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalStatus] with a well-typed [InternalStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalStatus(internalStatus: JsonField<InternalStatus>) = apply {
            this.internalStatus = internalStatus
        }

        /** Identifies the location assigned to the phone number entry. */
        fun locationId(locationId: String) = locationId(JsonField.of(locationId))

        /**
         * Sets [Builder.locationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationId(locationId: JsonField<String>) = apply { this.locationId = locationId }

        /** Uniquely identifies the resource. */
        fun numberId(numberId: String) = numberId(JsonField.of(numberId))

        /**
         * Sets [Builder.numberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numberId(numberId: JsonField<String>) = apply { this.numberId = numberId }

        /** Phone number in E164 format. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Represents the status of the phone number entry upload on Microsoft Teams. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [TnUploadEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TnUploadEntry =
            TnUploadEntry(
                civicAddressId,
                errorCode,
                errorMessage,
                internalStatus,
                locationId,
                numberId,
                phoneNumber,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TnUploadEntry = apply {
        if (validated) {
            return@apply
        }

        civicAddressId()
        errorCode().ifPresent { it.validate() }
        errorMessage()
        internalStatus().ifPresent { it.validate() }
        locationId()
        numberId()
        phoneNumber()
        status().ifPresent { it.validate() }
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
        (if (civicAddressId.asKnown().isPresent) 1 else 0) +
            (errorCode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (internalStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (locationId.asKnown().isPresent) 1 else 0) +
            (if (numberId.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A code returned by Microsoft Teams if there is an error with the phone number entry upload.
     */
    class ErrorCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INTERNAL_ERROR = of("internal_error")

            @JvmField
            val UNABLE_TO_RETRIEVE_DEFAULT_LOCATION = of("unable_to_retrieve_default_location")

            @JvmField val UNKNOWN_COUNTRY_CODE = of("unknown_country_code")

            @JvmField val UNABLE_TO_RETRIEVE_LOCATION = of("unable_to_retrieve_location")

            @JvmField val UNABLE_TO_RETRIEVE_PARTNER_INFO = of("unable_to_retrieve_partner_info")

            @JvmField val UNABLE_TO_MATCH_GEOGRAPHY_ENTRY = of("unable_to_match_geography_entry")

            @JvmStatic fun of(value: String) = ErrorCode(JsonField.of(value))
        }

        /** An enum containing [ErrorCode]'s known values. */
        enum class Known {
            INTERNAL_ERROR,
            UNABLE_TO_RETRIEVE_DEFAULT_LOCATION,
            UNKNOWN_COUNTRY_CODE,
            UNABLE_TO_RETRIEVE_LOCATION,
            UNABLE_TO_RETRIEVE_PARTNER_INFO,
            UNABLE_TO_MATCH_GEOGRAPHY_ENTRY,
        }

        /**
         * An enum containing [ErrorCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ErrorCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTERNAL_ERROR,
            UNABLE_TO_RETRIEVE_DEFAULT_LOCATION,
            UNKNOWN_COUNTRY_CODE,
            UNABLE_TO_RETRIEVE_LOCATION,
            UNABLE_TO_RETRIEVE_PARTNER_INFO,
            UNABLE_TO_MATCH_GEOGRAPHY_ENTRY,
            /**
             * An enum member indicating that [ErrorCode] was instantiated with an unknown value.
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
                INTERNAL_ERROR -> Value.INTERNAL_ERROR
                UNABLE_TO_RETRIEVE_DEFAULT_LOCATION -> Value.UNABLE_TO_RETRIEVE_DEFAULT_LOCATION
                UNKNOWN_COUNTRY_CODE -> Value.UNKNOWN_COUNTRY_CODE
                UNABLE_TO_RETRIEVE_LOCATION -> Value.UNABLE_TO_RETRIEVE_LOCATION
                UNABLE_TO_RETRIEVE_PARTNER_INFO -> Value.UNABLE_TO_RETRIEVE_PARTNER_INFO
                UNABLE_TO_MATCH_GEOGRAPHY_ENTRY -> Value.UNABLE_TO_MATCH_GEOGRAPHY_ENTRY
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
                INTERNAL_ERROR -> Known.INTERNAL_ERROR
                UNABLE_TO_RETRIEVE_DEFAULT_LOCATION -> Known.UNABLE_TO_RETRIEVE_DEFAULT_LOCATION
                UNKNOWN_COUNTRY_CODE -> Known.UNKNOWN_COUNTRY_CODE
                UNABLE_TO_RETRIEVE_LOCATION -> Known.UNABLE_TO_RETRIEVE_LOCATION
                UNABLE_TO_RETRIEVE_PARTNER_INFO -> Known.UNABLE_TO_RETRIEVE_PARTNER_INFO
                UNABLE_TO_MATCH_GEOGRAPHY_ENTRY -> Known.UNABLE_TO_MATCH_GEOGRAPHY_ENTRY
                else -> throw TelnyxInvalidDataException("Unknown ErrorCode: $value")
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

        fun validate(): ErrorCode = apply {
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

            return other is ErrorCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Represents the status of the phone number entry upload on Telnyx. */
    class InternalStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PENDING_ASSIGNMENT = of("pending_assignment")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val ALL_INTERNAL_JOBS_COMPLETED = of("all_internal_jobs_completed")

            @JvmField val RELEASE_REQUESTED = of("release_requested")

            @JvmField val RELEASE_COMPLETED = of("release_completed")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = InternalStatus(JsonField.of(value))
        }

        /** An enum containing [InternalStatus]'s known values. */
        enum class Known {
            PENDING_ASSIGNMENT,
            IN_PROGRESS,
            ALL_INTERNAL_JOBS_COMPLETED,
            RELEASE_REQUESTED,
            RELEASE_COMPLETED,
            ERROR,
        }

        /**
         * An enum containing [InternalStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InternalStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING_ASSIGNMENT,
            IN_PROGRESS,
            ALL_INTERNAL_JOBS_COMPLETED,
            RELEASE_REQUESTED,
            RELEASE_COMPLETED,
            ERROR,
            /**
             * An enum member indicating that [InternalStatus] was instantiated with an unknown
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
                PENDING_ASSIGNMENT -> Value.PENDING_ASSIGNMENT
                IN_PROGRESS -> Value.IN_PROGRESS
                ALL_INTERNAL_JOBS_COMPLETED -> Value.ALL_INTERNAL_JOBS_COMPLETED
                RELEASE_REQUESTED -> Value.RELEASE_REQUESTED
                RELEASE_COMPLETED -> Value.RELEASE_COMPLETED
                ERROR -> Value.ERROR
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
                PENDING_ASSIGNMENT -> Known.PENDING_ASSIGNMENT
                IN_PROGRESS -> Known.IN_PROGRESS
                ALL_INTERNAL_JOBS_COMPLETED -> Known.ALL_INTERNAL_JOBS_COMPLETED
                RELEASE_REQUESTED -> Known.RELEASE_REQUESTED
                RELEASE_COMPLETED -> Known.RELEASE_COMPLETED
                ERROR -> Known.ERROR
                else -> throw TelnyxInvalidDataException("Unknown InternalStatus: $value")
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

        fun validate(): InternalStatus = apply {
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

            return other is InternalStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Represents the status of the phone number entry upload on Microsoft Teams. */
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

            @JvmField val PENDING_UPLOAD = of("pending_upload")

            @JvmField val PENDING = of("pending")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val SUCCESS = of("success")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING_UPLOAD,
            PENDING,
            IN_PROGRESS,
            SUCCESS,
            ERROR,
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
            PENDING_UPLOAD,
            PENDING,
            IN_PROGRESS,
            SUCCESS,
            ERROR,
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
                PENDING_UPLOAD -> Value.PENDING_UPLOAD
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                SUCCESS -> Value.SUCCESS
                ERROR -> Value.ERROR
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
                PENDING_UPLOAD -> Known.PENDING_UPLOAD
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                SUCCESS -> Known.SUCCESS
                ERROR -> Known.ERROR
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

        return other is TnUploadEntry &&
            civicAddressId == other.civicAddressId &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            internalStatus == other.internalStatus &&
            locationId == other.locationId &&
            numberId == other.numberId &&
            phoneNumber == other.phoneNumber &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            civicAddressId,
            errorCode,
            errorMessage,
            internalStatus,
            locationId,
            numberId,
            phoneNumber,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TnUploadEntry{civicAddressId=$civicAddressId, errorCode=$errorCode, errorMessage=$errorMessage, internalStatus=$internalStatus, locationId=$locationId, numberId=$numberId, phoneNumber=$phoneNumber, status=$status, additionalProperties=$additionalProperties}"
}
