// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.oauthgrants.OAuthGrantDeleteParams
import com.telnyx.api.models.oauthgrants.OAuthGrantDeleteResponse
import com.telnyx.api.models.oauthgrants.OAuthGrantListParams
import com.telnyx.api.models.oauthgrants.OAuthGrantListResponse
import com.telnyx.api.models.oauthgrants.OAuthGrantRetrieveParams
import com.telnyx.api.models.oauthgrants.OAuthGrantRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthGrantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthGrantServiceAsync

    /** Retrieve a single OAuth grant by ID */
    fun retrieve(id: String): CompletableFuture<OAuthGrantRetrieveResponse> =
        retrieve(id, OAuthGrantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthGrantRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
    ): CompletableFuture<OAuthGrantRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthGrantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthGrantRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: OAuthGrantRetrieveParams): CompletableFuture<OAuthGrantRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthGrantRetrieveResponse> =
        retrieve(id, OAuthGrantRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of OAuth grants for the authenticated user */
    fun list(): CompletableFuture<OAuthGrantListResponse> = list(OAuthGrantListParams.none())

    /** @see list */
    fun list(
        params: OAuthGrantListParams = OAuthGrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthGrantListResponse>

    /** @see list */
    fun list(
        params: OAuthGrantListParams = OAuthGrantListParams.none()
    ): CompletableFuture<OAuthGrantListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthGrantListResponse> =
        list(OAuthGrantListParams.none(), requestOptions)

    /** Revoke an OAuth grant */
    fun delete(id: String): CompletableFuture<OAuthGrantDeleteResponse> =
        delete(id, OAuthGrantDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthGrantDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
    ): CompletableFuture<OAuthGrantDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OAuthGrantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthGrantDeleteResponse>

    /** @see delete */
    fun delete(params: OAuthGrantDeleteParams): CompletableFuture<OAuthGrantDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthGrantDeleteResponse> =
        delete(id, OAuthGrantDeleteParams.none(), requestOptions)

    /**
     * A view of [OAuthGrantServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthGrantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth_grants/{id}`, but is otherwise the same as
         * [OAuthGrantServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>> =
            retrieve(id, OAuthGrantRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OAuthGrantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OAuthGrantRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>> =
            retrieve(id, OAuthGrantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_grants`, but is otherwise the same as
         * [OAuthGrantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OAuthGrantListResponse>> =
            list(OAuthGrantListParams.none())

        /** @see list */
        fun list(
            params: OAuthGrantListParams = OAuthGrantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantListResponse>>

        /** @see list */
        fun list(
            params: OAuthGrantListParams = OAuthGrantListParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthGrantListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthGrantListResponse>> =
            list(OAuthGrantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /oauth_grants/{id}`, but is otherwise the same as
         * [OAuthGrantServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>> =
            delete(id, OAuthGrantDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OAuthGrantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>>

        /** @see delete */
        fun delete(
            params: OAuthGrantDeleteParams
        ): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>> =
            delete(id, OAuthGrantDeleteParams.none(), requestOptions)
    }
}
