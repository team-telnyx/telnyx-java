// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxFailedWebhookEventTest {

    @Test
    fun create() {
        val faxFailedWebhookEvent =
            FaxFailedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxFailedWebhookEvent.EventType.FAX_FAILED)
                .payload(
                    FaxFailedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxFailedWebhookEvent.Payload.Direction.OUTBOUND)
                        .failureReason(FaxFailedWebhookEvent.Payload.FailureReason.REJECTED)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxFailedWebhookEvent.Payload.Status.FAILED)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxFailedWebhookEvent.RecordType.EVENT)
                .build()

        assertThat(faxFailedWebhookEvent.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(faxFailedWebhookEvent.eventType())
            .contains(FaxFailedWebhookEvent.EventType.FAX_FAILED)
        assertThat(faxFailedWebhookEvent.payload())
            .contains(
                FaxFailedWebhookEvent.Payload.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("234423")
                    .direction(FaxFailedWebhookEvent.Payload.Direction.OUTBOUND)
                    .failureReason(FaxFailedWebhookEvent.Payload.FailureReason.REJECTED)
                    .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .from("+13125790015")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .originalMediaUrl(
                        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                    )
                    .status(FaxFailedWebhookEvent.Payload.Status.FAILED)
                    .to("+13127367276")
                    .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
        assertThat(faxFailedWebhookEvent.recordType())
            .contains(FaxFailedWebhookEvent.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxFailedWebhookEvent =
            FaxFailedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxFailedWebhookEvent.EventType.FAX_FAILED)
                .payload(
                    FaxFailedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxFailedWebhookEvent.Payload.Direction.OUTBOUND)
                        .failureReason(FaxFailedWebhookEvent.Payload.FailureReason.REJECTED)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxFailedWebhookEvent.Payload.Status.FAILED)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxFailedWebhookEvent.RecordType.EVENT)
                .build()

        val roundtrippedFaxFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxFailedWebhookEvent),
                jacksonTypeRef<FaxFailedWebhookEvent>(),
            )

        assertThat(roundtrippedFaxFailedWebhookEvent).isEqualTo(faxFailedWebhookEvent)
    }
}
