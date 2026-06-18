// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessAccountRetrieveResponseTest {

    @Test
    fun create() {
        val businessAccountRetrieveResponse =
            BusinessAccountRetrieveResponse.builder()
                .data(
                    BusinessAccountRetrieveResponse.Data.builder()
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
                )
                .build()

        assertThat(businessAccountRetrieveResponse.data())
            .contains(
                BusinessAccountRetrieveResponse.Data.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessAccountRetrieveResponse =
            BusinessAccountRetrieveResponse.builder()
                .data(
                    BusinessAccountRetrieveResponse.Data.builder()
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
                )
                .build()

        val roundtrippedBusinessAccountRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessAccountRetrieveResponse),
                jacksonTypeRef<BusinessAccountRetrieveResponse>(),
            )

        assertThat(roundtrippedBusinessAccountRetrieveResponse)
            .isEqualTo(businessAccountRetrieveResponse)
    }
}
