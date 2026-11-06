// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.meetingbot.CalendarService
import java.util.function.Consumer

interface MeetingBotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingBotService

    /** Connect calendars and manage automatic meeting joins. */
    fun calendar(): CalendarService

    /** A view of [MeetingBotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingBotService.WithRawResponse

        /** Connect calendars and manage automatic meeting joins. */
        fun calendar(): CalendarService.WithRawResponse
    }
}
