// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.llmtokengateway

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveEventsParams
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveEventsResponse
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveSummaryParams
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveSummaryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
interface SpendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendServiceAsync

    /**
     * Return request-level usage history for the authenticated account. Supply both UTC dates or
     * neither; omitting both returns the previous full UTC day. Dates use a half-open
     * range [start_date, end_date) of at most 31 days. Cost reflects budget reference rates, not
     * invoice charges. Unknown spend is excluded and reported separately. The report snapshot
     * supports at most 10,000 matching requests, independently of page size. Exceeding this bound
     * returns HTTP 503 without partial results. Narrow the date range or resource filters before
     * retrying. A failed report must not be interpreted as zero usage. Request tags can filter
     * either report and metadata:<key> can group the summary.
     */
    fun retrieveEvents(): CompletableFuture<SpendRetrieveEventsResponse> =
        retrieveEvents(SpendRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: SpendRetrieveEventsParams = SpendRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendRetrieveEventsResponse>

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: SpendRetrieveEventsParams = SpendRetrieveEventsParams.none()
    ): CompletableFuture<SpendRetrieveEventsResponse> =
        retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        requestOptions: RequestOptions
    ): CompletableFuture<SpendRetrieveEventsResponse> =
        retrieveEvents(SpendRetrieveEventsParams.none(), requestOptions)

    /**
     * Return request counts, token counts and reference spend grouped by one attribution dimension.
     * Both UTC dates and group_by are required. Dates use a half-open range [start_date, end_date)
     * of at most 31 days. Cost reflects budget reference rates, not invoice charges. Unknown spend
     * is excluded and reported separately. The report snapshot supports at most 10,000 matching
     * requests, independently of page size. Exceeding this bound returns HTTP 503 without partial
     * results. Narrow the date range or resource filters before retrying. A failed report must not
     * be interpreted as zero usage. Request tags can filter either report and metadata:<key> can
     * group the summary.
     */
    fun retrieveSummary(
        params: SpendRetrieveSummaryParams
    ): CompletableFuture<SpendRetrieveSummaryResponse> =
        retrieveSummary(params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: SpendRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendRetrieveSummaryResponse>

    /** A view of [SpendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/spend/events`, but is otherwise
         * the same as [SpendServiceAsync.retrieveEvents].
         */
        fun retrieveEvents(): CompletableFuture<HttpResponseFor<SpendRetrieveEventsResponse>> =
            retrieveEvents(SpendRetrieveEventsParams.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: SpendRetrieveEventsParams = SpendRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendRetrieveEventsResponse>>

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: SpendRetrieveEventsParams = SpendRetrieveEventsParams.none()
        ): CompletableFuture<HttpResponseFor<SpendRetrieveEventsResponse>> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpendRetrieveEventsResponse>> =
            retrieveEvents(SpendRetrieveEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/spend/summary`, but is otherwise
         * the same as [SpendServiceAsync.retrieveSummary].
         */
        fun retrieveSummary(
            params: SpendRetrieveSummaryParams
        ): CompletableFuture<HttpResponseFor<SpendRetrieveSummaryResponse>> =
            retrieveSummary(params, RequestOptions.none())

        /** @see retrieveSummary */
        fun retrieveSummary(
            params: SpendRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendRetrieveSummaryResponse>>
    }
}
