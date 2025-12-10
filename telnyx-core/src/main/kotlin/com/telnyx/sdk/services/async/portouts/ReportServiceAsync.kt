// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portouts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portouts.reports.ReportCreateParams
import com.telnyx.sdk.models.portouts.reports.ReportCreateResponse
import com.telnyx.sdk.models.portouts.reports.ReportListPageAsync
import com.telnyx.sdk.models.portouts.reports.ReportListParams
import com.telnyx.sdk.models.portouts.reports.ReportRetrieveParams
import com.telnyx.sdk.models.portouts.reports.ReportRetrieveResponse
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
    fun list(): CompletableFuture<ReportListPageAsync> = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListPageAsync>

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none()
    ): CompletableFuture<ReportListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReportListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<ReportListPageAsync>> =
            list(ReportListParams.none())

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListPageAsync>>

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListPageAsync>> =
            list(ReportListParams.none(), requestOptions)
    }
}
