// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.fqdns.FqdnCreateParams
import com.telnyx.api.models.fqdns.FqdnListParams
import com.telnyx.api.models.fqdns.FqdnUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FqdnServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnService = client.fqdns()

        val fqdn = fqdnService.retrieve("id")

        fqdn.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnService = client.fqdns()

        val fqdn =
            fqdnService.update(
                FqdnUpdateParams.builder()
                    .id("id")
                    .connectionId("1516447646313612565")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(8080L)
                    .build()
            )

        fqdn.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnService = client.fqdns()

        val fqdns =
            fqdnService.list(
                FqdnListParams.builder()
                    .filter(
                        FqdnListParams.Filter.builder()
                            .connectionId("connection_id")
                            .dnsRecordType("a")
                            .fqdn("example.com")
                            .port(5060L)
                            .build()
                    )
                    .page(FqdnListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        fqdns.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnService = client.fqdns()

        val fqdn = fqdnService.delete("id")

        fqdn.validate()
    }
}
