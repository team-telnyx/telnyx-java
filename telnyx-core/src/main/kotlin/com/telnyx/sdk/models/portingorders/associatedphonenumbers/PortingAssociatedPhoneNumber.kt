// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingAssociatedPhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val action: JsonField<Action>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val phoneNumberRange: JsonField<PhoneNumberRange>,
    private val phoneNumberType: JsonField<PhoneNumberType>,
    private val portingOrderId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("phone_number_range")
        @ExcludeMissing
        phoneNumberRange: JsonField<PhoneNumberRange> = JsonMissing.of(),
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
        @JsonProperty("porting_order_id")
        @ExcludeMissing
        portingOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        action,
        countryCode,
        createdAt,
        phoneNumberRange,
        phoneNumberType,
        portingOrderId,
        recordType,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies this associated phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Specifies the action to take with this phone number during partial porting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun action(): Optional<Action> = action.getOptional("action")

    /**
     * Specifies the country code for this associated phone number. It is a two-letter ISO 3166-1
     * alpha-2 country code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Specifies the phone number range for this associated phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberRange(): Optional<PhoneNumberRange> =
        phoneNumberRange.getOptional("phone_number_range")

    /**
     * Specifies the phone number type for this associated phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberType(): Optional<PhoneNumberType> =
        phoneNumberType.getOptional("phone_number_type")

    /**
     * Identifies the porting order associated with this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date indicating when the resource was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [phoneNumberRange].
     *
     * Unlike [phoneNumberRange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phone_number_range")
    @ExcludeMissing
    fun _phoneNumberRange(): JsonField<PhoneNumberRange> = phoneNumberRange

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number_type")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

    /**
     * Returns the raw JSON value of [portingOrderId].
     *
     * Unlike [portingOrderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("porting_order_id")
    @ExcludeMissing
    fun _portingOrderId(): JsonField<String> = portingOrderId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

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
         * Returns a mutable builder for constructing an instance of [PortingAssociatedPhoneNumber].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingAssociatedPhoneNumber]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var action: JsonField<Action> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var phoneNumberRange: JsonField<PhoneNumberRange> = JsonMissing.of()
        private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
        private var portingOrderId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingAssociatedPhoneNumber: PortingAssociatedPhoneNumber) = apply {
            id = portingAssociatedPhoneNumber.id
            action = portingAssociatedPhoneNumber.action
            countryCode = portingAssociatedPhoneNumber.countryCode
            createdAt = portingAssociatedPhoneNumber.createdAt
            phoneNumberRange = portingAssociatedPhoneNumber.phoneNumberRange
            phoneNumberType = portingAssociatedPhoneNumber.phoneNumberType
            portingOrderId = portingAssociatedPhoneNumber.portingOrderId
            recordType = portingAssociatedPhoneNumber.recordType
            updatedAt = portingAssociatedPhoneNumber.updatedAt
            additionalProperties = portingAssociatedPhoneNumber.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies this associated phone number. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies the action to take with this phone number during partial porting. */
        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        /**
         * Specifies the country code for this associated phone number. It is a two-letter ISO
         * 3166-1 alpha-2 country code.
         */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Specifies the phone number range for this associated phone number. */
        fun phoneNumberRange(phoneNumberRange: PhoneNumberRange) =
            phoneNumberRange(JsonField.of(phoneNumberRange))

        /**
         * Sets [Builder.phoneNumberRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberRange] with a well-typed [PhoneNumberRange]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberRange(phoneNumberRange: JsonField<PhoneNumberRange>) = apply {
            this.phoneNumberRange = phoneNumberRange
        }

        /** Specifies the phone number type for this associated phone number. */
        fun phoneNumberType(phoneNumberType: PhoneNumberType) =
            phoneNumberType(JsonField.of(phoneNumberType))

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
            this.phoneNumberType = phoneNumberType
        }

        /** Identifies the porting order associated with this phone number. */
        fun portingOrderId(portingOrderId: String) = portingOrderId(JsonField.of(portingOrderId))

        /**
         * Sets [Builder.portingOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portingOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portingOrderId(portingOrderId: JsonField<String>) = apply {
            this.portingOrderId = portingOrderId
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

        /** ISO 8601 formatted date indicating when the resource was last updated. */
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
         * Returns an immutable instance of [PortingAssociatedPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingAssociatedPhoneNumber =
            PortingAssociatedPhoneNumber(
                id,
                action,
                countryCode,
                createdAt,
                phoneNumberRange,
                phoneNumberType,
                portingOrderId,
                recordType,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingAssociatedPhoneNumber = apply {
        if (validated) {
            return@apply
        }

        id()
        action().ifPresent { it.validate() }
        countryCode()
        createdAt()
        phoneNumberRange().ifPresent { it.validate() }
        phoneNumberType().ifPresent { it.validate() }
        portingOrderId()
        recordType()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (action.asKnown().getOrNull()?.validity() ?: 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (phoneNumberRange.asKnown().getOrNull()?.validity() ?: 0) +
            (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portingOrderId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Specifies the action to take with this phone number during partial porting. */
    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val KEEP = of("keep")

            @JvmField val DISCONNECT = of("disconnect")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            KEEP,
            DISCONNECT,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KEEP,
            DISCONNECT,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                KEEP -> Value.KEEP
                DISCONNECT -> Value.DISCONNECT
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
                KEEP -> Known.KEEP
                DISCONNECT -> Known.DISCONNECT
                else -> throw TelnyxInvalidDataException("Unknown Action: $value")
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

        fun validate(): Action = apply {
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

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies the phone number range for this associated phone number. */
    class PhoneNumberRange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<String>,
        private val startAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_at") @ExcludeMissing startAt: JsonField<String> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * Specifies the end of the phone number range for this associated phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endAt(): Optional<String> = endAt.getOptional("end_at")

        /**
         * Specifies the start of the phone number range for this associated phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startAt(): Optional<String> = startAt.getOptional("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<String> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<String> = startAt

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

            /** Returns a mutable builder for constructing an instance of [PhoneNumberRange]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhoneNumberRange]. */
        class Builder internal constructor() {

            private var endAt: JsonField<String> = JsonMissing.of()
            private var startAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumberRange: PhoneNumberRange) = apply {
                endAt = phoneNumberRange.endAt
                startAt = phoneNumberRange.startAt
                additionalProperties = phoneNumberRange.additionalProperties.toMutableMap()
            }

            /** Specifies the end of the phone number range for this associated phone number. */
            fun endAt(endAt: String) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<String>) = apply { this.endAt = endAt }

            /** Specifies the start of the phone number range for this associated phone number. */
            fun startAt(startAt: String) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<String>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [PhoneNumberRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumberRange =
                PhoneNumberRange(endAt, startAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PhoneNumberRange = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
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
            (if (endAt.asKnown().isPresent) 1 else 0) + (if (startAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumberRange &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumberRange{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    /** Specifies the phone number type for this associated phone number. */
    class PhoneNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LANDLINE = of("landline")

            @JvmField val LOCAL = of("local")

            @JvmField val MOBILE = of("mobile")

            @JvmField val NATIONAL = of("national")

            @JvmField val SHARED_COST = of("shared_cost")

            @JvmField val TOLL_FREE = of("toll_free")

            @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberType]'s known values. */
        enum class Known {
            LANDLINE,
            LOCAL,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            TOLL_FREE,
        }

        /**
         * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LANDLINE,
            LOCAL,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            TOLL_FREE,
            /**
             * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
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
                LANDLINE -> Value.LANDLINE
                LOCAL -> Value.LOCAL
                MOBILE -> Value.MOBILE
                NATIONAL -> Value.NATIONAL
                SHARED_COST -> Value.SHARED_COST
                TOLL_FREE -> Value.TOLL_FREE
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
                LANDLINE -> Known.LANDLINE
                LOCAL -> Known.LOCAL
                MOBILE -> Known.MOBILE
                NATIONAL -> Known.NATIONAL
                SHARED_COST -> Known.SHARED_COST
                TOLL_FREE -> Known.TOLL_FREE
                else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingAssociatedPhoneNumber &&
            id == other.id &&
            action == other.action &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            phoneNumberRange == other.phoneNumberRange &&
            phoneNumberType == other.phoneNumberType &&
            portingOrderId == other.portingOrderId &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            action,
            countryCode,
            createdAt,
            phoneNumberRange,
            phoneNumberType,
            portingOrderId,
            recordType,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingAssociatedPhoneNumber{id=$id, action=$action, countryCode=$countryCode, createdAt=$createdAt, phoneNumberRange=$phoneNumberRange, phoneNumberType=$phoneNumberType, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
