// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email.ippools

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.email.ippools.ips.IpCreateParams
import com.telnyx.sdk.models.email.ippools.ips.IpDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.email().ipPools().ips()

        val ipFuture =
            ipServiceAsync.create(
                IpCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dedicatedIpId("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
                    .weight(100L)
                    .build()
            )

        val ip = ipFuture.get()
        ip.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.email().ipPools().ips()

        val future =
            ipServiceAsync.delete(
                IpDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ipId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .drain(true)
                    .force(true)
                    .build()
            )

        val response = future.get()
    }
}
