// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListActiveCallsResponseTest {

    @Test
    fun create() {
        val connectionListActiveCallsResponse =
            ConnectionListActiveCallsResponse.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .callDuration(50L)
                .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .recordType(ConnectionListActiveCallsResponse.RecordType.CALL)
                .build()

        assertThat(connectionListActiveCallsResponse.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(connectionListActiveCallsResponse.callDuration()).isEqualTo(50L)
        assertThat(connectionListActiveCallsResponse.callLegId())
            .isEqualTo("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
        assertThat(connectionListActiveCallsResponse.callSessionId())
            .isEqualTo("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
        assertThat(connectionListActiveCallsResponse.clientState())
            .isEqualTo("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(connectionListActiveCallsResponse.recordType())
            .isEqualTo(ConnectionListActiveCallsResponse.RecordType.CALL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListActiveCallsResponse =
            ConnectionListActiveCallsResponse.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .callDuration(50L)
                .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .recordType(ConnectionListActiveCallsResponse.RecordType.CALL)
                .build()

        val roundtrippedConnectionListActiveCallsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListActiveCallsResponse),
                jacksonTypeRef<ConnectionListActiveCallsResponse>(),
            )

        assertThat(roundtrippedConnectionListActiveCallsResponse)
            .isEqualTo(connectionListActiveCallsResponse)
    }
}
