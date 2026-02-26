// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment

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

class PaymentCreateStoredPaymentTransactionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [PaymentCreateStoredPaymentTransactionResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentCreateStoredPaymentTransactionResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            paymentCreateStoredPaymentTransactionResponse:
                PaymentCreateStoredPaymentTransactionResponse
        ) = apply {
            data = paymentCreateStoredPaymentTransactionResponse.data
            additionalProperties =
                paymentCreateStoredPaymentTransactionResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [PaymentCreateStoredPaymentTransactionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PaymentCreateStoredPaymentTransactionResponse =
            PaymentCreateStoredPaymentTransactionResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PaymentCreateStoredPaymentTransactionResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amountCents: JsonField<Long>,
        private val amountCurrency: JsonField<String>,
        private val autoRecharge: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val processorStatus: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val transactionProcessingType: JsonField<TransactionProcessingType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_cents")
            @ExcludeMissing
            amountCents: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_currency")
            @ExcludeMissing
            amountCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_recharge")
            @ExcludeMissing
            autoRecharge: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("processor_status")
            @ExcludeMissing
            processorStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("transaction_processing_type")
            @ExcludeMissing
            transactionProcessingType: JsonField<TransactionProcessingType> = JsonMissing.of(),
        ) : this(
            id,
            amountCents,
            amountCurrency,
            autoRecharge,
            createdAt,
            processorStatus,
            recordType,
            transactionProcessingType,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountCents(): Optional<Long> = amountCents.getOptional("amount_cents")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountCurrency(): Optional<String> = amountCurrency.getOptional("amount_currency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRecharge(): Optional<Boolean> = autoRecharge.getOptional("auto_recharge")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun processorStatus(): Optional<String> = processorStatus.getOptional("processor_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transactionProcessingType(): Optional<TransactionProcessingType> =
            transactionProcessingType.getOptional("transaction_processing_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amountCents].
         *
         * Unlike [amountCents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_cents")
        @ExcludeMissing
        fun _amountCents(): JsonField<Long> = amountCents

        /**
         * Returns the raw JSON value of [amountCurrency].
         *
         * Unlike [amountCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_currency")
        @ExcludeMissing
        fun _amountCurrency(): JsonField<String> = amountCurrency

        /**
         * Returns the raw JSON value of [autoRecharge].
         *
         * Unlike [autoRecharge], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_recharge")
        @ExcludeMissing
        fun _autoRecharge(): JsonField<Boolean> = autoRecharge

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [processorStatus].
         *
         * Unlike [processorStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("processor_status")
        @ExcludeMissing
        fun _processorStatus(): JsonField<String> = processorStatus

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [transactionProcessingType].
         *
         * Unlike [transactionProcessingType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transaction_processing_type")
        @ExcludeMissing
        fun _transactionProcessingType(): JsonField<TransactionProcessingType> =
            transactionProcessingType

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

            private var id: JsonField<String> = JsonMissing.of()
            private var amountCents: JsonField<Long> = JsonMissing.of()
            private var amountCurrency: JsonField<String> = JsonMissing.of()
            private var autoRecharge: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var processorStatus: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
            private var transactionProcessingType: JsonField<TransactionProcessingType> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                amountCents = data.amountCents
                amountCurrency = data.amountCurrency
                autoRecharge = data.autoRecharge
                createdAt = data.createdAt
                processorStatus = data.processorStatus
                recordType = data.recordType
                transactionProcessingType = data.transactionProcessingType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amountCents(amountCents: Long) = amountCents(JsonField.of(amountCents))

            /**
             * Sets [Builder.amountCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountCents] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountCents(amountCents: JsonField<Long>) = apply { this.amountCents = amountCents }

            fun amountCurrency(amountCurrency: String) =
                amountCurrency(JsonField.of(amountCurrency))

            /**
             * Sets [Builder.amountCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountCurrency(amountCurrency: JsonField<String>) = apply {
                this.amountCurrency = amountCurrency
            }

            fun autoRecharge(autoRecharge: Boolean) = autoRecharge(JsonField.of(autoRecharge))

            /**
             * Sets [Builder.autoRecharge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRecharge] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoRecharge(autoRecharge: JsonField<Boolean>) = apply {
                this.autoRecharge = autoRecharge
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun processorStatus(processorStatus: String) =
                processorStatus(JsonField.of(processorStatus))

            /**
             * Sets [Builder.processorStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processorStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processorStatus(processorStatus: JsonField<String>) = apply {
                this.processorStatus = processorStatus
            }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            fun transactionProcessingType(transactionProcessingType: TransactionProcessingType) =
                transactionProcessingType(JsonField.of(transactionProcessingType))

            /**
             * Sets [Builder.transactionProcessingType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionProcessingType] with a well-typed
             * [TransactionProcessingType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun transactionProcessingType(
                transactionProcessingType: JsonField<TransactionProcessingType>
            ) = apply { this.transactionProcessingType = transactionProcessingType }

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
                    id,
                    amountCents,
                    amountCurrency,
                    autoRecharge,
                    createdAt,
                    processorStatus,
                    recordType,
                    transactionProcessingType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            amountCents()
            amountCurrency()
            autoRecharge()
            createdAt()
            processorStatus()
            recordType().ifPresent { it.validate() }
            transactionProcessingType().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amountCents.asKnown().isPresent) 1 else 0) +
                (if (amountCurrency.asKnown().isPresent) 1 else 0) +
                (if (autoRecharge.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (processorStatus.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (transactionProcessingType.asKnown().getOrNull()?.validity() ?: 0)

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val TRANSACTION = of("transaction")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                TRANSACTION
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRANSACTION,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    TRANSACTION -> Value.TRANSACTION
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
                    TRANSACTION -> Known.TRANSACTION
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        class TransactionProcessingType
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

                @JvmField val STORED_PAYMENT = of("stored_payment")

                @JvmStatic fun of(value: String) = TransactionProcessingType(JsonField.of(value))
            }

            /** An enum containing [TransactionProcessingType]'s known values. */
            enum class Known {
                STORED_PAYMENT
            }

            /**
             * An enum containing [TransactionProcessingType]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [TransactionProcessingType] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STORED_PAYMENT,
                /**
                 * An enum member indicating that [TransactionProcessingType] was instantiated with
                 * an unknown value.
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
                    STORED_PAYMENT -> Value.STORED_PAYMENT
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
                    STORED_PAYMENT -> Known.STORED_PAYMENT
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown TransactionProcessingType: $value"
                        )
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

            fun validate(): TransactionProcessingType = apply {
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

                return other is TransactionProcessingType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                amountCents == other.amountCents &&
                amountCurrency == other.amountCurrency &&
                autoRecharge == other.autoRecharge &&
                createdAt == other.createdAt &&
                processorStatus == other.processorStatus &&
                recordType == other.recordType &&
                transactionProcessingType == other.transactionProcessingType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amountCents,
                amountCurrency,
                autoRecharge,
                createdAt,
                processorStatus,
                recordType,
                transactionProcessingType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, amountCents=$amountCents, amountCurrency=$amountCurrency, autoRecharge=$autoRecharge, createdAt=$createdAt, processorStatus=$processorStatus, recordType=$recordType, transactionProcessingType=$transactionProcessingType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentCreateStoredPaymentTransactionResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateStoredPaymentTransactionResponse{data=$data, additionalProperties=$additionalProperties}"
}
