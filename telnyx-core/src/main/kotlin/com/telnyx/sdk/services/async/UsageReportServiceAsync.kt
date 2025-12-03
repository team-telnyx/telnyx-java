// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsResponse
import com.telnyx.sdk.models.usagereports.UsageReportListPageAsync
import com.telnyx.sdk.models.usagereports.UsageReportListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageReportServiceAsync

    /** Get Telnyx usage data by product, broken out by the specified dimensions */
    fun list(params: UsageReportListParams): CompletableFuture<UsageReportListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: UsageReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageReportListPageAsync>

    /**
     * Get the Usage Reports options for querying usage, including the products available and their
     * respective metrics and dimensions
     */
    fun getOptions(): CompletableFuture<UsageReportGetOptionsResponse> =
        getOptions(UsageReportGetOptionsParams.none())

    /** @see getOptions */
    fun getOptions(
        params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageReportGetOptionsResponse>

    /** @see getOptions */
    fun getOptions(
        params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none()
    ): CompletableFuture<UsageReportGetOptionsResponse> = getOptions(params, RequestOptions.none())

    /** @see getOptions */
    fun getOptions(
        requestOptions: RequestOptions
    ): CompletableFuture<UsageReportGetOptionsResponse> =
        getOptions(UsageReportGetOptionsParams.none(), requestOptions)

    /**
     * A view of [UsageReportServiceAsync] that provides access to raw HTTP responses for each
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
        ): UsageReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /usage_reports`, but is otherwise the same as
         * [UsageReportServiceAsync.list].
         */
        fun list(
            params: UsageReportListParams
        ): CompletableFuture<HttpResponseFor<UsageReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: UsageReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageReportListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /usage_reports/options`, but is otherwise the same
         * as [UsageReportServiceAsync.getOptions].
         */
        fun getOptions(): CompletableFuture<HttpResponseFor<UsageReportGetOptionsResponse>> =
            getOptions(UsageReportGetOptionsParams.none())

        /** @see getOptions */
        fun getOptions(
            params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageReportGetOptionsResponse>>

        /** @see getOptions */
        fun getOptions(
            params: UsageReportGetOptionsParams = UsageReportGetOptionsParams.none()
        ): CompletableFuture<HttpResponseFor<UsageReportGetOptionsResponse>> =
            getOptions(params, RequestOptions.none())

        /** @see getOptions */
        fun getOptions(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UsageReportGetOptionsResponse>> =
            getOptions(UsageReportGetOptionsParams.none(), requestOptions)
    }
}
