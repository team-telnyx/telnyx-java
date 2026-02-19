// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ConversationChannelType
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventCreateParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventDeleteParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScheduledEventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scheduledEventService = client.ai().assistants().scheduledEvents()

        val scheduledEventResponse =
            scheduledEventService.create(
                ScheduledEventCreateParams.builder()
                    .assistantId("assistant_id")
                    .scheduledAtFixedDatetime(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                    .telnyxAgentTarget("telnyx_agent_target")
                    .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                    .telnyxEndUserTarget("telnyx_end_user_target")
                    .conversationMetadata(
                        ScheduledEventCreateParams.ConversationMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .dynamicVariables(
                        ScheduledEventCreateParams.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .text("text")
                    .build()
            )

        scheduledEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scheduledEventService = client.ai().assistants().scheduledEvents()

        val scheduledEventResponse =
            scheduledEventService.retrieve(
                ScheduledEventRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .eventId("event_id")
                    .build()
            )

        scheduledEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scheduledEventService = client.ai().assistants().scheduledEvents()

        val page = scheduledEventService.list("assistant_id")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scheduledEventService = client.ai().assistants().scheduledEvents()

        scheduledEventService.delete(
            ScheduledEventDeleteParams.builder()
                .assistantId("assistant_id")
                .eventId("event_id")
                .build()
        )
    }
}
