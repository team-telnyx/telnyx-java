// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.fqdns.FqdnCreateParams
import com.telnyx.api.models.fqdns.FqdnListParams
import com.telnyx.api.models.fqdns.FqdnUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FqdnServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnFuture =
            fqdnServiceAsync.create(
                FqdnCreateParams.builder()
                    .connectionId("1516447646313612565")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(8080L)
                    .build()
            )

        val fqdn = fqdnFuture.get()
        fqdn.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnFuture = fqdnServiceAsync.retrieve("id")

        val fqdn = fqdnFuture.get()
        fqdn.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnFuture =
            fqdnServiceAsync.update(
                FqdnUpdateParams.builder()
                    .id("id")
                    .connectionId("1516447646313612565")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(8080L)
                    .build()
            )

        val fqdn = fqdnFuture.get()
        fqdn.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnsFuture =
            fqdnServiceAsync.list(
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

        val fqdns = fqdnsFuture.get()
        fqdns.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnFuture = fqdnServiceAsync.delete("id")

        val fqdn = fqdnFuture.get()
        fqdn.validate()
    }
}
