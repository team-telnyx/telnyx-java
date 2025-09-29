// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.wirelessblocklists.WirelessBlocklistCreateParams
import com.telnyx.api.models.wirelessblocklists.WirelessBlocklistListParams
import com.telnyx.api.models.wirelessblocklists.WirelessBlocklistUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WirelessBlocklistServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistService = client.wirelessBlocklists()

        val wirelessBlocklist =
            wirelessBlocklistService.create(
                WirelessBlocklistCreateParams.builder()
                    .name("My Wireless Blocklist")
                    .type(WirelessBlocklistCreateParams.Type.COUNTRY)
                    .addValue("CA")
                    .addValue("US")
                    .build()
            )

        wirelessBlocklist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistService = client.wirelessBlocklists()

        val wirelessBlocklist =
            wirelessBlocklistService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        wirelessBlocklist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistService = client.wirelessBlocklists()

        val wirelessBlocklist =
            wirelessBlocklistService.update(
                WirelessBlocklistUpdateParams.builder()
                    .name("My Wireless Blocklist")
                    .type(WirelessBlocklistUpdateParams.Type.COUNTRY)
                    .addValue("CA")
                    .addValue("US")
                    .build()
            )

        wirelessBlocklist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistService = client.wirelessBlocklists()

        val wirelessBlocklists =
            wirelessBlocklistService.list(
                WirelessBlocklistListParams.builder()
                    .filterName("filter[name]")
                    .filterType("filter[type]")
                    .filterValues("filter[values]")
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        wirelessBlocklists.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wirelessBlocklistService = client.wirelessBlocklists()

        val wirelessBlocklist =
            wirelessBlocklistService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        wirelessBlocklist.validate()
    }
}
