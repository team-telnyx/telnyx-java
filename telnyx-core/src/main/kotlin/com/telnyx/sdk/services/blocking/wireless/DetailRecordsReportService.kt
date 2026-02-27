// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.wireless

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Wireless reporting operations */
interface DetailRecordsReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailRecordsReportService

    /**
     * Asynchronously create a report containing Wireless Detail Records (WDRs) for the SIM cards
     * that consumed wireless data in the given time period.
     */
    fun create(): DetailRecordsReportCreateResponse = create(DetailRecordsReportCreateParams.none())

    /** @see create */
    fun create(
        params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordsReportCreateResponse

    /** @see create */
    fun create(
        params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none()
    ): DetailRecordsReportCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): DetailRecordsReportCreateResponse =
        create(DetailRecordsReportCreateParams.none(), requestOptions)

    /** Returns one specific WDR report */
    fun retrieve(id: String): DetailRecordsReportRetrieveResponse =
        retrieve(id, DetailRecordsReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordsReportRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
    ): DetailRecordsReportRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DetailRecordsReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordsReportRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DetailRecordsReportRetrieveParams): DetailRecordsReportRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DetailRecordsReportRetrieveResponse =
        retrieve(id, DetailRecordsReportRetrieveParams.none(), requestOptions)

    /** Returns the WDR Reports that match the given parameters. */
    fun list(): DetailRecordsReportListResponse = list(DetailRecordsReportListParams.none())

    /** @see list */
    fun list(
        params: DetailRecordsReportListParams = DetailRecordsReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordsReportListResponse

    /** @see list */
    fun list(
        params: DetailRecordsReportListParams = DetailRecordsReportListParams.none()
    ): DetailRecordsReportListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DetailRecordsReportListResponse =
        list(DetailRecordsReportListParams.none(), requestOptions)

    /** Deletes one specific WDR report. */
    fun delete(id: String): DetailRecordsReportDeleteResponse =
        delete(id, DetailRecordsReportDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordsReportDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
    ): DetailRecordsReportDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DetailRecordsReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordsReportDeleteResponse

    /** @see delete */
    fun delete(params: DetailRecordsReportDeleteParams): DetailRecordsReportDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DetailRecordsReportDeleteResponse =
        delete(id, DetailRecordsReportDeleteParams.none(), requestOptions)

    /**
     * A view of [DetailRecordsReportService] that provides access to raw HTTP responses for each
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
        ): DetailRecordsReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireless/detail_records_reports`, but is otherwise
         * the same as [DetailRecordsReportService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<DetailRecordsReportCreateResponse> =
            create(DetailRecordsReportCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordsReportCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: DetailRecordsReportCreateParams = DetailRecordsReportCreateParams.none()
        ): HttpResponseFor<DetailRecordsReportCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<DetailRecordsReportCreateResponse> =
            create(DetailRecordsReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireless/detail_records_reports/{id}`, but is
         * otherwise the same as [DetailRecordsReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DetailRecordsReportRetrieveResponse> =
            retrieve(id, DetailRecordsReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordsReportRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DetailRecordsReportRetrieveParams = DetailRecordsReportRetrieveParams.none(),
        ): HttpResponseFor<DetailRecordsReportRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DetailRecordsReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordsReportRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DetailRecordsReportRetrieveParams
        ): HttpResponseFor<DetailRecordsReportRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordsReportRetrieveResponse> =
            retrieve(id, DetailRecordsReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireless/detail_records_reports`, but is otherwise
         * the same as [DetailRecordsReportService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DetailRecordsReportListResponse> =
            list(DetailRecordsReportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailRecordsReportListParams = DetailRecordsReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordsReportListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailRecordsReportListParams = DetailRecordsReportListParams.none()
        ): HttpResponseFor<DetailRecordsReportListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DetailRecordsReportListResponse> =
            list(DetailRecordsReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireless/detail_records_reports/{id}`, but is
         * otherwise the same as [DetailRecordsReportService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DetailRecordsReportDeleteResponse> =
            delete(id, DetailRecordsReportDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordsReportDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DetailRecordsReportDeleteParams = DetailRecordsReportDeleteParams.none(),
        ): HttpResponseFor<DetailRecordsReportDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DetailRecordsReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordsReportDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DetailRecordsReportDeleteParams
        ): HttpResponseFor<DetailRecordsReportDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordsReportDeleteResponse> =
            delete(id, DetailRecordsReportDeleteParams.none(), requestOptions)
    }
}
