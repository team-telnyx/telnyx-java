// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.meetingbot

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingbot.calendar.CalendarRetrieveOAuthCallbackParams
import java.util.function.Consumer

/** Connect calendars and manage automatic meeting joins. */
interface CalendarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService

    /**
     * Browser redirect after calendar consent. Use the returned oauth_url rather than constructing
     * this request. Verified state identifies the connecting user. Returns HTML for success,
     * cancellation, or failure; no JSON error envelope or bearer token is used.
     */
    fun retrieveOAuthCallback(): String =
        retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none())

    /** @see retrieveOAuthCallback */
    fun retrieveOAuthCallback(
        params: CalendarRetrieveOAuthCallbackParams = CalendarRetrieveOAuthCallbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see retrieveOAuthCallback */
    fun retrieveOAuthCallback(
        params: CalendarRetrieveOAuthCallbackParams = CalendarRetrieveOAuthCallbackParams.none()
    ): String = retrieveOAuthCallback(params, RequestOptions.none())

    /** @see retrieveOAuthCallback */
    fun retrieveOAuthCallback(requestOptions: RequestOptions): String =
        retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none(), requestOptions)

    /** A view of [CalendarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /meeting_bot/calendar/oauth_callback`, but is
         * otherwise the same as [CalendarService.retrieveOAuthCallback].
         */
        @MustBeClosed
        fun retrieveOAuthCallback(): HttpResponseFor<String> =
            retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none())

        /** @see retrieveOAuthCallback */
        @MustBeClosed
        fun retrieveOAuthCallback(
            params: CalendarRetrieveOAuthCallbackParams =
                CalendarRetrieveOAuthCallbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see retrieveOAuthCallback */
        @MustBeClosed
        fun retrieveOAuthCallback(
            params: CalendarRetrieveOAuthCallbackParams = CalendarRetrieveOAuthCallbackParams.none()
        ): HttpResponseFor<String> = retrieveOAuthCallback(params, RequestOptions.none())

        /** @see retrieveOAuthCallback */
        @MustBeClosed
        fun retrieveOAuthCallback(requestOptions: RequestOptions): HttpResponseFor<String> =
            retrieveOAuthCallback(CalendarRetrieveOAuthCallbackParams.none(), requestOptions)
    }
}
