// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedPhoneNumberListResponseTest {

    @Test
    fun create() {
        val associatedPhoneNumberListResponse =
            AssociatedPhoneNumberListResponse.builder()
                .addData(
                    PortingAssociatedPhoneNumber.builder()
                        .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .action(PortingAssociatedPhoneNumber.Action.KEEP)
                        .countryCode("GB")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .phoneNumberRange(
                            PortingAssociatedPhoneNumber.PhoneNumberRange.builder()
                                .endAt("+441234567899")
                                .startAt("+441234567890")
                                .build()
                        )
                        .phoneNumberType(PortingAssociatedPhoneNumber.PhoneNumberType.LOCAL)
                        .portingOrderId("a24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .recordType("porting_associated_phone_number")
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

        assertThat(associatedPhoneNumberListResponse.data().getOrNull())
            .containsExactly(
                PortingAssociatedPhoneNumber.builder()
                    .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                    .action(PortingAssociatedPhoneNumber.Action.KEEP)
                    .countryCode("GB")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .phoneNumberRange(
                        PortingAssociatedPhoneNumber.PhoneNumberRange.builder()
                            .endAt("+441234567899")
                            .startAt("+441234567890")
                            .build()
                    )
                    .phoneNumberType(PortingAssociatedPhoneNumber.PhoneNumberType.LOCAL)
                    .portingOrderId("a24151b6-3389-41d3-8747-7dd8c681e5e2")
                    .recordType("porting_associated_phone_number")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
        assertThat(associatedPhoneNumberListResponse.meta())
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
        val associatedPhoneNumberListResponse =
            AssociatedPhoneNumberListResponse.builder()
                .addData(
                    PortingAssociatedPhoneNumber.builder()
                        .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .action(PortingAssociatedPhoneNumber.Action.KEEP)
                        .countryCode("GB")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .phoneNumberRange(
                            PortingAssociatedPhoneNumber.PhoneNumberRange.builder()
                                .endAt("+441234567899")
                                .startAt("+441234567890")
                                .build()
                        )
                        .phoneNumberType(PortingAssociatedPhoneNumber.PhoneNumberType.LOCAL)
                        .portingOrderId("a24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .recordType("porting_associated_phone_number")
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

        val roundtrippedAssociatedPhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associatedPhoneNumberListResponse),
                jacksonTypeRef<AssociatedPhoneNumberListResponse>(),
            )

        assertThat(roundtrippedAssociatedPhoneNumberListResponse)
            .isEqualTo(associatedPhoneNumberListResponse)
    }
}
