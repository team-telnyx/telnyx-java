// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.useraddresses

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Creates a user address. */
class UserAddressCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The business name associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessName(): String = body.businessName()

    /**
     * The two-character (ISO 3166-1 alpha-2) country code of the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = body.countryCode()

    /**
     * The first name associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = body.firstName()

    /**
     * The last name associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = body.lastName()

    /**
     * The locality of the user address. For US addresses, this corresponds to the city of the
     * address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locality(): String = body.locality()

    /**
     * The primary street address information about the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun streetAddress(): String = body.streetAddress()

    /**
     * The locality of the user address. For US addresses, this corresponds to the state of the
     * address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun administrativeArea(): Optional<String> = body.administrativeArea()

    /**
     * The borough of the user address. This field is not used for addresses in the US but is used
     * for some international addresses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borough(): Optional<String> = body.borough()

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * Additional street address information about the user address such as, but not limited to,
     * unit number or apartment number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedAddress(): Optional<String> = body.extendedAddress()

    /**
     * The neighborhood of the user address. This field is not used for addresses in the US but is
     * used for some international addresses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun neighborhood(): Optional<String> = body.neighborhood()

    /**
     * The phone number associated with the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = body.phoneNumber()

    /**
     * The postal code of the user address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = body.postalCode()

    /**
     * An optional boolean value specifying if verification of the address should be skipped or not.
     * UserAddresses are generally used for shipping addresses, and failure to validate your
     * shipping address will likely result in a failure to deliver SIM cards or other items ordered
     * from Telnyx. Do not use this parameter unless you are sure that the address is correct even
     * though it cannot be validated. If this is set to any value other than true, verification of
     * the address will be attempted, and the user address will not be allowed if verification
     * fails. If verification fails but suggested values are available that might make the address
     * correct, they will be present in the response as well. If this value is set to true, then the
     * verification will not be attempted. Defaults to false (verification will be performed).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipAddressVerification(): Optional<String> = body.skipAddressVerification()

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _businessName(): JsonField<String> = body._businessName()

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _countryCode(): JsonField<String> = body._countryCode()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locality(): JsonField<String> = body._locality()

    /**
     * Returns the raw JSON value of [streetAddress].
     *
     * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streetAddress(): JsonField<String> = body._streetAddress()

    /**
     * Returns the raw JSON value of [administrativeArea].
     *
     * Unlike [administrativeArea], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _administrativeArea(): JsonField<String> = body._administrativeArea()

    /**
     * Returns the raw JSON value of [borough].
     *
     * Unlike [borough], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _borough(): JsonField<String> = body._borough()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [extendedAddress].
     *
     * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extendedAddress(): JsonField<String> = body._extendedAddress()

    /**
     * Returns the raw JSON value of [neighborhood].
     *
     * Unlike [neighborhood], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _neighborhood(): JsonField<String> = body._neighborhood()

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<String> = body._phoneNumber()

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _postalCode(): JsonField<String> = body._postalCode()

    /**
     * Returns the raw JSON value of [skipAddressVerification].
     *
     * Unlike [skipAddressVerification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _skipAddressVerification(): JsonField<String> = body._skipAddressVerification()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserAddressCreateParams].
         *
         * The following fields are required:
         * ```java
         * .businessName()
         * .countryCode()
         * .firstName()
         * .lastName()
         * .locality()
         * .streetAddress()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserAddressCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userAddressCreateParams: UserAddressCreateParams) = apply {
            body = userAddressCreateParams.body.toBuilder()
            additionalHeaders = userAddressCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userAddressCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [businessName]
         * - [countryCode]
         * - [firstName]
         * - [lastName]
         * - [locality]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The business name associated with the user address. */
        fun businessName(businessName: String) = apply { body.businessName(businessName) }

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            body.businessName(businessName)
        }

        /** The two-character (ISO 3166-1 alpha-2) country code of the user address. */
        fun countryCode(countryCode: String) = apply { body.countryCode(countryCode) }

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { body.countryCode(countryCode) }

        /** The first name associated with the user address. */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** The last name associated with the user address. */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /**
         * The locality of the user address. For US addresses, this corresponds to the city of the
         * address.
         */
        fun locality(locality: String) = apply { body.locality(locality) }

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { body.locality(locality) }

        /** The primary street address information about the user address. */
        fun streetAddress(streetAddress: String) = apply { body.streetAddress(streetAddress) }

        /**
         * Sets [Builder.streetAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streetAddress(streetAddress: JsonField<String>) = apply {
            body.streetAddress(streetAddress)
        }

        /**
         * The locality of the user address. For US addresses, this corresponds to the state of the
         * address.
         */
        fun administrativeArea(administrativeArea: String) = apply {
            body.administrativeArea(administrativeArea)
        }

        /**
         * Sets [Builder.administrativeArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.administrativeArea] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun administrativeArea(administrativeArea: JsonField<String>) = apply {
            body.administrativeArea(administrativeArea)
        }

        /**
         * The borough of the user address. This field is not used for addresses in the US but is
         * used for some international addresses.
         */
        fun borough(borough: String) = apply { body.borough(borough) }

        /**
         * Sets [Builder.borough] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borough] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun borough(borough: JsonField<String>) = apply { body.borough(borough) }

        /** A customer reference string for customer look ups. */
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

        /**
         * Additional street address information about the user address such as, but not limited to,
         * unit number or apartment number.
         */
        fun extendedAddress(extendedAddress: String) = apply {
            body.extendedAddress(extendedAddress)
        }

        /**
         * Sets [Builder.extendedAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendedAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extendedAddress(extendedAddress: JsonField<String>) = apply {
            body.extendedAddress(extendedAddress)
        }

        /**
         * The neighborhood of the user address. This field is not used for addresses in the US but
         * is used for some international addresses.
         */
        fun neighborhood(neighborhood: String) = apply { body.neighborhood(neighborhood) }

        /**
         * Sets [Builder.neighborhood] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborhood] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun neighborhood(neighborhood: JsonField<String>) = apply {
            body.neighborhood(neighborhood)
        }

        /** The phone number associated with the user address. */
        fun phoneNumber(phoneNumber: String) = apply { body.phoneNumber(phoneNumber) }

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

        /** The postal code of the user address. */
        fun postalCode(postalCode: String) = apply { body.postalCode(postalCode) }

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { body.postalCode(postalCode) }

        /**
         * An optional boolean value specifying if verification of the address should be skipped or
         * not. UserAddresses are generally used for shipping addresses, and failure to validate
         * your shipping address will likely result in a failure to deliver SIM cards or other items
         * ordered from Telnyx. Do not use this parameter unless you are sure that the address is
         * correct even though it cannot be validated. If this is set to any value other than true,
         * verification of the address will be attempted, and the user address will not be allowed
         * if verification fails. If verification fails but suggested values are available that
         * might make the address correct, they will be present in the response as well. If this
         * value is set to true, then the verification will not be attempted. Defaults to false
         * (verification will be performed).
         */
        fun skipAddressVerification(skipAddressVerification: String) = apply {
            body.skipAddressVerification(skipAddressVerification)
        }

        /**
         * Sets [Builder.skipAddressVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipAddressVerification] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun skipAddressVerification(skipAddressVerification: JsonField<String>) = apply {
            body.skipAddressVerification(skipAddressVerification)
        }

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
         * Returns an immutable instance of [UserAddressCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessName()
         * .countryCode()
         * .firstName()
         * .lastName()
         * .locality()
         * .streetAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserAddressCreateParams =
            UserAddressCreateParams(
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
        private val businessName: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val locality: JsonField<String>,
        private val streetAddress: JsonField<String>,
        private val administrativeArea: JsonField<String>,
        private val borough: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val extendedAddress: JsonField<String>,
        private val neighborhood: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val skipAddressVerification: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("business_name")
            @ExcludeMissing
            businessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_address")
            @ExcludeMissing
            streetAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("administrative_area")
            @ExcludeMissing
            administrativeArea: JsonField<String> = JsonMissing.of(),
            @JsonProperty("borough") @ExcludeMissing borough: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extended_address")
            @ExcludeMissing
            extendedAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("neighborhood")
            @ExcludeMissing
            neighborhood: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("skip_address_verification")
            @ExcludeMissing
            skipAddressVerification: JsonField<String> = JsonMissing.of(),
        ) : this(
            businessName,
            countryCode,
            firstName,
            lastName,
            locality,
            streetAddress,
            administrativeArea,
            borough,
            customerReference,
            extendedAddress,
            neighborhood,
            phoneNumber,
            postalCode,
            skipAddressVerification,
            mutableMapOf(),
        )

        /**
         * The business name associated with the user address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessName(): String = businessName.getRequired("business_name")

        /**
         * The two-character (ISO 3166-1 alpha-2) country code of the user address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("country_code")

        /**
         * The first name associated with the user address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * The last name associated with the user address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

        /**
         * The locality of the user address. For US addresses, this corresponds to the city of the
         * address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The primary street address information about the user address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun streetAddress(): String = streetAddress.getRequired("street_address")

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
         * The borough of the user address. This field is not used for addresses in the US but is
         * used for some international addresses.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun borough(): Optional<String> = borough.getOptional("borough")

        /**
         * A customer reference string for customer look ups.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Additional street address information about the user address such as, but not limited to,
         * unit number or apartment number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

        /**
         * The neighborhood of the user address. This field is not used for addresses in the US but
         * is used for some international addresses.
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
         * An optional boolean value specifying if verification of the address should be skipped or
         * not. UserAddresses are generally used for shipping addresses, and failure to validate
         * your shipping address will likely result in a failure to deliver SIM cards or other items
         * ordered from Telnyx. Do not use this parameter unless you are sure that the address is
         * correct even though it cannot be validated. If this is set to any value other than true,
         * verification of the address will be attempted, and the user address will not be allowed
         * if verification fails. If verification fails but suggested values are available that
         * might make the address correct, they will be present in the response as well. If this
         * value is set to true, then the verification will not be attempted. Defaults to false
         * (verification will be performed).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skipAddressVerification(): Optional<String> =
            skipAddressVerification.getOptional("skip_address_verification")

        /**
         * Returns the raw JSON value of [businessName].
         *
         * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [streetAddress].
         *
         * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("street_address")
        @ExcludeMissing
        fun _streetAddress(): JsonField<String> = streetAddress

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
         * Returns the raw JSON value of [borough].
         *
         * Unlike [borough], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("borough") @ExcludeMissing fun _borough(): JsonField<String> = borough

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
         * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extended_address")
        @ExcludeMissing
        fun _extendedAddress(): JsonField<String> = extendedAddress

        /**
         * Returns the raw JSON value of [neighborhood].
         *
         * Unlike [neighborhood], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [skipAddressVerification].
         *
         * Unlike [skipAddressVerification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_address_verification")
        @ExcludeMissing
        fun _skipAddressVerification(): JsonField<String> = skipAddressVerification

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
             * .businessName()
             * .countryCode()
             * .firstName()
             * .lastName()
             * .locality()
             * .streetAddress()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var businessName: JsonField<String>? = null
            private var countryCode: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var streetAddress: JsonField<String>? = null
            private var administrativeArea: JsonField<String> = JsonMissing.of()
            private var borough: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var extendedAddress: JsonField<String> = JsonMissing.of()
            private var neighborhood: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var skipAddressVerification: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                businessName = body.businessName
                countryCode = body.countryCode
                firstName = body.firstName
                lastName = body.lastName
                locality = body.locality
                streetAddress = body.streetAddress
                administrativeArea = body.administrativeArea
                borough = body.borough
                customerReference = body.customerReference
                extendedAddress = body.extendedAddress
                neighborhood = body.neighborhood
                phoneNumber = body.phoneNumber
                postalCode = body.postalCode
                skipAddressVerification = body.skipAddressVerification
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The business name associated with the user address. */
            fun businessName(businessName: String) = businessName(JsonField.of(businessName))

            /**
             * Sets [Builder.businessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /** The two-character (ISO 3166-1 alpha-2) country code of the user address. */
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

            /** The first name associated with the user address. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The last name associated with the user address. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /**
             * The locality of the user address. For US addresses, this corresponds to the city of
             * the address.
             */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The primary street address information about the user address. */
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

            /**
             * The locality of the user address. For US addresses, this corresponds to the state of
             * the address.
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
             * The borough of the user address. This field is not used for addresses in the US but
             * is used for some international addresses.
             */
            fun borough(borough: String) = borough(JsonField.of(borough))

            /**
             * Sets [Builder.borough] to an arbitrary JSON value.
             *
             * You should usually call [Builder.borough] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun borough(borough: JsonField<String>) = apply { this.borough = borough }

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
             * Additional street address information about the user address such as, but not limited
             * to, unit number or apartment number.
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

            /**
             * The neighborhood of the user address. This field is not used for addresses in the US
             * but is used for some international addresses.
             */
            fun neighborhood(neighborhood: String) = neighborhood(JsonField.of(neighborhood))

            /**
             * Sets [Builder.neighborhood] to an arbitrary JSON value.
             *
             * You should usually call [Builder.neighborhood] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun neighborhood(neighborhood: JsonField<String>) = apply {
                this.neighborhood = neighborhood
            }

            /** The phone number associated with the user address. */
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

            /** The postal code of the user address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * An optional boolean value specifying if verification of the address should be skipped
             * or not. UserAddresses are generally used for shipping addresses, and failure to
             * validate your shipping address will likely result in a failure to deliver SIM cards
             * or other items ordered from Telnyx. Do not use this parameter unless you are sure
             * that the address is correct even though it cannot be validated. If this is set to any
             * value other than true, verification of the address will be attempted, and the user
             * address will not be allowed if verification fails. If verification fails but
             * suggested values are available that might make the address correct, they will be
             * present in the response as well. If this value is set to true, then the verification
             * will not be attempted. Defaults to false (verification will be performed).
             */
            fun skipAddressVerification(skipAddressVerification: String) =
                skipAddressVerification(JsonField.of(skipAddressVerification))

            /**
             * Sets [Builder.skipAddressVerification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipAddressVerification] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipAddressVerification(skipAddressVerification: JsonField<String>) = apply {
                this.skipAddressVerification = skipAddressVerification
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .businessName()
             * .countryCode()
             * .firstName()
             * .lastName()
             * .locality()
             * .streetAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("businessName", businessName),
                    checkRequired("countryCode", countryCode),
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    checkRequired("locality", locality),
                    checkRequired("streetAddress", streetAddress),
                    administrativeArea,
                    borough,
                    customerReference,
                    extendedAddress,
                    neighborhood,
                    phoneNumber,
                    postalCode,
                    skipAddressVerification,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            businessName()
            countryCode()
            firstName()
            lastName()
            locality()
            streetAddress()
            administrativeArea()
            borough()
            customerReference()
            extendedAddress()
            neighborhood()
            phoneNumber()
            postalCode()
            skipAddressVerification()
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
            (if (businessName.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (streetAddress.asKnown().isPresent) 1 else 0) +
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                (if (borough.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (extendedAddress.asKnown().isPresent) 1 else 0) +
                (if (neighborhood.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (skipAddressVerification.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                businessName == other.businessName &&
                countryCode == other.countryCode &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                locality == other.locality &&
                streetAddress == other.streetAddress &&
                administrativeArea == other.administrativeArea &&
                borough == other.borough &&
                customerReference == other.customerReference &&
                extendedAddress == other.extendedAddress &&
                neighborhood == other.neighborhood &&
                phoneNumber == other.phoneNumber &&
                postalCode == other.postalCode &&
                skipAddressVerification == other.skipAddressVerification &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                businessName,
                countryCode,
                firstName,
                lastName,
                locality,
                streetAddress,
                administrativeArea,
                borough,
                customerReference,
                extendedAddress,
                neighborhood,
                phoneNumber,
                postalCode,
                skipAddressVerification,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{businessName=$businessName, countryCode=$countryCode, firstName=$firstName, lastName=$lastName, locality=$locality, streetAddress=$streetAddress, administrativeArea=$administrativeArea, borough=$borough, customerReference=$customerReference, extendedAddress=$extendedAddress, neighborhood=$neighborhood, phoneNumber=$phoneNumber, postalCode=$postalCode, skipAddressVerification=$skipAddressVerification, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserAddressCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserAddressCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
