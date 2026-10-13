// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveExportParams
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveExportResponse
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryParams
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryResponse
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
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
     * Durable, replayable, content-free usage export for customer pipelines. Requires the dedicated
     * llm_token_gateway.usage_export.read V2 action; spend.read and usage.read do not grant it.
     * Records are inference.request (one per immutable ledger revision; a correction adds a new id
     * with supersedes, keep the highest revision per request_id) and guardrail.evaluation (one per
     * guardrail event, including blocked prompts with no inference record; correlate on
     * request_id). Delivery is at least once in commit order: deduplicate on id. Records appear
     * after settlement and after every older database transaction has finished
     * (meta.horizon_lag_seconds); keep polling with next_cursor, which is always returned and is
     * reusable after has_more is false. After a logical database restore, restart from start_time
     * and deduplicate on id; a cursor from before it may return 409 cursor_expired (no
     * Retry-After). Retention promise 30 days. No prompts, responses, provider credentials,
     * supplier or customer rates. Gateway reference/enforcement usage, not invoice truth or BYOK
     * provider charges.
     */
    fun retrieveExport(): UsageRetrieveExportResponse =
        retrieveExport(UsageRetrieveExportParams.none())

    /** @see retrieveExport */
    fun retrieveExport(
        params: UsageRetrieveExportParams = UsageRetrieveExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageRetrieveExportResponse

    /** @see retrieveExport */
    fun retrieveExport(
        params: UsageRetrieveExportParams = UsageRetrieveExportParams.none()
    ): UsageRetrieveExportResponse = retrieveExport(params, RequestOptions.none())

    /** @see retrieveExport */
    fun retrieveExport(requestOptions: RequestOptions): UsageRetrieveExportResponse =
        retrieveExport(UsageRetrieveExportParams.none(), requestOptions)

    /**
     * Gateway reference/enforcement usage, not invoice truth or BYOK provider charges. Requires the
     * dedicated llm_token_gateway.usage.read V2 action for combined spend and guardrail reporting;
     * existing spend.read and guardrail_events.read grants do not grant this endpoint. All totals,
     * UTC daily buckets, models and latest 20 guardrail events share one database snapshot. UTC
     * half-open dates, at most 31 days. Zero-filled days; at most 1000 models (503 rather than
     * truncation on overflow/timeout). Known tokens sum independently known categories across
     * latest attempt evidence, including corrections; unknown spend is excluded and
     * unknown_requests/reserved_spend remain explicit. Guardrail counts count events, not distinct
     * requests. No raw spend events, prompts or secrets. This read-only report creates no
     * pagination snapshot and accepts no pagination parameters.
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
         * Returns a raw HTTP response for `get /llm_token_gateway/usage/export`, but is otherwise
         * the same as [UsageService.retrieveExport].
         */
        @MustBeClosed
        fun retrieveExport(): HttpResponseFor<UsageRetrieveExportResponse> =
            retrieveExport(UsageRetrieveExportParams.none())

        /** @see retrieveExport */
        @MustBeClosed
        fun retrieveExport(
            params: UsageRetrieveExportParams = UsageRetrieveExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageRetrieveExportResponse>

        /** @see retrieveExport */
        @MustBeClosed
        fun retrieveExport(
            params: UsageRetrieveExportParams = UsageRetrieveExportParams.none()
        ): HttpResponseFor<UsageRetrieveExportResponse> =
            retrieveExport(params, RequestOptions.none())

        /** @see retrieveExport */
        @MustBeClosed
        fun retrieveExport(
            requestOptions: RequestOptions
        ): HttpResponseFor<UsageRetrieveExportResponse> =
            retrieveExport(UsageRetrieveExportParams.none(), requestOptions)

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
