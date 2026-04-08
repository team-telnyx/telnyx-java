// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationRetrieveResponseTest {

    @Test
    fun create() {
        val reputationRetrieveResponse =
            ReputationRetrieveResponse.builder()
                .data(
                    ReputationRetrieveResponse.Data.builder()
                        .checkFrequency(
                            ReputationRetrieveResponse.Data.CheckFrequency.BUSINESS_DAILY
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .loaDocumentId("loa_document_id")
                        .addRejectionReason("string")
                        .status(ReputationRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(reputationRetrieveResponse.data())
            .contains(
                ReputationRetrieveResponse.Data.builder()
                    .checkFrequency(ReputationRetrieveResponse.Data.CheckFrequency.BUSINESS_DAILY)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .loaDocumentId("loa_document_id")
                    .addRejectionReason("string")
                    .status(ReputationRetrieveResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reputationRetrieveResponse =
            ReputationRetrieveResponse.builder()
                .data(
                    ReputationRetrieveResponse.Data.builder()
                        .checkFrequency(
                            ReputationRetrieveResponse.Data.CheckFrequency.BUSINESS_DAILY
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .loaDocumentId("loa_document_id")
                        .addRejectionReason("string")
                        .status(ReputationRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedReputationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reputationRetrieveResponse),
                jacksonTypeRef<ReputationRetrieveResponse>(),
            )

        assertThat(roundtrippedReputationRetrieveResponse).isEqualTo(reputationRetrieveResponse)
    }
}
