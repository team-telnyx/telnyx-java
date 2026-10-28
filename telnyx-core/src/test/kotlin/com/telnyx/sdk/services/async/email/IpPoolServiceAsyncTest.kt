// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.email.ippools.IpPoolCreateParams
import com.telnyx.sdk.models.email.ippools.IpPoolDeleteParams
import com.telnyx.sdk.models.email.ippools.IpPoolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpPoolServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipPoolServiceAsync = client.email().ipPools()

        val ipPoolShowResponseFuture =
            ipPoolServiceAsync.create(
                IpPoolCreateParams.builder()
                    .name("primary-pool")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isDefault(true)
                    .build()
            )

        val ipPoolShowResponse = ipPoolShowResponseFuture.get()
        ipPoolShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipPoolServiceAsync = client.email().ipPools()

        val ipPoolShowResponseFuture =
            ipPoolServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val ipPoolShowResponse = ipPoolShowResponseFuture.get()
        ipPoolShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipPoolServiceAsync = client.email().ipPools()

        val ipPoolShowResponseFuture =
            ipPoolServiceAsync.update(
                IpPoolUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isDefault(true)
                    .name("renamed-pool")
                    .build()
            )

        val ipPoolShowResponse = ipPoolShowResponseFuture.get()
        ipPoolShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipPoolServiceAsync = client.email().ipPools()

        val ipPoolsFuture = ipPoolServiceAsync.list()

        val ipPools = ipPoolsFuture.get()
        ipPools.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipPoolServiceAsync = client.email().ipPools()

        val future =
            ipPoolServiceAsync.delete(
                IpPoolDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .drain(true)
                    .force(true)
                    .build()
            )

        val response = future.get()
    }
}
