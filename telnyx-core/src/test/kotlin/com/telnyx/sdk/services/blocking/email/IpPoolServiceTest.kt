// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.email.ippools.IpPoolCreateParams
import com.telnyx.sdk.models.email.ippools.IpPoolDeleteParams
import com.telnyx.sdk.models.email.ippools.IpPoolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpPoolServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipPoolService = client.email().ipPools()

        val ipPoolShowResponse =
            ipPoolService.create(
                IpPoolCreateParams.builder()
                    .name("primary-pool")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isDefault(true)
                    .build()
            )

        ipPoolShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipPoolService = client.email().ipPools()

        val ipPoolShowResponse = ipPoolService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        ipPoolShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipPoolService = client.email().ipPools()

        val ipPoolShowResponse =
            ipPoolService.update(
                IpPoolUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isDefault(true)
                    .name("renamed-pool")
                    .build()
            )

        ipPoolShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipPoolService = client.email().ipPools()

        val ipPools = ipPoolService.list()

        ipPools.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipPoolService = client.email().ipPools()

        ipPoolService.delete(
            IpPoolDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .drain(true)
                .force(true)
                .build()
        )
    }
}
