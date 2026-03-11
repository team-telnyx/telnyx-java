// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessAccountListResponseTest {

    @Test
    fun create() {
        val businessAccountListResponse =
            BusinessAccountListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountReviewStatus("account_review_status")
                .businessVerificationStatus("business_verification_status")
                .country("country")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .phoneNumbersCount(0L)
                .recordType("whatsapp_business_account")
                .status("status")
                .wabaId("waba_id")
                .build()

        assertThat(businessAccountListResponse.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(businessAccountListResponse.accountReviewStatus())
            .contains("account_review_status")
        assertThat(businessAccountListResponse.businessVerificationStatus())
            .contains("business_verification_status")
        assertThat(businessAccountListResponse.country()).contains("country")
        assertThat(businessAccountListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(businessAccountListResponse.name()).contains("name")
        assertThat(businessAccountListResponse.phoneNumbersCount()).contains(0L)
        assertThat(businessAccountListResponse.recordType()).contains("whatsapp_business_account")
        assertThat(businessAccountListResponse.status()).contains("status")
        assertThat(businessAccountListResponse.wabaId()).contains("waba_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessAccountListResponse =
            BusinessAccountListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountReviewStatus("account_review_status")
                .businessVerificationStatus("business_verification_status")
                .country("country")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .phoneNumbersCount(0L)
                .recordType("whatsapp_business_account")
                .status("status")
                .wabaId("waba_id")
                .build()

        val roundtrippedBusinessAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessAccountListResponse),
                jacksonTypeRef<BusinessAccountListResponse>(),
            )

        assertThat(roundtrippedBusinessAccountListResponse).isEqualTo(businessAccountListResponse)
    }
}
