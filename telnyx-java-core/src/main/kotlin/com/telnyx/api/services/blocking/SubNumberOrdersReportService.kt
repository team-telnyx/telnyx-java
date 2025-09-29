// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.subnumberordersreport.SubNumberOrdersReportCreateParams
import com.telnyx.api.models.subnumberordersreport.SubNumberOrdersReportCreateResponse
import com.telnyx.api.models.subnumberordersreport.SubNumberOrdersReportDownloadParams
import com.telnyx.api.models.subnumberordersreport.SubNumberOrdersReportRetrieveParams
import com.telnyx.api.models.subnumberordersreport.SubNumberOrdersReportRetrieveResponse
import java.util.function.Consumer

interface SubNumberOrdersReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrdersReportService

    /**
     * Create a CSV report for sub number orders. The report will be generated asynchronously and
     * can be downloaded once complete.
     */
    fun create(): SubNumberOrdersReportCreateResponse =
        create(SubNumberOrdersReportCreateParams.none())

    /** @see create */
    fun create(
        params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrdersReportCreateResponse

    /** @see create */
    fun create(
        params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none()
    ): SubNumberOrdersReportCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): SubNumberOrdersReportCreateResponse =
        create(SubNumberOrdersReportCreateParams.none(), requestOptions)

    /** Get the status and details of a sub number orders report. */
    fun retrieve(reportId: String): SubNumberOrdersReportRetrieveResponse =
        retrieve(reportId, SubNumberOrdersReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        reportId: String,
        params: SubNumberOrdersReportRetrieveParams = SubNumberOrdersReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrdersReportRetrieveResponse =
        retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        reportId: String,
        params: SubNumberOrdersReportRetrieveParams = SubNumberOrdersReportRetrieveParams.none(),
    ): SubNumberOrdersReportRetrieveResponse = retrieve(reportId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrdersReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrdersReportRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrdersReportRetrieveParams
    ): SubNumberOrdersReportRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        reportId: String,
        requestOptions: RequestOptions,
    ): SubNumberOrdersReportRetrieveResponse =
        retrieve(reportId, SubNumberOrdersReportRetrieveParams.none(), requestOptions)

    /**
     * Download the CSV file for a completed sub number orders report. The report status must be
     * 'success' before the file can be downloaded.
     */
    fun download(reportId: String): String =
        download(reportId, SubNumberOrdersReportDownloadParams.none())

    /** @see download */
    fun download(
        reportId: String,
        params: SubNumberOrdersReportDownloadParams = SubNumberOrdersReportDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = download(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see download */
    fun download(
        reportId: String,
        params: SubNumberOrdersReportDownloadParams = SubNumberOrdersReportDownloadParams.none(),
    ): String = download(reportId, params, RequestOptions.none())

    /** @see download */
    fun download(
        params: SubNumberOrdersReportDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see download */
    fun download(params: SubNumberOrdersReportDownloadParams): String =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(reportId: String, requestOptions: RequestOptions): String =
        download(reportId, SubNumberOrdersReportDownloadParams.none(), requestOptions)

    /**
     * A view of [SubNumberOrdersReportService] that provides access to raw HTTP responses for each
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
        ): SubNumberOrdersReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sub_number_orders_report`, but is otherwise the
         * same as [SubNumberOrdersReportService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<SubNumberOrdersReportCreateResponse> =
            create(SubNumberOrdersReportCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrdersReportCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubNumberOrdersReportCreateParams = SubNumberOrdersReportCreateParams.none()
        ): HttpResponseFor<SubNumberOrdersReportCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubNumberOrdersReportCreateResponse> =
            create(SubNumberOrdersReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sub_number_orders_report/{report_id}`, but is
         * otherwise the same as [SubNumberOrdersReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(reportId: String): HttpResponseFor<SubNumberOrdersReportRetrieveResponse> =
            retrieve(reportId, SubNumberOrdersReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            reportId: String,
            params: SubNumberOrdersReportRetrieveParams =
                SubNumberOrdersReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrdersReportRetrieveResponse> =
            retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            reportId: String,
            params: SubNumberOrdersReportRetrieveParams = SubNumberOrdersReportRetrieveParams.none(),
        ): HttpResponseFor<SubNumberOrdersReportRetrieveResponse> =
            retrieve(reportId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubNumberOrdersReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrdersReportRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubNumberOrdersReportRetrieveParams
        ): HttpResponseFor<SubNumberOrdersReportRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrdersReportRetrieveResponse> =
            retrieve(reportId, SubNumberOrdersReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sub_number_orders_report/{report_id}/download`, but
         * is otherwise the same as [SubNumberOrdersReportService.download].
         */
        @MustBeClosed
        fun download(reportId: String): HttpResponseFor<String> =
            download(reportId, SubNumberOrdersReportDownloadParams.none())

        /** @see download */
        @MustBeClosed
        fun download(
            reportId: String,
            params: SubNumberOrdersReportDownloadParams =
                SubNumberOrdersReportDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            download(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(
            reportId: String,
            params: SubNumberOrdersReportDownloadParams = SubNumberOrdersReportDownloadParams.none(),
        ): HttpResponseFor<String> = download(reportId, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: SubNumberOrdersReportDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see download */
        @MustBeClosed
        fun download(params: SubNumberOrdersReportDownloadParams): HttpResponseFor<String> =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(reportId: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            download(reportId, SubNumberOrdersReportDownloadParams.none(), requestOptions)
    }
}
