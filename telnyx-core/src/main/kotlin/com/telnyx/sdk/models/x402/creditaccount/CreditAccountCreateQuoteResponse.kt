// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

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

class CreditAccountCreateQuoteResponse
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
         * [CreditAccountCreateQuoteResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditAccountCreateQuoteResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditAccountCreateQuoteResponse: CreditAccountCreateQuoteResponse) =
            apply {
                data = creditAccountCreateQuoteResponse.data
                additionalProperties =
                    creditAccountCreateQuoteResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CreditAccountCreateQuoteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditAccountCreateQuoteResponse =
            CreditAccountCreateQuoteResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CreditAccountCreateQuoteResponse = apply {
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
        private val amountCrypto: JsonField<String>,
        private val amountUsd: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val network: JsonField<String>,
        private val paymentRequirements: JsonField<PaymentRequirements>,
        private val recordType: JsonField<RecordType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_crypto")
            @ExcludeMissing
            amountCrypto: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_usd")
            @ExcludeMissing
            amountUsd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("network") @ExcludeMissing network: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_requirements")
            @ExcludeMissing
            paymentRequirements: JsonField<PaymentRequirements> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
        ) : this(
            id,
            amountCrypto,
            amountUsd,
            expiresAt,
            network,
            paymentRequirements,
            recordType,
            mutableMapOf(),
        )

        /**
         * Unique quote identifier. Use this to settle the payment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The equivalent amount in the payment cryptocurrency's smallest unit (e.g. USDC has 6
         * decimals, so $50.00 = "50000000").
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountCrypto(): Optional<String> = amountCrypto.getOptional("amount_crypto")

        /**
         * The quoted amount in USD.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountUsd(): Optional<String> = amountUsd.getOptional("amount_usd")

        /**
         * ISO 8601 timestamp when the quote expires.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

        /**
         * The blockchain network for the payment in CAIP-2 format (e.g. eip155:8453 for Base).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun network(): Optional<String> = network.getOptional("network")

        /**
         * x402 protocol v2 payment requirements. Contains all information needed to construct and
         * sign a payment authorization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentRequirements(): Optional<PaymentRequirements> =
            paymentRequirements.getOptional("payment_requirements")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amountCrypto].
         *
         * Unlike [amountCrypto], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_crypto")
        @ExcludeMissing
        fun _amountCrypto(): JsonField<String> = amountCrypto

        /**
         * Returns the raw JSON value of [amountUsd].
         *
         * Unlike [amountUsd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_usd") @ExcludeMissing fun _amountUsd(): JsonField<String> = amountUsd

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [network].
         *
         * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<String> = network

        /**
         * Returns the raw JSON value of [paymentRequirements].
         *
         * Unlike [paymentRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_requirements")
        @ExcludeMissing
        fun _paymentRequirements(): JsonField<PaymentRequirements> = paymentRequirements

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

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
            private var amountCrypto: JsonField<String> = JsonMissing.of()
            private var amountUsd: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var network: JsonField<String> = JsonMissing.of()
            private var paymentRequirements: JsonField<PaymentRequirements> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                amountCrypto = data.amountCrypto
                amountUsd = data.amountUsd
                expiresAt = data.expiresAt
                network = data.network
                paymentRequirements = data.paymentRequirements
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique quote identifier. Use this to settle the payment. */
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
             * The equivalent amount in the payment cryptocurrency's smallest unit (e.g. USDC has 6
             * decimals, so $50.00 = "50000000").
             */
            fun amountCrypto(amountCrypto: String) = amountCrypto(JsonField.of(amountCrypto))

            /**
             * Sets [Builder.amountCrypto] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountCrypto] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountCrypto(amountCrypto: JsonField<String>) = apply {
                this.amountCrypto = amountCrypto
            }

            /** The quoted amount in USD. */
            fun amountUsd(amountUsd: String) = amountUsd(JsonField.of(amountUsd))

            /**
             * Sets [Builder.amountUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountUsd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountUsd(amountUsd: JsonField<String>) = apply { this.amountUsd = amountUsd }

            /** ISO 8601 timestamp when the quote expires. */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * The blockchain network for the payment in CAIP-2 format (e.g. eip155:8453 for Base).
             */
            fun network(network: String) = network(JsonField.of(network))

            /**
             * Sets [Builder.network] to an arbitrary JSON value.
             *
             * You should usually call [Builder.network] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun network(network: JsonField<String>) = apply { this.network = network }

            /**
             * x402 protocol v2 payment requirements. Contains all information needed to construct
             * and sign a payment authorization.
             */
            fun paymentRequirements(paymentRequirements: PaymentRequirements) =
                paymentRequirements(JsonField.of(paymentRequirements))

            /**
             * Sets [Builder.paymentRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRequirements] with a well-typed
             * [PaymentRequirements] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun paymentRequirements(paymentRequirements: JsonField<PaymentRequirements>) = apply {
                this.paymentRequirements = paymentRequirements
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
                    amountCrypto,
                    amountUsd,
                    expiresAt,
                    network,
                    paymentRequirements,
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            amountCrypto()
            amountUsd()
            expiresAt()
            network()
            paymentRequirements().ifPresent { it.validate() }
            recordType().ifPresent { it.validate() }
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
                (if (amountCrypto.asKnown().isPresent) 1 else 0) +
                (if (amountUsd.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (network.asKnown().isPresent) 1 else 0) +
                (paymentRequirements.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * x402 protocol v2 payment requirements. Contains all information needed to construct and
         * sign a payment authorization.
         */
        class PaymentRequirements
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accepts: JsonField<List<Accept>>,
            private val resource: JsonField<Resource>,
            private val x402Version: JsonField<X402Version>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accepts")
                @ExcludeMissing
                accepts: JsonField<List<Accept>> = JsonMissing.of(),
                @JsonProperty("resource")
                @ExcludeMissing
                resource: JsonField<Resource> = JsonMissing.of(),
                @JsonProperty("x402Version")
                @ExcludeMissing
                x402Version: JsonField<X402Version> = JsonMissing.of(),
            ) : this(accepts, resource, x402Version, mutableMapOf())

            /**
             * Accepted payment schemes. Currently only the `exact` EVM scheme is supported.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accepts(): Optional<List<Accept>> = accepts.getOptional("accepts")

            /**
             * The resource being paid for. Included in the payment signature.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun resource(): Optional<Resource> = resource.getOptional("resource")

            /**
             * x402 protocol version. Currently always 2.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun x402Version(): Optional<X402Version> = x402Version.getOptional("x402Version")

            /**
             * Returns the raw JSON value of [accepts].
             *
             * Unlike [accepts], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("accepts")
            @ExcludeMissing
            fun _accepts(): JsonField<List<Accept>> = accepts

            /**
             * Returns the raw JSON value of [resource].
             *
             * Unlike [resource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resource")
            @ExcludeMissing
            fun _resource(): JsonField<Resource> = resource

            /**
             * Returns the raw JSON value of [x402Version].
             *
             * Unlike [x402Version], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("x402Version")
            @ExcludeMissing
            fun _x402Version(): JsonField<X402Version> = x402Version

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
                 * Returns a mutable builder for constructing an instance of [PaymentRequirements].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentRequirements]. */
            class Builder internal constructor() {

                private var accepts: JsonField<MutableList<Accept>>? = null
                private var resource: JsonField<Resource> = JsonMissing.of()
                private var x402Version: JsonField<X402Version> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentRequirements: PaymentRequirements) = apply {
                    accepts = paymentRequirements.accepts.map { it.toMutableList() }
                    resource = paymentRequirements.resource
                    x402Version = paymentRequirements.x402Version
                    additionalProperties = paymentRequirements.additionalProperties.toMutableMap()
                }

                /** Accepted payment schemes. Currently only the `exact` EVM scheme is supported. */
                fun accepts(accepts: List<Accept>) = accepts(JsonField.of(accepts))

                /**
                 * Sets [Builder.accepts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accepts] with a well-typed `List<Accept>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accepts(accepts: JsonField<List<Accept>>) = apply {
                    this.accepts = accepts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Accept] to [accepts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAccept(accept: Accept) = apply {
                    accepts =
                        (accepts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("accepts", it).add(accept)
                        }
                }

                /** The resource being paid for. Included in the payment signature. */
                fun resource(resource: Resource) = resource(JsonField.of(resource))

                /**
                 * Sets [Builder.resource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resource] with a well-typed [Resource] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resource(resource: JsonField<Resource>) = apply { this.resource = resource }

                /** x402 protocol version. Currently always 2. */
                fun x402Version(x402Version: X402Version) = x402Version(JsonField.of(x402Version))

                /**
                 * Sets [Builder.x402Version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.x402Version] with a well-typed [X402Version]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun x402Version(x402Version: JsonField<X402Version>) = apply {
                    this.x402Version = x402Version
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PaymentRequirements].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PaymentRequirements =
                    PaymentRequirements(
                        (accepts ?: JsonMissing.of()).map { it.toImmutable() },
                        resource,
                        x402Version,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentRequirements = apply {
                if (validated) {
                    return@apply
                }

                accepts().ifPresent { it.forEach { it.validate() } }
                resource().ifPresent { it.validate() }
                x402Version().ifPresent { it.validate() }
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
                (accepts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (resource.asKnown().getOrNull()?.validity() ?: 0) +
                    (x402Version.asKnown().getOrNull()?.validity() ?: 0)

            class Accept
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<String>,
                private val asset: JsonField<String>,
                private val extra: JsonField<Extra>,
                private val maxTimeoutSeconds: JsonField<Long>,
                private val network: JsonField<String>,
                private val payTo: JsonField<String>,
                private val scheme: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("asset")
                    @ExcludeMissing
                    asset: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("extra")
                    @ExcludeMissing
                    extra: JsonField<Extra> = JsonMissing.of(),
                    @JsonProperty("maxTimeoutSeconds")
                    @ExcludeMissing
                    maxTimeoutSeconds: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("network")
                    @ExcludeMissing
                    network: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("payTo")
                    @ExcludeMissing
                    payTo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("scheme")
                    @ExcludeMissing
                    scheme: JsonField<String> = JsonMissing.of(),
                ) : this(
                    amount,
                    asset,
                    extra,
                    maxTimeoutSeconds,
                    network,
                    payTo,
                    scheme,
                    mutableMapOf(),
                )

                /**
                 * Amount in the token's smallest unit.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<String> = amount.getOptional("amount")

                /**
                 * Token contract address (e.g. USDC on Base).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun asset(): Optional<String> = asset.getOptional("asset")

                /**
                 * Additional scheme-specific parameters including EIP-712 domain info and the
                 * facilitator URL.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun extra(): Optional<Extra> = extra.getOptional("extra")

                /**
                 * Maximum time in seconds before the payment authorization expires.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun maxTimeoutSeconds(): Optional<Long> =
                    maxTimeoutSeconds.getOptional("maxTimeoutSeconds")

                /**
                 * Blockchain network identifier in CAIP-2 format (e.g. "eip155:8453" for Base).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun network(): Optional<String> = network.getOptional("network")

                /**
                 * Recipient wallet address.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun payTo(): Optional<String> = payTo.getOptional("payTo")

                /**
                 * Payment scheme (e.g. "exact").
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun scheme(): Optional<String> = scheme.getOptional("scheme")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [asset].
                 *
                 * Unlike [asset], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("asset") @ExcludeMissing fun _asset(): JsonField<String> = asset

                /**
                 * Returns the raw JSON value of [extra].
                 *
                 * Unlike [extra], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonField<Extra> = extra

                /**
                 * Returns the raw JSON value of [maxTimeoutSeconds].
                 *
                 * Unlike [maxTimeoutSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maxTimeoutSeconds")
                @ExcludeMissing
                fun _maxTimeoutSeconds(): JsonField<Long> = maxTimeoutSeconds

                /**
                 * Returns the raw JSON value of [network].
                 *
                 * Unlike [network], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<String> = network

                /**
                 * Returns the raw JSON value of [payTo].
                 *
                 * Unlike [payTo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("payTo") @ExcludeMissing fun _payTo(): JsonField<String> = payTo

                /**
                 * Returns the raw JSON value of [scheme].
                 *
                 * Unlike [scheme], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scheme") @ExcludeMissing fun _scheme(): JsonField<String> = scheme

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

                    /** Returns a mutable builder for constructing an instance of [Accept]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Accept]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var asset: JsonField<String> = JsonMissing.of()
                    private var extra: JsonField<Extra> = JsonMissing.of()
                    private var maxTimeoutSeconds: JsonField<Long> = JsonMissing.of()
                    private var network: JsonField<String> = JsonMissing.of()
                    private var payTo: JsonField<String> = JsonMissing.of()
                    private var scheme: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accept: Accept) = apply {
                        amount = accept.amount
                        asset = accept.asset
                        extra = accept.extra
                        maxTimeoutSeconds = accept.maxTimeoutSeconds
                        network = accept.network
                        payTo = accept.payTo
                        scheme = accept.scheme
                        additionalProperties = accept.additionalProperties.toMutableMap()
                    }

                    /** Amount in the token's smallest unit. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** Token contract address (e.g. USDC on Base). */
                    fun asset(asset: String) = asset(JsonField.of(asset))

                    /**
                     * Sets [Builder.asset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.asset] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun asset(asset: JsonField<String>) = apply { this.asset = asset }

                    /**
                     * Additional scheme-specific parameters including EIP-712 domain info and the
                     * facilitator URL.
                     */
                    fun extra(extra: Extra) = extra(JsonField.of(extra))

                    /**
                     * Sets [Builder.extra] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.extra] with a well-typed [Extra] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun extra(extra: JsonField<Extra>) = apply { this.extra = extra }

                    /** Maximum time in seconds before the payment authorization expires. */
                    fun maxTimeoutSeconds(maxTimeoutSeconds: Long) =
                        maxTimeoutSeconds(JsonField.of(maxTimeoutSeconds))

                    /**
                     * Sets [Builder.maxTimeoutSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxTimeoutSeconds] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxTimeoutSeconds(maxTimeoutSeconds: JsonField<Long>) = apply {
                        this.maxTimeoutSeconds = maxTimeoutSeconds
                    }

                    /**
                     * Blockchain network identifier in CAIP-2 format (e.g. "eip155:8453" for Base).
                     */
                    fun network(network: String) = network(JsonField.of(network))

                    /**
                     * Sets [Builder.network] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.network] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun network(network: JsonField<String>) = apply { this.network = network }

                    /** Recipient wallet address. */
                    fun payTo(payTo: String) = payTo(JsonField.of(payTo))

                    /**
                     * Sets [Builder.payTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.payTo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun payTo(payTo: JsonField<String>) = apply { this.payTo = payTo }

                    /** Payment scheme (e.g. "exact"). */
                    fun scheme(scheme: String) = scheme(JsonField.of(scheme))

                    /**
                     * Sets [Builder.scheme] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scheme] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun scheme(scheme: JsonField<String>) = apply { this.scheme = scheme }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Accept].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Accept =
                        Accept(
                            amount,
                            asset,
                            extra,
                            maxTimeoutSeconds,
                            network,
                            payTo,
                            scheme,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Accept = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    asset()
                    extra().ifPresent { it.validate() }
                    maxTimeoutSeconds()
                    network()
                    payTo()
                    scheme()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (asset.asKnown().isPresent) 1 else 0) +
                        (extra.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (maxTimeoutSeconds.asKnown().isPresent) 1 else 0) +
                        (if (network.asKnown().isPresent) 1 else 0) +
                        (if (payTo.asKnown().isPresent) 1 else 0) +
                        (if (scheme.asKnown().isPresent) 1 else 0)

                /**
                 * Additional scheme-specific parameters including EIP-712 domain info and the
                 * facilitator URL.
                 */
                class Extra
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val facilitatorUrl: JsonField<String>,
                    private val name: JsonField<String>,
                    private val quoteId: JsonField<String>,
                    private val version: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("facilitatorUrl")
                        @ExcludeMissing
                        facilitatorUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("quoteId")
                        @ExcludeMissing
                        quoteId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("version")
                        @ExcludeMissing
                        version: JsonField<String> = JsonMissing.of(),
                    ) : this(facilitatorUrl, name, quoteId, version, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun facilitatorUrl(): Optional<String> =
                        facilitatorUrl.getOptional("facilitatorUrl")

                    /**
                     * EIP-712 domain name (e.g. "USD Coin").
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = name.getOptional("name")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun quoteId(): Optional<String> = quoteId.getOptional("quoteId")

                    /**
                     * EIP-712 domain version.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun version(): Optional<String> = version.getOptional("version")

                    /**
                     * Returns the raw JSON value of [facilitatorUrl].
                     *
                     * Unlike [facilitatorUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("facilitatorUrl")
                    @ExcludeMissing
                    fun _facilitatorUrl(): JsonField<String> = facilitatorUrl

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [quoteId].
                     *
                     * Unlike [quoteId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("quoteId")
                    @ExcludeMissing
                    fun _quoteId(): JsonField<String> = quoteId

                    /**
                     * Returns the raw JSON value of [version].
                     *
                     * Unlike [version], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("version")
                    @ExcludeMissing
                    fun _version(): JsonField<String> = version

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

                        /** Returns a mutable builder for constructing an instance of [Extra]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Extra]. */
                    class Builder internal constructor() {

                        private var facilitatorUrl: JsonField<String> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var quoteId: JsonField<String> = JsonMissing.of()
                        private var version: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(extra: Extra) = apply {
                            facilitatorUrl = extra.facilitatorUrl
                            name = extra.name
                            quoteId = extra.quoteId
                            version = extra.version
                            additionalProperties = extra.additionalProperties.toMutableMap()
                        }

                        fun facilitatorUrl(facilitatorUrl: String) =
                            facilitatorUrl(JsonField.of(facilitatorUrl))

                        /**
                         * Sets [Builder.facilitatorUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.facilitatorUrl] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun facilitatorUrl(facilitatorUrl: JsonField<String>) = apply {
                            this.facilitatorUrl = facilitatorUrl
                        }

                        /** EIP-712 domain name (e.g. "USD Coin"). */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun quoteId(quoteId: String) = quoteId(JsonField.of(quoteId))

                        /**
                         * Sets [Builder.quoteId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.quoteId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

                        /** EIP-712 domain version. */
                        fun version(version: String) = version(JsonField.of(version))

                        /**
                         * Sets [Builder.version] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.version] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun version(version: JsonField<String>) = apply { this.version = version }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Extra].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Extra =
                            Extra(
                                facilitatorUrl,
                                name,
                                quoteId,
                                version,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Extra = apply {
                        if (validated) {
                            return@apply
                        }

                        facilitatorUrl()
                        name()
                        quoteId()
                        version()
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
                        (if (facilitatorUrl.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (if (quoteId.asKnown().isPresent) 1 else 0) +
                            (if (version.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Extra &&
                            facilitatorUrl == other.facilitatorUrl &&
                            name == other.name &&
                            quoteId == other.quoteId &&
                            version == other.version &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(facilitatorUrl, name, quoteId, version, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Extra{facilitatorUrl=$facilitatorUrl, name=$name, quoteId=$quoteId, version=$version, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Accept &&
                        amount == other.amount &&
                        asset == other.asset &&
                        extra == other.extra &&
                        maxTimeoutSeconds == other.maxTimeoutSeconds &&
                        network == other.network &&
                        payTo == other.payTo &&
                        scheme == other.scheme &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        amount,
                        asset,
                        extra,
                        maxTimeoutSeconds,
                        network,
                        payTo,
                        scheme,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Accept{amount=$amount, asset=$asset, extra=$extra, maxTimeoutSeconds=$maxTimeoutSeconds, network=$network, payTo=$payTo, scheme=$scheme, additionalProperties=$additionalProperties}"
            }

            /** The resource being paid for. Included in the payment signature. */
            class Resource
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val description: JsonField<String>,
                private val mimeType: JsonField<String>,
                private val url: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("mimeType")
                    @ExcludeMissing
                    mimeType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                ) : this(description, mimeType, url, mutableMapOf())

                /**
                 * Human-readable description of the payment.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * MIME type of the resource.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mimeType(): Optional<String> = mimeType.getOptional("mimeType")

                /**
                 * Canonical URL of the payment resource.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun url(): Optional<String> = url.getOptional("url")

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [mimeType].
                 *
                 * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("mimeType")
                @ExcludeMissing
                fun _mimeType(): JsonField<String> = mimeType

                /**
                 * Returns the raw JSON value of [url].
                 *
                 * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                    /** Returns a mutable builder for constructing an instance of [Resource]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Resource]. */
                class Builder internal constructor() {

                    private var description: JsonField<String> = JsonMissing.of()
                    private var mimeType: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resource: Resource) = apply {
                        description = resource.description
                        mimeType = resource.mimeType
                        url = resource.url
                        additionalProperties = resource.additionalProperties.toMutableMap()
                    }

                    /** Human-readable description of the payment. */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** MIME type of the resource. */
                    fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

                    /**
                     * Sets [Builder.mimeType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mimeType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

                    /** Canonical URL of the payment resource. */
                    fun url(url: String) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun url(url: JsonField<String>) = apply { this.url = url }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Resource].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Resource =
                        Resource(description, mimeType, url, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Resource = apply {
                    if (validated) {
                        return@apply
                    }

                    description()
                    mimeType()
                    url()
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
                    (if (description.asKnown().isPresent) 1 else 0) +
                        (if (mimeType.asKnown().isPresent) 1 else 0) +
                        (if (url.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Resource &&
                        description == other.description &&
                        mimeType == other.mimeType &&
                        url == other.url &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(description, mimeType, url, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resource{description=$description, mimeType=$mimeType, url=$url, additionalProperties=$additionalProperties}"
            }

            /** x402 protocol version. Currently always 2. */
            class X402Version @JsonCreator private constructor(private val value: JsonField<Long>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

                companion object {

                    @JvmField val _2 = of(2L)

                    @JvmStatic fun of(value: Long) = X402Version(JsonField.of(value))
                }

                /** An enum containing [X402Version]'s known values. */
                enum class Known {
                    _2
                }

                /**
                 * An enum containing [X402Version]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [X402Version] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    _2,
                    /**
                     * An enum member indicating that [X402Version] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        _2 -> Value._2
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        _2 -> Known._2
                        else -> throw TelnyxInvalidDataException("Unknown X402Version: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asLong(): Long =
                    _value().asNumber().getOrNull()?.let {
                        if (it.toDouble() % 1 == 0.0) it.toLong() else null
                    } ?: throw TelnyxInvalidDataException("Value is not a Long")

                private var validated: Boolean = false

                fun validate(): X402Version = apply {
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

                    return other is X402Version && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentRequirements &&
                    accepts == other.accepts &&
                    resource == other.resource &&
                    x402Version == other.x402Version &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accepts, resource, x402Version, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentRequirements{accepts=$accepts, resource=$resource, x402Version=$x402Version, additionalProperties=$additionalProperties}"
        }

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

                @JvmField val QUOTE = of("quote")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                QUOTE
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
                QUOTE,
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
                    QUOTE -> Value.QUOTE
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
                    QUOTE -> Known.QUOTE
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                amountCrypto == other.amountCrypto &&
                amountUsd == other.amountUsd &&
                expiresAt == other.expiresAt &&
                network == other.network &&
                paymentRequirements == other.paymentRequirements &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amountCrypto,
                amountUsd,
                expiresAt,
                network,
                paymentRequirements,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, amountCrypto=$amountCrypto, amountUsd=$amountUsd, expiresAt=$expiresAt, network=$network, paymentRequirements=$paymentRequirements, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditAccountCreateQuoteResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditAccountCreateQuoteResponse{data=$data, additionalProperties=$additionalProperties}"
}
