// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveSmsOtpStatusParamsTest {

    @Test
    fun create() {
        BrandRetrieveSmsOtpStatusParams.builder()
            .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BrandRetrieveSmsOtpStatusParams.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4b20019b-043a-78f8-0657-b3be3f4b4002")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
