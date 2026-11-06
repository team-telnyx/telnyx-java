// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.calendarconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingListParams
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeetingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingService = client.calendarConnections().meetings()

        val meeting =
            meetingService.update(
                MeetingUpdateParams.builder()
                    .id("id")
                    .meetingId("meeting_id")
                    .botWillJoin(false)
                    .build()
            )

        meeting.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingService = client.calendarConnections().meetings()

        val meetings =
            meetingService.list(
                MeetingListParams.builder()
                    .id("id")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        meetings.validate()
    }
}
