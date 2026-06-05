// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

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

class EnterprisePublic
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billingAddress: JsonField<BillingAddress>,
    private val billingContact: JsonField<BillingContact>,
    private val brandedCallingEnabled: JsonField<Boolean>,
    private val corporateRegistrationNumber: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerReference: JsonField<String>,
    private val doingBusinessAs: JsonField<String>,
    private val dunBradstreetNumber: JsonField<String>,
    private val fein: JsonField<String>,
    private val industry: JsonField<String>,
    private val jurisdictionOfIncorporation: JsonField<String>,
    private val legalName: JsonField<String>,
    private val numberOfEmployees: JsonField<String>,
    private val numberReputationEnabled: JsonField<Boolean>,
    private val organizationContact: JsonField<OrganizationContact>,
    private val organizationLegalType: JsonField<String>,
    private val organizationPhysicalAddress: JsonField<PhysicalAddress>,
    private val organizationType: JsonField<String>,
    private val primaryBusinessDomainSicCode: JsonField<String>,
    private val professionalLicenseNumber: JsonField<String>,
    private val roleType: JsonField<String>,
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
        @JsonProperty("branded_calling_enabled")
        @ExcludeMissing
        brandedCallingEnabled: JsonField<Boolean> = JsonMissing.of(),
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
        @JsonProperty("industry") @ExcludeMissing industry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jurisdiction_of_incorporation")
        @ExcludeMissing
        jurisdictionOfIncorporation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_name") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number_of_employees")
        @ExcludeMissing
        numberOfEmployees: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number_reputation_enabled")
        @ExcludeMissing
        numberReputationEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("organization_contact")
        @ExcludeMissing
        organizationContact: JsonField<OrganizationContact> = JsonMissing.of(),
        @JsonProperty("organization_legal_type")
        @ExcludeMissing
        organizationLegalType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_physical_address")
        @ExcludeMissing
        organizationPhysicalAddress: JsonField<PhysicalAddress> = JsonMissing.of(),
        @JsonProperty("organization_type")
        @ExcludeMissing
        organizationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_business_domain_sic_code")
        @ExcludeMissing
        primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("professional_license_number")
        @ExcludeMissing
        professionalLicenseNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role_type") @ExcludeMissing roleType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        billingAddress,
        billingContact,
        brandedCallingEnabled,
        corporateRegistrationNumber,
        countryCode,
        createdAt,
        customerReference,
        doingBusinessAs,
        dunBradstreetNumber,
        fein,
        industry,
        jurisdictionOfIncorporation,
        legalName,
        numberOfEmployees,
        numberReputationEnabled,
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingAddress(): Optional<BillingAddress> = billingAddress.getOptional("billing_address")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingContact(): Optional<BillingContact> = billingContact.getOptional("billing_contact")

    /**
     * True once Branded Calling has been activated on this enterprise (see `POST
     * /enterprises/{id}/branded_calling`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandedCallingEnabled(): Optional<Boolean> =
        brandedCallingEnabled.getOptional("branded_calling_enabled")

    /**
     * Optional corporate-registration / company-number identifier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporateRegistrationNumber(): Optional<String> =
        corporateRegistrationNumber.getOptional("corporate_registration_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = customerReference.getOptional("customer_reference")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doingBusinessAs(): Optional<String> = doingBusinessAs.getOptional("doing_business_as")

    /**
     * Optional D-U-N-S Number issued by Dun & Bradstreet.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dunBradstreetNumber(): Optional<String> =
        dunBradstreetNumber.getOptional("dun_bradstreet_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fein(): Optional<String> = fein.getOptional("fein")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun industry(): Optional<String> = industry.getOptional("industry")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdictionOfIncorporation(): Optional<String> =
        jurisdictionOfIncorporation.getOptional("jurisdiction_of_incorporation")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalName(): Optional<String> = legalName.getOptional("legal_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberOfEmployees(): Optional<String> = numberOfEmployees.getOptional("number_of_employees")

    /**
     * True once Phone Number Reputation has been enabled on this enterprise (see `POST
     * /enterprises/{id}/reputation`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberReputationEnabled(): Optional<Boolean> =
        numberReputationEnabled.getOptional("number_reputation_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationContact(): Optional<OrganizationContact> =
        organizationContact.getOptional("organization_contact")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationLegalType(): Optional<String> =
        organizationLegalType.getOptional("organization_legal_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationPhysicalAddress(): Optional<PhysicalAddress> =
        organizationPhysicalAddress.getOptional("organization_physical_address")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationType(): Optional<String> = organizationType.getOptional("organization_type")

    /**
     * Optional SIC code for the primary line of business.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryBusinessDomainSicCode(): Optional<String> =
        primaryBusinessDomainSicCode.getOptional("primary_business_domain_sic_code")

    /**
     * Optional professional-license number for regulated industries.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun professionalLicenseNumber(): Optional<String> =
        professionalLicenseNumber.getOptional("professional_license_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleType(): Optional<String> = roleType.getOptional("role_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
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
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<BillingAddress> = billingAddress

    /**
     * Returns the raw JSON value of [billingContact].
     *
     * Unlike [billingContact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_contact")
    @ExcludeMissing
    fun _billingContact(): JsonField<BillingContact> = billingContact

    /**
     * Returns the raw JSON value of [brandedCallingEnabled].
     *
     * Unlike [brandedCallingEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("branded_calling_enabled")
    @ExcludeMissing
    fun _brandedCallingEnabled(): JsonField<Boolean> = brandedCallingEnabled

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
     * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doing_business_as")
    @ExcludeMissing
    fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

    /**
     * Returns the raw JSON value of [dunBradstreetNumber].
     *
     * Unlike [dunBradstreetNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [jurisdictionOfIncorporation].
     *
     * Unlike [jurisdictionOfIncorporation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("jurisdiction_of_incorporation")
    @ExcludeMissing
    fun _jurisdictionOfIncorporation(): JsonField<String> = jurisdictionOfIncorporation

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
    fun _numberOfEmployees(): JsonField<String> = numberOfEmployees

    /**
     * Returns the raw JSON value of [numberReputationEnabled].
     *
     * Unlike [numberReputationEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("number_reputation_enabled")
    @ExcludeMissing
    fun _numberReputationEnabled(): JsonField<Boolean> = numberReputationEnabled

    /**
     * Returns the raw JSON value of [organizationContact].
     *
     * Unlike [organizationContact], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("organization_contact")
    @ExcludeMissing
    fun _organizationContact(): JsonField<OrganizationContact> = organizationContact

    /**
     * Returns the raw JSON value of [organizationLegalType].
     *
     * Unlike [organizationLegalType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("organization_legal_type")
    @ExcludeMissing
    fun _organizationLegalType(): JsonField<String> = organizationLegalType

    /**
     * Returns the raw JSON value of [organizationPhysicalAddress].
     *
     * Unlike [organizationPhysicalAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("organization_physical_address")
    @ExcludeMissing
    fun _organizationPhysicalAddress(): JsonField<PhysicalAddress> = organizationPhysicalAddress

    /**
     * Returns the raw JSON value of [organizationType].
     *
     * Unlike [organizationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("organization_type")
    @ExcludeMissing
    fun _organizationType(): JsonField<String> = organizationType

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
    @JsonProperty("role_type") @ExcludeMissing fun _roleType(): JsonField<String> = roleType

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

        /** Returns a mutable builder for constructing an instance of [EnterprisePublic]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnterprisePublic]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var billingContact: JsonField<BillingContact> = JsonMissing.of()
        private var brandedCallingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var corporateRegistrationNumber: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var dunBradstreetNumber: JsonField<String> = JsonMissing.of()
        private var fein: JsonField<String> = JsonMissing.of()
        private var industry: JsonField<String> = JsonMissing.of()
        private var jurisdictionOfIncorporation: JsonField<String> = JsonMissing.of()
        private var legalName: JsonField<String> = JsonMissing.of()
        private var numberOfEmployees: JsonField<String> = JsonMissing.of()
        private var numberReputationEnabled: JsonField<Boolean> = JsonMissing.of()
        private var organizationContact: JsonField<OrganizationContact> = JsonMissing.of()
        private var organizationLegalType: JsonField<String> = JsonMissing.of()
        private var organizationPhysicalAddress: JsonField<PhysicalAddress> = JsonMissing.of()
        private var organizationType: JsonField<String> = JsonMissing.of()
        private var primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of()
        private var professionalLicenseNumber: JsonField<String> = JsonMissing.of()
        private var roleType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enterprisePublic: EnterprisePublic) = apply {
            id = enterprisePublic.id
            billingAddress = enterprisePublic.billingAddress
            billingContact = enterprisePublic.billingContact
            brandedCallingEnabled = enterprisePublic.brandedCallingEnabled
            corporateRegistrationNumber = enterprisePublic.corporateRegistrationNumber
            countryCode = enterprisePublic.countryCode
            createdAt = enterprisePublic.createdAt
            customerReference = enterprisePublic.customerReference
            doingBusinessAs = enterprisePublic.doingBusinessAs
            dunBradstreetNumber = enterprisePublic.dunBradstreetNumber
            fein = enterprisePublic.fein
            industry = enterprisePublic.industry
            jurisdictionOfIncorporation = enterprisePublic.jurisdictionOfIncorporation
            legalName = enterprisePublic.legalName
            numberOfEmployees = enterprisePublic.numberOfEmployees
            numberReputationEnabled = enterprisePublic.numberReputationEnabled
            organizationContact = enterprisePublic.organizationContact
            organizationLegalType = enterprisePublic.organizationLegalType
            organizationPhysicalAddress = enterprisePublic.organizationPhysicalAddress
            organizationType = enterprisePublic.organizationType
            primaryBusinessDomainSicCode = enterprisePublic.primaryBusinessDomainSicCode
            professionalLicenseNumber = enterprisePublic.professionalLicenseNumber
            roleType = enterprisePublic.roleType
            updatedAt = enterprisePublic.updatedAt
            website = enterprisePublic.website
            additionalProperties = enterprisePublic.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun billingAddress(billingAddress: BillingAddress) =
            billingAddress(JsonField.of(billingAddress))

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        fun billingContact(billingContact: BillingContact) =
            billingContact(JsonField.of(billingContact))

        /**
         * Sets [Builder.billingContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingContact] with a well-typed [BillingContact] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingContact(billingContact: JsonField<BillingContact>) = apply {
            this.billingContact = billingContact
        }

        /**
         * True once Branded Calling has been activated on this enterprise (see `POST
         * /enterprises/{id}/branded_calling`).
         */
        fun brandedCallingEnabled(brandedCallingEnabled: Boolean) =
            brandedCallingEnabled(JsonField.of(brandedCallingEnabled))

        /**
         * Sets [Builder.brandedCallingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandedCallingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun brandedCallingEnabled(brandedCallingEnabled: JsonField<Boolean>) = apply {
            this.brandedCallingEnabled = brandedCallingEnabled
        }

        /** Optional corporate-registration / company-number identifier. */
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
         * You should usually call [Builder.corporateRegistrationNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun corporateRegistrationNumber(corporateRegistrationNumber: JsonField<String>) = apply {
            this.corporateRegistrationNumber = corporateRegistrationNumber
        }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /** Optional D-U-N-S Number issued by Dun & Bradstreet. */
        fun dunBradstreetNumber(dunBradstreetNumber: String?) =
            dunBradstreetNumber(JsonField.ofNullable(dunBradstreetNumber))

        /**
         * Alias for calling [Builder.dunBradstreetNumber] with `dunBradstreetNumber.orElse(null)`.
         */
        fun dunBradstreetNumber(dunBradstreetNumber: Optional<String>) =
            dunBradstreetNumber(dunBradstreetNumber.getOrNull())

        /**
         * Sets [Builder.dunBradstreetNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dunBradstreetNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dunBradstreetNumber(dunBradstreetNumber: JsonField<String>) = apply {
            this.dunBradstreetNumber = dunBradstreetNumber
        }

        fun fein(fein: String) = fein(JsonField.of(fein))

        /**
         * Sets [Builder.fein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fein(fein: JsonField<String>) = apply { this.fein = fein }

        fun industry(industry: String) = industry(JsonField.of(industry))

        /**
         * Sets [Builder.industry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industry] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun industry(industry: JsonField<String>) = apply { this.industry = industry }

        fun jurisdictionOfIncorporation(jurisdictionOfIncorporation: String) =
            jurisdictionOfIncorporation(JsonField.of(jurisdictionOfIncorporation))

        /**
         * Sets [Builder.jurisdictionOfIncorporation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdictionOfIncorporation] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jurisdictionOfIncorporation(jurisdictionOfIncorporation: JsonField<String>) = apply {
            this.jurisdictionOfIncorporation = jurisdictionOfIncorporation
        }

        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun numberOfEmployees(numberOfEmployees: String) =
            numberOfEmployees(JsonField.of(numberOfEmployees))

        /**
         * Sets [Builder.numberOfEmployees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfEmployees] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numberOfEmployees(numberOfEmployees: JsonField<String>) = apply {
            this.numberOfEmployees = numberOfEmployees
        }

        /**
         * True once Phone Number Reputation has been enabled on this enterprise (see `POST
         * /enterprises/{id}/reputation`).
         */
        fun numberReputationEnabled(numberReputationEnabled: Boolean) =
            numberReputationEnabled(JsonField.of(numberReputationEnabled))

        /**
         * Sets [Builder.numberReputationEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberReputationEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun numberReputationEnabled(numberReputationEnabled: JsonField<Boolean>) = apply {
            this.numberReputationEnabled = numberReputationEnabled
        }

        fun organizationContact(organizationContact: OrganizationContact) =
            organizationContact(JsonField.of(organizationContact))

        /**
         * Sets [Builder.organizationContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationContact] with a well-typed
         * [OrganizationContact] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun organizationContact(organizationContact: JsonField<OrganizationContact>) = apply {
            this.organizationContact = organizationContact
        }

        fun organizationLegalType(organizationLegalType: String) =
            organizationLegalType(JsonField.of(organizationLegalType))

        /**
         * Sets [Builder.organizationLegalType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationLegalType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationLegalType(organizationLegalType: JsonField<String>) = apply {
            this.organizationLegalType = organizationLegalType
        }

        fun organizationPhysicalAddress(organizationPhysicalAddress: PhysicalAddress) =
            organizationPhysicalAddress(JsonField.of(organizationPhysicalAddress))

        /**
         * Sets [Builder.organizationPhysicalAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationPhysicalAddress] with a well-typed
         * [PhysicalAddress] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun organizationPhysicalAddress(organizationPhysicalAddress: JsonField<PhysicalAddress>) =
            apply {
                this.organizationPhysicalAddress = organizationPhysicalAddress
            }

        fun organizationType(organizationType: String) =
            organizationType(JsonField.of(organizationType))

        /**
         * Sets [Builder.organizationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationType(organizationType: JsonField<String>) = apply {
            this.organizationType = organizationType
        }

        /** Optional SIC code for the primary line of business. */
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
         * You should usually call [Builder.primaryBusinessDomainSicCode] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: JsonField<String>) = apply {
            this.primaryBusinessDomainSicCode = primaryBusinessDomainSicCode
        }

        /** Optional professional-license number for regulated industries. */
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
         * You should usually call [Builder.professionalLicenseNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun professionalLicenseNumber(professionalLicenseNumber: JsonField<String>) = apply {
            this.professionalLicenseNumber = professionalLicenseNumber
        }

        fun roleType(roleType: String) = roleType(JsonField.of(roleType))

        /**
         * Sets [Builder.roleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleType(roleType: JsonField<String>) = apply { this.roleType = roleType }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun website(website: String) = website(JsonField.of(website))

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [EnterprisePublic].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnterprisePublic =
            EnterprisePublic(
                id,
                billingAddress,
                billingContact,
                brandedCallingEnabled,
                corporateRegistrationNumber,
                countryCode,
                createdAt,
                customerReference,
                doingBusinessAs,
                dunBradstreetNumber,
                fein,
                industry,
                jurisdictionOfIncorporation,
                legalName,
                numberOfEmployees,
                numberReputationEnabled,
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): EnterprisePublic = apply {
        if (validated) {
            return@apply
        }

        id()
        billingAddress().ifPresent { it.validate() }
        billingContact().ifPresent { it.validate() }
        brandedCallingEnabled()
        corporateRegistrationNumber()
        countryCode()
        createdAt()
        customerReference()
        doingBusinessAs()
        dunBradstreetNumber()
        fein()
        industry()
        jurisdictionOfIncorporation()
        legalName()
        numberOfEmployees()
        numberReputationEnabled()
        organizationContact().ifPresent { it.validate() }
        organizationLegalType()
        organizationPhysicalAddress().ifPresent { it.validate() }
        organizationType()
        primaryBusinessDomainSicCode()
        professionalLicenseNumber()
        roleType()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (billingContact.asKnown().getOrNull()?.validity() ?: 0) +
            (if (brandedCallingEnabled.asKnown().isPresent) 1 else 0) +
            (if (corporateRegistrationNumber.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
            (if (dunBradstreetNumber.asKnown().isPresent) 1 else 0) +
            (if (fein.asKnown().isPresent) 1 else 0) +
            (if (industry.asKnown().isPresent) 1 else 0) +
            (if (jurisdictionOfIncorporation.asKnown().isPresent) 1 else 0) +
            (if (legalName.asKnown().isPresent) 1 else 0) +
            (if (numberOfEmployees.asKnown().isPresent) 1 else 0) +
            (if (numberReputationEnabled.asKnown().isPresent) 1 else 0) +
            (organizationContact.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organizationLegalType.asKnown().isPresent) 1 else 0) +
            (organizationPhysicalAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organizationType.asKnown().isPresent) 1 else 0) +
            (if (primaryBusinessDomainSicCode.asKnown().isPresent) 1 else 0) +
            (if (professionalLicenseNumber.asKnown().isPresent) 1 else 0) +
            (if (roleType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (website.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnterprisePublic &&
            id == other.id &&
            billingAddress == other.billingAddress &&
            billingContact == other.billingContact &&
            brandedCallingEnabled == other.brandedCallingEnabled &&
            corporateRegistrationNumber == other.corporateRegistrationNumber &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            customerReference == other.customerReference &&
            doingBusinessAs == other.doingBusinessAs &&
            dunBradstreetNumber == other.dunBradstreetNumber &&
            fein == other.fein &&
            industry == other.industry &&
            jurisdictionOfIncorporation == other.jurisdictionOfIncorporation &&
            legalName == other.legalName &&
            numberOfEmployees == other.numberOfEmployees &&
            numberReputationEnabled == other.numberReputationEnabled &&
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
            brandedCallingEnabled,
            corporateRegistrationNumber,
            countryCode,
            createdAt,
            customerReference,
            doingBusinessAs,
            dunBradstreetNumber,
            fein,
            industry,
            jurisdictionOfIncorporation,
            legalName,
            numberOfEmployees,
            numberReputationEnabled,
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
        "EnterprisePublic{id=$id, billingAddress=$billingAddress, billingContact=$billingContact, brandedCallingEnabled=$brandedCallingEnabled, corporateRegistrationNumber=$corporateRegistrationNumber, countryCode=$countryCode, createdAt=$createdAt, customerReference=$customerReference, doingBusinessAs=$doingBusinessAs, dunBradstreetNumber=$dunBradstreetNumber, fein=$fein, industry=$industry, jurisdictionOfIncorporation=$jurisdictionOfIncorporation, legalName=$legalName, numberOfEmployees=$numberOfEmployees, numberReputationEnabled=$numberReputationEnabled, organizationContact=$organizationContact, organizationLegalType=$organizationLegalType, organizationPhysicalAddress=$organizationPhysicalAddress, organizationType=$organizationType, primaryBusinessDomainSicCode=$primaryBusinessDomainSicCode, professionalLicenseNumber=$professionalLicenseNumber, roleType=$roleType, updatedAt=$updatedAt, website=$website, additionalProperties=$additionalProperties}"
}
