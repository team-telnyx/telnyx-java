// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.calendarconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingListParams
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeetingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingServiceAsync = client.calendarConnections().meetings()

        val meetingFuture =
            meetingServiceAsync.update(
                MeetingUpdateParams.builder()
                    .id("id")
                    .meetingId("meeting_id")
                    .botWillJoin(false)
                    .build()
            )

        val meeting = meetingFuture.get()
        meeting.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingServiceAsync = client.calendarConnections().meetings()

        val meetingsFuture =
            meetingServiceAsync.list(
                MeetingListParams.builder()
                    .id("id")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val meetings = meetingsFuture.get()
        meetings.validate()
    }
}
