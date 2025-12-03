// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberExtensionListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberExtensionListPageResponse =
            PhoneNumberExtensionListPageResponse.builder()
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

        assertThat(phoneNumberExtensionListPageResponse.data().getOrNull())
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
        assertThat(phoneNumberExtensionListPageResponse.meta())
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
        val phoneNumberExtensionListPageResponse =
            PhoneNumberExtensionListPageResponse.builder()
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

        val roundtrippedPhoneNumberExtensionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberExtensionListPageResponse),
                jacksonTypeRef<PhoneNumberExtensionListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberExtensionListPageResponse)
            .isEqualTo(phoneNumberExtensionListPageResponse)
    }
}
