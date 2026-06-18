// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallEventListPageResponseTest {

    @Test
    fun create() {
        val callEventListPageResponse =
            CallEventListPageResponse.builder()
                .addData(
                    CallEventListResponse.builder()
                        .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                        .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                        .eventTimestamp("2019-03-29T11:10:19.127783Z")
                        .metadata(CallEventListResponse.Metadata.builder().build())
                        .name("call.hangup")
                        .recordType(CallEventListResponse.RecordType.CALL_EVENT)
                        .type(CallEventListResponse.Type.WEBHOOK)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(callEventListPageResponse.data().getOrNull())
            .containsExactly(
                CallEventListResponse.builder()
                    .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                    .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                    .eventTimestamp("2019-03-29T11:10:19.127783Z")
                    .metadata(CallEventListResponse.Metadata.builder().build())
                    .name("call.hangup")
                    .recordType(CallEventListResponse.RecordType.CALL_EVENT)
                    .type(CallEventListResponse.Type.WEBHOOK)
                    .build()
            )
        assertThat(callEventListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callEventListPageResponse =
            CallEventListPageResponse.builder()
                .addData(
                    CallEventListResponse.builder()
                        .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                        .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                        .eventTimestamp("2019-03-29T11:10:19.127783Z")
                        .metadata(CallEventListResponse.Metadata.builder().build())
                        .name("call.hangup")
                        .recordType(CallEventListResponse.RecordType.CALL_EVENT)
                        .type(CallEventListResponse.Type.WEBHOOK)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedCallEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callEventListPageResponse),
                jacksonTypeRef<CallEventListPageResponse>(),
            )

        assertThat(roundtrippedCallEventListPageResponse).isEqualTo(callEventListPageResponse)
    }
}
