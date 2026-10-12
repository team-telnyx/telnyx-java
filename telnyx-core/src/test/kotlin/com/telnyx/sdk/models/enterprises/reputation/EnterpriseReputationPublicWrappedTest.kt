// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseReputationPublicWrappedTest {

    @Test
    fun create() {
        val enterpriseReputationPublicWrapped =
            EnterpriseReputationPublicWrapped.builder()
                .data(
                    EnterpriseReputationPublic.builder()
                        .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .externalVerificationStatus(ExternalVerificationStatus.PENDING)
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                        .addRejectionReason("string")
                        .status(EnterpriseReputationPublic.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .webhookUrl("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        assertThat(enterpriseReputationPublicWrapped.data())
            .isEqualTo(
                EnterpriseReputationPublic.builder()
                    .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                    .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .externalVerificationStatus(ExternalVerificationStatus.PENDING)
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                    .addRejectionReason("string")
                    .status(EnterpriseReputationPublic.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                    .webhookUrl("https://example.com/webhooks/telnyx")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseReputationPublicWrapped =
            EnterpriseReputationPublicWrapped.builder()
                .data(
                    EnterpriseReputationPublic.builder()
                        .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .externalVerificationStatus(ExternalVerificationStatus.PENDING)
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                        .addRejectionReason("string")
                        .status(EnterpriseReputationPublic.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                        .webhookUrl("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        val roundtrippedEnterpriseReputationPublicWrapped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseReputationPublicWrapped),
                jacksonTypeRef<EnterpriseReputationPublicWrapped>(),
            )

        assertThat(roundtrippedEnterpriseReputationPublicWrapped)
            .isEqualTo(enterpriseReputationPublicWrapped)
    }
}
