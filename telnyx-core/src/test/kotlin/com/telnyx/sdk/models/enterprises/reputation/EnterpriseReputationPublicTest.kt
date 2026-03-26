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
                .checkFrequency(EnterpriseReputationPublic.CheckFrequency.BUSINESS_DAILY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .loaDocumentId("loa_document_id")
                .addRejectionReason("string")
                .status(EnterpriseReputationPublic.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(enterpriseReputationPublic.checkFrequency())
            .contains(EnterpriseReputationPublic.CheckFrequency.BUSINESS_DAILY)
        assertThat(enterpriseReputationPublic.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(enterpriseReputationPublic.enterpriseId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(enterpriseReputationPublic.loaDocumentId()).contains("loa_document_id")
        assertThat(enterpriseReputationPublic.rejectionReasons().getOrNull())
            .containsExactly("string")
        assertThat(enterpriseReputationPublic.status())
            .contains(EnterpriseReputationPublic.Status.PENDING)
        assertThat(enterpriseReputationPublic.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseReputationPublic =
            EnterpriseReputationPublic.builder()
                .checkFrequency(EnterpriseReputationPublic.CheckFrequency.BUSINESS_DAILY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .loaDocumentId("loa_document_id")
                .addRejectionReason("string")
                .status(EnterpriseReputationPublic.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEnterpriseReputationPublic =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseReputationPublic),
                jacksonTypeRef<EnterpriseReputationPublic>(),
            )

        assertThat(roundtrippedEnterpriseReputationPublic).isEqualTo(enterpriseReputationPublic)
    }
}
