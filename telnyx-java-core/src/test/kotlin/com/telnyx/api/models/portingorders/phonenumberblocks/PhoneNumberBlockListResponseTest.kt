// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBlockListResponseTest {

    @Test
    fun create() {
        val phoneNumberBlockListResponse =
            PhoneNumberBlockListResponse.builder()
                .addData(
                    PortingPhoneNumberBlock.builder()
                        .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .addActivationRange(
                            PortingPhoneNumberBlock.ActivationRange.builder()
                                .endAt("+4930244999910")
                                .startAt("+4930244999901")
                                .build()
                        )
                        .countryCode("DE")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .phoneNumberRange(
                            PortingPhoneNumberBlock.PhoneNumberRange.builder()
                                .endAt("+4930244999910")
                                .startAt("+4930244999901")
                                .build()
                        )
                        .phoneNumberType(PortingPhoneNumberBlock.PhoneNumberType.LOCAL)
                        .recordType("porting_phone_number_block")
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

        assertThat(phoneNumberBlockListResponse.data().getOrNull())
            .containsExactly(
                PortingPhoneNumberBlock.builder()
                    .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                    .addActivationRange(
                        PortingPhoneNumberBlock.ActivationRange.builder()
                            .endAt("+4930244999910")
                            .startAt("+4930244999901")
                            .build()
                    )
                    .countryCode("DE")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .phoneNumberRange(
                        PortingPhoneNumberBlock.PhoneNumberRange.builder()
                            .endAt("+4930244999910")
                            .startAt("+4930244999901")
                            .build()
                    )
                    .phoneNumberType(PortingPhoneNumberBlock.PhoneNumberType.LOCAL)
                    .recordType("porting_phone_number_block")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
        assertThat(phoneNumberBlockListResponse.meta())
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
        val phoneNumberBlockListResponse =
            PhoneNumberBlockListResponse.builder()
                .addData(
                    PortingPhoneNumberBlock.builder()
                        .id("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                        .addActivationRange(
                            PortingPhoneNumberBlock.ActivationRange.builder()
                                .endAt("+4930244999910")
                                .startAt("+4930244999901")
                                .build()
                        )
                        .countryCode("DE")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .phoneNumberRange(
                            PortingPhoneNumberBlock.PhoneNumberRange.builder()
                                .endAt("+4930244999910")
                                .startAt("+4930244999901")
                                .build()
                        )
                        .phoneNumberType(PortingPhoneNumberBlock.PhoneNumberType.LOCAL)
                        .recordType("porting_phone_number_block")
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

        val roundtrippedPhoneNumberBlockListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberBlockListResponse),
                jacksonTypeRef<PhoneNumberBlockListResponse>(),
            )

        assertThat(roundtrippedPhoneNumberBlockListResponse).isEqualTo(phoneNumberBlockListResponse)
    }
}
