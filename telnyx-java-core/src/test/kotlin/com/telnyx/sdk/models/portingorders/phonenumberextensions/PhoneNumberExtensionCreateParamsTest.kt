// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberExtensionCreateParamsTest {

    @Test
    fun create() {
        PhoneNumberExtensionCreateParams.builder()
            .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addActivationRange(
                PhoneNumberExtensionCreateParams.ActivationRange.builder()
                    .endAt(10L)
                    .startAt(1L)
                    .build()
            )
            .extensionRange(
                PhoneNumberExtensionCreateParams.ExtensionRange.builder()
                    .endAt(10L)
                    .startAt(1L)
                    .build()
            )
            .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberExtensionCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addActivationRange(
                    PhoneNumberExtensionCreateParams.ActivationRange.builder()
                        .endAt(10L)
                        .startAt(1L)
                        .build()
                )
                .extensionRange(
                    PhoneNumberExtensionCreateParams.ExtensionRange.builder()
                        .endAt(10L)
                        .startAt(1L)
                        .build()
                )
                .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberExtensionCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addActivationRange(
                    PhoneNumberExtensionCreateParams.ActivationRange.builder()
                        .endAt(10L)
                        .startAt(1L)
                        .build()
                )
                .extensionRange(
                    PhoneNumberExtensionCreateParams.ExtensionRange.builder()
                        .endAt(10L)
                        .startAt(1L)
                        .build()
                )
                .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                .build()

        val body = params._body()

        assertThat(body.activationRanges())
            .containsExactly(
                PhoneNumberExtensionCreateParams.ActivationRange.builder()
                    .endAt(10L)
                    .startAt(1L)
                    .build()
            )
        assertThat(body.extensionRange())
            .isEqualTo(
                PhoneNumberExtensionCreateParams.ExtensionRange.builder()
                    .endAt(10L)
                    .startAt(1L)
                    .build()
            )
        assertThat(body.portingPhoneNumberId()).isEqualTo("f24151b6-3389-41d3-8747-7dd8c681e5e2")
    }
}
