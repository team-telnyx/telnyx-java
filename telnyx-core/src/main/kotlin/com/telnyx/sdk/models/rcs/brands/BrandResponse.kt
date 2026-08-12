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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.rcs.agents.CapabilitiesResponse
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addresses: JsonField<Addresses>,
    private val brandId: JsonField<String>,
    private val capabilities: JsonField<CapabilitiesResponse>,
    private val contacts: JsonField<Contacts>,
    private val displayName: JsonField<String>,
    private val identifiers: JsonField<Identifiers>,
    private val legalEntityType: JsonField<String>,
    private val legalName: JsonField<String>,
    private val organizationType: JsonField<String>,
    private val profileId: JsonField<String>,
    private val status: JsonField<Status>,
    private val websiteUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        addresses: JsonField<Addresses> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<CapabilitiesResponse> = JsonMissing.of(),
        @JsonProperty("contacts") @ExcludeMissing contacts: JsonField<Contacts> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifiers")
        @ExcludeMissing
        identifiers: JsonField<Identifiers> = JsonMissing.of(),
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        legalEntityType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_name") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_type")
        @ExcludeMissing
        organizationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profile_id") @ExcludeMissing profileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("website_url")
        @ExcludeMissing
        websiteUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        addresses,
        brandId,
        capabilities,
        contacts,
        displayName,
        identifiers,
        legalEntityType,
        legalName,
        organizationType,
        profileId,
        status,
        websiteUrl,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addresses(): Addresses = addresses.getRequired("addresses")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): CapabilitiesResponse = capabilities.getRequired("capabilities")

    /**
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifiers(): Identifiers = identifiers.getRequired("identifiers")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalEntityType(): String = legalEntityType.getRequired("legal_entity_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = legalName.getRequired("legal_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationType(): String = organizationType.getRequired("organization_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileId(): Optional<String> = profileId.getOptional("profile_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun websiteUrl(): String = websiteUrl.getRequired("website_url")

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addresses") @ExcludeMissing fun _addresses(): JsonField<Addresses> = addresses

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<CapabilitiesResponse> = capabilities

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
     * Unlike [legalEntityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_entity_type")
    @ExcludeMissing
    fun _legalEntityType(): JsonField<String> = legalEntityType

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
    fun _organizationType(): JsonField<String> = organizationType

    /**
     * Returns the raw JSON value of [profileId].
     *
     * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [websiteUrl].
     *
     * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl(): JsonField<String> = websiteUrl

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
         * Returns a mutable builder for constructing an instance of [BrandResponse].
         *
         * The following fields are required:
         * ```java
         * .addresses()
         * .brandId()
         * .capabilities()
         * .contacts()
         * .displayName()
         * .identifiers()
         * .legalEntityType()
         * .legalName()
         * .organizationType()
         * .profileId()
         * .status()
         * .websiteUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandResponse]. */
    class Builder internal constructor() {

        private var addresses: JsonField<Addresses>? = null
        private var brandId: JsonField<String>? = null
        private var capabilities: JsonField<CapabilitiesResponse>? = null
        private var contacts: JsonField<Contacts>? = null
        private var displayName: JsonField<String>? = null
        private var identifiers: JsonField<Identifiers>? = null
        private var legalEntityType: JsonField<String>? = null
        private var legalName: JsonField<String>? = null
        private var organizationType: JsonField<String>? = null
        private var profileId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var websiteUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandResponse: BrandResponse) = apply {
            addresses = brandResponse.addresses
            brandId = brandResponse.brandId
            capabilities = brandResponse.capabilities
            contacts = brandResponse.contacts
            displayName = brandResponse.displayName
            identifiers = brandResponse.identifiers
            legalEntityType = brandResponse.legalEntityType
            legalName = brandResponse.legalName
            organizationType = brandResponse.organizationType
            profileId = brandResponse.profileId
            status = brandResponse.status
            websiteUrl = brandResponse.websiteUrl
            additionalProperties = brandResponse.additionalProperties.toMutableMap()
        }

        fun addresses(addresses: Addresses) = addresses(JsonField.of(addresses))

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed [Addresses] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addresses(addresses: JsonField<Addresses>) = apply { this.addresses = addresses }

        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        fun capabilities(capabilities: CapabilitiesResponse) =
            capabilities(JsonField.of(capabilities))

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed [CapabilitiesResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun capabilities(capabilities: JsonField<CapabilitiesResponse>) = apply {
            this.capabilities = capabilities
        }

        fun contacts(contacts: Contacts) = contacts(JsonField.of(contacts))

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed [Contacts] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contacts(contacts: JsonField<Contacts>) = apply { this.contacts = contacts }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

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

        fun legalEntityType(legalEntityType: String) =
            legalEntityType(JsonField.of(legalEntityType))

        /**
         * Sets [Builder.legalEntityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalEntityType(legalEntityType: JsonField<String>) = apply {
            this.legalEntityType = legalEntityType
        }

        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun organizationType(organizationType: String) =
            organizationType(JsonField.of(organizationType))

        /**
         * Sets [Builder.organizationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationType(organizationType: JsonField<String>) = apply {
            this.organizationType = organizationType
        }

        fun profileId(profileId: String?) = profileId(JsonField.ofNullable(profileId))

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        /**
         * Sets [Builder.profileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /**
         * Sets [Builder.websiteUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websiteUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

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
         * Returns an immutable instance of [BrandResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .addresses()
         * .brandId()
         * .capabilities()
         * .contacts()
         * .displayName()
         * .identifiers()
         * .legalEntityType()
         * .legalName()
         * .organizationType()
         * .profileId()
         * .status()
         * .websiteUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandResponse =
            BrandResponse(
                checkRequired("addresses", addresses),
                checkRequired("brandId", brandId),
                checkRequired("capabilities", capabilities),
                checkRequired("contacts", contacts),
                checkRequired("displayName", displayName),
                checkRequired("identifiers", identifiers),
                checkRequired("legalEntityType", legalEntityType),
                checkRequired("legalName", legalName),
                checkRequired("organizationType", organizationType),
                checkRequired("profileId", profileId),
                checkRequired("status", status),
                checkRequired("websiteUrl", websiteUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): BrandResponse = apply {
        if (validated) {
            return@apply
        }

        addresses().validate()
        brandId()
        capabilities().validate()
        contacts().validate()
        displayName()
        identifiers().validate()
        legalEntityType()
        legalName()
        organizationType()
        profileId()
        status().validate()
        websiteUrl()
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
        (addresses.asKnown().getOrNull()?.validity() ?: 0) +
            (if (brandId.asKnown().isPresent) 1 else 0) +
            (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (contacts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (identifiers.asKnown().getOrNull()?.validity() ?: 0) +
            (if (legalEntityType.asKnown().isPresent) 1 else 0) +
            (if (legalName.asKnown().isPresent) 1 else 0) +
            (if (organizationType.asKnown().isPresent) 1 else 0) +
            (if (profileId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (websiteUrl.asKnown().isPresent) 1 else 0)

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

    class Contacts
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

            /** Returns a mutable builder for constructing an instance of [Contacts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Contacts]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contacts: Contacts) = apply {
                additionalProperties = contacts.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Contacts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Contacts = Contacts(additionalProperties.toImmutable())
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

            return other is Contacts && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Contacts{additionalProperties=$additionalProperties}"
    }

    class Identifiers
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

            /** Returns a mutable builder for constructing an instance of [Identifiers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Identifiers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(identifiers: Identifiers) = apply {
                additionalProperties = identifiers.additionalProperties.toMutableMap()
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
             */
            fun build(): Identifiers = Identifiers(additionalProperties.toImmutable())
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

            return other is Identifiers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Identifiers{additionalProperties=$additionalProperties}"
    }

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

            @JvmField val CREATED = of("CREATED")

            @JvmField val CONFIGURED = of("CONFIGURED")

            @JvmField val SUBMITTED = of("SUBMITTED")

            @JvmField val REVIEWING = of("REVIEWING")

            @JvmField val VETTING = of("VETTING")

            @JvmField val VERIFIED = of("VERIFIED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CREATED,
            CONFIGURED,
            SUBMITTED,
            REVIEWING,
            VETTING,
            VERIFIED,
            REJECTED,
            FAILED,
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
            CREATED,
            CONFIGURED,
            SUBMITTED,
            REVIEWING,
            VETTING,
            VERIFIED,
            REJECTED,
            FAILED,
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
                CREATED -> Value.CREATED
                CONFIGURED -> Value.CONFIGURED
                SUBMITTED -> Value.SUBMITTED
                REVIEWING -> Value.REVIEWING
                VETTING -> Value.VETTING
                VERIFIED -> Value.VERIFIED
                REJECTED -> Value.REJECTED
                FAILED -> Value.FAILED
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
                CREATED -> Known.CREATED
                CONFIGURED -> Known.CONFIGURED
                SUBMITTED -> Known.SUBMITTED
                REVIEWING -> Known.REVIEWING
                VETTING -> Known.VETTING
                VERIFIED -> Known.VERIFIED
                REJECTED -> Known.REJECTED
                FAILED -> Known.FAILED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is BrandResponse &&
            addresses == other.addresses &&
            brandId == other.brandId &&
            capabilities == other.capabilities &&
            contacts == other.contacts &&
            displayName == other.displayName &&
            identifiers == other.identifiers &&
            legalEntityType == other.legalEntityType &&
            legalName == other.legalName &&
            organizationType == other.organizationType &&
            profileId == other.profileId &&
            status == other.status &&
            websiteUrl == other.websiteUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            addresses,
            brandId,
            capabilities,
            contacts,
            displayName,
            identifiers,
            legalEntityType,
            legalName,
            organizationType,
            profileId,
            status,
            websiteUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandResponse{addresses=$addresses, brandId=$brandId, capabilities=$capabilities, contacts=$contacts, displayName=$displayName, identifiers=$identifiers, legalEntityType=$legalEntityType, legalName=$legalName, organizationType=$organizationType, profileId=$profileId, status=$status, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
