// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxDeliveredWebhookEventTest {

    @Test
    fun create() {
        val faxDeliveredWebhookEvent =
            FaxDeliveredWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxDeliveredWebhookEvent.EventType.FAX_DELIVERED)
                .payload(
                    FaxDeliveredWebhookEvent.Payload.builder()
                        .callDurationSecs(25L)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxDeliveredWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .pageCount(2L)
                        .status(FaxDeliveredWebhookEvent.Payload.Status.DELIVERED)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxDeliveredWebhookEvent.RecordType.EVENT)
                .build()

        assertThat(faxDeliveredWebhookEvent.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(faxDeliveredWebhookEvent.eventType())
            .contains(FaxDeliveredWebhookEvent.EventType.FAX_DELIVERED)
        assertThat(faxDeliveredWebhookEvent.payload())
            .contains(
                FaxDeliveredWebhookEvent.Payload.builder()
                    .callDurationSecs(25L)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("234423")
                    .direction(FaxDeliveredWebhookEvent.Payload.Direction.OUTBOUND)
                    .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .from("+13125790015")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .originalMediaUrl(
                        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                    )
                    .pageCount(2L)
                    .status(FaxDeliveredWebhookEvent.Payload.Status.DELIVERED)
                    .to("+13127367276")
                    .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
        assertThat(faxDeliveredWebhookEvent.recordType())
            .contains(FaxDeliveredWebhookEvent.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxDeliveredWebhookEvent =
            FaxDeliveredWebhookEvent.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(FaxDeliveredWebhookEvent.EventType.FAX_DELIVERED)
                .payload(
                    FaxDeliveredWebhookEvent.Payload.builder()
                        .callDurationSecs(25L)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("234423")
                        .direction(FaxDeliveredWebhookEvent.Payload.Direction.OUTBOUND)
                        .faxId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .from("+13125790015")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .originalMediaUrl(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .pageCount(2L)
                        .status(FaxDeliveredWebhookEvent.Payload.Status.DELIVERED)
                        .to("+13127367276")
                        .userId("yfff7c54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .recordType(FaxDeliveredWebhookEvent.RecordType.EVENT)
                .build()

        val roundtrippedFaxDeliveredWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxDeliveredWebhookEvent),
                jacksonTypeRef<FaxDeliveredWebhookEvent>(),
            )

        assertThat(roundtrippedFaxDeliveredWebhookEvent).isEqualTo(faxDeliveredWebhookEvent)
    }
}
