// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiprecConnectorServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorService = client.siprecConnectors()

        val siprecConnector =
            siprecConnectorService.create(
                SiprecConnectorCreateParams.builder()
                    .host("siprec.telnyx.com")
                    .name("my-siprec-connector")
                    .port(5060L)
                    .appSubdomain("my-app")
                    .build()
            )

        siprecConnector.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorService = client.siprecConnectors()

        val siprecConnector = siprecConnectorService.retrieve("connector_name")

        siprecConnector.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorService = client.siprecConnectors()

        val siprecConnector =
            siprecConnectorService.update(
                SiprecConnectorUpdateParams.builder()
                    .connectorName("connector_name")
                    .host("siprec.telnyx.com")
                    .name("my-siprec-connector")
                    .port(5060L)
                    .appSubdomain("my-app")
                    .build()
            )

        siprecConnector.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecConnectorService = client.siprecConnectors()

        siprecConnectorService.delete("connector_name")
    }
}
