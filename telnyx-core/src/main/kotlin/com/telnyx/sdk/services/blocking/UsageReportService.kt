// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsResponse
import com.telnyx.sdk.models.usagereports.UsageReportListPage
import com.telnyx.sdk.models.usagereports.UsageReportListParams
import java.util.function.Consumer

/** Usage data reporting across Telnyx products */
interface UsageReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageReportService

    /** Get Telnyx usage data by product, broken out by the specified dimensions */
    fun list(params: UsageReportListParams): UsageReportListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: UsageReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageReportListPage

    /**
     * Get the Usage Reports options for querying usage, including the products available and their
     * respective metrics and dimensions
     */
    fun getOptions(): UsageReportGetOptionsResponse = getOptions(UsageReportGetOptionsParams.none())

    /** @see getOptions */
    fun getOptions(
        params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageReportGetOptionsResponse

    /** @see getOptions */
    fun getOptions(
        params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none()
    ): UsageReportGetOptionsResponse = getOptions(params, RequestOptions.none())

    /** @see getOptions */
    fun getOptions(requestOptions: RequestOptions): UsageReportGetOptionsResponse =
        getOptions(UsageReportGetOptionsParams.none(), requestOptions)

    /**
     * A view of [UsageReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /usage_reports`, but is otherwise the same as
         * [UsageReportService.list].
         */
        @MustBeClosed
        fun list(params: UsageReportListParams): HttpResponseFor<UsageReportListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UsageReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageReportListPage>

        /**
         * Returns a raw HTTP response for `get /usage_reports/options`, but is otherwise the same
         * as [UsageReportService.getOptions].
         */
        @MustBeClosed
        fun getOptions(): HttpResponseFor<UsageReportGetOptionsResponse> =
            getOptions(UsageReportGetOptionsParams.none())

        /** @see getOptions */
        @MustBeClosed
        fun getOptions(
            params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageReportGetOptionsResponse>

        /** @see getOptions */
        @MustBeClosed
        fun getOptions(
            params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none()
        ): HttpResponseFor<UsageReportGetOptionsResponse> =
            getOptions(params, RequestOptions.none())

        /** @see getOptions */
        @MustBeClosed
        fun getOptions(
            requestOptions: RequestOptions
        ): HttpResponseFor<UsageReportGetOptionsResponse> =
            getOptions(UsageReportGetOptionsParams.none(), requestOptions)
    }
}
