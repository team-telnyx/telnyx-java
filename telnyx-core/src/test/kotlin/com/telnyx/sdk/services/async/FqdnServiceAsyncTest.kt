// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.fqdns.FqdnCreateParams
import com.telnyx.sdk.models.fqdns.FqdnUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FqdnServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnFuture = fqdnServiceAsync.retrieve("id")

        val fqdn = fqdnFuture.get()
        fqdn.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fqdnServiceAsync = client.fqdns()

        val pageFuture = fqdnServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fqdnServiceAsync = client.fqdns()

        val fqdnFuture = fqdnServiceAsync.delete("id")

        val fqdn = fqdnFuture.get()
        fqdn.validate()
    }
}
