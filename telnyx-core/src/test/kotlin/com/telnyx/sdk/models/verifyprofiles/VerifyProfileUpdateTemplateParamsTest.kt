// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileUpdateTemplateParamsTest {

    @Test
    fun create() {
        VerifyProfileUpdateTemplateParams.builder()
            .templateId("12ade33a-21c0-473b-b055-b3c836e1c292")
            .text("Your {{app_name}} verification code is: {{code}}.")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerifyProfileUpdateTemplateParams.builder()
                .templateId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .text("Your {{app_name}} verification code is: {{code}}.")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VerifyProfileUpdateTemplateParams.builder()
                .templateId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .text("Your {{app_name}} verification code is: {{code}}.")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Your {{app_name}} verification code is: {{code}}.")
    }
}
