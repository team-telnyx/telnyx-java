// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallEventListResponseTest {

    @Test
    fun create() {
        val callEventListResponse =
            CallEventListResponse.builder()
                .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                .eventTimestamp("2019-03-29T11:10:19.127783Z")
                .metadata(CallEventListResponse.Metadata.builder().build())
                .name("call.hangup")
                .recordType(CallEventListResponse.RecordType.CALL_EVENT)
                .type(CallEventListResponse.Type.WEBHOOK)
                .build()

        assertThat(callEventListResponse.callLegId())
            .isEqualTo("308fe500-5213-11e9-ace7-02420a0f0668")
        assertThat(callEventListResponse.callSessionId())
            .isEqualTo("308fec30-5213-11e9-9d3f-02420a0f0668")
        assertThat(callEventListResponse.eventTimestamp()).isEqualTo("2019-03-29T11:10:19.127783Z")
        assertThat(callEventListResponse.metadata())
            .isEqualTo(CallEventListResponse.Metadata.builder().build())
        assertThat(callEventListResponse.name()).isEqualTo("call.hangup")
        assertThat(callEventListResponse.recordType())
            .isEqualTo(CallEventListResponse.RecordType.CALL_EVENT)
        assertThat(callEventListResponse.type()).isEqualTo(CallEventListResponse.Type.WEBHOOK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callEventListResponse =
            CallEventListResponse.builder()
                .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                .eventTimestamp("2019-03-29T11:10:19.127783Z")
                .metadata(CallEventListResponse.Metadata.builder().build())
                .name("call.hangup")
                .recordType(CallEventListResponse.RecordType.CALL_EVENT)
                .type(CallEventListResponse.Type.WEBHOOK)
                .build()

        val roundtrippedCallEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callEventListResponse),
                jacksonTypeRef<CallEventListResponse>(),
            )

        assertThat(roundtrippedCallEventListResponse).isEqualTo(callEventListResponse)
    }
}
