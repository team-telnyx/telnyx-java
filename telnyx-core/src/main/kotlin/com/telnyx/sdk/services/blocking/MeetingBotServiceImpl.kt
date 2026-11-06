// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.meetingbot.CalendarService
import com.telnyx.sdk.services.blocking.meetingbot.CalendarServiceImpl
import java.util.function.Consumer

class MeetingBotServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingBotService {

    private val withRawResponse: MeetingBotService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calendar: CalendarService by lazy { CalendarServiceImpl(clientOptions) }

    override fun withRawResponse(): MeetingBotService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingBotService =
        MeetingBotServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Connect calendars and manage automatic meeting joins. */
    override fun calendar(): CalendarService = calendar

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingBotService.WithRawResponse {

        private val calendar: CalendarService.WithRawResponse by lazy {
            CalendarServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingBotService.WithRawResponse =
            MeetingBotServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Connect calendars and manage automatic meeting joins. */
        override fun calendar(): CalendarService.WithRawResponse = calendar
    }
}
