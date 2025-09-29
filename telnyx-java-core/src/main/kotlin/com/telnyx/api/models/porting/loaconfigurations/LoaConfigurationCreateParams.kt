// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.loaconfigurations

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

/** Create a LOA configuration. */
class LoaConfigurationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The address of the company.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): Address = body.address()

    /**
     * The name of the company
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun companyName(): String = body.companyName()

    /**
     * The contact information of the company.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contact(): Contact = body.contact()

    /**
     * The logo of the LOA configuration
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun logo(): Logo = body.logo()

    /**
     * The name of the LOA configuration
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<Address> = body._address()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [contact].
     *
     * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contact(): JsonField<Contact> = body._contact()

    /**
     * Returns the raw JSON value of [logo].
     *
     * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logo(): JsonField<Logo> = body._logo()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LoaConfigurationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .address()
         * .companyName()
         * .contact()
         * .logo()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LoaConfigurationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(loaConfigurationCreateParams: LoaConfigurationCreateParams) = apply {
            body = loaConfigurationCreateParams.body.toBuilder()
            additionalHeaders = loaConfigurationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = loaConfigurationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [address]
         * - [companyName]
         * - [contact]
         * - [logo]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The address of the company. */
        fun address(address: Address) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { body.address(address) }

        /** The name of the company */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** The contact information of the company. */
        fun contact(contact: Contact) = apply { body.contact(contact) }

        /**
         * Sets [Builder.contact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contact] with a well-typed [Contact] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contact(contact: JsonField<Contact>) = apply { body.contact(contact) }

        /** The logo of the LOA configuration */
        fun logo(logo: Logo) = apply { body.logo(logo) }

        /**
         * Sets [Builder.logo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logo] with a well-typed [Logo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logo(logo: JsonField<Logo>) = apply { body.logo(logo) }

        /** The name of the LOA configuration */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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
         * Returns an immutable instance of [LoaConfigurationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .address()
         * .companyName()
         * .contact()
         * .logo()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LoaConfigurationCreateParams =
            LoaConfigurationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** The parameters for creating a new LOA configuration. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val companyName: JsonField<String>,
        private val contact: JsonField<Contact>,
        private val logo: JsonField<Logo>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("company_name")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact") @ExcludeMissing contact: JsonField<Contact> = JsonMissing.of(),
            @JsonProperty("logo") @ExcludeMissing logo: JsonField<Logo> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, companyName, contact, logo, name, mutableMapOf())

        /**
         * The address of the company.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The name of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun companyName(): String = companyName.getRequired("company_name")

        /**
         * The contact information of the company.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contact(): Contact = contact.getRequired("contact")

        /**
         * The logo of the LOA configuration
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun logo(): Logo = logo.getRequired("logo")

        /**
         * The name of the LOA configuration
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [contact].
         *
         * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<Contact> = contact

        /**
         * Returns the raw JSON value of [logo].
         *
         * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<Logo> = logo

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * .address()
             * .companyName()
             * .contact()
             * .logo()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var companyName: JsonField<String>? = null
            private var contact: JsonField<Contact>? = null
            private var logo: JsonField<Logo>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                address = body.address
                companyName = body.companyName
                contact = body.contact
                logo = body.logo
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The address of the company. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The name of the company */
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

            /** The contact information of the company. */
            fun contact(contact: Contact) = contact(JsonField.of(contact))

            /**
             * Sets [Builder.contact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contact] with a well-typed [Contact] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

            /** The logo of the LOA configuration */
            fun logo(logo: Logo) = logo(JsonField.of(logo))

            /**
             * Sets [Builder.logo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logo] with a well-typed [Logo] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun logo(logo: JsonField<Logo>) = apply { this.logo = logo }

            /** The name of the LOA configuration */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * .address()
             * .companyName()
             * .contact()
             * .logo()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("address", address),
                    checkRequired("companyName", companyName),
                    checkRequired("contact", contact),
                    checkRequired("logo", logo),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            companyName()
            contact().validate()
            logo().validate()
            name()
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
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (contact.asKnown().getOrNull()?.validity() ?: 0) +
                (logo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                address == other.address &&
                companyName == other.companyName &&
                contact == other.contact &&
                logo == other.logo &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, companyName, contact, logo, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address=$address, companyName=$companyName, contact=$contact, logo=$logo, name=$name, additionalProperties=$additionalProperties}"
    }

    /** The address of the company. */
    class Address
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val state: JsonField<String>,
        private val streetAddress: JsonField<String>,
        private val zipCode: JsonField<String>,
        private val extendedAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_address")
            @ExcludeMissing
            streetAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip_code") @ExcludeMissing zipCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extended_address")
            @ExcludeMissing
            extendedAddress: JsonField<String> = JsonMissing.of(),
        ) : this(city, countryCode, state, streetAddress, zipCode, extendedAddress, mutableMapOf())

        /**
         * The locality of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The country code of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("country_code")

        /**
         * The administrative area of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * The street address of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun streetAddress(): String = streetAddress.getRequired("street_address")

        /**
         * The postal code of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun zipCode(): String = zipCode.getRequired("zip_code")

        /**
         * The extended address of the company
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
         * Returns the raw JSON value of [zipCode].
         *
         * Unlike [zipCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zip_code") @ExcludeMissing fun _zipCode(): JsonField<String> = zipCode

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
             * Returns a mutable builder for constructing an instance of [Address].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .countryCode()
             * .state()
             * .streetAddress()
             * .zipCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var countryCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var streetAddress: JsonField<String>? = null
            private var zipCode: JsonField<String>? = null
            private var extendedAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                city = address.city
                countryCode = address.countryCode
                state = address.state
                streetAddress = address.streetAddress
                zipCode = address.zipCode
                extendedAddress = address.extendedAddress
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            /** The locality of the company */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The country code of the company */
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

            /** The administrative area of the company */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The street address of the company */
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

            /** The postal code of the company */
            fun zipCode(zipCode: String) = zipCode(JsonField.of(zipCode))

            /**
             * Sets [Builder.zipCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zipCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zipCode(zipCode: JsonField<String>) = apply { this.zipCode = zipCode }

            /** The extended address of the company */
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
             * Returns an immutable instance of [Address].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .city()
             * .countryCode()
             * .state()
             * .streetAddress()
             * .zipCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Address =
                Address(
                    checkRequired("city", city),
                    checkRequired("countryCode", countryCode),
                    checkRequired("state", state),
                    checkRequired("streetAddress", streetAddress),
                    checkRequired("zipCode", zipCode),
                    extendedAddress,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            city()
            countryCode()
            state()
            streetAddress()
            zipCode()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (streetAddress.asKnown().isPresent) 1 else 0) +
                (if (zipCode.asKnown().isPresent) 1 else 0) +
                (if (extendedAddress.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                city == other.city &&
                countryCode == other.countryCode &&
                state == other.state &&
                streetAddress == other.streetAddress &&
                zipCode == other.zipCode &&
                extendedAddress == other.extendedAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                city,
                countryCode,
                state,
                streetAddress,
                zipCode,
                extendedAddress,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{city=$city, countryCode=$countryCode, state=$state, streetAddress=$streetAddress, zipCode=$zipCode, extendedAddress=$extendedAddress, additionalProperties=$additionalProperties}"
    }

    /** The contact information of the company. */
    class Contact
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val email: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(email, phoneNumber, mutableMapOf())

        /**
         * The email address of the contact
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * The phone number of the contact
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
             * Returns a mutable builder for constructing an instance of [Contact].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .phoneNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Contact]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var phoneNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contact: Contact) = apply {
                email = contact.email
                phoneNumber = contact.phoneNumber
                additionalProperties = contact.additionalProperties.toMutableMap()
            }

            /** The email address of the contact */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The phone number of the contact */
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
             * Returns an immutable instance of [Contact].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .email()
             * .phoneNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Contact =
                Contact(
                    checkRequired("email", email),
                    checkRequired("phoneNumber", phoneNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Contact = apply {
            if (validated) {
                return@apply
            }

            email()
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
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Contact &&
                email == other.email &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(email, phoneNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Contact{email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** The logo of the LOA configuration */
    class Logo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_id")
            @ExcludeMissing
            documentId: JsonField<String> = JsonMissing.of()
        ) : this(documentId, mutableMapOf())

        /**
         * The document identification
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentId(): String = documentId.getRequired("document_id")

        /**
         * Returns the raw JSON value of [documentId].
         *
         * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

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
             * Returns a mutable builder for constructing an instance of [Logo].
             *
             * The following fields are required:
             * ```java
             * .documentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Logo]. */
        class Builder internal constructor() {

            private var documentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(logo: Logo) = apply {
                documentId = logo.documentId
                additionalProperties = logo.additionalProperties.toMutableMap()
            }

            /** The document identification */
            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            /**
             * Sets [Builder.documentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

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
             * Returns an immutable instance of [Logo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Logo =
                Logo(checkRequired("documentId", documentId), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Logo = apply {
            if (validated) {
                return@apply
            }

            documentId()
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
        @JvmSynthetic internal fun validity(): Int = (if (documentId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Logo &&
                documentId == other.documentId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(documentId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Logo{documentId=$documentId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoaConfigurationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LoaConfigurationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
