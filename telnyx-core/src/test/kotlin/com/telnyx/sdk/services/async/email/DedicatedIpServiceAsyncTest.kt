// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpCreateParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpDeleteParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpListParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DedicatedIpServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dedicatedIpServiceAsync = client.email().dedicatedIps()

        val dedicatedIpShowResponseFuture =
            dedicatedIpServiceAsync.create(
                DedicatedIpCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .ipVersion(DedicatedIpCreateParams.IpVersion.IPV4)
                    .region(DedicatedIpCreateParams.Region.EWR_NJ1)
                    .build()
            )

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dedicatedIpServiceAsync = client.email().dedicatedIps()

        val dedicatedIpShowResponseFuture =
            dedicatedIpServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dedicatedIpServiceAsync = client.email().dedicatedIps()

        val dedicatedIpShowResponseFuture =
            dedicatedIpServiceAsync.update(
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

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dedicatedIpServiceAsync = client.email().dedicatedIps()

        val dedicatedIpsFuture =
            dedicatedIpServiceAsync.list(
                DedicatedIpListParams.builder()
                    .filterPoolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterRegion("filter[region]")
                    .filterStatus(DedicatedIpListParams.FilterStatus.PROVISIONING)
                    .build()
            )

        val dedicatedIps = dedicatedIpsFuture.get()
        dedicatedIps.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dedicatedIpServiceAsync = client.email().dedicatedIps()

        val dedicatedIpShowResponseFuture =
            dedicatedIpServiceAsync.delete(
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

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }
}
