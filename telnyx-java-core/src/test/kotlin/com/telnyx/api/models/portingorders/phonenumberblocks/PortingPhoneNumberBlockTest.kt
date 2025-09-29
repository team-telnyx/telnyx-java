// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberBlockTest {

    @Test
    fun create() {
        val portingPhoneNumberBlock =
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

        assertThat(portingPhoneNumberBlock.id()).contains("f24151b6-3389-41d3-8747-7dd8c681e5e2")
        assertThat(portingPhoneNumberBlock.activationRanges().getOrNull())
            .containsExactly(
                PortingPhoneNumberBlock.ActivationRange.builder()
                    .endAt("+4930244999910")
                    .startAt("+4930244999901")
                    .build()
            )
        assertThat(portingPhoneNumberBlock.countryCode()).contains("DE")
        assertThat(portingPhoneNumberBlock.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingPhoneNumberBlock.phoneNumberRange())
            .contains(
                PortingPhoneNumberBlock.PhoneNumberRange.builder()
                    .endAt("+4930244999910")
                    .startAt("+4930244999901")
                    .build()
            )
        assertThat(portingPhoneNumberBlock.phoneNumberType())
            .contains(PortingPhoneNumberBlock.PhoneNumberType.LOCAL)
        assertThat(portingPhoneNumberBlock.recordType()).contains("porting_phone_number_block")
        assertThat(portingPhoneNumberBlock.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingPhoneNumberBlock =
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

        val roundtrippedPortingPhoneNumberBlock =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumberBlock),
                jacksonTypeRef<PortingPhoneNumberBlock>(),
            )

        assertThat(roundtrippedPortingPhoneNumberBlock).isEqualTo(portingPhoneNumberBlock)
    }
}
