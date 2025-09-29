// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

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
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingPhoneNumberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * Returns a mutable builder for constructing an instance of
         * [PortingPhoneNumberListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingPhoneNumberListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingPhoneNumberListResponse: PortingPhoneNumberListResponse) = apply {
            data = portingPhoneNumberListResponse.data.map { it.toMutableList() }
            meta = portingPhoneNumberListResponse.meta
            additionalProperties =
                portingPhoneNumberListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [PortingPhoneNumberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingPhoneNumberListResponse =
            PortingPhoneNumberListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingPhoneNumberListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activationStatus: JsonField<ActivationStatus>,
        private val phoneNumber: JsonField<String>,
        private val phoneNumberType: JsonField<PhoneNumberType>,
        private val portabilityStatus: JsonField<PortabilityStatus>,
        private val portingOrderId: JsonField<String>,
        private val portingOrderStatus: JsonField<PortingOrderStatus>,
        private val recordType: JsonField<String>,
        private val requirementsStatus: JsonField<RequirementsStatus>,
        private val supportKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("activation_status")
            @ExcludeMissing
            activationStatus: JsonField<ActivationStatus> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
            @JsonProperty("portability_status")
            @ExcludeMissing
            portabilityStatus: JsonField<PortabilityStatus> = JsonMissing.of(),
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            portingOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("porting_order_status")
            @ExcludeMissing
            portingOrderStatus: JsonField<PortingOrderStatus> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirements_status")
            @ExcludeMissing
            requirementsStatus: JsonField<RequirementsStatus> = JsonMissing.of(),
            @JsonProperty("support_key")
            @ExcludeMissing
            supportKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            activationStatus,
            phoneNumber,
            phoneNumberType,
            portabilityStatus,
            portingOrderId,
            portingOrderStatus,
            recordType,
            requirementsStatus,
            supportKey,
            mutableMapOf(),
        )

        /**
         * Activation status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationStatus(): Optional<ActivationStatus> =
            activationStatus.getOptional("activation_status")

        /**
         * E164 formatted phone number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * The type of the phone number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberType(): Optional<PhoneNumberType> =
            phoneNumberType.getOptional("phone_number_type")

        /**
         * Specifies whether Telnyx is able to confirm portability this number in the United States
         * & Canada. International phone numbers are provisional by default.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portabilityStatus(): Optional<PortabilityStatus> =
            portabilityStatus.getOptional("portability_status")

        /**
         * Identifies the associated port request
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

        /**
         * The current status of the porting order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portingOrderStatus(): Optional<PortingOrderStatus> =
            portingOrderStatus.getOptional("porting_order_status")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The current status of the requirements in a INTL porting order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementsStatus(): Optional<RequirementsStatus> =
            requirementsStatus.getOptional("requirements_status")

        /**
         * A key to reference this porting order when contacting Telnyx customer support
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

        /**
         * Returns the raw JSON value of [activationStatus].
         *
         * Unlike [activationStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("activation_status")
        @ExcludeMissing
        fun _activationStatus(): JsonField<ActivationStatus> = activationStatus

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [phoneNumberType].
         *
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

        /**
         * Returns the raw JSON value of [portabilityStatus].
         *
         * Unlike [portabilityStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("portability_status")
        @ExcludeMissing
        fun _portabilityStatus(): JsonField<PortabilityStatus> = portabilityStatus

        /**
         * Returns the raw JSON value of [portingOrderId].
         *
         * Unlike [portingOrderId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("porting_order_id")
        @ExcludeMissing
        fun _portingOrderId(): JsonField<String> = portingOrderId

        /**
         * Returns the raw JSON value of [portingOrderStatus].
         *
         * Unlike [portingOrderStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("porting_order_status")
        @ExcludeMissing
        fun _portingOrderStatus(): JsonField<PortingOrderStatus> = portingOrderStatus

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [requirementsStatus].
         *
         * Unlike [requirementsStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requirements_status")
        @ExcludeMissing
        fun _requirementsStatus(): JsonField<RequirementsStatus> = requirementsStatus

        /**
         * Returns the raw JSON value of [supportKey].
         *
         * Unlike [supportKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("support_key")
        @ExcludeMissing
        fun _supportKey(): JsonField<String> = supportKey

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var activationStatus: JsonField<ActivationStatus> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
            private var portabilityStatus: JsonField<PortabilityStatus> = JsonMissing.of()
            private var portingOrderId: JsonField<String> = JsonMissing.of()
            private var portingOrderStatus: JsonField<PortingOrderStatus> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var requirementsStatus: JsonField<RequirementsStatus> = JsonMissing.of()
            private var supportKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                activationStatus = data.activationStatus
                phoneNumber = data.phoneNumber
                phoneNumberType = data.phoneNumberType
                portabilityStatus = data.portabilityStatus
                portingOrderId = data.portingOrderId
                portingOrderStatus = data.portingOrderStatus
                recordType = data.recordType
                requirementsStatus = data.requirementsStatus
                supportKey = data.supportKey
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Activation status */
            fun activationStatus(activationStatus: ActivationStatus) =
                activationStatus(JsonField.of(activationStatus))

            /**
             * Sets [Builder.activationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationStatus] with a well-typed
             * [ActivationStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun activationStatus(activationStatus: JsonField<ActivationStatus>) = apply {
                this.activationStatus = activationStatus
            }

            /** E164 formatted phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** The type of the phone number */
            fun phoneNumberType(phoneNumberType: PhoneNumberType) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
                this.phoneNumberType = phoneNumberType
            }

            /**
             * Specifies whether Telnyx is able to confirm portability this number in the United
             * States & Canada. International phone numbers are provisional by default.
             */
            fun portabilityStatus(portabilityStatus: PortabilityStatus) =
                portabilityStatus(JsonField.of(portabilityStatus))

            /**
             * Sets [Builder.portabilityStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portabilityStatus] with a well-typed
             * [PortabilityStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun portabilityStatus(portabilityStatus: JsonField<PortabilityStatus>) = apply {
                this.portabilityStatus = portabilityStatus
            }

            /** Identifies the associated port request */
            fun portingOrderId(portingOrderId: String) =
                portingOrderId(JsonField.of(portingOrderId))

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

            /** The current status of the porting order */
            fun portingOrderStatus(portingOrderStatus: PortingOrderStatus) =
                portingOrderStatus(JsonField.of(portingOrderStatus))

            /**
             * Sets [Builder.portingOrderStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portingOrderStatus] with a well-typed
             * [PortingOrderStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun portingOrderStatus(portingOrderStatus: JsonField<PortingOrderStatus>) = apply {
                this.portingOrderStatus = portingOrderStatus
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The current status of the requirements in a INTL porting order */
            fun requirementsStatus(requirementsStatus: RequirementsStatus) =
                requirementsStatus(JsonField.of(requirementsStatus))

            /**
             * Sets [Builder.requirementsStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementsStatus] with a well-typed
             * [RequirementsStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun requirementsStatus(requirementsStatus: JsonField<RequirementsStatus>) = apply {
                this.requirementsStatus = requirementsStatus
            }

            /** A key to reference this porting order when contacting Telnyx customer support */
            fun supportKey(supportKey: String) = supportKey(JsonField.of(supportKey))

            /**
             * Sets [Builder.supportKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supportKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun supportKey(supportKey: JsonField<String>) = apply { this.supportKey = supportKey }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    activationStatus,
                    phoneNumber,
                    phoneNumberType,
                    portabilityStatus,
                    portingOrderId,
                    portingOrderStatus,
                    recordType,
                    requirementsStatus,
                    supportKey,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            activationStatus().ifPresent { it.validate() }
            phoneNumber()
            phoneNumberType().ifPresent { it.validate() }
            portabilityStatus().ifPresent { it.validate() }
            portingOrderId()
            portingOrderStatus().ifPresent { it.validate() }
            recordType()
            requirementsStatus().ifPresent { it.validate() }
            supportKey()
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
            (activationStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
                (portabilityStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (portingOrderId.asKnown().isPresent) 1 else 0) +
                (portingOrderStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (requirementsStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (supportKey.asKnown().isPresent) 1 else 0)

        /** Activation status */
        class ActivationStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NEW = of("New")

                @JvmField val PENDING = of("Pending")

                @JvmField val CONFLICT = of("Conflict")

                @JvmField val CANCEL_PENDING = of("Cancel Pending")

                @JvmField val FAILED = of("Failed")

                @JvmField val CONCURRED = of("Concurred")

                @JvmField val ACTIVATE_RDY = of("Activate RDY")

                @JvmField val DISCONNECT_PENDING = of("Disconnect Pending")

                @JvmField val CONCURRENCE_SENT = of("Concurrence Sent")

                @JvmField val OLD = of("Old")

                @JvmField val SENDING = of("Sending")

                @JvmField val ACTIVE = of("Active")

                @JvmField val CANCELLED = of("Cancelled")

                @JvmStatic fun of(value: String) = ActivationStatus(JsonField.of(value))
            }

            /** An enum containing [ActivationStatus]'s known values. */
            enum class Known {
                NEW,
                PENDING,
                CONFLICT,
                CANCEL_PENDING,
                FAILED,
                CONCURRED,
                ACTIVATE_RDY,
                DISCONNECT_PENDING,
                CONCURRENCE_SENT,
                OLD,
                SENDING,
                ACTIVE,
                CANCELLED,
            }

            /**
             * An enum containing [ActivationStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ActivationStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEW,
                PENDING,
                CONFLICT,
                CANCEL_PENDING,
                FAILED,
                CONCURRED,
                ACTIVATE_RDY,
                DISCONNECT_PENDING,
                CONCURRENCE_SENT,
                OLD,
                SENDING,
                ACTIVE,
                CANCELLED,
                /**
                 * An enum member indicating that [ActivationStatus] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NEW -> Value.NEW
                    PENDING -> Value.PENDING
                    CONFLICT -> Value.CONFLICT
                    CANCEL_PENDING -> Value.CANCEL_PENDING
                    FAILED -> Value.FAILED
                    CONCURRED -> Value.CONCURRED
                    ACTIVATE_RDY -> Value.ACTIVATE_RDY
                    DISCONNECT_PENDING -> Value.DISCONNECT_PENDING
                    CONCURRENCE_SENT -> Value.CONCURRENCE_SENT
                    OLD -> Value.OLD
                    SENDING -> Value.SENDING
                    ACTIVE -> Value.ACTIVE
                    CANCELLED -> Value.CANCELLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NEW -> Known.NEW
                    PENDING -> Known.PENDING
                    CONFLICT -> Known.CONFLICT
                    CANCEL_PENDING -> Known.CANCEL_PENDING
                    FAILED -> Known.FAILED
                    CONCURRED -> Known.CONCURRED
                    ACTIVATE_RDY -> Known.ACTIVATE_RDY
                    DISCONNECT_PENDING -> Known.DISCONNECT_PENDING
                    CONCURRENCE_SENT -> Known.CONCURRENCE_SENT
                    OLD -> Known.OLD
                    SENDING -> Known.SENDING
                    ACTIVE -> Known.ACTIVE
                    CANCELLED -> Known.CANCELLED
                    else -> throw TelnyxInvalidDataException("Unknown ActivationStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ActivationStatus = apply {
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

                return other is ActivationStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The type of the phone number */
        class PhoneNumberType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

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

        /**
         * Specifies whether Telnyx is able to confirm portability this number in the United States
         * & Canada. International phone numbers are provisional by default.
         */
        class PortabilityStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("pending")

                @JvmField val CONFIRMED = of("confirmed")

                @JvmField val PROVISIONAL = of("provisional")

                @JvmStatic fun of(value: String) = PortabilityStatus(JsonField.of(value))
            }

            /** An enum containing [PortabilityStatus]'s known values. */
            enum class Known {
                PENDING,
                CONFIRMED,
                PROVISIONAL,
            }

            /**
             * An enum containing [PortabilityStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PortabilityStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                CONFIRMED,
                PROVISIONAL,
                /**
                 * An enum member indicating that [PortabilityStatus] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    CONFIRMED -> Value.CONFIRMED
                    PROVISIONAL -> Value.PROVISIONAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    CONFIRMED -> Known.CONFIRMED
                    PROVISIONAL -> Known.PROVISIONAL
                    else -> throw TelnyxInvalidDataException("Unknown PortabilityStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): PortabilityStatus = apply {
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

                return other is PortabilityStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The current status of the porting order */
        class PortingOrderStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DRAFT = of("draft")

                @JvmField val IN_PROCESS = of("in-process")

                @JvmField val SUBMITTED = of("submitted")

                @JvmField val EXCEPTION = of("exception")

                @JvmField val FOC_DATE_CONFIRMED = of("foc-date-confirmed")

                @JvmField val CANCEL_PENDING = of("cancel-pending")

                @JvmField val PORTED = of("ported")

                @JvmField val CANCELLED = of("cancelled")

                @JvmStatic fun of(value: String) = PortingOrderStatus(JsonField.of(value))
            }

            /** An enum containing [PortingOrderStatus]'s known values. */
            enum class Known {
                DRAFT,
                IN_PROCESS,
                SUBMITTED,
                EXCEPTION,
                FOC_DATE_CONFIRMED,
                CANCEL_PENDING,
                PORTED,
                CANCELLED,
            }

            /**
             * An enum containing [PortingOrderStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PortingOrderStatus] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                IN_PROCESS,
                SUBMITTED,
                EXCEPTION,
                FOC_DATE_CONFIRMED,
                CANCEL_PENDING,
                PORTED,
                CANCELLED,
                /**
                 * An enum member indicating that [PortingOrderStatus] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DRAFT -> Value.DRAFT
                    IN_PROCESS -> Value.IN_PROCESS
                    SUBMITTED -> Value.SUBMITTED
                    EXCEPTION -> Value.EXCEPTION
                    FOC_DATE_CONFIRMED -> Value.FOC_DATE_CONFIRMED
                    CANCEL_PENDING -> Value.CANCEL_PENDING
                    PORTED -> Value.PORTED
                    CANCELLED -> Value.CANCELLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DRAFT -> Known.DRAFT
                    IN_PROCESS -> Known.IN_PROCESS
                    SUBMITTED -> Known.SUBMITTED
                    EXCEPTION -> Known.EXCEPTION
                    FOC_DATE_CONFIRMED -> Known.FOC_DATE_CONFIRMED
                    CANCEL_PENDING -> Known.CANCEL_PENDING
                    PORTED -> Known.PORTED
                    CANCELLED -> Known.CANCELLED
                    else -> throw TelnyxInvalidDataException("Unknown PortingOrderStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): PortingOrderStatus = apply {
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

                return other is PortingOrderStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The current status of the requirements in a INTL porting order */
        class RequirementsStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val REQUIREMENT_INFO_PENDING = of("requirement-info-pending")

                @JvmField val REQUIREMENT_INFO_UNDER_REVIEW = of("requirement-info-under-review")

                @JvmField val REQUIREMENT_INFO_EXCEPTION = of("requirement-info-exception")

                @JvmField val APPROVED = of("approved")

                @JvmStatic fun of(value: String) = RequirementsStatus(JsonField.of(value))
            }

            /** An enum containing [RequirementsStatus]'s known values. */
            enum class Known {
                REQUIREMENT_INFO_PENDING,
                REQUIREMENT_INFO_UNDER_REVIEW,
                REQUIREMENT_INFO_EXCEPTION,
                APPROVED,
            }

            /**
             * An enum containing [RequirementsStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RequirementsStatus] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REQUIREMENT_INFO_PENDING,
                REQUIREMENT_INFO_UNDER_REVIEW,
                REQUIREMENT_INFO_EXCEPTION,
                APPROVED,
                /**
                 * An enum member indicating that [RequirementsStatus] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    REQUIREMENT_INFO_PENDING -> Value.REQUIREMENT_INFO_PENDING
                    REQUIREMENT_INFO_UNDER_REVIEW -> Value.REQUIREMENT_INFO_UNDER_REVIEW
                    REQUIREMENT_INFO_EXCEPTION -> Value.REQUIREMENT_INFO_EXCEPTION
                    APPROVED -> Value.APPROVED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    REQUIREMENT_INFO_PENDING -> Known.REQUIREMENT_INFO_PENDING
                    REQUIREMENT_INFO_UNDER_REVIEW -> Known.REQUIREMENT_INFO_UNDER_REVIEW
                    REQUIREMENT_INFO_EXCEPTION -> Known.REQUIREMENT_INFO_EXCEPTION
                    APPROVED -> Known.APPROVED
                    else -> throw TelnyxInvalidDataException("Unknown RequirementsStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): RequirementsStatus = apply {
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

                return other is RequirementsStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                activationStatus == other.activationStatus &&
                phoneNumber == other.phoneNumber &&
                phoneNumberType == other.phoneNumberType &&
                portabilityStatus == other.portabilityStatus &&
                portingOrderId == other.portingOrderId &&
                portingOrderStatus == other.portingOrderStatus &&
                recordType == other.recordType &&
                requirementsStatus == other.requirementsStatus &&
                supportKey == other.supportKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationStatus,
                phoneNumber,
                phoneNumberType,
                portabilityStatus,
                portingOrderId,
                portingOrderStatus,
                recordType,
                requirementsStatus,
                supportKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{activationStatus=$activationStatus, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, portabilityStatus=$portabilityStatus, portingOrderId=$portingOrderId, portingOrderStatus=$portingOrderStatus, recordType=$recordType, requirementsStatus=$requirementsStatus, supportKey=$supportKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingPhoneNumberListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingPhoneNumberListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
