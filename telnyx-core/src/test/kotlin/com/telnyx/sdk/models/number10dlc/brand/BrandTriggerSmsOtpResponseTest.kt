// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandTriggerSmsOtpResponseTest {

    @Test
    fun create() {
        val brandTriggerSmsOtpResponse =
            BrandTriggerSmsOtpResponse.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .referenceId("OTP4B2001")
                .build()

        assertThat(brandTriggerSmsOtpResponse.brandId())
            .isEqualTo("4b20019b-043a-78f8-0657-b3be3f4b4002")
        assertThat(brandTriggerSmsOtpResponse.referenceId()).isEqualTo("OTP4B2001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandTriggerSmsOtpResponse =
            BrandTriggerSmsOtpResponse.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .referenceId("OTP4B2001")
                .build()

        val roundtrippedBrandTriggerSmsOtpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandTriggerSmsOtpResponse),
                jacksonTypeRef<BrandTriggerSmsOtpResponse>(),
            )

        assertThat(roundtrippedBrandTriggerSmsOtpResponse).isEqualTo(brandTriggerSmsOtpResponse)
    }
}
