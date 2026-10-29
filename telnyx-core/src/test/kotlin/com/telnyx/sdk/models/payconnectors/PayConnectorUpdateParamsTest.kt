// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorUpdateParamsTest {

    @Test
    fun create() {
        PayConnectorUpdateParams.builder()
            .name("my-payment-connector")
            .config(
                GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault.builder()
                    .password("P")
                    .username("P")
                    .token("token")
                    .authType(
                        GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault
                            .AuthType
                            .BASIC
                    )
                    .endpointUrl("https://processor.example.com/pay")
                    .timeout(1L)
                    .build()
            )
            .mode(PayConnectorUpdateParams.Mode.LIVE)
            .type(PayConnectorUpdateParams.Type.GENERIC)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PayConnectorUpdateParams.builder().name("my-payment-connector").build()

        assertThat(params._pathParam(0)).isEqualTo("my-payment-connector")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PayConnectorUpdateParams.builder()
                .name("my-payment-connector")
                .config(
                    GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault.builder()
                        .password("P")
                        .username("P")
                        .token("token")
                        .authType(
                            GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault
                                .AuthType
                                .BASIC
                        )
                        .endpointUrl("https://processor.example.com/pay")
                        .timeout(1L)
                        .build()
                )
                .mode(PayConnectorUpdateParams.Mode.LIVE)
                .type(PayConnectorUpdateParams.Type.GENERIC)
                .build()

        val body = params._body()

        assertThat(body.config())
            .contains(
                GenericPayConnectorConfig.ofBasicAuthenticationAlsoTheValidationDefault(
                    GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault.builder()
                        .password("P")
                        .username("P")
                        .token("token")
                        .authType(
                            GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault
                                .AuthType
                                .BASIC
                        )
                        .endpointUrl("https://processor.example.com/pay")
                        .timeout(1L)
                        .build()
                )
            )
        assertThat(body.mode()).contains(PayConnectorUpdateParams.Mode.LIVE)
        assertThat(body.type()).contains(PayConnectorUpdateParams.Type.GENERIC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PayConnectorUpdateParams.builder().name("my-payment-connector").build()

        val body = params._body()
    }
}
