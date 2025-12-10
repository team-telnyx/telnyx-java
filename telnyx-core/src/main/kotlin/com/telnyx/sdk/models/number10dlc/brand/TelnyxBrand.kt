// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Telnyx-specific extensions to The Campaign Registry's `Brand` type */
class TelnyxBrand
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandRelationship: JsonField<BrandRelationship>,
    private val country: JsonField<String>,
    private val displayName: JsonField<String>,
    private val email: JsonField<String>,
    private val entityType: JsonField<EntityType>,
    private val vertical: JsonField<String>,
    private val altBusinessId: JsonField<String>,
    private val altBusinessIdType: JsonField<AltBusinessIdType>,
    private val brandId: JsonField<String>,
    private val businessContactEmail: JsonField<String>,
    private val city: JsonField<String>,
    private val companyName: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val cspId: JsonField<String>,
    private val ein: JsonField<String>,
    private val failureReasons: JsonField<String>,
    private val firstName: JsonField<String>,
    private val identityStatus: JsonField<BrandIdentityStatus>,
    private val ipAddress: JsonField<String>,
    private val isReseller: JsonField<Boolean>,
    private val lastName: JsonField<String>,
    private val mobilePhone: JsonField<String>,
    private val mock: JsonField<Boolean>,
    private val optionalAttributes: JsonField<OptionalAttributes>,
    private val phone: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val referenceId: JsonField<String>,
    private val state: JsonField<String>,
    private val status: JsonField<Status>,
    private val stockExchange: JsonField<StockExchange>,
    private val stockSymbol: JsonField<String>,
    private val street: JsonField<String>,
    private val tcrBrandId: JsonField<String>,
    private val universalEin: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val webhookFailoverUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val website: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brandRelationship")
        @ExcludeMissing
        brandRelationship: JsonField<BrandRelationship> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<EntityType> = JsonMissing.of(),
        @JsonProperty("vertical") @ExcludeMissing vertical: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altBusinessId")
        @ExcludeMissing
        altBusinessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altBusinessIdType")
        @ExcludeMissing
        altBusinessIdType: JsonField<AltBusinessIdType> = JsonMissing.of(),
        @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessContactEmail")
        @ExcludeMissing
        businessContactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyName")
        @ExcludeMissing
        companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cspId") @ExcludeMissing cspId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ein") @ExcludeMissing ein: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failureReasons")
        @ExcludeMissing
        failureReasons: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identityStatus")
        @ExcludeMissing
        identityStatus: JsonField<BrandIdentityStatus> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isReseller")
        @ExcludeMissing
        isReseller: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mobilePhone")
        @ExcludeMissing
        mobilePhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mock") @ExcludeMissing mock: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("optionalAttributes")
        @ExcludeMissing
        optionalAttributes: JsonField<OptionalAttributes> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postalCode")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceId")
        @ExcludeMissing
        referenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("stockExchange")
        @ExcludeMissing
        stockExchange: JsonField<StockExchange> = JsonMissing.of(),
        @JsonProperty("stockSymbol")
        @ExcludeMissing
        stockSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tcrBrandId")
        @ExcludeMissing
        tcrBrandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("universalEin")
        @ExcludeMissing
        universalEin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhookFailoverURL")
        @ExcludeMissing
        webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhookURL")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
    ) : this(
        brandRelationship,
        country,
        displayName,
        email,
        entityType,
        vertical,
        altBusinessId,
        altBusinessIdType,
        brandId,
        businessContactEmail,
        city,
        companyName,
        createdAt,
        cspId,
        ein,
        failureReasons,
        firstName,
        identityStatus,
        ipAddress,
        isReseller,
        lastName,
        mobilePhone,
        mock,
        optionalAttributes,
        phone,
        postalCode,
        referenceId,
        state,
        status,
        stockExchange,
        stockSymbol,
        street,
        tcrBrandId,
        universalEin,
        updatedAt,
        webhookFailoverUrl,
        webhookUrl,
        website,
        mutableMapOf(),
    )

    /**
     * Brand relationship to the CSP.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandRelationship(): BrandRelationship = brandRelationship.getRequired("brandRelationship")

    /**
     * ISO2 2 characters country code. Example: US - United States
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Display or marketing name of the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("displayName")

    /**
     * Valid email address of brand support contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * Entity type behind the brand. This is the form of business establishment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): EntityType = entityType.getRequired("entityType")

    /**
     * Vertical or industry segment of the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vertical(): String = vertical.getRequired("vertical")

    /**
     * Alternate business identifier such as DUNS, LEI, or GIIN
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun altBusinessId(): Optional<String> = altBusinessId.getOptional("altBusinessId")

    /**
     * An enumeration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun altBusinessIdType(): Optional<AltBusinessIdType> =
        altBusinessIdType.getOptional("altBusinessIdType")

    /**
     * Unique identifier assigned to the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = brandId.getOptional("brandId")

    /**
     * Business contact email.
     *
     * Required if `entityType` is `PUBLIC_PROFIT`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessContactEmail(): Optional<String> =
        businessContactEmail.getOptional("businessContactEmail")

    /**
     * City name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * (Required for Non-profit/private/public) Legal company name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = companyName.getOptional("companyName")

    /**
     * Date and time that the brand was created at.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

    /**
     * Unique identifier assigned to the csp by the registry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cspId(): Optional<String> = cspId.getOptional("cspId")

    /**
     * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ein(): Optional<String> = ein.getOptional("ein")

    /**
     * Failure reasons for brand
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReasons(): Optional<String> = failureReasons.getOptional("failureReasons")

    /**
     * First name of business contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The verification status of an active brand
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun identityStatus(): Optional<BrandIdentityStatus> =
        identityStatus.getOptional("identityStatus")

    /**
     * IP address of the browser requesting to create brand identity.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ipAddress")

    /**
     * Indicates whether this brand is known to be a reseller
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isReseller(): Optional<Boolean> = isReseller.getOptional("isReseller")

    /**
     * Last name of business contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * Valid mobile phone number in e.164 international format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mobilePhone(): Optional<String> = mobilePhone.getOptional("mobilePhone")

    /**
     * Mock brand for testing purposes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mock(): Optional<Boolean> = mock.getOptional("mock")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optionalAttributes(): Optional<OptionalAttributes> =
        optionalAttributes.getOptional("optionalAttributes")

    /**
     * Valid phone number in e.164 international format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phone(): Optional<String> = phone.getOptional("phone")

    /**
     * Postal codes. Use 5 digit zipcode for United States
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

    /**
     * Unique identifier Telnyx assigned to the brand - the brandId
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceId(): Optional<String> = referenceId.getOptional("referenceId")

    /**
     * State. Must be 2 letters code for United States.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Status of the brand
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * (Required for public company) stock exchange.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockExchange(): Optional<StockExchange> = stockExchange.getOptional("stockExchange")

    /**
     * (Required for public company) stock symbol.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockSymbol(): Optional<String> = stockSymbol.getOptional("stockSymbol")

    /**
     * Street number and name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun street(): Optional<String> = street.getOptional("street")

    /**
     * Unique identifier assigned to the brand by the registry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrBrandId(): Optional<String> = tcrBrandId.getOptional("tcrBrandId")

    /**
     * Universal EIN of Brand, Read Only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun universalEin(): Optional<String> = universalEin.getOptional("universalEin")

    /**
     * Date and time that the brand was last updated at.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updatedAt")

    /**
     * Failover webhook to which brand status updates are sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> =
        webhookFailoverUrl.getOptional("webhookFailoverURL")

    /**
     * Webhook to which brand status updates are sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookURL")

    /**
     * Brand website URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = website.getOptional("website")

    /**
     * Returns the raw JSON value of [brandRelationship].
     *
     * Unlike [brandRelationship], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("brandRelationship")
    @ExcludeMissing
    fun _brandRelationship(): JsonField<BrandRelationship> = brandRelationship

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /**
     * Returns the raw JSON value of [vertical].
     *
     * Unlike [vertical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vertical") @ExcludeMissing fun _vertical(): JsonField<String> = vertical

    /**
     * Returns the raw JSON value of [altBusinessId].
     *
     * Unlike [altBusinessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altBusinessId")
    @ExcludeMissing
    fun _altBusinessId(): JsonField<String> = altBusinessId

    /**
     * Returns the raw JSON value of [altBusinessIdType].
     *
     * Unlike [altBusinessIdType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("altBusinessIdType")
    @ExcludeMissing
    fun _altBusinessIdType(): JsonField<AltBusinessIdType> = altBusinessIdType

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [businessContactEmail].
     *
     * Unlike [businessContactEmail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("businessContactEmail")
    @ExcludeMissing
    fun _businessContactEmail(): JsonField<String> = businessContactEmail

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyName") @ExcludeMissing fun _companyName(): JsonField<String> = companyName

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [cspId].
     *
     * Unlike [cspId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cspId") @ExcludeMissing fun _cspId(): JsonField<String> = cspId

    /**
     * Returns the raw JSON value of [ein].
     *
     * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

    /**
     * Returns the raw JSON value of [failureReasons].
     *
     * Unlike [failureReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReasons")
    @ExcludeMissing
    fun _failureReasons(): JsonField<String> = failureReasons

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [identityStatus].
     *
     * Unlike [identityStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identityStatus")
    @ExcludeMissing
    fun _identityStatus(): JsonField<BrandIdentityStatus> = identityStatus

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [isReseller].
     *
     * Unlike [isReseller], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isReseller") @ExcludeMissing fun _isReseller(): JsonField<Boolean> = isReseller

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [mobilePhone].
     *
     * Unlike [mobilePhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mobilePhone") @ExcludeMissing fun _mobilePhone(): JsonField<String> = mobilePhone

    /**
     * Returns the raw JSON value of [mock].
     *
     * Unlike [mock], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mock") @ExcludeMissing fun _mock(): JsonField<Boolean> = mock

    /**
     * Returns the raw JSON value of [optionalAttributes].
     *
     * Unlike [optionalAttributes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionalAttributes")
    @ExcludeMissing
    fun _optionalAttributes(): JsonField<OptionalAttributes> = optionalAttributes

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postalCode") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [referenceId].
     *
     * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceId") @ExcludeMissing fun _referenceId(): JsonField<String> = referenceId

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [stockExchange].
     *
     * Unlike [stockExchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stockExchange")
    @ExcludeMissing
    fun _stockExchange(): JsonField<StockExchange> = stockExchange

    /**
     * Returns the raw JSON value of [stockSymbol].
     *
     * Unlike [stockSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stockSymbol") @ExcludeMissing fun _stockSymbol(): JsonField<String> = stockSymbol

    /**
     * Returns the raw JSON value of [street].
     *
     * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

    /**
     * Returns the raw JSON value of [tcrBrandId].
     *
     * Unlike [tcrBrandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcrBrandId") @ExcludeMissing fun _tcrBrandId(): JsonField<String> = tcrBrandId

    /**
     * Returns the raw JSON value of [universalEin].
     *
     * Unlike [universalEin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("universalEin")
    @ExcludeMissing
    fun _universalEin(): JsonField<String> = universalEin

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhookFailoverURL")
    @ExcludeMissing
    fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookURL") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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

        /**
         * Returns a mutable builder for constructing an instance of [TelnyxBrand].
         *
         * The following fields are required:
         * ```java
         * .brandRelationship()
         * .country()
         * .displayName()
         * .email()
         * .entityType()
         * .vertical()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelnyxBrand]. */
    class Builder internal constructor() {

        private var brandRelationship: JsonField<BrandRelationship>? = null
        private var country: JsonField<String>? = null
        private var displayName: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var entityType: JsonField<EntityType>? = null
        private var vertical: JsonField<String>? = null
        private var altBusinessId: JsonField<String> = JsonMissing.of()
        private var altBusinessIdType: JsonField<AltBusinessIdType> = JsonMissing.of()
        private var brandId: JsonField<String> = JsonMissing.of()
        private var businessContactEmail: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var cspId: JsonField<String> = JsonMissing.of()
        private var ein: JsonField<String> = JsonMissing.of()
        private var failureReasons: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var identityStatus: JsonField<BrandIdentityStatus> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var isReseller: JsonField<Boolean> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var mobilePhone: JsonField<String> = JsonMissing.of()
        private var mock: JsonField<Boolean> = JsonMissing.of()
        private var optionalAttributes: JsonField<OptionalAttributes> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var stockExchange: JsonField<StockExchange> = JsonMissing.of()
        private var stockSymbol: JsonField<String> = JsonMissing.of()
        private var street: JsonField<String> = JsonMissing.of()
        private var tcrBrandId: JsonField<String> = JsonMissing.of()
        private var universalEin: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telnyxBrand: TelnyxBrand) = apply {
            brandRelationship = telnyxBrand.brandRelationship
            country = telnyxBrand.country
            displayName = telnyxBrand.displayName
            email = telnyxBrand.email
            entityType = telnyxBrand.entityType
            vertical = telnyxBrand.vertical
            altBusinessId = telnyxBrand.altBusinessId
            altBusinessIdType = telnyxBrand.altBusinessIdType
            brandId = telnyxBrand.brandId
            businessContactEmail = telnyxBrand.businessContactEmail
            city = telnyxBrand.city
            companyName = telnyxBrand.companyName
            createdAt = telnyxBrand.createdAt
            cspId = telnyxBrand.cspId
            ein = telnyxBrand.ein
            failureReasons = telnyxBrand.failureReasons
            firstName = telnyxBrand.firstName
            identityStatus = telnyxBrand.identityStatus
            ipAddress = telnyxBrand.ipAddress
            isReseller = telnyxBrand.isReseller
            lastName = telnyxBrand.lastName
            mobilePhone = telnyxBrand.mobilePhone
            mock = telnyxBrand.mock
            optionalAttributes = telnyxBrand.optionalAttributes
            phone = telnyxBrand.phone
            postalCode = telnyxBrand.postalCode
            referenceId = telnyxBrand.referenceId
            state = telnyxBrand.state
            status = telnyxBrand.status
            stockExchange = telnyxBrand.stockExchange
            stockSymbol = telnyxBrand.stockSymbol
            street = telnyxBrand.street
            tcrBrandId = telnyxBrand.tcrBrandId
            universalEin = telnyxBrand.universalEin
            updatedAt = telnyxBrand.updatedAt
            webhookFailoverUrl = telnyxBrand.webhookFailoverUrl
            webhookUrl = telnyxBrand.webhookUrl
            website = telnyxBrand.website
            additionalProperties = telnyxBrand.additionalProperties.toMutableMap()
        }

        /** Brand relationship to the CSP. */
        fun brandRelationship(brandRelationship: BrandRelationship) =
            brandRelationship(JsonField.of(brandRelationship))

        /**
         * Sets [Builder.brandRelationship] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandRelationship] with a well-typed [BrandRelationship]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun brandRelationship(brandRelationship: JsonField<BrandRelationship>) = apply {
            this.brandRelationship = brandRelationship
        }

        /** ISO2 2 characters country code. Example: US - United States */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Display or marketing name of the brand. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** Valid email address of brand support contact. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Entity type behind the brand. This is the form of business establishment. */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** Vertical or industry segment of the brand. */
        fun vertical(vertical: String) = vertical(JsonField.of(vertical))

        /**
         * Sets [Builder.vertical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vertical] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vertical(vertical: JsonField<String>) = apply { this.vertical = vertical }

        /** Alternate business identifier such as DUNS, LEI, or GIIN */
        fun altBusinessId(altBusinessId: String) = altBusinessId(JsonField.of(altBusinessId))

        /**
         * Sets [Builder.altBusinessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altBusinessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altBusinessId(altBusinessId: JsonField<String>) = apply {
            this.altBusinessId = altBusinessId
        }

        /** An enumeration. */
        fun altBusinessIdType(altBusinessIdType: AltBusinessIdType) =
            altBusinessIdType(JsonField.of(altBusinessIdType))

        /**
         * Sets [Builder.altBusinessIdType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altBusinessIdType] with a well-typed [AltBusinessIdType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun altBusinessIdType(altBusinessIdType: JsonField<AltBusinessIdType>) = apply {
            this.altBusinessIdType = altBusinessIdType
        }

        /** Unique identifier assigned to the brand. */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /**
         * Business contact email.
         *
         * Required if `entityType` is `PUBLIC_PROFIT`.
         */
        fun businessContactEmail(businessContactEmail: String) =
            businessContactEmail(JsonField.of(businessContactEmail))

        /**
         * Sets [Builder.businessContactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessContactEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessContactEmail(businessContactEmail: JsonField<String>) = apply {
            this.businessContactEmail = businessContactEmail
        }

        /** City name */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** (Required for Non-profit/private/public) Legal company name. */
        fun companyName(companyName: String) = companyName(JsonField.of(companyName))

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /** Date and time that the brand was created at. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Unique identifier assigned to the csp by the registry. */
        fun cspId(cspId: String) = cspId(JsonField.of(cspId))

        /**
         * Sets [Builder.cspId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cspId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cspId(cspId: JsonField<String>) = apply { this.cspId = cspId }

        /**
         * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
         */
        fun ein(ein: String) = ein(JsonField.of(ein))

        /**
         * Sets [Builder.ein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** Failure reasons for brand */
        fun failureReasons(failureReasons: String) = failureReasons(JsonField.of(failureReasons))

        /**
         * Sets [Builder.failureReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReasons] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failureReasons(failureReasons: JsonField<String>) = apply {
            this.failureReasons = failureReasons
        }

        /** First name of business contact. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The verification status of an active brand */
        fun identityStatus(identityStatus: BrandIdentityStatus) =
            identityStatus(JsonField.of(identityStatus))

        /**
         * Sets [Builder.identityStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identityStatus] with a well-typed [BrandIdentityStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun identityStatus(identityStatus: JsonField<BrandIdentityStatus>) = apply {
            this.identityStatus = identityStatus
        }

        /** IP address of the browser requesting to create brand identity. */
        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        /** Indicates whether this brand is known to be a reseller */
        fun isReseller(isReseller: Boolean) = isReseller(JsonField.of(isReseller))

        /**
         * Sets [Builder.isReseller] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReseller] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isReseller(isReseller: JsonField<Boolean>) = apply { this.isReseller = isReseller }

        /** Last name of business contact. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Valid mobile phone number in e.164 international format. */
        fun mobilePhone(mobilePhone: String) = mobilePhone(JsonField.of(mobilePhone))

        /**
         * Sets [Builder.mobilePhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobilePhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mobilePhone(mobilePhone: JsonField<String>) = apply { this.mobilePhone = mobilePhone }

        /** Mock brand for testing purposes */
        fun mock(mock: Boolean) = mock(JsonField.of(mock))

        /**
         * Sets [Builder.mock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mock] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mock(mock: JsonField<Boolean>) = apply { this.mock = mock }

        fun optionalAttributes(optionalAttributes: OptionalAttributes) =
            optionalAttributes(JsonField.of(optionalAttributes))

        /**
         * Sets [Builder.optionalAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionalAttributes] with a well-typed
         * [OptionalAttributes] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun optionalAttributes(optionalAttributes: JsonField<OptionalAttributes>) = apply {
            this.optionalAttributes = optionalAttributes
        }

        /** Valid phone number in e.164 international format. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        /** Postal codes. Use 5 digit zipcode for United States */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** Unique identifier Telnyx assigned to the brand - the brandId */
        fun referenceId(referenceId: String) = referenceId(JsonField.of(referenceId))

        /**
         * Sets [Builder.referenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

        /** State. Must be 2 letters code for United States. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Status of the brand */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** (Required for public company) stock exchange. */
        fun stockExchange(stockExchange: StockExchange) = stockExchange(JsonField.of(stockExchange))

        /**
         * Sets [Builder.stockExchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockExchange] with a well-typed [StockExchange] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stockExchange(stockExchange: JsonField<StockExchange>) = apply {
            this.stockExchange = stockExchange
        }

        /** (Required for public company) stock symbol. */
        fun stockSymbol(stockSymbol: String) = stockSymbol(JsonField.of(stockSymbol))

        /**
         * Sets [Builder.stockSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockSymbol] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stockSymbol(stockSymbol: JsonField<String>) = apply { this.stockSymbol = stockSymbol }

        /** Street number and name. */
        fun street(street: String) = street(JsonField.of(street))

        /**
         * Sets [Builder.street] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street(street: JsonField<String>) = apply { this.street = street }

        /** Unique identifier assigned to the brand by the registry. */
        fun tcrBrandId(tcrBrandId: String) = tcrBrandId(JsonField.of(tcrBrandId))

        /**
         * Sets [Builder.tcrBrandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcrBrandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tcrBrandId(tcrBrandId: JsonField<String>) = apply { this.tcrBrandId = tcrBrandId }

        /** Universal EIN of Brand, Read Only. */
        fun universalEin(universalEin: String) = universalEin(JsonField.of(universalEin))

        /**
         * Sets [Builder.universalEin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.universalEin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun universalEin(universalEin: JsonField<String>) = apply {
            this.universalEin = universalEin
        }

        /** Date and time that the brand was last updated at. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** Failover webhook to which brand status updates are sent. */
        fun webhookFailoverUrl(webhookFailoverUrl: String) =
            webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            this.webhookFailoverUrl = webhookFailoverUrl
        }

        /** Webhook to which brand status updates are sent. */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

        /** Brand website URL. */
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
         * Returns an immutable instance of [TelnyxBrand].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .brandRelationship()
         * .country()
         * .displayName()
         * .email()
         * .entityType()
         * .vertical()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TelnyxBrand =
            TelnyxBrand(
                checkRequired("brandRelationship", brandRelationship),
                checkRequired("country", country),
                checkRequired("displayName", displayName),
                checkRequired("email", email),
                checkRequired("entityType", entityType),
                checkRequired("vertical", vertical),
                altBusinessId,
                altBusinessIdType,
                brandId,
                businessContactEmail,
                city,
                companyName,
                createdAt,
                cspId,
                ein,
                failureReasons,
                firstName,
                identityStatus,
                ipAddress,
                isReseller,
                lastName,
                mobilePhone,
                mock,
                optionalAttributes,
                phone,
                postalCode,
                referenceId,
                state,
                status,
                stockExchange,
                stockSymbol,
                street,
                tcrBrandId,
                universalEin,
                updatedAt,
                webhookFailoverUrl,
                webhookUrl,
                website,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelnyxBrand = apply {
        if (validated) {
            return@apply
        }

        brandRelationship().validate()
        country()
        displayName()
        email()
        entityType().validate()
        vertical()
        altBusinessId()
        altBusinessIdType().ifPresent { it.validate() }
        brandId()
        businessContactEmail()
        city()
        companyName()
        createdAt()
        cspId()
        ein()
        failureReasons()
        firstName()
        identityStatus().ifPresent { it.validate() }
        ipAddress()
        isReseller()
        lastName()
        mobilePhone()
        mock()
        optionalAttributes().ifPresent { it.validate() }
        phone()
        postalCode()
        referenceId()
        state()
        status().ifPresent { it.validate() }
        stockExchange().ifPresent { it.validate() }
        stockSymbol()
        street()
        tcrBrandId()
        universalEin()
        updatedAt()
        webhookFailoverUrl()
        webhookUrl()
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
        (brandRelationship.asKnown().getOrNull()?.validity() ?: 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (entityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (vertical.asKnown().isPresent) 1 else 0) +
            (if (altBusinessId.asKnown().isPresent) 1 else 0) +
            (altBusinessIdType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (brandId.asKnown().isPresent) 1 else 0) +
            (if (businessContactEmail.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (companyName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (cspId.asKnown().isPresent) 1 else 0) +
            (if (ein.asKnown().isPresent) 1 else 0) +
            (if (failureReasons.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (identityStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (isReseller.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (mobilePhone.asKnown().isPresent) 1 else 0) +
            (if (mock.asKnown().isPresent) 1 else 0) +
            (optionalAttributes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phone.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (referenceId.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (stockExchange.asKnown().getOrNull()?.validity() ?: 0) +
            (if (stockSymbol.asKnown().isPresent) 1 else 0) +
            (if (street.asKnown().isPresent) 1 else 0) +
            (if (tcrBrandId.asKnown().isPresent) 1 else 0) +
            (if (universalEin.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0) +
            (if (website.asKnown().isPresent) 1 else 0)

    /** Brand relationship to the CSP. */
    class BrandRelationship @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BASIC_ACCOUNT = of("BASIC_ACCOUNT")

            @JvmField val SMALL_ACCOUNT = of("SMALL_ACCOUNT")

            @JvmField val MEDIUM_ACCOUNT = of("MEDIUM_ACCOUNT")

            @JvmField val LARGE_ACCOUNT = of("LARGE_ACCOUNT")

            @JvmField val KEY_ACCOUNT = of("KEY_ACCOUNT")

            @JvmStatic fun of(value: String) = BrandRelationship(JsonField.of(value))
        }

        /** An enum containing [BrandRelationship]'s known values. */
        enum class Known {
            BASIC_ACCOUNT,
            SMALL_ACCOUNT,
            MEDIUM_ACCOUNT,
            LARGE_ACCOUNT,
            KEY_ACCOUNT,
        }

        /**
         * An enum containing [BrandRelationship]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BrandRelationship] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BASIC_ACCOUNT,
            SMALL_ACCOUNT,
            MEDIUM_ACCOUNT,
            LARGE_ACCOUNT,
            KEY_ACCOUNT,
            /**
             * An enum member indicating that [BrandRelationship] was instantiated with an unknown
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
                BASIC_ACCOUNT -> Value.BASIC_ACCOUNT
                SMALL_ACCOUNT -> Value.SMALL_ACCOUNT
                MEDIUM_ACCOUNT -> Value.MEDIUM_ACCOUNT
                LARGE_ACCOUNT -> Value.LARGE_ACCOUNT
                KEY_ACCOUNT -> Value.KEY_ACCOUNT
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
                BASIC_ACCOUNT -> Known.BASIC_ACCOUNT
                SMALL_ACCOUNT -> Known.SMALL_ACCOUNT
                MEDIUM_ACCOUNT -> Known.MEDIUM_ACCOUNT
                LARGE_ACCOUNT -> Known.LARGE_ACCOUNT
                KEY_ACCOUNT -> Known.KEY_ACCOUNT
                else -> throw TelnyxInvalidDataException("Unknown BrandRelationship: $value")
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

        fun validate(): BrandRelationship = apply {
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

            return other is BrandRelationship && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class OptionalAttributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val taxExemptStatus: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("taxExemptStatus")
            @ExcludeMissing
            taxExemptStatus: JsonField<String> = JsonMissing.of()
        ) : this(taxExemptStatus, mutableMapOf())

        /**
         * The tax exempt status of the brand
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxExemptStatus(): Optional<String> = taxExemptStatus.getOptional("taxExemptStatus")

        /**
         * Returns the raw JSON value of [taxExemptStatus].
         *
         * Unlike [taxExemptStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("taxExemptStatus")
        @ExcludeMissing
        fun _taxExemptStatus(): JsonField<String> = taxExemptStatus

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

            /** Returns a mutable builder for constructing an instance of [OptionalAttributes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OptionalAttributes]. */
        class Builder internal constructor() {

            private var taxExemptStatus: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(optionalAttributes: OptionalAttributes) = apply {
                taxExemptStatus = optionalAttributes.taxExemptStatus
                additionalProperties = optionalAttributes.additionalProperties.toMutableMap()
            }

            /** The tax exempt status of the brand */
            fun taxExemptStatus(taxExemptStatus: String) =
                taxExemptStatus(JsonField.of(taxExemptStatus))

            /**
             * Sets [Builder.taxExemptStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxExemptStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxExemptStatus(taxExemptStatus: JsonField<String>) = apply {
                this.taxExemptStatus = taxExemptStatus
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
             * Returns an immutable instance of [OptionalAttributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OptionalAttributes =
                OptionalAttributes(taxExemptStatus, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): OptionalAttributes = apply {
            if (validated) {
                return@apply
            }

            taxExemptStatus()
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
        internal fun validity(): Int = (if (taxExemptStatus.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OptionalAttributes &&
                taxExemptStatus == other.taxExemptStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(taxExemptStatus, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OptionalAttributes{taxExemptStatus=$taxExemptStatus, additionalProperties=$additionalProperties}"
    }

    /** Status of the brand */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OK = of("OK")

            @JvmField val REGISTRATION_PENDING = of("REGISTRATION_PENDING")

            @JvmField val REGISTRATION_FAILED = of("REGISTRATION_FAILED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OK,
            REGISTRATION_PENDING,
            REGISTRATION_FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            REGISTRATION_PENDING,
            REGISTRATION_FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                OK -> Value.OK
                REGISTRATION_PENDING -> Value.REGISTRATION_PENDING
                REGISTRATION_FAILED -> Value.REGISTRATION_FAILED
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
                OK -> Known.OK
                REGISTRATION_PENDING -> Known.REGISTRATION_PENDING
                REGISTRATION_FAILED -> Known.REGISTRATION_FAILED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelnyxBrand &&
            brandRelationship == other.brandRelationship &&
            country == other.country &&
            displayName == other.displayName &&
            email == other.email &&
            entityType == other.entityType &&
            vertical == other.vertical &&
            altBusinessId == other.altBusinessId &&
            altBusinessIdType == other.altBusinessIdType &&
            brandId == other.brandId &&
            businessContactEmail == other.businessContactEmail &&
            city == other.city &&
            companyName == other.companyName &&
            createdAt == other.createdAt &&
            cspId == other.cspId &&
            ein == other.ein &&
            failureReasons == other.failureReasons &&
            firstName == other.firstName &&
            identityStatus == other.identityStatus &&
            ipAddress == other.ipAddress &&
            isReseller == other.isReseller &&
            lastName == other.lastName &&
            mobilePhone == other.mobilePhone &&
            mock == other.mock &&
            optionalAttributes == other.optionalAttributes &&
            phone == other.phone &&
            postalCode == other.postalCode &&
            referenceId == other.referenceId &&
            state == other.state &&
            status == other.status &&
            stockExchange == other.stockExchange &&
            stockSymbol == other.stockSymbol &&
            street == other.street &&
            tcrBrandId == other.tcrBrandId &&
            universalEin == other.universalEin &&
            updatedAt == other.updatedAt &&
            webhookFailoverUrl == other.webhookFailoverUrl &&
            webhookUrl == other.webhookUrl &&
            website == other.website &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandRelationship,
            country,
            displayName,
            email,
            entityType,
            vertical,
            altBusinessId,
            altBusinessIdType,
            brandId,
            businessContactEmail,
            city,
            companyName,
            createdAt,
            cspId,
            ein,
            failureReasons,
            firstName,
            identityStatus,
            ipAddress,
            isReseller,
            lastName,
            mobilePhone,
            mock,
            optionalAttributes,
            phone,
            postalCode,
            referenceId,
            state,
            status,
            stockExchange,
            stockSymbol,
            street,
            tcrBrandId,
            universalEin,
            updatedAt,
            webhookFailoverUrl,
            webhookUrl,
            website,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelnyxBrand{brandRelationship=$brandRelationship, country=$country, displayName=$displayName, email=$email, entityType=$entityType, vertical=$vertical, altBusinessId=$altBusinessId, altBusinessIdType=$altBusinessIdType, brandId=$brandId, businessContactEmail=$businessContactEmail, city=$city, companyName=$companyName, createdAt=$createdAt, cspId=$cspId, ein=$ein, failureReasons=$failureReasons, firstName=$firstName, identityStatus=$identityStatus, ipAddress=$ipAddress, isReseller=$isReseller, lastName=$lastName, mobilePhone=$mobilePhone, mock=$mock, optionalAttributes=$optionalAttributes, phone=$phone, postalCode=$postalCode, referenceId=$referenceId, state=$state, status=$status, stockExchange=$stockExchange, stockSymbol=$stockSymbol, street=$street, tcrBrandId=$tcrBrandId, universalEin=$universalEin, updatedAt=$updatedAt, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, website=$website, additionalProperties=$additionalProperties}"
}
