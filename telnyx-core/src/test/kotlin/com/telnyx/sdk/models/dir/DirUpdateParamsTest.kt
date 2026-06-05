// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirUpdateParamsTest {

    @Test
    fun create() {
        DirUpdateParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .authorizerEmail("dev@stainless.com")
            .authorizerName("authorizer_name")
            .callReasons(listOf("Appointment reminders", "Billing inquiries", "Lab results"))
            .displayName("Acme Plumbing & Wellness")
            .logoUrl("https://acmeplumbing.example.com/logo-v2-256.bmp")
            .reselling(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DirUpdateParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DirUpdateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .authorizerEmail("dev@stainless.com")
                .authorizerName("authorizer_name")
                .callReasons(listOf("Appointment reminders", "Billing inquiries", "Lab results"))
                .displayName("Acme Plumbing & Wellness")
                .logoUrl("https://acmeplumbing.example.com/logo-v2-256.bmp")
                .reselling(true)
                .build()

        val body = params._body()

        assertThat(body.authorizerEmail()).contains("dev@stainless.com")
        assertThat(body.authorizerName()).contains("authorizer_name")
        assertThat(body.callReasons().getOrNull())
            .containsExactly("Appointment reminders", "Billing inquiries", "Lab results")
        assertThat(body.displayName()).contains("Acme Plumbing & Wellness")
        assertThat(body.logoUrl()).contains("https://acmeplumbing.example.com/logo-v2-256.bmp")
        assertThat(body.reselling()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DirUpdateParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        val body = params._body()
    }
}
