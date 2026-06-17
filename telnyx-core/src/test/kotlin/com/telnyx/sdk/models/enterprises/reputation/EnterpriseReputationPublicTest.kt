// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseReputationPublicTest {

    @Test
    fun create() {
        val enterpriseReputationPublic =
            EnterpriseReputationPublic.builder()
                .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                .addRejectionReason("string")
                .status(EnterpriseReputationPublic.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .build()

        assertThat(enterpriseReputationPublic.checkFrequency())
            .contains(ReputationCheckFrequency.BUSINESS_DAILY)
        assertThat(enterpriseReputationPublic.createdAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
        assertThat(enterpriseReputationPublic.enterpriseId())
            .contains("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(enterpriseReputationPublic.loaDocumentId())
            .contains("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
        assertThat(enterpriseReputationPublic.loaStatus())
            .contains(EnterpriseReputationPublic.LoaStatus.PENDING)
        assertThat(enterpriseReputationPublic.rejectionReasons().getOrNull())
            .containsExactly("string")
        assertThat(enterpriseReputationPublic.status())
            .contains(EnterpriseReputationPublic.Status.PENDING)
        assertThat(enterpriseReputationPublic.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseReputationPublic =
            EnterpriseReputationPublic.builder()
                .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .loaStatus(EnterpriseReputationPublic.LoaStatus.PENDING)
                .addRejectionReason("string")
                .status(EnterpriseReputationPublic.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .build()

        val roundtrippedEnterpriseReputationPublic =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseReputationPublic),
                jacksonTypeRef<EnterpriseReputationPublic>(),
            )

        assertThat(roundtrippedEnterpriseReputationPublic).isEqualTo(enterpriseReputationPublic)
    }
}
