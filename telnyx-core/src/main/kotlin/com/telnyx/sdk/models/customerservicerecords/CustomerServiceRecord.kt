// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

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

class CustomerServiceRecord
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val recordType: JsonField<String>,
    private val result: JsonField<Result>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        errorMessage,
        phoneNumber,
        recordType,
        result,
        status,
        updatedAt,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies this customer service record
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The error message in case status is `failed`. This field would be null in case of `pending`
     * or `completed` status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * The phone number of the customer service record.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The result of the CSR request. This field would be null in case of `pending` or `failed`
     * status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * The status of the customer service record
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Callback URL to receive webhook notifications.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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

        /** Returns a mutable builder for constructing an instance of [CustomerServiceRecord]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerServiceRecord]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerServiceRecord: CustomerServiceRecord) = apply {
            id = customerServiceRecord.id
            createdAt = customerServiceRecord.createdAt
            errorMessage = customerServiceRecord.errorMessage
            phoneNumber = customerServiceRecord.phoneNumber
            recordType = customerServiceRecord.recordType
            result = customerServiceRecord.result
            status = customerServiceRecord.status
            updatedAt = customerServiceRecord.updatedAt
            webhookUrl = customerServiceRecord.webhookUrl
            additionalProperties = customerServiceRecord.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies this customer service record */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /**
         * The error message in case status is `failed`. This field would be null in case of
         * `pending` or `completed` status.
         */
        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
        fun errorMessage(errorMessage: Optional<String>) = errorMessage(errorMessage.getOrNull())

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** The phone number of the customer service record. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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

        /**
         * The result of the CSR request. This field would be null in case of `pending` or `failed`
         * status.
         */
        fun result(result: Result?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<Result>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** The status of the customer service record */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Callback URL to receive webhook notifications. */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
         * Returns an immutable instance of [CustomerServiceRecord].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerServiceRecord =
            CustomerServiceRecord(
                id,
                createdAt,
                errorMessage,
                phoneNumber,
                recordType,
                result,
                status,
                updatedAt,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerServiceRecord = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        errorMessage()
        phoneNumber()
        recordType()
        result().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        updatedAt()
        webhookUrl()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    /**
     * The result of the CSR request. This field would be null in case of `pending` or `failed`
     * status.
     */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val admin: JsonField<Admin>,
        private val associatedPhoneNumbers: JsonField<List<String>>,
        private val carrierName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("admin") @ExcludeMissing admin: JsonField<Admin> = JsonMissing.of(),
            @JsonProperty("associated_phone_numbers")
            @ExcludeMissing
            associatedPhoneNumbers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("carrier_name")
            @ExcludeMissing
            carrierName: JsonField<String> = JsonMissing.of(),
        ) : this(address, admin, associatedPhoneNumbers, carrierName, mutableMapOf())

        /**
         * The address of the customer service record
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * The admin of the customer service record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun admin(): Optional<Admin> = admin.getOptional("admin")

        /**
         * The associated phone numbers of the customer service record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun associatedPhoneNumbers(): Optional<List<String>> =
            associatedPhoneNumbers.getOptional("associated_phone_numbers")

        /**
         * The name of the carrier that the customer service record is for.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrierName(): Optional<String> = carrierName.getOptional("carrier_name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [admin].
         *
         * Unlike [admin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("admin") @ExcludeMissing fun _admin(): JsonField<Admin> = admin

        /**
         * Returns the raw JSON value of [associatedPhoneNumbers].
         *
         * Unlike [associatedPhoneNumbers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("associated_phone_numbers")
        @ExcludeMissing
        fun _associatedPhoneNumbers(): JsonField<List<String>> = associatedPhoneNumbers

        /**
         * Returns the raw JSON value of [carrierName].
         *
         * Unlike [carrierName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier_name")
        @ExcludeMissing
        fun _carrierName(): JsonField<String> = carrierName

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var admin: JsonField<Admin> = JsonMissing.of()
            private var associatedPhoneNumbers: JsonField<MutableList<String>>? = null
            private var carrierName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                address = result.address
                admin = result.admin
                associatedPhoneNumbers = result.associatedPhoneNumbers.map { it.toMutableList() }
                carrierName = result.carrierName
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** The address of the customer service record */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The admin of the customer service record. */
            fun admin(admin: Admin) = admin(JsonField.of(admin))

            /**
             * Sets [Builder.admin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.admin] with a well-typed [Admin] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun admin(admin: JsonField<Admin>) = apply { this.admin = admin }

            /** The associated phone numbers of the customer service record. */
            fun associatedPhoneNumbers(associatedPhoneNumbers: List<String>) =
                associatedPhoneNumbers(JsonField.of(associatedPhoneNumbers))

            /**
             * Sets [Builder.associatedPhoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.associatedPhoneNumbers] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun associatedPhoneNumbers(associatedPhoneNumbers: JsonField<List<String>>) = apply {
                this.associatedPhoneNumbers = associatedPhoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [associatedPhoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssociatedPhoneNumber(associatedPhoneNumber: String) = apply {
                associatedPhoneNumbers =
                    (associatedPhoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("associatedPhoneNumbers", it).add(associatedPhoneNumber)
                    }
            }

            /** The name of the carrier that the customer service record is for. */
            fun carrierName(carrierName: String) = carrierName(JsonField.of(carrierName))

            /**
             * Sets [Builder.carrierName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierName(carrierName: JsonField<String>) = apply {
                this.carrierName = carrierName
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    address,
                    admin,
                    (associatedPhoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    carrierName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
            admin().ifPresent { it.validate() }
            associatedPhoneNumbers()
            carrierName()
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
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (admin.asKnown().getOrNull()?.validity() ?: 0) +
                (associatedPhoneNumbers.asKnown().getOrNull()?.size ?: 0) +
                (if (carrierName.asKnown().isPresent) 1 else 0)

        /** The address of the customer service record */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val administrativeArea: JsonField<String>,
            private val fullAddress: JsonField<String>,
            private val locality: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val streetAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("administrative_area")
                @ExcludeMissing
                administrativeArea: JsonField<String> = JsonMissing.of(),
                @JsonProperty("full_address")
                @ExcludeMissing
                fullAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("locality")
                @ExcludeMissing
                locality: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street_address")
                @ExcludeMissing
                streetAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                administrativeArea,
                fullAddress,
                locality,
                postalCode,
                streetAddress,
                mutableMapOf(),
            )

            /**
             * The state of the address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun administrativeArea(): Optional<String> =
                administrativeArea.getOptional("administrative_area")

            /**
             * The full address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fullAddress(): Optional<String> = fullAddress.getOptional("full_address")

            /**
             * The city of the address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun locality(): Optional<String> = locality.getOptional("locality")

            /**
             * The zip code of the address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

            /**
             * The street address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun streetAddress(): Optional<String> = streetAddress.getOptional("street_address")

            /**
             * Returns the raw JSON value of [administrativeArea].
             *
             * Unlike [administrativeArea], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("administrative_area")
            @ExcludeMissing
            fun _administrativeArea(): JsonField<String> = administrativeArea

            /**
             * Returns the raw JSON value of [fullAddress].
             *
             * Unlike [fullAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("full_address")
            @ExcludeMissing
            fun _fullAddress(): JsonField<String> = fullAddress

            /**
             * Returns the raw JSON value of [locality].
             *
             * Unlike [locality], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [streetAddress].
             *
             * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("street_address")
            @ExcludeMissing
            fun _streetAddress(): JsonField<String> = streetAddress

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

                /** Returns a mutable builder for constructing an instance of [Address]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var administrativeArea: JsonField<String> = JsonMissing.of()
                private var fullAddress: JsonField<String> = JsonMissing.of()
                private var locality: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var streetAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    administrativeArea = address.administrativeArea
                    fullAddress = address.fullAddress
                    locality = address.locality
                    postalCode = address.postalCode
                    streetAddress = address.streetAddress
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The state of the address */
                fun administrativeArea(administrativeArea: String) =
                    administrativeArea(JsonField.of(administrativeArea))

                /**
                 * Sets [Builder.administrativeArea] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.administrativeArea] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                    this.administrativeArea = administrativeArea
                }

                /** The full address */
                fun fullAddress(fullAddress: String) = fullAddress(JsonField.of(fullAddress))

                /**
                 * Sets [Builder.fullAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fullAddress(fullAddress: JsonField<String>) = apply {
                    this.fullAddress = fullAddress
                }

                /** The city of the address */
                fun locality(locality: String) = locality(JsonField.of(locality))

                /**
                 * Sets [Builder.locality] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.locality] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locality(locality: JsonField<String>) = apply { this.locality = locality }

                /** The zip code of the address */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The street address */
                fun streetAddress(streetAddress: String) =
                    streetAddress(JsonField.of(streetAddress))

                /**
                 * Sets [Builder.streetAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.streetAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun streetAddress(streetAddress: JsonField<String>) = apply {
                    this.streetAddress = streetAddress
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
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Address =
                    Address(
                        administrativeArea,
                        fullAddress,
                        locality,
                        postalCode,
                        streetAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                administrativeArea()
                fullAddress()
                locality()
                postalCode()
                streetAddress()
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
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                    (if (fullAddress.asKnown().isPresent) 1 else 0) +
                    (if (locality.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (streetAddress.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    administrativeArea == other.administrativeArea &&
                    fullAddress == other.fullAddress &&
                    locality == other.locality &&
                    postalCode == other.postalCode &&
                    streetAddress == other.streetAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    administrativeArea,
                    fullAddress,
                    locality,
                    postalCode,
                    streetAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{administrativeArea=$administrativeArea, fullAddress=$fullAddress, locality=$locality, postalCode=$postalCode, streetAddress=$streetAddress, additionalProperties=$additionalProperties}"
        }

        /** The admin of the customer service record. */
        class Admin
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val authorizedPersonName: JsonField<String>,
            private val billingPhoneNumber: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_number")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("authorized_person_name")
                @ExcludeMissing
                authorizedPersonName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billing_phone_number")
                @ExcludeMissing
                billingPhoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, authorizedPersonName, billingPhoneNumber, name, mutableMapOf())

            /**
             * The account number of the customer service record.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

            /**
             * The authorized person name of the customer service record.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authorizedPersonName(): Optional<String> =
                authorizedPersonName.getOptional("authorized_person_name")

            /**
             * The billing phone number of the customer service record.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingPhoneNumber(): Optional<String> =
                billingPhoneNumber.getOptional("billing_phone_number")

            /**
             * The name of the customer service record.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [authorizedPersonName].
             *
             * Unlike [authorizedPersonName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authorized_person_name")
            @ExcludeMissing
            fun _authorizedPersonName(): JsonField<String> = authorizedPersonName

            /**
             * Returns the raw JSON value of [billingPhoneNumber].
             *
             * Unlike [billingPhoneNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_phone_number")
            @ExcludeMissing
            fun _billingPhoneNumber(): JsonField<String> = billingPhoneNumber

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [Admin]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Admin]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var authorizedPersonName: JsonField<String> = JsonMissing.of()
                private var billingPhoneNumber: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(admin: Admin) = apply {
                    accountNumber = admin.accountNumber
                    authorizedPersonName = admin.authorizedPersonName
                    billingPhoneNumber = admin.billingPhoneNumber
                    name = admin.name
                    additionalProperties = admin.additionalProperties.toMutableMap()
                }

                /** The account number of the customer service record. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The authorized person name of the customer service record. */
                fun authorizedPersonName(authorizedPersonName: String) =
                    authorizedPersonName(JsonField.of(authorizedPersonName))

                /**
                 * Sets [Builder.authorizedPersonName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizedPersonName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun authorizedPersonName(authorizedPersonName: JsonField<String>) = apply {
                    this.authorizedPersonName = authorizedPersonName
                }

                /** The billing phone number of the customer service record. */
                fun billingPhoneNumber(billingPhoneNumber: String) =
                    billingPhoneNumber(JsonField.of(billingPhoneNumber))

                /**
                 * Sets [Builder.billingPhoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingPhoneNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingPhoneNumber(billingPhoneNumber: JsonField<String>) = apply {
                    this.billingPhoneNumber = billingPhoneNumber
                }

                /** The name of the customer service record. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [Admin].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Admin =
                    Admin(
                        accountNumber,
                        authorizedPersonName,
                        billingPhoneNumber,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Admin = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                authorizedPersonName()
                billingPhoneNumber()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                    (if (authorizedPersonName.asKnown().isPresent) 1 else 0) +
                    (if (billingPhoneNumber.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Admin &&
                    accountNumber == other.accountNumber &&
                    authorizedPersonName == other.authorizedPersonName &&
                    billingPhoneNumber == other.billingPhoneNumber &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    authorizedPersonName,
                    billingPhoneNumber,
                    name,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Admin{accountNumber=$accountNumber, authorizedPersonName=$authorizedPersonName, billingPhoneNumber=$billingPhoneNumber, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                address == other.address &&
                admin == other.admin &&
                associatedPhoneNumbers == other.associatedPhoneNumbers &&
                carrierName == other.carrierName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, admin, associatedPhoneNumbers, carrierName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{address=$address, admin=$admin, associatedPhoneNumbers=$associatedPhoneNumbers, carrierName=$carrierName, additionalProperties=$additionalProperties}"
    }

    /** The status of the customer service record */
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

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            COMPLETED,
            FAILED,
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
            COMPLETED,
            FAILED,
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
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
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
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
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

        return other is CustomerServiceRecord &&
            id == other.id &&
            createdAt == other.createdAt &&
            errorMessage == other.errorMessage &&
            phoneNumber == other.phoneNumber &&
            recordType == other.recordType &&
            result == other.result &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            errorMessage,
            phoneNumber,
            recordType,
            result,
            status,
            updatedAt,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerServiceRecord{id=$id, createdAt=$createdAt, errorMessage=$errorMessage, phoneNumber=$phoneNumber, recordType=$recordType, result=$result, status=$status, updatedAt=$updatedAt, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
