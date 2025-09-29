// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.reports

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportCreateParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportCreateResponse
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportDeleteParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportDeleteResponse
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportFetchSyncParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportFetchSyncResponse
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportListParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportListResponse
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportRetrieveParams
import com.telnyx.api.models.reports.mdrusagereports.MdrUsageReportRetrieveResponse
import java.util.function.Consumer

interface MdrUsageReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdrUsageReportService

    /**
     * Submit request for new new messaging usage report. This endpoint will pull and aggregate
     * messaging data in specified time period.
     */
    fun create(params: MdrUsageReportCreateParams): MdrUsageReportCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MdrUsageReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportCreateResponse

    /** Fetch a single messaging usage report by id */
    fun retrieve(id: String): MdrUsageReportRetrieveResponse =
        retrieve(id, MdrUsageReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
    ): MdrUsageReportRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MdrUsageReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MdrUsageReportRetrieveParams): MdrUsageReportRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MdrUsageReportRetrieveResponse =
        retrieve(id, MdrUsageReportRetrieveParams.none(), requestOptions)

    /**
     * Fetch all messaging usage reports. Usage reports are aggregated messaging data for specified
     * time period and breakdown
     */
    fun list(): MdrUsageReportListResponse = list(MdrUsageReportListParams.none())

    /** @see list */
    fun list(
        params: MdrUsageReportListParams = MdrUsageReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportListResponse

    /** @see list */
    fun list(
        params: MdrUsageReportListParams = MdrUsageReportListParams.none()
    ): MdrUsageReportListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MdrUsageReportListResponse =
        list(MdrUsageReportListParams.none(), requestOptions)

    /** Delete messaging usage report by id */
    fun delete(id: String): MdrUsageReportDeleteResponse =
        delete(id, MdrUsageReportDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
    ): MdrUsageReportDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MdrUsageReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportDeleteResponse

    /** @see delete */
    fun delete(params: MdrUsageReportDeleteParams): MdrUsageReportDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MdrUsageReportDeleteResponse =
        delete(id, MdrUsageReportDeleteParams.none(), requestOptions)

    /**
     * Generate and fetch messaging usage report synchronously. This endpoint will both generate and
     * fetch the messaging report over a specified time period. No polling is necessary but the
     * response may take up to a couple of minutes.
     */
    fun fetchSync(params: MdrUsageReportFetchSyncParams): MdrUsageReportFetchSyncResponse =
        fetchSync(params, RequestOptions.none())

    /** @see fetchSync */
    fun fetchSync(
        params: MdrUsageReportFetchSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdrUsageReportFetchSyncResponse

    /**
     * A view of [MdrUsageReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MdrUsageReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /reports/mdr_usage_reports`, but is otherwise the
         * same as [MdrUsageReportService.create].
         */
        @MustBeClosed
        fun create(
            params: MdrUsageReportCreateParams
        ): HttpResponseFor<MdrUsageReportCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MdrUsageReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportCreateResponse>

        /**
         * Returns a raw HTTP response for `get /reports/mdr_usage_reports/{id}`, but is otherwise
         * the same as [MdrUsageReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MdrUsageReportRetrieveResponse> =
            retrieve(id, MdrUsageReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MdrUsageReportRetrieveParams = MdrUsageReportRetrieveParams.none(),
        ): HttpResponseFor<MdrUsageReportRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MdrUsageReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MdrUsageReportRetrieveParams
        ): HttpResponseFor<MdrUsageReportRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportRetrieveResponse> =
            retrieve(id, MdrUsageReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reports/mdr_usage_reports`, but is otherwise the
         * same as [MdrUsageReportService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MdrUsageReportListResponse> =
            list(MdrUsageReportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MdrUsageReportListParams = MdrUsageReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MdrUsageReportListParams = MdrUsageReportListParams.none()
        ): HttpResponseFor<MdrUsageReportListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MdrUsageReportListResponse> =
            list(MdrUsageReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /reports/mdr_usage_reports/{id}`, but is
         * otherwise the same as [MdrUsageReportService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MdrUsageReportDeleteResponse> =
            delete(id, MdrUsageReportDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MdrUsageReportDeleteParams = MdrUsageReportDeleteParams.none(),
        ): HttpResponseFor<MdrUsageReportDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MdrUsageReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MdrUsageReportDeleteParams
        ): HttpResponseFor<MdrUsageReportDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportDeleteResponse> =
            delete(id, MdrUsageReportDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reports/mdr_usage_reports/sync`, but is otherwise
         * the same as [MdrUsageReportService.fetchSync].
         */
        @MustBeClosed
        fun fetchSync(
            params: MdrUsageReportFetchSyncParams
        ): HttpResponseFor<MdrUsageReportFetchSyncResponse> =
            fetchSync(params, RequestOptions.none())

        /** @see fetchSync */
        @MustBeClosed
        fun fetchSync(
            params: MdrUsageReportFetchSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdrUsageReportFetchSyncResponse>
    }
}
