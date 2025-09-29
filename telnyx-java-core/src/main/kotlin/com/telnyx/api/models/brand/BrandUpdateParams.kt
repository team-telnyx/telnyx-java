// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a brand's attributes by `brandId`. */
class BrandUpdateParams
private constructor(
    private val brandId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /**
     * ISO2 2 characters country code. Example: US - United States
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = body.country()

    /**
     * Display or marketing name of the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * Valid email address of brand support contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = body.email()

    /**
     * Entity type behind the brand. This is the form of business establishment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): EntityType = body.entityType()

    /**
     * Vertical or industry segment of the brand or campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vertical(): Vertical = body.vertical()

    /**
     * Alternate business identifier such as DUNS, LEI, or GIIN
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun altBusinessId(): Optional<String> = body.altBusinessId()

    /**
     * An enumeration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun altBusinessIdType(): Optional<AltBusinessIdType> = body.altBusinessIdType()

    /**
     * Business contact email.
     *
     * Required if `entityType` will be changed to `PUBLIC_PROFIT`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessContactEmail(): Optional<String> = body.businessContactEmail()

    /**
     * City name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = body.city()

    /**
     * (Required for Non-profit/private/public) Legal company name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = body.companyName()

    /**
     * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ein(): Optional<String> = body.ein()

    /**
     * First name of business contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * The verification status of an active brand
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun identityStatus(): Optional<BrandIdentityStatus> = body.identityStatus()

    /**
     * IP address of the browser requesting to create brand identity.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = body.ipAddress()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isReseller(): Optional<Boolean> = body.isReseller()

    /**
     * Last name of business contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = body.lastName()

    /**
     * Valid phone number in e.164 international format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phone(): Optional<String> = body.phone()

    /**
     * Postal codes. Use 5 digit zipcode for United States
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = body.postalCode()

    /**
     * State. Must be 2 letters code for United States.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = body.state()

    /**
     * (Required for public company) stock exchange.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockExchange(): Optional<StockExchange> = body.stockExchange()

    /**
     * (Required for public company) stock symbol.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockSymbol(): Optional<String> = body.stockSymbol()

    /**
     * Street number and name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun street(): Optional<String> = body.street()

    /**
     * Webhook failover URL for brand status updates.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> = body.webhookFailoverUrl()

    /**
     * Webhook URL for brand status updates.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Brand website URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = body.website()

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _country(): JsonField<String> = body._country()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityType(): JsonField<EntityType> = body._entityType()

    /**
     * Returns the raw JSON value of [vertical].
     *
     * Unlike [vertical], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vertical(): JsonField<Vertical> = body._vertical()

    /**
     * Returns the raw JSON value of [altBusinessId].
     *
     * Unlike [altBusinessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _altBusinessId(): JsonField<String> = body._altBusinessId()

    /**
     * Returns the raw JSON value of [altBusinessIdType].
     *
     * Unlike [altBusinessIdType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _altBusinessIdType(): JsonField<AltBusinessIdType> = body._altBusinessIdType()

    /**
     * Returns the raw JSON value of [businessContactEmail].
     *
     * Unlike [businessContactEmail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _businessContactEmail(): JsonField<String> = body._businessContactEmail()

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _city(): JsonField<String> = body._city()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [ein].
     *
     * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ein(): JsonField<String> = body._ein()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [identityStatus].
     *
     * Unlike [identityStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _identityStatus(): JsonField<BrandIdentityStatus> = body._identityStatus()

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ipAddress(): JsonField<String> = body._ipAddress()

    /**
     * Returns the raw JSON value of [isReseller].
     *
     * Unlike [isReseller], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isReseller(): JsonField<Boolean> = body._isReseller()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phone(): JsonField<String> = body._phone()

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _postalCode(): JsonField<String> = body._postalCode()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<String> = body._state()

    /**
     * Returns the raw JSON value of [stockExchange].
     *
     * Unlike [stockExchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stockExchange(): JsonField<StockExchange> = body._stockExchange()

    /**
     * Returns the raw JSON value of [stockSymbol].
     *
     * Unlike [stockSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stockSymbol(): JsonField<String> = body._stockSymbol()

    /**
     * Returns the raw JSON value of [street].
     *
     * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _street(): JsonField<String> = body._street()

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookFailoverUrl(): JsonField<String> = body._webhookFailoverUrl()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

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

        /**
         * Returns a mutable builder for constructing an instance of [BrandUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .country()
         * .displayName()
         * .email()
         * .entityType()
         * .vertical()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandUpdateParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandUpdateParams: BrandUpdateParams) = apply {
            brandId = brandUpdateParams.brandId
            body = brandUpdateParams.body.toBuilder()
            additionalHeaders = brandUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandUpdateParams.additionalQueryParams.toBuilder()
        }

        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [country]
         * - [displayName]
         * - [email]
         * - [entityType]
         * - [vertical]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ISO2 2 characters country code. Example: US - United States */
        fun country(country: String) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { body.country(country) }

        /** Display or marketing name of the brand. */
        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** Valid email address of brand support contact. */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** Entity type behind the brand. This is the form of business establishment. */
        fun entityType(entityType: EntityType) = apply { body.entityType(entityType) }

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { body.entityType(entityType) }

        /** Vertical or industry segment of the brand or campaign. */
        fun vertical(vertical: Vertical) = apply { body.vertical(vertical) }

        /**
         * Sets [Builder.vertical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vertical] with a well-typed [Vertical] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vertical(vertical: JsonField<Vertical>) = apply { body.vertical(vertical) }

        /** Alternate business identifier such as DUNS, LEI, or GIIN */
        fun altBusinessId(altBusinessId: String) = apply { body.altBusinessId(altBusinessId) }

        /**
         * Sets [Builder.altBusinessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altBusinessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altBusinessId(altBusinessId: JsonField<String>) = apply {
            body.altBusinessId(altBusinessId)
        }

        /** An enumeration. */
        fun altBusinessIdType(altBusinessIdType: AltBusinessIdType) = apply {
            body.altBusinessIdType(altBusinessIdType)
        }

        /**
         * Sets [Builder.altBusinessIdType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altBusinessIdType] with a well-typed [AltBusinessIdType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun altBusinessIdType(altBusinessIdType: JsonField<AltBusinessIdType>) = apply {
            body.altBusinessIdType(altBusinessIdType)
        }

        /**
         * Business contact email.
         *
         * Required if `entityType` will be changed to `PUBLIC_PROFIT`.
         */
        fun businessContactEmail(businessContactEmail: String) = apply {
            body.businessContactEmail(businessContactEmail)
        }

        /**
         * Sets [Builder.businessContactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessContactEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessContactEmail(businessContactEmail: JsonField<String>) = apply {
            body.businessContactEmail(businessContactEmail)
        }

        /** City name */
        fun city(city: String) = apply { body.city(city) }

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { body.city(city) }

        /** (Required for Non-profit/private/public) Legal company name. */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /**
         * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
         */
        fun ein(ein: String) = apply { body.ein(ein) }

        /**
         * Sets [Builder.ein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ein(ein: JsonField<String>) = apply { body.ein(ein) }

        /** First name of business contact. */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** The verification status of an active brand */
        fun identityStatus(identityStatus: BrandIdentityStatus) = apply {
            body.identityStatus(identityStatus)
        }

        /**
         * Sets [Builder.identityStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identityStatus] with a well-typed [BrandIdentityStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun identityStatus(identityStatus: JsonField<BrandIdentityStatus>) = apply {
            body.identityStatus(identityStatus)
        }

        /** IP address of the browser requesting to create brand identity. */
        fun ipAddress(ipAddress: String) = apply { body.ipAddress(ipAddress) }

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { body.ipAddress(ipAddress) }

        fun isReseller(isReseller: Boolean) = apply { body.isReseller(isReseller) }

        /**
         * Sets [Builder.isReseller] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReseller] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isReseller(isReseller: JsonField<Boolean>) = apply { body.isReseller(isReseller) }

        /** Last name of business contact. */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /** Valid phone number in e.164 international format. */
        fun phone(phone: String) = apply { body.phone(phone) }

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { body.phone(phone) }

        /** Postal codes. Use 5 digit zipcode for United States */
        fun postalCode(postalCode: String) = apply { body.postalCode(postalCode) }

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { body.postalCode(postalCode) }

        /** State. Must be 2 letters code for United States. */
        fun state(state: String) = apply { body.state(state) }

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { body.state(state) }

        /** (Required for public company) stock exchange. */
        fun stockExchange(stockExchange: StockExchange) = apply {
            body.stockExchange(stockExchange)
        }

        /**
         * Sets [Builder.stockExchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockExchange] with a well-typed [StockExchange] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stockExchange(stockExchange: JsonField<StockExchange>) = apply {
            body.stockExchange(stockExchange)
        }

        /** (Required for public company) stock symbol. */
        fun stockSymbol(stockSymbol: String) = apply { body.stockSymbol(stockSymbol) }

        /**
         * Sets [Builder.stockSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockSymbol] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stockSymbol(stockSymbol: JsonField<String>) = apply { body.stockSymbol(stockSymbol) }

        /** Street number and name. */
        fun street(street: String) = apply { body.street(street) }

        /**
         * Sets [Builder.street] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street(street: JsonField<String>) = apply { body.street(street) }

        /** Webhook failover URL for brand status updates. */
        fun webhookFailoverUrl(webhookFailoverUrl: String) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        /** Webhook URL for brand status updates. */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

        /** Brand website URL. */
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
         * Returns an immutable instance of [BrandUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .country()
         * .displayName()
         * .email()
         * .entityType()
         * .vertical()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandUpdateParams =
            BrandUpdateParams(
                brandId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> brandId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val country: JsonField<String>,
        private val displayName: JsonField<String>,
        private val email: JsonField<String>,
        private val entityType: JsonField<EntityType>,
        private val vertical: JsonField<Vertical>,
        private val altBusinessId: JsonField<String>,
        private val altBusinessIdType: JsonField<AltBusinessIdType>,
        private val businessContactEmail: JsonField<String>,
        private val city: JsonField<String>,
        private val companyName: JsonField<String>,
        private val ein: JsonField<String>,
        private val firstName: JsonField<String>,
        private val identityStatus: JsonField<BrandIdentityStatus>,
        private val ipAddress: JsonField<String>,
        private val isReseller: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val phone: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val stockExchange: JsonField<StockExchange>,
        private val stockSymbol: JsonField<String>,
        private val street: JsonField<String>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityType")
            @ExcludeMissing
            entityType: JsonField<EntityType> = JsonMissing.of(),
            @JsonProperty("vertical")
            @ExcludeMissing
            vertical: JsonField<Vertical> = JsonMissing.of(),
            @JsonProperty("altBusiness_id")
            @ExcludeMissing
            altBusinessId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altBusinessIdType")
            @ExcludeMissing
            altBusinessIdType: JsonField<AltBusinessIdType> = JsonMissing.of(),
            @JsonProperty("businessContactEmail")
            @ExcludeMissing
            businessContactEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("companyName")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ein") @ExcludeMissing ein: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identityStatus")
            @ExcludeMissing
            identityStatus: JsonField<BrandIdentityStatus> = JsonMissing.of(),
            @JsonProperty("ipAddress")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isReseller")
            @ExcludeMissing
            isReseller: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postalCode")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stockExchange")
            @ExcludeMissing
            stockExchange: JsonField<StockExchange> = JsonMissing.of(),
            @JsonProperty("stockSymbol")
            @ExcludeMissing
            stockSymbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookFailoverURL")
            @ExcludeMissing
            webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookURL")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            country,
            displayName,
            email,
            entityType,
            vertical,
            altBusinessId,
            altBusinessIdType,
            businessContactEmail,
            city,
            companyName,
            ein,
            firstName,
            identityStatus,
            ipAddress,
            isReseller,
            lastName,
            phone,
            postalCode,
            state,
            stockExchange,
            stockSymbol,
            street,
            webhookFailoverUrl,
            webhookUrl,
            website,
            mutableMapOf(),
        )

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
         * Vertical or industry segment of the brand or campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vertical(): Vertical = vertical.getRequired("vertical")

        /**
         * Alternate business identifier such as DUNS, LEI, or GIIN
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun altBusinessId(): Optional<String> = altBusinessId.getOptional("altBusiness_id")

        /**
         * An enumeration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun altBusinessIdType(): Optional<AltBusinessIdType> =
            altBusinessIdType.getOptional("altBusinessIdType")

        /**
         * Business contact email.
         *
         * Required if `entityType` will be changed to `PUBLIC_PROFIT`.
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
         * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ein(): Optional<String> = ein.getOptional("ein")

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
         * State. Must be 2 letters code for United States.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

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
         * Webhook failover URL for brand status updates.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookFailoverUrl(): Optional<String> =
            webhookFailoverUrl.getOptional("webhookFailoverURL")

        /**
         * Webhook URL for brand status updates.
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
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

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
        @JsonProperty("vertical") @ExcludeMissing fun _vertical(): JsonField<Vertical> = vertical

        /**
         * Returns the raw JSON value of [altBusinessId].
         *
         * Unlike [altBusinessId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("altBusiness_id")
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
         * Returns the raw JSON value of [businessContactEmail].
         *
         * Unlike [businessContactEmail], this method doesn't throw if the JSON field has an
         * unexpected type.
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
        @JsonProperty("companyName")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [ein].
         *
         * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [identityStatus].
         *
         * Unlike [identityStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("isReseller")
        @ExcludeMissing
        fun _isReseller(): JsonField<Boolean> = isReseller

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
        @JsonProperty("postalCode")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [stockExchange].
         *
         * Unlike [stockExchange], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stockExchange")
        @ExcludeMissing
        fun _stockExchange(): JsonField<StockExchange> = stockExchange

        /**
         * Returns the raw JSON value of [stockSymbol].
         *
         * Unlike [stockSymbol], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stockSymbol")
        @ExcludeMissing
        fun _stockSymbol(): JsonField<String> = stockSymbol

        /**
         * Returns the raw JSON value of [street].
         *
         * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

        /**
         * Returns the raw JSON value of [webhookFailoverUrl].
         *
         * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhookFailoverURL")
        @ExcludeMissing
        fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhookURL")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .country()
             * .displayName()
             * .email()
             * .entityType()
             * .vertical()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var entityType: JsonField<EntityType>? = null
            private var vertical: JsonField<Vertical>? = null
            private var altBusinessId: JsonField<String> = JsonMissing.of()
            private var altBusinessIdType: JsonField<AltBusinessIdType> = JsonMissing.of()
            private var businessContactEmail: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var ein: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identityStatus: JsonField<BrandIdentityStatus> = JsonMissing.of()
            private var ipAddress: JsonField<String> = JsonMissing.of()
            private var isReseller: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var stockExchange: JsonField<StockExchange> = JsonMissing.of()
            private var stockSymbol: JsonField<String> = JsonMissing.of()
            private var street: JsonField<String> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                country = body.country
                displayName = body.displayName
                email = body.email
                entityType = body.entityType
                vertical = body.vertical
                altBusinessId = body.altBusinessId
                altBusinessIdType = body.altBusinessIdType
                businessContactEmail = body.businessContactEmail
                city = body.city
                companyName = body.companyName
                ein = body.ein
                firstName = body.firstName
                identityStatus = body.identityStatus
                ipAddress = body.ipAddress
                isReseller = body.isReseller
                lastName = body.lastName
                phone = body.phone
                postalCode = body.postalCode
                state = body.state
                stockExchange = body.stockExchange
                stockSymbol = body.stockSymbol
                street = body.street
                webhookFailoverUrl = body.webhookFailoverUrl
                webhookUrl = body.webhookUrl
                website = body.website
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ISO2 2 characters country code. Example: US - United States */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Display or marketing name of the brand. */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** Valid email address of brand support contact. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun entityType(entityType: JsonField<EntityType>) = apply {
                this.entityType = entityType
            }

            /** Vertical or industry segment of the brand or campaign. */
            fun vertical(vertical: Vertical) = vertical(JsonField.of(vertical))

            /**
             * Sets [Builder.vertical] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertical] with a well-typed [Vertical] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vertical(vertical: JsonField<Vertical>) = apply { this.vertical = vertical }

            /** Alternate business identifier such as DUNS, LEI, or GIIN */
            fun altBusinessId(altBusinessId: String) = altBusinessId(JsonField.of(altBusinessId))

            /**
             * Sets [Builder.altBusinessId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altBusinessId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.altBusinessIdType] with a well-typed
             * [AltBusinessIdType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun altBusinessIdType(altBusinessIdType: JsonField<AltBusinessIdType>) = apply {
                this.altBusinessIdType = altBusinessIdType
            }

            /**
             * Business contact email.
             *
             * Required if `entityType` will be changed to `PUBLIC_PROFIT`.
             */
            fun businessContactEmail(businessContactEmail: String) =
                businessContactEmail(JsonField.of(businessContactEmail))

            /**
             * Sets [Builder.businessContactEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessContactEmail] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** (Required for Non-profit/private/public) Legal company name. */
            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /**
             * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in
             * U.S.
             */
            fun ein(ein: String) = ein(JsonField.of(ein))

            /**
             * Sets [Builder.ein] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ein] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ein(ein: JsonField<String>) = apply { this.ein = ein }

            /** First name of business contact. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The verification status of an active brand */
            fun identityStatus(identityStatus: BrandIdentityStatus) =
                identityStatus(JsonField.of(identityStatus))

            /**
             * Sets [Builder.identityStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identityStatus] with a well-typed
             * [BrandIdentityStatus] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            fun isReseller(isReseller: Boolean) = isReseller(JsonField.of(isReseller))

            /**
             * Sets [Builder.isReseller] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isReseller] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isReseller(isReseller: JsonField<Boolean>) = apply { this.isReseller = isReseller }

            /** Last name of business contact. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Valid phone number in e.164 international format. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Postal codes. Use 5 digit zipcode for United States */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** State. Must be 2 letters code for United States. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** (Required for public company) stock exchange. */
            fun stockExchange(stockExchange: StockExchange) =
                stockExchange(JsonField.of(stockExchange))

            /**
             * Sets [Builder.stockExchange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stockExchange] with a well-typed [StockExchange]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun stockExchange(stockExchange: JsonField<StockExchange>) = apply {
                this.stockExchange = stockExchange
            }

            /** (Required for public company) stock symbol. */
            fun stockSymbol(stockSymbol: String) = stockSymbol(JsonField.of(stockSymbol))

            /**
             * Sets [Builder.stockSymbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stockSymbol] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stockSymbol(stockSymbol: JsonField<String>) = apply {
                this.stockSymbol = stockSymbol
            }

            /** Street number and name. */
            fun street(street: String) = street(JsonField.of(street))

            /**
             * Sets [Builder.street] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street(street: JsonField<String>) = apply { this.street = street }

            /** Webhook failover URL for brand status updates. */
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

            /** Webhook URL for brand status updates. */
            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

            /** Brand website URL. */
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
             *
             * The following fields are required:
             * ```java
             * .country()
             * .displayName()
             * .email()
             * .entityType()
             * .vertical()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("country", country),
                    checkRequired("displayName", displayName),
                    checkRequired("email", email),
                    checkRequired("entityType", entityType),
                    checkRequired("vertical", vertical),
                    altBusinessId,
                    altBusinessIdType,
                    businessContactEmail,
                    city,
                    companyName,
                    ein,
                    firstName,
                    identityStatus,
                    ipAddress,
                    isReseller,
                    lastName,
                    phone,
                    postalCode,
                    state,
                    stockExchange,
                    stockSymbol,
                    street,
                    webhookFailoverUrl,
                    webhookUrl,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            country()
            displayName()
            email()
            entityType().validate()
            vertical().validate()
            altBusinessId()
            altBusinessIdType().ifPresent { it.validate() }
            businessContactEmail()
            city()
            companyName()
            ein()
            firstName()
            identityStatus().ifPresent { it.validate() }
            ipAddress()
            isReseller()
            lastName()
            phone()
            postalCode()
            state()
            stockExchange().ifPresent { it.validate() }
            stockSymbol()
            street()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (country.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (entityType.asKnown().getOrNull()?.validity() ?: 0) +
                (vertical.asKnown().getOrNull()?.validity() ?: 0) +
                (if (altBusinessId.asKnown().isPresent) 1 else 0) +
                (altBusinessIdType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (businessContactEmail.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (if (ein.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (identityStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (isReseller.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (phone.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (stockExchange.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stockSymbol.asKnown().isPresent) 1 else 0) +
                (if (street.asKnown().isPresent) 1 else 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                country == other.country &&
                displayName == other.displayName &&
                email == other.email &&
                entityType == other.entityType &&
                vertical == other.vertical &&
                altBusinessId == other.altBusinessId &&
                altBusinessIdType == other.altBusinessIdType &&
                businessContactEmail == other.businessContactEmail &&
                city == other.city &&
                companyName == other.companyName &&
                ein == other.ein &&
                firstName == other.firstName &&
                identityStatus == other.identityStatus &&
                ipAddress == other.ipAddress &&
                isReseller == other.isReseller &&
                lastName == other.lastName &&
                phone == other.phone &&
                postalCode == other.postalCode &&
                state == other.state &&
                stockExchange == other.stockExchange &&
                stockSymbol == other.stockSymbol &&
                street == other.street &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                country,
                displayName,
                email,
                entityType,
                vertical,
                altBusinessId,
                altBusinessIdType,
                businessContactEmail,
                city,
                companyName,
                ein,
                firstName,
                identityStatus,
                ipAddress,
                isReseller,
                lastName,
                phone,
                postalCode,
                state,
                stockExchange,
                stockSymbol,
                street,
                webhookFailoverUrl,
                webhookUrl,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{country=$country, displayName=$displayName, email=$email, entityType=$entityType, vertical=$vertical, altBusinessId=$altBusinessId, altBusinessIdType=$altBusinessIdType, businessContactEmail=$businessContactEmail, city=$city, companyName=$companyName, ein=$ein, firstName=$firstName, identityStatus=$identityStatus, ipAddress=$ipAddress, isReseller=$isReseller, lastName=$lastName, phone=$phone, postalCode=$postalCode, state=$state, stockExchange=$stockExchange, stockSymbol=$stockSymbol, street=$street, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, website=$website, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandUpdateParams &&
            brandId == other.brandId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(brandId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandUpdateParams{brandId=$brandId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
