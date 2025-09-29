// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portouts

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portouts.reports.ReportCreateParams
import com.telnyx.api.models.portouts.reports.ReportCreateResponse
import com.telnyx.api.models.portouts.reports.ReportListParams
import com.telnyx.api.models.portouts.reports.ReportListResponse
import com.telnyx.api.models.portouts.reports.ReportRetrieveParams
import com.telnyx.api.models.portouts.reports.ReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync

    /** Generate reports about port-out operations. */
    fun create(params: ReportCreateParams): CompletableFuture<ReportCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreateResponse>

    /** Retrieve a specific report generated. */
    fun retrieve(id: String): CompletableFuture<ReportRetrieveResponse> =
        retrieve(id, ReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
    ): CompletableFuture<ReportRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ReportRetrieveParams): CompletableFuture<ReportRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportRetrieveResponse> =
        retrieve(id, ReportRetrieveParams.none(), requestOptions)

    /** List the reports generated about port-out operations. */
    fun list(): CompletableFuture<ReportListResponse> = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListResponse>

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none()
    ): CompletableFuture<ReportListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReportListResponse> =
        list(ReportListParams.none(), requestOptions)

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /portouts/reports`, but is otherwise the same as
         * [ReportServiceAsync.create].
         */
        fun create(
            params: ReportCreateParams
        ): CompletableFuture<HttpResponseFor<ReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /portouts/reports/{id}`, but is otherwise the same
         * as [ReportServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(id, ReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(id, ReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/reports`, but is otherwise the same as
         * [ReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ReportListResponse>> =
            list(ReportListParams.none())

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListResponse>>

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListResponse>> =
            list(ReportListParams.none(), requestOptions)
    }
}
