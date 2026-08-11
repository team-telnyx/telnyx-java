// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents.testdevices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestDeviceCreateParamsTest {

    @Test
    fun create() {
        TestDeviceCreateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .phoneNumber("+13125550123")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TestDeviceCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("+13125550123")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TestDeviceCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("+13125550123")
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+13125550123")
    }
}
