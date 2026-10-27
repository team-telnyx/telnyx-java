// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpCreateParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpDeleteParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpListParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DedicatedIpServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dedicatedIpService = client.email().dedicatedIps()

        val dedicatedIpShowResponse =
            dedicatedIpService.create(
                DedicatedIpCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .ipVersion(DedicatedIpCreateParams.IpVersion.IPV4)
                    .region(DedicatedIpCreateParams.Region.EWR_NJ1)
                    .build()
            )

        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dedicatedIpService = client.email().dedicatedIps()

        val dedicatedIpShowResponse =
            dedicatedIpService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dedicatedIpService = client.email().dedicatedIps()

        val dedicatedIpShowResponse =
            dedicatedIpService.update(
                DedicatedIpUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .drain(true)
                    .force(true)
                    .poolId("9b1c4d70-abcd-4e5f-8a9b-0c1d2e3f4a5b")
                    .warmup(DedicatedIpUpdateParams.Warmup.builder().paused(true).build())
                    .warmupPaused(true)
                    .weight(100L)
                    .build()
            )

        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dedicatedIpService = client.email().dedicatedIps()

        val dedicatedIps =
            dedicatedIpService.list(
                DedicatedIpListParams.builder()
                    .filterPoolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterRegion("filter[region]")
                    .filterStatus(DedicatedIpListParams.FilterStatus.PROVISIONING)
                    .build()
            )

        dedicatedIps.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dedicatedIpService = client.email().dedicatedIps()

        val dedicatedIpShowResponse =
            dedicatedIpService.delete(
                DedicatedIpDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queryDrain(true)
                    .queryForce(true)
                    .queryReason("reason")
                    .bodyDrain(true)
                    .bodyForce(true)
                    .bodyReason("No longer needed")
                    .build()
            )

        dedicatedIpShowResponse.validate()
    }
}
