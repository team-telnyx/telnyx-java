// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SiprecConnectorServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val siprecConnectorResponseFuture =
            siprecConnectorServiceAsync.create(
                SiprecConnectorCreateParams.builder()
                    .host("siprec.telnyx.com")
                    .name("my-siprec-connector")
                    .port(5060L)
                    .appSubdomain("my-app")
                    .build()
            )

        val siprecConnectorResponse = siprecConnectorResponseFuture.get()
        siprecConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val siprecConnectorResponseFuture = siprecConnectorServiceAsync.retrieve("connector_name")

        val siprecConnectorResponse = siprecConnectorResponseFuture.get()
        siprecConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val siprecConnectorResponseFuture =
            siprecConnectorServiceAsync.update(
                SiprecConnectorUpdateParams.builder()
                    .connectorName("connector_name")
                    .host("siprec.telnyx.com")
                    .name("my-siprec-connector")
                    .port(5060L)
                    .appSubdomain("my-app")
                    .build()
            )

        val siprecConnectorResponse = siprecConnectorResponseFuture.get()
        siprecConnectorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val future = siprecConnectorServiceAsync.delete("connector_name")

        val response = future.get()
    }
}
