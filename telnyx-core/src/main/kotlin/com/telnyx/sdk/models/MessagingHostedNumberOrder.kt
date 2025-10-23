// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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

class MessagingHostedNumberOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val phoneNumbers: JsonField<List<HostedNumber>>,
    private val recordType: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<HostedNumber>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(id, messagingProfileId, phoneNumbers, recordType, status, mutableMapOf())

    /**
     * Resource unique identifier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Automatically associate the number with this messaging profile ID when the order is complete.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<HostedNumber>> = phoneNumbers.getOptional("phone_numbers")

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
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<HostedNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

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

        /**
         * Returns a mutable builder for constructing an instance of [MessagingHostedNumberOrder].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingHostedNumberOrder]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<HostedNumber>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingHostedNumberOrder: MessagingHostedNumberOrder) = apply {
            id = messagingHostedNumberOrder.id
            messagingProfileId = messagingHostedNumberOrder.messagingProfileId
            phoneNumbers = messagingHostedNumberOrder.phoneNumbers.map { it.toMutableList() }
            recordType = messagingHostedNumberOrder.recordType
            status = messagingHostedNumberOrder.status
            additionalProperties = messagingHostedNumberOrder.additionalProperties.toMutableMap()
        }

        /** Resource unique identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Automatically associate the number with this messaging profile ID when the order is
         * complete.
         */
        fun messagingProfileId(messagingProfileId: String?) =
            messagingProfileId(JsonField.ofNullable(messagingProfileId))

        /**
         * Alias for calling [Builder.messagingProfileId] with `messagingProfileId.orElse(null)`.
         */
        fun messagingProfileId(messagingProfileId: Optional<String>) =
            messagingProfileId(messagingProfileId.getOrNull())

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

        fun phoneNumbers(phoneNumbers: List<HostedNumber>) =
            phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<HostedNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<HostedNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [HostedNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: HostedNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

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
         * Returns an immutable instance of [MessagingHostedNumberOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingHostedNumberOrder =
            MessagingHostedNumberOrder(
                id,
                messagingProfileId,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingHostedNumberOrder = apply {
        if (validated) {
            return@apply
        }

        id()
        messagingProfileId()
        phoneNumbers().ifPresent { it.forEach { it.validate() } }
        recordType()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val CARRIER_REJECTED = of("carrier_rejected")

            @JvmField val COMPLIANCE_REVIEW_FAILED = of("compliance_review_failed")

            @JvmField val DELETED = of("deleted")

            @JvmField val FAILED = of("failed")

            @JvmField val INCOMPLETE_DOCUMENTATION = of("incomplete_documentation")

            @JvmField val INCORRECT_BILLING_INFORMATION = of("incorrect_billing_information")

            @JvmField val INELIGIBLE_CARRIER = of("ineligible_carrier")

            @JvmField val LOA_FILE_INVALID = of("loa_file_invalid")

            @JvmField val LOA_FILE_SUCCESSFUL = of("loa_file_successful")

            @JvmField val PENDING = of("pending")

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val SUCCESSFUL = of("successful")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CARRIER_REJECTED,
            COMPLIANCE_REVIEW_FAILED,
            DELETED,
            FAILED,
            INCOMPLETE_DOCUMENTATION,
            INCORRECT_BILLING_INFORMATION,
            INELIGIBLE_CARRIER,
            LOA_FILE_INVALID,
            LOA_FILE_SUCCESSFUL,
            PENDING,
            PROVISIONING,
            SUCCESSFUL,
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
            CARRIER_REJECTED,
            COMPLIANCE_REVIEW_FAILED,
            DELETED,
            FAILED,
            INCOMPLETE_DOCUMENTATION,
            INCORRECT_BILLING_INFORMATION,
            INELIGIBLE_CARRIER,
            LOA_FILE_INVALID,
            LOA_FILE_SUCCESSFUL,
            PENDING,
            PROVISIONING,
            SUCCESSFUL,
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
                CARRIER_REJECTED -> Value.CARRIER_REJECTED
                COMPLIANCE_REVIEW_FAILED -> Value.COMPLIANCE_REVIEW_FAILED
                DELETED -> Value.DELETED
                FAILED -> Value.FAILED
                INCOMPLETE_DOCUMENTATION -> Value.INCOMPLETE_DOCUMENTATION
                INCORRECT_BILLING_INFORMATION -> Value.INCORRECT_BILLING_INFORMATION
                INELIGIBLE_CARRIER -> Value.INELIGIBLE_CARRIER
                LOA_FILE_INVALID -> Value.LOA_FILE_INVALID
                LOA_FILE_SUCCESSFUL -> Value.LOA_FILE_SUCCESSFUL
                PENDING -> Value.PENDING
                PROVISIONING -> Value.PROVISIONING
                SUCCESSFUL -> Value.SUCCESSFUL
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
                CARRIER_REJECTED -> Known.CARRIER_REJECTED
                COMPLIANCE_REVIEW_FAILED -> Known.COMPLIANCE_REVIEW_FAILED
                DELETED -> Known.DELETED
                FAILED -> Known.FAILED
                INCOMPLETE_DOCUMENTATION -> Known.INCOMPLETE_DOCUMENTATION
                INCORRECT_BILLING_INFORMATION -> Known.INCORRECT_BILLING_INFORMATION
                INELIGIBLE_CARRIER -> Known.INELIGIBLE_CARRIER
                LOA_FILE_INVALID -> Known.LOA_FILE_INVALID
                LOA_FILE_SUCCESSFUL -> Known.LOA_FILE_SUCCESSFUL
                PENDING -> Known.PENDING
                PROVISIONING -> Known.PROVISIONING
                SUCCESSFUL -> Known.SUCCESSFUL
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

        return other is MessagingHostedNumberOrder &&
            id == other.id &&
            messagingProfileId == other.messagingProfileId &&
            phoneNumbers == other.phoneNumbers &&
            recordType == other.recordType &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, messagingProfileId, phoneNumbers, recordType, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingHostedNumberOrder{id=$id, messagingProfileId=$messagingProfileId, phoneNumbers=$phoneNumbers, recordType=$recordType, status=$status, additionalProperties=$additionalProperties}"
}
