// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import com.telnyx.api.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextResponse
import com.telnyx.api.services.async.legacy.reporting.usagereports.MessagingServiceAsync
import com.telnyx.api.services.async.legacy.reporting.usagereports.NumberLookupServiceAsync
import com.telnyx.api.services.async.legacy.reporting.usagereports.VoiceServiceAsync
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

    fun messaging(): MessagingServiceAsync

    fun numberLookup(): NumberLookupServiceAsync

    fun voice(): VoiceServiceAsync

    /**
     * Generate and fetch speech to text usage report synchronously. This endpoint will both
     * generate and fetch the speech to text report over a specified time period.
     */
    fun retrieveSpeechToText(): CompletableFuture<UsageReportRetrieveSpeechToTextResponse> =
        retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none())

    /** @see retrieveSpeechToText */
    fun retrieveSpeechToText(
        params: UsageReportRetrieveSpeechToTextParams =
            UsageReportRetrieveSpeechToTextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageReportRetrieveSpeechToTextResponse>

    /** @see retrieveSpeechToText */
    fun retrieveSpeechToText(
        params: UsageReportRetrieveSpeechToTextParams = UsageReportRetrieveSpeechToTextParams.none()
    ): CompletableFuture<UsageReportRetrieveSpeechToTextResponse> =
        retrieveSpeechToText(params, RequestOptions.none())

    /** @see retrieveSpeechToText */
    fun retrieveSpeechToText(
        requestOptions: RequestOptions
    ): CompletableFuture<UsageReportRetrieveSpeechToTextResponse> =
        retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none(), requestOptions)

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

        fun messaging(): MessagingServiceAsync.WithRawResponse

        fun numberLookup(): NumberLookupServiceAsync.WithRawResponse

        fun voice(): VoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/speech_to_text`, but
         * is otherwise the same as [UsageReportServiceAsync.retrieveSpeechToText].
         */
        fun retrieveSpeechToText():
            CompletableFuture<HttpResponseFor<UsageReportRetrieveSpeechToTextResponse>> =
            retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none())

        /** @see retrieveSpeechToText */
        fun retrieveSpeechToText(
            params: UsageReportRetrieveSpeechToTextParams =
                UsageReportRetrieveSpeechToTextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageReportRetrieveSpeechToTextResponse>>

        /** @see retrieveSpeechToText */
        fun retrieveSpeechToText(
            params: UsageReportRetrieveSpeechToTextParams =
                UsageReportRetrieveSpeechToTextParams.none()
        ): CompletableFuture<HttpResponseFor<UsageReportRetrieveSpeechToTextResponse>> =
            retrieveSpeechToText(params, RequestOptions.none())

        /** @see retrieveSpeechToText */
        fun retrieveSpeechToText(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UsageReportRetrieveSpeechToTextResponse>> =
            retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none(), requestOptions)
    }
}
