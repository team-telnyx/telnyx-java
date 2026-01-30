// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxSendingStartedWebhookEventTest {

    @Test
    fun create() {
        val faxSendingStartedWebhookEvent =
            FaxSendingStartedWebhookEvent.builder()
                .data(
                    FaxSendingStartedWebhookEvent.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxSendingStartedWebhookEvent.Data.EventType.FAX_SENDING_STARTED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxSendingStartedWebhookEvent.Data.Payload.builder()
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(
                                    FaxSendingStartedWebhookEvent.Data.Payload.Direction.OUTBOUND
                                )
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .status(FaxSendingStartedWebhookEvent.Data.Payload.Status.SENDING)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxSendingStartedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxSendingStartedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        assertThat(faxSendingStartedWebhookEvent.data())
            .contains(
                FaxSendingStartedWebhookEvent.Data.builder()
                    .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                    .eventType(FaxSendingStartedWebhookEvent.Data.EventType.FAX_SENDING_STARTED)
                    .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                    .payload(
                        FaxSendingStartedWebhookEvent.Data.Payload.builder()
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("234423")
                            .direction(
                                FaxSendingStartedWebhookEvent.Data.Payload.Direction.OUTBOUND
                            )
                            .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                            .from("+17733372107")
                            .mediaName("my_media_uploaded_to_media_storage_api")
                            .originalMediaUrl("http://www.example.com/fax.pdf")
                            .status(FaxSendingStartedWebhookEvent.Data.Payload.Status.SENDING)
                            .to("+15107882622")
                            .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                            .build()
                    )
                    .recordType(FaxSendingStartedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
        assertThat(faxSendingStartedWebhookEvent.meta())
            .contains(
                FaxSendingStartedWebhookEvent.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://www.example.com/webhooks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxSendingStartedWebhookEvent =
            FaxSendingStartedWebhookEvent.builder()
                .data(
                    FaxSendingStartedWebhookEvent.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxSendingStartedWebhookEvent.Data.EventType.FAX_SENDING_STARTED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxSendingStartedWebhookEvent.Data.Payload.builder()
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(
                                    FaxSendingStartedWebhookEvent.Data.Payload.Direction.OUTBOUND
                                )
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .status(FaxSendingStartedWebhookEvent.Data.Payload.Status.SENDING)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxSendingStartedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxSendingStartedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        val roundtrippedFaxSendingStartedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxSendingStartedWebhookEvent),
                jacksonTypeRef<FaxSendingStartedWebhookEvent>(),
            )

        assertThat(roundtrippedFaxSendingStartedWebhookEvent)
            .isEqualTo(faxSendingStartedWebhookEvent)
    }
}
