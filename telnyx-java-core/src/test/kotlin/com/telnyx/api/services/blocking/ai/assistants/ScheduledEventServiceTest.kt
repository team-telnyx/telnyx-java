// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.core.JsonValue
import com.telnyx.api.models.ai.assistants.scheduledevents.ConversationChannelType
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventCreateParams
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventDeleteParams
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventListParams
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScheduledEventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                    .text("text")
                    .build()
            )

        scheduledEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledEventService = client.ai().assistants().scheduledEvents()

        val scheduledEvents =
            scheduledEventService.list(
                ScheduledEventListParams.builder()
                    .assistantId("assistant_id")
                    .conversationChannel(ConversationChannelType.PHONE_CALL)
                    .fromDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .page(ScheduledEventListParams.Page.builder().number(1L).size(1L).build())
                    .toDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        scheduledEvents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledEventService = client.ai().assistants().scheduledEvents()

        val scheduledEvent =
            scheduledEventService.delete(
                ScheduledEventDeleteParams.builder()
                    .assistantId("assistant_id")
                    .eventId("event_id")
                    .build()
            )

        scheduledEvent.validate()
    }
}
