// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxQueuedWebhookEventTest {

    @Test
    fun create() {
        val faxQueuedWebhookEvent =
            FaxQueuedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxQueuedWebhookEvent.EventType.FAX_QUEUED)
                .payload(
                    FaxQueuedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxQueuedWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxQueuedWebhookEvent.Payload.Status.QUEUED)
                        .to("+13127367276")
                        .userId("a7f7c54a-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxQueuedWebhookEvent.RecordType.EVENT)
                .build()

        assertThat(faxQueuedWebhookEvent.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(faxQueuedWebhookEvent.eventType())
            .contains(FaxQueuedWebhookEvent.EventType.FAX_QUEUED)
        assertThat(faxQueuedWebhookEvent.payload())
            .contains(
                FaxQueuedWebhookEvent.Payload.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("234423")
                    .direction(FaxQueuedWebhookEvent.Payload.Direction.OUTBOUND)
                    .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .from("+13125790015")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .originalMediaUrl(
                        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                    )
                    .status(FaxQueuedWebhookEvent.Payload.Status.QUEUED)
                    .to("+13127367276")
                    .userId("a7f7c54a-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
        assertThat(faxQueuedWebhookEvent.recordType())
            .contains(FaxQueuedWebhookEvent.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxQueuedWebhookEvent =
            FaxQueuedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxQueuedWebhookEvent.EventType.FAX_QUEUED)
                .payload(
                    FaxQueuedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxQueuedWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxQueuedWebhookEvent.Payload.Status.QUEUED)
                        .to("+13127367276")
                        .userId("a7f7c54a-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxQueuedWebhookEvent.RecordType.EVENT)
                .build()

        val roundtrippedFaxQueuedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxQueuedWebhookEvent),
                jacksonTypeRef<FaxQueuedWebhookEvent>(),
            )

        assertThat(roundtrippedFaxQueuedWebhookEvent).isEqualTo(faxQueuedWebhookEvent)
    }
}
