// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorCreateParamsTest {

    @Test
    fun create() {
        PayConnectorCreateParams.builder()
            .config(
                GenericPayConnectorConfig.NoProcessorAuthentication.builder()
                    .token("token")
                    .endpointUrl("https://processor.example.com/pay")
                    .password("password")
                    .timeout(1L)
                    .username("username")
                    .build()
            )
            .name("my-payment-connector")
            .mode(PayConnectorCreateParams.Mode.TEST)
            .type(PayConnectorCreateParams.Type.GENERIC)
            .build()
    }

    @Test
    fun body() {
        val params =
            PayConnectorCreateParams.builder()
                .config(
                    GenericPayConnectorConfig.NoProcessorAuthentication.builder()
                        .token("token")
                        .endpointUrl("https://processor.example.com/pay")
                        .password("password")
                        .timeout(1L)
                        .username("username")
                        .build()
                )
                .name("my-payment-connector")
                .mode(PayConnectorCreateParams.Mode.TEST)
                .type(PayConnectorCreateParams.Type.GENERIC)
                .build()

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                GenericPayConnectorConfig.ofNoProcessorAuthentication(
                    GenericPayConnectorConfig.NoProcessorAuthentication.builder()
                        .token("token")
                        .endpointUrl("https://processor.example.com/pay")
                        .password("password")
                        .timeout(1L)
                        .username("username")
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("my-payment-connector")
        assertThat(body.mode()).contains(PayConnectorCreateParams.Mode.TEST)
        assertThat(body.type()).contains(PayConnectorCreateParams.Type.GENERIC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PayConnectorCreateParams.builder()
                .config(GenericPayConnectorConfig.NoProcessorAuthentication.builder().build())
                .name("my-payment-connector")
                .build()

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                GenericPayConnectorConfig.ofNoProcessorAuthentication(
                    GenericPayConnectorConfig.NoProcessorAuthentication.builder().build()
                )
            )
        assertThat(body.name()).isEqualTo("my-payment-connector")
    }
}
