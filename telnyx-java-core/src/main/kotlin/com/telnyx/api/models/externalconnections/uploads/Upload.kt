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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Upload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availableUsages: JsonField<List<AvailableUsage>>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val locationId: JsonField<String>,
    private val status: JsonField<Status>,
    private val tenantId: JsonField<String>,
    private val ticketId: JsonField<String>,
    private val tnUploadEntries: JsonField<List<TnUploadEntry>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_usages")
        @ExcludeMissing
        availableUsages: JsonField<List<AvailableUsage>> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location_id")
        @ExcludeMissing
        locationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ticket_id") @ExcludeMissing ticketId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tn_upload_entries")
        @ExcludeMissing
        tnUploadEntries: JsonField<List<TnUploadEntry>> = JsonMissing.of(),
    ) : this(
        availableUsages,
        errorCode,
        errorMessage,
        locationId,
        status,
        tenantId,
        ticketId,
        tnUploadEntries,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableUsages(): Optional<List<AvailableUsage>> =
        availableUsages.getOptional("available_usages")

    /**
     * A code returned by Microsoft Teams if there is an error with the upload process.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

    /**
     * A message set if there is an error with the upload process.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationId(): Optional<String> = locationId.getOptional("location_id")

    /**
     * Represents the status of the upload on Microsoft Teams.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Uniquely identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticketId(): Optional<String> = ticketId.getOptional("ticket_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tnUploadEntries(): Optional<List<TnUploadEntry>> =
        tnUploadEntries.getOptional("tn_upload_entries")

    /**
     * Returns the raw JSON value of [availableUsages].
     *
     * Unlike [availableUsages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_usages")
    @ExcludeMissing
    fun _availableUsages(): JsonField<List<AvailableUsage>> = availableUsages

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [locationId].
     *
     * Unlike [locationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location_id") @ExcludeMissing fun _locationId(): JsonField<String> = locationId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [ticketId].
     *
     * Unlike [ticketId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ticket_id") @ExcludeMissing fun _ticketId(): JsonField<String> = ticketId

    /**
     * Returns the raw JSON value of [tnUploadEntries].
     *
     * Unlike [tnUploadEntries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tn_upload_entries")
    @ExcludeMissing
    fun _tnUploadEntries(): JsonField<List<TnUploadEntry>> = tnUploadEntries

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

        /** Returns a mutable builder for constructing an instance of [Upload]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Upload]. */
    class Builder internal constructor() {

        private var availableUsages: JsonField<MutableList<AvailableUsage>>? = null
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var locationId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var ticketId: JsonField<String> = JsonMissing.of()
        private var tnUploadEntries: JsonField<MutableList<TnUploadEntry>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(upload: Upload) = apply {
            availableUsages = upload.availableUsages.map { it.toMutableList() }
            errorCode = upload.errorCode
            errorMessage = upload.errorMessage
            locationId = upload.locationId
            status = upload.status
            tenantId = upload.tenantId
            ticketId = upload.ticketId
            tnUploadEntries = upload.tnUploadEntries.map { it.toMutableList() }
            additionalProperties = upload.additionalProperties.toMutableMap()
        }

        fun availableUsages(availableUsages: List<AvailableUsage>) =
            availableUsages(JsonField.of(availableUsages))

        /**
         * Sets [Builder.availableUsages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableUsages] with a well-typed
         * `List<AvailableUsage>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun availableUsages(availableUsages: JsonField<List<AvailableUsage>>) = apply {
            this.availableUsages = availableUsages.map { it.toMutableList() }
        }

        /**
         * Adds a single [AvailableUsage] to [availableUsages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableUsage(availableUsage: AvailableUsage) = apply {
            availableUsages =
                (availableUsages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableUsages", it).add(availableUsage)
                }
        }

        /** A code returned by Microsoft Teams if there is an error with the upload process. */
        fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        /** A message set if there is an error with the upload process. */
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

        fun locationId(locationId: String) = locationId(JsonField.of(locationId))

        /**
         * Sets [Builder.locationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationId(locationId: JsonField<String>) = apply { this.locationId = locationId }

        /** Represents the status of the upload on Microsoft Teams. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        /** Uniquely identifies the resource. */
        fun ticketId(ticketId: String) = ticketId(JsonField.of(ticketId))

        /**
         * Sets [Builder.ticketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticketId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ticketId(ticketId: JsonField<String>) = apply { this.ticketId = ticketId }

        fun tnUploadEntries(tnUploadEntries: List<TnUploadEntry>) =
            tnUploadEntries(JsonField.of(tnUploadEntries))

        /**
         * Sets [Builder.tnUploadEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tnUploadEntries] with a well-typed `List<TnUploadEntry>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tnUploadEntries(tnUploadEntries: JsonField<List<TnUploadEntry>>) = apply {
            this.tnUploadEntries = tnUploadEntries.map { it.toMutableList() }
        }

        /**
         * Adds a single [TnUploadEntry] to [tnUploadEntries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTnUploadEntry(tnUploadEntry: TnUploadEntry) = apply {
            tnUploadEntries =
                (tnUploadEntries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tnUploadEntries", it).add(tnUploadEntry)
                }
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
         * Returns an immutable instance of [Upload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Upload =
            Upload(
                (availableUsages ?: JsonMissing.of()).map { it.toImmutable() },
                errorCode,
                errorMessage,
                locationId,
                status,
                tenantId,
                ticketId,
                (tnUploadEntries ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Upload = apply {
        if (validated) {
            return@apply
        }

        availableUsages().ifPresent { it.forEach { it.validate() } }
        errorCode()
        errorMessage()
        locationId()
        status().ifPresent { it.validate() }
        tenantId()
        ticketId()
        tnUploadEntries().ifPresent { it.forEach { it.validate() } }
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
        (availableUsages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (locationId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (ticketId.asKnown().isPresent) 1 else 0) +
            (tnUploadEntries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Available usages for the numbers in the upload on Microsoft Teams. */
    class AvailableUsage @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CALLING_USER_ASSIGNMENT = of("calling_user_assignment")

            @JvmField val FIRST_PARTY_APP_ASSIGNMENT = of("first_party_app_assignment")

            @JvmStatic fun of(value: String) = AvailableUsage(JsonField.of(value))
        }

        /** An enum containing [AvailableUsage]'s known values. */
        enum class Known {
            CALLING_USER_ASSIGNMENT,
            FIRST_PARTY_APP_ASSIGNMENT,
        }

        /**
         * An enum containing [AvailableUsage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AvailableUsage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALLING_USER_ASSIGNMENT,
            FIRST_PARTY_APP_ASSIGNMENT,
            /**
             * An enum member indicating that [AvailableUsage] was instantiated with an unknown
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
                CALLING_USER_ASSIGNMENT -> Value.CALLING_USER_ASSIGNMENT
                FIRST_PARTY_APP_ASSIGNMENT -> Value.FIRST_PARTY_APP_ASSIGNMENT
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
                CALLING_USER_ASSIGNMENT -> Known.CALLING_USER_ASSIGNMENT
                FIRST_PARTY_APP_ASSIGNMENT -> Known.FIRST_PARTY_APP_ASSIGNMENT
                else -> throw TelnyxInvalidDataException("Unknown AvailableUsage: $value")
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

        fun validate(): AvailableUsage = apply {
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

            return other is AvailableUsage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Represents the status of the upload on Microsoft Teams. */
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

            @JvmField val PARTIAL_SUCCESS = of("partial_success")

            @JvmField val SUCCESS = of("success")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING_UPLOAD,
            PENDING,
            IN_PROGRESS,
            PARTIAL_SUCCESS,
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
            PARTIAL_SUCCESS,
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
                PARTIAL_SUCCESS -> Value.PARTIAL_SUCCESS
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
                PARTIAL_SUCCESS -> Known.PARTIAL_SUCCESS
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

        return other is Upload &&
            availableUsages == other.availableUsages &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            locationId == other.locationId &&
            status == other.status &&
            tenantId == other.tenantId &&
            ticketId == other.ticketId &&
            tnUploadEntries == other.tnUploadEntries &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            availableUsages,
            errorCode,
            errorMessage,
            locationId,
            status,
            tenantId,
            ticketId,
            tnUploadEntries,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Upload{availableUsages=$availableUsages, errorCode=$errorCode, errorMessage=$errorMessage, locationId=$locationId, status=$status, tenantId=$tenantId, ticketId=$ticketId, tnUploadEntries=$tnUploadEntries, additionalProperties=$additionalProperties}"
}
