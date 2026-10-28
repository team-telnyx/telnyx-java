// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email.ippools

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.email.ippools.ips.IpCreateParams
import com.telnyx.sdk.models.email.ippools.ips.IpDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.email().ipPools().ips()

        val ip =
            ipService.create(
                IpCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dedicatedIpId("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
                    .weight(100L)
                    .build()
            )

        ip.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.email().ipPools().ips()

        ipService.delete(
            IpDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ipId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .drain(true)
                .force(true)
                .build()
        )
    }
}
