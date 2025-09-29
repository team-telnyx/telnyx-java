// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberExtensionListResponseTest {

    @Test
    fun create() {
        val phoneNumberExtensionListResponse =
            PhoneNumberExtensionListResponse.builder()
                .addData(
                    PortingPhoneNumberExtension.builder()
                        .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .addActivationRange(
                            PortingPhoneNumberExtension.ActivationRange.builder()
                                .endAt(10L)
                                .startAt(1L)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .extensionRange(
                            PortingPhoneNumberExtension.ExtensionRange.builder()
                                .endAt(10L)
                                .startAt(1L)
                                .build()
                        )
                        .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .recordType("porting_phone_number_extension")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
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

        assertThat(phoneNumberExtensionListResponse.data().getOrNull())
            .containsExactly(
                PortingPhoneNumberExtension.builder()
                    .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                    .addActivationRange(
                        PortingPhoneNumberExtension.ActivationRange.builder()
                            .endAt(10L)
                            .startAt(1L)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .extensionRange(
                        PortingPhoneNumberExtension.ExtensionRange.builder()
                            .endAt(10L)
                            .startAt(1L)
                            .build()
                    )
                    .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                    .recordType("porting_phone_number_extension")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
        assertThat(phoneNumberExtensionListResponse.meta())
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
        val phoneNumberExtensionListResponse =
            PhoneNumberExtensionListResponse.builder()
                .addData(
                    PortingPhoneNumberExtension.builder()
                        .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .addActivationRange(
                            PortingPhoneNumberExtension.ActivationRange.builder()
                                .endAt(10L)
                                .startAt(1L)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .extensionRange(
                            PortingPhoneNumberExtension.ExtensionRange.builder()
                                .endAt(10L)
                                .startAt(1L)
                                .build()
                        )
                        .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .recordType("porting_phone_number_extension")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
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

        val roundtrippedPhoneNumberExtensionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberExtensionListResponse),
                jacksonTypeRef<PhoneNumberExtensionListResponse>(),
            )

        assertThat(roundtrippedPhoneNumberExtensionListResponse)
            .isEqualTo(phoneNumberExtensionListResponse)
    }
}
