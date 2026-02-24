// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.fqdns.FqdnCreateParams
import com.telnyx.sdk.models.fqdns.FqdnUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FqdnServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnService = client.fqdns()

        val fqdn =
            fqdnService.create(
                FqdnCreateParams.builder()
                    .connectionId("1516447646313612565")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(8080L)
                    .build()
            )

        fqdn.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnService = client.fqdns()

        val fqdn = fqdnService.retrieve("1517907029795014409")

        fqdn.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnService = client.fqdns()

        val fqdn =
            fqdnService.update(
                FqdnUpdateParams.builder()
                    .id("1517907029795014409")
                    .connectionId("1516447646313612565")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(8080L)
                    .build()
            )

        fqdn.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnService = client.fqdns()

        val page = fqdnService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnService = client.fqdns()

        val fqdn = fqdnService.delete("1517907029795014409")

        fqdn.validate()
    }
}
