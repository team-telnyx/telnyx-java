// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.hostedsignups

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HostedSignupCreateParamsTest {

    @Test
    fun create() {
        HostedSignupCreateParams.builder()
            .appId("123456789012345")
            .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
            .signupType(HostedSignupCreateParams.SignupType.COEXISTENCE)
            .build()
    }

    @Test
    fun body() {
        val params =
            HostedSignupCreateParams.builder()
                .appId("123456789012345")
                .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                .signupType(HostedSignupCreateParams.SignupType.COEXISTENCE)
                .build()

        val body = params._body()

        assertThat(body.appId()).isEqualTo("123456789012345")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
        assertThat(body.signupType()).contains(HostedSignupCreateParams.SignupType.COEXISTENCE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HostedSignupCreateParams.builder().appId("123456789012345").build()

        val body = params._body()

        assertThat(body.appId()).isEqualTo("123456789012345")
    }
}
