// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberExtensionDeleteResponseTest {

    @Test
    fun create() {
        val phoneNumberExtensionDeleteResponse =
            PhoneNumberExtensionDeleteResponse.builder()
                .data(
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
                .build()

        assertThat(phoneNumberExtensionDeleteResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberExtensionDeleteResponse =
            PhoneNumberExtensionDeleteResponse.builder()
                .data(
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
                .build()

        val roundtrippedPhoneNumberExtensionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberExtensionDeleteResponse),
                jacksonTypeRef<PhoneNumberExtensionDeleteResponse>(),
            )

        assertThat(roundtrippedPhoneNumberExtensionDeleteResponse)
            .isEqualTo(phoneNumberExtensionDeleteResponse)
    }
}
