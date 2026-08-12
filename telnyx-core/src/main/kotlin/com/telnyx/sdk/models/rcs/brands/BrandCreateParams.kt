// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates an editable RCS brand draft. Creating the draft does not begin external review. */
class BrandCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addresses(): Addresses = body.addresses()

    /**
     * Named business contacts. Use the `brand` key for the required BRAND contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contacts(): Contacts = body.contacts()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * Named business identifiers. Use the `ein` key for the required EIN and `stock_symbol` for a
     * public-profit brand's stock symbol.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifiers(): Identifiers = body.identifiers()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalEntityType(): BrandLegalEntityType = body.legalEntityType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = body.legalName()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationType(): BrandOrganizationType = body.organizationType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun websiteUrl(): String = body.websiteUrl()

    /**
     * A Messaging Profile owned by the authenticated organization. Agents inherit this value when
     * they do not provide their own profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileId(): Optional<String> = body.profileId()

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addresses(): JsonField<Addresses> = body._addresses()

    /**
     * Returns the raw JSON value of [contacts].
     *
     * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contacts(): JsonField<Contacts> = body._contacts()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [identifiers].
     *
     * Unlike [identifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _identifiers(): JsonField<Identifiers> = body._identifiers()

    /**
     * Returns the raw JSON value of [legalEntityType].
     *
     * Unlike [legalEntityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalEntityType(): JsonField<BrandLegalEntityType> = body._legalEntityType()

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalName(): JsonField<String> = body._legalName()

    /**
     * Returns the raw JSON value of [organizationType].
     *
     * Unlike [organizationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _organizationType(): JsonField<BrandOrganizationType> = body._organizationType()

    /**
     * Returns the raw JSON value of [websiteUrl].
     *
     * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _websiteUrl(): JsonField<String> = body._websiteUrl()

    /**
     * Returns the raw JSON value of [profileId].
     *
     * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _profileId(): JsonField<String> = body._profileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandCreateParams].
         *
         * The following fields are required:
         * ```java
         * .addresses()
         * .contacts()
         * .displayName()
         * .identifiers()
         * .legalEntityType()
         * .legalName()
         * .organizationType()
         * .websiteUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandCreateParams: BrandCreateParams) = apply {
            body = brandCreateParams.body.toBuilder()
            additionalHeaders = brandCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addresses]
         * - [contacts]
         * - [displayName]
         * - [identifiers]
         * - [legalEntityType]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun addresses(addresses: Addresses) = apply { body.addresses(addresses) }

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed [Addresses] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addresses(addresses: JsonField<Addresses>) = apply { body.addresses(addresses) }

        /** Named business contacts. Use the `brand` key for the required BRAND contact. */
        fun contacts(contacts: Contacts) = apply { body.contacts(contacts) }

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed [Contacts] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contacts(contacts: JsonField<Contacts>) = apply { body.contacts(contacts) }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /**
         * Named business identifiers. Use the `ein` key for the required EIN and `stock_symbol` for
         * a public-profit brand's stock symbol.
         */
        fun identifiers(identifiers: Identifiers) = apply { body.identifiers(identifiers) }

        /**
         * Sets [Builder.identifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifiers] with a well-typed [Identifiers] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun identifiers(identifiers: JsonField<Identifiers>) = apply {
            body.identifiers(identifiers)
        }

        fun legalEntityType(legalEntityType: BrandLegalEntityType) = apply {
            body.legalEntityType(legalEntityType)
        }

        /**
         * Sets [Builder.legalEntityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityType] with a well-typed
         * [BrandLegalEntityType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun legalEntityType(legalEntityType: JsonField<BrandLegalEntityType>) = apply {
            body.legalEntityType(legalEntityType)
        }

        fun legalName(legalName: String) = apply { body.legalName(legalName) }

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { body.legalName(legalName) }

        fun organizationType(organizationType: BrandOrganizationType) = apply {
            body.organizationType(organizationType)
        }

        /**
         * Sets [Builder.organizationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationType] with a well-typed
         * [BrandOrganizationType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun organizationType(organizationType: JsonField<BrandOrganizationType>) = apply {
            body.organizationType(organizationType)
        }

        fun websiteUrl(websiteUrl: String) = apply { body.websiteUrl(websiteUrl) }

        /**
         * Sets [Builder.websiteUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websiteUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun websiteUrl(websiteUrl: JsonField<String>) = apply { body.websiteUrl(websiteUrl) }

        /**
         * A Messaging Profile owned by the authenticated organization. Agents inherit this value
         * when they do not provide their own profile.
         */
        fun profileId(profileId: String?) = apply { body.profileId(profileId) }

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        /**
         * Sets [Builder.profileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileId(profileId: JsonField<String>) = apply { body.profileId(profileId) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [BrandCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .addresses()
         * .contacts()
         * .displayName()
         * .identifiers()
         * .legalEntityType()
         * .legalName()
         * .organizationType()
         * .websiteUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandCreateParams =
            BrandCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addresses: JsonField<Addresses>,
        private val contacts: JsonField<Contacts>,
        private val displayName: JsonField<String>,
        private val identifiers: JsonField<Identifiers>,
        private val legalEntityType: JsonField<BrandLegalEntityType>,
        private val legalName: JsonField<String>,
        private val organizationType: JsonField<BrandOrganizationType>,
        private val websiteUrl: JsonField<String>,
        private val profileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addresses")
            @ExcludeMissing
            addresses: JsonField<Addresses> = JsonMissing.of(),
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<Contacts> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identifiers")
            @ExcludeMissing
            identifiers: JsonField<Identifiers> = JsonMissing.of(),
            @JsonProperty("legal_entity_type")
            @ExcludeMissing
            legalEntityType: JsonField<BrandLegalEntityType> = JsonMissing.of(),
            @JsonProperty("legal_name")
            @ExcludeMissing
            legalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization_type")
            @ExcludeMissing
            organizationType: JsonField<BrandOrganizationType> = JsonMissing.of(),
            @JsonProperty("website_url")
            @ExcludeMissing
            websiteUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("profile_id")
            @ExcludeMissing
            profileId: JsonField<String> = JsonMissing.of(),
        ) : this(
            addresses,
            contacts,
            displayName,
            identifiers,
            legalEntityType,
            legalName,
            organizationType,
            websiteUrl,
            profileId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addresses(): Addresses = addresses.getRequired("addresses")

        /**
         * Named business contacts. Use the `brand` key for the required BRAND contact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contacts(): Contacts = contacts.getRequired("contacts")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * Named business identifiers. Use the `ein` key for the required EIN and `stock_symbol` for
         * a public-profit brand's stock symbol.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun identifiers(): Identifiers = identifiers.getRequired("identifiers")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalEntityType(): BrandLegalEntityType =
            legalEntityType.getRequired("legal_entity_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalName(): String = legalName.getRequired("legal_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationType(): BrandOrganizationType =
            organizationType.getRequired("organization_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun websiteUrl(): String = websiteUrl.getRequired("website_url")

        /**
         * A Messaging Profile owned by the authenticated organization. Agents inherit this value
         * when they do not provide their own profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileId(): Optional<String> = profileId.getOptional("profile_id")

        /**
         * Returns the raw JSON value of [addresses].
         *
         * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<Addresses> = addresses

        /**
         * Returns the raw JSON value of [contacts].
         *
         * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contacts") @ExcludeMissing fun _contacts(): JsonField<Contacts> = contacts

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [identifiers].
         *
         * Unlike [identifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifiers")
        @ExcludeMissing
        fun _identifiers(): JsonField<Identifiers> = identifiers

        /**
         * Returns the raw JSON value of [legalEntityType].
         *
         * Unlike [legalEntityType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        fun _legalEntityType(): JsonField<BrandLegalEntityType> = legalEntityType

        /**
         * Returns the raw JSON value of [legalName].
         *
         * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

        /**
         * Returns the raw JSON value of [organizationType].
         *
         * Unlike [organizationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_type")
        @ExcludeMissing
        fun _organizationType(): JsonField<BrandOrganizationType> = organizationType

        /**
         * Returns the raw JSON value of [websiteUrl].
         *
         * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website_url")
        @ExcludeMissing
        fun _websiteUrl(): JsonField<String> = websiteUrl

        /**
         * Returns the raw JSON value of [profileId].
         *
         * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

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
             * .addresses()
             * .contacts()
             * .displayName()
             * .identifiers()
             * .legalEntityType()
             * .legalName()
             * .organizationType()
             * .websiteUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addresses: JsonField<Addresses>? = null
            private var contacts: JsonField<Contacts>? = null
            private var displayName: JsonField<String>? = null
            private var identifiers: JsonField<Identifiers>? = null
            private var legalEntityType: JsonField<BrandLegalEntityType>? = null
            private var legalName: JsonField<String>? = null
            private var organizationType: JsonField<BrandOrganizationType>? = null
            private var websiteUrl: JsonField<String>? = null
            private var profileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addresses = body.addresses
                contacts = body.contacts
                displayName = body.displayName
                identifiers = body.identifiers
                legalEntityType = body.legalEntityType
                legalName = body.legalName
                organizationType = body.organizationType
                websiteUrl = body.websiteUrl
                profileId = body.profileId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun addresses(addresses: Addresses) = addresses(JsonField.of(addresses))

            /**
             * Sets [Builder.addresses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addresses] with a well-typed [Addresses] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addresses(addresses: JsonField<Addresses>) = apply { this.addresses = addresses }

            /** Named business contacts. Use the `brand` key for the required BRAND contact. */
            fun contacts(contacts: Contacts) = contacts(JsonField.of(contacts))

            /**
             * Sets [Builder.contacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contacts] with a well-typed [Contacts] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contacts(contacts: JsonField<Contacts>) = apply { this.contacts = contacts }

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

            /**
             * Named business identifiers. Use the `ein` key for the required EIN and `stock_symbol`
             * for a public-profit brand's stock symbol.
             */
            fun identifiers(identifiers: Identifiers) = identifiers(JsonField.of(identifiers))

            /**
             * Sets [Builder.identifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifiers] with a well-typed [Identifiers] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifiers(identifiers: JsonField<Identifiers>) = apply {
                this.identifiers = identifiers
            }

            fun legalEntityType(legalEntityType: BrandLegalEntityType) =
                legalEntityType(JsonField.of(legalEntityType))

            /**
             * Sets [Builder.legalEntityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalEntityType] with a well-typed
             * [BrandLegalEntityType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun legalEntityType(legalEntityType: JsonField<BrandLegalEntityType>) = apply {
                this.legalEntityType = legalEntityType
            }

            fun legalName(legalName: String) = legalName(JsonField.of(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

            fun organizationType(organizationType: BrandOrganizationType) =
                organizationType(JsonField.of(organizationType))

            /**
             * Sets [Builder.organizationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationType] with a well-typed
             * [BrandOrganizationType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun organizationType(organizationType: JsonField<BrandOrganizationType>) = apply {
                this.organizationType = organizationType
            }

            fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

            /**
             * Sets [Builder.websiteUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.websiteUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

            /**
             * A Messaging Profile owned by the authenticated organization. Agents inherit this
             * value when they do not provide their own profile.
             */
            fun profileId(profileId: String?) = profileId(JsonField.ofNullable(profileId))

            /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
            fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

            /**
             * Sets [Builder.profileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

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
             * .addresses()
             * .contacts()
             * .displayName()
             * .identifiers()
             * .legalEntityType()
             * .legalName()
             * .organizationType()
             * .websiteUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("addresses", addresses),
                    checkRequired("contacts", contacts),
                    checkRequired("displayName", displayName),
                    checkRequired("identifiers", identifiers),
                    checkRequired("legalEntityType", legalEntityType),
                    checkRequired("legalName", legalName),
                    checkRequired("organizationType", organizationType),
                    checkRequired("websiteUrl", websiteUrl),
                    profileId,
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

            addresses().validate()
            contacts().validate()
            displayName()
            identifiers().validate()
            legalEntityType().validate()
            legalName()
            organizationType().validate()
            websiteUrl()
            profileId()
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
            (addresses.asKnown().getOrNull()?.validity() ?: 0) +
                (contacts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (identifiers.asKnown().getOrNull()?.validity() ?: 0) +
                (legalEntityType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (legalName.asKnown().isPresent) 1 else 0) +
                (organizationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (websiteUrl.asKnown().isPresent) 1 else 0) +
                (if (profileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addresses == other.addresses &&
                contacts == other.contacts &&
                displayName == other.displayName &&
                identifiers == other.identifiers &&
                legalEntityType == other.legalEntityType &&
                legalName == other.legalName &&
                organizationType == other.organizationType &&
                websiteUrl == other.websiteUrl &&
                profileId == other.profileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addresses,
                contacts,
                displayName,
                identifiers,
                legalEntityType,
                legalName,
                organizationType,
                websiteUrl,
                profileId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addresses=$addresses, contacts=$contacts, displayName=$displayName, identifiers=$identifiers, legalEntityType=$legalEntityType, legalName=$legalName, organizationType=$organizationType, websiteUrl=$websiteUrl, profileId=$profileId, additionalProperties=$additionalProperties}"
    }

    class Addresses
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Addresses]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Addresses]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addresses: Addresses) = apply {
                additionalProperties = addresses.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Addresses].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Addresses = Addresses(additionalProperties.toImmutable())
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
        fun validate(): Addresses = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addresses && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Addresses{additionalProperties=$additionalProperties}"
    }

    /** Named business contacts. Use the `brand` key for the required BRAND contact. */
    class Contacts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val brand: JsonField<Brand>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand") @ExcludeMissing brand: JsonField<Brand> = JsonMissing.of()
        ) : this(brand, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brand(): Brand = brand.getRequired("brand")

        /**
         * Returns the raw JSON value of [brand].
         *
         * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<Brand> = brand

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
             * Returns a mutable builder for constructing an instance of [Contacts].
             *
             * The following fields are required:
             * ```java
             * .brand()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Contacts]. */
        class Builder internal constructor() {

            private var brand: JsonField<Brand>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contacts: Contacts) = apply {
                brand = contacts.brand
                additionalProperties = contacts.additionalProperties.toMutableMap()
            }

            fun brand(brand: Brand) = brand(JsonField.of(brand))

            /**
             * Sets [Builder.brand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brand] with a well-typed [Brand] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun brand(brand: JsonField<Brand>) = apply { this.brand = brand }

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
             * Returns an immutable instance of [Contacts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .brand()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Contacts =
                Contacts(checkRequired("brand", brand), additionalProperties.toMutableMap())
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
        fun validate(): Contacts = apply {
            if (validated) {
                return@apply
            }

            brand().validate()
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
        @JvmSynthetic internal fun validity(): Int = (brand.asKnown().getOrNull()?.validity() ?: 0)

        class Brand
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contactType: JsonField<BrandContact.ContactType>,
            private val email: JsonField<String>,
            private val firstName: JsonField<String>,
            private val lastName: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contact_type")
                @ExcludeMissing
                contactType: JsonField<BrandContact.ContactType> = JsonMissing.of(),
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
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(contactType, email, firstName, lastName, phoneNumber, title, mutableMapOf())

            fun toBrandContact(): BrandContact =
                BrandContact.builder()
                    .contactType(contactType)
                    .email(email)
                    .firstName(firstName)
                    .lastName(lastName)
                    .phoneNumber(phoneNumber)
                    .title(title)
                    .build()

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contactType(): BrandContact.ContactType = contactType.getRequired("contact_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun firstName(): String = firstName.getRequired("first_name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lastName(): String = lastName.getRequired("last_name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [contactType].
             *
             * Unlike [contactType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contact_type")
            @ExcludeMissing
            fun _contactType(): JsonField<BrandContact.ContactType> = contactType

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [firstName].
             *
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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

                /**
                 * Returns a mutable builder for constructing an instance of [Brand].
                 *
                 * The following fields are required:
                 * ```java
                 * .contactType()
                 * .email()
                 * .firstName()
                 * .lastName()
                 * .phoneNumber()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Brand]. */
            class Builder internal constructor() {

                private var contactType: JsonField<BrandContact.ContactType>? = null
                private var email: JsonField<String>? = null
                private var firstName: JsonField<String>? = null
                private var lastName: JsonField<String>? = null
                private var phoneNumber: JsonField<String>? = null
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(brand: Brand) = apply {
                    contactType = brand.contactType
                    email = brand.email
                    firstName = brand.firstName
                    lastName = brand.lastName
                    phoneNumber = brand.phoneNumber
                    title = brand.title
                    additionalProperties = brand.additionalProperties.toMutableMap()
                }

                fun contactType(contactType: BrandContact.ContactType) =
                    contactType(JsonField.of(contactType))

                /**
                 * Sets [Builder.contactType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactType] with a well-typed
                 * [BrandContact.ContactType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun contactType(contactType: JsonField<BrandContact.ContactType>) = apply {
                    this.contactType = contactType
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

                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /**
                 * Sets [Builder.firstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun title(title: String?) = title(JsonField.ofNullable(title))

                /** Alias for calling [Builder.title] with `title.orElse(null)`. */
                fun title(title: Optional<String>) = title(title.getOrNull())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Brand].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contactType()
                 * .email()
                 * .firstName()
                 * .lastName()
                 * .phoneNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Brand =
                    Brand(
                        checkRequired("contactType", contactType),
                        checkRequired("email", email),
                        checkRequired("firstName", firstName),
                        checkRequired("lastName", lastName),
                        checkRequired("phoneNumber", phoneNumber),
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Brand = apply {
                if (validated) {
                    return@apply
                }

                contactType().validate()
                email()
                firstName()
                lastName()
                phoneNumber()
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
                (contactType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (email.asKnown().isPresent) 1 else 0) +
                    (if (firstName.asKnown().isPresent) 1 else 0) +
                    (if (lastName.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            class ContactType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BRAND = of("BRAND")

                    @JvmStatic fun of(value: String) = ContactType(JsonField.of(value))
                }

                /** An enum containing [ContactType]'s known values. */
                enum class Known {
                    BRAND
                }

                /**
                 * An enum containing [ContactType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ContactType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BRAND,
                    /**
                     * An enum member indicating that [ContactType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BRAND -> Value.BRAND
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BRAND -> Known.BRAND
                        else -> throw TelnyxInvalidDataException("Unknown ContactType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ContactType = apply {
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

                    return other is ContactType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Brand &&
                    contactType == other.contactType &&
                    email == other.email &&
                    firstName == other.firstName &&
                    lastName == other.lastName &&
                    phoneNumber == other.phoneNumber &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    contactType,
                    email,
                    firstName,
                    lastName,
                    phoneNumber,
                    title,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Brand{contactType=$contactType, email=$email, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Contacts &&
                brand == other.brand &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(brand, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Contacts{brand=$brand, additionalProperties=$additionalProperties}"
    }

    /**
     * Named business identifiers. Use the `ein` key for the required EIN and `stock_symbol` for a
     * public-profit brand's stock symbol.
     */
    class Identifiers
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ein: JsonField<EinBrandIdentifier>,
        private val stockSymbol: JsonField<StockSymbolBrandIdentifier>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ein")
            @ExcludeMissing
            ein: JsonField<EinBrandIdentifier> = JsonMissing.of(),
            @JsonProperty("stock_symbol")
            @ExcludeMissing
            stockSymbol: JsonField<StockSymbolBrandIdentifier> = JsonMissing.of(),
        ) : this(ein, stockSymbol, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ein(): EinBrandIdentifier = ein.getRequired("ein")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stockSymbol(): Optional<StockSymbolBrandIdentifier> =
            stockSymbol.getOptional("stock_symbol")

        /**
         * Returns the raw JSON value of [ein].
         *
         * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<EinBrandIdentifier> = ein

        /**
         * Returns the raw JSON value of [stockSymbol].
         *
         * Unlike [stockSymbol], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stock_symbol")
        @ExcludeMissing
        fun _stockSymbol(): JsonField<StockSymbolBrandIdentifier> = stockSymbol

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
             * Returns a mutable builder for constructing an instance of [Identifiers].
             *
             * The following fields are required:
             * ```java
             * .ein()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Identifiers]. */
        class Builder internal constructor() {

            private var ein: JsonField<EinBrandIdentifier>? = null
            private var stockSymbol: JsonField<StockSymbolBrandIdentifier> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(identifiers: Identifiers) = apply {
                ein = identifiers.ein
                stockSymbol = identifiers.stockSymbol
                additionalProperties = identifiers.additionalProperties.toMutableMap()
            }

            fun ein(ein: EinBrandIdentifier) = ein(JsonField.of(ein))

            /**
             * Sets [Builder.ein] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ein] with a well-typed [EinBrandIdentifier] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ein(ein: JsonField<EinBrandIdentifier>) = apply { this.ein = ein }

            fun stockSymbol(stockSymbol: StockSymbolBrandIdentifier) =
                stockSymbol(JsonField.of(stockSymbol))

            /**
             * Sets [Builder.stockSymbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stockSymbol] with a well-typed
             * [StockSymbolBrandIdentifier] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun stockSymbol(stockSymbol: JsonField<StockSymbolBrandIdentifier>) = apply {
                this.stockSymbol = stockSymbol
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
             * Returns an immutable instance of [Identifiers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .ein()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Identifiers =
                Identifiers(
                    checkRequired("ein", ein),
                    stockSymbol,
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
        fun validate(): Identifiers = apply {
            if (validated) {
                return@apply
            }

            ein().validate()
            stockSymbol().ifPresent { it.validate() }
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
            (ein.asKnown().getOrNull()?.validity() ?: 0) +
                (stockSymbol.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Identifiers &&
                ein == other.ein &&
                stockSymbol == other.stockSymbol &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(ein, stockSymbol, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Identifiers{ein=$ein, stockSymbol=$stockSymbol, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
