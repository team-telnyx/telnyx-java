// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CarrierApprovalResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val approvalId: JsonField<String>,
    private val approvedAt: JsonField<OffsetDateTime>,
    private val carrier: JsonField<String>,
    private val rejectedReason: JsonField<String>,
    private val scopeType: JsonField<ScopeType>,
    private val status: JsonField<Status>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("approval_id")
        @ExcludeMissing
        approvalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approved_at")
        @ExcludeMissing
        approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejected_reason")
        @ExcludeMissing
        rejectedReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scope_type")
        @ExcludeMissing
        scopeType: JsonField<ScopeType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        approvalId,
        approvedAt,
        carrier,
        rejectedReason,
        scopeType,
        status,
        submittedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun approvalId(): String = approvalId.getRequired("approval_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedAt(): Optional<OffsetDateTime> = approvedAt.getOptional("approved_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrier(): Optional<String> = carrier.getOptional("carrier")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectedReason(): Optional<String> = rejectedReason.getOptional("rejected_reason")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeType(): ScopeType = scopeType.getRequired("scope_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submitted_at")

    /**
     * Returns the raw JSON value of [approvalId].
     *
     * Unlike [approvalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approval_id") @ExcludeMissing fun _approvalId(): JsonField<String> = approvalId

    /**
     * Returns the raw JSON value of [approvedAt].
     *
     * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approved_at")
    @ExcludeMissing
    fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

    /**
     * Returns the raw JSON value of [carrier].
     *
     * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

    /**
     * Returns the raw JSON value of [rejectedReason].
     *
     * Unlike [rejectedReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejected_reason")
    @ExcludeMissing
    fun _rejectedReason(): JsonField<String> = rejectedReason

    /**
     * Returns the raw JSON value of [scopeType].
     *
     * Unlike [scopeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope_type") @ExcludeMissing fun _scopeType(): JsonField<ScopeType> = scopeType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitted_at")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

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
         * Returns a mutable builder for constructing an instance of [CarrierApprovalResponse].
         *
         * The following fields are required:
         * ```java
         * .approvalId()
         * .approvedAt()
         * .carrier()
         * .rejectedReason()
         * .scopeType()
         * .status()
         * .submittedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CarrierApprovalResponse]. */
    class Builder internal constructor() {

        private var approvalId: JsonField<String>? = null
        private var approvedAt: JsonField<OffsetDateTime>? = null
        private var carrier: JsonField<String>? = null
        private var rejectedReason: JsonField<String>? = null
        private var scopeType: JsonField<ScopeType>? = null
        private var status: JsonField<Status>? = null
        private var submittedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(carrierApprovalResponse: CarrierApprovalResponse) = apply {
            approvalId = carrierApprovalResponse.approvalId
            approvedAt = carrierApprovalResponse.approvedAt
            carrier = carrierApprovalResponse.carrier
            rejectedReason = carrierApprovalResponse.rejectedReason
            scopeType = carrierApprovalResponse.scopeType
            status = carrierApprovalResponse.status
            submittedAt = carrierApprovalResponse.submittedAt
            additionalProperties = carrierApprovalResponse.additionalProperties.toMutableMap()
        }

        fun approvalId(approvalId: String) = approvalId(JsonField.of(approvalId))

        /**
         * Sets [Builder.approvalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approvalId(approvalId: JsonField<String>) = apply { this.approvalId = approvalId }

        fun approvedAt(approvedAt: OffsetDateTime?) = approvedAt(JsonField.ofNullable(approvedAt))

        /** Alias for calling [Builder.approvedAt] with `approvedAt.orElse(null)`. */
        fun approvedAt(approvedAt: Optional<OffsetDateTime>) = approvedAt(approvedAt.getOrNull())

        /**
         * Sets [Builder.approvedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
            this.approvedAt = approvedAt
        }

        fun carrier(carrier: String?) = carrier(JsonField.ofNullable(carrier))

        /** Alias for calling [Builder.carrier] with `carrier.orElse(null)`. */
        fun carrier(carrier: Optional<String>) = carrier(carrier.getOrNull())

        /**
         * Sets [Builder.carrier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

        fun rejectedReason(rejectedReason: String?) =
            rejectedReason(JsonField.ofNullable(rejectedReason))

        /** Alias for calling [Builder.rejectedReason] with `rejectedReason.orElse(null)`. */
        fun rejectedReason(rejectedReason: Optional<String>) =
            rejectedReason(rejectedReason.getOrNull())

        /**
         * Sets [Builder.rejectedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectedReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectedReason(rejectedReason: JsonField<String>) = apply {
            this.rejectedReason = rejectedReason
        }

        fun scopeType(scopeType: ScopeType) = scopeType(JsonField.of(scopeType))

        /**
         * Sets [Builder.scopeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeType] with a well-typed [ScopeType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopeType(scopeType: JsonField<ScopeType>) = apply { this.scopeType = scopeType }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun submittedAt(submittedAt: OffsetDateTime?) =
            submittedAt(JsonField.ofNullable(submittedAt))

        /** Alias for calling [Builder.submittedAt] with `submittedAt.orElse(null)`. */
        fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
            submittedAt(submittedAt.getOrNull())

        /**
         * Sets [Builder.submittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
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
         * Returns an immutable instance of [CarrierApprovalResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .approvalId()
         * .approvedAt()
         * .carrier()
         * .rejectedReason()
         * .scopeType()
         * .status()
         * .submittedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CarrierApprovalResponse =
            CarrierApprovalResponse(
                checkRequired("approvalId", approvalId),
                checkRequired("approvedAt", approvedAt),
                checkRequired("carrier", carrier),
                checkRequired("rejectedReason", rejectedReason),
                checkRequired("scopeType", scopeType),
                checkRequired("status", status),
                checkRequired("submittedAt", submittedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CarrierApprovalResponse = apply {
        if (validated) {
            return@apply
        }

        approvalId()
        approvedAt()
        carrier()
        rejectedReason()
        scopeType().validate()
        status().validate()
        submittedAt()
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
        (if (approvalId.asKnown().isPresent) 1 else 0) +
            (if (approvedAt.asKnown().isPresent) 1 else 0) +
            (if (carrier.asKnown().isPresent) 1 else 0) +
            (if (rejectedReason.asKnown().isPresent) 1 else 0) +
            (scopeType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0)

    class ScopeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CARRIER = of("carrier")

            @JvmField val HUB = of("hub")

            @JvmField val BOT = of("bot")

            @JvmStatic fun of(value: String) = ScopeType(JsonField.of(value))
        }

        /** An enum containing [ScopeType]'s known values. */
        enum class Known {
            CARRIER,
            HUB,
            BOT,
        }

        /**
         * An enum containing [ScopeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScopeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARRIER,
            HUB,
            BOT,
            /**
             * An enum member indicating that [ScopeType] was instantiated with an unknown value.
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
                CARRIER -> Value.CARRIER
                HUB -> Value.HUB
                BOT -> Value.BOT
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
                CARRIER -> Known.CARRIER
                HUB -> Known.HUB
                BOT -> Known.BOT
                else -> throw TelnyxInvalidDataException("Unknown ScopeType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ScopeType = apply {
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

            return other is ScopeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val SUBMITTED = of("SUBMITTED")

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            SUBMITTED,
            APPROVED,
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
            SUBMITTED,
            APPROVED,
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
                SUBMITTED -> Value.SUBMITTED
                APPROVED -> Value.APPROVED
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
                SUBMITTED -> Known.SUBMITTED
                APPROVED -> Known.APPROVED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is CarrierApprovalResponse &&
            approvalId == other.approvalId &&
            approvedAt == other.approvedAt &&
            carrier == other.carrier &&
            rejectedReason == other.rejectedReason &&
            scopeType == other.scopeType &&
            status == other.status &&
            submittedAt == other.submittedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            approvalId,
            approvedAt,
            carrier,
            rejectedReason,
            scopeType,
            status,
            submittedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CarrierApprovalResponse{approvalId=$approvalId, approvedAt=$approvedAt, carrier=$carrier, rejectedReason=$rejectedReason, scopeType=$scopeType, status=$status, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
}
