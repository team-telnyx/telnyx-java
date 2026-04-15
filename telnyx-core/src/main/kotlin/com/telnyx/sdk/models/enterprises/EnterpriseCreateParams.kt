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
    fun organizationPhysicalAddress(): PhysicalAddress = body.organizationPhysicalAddress()

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
        fun organizationPhysicalAddress(): PhysicalAddress =
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
