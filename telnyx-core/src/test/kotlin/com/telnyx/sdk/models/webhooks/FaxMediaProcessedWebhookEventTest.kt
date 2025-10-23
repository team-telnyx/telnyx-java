// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxMediaProcessedWebhookEventTest {

    @Test
    fun create() {
        val faxMediaProcessedWebhookEvent =
            FaxMediaProcessedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxMediaProcessedWebhookEvent.EventType.FAX_MEDIA_PROCESSED)
                .payload(
                    FaxMediaProcessedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxMediaProcessedWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxMediaProcessedWebhookEvent.Payload.Status.MEDIA_PROCESSED)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxMediaProcessedWebhookEvent.RecordType.EVENT)
                .build()

        assertThat(faxMediaProcessedWebhookEvent.id())
            .contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(faxMediaProcessedWebhookEvent.eventType())
            .contains(FaxMediaProcessedWebhookEvent.EventType.FAX_MEDIA_PROCESSED)
        assertThat(faxMediaProcessedWebhookEvent.payload())
            .contains(
                FaxMediaProcessedWebhookEvent.Payload.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("234423")
                    .direction(FaxMediaProcessedWebhookEvent.Payload.Direction.OUTBOUND)
                    .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .from("+13125790015")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .originalMediaUrl(
                        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                    )
                    .status(FaxMediaProcessedWebhookEvent.Payload.Status.MEDIA_PROCESSED)
                    .to("+13127367276")
                    .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
        assertThat(faxMediaProcessedWebhookEvent.recordType())
            .contains(FaxMediaProcessedWebhookEvent.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxMediaProcessedWebhookEvent =
            FaxMediaProcessedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxMediaProcessedWebhookEvent.EventType.FAX_MEDIA_PROCESSED)
                .payload(
                    FaxMediaProcessedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxMediaProcessedWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxMediaProcessedWebhookEvent.Payload.Status.MEDIA_PROCESSED)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxMediaProcessedWebhookEvent.RecordType.EVENT)
                .build()

        val roundtrippedFaxMediaProcessedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxMediaProcessedWebhookEvent),
                jacksonTypeRef<FaxMediaProcessedWebhookEvent>(),
            )

        assertThat(roundtrippedFaxMediaProcessedWebhookEvent)
            .isEqualTo(faxMediaProcessedWebhookEvent)
    }
}
