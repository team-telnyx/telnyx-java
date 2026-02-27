// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateResponse
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportDownloadParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportRetrieveParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Number orders */
interface SubNumberOrdersReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrdersReportServiceAsync

    /**
     * Create a CSV report for sub number orders. The report will be generated asynchronously and
     * can be downloaded once complete.
     */
    fun create(): CompletableFuture<SubNumberOrdersReportCreateResponse> =
        create(SubNumberOrdersReportCreateParams.none())

    /** @see create */
    fun create(
        params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrdersReportCreateResponse>

    /** @see create */
    fun create(
        params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none()
    ): CompletableFuture<SubNumberOrdersReportCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<SubNumberOrdersReportCreateResponse> =
        create(SubNumberOrdersReportCreateParams.none(), requestOptions)

    /** Get the status and details of a sub number orders report. */
    fun retrieve(reportId: String): CompletableFuture<SubNumberOrdersReportRetrieveResponse> =
        retrieve(reportId, SubNumberOrdersReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        reportId: String,
        params: SubNumberOrdersReportRetrieveParams = SubNumberOrdersReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrdersReportRetrieveResponse> =
        retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        reportId: String,
        params: SubNumberOrdersReportRetrieveParams = SubNumberOrdersReportRetrieveParams.none(),
    ): CompletableFuture<SubNumberOrdersReportRetrieveResponse> =
        retrieve(reportId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrdersReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrdersReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrdersReportRetrieveParams
    ): CompletableFuture<SubNumberOrdersReportRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        reportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrdersReportRetrieveResponse> =
        retrieve(reportId, SubNumberOrdersReportRetrieveParams.none(), requestOptions)

    /**
     * Download the CSV file for a completed sub number orders report. The report status must be
     * 'success' before the file can be downloaded.
     */
    fun download(reportId: String): CompletableFuture<String> =
        download(reportId, SubNumberOrdersReportDownloadParams.none())

    /** @see download */
    fun download(
        reportId: String,
        params: SubNumberOrdersReportDownloadParams = SubNumberOrdersReportDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        download(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see download */
    fun download(
        reportId: String,
        params: SubNumberOrdersReportDownloadParams = SubNumberOrdersReportDownloadParams.none(),
    ): CompletableFuture<String> = download(reportId, params, RequestOptions.none())

    /** @see download */
    fun download(
        params: SubNumberOrdersReportDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see download */
    fun download(params: SubNumberOrdersReportDownloadParams): CompletableFuture<String> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(reportId: String, requestOptions: RequestOptions): CompletableFuture<String> =
        download(reportId, SubNumberOrdersReportDownloadParams.none(), requestOptions)

    /**
     * A view of [SubNumberOrdersReportServiceAsync] that provides access to raw HTTP responses for
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
        ): SubNumberOrdersReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sub_number_orders_report`, but is otherwise the
         * same as [SubNumberOrdersReportServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<SubNumberOrdersReportCreateResponse>> =
            create(SubNumberOrdersReportCreateParams.none())

        /** @see create */
        fun create(
            params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportCreateResponse>>

        /** @see create */
        fun create(
            params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none()
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportCreateResponse>> =
            create(SubNumberOrdersReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sub_number_orders_report/{report_id}`, but is
         * otherwise the same as [SubNumberOrdersReportServiceAsync.retrieve].
         */
        fun retrieve(
            reportId: String
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>> =
            retrieve(reportId, SubNumberOrdersReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            reportId: String,
            params: SubNumberOrdersReportRetrieveParams =
                SubNumberOrdersReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>> =
            retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            reportId: String,
            params: SubNumberOrdersReportRetrieveParams = SubNumberOrdersReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>> =
            retrieve(reportId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SubNumberOrdersReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SubNumberOrdersReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            reportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>> =
            retrieve(reportId, SubNumberOrdersReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sub_number_orders_report/{report_id}/download`, but
         * is otherwise the same as [SubNumberOrdersReportServiceAsync.download].
         */
        fun download(reportId: String): CompletableFuture<HttpResponseFor<String>> =
            download(reportId, SubNumberOrdersReportDownloadParams.none())

        /** @see download */
        fun download(
            reportId: String,
            params: SubNumberOrdersReportDownloadParams =
                SubNumberOrdersReportDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            download(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see download */
        fun download(
            reportId: String,
            params: SubNumberOrdersReportDownloadParams = SubNumberOrdersReportDownloadParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            download(reportId, params, RequestOptions.none())

        /** @see download */
        fun download(
            params: SubNumberOrdersReportDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see download */
        fun download(
            params: SubNumberOrdersReportDownloadParams
        ): CompletableFuture<HttpResponseFor<String>> = download(params, RequestOptions.none())

        /** @see download */
        fun download(
            reportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            download(reportId, SubNumberOrdersReportDownloadParams.none(), requestOptions)
    }
}
