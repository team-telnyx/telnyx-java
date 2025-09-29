// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberextensions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberExtensionTest {

    @Test
    fun create() {
        val portingPhoneNumberExtension =
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

        assertThat(portingPhoneNumberExtension.id())
            .contains("f24151b6-3389-41d3-8747-7dd8c681e5e2")
        assertThat(portingPhoneNumberExtension.activationRanges().getOrNull())
            .containsExactly(
                PortingPhoneNumberExtension.ActivationRange.builder().endAt(10L).startAt(1L).build()
            )
        assertThat(portingPhoneNumberExtension.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingPhoneNumberExtension.extensionRange())
            .contains(
                PortingPhoneNumberExtension.ExtensionRange.builder().endAt(10L).startAt(1L).build()
            )
        assertThat(portingPhoneNumberExtension.portingPhoneNumberId())
            .contains("f24151b6-3389-41d3-8747-7dd8c681e5e2")
        assertThat(portingPhoneNumberExtension.recordType())
            .contains("porting_phone_number_extension")
        assertThat(portingPhoneNumberExtension.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingPhoneNumberExtension =
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

        val roundtrippedPortingPhoneNumberExtension =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumberExtension),
                jacksonTypeRef<PortingPhoneNumberExtension>(),
            )

        assertThat(roundtrippedPortingPhoneNumberExtension).isEqualTo(portingPhoneNumberExtension)
    }
}
