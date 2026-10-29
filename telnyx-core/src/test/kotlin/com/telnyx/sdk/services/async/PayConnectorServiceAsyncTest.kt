// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.payconnectors.GenericPayConnectorConfig
import com.telnyx.sdk.models.payconnectors.PayConnectorCreateParams
import com.telnyx.sdk.models.payconnectors.PayConnectorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PayConnectorServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val payConnectorServiceAsync = client.payConnectors()

        val payConnectorResponseFuture =
            payConnectorServiceAsync.create(
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

        val payConnectorResponse = payConnectorResponseFuture.get()
        payConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val payConnectorServiceAsync = client.payConnectors()

        val payConnectorResponseFuture = payConnectorServiceAsync.retrieve("my-payment-connector")

        val payConnectorResponse = payConnectorResponseFuture.get()
        payConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val payConnectorServiceAsync = client.payConnectors()

        val payConnectorResponseFuture =
            payConnectorServiceAsync.update(
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

        val payConnectorResponse = payConnectorResponseFuture.get()
        payConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val payConnectorServiceAsync = client.payConnectors()

        val pageFuture = payConnectorServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val payConnectorServiceAsync = client.payConnectors()

        val future = payConnectorServiceAsync.delete("my-payment-connector")

        val response = future.get()
    }
}
