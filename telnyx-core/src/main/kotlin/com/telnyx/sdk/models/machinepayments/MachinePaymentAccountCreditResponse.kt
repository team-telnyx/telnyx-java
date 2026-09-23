// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.machinepayments

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

class MachinePaymentAccountCreditResponse
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
     * An account-credit transaction settled through the Machine Payment Protocol.
     *
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
         * [MachinePaymentAccountCreditResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MachinePaymentAccountCreditResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            machinePaymentAccountCreditResponse: MachinePaymentAccountCreditResponse
        ) = apply {
            data = machinePaymentAccountCreditResponse.data
            additionalProperties =
                machinePaymentAccountCreditResponse.additionalProperties.toMutableMap()
        }

        /** An account-credit transaction settled through the Machine Payment Protocol. */
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
         * Returns an immutable instance of [MachinePaymentAccountCreditResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MachinePaymentAccountCreditResponse =
            MachinePaymentAccountCreditResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): MachinePaymentAccountCreditResponse = apply {
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

    /** An account-credit transaction settled through the Machine Payment Protocol. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountId: JsonField<String>,
        private val amount: JsonField<String>,
        private val currency: JsonField<String>,
        private val paymentSource: JsonField<PaymentSource>,
        private val recordType: JsonField<RecordType>,
        private val created: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val mppResource: JsonField<String>,
        private val paymentIntentId: JsonField<String>,
        private val paymentMethod: JsonField<PaymentMethod>,
        private val provider: JsonField<Provider>,
        private val receiptReference: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_source")
            @ExcludeMissing
            paymentSource: JsonField<PaymentSource> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("created") @ExcludeMissing created: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("mpp_resource")
            @ExcludeMissing
            mppResource: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_intent_id")
            @ExcludeMissing
            paymentIntentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_method")
            @ExcludeMissing
            paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("receipt_reference")
            @ExcludeMissing
            receiptReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            id,
            accountId,
            amount,
            currency,
            paymentSource,
            recordType,
            created,
            createdAt,
            mppResource,
            paymentIntentId,
            paymentMethod,
            provider,
            receiptReference,
            status,
            mutableMapOf(),
        )

        /**
         * Unique identifier of the account-credit transaction.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Identifier of the credited Telnyx account. Derived from the authenticated user on the
         * initial request and from the verified payment credential on a paid retry — never from the
         * request body.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Credited amount as a decimal string with two fractional digits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * ISO 4217 currency code of the credited amount (currently always USD).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Payment source identifier distinguishing machine payments from other account-credit
         * sources.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentSource(): PaymentSource = paymentSource.getRequired("payment_source")

        /**
         * Record type identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * True when this response created a new account credit, false when an existing transaction
         * was returned for a duplicate paid retry.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun created(): Optional<Boolean> = created.getOptional("created")

        /**
         * ISO 8601 timestamp when the transaction was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Machine Payment Protocol resource identifier the payment credential was bound to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mppResource(): Optional<String> = mppResource.getOptional("mpp_resource")

        /**
         * Stripe PaymentIntent identifier for Stripe settlements. Absent for Tempo settlements.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentIntentId(): Optional<String> = paymentIntentId.getOptional("payment_intent_id")

        /**
         * Payment method used by the provider: `stripe_spt` for Stripe Shared Payment Token
         * payments, `tempo_usdc` for Tempo USDC payments.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentMethod(): Optional<PaymentMethod> = paymentMethod.getOptional("payment_method")

        /**
         * Upstream payment provider that settled the payment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Provider receipt reference: the Stripe PaymentIntent identifier for Stripe settlements,
         * or the on-chain transaction hash for Tempo settlements.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun receiptReference(): Optional<String> = receiptReference.getOptional("receipt_reference")

        /**
         * Status of the transaction. Successful machine payment credits are recorded as `settled`.
         *
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
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [paymentSource].
         *
         * Unlike [paymentSource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_source")
        @ExcludeMissing
        fun _paymentSource(): JsonField<PaymentSource> = paymentSource

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Boolean> = created

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [mppResource].
         *
         * Unlike [mppResource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mpp_resource")
        @ExcludeMissing
        fun _mppResource(): JsonField<String> = mppResource

        /**
         * Returns the raw JSON value of [paymentIntentId].
         *
         * Unlike [paymentIntentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_intent_id")
        @ExcludeMissing
        fun _paymentIntentId(): JsonField<String> = paymentIntentId

        /**
         * Returns the raw JSON value of [paymentMethod].
         *
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [receiptReference].
         *
         * Unlike [receiptReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receipt_reference")
        @ExcludeMissing
        fun _receiptReference(): JsonField<String> = receiptReference

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountId()
             * .amount()
             * .currency()
             * .paymentSource()
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var amount: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var paymentSource: JsonField<PaymentSource>? = null
            private var recordType: JsonField<RecordType>? = null
            private var created: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var mppResource: JsonField<String> = JsonMissing.of()
            private var paymentIntentId: JsonField<String> = JsonMissing.of()
            private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var receiptReference: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                accountId = data.accountId
                amount = data.amount
                currency = data.currency
                paymentSource = data.paymentSource
                recordType = data.recordType
                created = data.created
                createdAt = data.createdAt
                mppResource = data.mppResource
                paymentIntentId = data.paymentIntentId
                paymentMethod = data.paymentMethod
                provider = data.provider
                receiptReference = data.receiptReference
                status = data.status
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier of the account-credit transaction. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Identifier of the credited Telnyx account. Derived from the authenticated user on the
             * initial request and from the verified payment credential on a paid retry — never from
             * the request body.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Credited amount as a decimal string with two fractional digits. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** ISO 4217 currency code of the credited amount (currently always USD). */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Payment source identifier distinguishing machine payments from other account-credit
             * sources.
             */
            fun paymentSource(paymentSource: PaymentSource) =
                paymentSource(JsonField.of(paymentSource))

            /**
             * Sets [Builder.paymentSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentSource] with a well-typed [PaymentSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentSource(paymentSource: JsonField<PaymentSource>) = apply {
                this.paymentSource = paymentSource
            }

            /** Record type identifier. */
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

            /**
             * True when this response created a new account credit, false when an existing
             * transaction was returned for a duplicate paid retry.
             */
            fun created(created: Boolean) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<Boolean>) = apply { this.created = created }

            /** ISO 8601 timestamp when the transaction was created. */
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

            /** Machine Payment Protocol resource identifier the payment credential was bound to. */
            fun mppResource(mppResource: String?) = mppResource(JsonField.ofNullable(mppResource))

            /** Alias for calling [Builder.mppResource] with `mppResource.orElse(null)`. */
            fun mppResource(mppResource: Optional<String>) = mppResource(mppResource.getOrNull())

            /**
             * Sets [Builder.mppResource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mppResource] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mppResource(mppResource: JsonField<String>) = apply {
                this.mppResource = mppResource
            }

            /**
             * Stripe PaymentIntent identifier for Stripe settlements. Absent for Tempo settlements.
             */
            fun paymentIntentId(paymentIntentId: String?) =
                paymentIntentId(JsonField.ofNullable(paymentIntentId))

            /** Alias for calling [Builder.paymentIntentId] with `paymentIntentId.orElse(null)`. */
            fun paymentIntentId(paymentIntentId: Optional<String>) =
                paymentIntentId(paymentIntentId.getOrNull())

            /**
             * Sets [Builder.paymentIntentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentIntentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentIntentId(paymentIntentId: JsonField<String>) = apply {
                this.paymentIntentId = paymentIntentId
            }

            /**
             * Payment method used by the provider: `stripe_spt` for Stripe Shared Payment Token
             * payments, `tempo_usdc` for Tempo USDC payments.
             */
            fun paymentMethod(paymentMethod: PaymentMethod?) =
                paymentMethod(JsonField.ofNullable(paymentMethod))

            /** Alias for calling [Builder.paymentMethod] with `paymentMethod.orElse(null)`. */
            fun paymentMethod(paymentMethod: Optional<PaymentMethod>) =
                paymentMethod(paymentMethod.getOrNull())

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            /** Upstream payment provider that settled the payment. */
            fun provider(provider: Provider?) = provider(JsonField.ofNullable(provider))

            /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
            fun provider(provider: Optional<Provider>) = provider(provider.getOrNull())

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /**
             * Provider receipt reference: the Stripe PaymentIntent identifier for Stripe
             * settlements, or the on-chain transaction hash for Tempo settlements.
             */
            fun receiptReference(receiptReference: String?) =
                receiptReference(JsonField.ofNullable(receiptReference))

            /**
             * Alias for calling [Builder.receiptReference] with `receiptReference.orElse(null)`.
             */
            fun receiptReference(receiptReference: Optional<String>) =
                receiptReference(receiptReference.getOrNull())

            /**
             * Sets [Builder.receiptReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiptReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiptReference(receiptReference: JsonField<String>) = apply {
                this.receiptReference = receiptReference
            }

            /**
             * Status of the transaction. Successful machine payment credits are recorded as
             * `settled`.
             */
            fun status(status: Status?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountId()
             * .amount()
             * .currency()
             * .paymentSource()
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
                    checkRequired("paymentSource", paymentSource),
                    checkRequired("recordType", recordType),
                    created,
                    createdAt,
                    mppResource,
                    paymentIntentId,
                    paymentMethod,
                    provider,
                    receiptReference,
                    status,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            accountId()
            amount()
            currency()
            paymentSource().validate()
            recordType().validate()
            created()
            createdAt()
            mppResource()
            paymentIntentId()
            paymentMethod().ifPresent { it.validate() }
            provider().ifPresent { it.validate() }
            receiptReference()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (paymentSource.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (mppResource.asKnown().isPresent) 1 else 0) +
                (if (paymentIntentId.asKnown().isPresent) 1 else 0) +
                (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (receiptReference.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Payment source identifier distinguishing machine payments from other account-credit
         * sources.
         */
        class PaymentSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val MACHINE_PAYMENT = of("machine_payment")

                @JvmStatic fun of(value: String) = PaymentSource(JsonField.of(value))
            }

            /** An enum containing [PaymentSource]'s known values. */
            enum class Known {
                MACHINE_PAYMENT
            }

            /**
             * An enum containing [PaymentSource]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentSource] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MACHINE_PAYMENT,
                /**
                 * An enum member indicating that [PaymentSource] was instantiated with an unknown
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
                    MACHINE_PAYMENT -> Value.MACHINE_PAYMENT
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
                    MACHINE_PAYMENT -> Known.MACHINE_PAYMENT
                    else -> throw TelnyxInvalidDataException("Unknown PaymentSource: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PaymentSource = apply {
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

                return other is PaymentSource && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Record type identifier. */
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

                @JvmField val MACHINE_PAYMENT_ACCOUNT_CREDIT = of("machine_payment_account_credit")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                MACHINE_PAYMENT_ACCOUNT_CREDIT
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
                MACHINE_PAYMENT_ACCOUNT_CREDIT,
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
                    MACHINE_PAYMENT_ACCOUNT_CREDIT -> Value.MACHINE_PAYMENT_ACCOUNT_CREDIT
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
                    MACHINE_PAYMENT_ACCOUNT_CREDIT -> Known.MACHINE_PAYMENT_ACCOUNT_CREDIT
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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
         * Payment method used by the provider: `stripe_spt` for Stripe Shared Payment Token
         * payments, `tempo_usdc` for Tempo USDC payments.
         */
        class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val STRIPE_SPT = of("stripe_spt")

                @JvmField val TEMPO_USDC = of("tempo_usdc")

                @JvmStatic fun of(value: String) = PaymentMethod(JsonField.of(value))
            }

            /** An enum containing [PaymentMethod]'s known values. */
            enum class Known {
                STRIPE_SPT,
                TEMPO_USDC,
            }

            /**
             * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE_SPT,
                TEMPO_USDC,
                /**
                 * An enum member indicating that [PaymentMethod] was instantiated with an unknown
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
                    STRIPE_SPT -> Value.STRIPE_SPT
                    TEMPO_USDC -> Value.TEMPO_USDC
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
                    STRIPE_SPT -> Known.STRIPE_SPT
                    TEMPO_USDC -> Known.TEMPO_USDC
                    else -> throw TelnyxInvalidDataException("Unknown PaymentMethod: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PaymentMethod = apply {
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

                return other is PaymentMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Upstream payment provider that settled the payment. */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val STRIPE = of("stripe")

                @JvmField val TEMPO = of("tempo")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                STRIPE,
                TEMPO,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE,
                TEMPO,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    STRIPE -> Value.STRIPE
                    TEMPO -> Value.TEMPO
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
                    STRIPE -> Known.STRIPE
                    TEMPO -> Known.TEMPO
                    else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Status of the transaction. Successful machine payment credits are recorded as `settled`.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val NEW = of("new")

                @JvmField val PROCESSING = of("processing")

                @JvmField val SETTLED = of("settled")

                @JvmField val EXPIRED = of("expired")

                @JvmField val INVALID = of("invalid")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                NEW,
                PROCESSING,
                SETTLED,
                EXPIRED,
                INVALID,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEW,
                PROCESSING,
                SETTLED,
                EXPIRED,
                INVALID,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PROCESSING -> Value.PROCESSING
                    SETTLED -> Value.SETTLED
                    EXPIRED -> Value.EXPIRED
                    INVALID -> Value.INVALID
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
                    PROCESSING -> Known.PROCESSING
                    SETTLED -> Known.SETTLED
                    EXPIRED -> Known.EXPIRED
                    INVALID -> Known.INVALID
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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

            return other is Data &&
                id == other.id &&
                accountId == other.accountId &&
                amount == other.amount &&
                currency == other.currency &&
                paymentSource == other.paymentSource &&
                recordType == other.recordType &&
                created == other.created &&
                createdAt == other.createdAt &&
                mppResource == other.mppResource &&
                paymentIntentId == other.paymentIntentId &&
                paymentMethod == other.paymentMethod &&
                provider == other.provider &&
                receiptReference == other.receiptReference &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountId,
                amount,
                currency,
                paymentSource,
                recordType,
                created,
                createdAt,
                mppResource,
                paymentIntentId,
                paymentMethod,
                provider,
                receiptReference,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, accountId=$accountId, amount=$amount, currency=$currency, paymentSource=$paymentSource, recordType=$recordType, created=$created, createdAt=$createdAt, mppResource=$mppResource, paymentIntentId=$paymentIntentId, paymentMethod=$paymentMethod, provider=$provider, receiptReference=$receiptReference, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MachinePaymentAccountCreditResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MachinePaymentAccountCreditResponse{data=$data, additionalProperties=$additionalProperties}"
}
