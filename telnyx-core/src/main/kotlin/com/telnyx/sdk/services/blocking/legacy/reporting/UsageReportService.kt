// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextResponse
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.MessagingService
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.NumberLookupService
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.VoiceService
import java.util.function.Consumer

/** Speech to text usage reports */
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

    /** Messaging usage reports */
    fun messaging(): MessagingService

    /** Number lookup usage reports */
    fun numberLookup(): NumberLookupService

    /** Voice usage reports */
    fun voice(): VoiceService

    /**
     * Generate and fetch speech to text usage report synchronously. This endpoint will both
     * generate and fetch the speech to text report over a specified time period.
     */
    fun retrieveSpeechToText(): UsageReportRetrieveSpeechToTextResponse =
        retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none())

    /** @see retrieveSpeechToText */
    fun retrieveSpeechToText(
        params: UsageReportRetrieveSpeechToTextParams =
            UsageReportRetrieveSpeechToTextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageReportRetrieveSpeechToTextResponse

    /** @see retrieveSpeechToText */
    fun retrieveSpeechToText(
        params: UsageReportRetrieveSpeechToTextParams = UsageReportRetrieveSpeechToTextParams.none()
    ): UsageReportRetrieveSpeechToTextResponse = retrieveSpeechToText(params, RequestOptions.none())

    /** @see retrieveSpeechToText */
    fun retrieveSpeechToText(
        requestOptions: RequestOptions
    ): UsageReportRetrieveSpeechToTextResponse =
        retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none(), requestOptions)

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

        /** Messaging usage reports */
        fun messaging(): MessagingService.WithRawResponse

        /** Number lookup usage reports */
        fun numberLookup(): NumberLookupService.WithRawResponse

        /** Voice usage reports */
        fun voice(): VoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/speech_to_text`, but
         * is otherwise the same as [UsageReportService.retrieveSpeechToText].
         */
        @MustBeClosed
        fun retrieveSpeechToText(): HttpResponseFor<UsageReportRetrieveSpeechToTextResponse> =
            retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none())

        /** @see retrieveSpeechToText */
        @MustBeClosed
        fun retrieveSpeechToText(
            params: UsageReportRetrieveSpeechToTextParams =
                UsageReportRetrieveSpeechToTextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageReportRetrieveSpeechToTextResponse>

        /** @see retrieveSpeechToText */
        @MustBeClosed
        fun retrieveSpeechToText(
            params: UsageReportRetrieveSpeechToTextParams =
                UsageReportRetrieveSpeechToTextParams.none()
        ): HttpResponseFor<UsageReportRetrieveSpeechToTextResponse> =
            retrieveSpeechToText(params, RequestOptions.none())

        /** @see retrieveSpeechToText */
        @MustBeClosed
        fun retrieveSpeechToText(
            requestOptions: RequestOptions
        ): HttpResponseFor<UsageReportRetrieveSpeechToTextResponse> =
            retrieveSpeechToText(UsageReportRetrieveSpeechToTextParams.none(), requestOptions)
    }
}
