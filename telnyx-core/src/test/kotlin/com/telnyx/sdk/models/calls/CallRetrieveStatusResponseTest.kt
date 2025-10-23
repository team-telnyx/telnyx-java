// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveStatusResponseTest {

    @Test
    fun create() {
        val callRetrieveStatusResponse =
            CallRetrieveStatusResponse.builder()
                .data(
                    CallRetrieveStatusResponse.Data.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .isAlive(false)
                        .recordType(CallRetrieveStatusResponse.Data.RecordType.CALL)
                        .callDuration(50L)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .endTime("2019-01-23T18:11:52.574Z")
                        .startTime("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        assertThat(callRetrieveStatusResponse.data())
            .contains(
                CallRetrieveStatusResponse.Data.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                    .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                    .isAlive(false)
                    .recordType(CallRetrieveStatusResponse.Data.RecordType.CALL)
                    .callDuration(50L)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .endTime("2019-01-23T18:11:52.574Z")
                    .startTime("2019-01-23T18:10:02.574Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRetrieveStatusResponse =
            CallRetrieveStatusResponse.builder()
                .data(
                    CallRetrieveStatusResponse.Data.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .isAlive(false)
                        .recordType(CallRetrieveStatusResponse.Data.RecordType.CALL)
                        .callDuration(50L)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .endTime("2019-01-23T18:11:52.574Z")
                        .startTime("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        val roundtrippedCallRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRetrieveStatusResponse),
                jacksonTypeRef<CallRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedCallRetrieveStatusResponse).isEqualTo(callRetrieveStatusResponse)
    }
}
