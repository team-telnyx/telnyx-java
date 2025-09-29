// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Register a new OAuth client dynamically (RFC 7591) */
class OAuthRegisterParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Human-readable string name of the client to be presented to the end-user
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientName(): Optional<String> = body.clientName()

    /**
     * Array of OAuth 2.0 grant type strings that the client may use
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grantTypes(): Optional<List<GrantType>> = body.grantTypes()

    /**
     * URL of the client logo
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUri(): Optional<String> = body.logoUri()

    /**
     * URL of the client's privacy policy
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun policyUri(): Optional<String> = body.policyUri()

    /**
     * Array of redirection URI strings for use in redirect-based flows
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUris(): Optional<List<String>> = body.redirectUris()

    /**
     * Array of the OAuth 2.0 response type strings that the client may use
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseTypes(): Optional<List<String>> = body.responseTypes()

    /**
     * Space-separated string of scope values that the client may use
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<String> = body.scope()

    /**
     * Authentication method for the token endpoint
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenEndpointAuthMethod(): Optional<TokenEndpointAuthMethod> =
        body.tokenEndpointAuthMethod()

    /**
     * URL of the client's terms of service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tosUri(): Optional<String> = body.tosUri()

    /**
     * Returns the raw JSON value of [clientName].
     *
     * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientName(): JsonField<String> = body._clientName()

    /**
     * Returns the raw JSON value of [grantTypes].
     *
     * Unlike [grantTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _grantTypes(): JsonField<List<GrantType>> = body._grantTypes()

    /**
     * Returns the raw JSON value of [logoUri].
     *
     * Unlike [logoUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logoUri(): JsonField<String> = body._logoUri()

    /**
     * Returns the raw JSON value of [policyUri].
     *
     * Unlike [policyUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _policyUri(): JsonField<String> = body._policyUri()

    /**
     * Returns the raw JSON value of [redirectUris].
     *
     * Unlike [redirectUris], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redirectUris(): JsonField<List<String>> = body._redirectUris()

    /**
     * Returns the raw JSON value of [responseTypes].
     *
     * Unlike [responseTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responseTypes(): JsonField<List<String>> = body._responseTypes()

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scope(): JsonField<String> = body._scope()

    /**
     * Returns the raw JSON value of [tokenEndpointAuthMethod].
     *
     * Unlike [tokenEndpointAuthMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _tokenEndpointAuthMethod(): JsonField<TokenEndpointAuthMethod> =
        body._tokenEndpointAuthMethod()

    /**
     * Returns the raw JSON value of [tosUri].
     *
     * Unlike [tosUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tosUri(): JsonField<String> = body._tosUri()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OAuthRegisterParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OAuthRegisterParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthRegisterParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(oauthRegisterParams: OAuthRegisterParams) = apply {
            body = oauthRegisterParams.body.toBuilder()
            additionalHeaders = oauthRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthRegisterParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [clientName]
         * - [grantTypes]
         * - [logoUri]
         * - [policyUri]
         * - [redirectUris]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Human-readable string name of the client to be presented to the end-user */
        fun clientName(clientName: String) = apply { body.clientName(clientName) }

        /**
         * Sets [Builder.clientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientName(clientName: JsonField<String>) = apply { body.clientName(clientName) }

        /** Array of OAuth 2.0 grant type strings that the client may use */
        fun grantTypes(grantTypes: List<GrantType>) = apply { body.grantTypes(grantTypes) }

        /**
         * Sets [Builder.grantTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantTypes] with a well-typed `List<GrantType>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grantTypes(grantTypes: JsonField<List<GrantType>>) = apply {
            body.grantTypes(grantTypes)
        }

        /**
         * Adds a single [GrantType] to [grantTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGrantType(grantType: GrantType) = apply { body.addGrantType(grantType) }

        /** URL of the client logo */
        fun logoUri(logoUri: String) = apply { body.logoUri(logoUri) }

        /**
         * Sets [Builder.logoUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUri(logoUri: JsonField<String>) = apply { body.logoUri(logoUri) }

        /** URL of the client's privacy policy */
        fun policyUri(policyUri: String) = apply { body.policyUri(policyUri) }

        /**
         * Sets [Builder.policyUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policyUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun policyUri(policyUri: JsonField<String>) = apply { body.policyUri(policyUri) }

        /** Array of redirection URI strings for use in redirect-based flows */
        fun redirectUris(redirectUris: List<String>) = apply { body.redirectUris(redirectUris) }

        /**
         * Sets [Builder.redirectUris] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUris] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redirectUris(redirectUris: JsonField<List<String>>) = apply {
            body.redirectUris(redirectUris)
        }

        /**
         * Adds a single [String] to [Builder.redirectUris].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRedirectUris(redirectUris: String) = apply { body.addRedirectUris(redirectUris) }

        /** Array of the OAuth 2.0 response type strings that the client may use */
        fun responseTypes(responseTypes: List<String>) = apply { body.responseTypes(responseTypes) }

        /**
         * Sets [Builder.responseTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseTypes(responseTypes: JsonField<List<String>>) = apply {
            body.responseTypes(responseTypes)
        }

        /**
         * Adds a single [String] to [responseTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponseType(responseType: String) = apply { body.addResponseType(responseType) }

        /** Space-separated string of scope values that the client may use */
        fun scope(scope: String) = apply { body.scope(scope) }

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<String>) = apply { body.scope(scope) }

        /** Authentication method for the token endpoint */
        fun tokenEndpointAuthMethod(tokenEndpointAuthMethod: TokenEndpointAuthMethod) = apply {
            body.tokenEndpointAuthMethod(tokenEndpointAuthMethod)
        }

        /**
         * Sets [Builder.tokenEndpointAuthMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenEndpointAuthMethod] with a well-typed
         * [TokenEndpointAuthMethod] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun tokenEndpointAuthMethod(tokenEndpointAuthMethod: JsonField<TokenEndpointAuthMethod>) =
            apply {
                body.tokenEndpointAuthMethod(tokenEndpointAuthMethod)
            }

        /** URL of the client's terms of service */
        fun tosUri(tosUri: String) = apply { body.tosUri(tosUri) }

        /**
         * Sets [Builder.tosUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tosUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tosUri(tosUri: JsonField<String>) = apply { body.tosUri(tosUri) }

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
         * Returns an immutable instance of [OAuthRegisterParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OAuthRegisterParams =
            OAuthRegisterParams(
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
        private val clientName: JsonField<String>,
        private val grantTypes: JsonField<List<GrantType>>,
        private val logoUri: JsonField<String>,
        private val policyUri: JsonField<String>,
        private val redirectUris: JsonField<List<String>>,
        private val responseTypes: JsonField<List<String>>,
        private val scope: JsonField<String>,
        private val tokenEndpointAuthMethod: JsonField<TokenEndpointAuthMethod>,
        private val tosUri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_name")
            @ExcludeMissing
            clientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grant_types")
            @ExcludeMissing
            grantTypes: JsonField<List<GrantType>> = JsonMissing.of(),
            @JsonProperty("logo_uri") @ExcludeMissing logoUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("policy_uri")
            @ExcludeMissing
            policyUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect_uris")
            @ExcludeMissing
            redirectUris: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("response_types")
            @ExcludeMissing
            responseTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_endpoint_auth_method")
            @ExcludeMissing
            tokenEndpointAuthMethod: JsonField<TokenEndpointAuthMethod> = JsonMissing.of(),
            @JsonProperty("tos_uri") @ExcludeMissing tosUri: JsonField<String> = JsonMissing.of(),
        ) : this(
            clientName,
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
         * Human-readable string name of the client to be presented to the end-user
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientName(): Optional<String> = clientName.getOptional("client_name")

        /**
         * Array of OAuth 2.0 grant type strings that the client may use
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grantTypes(): Optional<List<GrantType>> = grantTypes.getOptional("grant_types")

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
         * Array of redirection URI strings for use in redirect-based flows
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUris(): Optional<List<String>> = redirectUris.getOptional("redirect_uris")

        /**
         * Array of the OAuth 2.0 response type strings that the client may use
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseTypes(): Optional<List<String>> = responseTypes.getOptional("response_types")

        /**
         * Space-separated string of scope values that the client may use
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scope(): Optional<String> = scope.getOptional("scope")

        /**
         * Authentication method for the token endpoint
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenEndpointAuthMethod(): Optional<TokenEndpointAuthMethod> =
            tokenEndpointAuthMethod.getOptional("token_endpoint_auth_method")

        /**
         * URL of the client's terms of service
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tosUri(): Optional<String> = tosUri.getOptional("tos_uri")

        /**
         * Returns the raw JSON value of [clientName].
         *
         * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_name")
        @ExcludeMissing
        fun _clientName(): JsonField<String> = clientName

        /**
         * Returns the raw JSON value of [grantTypes].
         *
         * Unlike [grantTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grant_types")
        @ExcludeMissing
        fun _grantTypes(): JsonField<List<GrantType>> = grantTypes

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
         * Returns the raw JSON value of [responseTypes].
         *
         * Unlike [responseTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        fun _tokenEndpointAuthMethod(): JsonField<TokenEndpointAuthMethod> = tokenEndpointAuthMethod

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var clientName: JsonField<String> = JsonMissing.of()
            private var grantTypes: JsonField<MutableList<GrantType>>? = null
            private var logoUri: JsonField<String> = JsonMissing.of()
            private var policyUri: JsonField<String> = JsonMissing.of()
            private var redirectUris: JsonField<MutableList<String>>? = null
            private var responseTypes: JsonField<MutableList<String>>? = null
            private var scope: JsonField<String> = JsonMissing.of()
            private var tokenEndpointAuthMethod: JsonField<TokenEndpointAuthMethod> =
                JsonMissing.of()
            private var tosUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientName = body.clientName
                grantTypes = body.grantTypes.map { it.toMutableList() }
                logoUri = body.logoUri
                policyUri = body.policyUri
                redirectUris = body.redirectUris.map { it.toMutableList() }
                responseTypes = body.responseTypes.map { it.toMutableList() }
                scope = body.scope
                tokenEndpointAuthMethod = body.tokenEndpointAuthMethod
                tosUri = body.tosUri
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Human-readable string name of the client to be presented to the end-user */
            fun clientName(clientName: String) = clientName(JsonField.of(clientName))

            /**
             * Sets [Builder.clientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientName(clientName: JsonField<String>) = apply { this.clientName = clientName }

            /** Array of OAuth 2.0 grant type strings that the client may use */
            fun grantTypes(grantTypes: List<GrantType>) = grantTypes(JsonField.of(grantTypes))

            /**
             * Sets [Builder.grantTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantTypes] with a well-typed `List<GrantType>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun grantTypes(grantTypes: JsonField<List<GrantType>>) = apply {
                this.grantTypes = grantTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [GrantType] to [grantTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGrantType(grantType: GrantType) = apply {
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
             * You should usually call [Builder.logoUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUri(logoUri: JsonField<String>) = apply { this.logoUri = logoUri }

            /** URL of the client's privacy policy */
            fun policyUri(policyUri: String) = policyUri(JsonField.of(policyUri))

            /**
             * Sets [Builder.policyUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.policyUri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun policyUri(policyUri: JsonField<String>) = apply { this.policyUri = policyUri }

            /** Array of redirection URI strings for use in redirect-based flows */
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

            /** Array of the OAuth 2.0 response type strings that the client may use */
            fun responseTypes(responseTypes: List<String>) =
                responseTypes(JsonField.of(responseTypes))

            /**
             * Sets [Builder.responseTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseTypes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Space-separated string of scope values that the client may use */
            fun scope(scope: String) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scope(scope: JsonField<String>) = apply { this.scope = scope }

            /** Authentication method for the token endpoint */
            fun tokenEndpointAuthMethod(tokenEndpointAuthMethod: TokenEndpointAuthMethod) =
                tokenEndpointAuthMethod(JsonField.of(tokenEndpointAuthMethod))

            /**
             * Sets [Builder.tokenEndpointAuthMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenEndpointAuthMethod] with a well-typed
             * [TokenEndpointAuthMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun tokenEndpointAuthMethod(
                tokenEndpointAuthMethod: JsonField<TokenEndpointAuthMethod>
            ) = apply { this.tokenEndpointAuthMethod = tokenEndpointAuthMethod }

            /** URL of the client's terms of service */
            fun tosUri(tosUri: String) = tosUri(JsonField.of(tosUri))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    clientName,
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

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            clientName()
            grantTypes().ifPresent { it.forEach { it.validate() } }
            logoUri()
            policyUri()
            redirectUris()
            responseTypes()
            scope()
            tokenEndpointAuthMethod().ifPresent { it.validate() }
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
            (if (clientName.asKnown().isPresent) 1 else 0) +
                (grantTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (logoUri.asKnown().isPresent) 1 else 0) +
                (if (policyUri.asKnown().isPresent) 1 else 0) +
                (redirectUris.asKnown().getOrNull()?.size ?: 0) +
                (responseTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (scope.asKnown().isPresent) 1 else 0) +
                (tokenEndpointAuthMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tosUri.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientName == other.clientName &&
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
                clientName,
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
            "Body{clientName=$clientName, grantTypes=$grantTypes, logoUri=$logoUri, policyUri=$policyUri, redirectUris=$redirectUris, responseTypes=$responseTypes, scope=$scope, tokenEndpointAuthMethod=$tokenEndpointAuthMethod, tosUri=$tosUri, additionalProperties=$additionalProperties}"
    }

    class GrantType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUTHORIZATION_CODE = of("authorization_code")

            @JvmField val CLIENT_CREDENTIALS = of("client_credentials")

            @JvmField val REFRESH_TOKEN = of("refresh_token")

            @JvmStatic fun of(value: String) = GrantType(JsonField.of(value))
        }

        /** An enum containing [GrantType]'s known values. */
        enum class Known {
            AUTHORIZATION_CODE,
            CLIENT_CREDENTIALS,
            REFRESH_TOKEN,
        }

        /**
         * An enum containing [GrantType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GrantType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZATION_CODE,
            CLIENT_CREDENTIALS,
            REFRESH_TOKEN,
            /**
             * An enum member indicating that [GrantType] was instantiated with an unknown value.
             */
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
                AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
                CLIENT_CREDENTIALS -> Value.CLIENT_CREDENTIALS
                REFRESH_TOKEN -> Value.REFRESH_TOKEN
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
                AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
                CLIENT_CREDENTIALS -> Known.CLIENT_CREDENTIALS
                REFRESH_TOKEN -> Known.REFRESH_TOKEN
                else -> throw TelnyxInvalidDataException("Unknown GrantType: $value")
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

        fun validate(): GrantType = apply {
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

            return other is GrantType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Authentication method for the token endpoint */
    class TokenEndpointAuthMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val CLIENT_SECRET_BASIC = of("client_secret_basic")

            @JvmField val CLIENT_SECRET_POST = of("client_secret_post")

            @JvmStatic fun of(value: String) = TokenEndpointAuthMethod(JsonField.of(value))
        }

        /** An enum containing [TokenEndpointAuthMethod]'s known values. */
        enum class Known {
            NONE,
            CLIENT_SECRET_BASIC,
            CLIENT_SECRET_POST,
        }

        /**
         * An enum containing [TokenEndpointAuthMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [TokenEndpointAuthMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            CLIENT_SECRET_BASIC,
            CLIENT_SECRET_POST,
            /**
             * An enum member indicating that [TokenEndpointAuthMethod] was instantiated with an
             * unknown value.
             */
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
                NONE -> Value.NONE
                CLIENT_SECRET_BASIC -> Value.CLIENT_SECRET_BASIC
                CLIENT_SECRET_POST -> Value.CLIENT_SECRET_POST
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
                NONE -> Known.NONE
                CLIENT_SECRET_BASIC -> Known.CLIENT_SECRET_BASIC
                CLIENT_SECRET_POST -> Known.CLIENT_SECRET_POST
                else -> throw TelnyxInvalidDataException("Unknown TokenEndpointAuthMethod: $value")
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

        fun validate(): TokenEndpointAuthMethod = apply {
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

            return other is TokenEndpointAuthMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthRegisterParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OAuthRegisterParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
