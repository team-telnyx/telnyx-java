// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.oauth.OAuthGrantsParams
import com.telnyx.sdk.models.oauth.OAuthGrantsResponse
import com.telnyx.sdk.models.oauth.OAuthIntrospectParams
import com.telnyx.sdk.models.oauth.OAuthIntrospectResponse
import com.telnyx.sdk.models.oauth.OAuthRegisterParams
import com.telnyx.sdk.models.oauth.OAuthRegisterResponse
import com.telnyx.sdk.models.oauth.OAuthRetrieveAuthorizeParams
import com.telnyx.sdk.models.oauth.OAuthRetrieveJwksParams
import com.telnyx.sdk.models.oauth.OAuthRetrieveJwksResponse
import com.telnyx.sdk.models.oauth.OAuthRetrieveParams
import com.telnyx.sdk.models.oauth.OAuthRetrieveResponse
import com.telnyx.sdk.models.oauth.OAuthTokenParams
import com.telnyx.sdk.models.oauth.OAuthTokenResponse
import java.util.function.Consumer

interface OAuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService

    /** Retrieve details about an OAuth consent token */
    fun retrieve(consentToken: String): OAuthRetrieveResponse =
        retrieve(consentToken, OAuthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        consentToken: String,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveResponse =
        retrieve(params.toBuilder().consentToken(consentToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        consentToken: String,
        params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
    ): OAuthRetrieveResponse = retrieve(consentToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OAuthRetrieveParams): OAuthRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(consentToken: String, requestOptions: RequestOptions): OAuthRetrieveResponse =
        retrieve(consentToken, OAuthRetrieveParams.none(), requestOptions)

    /** Create an OAuth authorization grant */
    fun grants(params: OAuthGrantsParams): OAuthGrantsResponse =
        grants(params, RequestOptions.none())

    /** @see grants */
    fun grants(
        params: OAuthGrantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthGrantsResponse

    /** Introspect an OAuth access token to check its validity and metadata */
    fun introspect(params: OAuthIntrospectParams): OAuthIntrospectResponse =
        introspect(params, RequestOptions.none())

    /** @see introspect */
    fun introspect(
        params: OAuthIntrospectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthIntrospectResponse

    /** Register a new OAuth client dynamically (RFC 7591) */
    fun register(): OAuthRegisterResponse = register(OAuthRegisterParams.none())

    /** @see register */
    fun register(
        params: OAuthRegisterParams = OAuthRegisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRegisterResponse

    /** @see register */
    fun register(params: OAuthRegisterParams = OAuthRegisterParams.none()): OAuthRegisterResponse =
        register(params, RequestOptions.none())

    /** @see register */
    fun register(requestOptions: RequestOptions): OAuthRegisterResponse =
        register(OAuthRegisterParams.none(), requestOptions)

    /** OAuth 2.0 authorization endpoint for the authorization code flow */
    fun retrieveAuthorize(params: OAuthRetrieveAuthorizeParams) =
        retrieveAuthorize(params, RequestOptions.none())

    /** @see retrieveAuthorize */
    fun retrieveAuthorize(
        params: OAuthRetrieveAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Retrieve the JSON Web Key Set for token verification */
    fun retrieveJwks(): OAuthRetrieveJwksResponse = retrieveJwks(OAuthRetrieveJwksParams.none())

    /** @see retrieveJwks */
    fun retrieveJwks(
        params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthRetrieveJwksResponse

    /** @see retrieveJwks */
    fun retrieveJwks(
        params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none()
    ): OAuthRetrieveJwksResponse = retrieveJwks(params, RequestOptions.none())

    /** @see retrieveJwks */
    fun retrieveJwks(requestOptions: RequestOptions): OAuthRetrieveJwksResponse =
        retrieveJwks(OAuthRetrieveJwksParams.none(), requestOptions)

    /** Exchange authorization code, client credentials, or refresh token for access token */
    fun token(params: OAuthTokenParams): OAuthTokenResponse = token(params, RequestOptions.none())

    /** @see token */
    fun token(
        params: OAuthTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthTokenResponse

    /** A view of [OAuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth/consent/{consent_token}`, but is otherwise
         * the same as [OAuthService.retrieve].
         */
        @MustBeClosed
        fun retrieve(consentToken: String): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(consentToken, OAuthRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            consentToken: String,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(params.toBuilder().consentToken(consentToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            consentToken: String,
            params: OAuthRetrieveParams = OAuthRetrieveParams.none(),
        ): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(consentToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OAuthRetrieveParams): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            consentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveResponse> =
            retrieve(consentToken, OAuthRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/grants`, but is otherwise the same as
         * [OAuthService.grants].
         */
        @MustBeClosed
        fun grants(params: OAuthGrantsParams): HttpResponseFor<OAuthGrantsResponse> =
            grants(params, RequestOptions.none())

        /** @see grants */
        @MustBeClosed
        fun grants(
            params: OAuthGrantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthGrantsResponse>

        /**
         * Returns a raw HTTP response for `post /oauth/introspect`, but is otherwise the same as
         * [OAuthService.introspect].
         */
        @MustBeClosed
        fun introspect(params: OAuthIntrospectParams): HttpResponseFor<OAuthIntrospectResponse> =
            introspect(params, RequestOptions.none())

        /** @see introspect */
        @MustBeClosed
        fun introspect(
            params: OAuthIntrospectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthIntrospectResponse>

        /**
         * Returns a raw HTTP response for `post /oauth/register`, but is otherwise the same as
         * [OAuthService.register].
         */
        @MustBeClosed
        fun register(): HttpResponseFor<OAuthRegisterResponse> =
            register(OAuthRegisterParams.none())

        /** @see register */
        @MustBeClosed
        fun register(
            params: OAuthRegisterParams = OAuthRegisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRegisterResponse>

        /** @see register */
        @MustBeClosed
        fun register(
            params: OAuthRegisterParams = OAuthRegisterParams.none()
        ): HttpResponseFor<OAuthRegisterResponse> = register(params, RequestOptions.none())

        /** @see register */
        @MustBeClosed
        fun register(requestOptions: RequestOptions): HttpResponseFor<OAuthRegisterResponse> =
            register(OAuthRegisterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth/authorize`, but is otherwise the same as
         * [OAuthService.retrieveAuthorize].
         */
        @MustBeClosed
        fun retrieveAuthorize(params: OAuthRetrieveAuthorizeParams): HttpResponse =
            retrieveAuthorize(params, RequestOptions.none())

        /** @see retrieveAuthorize */
        @MustBeClosed
        fun retrieveAuthorize(
            params: OAuthRetrieveAuthorizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /oauth/jwks`, but is otherwise the same as
         * [OAuthService.retrieveJwks].
         */
        @MustBeClosed
        fun retrieveJwks(): HttpResponseFor<OAuthRetrieveJwksResponse> =
            retrieveJwks(OAuthRetrieveJwksParams.none())

        /** @see retrieveJwks */
        @MustBeClosed
        fun retrieveJwks(
            params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthRetrieveJwksResponse>

        /** @see retrieveJwks */
        @MustBeClosed
        fun retrieveJwks(
            params: OAuthRetrieveJwksParams = OAuthRetrieveJwksParams.none()
        ): HttpResponseFor<OAuthRetrieveJwksResponse> = retrieveJwks(params, RequestOptions.none())

        /** @see retrieveJwks */
        @MustBeClosed
        fun retrieveJwks(
            requestOptions: RequestOptions
        ): HttpResponseFor<OAuthRetrieveJwksResponse> =
            retrieveJwks(OAuthRetrieveJwksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/token`, but is otherwise the same as
         * [OAuthService.token].
         */
        @MustBeClosed
        fun token(params: OAuthTokenParams): HttpResponseFor<OAuthTokenResponse> =
            token(params, RequestOptions.none())

        /** @see token */
        @MustBeClosed
        fun token(
            params: OAuthTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthTokenResponse>
    }
}
