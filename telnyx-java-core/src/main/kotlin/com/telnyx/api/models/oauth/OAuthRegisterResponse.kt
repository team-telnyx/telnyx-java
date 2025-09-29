// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OAuthRegisterResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientId: JsonField<String>,
    private val clientIdIssuedAt: JsonField<Long>,
    private val clientName: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val grantTypes: JsonField<List<String>>,
    private val logoUri: JsonField<String>,
    private val policyUri: JsonField<String>,
    private val redirectUris: JsonField<List<String>>,
    private val responseTypes: JsonField<List<String>>,
    private val scope: JsonField<String>,
    private val tokenEndpointAuthMethod: JsonField<String>,
    private val tosUri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id_issued_at")
        @ExcludeMissing
        clientIdIssuedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("client_name")
        @ExcludeMissing
        clientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grant_types")
        @ExcludeMissing
        grantTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("logo_uri") @ExcludeMissing logoUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("policy_uri") @ExcludeMissing policyUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redirect_uris")
        @ExcludeMissing
        redirectUris: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("response_types")
        @ExcludeMissing
        responseTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_endpoint_auth_method")
        @ExcludeMissing
        tokenEndpointAuthMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tos_uri") @ExcludeMissing tosUri: JsonField<String> = JsonMissing.of(),
    ) : this(
        clientId,
        clientIdIssuedAt,
        clientName,
        clientSecret,
        grantTypes,
        logoUri,
        policyUri,
        redirectUris,
        responseTypes,
        scope,
        tokenEndpointAuthMethod,
        tosUri,
        mutableMapOf(),
    )

    /**
     * Unique client identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * Unix timestamp of when the client ID was issued
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientIdIssuedAt(): Long = clientIdIssuedAt.getRequired("client_id_issued_at")

    /**
     * Human-readable client name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientName(): Optional<String> = clientName.getOptional("client_name")

    /**
     * Client secret (only for confidential clients)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

    /**
     * Array of allowed grant types
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grantTypes(): Optional<List<String>> = grantTypes.getOptional("grant_types")

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
     * Array of redirection URIs
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUris(): Optional<List<String>> = redirectUris.getOptional("redirect_uris")

    /**
     * Array of allowed response types
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseTypes(): Optional<List<String>> = responseTypes.getOptional("response_types")

    /**
     * Space-separated scope values
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<String> = scope.getOptional("scope")

    /**
     * Token endpoint authentication method
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenEndpointAuthMethod(): Optional<String> =
        tokenEndpointAuthMethod.getOptional("token_endpoint_auth_method")

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
     * Returns the raw JSON value of [clientIdIssuedAt].
     *
     * Unlike [clientIdIssuedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("client_id_issued_at")
    @ExcludeMissing
    fun _clientIdIssuedAt(): JsonField<Long> = clientIdIssuedAt

    /**
     * Returns the raw JSON value of [clientName].
     *
     * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_name") @ExcludeMissing fun _clientName(): JsonField<String> = clientName

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    /**
     * Returns the raw JSON value of [grantTypes].
     *
     * Unlike [grantTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grant_types")
    @ExcludeMissing
    fun _grantTypes(): JsonField<List<String>> = grantTypes

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
     * Unlike [redirectUris], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirect_uris")
    @ExcludeMissing
    fun _redirectUris(): JsonField<List<String>> = redirectUris

    /**
     * Returns the raw JSON value of [responseTypes].
     *
     * Unlike [responseTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_types")
    @ExcludeMissing
    fun _responseTypes(): JsonField<List<String>> = responseTypes

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<String> = scope

    /**
     * Returns the raw JSON value of [tokenEndpointAuthMethod].
     *
     * Unlike [tokenEndpointAuthMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("token_endpoint_auth_method")
    @ExcludeMissing
    fun _tokenEndpointAuthMethod(): JsonField<String> = tokenEndpointAuthMethod

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
         * Returns a mutable builder for constructing an instance of [OAuthRegisterResponse].
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientIdIssuedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthRegisterResponse]. */
    class Builder internal constructor() {

        private var clientId: JsonField<String>? = null
        private var clientIdIssuedAt: JsonField<Long>? = null
        private var clientName: JsonField<String> = JsonMissing.of()
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var grantTypes: JsonField<MutableList<String>>? = null
        private var logoUri: JsonField<String> = JsonMissing.of()
        private var policyUri: JsonField<String> = JsonMissing.of()
        private var redirectUris: JsonField<MutableList<String>>? = null
        private var responseTypes: JsonField<MutableList<String>>? = null
        private var scope: JsonField<String> = JsonMissing.of()
        private var tokenEndpointAuthMethod: JsonField<String> = JsonMissing.of()
        private var tosUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthRegisterResponse: OAuthRegisterResponse) = apply {
            clientId = oauthRegisterResponse.clientId
            clientIdIssuedAt = oauthRegisterResponse.clientIdIssuedAt
            clientName = oauthRegisterResponse.clientName
            clientSecret = oauthRegisterResponse.clientSecret
            grantTypes = oauthRegisterResponse.grantTypes.map { it.toMutableList() }
            logoUri = oauthRegisterResponse.logoUri
            policyUri = oauthRegisterResponse.policyUri
            redirectUris = oauthRegisterResponse.redirectUris.map { it.toMutableList() }
            responseTypes = oauthRegisterResponse.responseTypes.map { it.toMutableList() }
            scope = oauthRegisterResponse.scope
            tokenEndpointAuthMethod = oauthRegisterResponse.tokenEndpointAuthMethod
            tosUri = oauthRegisterResponse.tosUri
            additionalProperties = oauthRegisterResponse.additionalProperties.toMutableMap()
        }

        /** Unique client identifier */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** Unix timestamp of when the client ID was issued */
        fun clientIdIssuedAt(clientIdIssuedAt: Long) =
            clientIdIssuedAt(JsonField.of(clientIdIssuedAt))

        /**
         * Sets [Builder.clientIdIssuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientIdIssuedAt] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientIdIssuedAt(clientIdIssuedAt: JsonField<Long>) = apply {
            this.clientIdIssuedAt = clientIdIssuedAt
        }

        /** Human-readable client name */
        fun clientName(clientName: String) = clientName(JsonField.of(clientName))

        /**
         * Sets [Builder.clientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientName(clientName: JsonField<String>) = apply { this.clientName = clientName }

        /** Client secret (only for confidential clients) */
        fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        /** Array of allowed grant types */
        fun grantTypes(grantTypes: List<String>) = grantTypes(JsonField.of(grantTypes))

        /**
         * Sets [Builder.grantTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grantTypes(grantTypes: JsonField<List<String>>) = apply {
            this.grantTypes = grantTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [grantTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGrantType(grantType: String) = apply {
            grantTypes =
                (grantTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("grantTypes", it).add(grantType)
                }
        }

        /** URL of the client logo */
        fun logoUri(logoUri: String) = logoUri(JsonField.of(logoUri))

        /**
         * Sets [Builder.logoUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUri(logoUri: JsonField<String>) = apply { this.logoUri = logoUri }

        /** URL of the client's privacy policy */
        fun policyUri(policyUri: String) = policyUri(JsonField.of(policyUri))

        /**
         * Sets [Builder.policyUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policyUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun policyUri(policyUri: JsonField<String>) = apply { this.policyUri = policyUri }

        /** Array of redirection URIs */
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

        /** Array of allowed response types */
        fun responseTypes(responseTypes: List<String>) = responseTypes(JsonField.of(responseTypes))

        /**
         * Sets [Builder.responseTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseTypes(responseTypes: JsonField<List<String>>) = apply {
            this.responseTypes = responseTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [responseTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponseType(responseType: String) = apply {
            responseTypes =
                (responseTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("responseTypes", it).add(responseType)
                }
        }

        /** Space-separated scope values */
        fun scope(scope: String) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<String>) = apply { this.scope = scope }

        /** Token endpoint authentication method */
        fun tokenEndpointAuthMethod(tokenEndpointAuthMethod: String) =
            tokenEndpointAuthMethod(JsonField.of(tokenEndpointAuthMethod))

        /**
         * Sets [Builder.tokenEndpointAuthMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenEndpointAuthMethod] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tokenEndpointAuthMethod(tokenEndpointAuthMethod: JsonField<String>) = apply {
            this.tokenEndpointAuthMethod = tokenEndpointAuthMethod
        }

        /** URL of the client's terms of service */
        fun tosUri(tosUri: String) = tosUri(JsonField.of(tosUri))

        /**
         * Sets [Builder.tosUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tosUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [OAuthRegisterResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientIdIssuedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthRegisterResponse =
            OAuthRegisterResponse(
                checkRequired("clientId", clientId),
                checkRequired("clientIdIssuedAt", clientIdIssuedAt),
                clientName,
                clientSecret,
                (grantTypes ?: JsonMissing.of()).map { it.toImmutable() },
                logoUri,
                policyUri,
                (redirectUris ?: JsonMissing.of()).map { it.toImmutable() },
                (responseTypes ?: JsonMissing.of()).map { it.toImmutable() },
                scope,
                tokenEndpointAuthMethod,
                tosUri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OAuthRegisterResponse = apply {
        if (validated) {
            return@apply
        }

        clientId()
        clientIdIssuedAt()
        clientName()
        clientSecret()
        grantTypes()
        logoUri()
        policyUri()
        redirectUris()
        responseTypes()
        scope()
        tokenEndpointAuthMethod()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (clientIdIssuedAt.asKnown().isPresent) 1 else 0) +
            (if (clientName.asKnown().isPresent) 1 else 0) +
            (if (clientSecret.asKnown().isPresent) 1 else 0) +
            (grantTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (logoUri.asKnown().isPresent) 1 else 0) +
            (if (policyUri.asKnown().isPresent) 1 else 0) +
            (redirectUris.asKnown().getOrNull()?.size ?: 0) +
            (responseTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (scope.asKnown().isPresent) 1 else 0) +
            (if (tokenEndpointAuthMethod.asKnown().isPresent) 1 else 0) +
            (if (tosUri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthRegisterResponse &&
            clientId == other.clientId &&
            clientIdIssuedAt == other.clientIdIssuedAt &&
            clientName == other.clientName &&
            clientSecret == other.clientSecret &&
            grantTypes == other.grantTypes &&
            logoUri == other.logoUri &&
            policyUri == other.policyUri &&
            redirectUris == other.redirectUris &&
            responseTypes == other.responseTypes &&
            scope == other.scope &&
            tokenEndpointAuthMethod == other.tokenEndpointAuthMethod &&
            tosUri == other.tosUri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientId,
            clientIdIssuedAt,
            clientName,
            clientSecret,
            grantTypes,
            logoUri,
            policyUri,
            redirectUris,
            responseTypes,
            scope,
            tokenEndpointAuthMethod,
            tosUri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthRegisterResponse{clientId=$clientId, clientIdIssuedAt=$clientIdIssuedAt, clientName=$clientName, clientSecret=$clientSecret, grantTypes=$grantTypes, logoUri=$logoUri, policyUri=$policyUri, redirectUris=$redirectUris, responseTypes=$responseTypes, scope=$scope, tokenEndpointAuthMethod=$tokenEndpointAuthMethod, tosUri=$tosUri, additionalProperties=$additionalProperties}"
}
