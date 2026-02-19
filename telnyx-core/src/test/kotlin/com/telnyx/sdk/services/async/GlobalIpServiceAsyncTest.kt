// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.globalips.GlobalIpCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpServiceAsync = client.globalIps()

        val globalIpFuture =
            globalIpServiceAsync.create(
                GlobalIpCreateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .description("test interface")
                    .ipAddress("198.51.100.1")
                    .name("test interface")
                    .ports(
                        GlobalIpCreateParams.Ports.builder()
                            .putAdditionalProperty("tcp", JsonValue.from("bar"))
                            .putAdditionalProperty("udp", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val globalIp = globalIpFuture.get()
        globalIp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpServiceAsync = client.globalIps()

        val globalIpFuture = globalIpServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIp = globalIpFuture.get()
        globalIp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpServiceAsync = client.globalIps()

        val pageFuture = globalIpServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpServiceAsync = client.globalIps()

        val globalIpFuture = globalIpServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIp = globalIpFuture.get()
        globalIp.validate()
    }
}
