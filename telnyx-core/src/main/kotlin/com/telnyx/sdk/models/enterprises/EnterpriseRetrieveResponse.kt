// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

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

class EnterpriseRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [EnterpriseRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnterpriseRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enterpriseRetrieveResponse: EnterpriseRetrieveResponse) = apply {
            data = enterpriseRetrieveResponse.data
            additionalProperties = enterpriseRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [EnterpriseRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnterpriseRetrieveResponse =
            EnterpriseRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EnterpriseRetrieveResponse = apply {
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
        private val billingAddress: JsonField<BillingAddress>,
        private val billingContact: JsonField<BillingContact>,
        private val corporateRegistrationNumber: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerReference: JsonField<String>,
        private val doingBusinessAs: JsonField<String>,
        private val dunBradstreetNumber: JsonField<String>,
        private val fein: JsonField<String>,
        private val industry: JsonField<String>,
        private val legalName: JsonField<String>,
        private val numberOfEmployees: JsonField<NumberOfEmployees>,
        private val organizationContact: JsonField<OrganizationContact>,
        private val organizationLegalType: JsonField<OrganizationLegalType>,
        private val organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress>,
        private val organizationType: JsonField<OrganizationType>,
        private val primaryBusinessDomainSicCode: JsonField<String>,
        private val professionalLicenseNumber: JsonField<String>,
        private val roleType: JsonField<RoleType>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("billing_contact")
            @ExcludeMissing
            billingContact: JsonField<BillingContact> = JsonMissing.of(),
            @JsonProperty("corporate_registration_number")
            @ExcludeMissing
            corporateRegistrationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("doing_business_as")
            @ExcludeMissing
            doingBusinessAs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dun_bradstreet_number")
            @ExcludeMissing
            dunBradstreetNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fein") @ExcludeMissing fein: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industry")
            @ExcludeMissing
            industry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_name")
            @ExcludeMissing
            legalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("number_of_employees")
            @ExcludeMissing
            numberOfEmployees: JsonField<NumberOfEmployees> = JsonMissing.of(),
            @JsonProperty("organization_contact")
            @ExcludeMissing
            organizationContact: JsonField<OrganizationContact> = JsonMissing.of(),
            @JsonProperty("organization_legal_type")
            @ExcludeMissing
            organizationLegalType: JsonField<OrganizationLegalType> = JsonMissing.of(),
            @JsonProperty("organization_physical_address")
            @ExcludeMissing
            organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress> = JsonMissing.of(),
            @JsonProperty("organization_type")
            @ExcludeMissing
            organizationType: JsonField<OrganizationType> = JsonMissing.of(),
            @JsonProperty("primary_business_domain_sic_code")
            @ExcludeMissing
            primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("professional_license_number")
            @ExcludeMissing
            professionalLicenseNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role_type")
            @ExcludeMissing
            roleType: JsonField<RoleType> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            billingAddress,
            billingContact,
            corporateRegistrationNumber,
            countryCode,
            createdAt,
            customerReference,
            doingBusinessAs,
            dunBradstreetNumber,
            fein,
            industry,
            legalName,
            numberOfEmployees,
            organizationContact,
            organizationLegalType,
            organizationPhysicalAddress,
            organizationType,
            primaryBusinessDomainSicCode,
            professionalLicenseNumber,
            roleType,
            updatedAt,
            website,
            mutableMapOf(),
        )

