// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxSendingStartedTest {

    @Test
    fun create() {
        val faxSendingStarted =
            FaxSendingStarted.builder()
                .data(
                    FaxSendingStarted.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxSendingStarted.Data.EventType.FAX_SENDING_STARTED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxSendingStarted.Data.Payload.builder()
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(FaxSendingStarted.Data.Payload.Direction.OUTBOUND)
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .status(FaxSendingStarted.Data.Payload.Status.SENDING)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxSendingStarted.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxSendingStarted.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        assertThat(faxSendingStarted.data())
            .contains(
                FaxSendingStarted.Data.builder()
                    .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                    .eventType(FaxSendingStarted.Data.EventType.FAX_SENDING_STARTED)
                    .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                    .payload(
                        FaxSendingStarted.Data.Payload.builder()
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("234423")
                            .direction(FaxSendingStarted.Data.Payload.Direction.OUTBOUND)
                            .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                            .from("+17733372107")
                            .mediaName("my_media_uploaded_to_media_storage_api")
                            .originalMediaUrl("http://www.example.com/fax.pdf")
                            .status(FaxSendingStarted.Data.Payload.Status.SENDING)
                            .to("+15107882622")
                            .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                            .build()
                    )
                    .recordType(FaxSendingStarted.Data.RecordType.EVENT)
                    .build()
            )
        assertThat(faxSendingStarted.meta())
            .contains(
                FaxSendingStarted.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://www.example.com/webhooks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxSendingStarted =
            FaxSendingStarted.builder()
                .data(
                    FaxSendingStarted.Data.builder()
                        .id("95479a2e-b947-470a-a88f-2da6dd07ae0f")
                        .eventType(FaxSendingStarted.Data.EventType.FAX_SENDING_STARTED)
                        .occurredAt(OffsetDateTime.parse("2020-05-05T13:08:22.039204Z"))
                        .payload(
                            FaxSendingStarted.Data.Payload.builder()
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("234423")
                                .direction(FaxSendingStarted.Data.Payload.Direction.OUTBOUND)
                                .faxId("f8338808-3dc6-4f2b-942a-5d1f39255784")
                                .from("+17733372107")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .originalMediaUrl("http://www.example.com/fax.pdf")
                                .status(FaxSendingStarted.Data.Payload.Status.SENDING)
                                .to("+15107882622")
                                .userId("19a75cea-02c6-4b9a-84fa-c9bc8341feb8")
                                .build()
                        )
                        .recordType(FaxSendingStarted.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    FaxSendingStarted.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://www.example.com/webhooks")
                        .build()
                )
                .build()

        val roundtrippedFaxSendingStarted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxSendingStarted),
                jacksonTypeRef<FaxSendingStarted>(),
            )

        assertThat(roundtrippedFaxSendingStarted).isEqualTo(faxSendingStarted)
    }
}
