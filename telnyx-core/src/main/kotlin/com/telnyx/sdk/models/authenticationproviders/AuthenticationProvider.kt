// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuthenticationProvider
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val activatedAt: JsonField<OffsetDateTime>,
    private val active: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val settings: JsonField<Settings>,
    private val shortName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activated_at")
        @ExcludeMissing
        activatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings") @ExcludeMissing settings: JsonField<Settings> = JsonMissing.of(),
        @JsonProperty("short_name") @ExcludeMissing shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        activatedAt,
        active,
        createdAt,
        name,
        organizationId,
        recordType,
        settings,
        shortName,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the authentication provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date indicating when the authentication provider was activated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activatedAt(): Optional<OffsetDateTime> = activatedAt.getOptional("activated_at")

    /**
     * The active status of the authentication provider
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = active.getOptional("active")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The name associated with the authentication provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The id from the Organization the authentication provider belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The settings associated with the authentication provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<Settings> = settings.getOptional("settings")

    /**
     * The short name associated with the authentication provider. This must be unique and
     * URL-friendly, as it's going to be part of the login URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortName(): Optional<String> = shortName.getOptional("short_name")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [activatedAt].
     *
     * Unlike [activatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activated_at")
    @ExcludeMissing
    fun _activatedAt(): JsonField<OffsetDateTime> = activatedAt

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<Settings> = settings

    /**
     * Returns the raw JSON value of [shortName].
     *
     * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_name") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [AuthenticationProvider]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthenticationProvider]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var activatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<Settings> = JsonMissing.of()
        private var shortName: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authenticationProvider: AuthenticationProvider) = apply {
            id = authenticationProvider.id
            activatedAt = authenticationProvider.activatedAt
            active = authenticationProvider.active
            createdAt = authenticationProvider.createdAt
            name = authenticationProvider.name
            organizationId = authenticationProvider.organizationId
            recordType = authenticationProvider.recordType
            settings = authenticationProvider.settings
            shortName = authenticationProvider.shortName
            updatedAt = authenticationProvider.updatedAt
            additionalProperties = authenticationProvider.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the authentication provider. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 8601 formatted date indicating when the authentication provider was activated. */
        fun activatedAt(activatedAt: OffsetDateTime) = activatedAt(JsonField.of(activatedAt))

        /**
         * Sets [Builder.activatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activatedAt(activatedAt: JsonField<OffsetDateTime>) = apply {
            this.activatedAt = activatedAt
        }

        /** The active status of the authentication provider */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name associated with the authentication provider. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id from the Organization the authentication provider belongs to. */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** The settings associated with the authentication provider. */
        fun settings(settings: Settings) = settings(JsonField.of(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [Settings] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settings(settings: JsonField<Settings>) = apply { this.settings = settings }

        /**
         * The short name associated with the authentication provider. This must be unique and
         * URL-friendly, as it's going to be part of the login URL.
         */
        fun shortName(shortName: String) = shortName(JsonField.of(shortName))

        /**
         * Sets [Builder.shortName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [AuthenticationProvider].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthenticationProvider =
            AuthenticationProvider(
                id,
                activatedAt,
                active,
                createdAt,
                name,
                organizationId,
                recordType,
                settings,
                shortName,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthenticationProvider = apply {
        if (validated) {
            return@apply
        }

        id()
        activatedAt()
        active()
        createdAt()
        name()
        organizationId()
        recordType()
        settings().ifPresent { it.validate() }
        shortName()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (activatedAt.asKnown().isPresent) 1 else 0) +
            (if (active.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (settings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (shortName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The settings associated with the authentication provider. */
    class Settings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assertionConsumerServiceUrl: JsonField<String>,
        private val idpAttributeNames: JsonValue,
        private val idpCertFingerprint: JsonField<String>,
        private val idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm>,
        private val idpCertificate: JsonField<String>,
        private val idpEntityId: JsonField<String>,
        private val idpSloTargetUrl: JsonField<String>,
        private val idpSsoTargetUrl: JsonField<String>,
        private val nameIdentifierFormat: JsonField<String>,
        private val provisionGroups: JsonField<Boolean>,
        private val serviceProviderEntityId: JsonField<String>,
        private val serviceProviderLoginUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assertion_consumer_service_url")
            @ExcludeMissing
            assertionConsumerServiceUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idp_attribute_names")
            @ExcludeMissing
            idpAttributeNames: JsonValue = JsonMissing.of(),
            @JsonProperty("idp_cert_fingerprint")
            @ExcludeMissing
            idpCertFingerprint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idp_cert_fingerprint_algorithm")
            @ExcludeMissing
            idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm> = JsonMissing.of(),
            @JsonProperty("idp_certificate")
            @ExcludeMissing
            idpCertificate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idp_entity_id")
            @ExcludeMissing
            idpEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idp_slo_target_url")
            @ExcludeMissing
            idpSloTargetUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idp_sso_target_url")
            @ExcludeMissing
            idpSsoTargetUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name_identifier_format")
            @ExcludeMissing
            nameIdentifierFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provision_groups")
            @ExcludeMissing
            provisionGroups: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("service_provider_entity_id")
            @ExcludeMissing
            serviceProviderEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("service_provider_login_url")
            @ExcludeMissing
            serviceProviderLoginUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            assertionConsumerServiceUrl,
            idpAttributeNames,
            idpCertFingerprint,
            idpCertFingerprintAlgorithm,
            idpCertificate,
            idpEntityId,
            idpSloTargetUrl,
            idpSsoTargetUrl,
            nameIdentifierFormat,
            provisionGroups,
            serviceProviderEntityId,
            serviceProviderLoginUrl,
            mutableMapOf(),
        )

        /**
         * The Assertion Consumer Service URL for the service provider (Telnyx).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assertionConsumerServiceUrl(): Optional<String> =
            assertionConsumerServiceUrl.getOptional("assertion_consumer_service_url")

        /**
         * Mapping of SAML attribute names used by the identity provider (IdP).
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = settings.idpAttributeNames().convert(MyClass.class);
         * ```
         */
        @JsonProperty("idp_attribute_names")
        @ExcludeMissing
        fun _idpAttributeNames(): JsonValue = idpAttributeNames

        /**
         * The certificate fingerprint for the identity provider (IdP)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idpCertFingerprint(): Optional<String> =
            idpCertFingerprint.getOptional("idp_cert_fingerprint")

        /**
         * The algorithm used to generate the identity provider's (IdP) certificate fingerprint
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idpCertFingerprintAlgorithm(): Optional<IdpCertFingerprintAlgorithm> =
            idpCertFingerprintAlgorithm.getOptional("idp_cert_fingerprint_algorithm")

        /**
         * The full X.509 certificate for the identity provider (IdP).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idpCertificate(): Optional<String> = idpCertificate.getOptional("idp_certificate")

        /**
         * The Entity ID for the identity provider (IdP).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idpEntityId(): Optional<String> = idpEntityId.getOptional("idp_entity_id")

        /**
         * The Single Logout (SLO) target URL for the identity provider (IdP).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idpSloTargetUrl(): Optional<String> = idpSloTargetUrl.getOptional("idp_slo_target_url")

        /**
         * The SSO target url for the identity provider (IdP).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idpSsoTargetUrl(): Optional<String> = idpSsoTargetUrl.getOptional("idp_sso_target_url")

        /**
         * The name identifier format associated with the authentication provider. This must be the
         * same for both the Identity Provider (IdP) and the service provider (Telnyx).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nameIdentifierFormat(): Optional<String> =
            nameIdentifierFormat.getOptional("name_identifier_format")

        /**
         * Whether group provisioning is enabled for this authentication provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provisionGroups(): Optional<Boolean> = provisionGroups.getOptional("provision_groups")

        /**
         * The Entity ID for the service provider (Telnyx).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceProviderEntityId(): Optional<String> =
            serviceProviderEntityId.getOptional("service_provider_entity_id")

        /**
         * The login URL for the service provider (Telnyx). Users navigate to this URL to initiate
         * SSO login.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceProviderLoginUrl(): Optional<String> =
            serviceProviderLoginUrl.getOptional("service_provider_login_url")

        /**
         * Returns the raw JSON value of [assertionConsumerServiceUrl].
         *
         * Unlike [assertionConsumerServiceUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("assertion_consumer_service_url")
        @ExcludeMissing
        fun _assertionConsumerServiceUrl(): JsonField<String> = assertionConsumerServiceUrl

        /**
         * Returns the raw JSON value of [idpCertFingerprint].
         *
         * Unlike [idpCertFingerprint], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idp_cert_fingerprint")
        @ExcludeMissing
        fun _idpCertFingerprint(): JsonField<String> = idpCertFingerprint

        /**
         * Returns the raw JSON value of [idpCertFingerprintAlgorithm].
         *
         * Unlike [idpCertFingerprintAlgorithm], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idp_cert_fingerprint_algorithm")
        @ExcludeMissing
        fun _idpCertFingerprintAlgorithm(): JsonField<IdpCertFingerprintAlgorithm> =
            idpCertFingerprintAlgorithm

        /**
         * Returns the raw JSON value of [idpCertificate].
         *
         * Unlike [idpCertificate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idp_certificate")
        @ExcludeMissing
        fun _idpCertificate(): JsonField<String> = idpCertificate

        /**
         * Returns the raw JSON value of [idpEntityId].
         *
         * Unlike [idpEntityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idp_entity_id")
        @ExcludeMissing
        fun _idpEntityId(): JsonField<String> = idpEntityId

        /**
         * Returns the raw JSON value of [idpSloTargetUrl].
         *
         * Unlike [idpSloTargetUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idp_slo_target_url")
        @ExcludeMissing
        fun _idpSloTargetUrl(): JsonField<String> = idpSloTargetUrl

        /**
         * Returns the raw JSON value of [idpSsoTargetUrl].
         *
         * Unlike [idpSsoTargetUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idp_sso_target_url")
        @ExcludeMissing
        fun _idpSsoTargetUrl(): JsonField<String> = idpSsoTargetUrl

        /**
         * Returns the raw JSON value of [nameIdentifierFormat].
         *
         * Unlike [nameIdentifierFormat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("name_identifier_format")
        @ExcludeMissing
        fun _nameIdentifierFormat(): JsonField<String> = nameIdentifierFormat

        /**
         * Returns the raw JSON value of [provisionGroups].
         *
         * Unlike [provisionGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provision_groups")
        @ExcludeMissing
        fun _provisionGroups(): JsonField<Boolean> = provisionGroups

        /**
         * Returns the raw JSON value of [serviceProviderEntityId].
         *
         * Unlike [serviceProviderEntityId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("service_provider_entity_id")
        @ExcludeMissing
        fun _serviceProviderEntityId(): JsonField<String> = serviceProviderEntityId

        /**
         * Returns the raw JSON value of [serviceProviderLoginUrl].
         *
         * Unlike [serviceProviderLoginUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("service_provider_login_url")
        @ExcludeMissing
        fun _serviceProviderLoginUrl(): JsonField<String> = serviceProviderLoginUrl

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

            /** Returns a mutable builder for constructing an instance of [Settings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Settings]. */
        class Builder internal constructor() {

            private var assertionConsumerServiceUrl: JsonField<String> = JsonMissing.of()
            private var idpAttributeNames: JsonValue = JsonMissing.of()
            private var idpCertFingerprint: JsonField<String> = JsonMissing.of()
            private var idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm> =
                JsonMissing.of()
            private var idpCertificate: JsonField<String> = JsonMissing.of()
            private var idpEntityId: JsonField<String> = JsonMissing.of()
            private var idpSloTargetUrl: JsonField<String> = JsonMissing.of()
            private var idpSsoTargetUrl: JsonField<String> = JsonMissing.of()
            private var nameIdentifierFormat: JsonField<String> = JsonMissing.of()
            private var provisionGroups: JsonField<Boolean> = JsonMissing.of()
            private var serviceProviderEntityId: JsonField<String> = JsonMissing.of()
            private var serviceProviderLoginUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(settings: Settings) = apply {
                assertionConsumerServiceUrl = settings.assertionConsumerServiceUrl
                idpAttributeNames = settings.idpAttributeNames
                idpCertFingerprint = settings.idpCertFingerprint
                idpCertFingerprintAlgorithm = settings.idpCertFingerprintAlgorithm
                idpCertificate = settings.idpCertificate
                idpEntityId = settings.idpEntityId
                idpSloTargetUrl = settings.idpSloTargetUrl
                idpSsoTargetUrl = settings.idpSsoTargetUrl
                nameIdentifierFormat = settings.nameIdentifierFormat
                provisionGroups = settings.provisionGroups
                serviceProviderEntityId = settings.serviceProviderEntityId
                serviceProviderLoginUrl = settings.serviceProviderLoginUrl
                additionalProperties = settings.additionalProperties.toMutableMap()
            }

            /** The Assertion Consumer Service URL for the service provider (Telnyx). */
            fun assertionConsumerServiceUrl(assertionConsumerServiceUrl: String) =
                assertionConsumerServiceUrl(JsonField.of(assertionConsumerServiceUrl))

            /**
             * Sets [Builder.assertionConsumerServiceUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assertionConsumerServiceUrl] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun assertionConsumerServiceUrl(assertionConsumerServiceUrl: JsonField<String>) =
                apply {
                    this.assertionConsumerServiceUrl = assertionConsumerServiceUrl
                }

            /** Mapping of SAML attribute names used by the identity provider (IdP). */
            fun idpAttributeNames(idpAttributeNames: JsonValue) = apply {
                this.idpAttributeNames = idpAttributeNames
            }

            /** The certificate fingerprint for the identity provider (IdP) */
            fun idpCertFingerprint(idpCertFingerprint: String) =
                idpCertFingerprint(JsonField.of(idpCertFingerprint))

            /**
             * Sets [Builder.idpCertFingerprint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idpCertFingerprint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idpCertFingerprint(idpCertFingerprint: JsonField<String>) = apply {
                this.idpCertFingerprint = idpCertFingerprint
            }

            /**
             * The algorithm used to generate the identity provider's (IdP) certificate fingerprint
             */
            fun idpCertFingerprintAlgorithm(
                idpCertFingerprintAlgorithm: IdpCertFingerprintAlgorithm
            ) = idpCertFingerprintAlgorithm(JsonField.of(idpCertFingerprintAlgorithm))

            /**
             * Sets [Builder.idpCertFingerprintAlgorithm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idpCertFingerprintAlgorithm] with a well-typed
             * [IdpCertFingerprintAlgorithm] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun idpCertFingerprintAlgorithm(
                idpCertFingerprintAlgorithm: JsonField<IdpCertFingerprintAlgorithm>
            ) = apply { this.idpCertFingerprintAlgorithm = idpCertFingerprintAlgorithm }

            /** The full X.509 certificate for the identity provider (IdP). */
            fun idpCertificate(idpCertificate: String) =
                idpCertificate(JsonField.of(idpCertificate))

            /**
             * Sets [Builder.idpCertificate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idpCertificate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idpCertificate(idpCertificate: JsonField<String>) = apply {
                this.idpCertificate = idpCertificate
            }

            /** The Entity ID for the identity provider (IdP). */
            fun idpEntityId(idpEntityId: String) = idpEntityId(JsonField.of(idpEntityId))

            /**
             * Sets [Builder.idpEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idpEntityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idpEntityId(idpEntityId: JsonField<String>) = apply {
                this.idpEntityId = idpEntityId
            }

            /** The Single Logout (SLO) target URL for the identity provider (IdP). */
            fun idpSloTargetUrl(idpSloTargetUrl: String) =
                idpSloTargetUrl(JsonField.of(idpSloTargetUrl))

            /**
             * Sets [Builder.idpSloTargetUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idpSloTargetUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idpSloTargetUrl(idpSloTargetUrl: JsonField<String>) = apply {
                this.idpSloTargetUrl = idpSloTargetUrl
            }

            /** The SSO target url for the identity provider (IdP). */
            fun idpSsoTargetUrl(idpSsoTargetUrl: String) =
                idpSsoTargetUrl(JsonField.of(idpSsoTargetUrl))

            /**
             * Sets [Builder.idpSsoTargetUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idpSsoTargetUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idpSsoTargetUrl(idpSsoTargetUrl: JsonField<String>) = apply {
                this.idpSsoTargetUrl = idpSsoTargetUrl
            }

            /**
             * The name identifier format associated with the authentication provider. This must be
             * the same for both the Identity Provider (IdP) and the service provider (Telnyx).
             */
            fun nameIdentifierFormat(nameIdentifierFormat: String) =
                nameIdentifierFormat(JsonField.of(nameIdentifierFormat))

            /**
             * Sets [Builder.nameIdentifierFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nameIdentifierFormat] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nameIdentifierFormat(nameIdentifierFormat: JsonField<String>) = apply {
                this.nameIdentifierFormat = nameIdentifierFormat
            }

            /** Whether group provisioning is enabled for this authentication provider. */
            fun provisionGroups(provisionGroups: Boolean) =
                provisionGroups(JsonField.of(provisionGroups))

            /**
             * Sets [Builder.provisionGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provisionGroups] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provisionGroups(provisionGroups: JsonField<Boolean>) = apply {
                this.provisionGroups = provisionGroups
            }

            /** The Entity ID for the service provider (Telnyx). */
            fun serviceProviderEntityId(serviceProviderEntityId: String) =
                serviceProviderEntityId(JsonField.of(serviceProviderEntityId))

            /**
             * Sets [Builder.serviceProviderEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceProviderEntityId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun serviceProviderEntityId(serviceProviderEntityId: JsonField<String>) = apply {
                this.serviceProviderEntityId = serviceProviderEntityId
            }

            /**
             * The login URL for the service provider (Telnyx). Users navigate to this URL to
             * initiate SSO login.
             */
            fun serviceProviderLoginUrl(serviceProviderLoginUrl: String) =
                serviceProviderLoginUrl(JsonField.of(serviceProviderLoginUrl))

            /**
             * Sets [Builder.serviceProviderLoginUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceProviderLoginUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun serviceProviderLoginUrl(serviceProviderLoginUrl: JsonField<String>) = apply {
                this.serviceProviderLoginUrl = serviceProviderLoginUrl
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
             * Returns an immutable instance of [Settings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Settings =
                Settings(
                    assertionConsumerServiceUrl,
                    idpAttributeNames,
                    idpCertFingerprint,
                    idpCertFingerprintAlgorithm,
                    idpCertificate,
                    idpEntityId,
                    idpSloTargetUrl,
                    idpSsoTargetUrl,
                    nameIdentifierFormat,
                    provisionGroups,
                    serviceProviderEntityId,
                    serviceProviderLoginUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Settings = apply {
            if (validated) {
                return@apply
            }

            assertionConsumerServiceUrl()
            idpCertFingerprint()
            idpCertFingerprintAlgorithm().ifPresent { it.validate() }
            idpCertificate()
            idpEntityId()
            idpSloTargetUrl()
            idpSsoTargetUrl()
            nameIdentifierFormat()
            provisionGroups()
            serviceProviderEntityId()
            serviceProviderLoginUrl()
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
            (if (assertionConsumerServiceUrl.asKnown().isPresent) 1 else 0) +
                (if (idpCertFingerprint.asKnown().isPresent) 1 else 0) +
                (idpCertFingerprintAlgorithm.asKnown().getOrNull()?.validity() ?: 0) +
                (if (idpCertificate.asKnown().isPresent) 1 else 0) +
                (if (idpEntityId.asKnown().isPresent) 1 else 0) +
                (if (idpSloTargetUrl.asKnown().isPresent) 1 else 0) +
                (if (idpSsoTargetUrl.asKnown().isPresent) 1 else 0) +
                (if (nameIdentifierFormat.asKnown().isPresent) 1 else 0) +
                (if (provisionGroups.asKnown().isPresent) 1 else 0) +
                (if (serviceProviderEntityId.asKnown().isPresent) 1 else 0) +
                (if (serviceProviderLoginUrl.asKnown().isPresent) 1 else 0)

        /** The algorithm used to generate the identity provider's (IdP) certificate fingerprint */
        class IdpCertFingerprintAlgorithm
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SHA1 = of("sha1")

                @JvmField val SHA256 = of("sha256")

                @JvmField val SHA384 = of("sha384")

                @JvmField val SHA512 = of("sha512")

                @JvmStatic fun of(value: String) = IdpCertFingerprintAlgorithm(JsonField.of(value))
            }

            /** An enum containing [IdpCertFingerprintAlgorithm]'s known values. */
            enum class Known {
                SHA1,
                SHA256,
                SHA384,
                SHA512,
            }

            /**
             * An enum containing [IdpCertFingerprintAlgorithm]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [IdpCertFingerprintAlgorithm] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SHA1,
                SHA256,
                SHA384,
                SHA512,
                /**
                 * An enum member indicating that [IdpCertFingerprintAlgorithm] was instantiated
                 * with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SHA1 -> Value.SHA1
                    SHA256 -> Value.SHA256
                    SHA384 -> Value.SHA384
                    SHA512 -> Value.SHA512
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SHA1 -> Known.SHA1
                    SHA256 -> Known.SHA256
                    SHA384 -> Known.SHA384
                    SHA512 -> Known.SHA512
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown IdpCertFingerprintAlgorithm: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): IdpCertFingerprintAlgorithm = apply {
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

                return other is IdpCertFingerprintAlgorithm && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Settings &&
                assertionConsumerServiceUrl == other.assertionConsumerServiceUrl &&
                idpAttributeNames == other.idpAttributeNames &&
                idpCertFingerprint == other.idpCertFingerprint &&
                idpCertFingerprintAlgorithm == other.idpCertFingerprintAlgorithm &&
                idpCertificate == other.idpCertificate &&
                idpEntityId == other.idpEntityId &&
                idpSloTargetUrl == other.idpSloTargetUrl &&
                idpSsoTargetUrl == other.idpSsoTargetUrl &&
                nameIdentifierFormat == other.nameIdentifierFormat &&
                provisionGroups == other.provisionGroups &&
                serviceProviderEntityId == other.serviceProviderEntityId &&
                serviceProviderLoginUrl == other.serviceProviderLoginUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assertionConsumerServiceUrl,
                idpAttributeNames,
                idpCertFingerprint,
                idpCertFingerprintAlgorithm,
                idpCertificate,
                idpEntityId,
                idpSloTargetUrl,
                idpSsoTargetUrl,
                nameIdentifierFormat,
                provisionGroups,
                serviceProviderEntityId,
                serviceProviderLoginUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Settings{assertionConsumerServiceUrl=$assertionConsumerServiceUrl, idpAttributeNames=$idpAttributeNames, idpCertFingerprint=$idpCertFingerprint, idpCertFingerprintAlgorithm=$idpCertFingerprintAlgorithm, idpCertificate=$idpCertificate, idpEntityId=$idpEntityId, idpSloTargetUrl=$idpSloTargetUrl, idpSsoTargetUrl=$idpSsoTargetUrl, nameIdentifierFormat=$nameIdentifierFormat, provisionGroups=$provisionGroups, serviceProviderEntityId=$serviceProviderEntityId, serviceProviderLoginUrl=$serviceProviderLoginUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthenticationProvider &&
            id == other.id &&
            activatedAt == other.activatedAt &&
            active == other.active &&
            createdAt == other.createdAt &&
            name == other.name &&
            organizationId == other.organizationId &&
            recordType == other.recordType &&
            settings == other.settings &&
            shortName == other.shortName &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            activatedAt,
            active,
            createdAt,
            name,
            organizationId,
            recordType,
            settings,
            shortName,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthenticationProvider{id=$id, activatedAt=$activatedAt, active=$active, createdAt=$createdAt, name=$name, organizationId=$organizationId, recordType=$recordType, settings=$settings, shortName=$shortName, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
