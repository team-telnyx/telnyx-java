// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListResponse
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReleaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReleaseServiceAsync

    /** Return the details of a Release request and its phone numbers. */
    fun retrieve(
        releaseId: String,
        params: ReleaseRetrieveParams,
    ): CompletableFuture<ReleaseRetrieveResponse> =
        retrieve(releaseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        releaseId: String,
        params: ReleaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReleaseRetrieveResponse> =
        retrieve(params.toBuilder().releaseId(releaseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ReleaseRetrieveParams): CompletableFuture<ReleaseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReleaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReleaseRetrieveResponse>

    /**
     * Returns a list of your Releases for the given external connection. These are automatically
     * created when you change the `connection_id` of a phone number that is currently on Microsoft
     * Teams.
     */
    fun list(id: String): CompletableFuture<ReleaseListResponse> =
        list(id, ReleaseListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ReleaseListParams = ReleaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReleaseListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ReleaseListParams = ReleaseListParams.none(),
    ): CompletableFuture<ReleaseListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReleaseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReleaseListResponse>

    /** @see list */
    fun list(params: ReleaseListParams): CompletableFuture<ReleaseListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<ReleaseListResponse> =
        list(id, ReleaseListParams.none(), requestOptions)

    /**
     * A view of [ReleaseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReleaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/releases/{release_id}`,
         * but is otherwise the same as [ReleaseServiceAsync.retrieve].
         */
        fun retrieve(
            releaseId: String,
            params: ReleaseRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ReleaseRetrieveResponse>> =
            retrieve(releaseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            releaseId: String,
            params: ReleaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReleaseRetrieveResponse>> =
            retrieve(params.toBuilder().releaseId(releaseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ReleaseRetrieveParams
        ): CompletableFuture<HttpResponseFor<ReleaseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ReleaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReleaseRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/releases`, but is
         * otherwise the same as [ReleaseServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<ReleaseListResponse>> =
            list(id, ReleaseListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ReleaseListParams = ReleaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReleaseListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ReleaseListParams = ReleaseListParams.none(),
        ): CompletableFuture<HttpResponseFor<ReleaseListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ReleaseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReleaseListResponse>>

        /** @see list */
        fun list(
            params: ReleaseListParams
        ): CompletableFuture<HttpResponseFor<ReleaseListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReleaseListResponse>> =
            list(id, ReleaseListParams.none(), requestOptions)
    }
}
