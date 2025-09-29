// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.oauth.OAuthGrantsParams
import com.telnyx.api.models.oauth.OAuthGrantsResponse
import com.telnyx.api.models.oauth.OAuthIntrospectParams
import com.telnyx.api.models.oauth.OAuthIntrospectResponse
import com.telnyx.api.models.oauth.OAuthRegisterParams
import com.telnyx.api.models.oauth.OAuthRegisterResponse
import com.telnyx.api.models.oauth.OAuthRetrieveAuthorizeParams
import com.telnyx.api.models.oauth.OAuthRetrieveJwksParams
import com.telnyx.api.models.oauth.OAuthRetrieveJwksResponse
import com.telnyx.api.models.oauth.OAuthRetrieveParams
import com.telnyx.api.models.oauth.OAuthRetrieveResponse
import com.telnyx.api.models.oauth.OAuthTokenParams
import com.telnyx.api.models.oauth.OAuthTokenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthServiceAsync

    /** Retrieve details about an OAuth consent token */
    fun retrieve(consentToken: String): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(consentToken, OAuthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        consentToken: String,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(params.toBuilder().consentToken(consentToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        consentToken: String,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
    ): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(consentToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: OAuthRetrieveParams): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        consentToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthRetrieveResponse> =
        retrieve(consentToken, OAuthRetrieveParams.none(), requestOptions)

    /** Create an OAuth authorization grant */
    fun grants(params: OAuthGrantsParams): CompletableFuture<OAuthGrantsResponse> =
        grants(params, RequestOptions.none())

    /** @see grants */
    fun grants(
        params: OAuthGrantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthGrantsResponse>

    /** Introspect an OAuth access token to check its validity and metadata */
    fun introspect(params: OAuthIntrospectParams): CompletableFuture<OAuthIntrospectResponse> =
        introspect(params, RequestOptions.none())

    /** @see introspect */
    fun introspect(
        params: OAuthIntrospectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthIntrospectResponse>

    /** Register a new OAuth client dynamically (RFC 7591) */
    fun register(): CompletableFuture<OAuthRegisterResponse> = register(OAuthRegisterParams.none())

    /** @see register */
    fun register(
        params: OAuthRegisterParams = OAuthRegisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRegisterResponse>

    /** @see register */
    fun register(
        params: OAuthRegisterParams = OAuthRegisterParams.none()
    ): CompletableFuture<OAuthRegisterResponse> = register(params, RequestOptions.none())

    /** @see register */
    fun register(requestOptions: RequestOptions): CompletableFuture<OAuthRegisterResponse> =
        register(OAuthRegisterParams.none(), requestOptions)

    /** OAuth 2.0 authorization endpoint for the authorization code flow */
    fun retrieveAuthorize(params: OAuthRetrieveAuthorizeParams): CompletableFuture<Void?> =
        retrieveAuthorize(params, RequestOptions.none())

    /** @see retrieveAuthorize */
    fun retrieveAuthorize(
        params: OAuthRetrieveAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve the JSON Web Key Set for token verification */
    fun retrieveJwks(): CompletableFuture<OAuthRetrieveJwksResponse> =
        retrieveJwks(OAuthRetrieveJwksParams.none())

    /** @see retrieveJwks */
    fun retrieveJwks(
        params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthRetrieveJwksResponse>

    /** @see retrieveJwks */
    fun retrieveJwks(
        params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none()
    ): CompletableFuture<OAuthRetrieveJwksResponse> = retrieveJwks(params, RequestOptions.none())

    /** @see retrieveJwks */
    fun retrieveJwks(requestOptions: RequestOptions): CompletableFuture<OAuthRetrieveJwksResponse> =
        retrieveJwks(OAuthRetrieveJwksParams.none(), requestOptions)

    /** Exchange authorization code, client credentials, or refresh token for access token */
    fun token(params: OAuthTokenParams): CompletableFuture<OAuthTokenResponse> =
        token(params, RequestOptions.none())

    /** @see token */
    fun token(
        params: OAuthTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthTokenResponse>

    /** A view of [OAuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth/consent/{consent_token}`, but is otherwise
         * the same as [OAuthServiceAsync.retrieve].
         */
        fun retrieve(
            consentToken: String
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(consentToken, OAuthRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            consentToken: String,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(params.toBuilder().consentToken(consentToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            consentToken: String,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(consentToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OAuthRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OAuthRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            consentToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveResponse>> =
            retrieve(consentToken, OAuthRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/grants`, but is otherwise the same as
         * [OAuthServiceAsync.grants].
         */
        fun grants(
            params: OAuthGrantsParams
        ): CompletableFuture<HttpResponseFor<OAuthGrantsResponse>> =
            grants(params, RequestOptions.none())

        /** @see grants */
        fun grants(
            params: OAuthGrantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantsResponse>>

        /**
         * Returns a raw HTTP response for `post /oauth/introspect`, but is otherwise the same as
         * [OAuthServiceAsync.introspect].
         */
        fun introspect(
            params: OAuthIntrospectParams
        ): CompletableFuture<HttpResponseFor<OAuthIntrospectResponse>> =
            introspect(params, RequestOptions.none())

        /** @see introspect */
        fun introspect(
            params: OAuthIntrospectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthIntrospectResponse>>

        /**
         * Returns a raw HTTP response for `post /oauth/register`, but is otherwise the same as
         * [OAuthServiceAsync.register].
         */
        fun register(): CompletableFuture<HttpResponseFor<OAuthRegisterResponse>> =
            register(OAuthRegisterParams.none())

        /** @see register */
        fun register(
            params: OAuthRegisterParams = OAuthRegisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRegisterResponse>>

        /** @see register */
        fun register(
            params: OAuthRegisterParams = OAuthRegisterParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthRegisterResponse>> =
            register(params, RequestOptions.none())

        /** @see register */
        fun register(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthRegisterResponse>> =
            register(OAuthRegisterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth/authorize`, but is otherwise the same as
         * [OAuthServiceAsync.retrieveAuthorize].
         */
        fun retrieveAuthorize(
            params: OAuthRetrieveAuthorizeParams
        ): CompletableFuture<HttpResponse> = retrieveAuthorize(params, RequestOptions.none())

        /** @see retrieveAuthorize */
        fun retrieveAuthorize(
            params: OAuthRetrieveAuthorizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /oauth/jwks`, but is otherwise the same as
         * [OAuthServiceAsync.retrieveJwks].
         */
        fun retrieveJwks(): CompletableFuture<HttpResponseFor<OAuthRetrieveJwksResponse>> =
            retrieveJwks(OAuthRetrieveJwksParams.none())

        /** @see retrieveJwks */
        fun retrieveJwks(
            params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveJwksResponse>>

        /** @see retrieveJwks */
        fun retrieveJwks(
            params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveJwksResponse>> =
            retrieveJwks(params, RequestOptions.none())

        /** @see retrieveJwks */
        fun retrieveJwks(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthRetrieveJwksResponse>> =
            retrieveJwks(OAuthRetrieveJwksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/token`, but is otherwise the same as
         * [OAuthServiceAsync.token].
         */
        fun token(
            params: OAuthTokenParams
        ): CompletableFuture<HttpResponseFor<OAuthTokenResponse>> =
            token(params, RequestOptions.none())

        /** @see token */
        fun token(
            params: OAuthTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthTokenResponse>>
    }
}
