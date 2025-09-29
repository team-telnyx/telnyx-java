// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortoutUpdateStatusParamsTest {

    @Test
    fun create() {
        PortoutUpdateStatusParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
            .reason("I do not recognize this transaction")
            .hostMessaging(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PortoutUpdateStatusParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
                .reason("I do not recognize this transaction")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("authorized")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PortoutUpdateStatusParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
                .reason("I do not recognize this transaction")
                .hostMessaging(false)
                .build()

        val body = params._body()

        assertThat(body.reason()).isEqualTo("I do not recognize this transaction")
        assertThat(body.hostMessaging()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PortoutUpdateStatusParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
                .reason("I do not recognize this transaction")
                .build()

        val body = params._body()

        assertThat(body.reason()).isEqualTo("I do not recognize this transaction")
    }
}
