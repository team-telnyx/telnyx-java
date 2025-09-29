// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.useraddresses

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class UserAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val administrativeArea: JsonField<String>,
    private val borough: JsonField<String>,
    private val businessName: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val customerReference: JsonField<String>,
    private val extendedAddress: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val locality: JsonField<String>,
    private val neighborhood: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val recordType: JsonField<String>,
    private val streetAddress: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("administrative_area")
        @ExcludeMissing
        administrativeArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("borough") @ExcludeMissing borough: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_reference")
        @ExcludeMissing
        customerReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extended_address")
        @ExcludeMissing
        extendedAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("neighborhood")
        @ExcludeMissing
        neighborhood: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_address")
        @ExcludeMissing
        streetAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        administrativeArea,
        borough,
        businessName,
        countryCode,
        createdAt,
        customerReference,
        extendedAddress,
        firstName,
        lastName,
        locality,
        neighborhood,
        phoneNumber,
        postalCode,
        recordType,
        streetAddress,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The locality of the user address. For US addresses, this corresponds to the state of the
     * address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun administrativeArea(): Optional<String> =
        administrativeArea.getOptional("administrative_area")

    /**
     * The borough of the user address. This field is not used for addresses in the US but is used
     * for some international addresses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borough(): Optional<String> = borough.getOptional("borough")

    /**
     * The business name associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessName(): Optional<String> = businessName.getOptional("business_name")

    /**
     * The two-character (ISO 3166-1 alpha-2) country code of the user address.
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
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = customerReference.getOptional("customer_reference")

    /**
     * Additional street address information about the user address such as, but not limited to,
     * unit number or apartment number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

    /**
     * The first name associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * The last name associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * The locality of the user address. For US addresses, this corresponds to the city of the
     * address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locality(): Optional<String> = locality.getOptional("locality")

    /**
     * The neighborhood of the user address. This field is not used for addresses in the US but is
     * used for some international addresses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun neighborhood(): Optional<String> = neighborhood.getOptional("neighborhood")

    /**
     * The phone number associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * The postal code of the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The primary street address information about the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streetAddress(): Optional<String> = streetAddress.getOptional("street_address")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [administrativeArea].
     *
     * Unlike [administrativeArea], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("administrative_area")
    @ExcludeMissing
    fun _administrativeArea(): JsonField<String> = administrativeArea

    /**
     * Returns the raw JSON value of [borough].
     *
     * Unlike [borough], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("borough") @ExcludeMissing fun _borough(): JsonField<String> = borough

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_name")
    @ExcludeMissing
    fun _businessName(): JsonField<String> = businessName

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
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_reference")
    @ExcludeMissing
    fun _customerReference(): JsonField<String> = customerReference

    /**
     * Returns the raw JSON value of [extendedAddress].
     *
     * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extended_address")
    @ExcludeMissing
    fun _extendedAddress(): JsonField<String> = extendedAddress

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
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    /**
     * Returns the raw JSON value of [neighborhood].
     *
     * Unlike [neighborhood], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("neighborhood")
    @ExcludeMissing
    fun _neighborhood(): JsonField<String> = neighborhood

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [streetAddress].
     *
     * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street_address")
    @ExcludeMissing
    fun _streetAddress(): JsonField<String> = streetAddress

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [UserAddress]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserAddress]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var administrativeArea: JsonField<String> = JsonMissing.of()
        private var borough: JsonField<String> = JsonMissing.of()
        private var businessName: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var extendedAddress: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var locality: JsonField<String> = JsonMissing.of()
        private var neighborhood: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var streetAddress: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userAddress: UserAddress) = apply {
            id = userAddress.id
            administrativeArea = userAddress.administrativeArea
            borough = userAddress.borough
            businessName = userAddress.businessName
            countryCode = userAddress.countryCode
            createdAt = userAddress.createdAt
            customerReference = userAddress.customerReference
            extendedAddress = userAddress.extendedAddress
            firstName = userAddress.firstName
            lastName = userAddress.lastName
            locality = userAddress.locality
            neighborhood = userAddress.neighborhood
            phoneNumber = userAddress.phoneNumber
            postalCode = userAddress.postalCode
            recordType = userAddress.recordType
            streetAddress = userAddress.streetAddress
            updatedAt = userAddress.updatedAt
            additionalProperties = userAddress.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the user address. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The locality of the user address. For US addresses, this corresponds to the state of the
         * address.
         */
        fun administrativeArea(administrativeArea: String) =
            administrativeArea(JsonField.of(administrativeArea))

        /**
         * Sets [Builder.administrativeArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.administrativeArea] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun administrativeArea(administrativeArea: JsonField<String>) = apply {
            this.administrativeArea = administrativeArea
        }

        /**
         * The borough of the user address. This field is not used for addresses in the US but is
         * used for some international addresses.
         */
        fun borough(borough: String) = borough(JsonField.of(borough))

        /**
         * Sets [Builder.borough] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borough] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun borough(borough: JsonField<String>) = apply { this.borough = borough }

        /** The business name associated with the user address. */
        fun businessName(businessName: String) = businessName(JsonField.of(businessName))

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

        /** The two-character (ISO 3166-1 alpha-2) country code of the user address. */
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
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** A customer reference string for customer look ups. */
        fun customerReference(customerReference: String) =
            customerReference(JsonField.of(customerReference))

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            this.customerReference = customerReference
        }

        /**
         * Additional street address information about the user address such as, but not limited to,
         * unit number or apartment number.
         */
        fun extendedAddress(extendedAddress: String) =
            extendedAddress(JsonField.of(extendedAddress))

        /**
         * Sets [Builder.extendedAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendedAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extendedAddress(extendedAddress: JsonField<String>) = apply {
            this.extendedAddress = extendedAddress
        }

        /** The first name associated with the user address. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The last name associated with the user address. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * The locality of the user address. For US addresses, this corresponds to the city of the
         * address.
         */
        fun locality(locality: String) = locality(JsonField.of(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        /**
         * The neighborhood of the user address. This field is not used for addresses in the US but
         * is used for some international addresses.
         */
        fun neighborhood(neighborhood: String) = neighborhood(JsonField.of(neighborhood))

        /**
         * Sets [Builder.neighborhood] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborhood] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun neighborhood(neighborhood: JsonField<String>) = apply {
            this.neighborhood = neighborhood
        }

        /** The phone number associated with the user address. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** The postal code of the user address. */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

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

        /** The primary street address information about the user address. */
        fun streetAddress(streetAddress: String) = streetAddress(JsonField.of(streetAddress))

        /**
         * Sets [Builder.streetAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streetAddress(streetAddress: JsonField<String>) = apply {
            this.streetAddress = streetAddress
        }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [UserAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserAddress =
            UserAddress(
                id,
                administrativeArea,
                borough,
                businessName,
                countryCode,
                createdAt,
                customerReference,
                extendedAddress,
                firstName,
                lastName,
                locality,
                neighborhood,
                phoneNumber,
                postalCode,
                recordType,
                streetAddress,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserAddress = apply {
        if (validated) {
            return@apply
        }

        id()
        administrativeArea()
        borough()
        businessName()
        countryCode()
        createdAt()
        customerReference()
        extendedAddress()
        firstName()
        lastName()
        locality()
        neighborhood()
        phoneNumber()
        postalCode()
        recordType()
        streetAddress()
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
            (if (administrativeArea.asKnown().isPresent) 1 else 0) +
            (if (borough.asKnown().isPresent) 1 else 0) +
            (if (businessName.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (if (extendedAddress.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (locality.asKnown().isPresent) 1 else 0) +
            (if (neighborhood.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (streetAddress.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserAddress &&
            id == other.id &&
            administrativeArea == other.administrativeArea &&
            borough == other.borough &&
            businessName == other.businessName &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            customerReference == other.customerReference &&
            extendedAddress == other.extendedAddress &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            locality == other.locality &&
            neighborhood == other.neighborhood &&
            phoneNumber == other.phoneNumber &&
            postalCode == other.postalCode &&
            recordType == other.recordType &&
            streetAddress == other.streetAddress &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            administrativeArea,
            borough,
            businessName,
            countryCode,
            createdAt,
            customerReference,
            extendedAddress,
            firstName,
            lastName,
            locality,
            neighborhood,
            phoneNumber,
            postalCode,
            recordType,
            streetAddress,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserAddress{id=$id, administrativeArea=$administrativeArea, borough=$borough, businessName=$businessName, countryCode=$countryCode, createdAt=$createdAt, customerReference=$customerReference, extendedAddress=$extendedAddress, firstName=$firstName, lastName=$lastName, locality=$locality, neighborhood=$neighborhood, phoneNumber=$phoneNumber, postalCode=$postalCode, recordType=$recordType, streetAddress=$streetAddress, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
