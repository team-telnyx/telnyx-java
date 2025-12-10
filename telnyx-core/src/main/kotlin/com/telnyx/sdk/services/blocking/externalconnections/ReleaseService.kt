// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListPage
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveResponse
import java.util.function.Consumer

interface ReleaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReleaseService

    /** Return the details of a Release request and its phone numbers. */
    fun retrieve(releaseId: String, params: ReleaseRetrieveParams): ReleaseRetrieveResponse =
        retrieve(releaseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        releaseId: String,
        params: ReleaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReleaseRetrieveResponse =
        retrieve(params.toBuilder().releaseId(releaseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ReleaseRetrieveParams): ReleaseRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReleaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReleaseRetrieveResponse

    /**
     * Returns a list of your Releases for the given external connection. These are automatically
     * created when you change the `connection_id` of a phone number that is currently on Microsoft
     * Teams.
     */
    fun list(id: String): ReleaseListPage = list(id, ReleaseListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ReleaseListParams = ReleaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReleaseListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: ReleaseListParams = ReleaseListParams.none()): ReleaseListPage =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReleaseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReleaseListPage

    /** @see list */
    fun list(params: ReleaseListParams): ReleaseListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): ReleaseListPage =
        list(id, ReleaseListParams.none(), requestOptions)

    /** A view of [ReleaseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReleaseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/releases/{release_id}`,
         * but is otherwise the same as [ReleaseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            releaseId: String,
            params: ReleaseRetrieveParams,
        ): HttpResponseFor<ReleaseRetrieveResponse> =
            retrieve(releaseId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            releaseId: String,
            params: ReleaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReleaseRetrieveResponse> =
            retrieve(params.toBuilder().releaseId(releaseId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ReleaseRetrieveParams): HttpResponseFor<ReleaseRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReleaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReleaseRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/releases`, but is
         * otherwise the same as [ReleaseService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<ReleaseListPage> = list(id, ReleaseListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ReleaseListParams = ReleaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReleaseListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ReleaseListParams = ReleaseListParams.none(),
        ): HttpResponseFor<ReleaseListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReleaseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReleaseListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ReleaseListParams): HttpResponseFor<ReleaseListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<ReleaseListPage> =
            list(id, ReleaseListParams.none(), requestOptions)
    }
}
