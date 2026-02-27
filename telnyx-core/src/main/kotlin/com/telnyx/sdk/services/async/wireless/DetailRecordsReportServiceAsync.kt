// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.wireless

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportCreateParams
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportCreateResponse
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportDeleteParams
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportDeleteResponse
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportListParams
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportListResponse
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportRetrieveParams
import com.telnyx.sdk.models.wireless.detailrecordsreports.DetailRecordsReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Wireless reporting operations */
interface DetailRecordsReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailRecordsReportServiceAsync

    /**
     * Asynchronously create a report containing Wireless Detail Records (WDRs) for the SIM cards
     * that consumed wireless data in the given time period.
     */
    fun create(): CompletableFuture<DetailRecordsReportCreateResponse> =
        create(DetailRecordsReportCreateParams.none())

    /** @see create */
    fun create(
        params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordsReportCreateResponse>

    /** @see create */
    fun create(
        params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none()
    ): CompletableFuture<DetailRecordsReportCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<DetailRecordsReportCreateResponse> =
        create(DetailRecordsReportCreateParams.none(), requestOptions)

    /** Returns one specific WDR report */
    fun retrieve(id: String): CompletableFuture<DetailRecordsReportRetrieveResponse> =
        retrieve(id, DetailRecordsReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordsReportRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
    ): CompletableFuture<DetailRecordsReportRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DetailRecordsReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordsReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: DetailRecordsReportRetrieveParams
    ): CompletableFuture<DetailRecordsReportRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DetailRecordsReportRetrieveResponse> =
        retrieve(id, DetailRecordsReportRetrieveParams.none(), requestOptions)

    /** Returns the WDR Reports that match the given parameters. */
    fun list(): CompletableFuture<DetailRecordsReportListResponse> =
        list(DetailRecordsReportListParams.none())

    /** @see list */
    fun list(
        params: DetailRecordsReportListParams = DetailRecordsReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordsReportListResponse>

    /** @see list */
    fun list(
        params: DetailRecordsReportListParams = DetailRecordsReportListParams.none()
    ): CompletableFuture<DetailRecordsReportListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DetailRecordsReportListResponse> =
        list(DetailRecordsReportListParams.none(), requestOptions)

    /** Deletes one specific WDR report. */
    fun delete(id: String): CompletableFuture<DetailRecordsReportDeleteResponse> =
        delete(id, DetailRecordsReportDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordsReportDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
    ): CompletableFuture<DetailRecordsReportDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DetailRecordsReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordsReportDeleteResponse>

    /** @see delete */
    fun delete(
        params: DetailRecordsReportDeleteParams
    ): CompletableFuture<DetailRecordsReportDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DetailRecordsReportDeleteResponse> =
        delete(id, DetailRecordsReportDeleteParams.none(), requestOptions)

    /**
     * A view of [DetailRecordsReportServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailRecordsReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireless/detail_records_reports`, but is otherwise
         * the same as [DetailRecordsReportServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<DetailRecordsReportCreateResponse>> =
            create(DetailRecordsReportCreateParams.none())

        /** @see create */
        fun create(
            params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportCreateResponse>>

        /** @see create */
        fun create(
            params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none()
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportCreateResponse>> =
            create(DetailRecordsReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireless/detail_records_reports/{id}`, but is
         * otherwise the same as [DetailRecordsReportServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportRetrieveResponse>> =
            retrieve(id, DetailRecordsReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DetailRecordsReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DetailRecordsReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportRetrieveResponse>> =
            retrieve(id, DetailRecordsReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireless/detail_records_reports`, but is otherwise
         * the same as [DetailRecordsReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DetailRecordsReportListResponse>> =
            list(DetailRecordsReportListParams.none())

        /** @see list */
        fun list(
            params: DetailRecordsReportListParams = DetailRecordsReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportListResponse>>

        /** @see list */
        fun list(
            params: DetailRecordsReportListParams = DetailRecordsReportListParams.none()
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportListResponse>> =
            list(DetailRecordsReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireless/detail_records_reports/{id}`, but is
         * otherwise the same as [DetailRecordsReportServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportDeleteResponse>> =
            delete(id, DetailRecordsReportDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DetailRecordsReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DetailRecordsReportDeleteParams
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DetailRecordsReportDeleteResponse>> =
            delete(id, DetailRecordsReportDeleteParams.none(), requestOptions)
    }
}
