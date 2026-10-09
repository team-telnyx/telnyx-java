// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryParams
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryResponse
import java.util.function.Consumer

/** Manage and report AI Gateway traffic. */
interface UsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService

    /**
     * Return complete usage totals, UTC daily and model breakdowns, and guardrail event counts for
     * one token group owned by the authenticated account. Requires the llm_token_gateway.usage.read
     * permission; spend and guardrail read permissions do not grant this combined report. All
     * sections share one database snapshot and include the latest usage corrections. Dates use an
     * inclusive start and exclusive end spanning 1 to 31 days. Only token_group_id, start_date and
     * end_date are accepted; pagination, group_by and other filters are rejected. Spend is
     * reference/enforcement USD, not invoice truth or BYOK provider charges. Unknown cost is
     * excluded from spend and reported through unknown_requests and reserved_spend. Daily rows
     * include zero-activity days. Model rows are ordered by request count descending, then model
     * name, and are limited to 1,000. Guardrail counts count events, not distinct requests;
     * recent_events contains at most 20 newest events. A report that exceeds model or query limits
     * returns 503 rather than a truncated success.
     */
    fun retrieveSummary(params: UsageRetrieveSummaryParams): UsageRetrieveSummaryResponse =
        retrieveSummary(params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: UsageRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageRetrieveSummaryResponse

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /llm_token_gateway/usage/summary`, but is otherwise
         * the same as [UsageService.retrieveSummary].
         */
        @MustBeClosed
        fun retrieveSummary(
            params: UsageRetrieveSummaryParams
        ): HttpResponseFor<UsageRetrieveSummaryResponse> =
            retrieveSummary(params, RequestOptions.none())

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            params: UsageRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageRetrieveSummaryResponse>
    }
}
