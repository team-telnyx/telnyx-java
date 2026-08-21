// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailEventListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val emailId: JsonField<String>,
    private val occurredAt: JsonField<OffsetDateTime>,
    private val recordType: JsonField<RecordType>,
    private val type: JsonField<EmailEventType>,
    private val email: JsonField<Email>,
    private val payload: JsonField<Payload>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_id") @ExcludeMissing emailId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occurred_at")
        @ExcludeMissing
        occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<EmailEventType> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<Email> = JsonMissing.of(),
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
    ) : this(id, emailId, occurredAt, recordType, type, email, payload, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailId(): String = emailId.getRequired("email_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): EmailEventType = type.getRequired("type")

    /**
     * Summary of the associated email message. Present when the email_message preload is available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<Email> = email.getOptional("email")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payload(): Optional<Payload> = payload.getOptional("payload")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [emailId].
     *
     * Unlike [emailId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_id") @ExcludeMissing fun _emailId(): JsonField<String> = emailId

    /**
     * Returns the raw JSON value of [occurredAt].
     *
     * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occurred_at")
    @ExcludeMissing
    fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<EmailEventType> = type

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<Email> = email

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

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
         * Returns a mutable builder for constructing an instance of [EmailEventListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .emailId()
         * .occurredAt()
         * .recordType()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailEventListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var emailId: JsonField<String>? = null
        private var occurredAt: JsonField<OffsetDateTime>? = null
        private var recordType: JsonField<RecordType>? = null
        private var type: JsonField<EmailEventType>? = null
        private var email: JsonField<Email> = JsonMissing.of()
        private var payload: JsonField<Payload> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailEventListResponse: EmailEventListResponse) = apply {
            id = emailEventListResponse.id
            emailId = emailEventListResponse.emailId
            occurredAt = emailEventListResponse.occurredAt
            recordType = emailEventListResponse.recordType
            type = emailEventListResponse.type
            email = emailEventListResponse.email
            payload = emailEventListResponse.payload
            additionalProperties = emailEventListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun emailId(emailId: String) = emailId(JsonField.of(emailId))

        /**
         * Sets [Builder.emailId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emailId(emailId: JsonField<String>) = apply { this.emailId = emailId }

        fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

        /**
         * Sets [Builder.occurredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
            this.occurredAt = occurredAt
        }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        fun type(type: EmailEventType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [EmailEventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<EmailEventType>) = apply { this.type = type }

        /**
         * Summary of the associated email message. Present when the email_message preload is
         * available.
         */
        fun email(email: Email) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [Email] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<Email>) = apply { this.email = email }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

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
         * Returns an immutable instance of [EmailEventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .emailId()
         * .occurredAt()
         * .recordType()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailEventListResponse =
            EmailEventListResponse(
                checkRequired("id", id),
                checkRequired("emailId", emailId),
                checkRequired("occurredAt", occurredAt),
                checkRequired("recordType", recordType),
                checkRequired("type", type),
                email,
                payload,
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
    fun validate(): EmailEventListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        emailId()
        occurredAt()
        recordType().validate()
        type().validate()
        email().ifPresent { it.validate() }
        payload().ifPresent { it.validate() }
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
            (if (emailId.asKnown().isPresent) 1 else 0) +
            (if (occurredAt.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (email.asKnown().getOrNull()?.validity() ?: 0) +
            (payload.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val EMAIL_EVENT = of("email_event")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            EMAIL_EVENT
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
            EMAIL_EVENT,
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
                EMAIL_EVENT -> Value.EMAIL_EVENT
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
                EMAIL_EVENT -> Known.EMAIL_EVENT
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

    /**
     * Summary of the associated email message. Present when the email_message preload is available.
     */
    class Email
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cc: JsonField<List<EmailAddress>>,
        private val from: JsonField<EmailAddress>,
        private val subject: JsonField<String>,
        private val to: JsonField<List<EmailAddress>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cc")
            @ExcludeMissing
            cc: JsonField<List<EmailAddress>> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<EmailAddress> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<List<EmailAddress>> = JsonMissing.of(),
        ) : this(cc, from, subject, to, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cc(): List<EmailAddress> = cc.getRequired("cc")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): EmailAddress = from.getRequired("from")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subject(): String = subject.getRequired("subject")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): List<EmailAddress> = to.getRequired("to")

        /**
         * Returns the raw JSON value of [cc].
         *
         * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<EmailAddress>> = cc

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<EmailAddress> = from

        /**
         * Returns the raw JSON value of [subject].
         *
         * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<EmailAddress>> = to

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
             * Returns a mutable builder for constructing an instance of [Email].
             *
             * The following fields are required:
             * ```java
             * .cc()
             * .from()
             * .subject()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Email]. */
        class Builder internal constructor() {

            private var cc: JsonField<MutableList<EmailAddress>>? = null
            private var from: JsonField<EmailAddress>? = null
            private var subject: JsonField<String>? = null
            private var to: JsonField<MutableList<EmailAddress>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(email: Email) = apply {
                cc = email.cc.map { it.toMutableList() }
                from = email.from
                subject = email.subject
                to = email.to.map { it.toMutableList() }
                additionalProperties = email.additionalProperties.toMutableMap()
            }

            fun cc(cc: List<EmailAddress>) = cc(JsonField.of(cc))

            /**
             * Sets [Builder.cc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cc] with a well-typed `List<EmailAddress>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cc(cc: JsonField<List<EmailAddress>>) = apply {
                this.cc = cc.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmailAddress] to [Builder.cc].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCc(cc: EmailAddress) = apply {
                this.cc =
                    (this.cc ?: JsonField.of(mutableListOf())).also { checkKnown("cc", it).add(cc) }
            }

            fun from(from: EmailAddress) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [EmailAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun from(from: JsonField<EmailAddress>) = apply { this.from = from }

            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            fun to(to: List<EmailAddress>) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed `List<EmailAddress>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun to(to: JsonField<List<EmailAddress>>) = apply {
                this.to = to.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmailAddress] to [Builder.to].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTo(to: EmailAddress) = apply {
                this.to =
                    (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
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
             * Returns an immutable instance of [Email].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cc()
             * .from()
             * .subject()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Email =
                Email(
                    checkRequired("cc", cc).map { it.toImmutable() },
                    checkRequired("from", from),
                    checkRequired("subject", subject),
                    checkRequired("to", to).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Email = apply {
            if (validated) {
                return@apply
            }

            cc().forEach { it.validate() }
            from().validate()
            subject()
            to().forEach { it.validate() }
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
            (cc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (from.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Email &&
                cc == other.cc &&
                from == other.from &&
                subject == other.subject &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cc, from, subject, to, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Email{cc=$cc, from=$from, subject=$subject, to=$to, additionalProperties=$additionalProperties}"
    }

    class Payload
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Payload]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                additionalProperties = payload.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Payload = Payload(additionalProperties.toImmutable())
        }

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
        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Payload{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailEventListResponse &&
            id == other.id &&
            emailId == other.emailId &&
            occurredAt == other.occurredAt &&
            recordType == other.recordType &&
            type == other.type &&
            email == other.email &&
            payload == other.payload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            emailId,
            occurredAt,
            recordType,
            type,
            email,
            payload,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailEventListResponse{id=$id, emailId=$emailId, occurredAt=$occurredAt, recordType=$recordType, type=$type, email=$email, payload=$payload, additionalProperties=$additionalProperties}"
}
