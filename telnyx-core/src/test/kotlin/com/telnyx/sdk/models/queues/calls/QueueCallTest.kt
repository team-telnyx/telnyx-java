// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueCallTest {

    @Test
    fun create() {
        val queueCall =
            QueueCall.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                .connectionId("7267xxxxxxxxxxxxxx")
                .enqueuedAt("2019-01-23T18:10:02.574Z")
                .from("+18005550101")
                .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                .queuePosition(3L)
                .recordType(QueueCall.RecordType.QUEUE_CALL)
                .to("+18005550102")
                .waitTimeSecs(145L)
                .isAlive(true)
                .build()

        assertThat(queueCall.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(queueCall.callLegId()).isEqualTo("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
        assertThat(queueCall.callSessionId()).isEqualTo("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
        assertThat(queueCall.connectionId()).isEqualTo("7267xxxxxxxxxxxxxx")
        assertThat(queueCall.enqueuedAt()).isEqualTo("2019-01-23T18:10:02.574Z")
        assertThat(queueCall.from()).isEqualTo("+18005550101")
        assertThat(queueCall.queueId()).isEqualTo("ae1626cc-6f42-11ea-becd-02420a0f8b69")
        assertThat(queueCall.queuePosition()).isEqualTo(3L)
        assertThat(queueCall.recordType()).isEqualTo(QueueCall.RecordType.QUEUE_CALL)
        assertThat(queueCall.to()).isEqualTo("+18005550102")
        assertThat(queueCall.waitTimeSecs()).isEqualTo(145L)
        assertThat(queueCall.isAlive()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueCall =
            QueueCall.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                .connectionId("7267xxxxxxxxxxxxxx")
                .enqueuedAt("2019-01-23T18:10:02.574Z")
                .from("+18005550101")
                .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                .queuePosition(3L)
                .recordType(QueueCall.RecordType.QUEUE_CALL)
                .to("+18005550102")
                .waitTimeSecs(145L)
                .isAlive(true)
                .build()

        val roundtrippedQueueCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueCall),
                jacksonTypeRef<QueueCall>(),
            )

        assertThat(roundtrippedQueueCall).isEqualTo(queueCall)
    }
}
