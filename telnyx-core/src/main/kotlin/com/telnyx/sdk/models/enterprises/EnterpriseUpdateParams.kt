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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update enterprise information. All fields are optional — only the provided fields will be
 * updated.
 */
class EnterpriseUpdateParams
private constructor(
    private val enterpriseId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingAddress(): Optional<BillingAddress> = body.billingAddress()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingContact(): Optional<BillingContact> = body.billingContact()

    /**
     * Corporate registration number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporateRegistrationNumber(): Optional<String> = body.corporateRegistrationNumber()

    /**
     * Customer reference identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * DBA name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doingBusinessAs(): Optional<String> = body.doingBusinessAs()

    /**
     * D-U-N-S Number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dunBradstreetNumber(): Optional<String> = body.dunBradstreetNumber()

    /**
     * Federal Employer Identification Number. Format: XX-XXXXXXX or XXXXXXXXX
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fein(): Optional<String> = body.fein()

    /**
     * Industry classification
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun industry(): Optional<String> = body.industry()

    /**
     * Legal name of the enterprise
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalName(): Optional<String> = body.legalName()

    /**
     * Employee count range
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberOfEmployees(): Optional<NumberOfEmployees> = body.numberOfEmployees()

    /**
     * Organization contact information. Note: the response returns this object with the phone field
     * as 'phone' (not 'phone_number').
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationContact(): Optional<OrganizationContact> = body.organizationContact()

    /**
     * Legal structure type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationLegalType(): Optional<OrganizationLegalType> = body.organizationLegalType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationPhysicalAddress(): Optional<PhysicalAddress> =
        body.organizationPhysicalAddress()

    /**
     * SIC Code
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryBusinessDomainSicCode(): Optional<String> = body.primaryBusinessDomainSicCode()

    /**
     * Professional license number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun professionalLicenseNumber(): Optional<String> = body.professionalLicenseNumber()

    /**
     * Company website URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = body.website()

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
     * Returns the raw JSON value of [doingBusinessAs].
     *
     * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _doingBusinessAs(): JsonField<String> = body._doingBusinessAs()

    /**
     * Returns the raw JSON value of [dunBradstreetNumber].
     *
     * Unlike [dunBradstreetNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dunBradstreetNumber(): JsonField<String> = body._dunBradstreetNumber()

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
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _website(): JsonField<String> = body._website()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EnterpriseUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EnterpriseUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnterpriseUpdateParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(enterpriseUpdateParams: EnterpriseUpdateParams) = apply {
            enterpriseId = enterpriseUpdateParams.enterpriseId
            body = enterpriseUpdateParams.body.toBuilder()
            additionalHeaders = enterpriseUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = enterpriseUpdateParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billingAddress]
         * - [billingContact]
         * - [corporateRegistrationNumber]
         * - [customerReference]
         * - [doingBusinessAs]
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

        /** Corporate registration number */
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

        /** Customer reference identifier */
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

        /** DBA name */
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

        /** D-U-N-S Number */
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

        /** Federal Employer Identification Number. Format: XX-XXXXXXX or XXXXXXXXX */
        fun fein(fein: String) = apply { body.fein(fein) }

        /**
         * Sets [Builder.fein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fein(fein: JsonField<String>) = apply { body.fein(fein) }

        /** Industry classification */
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

        /** SIC Code */
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

        /** Professional license number */
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

        /** Company website URL */
        fun website(website: String) = apply { body.website(website) }

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { body.website(website) }

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
         * Returns an immutable instance of [EnterpriseUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnterpriseUpdateParams =
            EnterpriseUpdateParams(
                enterpriseId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** All fields are optional. Only provided fields will be updated. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingAddress: JsonField<BillingAddress>,
        private val billingContact: JsonField<BillingContact>,
        private val corporateRegistrationNumber: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val doingBusinessAs: JsonField<String>,
        private val dunBradstreetNumber: JsonField<String>,
        private val fein: JsonField<String>,
        private val industry: JsonField<String>,
        private val legalName: JsonField<String>,
        private val numberOfEmployees: JsonField<NumberOfEmployees>,
        private val organizationContact: JsonField<OrganizationContact>,
        private val organizationLegalType: JsonField<OrganizationLegalType>,
        private val organizationPhysicalAddress: JsonField<PhysicalAddress>,
        private val primaryBusinessDomainSicCode: JsonField<String>,
        private val professionalLicenseNumber: JsonField<String>,
        private val website: JsonField<String>,
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
            @JsonProperty("corporate_registration_number")
            @ExcludeMissing
            corporateRegistrationNumber: JsonField<String> = JsonMissing.of(),
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
            organizationPhysicalAddress: JsonField<PhysicalAddress> = JsonMissing.of(),
            @JsonProperty("primary_business_domain_sic_code")
            @ExcludeMissing
            primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("professional_license_number")
            @ExcludeMissing
            professionalLicenseNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            billingAddress,
            billingContact,
            corporateRegistrationNumber,
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
            primaryBusinessDomainSicCode,
            professionalLicenseNumber,
            website,
            mutableMapOf(),
        )

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
         * Federal Employer Identification Number. Format: XX-XXXXXXX or XXXXXXXXX
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
        fun organizationPhysicalAddress(): Optional<PhysicalAddress> =
            organizationPhysicalAddress.getOptional("organization_physical_address")

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
         * Company website URL
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun website(): Optional<String> = website.getOptional("website")

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
        fun _organizationPhysicalAddress(): JsonField<PhysicalAddress> = organizationPhysicalAddress

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var billingContact: JsonField<BillingContact> = JsonMissing.of()
            private var corporateRegistrationNumber: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var doingBusinessAs: JsonField<String> = JsonMissing.of()
            private var dunBradstreetNumber: JsonField<String> = JsonMissing.of()
            private var fein: JsonField<String> = JsonMissing.of()
            private var industry: JsonField<String> = JsonMissing.of()
            private var legalName: JsonField<String> = JsonMissing.of()
            private var numberOfEmployees: JsonField<NumberOfEmployees> = JsonMissing.of()
            private var organizationContact: JsonField<OrganizationContact> = JsonMissing.of()
            private var organizationLegalType: JsonField<OrganizationLegalType> = JsonMissing.of()
            private var organizationPhysicalAddress: JsonField<PhysicalAddress> = JsonMissing.of()
            private var primaryBusinessDomainSicCode: JsonField<String> = JsonMissing.of()
            private var professionalLicenseNumber: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billingAddress = body.billingAddress
                billingContact = body.billingContact
                corporateRegistrationNumber = body.corporateRegistrationNumber
                customerReference = body.customerReference
                doingBusinessAs = body.doingBusinessAs
                dunBradstreetNumber = body.dunBradstreetNumber
                fein = body.fein
                industry = body.industry
                legalName = body.legalName
                numberOfEmployees = body.numberOfEmployees
                organizationContact = body.organizationContact
                organizationLegalType = body.organizationLegalType
                organizationPhysicalAddress = body.organizationPhysicalAddress
                primaryBusinessDomainSicCode = body.primaryBusinessDomainSicCode
                professionalLicenseNumber = body.professionalLicenseNumber
                website = body.website
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

            /** Corporate registration number */
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

            /** Customer reference identifier */
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

            /** Federal Employer Identification Number. Format: XX-XXXXXXX or XXXXXXXXX */
            fun fein(fein: String) = fein(JsonField.of(fein))

            /**
             * Sets [Builder.fein] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fein] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fein(fein: JsonField<String>) = apply { this.fein = fein }

            /** Industry classification */
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

            /** SIC Code */
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

            /** Professional license number */
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

            /** Company website URL */
            fun website(website: String) = website(JsonField.of(website))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    billingAddress,
                    billingContact,
                    corporateRegistrationNumber,
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
                    primaryBusinessDomainSicCode,
                    professionalLicenseNumber,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billingAddress().ifPresent { it.validate() }
            billingContact().ifPresent { it.validate() }
            corporateRegistrationNumber()
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
            primaryBusinessDomainSicCode()
            professionalLicenseNumber()
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
            (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (billingContact.asKnown().getOrNull()?.validity() ?: 0) +
                (if (corporateRegistrationNumber.asKnown().isPresent) 1 else 0) +
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
                (if (primaryBusinessDomainSicCode.asKnown().isPresent) 1 else 0) +
                (if (professionalLicenseNumber.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billingAddress == other.billingAddress &&
                billingContact == other.billingContact &&
                corporateRegistrationNumber == other.corporateRegistrationNumber &&
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
                primaryBusinessDomainSicCode == other.primaryBusinessDomainSicCode &&
                professionalLicenseNumber == other.professionalLicenseNumber &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingAddress,
                billingContact,
                corporateRegistrationNumber,
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
                primaryBusinessDomainSicCode,
                professionalLicenseNumber,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billingAddress=$billingAddress, billingContact=$billingContact, corporateRegistrationNumber=$corporateRegistrationNumber, customerReference=$customerReference, doingBusinessAs=$doingBusinessAs, dunBradstreetNumber=$dunBradstreetNumber, fein=$fein, industry=$industry, legalName=$legalName, numberOfEmployees=$numberOfEmployees, organizationContact=$organizationContact, organizationLegalType=$organizationLegalType, organizationPhysicalAddress=$organizationPhysicalAddress, primaryBusinessDomainSicCode=$primaryBusinessDomainSicCode, professionalLicenseNumber=$professionalLicenseNumber, website=$website, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnterpriseUpdateParams &&
            enterpriseId == other.enterpriseId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EnterpriseUpdateParams{enterpriseId=$enterpriseId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
