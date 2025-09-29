// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.integrationsecrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationSecretCreateParamsTest {

    @Test
    fun create() {
        IntegrationSecretCreateParams.builder()
            .identifier("my_secret")
            .type(IntegrationSecretCreateParams.Type.BEARER)
            .token("my_secret_value")
            .password("password")
            .username("username")
            .build()
    }

    @Test
    fun body() {
        val params =
            IntegrationSecretCreateParams.builder()
                .identifier("my_secret")
                .type(IntegrationSecretCreateParams.Type.BEARER)
                .token("my_secret_value")
                .password("password")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.identifier()).isEqualTo("my_secret")
        assertThat(body.type()).isEqualTo(IntegrationSecretCreateParams.Type.BEARER)
        assertThat(body.token()).contains("my_secret_value")
        assertThat(body.password()).contains("password")
        assertThat(body.username()).contains("username")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegrationSecretCreateParams.builder()
                .identifier("my_secret")
                .type(IntegrationSecretCreateParams.Type.BEARER)
                .build()

        val body = params._body()

        assertThat(body.identifier()).isEqualTo("my_secret")
        assertThat(body.type()).isEqualTo(IntegrationSecretCreateParams.Type.BEARER)
    }
}
