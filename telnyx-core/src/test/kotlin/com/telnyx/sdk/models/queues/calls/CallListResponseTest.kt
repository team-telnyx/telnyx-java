// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallListResponseTest {

    @Test
    fun create() {
        val callListResponse =
            CallListResponse.builder()
                .addData(
                    CallListResponse.Data.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .enqueuedAt("2019-01-23T18:10:02.574Z")
                        .from("+18005550101")
                        .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                        .queuePosition(3L)
                        .recordType(CallListResponse.Data.RecordType.QUEUE_CALL)
                        .to("+18005550102")
                        .waitTimeSecs(145L)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(callListResponse.data().getOrNull())
            .containsExactly(
                CallListResponse.Data.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                    .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .enqueuedAt("2019-01-23T18:10:02.574Z")
                    .from("+18005550101")
                    .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                    .queuePosition(3L)
                    .recordType(CallListResponse.Data.RecordType.QUEUE_CALL)
                    .to("+18005550102")
                    .waitTimeSecs(145L)
                    .build()
            )
        assertThat(callListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callListResponse =
            CallListResponse.builder()
                .addData(
                    CallListResponse.Data.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .enqueuedAt("2019-01-23T18:10:02.574Z")
                        .from("+18005550101")
                        .queueId("ae1626cc-6f42-11ea-becd-02420a0f8b69")
                        .queuePosition(3L)
                        .recordType(CallListResponse.Data.RecordType.QUEUE_CALL)
                        .to("+18005550102")
                        .waitTimeSecs(145L)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedCallListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callListResponse),
                jacksonTypeRef<CallListResponse>(),
            )

        assertThat(roundtrippedCallListResponse).isEqualTo(callListResponse)
    }
}
