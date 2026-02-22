// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestRetrieveStatusHistoryResponseTest {

    @Test
    fun create() {
        val requestRetrieveStatusHistoryResponse =
            RequestRetrieveStatusHistoryResponse.builder()
                .addRecord(
                    RequestRetrieveStatusHistoryResponse.Record.builder()
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .verificationStatus(TfVerificationStatus.VERIFIED)
                        .reason(
                            "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                        )
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(requestRetrieveStatusHistoryResponse.records())
            .containsExactly(
                RequestRetrieveStatusHistoryResponse.Record.builder()
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .verificationStatus(TfVerificationStatus.VERIFIED)
                    .reason(
                        "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                    )
                    .build()
            )
        assertThat(requestRetrieveStatusHistoryResponse.totalRecords()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestRetrieveStatusHistoryResponse =
            RequestRetrieveStatusHistoryResponse.builder()
                .addRecord(
                    RequestRetrieveStatusHistoryResponse.Record.builder()
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .verificationStatus(TfVerificationStatus.VERIFIED)
                        .reason(
                            "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                        )
                        .build()
                )
                .totalRecords(0L)
                .build()

        val roundtrippedRequestRetrieveStatusHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestRetrieveStatusHistoryResponse),
                jacksonTypeRef<RequestRetrieveStatusHistoryResponse>(),
            )

        assertThat(roundtrippedRequestRetrieveStatusHistoryResponse)
            .isEqualTo(requestRetrieveStatusHistoryResponse)
    }
}
