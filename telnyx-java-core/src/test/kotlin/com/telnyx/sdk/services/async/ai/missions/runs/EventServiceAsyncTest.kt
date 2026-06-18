// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventListParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.ai().missions().runs().events()

        val pageFuture =
            eventServiceAsync.list(
                EventListParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventDetails() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.ai().missions().runs().events()

        val responseFuture =
            eventServiceAsync.getEventDetails(
                EventGetEventDetailsParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventId("event_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun log() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.ai().missions().runs().events()

        val responseFuture =
            eventServiceAsync.log(
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

        val response = responseFuture.get()
        response.validate()
    }
}
