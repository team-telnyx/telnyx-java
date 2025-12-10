// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ConversationChannelType
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventCreateParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventDeleteParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventListParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScheduledEventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledEventServiceAsync = client.ai().assistants().scheduledEvents()

        val scheduledEventResponseFuture =
            scheduledEventServiceAsync.create(
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

        val scheduledEventResponse = scheduledEventResponseFuture.get()
        scheduledEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledEventServiceAsync = client.ai().assistants().scheduledEvents()

        val scheduledEventResponseFuture =
            scheduledEventServiceAsync.retrieve(
                ScheduledEventRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .eventId("event_id")
                    .build()
            )

        val scheduledEventResponse = scheduledEventResponseFuture.get()
        scheduledEventResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledEventServiceAsync = client.ai().assistants().scheduledEvents()

        val scheduledEventsFuture =
            scheduledEventServiceAsync.list(
                ScheduledEventListParams.builder()
                    .assistantId("assistant_id")
                    .conversationChannel(ConversationChannelType.PHONE_CALL)
                    .fromDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .page(ScheduledEventListParams.Page.builder().number(1L).size(1L).build())
                    .toDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val scheduledEvents = scheduledEventsFuture.get()
        scheduledEvents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledEventServiceAsync = client.ai().assistants().scheduledEvents()

        val future =
            scheduledEventServiceAsync.delete(
                ScheduledEventDeleteParams.builder()
                    .assistantId("assistant_id")
                    .eventId("event_id")
                    .build()
            )

        val response = future.get()
    }
}
