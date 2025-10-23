// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingAssociatedPhoneNumberTest {

    @Test
    fun create() {
        val portingAssociatedPhoneNumber =
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

        assertThat(portingAssociatedPhoneNumber.id())
            .contains("f24151b6-3389-41d3-8747-7dd8c681e5e2")
        assertThat(portingAssociatedPhoneNumber.action())
            .contains(PortingAssociatedPhoneNumber.Action.KEEP)
        assertThat(portingAssociatedPhoneNumber.countryCode()).contains("GB")
        assertThat(portingAssociatedPhoneNumber.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingAssociatedPhoneNumber.phoneNumberRange())
            .contains(
                PortingAssociatedPhoneNumber.PhoneNumberRange.builder()
                    .endAt("+441234567899")
                    .startAt("+441234567890")
                    .build()
            )
        assertThat(portingAssociatedPhoneNumber.phoneNumberType())
            .contains(PortingAssociatedPhoneNumber.PhoneNumberType.LOCAL)
        assertThat(portingAssociatedPhoneNumber.portingOrderId())
            .contains("a24151b6-3389-41d3-8747-7dd8c681e5e2")
        assertThat(portingAssociatedPhoneNumber.recordType())
            .contains("porting_associated_phone_number")
        assertThat(portingAssociatedPhoneNumber.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingAssociatedPhoneNumber =
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

        val roundtrippedPortingAssociatedPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingAssociatedPhoneNumber),
                jacksonTypeRef<PortingAssociatedPhoneNumber>(),
            )

        assertThat(roundtrippedPortingAssociatedPhoneNumber).isEqualTo(portingAssociatedPhoneNumber)
    }
}
