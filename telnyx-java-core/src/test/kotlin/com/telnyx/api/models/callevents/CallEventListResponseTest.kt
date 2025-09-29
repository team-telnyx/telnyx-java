// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.callevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallEventListResponseTest {

    @Test
    fun create() {
        val callEventListResponse =
            CallEventListResponse.builder()
                .addData(
                    CallEventListResponse.Data.builder()
                        .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                        .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                        .eventTimestamp("2019-03-29T11:10:19.127783Z")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("call.hangup")
                        .recordType(CallEventListResponse.Data.RecordType.CALL_EVENT)
                        .type(CallEventListResponse.Data.Type.WEBHOOK)
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

        assertThat(callEventListResponse.data().getOrNull())
            .containsExactly(
                CallEventListResponse.Data.builder()
                    .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                    .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                    .eventTimestamp("2019-03-29T11:10:19.127783Z")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("call.hangup")
                    .recordType(CallEventListResponse.Data.RecordType.CALL_EVENT)
                    .type(CallEventListResponse.Data.Type.WEBHOOK)
                    .build()
            )
        assertThat(callEventListResponse.meta())
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
        val callEventListResponse =
            CallEventListResponse.builder()
                .addData(
                    CallEventListResponse.Data.builder()
                        .callLegId("308fe500-5213-11e9-ace7-02420a0f0668")
                        .callSessionId("308fec30-5213-11e9-9d3f-02420a0f0668")
                        .eventTimestamp("2019-03-29T11:10:19.127783Z")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("call.hangup")
                        .recordType(CallEventListResponse.Data.RecordType.CALL_EVENT)
                        .type(CallEventListResponse.Data.Type.WEBHOOK)
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

        val roundtrippedCallEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callEventListResponse),
                jacksonTypeRef<CallEventListResponse>(),
            )

        assertThat(roundtrippedCallEventListResponse).isEqualTo(callEventListResponse)
    }
}
