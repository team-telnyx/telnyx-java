// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EnterpriseReputationPublic
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val checkFrequency: JsonField<CheckFrequency>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val enterpriseId: JsonField<String>,
    private val loaDocumentId: JsonField<String>,
    private val rejectionReasons: JsonField<List<String>>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("check_frequency")
        @ExcludeMissing
        checkFrequency: JsonField<CheckFrequency> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loa_document_id")
        @ExcludeMissing
        loaDocumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejection_reasons")
        @ExcludeMissing
        rejectionReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        checkFrequency,
        createdAt,
        enterpriseId,
        loaDocumentId,
        rejectionReasons,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Frequency for refreshing reputation data
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkFrequency(): Optional<CheckFrequency> = checkFrequency.getOptional("check_frequency")

    /**
     * When the reputation settings were created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * ID of the associated enterprise
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * ID of the signed LOA document
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loaDocumentId(): Optional<String> = loaDocumentId.getOptional("loa_document_id")

    /**
     * Reasons for rejection (present when status is rejected)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReasons(): Optional<List<String>> =
        rejectionReasons.getOptional("rejection_reasons")

    /**
     * Current enrollment status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * When the reputation settings were last updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [checkFrequency].
     *
     * Unlike [checkFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("check_frequency")
    @ExcludeMissing
    fun _checkFrequency(): JsonField<CheckFrequency> = checkFrequency

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [enterpriseId].
     *
     * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enterprise_id")
    @ExcludeMissing
    fun _enterpriseId(): JsonField<String> = enterpriseId

    /**
     * Returns the raw JSON value of [loaDocumentId].
     *
     * Unlike [loaDocumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loa_document_id")
    @ExcludeMissing
    fun _loaDocumentId(): JsonField<String> = loaDocumentId

    /**
     * Returns the raw JSON value of [rejectionReasons].
     *
     * Unlike [rejectionReasons], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rejection_reasons")
    @ExcludeMissing
    fun _rejectionReasons(): JsonField<List<String>> = rejectionReasons

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
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [EnterpriseReputationPublic].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnterpriseReputationPublic]. */
    class Builder internal constructor() {

        private var checkFrequency: JsonField<CheckFrequency> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var loaDocumentId: JsonField<String> = JsonMissing.of()
        private var rejectionReasons: JsonField<MutableList<String>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enterpriseReputationPublic: EnterpriseReputationPublic) = apply {
            checkFrequency = enterpriseReputationPublic.checkFrequency
            createdAt = enterpriseReputationPublic.createdAt
            enterpriseId = enterpriseReputationPublic.enterpriseId
            loaDocumentId = enterpriseReputationPublic.loaDocumentId
            rejectionReasons =
                enterpriseReputationPublic.rejectionReasons.map { it.toMutableList() }
            status = enterpriseReputationPublic.status
            updatedAt = enterpriseReputationPublic.updatedAt
            additionalProperties = enterpriseReputationPublic.additionalProperties.toMutableMap()
        }

        /** Frequency for refreshing reputation data */
        fun checkFrequency(checkFrequency: CheckFrequency) =
            checkFrequency(JsonField.of(checkFrequency))

        /**
         * Sets [Builder.checkFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkFrequency] with a well-typed [CheckFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun checkFrequency(checkFrequency: JsonField<CheckFrequency>) = apply {
            this.checkFrequency = checkFrequency
        }

        /** When the reputation settings were created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** ID of the associated enterprise */
        fun enterpriseId(enterpriseId: String) = enterpriseId(JsonField.of(enterpriseId))

        /**
         * Sets [Builder.enterpriseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enterpriseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enterpriseId(enterpriseId: JsonField<String>) = apply {
            this.enterpriseId = enterpriseId
        }

        /** ID of the signed LOA document */
        fun loaDocumentId(loaDocumentId: String?) =
            loaDocumentId(JsonField.ofNullable(loaDocumentId))

        /** Alias for calling [Builder.loaDocumentId] with `loaDocumentId.orElse(null)`. */
        fun loaDocumentId(loaDocumentId: Optional<String>) =
            loaDocumentId(loaDocumentId.getOrNull())

        /**
         * Sets [Builder.loaDocumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loaDocumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun loaDocumentId(loaDocumentId: JsonField<String>) = apply {
            this.loaDocumentId = loaDocumentId
        }

        /** Reasons for rejection (present when status is rejected) */
        fun rejectionReasons(rejectionReasons: List<String>?) =
            rejectionReasons(JsonField.ofNullable(rejectionReasons))

        /** Alias for calling [Builder.rejectionReasons] with `rejectionReasons.orElse(null)`. */
        fun rejectionReasons(rejectionReasons: Optional<List<String>>) =
            rejectionReasons(rejectionReasons.getOrNull())

        /**
         * Sets [Builder.rejectionReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReasons] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectionReasons(rejectionReasons: JsonField<List<String>>) = apply {
            this.rejectionReasons = rejectionReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [rejectionReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRejectionReason(rejectionReason: String) = apply {
            rejectionReasons =
                (rejectionReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rejectionReasons", it).add(rejectionReason)
                }
        }

        /** Current enrollment status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When the reputation settings were last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [EnterpriseReputationPublic].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnterpriseReputationPublic =
            EnterpriseReputationPublic(
                checkFrequency,
                createdAt,
                enterpriseId,
                loaDocumentId,
                (rejectionReasons ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EnterpriseReputationPublic = apply {
        if (validated) {
            return@apply
        }

        checkFrequency().ifPresent { it.validate() }
        createdAt()
        enterpriseId()
        loaDocumentId()
        rejectionReasons()
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
        (checkFrequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (if (loaDocumentId.asKnown().isPresent) 1 else 0) +
            (rejectionReasons.asKnown().getOrNull()?.size ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Frequency for refreshing reputation data */
    class CheckFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BUSINESS_DAILY = of("business_daily")

            @JvmField val DAILY = of("daily")

            @JvmField val WEEKLY = of("weekly")

            @JvmField val BIWEEKLY = of("biweekly")

            @JvmField val MONTHLY = of("monthly")

            @JvmField val NEVER = of("never")

            @JvmStatic fun of(value: String) = CheckFrequency(JsonField.of(value))
        }

        /** An enum containing [CheckFrequency]'s known values. */
        enum class Known {
            BUSINESS_DAILY,
            DAILY,
            WEEKLY,
            BIWEEKLY,
            MONTHLY,
            NEVER,
        }

        /**
         * An enum containing [CheckFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CheckFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS_DAILY,
            DAILY,
            WEEKLY,
            BIWEEKLY,
            MONTHLY,
            NEVER,
            /**
             * An enum member indicating that [CheckFrequency] was instantiated with an unknown
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
                BUSINESS_DAILY -> Value.BUSINESS_DAILY
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                BIWEEKLY -> Value.BIWEEKLY
                MONTHLY -> Value.MONTHLY
                NEVER -> Value.NEVER
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
                BUSINESS_DAILY -> Known.BUSINESS_DAILY
                DAILY -> Known.DAILY
                WEEKLY -> Known.WEEKLY
                BIWEEKLY -> Known.BIWEEKLY
                MONTHLY -> Known.MONTHLY
                NEVER -> Known.NEVER
                else -> throw TelnyxInvalidDataException("Unknown CheckFrequency: $value")
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

        fun validate(): CheckFrequency = apply {
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

            return other is CheckFrequency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current enrollment status */
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

            @JvmField val APPROVED = of("approved")

            @JvmField val REJECTED = of("rejected")

            @JvmField val DELETED = of("deleted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            APPROVED,
            REJECTED,
            DELETED,
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
            APPROVED,
            REJECTED,
            DELETED,
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
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
                DELETED -> Value.DELETED
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
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                DELETED -> Known.DELETED
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

        return other is EnterpriseReputationPublic &&
            checkFrequency == other.checkFrequency &&
            createdAt == other.createdAt &&
            enterpriseId == other.enterpriseId &&
            loaDocumentId == other.loaDocumentId &&
            rejectionReasons == other.rejectionReasons &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            checkFrequency,
            createdAt,
            enterpriseId,
            loaDocumentId,
            rejectionReasons,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnterpriseReputationPublic{checkFrequency=$checkFrequency, createdAt=$createdAt, enterpriseId=$enterpriseId, loaDocumentId=$loaDocumentId, rejectionReasons=$rejectionReasons, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
