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
                    EnterpriseReputationPublic.builder()
                        .checkFrequency(EnterpriseReputationPublic.CheckFrequency.BUSINESS_DAILY)
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                        .addRejectionReason("string")
                        .status(EnterpriseReputationPublic.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .build()
                )
                .build()

        assertThat(reputationRetrieveResponse.data())
            .isEqualTo(
                EnterpriseReputationPublic.builder()
                    .checkFrequency(EnterpriseReputationPublic.CheckFrequency.BUSINESS_DAILY)
                    .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                    .addRejectionReason("string")
                    .status(EnterpriseReputationPublic.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reputationRetrieveResponse =
            ReputationRetrieveResponse.builder()
                .data(
                    EnterpriseReputationPublic.builder()
                        .checkFrequency(EnterpriseReputationPublic.CheckFrequency.BUSINESS_DAILY)
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                        .addRejectionReason("string")
                        .status(EnterpriseReputationPublic.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
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
