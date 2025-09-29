// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiprecConnectorServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val siprecConnectorFuture =
            siprecConnectorServiceAsync.create(
                SiprecConnectorCreateParams.builder()
                    .host("siprec.telnyx.com")
                    .name("my-siprec-connector")
                    .port(5060L)
                    .appSubdomain("my-app")
                    .build()
            )

        val siprecConnector = siprecConnectorFuture.get()
        siprecConnector.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val siprecConnectorFuture = siprecConnectorServiceAsync.retrieve("connector_name")

        val siprecConnector = siprecConnectorFuture.get()
        siprecConnector.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val siprecConnectorFuture =
            siprecConnectorServiceAsync.update(
                SiprecConnectorUpdateParams.builder()
                    .connectorName("connector_name")
                    .host("siprec.telnyx.com")
                    .name("my-siprec-connector")
                    .port(5060L)
                    .appSubdomain("my-app")
                    .build()
            )

        val siprecConnector = siprecConnectorFuture.get()
        siprecConnector.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorServiceAsync = client.siprecConnectors()

        val future = siprecConnectorServiceAsync.delete("connector_name")

        val response = future.get()
    }
}
