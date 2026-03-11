// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class BusinessAccountRetrieveResponse
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
         * [BusinessAccountRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BusinessAccountRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(businessAccountRetrieveResponse: BusinessAccountRetrieveResponse) =
            apply {
                data = businessAccountRetrieveResponse.data
                additionalProperties =
                    businessAccountRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BusinessAccountRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BusinessAccountRetrieveResponse =
            BusinessAccountRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BusinessAccountRetrieveResponse = apply {
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
        private val accountReviewStatus: JsonField<String>,
        private val businessVerificationStatus: JsonField<String>,
        private val country: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val phoneNumbersCount: JsonField<Long>,
        private val recordType: JsonField<String>,
        private val status: JsonField<String>,
        private val wabaId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_review_status")
            @ExcludeMissing
            accountReviewStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_verification_status")
            @ExcludeMissing
            businessVerificationStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_numbers_count")
            @ExcludeMissing
            phoneNumbersCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("waba_id") @ExcludeMissing wabaId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            accountReviewStatus,
            businessVerificationStatus,
            country,
            createdAt,
            name,
            phoneNumbersCount,
            recordType,
            status,
            wabaId,
            mutableMapOf(),
        )

        /**
         * Internal ID of Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Account review status of Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountReviewStatus(): Optional<String> =
            accountReviewStatus.getOptional("account_review_status")

        /**
         * Business verification status of Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun businessVerificationStatus(): Optional<String> =
            businessVerificationStatus.getOptional("business_verification_status")

        /**
         * Country associated with Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Name of Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Count of phone numbers associated with Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbersCount(): Optional<Long> =
            phoneNumbersCount.getOptional("phone_numbers_count")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Status of Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * WABA ID of Whatsapp business account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wabaId(): Optional<String> = wabaId.getOptional("waba_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [accountReviewStatus].
         *
         * Unlike [accountReviewStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("account_review_status")
        @ExcludeMissing
        fun _accountReviewStatus(): JsonField<String> = accountReviewStatus

        /**
         * Returns the raw JSON value of [businessVerificationStatus].
         *
         * Unlike [businessVerificationStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_verification_status")
        @ExcludeMissing
        fun _businessVerificationStatus(): JsonField<String> = businessVerificationStatus

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [phoneNumbersCount].
         *
         * Unlike [phoneNumbersCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers_count")
        @ExcludeMissing
        fun _phoneNumbersCount(): JsonField<Long> = phoneNumbersCount

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [wabaId].
         *
         * Unlike [wabaId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waba_id") @ExcludeMissing fun _wabaId(): JsonField<String> = wabaId

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
            private var accountReviewStatus: JsonField<String> = JsonMissing.of()
            private var businessVerificationStatus: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phoneNumbersCount: JsonField<Long> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var wabaId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                accountReviewStatus = data.accountReviewStatus
                businessVerificationStatus = data.businessVerificationStatus
                country = data.country
                createdAt = data.createdAt
                name = data.name
                phoneNumbersCount = data.phoneNumbersCount
                recordType = data.recordType
                status = data.status
                wabaId = data.wabaId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Internal ID of Whatsapp business account */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Account review status of Whatsapp business account */
            fun accountReviewStatus(accountReviewStatus: String) =
                accountReviewStatus(JsonField.of(accountReviewStatus))

            /**
             * Sets [Builder.accountReviewStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountReviewStatus] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountReviewStatus(accountReviewStatus: JsonField<String>) = apply {
                this.accountReviewStatus = accountReviewStatus
            }

            /** Business verification status of Whatsapp business account */
            fun businessVerificationStatus(businessVerificationStatus: String) =
                businessVerificationStatus(JsonField.of(businessVerificationStatus))

            /**
             * Sets [Builder.businessVerificationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessVerificationStatus] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun businessVerificationStatus(businessVerificationStatus: JsonField<String>) = apply {
                this.businessVerificationStatus = businessVerificationStatus
            }

            /** Country associated with Whatsapp business account */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            /** Name of Whatsapp business account */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Count of phone numbers associated with Whatsapp business account */
            fun phoneNumbersCount(phoneNumbersCount: Long) =
                phoneNumbersCount(JsonField.of(phoneNumbersCount))

            /**
             * Sets [Builder.phoneNumbersCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbersCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumbersCount(phoneNumbersCount: JsonField<Long>) = apply {
                this.phoneNumbersCount = phoneNumbersCount
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Status of Whatsapp business account */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** WABA ID of Whatsapp business account */
            fun wabaId(wabaId: String) = wabaId(JsonField.of(wabaId))

            /**
             * Sets [Builder.wabaId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wabaId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wabaId(wabaId: JsonField<String>) = apply { this.wabaId = wabaId }

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
                    accountReviewStatus,
                    businessVerificationStatus,
                    country,
                    createdAt,
                    name,
                    phoneNumbersCount,
                    recordType,
                    status,
                    wabaId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            accountReviewStatus()
            businessVerificationStatus()
            country()
            createdAt()
            name()
            phoneNumbersCount()
            recordType()
            status()
            wabaId()
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
                (if (accountReviewStatus.asKnown().isPresent) 1 else 0) +
                (if (businessVerificationStatus.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (wabaId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                accountReviewStatus == other.accountReviewStatus &&
                businessVerificationStatus == other.businessVerificationStatus &&
                country == other.country &&
                createdAt == other.createdAt &&
                name == other.name &&
                phoneNumbersCount == other.phoneNumbersCount &&
                recordType == other.recordType &&
                status == other.status &&
                wabaId == other.wabaId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountReviewStatus,
                businessVerificationStatus,
                country,
                createdAt,
                name,
                phoneNumbersCount,
                recordType,
                status,
                wabaId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, accountReviewStatus=$accountReviewStatus, businessVerificationStatus=$businessVerificationStatus, country=$country, createdAt=$createdAt, name=$name, phoneNumbersCount=$phoneNumbersCount, recordType=$recordType, status=$status, wabaId=$wabaId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessAccountRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessAccountRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
