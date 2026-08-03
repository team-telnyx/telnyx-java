// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailevents.EmailEventListParams
import com.telnyx.sdk.models.emailevents.EmailEventListResponse
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsResponse
import java.util.function.Consumer

/** Retrieve account-level email events and event statistics. */
interface EmailEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailEventService

    /** Lists account-level email events sorted oldest first by `occurred_at asc, id asc`. */
    fun list(): EmailEventListResponse = list(EmailEventListParams.none())

    /** @see list */
    fun list(
        params: EmailEventListParams = EmailEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailEventListResponse

    /** @see list */
    fun list(params: EmailEventListParams = EmailEventListParams.none()): EmailEventListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailEventListResponse =
        list(EmailEventListParams.none(), requestOptions)

    /**
     * Returns counts and rates for email events over a time range. The default start time is 30
     * days ago.
     */
    fun retrieveStats(): EmailEventRetrieveStatsResponse =
        retrieveStats(EmailEventRetrieveStatsParams.none())

    /** @see retrieveStats */
    fun retrieveStats(
        params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailEventRetrieveStatsResponse

    /** @see retrieveStats */
    fun retrieveStats(
        params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none()
    ): EmailEventRetrieveStatsResponse = retrieveStats(params, RequestOptions.none())

    /** @see retrieveStats */
    fun retrieveStats(requestOptions: RequestOptions): EmailEventRetrieveStatsResponse =
        retrieveStats(EmailEventRetrieveStatsParams.none(), requestOptions)

    /** A view of [EmailEventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /email_events`, but is otherwise the same as
         * [EmailEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailEventListResponse> = list(EmailEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailEventListParams = EmailEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailEventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailEventListParams = EmailEventListParams.none()
        ): HttpResponseFor<EmailEventListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailEventListResponse> =
            list(EmailEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_events/stats`, but is otherwise the same as
         * [EmailEventService.retrieveStats].
         */
        @MustBeClosed
        fun retrieveStats(): HttpResponseFor<EmailEventRetrieveStatsResponse> =
            retrieveStats(EmailEventRetrieveStatsParams.none())

        /** @see retrieveStats */
        @MustBeClosed
        fun retrieveStats(
            params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailEventRetrieveStatsResponse>

        /** @see retrieveStats */
        @MustBeClosed
        fun retrieveStats(
            params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none()
        ): HttpResponseFor<EmailEventRetrieveStatsResponse> =
            retrieveStats(params, RequestOptions.none())

        /** @see retrieveStats */
        @MustBeClosed
        fun retrieveStats(
            requestOptions: RequestOptions
        ): HttpResponseFor<EmailEventRetrieveStatsResponse> =
            retrieveStats(EmailEventRetrieveStatsParams.none(), requestOptions)
    }
}
