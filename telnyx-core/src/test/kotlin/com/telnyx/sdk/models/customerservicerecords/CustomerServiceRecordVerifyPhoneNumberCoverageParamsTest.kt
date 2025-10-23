// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordVerifyPhoneNumberCoverageParamsTest {

    @Test
    fun create() {
        CustomerServiceRecordVerifyPhoneNumberCoverageParams.builder()
            .addPhoneNumber("+1234567890")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerServiceRecordVerifyPhoneNumberCoverageParams.builder()
                .addPhoneNumber("+1234567890")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("+1234567890")
    }
}
