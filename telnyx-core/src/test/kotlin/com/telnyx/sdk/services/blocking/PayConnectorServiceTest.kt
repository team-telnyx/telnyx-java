// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.payconnectors.GenericPayConnectorConfig
import com.telnyx.sdk.models.payconnectors.PayConnectorCreateParams
import com.telnyx.sdk.models.payconnectors.PayConnectorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PayConnectorServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val payConnectorService = client.payConnectors()

        val payConnectorResponse =
            payConnectorService.create(
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
            )

        payConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val payConnectorService = client.payConnectors()

        val payConnectorResponse = payConnectorService.retrieve("my-payment-connector")

        payConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val payConnectorService = client.payConnectors()

        val payConnectorResponse =
            payConnectorService.update(
                PayConnectorUpdateParams.builder()
                    .name("my-payment-connector")
                    .config(
                        GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault
                            .builder()
                            .password("P")
                            .username("P")
                            .token("token")
                            .authType(
                                GenericPayConnectorConfig
                                    .BasicAuthenticationAlsoTheValidationDefault
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
            )

        payConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val payConnectorService = client.payConnectors()

        val page = payConnectorService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val payConnectorService = client.payConnectors()

        payConnectorService.delete("my-payment-connector")
    }
}
