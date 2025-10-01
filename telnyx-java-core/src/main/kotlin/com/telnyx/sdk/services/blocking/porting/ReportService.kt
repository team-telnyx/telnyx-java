// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.porting

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.porting.reports.ReportCreateParams
import com.telnyx.sdk.models.porting.reports.ReportCreateResponse
import com.telnyx.sdk.models.porting.reports.ReportListParams
import com.telnyx.sdk.models.porting.reports.ReportListResponse
import com.telnyx.sdk.models.porting.reports.ReportRetrieveParams
import com.telnyx.sdk.models.porting.reports.ReportRetrieveResponse
import java.util.function.Consumer

interface ReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService

    /** Generate reports about porting operations. */
    fun create(params: ReportCreateParams): ReportCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreateResponse

    /** Retrieve a specific report generated. */
    fun retrieve(id: String): ReportRetrieveResponse = retrieve(id, ReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
    ): ReportRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ReportRetrieveParams): ReportRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ReportRetrieveResponse =
        retrieve(id, ReportRetrieveParams.none(), requestOptions)

    /** List the reports generated about porting operations. */
    fun list(): ReportListResponse = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportListResponse

    /** @see list */
    fun list(params: ReportListParams = ReportListParams.none()): ReportListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ReportListResponse =
        list(ReportListParams.none(), requestOptions)

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting/reports`, but is otherwise the same as
         * [ReportService.create].
         */
        @MustBeClosed
        fun create(params: ReportCreateParams): HttpResponseFor<ReportCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreateResponse>

        /**
         * Returns a raw HTTP response for `get /porting/reports/{id}`, but is otherwise the same as
         * [ReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(id, ReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
        ): HttpResponseFor<ReportRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ReportRetrieveParams): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(id, ReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting/reports`, but is otherwise the same as
         * [ReportService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ReportListResponse> = list(ReportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): HttpResponseFor<ReportListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ReportListResponse> =
            list(ReportListParams.none(), requestOptions)
    }
}
