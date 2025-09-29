// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxSendingStartedWebhookEventTest {

    @Test
    fun create() {
        val faxSendingStartedWebhookEvent =
            FaxSendingStartedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxSendingStartedWebhookEvent.EventType.FAX_SENDING_STARTED)
                .payload(
                    FaxSendingStartedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxSendingStartedWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxSendingStartedWebhookEvent.Payload.Status.SENDING)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxSendingStartedWebhookEvent.RecordType.EVENT)
                .build()

        assertThat(faxSendingStartedWebhookEvent.id())
            .contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(faxSendingStartedWebhookEvent.eventType())
            .contains(FaxSendingStartedWebhookEvent.EventType.FAX_SENDING_STARTED)
        assertThat(faxSendingStartedWebhookEvent.payload())
            .contains(
                FaxSendingStartedWebhookEvent.Payload.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("234423")
                    .direction(FaxSendingStartedWebhookEvent.Payload.Direction.OUTBOUND)
                    .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .from("+13125790015")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .originalMediaUrl(
                        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                    )
                    .status(FaxSendingStartedWebhookEvent.Payload.Status.SENDING)
                    .to("+13127367276")
                    .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
        assertThat(faxSendingStartedWebhookEvent.recordType())
            .contains(FaxSendingStartedWebhookEvent.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxSendingStartedWebhookEvent =
            FaxSendingStartedWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxSendingStartedWebhookEvent.EventType.FAX_SENDING_STARTED)
                .payload(
                    FaxSendingStartedWebhookEvent.Payload.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxSendingStartedWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .status(FaxSendingStartedWebhookEvent.Payload.Status.SENDING)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxSendingStartedWebhookEvent.RecordType.EVENT)
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
