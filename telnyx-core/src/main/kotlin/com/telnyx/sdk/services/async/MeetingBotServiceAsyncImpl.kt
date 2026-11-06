// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.meetingbot.CalendarServiceAsync
import com.telnyx.sdk.services.async.meetingbot.CalendarServiceAsyncImpl
import java.util.function.Consumer

class MeetingBotServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingBotServiceAsync {

    private val withRawResponse: MeetingBotServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calendar: CalendarServiceAsync by lazy { CalendarServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MeetingBotServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingBotServiceAsync =
        MeetingBotServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Connect calendars and manage automatic meeting joins. */
    override fun calendar(): CalendarServiceAsync = calendar

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingBotServiceAsync.WithRawResponse {

        private val calendar: CalendarServiceAsync.WithRawResponse by lazy {
            CalendarServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingBotServiceAsync.WithRawResponse =
            MeetingBotServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Connect calendars and manage automatic meeting joins. */
        override fun calendar(): CalendarServiceAsync.WithRawResponse = calendar
    }
}
