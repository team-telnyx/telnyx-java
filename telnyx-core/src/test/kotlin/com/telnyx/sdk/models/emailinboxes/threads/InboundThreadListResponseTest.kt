// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundThreadListResponseTest {

    @Test
    fun create() {
        val inboundThreadListResponse =
            InboundThreadListResponse.builder()
                .addData(
                    InboundThread.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .lastMessageAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .messageCount(1L)
                        .preview("preview")
                        .recordType(InboundThread.RecordType.EMAIL_THREAD)
                        .subject("subject")
                        .unreadCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        assertThat(inboundThreadListResponse.data())
            .containsExactly(
                InboundThread.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLabel("string")
                    .lastMessageAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageCount(1L)
                    .preview("preview")
                    .recordType(InboundThread.RecordType.EMAIL_THREAD)
                    .subject("subject")
                    .unreadCount(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(inboundThreadListResponse.meta())
            .isEqualTo(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundThreadListResponse =
            InboundThreadListResponse.builder()
                .addData(
                    InboundThread.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .lastMessageAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .messageCount(1L)
                        .preview("preview")
                        .recordType(InboundThread.RecordType.EMAIL_THREAD)
                        .subject("subject")
                        .unreadCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        val roundtrippedInboundThreadListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundThreadListResponse),
                jacksonTypeRef<InboundThreadListResponse>(),
            )

        assertThat(roundtrippedInboundThreadListResponse).isEqualTo(inboundThreadListResponse)
    }
}
