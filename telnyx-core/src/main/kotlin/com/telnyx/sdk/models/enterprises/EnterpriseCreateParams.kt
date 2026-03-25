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
 * Create a new enterprise for Branded Calling / Number Reputation services.
 *
 * Registers the enterprise in the Branded Calling / Number Reputation services, enabling it to
 * create Display Identity Records (DIRs) or enroll in Number Reputation monitoring.
 *
 * **Required Fields:** `legal_name`, `doing_business_as`, `organization_type`, `country_code`,
 * `website`, `fein`, `industry`, `number_of_employees`, `organization_legal_type`,
 * `organization_contact`, `billing_contact`, `organization_physical_address`, `billing_address`
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
     * Country code. Currently only 'US' is accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = body.countryCode()

    /**
     * Primary business name / DBA name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun doingBusinessAs(): String = body.doingBusinessAs()

    /**
     * Federal Employer Identification Number. Format: XX-XXXXXXX or 9-digit number (minimum 9
     * digits).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fein(): String = body.fein()

    /**
     * Industry classification. Case-insensitive. Accepted values: accounting, finance, billing,
     * collections, business, charity, nonprofit, communications, telecom, customer service,
     * support, delivery, shipping, logistics, education, financial, banking, government, public,
     * healthcare, health, pharmacy, medical, insurance, legal, law, notifications, scheduling, real
     * estate, property, retail, ecommerce, sales, marketing, software, technology, tech, media,
     * surveys, market research, travel, hospitality, hotel
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun industry(): String = body.industry()

    /**
     * Legal name of the enterprise
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = body.legalName()

    /**
     * Employee count range
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberOfEmployees(): NumberOfEmployees = body.numberOfEmployees()

    /**
     * Organization contact information. Note: the response returns this object with the phone field
     * as 'phone' (not 'phone_number').
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationContact(): OrganizationContact = body.organizationContact()

    /**
     * Legal structure type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationLegalType(): OrganizationLegalType = body.organizationLegalType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationPhysicalAddress(): OrganizationPhysicalAddress =
        body.organizationPhysicalAddress()

    /**
     * Type of organization
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationType(): OrganizationType = body.organizationType()

    /**
     * Enterprise website URL. Accepts any string — no URL format validation enforced.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun website(): String = body.website()

    /**
     * Corporate registration number (optional)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporateRegistrationNumber(): Optional<String> = body.corporateRegistrationNumber()

    /**
     * Optional customer reference identifier for your own tracking
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * D-U-N-S Number (optional)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dunBradstreetNumber(): Optional<String> = body.dunBradstreetNumber()

    /**
     * SIC Code (optional)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryBusinessDomainSicCode(): Optional<String> = body.primaryBusinessDomainSicCode()

    /**
     * Professional license number (optional)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun professionalLicenseNumber(): Optional<String> = body.professionalLicenseNumber()

    /**
     * Role type in Branded Calling / Number Reputation services
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
    fun _industry(): JsonField<String> = body._industry()

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
    fun _organizationPhysicalAddress(): JsonField<OrganizationPhysicalAddress> =
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

        /** Country code. Currently only 'US' is accepted. */
        fun countryCode(countryCode: String) = apply { body.countryCode(countryCode) }

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { body.countryCode(countryCode) }

        /** Primary business name / DBA name */
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

        /**
         * Federal Employer Identification Number. Format: XX-XXXXXXX or 9-digit number (minimum 9
         * digits).
         */
        fun fein(fein: String) = apply { body.fein(fein) }

        /**
         * Sets [Builder.fein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fein(fein: JsonField<String>) = apply { body.fein(fein) }

        /**
         * Industry classification. Case-insensitive. Accepted values: accounting, finance, billing,
         * collections, business, charity, nonprofit, communications, telecom, customer service,
         * support, delivery, shipping, logistics, education, financial, banking, government,
         * public, healthcare, health, pharmacy, medical, insurance, legal, law, notifications,
         * scheduling, real estate, property, retail, ecommerce, sales, marketing, software,
         * technology, tech, media, surveys, market research, travel, hospitality, hotel
         */
        fun industry(industry: String) = apply { body.industry(industry) }

        /**
         * Sets [Builder.industry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industry] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun industry(industry: JsonField<String>) = apply { body.industry(industry) }

        /** Legal name of the enterprise */
        fun legalName(legalName: String) = apply { body.legalName(legalName) }

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { body.legalName(legalName) }

        /** Employee count range */
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

        /**
         * Organization contact information. Note: the response returns this object with the phone
         * field as 'phone' (not 'phone_number').
         */
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

        /** Legal structure type */
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

        fun organizationPhysicalAddress(organizationPhysicalAddress: OrganizationPhysicalAddress) =
            apply {
                body.organizationPhysicalAddress(organizationPhysicalAddress)
            }

        /**
         * Sets [Builder.organizationPhysicalAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationPhysicalAddress] with a well-typed
         * [OrganizationPhysicalAddress] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun organizationPhysicalAddress(
            organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress>
        ) = apply { body.organizationPhysicalAddress(organizationPhysicalAddress) }

        /** Type of organization */
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

        /** Enterprise website URL. Accepts any string — no URL format validation enforced. */
        fun website(website: String) = apply { body.website(website) }

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { body.website(website) }

        /** Corporate registration number (optional) */
        fun corporateRegistrationNumber(corporateRegistrationNumber: String) = apply {
            body.corporateRegistrationNumber(corporateRegistrationNumber)
        }

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

        /** Optional customer reference identifier for your own tracking */
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

        /** D-U-N-S Number (optional) */
        fun dunBradstreetNumber(dunBradstreetNumber: String) = apply {
            body.dunBradstreetNumber(dunBradstreetNumber)
        }

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

        /** SIC Code (optional) */
        fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: String) = apply {
            body.primaryBusinessDomainSicCode(primaryBusinessDomainSicCode)
        }

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

        /** Professional license number (optional) */
        fun professionalLicenseNumber(professionalLicenseNumber: String) = apply {
            body.professionalLicenseNumber(professionalLicenseNumber)
        }

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

        /** Role type in Branded Calling / Number Reputation services */
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
        private val industry: JsonField<String>,
        private val legalName: JsonField<String>,
        private val numberOfEmployees: JsonField<NumberOfEmployees>,
        private val organizationContact: JsonField<OrganizationContact>,
        private val organizationLegalType: JsonField<OrganizationLegalType>,
        private val organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress>,
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
         * Country code. Currently only 'US' is accepted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("country_code")

        /**
         * Primary business name / DBA name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun doingBusinessAs(): String = doingBusinessAs.getRequired("doing_business_as")

        /**
         * Federal Employer Identification Number. Format: XX-XXXXXXX or 9-digit number (minimum 9
         * digits).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fein(): String = fein.getRequired("fein")

        /**
         * Industry classification. Case-insensitive. Accepted values: accounting, finance, billing,
         * collections, business, charity, nonprofit, communications, telecom, customer service,
         * support, delivery, shipping, logistics, education, financial, banking, government,
         * public, healthcare, health, pharmacy, medical, insurance, legal, law, notifications,
         * scheduling, real estate, property, retail, ecommerce, sales, marketing, software,
         * technology, tech, media, surveys, market research, travel, hospitality, hotel
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun industry(): String = industry.getRequired("industry")

        /**
         * Legal name of the enterprise
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalName(): String = legalName.getRequired("legal_name")

        /**
         * Employee count range
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numberOfEmployees(): NumberOfEmployees =
            numberOfEmployees.getRequired("number_of_employees")

        /**
         * Organization contact information. Note: the response returns this object with the phone
         * field as 'phone' (not 'phone_number').
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationContact(): OrganizationContact =
            organizationContact.getRequired("organization_contact")

        /**
         * Legal structure type
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
        fun organizationPhysicalAddress(): OrganizationPhysicalAddress =
            organizationPhysicalAddress.getRequired("organization_physical_address")

        /**
         * Type of organization
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationType(): OrganizationType = organizationType.getRequired("organization_type")

        /**
         * Enterprise website URL. Accepts any string — no URL format validation enforced.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun website(): String = website.getRequired("website")

        /**
         * Corporate registration number (optional)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun corporateRegistrationNumber(): Optional<String> =
            corporateRegistrationNumber.getOptional("corporate_registration_number")

        /**
         * Optional customer reference identifier for your own tracking
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * D-U-N-S Number (optional)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dunBradstreetNumber(): Optional<String> =
            dunBradstreetNumber.getOptional("dun_bradstreet_number")

        /**
         * SIC Code (optional)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryBusinessDomainSicCode(): Optional<String> =
            primaryBusinessDomainSicCode.getOptional("primary_business_domain_sic_code")

        /**
         * Professional license number (optional)
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
            private var industry: JsonField<String>? = null
            private var legalName: JsonField<String>? = null
            private var numberOfEmployees: JsonField<NumberOfEmployees>? = null
            private var organizationContact: JsonField<OrganizationContact>? = null
            private var organizationLegalType: JsonField<OrganizationLegalType>? = null
            private var organizationPhysicalAddress: JsonField<OrganizationPhysicalAddress>? = null
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

            /** Country code. Currently only 'US' is accepted. */
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

            /** Primary business name / DBA name */
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

            /**
             * Federal Employer Identification Number. Format: XX-XXXXXXX or 9-digit number (minimum
             * 9 digits).
             */
            fun fein(fein: String) = fein(JsonField.of(fein))

            /**
             * Sets [Builder.fein] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fein] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fein(fein: JsonField<String>) = apply { this.fein = fein }

            /**
             * Industry classification. Case-insensitive. Accepted values: accounting, finance,
             * billing, collections, business, charity, nonprofit, communications, telecom, customer
             * service, support, delivery, shipping, logistics, education, financial, banking,
             * government, public, healthcare, health, pharmacy, medical, insurance, legal, law,
             * notifications, scheduling, real estate, property, retail, ecommerce, sales,
             * marketing, software, technology, tech, media, surveys, market research, travel,
             * hospitality, hotel
             */
            fun industry(industry: String) = industry(JsonField.of(industry))

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

            /** Enterprise website URL. Accepts any string — no URL format validation enforced. */
            fun website(website: String) = website(JsonField.of(website))

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

            /** Corporate registration number (optional) */
            fun corporateRegistrationNumber(corporateRegistrationNumber: String) =
                corporateRegistrationNumber(JsonField.of(corporateRegistrationNumber))

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

            /** Optional customer reference identifier for your own tracking */
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

            /** D-U-N-S Number (optional) */
            fun dunBradstreetNumber(dunBradstreetNumber: String) =
                dunBradstreetNumber(JsonField.of(dunBradstreetNumber))

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

            /** SIC Code (optional) */
            fun primaryBusinessDomainSicCode(primaryBusinessDomainSicCode: String) =
                primaryBusinessDomainSicCode(JsonField.of(primaryBusinessDomainSicCode))

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

            /** Professional license number (optional) */
            fun professionalLicenseNumber(professionalLicenseNumber: String) =
                professionalLicenseNumber(JsonField.of(professionalLicenseNumber))

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

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billingAddress().validate()
            billingContact().validate()
            countryCode()
            doingBusinessAs()
            fein()
            industry()
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
                (if (industry.asKnown().isPresent) 1 else 0) +
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
            "Body{billingAddress=$billingAddress, billingContact=$billingContact, countryCode=$countryCode, doingBusinessAs=$doingBusinessAs, fein=$fein, industry=$industry, legalName=$legalName, numberOfEmployees=$numberOfEmployees, organizationContact=$organizationContact, organizationLegalType=$organizationLegalType, organizationPhysicalAddress=$organizationPhysicalAddress, organizationType=$organizationType, website=$website, corporateRegistrationNumber=$corporateRegistrationNumber, customerReference=$customerReference, dunBradstreetNumber=$dunBradstreetNumber, primaryBusinessDomainSicCode=$primaryBusinessDomainSicCode, professionalLicenseNumber=$professionalLicenseNumber, roleType=$roleType, additionalProperties=$additionalProperties}"
    }

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
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

        /**
         * City name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * Country name (e.g., United States)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * ZIP or postal code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Street address
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun streetAddress(): String = streetAddress.getRequired("street_address")

        /**
         * Additional address line (suite, apt, etc.)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

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
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * You should usually call [Builder.administrativeArea] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                this.administrativeArea = administrativeArea
            }

            /** City name */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Country name (e.g., United States) */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** ZIP or postal code */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Street address */
            fun streetAddress(streetAddress: String) = streetAddress(JsonField.of(streetAddress))

            /**
             * Sets [Builder.streetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streetAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streetAddress(streetAddress: JsonField<String>) = apply {
                this.streetAddress = streetAddress
            }

            /** Additional address line (suite, apt, etc.) */
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Contact's first name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * Contact's last name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

        /**
         * Contact's phone number (10-15 digits)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Contact's last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Contact's phone number (10-15 digits) */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * An enum containing [NumberOfEmployees]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NumberOfEmployees] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
     * Organization contact information. Note: the response returns this object with the phone field
     * as 'phone' (not 'phone_number').
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Contact's first name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * Contact's job title (required)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jobTitle(): String = jobTitle.getRequired("job_title")

        /**
         * Contact's last name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

        /**
         * Contact's phone number in E.164 format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [jobTitle].
         *
         * Unlike [jobTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job_title") @ExcludeMissing fun _jobTitle(): JsonField<String> = jobTitle

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Contact's job title (required) */
            fun jobTitle(jobTitle: String) = jobTitle(JsonField.of(jobTitle))

            /**
             * Sets [Builder.jobTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobTitle] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobTitle(jobTitle: JsonField<String>) = apply { this.jobTitle = jobTitle }

            /** Contact's last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

        /**
         * City name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * Country name (e.g., United States)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * ZIP or postal code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Street address
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun streetAddress(): String = streetAddress.getRequired("street_address")

        /**
         * Additional address line (suite, apt, etc.)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

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
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
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
            internal fun from(organizationPhysicalAddress: OrganizationPhysicalAddress) = apply {
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
             * You should usually call [Builder.administrativeArea] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                this.administrativeArea = administrativeArea
            }

            /** City name */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Country name (e.g., United States) */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** ZIP or postal code */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Street address */
            fun streetAddress(streetAddress: String) = streetAddress(JsonField.of(streetAddress))

            /**
             * Sets [Builder.streetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streetAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streetAddress(streetAddress: JsonField<String>) = apply {
                this.streetAddress = streetAddress
            }

            /** Additional address line (suite, apt, etc.) */
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
