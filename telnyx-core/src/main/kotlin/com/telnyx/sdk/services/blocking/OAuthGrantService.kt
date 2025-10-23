// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.oauthgrants.OAuthGrantDeleteParams
import com.telnyx.sdk.models.oauthgrants.OAuthGrantDeleteResponse
import com.telnyx.sdk.models.oauthgrants.OAuthGrantListParams
import com.telnyx.sdk.models.oauthgrants.OAuthGrantListResponse
import com.telnyx.sdk.models.oauthgrants.OAuthGrantRetrieveParams
import com.telnyx.sdk.models.oauthgrants.OAuthGrantRetrieveResponse
import java.util.function.Consumer

interface OAuthGrantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthGrantService

    /** Retrieve a single OAuth grant by ID */
    fun retrieve(id: String): OAuthGrantRetrieveResponse =
        retrieve(id, OAuthGrantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthGrantRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
    ): OAuthGrantRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthGrantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthGrantRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OAuthGrantRetrieveParams): OAuthGrantRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): OAuthGrantRetrieveResponse =
        retrieve(id, OAuthGrantRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of OAuth grants for the authenticated user */
    fun list(): OAuthGrantListResponse = list(OAuthGrantListParams.none())

    /** @see list */
    fun list(
        params: OAuthGrantListParams = OAuthGrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthGrantListResponse

    /** @see list */
    fun list(params: OAuthGrantListParams = OAuthGrantListParams.none()): OAuthGrantListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OAuthGrantListResponse =
        list(OAuthGrantListParams.none(), requestOptions)

    /** Revoke an OAuth grant */
    fun delete(id: String): OAuthGrantDeleteResponse = delete(id, OAuthGrantDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthGrantDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
    ): OAuthGrantDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OAuthGrantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthGrantDeleteResponse

    /** @see delete */
    fun delete(params: OAuthGrantDeleteParams): OAuthGrantDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): OAuthGrantDeleteResponse =
        delete(id, OAuthGrantDeleteParams.none(), requestOptions)

    /** A view of [OAuthGrantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthGrantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth_grants/{id}`, but is otherwise the same as
         * [OAuthGrantService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<OAuthGrantRetrieveResponse> =
            retrieve(id, OAuthGrantRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthGrantRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OAuthGrantRetrieveParams = OAuthGrantRetrieveParams.none(),
        ): HttpResponseFor<OAuthGrantRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthGrantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthGrantRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthGrantRetrieveParams
        ): HttpResponseFor<OAuthGrantRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthGrantRetrieveResponse> =
            retrieve(id, OAuthGrantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_grants`, but is otherwise the same as
         * [OAuthGrantService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OAuthGrantListResponse> = list(OAuthGrantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OAuthGrantListParams = OAuthGrantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthGrantListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OAuthGrantListParams = OAuthGrantListParams.none()
        ): HttpResponseFor<OAuthGrantListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OAuthGrantListResponse> =
            list(OAuthGrantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /oauth_grants/{id}`, but is otherwise the same as
         * [OAuthGrantService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<OAuthGrantDeleteResponse> =
            delete(id, OAuthGrantDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthGrantDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OAuthGrantDeleteParams = OAuthGrantDeleteParams.none(),
        ): HttpResponseFor<OAuthGrantDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OAuthGrantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthGrantDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: OAuthGrantDeleteParams): HttpResponseFor<OAuthGrantDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthGrantDeleteResponse> =
            delete(id, OAuthGrantDeleteParams.none(), requestOptions)
    }
}
