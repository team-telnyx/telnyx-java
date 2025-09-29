// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallDialResponseTest {

    @Test
    fun create() {
        val callDialResponse =
            CallDialResponse.builder()
                .data(
                    CallDialResponse.Data.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .isAlive(false)
                        .recordType(CallDialResponse.Data.RecordType.CALL)
                        .callDuration(50L)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .endTime("2019-01-23T18:11:52.574Z")
                        .recordingId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .startTime("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        assertThat(callDialResponse.data())
            .contains(
                CallDialResponse.Data.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                    .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                    .isAlive(false)
                    .recordType(CallDialResponse.Data.RecordType.CALL)
                    .callDuration(50L)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .endTime("2019-01-23T18:11:52.574Z")
                    .recordingId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                    .startTime("2019-01-23T18:10:02.574Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callDialResponse =
            CallDialResponse.builder()
                .data(
                    CallDialResponse.Data.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .isAlive(false)
                        .recordType(CallDialResponse.Data.RecordType.CALL)
                        .callDuration(50L)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .endTime("2019-01-23T18:11:52.574Z")
                        .recordingId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .startTime("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        val roundtrippedCallDialResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callDialResponse),
                jacksonTypeRef<CallDialResponse>(),
            )

        assertThat(roundtrippedCallDialResponse).isEqualTo(callDialResponse)
    }
}
