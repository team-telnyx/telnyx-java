// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundThreadTest {

    @Test
    fun create() {
        val inboundThread =
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

        assertThat(inboundThread.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundThread.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundThread.inboxId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundThread.labels()).containsExactly("string")
        assertThat(inboundThread.lastMessageAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundThread.lastMessageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundThread.messageCount()).isEqualTo(1L)
        assertThat(inboundThread.preview()).contains("preview")
        assertThat(inboundThread.recordType()).isEqualTo(InboundThread.RecordType.EMAIL_THREAD)
        assertThat(inboundThread.subject()).contains("subject")
        assertThat(inboundThread.unreadCount()).isEqualTo(0L)
        assertThat(inboundThread.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundThread =
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

        val roundtrippedInboundThread =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundThread),
                jacksonTypeRef<InboundThread>(),
            )

        assertThat(roundtrippedInboundThread).isEqualTo(inboundThread)
    }
}
