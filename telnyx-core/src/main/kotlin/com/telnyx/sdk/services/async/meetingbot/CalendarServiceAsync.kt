// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingbot

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingbot.calendar.CalendarRetrieveOAuthCallbackParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Connect calendars and manage automatic meeting joins. */
interface CalendarServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync

    /**
     * Browser redirect after calendar consent. Use the returned oauth_url rather than constructing
     * this request. Verified state identifies the connecting user. Returns HTML for success,
     * cancellation, or failure; no JSON error envelope or bearer token is used.
     */
    fun retrieveOAuthCallback(): CompletableFuture<String> =
        retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none())

    /** @see retrieveOAuthCallback */
    fun retrieveOAuthCallback(
        params: CalendarRetrieveOAuthCallbackParams = CalendarRetrieveOAuthCallbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see retrieveOAuthCallback */
    fun retrieveOAuthCallback(
        params: CalendarRetrieveOAuthCallbackParams = CalendarRetrieveOAuthCallbackParams.none()
    ): CompletableFuture<String> = retrieveOAuthCallback(params, RequestOptions.none())

    /** @see retrieveOAuthCallback */
    fun retrieveOAuthCallback(requestOptions: RequestOptions): CompletableFuture<String> =
        retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none(), requestOptions)

    /**
     * A view of [CalendarServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /meeting_bot/calendar/oauth_callback`, but is
         * otherwise the same as [CalendarServiceAsync.retrieveOAuthCallback].
         */
        fun retrieveOAuthCallback(): CompletableFuture<HttpResponseFor<String>> =
            retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none())

        /** @see retrieveOAuthCallback */
        fun retrieveOAuthCallback(
            params: CalendarRetrieveOAuthCallbackParams =
                CalendarRetrieveOAuthCallbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see retrieveOAuthCallback */
        fun retrieveOAuthCallback(
            params: CalendarRetrieveOAuthCallbackParams = CalendarRetrieveOAuthCallbackParams.none()
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveOAuthCallback(params, RequestOptions.none())

        /** @see retrieveOAuthCallback */
        fun retrieveOAuthCallback(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none(), requestOptions)
    }
}
