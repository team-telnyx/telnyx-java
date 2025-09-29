// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyendpoints

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DynamicEmergencyEndpoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callbackNumber: JsonField<String>,
    private val callerName: JsonField<String>,
    private val dynamicEmergencyAddressId: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val recordType: JsonField<String>,
    private val sipFromId: JsonField<String>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("callback_number")
        @ExcludeMissing
        callbackNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("caller_name")
        @ExcludeMissing
        callerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dynamic_emergency_address_id")
        @ExcludeMissing
        dynamicEmergencyAddressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sip_from_id")
        @ExcludeMissing
        sipFromId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        callbackNumber,
        callerName,
        dynamicEmergencyAddressId,
        id,
        createdAt,
        recordType,
        sipFromId,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callbackNumber(): String = callbackNumber.getRequired("callback_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callerName(): String = callerName.getRequired("caller_name")

    /**
     * An id of a currently active dynamic emergency location.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dynamicEmergencyAddressId(): String =
        dynamicEmergencyAddressId.getRequired("dynamic_emergency_address_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date of when the resource was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipFromId(): Optional<String> = sipFromId.getOptional("sip_from_id")

    /**
     * Status of dynamic emergency address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * ISO 8601 formatted date of when the resource was last updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [callbackNumber].
     *
     * Unlike [callbackNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callback_number")
    @ExcludeMissing
    fun _callbackNumber(): JsonField<String> = callbackNumber

    /**
     * Returns the raw JSON value of [callerName].
     *
     * Unlike [callerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("caller_name") @ExcludeMissing fun _callerName(): JsonField<String> = callerName

    /**
     * Returns the raw JSON value of [dynamicEmergencyAddressId].
     *
     * Unlike [dynamicEmergencyAddressId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dynamic_emergency_address_id")
    @ExcludeMissing
    fun _dynamicEmergencyAddressId(): JsonField<String> = dynamicEmergencyAddressId

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [sipFromId].
     *
     * Unlike [sipFromId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sip_from_id") @ExcludeMissing fun _sipFromId(): JsonField<String> = sipFromId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [DynamicEmergencyEndpoint].
         *
         * The following fields are required:
         * ```java
         * .callbackNumber()
         * .callerName()
         * .dynamicEmergencyAddressId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DynamicEmergencyEndpoint]. */
    class Builder internal constructor() {

        private var callbackNumber: JsonField<String>? = null
        private var callerName: JsonField<String>? = null
        private var dynamicEmergencyAddressId: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var sipFromId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dynamicEmergencyEndpoint: DynamicEmergencyEndpoint) = apply {
            callbackNumber = dynamicEmergencyEndpoint.callbackNumber
            callerName = dynamicEmergencyEndpoint.callerName
            dynamicEmergencyAddressId = dynamicEmergencyEndpoint.dynamicEmergencyAddressId
            id = dynamicEmergencyEndpoint.id
            createdAt = dynamicEmergencyEndpoint.createdAt
            recordType = dynamicEmergencyEndpoint.recordType
            sipFromId = dynamicEmergencyEndpoint.sipFromId
            status = dynamicEmergencyEndpoint.status
            updatedAt = dynamicEmergencyEndpoint.updatedAt
            additionalProperties = dynamicEmergencyEndpoint.additionalProperties.toMutableMap()
        }

        fun callbackNumber(callbackNumber: String) = callbackNumber(JsonField.of(callbackNumber))

        /**
         * Sets [Builder.callbackNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callbackNumber(callbackNumber: JsonField<String>) = apply {
            this.callbackNumber = callbackNumber
        }

        fun callerName(callerName: String) = callerName(JsonField.of(callerName))

        /**
         * Sets [Builder.callerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callerName(callerName: JsonField<String>) = apply { this.callerName = callerName }

        /** An id of a currently active dynamic emergency location. */
        fun dynamicEmergencyAddressId(dynamicEmergencyAddressId: String) =
            dynamicEmergencyAddressId(JsonField.of(dynamicEmergencyAddressId))

        /**
         * Sets [Builder.dynamicEmergencyAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicEmergencyAddressId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicEmergencyAddressId(dynamicEmergencyAddressId: JsonField<String>) = apply {
            this.dynamicEmergencyAddressId = dynamicEmergencyAddressId
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 8601 formatted date of when the resource was created */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

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

        fun sipFromId(sipFromId: String) = sipFromId(JsonField.of(sipFromId))

        /**
         * Sets [Builder.sipFromId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipFromId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipFromId(sipFromId: JsonField<String>) = apply { this.sipFromId = sipFromId }

        /** Status of dynamic emergency address */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** ISO 8601 formatted date of when the resource was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [DynamicEmergencyEndpoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callbackNumber()
         * .callerName()
         * .dynamicEmergencyAddressId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DynamicEmergencyEndpoint =
            DynamicEmergencyEndpoint(
                checkRequired("callbackNumber", callbackNumber),
                checkRequired("callerName", callerName),
                checkRequired("dynamicEmergencyAddressId", dynamicEmergencyAddressId),
                id,
                createdAt,
                recordType,
                sipFromId,
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DynamicEmergencyEndpoint = apply {
        if (validated) {
            return@apply
        }

        callbackNumber()
        callerName()
        dynamicEmergencyAddressId()
        id()
        createdAt()
        recordType()
        sipFromId()
        status().ifPresent { it.validate() }
        updatedAt()
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
        (if (callbackNumber.asKnown().isPresent) 1 else 0) +
            (if (callerName.asKnown().isPresent) 1 else 0) +
            (if (dynamicEmergencyAddressId.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (sipFromId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Status of dynamic emergency address */
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

            @JvmField val ACTIVATED = of("activated")

            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACTIVATED,
            REJECTED,
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
            ACTIVATED,
            REJECTED,
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
                ACTIVATED -> Value.ACTIVATED
                REJECTED -> Value.REJECTED
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
                ACTIVATED -> Known.ACTIVATED
                REJECTED -> Known.REJECTED
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

        return other is DynamicEmergencyEndpoint &&
            callbackNumber == other.callbackNumber &&
            callerName == other.callerName &&
            dynamicEmergencyAddressId == other.dynamicEmergencyAddressId &&
            id == other.id &&
            createdAt == other.createdAt &&
            recordType == other.recordType &&
            sipFromId == other.sipFromId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callbackNumber,
            callerName,
            dynamicEmergencyAddressId,
            id,
            createdAt,
            recordType,
            sipFromId,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DynamicEmergencyEndpoint{callbackNumber=$callbackNumber, callerName=$callerName, dynamicEmergencyAddressId=$dynamicEmergencyAddressId, id=$id, createdAt=$createdAt, recordType=$recordType, sipFromId=$sipFromId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
