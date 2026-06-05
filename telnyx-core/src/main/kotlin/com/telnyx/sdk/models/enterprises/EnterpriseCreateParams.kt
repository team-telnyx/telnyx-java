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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create the legal entity that owns your Number Reputation registrations.
 *
 * The response carries a server-assigned `id` you will use for every subsequent call. After
 * creating an enterprise and agreeing to the Number Reputation Terms of Service (`POST
 * /terms_of_service/number_reputation/agree`), enable reputation monitoring via `POST
 * /enterprises/{enterprise_id}/reputation`.
 *
 * An enterprise is shared across Telnyx products; if you also use Branded Calling, the same
 * enterprise is reused.
 */
class EnterpriseCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingAddress(): BillingAddress = body.billingAddress()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingContact(): BillingContact = body.billingContact()

    /**
     * ISO 3166-1 alpha-2 country code. Currently `US` and `CA` are supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = body.countryCode()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun doingBusinessAs(): String = body.doingBusinessAs()

    /**
     * US Federal Employer Identification Number (`NN-NNNNNNN`) or Canadian equivalent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fein(): String = body.fein()

    /**
     * Industry classification.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun industry(): Industry = body.industry()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jurisdictionOfIncorporation(): String = body.jurisdictionOfIncorporation()

    /**
     * Legal name of the enterprise.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = body.legalName()

    /**
     * Approximate headcount range. Used for vetting heuristics; pick the bucket that contains your
     * current employee count.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberOfEmployees(): NumberOfEmployees = body.numberOfEmployees()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationContact(): OrganizationContact = body.organizationContact()

    /**
     * Legal-entity form. Pick the form that matches your incorporation documents:
     * - `corporation` — C-corp or S-corp.
     * - `llc` — limited liability company.
     * - `partnership` — general/limited partnership.
     * - `nonprofit` — non-profit corporation, charitable trust, or 501(c)(3)/equivalent.
     * - `other` — anything else (sole proprietorships, government bodies, DBAs, etc.). You may be
     *   asked for additional documents during vetting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationLegalType(): OrganizationLegalType = body.organizationLegalType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationPhysicalAddress(): PhysicalAddress = body.organizationPhysicalAddress()

    /**
     * Organization category for vetting purposes:
     * - `commercial` — for-profit business entities (LLC, corp, partnership, sole proprietorship).
     *   Most callers fall here.
     * - `government` — federal/state/local government bodies.
     * - `non_profit` — registered 501(c)(3)/equivalent (incl. educational institutions, charities,
     *   religious organisations).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationType(): OrganizationType = body.organizationType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun website(): String = body.website()

    /**
     * Optional corporate-registration / company-number identifier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporateRegistrationNumber(): Optional<String> = body.corporateRegistrationNumber()

    /**
     * Optional free-form string the caller can attach for their own bookkeeping. Telnyx does not
     * interpret it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * Optional D-U-N-S Number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dunBradstreetNumber(): Optional<String> = body.dunBradstreetNumber()

    /**
     * Optional SIC code for the primary line of business.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryBusinessDomainSicCode(): Optional<String> = body.primaryBusinessDomainSicCode()

    /**
     * Optional professional-license number for regulated industries.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun professionalLicenseNumber(): Optional<String> = body.professionalLicenseNumber()

    /**
     * `enterprise` for an organization registering its own DIRs; `bpo` for a Business Process
     * Outsourcer placing calls on behalf of one or more enterprises.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleType(): Optional<RoleType> = body.roleType()

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingAddress(): JsonField<BillingAddress> = body._billingAddress()

    /**
     * Returns the raw JSON value of [billingContact].
     *
     * Unlike [billingContact], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingContact(): JsonField<BillingContact> = body._billingContact()

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _countryCode(): JsonField<String> = body._countryCode()

    /**
     * Returns the raw JSON value of [doingBusinessAs].
     *
     * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _doingBusinessAs(): JsonField<String> = body._doingBusinessAs()

    /**
     * Returns the raw JSON value of [fein].
     *
     * Unlike [fein], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fein(): JsonField<String> = body._fein()

    /**
     * Returns the raw JSON value of [industry].
     *
     * Unlike [industry], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _industry(): JsonField<Industry> = body._industry()

    /**
     * Returns the raw JSON value of [jurisdictionOfIncorporation].
     *
     * Unlike [jurisdictionOfIncorporation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _jurisdictionOfIncorporation(): JsonField<String> = body._jurisdictionOfIncorporation()

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalName(): JsonField<String> = body._legalName()

    /**
     * Returns the raw JSON value of [numberOfEmployees].
     *
     * Unlike [numberOfEmployees], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _numberOfEmployees(): JsonField<NumberOfEmployees> = body._numberOfEmployees()

    /**
     * Returns the raw JSON value of [organizationContact].
     *
     * Unlike [organizationContact], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _organizationContact(): JsonField<OrganizationContact> = body._organizationContact()

    /**
     * Returns the raw JSON value of [organizationLegalType].
     *
     * Unlike [organizationLegalType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _organizationLegalType(): JsonField<OrganizationLegalType> = body._organizationLegalType()

    /**
     * Returns the raw JSON value of [organizationPhysicalAddress].
     *
     * Unlike [organizationPhysicalAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _organizationPhysicalAddress(): JsonField<PhysicalAddress> =
        body._organizationPhysicalAddress()

    /**
     * Returns the raw JSON value of [organizationType].
     *
     * Unlike [organizationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _organizationType(): JsonField<OrganizationType> = body._organizationType()

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _website(): JsonField<String> = body._website()

    /**
     * Returns the raw JSON value of [corporateRegistrationNumber].
     *
     * Unlike [corporateRegistrationNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _corporateRegistrationNumber(): JsonField<String> = body._corporateRegistrationNumber()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [dunBradstreetNumber].
     *
     * Unlike [dunBradstreetNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dunBradstreetNumber(): JsonField<String> = body._dunBradstreetNumber()

    /**
     * Returns the raw JSON value of [primaryBusinessDomainSicCode].
     *
     * Unlike [primaryBusinessDomainSicCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _primaryBusinessDomainSicCode(): JsonField<String> = body._primaryBusinessDomainSicCode()

    /**
     * Returns the raw JSON value of [professionalLicenseNumber].
     *
     * Unlike [professionalLicenseNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _professionalLicenseNumber(): JsonField<String> = body._professionalLicenseNumber()

    /**
     * Returns the raw JSON value of [roleType].
     *
     * Unlike [roleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roleType(): JsonField<RoleType> = body._roleType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EnterpriseCreateParams].
         *
         * The following fields are required:
         * ```java
         * .billingAddress()
         * .billingContact()
         * .countryCode()
         * .doingBusinessAs()
         * .fein()
         * .industry()
         * .jurisdictionOfIncorporation()
         * .legalName()
         * .numberOfEmployees()
         * .organizationContact()
         * .organizationLegalType()
         * .organizationPhysicalAddress()
         * .organizationType()
         * .website()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnterpriseCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(enterpriseCreateParams: EnterpriseCreateParams) = apply {
            body = enterpriseCreateParams.body.toBuilder()
            additionalHeaders = enterpriseCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = enterpriseCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billingAddress]
         * - [billingContact]
         * - [countryCode]
         * - [doingBusinessAs]
         * - [fein]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun billingAddress(billingAddress: BillingAddress) = apply {
            body.billingAddress(billingAddress)
        }

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            body.billingAddress(billingAddress)
        }

        fun billingContact(billingContact: BillingContact) = apply {
            body.billingContact(billingContact)
        }

        /**
         * Sets [Builder.billingContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingContact] with a well-typed [BillingContact] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingContact(billingContact: JsonField<BillingContact>) = apply {
            body.billingContact(billingContact)
        }

        /** ISO 3166-1 alpha-2 country code. Currently `US` and `CA` are supported. */
        fun countryCode(countryCode: String) = apply { body.countryCode(countryCode) }

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { body.countryCode(countryCode) }

        fun doingBusinessAs(doingBusinessAs: String) = apply {
            body.doingBusinessAs(doingBusinessAs)
        }

        /**
         * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAs] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            body.doingBusinessAs(doingBusinessAs)
        }

        /** US Federal Employer Identification Number (`NN-NNNNNNN`) or Canadian equivalent. */
        fun fein(fein: String) = apply { body.fein(fein) }

        /**
         * Sets [Builder.fein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fein(fein: JsonField<String>) = apply { body.fein(fein) }

        /** Industry classification. */
        fun industry(industry: Industry) = apply { body.industry(industry) }

        /**
         * Sets [Builder.industry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industry] with a well-typed [Industry] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun industry(industry: JsonField<Industry>) = apply { body.industry(industry) }

        fun jurisdictionOfIncorporation(jurisdictionOfIncorporation: String) = apply {
            body.jurisdictionOfIncorporation(jurisdictionOfIncorporation)
        }

        /**
         * Sets [Builder.jurisdictionOfIncorporation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdictionOfIncorporation] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jurisdictionOfIncorporation(jurisdictionOfIncorporation: JsonField<String>) = apply {
            body.jurisdictionOfIncorporation(jurisdictionOfIncorporation)
        }

        /** Legal name of the enterprise. */
        fun legalName(legalName: String) = apply { body.legalName(legalName) }

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { body.legalName(legalName) }

        /**
         * Approximate headcount range. Used for vetting heuristics; pick the bucket that contains
         * your current employee count.
         */
        fun numberOfEmployees(numberOfEmployees: NumberOfEmployees) = apply {
            body.numberOfEmployees(numberOfEmployees)
        }

        /**
         * Sets [Builder.numberOfEmployees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfEmployees] with a well-typed [NumberOfEmployees]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun numberOfEmployees(numberOfEmployees: JsonField<NumberOfEmployees>) = apply {
            body.numberOfEmployees(numberOfEmployees)
        }

        fun organizationContact(organizationContact: OrganizationContact) = apply {
            body.organizationContact(organizationContact)
        }

        /**
         * Sets [Builder.organizationContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationContact] with a well-typed
         * [OrganizationContact] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun organizationContact(organizationContact: JsonField<OrganizationContact>) = apply {
            body.organizationContact(organizationContact)
        }

        /**
         * Legal-entity form. Pick the form that matches your incorporation documents:
         * - `corporation` — C-corp or S-corp.
         * - `llc` — limited liability company.
         * - `partnership` — general/limited partnership.
         * - `nonprofit` — non-profit corporation, charitable trust, or 501(c)(3)/equivalent.
         * - `other` — anything else (sole proprietorships, government bodies, DBAs, etc.). You may
         *   be asked for additional documents during vetting.
         */
        fun organizationLegalType(organizationLegalType: OrganizationLegalType) = apply {
            body.organizationLegalType(organizationLegalType)
        }

        /**
         * Sets [Builder.organizationLegalType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationLegalType] with a well-typed
         * [OrganizationLegalType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun organizationLegalType(organizationLegalType: JsonField<OrganizationLegalType>) = apply {
            body.organizationLegalType(organizationLegalType)
        }

        fun organizationPhysicalAddress(organizationPhysicalAddress: PhysicalAddress) = apply {
            body.organizationPhysicalAddress(organizationPhysicalAddress)
        }

        /**
         * Sets [Builder.organizationPhysicalAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationPhysicalAddress] with a well-typed
         * [PhysicalAddress] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun organizationPhysicalAddress(organizationPhysicalAddress: JsonField<PhysicalAddress>) =
            apply {
                body.organizationPhysicalAddress(organizationPhysicalAddress)
            }

        /**
         * Organization category for vetting purposes:
         * - `commercial` — for-profit business entities (LLC, corp, partnership, sole
         *   proprietorship). Most callers fall here.
         * - `government` — federal/state/local government bodies.
         * - `non_profit` — registered 501(c)(3)/equivalent (incl. educational institutions,
         *   charities, religious organisations).
         */
        fun organizationType(organizationType: OrganizationType) = apply {
            body.organizationType(organizationType)
        }

        /**
         * Sets [Builder.organizationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationType] with a well-typed [OrganizationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun organizationType(organizationType: JsonField<OrganizationType>) = apply {
            body.organizationType(organizationType)
        }

        fun website(website: String) = apply { body.website(website) }

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { body.website(website) }

        /** Optional corporate-registration / company-number identifier. */
        fun corporateRegistrationNumber(corporateRegistrationNumber: String?) = apply {
            body.corporateRegistrationNumber(corporateRegistrationNumber)
        }

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
            body.corporateRegistrationNumber(corporateRegistrationNumber)
        }

        /**
         * Optional free-form string the caller can attach for their own bookkeeping. Telnyx does
         * not interpret it.
         */
        fun customerReference(customerReference: String) = apply {
            body.customerReference(customerReference)
        }

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            body.customerReference(customerReference)
        }

        /** Optional D-U-N-S Number. */
        fun dunBradstreetNumber(dunBradstreetNumber: String?) = apply {
            body.dunBradstreetNumber(dunBradstreetNumber)
        }

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
            body.dunBradstreetNumber(dunBradstreetNumber)
        }

        /** Optional SIC code for the primary line of business. */
        fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: String?) = apply {
            body.primaryBusinessDomainSicCode(primaryBusinessDomainSicCode)
        }

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
            body.primaryBusinessDomainSicCode(primaryBusinessDomainSicCode)
        }

        /** Optional professional-license number for regulated industries. */
        fun professionalLicenseNumber(professionalLicenseNumber: String?) = apply {
            body.professionalLicenseNumber(professionalLicenseNumber)
        }

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
            body.professionalLicenseNumber(professionalLicenseNumber)
        }

        /**
         * `enterprise` for an organization registering its own DIRs; `bpo` for a Business Process
         * Outsourcer placing calls on behalf of one or more enterprises.
         */
        fun roleType(roleType: RoleType) = apply { body.roleType(roleType) }

        /**
         * Sets [Builder.roleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleType] with a well-typed [RoleType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roleType(roleType: JsonField<RoleType>) = apply { body.roleType(roleType) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EnterpriseCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billingAddress()
         * .billingContact()
         * .countryCode()
         * .doingBusinessAs()
         * .fein()
         * .industry()
         * .jurisdictionOfIncorporation()
         * .legalName()
         * .numberOfEmployees()
         * .organizationContact()
         * .organizationLegalType()
         * .organizationPhysicalAddress()
         * .organizationType()
         * .website()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EnterpriseCreateParams =
            EnterpriseCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingAddress: JsonField<BillingAddress>,
        private val billingContact: JsonField<BillingContact>,
        private val countryCode: JsonField<String>,
        private val doingBusinessAs: JsonField<String>,
        private val fein: JsonField<String>,
        private val industry: JsonField<Industry>,
        private val jurisdictionOfIncorporation: JsonField<String>,
        private val legalName: JsonField<String>,
        private val numberOfEmployees: JsonField<NumberOfEmployees>,
        private val organizationContact: JsonField<OrganizationContact>,
        private val organizationLegalType: JsonField<OrganizationLegalType>,
        private val organizationPhysicalAddress: JsonField<PhysicalAddress>,
        private val organizationType: JsonField<OrganizationType>,
        private val website: JsonField<String>,
        private val corporateRegistrationNumber: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val dunBradstreetNumber: JsonField<String>,
        private val primaryBusinessDomainSicCode: JsonField<String>,
        private val professionalLicenseNumber: JsonField<String>,
        private val roleType: JsonField<RoleType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("billing_contact")
            @ExcludeMissing
            billingContact: JsonField<BillingContact> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("doing_business_as")
            @ExcludeMissing
            doingBusinessAs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fein") @ExcludeMissing fein: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industry")
            @ExcludeMissing
            industry: JsonField<Industry> = JsonMissing.of(),
            @JsonProperty("jurisdiction_of_incorporation")
            @ExcludeMissing
            jurisdictionOfIncorporation: JsonField<String> = JsonMissing.of(),
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
            organizationPhysicalAddress: JsonField<PhysicalAddress> = JsonMissing.of(),
            @JsonProperty("organization_type")
            @ExcludeMissing
            organizationType: JsonField<OrganizationType> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
            @JsonProperty("corporate_registration_number")
            @ExcludeMissing
            corporateRegistrationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dun_bradstreet_number")
            @ExcludeMissing
            dunBradstreetNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_business_domain_sic_code")
            @ExcludeMissing
            primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("professional_license_number")
            @ExcludeMissing
            professionalLicenseNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role_type")
            @ExcludeMissing
            roleType: JsonField<RoleType> = JsonMissing.of(),
        ) : this(
            billingAddress,
            billingContact,
            countryCode,
            doingBusinessAs,
            fein,
            industry,
            jurisdictionOfIncorporation,
            legalName,
            numberOfEmployees,
            organizationContact,
            organizationLegalType,
            organizationPhysicalAddress,
            organizationType,
            website,
            corporateRegistrationNumber,
            customerReference,
            dunBradstreetNumber,
            primaryBusinessDomainSicCode,
            professionalLicenseNumber,
            roleType,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingAddress(): BillingAddress = billingAddress.getRequired("billing_address")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingContact(): BillingContact = billingContact.getRequired("billing_contact")

        /**
         * ISO 3166-1 alpha-2 country code. Currently `US` and `CA` are supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("country_code")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun doingBusinessAs(): String = doingBusinessAs.getRequired("doing_business_as")

        /**
         * US Federal Employer Identification Number (`NN-NNNNNNN`) or Canadian equivalent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fein(): String = fein.getRequired("fein")

        /**
         * Industry classification.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun industry(): Industry = industry.getRequired("industry")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jurisdictionOfIncorporation(): String =
            jurisdictionOfIncorporation.getRequired("jurisdiction_of_incorporation")

        /**
         * Legal name of the enterprise.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalName(): String = legalName.getRequired("legal_name")

        /**
         * Approximate headcount range. Used for vetting heuristics; pick the bucket that contains
         * your current employee count.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numberOfEmployees(): NumberOfEmployees =
            numberOfEmployees.getRequired("number_of_employees")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationContact(): OrganizationContact =
            organizationContact.getRequired("organization_contact")

        /**
         * Legal-entity form. Pick the form that matches your incorporation documents:
         * - `corporation` — C-corp or S-corp.
         * - `llc` — limited liability company.
         * - `partnership` — general/limited partnership.
         * - `nonprofit` — non-profit corporation, charitable trust, or 501(c)(3)/equivalent.
         * - `other` — anything else (sole proprietorships, government bodies, DBAs, etc.). You may
         *   be asked for additional documents during vetting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationLegalType(): OrganizationLegalType =
            organizationLegalType.getRequired("organization_legal_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationPhysicalAddress(): PhysicalAddress =
            organizationPhysicalAddress.getRequired("organization_physical_address")

        /**
         * Organization category for vetting purposes:
         * - `commercial` — for-profit business entities (LLC, corp, partnership, sole
         *   proprietorship). Most callers fall here.
         * - `government` — federal/state/local government bodies.
         * - `non_profit` — registered 501(c)(3)/equivalent (incl. educational institutions,
         *   charities, religious organisations).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationType(): OrganizationType = organizationType.getRequired("organization_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun website(): String = website.getRequired("website")

        /**
         * Optional corporate-registration / company-number identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun corporateRegistrationNumber(): Optional<String> =
            corporateRegistrationNumber.getOptional("corporate_registration_number")

        /**
         * Optional free-form string the caller can attach for their own bookkeeping. Telnyx does
         * not interpret it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Optional D-U-N-S Number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dunBradstreetNumber(): Optional<String> =
            dunBradstreetNumber.getOptional("dun_bradstreet_number")

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
         * `enterprise` for an organization registering its own DIRs; `bpo` for a Business Process
         * Outsourcer placing calls on behalf of one or more enterprises.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun roleType(): Optional<RoleType> = roleType.getOptional("role_type")

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
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

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
        @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<Industry> = industry

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
        fun _organizationPhysicalAddress(): JsonField<PhysicalAddress> = organizationPhysicalAddress

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
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .billingAddress()
             * .billingContact()
             * .countryCode()
             * .doingBusinessAs()
             * .fein()
             * .industry()
             * .jurisdictionOfIncorporation()
             * .legalName()
             * .numberOfEmployees()
             * .organizationContact()
             * .organizationLegalType()
             * .organizationPhysicalAddress()
             * .organizationType()
             * .website()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingAddress: JsonField<BillingAddress>? = null
            private var billingContact: JsonField<BillingContact>? = null
            private var countryCode: JsonField<String>? = null
            private var doingBusinessAs: JsonField<String>? = null
            private var fein: JsonField<String>? = null
            private var industry: JsonField<Industry>? = null
            private var jurisdictionOfIncorporation: JsonField<String>? = null
            private var legalName: JsonField<String>? = null
            private var numberOfEmployees: JsonField<NumberOfEmployees>? = null
            private var organizationContact: JsonField<OrganizationContact>? = null
            private var organizationLegalType: JsonField<OrganizationLegalType>? = null
            private var organizationPhysicalAddress: JsonField<PhysicalAddress>? = null
            private var organizationType: JsonField<OrganizationType>? = null
            private var website: JsonField<String>? = null
            private var corporateRegistrationNumber: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var dunBradstreetNumber: JsonField<String> = JsonMissing.of()
            private var primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of()
            private var professionalLicenseNumber: JsonField<String> = JsonMissing.of()
            private var roleType: JsonField<RoleType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billingAddress = body.billingAddress
                billingContact = body.billingContact
                countryCode = body.countryCode
                doingBusinessAs = body.doingBusinessAs
                fein = body.fein
                industry = body.industry
                jurisdictionOfIncorporation = body.jurisdictionOfIncorporation
                legalName = body.legalName
                numberOfEmployees = body.numberOfEmployees
                organizationContact = body.organizationContact
                organizationLegalType = body.organizationLegalType
                organizationPhysicalAddress = body.organizationPhysicalAddress
                organizationType = body.organizationType
                website = body.website
                corporateRegistrationNumber = body.corporateRegistrationNumber
                customerReference = body.customerReference
                dunBradstreetNumber = body.dunBradstreetNumber
                primaryBusinessDomainSicCode = body.primaryBusinessDomainSicCode
                professionalLicenseNumber = body.professionalLicenseNumber
                roleType = body.roleType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** ISO 3166-1 alpha-2 country code. Currently `US` and `CA` are supported. */
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

            /** US Federal Employer Identification Number (`NN-NNNNNNN`) or Canadian equivalent. */
            fun fein(fein: String) = fein(JsonField.of(fein))

            /**
             * Sets [Builder.fein] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fein] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fein(fein: JsonField<String>) = apply { this.fein = fein }

            /** Industry classification. */
            fun industry(industry: Industry) = industry(JsonField.of(industry))

            /**
             * Sets [Builder.industry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industry] with a well-typed [Industry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun industry(industry: JsonField<Industry>) = apply { this.industry = industry }

            fun jurisdictionOfIncorporation(jurisdictionOfIncorporation: String) =
                jurisdictionOfIncorporation(JsonField.of(jurisdictionOfIncorporation))

            /**
             * Sets [Builder.jurisdictionOfIncorporation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdictionOfIncorporation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun jurisdictionOfIncorporation(jurisdictionOfIncorporation: JsonField<String>) =
                apply {
                    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation
                }

            /** Legal name of the enterprise. */
            fun legalName(legalName: String) = legalName(JsonField.of(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

            /**
             * Approximate headcount range. Used for vetting heuristics; pick the bucket that
             * contains your current employee count.
             */
            fun numberOfEmployees(numberOfEmployees: NumberOfEmployees) =
                numberOfEmployees(JsonField.of(numberOfEmployees))

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

            /**
             * Legal-entity form. Pick the form that matches your incorporation documents:
             * - `corporation` — C-corp or S-corp.
             * - `llc` — limited liability company.
             * - `partnership` — general/limited partnership.
             * - `nonprofit` — non-profit corporation, charitable trust, or 501(c)(3)/equivalent.
             * - `other` — anything else (sole proprietorships, government bodies, DBAs, etc.). You
             *   may be asked for additional documents during vetting.
             */
            fun organizationLegalType(organizationLegalType: OrganizationLegalType) =
                organizationLegalType(JsonField.of(organizationLegalType))

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

            fun organizationPhysicalAddress(organizationPhysicalAddress: PhysicalAddress) =
                organizationPhysicalAddress(JsonField.of(organizationPhysicalAddress))

            /**
             * Sets [Builder.organizationPhysicalAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationPhysicalAddress] with a well-typed
             * [PhysicalAddress] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun organizationPhysicalAddress(
                organizationPhysicalAddress: JsonField<PhysicalAddress>
            ) = apply { this.organizationPhysicalAddress = organizationPhysicalAddress }

            /**
             * Organization category for vetting purposes:
             * - `commercial` — for-profit business entities (LLC, corp, partnership, sole
             *   proprietorship). Most callers fall here.
             * - `government` — federal/state/local government bodies.
             * - `non_profit` — registered 501(c)(3)/equivalent (incl. educational institutions,
             *   charities, religious organisations).
             */
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

            fun website(website: String) = website(JsonField.of(website))

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
             * You should usually call [Builder.corporateRegistrationNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun corporateRegistrationNumber(corporateRegistrationNumber: JsonField<String>) =
                apply {
                    this.corporateRegistrationNumber = corporateRegistrationNumber
                }

            /**
             * Optional free-form string the caller can attach for their own bookkeeping. Telnyx
             * does not interpret it.
             */
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

            /** Optional D-U-N-S Number. */
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
             * You should usually call [Builder.primaryBusinessDomainSicCode] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: JsonField<String>) =
                apply {
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
             * You should usually call [Builder.professionalLicenseNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun professionalLicenseNumber(professionalLicenseNumber: JsonField<String>) = apply {
                this.professionalLicenseNumber = professionalLicenseNumber
            }

            /**
             * `enterprise` for an organization registering its own DIRs; `bpo` for a Business
             * Process Outsourcer placing calls on behalf of one or more enterprises.
             */
            fun roleType(roleType: RoleType) = roleType(JsonField.of(roleType))

            /**
             * Sets [Builder.roleType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleType] with a well-typed [RoleType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleType(roleType: JsonField<RoleType>) = apply { this.roleType = roleType }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingAddress()
             * .billingContact()
             * .countryCode()
             * .doingBusinessAs()
             * .fein()
             * .industry()
             * .jurisdictionOfIncorporation()
             * .legalName()
             * .numberOfEmployees()
             * .organizationContact()
             * .organizationLegalType()
             * .organizationPhysicalAddress()
             * .organizationType()
             * .website()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billingAddress", billingAddress),
                    checkRequired("billingContact", billingContact),
                    checkRequired("countryCode", countryCode),
                    checkRequired("doingBusinessAs", doingBusinessAs),
                    checkRequired("fein", fein),
                    checkRequired("industry", industry),
                    checkRequired("jurisdictionOfIncorporation", jurisdictionOfIncorporation),
                    checkRequired("legalName", legalName),
                    checkRequired("numberOfEmployees", numberOfEmployees),
                    checkRequired("organizationContact", organizationContact),
                    checkRequired("organizationLegalType", organizationLegalType),
                    checkRequired("organizationPhysicalAddress", organizationPhysicalAddress),
                    checkRequired("organizationType", organizationType),
                    checkRequired("website", website),
                    corporateRegistrationNumber,
                    customerReference,
                    dunBradstreetNumber,
                    primaryBusinessDomainSicCode,
                    professionalLicenseNumber,
                    roleType,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billingAddress().validate()
            billingContact().validate()
            countryCode()
            doingBusinessAs()
            fein()
            industry().validate()
            jurisdictionOfIncorporation()
            legalName()
            numberOfEmployees().validate()
            organizationContact().validate()
            organizationLegalType().validate()
            organizationPhysicalAddress().validate()
            organizationType().validate()
            website()
            corporateRegistrationNumber()
            customerReference()
            dunBradstreetNumber()
            primaryBusinessDomainSicCode()
            professionalLicenseNumber()
            roleType().ifPresent { it.validate() }
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
            (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (billingContact.asKnown().getOrNull()?.validity() ?: 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
                (if (fein.asKnown().isPresent) 1 else 0) +
                (industry.asKnown().getOrNull()?.validity() ?: 0) +
                (if (jurisdictionOfIncorporation.asKnown().isPresent) 1 else 0) +
                (if (legalName.asKnown().isPresent) 1 else 0) +
                (numberOfEmployees.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationContact.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationLegalType.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationPhysicalAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (website.asKnown().isPresent) 1 else 0) +
                (if (corporateRegistrationNumber.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (dunBradstreetNumber.asKnown().isPresent) 1 else 0) +
                (if (primaryBusinessDomainSicCode.asKnown().isPresent) 1 else 0) +
                (if (professionalLicenseNumber.asKnown().isPresent) 1 else 0) +
                (roleType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billingAddress == other.billingAddress &&
                billingContact == other.billingContact &&
                countryCode == other.countryCode &&
                doingBusinessAs == other.doingBusinessAs &&
                fein == other.fein &&
                industry == other.industry &&
                jurisdictionOfIncorporation == other.jurisdictionOfIncorporation &&
                legalName == other.legalName &&
                numberOfEmployees == other.numberOfEmployees &&
                organizationContact == other.organizationContact &&
                organizationLegalType == other.organizationLegalType &&
                organizationPhysicalAddress == other.organizationPhysicalAddress &&
                organizationType == other.organizationType &&
                website == other.website &&
                corporateRegistrationNumber == other.corporateRegistrationNumber &&
                customerReference == other.customerReference &&
                dunBradstreetNumber == other.dunBradstreetNumber &&
                primaryBusinessDomainSicCode == other.primaryBusinessDomainSicCode &&
                professionalLicenseNumber == other.professionalLicenseNumber &&
                roleType == other.roleType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingAddress,
                billingContact,
                countryCode,
                doingBusinessAs,
                fein,
                industry,
                jurisdictionOfIncorporation,
                legalName,
                numberOfEmployees,
                organizationContact,
                organizationLegalType,
                organizationPhysicalAddress,
                organizationType,
                website,
                corporateRegistrationNumber,
                customerReference,
                dunBradstreetNumber,
                primaryBusinessDomainSicCode,
                professionalLicenseNumber,
                roleType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billingAddress=$billingAddress, billingContact=$billingContact, countryCode=$countryCode, doingBusinessAs=$doingBusinessAs, fein=$fein, industry=$industry, jurisdictionOfIncorporation=$jurisdictionOfIncorporation, legalName=$legalName, numberOfEmployees=$numberOfEmployees, organizationContact=$organizationContact, organizationLegalType=$organizationLegalType, organizationPhysicalAddress=$organizationPhysicalAddress, organizationType=$organizationType, website=$website, corporateRegistrationNumber=$corporateRegistrationNumber, customerReference=$customerReference, dunBradstreetNumber=$dunBradstreetNumber, primaryBusinessDomainSicCode=$primaryBusinessDomainSicCode, professionalLicenseNumber=$professionalLicenseNumber, roleType=$roleType, additionalProperties=$additionalProperties}"
    }

    /** Industry classification. */
    class Industry @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNTING = of("accounting")

            @JvmField val FINANCE = of("finance")

            @JvmField val BILLING = of("billing")

            @JvmField val COLLECTIONS = of("collections")

            @JvmField val BUSINESS = of("business")

            @JvmField val CHARITY = of("charity")

            @JvmField val NONPROFIT = of("nonprofit")

            @JvmField val COMMUNICATIONS = of("communications")

            @JvmField val TELECOM = of("telecom")

            @JvmField val CUSTOMER_SERVICE = of("customer service")

            @JvmField val SUPPORT = of("support")

            @JvmField val DELIVERY = of("delivery")

            @JvmField val SHIPPING = of("shipping")

            @JvmField val LOGISTICS = of("logistics")

            @JvmField val EDUCATION = of("education")

            @JvmField val FINANCIAL = of("financial")

            @JvmField val BANKING = of("banking")

            @JvmField val GOVERNMENT = of("government")

            @JvmField val PUBLIC = of("public")

            @JvmField val HEALTHCARE = of("healthcare")

            @JvmField val HEALTH = of("health")

            @JvmField val PHARMACY = of("pharmacy")

            @JvmField val MEDICAL = of("medical")

            @JvmField val INSURANCE = of("insurance")

            @JvmField val LEGAL = of("legal")

            @JvmField val LAW = of("law")

            @JvmField val NOTIFICATIONS = of("notifications")

            @JvmField val SCHEDULING = of("scheduling")

            @JvmField val REAL_ESTATE = of("real estate")

            @JvmField val PROPERTY = of("property")

            @JvmField val RETAIL = of("retail")

            @JvmField val ECOMMERCE = of("ecommerce")

            @JvmField val SALES = of("sales")

            @JvmField val MARKETING = of("marketing")

            @JvmField val SOFTWARE = of("software")

            @JvmField val TECHNOLOGY = of("technology")

            @JvmField val TECH = of("tech")

            @JvmField val MEDIA = of("media")

            @JvmField val SURVEYS = of("surveys")

            @JvmField val MARKET_RESEARCH = of("market research")

            @JvmField val TRAVEL = of("travel")

            @JvmField val HOSPITALITY = of("hospitality")

            @JvmField val HOTEL = of("hotel")

            @JvmStatic fun of(value: String) = Industry(JsonField.of(value))
        }

        /** An enum containing [Industry]'s known values. */
        enum class Known {
            ACCOUNTING,
            FINANCE,
            BILLING,
            COLLECTIONS,
            BUSINESS,
            CHARITY,
            NONPROFIT,
            COMMUNICATIONS,
            TELECOM,
            CUSTOMER_SERVICE,
            SUPPORT,
            DELIVERY,
            SHIPPING,
            LOGISTICS,
            EDUCATION,
            FINANCIAL,
            BANKING,
            GOVERNMENT,
            PUBLIC,
            HEALTHCARE,
            HEALTH,
            PHARMACY,
            MEDICAL,
            INSURANCE,
            LEGAL,
            LAW,
            NOTIFICATIONS,
            SCHEDULING,
            REAL_ESTATE,
            PROPERTY,
            RETAIL,
            ECOMMERCE,
            SALES,
            MARKETING,
            SOFTWARE,
            TECHNOLOGY,
            TECH,
            MEDIA,
            SURVEYS,
            MARKET_RESEARCH,
            TRAVEL,
            HOSPITALITY,
            HOTEL,
        }

        /**
         * An enum containing [Industry]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Industry] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNTING,
            FINANCE,
            BILLING,
            COLLECTIONS,
            BUSINESS,
            CHARITY,
            NONPROFIT,
            COMMUNICATIONS,
            TELECOM,
            CUSTOMER_SERVICE,
            SUPPORT,
            DELIVERY,
            SHIPPING,
            LOGISTICS,
            EDUCATION,
            FINANCIAL,
            BANKING,
            GOVERNMENT,
            PUBLIC,
            HEALTHCARE,
            HEALTH,
            PHARMACY,
            MEDICAL,
            INSURANCE,
            LEGAL,
            LAW,
            NOTIFICATIONS,
            SCHEDULING,
            REAL_ESTATE,
            PROPERTY,
            RETAIL,
            ECOMMERCE,
            SALES,
            MARKETING,
            SOFTWARE,
            TECHNOLOGY,
            TECH,
            MEDIA,
            SURVEYS,
            MARKET_RESEARCH,
            TRAVEL,
            HOSPITALITY,
            HOTEL,
            /** An enum member indicating that [Industry] was instantiated with an unknown value. */
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
                ACCOUNTING -> Value.ACCOUNTING
                FINANCE -> Value.FINANCE
                BILLING -> Value.BILLING
                COLLECTIONS -> Value.COLLECTIONS
                BUSINESS -> Value.BUSINESS
                CHARITY -> Value.CHARITY
                NONPROFIT -> Value.NONPROFIT
                COMMUNICATIONS -> Value.COMMUNICATIONS
                TELECOM -> Value.TELECOM
                CUSTOMER_SERVICE -> Value.CUSTOMER_SERVICE
                SUPPORT -> Value.SUPPORT
                DELIVERY -> Value.DELIVERY
                SHIPPING -> Value.SHIPPING
                LOGISTICS -> Value.LOGISTICS
                EDUCATION -> Value.EDUCATION
                FINANCIAL -> Value.FINANCIAL
                BANKING -> Value.BANKING
                GOVERNMENT -> Value.GOVERNMENT
                PUBLIC -> Value.PUBLIC
                HEALTHCARE -> Value.HEALTHCARE
                HEALTH -> Value.HEALTH
                PHARMACY -> Value.PHARMACY
                MEDICAL -> Value.MEDICAL
                INSURANCE -> Value.INSURANCE
                LEGAL -> Value.LEGAL
                LAW -> Value.LAW
                NOTIFICATIONS -> Value.NOTIFICATIONS
                SCHEDULING -> Value.SCHEDULING
                REAL_ESTATE -> Value.REAL_ESTATE
                PROPERTY -> Value.PROPERTY
                RETAIL -> Value.RETAIL
                ECOMMERCE -> Value.ECOMMERCE
                SALES -> Value.SALES
                MARKETING -> Value.MARKETING
                SOFTWARE -> Value.SOFTWARE
                TECHNOLOGY -> Value.TECHNOLOGY
                TECH -> Value.TECH
                MEDIA -> Value.MEDIA
                SURVEYS -> Value.SURVEYS
                MARKET_RESEARCH -> Value.MARKET_RESEARCH
                TRAVEL -> Value.TRAVEL
                HOSPITALITY -> Value.HOSPITALITY
                HOTEL -> Value.HOTEL
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
                ACCOUNTING -> Known.ACCOUNTING
                FINANCE -> Known.FINANCE
                BILLING -> Known.BILLING
                COLLECTIONS -> Known.COLLECTIONS
                BUSINESS -> Known.BUSINESS
                CHARITY -> Known.CHARITY
                NONPROFIT -> Known.NONPROFIT
                COMMUNICATIONS -> Known.COMMUNICATIONS
                TELECOM -> Known.TELECOM
                CUSTOMER_SERVICE -> Known.CUSTOMER_SERVICE
                SUPPORT -> Known.SUPPORT
                DELIVERY -> Known.DELIVERY
                SHIPPING -> Known.SHIPPING
                LOGISTICS -> Known.LOGISTICS
                EDUCATION -> Known.EDUCATION
                FINANCIAL -> Known.FINANCIAL
                BANKING -> Known.BANKING
                GOVERNMENT -> Known.GOVERNMENT
                PUBLIC -> Known.PUBLIC
                HEALTHCARE -> Known.HEALTHCARE
                HEALTH -> Known.HEALTH
                PHARMACY -> Known.PHARMACY
                MEDICAL -> Known.MEDICAL
                INSURANCE -> Known.INSURANCE
                LEGAL -> Known.LEGAL
                LAW -> Known.LAW
                NOTIFICATIONS -> Known.NOTIFICATIONS
                SCHEDULING -> Known.SCHEDULING
                REAL_ESTATE -> Known.REAL_ESTATE
                PROPERTY -> Known.PROPERTY
                RETAIL -> Known.RETAIL
                ECOMMERCE -> Known.ECOMMERCE
                SALES -> Known.SALES
                MARKETING -> Known.MARKETING
                SOFTWARE -> Known.SOFTWARE
                TECHNOLOGY -> Known.TECHNOLOGY
                TECH -> Known.TECH
                MEDIA -> Known.MEDIA
                SURVEYS -> Known.SURVEYS
                MARKET_RESEARCH -> Known.MARKET_RESEARCH
                TRAVEL -> Known.TRAVEL
                HOSPITALITY -> Known.HOSPITALITY
                HOTEL -> Known.HOTEL
                else -> throw TelnyxInvalidDataException("Unknown Industry: $value")
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
        fun validate(): Industry = apply {
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

            return other is Industry && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Approximate headcount range. Used for vetting heuristics; pick the bucket that contains your
     * current employee count.
     */
    class NumberOfEmployees @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NUMBER_OF_EMPLOYEES_1_10 = of("1-10")

            @JvmField val NUMBER_OF_EMPLOYEES_11_50 = of("11-50")

            @JvmField val NUMBER_OF_EMPLOYEES_51_200 = of("51-200")

            @JvmField val NUMBER_OF_EMPLOYEES_201_500 = of("201-500")

            @JvmField val NUMBER_OF_EMPLOYEES_501_2000 = of("501-2000")

            @JvmField val NUMBER_OF_EMPLOYEES_2001_10000 = of("2001-10000")

            @JvmField val NUMBER_OF_EMPLOYEES_10001_PLUS = of("10001+")

            @JvmStatic fun of(value: String) = NumberOfEmployees(JsonField.of(value))
        }

        /** An enum containing [NumberOfEmployees]'s known values. */
        enum class Known {
            NUMBER_OF_EMPLOYEES_1_10,
            NUMBER_OF_EMPLOYEES_11_50,
            NUMBER_OF_EMPLOYEES_51_200,
            NUMBER_OF_EMPLOYEES_201_500,
            NUMBER_OF_EMPLOYEES_501_2000,
            NUMBER_OF_EMPLOYEES_2001_10000,
            NUMBER_OF_EMPLOYEES_10001_PLUS,
        }

        /**
         * An enum containing [NumberOfEmployees]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NumberOfEmployees] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NUMBER_OF_EMPLOYEES_1_10,
            NUMBER_OF_EMPLOYEES_11_50,
            NUMBER_OF_EMPLOYEES_51_200,
            NUMBER_OF_EMPLOYEES_201_500,
            NUMBER_OF_EMPLOYEES_501_2000,
            NUMBER_OF_EMPLOYEES_2001_10000,
            NUMBER_OF_EMPLOYEES_10001_PLUS,
            /**
             * An enum member indicating that [NumberOfEmployees] was instantiated with an unknown
             * value.
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
                NUMBER_OF_EMPLOYEES_1_10 -> Value.NUMBER_OF_EMPLOYEES_1_10
                NUMBER_OF_EMPLOYEES_11_50 -> Value.NUMBER_OF_EMPLOYEES_11_50
                NUMBER_OF_EMPLOYEES_51_200 -> Value.NUMBER_OF_EMPLOYEES_51_200
                NUMBER_OF_EMPLOYEES_201_500 -> Value.NUMBER_OF_EMPLOYEES_201_500
                NUMBER_OF_EMPLOYEES_501_2000 -> Value.NUMBER_OF_EMPLOYEES_501_2000
                NUMBER_OF_EMPLOYEES_2001_10000 -> Value.NUMBER_OF_EMPLOYEES_2001_10000
                NUMBER_OF_EMPLOYEES_10001_PLUS -> Value.NUMBER_OF_EMPLOYEES_10001_PLUS
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
                NUMBER_OF_EMPLOYEES_1_10 -> Known.NUMBER_OF_EMPLOYEES_1_10
                NUMBER_OF_EMPLOYEES_11_50 -> Known.NUMBER_OF_EMPLOYEES_11_50
                NUMBER_OF_EMPLOYEES_51_200 -> Known.NUMBER_OF_EMPLOYEES_51_200
                NUMBER_OF_EMPLOYEES_201_500 -> Known.NUMBER_OF_EMPLOYEES_201_500
                NUMBER_OF_EMPLOYEES_501_2000 -> Known.NUMBER_OF_EMPLOYEES_501_2000
                NUMBER_OF_EMPLOYEES_2001_10000 -> Known.NUMBER_OF_EMPLOYEES_2001_10000
                NUMBER_OF_EMPLOYEES_10001_PLUS -> Known.NUMBER_OF_EMPLOYEES_10001_PLUS
                else -> throw TelnyxInvalidDataException("Unknown NumberOfEmployees: $value")
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
     * Legal-entity form. Pick the form that matches your incorporation documents:
     * - `corporation` — C-corp or S-corp.
     * - `llc` — limited liability company.
     * - `partnership` — general/limited partnership.
     * - `nonprofit` — non-profit corporation, charitable trust, or 501(c)(3)/equivalent.
     * - `other` — anything else (sole proprietorships, government bodies, DBAs, etc.). You may be
     *   asked for additional documents during vetting.
     */
    class OrganizationLegalType
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
         * An instance of [OrganizationLegalType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                else -> throw TelnyxInvalidDataException("Unknown OrganizationLegalType: $value")
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

    /**
     * Organization category for vetting purposes:
     * - `commercial` — for-profit business entities (LLC, corp, partnership, sole proprietorship).
     *   Most callers fall here.
     * - `government` — federal/state/local government bodies.
     * - `non_profit` — registered 501(c)(3)/equivalent (incl. educational institutions, charities,
     *   religious organisations).
     */
    class OrganizationType @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [OrganizationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OrganizationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMERCIAL,
            GOVERNMENT,
            NON_PROFIT,
            /**
             * An enum member indicating that [OrganizationType] was instantiated with an unknown
             * value.
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
                COMMERCIAL -> Value.COMMERCIAL
                GOVERNMENT -> Value.GOVERNMENT
                NON_PROFIT -> Value.NON_PROFIT
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
                COMMERCIAL -> Known.COMMERCIAL
                GOVERNMENT -> Known.GOVERNMENT
                NON_PROFIT -> Known.NON_PROFIT
                else -> throw TelnyxInvalidDataException("Unknown OrganizationType: $value")
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

    /**
     * `enterprise` for an organization registering its own DIRs; `bpo` for a Business Process
     * Outsourcer placing calls on behalf of one or more enterprises.
     */
    class RoleType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENTERPRISE,
            BPO,
            /** An enum member indicating that [RoleType] was instantiated with an unknown value. */
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
                ENTERPRISE -> Value.ENTERPRISE
                BPO -> Value.BPO
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
                ENTERPRISE -> Known.ENTERPRISE
                BPO -> Known.BPO
                else -> throw TelnyxInvalidDataException("Unknown RoleType: $value")
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

        return other is EnterpriseCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EnterpriseCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
