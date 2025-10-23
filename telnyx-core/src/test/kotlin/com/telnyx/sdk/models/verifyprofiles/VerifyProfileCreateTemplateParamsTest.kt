// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileCreateTemplateParamsTest {

    @Test
    fun create() {
        VerifyProfileCreateTemplateParams.builder()
            .text("Your {{app_name}} verification code is: {{code}}.")
            .build()
    }

    @Test
    fun body() {
        val params =
            VerifyProfileCreateTemplateParams.builder()
                .text("Your {{app_name}} verification code is: {{code}}.")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Your {{app_name}} verification code is: {{code}}.")
    }
}
