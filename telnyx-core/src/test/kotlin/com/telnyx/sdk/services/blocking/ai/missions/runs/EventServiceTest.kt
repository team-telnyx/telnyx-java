// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventListParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.ai().missions().runs().events()

        val page =
            eventService.list(
                EventListParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventDetails() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.ai().missions().runs().events()

        val response =
            eventService.getEventDetails(
                EventGetEventDetailsParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventId("event_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun log() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.ai().missions().runs().events()

        val response =
            eventService.log(
                EventLogParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .summary("summary")
                    .type(EventLogParams.Type.STATUS_CHANGE)
                    .agentId("agent_id")
                    .idempotencyKey("idempotency_key")
                    .payload(
                        EventLogParams.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .stepId("step_id")
                    .build()
            )

        response.validate()
    }
}
