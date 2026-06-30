// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.reports

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportCreateParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportCreateResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportDeleteParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportDeleteResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportFetchSyncParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportFetchSyncResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportListPageAsync
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportListParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportRetrieveParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Messaging usage reports */
interface MdrUsageReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdrUsageReportServiceAsync

    /**
     * Submit request for new new messaging usage report. This endpoint will pull and aggregate
     * messaging data in specified time period.
     */
    fun create(
        params: MdrUsageReportCreateParams
    ): CompletableFuture<MdrUsageReportCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MdrUsageReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportCreateResponse>

    /** Fetch a single messaging usage report by id */
    fun retrieve(id: String): CompletableFuture<MdrUsageReportRetrieveResponse> =
        retrieve(id, MdrUsageReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
    ): CompletableFuture<MdrUsageReportRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MdrUsageReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MdrUsageReportRetrieveParams
    ): CompletableFuture<MdrUsageReportRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MdrUsageReportRetrieveResponse> =
        retrieve(id, MdrUsageReportRetrieveParams.none(), requestOptions)

    /**
     * Fetch all messaging usage reports. Usage reports are aggregated messaging data for specified
     * time period and breakdown
     */
    fun list(): CompletableFuture<MdrUsageReportListPageAsync> =
        list(MdrUsageReportListParams.none())

    /** @see list */
    fun list(
        params: MdrUsageReportListParams = MdrUsageReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportListPageAsync>

    /** @see list */
    fun list(
        params: MdrUsageReportListParams = MdrUsageReportListParams.none()
    ): CompletableFuture<MdrUsageReportListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MdrUsageReportListPageAsync> =
        list(MdrUsageReportListParams.none(), requestOptions)

    /** Delete messaging usage report by id */
    fun delete(id: String): CompletableFuture<MdrUsageReportDeleteResponse> =
        delete(id, MdrUsageReportDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
    ): CompletableFuture<MdrUsageReportDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MdrUsageReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportDeleteResponse>

    /** @see delete */
    fun delete(
        params: MdrUsageReportDeleteParams
    ): CompletableFuture<MdrUsageReportDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MdrUsageReportDeleteResponse> =
        delete(id, MdrUsageReportDeleteParams.none(), requestOptions)

    /**
     * Generate and fetch messaging usage report synchronously. This endpoint will both generate and
     * fetch the messaging report over a specified time period. No polling is necessary but the
     * response may take up to a couple of minutes.
     */
    fun fetchSync(
        params: MdrUsageReportFetchSyncParams
    ): CompletableFuture<MdrUsageReportFetchSyncResponse> = fetchSync(params, RequestOptions.none())

    /** @see fetchSync */
    fun fetchSync(
        params: MdrUsageReportFetchSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdrUsageReportFetchSyncResponse>

    /**
     * A view of [MdrUsageReportServiceAsync] that provides access to raw HTTP responses for each
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
        ): MdrUsageReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /reports/mdr_usage_reports`, but is otherwise the
         * same as [MdrUsageReportServiceAsync.create].
         */
        fun create(
            params: MdrUsageReportCreateParams
        ): CompletableFuture<HttpResponseFor<MdrUsageReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MdrUsageReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /reports/mdr_usage_reports/{id}`, but is otherwise
         * the same as [MdrUsageReportServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MdrUsageReportRetrieveResponse>> =
            retrieve(id, MdrUsageReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MdrUsageReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MdrUsageReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<MdrUsageReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MdrUsageReportRetrieveResponse>> =
            retrieve(id, MdrUsageReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reports/mdr_usage_reports`, but is otherwise the
         * same as [MdrUsageReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MdrUsageReportListPageAsync>> =
            list(MdrUsageReportListParams.none())

        /** @see list */
        fun list(
            params: MdrUsageReportListParams = MdrUsageReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportListPageAsync>>

        /** @see list */
        fun list(
            params: MdrUsageReportListParams = MdrUsageReportListParams.none()
        ): CompletableFuture<HttpResponseFor<MdrUsageReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MdrUsageReportListPageAsync>> =
            list(MdrUsageReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /reports/mdr_usage_reports/{id}`, but is
         * otherwise the same as [MdrUsageReportServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<MdrUsageReportDeleteResponse>> =
            delete(id, MdrUsageReportDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MdrUsageReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MdrUsageReportDeleteParams
        ): CompletableFuture<HttpResponseFor<MdrUsageReportDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MdrUsageReportDeleteResponse>> =
            delete(id, MdrUsageReportDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reports/mdr_usage_reports/sync`, but is otherwise
         * the same as [MdrUsageReportServiceAsync.fetchSync].
         */
        fun fetchSync(
            params: MdrUsageReportFetchSyncParams
        ): CompletableFuture<HttpResponseFor<MdrUsageReportFetchSyncResponse>> =
            fetchSync(params, RequestOptions.none())

        /** @see fetchSync */
        fun fetchSync(
            params: MdrUsageReportFetchSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdrUsageReportFetchSyncResponse>>
    }
}
