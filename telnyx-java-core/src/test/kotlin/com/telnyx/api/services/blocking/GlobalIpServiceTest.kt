// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.core.JsonValue
import com.telnyx.api.models.globalips.GlobalIpCreateParams
import com.telnyx.api.models.globalips.GlobalIpListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpService = client.globalIps()

        val globalIp =
            globalIpService.create(
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

        globalIp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpService = client.globalIps()

        val globalIp = globalIpService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        globalIp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpService = client.globalIps()

        val globalIps =
            globalIpService.list(
                GlobalIpListParams.builder()
                    .page(GlobalIpListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        globalIps.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpService = client.globalIps()

        val globalIp = globalIpService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        globalIp.validate()
    }
}
