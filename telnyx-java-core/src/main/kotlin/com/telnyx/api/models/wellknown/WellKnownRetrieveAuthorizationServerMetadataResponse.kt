// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wellknown

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WellKnownRetrieveAuthorizationServerMetadataResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorizationEndpoint: JsonField<String>,
    private val codeChallengeMethodsSupported: JsonField<List<String>>,
    private val grantTypesSupported: JsonField<List<String>>,
    private val introspectionEndpoint: JsonField<String>,
    private val issuer: JsonField<String>,
    private val jwksUri: JsonField<String>,
    private val registrationEndpoint: JsonField<String>,
    private val responseTypesSupported: JsonField<List<String>>,
    private val scopesSupported: JsonField<List<String>>,
    private val tokenEndpoint: JsonField<String>,
    private val tokenEndpointAuthMethodsSupported: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorization_endpoint")
        @ExcludeMissing
        authorizationEndpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code_challenge_methods_supported")
        @ExcludeMissing
        codeChallengeMethodsSupported: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("grant_types_supported")
        @ExcludeMissing
        grantTypesSupported: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("introspection_endpoint")
        @ExcludeMissing
        introspectionEndpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issuer") @ExcludeMissing issuer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jwks_uri") @ExcludeMissing jwksUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registration_endpoint")
        @ExcludeMissing
        registrationEndpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response_types_supported")
        @ExcludeMissing
        responseTypesSupported: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("scopes_supported")
        @ExcludeMissing
        scopesSupported: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("token_endpoint")
        @ExcludeMissing
        tokenEndpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_endpoint_auth_methods_supported")
        @ExcludeMissing
        tokenEndpointAuthMethodsSupported: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        authorizationEndpoint,
        codeChallengeMethodsSupported,
        grantTypesSupported,
        introspectionEndpoint,
        issuer,
        jwksUri,
        registrationEndpoint,
        responseTypesSupported,
        scopesSupported,
        tokenEndpoint,
        tokenEndpointAuthMethodsSupported,
        mutableMapOf(),
    )

    /**
     * Authorization endpoint URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizationEndpoint(): Optional<String> =
        authorizationEndpoint.getOptional("authorization_endpoint")

    /**
     * Supported PKCE code challenge methods
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codeChallengeMethodsSupported(): Optional<List<String>> =
        codeChallengeMethodsSupported.getOptional("code_challenge_methods_supported")

    /**
     * Supported grant types
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grantTypesSupported(): Optional<List<String>> =
        grantTypesSupported.getOptional("grant_types_supported")

    /**
     * Token introspection endpoint URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introspectionEndpoint(): Optional<String> =
        introspectionEndpoint.getOptional("introspection_endpoint")

    /**
     * Authorization server issuer URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun issuer(): Optional<String> = issuer.getOptional("issuer")

    /**
     * JWK Set endpoint URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jwksUri(): Optional<String> = jwksUri.getOptional("jwks_uri")

    /**
     * Dynamic client registration endpoint URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrationEndpoint(): Optional<String> =
        registrationEndpoint.getOptional("registration_endpoint")

    /**
     * Supported response types
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseTypesSupported(): Optional<List<String>> =
        responseTypesSupported.getOptional("response_types_supported")

    /**
     * Supported OAuth scopes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scopesSupported(): Optional<List<String>> = scopesSupported.getOptional("scopes_supported")

    /**
     * Token endpoint URL
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenEndpoint(): Optional<String> = tokenEndpoint.getOptional("token_endpoint")

    /**
     * Supported token endpoint authentication methods
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenEndpointAuthMethodsSupported(): Optional<List<String>> =
        tokenEndpointAuthMethodsSupported.getOptional("token_endpoint_auth_methods_supported")

    /**
     * Returns the raw JSON value of [authorizationEndpoint].
     *
     * Unlike [authorizationEndpoint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorization_endpoint")
    @ExcludeMissing
    fun _authorizationEndpoint(): JsonField<String> = authorizationEndpoint

    /**
     * Returns the raw JSON value of [codeChallengeMethodsSupported].
     *
     * Unlike [codeChallengeMethodsSupported], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("code_challenge_methods_supported")
    @ExcludeMissing
    fun _codeChallengeMethodsSupported(): JsonField<List<String>> = codeChallengeMethodsSupported

    /**
     * Returns the raw JSON value of [grantTypesSupported].
     *
     * Unlike [grantTypesSupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("grant_types_supported")
    @ExcludeMissing
    fun _grantTypesSupported(): JsonField<List<String>> = grantTypesSupported

    /**
     * Returns the raw JSON value of [introspectionEndpoint].
     *
     * Unlike [introspectionEndpoint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("introspection_endpoint")
    @ExcludeMissing
    fun _introspectionEndpoint(): JsonField<String> = introspectionEndpoint

    /**
     * Returns the raw JSON value of [issuer].
     *
     * Unlike [issuer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issuer") @ExcludeMissing fun _issuer(): JsonField<String> = issuer

    /**
     * Returns the raw JSON value of [jwksUri].
     *
     * Unlike [jwksUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jwks_uri") @ExcludeMissing fun _jwksUri(): JsonField<String> = jwksUri

    /**
     * Returns the raw JSON value of [registrationEndpoint].
     *
     * Unlike [registrationEndpoint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registration_endpoint")
    @ExcludeMissing
    fun _registrationEndpoint(): JsonField<String> = registrationEndpoint

    /**
     * Returns the raw JSON value of [responseTypesSupported].
     *
     * Unlike [responseTypesSupported], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("response_types_supported")
    @ExcludeMissing
    fun _responseTypesSupported(): JsonField<List<String>> = responseTypesSupported

    /**
     * Returns the raw JSON value of [scopesSupported].
     *
     * Unlike [scopesSupported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes_supported")
    @ExcludeMissing
    fun _scopesSupported(): JsonField<List<String>> = scopesSupported

    /**
     * Returns the raw JSON value of [tokenEndpoint].
     *
     * Unlike [tokenEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_endpoint")
    @ExcludeMissing
    fun _tokenEndpoint(): JsonField<String> = tokenEndpoint

    /**
     * Returns the raw JSON value of [tokenEndpointAuthMethodsSupported].
     *
     * Unlike [tokenEndpointAuthMethodsSupported], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("token_endpoint_auth_methods_supported")
    @ExcludeMissing
    fun _tokenEndpointAuthMethodsSupported(): JsonField<List<String>> =
        tokenEndpointAuthMethodsSupported

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
         * Returns a mutable builder for constructing an instance of
         * [WellKnownRetrieveAuthorizationServerMetadataResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WellKnownRetrieveAuthorizationServerMetadataResponse]. */
    class Builder internal constructor() {

        private var authorizationEndpoint: JsonField<String> = JsonMissing.of()
        private var codeChallengeMethodsSupported: JsonField<MutableList<String>>? = null
        private var grantTypesSupported: JsonField<MutableList<String>>? = null
        private var introspectionEndpoint: JsonField<String> = JsonMissing.of()
        private var issuer: JsonField<String> = JsonMissing.of()
        private var jwksUri: JsonField<String> = JsonMissing.of()
        private var registrationEndpoint: JsonField<String> = JsonMissing.of()
        private var responseTypesSupported: JsonField<MutableList<String>>? = null
        private var scopesSupported: JsonField<MutableList<String>>? = null
        private var tokenEndpoint: JsonField<String> = JsonMissing.of()
        private var tokenEndpointAuthMethodsSupported: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            wellKnownRetrieveAuthorizationServerMetadataResponse:
                WellKnownRetrieveAuthorizationServerMetadataResponse
        ) = apply {
            authorizationEndpoint =
                wellKnownRetrieveAuthorizationServerMetadataResponse.authorizationEndpoint
            codeChallengeMethodsSupported =
                wellKnownRetrieveAuthorizationServerMetadataResponse.codeChallengeMethodsSupported
                    .map { it.toMutableList() }
            grantTypesSupported =
                wellKnownRetrieveAuthorizationServerMetadataResponse.grantTypesSupported.map {
                    it.toMutableList()
                }
            introspectionEndpoint =
                wellKnownRetrieveAuthorizationServerMetadataResponse.introspectionEndpoint
            issuer = wellKnownRetrieveAuthorizationServerMetadataResponse.issuer
            jwksUri = wellKnownRetrieveAuthorizationServerMetadataResponse.jwksUri
            registrationEndpoint =
                wellKnownRetrieveAuthorizationServerMetadataResponse.registrationEndpoint
            responseTypesSupported =
                wellKnownRetrieveAuthorizationServerMetadataResponse.responseTypesSupported.map {
                    it.toMutableList()
                }
            scopesSupported =
                wellKnownRetrieveAuthorizationServerMetadataResponse.scopesSupported.map {
                    it.toMutableList()
                }
            tokenEndpoint = wellKnownRetrieveAuthorizationServerMetadataResponse.tokenEndpoint
            tokenEndpointAuthMethodsSupported =
                wellKnownRetrieveAuthorizationServerMetadataResponse
                    .tokenEndpointAuthMethodsSupported
                    .map { it.toMutableList() }
            additionalProperties =
                wellKnownRetrieveAuthorizationServerMetadataResponse.additionalProperties
                    .toMutableMap()
        }

        /** Authorization endpoint URL */
        fun authorizationEndpoint(authorizationEndpoint: String) =
            authorizationEndpoint(JsonField.of(authorizationEndpoint))

        /**
         * Sets [Builder.authorizationEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationEndpoint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizationEndpoint(authorizationEndpoint: JsonField<String>) = apply {
            this.authorizationEndpoint = authorizationEndpoint
        }

        /** Supported PKCE code challenge methods */
        fun codeChallengeMethodsSupported(codeChallengeMethodsSupported: List<String>) =
            codeChallengeMethodsSupported(JsonField.of(codeChallengeMethodsSupported))

        /**
         * Sets [Builder.codeChallengeMethodsSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeChallengeMethodsSupported] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun codeChallengeMethodsSupported(codeChallengeMethodsSupported: JsonField<List<String>>) =
            apply {
                this.codeChallengeMethodsSupported =
                    codeChallengeMethodsSupported.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [Builder.codeChallengeMethodsSupported].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCodeChallengeMethodsSupported(codeChallengeMethodsSupported: String) = apply {
            this.codeChallengeMethodsSupported =
                (this.codeChallengeMethodsSupported ?: JsonField.of(mutableListOf())).also {
                    checkKnown("codeChallengeMethodsSupported", it)
                        .add(codeChallengeMethodsSupported)
                }
        }

        /** Supported grant types */
        fun grantTypesSupported(grantTypesSupported: List<String>) =
            grantTypesSupported(JsonField.of(grantTypesSupported))

        /**
         * Sets [Builder.grantTypesSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantTypesSupported] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun grantTypesSupported(grantTypesSupported: JsonField<List<String>>) = apply {
            this.grantTypesSupported = grantTypesSupported.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.grantTypesSupported].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGrantTypesSupported(grantTypesSupported: String) = apply {
            this.grantTypesSupported =
                (this.grantTypesSupported ?: JsonField.of(mutableListOf())).also {
                    checkKnown("grantTypesSupported", it).add(grantTypesSupported)
                }
        }

        /** Token introspection endpoint URL */
        fun introspectionEndpoint(introspectionEndpoint: String) =
            introspectionEndpoint(JsonField.of(introspectionEndpoint))

        /**
         * Sets [Builder.introspectionEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introspectionEndpoint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun introspectionEndpoint(introspectionEndpoint: JsonField<String>) = apply {
            this.introspectionEndpoint = introspectionEndpoint
        }

        /** Authorization server issuer URL */
        fun issuer(issuer: String) = issuer(JsonField.of(issuer))

        /**
         * Sets [Builder.issuer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun issuer(issuer: JsonField<String>) = apply { this.issuer = issuer }

        /** JWK Set endpoint URL */
        fun jwksUri(jwksUri: String) = jwksUri(JsonField.of(jwksUri))

        /**
         * Sets [Builder.jwksUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jwksUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jwksUri(jwksUri: JsonField<String>) = apply { this.jwksUri = jwksUri }

        /** Dynamic client registration endpoint URL */
        fun registrationEndpoint(registrationEndpoint: String) =
            registrationEndpoint(JsonField.of(registrationEndpoint))

        /**
         * Sets [Builder.registrationEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationEndpoint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationEndpoint(registrationEndpoint: JsonField<String>) = apply {
            this.registrationEndpoint = registrationEndpoint
        }

        /** Supported response types */
        fun responseTypesSupported(responseTypesSupported: List<String>) =
            responseTypesSupported(JsonField.of(responseTypesSupported))

        /**
         * Sets [Builder.responseTypesSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseTypesSupported] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun responseTypesSupported(responseTypesSupported: JsonField<List<String>>) = apply {
            this.responseTypesSupported = responseTypesSupported.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.responseTypesSupported].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponseTypesSupported(responseTypesSupported: String) = apply {
            this.responseTypesSupported =
                (this.responseTypesSupported ?: JsonField.of(mutableListOf())).also {
                    checkKnown("responseTypesSupported", it).add(responseTypesSupported)
                }
        }

        /** Supported OAuth scopes */
        fun scopesSupported(scopesSupported: List<String>) =
            scopesSupported(JsonField.of(scopesSupported))

        /**
         * Sets [Builder.scopesSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopesSupported] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scopesSupported(scopesSupported: JsonField<List<String>>) = apply {
            this.scopesSupported = scopesSupported.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.scopesSupported].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScopesSupported(scopesSupported: String) = apply {
            this.scopesSupported =
                (this.scopesSupported ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopesSupported", it).add(scopesSupported)
                }
        }

        /** Token endpoint URL */
        fun tokenEndpoint(tokenEndpoint: String) = tokenEndpoint(JsonField.of(tokenEndpoint))

        /**
         * Sets [Builder.tokenEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenEndpoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenEndpoint(tokenEndpoint: JsonField<String>) = apply {
            this.tokenEndpoint = tokenEndpoint
        }

        /** Supported token endpoint authentication methods */
        fun tokenEndpointAuthMethodsSupported(tokenEndpointAuthMethodsSupported: List<String>) =
            tokenEndpointAuthMethodsSupported(JsonField.of(tokenEndpointAuthMethodsSupported))

        /**
         * Sets [Builder.tokenEndpointAuthMethodsSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenEndpointAuthMethodsSupported] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenEndpointAuthMethodsSupported(
            tokenEndpointAuthMethodsSupported: JsonField<List<String>>
        ) = apply {
            this.tokenEndpointAuthMethodsSupported =
                tokenEndpointAuthMethodsSupported.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.tokenEndpointAuthMethodsSupported].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTokenEndpointAuthMethodsSupported(tokenEndpointAuthMethodsSupported: String) =
            apply {
                this.tokenEndpointAuthMethodsSupported =
                    (this.tokenEndpointAuthMethodsSupported ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tokenEndpointAuthMethodsSupported", it)
                            .add(tokenEndpointAuthMethodsSupported)
                    }
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
         * Returns an immutable instance of [WellKnownRetrieveAuthorizationServerMetadataResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WellKnownRetrieveAuthorizationServerMetadataResponse =
            WellKnownRetrieveAuthorizationServerMetadataResponse(
                authorizationEndpoint,
                (codeChallengeMethodsSupported ?: JsonMissing.of()).map { it.toImmutable() },
                (grantTypesSupported ?: JsonMissing.of()).map { it.toImmutable() },
                introspectionEndpoint,
                issuer,
                jwksUri,
                registrationEndpoint,
                (responseTypesSupported ?: JsonMissing.of()).map { it.toImmutable() },
                (scopesSupported ?: JsonMissing.of()).map { it.toImmutable() },
                tokenEndpoint,
                (tokenEndpointAuthMethodsSupported ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WellKnownRetrieveAuthorizationServerMetadataResponse = apply {
        if (validated) {
            return@apply
        }

        authorizationEndpoint()
        codeChallengeMethodsSupported()
        grantTypesSupported()
        introspectionEndpoint()
        issuer()
        jwksUri()
        registrationEndpoint()
        responseTypesSupported()
        scopesSupported()
        tokenEndpoint()
        tokenEndpointAuthMethodsSupported()
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
        (if (authorizationEndpoint.asKnown().isPresent) 1 else 0) +
            (codeChallengeMethodsSupported.asKnown().getOrNull()?.size ?: 0) +
            (grantTypesSupported.asKnown().getOrNull()?.size ?: 0) +
            (if (introspectionEndpoint.asKnown().isPresent) 1 else 0) +
            (if (issuer.asKnown().isPresent) 1 else 0) +
            (if (jwksUri.asKnown().isPresent) 1 else 0) +
            (if (registrationEndpoint.asKnown().isPresent) 1 else 0) +
            (responseTypesSupported.asKnown().getOrNull()?.size ?: 0) +
            (scopesSupported.asKnown().getOrNull()?.size ?: 0) +
            (if (tokenEndpoint.asKnown().isPresent) 1 else 0) +
            (tokenEndpointAuthMethodsSupported.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WellKnownRetrieveAuthorizationServerMetadataResponse &&
            authorizationEndpoint == other.authorizationEndpoint &&
            codeChallengeMethodsSupported == other.codeChallengeMethodsSupported &&
            grantTypesSupported == other.grantTypesSupported &&
            introspectionEndpoint == other.introspectionEndpoint &&
            issuer == other.issuer &&
            jwksUri == other.jwksUri &&
            registrationEndpoint == other.registrationEndpoint &&
            responseTypesSupported == other.responseTypesSupported &&
            scopesSupported == other.scopesSupported &&
            tokenEndpoint == other.tokenEndpoint &&
            tokenEndpointAuthMethodsSupported == other.tokenEndpointAuthMethodsSupported &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authorizationEndpoint,
            codeChallengeMethodsSupported,
            grantTypesSupported,
            introspectionEndpoint,
            issuer,
            jwksUri,
            registrationEndpoint,
            responseTypesSupported,
            scopesSupported,
            tokenEndpoint,
            tokenEndpointAuthMethodsSupported,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WellKnownRetrieveAuthorizationServerMetadataResponse{authorizationEndpoint=$authorizationEndpoint, codeChallengeMethodsSupported=$codeChallengeMethodsSupported, grantTypesSupported=$grantTypesSupported, introspectionEndpoint=$introspectionEndpoint, issuer=$issuer, jwksUri=$jwksUri, registrationEndpoint=$registrationEndpoint, responseTypesSupported=$responseTypesSupported, scopesSupported=$scopesSupported, tokenEndpoint=$tokenEndpoint, tokenEndpointAuthMethodsSupported=$tokenEndpointAuthMethodsSupported, additionalProperties=$additionalProperties}"
}
