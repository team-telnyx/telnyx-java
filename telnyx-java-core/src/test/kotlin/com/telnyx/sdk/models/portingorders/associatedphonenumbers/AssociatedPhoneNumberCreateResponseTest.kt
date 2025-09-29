// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedPhoneNumberCreateResponseTest {

    @Test
    fun create() {
        val associatedPhoneNumberCreateResponse =
            AssociatedPhoneNumberCreateResponse.builder()
                .data(
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
                .build()

        assertThat(associatedPhoneNumberCreateResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associatedPhoneNumberCreateResponse =
            AssociatedPhoneNumberCreateResponse.builder()
                .data(
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
                .build()

        val roundtrippedAssociatedPhoneNumberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associatedPhoneNumberCreateResponse),
                jacksonTypeRef<AssociatedPhoneNumberCreateResponse>(),
            )

        assertThat(roundtrippedAssociatedPhoneNumberCreateResponse)
            .isEqualTo(associatedPhoneNumberCreateResponse)
    }
}
