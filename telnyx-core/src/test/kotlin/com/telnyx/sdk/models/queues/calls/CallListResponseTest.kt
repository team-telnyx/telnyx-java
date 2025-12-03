// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallListResponseTest {

    @Test
    fun create() {
        val callListResponse =
            CallListResponse.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                .connectionId("7267xxxxxxxxxxxxxx")
                .enqueuedAt("2019-01-23T18:10:02.574Z")
                .from("+18005550101")
                .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                .queuePosition(3L)
                .recordType(CallListResponse.RecordType.QUEUE_CALL)
                .to("+18005550102")
                .waitTimeSecs(145L)
                .build()

        assertThat(callListResponse.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(callListResponse.callLegId()).isEqualTo("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
        assertThat(callListResponse.callSessionId())
            .isEqualTo("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
        assertThat(callListResponse.connectionId()).isEqualTo("7267xxxxxxxxxxxxxx")
        assertThat(callListResponse.enqueuedAt()).isEqualTo("2019-01-23T18:10:02.574Z")
        assertThat(callListResponse.from()).isEqualTo("+18005550101")
        assertThat(callListResponse.queueId()).isEqualTo("ae1626cc-6f42-11ea-becd-02420a0f8b69")
        assertThat(callListResponse.queuePosition()).isEqualTo(3L)
        assertThat(callListResponse.recordType()).isEqualTo(CallListResponse.RecordType.QUEUE_CALL)
        assertThat(callListResponse.to()).isEqualTo("+18005550102")
        assertThat(callListResponse.waitTimeSecs()).isEqualTo(145L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callListResponse =
            CallListResponse.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                .connectionId("7267xxxxxxxxxxxxxx")
                .enqueuedAt("2019-01-23T18:10:02.574Z")
                .from("+18005550101")
                .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                .queuePosition(3L)
                .recordType(CallListResponse.RecordType.QUEUE_CALL)
                .to("+18005550102")
                .waitTimeSecs(145L)
                .build()

        val roundtrippedCallListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callListResponse),
                jacksonTypeRef<CallListResponse>(),
            )

        assertThat(roundtrippedCallListResponse).isEqualTo(callListResponse)
    }
}
