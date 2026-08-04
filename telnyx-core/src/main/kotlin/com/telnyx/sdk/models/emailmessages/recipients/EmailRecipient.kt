// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

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

class EmailRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val address: JsonField<String>,
    private val billable: JsonField<Boolean>,
    private val kind: JsonField<Kind>,
    private val messageId: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val status: JsonField<Status>,
    private val deliveredAt: JsonField<OffsetDateTime>,
    private val failedAt: JsonField<OffsetDateTime>,
    private val sentAt: JsonField<OffsetDateTime>,
    private val smtpCode: JsonField<Long>,
    private val smtpResponse: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billable") @ExcludeMissing billable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("delivered_at")
        @ExcludeMissing
        deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failed_at")
        @ExcludeMissing
        failedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sent_at")
        @ExcludeMissing
        sentAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("smtp_code") @ExcludeMissing smtpCode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("smtp_response")
        @ExcludeMissing
        smtpResponse: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        address,
        billable,
        kind,
        messageId,
        recordType,
        status,
        deliveredAt,
        failedAt,
        sentAt,
        smtpCode,
        smtpResponse,
        mutableMapOf(),
    )

    /**
     * Recipient UUID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Recipient email address. Null for BCC recipients (redacted for privacy).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<String> = address.getOptional("address")

    /**
     * Whether this recipient's delivery is billable (set on queue acceptance).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billable(): Boolean = billable.getRequired("billable")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): Kind = kind.getRequired("kind")

    /**
     * Parent email message UUID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageId(): String = messageId.getRequired("message_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * Current per-recipient delivery status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveredAt(): Optional<OffsetDateTime> = deliveredAt.getOptional("delivered_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedAt(): Optional<OffsetDateTime> = failedAt.getOptional("failed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentAt(): Optional<OffsetDateTime> = sentAt.getOptional("sent_at")

    /**
     * SMTP response code when available (e.g. 550 for bounces).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smtpCode(): Optional<Long> = smtpCode.getOptional("smtp_code")

    /**
     * SMTP response message when available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smtpResponse(): Optional<String> = smtpResponse.getOptional("smtp_response")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [billable].
     *
     * Unlike [billable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billable") @ExcludeMissing fun _billable(): JsonField<Boolean> = billable

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [deliveredAt].
     *
     * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delivered_at")
    @ExcludeMissing
    fun _deliveredAt(): JsonField<OffsetDateTime> = deliveredAt

    /**
     * Returns the raw JSON value of [failedAt].
     *
     * Unlike [failedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed_at") @ExcludeMissing fun _failedAt(): JsonField<OffsetDateTime> = failedAt

    /**
     * Returns the raw JSON value of [sentAt].
     *
     * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<OffsetDateTime> = sentAt

    /**
     * Returns the raw JSON value of [smtpCode].
     *
     * Unlike [smtpCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("smtp_code") @ExcludeMissing fun _smtpCode(): JsonField<Long> = smtpCode

    /**
     * Returns the raw JSON value of [smtpResponse].
     *
     * Unlike [smtpResponse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("smtp_response")
    @ExcludeMissing
    fun _smtpResponse(): JsonField<String> = smtpResponse

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
         * Returns a mutable builder for constructing an instance of [EmailRecipient].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .address()
         * .billable()
         * .kind()
         * .messageId()
         * .recordType()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailRecipient]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var address: JsonField<String>? = null
        private var billable: JsonField<Boolean>? = null
        private var kind: JsonField<Kind>? = null
        private var messageId: JsonField<String>? = null
        private var recordType: JsonField<RecordType>? = null
        private var status: JsonField<Status>? = null
        private var deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var failedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sentAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var smtpCode: JsonField<Long> = JsonMissing.of()
        private var smtpResponse: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailRecipient: EmailRecipient) = apply {
            id = emailRecipient.id
            address = emailRecipient.address
            billable = emailRecipient.billable
            kind = emailRecipient.kind
            messageId = emailRecipient.messageId
            recordType = emailRecipient.recordType
            status = emailRecipient.status
            deliveredAt = emailRecipient.deliveredAt
            failedAt = emailRecipient.failedAt
            sentAt = emailRecipient.sentAt
            smtpCode = emailRecipient.smtpCode
            smtpResponse = emailRecipient.smtpResponse
            additionalProperties = emailRecipient.additionalProperties.toMutableMap()
        }

        /** Recipient UUID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Recipient email address. Null for BCC recipients (redacted for privacy). */
        fun address(address: String?) = address(JsonField.ofNullable(address))

        /** Alias for calling [Builder.address] with `address.orElse(null)`. */
        fun address(address: Optional<String>) = address(address.getOrNull())

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /** Whether this recipient's delivery is billable (set on queue acceptance). */
        fun billable(billable: Boolean) = billable(JsonField.of(billable))

        /**
         * Sets [Builder.billable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billable(billable: JsonField<Boolean>) = apply { this.billable = billable }

        fun kind(kind: Kind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [Kind] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

        /** Parent email message UUID. */
        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** Current per-recipient delivery status. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun deliveredAt(deliveredAt: OffsetDateTime?) =
            deliveredAt(JsonField.ofNullable(deliveredAt))

        /** Alias for calling [Builder.deliveredAt] with `deliveredAt.orElse(null)`. */
        fun deliveredAt(deliveredAt: Optional<OffsetDateTime>) =
            deliveredAt(deliveredAt.getOrNull())

        /**
         * Sets [Builder.deliveredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deliveredAt(deliveredAt: JsonField<OffsetDateTime>) = apply {
            this.deliveredAt = deliveredAt
        }

        fun failedAt(failedAt: OffsetDateTime?) = failedAt(JsonField.ofNullable(failedAt))

        /** Alias for calling [Builder.failedAt] with `failedAt.orElse(null)`. */
        fun failedAt(failedAt: Optional<OffsetDateTime>) = failedAt(failedAt.getOrNull())

        /**
         * Sets [Builder.failedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failedAt(failedAt: JsonField<OffsetDateTime>) = apply { this.failedAt = failedAt }

        fun sentAt(sentAt: OffsetDateTime?) = sentAt(JsonField.ofNullable(sentAt))

        /** Alias for calling [Builder.sentAt] with `sentAt.orElse(null)`. */
        fun sentAt(sentAt: Optional<OffsetDateTime>) = sentAt(sentAt.getOrNull())

        /**
         * Sets [Builder.sentAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sentAt(sentAt: JsonField<OffsetDateTime>) = apply { this.sentAt = sentAt }

        /** SMTP response code when available (e.g. 550 for bounces). */
        fun smtpCode(smtpCode: Long?) = smtpCode(JsonField.ofNullable(smtpCode))

        /**
         * Alias for [Builder.smtpCode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun smtpCode(smtpCode: Long) = smtpCode(smtpCode as Long?)

        /** Alias for calling [Builder.smtpCode] with `smtpCode.orElse(null)`. */
        fun smtpCode(smtpCode: Optional<Long>) = smtpCode(smtpCode.getOrNull())

        /**
         * Sets [Builder.smtpCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smtpCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun smtpCode(smtpCode: JsonField<Long>) = apply { this.smtpCode = smtpCode }

        /** SMTP response message when available. */
        fun smtpResponse(smtpResponse: String?) = smtpResponse(JsonField.ofNullable(smtpResponse))

        /** Alias for calling [Builder.smtpResponse] with `smtpResponse.orElse(null)`. */
        fun smtpResponse(smtpResponse: Optional<String>) = smtpResponse(smtpResponse.getOrNull())

        /**
         * Sets [Builder.smtpResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smtpResponse] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun smtpResponse(smtpResponse: JsonField<String>) = apply {
            this.smtpResponse = smtpResponse
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
         * Returns an immutable instance of [EmailRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .address()
         * .billable()
         * .kind()
         * .messageId()
         * .recordType()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailRecipient =
            EmailRecipient(
                checkRequired("id", id),
                checkRequired("address", address),
                checkRequired("billable", billable),
                checkRequired("kind", kind),
                checkRequired("messageId", messageId),
                checkRequired("recordType", recordType),
                checkRequired("status", status),
                deliveredAt,
                failedAt,
                sentAt,
                smtpCode,
                smtpResponse,
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
    fun validate(): EmailRecipient = apply {
        if (validated) {
            return@apply
        }

        id()
        address()
        billable()
        kind().validate()
        messageId()
        recordType().validate()
        status().validate()
        deliveredAt()
        failedAt()
        sentAt()
        smtpCode()
        smtpResponse()
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
            (if (address.asKnown().isPresent) 1 else 0) +
            (if (billable.asKnown().isPresent) 1 else 0) +
            (kind.asKnown().getOrNull()?.validity() ?: 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (deliveredAt.asKnown().isPresent) 1 else 0) +
            (if (failedAt.asKnown().isPresent) 1 else 0) +
            (if (sentAt.asKnown().isPresent) 1 else 0) +
            (if (smtpCode.asKnown().isPresent) 1 else 0) +
            (if (smtpResponse.asKnown().isPresent) 1 else 0)

    class Kind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TO = of("to")

            @JvmField val CC = of("cc")

            @JvmField val BCC = of("bcc")

            @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
        }

        /** An enum containing [Kind]'s known values. */
        enum class Known {
            TO,
            CC,
            BCC,
        }

        /**
         * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Kind] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TO,
            CC,
            BCC,
            /** An enum member indicating that [Kind] was instantiated with an unknown value. */
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
                TO -> Value.TO
                CC -> Value.CC
                BCC -> Value.BCC
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
                TO -> Known.TO
                CC -> Known.CC
                BCC -> Known.BCC
                else -> throw TelnyxInvalidDataException("Unknown Kind: $value")
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
        fun validate(): Kind = apply {
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

            return other is Kind && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL_RECIPIENT = of("email_recipient")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            EMAIL_RECIPIENT
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL_RECIPIENT,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                EMAIL_RECIPIENT -> Value.EMAIL_RECIPIENT
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
                EMAIL_RECIPIENT -> Known.EMAIL_RECIPIENT
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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
        fun validate(): RecordType = apply {
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

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current per-recipient delivery status. */
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

            @JvmField val QUEUED = of("queued")

            @JvmField val SENDING = of("sending")

            @JvmField val SENT = of("sent")

            @JvmField val DEFERRED = of("deferred")

            @JvmField val DELIVERED = of("delivered")

            @JvmField val BOUNCED = of("bounced")

            @JvmField val FAILED = of("failed")

            @JvmField val GW_REJECT = of("gw_reject")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            SENDING,
            SENT,
            DEFERRED,
            DELIVERED,
            BOUNCED,
            FAILED,
            GW_REJECT,
            CANCELLED,
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
            QUEUED,
            SENDING,
            SENT,
            DEFERRED,
            DELIVERED,
            BOUNCED,
            FAILED,
            GW_REJECT,
            CANCELLED,
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
                QUEUED -> Value.QUEUED
                SENDING -> Value.SENDING
                SENT -> Value.SENT
                DEFERRED -> Value.DEFERRED
                DELIVERED -> Value.DELIVERED
                BOUNCED -> Value.BOUNCED
                FAILED -> Value.FAILED
                GW_REJECT -> Value.GW_REJECT
                CANCELLED -> Value.CANCELLED
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
                QUEUED -> Known.QUEUED
                SENDING -> Known.SENDING
                SENT -> Known.SENT
                DEFERRED -> Known.DEFERRED
                DELIVERED -> Known.DELIVERED
                BOUNCED -> Known.BOUNCED
                FAILED -> Known.FAILED
                GW_REJECT -> Known.GW_REJECT
                CANCELLED -> Known.CANCELLED
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

        return other is EmailRecipient &&
            id == other.id &&
            address == other.address &&
            billable == other.billable &&
            kind == other.kind &&
            messageId == other.messageId &&
            recordType == other.recordType &&
            status == other.status &&
            deliveredAt == other.deliveredAt &&
            failedAt == other.failedAt &&
            sentAt == other.sentAt &&
            smtpCode == other.smtpCode &&
            smtpResponse == other.smtpResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            address,
            billable,
            kind,
            messageId,
            recordType,
            status,
            deliveredAt,
            failedAt,
            sentAt,
            smtpCode,
            smtpResponse,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailRecipient{id=$id, address=$address, billable=$billable, kind=$kind, messageId=$messageId, recordType=$recordType, status=$status, deliveredAt=$deliveredAt, failedAt=$failedAt, sentAt=$sentAt, smtpCode=$smtpCode, smtpResponse=$smtpResponse, additionalProperties=$additionalProperties}"
}
