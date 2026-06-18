// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBlockListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberBlockListPageResponse =
            PhoneNumberBlockListPageResponse.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(phoneNumberBlockListPageResponse.data().getOrNull())
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
        assertThat(phoneNumberBlockListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberBlockListPageResponse =
            PhoneNumberBlockListPageResponse.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberBlockListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberBlockListPageResponse),
                jacksonTypeRef<PhoneNumberBlockListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberBlockListPageResponse)
            .isEqualTo(phoneNumberBlockListPageResponse)
    }
}
