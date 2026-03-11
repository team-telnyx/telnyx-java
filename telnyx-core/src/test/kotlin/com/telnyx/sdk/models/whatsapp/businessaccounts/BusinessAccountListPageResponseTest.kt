// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessAccountListPageResponseTest {

    @Test
    fun create() {
        val businessAccountListPageResponse =
            BusinessAccountListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(businessAccountListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(businessAccountListPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
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
        val businessAccountListPageResponse =
            BusinessAccountListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedBusinessAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessAccountListPageResponse),
                jacksonTypeRef<BusinessAccountListPageResponse>(),
            )

        assertThat(roundtrippedBusinessAccountListPageResponse)
            .isEqualTo(businessAccountListPageResponse)
    }
}
