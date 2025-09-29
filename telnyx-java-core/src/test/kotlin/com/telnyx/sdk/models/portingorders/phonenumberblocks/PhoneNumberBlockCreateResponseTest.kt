// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBlockCreateResponseTest {

    @Test
    fun create() {
        val phoneNumberBlockCreateResponse =
            PhoneNumberBlockCreateResponse.builder()
                .data(
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
                .build()

        assertThat(phoneNumberBlockCreateResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberBlockCreateResponse =
            PhoneNumberBlockCreateResponse.builder()
                .data(
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
                .build()

        val roundtrippedPhoneNumberBlockCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberBlockCreateResponse),
                jacksonTypeRef<PhoneNumberBlockCreateResponse>(),
            )

        assertThat(roundtrippedPhoneNumberBlockCreateResponse)
            .isEqualTo(phoneNumberBlockCreateResponse)
    }
}
