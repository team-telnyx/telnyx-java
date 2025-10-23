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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new OAuth client */
class OAuthClientCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of allowed OAuth grant types
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowedGrantTypes(): List<AllowedGrantType> = body.allowedGrantTypes()

    /**
     * List of allowed OAuth scopes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowedScopes(): List<String> = body.allowedScopes()

    /**
     * OAuth client type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientType(): ClientType = body.clientType()

    /**
     * The name of the OAuth client
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

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
     * List of redirect URIs (required for authorization_code flow)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUris(): Optional<List<String>> = body.redirectUris()

    /**
     * Whether PKCE (Proof Key for Code Exchange) is required for this client
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirePkce(): Optional<Boolean> = body.requirePkce()

    /**
     * URL of the client's terms of service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tosUri(): Optional<String> = body.tosUri()

    /**
     * Returns the raw JSON value of [allowedGrantTypes].
     *
     * Unlike [allowedGrantTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedGrantTypes(): JsonField<List<AllowedGrantType>> = body._allowedGrantTypes()

    /**
     * Returns the raw JSON value of [allowedScopes].
     *
     * Unlike [allowedScopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _allowedScopes(): JsonField<List<String>> = body._allowedScopes()

    /**
     * Returns the raw JSON value of [clientType].
     *
     * Unlike [clientType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientType(): JsonField<ClientType> = body._clientType()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

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
     * Returns the raw JSON value of [requirePkce].
     *
     * Unlike [requirePkce], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requirePkce(): JsonField<Boolean> = body._requirePkce()

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

        /**
         * Returns a mutable builder for constructing an instance of [OAuthClientCreateParams].
         *
         * The following fields are required:
         * ```java
         * .allowedGrantTypes()
         * .allowedScopes()
         * .clientType()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthClientCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(oauthClientCreateParams: OAuthClientCreateParams) = apply {
            body = oauthClientCreateParams.body.toBuilder()
            additionalHeaders = oauthClientCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthClientCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowedGrantTypes]
         * - [allowedScopes]
         * - [clientType]
         * - [name]
         * - [logoUri]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of allowed OAuth grant types */
        fun allowedGrantTypes(allowedGrantTypes: List<AllowedGrantType>) = apply {
            body.allowedGrantTypes(allowedGrantTypes)
        }

        /**
         * Sets [Builder.allowedGrantTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedGrantTypes] with a well-typed
         * `List<AllowedGrantType>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun allowedGrantTypes(allowedGrantTypes: JsonField<List<AllowedGrantType>>) = apply {
            body.allowedGrantTypes(allowedGrantTypes)
        }

        /**
         * Adds a single [AllowedGrantType] to [allowedGrantTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedGrantType(allowedGrantType: AllowedGrantType) = apply {
            body.addAllowedGrantType(allowedGrantType)
        }

        /** List of allowed OAuth scopes */
        fun allowedScopes(allowedScopes: List<String>) = apply { body.allowedScopes(allowedScopes) }

        /**
         * Sets [Builder.allowedScopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedScopes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedScopes(allowedScopes: JsonField<List<String>>) = apply {
            body.allowedScopes(allowedScopes)
        }

        /**
         * Adds a single [String] to [allowedScopes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedScope(allowedScope: String) = apply { body.addAllowedScope(allowedScope) }

        /** OAuth client type */
        fun clientType(clientType: ClientType) = apply { body.clientType(clientType) }

        /**
         * Sets [Builder.clientType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientType] with a well-typed [ClientType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientType(clientType: JsonField<ClientType>) = apply { body.clientType(clientType) }

        /** The name of the OAuth client */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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

        /** List of redirect URIs (required for authorization_code flow) */
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

        /** Whether PKCE (Proof Key for Code Exchange) is required for this client */
        fun requirePkce(requirePkce: Boolean) = apply { body.requirePkce(requirePkce) }

        /**
         * Sets [Builder.requirePkce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirePkce] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requirePkce(requirePkce: JsonField<Boolean>) = apply { body.requirePkce(requirePkce) }

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
         * Returns an immutable instance of [OAuthClientCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allowedGrantTypes()
         * .allowedScopes()
         * .clientType()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthClientCreateParams =
            OAuthClientCreateParams(
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
        private val allowedGrantTypes: JsonField<List<AllowedGrantType>>,
        private val allowedScopes: JsonField<List<String>>,
        private val clientType: JsonField<ClientType>,
        private val name: JsonField<String>,
        private val logoUri: JsonField<String>,
        private val policyUri: JsonField<String>,
        private val redirectUris: JsonField<List<String>>,
        private val requirePkce: JsonField<Boolean>,
        private val tosUri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowed_grant_types")
            @ExcludeMissing
            allowedGrantTypes: JsonField<List<AllowedGrantType>> = JsonMissing.of(),
            @JsonProperty("allowed_scopes")
            @ExcludeMissing
            allowedScopes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("client_type")
            @ExcludeMissing
            clientType: JsonField<ClientType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logo_uri") @ExcludeMissing logoUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("policy_uri")
            @ExcludeMissing
            policyUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect_uris")
            @ExcludeMissing
            redirectUris: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("require_pkce")
            @ExcludeMissing
            requirePkce: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tos_uri") @ExcludeMissing tosUri: JsonField<String> = JsonMissing.of(),
        ) : this(
            allowedGrantTypes,
            allowedScopes,
            clientType,
            name,
            logoUri,
            policyUri,
            redirectUris,
            requirePkce,
            tosUri,
            mutableMapOf(),
        )

        /**
         * List of allowed OAuth grant types
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allowedGrantTypes(): List<AllowedGrantType> =
            allowedGrantTypes.getRequired("allowed_grant_types")

        /**
         * List of allowed OAuth scopes
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allowedScopes(): List<String> = allowedScopes.getRequired("allowed_scopes")

        /**
         * OAuth client type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clientType(): ClientType = clientType.getRequired("client_type")

        /**
         * The name of the OAuth client
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

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
         * List of redirect URIs (required for authorization_code flow)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUris(): Optional<List<String>> = redirectUris.getOptional("redirect_uris")

        /**
         * Whether PKCE (Proof Key for Code Exchange) is required for this client
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirePkce(): Optional<Boolean> = requirePkce.getOptional("require_pkce")

        /**
         * URL of the client's terms of service
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tosUri(): Optional<String> = tosUri.getOptional("tos_uri")

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
         * Returns the raw JSON value of [clientType].
         *
         * Unlike [clientType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_type")
        @ExcludeMissing
        fun _clientType(): JsonField<ClientType> = clientType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [requirePkce].
         *
         * Unlike [requirePkce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("require_pkce")
        @ExcludeMissing
        fun _requirePkce(): JsonField<Boolean> = requirePkce

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .allowedGrantTypes()
             * .allowedScopes()
             * .clientType()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var allowedGrantTypes: JsonField<MutableList<AllowedGrantType>>? = null
            private var allowedScopes: JsonField<MutableList<String>>? = null
            private var clientType: JsonField<ClientType>? = null
            private var name: JsonField<String>? = null
            private var logoUri: JsonField<String> = JsonMissing.of()
            private var policyUri: JsonField<String> = JsonMissing.of()
            private var redirectUris: JsonField<MutableList<String>>? = null
            private var requirePkce: JsonField<Boolean> = JsonMissing.of()
            private var tosUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowedGrantTypes = body.allowedGrantTypes.map { it.toMutableList() }
                allowedScopes = body.allowedScopes.map { it.toMutableList() }
                clientType = body.clientType
                name = body.name
                logoUri = body.logoUri
                policyUri = body.policyUri
                redirectUris = body.redirectUris.map { it.toMutableList() }
                requirePkce = body.requirePkce
                tosUri = body.tosUri
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** The name of the OAuth client */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            /** List of redirect URIs (required for authorization_code flow) */
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
             *
             * The following fields are required:
             * ```java
             * .allowedGrantTypes()
             * .allowedScopes()
             * .clientType()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("allowedGrantTypes", allowedGrantTypes).map { it.toImmutable() },
                    checkRequired("allowedScopes", allowedScopes).map { it.toImmutable() },
                    checkRequired("clientType", clientType),
                    checkRequired("name", name),
                    logoUri,
                    policyUri,
                    (redirectUris ?: JsonMissing.of()).map { it.toImmutable() },
                    requirePkce,
                    tosUri,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowedGrantTypes().forEach { it.validate() }
            allowedScopes()
            clientType().validate()
            name()
            logoUri()
            policyUri()
            redirectUris()
            requirePkce()
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
            (allowedGrantTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (allowedScopes.asKnown().getOrNull()?.size ?: 0) +
                (clientType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (logoUri.asKnown().isPresent) 1 else 0) +
                (if (policyUri.asKnown().isPresent) 1 else 0) +
                (redirectUris.asKnown().getOrNull()?.size ?: 0) +
                (if (requirePkce.asKnown().isPresent) 1 else 0) +
                (if (tosUri.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowedGrantTypes == other.allowedGrantTypes &&
                allowedScopes == other.allowedScopes &&
                clientType == other.clientType &&
                name == other.name &&
                logoUri == other.logoUri &&
                policyUri == other.policyUri &&
                redirectUris == other.redirectUris &&
                requirePkce == other.requirePkce &&
                tosUri == other.tosUri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedGrantTypes,
                allowedScopes,
                clientType,
                name,
                logoUri,
                policyUri,
                redirectUris,
                requirePkce,
                tosUri,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowedGrantTypes=$allowedGrantTypes, allowedScopes=$allowedScopes, clientType=$clientType, name=$name, logoUri=$logoUri, policyUri=$policyUri, redirectUris=$redirectUris, requirePkce=$requirePkce, tosUri=$tosUri, additionalProperties=$additionalProperties}"
    }

    class AllowedGrantType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * An enum containing [AllowedGrantType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AllowedGrantType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLIENT_CREDENTIALS,
            AUTHORIZATION_CODE,
            REFRESH_TOKEN,
            /**
             * An enum member indicating that [AllowedGrantType] was instantiated with an unknown
             * value.
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
                CLIENT_CREDENTIALS -> Value.CLIENT_CREDENTIALS
                AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
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
                CLIENT_CREDENTIALS -> Known.CLIENT_CREDENTIALS
                AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
                REFRESH_TOKEN -> Known.REFRESH_TOKEN
                else -> throw TelnyxInvalidDataException("Unknown AllowedGrantType: $value")
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

    /** OAuth client type */
    class ClientType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PUBLIC,
            CONFIDENTIAL,
            /**
             * An enum member indicating that [ClientType] was instantiated with an unknown value.
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
                PUBLIC -> Value.PUBLIC
                CONFIDENTIAL -> Value.CONFIDENTIAL
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
                PUBLIC -> Known.PUBLIC
                CONFIDENTIAL -> Known.CONFIDENTIAL
                else -> throw TelnyxInvalidDataException("Unknown ClientType: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthClientCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OAuthClientCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
