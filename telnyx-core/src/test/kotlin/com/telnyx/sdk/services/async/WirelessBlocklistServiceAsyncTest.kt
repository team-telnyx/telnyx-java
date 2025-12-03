// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WirelessBlocklistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistServiceAsync = client.wirelessBlocklists()

        val wirelessBlocklistFuture =
            wirelessBlocklistServiceAsync.create(
                WirelessBlocklistCreateParams.builder()
                    .name("My Wireless Blocklist")
                    .type(WirelessBlocklistCreateParams.Type.COUNTRY)
                    .addValue("CA")
                    .addValue("US")
                    .build()
            )

        val wirelessBlocklist = wirelessBlocklistFuture.get()
        wirelessBlocklist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistServiceAsync = client.wirelessBlocklists()

        val wirelessBlocklistFuture =
            wirelessBlocklistServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val wirelessBlocklist = wirelessBlocklistFuture.get()
        wirelessBlocklist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistServiceAsync = client.wirelessBlocklists()

        val wirelessBlocklistFuture =
            wirelessBlocklistServiceAsync.update(
                WirelessBlocklistUpdateParams.builder()
                    .name("My Wireless Blocklist")
                    .type(WirelessBlocklistUpdateParams.Type.COUNTRY)
                    .addValue("CA")
                    .addValue("US")
                    .build()
            )

        val wirelessBlocklist = wirelessBlocklistFuture.get()
        wirelessBlocklist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistServiceAsync = client.wirelessBlocklists()

        val pageFuture = wirelessBlocklistServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistServiceAsync = client.wirelessBlocklists()

        val wirelessBlocklistFuture =
            wirelessBlocklistServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val wirelessBlocklist = wirelessBlocklistFuture.get()
        wirelessBlocklist.validate()
    }
}
