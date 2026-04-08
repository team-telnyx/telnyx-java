// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val trafficPolicyProfileServiceAsync = client.trafficPolicyProfiles()

        val trafficPolicyProfileFuture =
            trafficPolicyProfileServiceAsync.create(
                TrafficPolicyProfileCreateParams.builder()
                    .type(TrafficPolicyProfileCreateParams.Type.WHITELIST)
                    .addDomain("www.hbomax.com")
                    .addDomain("netflix.com")
                    .addIpRange("10.64.0.0/24")
                    .addIpRange("10.64.0.0/25")
                    .limitBwKbps(TrafficPolicyProfileCreateParams.LimitBwKbps._512)
                    .addService("service_123")
                    .addService("service_456")
                    .build()
            )

        val trafficPolicyProfile = trafficPolicyProfileFuture.get()
        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val trafficPolicyProfileServiceAsync = client.trafficPolicyProfiles()

        val trafficPolicyProfileFuture =
            trafficPolicyProfileServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val trafficPolicyProfile = trafficPolicyProfileFuture.get()
        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val trafficPolicyProfileServiceAsync = client.trafficPolicyProfiles()

        val trafficPolicyProfileFuture =
            trafficPolicyProfileServiceAsync.update(
                TrafficPolicyProfileUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addDomain("netflix.com")
                    .addIpRange("10.64.0.0/24")
                    .limitBwKbps(TrafficPolicyProfileUpdateParams.LimitBwKbps._1024)
                    .addService("service_123")
                    .type(TrafficPolicyProfileUpdateParams.Type.WHITELIST)
                    .build()
            )

        val trafficPolicyProfile = trafficPolicyProfileFuture.get()
        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val trafficPolicyProfileServiceAsync = client.trafficPolicyProfiles()

        val pageFuture = trafficPolicyProfileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val trafficPolicyProfileServiceAsync = client.trafficPolicyProfiles()

        val trafficPolicyProfileFuture =
            trafficPolicyProfileServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val trafficPolicyProfile = trafficPolicyProfileFuture.get()
        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listServices() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val trafficPolicyProfileServiceAsync = client.trafficPolicyProfiles()

        val pageFuture = trafficPolicyProfileServiceAsync.listServices()

        val page = pageFuture.get()
        page.response().validate()
    }
}
