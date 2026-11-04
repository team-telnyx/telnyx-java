// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.userprofile

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

/** The authenticated user's profile. */
class UserProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val address1: JsonField<String>,
    private val address2: JsonField<String>,
    private val businessName: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val dataLocality: JsonField<DataLocality>,
    private val dataLocalityMigrationStatus: JsonField<DataLocalityMigrationStatus>,
    private val dataLocalityUpdatedAt: JsonField<OffsetDateTime>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val state: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val zip: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("address_1") @ExcludeMissing address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address_2") @ExcludeMissing address2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data_locality")
        @ExcludeMissing
        dataLocality: JsonField<DataLocality> = JsonMissing.of(),
        @JsonProperty("data_locality_migration_status")
        @ExcludeMissing
        dataLocalityMigrationStatus: JsonField<DataLocalityMigrationStatus> = JsonMissing.of(),
        @JsonProperty("data_locality_updated_at")
        @ExcludeMissing
        dataLocalityUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        address1,
        address2,
        businessName,
        city,
        country,
        dataLocality,
        dataLocalityMigrationStatus,
        dataLocalityUpdatedAt,
        firstName,
        lastName,
        phoneNumber,
        recordType,
        state,
        updatedAt,
        userId,
        zip,
        mutableMapOf(),
    )

    /**
     * Identifier of the user profile, distinct from the user ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<Long> = id.getOptional("id")

    /**
     * First line of the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address1(): Optional<String> = address1.getOptional("address_1")

    /**
     * Second line of the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address2(): Optional<String> = address2.getOptional("address_2")

    /**
     * Business name associated with the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessName(): Optional<String> = businessName.getOptional("business_name")

    /**
     * City in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * Country code in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = country.getOptional("country")

    /**
     * The user's data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United
     * Arab Emirates), or CAN (Canada).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataLocality(): Optional<DataLocality> = dataLocality.getOptional("data_locality")

    /**
     * Status of the user's data locality migration, or null when no migration status is recorded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataLocalityMigrationStatus(): Optional<DataLocalityMigrationStatus> =
        dataLocalityMigrationStatus.getOptional("data_locality_migration_status")

    /**
     * Timestamp when the user's data locality was last changed, or null if it has not been changed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataLocalityUpdatedAt(): Optional<OffsetDateTime> =
        dataLocalityUpdatedAt.getOptional("data_locality_updated_at")

    /**
     * The user's first name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * The user's last name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * Contact phone number associated with the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Identifies the type of resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * State or region in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Timestamp of the most recent profile update.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Identifier of the user who owns this profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Postal code in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zip(): Optional<String> = zip.getOptional("zip")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [address1].
     *
     * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address_1") @ExcludeMissing fun _address1(): JsonField<String> = address1

    /**
     * Returns the raw JSON value of [address2].
     *
     * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address_2") @ExcludeMissing fun _address2(): JsonField<String> = address2

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_name")
    @ExcludeMissing
    fun _businessName(): JsonField<String> = businessName

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [dataLocality].
     *
     * Unlike [dataLocality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_locality")
    @ExcludeMissing
    fun _dataLocality(): JsonField<DataLocality> = dataLocality

    /**
     * Returns the raw JSON value of [dataLocalityMigrationStatus].
     *
     * Unlike [dataLocalityMigrationStatus], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("data_locality_migration_status")
    @ExcludeMissing
    fun _dataLocalityMigrationStatus(): JsonField<DataLocalityMigrationStatus> =
        dataLocalityMigrationStatus

    /**
     * Returns the raw JSON value of [dataLocalityUpdatedAt].
     *
     * Unlike [dataLocalityUpdatedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("data_locality_updated_at")
    @ExcludeMissing
    fun _dataLocalityUpdatedAt(): JsonField<OffsetDateTime> = dataLocalityUpdatedAt

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [zip].
     *
     * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

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

        /** Returns a mutable builder for constructing an instance of [UserProfile]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserProfile]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var address1: JsonField<String> = JsonMissing.of()
        private var address2: JsonField<String> = JsonMissing.of()
        private var businessName: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var dataLocality: JsonField<DataLocality> = JsonMissing.of()
        private var dataLocalityMigrationStatus: JsonField<DataLocalityMigrationStatus> =
            JsonMissing.of()
        private var dataLocalityUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var zip: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userProfile: UserProfile) = apply {
            id = userProfile.id
            address1 = userProfile.address1
            address2 = userProfile.address2
            businessName = userProfile.businessName
            city = userProfile.city
            country = userProfile.country
            dataLocality = userProfile.dataLocality
            dataLocalityMigrationStatus = userProfile.dataLocalityMigrationStatus
            dataLocalityUpdatedAt = userProfile.dataLocalityUpdatedAt
            firstName = userProfile.firstName
            lastName = userProfile.lastName
            phoneNumber = userProfile.phoneNumber
            recordType = userProfile.recordType
            state = userProfile.state
            updatedAt = userProfile.updatedAt
            userId = userProfile.userId
            zip = userProfile.zip
            additionalProperties = userProfile.additionalProperties.toMutableMap()
        }

        /** Identifier of the user profile, distinct from the user ID. */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** First line of the profile address. */
        fun address1(address1: String?) = address1(JsonField.ofNullable(address1))

        /** Alias for calling [Builder.address1] with `address1.orElse(null)`. */
        fun address1(address1: Optional<String>) = address1(address1.getOrNull())

        /**
         * Sets [Builder.address1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        /** Second line of the profile address. */
        fun address2(address2: String?) = address2(JsonField.ofNullable(address2))

        /** Alias for calling [Builder.address2] with `address2.orElse(null)`. */
        fun address2(address2: Optional<String>) = address2(address2.getOrNull())

        /**
         * Sets [Builder.address2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        /** Business name associated with the profile. */
        fun businessName(businessName: String?) = businessName(JsonField.ofNullable(businessName))

        /** Alias for calling [Builder.businessName] with `businessName.orElse(null)`. */
        fun businessName(businessName: Optional<String>) = businessName(businessName.getOrNull())

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            this.businessName = businessName
        }

        /** City in the profile address. */
        fun city(city: String?) = city(JsonField.ofNullable(city))

        /** Alias for calling [Builder.city] with `city.orElse(null)`. */
        fun city(city: Optional<String>) = city(city.getOrNull())

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Country code in the profile address. */
        fun country(country: String?) = country(JsonField.ofNullable(country))

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * The user's data locality: USA (United States), DEU (Germany), AUS (Australia), UAE
         * (United Arab Emirates), or CAN (Canada).
         */
        fun dataLocality(dataLocality: DataLocality?) =
            dataLocality(JsonField.ofNullable(dataLocality))

        /** Alias for calling [Builder.dataLocality] with `dataLocality.orElse(null)`. */
        fun dataLocality(dataLocality: Optional<DataLocality>) =
            dataLocality(dataLocality.getOrNull())

        /**
         * Sets [Builder.dataLocality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataLocality] with a well-typed [DataLocality] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataLocality(dataLocality: JsonField<DataLocality>) = apply {
            this.dataLocality = dataLocality
        }

        /**
         * Status of the user's data locality migration, or null when no migration status is
         * recorded.
         */
        fun dataLocalityMigrationStatus(dataLocalityMigrationStatus: DataLocalityMigrationStatus?) =
            dataLocalityMigrationStatus(JsonField.ofNullable(dataLocalityMigrationStatus))

        /**
         * Alias for calling [Builder.dataLocalityMigrationStatus] with
         * `dataLocalityMigrationStatus.orElse(null)`.
         */
        fun dataLocalityMigrationStatus(
            dataLocalityMigrationStatus: Optional<DataLocalityMigrationStatus>
        ) = dataLocalityMigrationStatus(dataLocalityMigrationStatus.getOrNull())

        /**
         * Sets [Builder.dataLocalityMigrationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataLocalityMigrationStatus] with a well-typed
         * [DataLocalityMigrationStatus] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun dataLocalityMigrationStatus(
            dataLocalityMigrationStatus: JsonField<DataLocalityMigrationStatus>
        ) = apply { this.dataLocalityMigrationStatus = dataLocalityMigrationStatus }

        /**
         * Timestamp when the user's data locality was last changed, or null if it has not been
         * changed.
         */
        fun dataLocalityUpdatedAt(dataLocalityUpdatedAt: OffsetDateTime?) =
            dataLocalityUpdatedAt(JsonField.ofNullable(dataLocalityUpdatedAt))

        /**
         * Alias for calling [Builder.dataLocalityUpdatedAt] with
         * `dataLocalityUpdatedAt.orElse(null)`.
         */
        fun dataLocalityUpdatedAt(dataLocalityUpdatedAt: Optional<OffsetDateTime>) =
            dataLocalityUpdatedAt(dataLocalityUpdatedAt.getOrNull())

        /**
         * Sets [Builder.dataLocalityUpdatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataLocalityUpdatedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun dataLocalityUpdatedAt(dataLocalityUpdatedAt: JsonField<OffsetDateTime>) = apply {
            this.dataLocalityUpdatedAt = dataLocalityUpdatedAt
        }

        /** The user's first name. */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The user's last name. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Contact phone number associated with the profile. */
        fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Identifies the type of resource. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** State or region in the profile address. */
        fun state(state: String?) = state(JsonField.ofNullable(state))

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Timestamp of the most recent profile update. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Identifier of the user who owns this profile. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Postal code in the profile address. */
        fun zip(zip: String?) = zip(JsonField.ofNullable(zip))

        /** Alias for calling [Builder.zip] with `zip.orElse(null)`. */
        fun zip(zip: Optional<String>) = zip(zip.getOrNull())

        /**
         * Sets [Builder.zip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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
         * Returns an immutable instance of [UserProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserProfile =
            UserProfile(
                id,
                address1,
                address2,
                businessName,
                city,
                country,
                dataLocality,
                dataLocalityMigrationStatus,
                dataLocalityUpdatedAt,
                firstName,
                lastName,
                phoneNumber,
                recordType,
                state,
                updatedAt,
                userId,
                zip,
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
    fun validate(): UserProfile = apply {
        if (validated) {
            return@apply
        }

        id()
        address1()
        address2()
        businessName()
        city()
        country()
        dataLocality().ifPresent { it.validate() }
        dataLocalityMigrationStatus().ifPresent { it.validate() }
        dataLocalityUpdatedAt()
        firstName()
        lastName()
        phoneNumber()
        recordType().ifPresent { it.validate() }
        state()
        updatedAt()
        userId()
        zip()
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
            (if (address1.asKnown().isPresent) 1 else 0) +
            (if (address2.asKnown().isPresent) 1 else 0) +
            (if (businessName.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (dataLocality.asKnown().getOrNull()?.validity() ?: 0) +
            (dataLocalityMigrationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dataLocalityUpdatedAt.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (zip.asKnown().isPresent) 1 else 0)

    /**
     * The user's data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United
     * Arab Emirates), or CAN (Canada).
     */
    class DataLocality @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val USA = of("USA")

            @JvmField val DEU = of("DEU")

            @JvmField val AUS = of("AUS")

            @JvmField val UAE = of("UAE")

            @JvmField val CAN = of("CAN")

            @JvmStatic fun of(value: String) = DataLocality(JsonField.of(value))
        }

        /** An enum containing [DataLocality]'s known values. */
        enum class Known {
            USA,
            DEU,
            AUS,
            UAE,
            CAN,
        }

        /**
         * An enum containing [DataLocality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataLocality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USA,
            DEU,
            AUS,
            UAE,
            CAN,
            /**
             * An enum member indicating that [DataLocality] was instantiated with an unknown value.
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
                USA -> Value.USA
                DEU -> Value.DEU
                AUS -> Value.AUS
                UAE -> Value.UAE
                CAN -> Value.CAN
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
                USA -> Known.USA
                DEU -> Known.DEU
                AUS -> Known.AUS
                UAE -> Known.UAE
                CAN -> Known.CAN
                else -> throw TelnyxInvalidDataException("Unknown DataLocality: $value")
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
        fun validate(): DataLocality = apply {
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

            return other is DataLocality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status of the user's data locality migration, or null when no migration status is recorded.
     */
    class DataLocalityMigrationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NOT_STARTED = of("not_started")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val FINISHED = of("finished")

            @JvmStatic fun of(value: String) = DataLocalityMigrationStatus(JsonField.of(value))
        }

        /** An enum containing [DataLocalityMigrationStatus]'s known values. */
        enum class Known {
            NOT_STARTED,
            IN_PROGRESS,
            FINISHED,
        }

        /**
         * An enum containing [DataLocalityMigrationStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DataLocalityMigrationStatus] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_STARTED,
            IN_PROGRESS,
            FINISHED,
            /**
             * An enum member indicating that [DataLocalityMigrationStatus] was instantiated with an
             * unknown value.
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
                NOT_STARTED -> Value.NOT_STARTED
                IN_PROGRESS -> Value.IN_PROGRESS
                FINISHED -> Value.FINISHED
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
                NOT_STARTED -> Known.NOT_STARTED
                IN_PROGRESS -> Known.IN_PROGRESS
                FINISHED -> Known.FINISHED
                else ->
                    throw TelnyxInvalidDataException("Unknown DataLocalityMigrationStatus: $value")
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
        fun validate(): DataLocalityMigrationStatus = apply {
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

            return other is DataLocalityMigrationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Identifies the type of resource. */
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

            @JvmField val USER_PROFILE = of("user_profile")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            USER_PROFILE
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
            USER_PROFILE,
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
                USER_PROFILE -> Value.USER_PROFILE
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
                USER_PROFILE -> Known.USER_PROFILE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserProfile &&
            id == other.id &&
            address1 == other.address1 &&
            address2 == other.address2 &&
            businessName == other.businessName &&
            city == other.city &&
            country == other.country &&
            dataLocality == other.dataLocality &&
            dataLocalityMigrationStatus == other.dataLocalityMigrationStatus &&
            dataLocalityUpdatedAt == other.dataLocalityUpdatedAt &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            phoneNumber == other.phoneNumber &&
            recordType == other.recordType &&
            state == other.state &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            zip == other.zip &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            address1,
            address2,
            businessName,
            city,
            country,
            dataLocality,
            dataLocalityMigrationStatus,
            dataLocalityUpdatedAt,
            firstName,
            lastName,
            phoneNumber,
            recordType,
            state,
            updatedAt,
            userId,
            zip,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserProfile{id=$id, address1=$address1, address2=$address2, businessName=$businessName, city=$city, country=$country, dataLocality=$dataLocality, dataLocalityMigrationStatus=$dataLocalityMigrationStatus, dataLocalityUpdatedAt=$dataLocalityUpdatedAt, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, recordType=$recordType, state=$state, updatedAt=$updatedAt, userId=$userId, zip=$zip, additionalProperties=$additionalProperties}"
}
