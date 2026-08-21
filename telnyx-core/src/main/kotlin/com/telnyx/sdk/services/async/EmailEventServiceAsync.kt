// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailevents.EmailEventListPageAsync
import com.telnyx.sdk.models.emailevents.EmailEventListParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve account-level email events and event statistics. */
interface EmailEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailEventServiceAsync

    /** Lists account-level email events sorted oldest first by `occurred_at asc, id asc`. */
    fun list(): CompletableFuture<EmailEventListPageAsync> = list(EmailEventListParams.none())

    /** @see list */
    fun list(
        params: EmailEventListParams = EmailEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailEventListPageAsync>

    /** @see list */
    fun list(
        params: EmailEventListParams = EmailEventListParams.none()
    ): CompletableFuture<EmailEventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailEventListPageAsync> =
        list(EmailEventListParams.none(), requestOptions)

    /**
     * Returns counts and rates for email events over a time range. The default start time is 30
     * days ago.
     */
    fun retrieveStats(): CompletableFuture<EmailEventRetrieveStatsResponse> =
        retrieveStats(EmailEventRetrieveStatsParams.none())

    /** @see retrieveStats */
    fun retrieveStats(
        params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailEventRetrieveStatsResponse>

    /** @see retrieveStats */
    fun retrieveStats(
        params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none()
    ): CompletableFuture<EmailEventRetrieveStatsResponse> =
        retrieveStats(params, RequestOptions.none())

    /** @see retrieveStats */
    fun retrieveStats(
        requestOptions: RequestOptions
    ): CompletableFuture<EmailEventRetrieveStatsResponse> =
        retrieveStats(EmailEventRetrieveStatsParams.none(), requestOptions)

    /**
     * A view of [EmailEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /email_events`, but is otherwise the same as
         * [EmailEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailEventListPageAsync>> =
            list(EmailEventListParams.none())

        /** @see list */
        fun list(
            params: EmailEventListParams = EmailEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailEventListPageAsync>>

        /** @see list */
        fun list(
            params: EmailEventListParams = EmailEventListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailEventListPageAsync>> =
            list(EmailEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_events/stats`, but is otherwise the same as
         * [EmailEventServiceAsync.retrieveStats].
         */
        fun retrieveStats(): CompletableFuture<HttpResponseFor<EmailEventRetrieveStatsResponse>> =
            retrieveStats(EmailEventRetrieveStatsParams.none())

        /** @see retrieveStats */
        fun retrieveStats(
            params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailEventRetrieveStatsResponse>>

        /** @see retrieveStats */
        fun retrieveStats(
            params: EmailEventRetrieveStatsParams = EmailEventRetrieveStatsParams.none()
        ): CompletableFuture<HttpResponseFor<EmailEventRetrieveStatsResponse>> =
            retrieveStats(params, RequestOptions.none())

        /** @see retrieveStats */
        fun retrieveStats(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailEventRetrieveStatsResponse>> =
            retrieveStats(EmailEventRetrieveStatsParams.none(), requestOptions)
    }
}
