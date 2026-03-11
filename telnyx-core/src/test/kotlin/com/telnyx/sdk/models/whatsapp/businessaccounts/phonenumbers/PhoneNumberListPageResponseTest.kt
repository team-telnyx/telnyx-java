// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addData(
                    PhoneNumberListResponse.builder()
                        .callingEnabled(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .enabled(true)
                        .phoneNumber("phone_number")
                        .phoneNumberId("phone_number_id")
                        .qualityRating("quality_rating")
                        .recordType("whatsapp_business_phone_number")
                        .status("status")
                        .userId("user_id")
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

        assertThat(phoneNumberListPageResponse.data().getOrNull())
            .containsExactly(
                PhoneNumberListResponse.builder()
                    .callingEnabled(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .enabled(true)
                    .phoneNumber("phone_number")
                    .phoneNumberId("phone_number_id")
                    .qualityRating("quality_rating")
                    .recordType("whatsapp_business_phone_number")
                    .status("status")
                    .userId("user_id")
                    .wabaId("waba_id")
                    .build()
            )
        assertThat(phoneNumberListPageResponse.meta())
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
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addData(
                    PhoneNumberListResponse.builder()
                        .callingEnabled(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .enabled(true)
                        .phoneNumber("phone_number")
                        .phoneNumberId("phone_number_id")
                        .qualityRating("quality_rating")
                        .recordType("whatsapp_business_phone_number")
                        .status("status")
                        .userId("user_id")
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

        val roundtrippedPhoneNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberListPageResponse),
                jacksonTypeRef<PhoneNumberListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberListPageResponse).isEqualTo(phoneNumberListPageResponse)
    }
}
