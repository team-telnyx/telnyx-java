// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SiprecConnectorServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val siprecConnectorService = client.siprecConnectors()

        val siprecConnector = siprecConnectorService.retrieve("connector_name")

        siprecConnector.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val siprecConnectorService = client.siprecConnectors()

        siprecConnectorService.delete("connector_name")
    }
}
