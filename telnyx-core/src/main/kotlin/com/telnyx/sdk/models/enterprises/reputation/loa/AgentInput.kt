// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.loa

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the enterprise
 * works directly with Telnyx.
 */
class AgentInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val administrativeArea: JsonField<String>,
    private val city: JsonField<String>,
    private val contactEmail: JsonField<String>,
    private val contactName: JsonField<String>,
    private val contactPhone: JsonField<String>,
    private val contactTitle: JsonField<String>,
    private val country: JsonField<String>,
    private val legalName: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val streetAddress: JsonField<String>,
    private val dba: JsonField<String>,
    private val extendedAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("administrative_area")
        @ExcludeMissing
        administrativeArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_email")
        @ExcludeMissing
        contactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_name")
        @ExcludeMissing
        contactName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_phone")
        @ExcludeMissing
        contactPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_title")
        @ExcludeMissing
        contactTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_name") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_address")
        @ExcludeMissing
        streetAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dba") @ExcludeMissing dba: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extended_address")
        @ExcludeMissing
        extendedAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        administrativeArea,
        city,
        contactEmail,
        contactName,
        contactPhone,
        contactTitle,
        country,
        legalName,
        postalCode,
        streetAddress,
        dba,
        extendedAddress,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactEmail(): String = contactEmail.getRequired("contact_email")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactName(): String = contactName.getRequired("contact_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactPhone(): String = contactPhone.getRequired("contact_phone")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactTitle(): String = contactTitle.getRequired("contact_title")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = legalName.getRequired("legal_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun streetAddress(): String = streetAddress.getRequired("street_address")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dba(): Optional<String> = dba.getOptional("dba")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

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
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_email")
    @ExcludeMissing
    fun _contactEmail(): JsonField<String> = contactEmail

    /**
     * Returns the raw JSON value of [contactName].
     *
     * Unlike [contactName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_name")
    @ExcludeMissing
    fun _contactName(): JsonField<String> = contactName

    /**
     * Returns the raw JSON value of [contactPhone].
     *
     * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_phone")
    @ExcludeMissing
    fun _contactPhone(): JsonField<String> = contactPhone

    /**
     * Returns the raw JSON value of [contactTitle].
     *
     * Unlike [contactTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_title")
    @ExcludeMissing
    fun _contactTitle(): JsonField<String> = contactTitle

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [streetAddress].
     *
     * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street_address")
    @ExcludeMissing
    fun _streetAddress(): JsonField<String> = streetAddress

    /**
     * Returns the raw JSON value of [dba].
     *
     * Unlike [dba], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dba") @ExcludeMissing fun _dba(): JsonField<String> = dba

    /**
     * Returns the raw JSON value of [extendedAddress].
     *
     * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extended_address")
    @ExcludeMissing
    fun _extendedAddress(): JsonField<String> = extendedAddress

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
         * Returns a mutable builder for constructing an instance of [AgentInput].
         *
         * The following fields are required:
         * ```java
         * .administrativeArea()
         * .city()
         * .contactEmail()
         * .contactName()
         * .contactPhone()
         * .contactTitle()
         * .country()
         * .legalName()
         * .postalCode()
         * .streetAddress()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentInput]. */
    class Builder internal constructor() {

        private var administrativeArea: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var contactEmail: JsonField<String>? = null
        private var contactName: JsonField<String>? = null
        private var contactPhone: JsonField<String>? = null
        private var contactTitle: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var legalName: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var streetAddress: JsonField<String>? = null
        private var dba: JsonField<String> = JsonMissing.of()
        private var extendedAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentInput: AgentInput) = apply {
            administrativeArea = agentInput.administrativeArea
            city = agentInput.city
            contactEmail = agentInput.contactEmail
            contactName = agentInput.contactName
            contactPhone = agentInput.contactPhone
            contactTitle = agentInput.contactTitle
            country = agentInput.country
            legalName = agentInput.legalName
            postalCode = agentInput.postalCode
            streetAddress = agentInput.streetAddress
            dba = agentInput.dba
            extendedAddress = agentInput.extendedAddress
            additionalProperties = agentInput.additionalProperties.toMutableMap()
        }

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

        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        fun contactEmail(contactEmail: String) = contactEmail(JsonField.of(contactEmail))

        /**
         * Sets [Builder.contactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        fun contactName(contactName: String) = contactName(JsonField.of(contactName))

        /**
         * Sets [Builder.contactName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactName(contactName: JsonField<String>) = apply { this.contactName = contactName }

        fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

        /**
         * Sets [Builder.contactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        fun contactTitle(contactTitle: String) = contactTitle(JsonField.of(contactTitle))

        /**
         * Sets [Builder.contactTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactTitle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactTitle(contactTitle: JsonField<String>) = apply {
            this.contactTitle = contactTitle
        }

        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

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

        fun dba(dba: String?) = dba(JsonField.ofNullable(dba))

        /** Alias for calling [Builder.dba] with `dba.orElse(null)`. */
        fun dba(dba: Optional<String>) = dba(dba.getOrNull())

        /**
         * Sets [Builder.dba] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dba] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dba(dba: JsonField<String>) = apply { this.dba = dba }

        fun extendedAddress(extendedAddress: String?) =
            extendedAddress(JsonField.ofNullable(extendedAddress))

        /** Alias for calling [Builder.extendedAddress] with `extendedAddress.orElse(null)`. */
        fun extendedAddress(extendedAddress: Optional<String>) =
            extendedAddress(extendedAddress.getOrNull())

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
         * Returns an immutable instance of [AgentInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .administrativeArea()
         * .city()
         * .contactEmail()
         * .contactName()
         * .contactPhone()
         * .contactTitle()
         * .country()
         * .legalName()
         * .postalCode()
         * .streetAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentInput =
            AgentInput(
                checkRequired("administrativeArea", administrativeArea),
                checkRequired("city", city),
                checkRequired("contactEmail", contactEmail),
                checkRequired("contactName", contactName),
                checkRequired("contactPhone", contactPhone),
                checkRequired("contactTitle", contactTitle),
                checkRequired("country", country),
                checkRequired("legalName", legalName),
                checkRequired("postalCode", postalCode),
                checkRequired("streetAddress", streetAddress),
                dba,
                extendedAddress,
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
    fun validate(): AgentInput = apply {
        if (validated) {
            return@apply
        }

        administrativeArea()
        city()
        contactEmail()
        contactName()
        contactPhone()
        contactTitle()
        country()
        legalName()
        postalCode()
        streetAddress()
        dba()
        extendedAddress()
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
        (if (administrativeArea.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (contactEmail.asKnown().isPresent) 1 else 0) +
            (if (contactName.asKnown().isPresent) 1 else 0) +
            (if (contactPhone.asKnown().isPresent) 1 else 0) +
            (if (contactTitle.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (legalName.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (streetAddress.asKnown().isPresent) 1 else 0) +
            (if (dba.asKnown().isPresent) 1 else 0) +
            (if (extendedAddress.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentInput &&
            administrativeArea == other.administrativeArea &&
            city == other.city &&
            contactEmail == other.contactEmail &&
            contactName == other.contactName &&
            contactPhone == other.contactPhone &&
            contactTitle == other.contactTitle &&
            country == other.country &&
            legalName == other.legalName &&
            postalCode == other.postalCode &&
            streetAddress == other.streetAddress &&
            dba == other.dba &&
            extendedAddress == other.extendedAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            administrativeArea,
            city,
            contactEmail,
            contactName,
            contactPhone,
            contactTitle,
            country,
            legalName,
            postalCode,
            streetAddress,
            dba,
            extendedAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentInput{administrativeArea=$administrativeArea, city=$city, contactEmail=$contactEmail, contactName=$contactName, contactPhone=$contactPhone, contactTitle=$contactTitle, country=$country, legalName=$legalName, postalCode=$postalCode, streetAddress=$streetAddress, dba=$dba, extendedAddress=$extendedAddress, additionalProperties=$additionalProperties}"
}
