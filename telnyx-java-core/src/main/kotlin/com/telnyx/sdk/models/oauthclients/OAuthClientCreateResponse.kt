// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OAuthClientCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [OAuthClientCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthClientCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthClientCreateResponse: OAuthClientCreateResponse) = apply {
            data = oauthClientCreateResponse.data
            additionalProperties = oauthClientCreateResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [OAuthClientCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OAuthClientCreateResponse =
            OAuthClientCreateResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OAuthClientCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientId: JsonField<String>,
        private val clientType: JsonField<ClientType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val orgId: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val requirePkce: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val allowedGrantTypes: JsonField<List<AllowedGrantType>>,
        private val allowedScopes: JsonField<List<String>>,
        private val clientSecret: JsonField<String>,
        private val logoUri: JsonField<String>,
        private val policyUri: JsonField<String>,
        private val redirectUris: JsonField<List<String>>,
        private val tosUri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_id")
            @ExcludeMissing
            clientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_type")
            @ExcludeMissing
            clientType: JsonField<ClientType> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("require_pkce")
            @ExcludeMissing
            requirePkce: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowed_grant_types")
            @ExcludeMissing
            allowedGrantTypes: JsonField<List<AllowedGrantType>> = JsonMissing.of(),
            @JsonProperty("allowed_scopes")
            @ExcludeMissing
            allowedScopes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("client_secret")
            @ExcludeMissing
            clientSecret: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logo_uri") @ExcludeMissing logoUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("policy_uri")
            @ExcludeMissing
            policyUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect_uris")
            @ExcludeMissing
            redirectUris: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tos_uri") @ExcludeMissing tosUri: JsonField<String> = JsonMissing.of(),
        ) : this(
            clientId,
            clientType,
            createdAt,
            name,
            orgId,
            recordType,
            requirePkce,
            updatedAt,
            userId,
            allowedGrantTypes,
            allowedScopes,
            clientSecret,
            logoUri,
            policyUri,
            redirectUris,
            tosUri,
            mutableMapOf(),
        )

        /**
         * OAuth client identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clientId(): String = clientId.getRequired("client_id")

        /**
         * OAuth client type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clientType(): ClientType = clientType.getRequired("client_type")

        /**
         * Timestamp when the client was created
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Human-readable name for the OAuth client
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Organization ID that owns this OAuth client
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orgId(): String = orgId.getRequired("org_id")

        /**
         * Record type identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * Whether PKCE (Proof Key for Code Exchange) is required for this client
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requirePkce(): Boolean = requirePkce.getRequired("require_pkce")

        /**
         * Timestamp when the client was last updated
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * User ID that created this OAuth client
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * List of allowed OAuth grant types
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedGrantTypes(): Optional<List<AllowedGrantType>> =
            allowedGrantTypes.getOptional("allowed_grant_types")

        /**
         * List of allowed OAuth scopes
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedScopes(): Optional<List<String>> = allowedScopes.getOptional("allowed_scopes")

        /**
         * Client secret (only included when available, for confidential clients)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

        /**
         * URL of the client logo
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logoUri(): Optional<String> = logoUri.getOptional("logo_uri")

        /**
         * URL of the client's privacy policy
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun policyUri(): Optional<String> = policyUri.getOptional("policy_uri")

        /**
         * List of allowed redirect URIs
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUris(): Optional<List<String>> = redirectUris.getOptional("redirect_uris")

        /**
         * URL of the client's terms of service
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tosUri(): Optional<String> = tosUri.getOptional("tos_uri")

        /**
         * Returns the raw JSON value of [clientId].
         *
         * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        /**
         * Returns the raw JSON value of [clientType].
         *
         * Unlike [clientType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_type")
        @ExcludeMissing
        fun _clientType(): JsonField<ClientType> = clientType

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
         * Returns the raw JSON value of [orgId].
         *
         * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [requirePkce].
         *
         * Unlike [requirePkce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("require_pkce")
        @ExcludeMissing
        fun _requirePkce(): JsonField<Boolean> = requirePkce

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [allowedGrantTypes].
         *
         * Unlike [allowedGrantTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_grant_types")
        @ExcludeMissing
        fun _allowedGrantTypes(): JsonField<List<AllowedGrantType>> = allowedGrantTypes

        /**
         * Returns the raw JSON value of [allowedScopes].
         *
         * Unlike [allowedScopes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_scopes")
        @ExcludeMissing
        fun _allowedScopes(): JsonField<List<String>> = allowedScopes

        /**
         * Returns the raw JSON value of [clientSecret].
         *
         * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<String> = clientSecret

        /**
         * Returns the raw JSON value of [logoUri].
         *
         * Unlike [logoUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logo_uri") @ExcludeMissing fun _logoUri(): JsonField<String> = logoUri

        /**
         * Returns the raw JSON value of [policyUri].
         *
         * Unlike [policyUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("policy_uri") @ExcludeMissing fun _policyUri(): JsonField<String> = policyUri

        /**
         * Returns the raw JSON value of [redirectUris].
         *
         * Unlike [redirectUris], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("redirect_uris")
        @ExcludeMissing
        fun _redirectUris(): JsonField<List<String>> = redirectUris

        /**
         * Returns the raw JSON value of [tosUri].
         *
         * Unlike [tosUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tos_uri") @ExcludeMissing fun _tosUri(): JsonField<String> = tosUri

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .clientId()
             * .clientType()
             * .createdAt()
             * .name()
             * .orgId()
             * .recordType()
             * .requirePkce()
             * .updatedAt()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var clientId: JsonField<String>? = null
            private var clientType: JsonField<ClientType>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var orgId: JsonField<String>? = null
            private var recordType: JsonField<RecordType>? = null
            private var requirePkce: JsonField<Boolean>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var userId: JsonField<String>? = null
            private var allowedGrantTypes: JsonField<MutableList<AllowedGrantType>>? = null
            private var allowedScopes: JsonField<MutableList<String>>? = null
            private var clientSecret: JsonField<String> = JsonMissing.of()
            private var logoUri: JsonField<String> = JsonMissing.of()
            private var policyUri: JsonField<String> = JsonMissing.of()
            private var redirectUris: JsonField<MutableList<String>>? = null
            private var tosUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                clientId = data.clientId
                clientType = data.clientType
                createdAt = data.createdAt
                name = data.name
                orgId = data.orgId
                recordType = data.recordType
                requirePkce = data.requirePkce
                updatedAt = data.updatedAt
                userId = data.userId
                allowedGrantTypes = data.allowedGrantTypes.map { it.toMutableList() }
                allowedScopes = data.allowedScopes.map { it.toMutableList() }
                clientSecret = data.clientSecret
                logoUri = data.logoUri
                policyUri = data.policyUri
                redirectUris = data.redirectUris.map { it.toMutableList() }
                tosUri = data.tosUri
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** OAuth client identifier */
            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            /**
             * Sets [Builder.clientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            /** OAuth client type */
            fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

            /**
             * Sets [Builder.clientType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientType] with a well-typed [ClientType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientType(clientType: JsonField<ClientType>) = apply {
                this.clientType = clientType
            }

            /** Timestamp when the client was created */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Human-readable name for the OAuth client */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Organization ID that owns this OAuth client */
            fun orgId(orgId: String) = orgId(JsonField.of(orgId))

            /**
             * Sets [Builder.orgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            /** Record type identifier */
            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            /** Whether PKCE (Proof Key for Code Exchange) is required for this client */
            fun requirePkce(requirePkce: Boolean) = requirePkce(JsonField.of(requirePkce))

            /**
             * Sets [Builder.requirePkce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirePkce] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirePkce(requirePkce: JsonField<Boolean>) = apply {
                this.requirePkce = requirePkce
            }

            /** Timestamp when the client was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** User ID that created this OAuth client */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** List of allowed OAuth grant types */
            fun allowedGrantTypes(allowedGrantTypes: List<AllowedGrantType>) =
                allowedGrantTypes(JsonField.of(allowedGrantTypes))

            /**
             * Sets [Builder.allowedGrantTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedGrantTypes] with a well-typed
             * `List<AllowedGrantType>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun allowedGrantTypes(allowedGrantTypes: JsonField<List<AllowedGrantType>>) = apply {
                this.allowedGrantTypes = allowedGrantTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [AllowedGrantType] to [allowedGrantTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedGrantType(allowedGrantType: AllowedGrantType) = apply {
                allowedGrantTypes =
                    (allowedGrantTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedGrantTypes", it).add(allowedGrantType)
                    }
            }

            /** List of allowed OAuth scopes */
            fun allowedScopes(allowedScopes: List<String>) =
                allowedScopes(JsonField.of(allowedScopes))

            /**
             * Sets [Builder.allowedScopes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedScopes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowedScopes(allowedScopes: JsonField<List<String>>) = apply {
                this.allowedScopes = allowedScopes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedScopes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedScope(allowedScope: String) = apply {
                allowedScopes =
                    (allowedScopes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedScopes", it).add(allowedScope)
                    }
            }

            /** Client secret (only included when available, for confidential clients) */
            fun clientSecret(clientSecret: String?) =
                clientSecret(JsonField.ofNullable(clientSecret))

            /** Alias for calling [Builder.clientSecret] with `clientSecret.orElse(null)`. */
            fun clientSecret(clientSecret: Optional<String>) =
                clientSecret(clientSecret.getOrNull())

            /**
             * Sets [Builder.clientSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientSecret] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientSecret(clientSecret: JsonField<String>) = apply {
                this.clientSecret = clientSecret
            }

            /** URL of the client logo */
            fun logoUri(logoUri: String?) = logoUri(JsonField.ofNullable(logoUri))

            /** Alias for calling [Builder.logoUri] with `logoUri.orElse(null)`. */
            fun logoUri(logoUri: Optional<String>) = logoUri(logoUri.getOrNull())

            /**
             * Sets [Builder.logoUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUri(logoUri: JsonField<String>) = apply { this.logoUri = logoUri }

            /** URL of the client's privacy policy */
            fun policyUri(policyUri: String?) = policyUri(JsonField.ofNullable(policyUri))

            /** Alias for calling [Builder.policyUri] with `policyUri.orElse(null)`. */
            fun policyUri(policyUri: Optional<String>) = policyUri(policyUri.getOrNull())

            /**
             * Sets [Builder.policyUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.policyUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun policyUri(policyUri: JsonField<String>) = apply { this.policyUri = policyUri }

            /** List of allowed redirect URIs */
            fun redirectUris(redirectUris: List<String>) = redirectUris(JsonField.of(redirectUris))

            /**
             * Sets [Builder.redirectUris] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectUris] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirectUris(redirectUris: JsonField<List<String>>) = apply {
                this.redirectUris = redirectUris.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.redirectUris].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRedirectUris(redirectUris: String) = apply {
                this.redirectUris =
                    (this.redirectUris ?: JsonField.of(mutableListOf())).also {
                        checkKnown("redirectUris", it).add(redirectUris)
                    }
            }

            /** URL of the client's terms of service */
            fun tosUri(tosUri: String?) = tosUri(JsonField.ofNullable(tosUri))

            /** Alias for calling [Builder.tosUri] with `tosUri.orElse(null)`. */
            fun tosUri(tosUri: Optional<String>) = tosUri(tosUri.getOrNull())

            /**
             * Sets [Builder.tosUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tosUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tosUri(tosUri: JsonField<String>) = apply { this.tosUri = tosUri }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .clientId()
             * .clientType()
             * .createdAt()
             * .name()
             * .orgId()
             * .recordType()
             * .requirePkce()
             * .updatedAt()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("clientId", clientId),
                    checkRequired("clientType", clientType),
                    checkRequired("createdAt", createdAt),
                    checkRequired("name", name),
                    checkRequired("orgId", orgId),
                    checkRequired("recordType", recordType),
                    checkRequired("requirePkce", requirePkce),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("userId", userId),
                    (allowedGrantTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedScopes ?: JsonMissing.of()).map { it.toImmutable() },
                    clientSecret,
                    logoUri,
                    policyUri,
                    (redirectUris ?: JsonMissing.of()).map { it.toImmutable() },
                    tosUri,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            clientId()
            clientType().validate()
            createdAt()
            name()
            orgId()
            recordType().validate()
            requirePkce()
            updatedAt()
            userId()
            allowedGrantTypes().ifPresent { it.forEach { it.validate() } }
            allowedScopes()
            clientSecret()
            logoUri()
            policyUri()
            redirectUris()
            tosUri()
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
            (if (clientId.asKnown().isPresent) 1 else 0) +
                (clientType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (orgId.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requirePkce.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (allowedGrantTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (allowedScopes.asKnown().getOrNull()?.size ?: 0) +
                (if (clientSecret.asKnown().isPresent) 1 else 0) +
                (if (logoUri.asKnown().isPresent) 1 else 0) +
                (if (policyUri.asKnown().isPresent) 1 else 0) +
                (redirectUris.asKnown().getOrNull()?.size ?: 0) +
                (if (tosUri.asKnown().isPresent) 1 else 0)

        /** OAuth client type */
        class ClientType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val PUBLIC = of("public")

                @JvmField val CONFIDENTIAL = of("confidential")

                @JvmStatic fun of(value: String) = ClientType(JsonField.of(value))
            }

            /** An enum containing [ClientType]'s known values. */
            enum class Known {
                PUBLIC,
                CONFIDENTIAL,
            }

            /**
             * An enum containing [ClientType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ClientType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PUBLIC,
                CONFIDENTIAL,
                /**
                 * An enum member indicating that [ClientType] was instantiated with an unknown
                 * value.
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
                    PUBLIC -> Value.PUBLIC
                    CONFIDENTIAL -> Value.CONFIDENTIAL
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
                    PUBLIC -> Known.PUBLIC
                    CONFIDENTIAL -> Known.CONFIDENTIAL
                    else -> throw TelnyxInvalidDataException("Unknown ClientType: $value")
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

            fun validate(): ClientType = apply {
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

                return other is ClientType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Record type identifier */
        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val OAUTH_CLIENT = of("oauth_client")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                OAUTH_CLIENT
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OAUTH_CLIENT,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
                 * value.
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
                    OAUTH_CLIENT -> Value.OAUTH_CLIENT
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
                    OAUTH_CLIENT -> Known.OAUTH_CLIENT
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AllowedGrantType
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

                @JvmField val CLIENT_CREDENTIALS = of("client_credentials")

                @JvmField val AUTHORIZATION_CODE = of("authorization_code")

                @JvmField val REFRESH_TOKEN = of("refresh_token")

                @JvmStatic fun of(value: String) = AllowedGrantType(JsonField.of(value))
            }

            /** An enum containing [AllowedGrantType]'s known values. */
            enum class Known {
                CLIENT_CREDENTIALS,
                AUTHORIZATION_CODE,
                REFRESH_TOKEN,
            }

            /**
             * An enum containing [AllowedGrantType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AllowedGrantType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CLIENT_CREDENTIALS,
                AUTHORIZATION_CODE,
                REFRESH_TOKEN,
                /**
                 * An enum member indicating that [AllowedGrantType] was instantiated with an
                 * unknown value.
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
                    CLIENT_CREDENTIALS -> Value.CLIENT_CREDENTIALS
                    AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
                    REFRESH_TOKEN -> Value.REFRESH_TOKEN
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
                    CLIENT_CREDENTIALS -> Known.CLIENT_CREDENTIALS
                    AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
                    REFRESH_TOKEN -> Known.REFRESH_TOKEN
                    else -> throw TelnyxInvalidDataException("Unknown AllowedGrantType: $value")
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

            fun validate(): AllowedGrantType = apply {
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

                return other is AllowedGrantType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                clientId == other.clientId &&
                clientType == other.clientType &&
                createdAt == other.createdAt &&
                name == other.name &&
                orgId == other.orgId &&
                recordType == other.recordType &&
                requirePkce == other.requirePkce &&
                updatedAt == other.updatedAt &&
                userId == other.userId &&
                allowedGrantTypes == other.allowedGrantTypes &&
                allowedScopes == other.allowedScopes &&
                clientSecret == other.clientSecret &&
                logoUri == other.logoUri &&
                policyUri == other.policyUri &&
                redirectUris == other.redirectUris &&
                tosUri == other.tosUri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clientId,
                clientType,
                createdAt,
                name,
                orgId,
                recordType,
                requirePkce,
                updatedAt,
                userId,
                allowedGrantTypes,
                allowedScopes,
                clientSecret,
                logoUri,
                policyUri,
                redirectUris,
                tosUri,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{clientId=$clientId, clientType=$clientType, createdAt=$createdAt, name=$name, orgId=$orgId, recordType=$recordType, requirePkce=$requirePkce, updatedAt=$updatedAt, userId=$userId, allowedGrantTypes=$allowedGrantTypes, allowedScopes=$allowedScopes, clientSecret=$clientSecret, logoUri=$logoUri, policyUri=$policyUri, redirectUris=$redirectUris, tosUri=$tosUri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthClientCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthClientCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
