// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxDeliveredTest {

    @Test
    fun create() {
        val faxDelivered =
            FaxDelivered.builder()
                .data(
                    FaxDelivered.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxDelivered.Data.EventType.FAX_DELIVERED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxDelivered.Data.Payload.builder()
                                .callDurationSecs(25L)
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(FaxDelivered.Data.Payload.Direction.OUTBOUND)
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .pageCount(2L)
                                .status(FaxDelivered.Data.Payload.Status.DELIVERED)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxDelivered.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxDelivered.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        assertThat(faxDelivered.data())
            .contains(
                FaxDelivered.Data.builder()
                    .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                    .eventType(FaxDelivered.Data.EventType.FAX_DELIVERED)
                    .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                    .payload(
                        FaxDelivered.Data.Payload.builder()
                            .callDurationSecs(25L)
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("234423")
                            .direction(FaxDelivered.Data.Payload.Direction.OUTBOUND)
                            .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                            .from("+17733372107")
                            .mediaName("my_media_uploaded_to_media_storage_api")
                            .originalMediaUrl("http://www.example.com/fax.pdf")
                            .pageCount(2L)
                            .status(FaxDelivered.Data.Payload.Status.DELIVERED)
                            .to("+15107882622")
                            .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                            .build()
                    )
                    .recordType(FaxDelivered.Data.RecordType.EVENT)
                    .build()
            )
        assertThat(faxDelivered.meta())
            .contains(
                FaxDelivered.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://www.example.com/webhooks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxDelivered =
            FaxDelivered.builder()
                .data(
                    FaxDelivered.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxDelivered.Data.EventType.FAX_DELIVERED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxDelivered.Data.Payload.builder()
                                .callDurationSecs(25L)
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(FaxDelivered.Data.Payload.Direction.OUTBOUND)
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .pageCount(2L)
                                .status(FaxDelivered.Data.Payload.Status.DELIVERED)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxDelivered.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxDelivered.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        val roundtrippedFaxDelivered =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxDelivered),
                jacksonTypeRef<FaxDelivered>(),
            )

        assertThat(roundtrippedFaxDelivered).isEqualTo(faxDelivered)
    }
}
