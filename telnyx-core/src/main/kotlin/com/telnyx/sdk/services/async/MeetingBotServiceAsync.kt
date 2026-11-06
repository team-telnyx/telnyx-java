// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.meetingbot.CalendarServiceAsync
import java.util.function.Consumer

interface MeetingBotServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingBotServiceAsync

    /** Connect calendars and manage automatic meeting joins. */
    fun calendar(): CalendarServiceAsync

    /**
     * A view of [MeetingBotServiceAsync] that provides access to raw HTTP responses for each
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
        ): MeetingBotServiceAsync.WithRawResponse

        /** Connect calendars and manage automatic meeting joins. */
        fun calendar(): CalendarServiceAsync.WithRawResponse
    }
}