        /**
         * Unique identifier of the enterprise
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingAddress(): Optional<BillingAddress> =
            billingAddress.getOptional("billing_address")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingContact(): Optional<BillingContact> =
            billingContact.getOptional("billing_contact")

        /**
         * Corporate registration number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun corporateRegistrationNumber(): Optional<String> =
            corporateRegistrationNumber.getOptional("corporate_registration_number")

        /**
         * ISO 3166-1 alpha-2 country code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * When the enterprise was created
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Customer reference identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * DBA name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun doingBusinessAs(): Optional<String> = doingBusinessAs.getOptional("doing_business_as")

        /**
         * D-U-N-S Number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dunBradstreetNumber(): Optional<String> =
            dunBradstreetNumber.getOptional("dun_bradstreet_number")

        /**
         * Federal Employer Identification Number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fein(): Optional<String> = fein.getOptional("fein")

        /**
         * Industry classification
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun industry(): Optional<String> = industry.getOptional("industry")

        /**
         * Legal name of the enterprise
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun legalName(): Optional<String> = legalName.getOptional("legal_name")

        /**
         * Employee count range
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numberOfEmployees(): Optional<NumberOfEmployees> =
            numberOfEmployees.getOptional("number_of_employees")

        /**
         * Organization contact information. Note: the response returns this object with the phone
         * field as 'phone' (not 'phone_number').
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationContact(): Optional<OrganizationContact> =
            organizationContact.getOptional("organization_contact")

        /**
         * Legal structure type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationLegalType(): Optional<OrganizationLegalType> =
            organizationLegalType.getOptional("organization_legal_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationPhysicalAddress(): Optional<OrganizationPhysicalAddress> =
            organizationPhysicalAddress.getOptional("organization_physical_address")

        /**
         * Type of organization
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationType(): Optional<OrganizationType> =
            organizationType.getOptional("organization_type")

        /**
         * SIC Code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryBusinessDomainSicCode(): Optional<String> =
            primaryBusinessDomainSicCode.getOptional("primary_business_domain_sic_code")

        /**
         * Professional license number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun professionalLicenseNumber(): Optional<String> =
            professionalLicenseNumber.getOptional("professional_license_number")

        /**
         * Role type in Branded Calling / Number Reputation services
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun roleType(): Optional<RoleType> = roleType.getOptional("role_type")

        /**
         * When the enterprise was last updated
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Company website URL
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun website(): Optional<String> = website.getOptional("website")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

        /**
         * Returns the raw JSON value of [billingContact].
         *
         * Unlike [billingContact], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_contact")
        @ExcludeMissing
        fun _billingContact(): JsonField<BillingContact> = billingContact

        /**
         * Returns the raw JSON value of [corporateRegistrationNumber].
         *
         * Unlike [corporateRegistrationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corporate_registration_number")
        @ExcludeMissing
        fun _corporateRegistrationNumber(): JsonField<String> = corporateRegistrationNumber

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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [doingBusinessAs].
         *
         * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

        /**
         * Returns the raw JSON value of [dunBradstreetNumber].
         *
         * Unlike [dunBradstreetNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dun_bradstreet_number")
        @ExcludeMissing
        fun _dunBradstreetNumber(): JsonField<String> = dunBradstreetNumber

        /**
         * Returns the raw JSON value of [fein].
         *
         * Unlike [fein], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fein") @ExcludeMissing fun _fein(): JsonField<String> = fein

        /**
         * Returns the raw JSON value of [industry].
         *
         * Unlike [industry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<String> = industry

        /**
         * Returns the raw JSON value of [legalName].
         *
         * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

        /**
         * Returns the raw JSON value of [numberOfEmployees].
         *
         * Unlike [numberOfEmployees], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("number_of_employees")
        @ExcludeMissing
        fun _numberOfEmployees(): JsonField<NumberOfEmployees> = numberOfEmployees

        /**
         * Returns the raw JSON value of [organizationContact].
         *
         * Unlike [organizationContact], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("organization_contact")
        @ExcludeMissing
        fun _organizationContact(): JsonField<OrganizationContact> = organizationContact

        /**
         * Returns the raw JSON value of [organizationLegalType].
         *
         * Unlike [organizationLegalType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("organization_legal_type")
        @ExcludeMissing
        fun _organizationLegalType(): JsonField<OrganizationLegalType> = organizationLegalType

        /**
         * Returns the raw JSON value of [organizationPhysicalAddress].
         *
         * Unlike [organizationPhysicalAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("organization_physical_address")
        @ExcludeMissing
        fun _organizationPhysicalAddress(): JsonField<OrganizationPhysicalAddress> =
            organizationPhysicalAddress

        /**
         * Returns the raw JSON value of [organizationType].
         *
         * Unlike [organizationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_type")
        @ExcludeMissing
        fun _organizationType(): JsonField<OrganizationType> = organizationType

        /**
         * Returns the raw JSON value of [primaryBusinessDomainSicCode].
         *
         * Unlike [primaryBusinessDomainSicCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_business_domain_sic_code")
        @ExcludeMissing
        fun _primaryBusinessDomainSicCode(): JsonField<String> = primaryBusinessDomainSicCode

        /**
         * Returns the raw JSON value of [professionalLicenseNumber].
         *
         * Unlike [professionalLicenseNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("professional_license_number")
        @ExcludeMissing
        fun _professionalLicenseNumber(): JsonField<String> = professionalLicenseNumber

        /**
         * Returns the raw JSON value of [roleType].
         *
         * Unlike [roleType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_type") @ExcludeMissing fun _roleType(): JsonField<RoleType> = roleType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var billingContact: JsonField<BillingContact> = JsonMissing.of()
            private var corporateRegistrationNumber: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var doingBusinessAs: JsonField<String> = JsonMissing.of()
            private var dunBradstreetNumber: JsonField<String> = JsonMissing.of()
            private var fein: JsonField<String> = JsonMissing.of()
            private var industry: JsonField<String> = JsonMissing.of()
            private var legalName: JsonField<String> = JsonMissing.of()
            private var numberOfEmployees: JsonField<NumberOfEmployees> = JsonMissing.of()
            private var organizationContact: JsonField<OrganizationContact> = JsonMissing.of()
            private var organizationLegalType: JsonField<OrganizationLegalType> = JsonMissing.of()
            private var organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress> =
                JsonMissing.of()
            private var organizationType: JsonField<OrganizationType> = JsonMissing.of()
            private var primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of()
            private var professionalLicenseNumber: JsonField<String> = JsonMissing.of()
            private var roleType: JsonField<RoleType> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                billingAddress = data.billingAddress
                billingContact = data.billingContact
                corporateRegistrationNumber = data.corporateRegistrationNumber
                countryCode = data.countryCode
                createdAt = data.createdAt
                customerReference = data.customerReference
                doingBusinessAs = data.doingBusinessAs
                dunBradstreetNumber = data.dunBradstreetNumber
                fein = data.fein
                industry = data.industry
                legalName = data.legalName
                numberOfEmployees = data.numberOfEmployees
                organizationContact = data.organizationContact
                organizationLegalType = data.organizationLegalType
                organizationPhysicalAddress = data.organizationPhysicalAddress
                organizationType = data.organizationType
                primaryBusinessDomainSicCode = data.primaryBusinessDomainSicCode
                professionalLicenseNumber = data.professionalLicenseNumber
                roleType = data.roleType
                updatedAt = data.updatedAt
                website = data.website
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier of the enterprise */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun billingAddress(billingAddress: BillingAddress) =
                billingAddress(JsonField.of(billingAddress))

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                this.billingAddress = billingAddress
            }

            fun billingContact(billingContact: BillingContact) =
                billingContact(JsonField.of(billingContact))

            /**
             * Sets [Builder.billingContact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingContact] with a well-typed [BillingContact]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingContact(billingContact: JsonField<BillingContact>) = apply {
                this.billingContact = billingContact
            }

            /** Corporate registration number */
            fun corporateRegistrationNumber(corporateRegistrationNumber: String?) =
                corporateRegistrationNumber(JsonField.ofNullable(corporateRegistrationNumber))

            /**
             * Alias for calling [Builder.corporateRegistrationNumber] with
             * `corporateRegistrationNumber.orElse(null)`.
             */
            fun corporateRegistrationNumber(corporateRegistrationNumber: Optional<String>) =
                corporateRegistrationNumber(corporateRegistrationNumber.getOrNull())

            /**
             * Sets [Builder.corporateRegistrationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.corporateRegistrationNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun corporateRegistrationNumber(corporateRegistrationNumber: JsonField<String>) =
                apply {
                    this.corporateRegistrationNumber = corporateRegistrationNumber
                }

            /** ISO 3166-1 alpha-2 country code */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /** When the enterprise was created */
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

            /** Customer reference identifier */
            fun customerReference(customerReference: String?) =
                customerReference(JsonField.ofNullable(customerReference))

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

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

            /** DBA name */
            fun doingBusinessAs(doingBusinessAs: String) =
                doingBusinessAs(JsonField.of(doingBusinessAs))

            /**
             * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doingBusinessAs] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** D-U-N-S Number */
            fun dunBradstreetNumber(dunBradstreetNumber: String?) =
                dunBradstreetNumber(JsonField.ofNullable(dunBradstreetNumber))

            /**
             * Alias for calling [Builder.dunBradstreetNumber] with
             * `dunBradstreetNumber.orElse(null)`.
             */
            fun dunBradstreetNumber(dunBradstreetNumber: Optional<String>) =
                dunBradstreetNumber(dunBradstreetNumber.getOrNull())

            /**
             * Sets [Builder.dunBradstreetNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dunBradstreetNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dunBradstreetNumber(dunBradstreetNumber: JsonField<String>) = apply {
                this.dunBradstreetNumber = dunBradstreetNumber
            }

            /** Federal Employer Identification Number */
            fun fein(fein: String?) = fein(JsonField.ofNullable(fein))

            /** Alias for calling [Builder.fein] with `fein.orElse(null)`. */
            fun fein(fein: Optional<String>) = fein(fein.getOrNull())

            /**
             * Sets [Builder.fein] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fein] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fein(fein: JsonField<String>) = apply { this.fein = fein }

            /** Industry classification */
            fun industry(industry: String?) = industry(JsonField.ofNullable(industry))

            /** Alias for calling [Builder.industry] with `industry.orElse(null)`. */
            fun industry(industry: Optional<String>) = industry(industry.getOrNull())

            /**
             * Sets [Builder.industry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industry] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun industry(industry: JsonField<String>) = apply { this.industry = industry }

            /** Legal name of the enterprise */
            fun legalName(legalName: String) = legalName(JsonField.of(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

            /** Employee count range */
            fun numberOfEmployees(numberOfEmployees: NumberOfEmployees?) =
                numberOfEmployees(JsonField.ofNullable(numberOfEmployees))

            /**
             * Alias for calling [Builder.numberOfEmployees] with `numberOfEmployees.orElse(null)`.
             */
            fun numberOfEmployees(numberOfEmployees: Optional<NumberOfEmployees>) =
                numberOfEmployees(numberOfEmployees.getOrNull())

            /**
             * Sets [Builder.numberOfEmployees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberOfEmployees] with a well-typed
             * [NumberOfEmployees] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun numberOfEmployees(numberOfEmployees: JsonField<NumberOfEmployees>) = apply {
                this.numberOfEmployees = numberOfEmployees
            }

            /**
             * Organization contact information. Note: the response returns this object with the
             * phone field as 'phone' (not 'phone_number').
             */
            fun organizationContact(organizationContact: OrganizationContact) =
                organizationContact(JsonField.of(organizationContact))

            /**
             * Sets [Builder.organizationContact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationContact] with a well-typed
             * [OrganizationContact] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun organizationContact(organizationContact: JsonField<OrganizationContact>) = apply {
                this.organizationContact = organizationContact
            }

            /** Legal structure type */
            fun organizationLegalType(organizationLegalType: OrganizationLegalType?) =
                organizationLegalType(JsonField.ofNullable(organizationLegalType))

            /**
             * Alias for calling [Builder.organizationLegalType] with
             * `organizationLegalType.orElse(null)`.
             */
            fun organizationLegalType(organizationLegalType: Optional<OrganizationLegalType>) =
                organizationLegalType(organizationLegalType.getOrNull())

            /**
             * Sets [Builder.organizationLegalType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationLegalType] with a well-typed
             * [OrganizationLegalType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun organizationLegalType(organizationLegalType: JsonField<OrganizationLegalType>) =
                apply {
                    this.organizationLegalType = organizationLegalType
                }

            fun organizationPhysicalAddress(
                organizationPhysicalAddress: OrganizationPhysicalAddress
            ) = organizationPhysicalAddress(JsonField.of(organizationPhysicalAddress))

            /**
             * Sets [Builder.organizationPhysicalAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationPhysicalAddress] with a well-typed
             * [OrganizationPhysicalAddress] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun organizationPhysicalAddress(
                organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress>
            ) = apply { this.organizationPhysicalAddress = organizationPhysicalAddress }

            /** Type of organization */
            fun organizationType(organizationType: OrganizationType) =
                organizationType(JsonField.of(organizationType))

            /**
             * Sets [Builder.organizationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationType] with a well-typed
             * [OrganizationType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun organizationType(organizationType: JsonField<OrganizationType>) = apply {
                this.organizationType = organizationType
            }

            /** SIC Code */
            fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: String?) =
                primaryBusinessDomainSicCode(JsonField.ofNullable(primaryBusinessDomainSicCode))

            /**
             * Alias for calling [Builder.primaryBusinessDomainSicCode] with
             * `primaryBusinessDomainSicCode.orElse(null)`.
             */
            fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: Optional<String>) =
                primaryBusinessDomainSicCode(primaryBusinessDomainSicCode.getOrNull())

            /**
             * Sets [Builder.primaryBusinessDomainSicCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryBusinessDomainSicCode] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: JsonField<String>) =
                apply {
                    this.primaryBusinessDomainSicCode = primaryBusinessDomainSicCode
                }

            /** Professional license number */
            fun professionalLicenseNumber(professionalLicenseNumber: String?) =
                professionalLicenseNumber(JsonField.ofNullable(professionalLicenseNumber))

            /**
             * Alias for calling [Builder.professionalLicenseNumber] with
             * `professionalLicenseNumber.orElse(null)`.
             */
            fun professionalLicenseNumber(professionalLicenseNumber: Optional<String>) =
                professionalLicenseNumber(professionalLicenseNumber.getOrNull())

            /**
             * Sets [Builder.professionalLicenseNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.professionalLicenseNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun professionalLicenseNumber(professionalLicenseNumber: JsonField<String>) = apply {
                this.professionalLicenseNumber = professionalLicenseNumber
            }

            /** Role type in Branded Calling / Number Reputation services */
            fun roleType(roleType: RoleType) = roleType(JsonField.of(roleType))

            /**
             * Sets [Builder.roleType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleType] with a well-typed [RoleType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleType(roleType: JsonField<RoleType>) = apply { this.roleType = roleType }

            /** When the enterprise was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Company website URL */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** Alias for calling [Builder.website] with `website.orElse(null)`. */
            fun website(website: Optional<String>) = website(website.getOrNull())

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
                    billingAddress,
                    billingContact,
                    corporateRegistrationNumber,
                    countryCode,
                    createdAt,
                    customerReference,
                    doingBusinessAs,
                    dunBradstreetNumber,
                    fein,
                    industry,
                    legalName,
                    numberOfEmployees,
                    organizationContact,
                    organizationLegalType,
                    organizationPhysicalAddress,
                    organizationType,
                    primaryBusinessDomainSicCode,
                    professionalLicenseNumber,
                    roleType,
                    updatedAt,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            billingAddress().ifPresent { it.validate() }
            billingContact().ifPresent { it.validate() }
            corporateRegistrationNumber()
            countryCode()
            createdAt()
            customerReference()
            doingBusinessAs()
            dunBradstreetNumber()
            fein()
            industry()
            legalName()
            numberOfEmployees().ifPresent { it.validate() }
            organizationContact().ifPresent { it.validate() }
            organizationLegalType().ifPresent { it.validate() }
            organizationPhysicalAddress().ifPresent { it.validate() }
            organizationType().ifPresent { it.validate() }
            primaryBusinessDomainSicCode()
            professionalLicenseNumber()
            roleType().ifPresent { it.validate() }
            updatedAt()
            website()
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
                (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (billingContact.asKnown().getOrNull()?.validity() ?: 0) +
                (if (corporateRegistrationNumber.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
                (if (dunBradstreetNumber.asKnown().isPresent) 1 else 0) +
                (if (fein.asKnown().isPresent) 1 else 0) +
                (if (industry.asKnown().isPresent) 1 else 0) +
                (if (legalName.asKnown().isPresent) 1 else 0) +
                (numberOfEmployees.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationContact.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationLegalType.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationPhysicalAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (primaryBusinessDomainSicCode.asKnown().isPresent) 1 else 0) +
                (if (professionalLicenseNumber.asKnown().isPresent) 1 else 0) +
                (roleType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        class BillingAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val administrativeArea: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val streetAddress: JsonField<String>,
            private val extendedAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("administrative_area")
                @ExcludeMissing
                administrativeArea: JsonField<String> = JsonMissing.of(),
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street_address")
                @ExcludeMissing
                streetAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("extended_address")
                @ExcludeMissing
                extendedAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                administrativeArea,
                city,
                country,
                postalCode,
                streetAddress,
                extendedAddress,
                mutableMapOf(),
            )

            /**
             * State or province
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

            /**
             * City name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * Country name (e.g., United States)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * ZIP or postal code
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * Street address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun streetAddress(): String = streetAddress.getRequired("street_address")

            /**
             * Additional address line (suite, apt, etc.)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun extendedAddress(): Optional<String> =
                extendedAddress.getOptional("extended_address")

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

            /**
             * Returns the raw JSON value of [extendedAddress].
             *
             * Unlike [extendedAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [BillingAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .administrativeArea()
                 * .city()
                 * .country()
                 * .postalCode()
                 * .streetAddress()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BillingAddress]. */
            class Builder internal constructor() {

                private var administrativeArea: JsonField<String>? = null
                private var city: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var streetAddress: JsonField<String>? = null
                private var extendedAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(billingAddress: BillingAddress) = apply {
                    administrativeArea = billingAddress.administrativeArea
                    city = billingAddress.city
                    country = billingAddress.country
                    postalCode = billingAddress.postalCode
                    streetAddress = billingAddress.streetAddress
                    extendedAddress = billingAddress.extendedAddress
                    additionalProperties = billingAddress.additionalProperties.toMutableMap()
                }

                /** State or province */
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

                /** City name */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** Country name (e.g., United States) */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** ZIP or postal code */
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

                /** Street address */
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

                /** Additional address line (suite, apt, etc.) */
                fun extendedAddress(extendedAddress: String?) =
                    extendedAddress(JsonField.ofNullable(extendedAddress))

                /**
                 * Alias for calling [Builder.extendedAddress] with `extendedAddress.orElse(null)`.
                 */
                fun extendedAddress(extendedAddress: Optional<String>) =
                    extendedAddress(extendedAddress.getOrNull())

                /**
                 * Sets [Builder.extendedAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extendedAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [BillingAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .administrativeArea()
                 * .city()
                 * .country()
                 * .postalCode()
                 * .streetAddress()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BillingAddress =
                    BillingAddress(
                        checkRequired("administrativeArea", administrativeArea),
                        checkRequired("city", city),
                        checkRequired("country", country),
                        checkRequired("postalCode", postalCode),
                        checkRequired("streetAddress", streetAddress),
                        extendedAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BillingAddress = apply {
                if (validated) {
                    return@apply
                }

                administrativeArea()
                city()
                country()
                postalCode()
                streetAddress()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                    (if (city.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (streetAddress.asKnown().isPresent) 1 else 0) +
                    (if (extendedAddress.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillingAddress &&
                    administrativeArea == other.administrativeArea &&
                    city == other.city &&
                    country == other.country &&
                    postalCode == other.postalCode &&
                    streetAddress == other.streetAddress &&
                    extendedAddress == other.extendedAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    administrativeArea,
                    city,
                    country,
                    postalCode,
                    streetAddress,
                    extendedAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingAddress{administrativeArea=$administrativeArea, city=$city, country=$country, postalCode=$postalCode, streetAddress=$streetAddress, extendedAddress=$extendedAddress, additionalProperties=$additionalProperties}"
        }

        class BillingContact
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<String>,
            private val firstName: JsonField<String>,
            private val lastName: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("first_name")
                @ExcludeMissing
                firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("last_name")
                @ExcludeMissing
                lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(email, firstName, lastName, phoneNumber, mutableMapOf())

            /**
             * Contact's email address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * Contact's first name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun firstName(): String = firstName.getRequired("first_name")

            /**
             * Contact's last name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lastName(): String = lastName.getRequired("last_name")

            /**
             * Contact's phone number (10-15 digits)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [firstName].
             *
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * Returns a mutable builder for constructing an instance of [BillingContact].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * .firstName()
                 * .lastName()
                 * .phoneNumber()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BillingContact]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var firstName: JsonField<String>? = null
                private var lastName: JsonField<String>? = null
                private var phoneNumber: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(billingContact: BillingContact) = apply {
                    email = billingContact.email
                    firstName = billingContact.firstName
                    lastName = billingContact.lastName
                    phoneNumber = billingContact.phoneNumber
                    additionalProperties = billingContact.additionalProperties.toMutableMap()
                }

                /** Contact's email address */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /** Contact's first name */
                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /**
                 * Sets [Builder.firstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /** Contact's last name */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** Contact's phone number (10-15 digits) */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
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
                 * Returns an immutable instance of [BillingContact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * .firstName()
                 * .lastName()
                 * .phoneNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BillingContact =
                    BillingContact(
                        checkRequired("email", email),
                        checkRequired("firstName", firstName),
                        checkRequired("lastName", lastName),
                        checkRequired("phoneNumber", phoneNumber),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BillingContact = apply {
                if (validated) {
                    return@apply
                }

                email()
                firstName()
                lastName()
                phoneNumber()
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
                (if (email.asKnown().isPresent) 1 else 0) +
                    (if (firstName.asKnown().isPresent) 1 else 0) +
                    (if (lastName.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumber.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillingContact &&
                    email == other.email &&
                    firstName == other.firstName &&
                    lastName == other.lastName &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(email, firstName, lastName, phoneNumber, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingContact{email=$email, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        /** Employee count range */
        class NumberOfEmployees
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

                @JvmField val _1_10 = of("1-10")

                @JvmField val _11_50 = of("11-50")

                @JvmField val _51_200 = of("51-200")

                @JvmField val _201_500 = of("201-500")

                @JvmField val _501_2000 = of("501-2000")

                @JvmField val _2001_10000 = of("2001-10000")

                @JvmField val _10001 = of("10001+")

                @JvmStatic fun of(value: String) = NumberOfEmployees(JsonField.of(value))
            }

            /** An enum containing [NumberOfEmployees]'s known values. */
            enum class Known {
                _1_10,
                _11_50,
                _51_200,
                _201_500,
                _501_2000,
                _2001_10000,
                _10001,
            }

            /**
             * An enum containing [NumberOfEmployees]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [NumberOfEmployees] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1_10,
                _11_50,
                _51_200,
                _201_500,
                _501_2000,
                _2001_10000,
                _10001,
                /**
                 * An enum member indicating that [NumberOfEmployees] was instantiated with an
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
                    _1_10 -> Value._1_10
                    _11_50 -> Value._11_50
                    _51_200 -> Value._51_200
                    _201_500 -> Value._201_500
                    _501_2000 -> Value._501_2000
                    _2001_10000 -> Value._2001_10000
                    _10001 -> Value._10001
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
                    _1_10 -> Known._1_10
                    _11_50 -> Known._11_50
                    _51_200 -> Known._51_200
                    _201_500 -> Known._201_500
                    _501_2000 -> Known._501_2000
                    _2001_10000 -> Known._2001_10000
                    _10001 -> Known._10001
                    else -> throw TelnyxInvalidDataException("Unknown NumberOfEmployees: $value")
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

            fun validate(): NumberOfEmployees = apply {
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

                return other is NumberOfEmployees && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Organization contact information. Note: the response returns this object with the phone
         * field as 'phone' (not 'phone_number').
         */
        class OrganizationContact
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<String>,
            private val firstName: JsonField<String>,
            private val jobTitle: JsonField<String>,
            private val lastName: JsonField<String>,
            private val phone: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("first_name")
                @ExcludeMissing
                firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("job_title")
                @ExcludeMissing
                jobTitle: JsonField<String> = JsonMissing.of(),
                @JsonProperty("last_name")
                @ExcludeMissing
                lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            ) : this(email, firstName, jobTitle, lastName, phone, mutableMapOf())

            /**
             * Contact's email address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * Contact's first name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun firstName(): String = firstName.getRequired("first_name")

            /**
             * Contact's job title (required)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun jobTitle(): String = jobTitle.getRequired("job_title")

            /**
             * Contact's last name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lastName(): String = lastName.getRequired("last_name")

            /**
             * Contact's phone number in E.164 format
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phone(): String = phone.getRequired("phone")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [firstName].
             *
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [jobTitle].
             *
             * Unlike [jobTitle], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("job_title") @ExcludeMissing fun _jobTitle(): JsonField<String> = jobTitle

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [phone].
             *
             * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

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
                 * Returns a mutable builder for constructing an instance of [OrganizationContact].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * .firstName()
                 * .jobTitle()
                 * .lastName()
                 * .phone()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OrganizationContact]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var firstName: JsonField<String>? = null
                private var jobTitle: JsonField<String>? = null
                private var lastName: JsonField<String>? = null
                private var phone: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(organizationContact: OrganizationContact) = apply {
                    email = organizationContact.email
                    firstName = organizationContact.firstName
                    jobTitle = organizationContact.jobTitle
                    lastName = organizationContact.lastName
                    phone = organizationContact.phone
                    additionalProperties = organizationContact.additionalProperties.toMutableMap()
                }

                /** Contact's email address */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /** Contact's first name */
                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /**
                 * Sets [Builder.firstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /** Contact's job title (required) */
                fun jobTitle(jobTitle: String) = jobTitle(JsonField.of(jobTitle))

                /**
                 * Sets [Builder.jobTitle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jobTitle] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun jobTitle(jobTitle: JsonField<String>) = apply { this.jobTitle = jobTitle }

                /** Contact's last name */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** Contact's phone number in E.164 format */
                fun phone(phone: String) = phone(JsonField.of(phone))

                /**
                 * Sets [Builder.phone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phone] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
                 * Returns an immutable instance of [OrganizationContact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * .firstName()
                 * .jobTitle()
                 * .lastName()
                 * .phone()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OrganizationContact =
                    OrganizationContact(
                        checkRequired("email", email),
                        checkRequired("firstName", firstName),
                        checkRequired("jobTitle", jobTitle),
                        checkRequired("lastName", lastName),
                        checkRequired("phone", phone),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OrganizationContact = apply {
                if (validated) {
                    return@apply
                }

                email()
                firstName()
                jobTitle()
                lastName()
                phone()
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
                (if (email.asKnown().isPresent) 1 else 0) +
                    (if (firstName.asKnown().isPresent) 1 else 0) +
                    (if (jobTitle.asKnown().isPresent) 1 else 0) +
                    (if (lastName.asKnown().isPresent) 1 else 0) +
                    (if (phone.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OrganizationContact &&
                    email == other.email &&
                    firstName == other.firstName &&
                    jobTitle == other.jobTitle &&
                    lastName == other.lastName &&
                    phone == other.phone &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(email, firstName, jobTitle, lastName, phone, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OrganizationContact{email=$email, firstName=$firstName, jobTitle=$jobTitle, lastName=$lastName, phone=$phone, additionalProperties=$additionalProperties}"
        }

        /** Legal structure type */
        class OrganizationLegalType
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

                @JvmField val CORPORATION = of("corporation")

                @JvmField val LLC = of("llc")

                @JvmField val PARTNERSHIP = of("partnership")

                @JvmField val NONPROFIT = of("nonprofit")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = OrganizationLegalType(JsonField.of(value))
            }

            /** An enum containing [OrganizationLegalType]'s known values. */
            enum class Known {
                CORPORATION,
                LLC,
                PARTNERSHIP,
                NONPROFIT,
                OTHER,
            }

            /**
             * An enum containing [OrganizationLegalType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [OrganizationLegalType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CORPORATION,
                LLC,
                PARTNERSHIP,
                NONPROFIT,
                OTHER,
                /**
                 * An enum member indicating that [OrganizationLegalType] was instantiated with an
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
                    CORPORATION -> Value.CORPORATION
                    LLC -> Value.LLC
                    PARTNERSHIP -> Value.PARTNERSHIP
                    NONPROFIT -> Value.NONPROFIT
                    OTHER -> Value.OTHER
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
                    CORPORATION -> Known.CORPORATION
                    LLC -> Known.LLC
                    PARTNERSHIP -> Known.PARTNERSHIP
                    NONPROFIT -> Known.NONPROFIT
                    OTHER -> Known.OTHER
                    else ->
                        throw TelnyxInvalidDataException("Unknown OrganizationLegalType: $value")
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

            fun validate(): OrganizationLegalType = apply {
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

                return other is OrganizationLegalType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class OrganizationPhysicalAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val administrativeArea: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val streetAddress: JsonField<String>,
            private val extendedAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("administrative_area")
                @ExcludeMissing
                administrativeArea: JsonField<String> = JsonMissing.of(),
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street_address")
                @ExcludeMissing
                streetAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("extended_address")
                @ExcludeMissing
                extendedAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                administrativeArea,
                city,
                country,
                postalCode,
                streetAddress,
                extendedAddress,
                mutableMapOf(),
            )

            /**
             * State or province
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

            /**
             * City name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * Country name (e.g., United States)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * ZIP or postal code
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * Street address
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun streetAddress(): String = streetAddress.getRequired("street_address")

            /**
             * Additional address line (suite, apt, etc.)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun extendedAddress(): Optional<String> =
                extendedAddress.getOptional("extended_address")

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

            /**
             * Returns the raw JSON value of [extendedAddress].
             *
             * Unlike [extendedAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [OrganizationPhysicalAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .administrativeArea()
                 * .city()
                 * .country()
                 * .postalCode()
                 * .streetAddress()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OrganizationPhysicalAddress]. */
            class Builder internal constructor() {

                private var administrativeArea: JsonField<String>? = null
                private var city: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var streetAddress: JsonField<String>? = null
                private var extendedAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(organizationPhysicalAddress: OrganizationPhysicalAddress) =
                    apply {
                        administrativeArea = organizationPhysicalAddress.administrativeArea
                        city = organizationPhysicalAddress.city
                        country = organizationPhysicalAddress.country
                        postalCode = organizationPhysicalAddress.postalCode
                        streetAddress = organizationPhysicalAddress.streetAddress
                        extendedAddress = organizationPhysicalAddress.extendedAddress
                        additionalProperties =
                            organizationPhysicalAddress.additionalProperties.toMutableMap()
                    }

                /** State or province */
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

                /** City name */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** Country name (e.g., United States) */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** ZIP or postal code */
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

                /** Street address */
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

                /** Additional address line (suite, apt, etc.) */
                fun extendedAddress(extendedAddress: String?) =
                    extendedAddress(JsonField.ofNullable(extendedAddress))

                /**
                 * Alias for calling [Builder.extendedAddress] with `extendedAddress.orElse(null)`.
                 */
                fun extendedAddress(extendedAddress: Optional<String>) =
                    extendedAddress(extendedAddress.getOrNull())

                /**
                 * Sets [Builder.extendedAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extendedAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [OrganizationPhysicalAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .administrativeArea()
                 * .city()
                 * .country()
                 * .postalCode()
                 * .streetAddress()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OrganizationPhysicalAddress =
                    OrganizationPhysicalAddress(
                        checkRequired("administrativeArea", administrativeArea),
                        checkRequired("city", city),
                        checkRequired("country", country),
                        checkRequired("postalCode", postalCode),
                        checkRequired("streetAddress", streetAddress),
                        extendedAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OrganizationPhysicalAddress = apply {
                if (validated) {
                    return@apply
                }

                administrativeArea()
                city()
                country()
                postalCode()
                streetAddress()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                    (if (city.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (streetAddress.asKnown().isPresent) 1 else 0) +
                    (if (extendedAddress.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OrganizationPhysicalAddress &&
                    administrativeArea == other.administrativeArea &&
                    city == other.city &&
                    country == other.country &&
                    postalCode == other.postalCode &&
                    streetAddress == other.streetAddress &&
                    extendedAddress == other.extendedAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    administrativeArea,
                    city,
                    country,
                    postalCode,
                    streetAddress,
                    extendedAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OrganizationPhysicalAddress{administrativeArea=$administrativeArea, city=$city, country=$country, postalCode=$postalCode, streetAddress=$streetAddress, extendedAddress=$extendedAddress, additionalProperties=$additionalProperties}"
        }

        /** Type of organization */
        class OrganizationType
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

                @JvmField val COMMERCIAL = of("commercial")

                @JvmField val GOVERNMENT = of("government")

                @JvmField val NON_PROFIT = of("non_profit")

                @JvmStatic fun of(value: String) = OrganizationType(JsonField.of(value))
            }

            /** An enum containing [OrganizationType]'s known values. */
            enum class Known {
                COMMERCIAL,
                GOVERNMENT,
                NON_PROFIT,
            }

            /**
             * An enum containing [OrganizationType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [OrganizationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMERCIAL,
                GOVERNMENT,
                NON_PROFIT,
                /**
                 * An enum member indicating that [OrganizationType] was instantiated with an
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
                    COMMERCIAL -> Value.COMMERCIAL
                    GOVERNMENT -> Value.GOVERNMENT
                    NON_PROFIT -> Value.NON_PROFIT
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
                    COMMERCIAL -> Known.COMMERCIAL
                    GOVERNMENT -> Known.GOVERNMENT
                    NON_PROFIT -> Known.NON_PROFIT
                    else -> throw TelnyxInvalidDataException("Unknown OrganizationType: $value")
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

            fun validate(): OrganizationType = apply {
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

                return other is OrganizationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Role type in Branded Calling / Number Reputation services */
        class RoleType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ENTERPRISE = of("enterprise")

                @JvmField val BPO = of("bpo")

                @JvmStatic fun of(value: String) = RoleType(JsonField.of(value))
            }

            /** An enum containing [RoleType]'s known values. */
            enum class Known {
                ENTERPRISE,
                BPO,
            }

            /**
             * An enum containing [RoleType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RoleType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ENTERPRISE,
                BPO,
                /**
                 * An enum member indicating that [RoleType] was instantiated with an unknown value.
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
                    ENTERPRISE -> Value.ENTERPRISE
                    BPO -> Value.BPO
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
                    ENTERPRISE -> Known.ENTERPRISE
                    BPO -> Known.BPO
                    else -> throw TelnyxInvalidDataException("Unknown RoleType: $value")
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

            fun validate(): RoleType = apply {
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

                return other is RoleType && value == other.value
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
                billingAddress == other.billingAddress &&
                billingContact == other.billingContact &&
                corporateRegistrationNumber == other.corporateRegistrationNumber &&
                countryCode == other.countryCode &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                doingBusinessAs == other.doingBusinessAs &&
                dunBradstreetNumber == other.dunBradstreetNumber &&
                fein == other.fein &&
                industry == other.industry &&
                legalName == other.legalName &&
                numberOfEmployees == other.numberOfEmployees &&
                organizationContact == other.organizationContact &&
                organizationLegalType == other.organizationLegalType &&
                organizationPhysicalAddress == other.organizationPhysicalAddress &&
                organizationType == other.organizationType &&
                primaryBusinessDomainSicCode == other.primaryBusinessDomainSicCode &&
                professionalLicenseNumber == other.professionalLicenseNumber &&
                roleType == other.roleType &&
                updatedAt == other.updatedAt &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                billingAddress,
                billingContact,
                corporateRegistrationNumber,
                countryCode,
                createdAt,
                customerReference,
                doingBusinessAs,
                dunBradstreetNumber,
                fein,
                industry,
                legalName,
                numberOfEmployees,
                organizationContact,
                organizationLegalType,
                organizationPhysicalAddress,
                organizationType,
                primaryBusinessDomainSicCode,
                professionalLicenseNumber,
                roleType,
                updatedAt,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, billingAddress=$billingAddress, billingContact=$billingContact, corporateRegistrationNumber=$corporateRegistrationNumber, countryCode=$countryCode, createdAt=$createdAt, customerReference=$customerReference, doingBusinessAs=$doingBusinessAs, dunBradstreetNumber=$dunBradstreetNumber, fein=$fein, industry=$industry, legalName=$legalName, numberOfEmployees=$numberOfEmployees, organizationContact=$organizationContact, organizationLegalType=$organizationLegalType, organizationPhysicalAddress=$organizationPhysicalAddress, organizationType=$organizationType, primaryBusinessDomainSicCode=$primaryBusinessDomainSicCode, professionalLicenseNumber=$professionalLicenseNumber, roleType=$roleType, updatedAt=$updatedAt, website=$website, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnterpriseRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnterpriseRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
