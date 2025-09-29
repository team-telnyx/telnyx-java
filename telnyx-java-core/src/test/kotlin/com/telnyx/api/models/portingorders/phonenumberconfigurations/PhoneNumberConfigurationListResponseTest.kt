// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberconfigurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberConfigurationListResponseTest {

    @Test
    fun create() {
        val phoneNumberConfigurationListResponse =
            PhoneNumberConfigurationListResponse.builder()
                .addData(
                    PhoneNumberConfigurationListResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_phone_number_configuration")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(phoneNumberConfigurationListResponse.data().getOrNull())
            .containsExactly(
                PhoneNumberConfigurationListResponse.Data.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                    .recordType("porting_phone_number_configuration")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                    .build()
            )
        assertThat(phoneNumberConfigurationListResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val phoneNumberConfigurationListResponse =
            PhoneNumberConfigurationListResponse.builder()
                .addData(
                    PhoneNumberConfigurationListResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_phone_number_configuration")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberConfigurationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberConfigurationListResponse),
                jacksonTypeRef<PhoneNumberConfigurationListResponse>(),
            )

        assertThat(roundtrippedPhoneNumberConfigurationListResponse)
            .isEqualTo(phoneNumberConfigurationListResponse)
    }
}
