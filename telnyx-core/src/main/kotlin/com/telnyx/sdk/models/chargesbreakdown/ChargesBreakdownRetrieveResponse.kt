// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.chargesbreakdown

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ChargesBreakdownRetrieveResponse
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

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
         * [ChargesBreakdownRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChargesBreakdownRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chargesBreakdownRetrieveResponse: ChargesBreakdownRetrieveResponse) =
            apply {
                data = chargesBreakdownRetrieveResponse.data
                additionalProperties =
                    chargesBreakdownRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ChargesBreakdownRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChargesBreakdownRetrieveResponse =
            ChargesBreakdownRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChargesBreakdownRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
        private val currency: JsonField<String>,
        private val endDate: JsonField<LocalDate>,
        private val results: JsonField<List<Result>>,
        private val startDate: JsonField<LocalDate>,
        private val userEmail: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<Result>> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(currency, endDate, results, startDate, userEmail, userId, mutableMapOf())

        /**
         * Currency code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * End date of the breakdown period
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        /**
         * List of phone number charge breakdowns
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun results(): List<Result> = results.getRequired("results")

        /**
         * Start date of the breakdown period
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        /**
         * User email address
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userEmail(): String = userEmail.getRequired("user_email")

        /**
         * User identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        /**
         * Returns the raw JSON value of [userEmail].
         *
         * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * .currency()
             * .endDate()
             * .results()
             * .startDate()
             * .userEmail()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var endDate: JsonField<LocalDate>? = null
            private var results: JsonField<MutableList<Result>>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var userEmail: JsonField<String>? = null
            private var userId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                currency = data.currency
                endDate = data.endDate
                results = data.results.map { it.toMutableList() }
                startDate = data.startDate
                userEmail = data.userEmail
                userId = data.userId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Currency code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** End date of the breakdown period */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** List of phone number charge breakdowns */
            fun results(results: List<Result>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<Result>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
                    }
            }

            /** Start date of the breakdown period */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            /** User email address */
            fun userEmail(userEmail: String) = userEmail(JsonField.of(userEmail))

            /**
             * Sets [Builder.userEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

            /** User identifier */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * .currency()
             * .endDate()
             * .results()
             * .startDate()
             * .userEmail()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("currency", currency),
                    checkRequired("endDate", endDate),
                    checkRequired("results", results).map { it.toImmutable() },
                    checkRequired("startDate", startDate),
                    checkRequired("userEmail", userEmail),
                    checkRequired("userId", userId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            currency()
            endDate()
            results().forEach { it.validate() }
            startDate()
            userEmail()
            userId()
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
            (if (currency.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (userEmail.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val chargeType: JsonField<String>,
            private val serviceOwnerEmail: JsonField<String>,
            private val serviceOwnerUserId: JsonField<String>,
            private val services: JsonField<List<Service>>,
            private val tn: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("charge_type")
                @ExcludeMissing
                chargeType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("service_owner_email")
                @ExcludeMissing
                serviceOwnerEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("service_owner_user_id")
                @ExcludeMissing
                serviceOwnerUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("services")
                @ExcludeMissing
                services: JsonField<List<Service>> = JsonMissing.of(),
                @JsonProperty("tn") @ExcludeMissing tn: JsonField<String> = JsonMissing.of(),
            ) : this(
                chargeType,
                serviceOwnerEmail,
                serviceOwnerUserId,
                services,
                tn,
                mutableMapOf(),
            )

            /**
             * Type of charge for the number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun chargeType(): String = chargeType.getRequired("charge_type")

            /**
             * Email address of the service owner
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serviceOwnerEmail(): String = serviceOwnerEmail.getRequired("service_owner_email")

            /**
             * User ID of the service owner
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serviceOwnerUserId(): String =
                serviceOwnerUserId.getRequired("service_owner_user_id")

            /**
             * List of services associated with this number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun services(): List<Service> = services.getRequired("services")

            /**
             * Phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tn(): String = tn.getRequired("tn")

            /**
             * Returns the raw JSON value of [chargeType].
             *
             * Unlike [chargeType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charge_type")
            @ExcludeMissing
            fun _chargeType(): JsonField<String> = chargeType

            /**
             * Returns the raw JSON value of [serviceOwnerEmail].
             *
             * Unlike [serviceOwnerEmail], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("service_owner_email")
            @ExcludeMissing
            fun _serviceOwnerEmail(): JsonField<String> = serviceOwnerEmail

            /**
             * Returns the raw JSON value of [serviceOwnerUserId].
             *
             * Unlike [serviceOwnerUserId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("service_owner_user_id")
            @ExcludeMissing
            fun _serviceOwnerUserId(): JsonField<String> = serviceOwnerUserId

            /**
             * Returns the raw JSON value of [services].
             *
             * Unlike [services], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("services")
            @ExcludeMissing
            fun _services(): JsonField<List<Service>> = services

            /**
             * Returns the raw JSON value of [tn].
             *
             * Unlike [tn], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tn") @ExcludeMissing fun _tn(): JsonField<String> = tn

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .chargeType()
                 * .serviceOwnerEmail()
                 * .serviceOwnerUserId()
                 * .services()
                 * .tn()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var chargeType: JsonField<String>? = null
                private var serviceOwnerEmail: JsonField<String>? = null
                private var serviceOwnerUserId: JsonField<String>? = null
                private var services: JsonField<MutableList<Service>>? = null
                private var tn: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    chargeType = result.chargeType
                    serviceOwnerEmail = result.serviceOwnerEmail
                    serviceOwnerUserId = result.serviceOwnerUserId
                    services = result.services.map { it.toMutableList() }
                    tn = result.tn
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                /** Type of charge for the number */
                fun chargeType(chargeType: String) = chargeType(JsonField.of(chargeType))

                /**
                 * Sets [Builder.chargeType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chargeType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chargeType(chargeType: JsonField<String>) = apply {
                    this.chargeType = chargeType
                }

                /** Email address of the service owner */
                fun serviceOwnerEmail(serviceOwnerEmail: String) =
                    serviceOwnerEmail(JsonField.of(serviceOwnerEmail))

                /**
                 * Sets [Builder.serviceOwnerEmail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceOwnerEmail] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun serviceOwnerEmail(serviceOwnerEmail: JsonField<String>) = apply {
                    this.serviceOwnerEmail = serviceOwnerEmail
                }

                /** User ID of the service owner */
                fun serviceOwnerUserId(serviceOwnerUserId: String) =
                    serviceOwnerUserId(JsonField.of(serviceOwnerUserId))

                /**
                 * Sets [Builder.serviceOwnerUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceOwnerUserId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun serviceOwnerUserId(serviceOwnerUserId: JsonField<String>) = apply {
                    this.serviceOwnerUserId = serviceOwnerUserId
                }

                /** List of services associated with this number */
                fun services(services: List<Service>) = services(JsonField.of(services))

                /**
                 * Sets [Builder.services] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.services] with a well-typed `List<Service>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun services(services: JsonField<List<Service>>) = apply {
                    this.services = services.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Service] to [services].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addService(service: Service) = apply {
                    services =
                        (services ?: JsonField.of(mutableListOf())).also {
                            checkKnown("services", it).add(service)
                        }
                }

                /** Phone number */
                fun tn(tn: String) = tn(JsonField.of(tn))

                /**
                 * Sets [Builder.tn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tn] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tn(tn: JsonField<String>) = apply { this.tn = tn }

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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .chargeType()
                 * .serviceOwnerEmail()
                 * .serviceOwnerUserId()
                 * .services()
                 * .tn()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("chargeType", chargeType),
                        checkRequired("serviceOwnerEmail", serviceOwnerEmail),
                        checkRequired("serviceOwnerUserId", serviceOwnerUserId),
                        checkRequired("services", services).map { it.toImmutable() },
                        checkRequired("tn", tn),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                chargeType()
                serviceOwnerEmail()
                serviceOwnerUserId()
                services().forEach { it.validate() }
                tn()
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
                (if (chargeType.asKnown().isPresent) 1 else 0) +
                    (if (serviceOwnerEmail.asKnown().isPresent) 1 else 0) +
                    (if (serviceOwnerUserId.asKnown().isPresent) 1 else 0) +
                    (services.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (tn.asKnown().isPresent) 1 else 0)

            class Service
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cost: JsonField<String>,
                private val costType: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cost")
                    @ExcludeMissing
                    cost: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("cost_type")
                    @ExcludeMissing
                    costType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(cost, costType, name, mutableMapOf())

                /**
                 * Cost per unit as decimal string
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cost(): String = cost.getRequired("cost")

                /**
                 * Type of cost (MRC or OTC)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun costType(): String = costType.getRequired("cost_type")

                /**
                 * Service name
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [cost].
                 *
                 * Unlike [cost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

                /**
                 * Returns the raw JSON value of [costType].
                 *
                 * Unlike [costType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cost_type")
                @ExcludeMissing
                fun _costType(): JsonField<String> = costType

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * Returns a mutable builder for constructing an instance of [Service].
                     *
                     * The following fields are required:
                     * ```java
                     * .cost()
                     * .costType()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Service]. */
                class Builder internal constructor() {

                    private var cost: JsonField<String>? = null
                    private var costType: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(service: Service) = apply {
                        cost = service.cost
                        costType = service.costType
                        name = service.name
                        additionalProperties = service.additionalProperties.toMutableMap()
                    }

                    /** Cost per unit as decimal string */
                    fun cost(cost: String) = cost(JsonField.of(cost))

                    /**
                     * Sets [Builder.cost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cost] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cost(cost: JsonField<String>) = apply { this.cost = cost }

                    /** Type of cost (MRC or OTC) */
                    fun costType(costType: String) = costType(JsonField.of(costType))

                    /**
                     * Sets [Builder.costType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.costType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun costType(costType: JsonField<String>) = apply { this.costType = costType }

                    /** Service name */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * Returns an immutable instance of [Service].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .cost()
                     * .costType()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Service =
                        Service(
                            checkRequired("cost", cost),
                            checkRequired("costType", costType),
                            checkRequired("name", name),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Service = apply {
                    if (validated) {
                        return@apply
                    }

                    cost()
                    costType()
                    name()
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
                    (if (cost.asKnown().isPresent) 1 else 0) +
                        (if (costType.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Service &&
                        cost == other.cost &&
                        costType == other.costType &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(cost, costType, name, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Service{cost=$cost, costType=$costType, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    chargeType == other.chargeType &&
                    serviceOwnerEmail == other.serviceOwnerEmail &&
                    serviceOwnerUserId == other.serviceOwnerUserId &&
                    services == other.services &&
                    tn == other.tn &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    chargeType,
                    serviceOwnerEmail,
                    serviceOwnerUserId,
                    services,
                    tn,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{chargeType=$chargeType, serviceOwnerEmail=$serviceOwnerEmail, serviceOwnerUserId=$serviceOwnerUserId, services=$services, tn=$tn, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                currency == other.currency &&
                endDate == other.endDate &&
                results == other.results &&
                startDate == other.startDate &&
                userEmail == other.userEmail &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                endDate,
                results,
                startDate,
                userEmail,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{currency=$currency, endDate=$endDate, results=$results, startDate=$startDate, userEmail=$userEmail, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChargesBreakdownRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChargesBreakdownRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
