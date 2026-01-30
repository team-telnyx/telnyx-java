// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxQueuedWebhookEventTest {

    @Test
    fun create() {
        val faxQueuedWebhookEvent =
            FaxQueuedWebhookEvent.builder()
                .data(
                    FaxQueuedWebhookEvent.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxQueuedWebhookEvent.Data.EventType.FAX_QUEUED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxQueuedWebhookEvent.Data.Payload.builder()
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(FaxQueuedWebhookEvent.Data.Payload.Direction.OUTBOUND)
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .status(FaxQueuedWebhookEvent.Data.Payload.Status.QUEUED)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxQueuedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxQueuedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        assertThat(faxQueuedWebhookEvent.data())
            .contains(
                FaxQueuedWebhookEvent.Data.builder()
                    .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                    .eventType(FaxQueuedWebhookEvent.Data.EventType.FAX_QUEUED)
                    .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                    .payload(
                        FaxQueuedWebhookEvent.Data.Payload.builder()
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("234423")
                            .direction(FaxQueuedWebhookEvent.Data.Payload.Direction.OUTBOUND)
                            .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                            .from("+17733372107")
                            .mediaName("my_media_uploaded_to_media_storage_api")
                            .originalMediaUrl("http://www.example.com/fax.pdf")
                            .status(FaxQueuedWebhookEvent.Data.Payload.Status.QUEUED)
                            .to("+15107882622")
                            .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                            .build()
                    )
                    .recordType(FaxQueuedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
        assertThat(faxQueuedWebhookEvent.meta())
            .contains(
                FaxQueuedWebhookEvent.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://www.example.com/webhooks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxQueuedWebhookEvent =
            FaxQueuedWebhookEvent.builder()
                .data(
                    FaxQueuedWebhookEvent.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxQueuedWebhookEvent.Data.EventType.FAX_QUEUED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxQueuedWebhookEvent.Data.Payload.builder()
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(FaxQueuedWebhookEvent.Data.Payload.Direction.OUTBOUND)
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .status(FaxQueuedWebhookEvent.Data.Payload.Status.QUEUED)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxQueuedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxQueuedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        val roundtrippedFaxQueuedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxQueuedWebhookEvent),
                jacksonTypeRef<FaxQueuedWebhookEvent>(),
            )

        assertThat(roundtrippedFaxQueuedWebhookEvent).isEqualTo(faxQueuedWebhookEvent)
    }
}
