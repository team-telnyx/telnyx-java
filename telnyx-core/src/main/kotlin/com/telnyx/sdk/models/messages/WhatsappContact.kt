// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WhatsappContact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addresses: JsonField<List<Address>>,
    private val birthday: JsonField<String>,
    private val emails: JsonField<List<Email>>,
    private val name: JsonField<String>,
    private val org: JsonField<Org>,
    private val phones: JsonField<List<Phone>>,
    private val urls: JsonField<List<Url>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        addresses: JsonField<List<Address>> = JsonMissing.of(),
        @JsonProperty("birthday") @ExcludeMissing birthday: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emails") @ExcludeMissing emails: JsonField<List<Email>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org") @ExcludeMissing org: JsonField<Org> = JsonMissing.of(),
        @JsonProperty("phones") @ExcludeMissing phones: JsonField<List<Phone>> = JsonMissing.of(),
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<Url>> = JsonMissing.of(),
    ) : this(addresses, birthday, emails, name, org, phones, urls, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addresses(): Optional<List<Address>> = addresses.getOptional("addresses")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun birthday(): Optional<String> = birthday.getOptional("birthday")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emails(): Optional<List<Email>> = emails.getOptional("emails")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun org(): Optional<Org> = org.getOptional("org")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phones(): Optional<List<Phone>> = phones.getOptional("phones")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urls(): Optional<List<Url>> = urls.getOptional("urls")

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addresses")
    @ExcludeMissing
    fun _addresses(): JsonField<List<Address>> = addresses

    /**
     * Returns the raw JSON value of [birthday].
     *
     * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("birthday") @ExcludeMissing fun _birthday(): JsonField<String> = birthday

    /**
     * Returns the raw JSON value of [emails].
     *
     * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<Email>> = emails

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [org].
     *
     * Unlike [org], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org") @ExcludeMissing fun _org(): JsonField<Org> = org

    /**
     * Returns the raw JSON value of [phones].
     *
     * Unlike [phones], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phones") @ExcludeMissing fun _phones(): JsonField<List<Phone>> = phones

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<Url>> = urls

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

        /** Returns a mutable builder for constructing an instance of [WhatsappContact]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappContact]. */
    class Builder internal constructor() {

        private var addresses: JsonField<MutableList<Address>>? = null
        private var birthday: JsonField<String> = JsonMissing.of()
        private var emails: JsonField<MutableList<Email>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var org: JsonField<Org> = JsonMissing.of()
        private var phones: JsonField<MutableList<Phone>>? = null
        private var urls: JsonField<MutableList<Url>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappContact: WhatsappContact) = apply {
            addresses = whatsappContact.addresses.map { it.toMutableList() }
            birthday = whatsappContact.birthday
            emails = whatsappContact.emails.map { it.toMutableList() }
            name = whatsappContact.name
            org = whatsappContact.org
            phones = whatsappContact.phones.map { it.toMutableList() }
            urls = whatsappContact.urls.map { it.toMutableList() }
            additionalProperties = whatsappContact.additionalProperties.toMutableMap()
        }

        fun addresses(addresses: List<Address>) = addresses(JsonField.of(addresses))

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed `List<Address>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addresses(addresses: JsonField<List<Address>>) = apply {
            this.addresses = addresses.map { it.toMutableList() }
        }

        /**
         * Adds a single [Address] to [addresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddress(address: Address) = apply {
            addresses =
                (addresses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addresses", it).add(address)
                }
        }

        fun birthday(birthday: String) = birthday(JsonField.of(birthday))

        /**
         * Sets [Builder.birthday] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthday] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun birthday(birthday: JsonField<String>) = apply { this.birthday = birthday }

        fun emails(emails: List<Email>) = emails(JsonField.of(emails))

        /**
         * Sets [Builder.emails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emails] with a well-typed `List<Email>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emails(emails: JsonField<List<Email>>) = apply {
            this.emails = emails.map { it.toMutableList() }
        }

        /**
         * Adds a single [Email] to [emails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmail(email: Email) = apply {
            emails =
                (emails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("emails", it).add(email)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun org(org: Org) = org(JsonField.of(org))

        /**
         * Sets [Builder.org] to an arbitrary JSON value.
         *
         * You should usually call [Builder.org] with a well-typed [Org] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun org(org: JsonField<Org>) = apply { this.org = org }

        fun phones(phones: List<Phone>) = phones(JsonField.of(phones))

        /**
         * Sets [Builder.phones] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phones] with a well-typed `List<Phone>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phones(phones: JsonField<List<Phone>>) = apply {
            this.phones = phones.map { it.toMutableList() }
        }

        /**
         * Adds a single [Phone] to [phones].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhone(phone: Phone) = apply {
            phones =
                (phones ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phones", it).add(phone)
                }
        }

        fun urls(urls: List<Url>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<Url>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun urls(urls: JsonField<List<Url>>) = apply { this.urls = urls.map { it.toMutableList() } }

        /**
         * Adds a single [Url] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: Url) = apply {
            urls = (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
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
         * Returns an immutable instance of [WhatsappContact].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WhatsappContact =
            WhatsappContact(
                (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                birthday,
                (emails ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                org,
                (phones ?: JsonMissing.of()).map { it.toImmutable() },
                (urls ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WhatsappContact = apply {
        if (validated) {
            return@apply
        }

        addresses().ifPresent { it.forEach { it.validate() } }
        birthday()
        emails().ifPresent { it.forEach { it.validate() } }
        name()
        org().ifPresent { it.validate() }
        phones().ifPresent { it.forEach { it.validate() } }
        urls().ifPresent { it.forEach { it.validate() } }
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
        (addresses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (birthday.asKnown().isPresent) 1 else 0) +
            (emails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (org.asKnown().getOrNull()?.validity() ?: 0) +
            (phones.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (urls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Address
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val state: JsonField<String>,
        private val street: JsonField<String>,
        private val type: JsonField<String>,
        private val zip: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
        ) : this(city, country, countryCode, state, street, type, zip, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun street(): Optional<String> = street.getOptional("street")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun zip(): Optional<String> = zip.getOptional("zip")

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
         * Returns the raw JSON value of [street].
         *
         * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [zip].
         *
         * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

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

            /** Returns a mutable builder for constructing an instance of [Address]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var street: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var zip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                city = address.city
                country = address.country
                countryCode = address.countryCode
                state = address.state
                street = address.street
                type = address.type
                zip = address.zip
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun street(street: String) = street(JsonField.of(street))

            /**
             * Sets [Builder.street] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street(street: JsonField<String>) = apply { this.street = street }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun zip(zip: String) = zip(JsonField.of(zip))

            /**
             * Sets [Builder.zip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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
             */
            fun build(): Address =
                Address(
                    city,
                    country,
                    countryCode,
                    state,
                    street,
                    type,
                    zip,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            countryCode()
            state()
            street()
            type()
            zip()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (street.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (zip.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                city == other.city &&
                country == other.country &&
                countryCode == other.countryCode &&
                state == other.state &&
                street == other.street &&
                type == other.type &&
                zip == other.zip &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, country, countryCode, state, street, type, zip, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{city=$city, country=$country, countryCode=$countryCode, state=$state, street=$street, type=$type, zip=$zip, additionalProperties=$additionalProperties}"
    }

    class Email
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val email: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(email, type, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [Email]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Email]. */
        class Builder internal constructor() {

            private var email: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(email: Email) = apply {
                this.email = email.email
                type = email.type
                additionalProperties = email.additionalProperties.toMutableMap()
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Email].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Email = Email(email, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Email = apply {
            if (validated) {
                return@apply
            }

            email()
            type()
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
            (if (email.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Email &&
                email == other.email &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(email, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Email{email=$email, type=$type, additionalProperties=$additionalProperties}"
    }

    class Org
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val company: JsonField<String>,
        private val department: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("company") @ExcludeMissing company: JsonField<String> = JsonMissing.of(),
            @JsonProperty("department")
            @ExcludeMissing
            department: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(company, department, title, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun company(): Optional<String> = company.getOptional("company")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun department(): Optional<String> = department.getOptional("department")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [company].
         *
         * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<String> = company

        /**
         * Returns the raw JSON value of [department].
         *
         * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("department")
        @ExcludeMissing
        fun _department(): JsonField<String> = department

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Org]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Org]. */
        class Builder internal constructor() {

            private var company: JsonField<String> = JsonMissing.of()
            private var department: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(org: Org) = apply {
                company = org.company
                department = org.department
                title = org.title
                additionalProperties = org.additionalProperties.toMutableMap()
            }

            fun company(company: String) = company(JsonField.of(company))

            /**
             * Sets [Builder.company] to an arbitrary JSON value.
             *
             * You should usually call [Builder.company] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun company(company: JsonField<String>) = apply { this.company = company }

            fun department(department: String) = department(JsonField.of(department))

            /**
             * Sets [Builder.department] to an arbitrary JSON value.
             *
             * You should usually call [Builder.department] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun department(department: JsonField<String>) = apply { this.department = department }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Org].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Org = Org(company, department, title, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Org = apply {
            if (validated) {
                return@apply
            }

            company()
            department()
            title()
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
            (if (company.asKnown().isPresent) 1 else 0) +
                (if (department.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Org &&
                company == other.company &&
                department == other.department &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(company, department, title, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Org{company=$company, department=$department, title=$title, additionalProperties=$additionalProperties}"
    }

    class Phone
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phone: JsonField<String>,
        private val type: JsonField<String>,
        private val waId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wa_id") @ExcludeMissing waId: JsonField<String> = JsonMissing.of(),
        ) : this(phone, type, waId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phone(): Optional<String> = phone.getOptional("phone")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun waId(): Optional<String> = waId.getOptional("wa_id")

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [waId].
         *
         * Unlike [waId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wa_id") @ExcludeMissing fun _waId(): JsonField<String> = waId

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

            /** Returns a mutable builder for constructing an instance of [Phone]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Phone]. */
        class Builder internal constructor() {

            private var phone: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var waId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phone: Phone) = apply {
                this.phone = phone.phone
                type = phone.type
                waId = phone.waId
                additionalProperties = phone.additionalProperties.toMutableMap()
            }

            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun waId(waId: String) = waId(JsonField.of(waId))

            /**
             * Sets [Builder.waId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waId] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun waId(waId: JsonField<String>) = apply { this.waId = waId }

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
             * Returns an immutable instance of [Phone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Phone = Phone(phone, type, waId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Phone = apply {
            if (validated) {
                return@apply
            }

            phone()
            type()
            waId()
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
            (if (phone.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (waId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Phone &&
                phone == other.phone &&
                type == other.type &&
                waId == other.waId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(phone, type, waId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Phone{phone=$phone, type=$type, waId=$waId, additionalProperties=$additionalProperties}"
    }

    class Url
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(type, url, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Url]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Url]. */
        class Builder internal constructor() {

            private var type: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(url: Url) = apply {
                type = url.type
                this.url = url.url
                additionalProperties = url.additionalProperties.toMutableMap()
            }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Url].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Url = Url(type, url, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Url = apply {
            if (validated) {
                return@apply
            }

            type()
            url()
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
            (if (type.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Url &&
                type == other.type &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, url, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Url{type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappContact &&
            addresses == other.addresses &&
            birthday == other.birthday &&
            emails == other.emails &&
            name == other.name &&
            org == other.org &&
            phones == other.phones &&
            urls == other.urls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(addresses, birthday, emails, name, org, phones, urls, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappContact{addresses=$addresses, birthday=$birthday, emails=$emails, name=$name, org=$org, phones=$phones, urls=$urls, additionalProperties=$additionalProperties}"
}
