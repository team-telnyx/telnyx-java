// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val trafficPolicyProfileService = client.trafficPolicyProfiles()

        val trafficPolicyProfile =
            trafficPolicyProfileService.create(
                TrafficPolicyProfileCreateParams.builder()
                    .type(TrafficPolicyProfileCreateParams.Type.WHITELIST)
                    .addDomain("www.hbomax.com")
                    .addDomain("netflix.com")
                    .addIpRange("10.64.0.0/24")
                    .addIpRange("10.64.0.0/25")
                    .limitBwKbps(TrafficPolicyProfileCreateParams.LimitBwKbps.LIMIT_BW_KBPS_512)
                    .addService("service_123")
                    .addService("service_456")
                    .build()
            )

        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val trafficPolicyProfileService = client.trafficPolicyProfiles()

        val trafficPolicyProfile =
            trafficPolicyProfileService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val trafficPolicyProfileService = client.trafficPolicyProfiles()

        val trafficPolicyProfile =
            trafficPolicyProfileService.update(
                TrafficPolicyProfileUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addDomain("netflix.com")
                    .addIpRange("10.64.0.0/24")
                    .limitBwKbps(TrafficPolicyProfileUpdateParams.LimitBwKbps.LIMIT_BW_KBPS_1024)
                    .addService("service_123")
                    .type(TrafficPolicyProfileUpdateParams.Type.WHITELIST)
                    .build()
            )

        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val trafficPolicyProfileService = client.trafficPolicyProfiles()

        val page = trafficPolicyProfileService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val trafficPolicyProfileService = client.trafficPolicyProfiles()

        val trafficPolicyProfile =
            trafficPolicyProfileService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        trafficPolicyProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listServices() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val trafficPolicyProfileService = client.trafficPolicyProfiles()

        val page = trafficPolicyProfileService.listServices()

        page.response().validate()
    }
}
